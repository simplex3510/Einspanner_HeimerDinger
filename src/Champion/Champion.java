package Champion;

import java.util.Scanner;

abstract class Champion {
    String name;
    int level;
    int range;
    int Movement_speed;

    double attack_Damage;           double base_AttackDamage;
    double ability_Power;

    double attack_Speed;            double base_AttackSpeed;

    int critical_Strike_Chance;
    int critical_Damage;

    double health;                  double base_Health;
    double health_Regen;            double base_Health_Regen;
    double cost;                    double base_Cost;
    double cost_Regen;              double base_Cost_Regen;

    double armor;                   double base_armor;
    double magic_resistance;        double base_MagicResistance;

    int armor_Penetration;
    int magic_Penetration;

    int coolDown_Reduction;

    int growth_Health;
    double growth_Cost;
    double growth_AttackDamage;
    double growth_AttackSpeed;       // 주의: 이 부분은 퍼센트(%)로 계산함
    double growth_HP_Regen;
    double growth_Cost_Regen;
    double growth_Armor;
    double growth_MagicResistance;

    // 스킬 레벨 변수
    /*
    int skill_Q_Level=0;
    int skill_W_Level=0;
    int skill_E_Level=0;
    int skill_R_Level=0;
    */

    abstract void skill_Passive();
    abstract void skill_Q();
    abstract void skill_W();
    abstract void skill_E();
    abstract void skill_R();

    protected void showInfo() {
        // 챔피언 정보 출력
    }

    protected void showSkillInfo() {
        skill_Passive();
        skill_Q();
        skill_W();
        skill_E();
        skill_R();
    }

    protected void death_timer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 진행 시간(분): ");
        int game_time_minute = sc.nextInt();
        sc.close();

        double time_level = 0;
        double time_after = 0;

        if ((1<=level) && (level<=6)) {
            time_level = (level * 2) + 4;
        }
        else if (level == 7) {
            time_level = 21;
        }
        else if ((8<=level) && (level<=18)) {
            time_level = (level * 2.5) + 7.5;
        }


        if (game_time_minute < 15) {
            System.out.printf("15분 이전: %.2f초", time_after);
        }
        else if (game_time_minute < 30) {
            time_after = time_level + ( (time_level / 100) * (game_time_minute - 15) * 2 * 0.425);
            System.out.printf("15분 이후: %.2f초", time_after);
        }
        else if (game_time_minute < 45) {
            time_after = time_level + ( (time_level / 100) * (game_time_minute - 15) * 2 * 0.425)
                                    + ( (time_level / 100) * (game_time_minute - 30) * 2 * 0.30);
            System.out.printf("30분 이후: %.2f초", time_after);
        }
        else if (game_time_minute < 53) {
            time_after = time_level + ( (time_level / 100) * (game_time_minute - 15) * 2 * 0.425)
                                    + ( (time_level / 100) * (game_time_minute - 30) * 2 * 0.30)
                                    + ( (time_level / 100) * (game_time_minute - 45) * 2 * 1.45);
            System.out.printf("45분 이후: %.2f초", time_after);
        }
        else {
            time_after = time_level * 1.5;
            System.out.printf("53분 이후: %.2f초", time_after);
        }
    }

    protected void next_Level_experience() {
        int need_Experience = (280 + (level-1) * 100);

        System.out.println("레벨 업 필요 경험치: " + need_Experience);
    }

    protected void level_Up() {
        level++;
        health = grown_Stat(base_Health, growth_Health);
        cost = grown_Stat(base_Cost, growth_Cost);
        attack_Damage = grown_Stat(base_AttackDamage, growth_AttackDamage);
        attack_Speed = grown_Stat_AttackSpeed(base_AttackSpeed, growth_AttackSpeed);
        health_Regen = grown_Stat(base_Health_Regen, growth_HP_Regen);
        cost_Regen = grown_Stat(base_Cost_Regen, growth_Cost_Regen);
        armor = grown_Stat(base_armor, growth_Armor);
        magic_resistance = grown_Stat(base_MagicResistance, growth_MagicResistance);
    }

    protected void level_Down() {
        level--;
        health = grown_Stat(base_Health, growth_Health);
        cost = grown_Stat(base_Cost, growth_Cost);
        attack_Damage = grown_Stat(base_AttackDamage, growth_AttackDamage);
        attack_Speed = grown_Stat_AttackSpeed(base_AttackSpeed, growth_AttackSpeed);
        health_Regen = grown_Stat(base_Health_Regen, growth_HP_Regen);
        cost_Regen = grown_Stat(base_Cost_Regen, growth_Cost_Regen);
        armor = grown_Stat(base_armor, growth_Armor);
        magic_resistance = grown_Stat(base_MagicResistance, growth_MagicResistance);
    }

    private double grown_Stat(double base, double growth) {
        return (base + growth * (level - 1) * (0.7025 + 0.0175 * (level - 1)));
    }
    private double grown_Stat_AttackSpeed(double base, double growth) {
        return (base * (1 + (((level - 1) * growth)/100)));
    }

    // 스킬 레벨 업 메소드
    /*
    public void skill_Q_LevelUp() {
        if (skill_Q_Level <= 5)
            skill_Q_Level++;
    }
    public void skill_E_LevelUp() {
        if (skill_W_Level <= 5)
            skill_W_Level++;
    }
    public void skill_W_LevelUp() {
        if (skill_E_Level <= 5)
            skill_E_Level++;
    }
    public void skill_R_LevelUp() {
        if (skill_R_Level <= 3)
            skill_R_Level++;
    }
    */
}