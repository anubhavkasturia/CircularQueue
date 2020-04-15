public class CircularQueue{
    int size;
    int front;
    int rear;
    int[]arr;
    
    CircularQueue(){
        this.arr=new int[5];
        this.size=arr.length;
        this.front=0;
        this.rear=0;

          
        
    }
    public boolean isFull(){
        if((rear+1)%size==front){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(front==rear){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Not possible");

        }else{
        rear=(rear+1)%size;
        arr[rear]=data;
        
    }
}
    public void display(){
        int i;
        if(isEmpty()){ 
            System.out.println("Empty Queue");
        }
        else
        {
            for( i = front+1; i!=rear+1; i=(i+1)%size) { //written in different style
            System.out.println(arr[i]);
            }
            
            
        }
    }    
    public int first(){
        if(isEmpty()){
            System.out.println("Queue is empty no element found at first location");
            return -1;
        }
        return arr[(front+1)%size]; 
    }
    public int last(){
        if(isEmpty()){
            System.out.println("Queue is empty no element found at last location");
            return -1;
        }
        return arr[rear];

    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else{
        front=(front+1)%size;
        }
    }
    }
    
    
    