import java.util.HashSet;

public class Education {

    String degreeType;
    String major;
    String universityName;
    String graduationYear;

    HashSet<Education> educations;

    public Education(){
        educations = new HashSet<>();
    }

    public Education(String degreeType, String major, String universityName, String graduationYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.universityName = universityName;
        this.graduationYear = graduationYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public HashSet<Education> getEducations() {
        return educations;
    }

    public void setEducations(HashSet<Education> educations) {
        this.educations = educations;
    }

    public void addEducation(Education newEducation){
        this.educations.add(newEducation);
    }

    public void displayEducation(){
        for(Education edu : this.getEducations()){
            System.out.println( "\n" + edu.getDegreeType()+ " in " + edu.getMajor()+ ", \n" + edu.getUniversityName() +
                    ", " + edu.getGraduationYear());
        }
    }
}
