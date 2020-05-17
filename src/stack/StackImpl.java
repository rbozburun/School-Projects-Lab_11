package stack;

public class StackImpl implements  Stack{
    StackItem top;

    @Override
    public void push(Object obj) {
        StackItem item = new StackItem(obj);
        item.setNext(top);
        top = item;
    }

    @Override
    public Object pop() {
        StackItem item = top;
        top = top.getNext();
        return item.getItem();
    }

    @Override
    public boolean empty() {
        return this.top == null;
    }
}
