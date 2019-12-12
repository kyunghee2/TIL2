## 클래스
- 클래스 예제
```java
class A {
	private int f1;//비공개 필드
	protected int f2;//한정공개 필드
	public int f3;//공개필드
	
	static final int S1 = 0;
	//생성자
	public A(){
		f1 = f2 = f3 = 0
	}
    //생성자
    public A(int f1,int f2,int f3){
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }
    //f1의 setter
    public void setF1(int f){
        f1 = f;
    }
    //f1의 getter
    public void getF1(){
        return f1;
    }
}
```



### 공개 클래스

- 클래스  접근 제한자 public을 붙여 선언한 클래스로 다른 패키지에서 사용할 수 있는 공개 클래스(public class)입니다.



### final 클래스

- 클래스 접근 제한자 final을 붙여 선언한 클래스로 , 서브 클래스를 가질 수 없습니다.
- 새로운 클래스를 상속할 수 없습니다. 파이널 클래스(final class) 입니다.



### 파생 클래스

- 클래스 A를 직접 상위 클래스(direct superclass)로 하려면 선언할때 extends A를 추가해야 합니다. 이때 선언한 클래스는 클래스 A의 직접 서브 클래스(direct subclass)가 됩니다.

- 클래스 선언에 extends가 없는 클래스의 상위 클래스는 Object 클래스가 됩니다.

```
class B extends A {
...
}
```

- B < A < Object class

### 인터페이스 구현

- 인터페이스 X를 구현하려면 선언에 implements X를 추가해야 합니다.

```
class Y implements X{
...
}
```

### 추상 클래스

- 클래스 접근 제한자 abstract를 붙여 클래스를 선언하면 추상 메서드를 가질수 있는 추상 클래스(abstract class)가 됩니다. 
- 추상 클래스형은 불완전한 클래스이므로 인스턴스를 만들수 없습니다.



### 중첩클래스

- 클래스 또는 인터페이스 안에 선언한 클래스는 중첩클래스(nested class)가 됩니다.
- 맴버 클래스(member class)는 그 선언이 다른 클래스 또는 인터페이스 선언에 둘러싸인 클래스 입니다.
- 내부 클래스(inner class)는 명시적으로 암묵적으로도 정적(static)으로 선언되지 않는 중첩 클래스 입니다. 정적 초기화나 멤버 인터페이스 선언을 할 수 없습니다. 그리고 컴파일을 할 때 상수 필드가 아닌 한 정적 멤버를 선언할 수 없습니다.
- 지역 클래스는 이름이 주어진 중첩 클래스인 내부 클래스 입니다. 어떤 클래스 맴버도 될 수 없습니다.

