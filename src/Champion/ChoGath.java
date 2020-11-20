package Champion;

public class ChoGath extends ManaCost_Champ {
    ChoGath() {
        super.name = "초가스";
        super.level = 1;
        super.range = 125;
        super.Movement_speed = 345;

        super.base_AttackDamage = 69;         super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.625;       super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 574.4;            super.health = base_Health;
        super.base_Health_Regen = 8.93;       super.health_Regen = base_Health_Regen;

        super.base_Cost = 272.2;              super.cost = base_Cost;
        super.base_Cost_Regen = 7.21;         super.cost_Regen = base_Cost_Regen;

        super.base_armor = 38;                super.armor = base_armor;
        super.base_MagicResistance = 32.1;    super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 80;
        super.growth_Cost = 40;
        super.growth_AttackDamage = 4.2;
        super.growth_AttackSpeed = 1.44;
        super.growth_HP_Regen = 0.85;
        super.growth_Cost_Regen = 0.45;
        super.growth_Armor = 3.5;
        super.growth_MagicResistance = 1.25;

    // 스킬 레벨 변수
        /*
        super.skill_Q_Level = 0;
        super.skill_W_Level = 0;
        super.skill_E_Level = 0;
        super.skill_R_Level = 0;
        */
}

    public void skill_Passive() {
        String p_name = "육식";

        System.out.println("Passive - " + p_name);
        System.out.println("초가스는 유닛을 죽이면 체력과 마나를 회복합니다. 회복량은 초가스의 레벨이 높아질수록 증가합니다.\n");
    }

    public void skill_Q() {
        String q_name = "파열";
        int range = 950;

        System.out.println("Q - " + q_name);

        System.out.println("땅을 파열시켜 대상 지역에 있던 적들을 1초 동안 공중에 띄우고 80/135/190/245/300 (+1.0AP)의 마법 피해를 입히며 이동 속도를 1.5초 동안 60% 낮춥니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("마나 소모: 60");
        System.out.println("재사용 대기시간: 7\n");
    }

    public void skill_W() {
        String w_name = "흉포한 울부짖음";
        int range = 700;
        int area = 650;

        System.out.println("W - " + w_name);

        System.out.println("원뿔 형태의 지역에 있는 적들을 1.6/1.7/1.8/1.9/2초 동안 침묵시키고 75/125/175/225/275 (+0.7AP)의 마법 피해를 입힙니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("범위: " + area);
        System.out.println("마나 소모: 70/80/90/100/110");
        System.out.println("재사용 대기시간: 13/12/11/10/9\n");
    }

    public void skill_E() {
        String e_name = "날카로운 가시";
        int range = 500;

        System.out.println("E - " + e_name);

        System.out.println("다음 3회 기본 공격 시 가시를 발사해 22/37/52/67/82 (+0.3AP) + 적 최대 체력의 3%에 해당하는 마법 피해를 입히고 이동속도를 30% 감소시킵니다. 이동속도는 1.5초에 걸쳐 정상으로 돌아옵니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("마나 소모: 30");
        System.out.println("재사용 대기시간: 8/7/6/5/4\n");
    }

    public void skill_R() {
        String r_name = "포식";
        int range = 200;

        System.out.println("R - " + r_name);

        System.out.println("적을 게걸스럽게 먹어치워, 챔피언에게는 300 (+추가 체력의 10%) (+0.5AP)의 고정 피해를, 미니언과 몬스터에게는 1000 (+추가 체력의 10%) (+0.5AP)의 피해를 입힙니다.");
        System.out.println("대상이 처치되면 초가스의 포식 중첩이 1 올라, 몸집이 커지며 최대 체력이 80/120/160 오릅니다.");
        System.out.println("- 미니언과 에픽 몬스터가 아닌 일반 몬스터 처치로는 최대 6중첩까지만 얻을 수 있습니다.");
        System.out.println("초가스가 10중첩 시 최대 크기에 도달하고 공격 범위 보너스도 최대가 됩니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("마나 소모: 100");
        System.out.println("재사용 대기시간: 80\n");
    }
}

