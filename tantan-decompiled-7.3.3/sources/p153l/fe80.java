package p153l;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fe80 {

    /* JADX INFO: renamed from: t */
    public static final InterfaceC1988i.b f98628t = new InterfaceC1988i.b(new Object());

    /* JADX INFO: renamed from: a */
    public final AbstractC1857c0 f98629a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1988i.b f98630b;

    /* JADX INFO: renamed from: c */
    public final long f98631c;

    /* JADX INFO: renamed from: d */
    public final long f98632d;

    /* JADX INFO: renamed from: e */
    public final int f98633e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ExoPlaybackException f98634f;

    /* JADX INFO: renamed from: g */
    public final boolean f98635g;

    /* JADX INFO: renamed from: h */
    public final ffj0 f98636h;

    /* JADX INFO: renamed from: i */
    public final dgj0 f98637i;

    /* JADX INFO: renamed from: j */
    public final List<Metadata> f98638j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC1988i.b f98639k;

    /* JADX INFO: renamed from: l */
    public final boolean f98640l;

    /* JADX INFO: renamed from: m */
    public final int f98641m;

    /* JADX INFO: renamed from: n */
    public final C1953s f98642n;

    /* JADX INFO: renamed from: o */
    public final boolean f98643o;

    /* JADX INFO: renamed from: p */
    public volatile long f98644p;

    /* JADX INFO: renamed from: q */
    public volatile long f98645q;

    /* JADX INFO: renamed from: r */
    public volatile long f98646r;

    /* JADX INFO: renamed from: s */
    public volatile long f98647s;

    public fe80(AbstractC1857c0 abstractC1857c0, InterfaceC1988i.b bVar, long j, long j2, int i, @Nullable ExoPlaybackException exoPlaybackException, boolean z, ffj0 ffj0Var, dgj0 dgj0Var, List<Metadata> list, InterfaceC1988i.b bVar2, boolean z2, int i2, C1953s c1953s, long j3, long j4, long j5, long j6, boolean z3) {
        this.f98629a = abstractC1857c0;
        this.f98630b = bVar;
        this.f98631c = j;
        this.f98632d = j2;
        this.f98633e = i;
        this.f98634f = exoPlaybackException;
        this.f98635g = z;
        this.f98636h = ffj0Var;
        this.f98637i = dgj0Var;
        this.f98638j = list;
        this.f98639k = bVar2;
        this.f98640l = z2;
        this.f98641m = i2;
        this.f98642n = c1953s;
        this.f98644p = j3;
        this.f98645q = j4;
        this.f98646r = j5;
        this.f98647s = j6;
        this.f98643o = z3;
    }

    /* JADX INFO: renamed from: k */
    public static fe80 m125284k(dgj0 dgj0Var) {
        AbstractC1857c0 abstractC1857c0 = AbstractC1857c0.f7326a;
        InterfaceC1988i.b bVar = f98628t;
        return new fe80(abstractC1857c0, bVar, -9223372036854775807L, 0L, 1, null, false, ffj0.f98782d, dgj0Var, ImmutableList.m15739of(), bVar, false, 0, C1953s.f8284d, 0L, 0L, 0L, 0L, false);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC1988i.b m125285l() {
        return f98628t;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public fe80 m125286a() {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, m125296m(), SystemClock.elapsedRealtime(), this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: b */
    public fe80 m125287b(boolean z) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, z, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: c */
    public fe80 m125288c(InterfaceC1988i.b bVar) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, bVar, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: d */
    public fe80 m125289d(InterfaceC1988i.b bVar, long j, long j2, long j3, long j4, ffj0 ffj0Var, dgj0 dgj0Var, List<Metadata> list) {
        return new fe80(this.f98629a, bVar, j2, j3, this.f98633e, this.f98634f, this.f98635g, ffj0Var, dgj0Var, list, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, j4, j, SystemClock.elapsedRealtime(), this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: e */
    public fe80 m125290e(boolean z, int i) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, z, i, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: f */
    public fe80 m125291f(@Nullable ExoPlaybackException exoPlaybackException) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, exoPlaybackException, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: g */
    public fe80 m125292g(C1953s c1953s) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, c1953s, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: h */
    public fe80 m125293h(int i) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, i, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    @CheckResult
    /* JADX INFO: renamed from: i */
    public fe80 m125294i(boolean z) {
        return new fe80(this.f98629a, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, z);
    }

    @CheckResult
    /* JADX INFO: renamed from: j */
    public fe80 m125295j(AbstractC1857c0 abstractC1857c0) {
        return new fe80(abstractC1857c0, this.f98630b, this.f98631c, this.f98632d, this.f98633e, this.f98634f, this.f98635g, this.f98636h, this.f98637i, this.f98638j, this.f98639k, this.f98640l, this.f98641m, this.f98642n, this.f98644p, this.f98645q, this.f98646r, this.f98647s, this.f98643o);
    }

    /* JADX INFO: renamed from: m */
    public long m125296m() {
        long j;
        long j2;
        if (!m125297n()) {
            return this.f98646r;
        }
        do {
            j = this.f98647s;
            j2 = this.f98646r;
        } while (j != this.f98647s);
        return bmk0.m105084J0(bmk0.m105152l1(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.f98642n.f8288a)));
    }

    /* JADX INFO: renamed from: n */
    public boolean m125297n() {
        return this.f98633e == 3 && this.f98640l && this.f98641m == 0;
    }

    /* JADX INFO: renamed from: o */
    public void m125298o(long j) {
        this.f98646r = j;
        this.f98647s = SystemClock.elapsedRealtime();
    }
}
