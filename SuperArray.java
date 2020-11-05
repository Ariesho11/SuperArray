public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    int s = 0;
    for(int i = 0; i < data.length; i++){
      if(data[i] != null) s++;
    }
    s = size;
    return s;
  }

  public boolean add(String element){
    int bool = 0;
    if(size() == data.length) resize();
    for(int i = 0; i < data.length; i++){
      if(data[i] == null){
        data[i] = element;
        i = data.length;
        bool = 1;
      }
    }
    size++;
    return (bool == 1);
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String prev = data[index];
    data[index] = element;
    return prev;
  }

  private void resize(){
    String[] na = new String[data.length*2];
    for(int i = 0; i < data.length; i++){
      na[i] = data[i];
    }
    data = na;
  }

  public boolean isEmpty(){
    return(size() == 0);
  }

  public void clear(){
    data = new String[data.length]; //wipe the values
    size = 0;
  }
 public String toString(){
   String ns = "[";
   for(int i = 0; i < size; i++){
     if (i == size-1){
      ns = ns + data[i] + "]";
      return ns;
    }
     if (data[i] != null) ns = ns + data[i] + ", ";
   }
   return ns;
 }

  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if (this.get(i).equals(s)) return true;
    }
    return false;
  }
/*  🍥 public boolean contains(String s)
  Returns true if this list contains the specified element.
  */
}
