public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public SuperArray(int intialCapacity){
    if (intialCapacity < 0){
      throw new IllegalArgumentException("initialCapacity is "+intialCapacity+"; can't be negative");
    }
    data = new String[intialCapacity];
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
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index can't be negative or greater than size");
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index can't be negative or greater than size");
    }
    String prev = data[index];
    data[index] = element;
    return prev;
  }

  private void resize(){
    String[] na = new String[(data.length+1)*2];
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
   ns = ns + "]";
   return ns;
  }

  public boolean contains(String s){
    for(int i = 0; i < size; i++){
      if (get(i).equals(s)) return true;
    }
    return false;
  }

  public void add(int index, String element){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("index can't be negative or greater than size");
    }
    if (data[index] == null) data[index] = element;
    else {
      for(int i = index; i < size; i++){
        String temp = data[i];
        if (i == index) {
          data[index] = element;
          data[i+1] = data[i];
          i++;
      }
        else data[i+1] = data[i];
      }
    }
    size = size + 1;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("index can't be negative or greater than size");
    }
    String rm = data[index];
    if (index >= 0) {
      for(int i = index; i < size-1; i++){
        data[i] = data[i+1];
      }
    }
    size = size - 1;
    return rm;
  }

  public int indexOf(String s){
    for(int i = 0; i < size; i++){
      if (get(i).equals(s)) return i;
    }
    return -1;
  }

  public String[] toArray(){
    String[] na = new String[size];
    for(int i = 0; i < size; i++){
      na[i] = data[i];
    }
    return na;
  }

  public int lastIndexOf(String value){
    for(int i = size-1; i > -1; i--){
      if (get(i).equals(value)) return i;
    }
    return -1;
  }

  public boolean equals(SuperArray other){
    for(int i = 0; i < size; i++){
      if (other.indexOf(get(i)) == -1) return false;
    }
    return true;
  }

}
