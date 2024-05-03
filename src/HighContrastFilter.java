import java.awt.Color;
import java.awt.image.BufferedImage;

public class HighContrastFilter implements ImageFilterStrategy {
    @Override
    public BufferedImage applyFilter(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();


        BufferedImage modifiedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        double contrastFactor = 1.5; // Factor de contraste

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                // Obtenemos el color del píxel original
                Color originalColor = new Color(image.getRGB(x, y));

                // Calculamos los nuevos valores de los componentes RGB
                int red = (int) (originalColor.getRed() * contrastFactor);
                int green = (int) (originalColor.getGreen() * contrastFactor);
                int blue = (int) (originalColor.getBlue() * contrastFactor);

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
        System.out.println("Alto Contraste");
        return modifiedImage;
    }
}
