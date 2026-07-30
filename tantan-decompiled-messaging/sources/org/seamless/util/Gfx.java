package org.seamless.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes3.dex */
public class Gfx {
    /* JADX WARN: Code duplicated, block: B:14:0x0022 A[PHI: r0
      0x0022: PHI (r0v4 int) = (r0v3 int), (r0v3 int), (r0v7 int) binds: [B:9:0x0018, B:10:0x001a, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static BufferedImage getScaledInstance(BufferedImage bufferedImage, int i, int i2, Object obj, boolean z) {
        int width;
        int height;
        int i3;
        int i4 = bufferedImage.getTransparency() != 1 ? 2 : 1;
        if (z) {
            width = bufferedImage.getWidth();
            height = bufferedImage.getHeight();
        } else {
            width = i;
            height = i2;
        }
        while (true) {
            if (!z || width <= i) {
                i3 = width;
            } else {
                width /= 2;
                if (width < i) {
                    i3 = i;
                } else {
                    i3 = width;
                }
            }
            int i5 = (!z || height <= i2 || (height = height / 2) >= i2) ? height : i2;
            BufferedImage bufferedImage2 = new BufferedImage(i3, i5, i4);
            Graphics2D graphics2DCreateGraphics = bufferedImage2.createGraphics();
            graphics2DCreateGraphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, obj);
            graphics2DCreateGraphics.drawImage(bufferedImage, 0, 0, i3, i5, (ImageObserver) null);
            graphics2DCreateGraphics.dispose();
            if (i3 == i && i5 == i2) {
                return bufferedImage2;
            }
            bufferedImage = bufferedImage2;
            width = i3;
            height = i5;
        }
    }

    public static byte[] resizeProportionally(ImageIcon imageIcon, String str, int i, int i2) throws IOException {
        String str2;
        double iconWidth = i != imageIcon.getIconWidth() ? ((double) i) / ((double) imageIcon.getIconWidth()) : 1.0d;
        double iconHeight = i2 != imageIcon.getIconHeight() ? ((double) i2) / ((double) imageIcon.getIconHeight()) : 1.0d;
        if (iconWidth < iconHeight) {
            i2 = (int) (((double) imageIcon.getIconHeight()) * iconWidth);
        } else {
            i = (int) (((double) imageIcon.getIconWidth()) * iconHeight);
        }
        BufferedImage bufferedImage = new BufferedImage(imageIcon.getIconWidth(), imageIcon.getIconHeight(), DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG.equals(str) ? 2 : 1);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight(), (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        BufferedImage scaledInstance = getScaledInstance(bufferedImage, i, i2, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR, false);
        if (DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG.equals(str)) {
            str2 = "png";
        } else {
            str2 = (DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG.equals(str) || "image/jpg".equals(str)) ? "jpeg" : "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        ImageIO.write(scaledInstance, str2, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
