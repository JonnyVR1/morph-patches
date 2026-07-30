package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class cd4 {
    /* JADX INFO: renamed from: a */
    public static ArrayList<ByteBuffer> m109117a(List<byte[]> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        Iterator<byte[]> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(ByteBuffer.wrap(it.next()));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static int m109118b(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int i6 = i3 / 2;
        int i7 = i4 / 2;
        while (i6 / i5 >= i2 && i7 / i5 >= i) {
            i5 *= 2;
        }
        return i5;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m109119c(p94 p94Var) {
        ByteBuffer byteBufferM171334a = p94Var.m171334a();
        byte[] bArr = null;
        try {
            byte[] bArrArray = byteBufferM171334a.array();
            bArr = new byte[bArrArray.length];
            System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
            return bArr;
        } catch (ReadOnlyBufferException unused) {
            if (bArr != null) {
                return bArr;
            }
            byte[] bArr2 = new byte[byteBufferM171334a.remaining()];
            byteBufferM171334a.get(bArr2);
            return bArr2;
        } catch (UnsupportedOperationException unused2) {
            if (bArr != null) {
                return bArr;
            }
            byte[] bArr3 = new byte[byteBufferM171334a.remaining()];
            byteBufferM171334a.get(bArr3);
            return bArr3;
        } catch (Throwable th) {
            if (bArr == null) {
                byteBufferM171334a.get(new byte[byteBufferM171334a.remaining()]);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap m109120d(p94 p94Var) {
        if (p94Var == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new YuvImage(p94Var.m171334a().array(), 17, p94Var.m171339f(), p94Var.m171338e(), null).compressToJpeg(new Rect(0, 0, p94Var.m171339f(), p94Var.m171338e()), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            if (bitmapDecodeByteArray == null) {
                bc00.m103470b(byteArrayOutputStream);
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(p94Var.m171340g());
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
            if (bitmapDecodeByteArray != bitmapCreateBitmap && !bitmapDecodeByteArray.isRecycled()) {
                bitmapDecodeByteArray.recycle();
            }
            bc00.m103470b(byteArrayOutputStream);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            bc00.m103470b(byteArrayOutputStream);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList<ByteBuffer> m109121e(List<p94> list) {
        if (list == null) {
            return new ArrayList<>();
        }
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        Iterator<p94> it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(ByteBuffer.wrap(m109119c(it.next())));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
