public class Main {
    public static void main(String[] args) {
        public void addClient(String name, String address, String email, String contactName, String contactEmail){
            Client client = new Client();
            client.setCompanyName(name);
            client.setCompanyAddress(address);
            client.setCompanyEmail(email);
            client.setContactName(contactName);
            client.setContactEmail(contactEmail);
        }


        public void addCampaign(String title, Date campaignStartDate, Date campaignFinishDate, double estimatedCost, double campaignOverheads, String staffMember, String conceptNote){
            Campaign campaign = new Campaign();
            campaign.setTitle(title) ;
            campaign.setCampaignStartDate(campaignStartDate);
            campaign.setCampaignFinishDate(campaignFinishDate);
            campaign.setEstimatedCost(estimatedCost);
            campaign.setCampaignOverheads(campaignOverheads);
            campaign.setStaffMember(staffmember);
            campaign.setConcepNote(conceptNote);

        }
        public  void addStaffMember( String staffNo, String staffName, Date staffStartDate, String staffEmailAddress, String staffConceptNote) {
            String staffNo;
            String staffName;
            Date staffStartDate;
            String staffEmailAddress;
            String staffConceptNote;

        }

    }
}
