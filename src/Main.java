public class Main {
        public static void main (String[] arg) {
            System.out.print("hello world");
    }
}

class Man {
    String name;

    public Man(String name) {
        this.name = name;
    }

    public void tellYourName() {
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man {     // Man을 상속하는 BusinessMan 클래스
    String company;
    String position;

    public BusinessMan (String name, String company, String position) {
        super(name);    // 상위 클래스의 생성자 호출
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYourName();     // Man 클래스를 상속했기 때문에 호출 가능
    }
}

class MyBusinessMan {
    public static void main (String[] arg) {
        BusinessMan man = new BusinessMan("Yoon", "Hybrid ELD", "staff Eng.");
        man.tellYourInfo();
    }
}

/* 출력 결과
My company is Hybrid ELD
My position is staff Eng.
My name is Yoon
*/