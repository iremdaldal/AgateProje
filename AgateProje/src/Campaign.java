import java.util.Date;

public class Campaign {

    private String title;
    private Date campaignStartDate;
    private Date campaignFinishDate;
    private double estimatedCost;
    private double campaignOverheads;
    private String StaffMember;
    private String conceptNote;
}

    public Campaign(String title, Date campaignStartDate, Date campaignFinishDate, double estimatedCost, double campaignOverheads, string conceptNote) {
        this.title = title;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
        this.estimatedCost = estimatedCost;
        this.campaignOverheads = campaignOverheads;
        this.StaffMember= StaffMember;
        this.conceptNote = conceptNote;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(Date campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public Date getCampaignFinishDate() {
        return campaignFinishDate;
    }

    public void setCampaignFinishDate(Date campaignFinishDate) {
        this.campaignFinishDate = campaignFinishDate;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public double getOverheads() {
        return campaignOverheads;
    }

    public void setCampaignOverheads(double campaignOverheads) {
        this.campaignOverheads = campaignOverheads;
    }

    public String getStaffMember() {
        return StaffMember;
    }

    public void setStaffMember(String StaffMember) {
        this.StaffMember = StaffMember;
    }

    public String getConceptNote() {
        return conceptNote;
    }

    public void setConceptNote(String conceptNote) {
        this.conceptNote = conceptNote;
    }

}
