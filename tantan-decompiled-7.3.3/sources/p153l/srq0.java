package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class srq0 {
    /* JADX INFO: renamed from: a */
    public static int m187637a(byte b) {
        return (((b >> 4) & 15) * 16) + (b & 15);
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m187638b(byte[] bArr, int i, int i2, int i3) {
        MessageDigest messageDigest;
        String lowerCase;
        int i4;
        Bitmap bitmapDecodeByteArray;
        int i5;
        int[] iArr;
        MessageDigest messageDigest2 = null;
        int i6 = 0;
        if (i3 != 0) {
            if (i3 == 3) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                return bitmapCreateBitmap;
            }
            if (i3 != 4) {
                return null;
            }
            int length = bArr.length;
            if (length == 0) {
                iArr = null;
            } else {
                int i7 = length % 3 != 0 ? 1 : 0;
                int i8 = (length / 3) + i7;
                int[] iArr2 = new int[i8];
                if (i7 == 0) {
                    while (i6 < i8) {
                        int i9 = i6 * 3;
                        iArr2[i6] = m187637a(bArr[i9 + 2]) | (m187637a(bArr[i9]) << 16) | (m187637a(bArr[i9 + 1]) << 8) | RoundedDrawable.DEFAULT_BORDER_COLOR;
                        i6++;
                    }
                } else {
                    while (true) {
                        i5 = i8 - 1;
                        if (i6 >= i5) {
                            break;
                        }
                        int i10 = i6 * 3;
                        iArr2[i6] = m187637a(bArr[i10 + 2]) | (m187637a(bArr[i10]) << 16) | (m187637a(bArr[i10 + 1]) << 8) | RoundedDrawable.DEFAULT_BORDER_COLOR;
                        i6++;
                    }
                    iArr2[i5] = -16777216;
                }
                iArr = iArr2;
            }
            if (iArr == null) {
                return null;
            }
            o6r0.m166281a("RGBBytes2Bitmap colors length" + iArr.length + "  width:" + i + "  height:" + i2);
            return Bitmap.createBitmap(iArr, 0, i, i, i2, Bitmap.Config.ARGB_8888);
        }
        StringBuilder sb = new StringBuilder();
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            try {
                messageDigest.update(bArr);
                while (true) {
                    if (i4 >= rxk.f165346b.size()) {
                        rxk.f165348d.add(1);
                        break;
                    }
                    if (rxk.f165346b.get(i4).equals(lowerCase)) {
                        break;
                    }
                    i4++;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        } catch (NoSuchAlgorithmException unused2) {
            messageDigest = null;
        }
        if (messageDigest != null) {
            for (byte b : messageDigest.digest()) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
        }
        lowerCase = sb.toString().toLowerCase();
        i4 = 0;
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        try {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        } catch (OutOfMemoryError | Error unused3) {
            bitmapDecodeByteArray = null;
        }
        String strValueOf = String.valueOf(System.identityHashCode(bitmapDecodeByteArray));
        StringBuilder sb2 = new StringBuilder();
        try {
            messageDigest2 = MessageDigest.getInstance("MD5");
            messageDigest2.update(strValueOf.getBytes());
        } catch (NoSuchAlgorithmException unused4) {
        }
        if (messageDigest2 != null) {
            byte[] bArrDigest = messageDigest2.digest();
            int length2 = bArrDigest.length;
            while (i6 < length2) {
                sb2.append(String.format("%02X", Byte.valueOf(bArrDigest[i6])));
                i6++;
            }
        }
        rxk.f165346b.add(sb2.toString().toLowerCase());
        return bitmapDecodeByteArray;
    }
}
