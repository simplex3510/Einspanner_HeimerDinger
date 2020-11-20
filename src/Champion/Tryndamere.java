package Champion;

public class Tryndamere extends FuryRageCost_Champ{
    Tryndamere() {
        super.name = "자크";
        super.level = 1;
        super.range = 550;
        super.Movement_speed = 335;

        super.base_AttackDamage = 48;       super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.625;     super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 541;            super.health = base_Health;
        super.base_Health_Regen = 5.59;     super.health_Regen = base_Health_Regen;

        super.base_Cost = 200;              super.cost = base_Cost;
        super.base_Cost_Regen = 50;         super.cost_Regen = base_Cost_Regen;

        super.base_armor = 29;              super.armor = base_armor;
        super.base_MagicResistance = 30;    super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 84;
        super.growth_Cost = 0;
        super.growth_AttackDamage = 3.75;
        super.growth_AttackSpeed = 3.4;
        super.growth_HP_Regen = 0.65;
        super.growth_Cost_Regen = 0;
        super.growth_Armor = 3.75;
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
        String p_name = "폭풍의 표식";

        System.out.println("Passive - " + p_name);
        System.out.println("케넨의 스킬에 적중당한 적은 6초 동안 폭풍의 표식이 붙습니다." +
                "폭풍의 표식이 3개가 되면 상대는 1초 동안 기절하며, 케넨은 25의 기력을 얻습니다.");
        System.out.println("7초 안에 동일 한 적을 다시 기절시킬 경우 기절 시간이 0.5초로 감소합니다.\n");
    }

    public void skill_Q() {
        String q_name = "천둥의 표창";
        int range = 1050;

        System.out.println("Q - " + q_name);

        System.out.println("표창을 던져 명중하는 첫 번째 적에게 75/115/155/195/235(+0.75AP)의 마법 피해를 입힙니다.");
        System.out.println("사정 거리: " + range);
        System.out.println("기력 소모: 60/55/50/45/40");
        System.out.println("재사용 대기시간: 8/7/6/5/4\n");
    }

    public void skill_W() {
        String w_name = "전류 방출";
        int range = 750;
        int use_Cost = 40;

        System.out.println("W - " + w_name);

        System.out.println("기본 지속 효과: 5번째 공격마다 케넨이 10/20/30/40/50(+0.6/0.7/0.8/0.9/1.0 추가 AD)(+0.2 추가 AP)의 추가 마법 피해를 입히고 대상에게 폭풍의 표식을 추가합니다.");
        System.out.println("사용 시: 폭풍의 표식이 있는 주변의 모든 적에게 전기를 뿜어내어 60/85/110/135/160(+0.8AP)의 마법 피해를 입힙니다.");
        System.out.println("범위: " + range);
        System.out.println("기력 소모: " + use_Cost);
        System.out.println("재사용 대기시간: 14/12/10/8/6\n");
    }

    public void skill_E() {
        String e_name = "번개 질주";

        System.out.println("E - " + e_name);

        System.out.println("케넨이 2초 동안 번개 구체로 변신하여 충돌하는 적에게 85/125/165/205/245(+0.6AP)의 마법 피해를 입힙니다.\n" +
                "케넨은 번개 구체 형태일 때 이동 속도가 100% 증가합니다.\n" +
                "번개 형태일 때 최소 한 명의 적에게 피해를 입히면 40의 기력을 회복합니다.\n" +
                "원래 모습으로 돌아오면 공격 속도가 4초 동안 40/50/60/70/80% 증가합니다.\n" +
                "번개 질주는 미니언에게는 50%의 피해를 입히며, 케넨은 번개 구체 형태일 때 유닛과의 충돌을 무시합니다.");
        System.out.println("기력 소모: 100/95/90/85/80");
        System.out.println("재사용 대기시간: 10/9/8/7/6\n");
    }

    public void skill_R() {
        String r_name = "날카로운 소용돌이";
        int range = 550;
        int use_Cost = 0;
        int coolDown = 120;

        System.out.println("R - " + r_name);

        System.out.println("3초 동안 마법의 폭풍을 소환하여 0.5초마다 케넨 근처에 있는 모든 적에게 40/75/110(+0.2AP)의 마법 피해를 입힙니다.\n" +
                "적은 날카로운 소용돌이에 맞을 때마다 폭풍의 표식이 최대 3번까지 중첩됩니다.\n" +
                "지속시간 동안 추가 방어력/마법 저항력이 20/40/60 증가합니다.\n" +
                "적을 한 번 맞힐 때마다 입히는 피해량이 10%씩 증가합니다.(최대 150%까지 증가)\n" +
                "번개 질주는 미니언에게는 50%의 피해를 입히며, 케넨은 번개 구체 형태일 때 유닛과의 충돌을 무시합니다.");
        System.out.println("범위: " + range);
        System.out.println("기력 소모: " + use_Cost);
        System.out.println("재사용 대기시간: " + coolDown + "\n");
    }
}
