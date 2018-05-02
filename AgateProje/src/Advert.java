import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Advert {
    private String advertTitle;
    private Date targetCompletionDate;
    private double estimatedAdvertCost;
    private double actualAdvertCost;
    private String conceptNote;

    public Advert(String advertTitle, Date targetCompletionDate, double estimatedAdvertCost, double actualAdvertCost, string conceptNote) {
        this.advertTitle = advertTitle;
        this.targetCompletionDate = targetCompletionDate;
        this.estimatedAdvertCost = estimatedAdvertCost;
        this.actualAdvertCost = actualAdvertCost;
        this.conceptNote = conceptNote;
    }

    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    public Date getTargetCompletionDate() {
        return targetCompletionDate;
    }

    public void setTargetCompletionDate(Date targetCompletionDate) {
        this.targetCompletionDate = targetCompletionDate;
    }

    public double getEstimatedAdvertCost() {
        return estimatedAdvertCost;
    }

    public void setEstimatedAdvertCost(double estimatedAdvertCost) {
        this.estimatedAdvertCost = estimatedAdvertCost;
    }

    public double getActualAdvertCost() {
        return actualAdvertCost;
    }

    public void setActualAdvertCost(double actualAdvertCost) {
        this.actualAdvertCost = actualAdvertCost;
    }

    public String getConceptNote() {
        return conceptNote;
    }

    public void setConceptNote(String conceptNote) {
        this.conceptNote = conceptNote;
    }




