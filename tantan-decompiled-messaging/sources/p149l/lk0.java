package p149l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1868h;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface lk0 {

    /* JADX INFO: renamed from: l.lk0$a */
    public static final class C18238a {

        /* JADX INFO: renamed from: a */
        public final long f128429a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1834c0 f128430b;

        /* JADX INFO: renamed from: c */
        public final int f128431c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final InterfaceC1965i.b f128432d;

        /* JADX INFO: renamed from: e */
        public final long f128433e;

        /* JADX INFO: renamed from: f */
        public final AbstractC1834c0 f128434f;

        /* JADX INFO: renamed from: g */
        public final int f128435g;

        /* JADX INFO: renamed from: h */
        @Nullable
        public final InterfaceC1965i.b f128436h;

        /* JADX INFO: renamed from: i */
        public final long f128437i;

        /* JADX INFO: renamed from: j */
        public final long f128438j;

        public C18238a(long j, AbstractC1834c0 abstractC1834c0, int i, @Nullable InterfaceC1965i.b bVar, long j2, AbstractC1834c0 abstractC1834c1, int i2, @Nullable InterfaceC1965i.b bVar2, long j3, long j4) {
            this.f128429a = j;
            this.f128430b = abstractC1834c0;
            this.f128431c = i;
            this.f128432d = bVar;
            this.f128433e = j2;
            this.f128434f = abstractC1834c1;
            this.f128435g = i2;
            this.f128436h = bVar2;
            this.f128437i = j3;
            this.f128438j = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C18238a.class == obj.getClass()) {
                C18238a c18238a = (C18238a) obj;
                if (this.f128429a == c18238a.f128429a && this.f128431c == c18238a.f128431c && this.f128433e == c18238a.f128433e && this.f128435g == c18238a.f128435g && this.f128437i == c18238a.f128437i && this.f128438j == c18238a.f128438j && v050.m196470a(this.f128430b, c18238a.f128430b) && v050.m196470a(this.f128432d, c18238a.f128432d) && v050.m196470a(this.f128434f, c18238a.f128434f) && v050.m196470a(this.f128436h, c18238a.f128436h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return v050.m196471b(Long.valueOf(this.f128429a), this.f128430b, Integer.valueOf(this.f128431c), this.f128432d, Long.valueOf(this.f128433e), this.f128434f, Integer.valueOf(this.f128435g), this.f128436h, Long.valueOf(this.f128437i), Long.valueOf(this.f128438j));
        }
    }

    /* JADX INFO: renamed from: l.lk0$b */
    public static final class C18239b {

        /* JADX INFO: renamed from: a */
        public final dpi f128439a;

        /* JADX INFO: renamed from: b */
        public final SparseArray<C18238a> f128440b;

        public C18239b(dpi dpiVar, SparseArray<C18238a> sparseArray) {
            this.f128439a = dpiVar;
            SparseArray<C18238a> sparseArray2 = new SparseArray<>(dpiVar.m112906d());
            for (int i = 0; i < dpiVar.m112906d(); i++) {
                int iM112905c = dpiVar.m112905c(i);
                sparseArray2.append(iM112905c, (C18238a) p11.m167011e(sparseArray.get(iM112905c)));
            }
            this.f128440b = sparseArray2;
        }

        /* JADX INFO: renamed from: a */
        public boolean m150119a(int i) {
            return this.f128439a.m112903a(i);
        }

        /* JADX INFO: renamed from: b */
        public int m150120b(int i) {
            return this.f128439a.m112905c(i);
        }

        /* JADX INFO: renamed from: c */
        public C18238a m150121c(int i) {
            return (C18238a) p11.m167011e(this.f128440b.get(i));
        }

        /* JADX INFO: renamed from: d */
        public int m150122d() {
            return this.f128439a.m112906d();
        }
    }

    /* JADX INFO: renamed from: A */
    default void m150055A(C18238a c18238a) {
    }

    /* JADX INFO: renamed from: R */
    default void m150069R(C18238a c18238a) {
    }

    /* JADX INFO: renamed from: a */
    default void m150076a(C18238a c18238a) {
    }

    /* JADX INFO: renamed from: d0 */
    default void m150081d0(C18238a c18238a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    default void m150093k(C18238a c18238a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    default void m150097m(C18238a c18238a) {
    }

    /* JADX INFO: renamed from: s */
    default void m150108s(C18238a c18238a) {
    }

    /* JADX INFO: renamed from: B */
    default void mo112944B(C18238a c18238a, dhd dhdVar) {
    }

    /* JADX INFO: renamed from: D */
    default void m150057D(C18238a c18238a, cxb cxbVar) {
    }

    /* JADX INFO: renamed from: E */
    default void m150058E(C18238a c18238a, String str) {
    }

    /* JADX INFO: renamed from: F */
    default void m150059F(C18238a c18238a, long j) {
    }

    /* JADX INFO: renamed from: H */
    default void m150061H(C18238a c18238a, Metadata metadata) {
    }

    /* JADX INFO: renamed from: I */
    default void m150062I(C18238a c18238a, Exception exc) {
    }

    /* JADX INFO: renamed from: K */
    default void m150064K(C18238a c18238a, boolean z) {
    }

    /* JADX INFO: renamed from: O */
    default void m150066O(C18238a c18238a, float f) {
    }

    /* JADX INFO: renamed from: Q */
    default void m150068Q(C18238a c18238a, w6j0 w6j0Var) {
    }

    /* JADX INFO: renamed from: S */
    default void mo112955S(C18238a c18238a, PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: T */
    default void m150070T(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: W */
    default void m150072W(C18238a c18238a, int i) {
    }

    @Deprecated
    /* JADX INFO: renamed from: X */
    default void m150073X(C18238a c18238a, List<ywb> list) {
    }

    /* JADX INFO: renamed from: Y */
    default void m150074Y(C18238a c18238a, boolean z) {
    }

    /* JADX INFO: renamed from: Z */
    default void m150075Z(C18238a c18238a, C1818a c1818a) {
    }

    @Deprecated
    /* JADX INFO: renamed from: a0 */
    default void m150077a0(C18238a c18238a, C1871k c1871k) {
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    default void m150079c(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: e */
    default void m150082e(C18238a c18238a, C1838d0 c1838d0) {
    }

    @Deprecated
    /* JADX INFO: renamed from: f0 */
    default void m150085f0(C18238a c18238a, boolean z) {
    }

    /* JADX INFO: renamed from: g */
    default void m150086g(C18238a c18238a, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: g0 */
    default void m150087g0(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: h */
    default void m150088h(C18238a c18238a, C1922o c1922o) {
    }

    /* JADX INFO: renamed from: i */
    default void m150090i(C18238a c18238a, C1930s c1930s) {
    }

    /* JADX INFO: renamed from: i0 */
    default void m150091i0(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: j */
    default void mo112961j(C18238a c18238a, val0 val0Var) {
    }

    /* JADX INFO: renamed from: j0 */
    default void m150092j0(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: l */
    default void m150095l(C18238a c18238a, boolean z) {
    }

    /* JADX INFO: renamed from: m0 */
    default void m150098m0(C18238a c18238a, dhd dhdVar) {
    }

    /* JADX INFO: renamed from: n0 */
    default void m150100n0(C18238a c18238a, int i) {
    }

    /* JADX INFO: renamed from: o */
    default void m150101o(C18238a c18238a, dhd dhdVar) {
    }

    /* JADX INFO: renamed from: o0 */
    default void m150102o0(C18238a c18238a, @Nullable PlaybackException playbackException) {
    }

    /* JADX INFO: renamed from: p */
    default void m150103p(C18238a c18238a, C1922o c1922o) {
    }

    /* JADX INFO: renamed from: q */
    default void mo112962q(InterfaceC2003t interfaceC2003t, C18239b c18239b) {
    }

    /* JADX INFO: renamed from: q0 */
    default void m150105q0(C18238a c18238a, Exception exc) {
    }

    /* JADX INFO: renamed from: r */
    default void m150106r(C18238a c18238a, dhd dhdVar) {
    }

    /* JADX INFO: renamed from: r0 */
    default void m150107r0(C18238a c18238a, Exception exc) {
    }

    /* JADX INFO: renamed from: s0 */
    default void m150109s0(C18238a c18238a, boolean z) {
    }

    /* JADX INFO: renamed from: t */
    default void m150110t(C18238a c18238a, String str) {
    }

    @Deprecated
    /* JADX INFO: renamed from: t0 */
    default void m150111t0(C18238a c18238a, C1871k c1871k) {
    }

    /* JADX INFO: renamed from: v0 */
    default void m150114v0(C18238a c18238a, C1868h c1868h) {
    }

    /* JADX INFO: renamed from: w */
    default void mo112964w(C18238a c18238a, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: x0 */
    default void m150116x0(C18238a c18238a, InterfaceC2003t.b bVar) {
    }

    /* JADX INFO: renamed from: y */
    default void m150117y(C18238a c18238a, Exception exc) {
    }

    /* JADX INFO: renamed from: C */
    default void m150056C(C18238a c18238a, long j, int i) {
    }

    /* JADX INFO: renamed from: G */
    default void m150060G(C18238a c18238a, C1871k c1871k, @Nullable hhd hhdVar) {
    }

    /* JADX INFO: renamed from: J */
    default void m150063J(C18238a c18238a, int i, boolean z) {
    }

    /* JADX INFO: renamed from: P */
    default void m150067P(C18238a c18238a, boolean z, int i) {
    }

    /* JADX INFO: renamed from: U */
    default void m150071U(C18238a c18238a, int i, int i2) {
    }

    /* JADX INFO: renamed from: b */
    default void m150078b(C18238a c18238a, @Nullable C1921n c1921n, int i) {
    }

    /* JADX INFO: renamed from: c0 */
    default void m150080c0(C18238a c18238a, C1871k c1871k, @Nullable hhd hhdVar) {
    }

    /* JADX INFO: renamed from: f */
    default void m150084f(C18238a c18238a, Object obj, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: h0 */
    default void m150089h0(C18238a c18238a, String str, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: k0 */
    default void m150094k0(C18238a c18238a, String str, long j) {
    }

    @Deprecated
    /* JADX INFO: renamed from: l0 */
    default void m150096l0(C18238a c18238a, boolean z, int i) {
    }

    /* JADX INFO: renamed from: p0 */
    default void m150104p0(C18238a c18238a, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: u */
    default void m150112u(C18238a c18238a, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: v */
    default void m150113v(C18238a c18238a, int i, long j) {
    }

    /* JADX INFO: renamed from: z */
    default void m150118z(C18238a c18238a, lrv lrvVar, nkx nkxVar) {
    }

    /* JADX INFO: renamed from: N */
    default void m150065N(C18238a c18238a, String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: b0 */
    default void mo112960b0(C18238a c18238a, InterfaceC2003t.e eVar, InterfaceC2003t.e eVar2, int i) {
    }

    /* JADX INFO: renamed from: n */
    default void m150099n(C18238a c18238a, int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: u0 */
    default void mo112963u0(C18238a c18238a, int i, long j, long j2) {
    }

    /* JADX INFO: renamed from: w0 */
    default void m150115w0(C18238a c18238a, String str, long j, long j2) {
    }

    /* JADX INFO: renamed from: L */
    default void mo112947L(C18238a c18238a, lrv lrvVar, nkx nkxVar, IOException iOException, boolean z) {
    }

    @Deprecated
    /* JADX INFO: renamed from: e0 */
    default void m150083e0(C18238a c18238a, int i, int i2, int i3, float f) {
    }
}
