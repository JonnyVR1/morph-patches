package p007l;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class jgm {

    /* JADX INFO: renamed from: b */
    public static final byte[] f2982b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c */
    public static final int[] f2983c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a */
    public final InterfaceC0575b f2984a;

    /* JADX INFO: renamed from: l.jgm$a */
    public static class C0574a {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f2985a;

        public C0574a(byte[] bArr, int i) {
            this.f2985a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* JADX INFO: renamed from: a */
        public short m9528a(int i) {
            return this.f2985a.getShort(i);
        }

        /* JADX INFO: renamed from: b */
        public int m9529b(int i) {
            return this.f2985a.getInt(i);
        }

        /* JADX INFO: renamed from: c */
        public int m9530c() {
            return this.f2985a.remaining();
        }

        /* JADX INFO: renamed from: d */
        public void m9531d(ByteOrder byteOrder) {
            this.f2985a.order(byteOrder);
        }
    }

    /* JADX INFO: renamed from: l.jgm$b */
    public interface InterfaceC0575b {
        /* JADX INFO: renamed from: a */
        int mo9532a() throws IOException;

        /* JADX INFO: renamed from: b */
        short mo9533b() throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: l.jgm$c */
    public static class C0576c implements InterfaceC0575b {

        /* JADX INFO: renamed from: a */
        public final InputStream f2986a;

        public C0576c(InputStream inputStream) {
            this.f2986a = inputStream;
        }

        @Override // p007l.jgm.InterfaceC0575b
        /* JADX INFO: renamed from: a */
        public int mo9532a() throws IOException {
            return (this.f2986a.read() & 255) | ((this.f2986a.read() << 8) & 65280);
        }

        @Override // p007l.jgm.InterfaceC0575b
        /* JADX INFO: renamed from: b */
        public short mo9533b() throws IOException {
            return (short) (this.f2986a.read() & 255);
        }

        @Override // p007l.jgm.InterfaceC0575b
        public int read(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int i3 = this.f2986a.read(bArr, i - i2, i2);
                if (i3 == -1) {
                    break;
                }
                i2 -= i3;
            }
            return i - i2;
        }

        @Override // p007l.jgm.InterfaceC0575b
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f2986a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f2986a.read() == -1) {
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
        this.f2984a = new C0576c(inputStream);
    }

    /* JADX INFO: renamed from: a */
    public static int m9521a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9522c(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* JADX INFO: renamed from: f */
    public static int m9523f(C0574a c0574a) {
        ByteOrder byteOrder;
        short sM9528a = c0574a.m9528a(6);
        if (sM9528a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sM9528a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            Log.isLoggable("ImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c0574a.m9531d(byteOrder);
        int iM9529b = c0574a.m9529b(10) + 6;
        short sM9528a2 = c0574a.m9528a(iM9529b);
        for (int i = 0; i < sM9528a2; i++) {
            int iM9521a = m9521a(iM9529b, i);
            if (c0574a.m9528a(iM9521a) == 274) {
                short sM9528a3 = c0574a.m9528a(iM9521a + 2);
                if (sM9528a3 < 1 || sM9528a3 > 12) {
                    Log.isLoggable("ImageHeaderParser", 3);
                } else {
                    int iM9529b2 = c0574a.m9529b(iM9521a + 4);
                    if (iM9529b2 < 0) {
                        Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("ImageHeaderParser", 3);
                        int i2 = iM9529b2 + f2983c[sM9528a3];
                        if (i2 > 4) {
                            Log.isLoggable("ImageHeaderParser", 3);
                        } else {
                            int i3 = iM9521a + 8;
                            if (i3 < 0 || i3 > c0574a.m9530c()) {
                                Log.isLoggable("ImageHeaderParser", 3);
                            } else {
                                if (i2 >= 0 && i2 + i3 <= c0574a.m9530c()) {
                                    return c0574a.m9528a(i3);
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
    public int m9524b() throws IOException {
        if (!m9522c(this.f2984a.mo9532a())) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        int iM9526e = m9526e();
        if (iM9526e != -1) {
            return m9527g(new byte[iM9526e], iM9526e);
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9525d(byte[] bArr, int i) {
        boolean z = bArr != null && i > f2982b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f2982b;
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
    public final int m9526e() throws IOException {
        while (this.f2984a.mo9533b() == 255) {
            short sMo9533b = this.f2984a.mo9533b();
            if (sMo9533b == 218) {
                return -1;
            }
            if (sMo9533b == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            int iMo9532a = this.f2984a.mo9532a() - 2;
            if (sMo9533b == 225) {
                return iMo9532a;
            }
            long j = iMo9532a;
            if (this.f2984a.skip(j) != j) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final int m9527g(byte[] bArr, int i) throws IOException {
        if (this.f2984a.read(bArr, i) != i) {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
        if (m9525d(bArr, i)) {
            return m9523f(new C0574a(bArr, i));
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }
}
