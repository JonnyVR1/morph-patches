package p153l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1891h;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.C1945o;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface hk0 {

    /* JADX INFO: renamed from: l.hk0$a */
    public static final class C17480a {

        /* JADX INFO: renamed from: a */
        public final long f110347a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1857c0 f110348b;

        /* JADX INFO: renamed from: c */
        public final int f110349c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final InterfaceC1988i.b f110350d;

        /* JADX INFO: renamed from: e */
        public final long f110351e;

        /* JADX INFO: renamed from: f */
        public final AbstractC1857c0 f110352f;

        /* JADX INFO: renamed from: g */
        public final int f110353g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final InterfaceC1988i.b f110354h;

        /* JADX INFO: renamed from: i */
        public final long f110355i;

        /* JADX INFO: renamed from: j */
        public final long f110356j;

        public C17480a(long j, AbstractC1857c0 abstractC1857c0, int i, @Nullable InterfaceC1988i.b bVar, long j2, AbstractC1857c0 abstractC1857c1, int i2, @Nullable InterfaceC1988i.b bVar2, long j3, long j4) {
            this.f110347a = j;
            this.f110348b = abstractC1857c0;
            this.f110349c = i;
            this.f110350d = bVar;
            this.f110351e = j2;
            this.f110352f = abstractC1857c1;
            this.f110353g = i2;
            this.f110354h = bVar2;
            this.f110355i = j3;
            this.f110356j = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C17480a.class == obj.getClass()) {
                C17480a c17480a = (C17480a) obj;
                if (this.f110347a == c17480a.f110347a && this.f110349c == c17480a.f110349c && this.f110351e == c17480a.f110351e && this.f110353g == c17480a.f110353g && this.f110355i == c17480a.f110355i && this.f110356j == c17480a.f110356j && k950.m148863a(this.f110348b, c17480a.f110348b) && k950.m148863a(this.f110350d, c17480a.f110350d) && k950.m148863a(this.f110352f, c17480a.f110352f) && k950.m148863a(this.f110354h, c17480a.f110354h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return k950.m148864b(Long.valueOf(this.f110347a), this.f110348b, Integer.valueOf(this.f110349c), this.f110350d, Long.valueOf(this.f110351e), this.f110352f, Integer.valueOf(this.f110353g), this.f110354h, Long.valueOf(this.f110355i), Long.valueOf(this.f110356j));
        }
    }

    /* JADX INFO: renamed from: l.hk0$b */
    public static final class C17481b {

        /* JADX INFO: renamed from: a */
        public final zri f110357a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<C17480a> f110358b;

        public C17481b(zri zriVar, SparseArray<C17480a> sparseArray) {
            this.f110357a = zriVar;
            SparseArray<C17480a> sparseArray2 = new SparseArray<>(zriVar.m221159d());
            for (int i = 0; i < zriVar.m221159d(); i++) {
                int iM221158c = zriVar.m221158c(i);
                sparseArray2.append(iM221158c, (C17480a) w11.m204369e(sparseArray.get(iM221158c)));
            }
            this.f110358b = sparseArray2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m135604a(int i) {
            return this.f110357a.m221156a(i);
        }

        /* JADX INFO: renamed from: b */
        public int m135605b(int i) {
            return this.f110357a.m221158c(i);
        }

        /* JADX INFO: renamed from: c */
        public C17480a m135606c(int i) {
            return (C17480a) w11.m204369e(this.f110358b.get(i));
        }

        /* JADX INFO: renamed from: d */
        public int m135607d() {
            return this.f110357a.m221159d();
        }
    }

    /* JADX INFO: renamed from: A */
    default void m135540A(C17480a c17480a) {
    }

    /* JADX INFO: renamed from: R */
    default void m135554R(C17480a c17480a) {
    }

    /* JADX INFO: renamed from: a */
    default void m135561a(C17480a c17480a) {
    }

    /* JADX INFO: renamed from: d0 */
    default void m135566d0(C17480a c17480a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    default void m135578k(C17480a c17480a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    default void m135582m(C17480a c17480a) {
    }

    /* JADX INFO: renamed from: s */
    default void m135593s(C17480a c17480a) {
    }

    /* JADX INFO: renamed from: B */
    default void mo100944B(C17480a c17480a, jid jidVar) {
    }

    /* JADX INFO: renamed from: D */
    default void m135542D(C17480a c17480a, qyb qybVar) {
    }

    /* JADX INFO: renamed from: E */
    default void m135543E(C17480a c17480a, String str) {
    }

    /* JADX INFO: renamed from: F */
    default void m135544F(C17480a c17480a, long j) {
    }

    /* JADX INFO: renamed from: H */
    default void m135546H(C17480a c17480a, Metadata metadata) {
    }

    /* JADX INFO: renamed from: I */
    default void m135547I(C17480a c17480a, Exception exc) {
    }

    /* JADX INFO: renamed from: K */
    default void m135549K(C17480a c17480a, boolean z) {
    }

    /* JADX INFO: renamed from: O */
    default void m135551O(C17480a c17480a, float f) {
    }

    /* JADX INFO: renamed from: Q */
    default void m135553Q(C17480a c17480a, agj0 agj0Var) {
    }

    /* JADX INFO: renamed from: S */
    default void mo100956S(C17480a c17480a, PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: T */
    default void m135555T(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: W */
    default void m135557W(C17480a c17480a, int i) {
    }

    @Deprecated
    /* JADX INFO: renamed from: X */
    default void m135558X(C17480a c17480a, List<myb> list) {
    }

    /* JADX INFO: renamed from: Y */
    default void m135559Y(C17480a c17480a, boolean z) {
    }

    /* JADX INFO: renamed from: Z */
    default void m135560Z(C17480a c17480a, C1841a c1841a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: a0 */
    default void m135562a0(C17480a c17480a, C1894k c1894k) {
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    default void m135564c(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: e */
    default void m135567e(C17480a c17480a, C1861d0 c1861d0) {
    }

    @Deprecated
    /* JADX INFO: renamed from: f0 */
    default void m135570f0(C17480a c17480a, boolean z) {
    }

    /* JADX INFO: renamed from: g */
    default void m135571g(C17480a c17480a, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: g0 */
    default void m135572g0(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: h */
    default void m135573h(C17480a c17480a, C1945o c1945o) {
    }

    /* JADX INFO: renamed from: i */
    default void m135575i(C17480a c17480a, C1953s c1953s) {
    }

    /* JADX INFO: renamed from: i0 */
    default void m135576i0(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: j */
    default void mo100964j(C17480a c17480a, zjl0 zjl0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    default void m135577j0(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: l */
    default void m135580l(C17480a c17480a, boolean z) {
    }

    /* JADX INFO: renamed from: m0 */
    default void m135583m0(C17480a c17480a, jid jidVar) {
    }

    /* JADX INFO: renamed from: n0 */
    default void m135585n0(C17480a c17480a, int i) {
    }

    /* JADX INFO: renamed from: o */
    default void m135586o(C17480a c17480a, jid jidVar) {
    }

    /* JADX INFO: renamed from: o0 */
    default void m135587o0(C17480a c17480a, @Nullable PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: p */
    default void m135588p(C17480a c17480a, C1945o c1945o) {
    }

    /* JADX INFO: renamed from: q */
    default void mo100965q(InterfaceC2026t interfaceC2026t, C17481b c17481b) {
    }

    /* JADX INFO: renamed from: q0 */
    default void m135590q0(C17480a c17480a, Exception exc) {
    }

    /* JADX INFO: renamed from: r */
    default void m135591r(C17480a c17480a, jid jidVar) {
    }

    /* JADX INFO: renamed from: r0 */
    default void m135592r0(C17480a c17480a, Exception exc) {
    }

    /* JADX INFO: renamed from: s0 */
    default void m135594s0(C17480a c17480a, boolean z) {
    }

    /* JADX INFO: renamed from: t */
    default void m135595t(C17480a c17480a, String str) {
    }

    @Deprecated
    /* JADX INFO: renamed from: t0 */
    default void m135596t0(C17480a c17480a, C1894k c1894k) {
    }

    /* JADX INFO: renamed from: v0 */
    default void m135599v0(C17480a c17480a, C1891h c1891h) {
    }

    /* JADX INFO: renamed from: w */
    default void mo100967w(C17480a c17480a, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: x0 */
    default void m135601x0(C17480a c17480a, InterfaceC2026t.b bVar) {
    }

    /* JADX INFO: renamed from: y */
    default void m135602y(C17480a c17480a, Exception exc) {
    }

    /* JADX INFO: renamed from: C */
    default void m135541C(C17480a c17480a, long j, int i) {
    }

    /* JADX INFO: renamed from: G */
    default void m135545G(C17480a c17480a, C1894k c1894k, @Nullable nid nidVar) {
    }

    /* JADX INFO: renamed from: J */
    default void m135548J(C17480a c17480a, int i, boolean z) {
    }

    /* JADX INFO: renamed from: P */
    default void m135552P(C17480a c17480a, boolean z, int i) {
    }

    /* JADX INFO: renamed from: U */
    default void m135556U(C17480a c17480a, int i, int i2) {
    }

    /* JADX INFO: renamed from: b */
    default void m135563b(C17480a c17480a, @Nullable C1944n c1944n, int i) {
    }

    /* JADX INFO: renamed from: c0 */
    default void m135565c0(C17480a c17480a, C1894k c1894k, @Nullable nid nidVar) {
    }

    /* JADX INFO: renamed from: f */
    default void m135569f(C17480a c17480a, Object obj, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: h0 */
    default void m135574h0(C17480a c17480a, String str, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: k0 */
    default void m135579k0(C17480a c17480a, String str, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: l0 */
    default void m135581l0(C17480a c17480a, boolean z, int i) {
    }

    /* JADX INFO: renamed from: p0 */
    default void m135589p0(C17480a c17480a, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: u */
    default void m135597u(C17480a c17480a, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: v */
    default void m135598v(C17480a c17480a, int i, long j) {
    }

    /* JADX INFO: renamed from: z */
    default void m135603z(C17480a c17480a, mtv mtvVar, ktx ktxVar) {
    }

    /* JADX INFO: renamed from: N */
    default void m135550N(C17480a c17480a, String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: b0 */
    default void mo100962b0(C17480a c17480a, InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, int i) {
    }

    /* JADX INFO: renamed from: n */
    default void m135584n(C17480a c17480a, int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: u0 */
    default void mo100966u0(C17480a c17480a, int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: w0 */
    default void m135600w0(C17480a c17480a, String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: L */
    default void mo100947L(C17480a c17480a, mtv mtvVar, ktx ktxVar, IOException iOException, boolean z) {
    }

    @Deprecated
    /* JADX INFO: renamed from: e0 */
    default void m135568e0(C17480a c17480a, int i, int i2, int i3, float f) {
    }
}
