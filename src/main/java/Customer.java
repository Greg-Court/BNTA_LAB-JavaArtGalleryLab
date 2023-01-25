import java.util.ArrayList;

public class Customer {
    private String name;
    private int wallet;
    private ArrayList<Artwork> ArtCollection;

    public Customer (String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.ArtCollection = new ArrayList<>();

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

    public ArrayList<Artwork> getArtCollection() {
        return this.ArtCollection;
    }

    public void addArtCollection(Artwork artwork) {
        this.ArtCollection.add(artwork);
    }

}




