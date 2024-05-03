import java.awt.Color;
import java.awt.image.BufferedImage;

public class GrayscaleFilter implements ImageFilterStrategy {
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage modifiedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Obtenemos el color del píxel original
                Color originalColor = new Color(image.getRGB(x, y));

                // Calculamos el valor promedio de los componentes RGB para obtener la escala de grises
                int grayValue = (originalColor.getRed() + originalColor.getGreen() + originalColor.getBlue()) / 3;

                // Creamos el nuevo color en escala de grises
                Color newColor = new Color(grayValue, grayValue, grayValue);

                // Establecemos el nuevo color en la imagen modificada
                modifiedImage.setRGB(x, y, newColor.getRGB());
            }
        }
        System.out.println("Escala de gris");
        return modifiedImage;
    }
}
