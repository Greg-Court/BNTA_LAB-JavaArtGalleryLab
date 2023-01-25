public class Customer {
    private String name;
    private int wallet;



    public Customer (String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }
    // Getters & Setters

    public String getName() {
        return this.name;
    }

    public void setWallet(int amount) {
        this.wallet = amount;
    }

    public int getWallet() {
        return this.wallet;
    }
}


