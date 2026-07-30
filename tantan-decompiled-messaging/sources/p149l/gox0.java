package p149l;

import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class gox0 implements k0y0 {

    /* JADX INFO: renamed from: a */
    public final wwy0 f103736a;

    /* JADX INFO: renamed from: b */
    public final long f103737b;

    /* JADX INFO: renamed from: c */
    public final long f103738c;

    /* JADX INFO: renamed from: d */
    public final long f103739d;

    /* JADX INFO: renamed from: e */
    public final long f103740e;

    /* JADX INFO: renamed from: f */
    public final long f103741f;

    /* JADX INFO: renamed from: g */
    public int f103742g;

    /* JADX INFO: renamed from: h */
    public boolean f103743h;

    public gox0() {
        wwy0 wwy0Var = new wwy0(true, 65536);
        m127306d(2500, 0, "bufferForPlaybackMs", "0");
        m127306d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m127306d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m127306d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m127306d(50000, 50000, "maxBufferMs", "minBufferMs");
        m127306d(0, 0, "backBufferDurationMs", "0");
        this.f103736a = wwy0Var;
        this.f103737b = ggw0.m126049F(50000L);
        this.f103738c = ggw0.m126049F(50000L);
        this.f103739d = ggw0.m126049F(2500L);
        this.f103740e = ggw0.m126049F(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f103742g = 13107200;
        this.f103741f = ggw0.m126049F(0L);
    }

    /* JADX INFO: renamed from: d */
    public static void m127306d(int i, int i2, String str, String str2) {
        f5v0.m119534e(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: a */
    public final void mo127307a(xqt0 xqt0Var, eqy0 eqy0Var, p5y0[] p5y0VarArr, kty0 kty0Var, hwy0[] hwy0VarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = p5y0VarArr.length;
            if (i >= 2) {
                int iMax = Math.max(13107200, i2);
                this.f103742g = iMax;
                this.f103736a.m205893f(iMax);
                return;
            } else {
                if (hwy0VarArr[i] != null) {
                    i2 += p5y0VarArr[i].mo146606c() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: b */
    public final boolean mo127308b(xqt0 xqt0Var, eqy0 eqy0Var, long j, float f, boolean z, long j2) {
        long jM126048E = ggw0.m126048E(j, f);
        long jMin = z ? this.f103740e : this.f103739d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jM126048E >= jMin || this.f103736a.m205888a() >= this.f103742g;
    }

    @Override // p149l.k0y0
    /* JADX INFO: renamed from: c */
    public final boolean mo127309c(long j, long j2, float f) {
        int iM205888a = this.f103736a.m205888a();
        int i = this.f103742g;
        long jMin = this.f103737b;
        if (f > 1.0f) {
            jMin = Math.min(ggw0.m126047D(jMin, f), this.f103738c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iM205888a < i;
            this.f103743h = z;
            if (!z && j2 < 500000) {
                svv0.m186111f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f103738c || iM205888a >= i) {
            this.f103743h = false;
        }
        return this.f103743h;
    }

    /* JADX INFO: renamed from: e */
    public final void m127310e(boolean z) {
        this.f103742g = 13107200;
        this.f103743h = false;
        if (z) {
            this.f103736a.m205892e();
        }
    }

    @Override // p149l.k0y0
    public final long zza() {
        return this.f103741f;
    }

    @Override // p149l.k0y0
    public final void zzb() {
        m127310e(false);
    }

    @Override // p149l.k0y0
    public final void zzc() {
        m127310e(true);
    }

    @Override // p149l.k0y0
    public final void zzd() {
        m127310e(true);
    }

    @Override // p149l.k0y0
    public final boolean zzf() {
        return false;
    }

    @Override // p149l.k0y0
    public final wwy0 zzi() {
        return this.f103736a;
    }
}
