package Champion;

public class Shen extends EnergyCost_Champ {
    Shen() {
        super.name = "쉔";
        super.level = 1;
        super.range = 125;
        super.Movement_speed = 340;

        super.base_AttackDamage = 60.2;     super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.666;     super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 540;            super.health = base_Health;
        super.base_Health_Regen = 8.5;     super.health_Regen = base_Health_Regen;

        super.base_Cost = 400;              super.cost = base_Cost;
        super.base_Cost_Regen = 50;         super.cost_Regen = base_Cost_Regen;

        super.base_armor = 34;              super.armor = base_armor;
        super.base_MagicResistance = 32.1;    super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 85;
        super.growth_Cost = 0;
        super.growth_AttackDamage = 3.38;
        super.growth_AttackSpeed = 3;
        super.growth_HP_Regen = 0.75;
        super.growth_Cost_Regen = 0;
        super.growth_Armor = 3;
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
        String p_name = "기 보호막";

        System.out.println("Passive - " + p_name);
        System.out.println("스킬을 시전하면 10초에 2.5초 동안 피해를 60~111(+추가 체력의 1.4%) 만큼 흡수하는 보호막을 얻습니다.");
        System.out.println("아군 또는 적 챔피언에게 스킬로 영향을 미칠 때마다 재사용 대기시간이 감소합니다.");
        System.out.println("쉔은 스킬로 조종할 수 있는 기의 검을 통해 힘을 발휘합니다.");
        System.out.println("재사용 대기시간: 10초\n");
    }

    public void skill_Q() {
        String q_name = "황혼 강습";

        System.out.println("Q - " + q_name);

        System.out.println("쉔이 기의 검을 불러내 뽑습니다");
        System.out.println("기의 검에 부딪히는 적들은 2초 동안 쉔으로부터 멀어지려 할 때 15/20/25/30/35% 둔화됩니다.");
        System.out.println("쉔의 다음 기본 공격 3회는 대상 최대 체력 2/2.5/3/3.5/4(+0.05AP)% + 10/16/22/28/34/40 (1/4/7/10/13/16레벨에서)의 추가의 마법 피해를 입힙니다.");

        System.out.println("기의 검이 적 챔피언에게 부딪힌 경우, 강화된 공격은 5/5.5/6/6.5/7(+0.07AP)% + 10/16/22/28/34/40의 추가 피해를 입히며, 50%의 추가 공격 속도가 적용됩니다.");
        System.out.println("각 공격은 미니언과 몬스터에게 30~75의 추가 피해를 입힙니다.");

        System.out.println("기력 소모: 140/130/120/110/100");
        System.out.println("재사용 대기시간: 8/7.25/6.5/5.75/5초\n");
    }

    public void skill_W() {
        String w_name = "의지의 결계";
        int use_Cost = 40;

        System.out.println("W - " + w_name);

        System.out.println("기의 검이 1.75초 동안 지속되는 보호 결계를 생성합니다.");
        System.out.println("쉔이나 결계 안의 아군 챔피언에 대한 기본 공격이 차단됩니다.");
        System.out.println("결계 안에 보호할 아군 챔피언이 없으면, 2초가 지나기 전까지 활성화되지 않습니다.");
        System.out.println("기력 소모: " + use_Cost);
        System.out.println("재사용 대기시간: 18/16.5/15/13.5/12초\n");
    }

    public void skill_E() {
        String e_name = "그림자 돌진";
        int use_Cost = 150;
        int range = 600;
        int area = 120;

        System.out.println("E - " + e_name);

        System.out.println("쉔이 한 방향으로 돌진하여 챔피언들에게 60/85/110/135/160(+15% 추가 체력)만큼의 마법 피해를 입히고, 부딪친 챔피언들을 1.5초 동안 도발합니다.");
        System.out.println("도발 당한 챔피언당 30~40의 기력이 회복됩니다.");
        System.out.println("사정거리: " + range);
        System.out.println("범위: " + area);
        System.out.println("기력 소모: " + use_Cost);
        System.out.println("재사용 대기시간: 18/16/14/12/10초\n");
    }

    public void skill_R() {
        String r_name = "단결된 의지";

        System.out.println("R - " + r_name);

        System.out.println("3초동안 정신 집중을 한 후, 쉔이 대상 아군 챔피언의 위치로 순간이동합니다.");
        System.out.println("대상 아군 챔피언은 5초동안 175/350/525 (+1.35AP)(아군의 현재 체력에 비례해 280/560/840까지 증가) 피해를 흡수하는 보호막 효과를 얻습니다.");
        System.out.println("범위: 전지역");
        System.out.println("재사용 대기시간: 200/180/160\n");
    }
}
