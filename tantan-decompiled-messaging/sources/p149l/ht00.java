package p149l;

import android.graphics.Bitmap;
import com.tantanapp.common.utils.CrashHelper;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class ht00 {

    /* JADX INFO: renamed from: l.ht00$a */
    public static class C17388a {

        /* JADX INFO: renamed from: a */
        public int f109356a;

        /* JADX INFO: renamed from: b */
        public int f109357b;

        /* JADX INFO: renamed from: c */
        public int f109358c;

        /* JADX INFO: renamed from: d */
        public int f109359d;

        /* JADX INFO: renamed from: e */
        public int f109360e;

        /* JADX INFO: renamed from: a */
        public final int m132810a(byte[] bArr, int i) {
            int i2 = i * 4;
            return (bArr[i2 + 3] & 255) | ((bArr[i2 + 2] & 255) << 8) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24);
        }

        /* JADX INFO: renamed from: b */
        public void m132811b(byte[] bArr) {
            this.f109356a = m132810a(bArr, 0);
            this.f109357b = m132810a(bArr, 1);
            this.f109358c = m132810a(bArr, 2);
            this.f109359d = m132810a(bArr, 3);
            this.f109360e = m132810a(bArr, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static Bitmap m132808a(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        bitmap = null;
        bitmap = null;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                try {
                    C17388a c17388aM132809b = m132809b(fileInputStream);
                    if (c17388aM132809b != null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(c17388aM132809b.f109359d);
                        fileInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length);
                        Bitmap.Config[] configArrValues = Bitmap.Config.values();
                        int i = c17388aM132809b.f109358c;
                        if (i < 0) {
                            i = 0;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c17388aM132809b.f109356a, c17388aM132809b.f109357b, configArrValues[i]);
                        byteBufferAllocate.position(0);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                        bitmap = bitmapCreateBitmap;
                    }
                } catch (Exception e) {
                    e = e;
                    CrashHelper.m81296c(e);
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
                        CrashHelper.m81296c(e2);
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
            CrashHelper.m81296c(e4);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: b */
    public static C17388a m132809b(FileInputStream fileInputStream) {
        try {
            byte[] bArr = new byte[20];
            fileInputStream.read(bArr);
            C17388a c17388a = new C17388a();
            c17388a.m132811b(bArr);
            int i = c17388a.f109359d;
            if (i != 0) {
                int i2 = c17388a.f109356a;
                int i3 = c17388a.f109357b;
                if (i != i2 * i3 * 4 || i2 < 0 || i3 < 0) {
                    return null;
                }
                return c17388a;
            }
            return null;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }
}
