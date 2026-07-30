package p153l;

import android.graphics.Bitmap;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class q110 {

    /* JADX INFO: renamed from: l.q110$a */
    public static class C19486a {

        /* JADX INFO: renamed from: a */
        public int f155142a;

        /* JADX INFO: renamed from: b */
        public int f155143b;

        /* JADX INFO: renamed from: c */
        public int f155144c;

        /* JADX INFO: renamed from: d */
        public int f155145d;

        /* JADX INFO: renamed from: e */
        public int f155146e;

        /* JADX INFO: renamed from: a */
        public final int m174809a(byte[] bArr, int i) {
            int i2 = i * 4;
            return (bArr[i2 + 3] & 255) | ((bArr[i2 + 2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
        }

        /* JADX INFO: renamed from: b */
        public void m174810b(byte[] bArr) {
            this.f155142a = m174809a(bArr, 0);
            this.f155143b = m174809a(bArr, 1);
            this.f155144c = m174809a(bArr, 2);
            this.f155145d = m174809a(bArr, 3);
            this.f155146e = m174809a(bArr, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static Bitmap m174807a(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        bitmap = null;
        bitmap = null;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                try {
                    C19486a c19486aM174808b = m174808b(fileInputStream);
                    if (c19486aM174808b != null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(c19486aM174808b.f155145d);
                        fileInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length);
                        Bitmap.Config[] configArrValues = Bitmap.Config.values();
                        int i = c19486aM174808b.f155144c;
                        if (i < 0) {
                            i = 0;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c19486aM174808b.f155142a, c19486aM174808b.f155143b, configArrValues[i]);
                        byteBufferAllocate.position(0);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                        bitmap = bitmapCreateBitmap;
                    }
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m82479c(e);
                    if (fileInputStream != null) {
                    }
                    return bitmap;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e2) {
                        CrashHelper.m82479c(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
        try {
            fileInputStream.close();
        } catch (IOException e4) {
            CrashHelper.m82479c(e4);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: b */
    public static C19486a m174808b(FileInputStream fileInputStream) {
        try {
            byte[] bArr = new byte[20];
            fileInputStream.read(bArr);
            C19486a c19486a = new C19486a();
            c19486a.m174810b(bArr);
            int i = c19486a.f155145d;
            if (i != 0) {
                int i2 = c19486a.f155142a;
                int i3 = c19486a.f155143b;
                if (i != i2 * i3 * 4 || i2 < 0 || i3 < 0) {
                    return null;
                }
                return c19486a;
            }
            return null;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }
}
