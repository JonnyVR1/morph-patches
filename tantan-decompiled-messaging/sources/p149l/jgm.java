package p149l;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public class jgm {

    /* JADX INFO: renamed from: b */
    public static final byte[] f117803b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f117804c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a */
    public final InterfaceC17767b f117805a;

    /* JADX INFO: renamed from: l.jgm$a */
    public static class C17766a {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f117806a;

        public C17766a(byte[] bArr, int i) {
            this.f117806a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: a */
        public short m141319a(int i) {
            return this.f117806a.getShort(i);
        }

        /* JADX INFO: renamed from: b */
        public int m141320b(int i) {
            return this.f117806a.getInt(i);
        }

        /* JADX INFO: renamed from: c */
        public int m141321c() {
            return this.f117806a.remaining();
        }

        /* JADX INFO: renamed from: d */
        public void m141322d(ByteOrder byteOrder) {
            this.f117806a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: l.jgm$b */
    public interface InterfaceC17767b {
        /* JADX INFO: renamed from: a */
        int mo141323a() throws IOException;

        /* JADX INFO: renamed from: b */
        short mo141324b() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: l.jgm$c */
    public static class C17768c implements InterfaceC17767b {

        /* JADX INFO: renamed from: a */
        public final InputStream f117807a;

        public C17768c(InputStream inputStream) {
            this.f117807a = inputStream;
        }

        @Override // p149l.jgm.InterfaceC17767b
        /* JADX INFO: renamed from: a */
        public int mo141323a() throws IOException {
            return (this.f117807a.read() & 255) | ((this.f117807a.read() << 8) & 65280);
        }

        @Override // p149l.jgm.InterfaceC17767b
        /* JADX INFO: renamed from: b */
        public short mo141324b() throws IOException {
            return (short) (this.f117807a.read() & 255);
        }

        @Override // p149l.jgm.InterfaceC17767b
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.f117807a.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // p149l.jgm.InterfaceC17767b
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f117807a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f117807a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    public jgm(InputStream inputStream) {
        this.f117805a = new C17768c(inputStream);
    }

    /* JADX INFO: renamed from: a */
    public static int m141312a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m141313c(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX INFO: renamed from: f */
    public static int m141314f(C17766a c17766a) {
        ByteOrder byteOrder;
        short sM141319a = c17766a.m141319a(6);
        if (sM141319a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sM141319a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            Log.isLoggable("ImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c17766a.m141322d(byteOrder);
        int iM141320b = c17766a.m141320b(10) + 6;
        short sM141319a2 = c17766a.m141319a(iM141320b);
        for (int i = 0; i < sM141319a2; i++) {
            int iM141312a = m141312a(iM141320b, i);
            if (c17766a.m141319a(iM141312a) == 274) {
                short sM141319a3 = c17766a.m141319a(iM141312a + 2);
                if (sM141319a3 < 1 || sM141319a3 > 12) {
                    Log.isLoggable("ImageHeaderParser", 3);
                } else {
                    int iM141320b2 = c17766a.m141320b(iM141312a + 4);
                    if (iM141320b2 < 0) {
                        Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("ImageHeaderParser", 3);
                        int i2 = iM141320b2 + f117804c[sM141319a3];
                        if (i2 > 4) {
                            Log.isLoggable("ImageHeaderParser", 3);
                        } else {
                            int i3 = iM141312a + 8;
                            if (i3 < 0 || i3 > c17766a.m141321c()) {
                                Log.isLoggable("ImageHeaderParser", 3);
                            } else {
                                if (i2 >= 0 && i2 + i3 <= c17766a.m141321c()) {
                                    return c17766a.m141319a(i3);
                                }
                                Log.isLoggable("ImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public int m141315b() throws IOException {
        if (!m141313c(this.f117805a.mo141323a())) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        int iM141317e = m141317e();
        if (iM141317e != -1) {
            return m141318g(new byte[iM141317e], iM141317e);
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m141316d(byte[] bArr, int i) {
        boolean z = bArr != null && i > f117803b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f117803b;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final int m141317e() throws IOException {
        while (this.f117805a.mo141324b() == 255) {
            short sMo141324b = this.f117805a.mo141324b();
            if (sMo141324b == 218) {
                return -1;
            }
            if (sMo141324b == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            int iMo141323a = this.f117805a.mo141323a() - 2;
            if (sMo141324b == 225) {
                return iMo141323a;
            }
            long j = iMo141323a;
            if (this.f117805a.skip(j) != j) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m141318g(byte[] bArr, int i) throws IOException {
        if (this.f117805a.read(bArr, i) != i) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        if (m141316d(bArr, i)) {
            return m141314f(new C17766a(bArr, i));
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }
}
