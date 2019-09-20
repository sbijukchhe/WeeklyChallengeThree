import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Skill coreSkill = new Skill();
        coreSkill.setSkillName("Core Skills");

        Education education = new Education();
        WorkExperience workExperience = new WorkExperience();

        // Request the name of applicant
        System.out.println("Please enter your name ");
        String name = input.nextLine();

        // Request the email of applicant
        System.out.println("Please enter your email address ");
        String emailAdd = input.nextLine();

        // Request for Education details
        // First degree
        System.out.println("Please enter your Degree type - Associate's, Bachelor's, Master's, PhD, etc. ");
        String degreeType = input.nextLine();
        System.out.println("Please enter your major ");
        String major = input.nextLine();
        System.out.println("Please enter your University name ");
        String univName = input.nextLine();
        System.out.println("Please enter your Graduation year ");
        String gradYear = input.nextLine();

        Education educationOne = new Education();
        educationOne.setDegreeType(degreeType);
        educationOne.setMajor(major);
        educationOne.setUniversityName(univName);
        educationOne.setGraduationYear(gradYear);
        education.addEducation(educationOne);

        // Request for Work experience
        System.out.println("Please enter your Job title ");
        String jTitle = input.nextLine();
        System.out.println("Please enter your Company name ");
        String cName = input.nextLine();
        System.out.println("Please enter your job Start date - month year (eg September 2019)");
        String startDate = input.nextLine();
        System.out.println("Please enter your job End date - month year (eg September 2019)");
        String endDate = input.nextLine();
        System.out.println("Please enter Job description ");
        String jobDescription = input.nextLine();

        WorkExperience workExperienceOne = new WorkExperience();
        workExperienceOne.setJobTitle(jTitle);
        workExperienceOne.setCompany(cName);
        workExperienceOne.setStartDate(startDate);
        workExperienceOne.setEndDate(endDate);
        workExperienceOne.setJobDescription(jobDescription);
        workExperience.addExperience(workExperienceOne);


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

        // Printing education details
        System.out.println("\n\nEducation");
        System.out.println("-----------");
        ArrayList<String> eduDetails  = new ArrayList<>();
        for(Education edu : education.getEducations())
        {
            eduDetails.add(edu.degreeType);
            eduDetails.add(edu.major);
            eduDetails.add(edu.universityName);
            eduDetails.add(edu.graduationYear);
            System.out.println(edu.getDegreeType()+ " in " + edu.getMajor()+ ", \n" + edu.getUniversityName() +
                    ", " + edu.getGraduationYear());
        }

        // Printing Work Experience
        System.out.println("\n\nExperience");
        System.out.println("-----------");
        ArrayList<String> experienceDetails  = new ArrayList<>();
        for(WorkExperience wExperience : workExperience.getWorkExperiences())
        {
            experienceDetails.add(wExperience.jobTitle);
            experienceDetails.add(wExperience.company);
            experienceDetails.add(wExperience.startDate);
            experienceDetails.add(wExperience.endDate);
            experienceDetails.add(wExperience.jobDescription);

            System.out.println(wExperience.getJobTitle()+ " \n" + wExperience.getCompany()+ ", \t" +
                    wExperience.getStartDate() + " - " + wExperience.getEndDate() + "\n" +
                    wExperience.getJobDescription());
        }
        // printing skills
        System.out.println("\n\nSkills");
        System.out.println("-----------");
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

