package Champion;

public class Irelia extends ManaCost_Champ {
    Irelia() {
        super.name ="이렐리아";
        super.level = 1;
        super.range = 200;
        super.Movement_speed = 335;

        super.base_AttackDamage = 63;       super.attack_Damage = base_AttackDamage;
        super.ability_Power = 0;

        super.base_AttackSpeed = 0.656;     super.attack_Speed = base_AttackSpeed;

        super.critical_Strike_Chance = 0;
        super.critical_Damage = 0;

        super.base_Health = 580;            super.health = base_Health;
        super.base_Health_Regen = 8.5;     super.health_Regen = base_Health_Regen;
        super.base_Cost = 350;              super.cost = base_Cost;
        super.base_Cost_Regen = 8;         super.cost_Regen = base_Cost_Regen;

        super.base_armor = 36;              super.armor = base_armor;
        super.base_MagicResistance = 32.1;    super.magic_resistance = base_MagicResistance;

        super.armor_Penetration = 0;
        super.magic_Penetration = 0;

        super.coolDown_Reduction = 0;

        super.growth_Health = 95;
        super.growth_Cost = 30;
        super.growth_AttackDamage = 4;
        super.growth_AttackSpeed = 2.5;
        super.growth_HP_Regen = 0.85;
        super.growth_Cost_Regen = 0.79;
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
        String p_name = "아이오니아의 열정";
        int range = 1200;

        System.out.println(p_name + "(Passive)");
        System.out.println("스킬이 적에게 적중하면 6초 동안 아이오니아의 열정 중첩을 1만큼 얻으며, 중첩당 공격 속도가 8/12/16% 증가합니다.\n" +
                           "중첩이 최대 5만큼 쌓이면 공격 속도가 40/60/80%만큼 증가하고, 적중 시 피해가 15~66(+0.25 추가AD)만큼 증가합니다.");

        System.out.println("챔피언과 대형 몬스터를 기본 공격 시 아이오니아의 열정 지속 시간이 초기화됩니다.");

        System.out.println("스킬 하나를 여러 챔피언에게 맞히면 중첩을 여러 개 쌓을 수 있습니다. ");
        System.out.println("범위: " + range + "\n");

    }

    public void skill_Q() {
        String q_name = "칼날 쇄도";
        int range = 600;

        System.out.println("Q - " + q_name);

        System.out.println("이렐리아가 적에게 돌진하여 5/25/45/65/85 (+0.6AD)의 물리 피해를 입히고 적중 시 효과를 적용하며 (0.12/0.14/0.16/0.18/0.2AD)의 체력을 회복합니다.\n" +
                           "칼날 쇄도로 표식이 있는 적을 공격하거나 처치하면 재사용 대기시간이 초기화됩니다." + "미니언에는 55/75/95/115/135의 추가 피해를 입힙니다.");

        System.out.println("범위: " + range);
        System.out.println("재사용 대기시간: 12/11/10/9/8");
        System.out.println("마나 소모: 20\n");

    }

    public void skill_W() {
        String w_name = "저항의 춤";

        System.out.println("W - " + w_name);

        System.out.println("첫 번째 시전: 이렐리아가 칼날을 방어 대열로 정렬하며 힘을 충전합니다." + "이렐리아가 받는 물리 피해량이 50%만큼 감소합니다. 이때 공격이나 이동은 할 수 없습니다.");
        System.out.println("두 번째 시전: 이렐리아가 칼날을 날리며 10/25/40/55/70 (+0.5 AD)(+0.4 AP)의 물리 피해를 가합니다." + "피해량은 0.75초 충전 후 최대가 되어 두 배까지 20/50/80/110/140 (+1.0 AD)(+ 0.8 AP) 증가합니다.");
        System.out.println("저항의 춤은 적이 중단시킬 수 없습니다.");

        System.out.println("마나 소모: 70/75/80/85/90" );
        System.out.println("재사용 대기시간: 20/18/16/14/12\n");
    }

    public void skill_E() {
        String e_name = "쌍검협무";
        int range = 775;

        System.out.println("E - " + e_name);

        System.out.println("이렐리아가 칼날 2개를 던집니다.\n" +
                           "두 번째 칼날이 목표 위치에 도착한 뒤 두 칼날이 서로를 향해 날아가며, 이때 칼날에 적중한 적은 80/125/170/215/260 (+0.8AP) 의 마법 피해를 입고 0.75초 동안 기절합니다.");
        System.out.println("챔피언 및 대형 몬스터에게 적중 시 5초 동안 표식이 남습니다.");

        System.out.println("사정거리: " + range);
        System.out.println("마나 소모: 50/55/60/65/70");
        System.out.println("재사용 대기시간: 18/16.5/15/13.5/12\n");
    }

    public void skill_R() {
        String r_name = "선봉진격검";
        int range = 1000;

        System.out.println("R - " + r_name);

        System.out.println("이렐리아가 칼날 다발을 발사합니다.\n" +
                           "적 챔피언에게 적중하면 칼날 다발이 넓게 펼쳐지며 이때 칼날은 125/250/375 (+0.7AP)의 마법 피해를 주고 챔피언 및 대형 몬스터에게 5초 동안 표식을 남깁니다.");

        System.out.println("펼쳐진 칼날 다발은 2.5초 동안 결계를 형성합니다. " + "이 결계를 적이 통과하면 125/250/375 (+0.7AP)의 마법 피해를 입고 1.5초 동안 90% 둔화됩니다.");
        System.out.println("무장 해제된 적은 기본 공격을 할 수 없습니다. ");

        System.out.println("범위: " + range);
        System.out.println("마나 소모: 100");
        System.out.println("재사용 대기시간: 140/120/100\n");

    }
}
