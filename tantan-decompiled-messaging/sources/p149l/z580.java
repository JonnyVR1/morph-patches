package p149l;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class z580 {

    /* JADX INFO: renamed from: t */
    public static final InterfaceC1965i.b f201765t = new InterfaceC1965i.b(new Object());

    /* JADX INFO: renamed from: a */
    public final AbstractC1834c0 f201766a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1965i.b f201767b;

    /* JADX INFO: renamed from: c */
    public final long f201768c;

    /* JADX INFO: renamed from: d */
    public final long f201769d;

    /* JADX INFO: renamed from: e */
    public final int f201770e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ExoPlaybackException f201771f;

    /* JADX INFO: renamed from: g */
    public final boolean f201772g;

    /* JADX INFO: renamed from: h */
    public final b6j0 f201773h;

    /* JADX INFO: renamed from: i */
    public final z6j0 f201774i;

    /* JADX INFO: renamed from: j */
    public final List<Metadata> f201775j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1965i.b f201776k;

    /* JADX INFO: renamed from: l */
    public final boolean f201777l;

    /* JADX INFO: renamed from: m */
    public final int f201778m;

    /* JADX INFO: renamed from: n */
    public final C1930s f201779n;

    /* JADX INFO: renamed from: o */
    public final boolean f201780o;

    /* JADX INFO: renamed from: p */
    public volatile long f201781p;

    /* JADX INFO: renamed from: q */
    public volatile long f201782q;

    /* JADX INFO: renamed from: r */
    public volatile long f201783r;

    /* JADX INFO: renamed from: s */
    public volatile long f201784s;

    public z580(AbstractC1834c0 abstractC1834c0, InterfaceC1965i.b bVar, long j, long j2, int i, @Nullable ExoPlaybackException exoPlaybackException, boolean z, b6j0 b6j0Var, z6j0 z6j0Var, List<Metadata> list, InterfaceC1965i.b bVar2, boolean z2, int i2, C1930s c1930s, long j3, long j4, long j5, long j6, boolean z3) {
        this.f201766a = abstractC1834c0;
        this.f201767b = bVar;
        this.f201768c = j;
        this.f201769d = j2;
        this.f201770e = i;
        this.f201771f = exoPlaybackException;
        this.f201772g = z;
        this.f201773h = b6j0Var;
        this.f201774i = z6j0Var;
        this.f201775j = list;
        this.f201776k = bVar2;
        this.f201777l = z2;
        this.f201778m = i2;
        this.f201779n = c1930s;
        this.f201781p = j3;
        this.f201782q = j4;
        this.f201783r = j5;
        this.f201784s = j6;
        this.f201780o = z3;
    }

    /* JADX INFO: renamed from: k */
    public static z580 m217275k(z6j0 z6j0Var) {
        AbstractC1834c0 abstractC1834c0 = AbstractC1834c0.f7289a;
        InterfaceC1965i.b bVar = f201765t;
        return new z580(abstractC1834c0, bVar, -9223372036854775807L, 0L, 1, null, false, b6j0.f73823d, z6j0Var, ImmutableList.m15685of(), bVar, false, 0, C1930s.f8247d, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC1965i.b m217276l() {
        return f201765t;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public z580 m217277a() {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, m217287m(), SystemClock.elapsedRealtime(), this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public z580 m217278b(boolean z) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, z, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public z580 m217279c(InterfaceC1965i.b bVar) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, bVar, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public z580 m217280d(InterfaceC1965i.b bVar, long j, long j2, long j3, long j4, b6j0 b6j0Var, z6j0 z6j0Var, List<Metadata> list) {
        return new z580(this.f201766a, bVar, j2, j3, this.f201770e, this.f201771f, this.f201772g, b6j0Var, z6j0Var, list, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, j4, j, SystemClock.elapsedRealtime(), this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public z580 m217281e(boolean z, int i) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, z, i, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: f */
    public z580 m217282f(@Nullable ExoPlaybackException exoPlaybackException) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, exoPlaybackException, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: g */
    public z580 m217283g(C1930s c1930s) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, c1930s, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: h */
    public z580 m217284h(int i) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, i, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    @CheckResult
    /* JADX INFO: renamed from: i */
    public z580 m217285i(boolean z) {
        return new z580(this.f201766a, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, z);
    }

    @CheckResult
    /* JADX INFO: renamed from: j */
    public z580 m217286j(AbstractC1834c0 abstractC1834c0) {
        return new z580(abstractC1834c0, this.f201767b, this.f201768c, this.f201769d, this.f201770e, this.f201771f, this.f201772g, this.f201773h, this.f201774i, this.f201775j, this.f201776k, this.f201777l, this.f201778m, this.f201779n, this.f201781p, this.f201782q, this.f201783r, this.f201784s, this.f201780o);
    }

    /* JADX INFO: renamed from: m */
    public long m217287m() {
        long j;
        long j2;
        if (!m217288n()) {
            return this.f201783r;
        }
        do {
            j = this.f201784s;
            j2 = this.f201783r;
        } while (j != this.f201784s);
        return vck0.m197806J0(vck0.m197874l1(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f201779n.f8251a)));
    }

    /* JADX INFO: renamed from: n */
    public boolean m217288n() {
        return this.f201770e == 3 && this.f201777l && this.f201778m == 0;
    }

    /* JADX INFO: renamed from: o */
    public void m217289o(long j) {
        this.f201783r = j;
        this.f201784s = SystemClock.elapsedRealtime();
    }
}
