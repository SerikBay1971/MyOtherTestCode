package ru.myothertestcode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HackScreen {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String nowFormat;
        boolean infinity = true;

        while (infinity) {
            BufferedImage image = null;
            try {
                image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            } catch (AWTException e) {
                e.printStackTrace();
            }
            Date now = new Date();
            nowFormat = "d:/ScreenFiles/" + formatter.format(now) + ".png";
            try {
                ImageIO.write(image, "png", new File(nowFormat));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(15 * 1000); // каждые 15 секунд
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
