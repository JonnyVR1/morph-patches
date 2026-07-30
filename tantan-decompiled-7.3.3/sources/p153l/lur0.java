package p153l;

import com.google.android.gms.internal.ads.zzcc;
import io.agora.rtc2.Constants;
import java.math.RoundingMode;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class lur0 implements mur0 {

    /* JADX INFO: renamed from: m */
    public static final int[] f133639m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f133640n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 157, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 209, 230, 253, 279, HttpStatus.TEMPORARY_REDIRECT_307, 337, 371, HttpStatus.REQUEST_TIMEOUT_408, 449, 494, 544, 598, 658, Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final ser0 f133641a;

    /* JADX INFO: renamed from: b */
    public final sgr0 f133642b;

    /* JADX INFO: renamed from: c */
    public final pur0 f133643c;

    /* JADX INFO: renamed from: d */
    public final int f133644d;

    /* JADX INFO: renamed from: e */
    public final byte[] f133645e;

    /* JADX INFO: renamed from: f */
    public final bgw0 f133646f;

    /* JADX INFO: renamed from: g */
    public final int f133647g;

    /* JADX INFO: renamed from: h */
    public final sqr0 f133648h;

    /* JADX INFO: renamed from: i */
    public int f133649i;

    /* JADX INFO: renamed from: j */
    public long f133650j;

    /* JADX INFO: renamed from: k */
    public int f133651k;

    /* JADX INFO: renamed from: l */
    public long f133652l;

    public lur0(ser0 ser0Var, sgr0 sgr0Var, pur0 pur0Var) throws zzcc {
        this.f133641a = ser0Var;
        this.f133642b = sgr0Var;
        this.f133643c = pur0Var;
        int iMax = Math.max(1, pur0Var.f154218c / 10);
        this.f133647g = iMax;
        bgw0 bgw0Var = new bgw0(pur0Var.f154221f);
        bgw0Var.m104284z();
        int iM104284z = bgw0Var.m104284z();
        this.f133644d = iM104284z;
        int i = pur0Var.f154217b;
        int i2 = pur0Var.f154219d;
        int i3 = (((i2 - (i * 4)) * 8) / (pur0Var.f154220e * i)) + 1;
        if (iM104284z != i3) {
            throw zzcc.zza("Expected frames per block: " + i3 + "; got: " + iM104284z, null);
        }
        int i4 = mpw0.f137957a;
        int i5 = ((iMax + iM104284z) - 1) / iM104284z;
        this.f133645e = new byte[i2 * i5];
        this.f133646f = new bgw0(i5 * (iM104284z + iM104284z) * i);
        int i6 = ((pur0Var.f154218c * pur0Var.f154219d) * 8) / iM104284z;
        znr0 znr0Var = new znr0();
        znr0Var.m220672w("audio/raw");
        znr0Var.m220657j0(i6);
        znr0Var.m220667r(i6);
        znr0Var.m220664o((iMax + iMax) * i);
        znr0Var.m220659k0(pur0Var.f154217b);
        znr0Var.m220673x(pur0Var.f154218c);
        znr0Var.m220666q(2);
        this.f133648h = znr0Var.m220645D();
    }

    @Override // p153l.mur0
    /* JADX INFO: renamed from: a */
    public final void mo155962a(long j) {
        this.f133649i = 0;
        this.f133650j = j;
        this.f133651k = 0;
        this.f133652l = 0L;
    }

    @Override // p153l.mur0
    /* JADX INFO: renamed from: b */
    public final void mo155963b(int i, long j) {
        this.f133641a.mo101551j(new sur0(this.f133643c, this.f133644d, i, j));
        this.f133642b.mo99373d(this.f133648h);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[LOOP:0: B:6:0x0023->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p153l.mur0
    /* JADX INFO: renamed from: c */
    public final boolean mo155964c(p153l.qer0 r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.lur0.mo155964c(l.qer0, long):boolean");
    }

    /* JADX INFO: renamed from: d */
    public final int m155965d(int i) {
        int i2 = this.f133643c.f154217b;
        return i / (i2 + i2);
    }

    /* JADX INFO: renamed from: e */
    public final int m155966e(int i) {
        return (i + i) * this.f133643c.f154217b;
    }

    /* JADX INFO: renamed from: f */
    public final void m155967f(int i) {
        long jM159395H = this.f133650j + mpw0.m159395H(this.f133652l, 1000000L, this.f133643c.f154218c, RoundingMode.FLOOR);
        int iM155966e = m155966e(i);
        this.f133642b.mo99372c(jM159395H, 1, iM155966e, this.f133651k - iM155966e, null);
        this.f133652l += (long) i;
        this.f133651k -= iM155966e;
    }
}
