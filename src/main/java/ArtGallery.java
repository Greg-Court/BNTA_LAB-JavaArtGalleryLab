import java.util.ArrayList;//

// 1. ArtGallery

    public class ArtGallery {
    // A Gallery should have a name, a till and a collection of stock that contains Artwork objects.
    private String name;
    private int till;
    private ArrayList<Artwork> stock;

    public ArtGallery (String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>();
    }

        public ArrayList<Artwork> getStock() {
            return this.stock;
        }

        public int getTill() {
            return this.till;
        }

    public void addArtwork(Artwork artwork){
        this.stock.add(artwork);
    }
//buy Artwork from Gallery
//which reduces the money in wallet

//increases money in Gallery till
    public void sellArtwork(Artwork artwork, Customer customer) {
        int artPrice = artwork.getPrice();
        int customerWallet = customer.getWallet();
        if(customerWallet > artPrice) {
            customer.setWallet(customerWallet - artPrice);
            this.till += artPrice;
        }
    }
    
}


