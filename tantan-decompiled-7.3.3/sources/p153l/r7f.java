package p153l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class r7f {

    /* JADX INFO: renamed from: l.r7f$a */
    @RequiresApi(21)
    public static class C19785a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m180137a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static FileDescriptor m180138b(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static long m180139c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
            return Os.lseek(fileDescriptor, j, i);
        }
    }

    /* JADX INFO: renamed from: l.r7f$b */
    @RequiresApi(23)
    public static class C19786b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m180140a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m180129a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m180130b(FileDescriptor fileDescriptor) {
        try {
            C19785a.m180137a(fileDescriptor);
        } catch (Exception unused) {
            Log.e("ExifInterfaceUtils", "Error closing fd.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m180131c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static long[] m180132d(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: e */
    public static int m180133e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            i += i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m180134f(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                zpg0.m220844a("Failed to copy the given amount of bytes from the inputstream to the output stream.");
                return;
            } else {
                i -= i2;
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static long m180135g(String str) {
        try {
            int iMin = Math.min(str.length(), 3);
            long j = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j *= 10;
                iMin++;
            }
            return j;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m180136h(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
