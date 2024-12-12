public class Assignment3 {
    public static abstract class Skill {
        private String name;
        private String type;
        private int skillLevel;
    
        public Skill(String name, String type, int skillLevel) {
            this.name = name;
            this.type = type;
            this.skillLevel = skillLevel;
        }
    
        public String getName() {
            return name;
        }
    
        public String getType() {
            return type;
        }
    
        public int getSkillLevel() {
            return skillLevel;
        }
    
        public abstract void identifySkill();
    }
    
    public static class HardSkill extends Skill {
        public HardSkill(String name, int skillLevel) {
            super(name, "Hard", skillLevel);
        }
    
        @Override
        public void identifySkill() {
            System.out.println("Hard Skill of " + getName() + " has a level of " + getSkillLevel());
        }
    }

    public static class SoftSkill extends Skill {
        public SoftSkill(String name, int skillLevel) {
            super(name, "Soft", skillLevel);
        }
    
        @Override
        public void identifySkill() {
            System.out.println("Soft Skill of " + getName() + " has a level of " + getSkillLevel());
        }
    }

    public static class GiftSkill extends Skill {
        public GiftSkill(String name, int skillLevel) {
            super(name, "Gift", skillLevel);
        }
    
        @Override
        public void identifySkill() {
            System.out.println("Gift Skill of " + getName() + " has a level of " + getSkillLevel());
        }
    }

    public static class TalentSkill extends Skill {
        public TalentSkill(String name, int skillLevel) {
            super(name, "Talent", skillLevel);
        }
    
        @Override
        public void identifySkill() {
            System.out.println("Talent Skill of " + getName() + " has a level of " + getSkillLevel());
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Skill hardSkill = new HardSkill("Programming", 6);
            Skill softSkill = new SoftSkill("Communication", 8);
            Skill giftSkill = new GiftSkill("Mercy", 7);
            Skill talentSkill = new TalentSkill("Organization", 9);
    
            hardSkill.identifySkill();
            softSkill.identifySkill();
            giftSkill.identifySkill();
            talentSkill.identifySkill();
        }
    }
}
