package ru.myothertestcode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HackScreen {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String nowFormat;
        boolean infinity = true;

        while (infinity) {
            Thread.sleep(15 * 60 * 1000); // каждые 15 минут
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            Date now = new Date();
            nowFormat = "d:/ScreenFiles/" + formatter.format(now) + ".png";
            ImageIO.write(image, "png", new File(nowFormat));
        }
    }
}
