package json.parser001.entity;

public class Work {
    private String company;
    private String department;
    private String group;

    public Work() {
    }

    public Work(String company, String department, String group) {
        this.company = company;
        this.department = department;
        this.group = group;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Work{" +
                "company='" + company + '\'' +
                ", department='" + department + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
