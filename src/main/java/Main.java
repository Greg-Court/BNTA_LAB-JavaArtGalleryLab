public class Main {
    public static void main(String[] args) {

        ArtGallery gallery;
        Artwork artwork;
        Customer customer;

        gallery = new ArtGallery("SGGallery");
        // create artwork
        artwork = new Artwork("SamraLisa", "Greg", 690000);
        // add 1 piece of art into gallery stock
        gallery.addArtwork(artwork);
        // make a customer with bare P
        customer = new Customer("Colin", 1000000);

        gallery.sellArtwork(artwork, customer);


        System.out.println(customer.getWallet());
        System.out.println(gallery.getTill());

    }
}
