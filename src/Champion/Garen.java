package Champion;

public class Garen extends NoneCost_Champ {
    Garen() {
        super.name = "가렌";
        super.level = 1;
        super.range = 175;
        super.Movement_speed = 340;

        super.base_AttackDamage = 66;       super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.625;     super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 620;            super.health = base_Health;
        super.base_Health_Regen = 8;        super.health_Regen = base_Health_Regen;

        super.base_Cost = 0;                super.cost = base_Cost;
        super.base_Cost_Regen = 0;          super.cost_Regen = base_Cost_Regen;

        super.base_armor = 36;              super.armor = base_armor;
        super.base_MagicResistance = 32.1;  super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 84;
        super.growth_Cost = 0;
        super.growth_AttackDamage = 4.5;
        super.growth_AttackSpeed = 3.65;
        super.growth_HP_Regen = 0.5;
        super.growth_Cost_Regen = 0;
        super.growth_Armor = 3;
        super.growth_MagicResistance = 0.75;

        /*
        super.skill_Q_Level = 0;
        super.skill_W_Level = 0;
        super.skill_E_Level = 0;
        super.skill_R_Level = 0;
        */
    }

    public void skill_Passive() {
        String p_name = "인내심";

        System.out.println("Passive - " + p_name);

        System.out.println("가렌은 8초 동안 피해를 입거나 적의 스킬에 맞지 않으면 5초당 최대 체력의 1.5~10.1%만큼 회복합니다.");
        System.out.println("미니언과 에픽 몬스터를 제외한 몬스터는 인내심에 영향을 주지 않습니다.\n");
    }

    public void skill_Q() {
        String q_name = "결정타";

        System.out.println("Q - " + q_name);

        System.out.println("가렌에게 적용된 모든 둔화 효과가 풀리며 이동 속도가 1/1.65/2.3/2.95/3.6초 동안 30%만큼 늘어납니다.");
        System.out.println("4.5초 안에 하는 다음 기본 공격은 30/60/90/120/150 (+1.5AD)의 물리 피해를 입히고 1.5초 동안 침묵시킵니다.");
        System.out.println("재사용 대기시간: 8초\n");
    }

    public void skill_W() {
        String w_name = "용기";

        System.out.println("W - " + w_name);

        System.out.println("기본 지속 효과: 유닛들을 처치하면 영구적으로 0.25의 방어력과 마법 저항력이 부여되어 최대 30까지 증가합니다.");
        System.out.println("사용 시: 가렌이 2/2.75/3.5/4.25/5초 동안 용기백배하여 받는 피해가 30% 감소합니다.");
        System.out.println("처음 0.75초 동안은 70/95/120/145/170 (+추가 체력의 20%) 만큼의 피해를 흡수하는 보호막과 강인함 60%를 얻습니다.");
        System.out.println("재사용 대기시간: 23/21/19/17/15초\n");
    }

    public void skill_E() {
        String e_name = "심판";
        int range = 325;

        System.out.println("E - " + e_name);

        System.out.println("가렌이 3초 동안 검을 들고 빠르게 회전하여 4/8/12/16/20 (+레벨에 따라 0~8.2) (+0.32/0.34/0.36/0.38/0.4AD)의 물리 피해를 입히며,");
        System.out.println("가장 가까운 적에게는 피해량이 25% 증가합니다. (공격 횟수는 기본 7회+아이템 및 레벨 업으로 얻는 공격 속도 25%마다 1회)");
        System.out.println("추가로, 회전에 6번 맞은 적은 6초 동안 방어력이 25% 감소합니다. 에픽 몬스터를 제외한 몬스터에게 150%의 피해를 입힙니다.");
        System.out.println("치명타가 적용되며, 스킬을 빨리 취소하면 남은 스킬 지속시간만큼 재사용 대기시간이 감소합니다.");
        System.out.println("범위: " + range);
        System.out.println("재사용 대기시간: 9초\n");

    }

    public void skill_R() {
        String r_name = "데마시아의 정의";

        System.out.println("R - " + r_name);

        System.out.println("가렌이 적 챔피언을 처단할 데마시아의 힘을 소환하여 150/300/450의 고정 피해를 입히고 대상이 잃은 체력의 20/25/30%의 피해를 추가로 입힙니다.");
        System.out.println("사정거리: 400");
        System.out.println("재사용 대기시간: 120/100/80초\n");
    }
}