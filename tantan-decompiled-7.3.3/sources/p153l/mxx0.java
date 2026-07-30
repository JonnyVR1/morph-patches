package p153l;

import com.clevertap.android.sdk.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public final class mxx0 implements q9y0 {

    /* JADX INFO: renamed from: a */
    public final c6z0 f139294a;

    /* JADX INFO: renamed from: b */
    public final long f139295b;

    /* JADX INFO: renamed from: c */
    public final long f139296c;

    /* JADX INFO: renamed from: d */
    public final long f139297d;

    /* JADX INFO: renamed from: e */
    public final long f139298e;

    /* JADX INFO: renamed from: f */
    public final long f139299f;

    /* JADX INFO: renamed from: g */
    public int f139300g;

    /* JADX INFO: renamed from: h */
    public boolean f139301h;

    public mxx0() {
        c6z0 c6z0Var = new c6z0(true, 65536);
        m160707d(2500, 0, "bufferForPlaybackMs", "0");
        m160707d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m160707d(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, "minBufferMs", "bufferForPlaybackMs");
        m160707d(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m160707d(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, "maxBufferMs", "minBufferMs");
        m160707d(0, 0, "backBufferDurationMs", "0");
        this.f139294a = c6z0Var;
        this.f139295b = mpw0.m159393F(50000L);
        this.f139296c = mpw0.m159393F(50000L);
        this.f139297d = mpw0.m159393F(2500L);
        this.f139298e = mpw0.m159393F(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        this.f139300g = 13107200;
        this.f139299f = mpw0.m159393F(0L);
    }

    /* JADX INFO: renamed from: d */
    public static void m160707d(int i, int i2, String str, String str2) {
        lev0.m153957e(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: a */
    public final void mo160708a(d0u0 d0u0Var, kzy0 kzy0Var, vey0[] vey0VarArr, q2z0 q2z0Var, n5z0[] n5z0VarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = vey0VarArr.length;
            if (i >= 2) {
                int iMax = Math.max(13107200, i2);
                this.f139300g = iMax;
                this.f139294a.m108199f(iMax);
                return;
            } else {
                if (n5z0VarArr[i] != null) {
                    i2 += vey0VarArr[i].mo97570c() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: b */
    public final boolean mo160709b(d0u0 d0u0Var, kzy0 kzy0Var, long j, float f, boolean z, long j2) {
        long jM159392E = mpw0.m159392E(j, f);
        long jMin = z ? this.f139298e : this.f139297d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jM159392E >= jMin || this.f139294a.m108194a() >= this.f139300g;
    }

    @Override // p153l.q9y0
    /* JADX INFO: renamed from: c */
    public final boolean mo160710c(long j, long j2, float f) {
        int iM108194a = this.f139294a.m108194a();
        int i = this.f139300g;
        long jMin = this.f139295b;
        if (f > 1.0f) {
            jMin = Math.min(mpw0.m159391D(jMin, f), this.f139296c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iM108194a < i;
            this.f139301h = z;
            if (!z && j2 < 500000) {
                y4w0.m214278f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f139296c || iM108194a >= i) {
            this.f139301h = false;
        }
        return this.f139301h;
    }

    /* JADX INFO: renamed from: e */
    public final void m160711e(boolean z) {
        this.f139300g = 13107200;
        this.f139301h = false;
        if (z) {
            this.f139294a.m108198e();
        }
    }

    @Override // p153l.q9y0
    public final long zza() {
        return this.f139299f;
    }

    @Override // p153l.q9y0
    public final void zzb() {
        m160711e(false);
    }

    @Override // p153l.q9y0
    public final void zzc() {
        m160711e(true);
    }

    @Override // p153l.q9y0
    public final void zzd() {
        m160711e(true);
    }

    @Override // p153l.q9y0
    public final boolean zzf() {
        return false;
    }

    @Override // p153l.q9y0
    public final c6z0 zzi() {
        return this.f139294a;
    }
}
