package p153l;

import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.InterfaceC2089x;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class vpd implements ltv {

    /* JADX INFO: renamed from: b */
    public final hjd f185228b;

    /* JADX INFO: renamed from: c */
    public final long f185229c;

    /* JADX INFO: renamed from: d */
    public final long f185230d;

    /* JADX INFO: renamed from: e */
    public final long f185231e;

    /* JADX INFO: renamed from: f */
    public final long f185232f;

    /* JADX INFO: renamed from: g */
    public final int f185233g;

    /* JADX INFO: renamed from: h */
    public final boolean f185234h;

    /* JADX INFO: renamed from: i */
    public final long f185235i;

    /* JADX INFO: renamed from: j */
    public final boolean f185236j;

    /* JADX INFO: renamed from: k */
    public int f185237k;

    /* JADX INFO: renamed from: l */
    public boolean f185238l;

    public vpd(hjd hjdVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        m202224l(i3, 0, "bufferForPlaybackMs", "0");
        m202224l(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m202224l(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m202224l(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m202224l(i2, i, "maxBufferMs", "minBufferMs");
        m202224l(i6, 0, "backBufferDurationMs", "0");
        this.f185228b = hjdVar;
        this.f185229c = bmk0.m105084J0(i);
        this.f185230d = bmk0.m105084J0(i2);
        this.f185231e = bmk0.m105084J0(i3);
        this.f185232f = bmk0.m105084J0(i4);
        this.f185233g = i5;
        this.f185237k = i5 == -1 ? 13107200 : i5;
        this.f185234h = z;
        this.f185235i = bmk0.m105084J0(i6);
        this.f185236j = z2;
    }

    /* JADX INFO: renamed from: l */
    public static void m202224l(int i, int i2, String str, String str2) {
        w11.m204366b(i >= i2, str + " cannot be less than " + str2);
    }

    /* JADX INFO: renamed from: n */
    public static int m202225n(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                fig0.m125680a();
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

    @Override // p153l.ltv
    /* JADX INFO: renamed from: a */
    public void mo155813a() {
        m202227o(false);
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: b */
    public boolean mo155814b() {
        return this.f185236j;
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: d */
    public void mo155816d() {
        m202227o(true);
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: e */
    public boolean mo155817e(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = this.f185228b.m135332f() >= this.f185237k;
        long jMin = this.f185229c;
        if (f > 1.0f) {
            jMin = Math.min(bmk0.m105127d0(jMin, f), this.f185230d);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            if (!this.f185234h && z2) {
                z = false;
            }
            this.f185238l = z;
            if (!z && j2 < 500000) {
                kyv.m152151i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f185230d || z2) {
            this.f185238l = false;
        }
        return this.f185238l;
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: f */
    public void mo155818f(AbstractC1857c0 abstractC1857c0, fyx fyxVar, InterfaceC2089x[] interfaceC2089xArr, ffj0 ffj0Var, u9f[] u9fVarArr) {
        int iM202226m = this.f185233g;
        if (iM202226m == -1) {
            iM202226m = m202226m(interfaceC2089xArr, u9fVarArr);
        }
        this.f185237k = iM202226m;
        this.f185228b.m135334h(iM202226m);
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: g */
    public long mo155819g() {
        return this.f185235i;
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: i */
    public oj0 mo155821i() {
        return this.f185228b;
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: j */
    public void mo155822j() {
        m202227o(true);
    }

    @Override // p153l.ltv
    /* JADX INFO: renamed from: k */
    public boolean mo155823k(AbstractC1857c0 abstractC1857c0, fyx fyxVar, long j, float f, boolean z, long j2) {
        long jM105142i0 = bmk0.m105142i0(j, f);
        long jMin = z ? this.f185232f : this.f185231e;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin <= 0 || jM105142i0 >= jMin) {
            return true;
        }
        return !this.f185234h && this.f185228b.m135332f() >= this.f185237k;
    }

    /* JADX INFO: renamed from: m */
    public int m202226m(InterfaceC2089x[] interfaceC2089xArr, u9f[] u9fVarArr) {
        int iM202225n = 0;
        for (int i = 0; i < interfaceC2089xArr.length; i++) {
            if (u9fVarArr[i] != null) {
                iM202225n += m202225n(interfaceC2089xArr[i].getTrackType());
            }
        }
        return Math.max(13107200, iM202225n);
    }

    /* JADX INFO: renamed from: o */
    public final void m202227o(boolean z) {
        int i = this.f185233g;
        if (i == -1) {
            i = 13107200;
        }
        this.f185237k = i;
        this.f185238l = false;
        if (z) {
            this.f185228b.m135333g();
        }
    }

    public vpd() {
        this(new hjd(true, 65536), SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, 5000, -1, false, 0, false);
    }
}
