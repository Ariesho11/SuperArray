public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size()-1; i++){
      for(int a = i+1; a < s.size()-1; a++){
        if (s.get(i).equals(s.get(a))) s.remove(a);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray overlap = new SuperArray();
    for(int i = 0; i < a.size(); i++){
      for(int j = 0; j < b.size(); j++){
        if (a.get(i).equals(b.get(j))){
          overlap.add(a.get(i));
          j = b.size();
        }
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray nsa = new SuperArray();
    for(int i = 0; i < a.size() || i < b.size(); i++){
      nsa.add(a.get(i));
      nsa.add(b.get(i));
    }
    if (a.size() > b.size()){
      for(int i = nsa.size(); i < a.size(); i++){
        nsa.add(a.get(i));
      }
    }
    if (a.size() < b.size()){
      for(int i = nsa.size(); i < b.size(); i++){
        nsa.add(b.get(i));
      }
    }
    return nsa;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray t1 = new SuperArray();
    SuperArray t2 = new SuperArray();
    for(int i = 1; i < 11; i++){
      t1.add(String.valueOf(i));
      t2.add(String.valueOf(i*2));
    }
    System.out.println("t1: "+ t1);
    System.out.println("t2: "+ t2);
    System.out.println(findOverlap(t1, t2));

    SuperArray t3 = new SuperArray();
    SuperArray t4 = new SuperArray();
    SuperArray t5 = new SuperArray();
    t3.add("9"); t3.add("1"); t3.add("2"); t3.add("2"); t3.add("3"); t3.add("4");
    t4.add("0"); t4.add("4"); t4.add("2"); t4.add("2"); t4.add("9");
    t5.add("9"); t5.add("2"); t5.add("1"); t5.add("3"); t5.add("4");
    System.out.println("t3: "+ t3);
    System.out.println("t4: "+ t4);
    System.out.println("overlap of t3, t4: " + findOverlap(t3, t4));
    System.out.println(t3.lastIndexOf("2"));
    System.out.println(t3.indexOf("2"));
    System.out.println(t3.equals(t4));
    System.out.println(t5.equals(t3));
    System.out.println("zip t1 and t2: " + zip(t1, t2));
    }
}
