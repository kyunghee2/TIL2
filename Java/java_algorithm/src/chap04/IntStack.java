package chap04;


public class IntStack {
    
    private int max;//스택용량
    private int ptr;//스택포인터
    private int[] stk;//스택본체

    //실행시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }
    //실행시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){}
    }
    public IntStack(int capacity){
        ptr=0;
        max=capacity;
        try{
            stk = new int[max];
        }catch(OutOfMemoryError e){
            max = 0;
        }
    }
    //스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException{
        if(ptr >= max)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }
    //스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException{
        if(ptr<=0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }
    //스택에서 데이터를 피크(정상에 있는 데이터를 확인)
    public int peek() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }
    //스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int indexOf(int x){
        for(int i =ptr-1;i>=0;i++){
            if(stk[i] ==x)
            return i;
        }
        return -1;
    }
    //스택을 비움
    public void clear(){
        ptr = 0;
    }
    public int capacity(){
        return max;
    }
    public int size(){
        return ptr;
    }
    public boolean isEmpty(){
        return ptr <= 0;
    }
    public boolean isFull(){
        return ptr >= max;
    }
    public void dump(){
        if(ptr <= 0)
            System.out.println("스택이 비어있습니다.");
        else{
            for(int i= 0;i<ptr;i++)
                System.out.print(stk[i]+" ");
            System.out.println();
        }
    }
}