public class Tester{
  public static void main(String[] args){
    SuperArray d = new SuperArray();
    System.out.println(d.add("please"));
    System.out.println(d.toString());
    System.out.println(d.add("work"));
    System.out.println(d.toString());
    System.out.println(d.size());
    System.out.println(d.isEmpty());


    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
        System.out.println( words.get(i) );
    }
    for(int i = 0; i < 10; ++i) {
        words.add("mhm");
    }
    System.out.println(words.toString());
    d.clear();
    System.out.println(d.size());
    System.out.println(d.isEmpty());
    for(int i = 0; i < 15; i++){
      d.add(String.valueOf(i));
    }
    System.out.println(d.toString());
    System.out.println(words.contains("ebi"));
    System.out.println(d.contains("15"));
    d.add(7, "oops");
    System.out.println(d.toString());
  /*  for(int i = 0; i < words.size(); ++i) {
        if(!words.get(i).equals("mhm")) {
            System.out.println("Don't say " + words.set(i, "hmh") + "!");
        }
        System.out.println( words.get(i) );
    } */
  }
}
