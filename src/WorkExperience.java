import java.util.HashSet;

public class WorkExperience {

    String jobTitle;
    String company;
    String startDate;
    String endDate;
    String jobDescription;

    HashSet<WorkExperience> workExperiences;

    public WorkExperience(){
        workExperiences = new HashSet<>();
    }

    public WorkExperience(String jobTitle, String company, String startDate, String endDate, String jobDescription) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public HashSet<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(HashSet<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public void addExperience(WorkExperience workExperience){
        workExperiences.add(workExperience);
    }

    public void displayExperience(){
        for(WorkExperience wExperience : this.getWorkExperiences()){
            System.out.println("\n" + wExperience.getJobTitle()+ " \n" + wExperience.getCompany()+ ", \t" +
                    wExperience.getStartDate() + " - " + wExperience.getEndDate() + "\n" +
                    wExperience.getJobDescription());
        }
    }
}
