public class CorporateCustomer extends Customer {
    private String account;

    public void setAccount(String account) {
        this.account = account;
    }
    
    public CorporateCustomer(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    
}
