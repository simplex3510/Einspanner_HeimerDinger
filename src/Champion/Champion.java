package Champion;

public abstract class Champion {
    String name;
    int level;
    int experience;
    int range;
    int Movement_speed;

    double attack_Damage;           int base_AttackDamage;
    double ability_Power;

    double attack_Speed;            double base_AttackSpeed;

    int critical_Strike_Chance;
    int critical_Damage;

    double health;                  int base_Health;
    double health_Regen;            double base_Health_Regen;
    double cost;                    int base_Cost;
    double cost_Regen;              double base_Cost_Regen;

    double armor;                   int base_armor;
    double magic_resistance;        int base_MagicResistance;

    int armor_Penetration;
    int magic_Penetration;

    int coolDown_Reduction;

    int growth_Health;
    double growth_Cost;
    double growth_AttackDamage;
    double growth_AttackSpeed;      // 주의: 이 부분은 퍼센트(%)로 계산함
    double growth_HP_Regen;
    double growth_Cost_Regen;
    double growth_Armor;
    double growth_MagicResistance;


    protected Champion() {}

    public void skill_Passive() {}
    public void skill_Q() {}
    public void skill_W() {}
    public void skill_E() {}
    public void skill_R() {}

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("레벨: " + level);
        System.out.printf("체력: %.2f(+%d)\n", health, growth_Health);
        System.out.printf("5초당 체력 회복: %.2f(+%.2f)\n", health_Regen, growth_HP_Regen);
        System.out.printf("소모값: %.2f(+%.2f)\n", cost, growth_Cost);
        System.out.printf("5초당 소모값 회복: %.2f(+%.2f)\n", cost_Regen, growth_Cost_Regen);
        System.out.printf("공격력: %.2f(+%.2f)\n", attack_Damage, growth_AttackDamage);
        System.out.printf("공격 속도: %.2f(+%.2f%%)\n", attack_Speed, growth_AttackSpeed);
        System.out.printf("방어력: %.2f(+%.2f)\n", armor, growth_Armor);
        System.out.printf("마법 저항력: %.2f(+%.2f)\n", magic_resistance, growth_MagicResistance);
        System.out.printf("이동 속도: %d\n", Movement_speed);
        System.out.printf("사정 거리: %d\n", range);
    }

    public void next_Level() {
        int full_Experience = (280 + (level-1) * 100);

        if(experience <= full_Experience)
            level_Up();
    }

    public void level_Up() {
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

    public double grown_Stat(int base, double growth) {
        return (base + growth * (level - 1) * (0.7025 + 0.0175 * (level - 1)));
    }
    public double grown_Stat(double base, double growth) {
        return (base + growth * (level - 1) * (0.7025 + 0.0175 * (level - 1)));
    }
    public double grown_Stat_AttackSpeed(double base, double growth) {
        return (base * (1 + (((level - 1) * growth)/100)));
    }
}

class LoL {
    public static void main(String[] args) {
        Kennen kennen = new Kennen();
        kennen.showInfo();

        for (int i=1; i<18; i++)
            kennen.level_Up();
        System.out.println();

        kennen.showInfo();
    }
}