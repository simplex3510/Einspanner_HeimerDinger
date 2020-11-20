package Champion;

abstract class HealthCost_Champ extends Champion {
    protected void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("레벨: " + level);
        System.out.printf("체력: %.2f(+%d)\n", health, growth_Health);
        System.out.printf("5초당 체력 회복: %.2f(+%.2f)\n", health_Regen, growth_HP_Regen);
        System.out.println("소모값: -");
        System.out.println("5초당 소모값 회복: -");
        System.out.printf("공격력: %.2f(+%.2f)\n", attack_Damage, growth_AttackDamage);
        System.out.printf("공격 속도: %.2f(+%.2f%%)\n", attack_Speed, growth_AttackSpeed);
        System.out.printf("방어력: %.2f(+%.2f)\n", armor, growth_Armor);
        System.out.printf("마법 저항력: %.2f(+%.2f)\n", magic_resistance, growth_MagicResistance);
        System.out.printf("이동 속도: %d\n", Movement_speed);
        System.out.printf("사정 거리: %d\n\n", range);
    }
}
