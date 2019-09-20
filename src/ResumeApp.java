import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args){

        String response = "Y";

        Scanner input = new Scanner(System.in);
        Skill coreSkill = new Skill();
        Education education = new Education();
        WorkExperience workExperience = new WorkExperience();

        // Request the name of applicant
        System.out.println("Please enter your name ");
        String name = input.nextLine();

        // Request the email of applicant
        System.out.println("Please enter your email address ");
        String emailAdd = input.nextLine();

        // Request for Education details
        System.out.println("Do you want to enter your Education details? Y / N");
        response = input.nextLine();

        while (response.equalsIgnoreCase("Y")) {
            if (response.equalsIgnoreCase("Y")) {

                System.out.println("Please enter your Degree type - Associate's, Bachelor's, Master's, PhD, etc. ");
                String degreeType = input.nextLine();
                System.out.println("Please enter your major ");
                String major = input.nextLine();
                System.out.println("Please enter your University / College name ");
                String univName = input.nextLine();
                System.out.println("Please enter your Graduation year ");
                String gradYear = input.nextLine();

                Education educationOne = new Education(degreeType, major, univName, gradYear);
                education.addEducation(educationOne);
            }
            System.out.println("Do you want to enter your Education details? Y / N");
            response = input.nextLine();
        }

        // Request for Work experience
        System.out.println("Do you want to enter your Work Experience? Y / N");
        response = input.nextLine();

        while (response.equalsIgnoreCase("Y")) {
            if (response.equalsIgnoreCase("Y")) {
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

                WorkExperience myExperience = new WorkExperience(jTitle, cName, startDate, endDate, jobDescription);
                workExperience.addExperience(myExperience);
            }
            System.out.println("Do you want to enter your Work Experience? Y / N");
            response = input.nextLine();
        }

        //  // Request for Skill sets
        System.out.println("Do you want to enter your skills? Y / N");
        response = input.nextLine();

        while (response.equalsIgnoreCase("Y")) {
            if (response.equalsIgnoreCase("Y")) {

                System.out.println("Please enter your skill name");
                String skillNameOne = input.nextLine();
                System.out.println("Please enter your skill proficiency - Fundamental, Novice, Intermediate, " +
                                                                                                "Advanced or Expert");
                String skillProfOne = input.nextLine();

                Skill skillOne = new Skill(skillNameOne, skillProfOne );
                coreSkill.addSkill(skillOne);
            }
              System.out.println("Do you want to enter your skills? Y / N");
              response = input.nextLine();
        }

        //Printing name and email
        System.out.println("===========================================");
        System.out.println(name);
        System.out.println(emailAdd);

        // Printing education details
        System.out.println("\nEducation");
        System.out.println("-----------");
//        for(Education edu : education.getEducations()){
//            System.out.println("\n" + edu.getDegreeType()+ " in " + edu.getMajor()+ ", \n" + edu.getUniversityName() +
//                    ", " + edu.getGraduationYear());
//        }
        education.displayEducation();

        // Printing Work Experience
        System.out.println("\nExperience");
        System.out.println("-----------");
//        for(WorkExperience wExperience : workExperience.getWorkExperiences()){
//            System.out.println("\n" + wExperience.getJobTitle()+ " \n" + wExperience.getCompany()+ ", \t" +
//                    wExperience.getStartDate() + " - " + wExperience.getEndDate() + "\n" +
//                    wExperience.getJobDescription());
//        }
        workExperience.displayExperience();
        // printing skills
        System.out.println("\nSkills");
        System.out.println("-----------");
//        for(Skill sk : coreSkill.getSkills()){
//        System.out.println(sk.getSkillName()+ ",\t " + sk.getProficiency());
//        }
        coreSkill.displaySkill();
    }
}

