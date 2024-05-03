import java.awt.image.BufferedImage;

public interface ImageFilterStrategy {
    BufferedImage applyFilter(BufferedImage image);
}