package p149l;

import com.google.android.gms.internal.ads.zzcc;
import io.agora.rtc2.Constants;
import java.math.RoundingMode;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class flr0 implements glr0 {

    /* JADX INFO: renamed from: m */
    public static final int[] f98205m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n */
    public static final int[] f98206n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 157, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 209, 230, 253, 279, HttpStatus.TEMPORARY_REDIRECT_307, 337, 371, HttpStatus.REQUEST_TIMEOUT_408, 449, 494, 544, 598, 658, Constants.AUDIO_MIXING_REASON_STOPPED_BY_USER, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a */
    public final m5r0 f98207a;

    /* JADX INFO: renamed from: b */
    public final m7r0 f98208b;

    /* JADX INFO: renamed from: c */
    public final jlr0 f98209c;

    /* JADX INFO: renamed from: d */
    public final int f98210d;

    /* JADX INFO: renamed from: e */
    public final byte[] f98211e;

    /* JADX INFO: renamed from: f */
    public final v6w0 f98212f;

    /* JADX INFO: renamed from: g */
    public final int f98213g;

    /* JADX INFO: renamed from: h */
    public final mhr0 f98214h;

    /* JADX INFO: renamed from: i */
    public int f98215i;

    /* JADX INFO: renamed from: j */
    public long f98216j;

    /* JADX INFO: renamed from: k */
    public int f98217k;

    /* JADX INFO: renamed from: l */
    public long f98218l;

    public flr0(m5r0 m5r0Var, m7r0 m7r0Var, jlr0 jlr0Var) throws zzcc {
        this.f98207a = m5r0Var;
        this.f98208b = m7r0Var;
        this.f98209c = jlr0Var;
        int iMax = Math.max(1, jlr0Var.f118561c / 10);
        this.f98213g = iMax;
        v6w0 v6w0Var = new v6w0(jlr0Var.f118564f);
        v6w0Var.m197277z();
        int iM197277z = v6w0Var.m197277z();
        this.f98210d = iM197277z;
        int i = jlr0Var.f118560b;
        int i2 = jlr0Var.f118562d;
        int i3 = (((i2 - (i * 4)) * 8) / (jlr0Var.f118563e * i)) + 1;
        if (iM197277z != i3) {
            throw zzcc.zza("Expected frames per block: " + i3 + "; got: " + iM197277z, null);
        }
        int i4 = ggw0.f102568a;
        int i5 = ((iMax + iM197277z) - 1) / iM197277z;
        this.f98211e = new byte[i2 * i5];
        this.f98212f = new v6w0(i5 * (iM197277z + iM197277z) * i);
        int i6 = ((jlr0Var.f118561c * jlr0Var.f118562d) * 8) / iM197277z;
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("audio/raw");
        ter0Var.m188603j0(i6);
        ter0Var.m188613r(i6);
        ter0Var.m188610o((iMax + iMax) * i);
        ter0Var.m188605k0(jlr0Var.f118560b);
        ter0Var.m188619x(jlr0Var.f118561c);
        ter0Var.m188612q(2);
        this.f98214h = ter0Var.m188591D();
    }

    @Override // p149l.glr0
    /* JADX INFO: renamed from: a */
    public final void mo122084a(long j) {
        this.f98215i = 0;
        this.f98216j = j;
        this.f98217k = 0;
        this.f98218l = 0L;
    }

    @Override // p149l.glr0
    /* JADX INFO: renamed from: b */
    public final void mo122085b(int i, long j) {
        this.f98207a.mo129455j(new mlr0(this.f98209c, this.f98210d, i, j));
        this.f98208b.mo134531d(this.f98214h);
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
    @Override // p149l.glr0
    /* JADX INFO: renamed from: c */
    public final boolean mo122086c(p149l.k5r0 r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.flr0.mo122086c(l.k5r0, long):boolean");
    }

    /* JADX INFO: renamed from: d */
    public final int m122087d(int i) {
        int i2 = this.f98209c.f118560b;
        return i / (i2 + i2);
    }

    /* JADX INFO: renamed from: e */
    public final int m122088e(int i) {
        return (i + i) * this.f98209c.f118560b;
    }

    /* JADX INFO: renamed from: f */
    public final void m122089f(int i) {
        long jM126051H = this.f98216j + ggw0.m126051H(this.f98218l, 1000000L, this.f98209c.f118561c, RoundingMode.FLOOR);
        int iM122088e = m122088e(i);
        this.f98208b.mo134530c(jM126051H, 1, iM122088e, this.f98217k - iM122088e, null);
        this.f98218l += (long) i;
        this.f98217k -= iM122088e;
    }
}
