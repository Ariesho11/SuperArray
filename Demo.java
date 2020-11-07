public class Demo{
  public static void removeDuplicates(SuperArray s){
    for(int i = 0; i < s.size()-1; i++){
      for(int a = i; a < s.size()-1; a++){
        if (s.get(i).equals(s.get(a))) s.remove(a);
      }
    }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
