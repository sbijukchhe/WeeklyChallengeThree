import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Skill coreSkill = new Skill();
        coreSkill.setSkillName("Core Skills");

        // Request the name of applicant
        System.out.println("Please enter your name ");
        String name = input.nextLine();

        // Request the email of applicant
        System.out.println("Please enter your email address ");
        String emailAdd = input.nextLine();

        // Request the name of skills
        System.out.println("Please enter your skills ");

        // first skill
        System.out.println("Please enter your first skill name");
        String skillNameOne = input.nextLine();
        System.out.println("Please enter your first skill proficiency");
        System.out.println("Fundamental, Novice, Intermediate, Advanced or Expert");
        String skillProfOne = input.nextLine();

        Skill skillOne = new Skill();
        skillOne.setSkillName(skillNameOne);
        skillOne.setProficiency(skillProfOne);
        coreSkill.addSkill(skillOne);

        // second skill
        System.out.println("Please enter your second skill name");
        String skillNameTwo = input.nextLine();
        System.out.println("Please enter your second skill proficiency");
        System.out.println("Fundamental, Novice, Intermediate, Advanced or Expert");
        String skillProfTwo = input.nextLine();

        Skill skillTwo = new Skill();
        skillTwo.setSkillName(skillNameTwo);
        skillTwo.setProficiency(skillProfTwo);
        coreSkill.addSkill(skillTwo);

        // third skill
        System.out.println("Please enter your third skill name");
        String skillNameThree = input.nextLine();
        System.out.println("Please enter your third skill proficiency");
        System.out.println("Fundamental, Novice, Intermediate, Advanced or Expert");
        String skillProfThree = input.nextLine();

        Skill skillThree = new Skill();
        skillThree.setSkillName(skillNameThree);
        skillThree.setProficiency(skillProfThree);
        coreSkill.addSkill(skillThree);







        //Printing name and email
        System.out.println("===========================================");
        System.out.println(name);
        System.out.println(emailAdd);

        // printing skills
        System.out.println("\n\nSkills");
        ArrayList<String> skillSets  = new ArrayList<>();
        for(Skill sk : coreSkill.getSkills())
        {
            skillSets.add(sk.getSkillName());
            skillSets.add(sk.getProficiency());
//            System.out.println(coreSkill.getSkillName()+", \n "+sk.getSkillName()+
//                    "\t and Proficiency is :" + sk.getProficiency());


        System.out.println(sk.getSkillName()+ ",\t " + sk.getProficiency());
        }
    }
}

