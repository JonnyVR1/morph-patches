package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dty0 extends xqt0 {

    /* JADX INFO: renamed from: k */
    public static final Object f87913k = new Object();

    /* JADX INFO: renamed from: l */
    public static final nis0 f87914l;

    /* JADX INFO: renamed from: f */
    public final long f87915f;

    /* JADX INFO: renamed from: g */
    public final long f87916g;

    /* JADX INFO: renamed from: h */
    public final boolean f87917h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final nis0 f87918i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final d6s0 f87919j;

    static {
        for0 for0Var = new for0();
        for0Var.m122516a("SinglePeriodTimeline");
        for0Var.m122517b(Uri.EMPTY);
        f87914l = for0Var.m122518c();
    }

    public dty0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, nis0 nis0Var, @Nullable d6s0 d6s0Var) {
        this.f87915f = j4;
        this.f87916g = j5;
        this.f87917h = z;
        nis0Var.getClass();
        this.f87918i = nis0Var;
        this.f87919j = d6s0Var;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: a */
    public final int mo112550a(Object obj) {
        return f87913k.equals(obj) ? 0 : -1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: b */
    public final int mo113617b() {
        return 1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: c */
    public final int mo113618c() {
        return 1;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: d */
    public final bnt0 mo112551d(int i, bnt0 bnt0Var, boolean z) {
        f5v0.m119530a(i, 0, 1);
        bnt0Var.m102871l(null, z ? f87913k : null, 0, this.f87915f, 0L, yut0.f200123e, false);
        return bnt0Var;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: e */
    public final qpt0 mo112552e(int i, qpt0 qpt0Var, long j) {
        f5v0.m119530a(i, 0, 1);
        Object obj = qpt0.f155803p;
        nis0 nis0Var = this.f87918i;
        long j2 = this.f87916g;
        qpt0Var.m175865a(obj, nis0Var, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f87917h, false, this.f87919j, 0L, j2, 0, 0, 0L);
        return qpt0Var;
    }

    @Override // p149l.xqt0
    /* JADX INFO: renamed from: f */
    public final Object mo112553f(int i) {
        f5v0.m119530a(i, 0, 1);
        return f87913k;
    }
}
