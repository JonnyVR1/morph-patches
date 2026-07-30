package p153l;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public class mim {

    /* JADX INFO: renamed from: b */
    public static final byte[] f136988b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f136989c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a */
    public final InterfaceC18621b f136990a;

    /* JADX INFO: renamed from: l.mim$a */
    public static class C18620a {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f136991a;

        public C18620a(byte[] bArr, int i) {
            this.f136991a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: a */
        public short m158516a(int i) {
            return this.f136991a.getShort(i);
        }

        /* JADX INFO: renamed from: b */
        public int m158517b(int i) {
            return this.f136991a.getInt(i);
        }

        /* JADX INFO: renamed from: c */
        public int m158518c() {
            return this.f136991a.remaining();
        }

        /* JADX INFO: renamed from: d */
        public void m158519d(ByteOrder byteOrder) {
            this.f136991a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: l.mim$b */
    public interface InterfaceC18621b {
        /* JADX INFO: renamed from: a */
        int mo158520a() throws IOException;

        /* JADX INFO: renamed from: b */
        short mo158521b() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: l.mim$c */
    public static class C18622c implements InterfaceC18621b {

        /* JADX INFO: renamed from: a */
        public final InputStream f136992a;

        public C18622c(InputStream inputStream) {
            this.f136992a = inputStream;
        }

        @Override // p153l.mim.InterfaceC18621b
        /* JADX INFO: renamed from: a */
        public int mo158520a() throws IOException {
            return (this.f136992a.read() & 255) | ((this.f136992a.read() << 8) & 65280);
        }

        @Override // p153l.mim.InterfaceC18621b
        /* JADX INFO: renamed from: b */
        public short mo158521b() throws IOException {
            return (short) (this.f136992a.read() & 255);
        }

        @Override // p153l.mim.InterfaceC18621b
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.f136992a.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // p153l.mim.InterfaceC18621b
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f136992a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f136992a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    public mim(InputStream inputStream) {
        this.f136990a = new C18622c(inputStream);
    }

    /* JADX INFO: renamed from: a */
    public static int m158509a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m158510c(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX INFO: renamed from: f */
    public static int m158511f(C18620a c18620a) {
        ByteOrder byteOrder;
        short sM158516a = c18620a.m158516a(6);
        if (sM158516a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sM158516a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            Log.isLoggable("ImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c18620a.m158519d(byteOrder);
        int iM158517b = c18620a.m158517b(10) + 6;
        short sM158516a2 = c18620a.m158516a(iM158517b);
        for (int i = 0; i < sM158516a2; i++) {
            int iM158509a = m158509a(iM158517b, i);
            if (c18620a.m158516a(iM158509a) == 274) {
                short sM158516a3 = c18620a.m158516a(iM158509a + 2);
                if (sM158516a3 < 1 || sM158516a3 > 12) {
                    Log.isLoggable("ImageHeaderParser", 3);
                } else {
                    int iM158517b2 = c18620a.m158517b(iM158509a + 4);
                    if (iM158517b2 < 0) {
                        Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("ImageHeaderParser", 3);
                        int i2 = iM158517b2 + f136989c[sM158516a3];
                        if (i2 > 4) {
                            Log.isLoggable("ImageHeaderParser", 3);
                        } else {
                            int i3 = iM158509a + 8;
                            if (i3 < 0 || i3 > c18620a.m158518c()) {
                                Log.isLoggable("ImageHeaderParser", 3);
                            } else {
                                if (i2 >= 0 && i2 + i3 <= c18620a.m158518c()) {
                                    return c18620a.m158516a(i3);
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
    public int m158512b() throws IOException {
        if (!m158510c(this.f136990a.mo158520a())) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        int iM158514e = m158514e();
        if (iM158514e != -1) {
            return m158515g(new byte[iM158514e], iM158514e);
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m158513d(byte[] bArr, int i) {
        boolean z = bArr != null && i > f136988b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f136988b;
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
    public final int m158514e() throws IOException {
        while (this.f136990a.mo158521b() == 255) {
            short sMo158521b = this.f136990a.mo158521b();
            if (sMo158521b == 218) {
                return -1;
            }
            if (sMo158521b == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            int iMo158520a = this.f136990a.mo158520a() - 2;
            if (sMo158521b == 225) {
                return iMo158520a;
            }
            long j = iMo158520a;
            if (this.f136990a.skip(j) != j) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m158515g(byte[] bArr, int i) throws IOException {
        if (this.f136990a.read(bArr, i) != i) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        if (m158513d(bArr, i)) {
            return m158511f(new C18620a(bArr, i));
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }
}
