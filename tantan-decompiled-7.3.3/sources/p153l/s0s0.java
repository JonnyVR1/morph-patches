package p153l;

import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.C2263s;
import com.google.android.gms.internal.ads.zzgyl;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class s0s0 {

    /* JADX INFO: renamed from: a */
    public static boolean f165725a = false;

    /* JADX INFO: renamed from: b */
    public static MessageDigest f165726b;

    /* JADX INFO: renamed from: c */
    public static final Object f165727c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f165728d = new Object();

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch f165729e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public static String m183971a(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrM183977g;
        Vector vectorM183972b = m183972b(bArr, 255);
        if (vectorM183972b == null || vectorM183972b.isEmpty()) {
            bArrM183977g = m183977g(m183976f(4096).m12798h(), str, true);
        } else {
            l0s0 l0s0VarM13300L = C2263s.m13300L();
            int size = vectorM183972b.size();
            for (int i = 0; i < size; i++) {
                l0s0VarM13300L.m152373q(zzgyl.zzv(m183977g((byte[]) vectorM183972b.get(i), str, false), 0, 256));
            }
            byte[] bArrM183975e = m183975e(bArr);
            zzgyl zzgylVar = zzgyl.zzb;
            l0s0VarM13300L.m152374r(zzgyl.zzv(bArrM183975e, 0, bArrM183975e.length));
            bArrM183977g = ((C2263s) l0s0VarM13300L.m185950m()).m12798h();
        }
        return o0s0.m165547a(bArrM183977g, true);
    }

    /* JADX INFO: renamed from: b */
    public static Vector m183972b(byte[] bArr, int i) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    /* JADX INFO: renamed from: d */
    public static void m183974d() {
        synchronized (f165728d) {
            try {
                if (!f165725a) {
                    f165725a = true;
                    new Thread(new r0s0(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m183975e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f165727c) {
            try {
                m183974d();
                MessageDigest messageDigest2 = null;
                try {
                    if (f165729e.await(2L, TimeUnit.SECONDS) && (messageDigest = f165726b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f165726b.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: f */
    public static C2223n m183976f(int i) {
        fzr0 fzr0VarM13037l0 = C2223n.m13037l0();
        fzr0VarM13037l0.m128321t(4096L);
        return (C2223n) fzr0VarM13037l0.m185950m();
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m183977g(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = m183976f(4096).m12798h();
        }
        int i2 = i + 1;
        int length2 = bArr.length;
        byte b = (byte) length2;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i2).put(b).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m183975e(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        t0s0[] t0s0VarArr = new a2s0().f68053G2;
        int length3 = t0s0VarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            t0s0VarArr[i3].mo113632a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new m0s0(str.getBytes("UTF-8")).m156533a(bArr3);
        }
        return bArr3;
    }
}
