/////////////////////////////////////
//Test29_1_1   Generic_DefinitionOfClass
//[제네릭 클래스 정의하기]
//문제1
//다음은 앞서 예제에서 작성한 수납공간이 둘로 나눠져 있는 상자를 표현한 제네릭 클래스이다.
//이어서 수납공간이 둘로 나눠져 있는 상자를 표현한 클래스를 DDBox<U, D>라는 이름으로
//하나 더 정의하여 DBox<L, R> 인스턴스 둘을 이 상자에 저장하고자 한다.
//그럼 다음 main 메소드를 기반으로 컴파일 및 실행이 가능하도록 DDBox<U, D> 제네릭 클래스를 정의해보자.
//그리고 위 main 메소드의 실행 결과로 다음의 출력을 보이게 하자.(출력 형태는 이와 달라도 괜찮다. 내용물만 전부 출력이 되면 된다.)

//c:\JavaStudy>java DDBoxDemo
//Apple & 25
//Orange & 33

/*class DBox<L, R>{
    private L left;
    private R right;
    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + " & " + right; }
}

class DDBox<U, D>
{
    private U up;
    private D down;
    public void set(U u, D d)
    {
        up = u;
        down = d;
    }

    public String toString()
    {
        return up + "\n" + down;
    }
}

class DBoxMain
{
    public static void main(String[] args)
    {
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
        ddbox.set(box1, box2);	// 두 개의 상자를 하나의 상자에 담음
        System.out.println(ddbox);	// 상자의 내용물 출력
    }
}*/


/////////////////////////////////////
//Test29_1_2
//문제2
//문제1의 내용에 해당하는 프로그램은 사실 별도의 클래스를 정의하지 않고
//DBox 하나로 충분히 편성할 수 있다.
//따라서 이번에는 문제 1의 내용과 결과를 보이는 프로그램을 작성하되
//DBox 클래스 하나만 활용하여 작성해보자.(상자에 담긴 내용물의 출력 형태는 달라도 괜찮다. 내용물만 전부 출력이 되면 된다.)

class DBox<L, R>{
    private L left;
    private R right;
    public void set(L o, R r) {
        left = o;
        right = r;
    }
    public String toString() { return left + " & " + right; }
}

/*class DDBox<U, D>
{
    private U up;
    private D down;
    public void set(U u, D d)
    {
        up = u;
        down = d;
    }

    public String toString()
    {
        return up + "\n" + down;
    }
}*/

class DBoxMain
{
    public static void main(String[] args)
    {
        //case1
        DBox<String, Integer> box1 = new DBox<>();
        box1.set("Apple", 25);
        DBox<String, Integer> box2 = new DBox<>();
        box2.set("Orange", 33);
        System.out.println(box1);	// 상자의 내용물 출력
        System.out.println(box2);

        //case2
        DBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DBox<>();
        ddbox.set(box1, box2);	// 두 개의 상자를 하나의 상자에 담음
        System.out.println(ddbox); // 상자의 내용물 출력


    }
}