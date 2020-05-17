package stack;

public class StackItem {
    Object item;
    StackItem next;

    StackItem(Object item){
        this.item = item;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }

    public StackItem getNext() {
        return next;
    }

    public Object getItem() {
        return item;
    }
}
