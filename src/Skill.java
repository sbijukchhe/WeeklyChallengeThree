import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Skill {

    String skillName;
    String proficiency;

    HashSet<Skill> skills;

    public Skill() {
        skills = new HashSet<>();
    }

    public Skill(String skillName, String proficiency) {
        this.skillName = skillName;
        this.proficiency = proficiency;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public HashSet<Skill> getSkills() {
        return skills;
    }

    public void setSkills(HashSet<Skill> skills) {
        this.skills = skills;
    }

    public void addSkill(Skill newSkill)
    {
        this.skills.add(newSkill);
    }

    public void displaySkill(){
        for(Skill sk : this.getSkills()){
            System.out.println(sk.getSkillName()+ ",\t " + sk.getProficiency());
        }
    }
}
