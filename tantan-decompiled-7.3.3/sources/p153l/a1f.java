package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public class a1f {
    /* JADX INFO: renamed from: a */
    public static int m95484a(int i) {
        return ((i + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m95485b(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static RuntimeException m95486c(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static byte[] m95487d(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw m95486c("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static byte[] m95488e(@NonNull InputStream inputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw m95486c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw m95486c(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw m95486c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw m95486c("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m95489f(InputStream inputStream, int i) throws IOException {
        return new String(m95487d(inputStream, i), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    public static long m95490g(@NonNull InputStream inputStream, int i) throws IOException {
        byte[] bArrM95487d = m95487d(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM95487d[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static int m95491h(@NonNull InputStream inputStream) throws IOException {
        return (int) m95490g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    public static long m95492i(@NonNull InputStream inputStream) throws IOException {
        return m95490g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m95493j(@NonNull InputStream inputStream) throws IOException {
        return (int) m95490g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    public static int m95494k(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    public static void m95495l(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @Nullable FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            zpg0.m220844a("Unable to acquire a lock on the underlying file channel.");
            return;
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m95496m(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        m95500q(outputStream, bArr.length);
        byte[] bArrM95485b = m95485b(bArr);
        m95500q(outputStream, bArrM95485b.length);
        outputStream.write(bArrM95485b);
    }

    /* JADX INFO: renamed from: n */
    public static void m95497n(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    public static void m95498o(@NonNull OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static void m95499p(@NonNull OutputStream outputStream, int i) throws IOException {
        m95498o(outputStream, i, 2);
    }

    /* JADX INFO: renamed from: q */
    public static void m95500q(@NonNull OutputStream outputStream, long j) throws IOException {
        m95498o(outputStream, j, 4);
    }

    /* JADX INFO: renamed from: r */
    public static void m95501r(@NonNull OutputStream outputStream, int i) throws IOException {
        m95498o(outputStream, i, 1);
    }
}
