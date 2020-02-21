public class OrderedList extends ArrayList{

public OrderedList(int size){
 super(size);
}

public OrderedList(){}
  
  public void add(int item){
   //case 1: the list is empty
   
   //case 2: the list is full
   //case 3: the list is not empty
     //check count
      //if count == 1, check if item to be inserted is less than the getFirstElement
        //addFirst()
        //otherwise,addlat()
        //if item to be inserted is greater than getLastelement, addLast
          //false,once less than, call insertAt
        //if item to be inserted is less than the getFirstElement addFirs
        
  if(isFull())
   doubleTheArray();
  if(isEmpty())
   addFirst(item);
  else {
    if(item <= getFirstElement())
      addFirst(item);
    else if(item >= getLastElement())
      addLast(item);
    else{
     int pos = getCount() - 1;
     while(pos > 0)
     {
      if(item <= items[pos] && item >= items[pos-1]){
       insertAt(pos,item);
       break;
      }
      pos--;
     }
    }
   }
  
  }
  public void remove(int item){
   for(int i=0; i<count; i++){
      if(items[i]==item){
         for(int j=i; j<count-1; j++){
            int temp = items[j];
            items[j] = items[j+1];
            items[j+1] = temp;
         }
         move[count2++]=item;
         count--;
         break;
      }
   }
  }
  
  public static void main(String [ ]args){
  
   OrderedList list = new OrderedList();
   list.add(2);
   list.add(2);
   list.add(2);
   list.add(20);
   list.add(9);
   list.add(5);
   list.add(6);
   list.add(8);
   list.add(2);
   list.add(1);
   list.remove(2);
   System.out.println("list contains :" + list);
  }

}