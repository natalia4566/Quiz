import java.awt.Color;
import java.awt.image.BufferedImage;

public class SepiaFilter implements ImageFilterStrategy {
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage modifiedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Obtenemos el color del píxel original
                Color originalColor = new Color(image.getRGB(x, y));

                // Calculamos los nuevos valores de los componentes RGB para el efecto sepia
                int red = (int) (0.393 * originalColor.getRed() + 0.769 * originalColor.getGreen() + 0.189 * originalColor.getBlue());
                int green = (int) (0.349 * originalColor.getRed() + 0.686 * originalColor.getGreen() + 0.168 * originalColor.getBlue());
                int blue = (int) (0.272 * originalColor.getRed() + 0.534 * originalColor.getGreen() + 0.131 * originalColor.getBlue());

                // Aseguramos que los valores estén dentro del rango [0, 255]
                red = Math.min(255, Math.max(0, red));
                green = Math.min(255, Math.max(0, green));
                blue = Math.min(255, Math.max(0, blue));

                // Creamos el nuevo color con los valores ajustados
                Color newColor = new Color(red, green, blue);

                // Establecemos el nuevo color en la imagen modificada
                modifiedImage.setRGB(x, y, newColor.getRGB());
            }
        }
        System.out.println("Sepia");
        return modifiedImage;
    }
}
