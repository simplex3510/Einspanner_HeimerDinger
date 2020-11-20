package Champion;

public class Ashe extends ManaCost_Champ {
    Ashe() {
        super.name ="애쉬";
        super.level = 1;
        super.range = 600;
        super.Movement_speed = 325;

        super.base_AttackDamage = 59;       super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.658;     super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 539.72;         super.health = base_Health;
        super.base_Health_Regen = 3.5;      super.health_Regen = base_Health_Regen;

        super.base_Cost = 280;              super.cost = base_Cost;
        super.base_Cost_Regen = 11.5;       super.cost_Regen = base_Cost_Regen;

        super.base_armor = 26;              super.armor = base_armor;
        super.base_MagicResistance = 30;    super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 85;
        super.growth_Cost = 32;
        super.growth_AttackDamage = 2.96;
        super.growth_AttackSpeed = 3.34;
        super.growth_HP_Regen = 0.55;
        super.growth_Cost_Regen = 0.4;
        super.growth_Armor = 3.4;
        super.growth_MagicResistance = 0.5;

        // 스킬 레벨 변수
        /*
        super.skill_Q_Level = 0;
        super.skill_W_Level = 0;
        super.skill_E_Level = 0;
        super.skill_R_Level = 0;
        */
    }

    public void skill_Passive() {
        String p_name = "서리 화살";

        System.out.println("Passive - " + p_name);
        System.out.println("스킬 및 기본 공격으로 대상이 2초간 20~30% (1~18레벨에 적용)씩 둔화됩니다.");
        System.out.println("서리 화살로 대상을 기본 공격하면 치명타 능력치에 따라 피해량이 증가합니다.");
        System.out.println("애쉬의 치명타는 추가 피해를 가하지 않는 대신, 서리 화살의 둔화 효과를 2배로 중폭시켜주며 시간이 지나면 기본 둔화 비율로 감소합니다.\n");
    }

    public void skill_Q() {
        String q_name = "궁사의 집중";

        System.out.println("Q - " + q_name);

        System.out.println("기본 지속 효과: 기본 공격시 4초 동안 집중이 올라 최대 5번까지 중첩됩니다.");
        System.out.println("중첩이 최대치에 도달하면 중첩을 사용해 궁사의 집중을 시전할 수 있습니다.");
        System.out.println("집중 중첩은 4초 후 한 번에 하나씩 사라집니다.");

        System.out.println("사용 효과: 4초간 애쉬의 공격 속도가 20/25/30/35/40% 증가합니다.");
        System.out.println("기본 공격이 다발 공격으로 변하며 (+1.05/1.1/1.15/1.2/1.25 AD)의 피해를 입힙니다.");
        System.out.println("마나 소모: 50");
        System.out.println("재사용 대기시간: -\n");

    }

    public void skill_W() {
        String w_name = "일제 사격";
        int range = 1200;

        System.out.println("W - " + w_name);

        System.out.println("애쉬가 월뿐 형태로 7/8/9/10/11개의 화살을 발사하여 20/35/50/65/80 (+1.0AD)의 물리 피해를 입힙니다.");
        System.out.println("챔피언에게 적중되면 서리 화살 효과가 적용되는 치명타로 판정됩니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("마나 소모: 70" );
        System.out.println("재사용 대기시간: 14/11.5/9/6.5/4초\n");
    }

    public void skill_E() {
        String e_name = "매 날리기";

        System.out.println("E - " + e_name);

        System.out.println("지정한 위치로 날아가며 그 일대를 밝혀줍니다. "
                + "밝혀진 시야는 5초간 유지됩니다.");
        System.out.println("스킬을 2레벨로 올리면 2번까지 충전해서 시전할 수 있습니다.");
        System.out.println("사정 거리: 맵 전체");
        System.out.println("재사용 대기시간: 90/80/70/60/50초\n");
    }

    public void skill_R() {
        String r_name = "마법의 수정화살";
        int range = 250;

        System.out.println("R - " + r_name);
        System.out.println("커다란 화살을 일직선으로 발사하여 적 챔피언을 맞힐 경우 200/400/600 (+1.0AP)의 마법 피해를 입히고, 화살 발사 거리에 따라 해당 챔피언을 최대 3.5초까지 기절시킵니다.\n"
                + "주변 유닛에겐 절반의 피해를 입고 3초 동안 서리 화살의 둔화율이 적용됩니다.");
        System.out.println("효과 범위: " + range);
        System.out.println("사정 거리: 맵 전체");
        System.out.println("마나 소모: 100");
        System.out.println("재사용 대기시간: 100/90/80초\n");

    }
}