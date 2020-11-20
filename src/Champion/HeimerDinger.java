package Champion;

import java.util.Scanner;

public class HeimerDinger {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int user = 0;

        Shen shen = new Shen();

        shen.showInfo();


        for (int i=1; i<18; i++) {
            shen.level_Up();
        }

        shen.showInfo();

        shen.showSkillInfo();

    }
}