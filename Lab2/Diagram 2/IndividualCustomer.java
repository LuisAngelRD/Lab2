public class IndividualCustomer extends Customer {
    private String card;

    public IndividualCustomer(String card) {
        this.card = card;
    }

    public void setCard(String card) {
        this.card = card;
    }
    
    public String getCard() {
        return card;
    }

   
}
