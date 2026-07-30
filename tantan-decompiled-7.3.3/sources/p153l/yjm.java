package p153l;

import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class yjm {

    /* JADX INFO: renamed from: a */
    private static byte[] f200308a;

    /* JADX INFO: renamed from: a */
    public static byte[] m216413a(Image image, int i, byte[] bArr) {
        int i2;
        byte[] bArr2;
        int i3 = i;
        byte[] bArr3 = bArr;
        int i4 = 2;
        int i5 = 1;
        if (i3 != 1 && i3 != 2) {
            wg3.m206174a("only support COLOR_FormatI420 and COLOR_FormatNV21");
            return null;
        }
        if (!m216414b(image)) {
            x3k.m209245a("can't convert Image to byte array, format ", image.getFormat());
            return null;
        }
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int iWidth = cropRect.width();
        int iHeight = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        if (bArr3 == null || bArr3.length != ((iWidth * iHeight) * ImageFormat.getBitsPerPixel(format)) / 8) {
            bArr3 = new byte[((iWidth * iHeight) * ImageFormat.getBitsPerPixel(format)) / 8];
        }
        byte[] bArr4 = f200308a;
        int i6 = 0;
        if (bArr4 == null || bArr4.length != planes[0].getRowStride()) {
            f200308a = new byte[planes[0].getRowStride()];
        }
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < planes.length) {
            if (i8 == 0) {
                i7 = i5;
                i9 = i6;
            } else if (i8 != i5) {
                if (i8 == i4) {
                    if (i3 == i5) {
                        i9 = (int) (((double) (iWidth * iHeight)) * 1.25d);
                        i7 = i5;
                    } else if (i3 == i4) {
                        i9 = iWidth * iHeight;
                        i7 = i4;
                    }
                }
            } else if (i3 == i5) {
                i9 = iWidth * iHeight;
                i7 = i5;
            } else if (i3 == i4) {
                i9 = (iWidth * iHeight) + i5;
                i7 = i4;
            }
            ByteBuffer buffer = planes[i8].getBuffer();
            int rowStride = planes[i8].getRowStride();
            int pixelStride = planes[i8].getPixelStride();
            int i10 = i8 == 0 ? i6 : i5;
            int i11 = iWidth >> i10;
            int i12 = iHeight >> i10;
            buffer.position(((cropRect.top >> i10) * rowStride) + ((cropRect.left >> i10) * pixelStride));
            int i13 = 0;
            while (i13 < i12) {
                if (pixelStride == 1 && i7 == 1) {
                    buffer.get(bArr3, i9, i11);
                    i9 += i11;
                    bArr2 = bArr3;
                    i2 = i11;
                } else {
                    i2 = ((i11 - 1) * pixelStride) + 1;
                    bArr2 = bArr3;
                    buffer.get(f200308a, 0, i2);
                    for (int i14 = 0; i14 < i11; i14++) {
                        bArr2[i9] = f200308a[i14 * pixelStride];
                        i9 += i7;
                    }
                }
                if (i13 < i12 - 1) {
                    buffer.position((buffer.position() + rowStride) - i2);
                }
                i13++;
                bArr3 = bArr2;
            }
            i8++;
            i3 = i;
            i6 = 0;
            i4 = 2;
            i5 = 1;
            bArr3 = bArr3;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m216414b(Image image) {
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }
}
