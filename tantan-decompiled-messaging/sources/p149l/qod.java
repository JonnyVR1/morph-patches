package p149l;

import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.InterfaceC2066x;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class qod implements krv {

    /* JADX INFO: renamed from: b */
    public final bid f155551b;

    /* JADX INFO: renamed from: c */
    public final long f155552c;

    /* JADX INFO: renamed from: d */
    public final long f155553d;

    /* JADX INFO: renamed from: e */
    public final long f155554e;

    /* JADX INFO: renamed from: f */
    public final long f155555f;

    /* JADX INFO: renamed from: g */
    public final int f155556g;

    /* JADX INFO: renamed from: h */
    public final boolean f155557h;

    /* JADX INFO: renamed from: i */
    public final long f155558i;

    /* JADX INFO: renamed from: j */
    public final boolean f155559j;

    /* JADX INFO: renamed from: k */
    public int f155560k;

    /* JADX INFO: renamed from: l */
    public boolean f155561l;

    public qod(bid bidVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m175727l(i3, 0, "bufferForPlaybackMs", "0");
        m175727l(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m175727l(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m175727l(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m175727l(i2, i, "maxBufferMs", "minBufferMs");
        m175727l(i6, 0, "backBufferDurationMs", "0");
        this.f155551b = bidVar;
        this.f155552c = vck0.m197806J0(i);
        this.f155553d = vck0.m197806J0(i2);
        this.f155554e = vck0.m197806J0(i3);
        this.f155555f = vck0.m197806J0(i4);
        this.f155556g = i5;
        this.f155560k = i5 == -1 ? 13107200 : i5;
        this.f155557h = z;
        this.f155558i = vck0.m197806J0(i6);
        this.f155559j = z2;
    }

    /* JADX INFO: renamed from: l */
    public static void m175727l(int i, int i2, String str, String str2) {
        p11.m167008b(i >= i2, str + " cannot be less than " + str2);
    }

    /* JADX INFO: renamed from: n */
    public static int m175728n(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                x9g0.m207497a();
                return 0;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: a */
    public void mo147017a() {
        m175730o(false);
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: b */
    public boolean mo147018b() {
        return this.f155559j;
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: d */
    public void mo147020d() {
        m175730o(true);
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: e */
    public boolean mo147021e(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f155551b.m101999f() >= this.f155560k;
        long jMin = this.f155552c;
        if (f > 1.0f) {
            jMin = Math.min(vck0.m197849d0(jMin, f), this.f155553d);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.f155557h && z2) {
                z = false;
            }
            this.f155561l = z;
            if (!z && j2 < 500000) {
                jwv.m143689i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f155553d || z2) {
            this.f155561l = false;
        }
        return this.f155561l;
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: f */
    public void mo147022f(AbstractC1834c0 abstractC1834c0, ipx ipxVar, InterfaceC2066x[] interfaceC2066xArr, b6j0 b6j0Var, o8f[] o8fVarArr) {
        int iM175729m = this.f155556g;
        if (iM175729m == -1) {
            iM175729m = m175729m(interfaceC2066xArr, o8fVarArr);
        }
        this.f155560k = iM175729m;
        this.f155551b.m102001h(iM175729m);
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: g */
    public long mo147023g() {
        return this.f155558i;
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: i */
    public sj0 mo147025i() {
        return this.f155551b;
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: j */
    public void mo147026j() {
        m175730o(true);
    }

    @Override // p149l.krv
    /* JADX INFO: renamed from: k */
    public boolean mo147027k(AbstractC1834c0 abstractC1834c0, ipx ipxVar, long j, float f, boolean z, long j2) {
        long jM197864i0 = vck0.m197864i0(j, f);
        long jMin = z ? this.f155555f : this.f155554e;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || jM197864i0 >= jMin) {
            return true;
        }
        return !this.f155557h && this.f155551b.m101999f() >= this.f155560k;
    }

    /* JADX INFO: renamed from: m */
    public int m175729m(InterfaceC2066x[] interfaceC2066xArr, o8f[] o8fVarArr) {
        int iM175728n = 0;
        for (int i = 0; i < interfaceC2066xArr.length; i++) {
            if (o8fVarArr[i] != null) {
                iM175728n += m175728n(interfaceC2066xArr[i].getTrackType());
            }
        }
        return Math.max(13107200, iM175728n);
    }

    /* JADX INFO: renamed from: o */
    public final void m175730o(boolean z) {
        int i = this.f155556g;
        if (i == -1) {
            i = 13107200;
        }
        this.f155560k = i;
        this.f155561l = false;
        if (z) {
            this.f155551b.m102000g();
        }
    }

    public qod() {
        this(new bid(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }
}
