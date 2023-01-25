import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtGalleryTest {

    ArtGallery gallery;
    Artwork artwork;
    Customer customer;
    Artwork stockTakeTestArt1;
    Artwork stockTakeTestArt2;

    @BeforeEach
    void setUp() {
        // create a gallery
        gallery = new ArtGallery("SGGallery");
        // create artwork
        artwork = new Artwork("SamraLisa", "Greg", 690000);
        // add 1 piece of art into gallery stock
        gallery.addArtwork(artwork);
        // make a customer with bare P
        customer = new Customer("Colin", 1000000);
    }

    @Test
    void hasArtwork() {
        assertThat(gallery.getStock().get(0)).isEqualTo(artwork);
    }

    @Test
    void soldArtwork() {

        // ask why this isn't working
        int customerWallet = customer.getWallet();
        int galleryTill = gallery.getTill();

        gallery.sellArtwork(artwork, customer);

        // has customer wallet reduced by artwork price?
        assertThat(customer.getWallet()).isEqualTo(310000);
        // has gallery till increased by artwork price?
        assertThat(gallery.getTill()).isEqualTo(690000);
    }

    @Test
    void artworkTransfers(){
        gallery.sellArtwork(artwork, customer);
        System.out.println((customer.getArtCollection().contains(artwork)));
        assertThat(gallery.getStock().size()).isEqualTo(0);
        assertThat(customer.getArtCollection().size()).isEqualTo(1);
    }

    @Test
    void stockTakeTakes() {
        stockTakeTestArt1 = new Artwork("BobbyMcBobberson", "Samra", 543211);
        stockTakeTestArt2 = new Artwork("idkrandom", "yeye", 242321);

        gallery.addArtwork(stockTakeTestArt1);
        gallery.addArtwork(stockTakeTestArt2);

        assertThat(gallery.stockTake()).isEqualTo(1475532);

    }
}







