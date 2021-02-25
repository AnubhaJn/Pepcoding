public class LinkedList {
    //node
    private class Node {
        int data = 0;
        Node next = null;

        Node(int data){
            this.data = data;
        }
    }
    private Node head = null;
    private Node tail = null;
    private int sizeOfLL = 0;

    public boolean isEmpty(){
        return this.sizeOfLL == 0;
    }

    public int size(){
        return this.sizeOfLL;
    }

    public void display(){
        Node curr = this.head ;
        while( curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next ;
        }
        System.out.println();
    }

    //Exceptions 
    public void EmptyException() throws exception {
        if(this.sizeOfLL == 0){
            throw new Exception("LinkedList is Empty: -1");
        }
    }

    public void IndexOutOfBoundSizeExclusiveException(int idx) throws exception {
        if(idx < 0 || idx >= this.sixeOfLL)
        throw new Exception("Index Out Of Bound : -1");
    }

    public void IndexOutOfBoundSizeInclusiveException(int idx) throws exception {
        if(idx < 0 || idx > this.sixeOfLL)
        throw new Exception("Index Out Of Bound : -1");
    }

    //******get*****
    public int getFirst() throws Exception {
        EmptyException();
        retun this.head.data;
    }

    public int getLast() throws Exception{
        EmptyException();
        retun this.tail.data;
    }

    private Node getNodeAt(int idx){

    }

    public int getAt(int idx) {
        IndexOutOfBoundSizeExclusiveException(idx);
        Node node = getNodeAt(idx);
        retun node.data;
    }

    //******Add*******
    private void addFirstNode(Node node){
        if(this.head == null){
            this.head = node ;
            this.tail = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
        this.sizeOfLL++ ;
    }

    public void addFirst(int data){
        Node node = new Node(data);
        addFirstNode(node);
    }

    private void addLastNode(Node node){
        if(this.head == null){
            this.head = node ;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }

        this.sizeOfLL++ ;
    }
    
    private void addAtNode(int idx , Node node){
        if (idx == 0){
            addFirstNode(node);
        }
        else if(idx == this.sizeOfLL){
            addLastNode(node);
        } else {
            Node prev = getNodeAt(idx -1);
            Node forw = prev.next;

            prev.next = node;
            node.next = forw;
           
            this.sizeOfLL ++;
        }
    }

    public void addAt(int idx){
        IndexOutOfBoundSizeInclusiveException(idx);
        Node node = new Node(data);
        addAtNode(idx, node);
    }
    
    //******remove*******

    private node removeFirstNode(){
        Node removeNode = this.head ;
        if(this.sizeOfLL == 1){
            this.head = null;
            this.tail = null;
        }else {
            Node forw = this.head.next ;
            removeNode.next = null;
            this.head = forw;
        }
        this.sizeOfAll-- ;
        return removeNode;
    }

    public int removeFirst()throws Exception{
     EmptyException();
     Node node = removeFirstNode();
     return node.data;
    }


    private node removeLastNode(){
     Node removeNode = this.tail;
     if (this.sizeOfLL == 1){
         this.head = null;
         this.tail = null;
     }else {
         Node secondLastNode = getNodeAt(this.sizeOfLL - 2);
        
     }
    }

    public int removeLast()throws Exception{
      EmptyException();
      Node node = removeLastNode();
      return node.data;
    }

    public int removeAt(int idx)throws Exception{


    }

    
}