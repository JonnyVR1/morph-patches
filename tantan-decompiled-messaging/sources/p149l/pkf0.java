package p149l;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pkf0 {

    /* JADX INFO: renamed from: a */
    public static final Object f149980a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f149981b = new Object();

    /* JADX INFO: renamed from: c */
    @GuardedBy("valueLock")
    public static boolean f149982c = false;

    /* JADX INFO: renamed from: d */
    @GuardedBy("valueLock")
    public static long f149983d = 0;

    /* JADX INFO: renamed from: e */
    @GuardedBy("valueLock")
    public static String f149984e = "time.android.com";

    /* JADX INFO: renamed from: l.pkf0$b */
    public interface InterfaceC19257b {
        /* JADX INFO: renamed from: a */
        void mo11013a();

        /* JADX INFO: renamed from: b */
        void mo11014b(IOException iOException);
    }

    /* JADX INFO: renamed from: g */
    public static void m170037g(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            rhg0.m179353a("SNTP: Unsynchronized server");
            return;
        }
        if (b2 != 4 && b2 != 5) {
            juq0.m143339a("SNTP: Untrusted mode: ", b2);
            return;
        }
        if (i == 0 || i > 15) {
            juq0.m143339a("SNTP: Untrusted stratum: ", i);
        } else {
            if (j != 0) {
                return;
            }
            rhg0.m179353a("SNTP: Zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: h */
    public static long m170038h() {
        long j;
        synchronized (f149981b) {
            try {
                j = f149982c ? f149983d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: i */
    public static String m170039i() {
        String str;
        synchronized (f149981b) {
            str = f149984e;
        }
        return str;
    }

    /* JADX INFO: renamed from: j */
    public static void m170040j(@Nullable Loader loader, @Nullable InterfaceC19257b interfaceC19257b) {
        if (m170041k()) {
            if (interfaceC19257b != null) {
                interfaceC19257b.mo11013a();
            }
        } else {
            if (loader == null) {
                loader = new Loader("SntpClient");
            }
            loader.m12092n(new C19259d(), new C19258c(interfaceC19257b), 1);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m170041k() {
        boolean z;
        synchronized (f149981b) {
            z = f149982c;
        }
        return z;
    }

    /* JADX INFO: renamed from: l */
    public static long m170042l() throws IOException {
        InetAddress byName = InetAddress.getByName(m170039i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m170045o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b = bArr[0];
            int i = bArr[1] & 255;
            long jM170044n = m170044n(bArr, 24);
            long jM170044n2 = m170044n(bArr, 32);
            long jM170044n3 = m170044n(bArr, 40);
            m170037g((byte) ((b >> 6) & 3), (byte) (b & 7), i, jM170044n3);
            long j2 = (j + (((jM170044n2 - jM170044n) + (jM170044n3 - j)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j2;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m170043m(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX INFO: renamed from: n */
    public static long m170044n(byte[] bArr, int i) {
        long jM170043m = m170043m(bArr, i);
        long jM170043m2 = m170043m(bArr, i + 4);
        if (jM170043m == 0 && jM170043m2 == 0) {
            return 0L;
        }
        return ((jM170043m - 2208988800L) * 1000) + ((jM170043m2 * 1000) / 4294967296L);
    }

    /* JADX INFO: renamed from: o */
    public static void m170045o(byte[] bArr, int i, long j) {
        if (j == 0) {
            Arrays.fill(bArr, i, i + 8, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        bArr[i] = (byte) (j4 >> 24);
        bArr[i + 1] = (byte) (j4 >> 16);
        bArr[i + 2] = (byte) (j4 >> 8);
        bArr[i + 3] = (byte) j4;
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j5 >> 24);
        bArr[i + 5] = (byte) (j5 >> 16);
        bArr[i + 6] = (byte) (j5 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }

    /* JADX INFO: renamed from: l.pkf0$d */
    public static final class C19259d implements Loader.InterfaceC2044e {
        public C19259d() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: a */
        public void mo11377a() throws IOException {
            synchronized (pkf0.f149980a) {
                synchronized (pkf0.f149981b) {
                    if (pkf0.f149982c) {
                        return;
                    }
                    long jM170042l = pkf0.m170042l();
                    synchronized (pkf0.f149981b) {
                        long unused = pkf0.f149983d = jM170042l;
                        boolean unused2 = pkf0.f149982c = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
        /* JADX INFO: renamed from: c */
        public void mo11378c() {
        }
    }

    /* JADX INFO: renamed from: l.pkf0$c */
    public static final class C19258c implements Loader.InterfaceC2041b<Loader.InterfaceC2044e> {

        /* JADX INFO: renamed from: a */
        @Nullable
        public final InterfaceC19257b f149985a;

        public C19258c(@Nullable InterfaceC19257b interfaceC19257b) {
            this.f149985a = interfaceC19257b;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: o */
        public void mo11025o(Loader.InterfaceC2044e interfaceC2044e, long j, long j2) {
            if (this.f149985a != null) {
                boolean zM170041k = pkf0.m170041k();
                InterfaceC19257b interfaceC19257b = this.f149985a;
                if (zM170041k) {
                    interfaceC19257b.mo11013a();
                } else {
                    interfaceC19257b.mo11014b(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: q */
        public Loader.C2042c mo11026q(Loader.InterfaceC2044e interfaceC2044e, long j, long j2, IOException iOException, int i) {
            InterfaceC19257b interfaceC19257b = this.f149985a;
            if (interfaceC19257b != null) {
                interfaceC19257b.mo11014b(iOException);
            }
            return Loader.f9458f;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2041b
        /* JADX INFO: renamed from: n */
        public void mo11024n(Loader.InterfaceC2044e interfaceC2044e, long j, long j2, boolean z) {
        }
    }
}
