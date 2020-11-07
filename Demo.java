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
      for(int j = 0; j < b.size()-1; j++){
        if (a.get(i).equals(b.get(j))) overlap.add(a.get(i));
      }
    }
    return overlap;
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

    }
}
