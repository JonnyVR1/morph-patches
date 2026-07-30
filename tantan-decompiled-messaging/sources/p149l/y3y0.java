package p149l;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class y3y0 {

    /* JADX INFO: renamed from: t */
    public static final eqy0 f195862t = new eqy0(new Object(), -1);

    /* JADX INFO: renamed from: a */
    public final xqt0 f195863a;

    /* JADX INFO: renamed from: b */
    public final eqy0 f195864b;

    /* JADX INFO: renamed from: c */
    public final long f195865c;

    /* JADX INFO: renamed from: d */
    public final long f195866d;

    /* JADX INFO: renamed from: e */
    public final int f195867e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final zziz f195868f;

    /* JADX INFO: renamed from: g */
    public final boolean f195869g;

    /* JADX INFO: renamed from: h */
    public final kty0 f195870h;

    /* JADX INFO: renamed from: i */
    public final owy0 f195871i;

    /* JADX INFO: renamed from: j */
    public final List f195872j;

    /* JADX INFO: renamed from: k */
    public final eqy0 f195873k;

    /* JADX INFO: renamed from: l */
    public final boolean f195874l;

    /* JADX INFO: renamed from: m */
    public final int f195875m;

    /* JADX INFO: renamed from: n */
    public final c5t0 f195876n;

    /* JADX INFO: renamed from: o */
    public final boolean f195877o = false;

    /* JADX INFO: renamed from: p */
    public volatile long f195878p;

    /* JADX INFO: renamed from: q */
    public volatile long f195879q;

    /* JADX INFO: renamed from: r */
    public volatile long f195880r;

    /* JADX INFO: renamed from: s */
    public volatile long f195881s;

    public y3y0(xqt0 xqt0Var, eqy0 eqy0Var, long j, long j2, int i, @Nullable zziz zzizVar, boolean z, kty0 kty0Var, owy0 owy0Var, List list, eqy0 eqy0Var2, boolean z2, int i2, c5t0 c5t0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.f195863a = xqt0Var;
        this.f195864b = eqy0Var;
        this.f195865c = j;
        this.f195866d = j2;
        this.f195867e = i;
        this.f195868f = zzizVar;
        this.f195869g = z;
        this.f195870h = kty0Var;
        this.f195871i = owy0Var;
        this.f195872j = list;
        this.f195873k = eqy0Var2;
        this.f195874l = z2;
        this.f195875m = i2;
        this.f195876n = c5t0Var;
        this.f195878p = j3;
        this.f195879q = j4;
        this.f195880r = j5;
        this.f195881s = j6;
    }

    /* JADX INFO: renamed from: g */
    public static y3y0 m212864g(owy0 owy0Var) {
        xqt0 xqt0Var = xqt0.f194042a;
        eqy0 eqy0Var = f195862t;
        return new y3y0(xqt0Var, eqy0Var, -9223372036854775807L, 0L, 1, null, false, kty0.f124626d, owy0Var, zzgaa.zzl(), eqy0Var, false, 0, c5t0.f79412d, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: h */
    public static eqy0 m212865h() {
        return f195862t;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final y3y0 m212866a(eqy0 eqy0Var) {
        return new y3y0(this.f195863a, this.f195864b, this.f195865c, this.f195866d, this.f195867e, this.f195868f, this.f195869g, this.f195870h, this.f195871i, this.f195872j, eqy0Var, this.f195874l, this.f195875m, this.f195876n, this.f195878p, this.f195879q, this.f195880r, this.f195881s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public final y3y0 m212867b(eqy0 eqy0Var, long j, long j2, long j3, long j4, kty0 kty0Var, owy0 owy0Var, List list) {
        eqy0 eqy0Var2 = this.f195873k;
        boolean z = this.f195874l;
        int i = this.f195875m;
        c5t0 c5t0Var = this.f195876n;
        long j5 = this.f195878p;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new y3y0(this.f195863a, eqy0Var, j2, j3, this.f195867e, this.f195868f, this.f195869g, kty0Var, owy0Var, list, eqy0Var2, z, i, c5t0Var, j5, j4, j, jElapsedRealtime, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public final y3y0 m212868c(boolean z, int i) {
        return new y3y0(this.f195863a, this.f195864b, this.f195865c, this.f195866d, this.f195867e, this.f195868f, this.f195869g, this.f195870h, this.f195871i, this.f195872j, this.f195873k, z, i, this.f195876n, this.f195878p, this.f195879q, this.f195880r, this.f195881s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public final y3y0 m212869d(@Nullable zziz zzizVar) {
        return new y3y0(this.f195863a, this.f195864b, this.f195865c, this.f195866d, this.f195867e, zzizVar, this.f195869g, this.f195870h, this.f195871i, this.f195872j, this.f195873k, this.f195874l, this.f195875m, this.f195876n, this.f195878p, this.f195879q, this.f195880r, this.f195881s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public final y3y0 m212870e(int i) {
        return new y3y0(this.f195863a, this.f195864b, this.f195865c, this.f195866d, i, this.f195868f, this.f195869g, this.f195870h, this.f195871i, this.f195872j, this.f195873k, this.f195874l, this.f195875m, this.f195876n, this.f195878p, this.f195879q, this.f195880r, this.f195881s, false);
    }

    @CheckResult
    /* JADX INFO: renamed from: f */
    public final y3y0 m212871f(xqt0 xqt0Var) {
        return new y3y0(xqt0Var, this.f195864b, this.f195865c, this.f195866d, this.f195867e, this.f195868f, this.f195869g, this.f195870h, this.f195871i, this.f195872j, this.f195873k, this.f195874l, this.f195875m, this.f195876n, this.f195878p, this.f195879q, this.f195880r, this.f195881s, false);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m212872i() {
        return this.f195867e == 3 && this.f195874l && this.f195875m == 0;
    }
}
