package Champion;

public class kennen extends Champion {
    kennen() {
        super.name = "диЁы";
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
    }

    public void skill_Passive() {}
    public void skill_Q() {}
    public void skill_W() {}
    public void skill_E() {}
    public void skill_R() {}
}