import java.util.Date;

public abstract class StaffMember {
    String staffNo;
    String staffName;
    Date staffStartDate;
    String staffEmailAddress;
    String staffConceptNote;

    abstract void assignStaffContact();
    public StaffMember getStaffDetails() {
        return null;
    }
}
