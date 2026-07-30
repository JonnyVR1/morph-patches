package p153l;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1891h;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.C1945o;
import com.google.android.exoplayer2.C1953s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class wld implements dk0 {

    /* JADX INFO: renamed from: a */
    public final qa5 f189670a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1857c0.b f189671b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1857c0.d f189672c;

    /* JADX INFO: renamed from: d */
    public final C21139a f189673d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<hk0.C17480a> f189674e;

    /* JADX INFO: renamed from: f */
    public bqr<hk0> f189675f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2026t f189676g;

    /* JADX INFO: renamed from: h */
    public sxk f189677h;

    /* JADX INFO: renamed from: i */
    public boolean f189678i;

    /* JADX INFO: renamed from: l.wld$a */
    public static final class C21139a {

        /* JADX INFO: renamed from: a */
        public final AbstractC1857c0.b f189679a;

        /* JADX INFO: renamed from: b */
        public ImmutableList<InterfaceC1988i.b> f189680b = ImmutableList.m15739of();

        /* JADX INFO: renamed from: c */
        public ImmutableMap<InterfaceC1988i.b, AbstractC1857c0> f189681c = ImmutableMap.m15769of();

        /* JADX INFO: renamed from: d */
        @Nullable
        public InterfaceC1988i.b f189682d;

        /* JADX INFO: renamed from: e */
        public InterfaceC1988i.b f189683e;

        /* JADX INFO: renamed from: f */
        public InterfaceC1988i.b f189684f;

        public C21139a(AbstractC1857c0.b bVar) {
            this.f189679a = bVar;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static InterfaceC1988i.b m207009c(InterfaceC2026t interfaceC2026t, ImmutableList<InterfaceC1988i.b> immutableList, @Nullable InterfaceC1988i.b bVar, AbstractC1857c0.b bVar2) {
            AbstractC1857c0 currentTimeline = interfaceC2026t.getCurrentTimeline();
            int currentPeriodIndex = interfaceC2026t.getCurrentPeriodIndex();
            Object objMo9456q = currentTimeline.m9776u() ? null : currentTimeline.mo9456q(currentPeriodIndex);
            int iM9784g = (interfaceC2026t.isPlayingAd() || currentTimeline.m9776u()) ? -1 : currentTimeline.m9770j(currentPeriodIndex, bVar2).m9784g(bmk0.m105084J0(interfaceC2026t.getCurrentPosition()) - bVar2.m9794q());
            for (int i = 0; i < immutableList.size(); i++) {
                InterfaceC1988i.b bVar3 = immutableList.get(i);
                if (m207010i(bVar3, objMo9456q, interfaceC2026t.isPlayingAd(), interfaceC2026t.getCurrentAdGroupIndex(), interfaceC2026t.getCurrentAdIndexInAdGroup(), iM9784g)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null && m207010i(bVar, objMo9456q, interfaceC2026t.isPlayingAd(), interfaceC2026t.getCurrentAdGroupIndex(), interfaceC2026t.getCurrentAdIndexInAdGroup(), iM9784g)) {
                return bVar;
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static boolean m207010i(InterfaceC1988i.b bVar, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.f101422a.equals(obj)) {
                return false;
            }
            if (z && bVar.f101423b == i && bVar.f101424c == i2) {
                return true;
            }
            return !z && bVar.f101423b == -1 && bVar.f101426e == i3;
        }

        /* JADX INFO: renamed from: b */
        public final void m207011b(ImmutableMap.C2809b<InterfaceC1988i.b, AbstractC1857c0> c2809b, @Nullable InterfaceC1988i.b bVar, AbstractC1857c0 abstractC1857c0) {
            if (bVar == null) {
                return;
            }
            if (abstractC1857c0.mo9450f(bVar.f101422a) != -1) {
                c2809b.mo15715g(bVar, abstractC1857c0);
                return;
            }
            AbstractC1857c0 abstractC1857c1 = this.f189681c.get(bVar);
            if (abstractC1857c1 != null) {
                c2809b.mo15715g(bVar, abstractC1857c1);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public InterfaceC1988i.b m207012d() {
            return this.f189682d;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public InterfaceC1988i.b m207013e() {
            if (this.f189680b.isEmpty()) {
                return null;
            }
            return (InterfaceC1988i.b) akq.m98599g(this.f189680b);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public AbstractC1857c0 m207014f(InterfaceC1988i.b bVar) {
            return this.f189681c.get(bVar);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public InterfaceC1988i.b m207015g() {
            return this.f189683e;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public InterfaceC1988i.b m207016h() {
            return this.f189684f;
        }

        /* JADX INFO: renamed from: j */
        public void m207017j(InterfaceC2026t interfaceC2026t) {
            this.f189682d = m207009c(interfaceC2026t, this.f189680b, this.f189683e, this.f189679a);
        }

        /* JADX INFO: renamed from: k */
        public void m207018k(List<InterfaceC1988i.b> list, @Nullable InterfaceC1988i.b bVar, InterfaceC2026t interfaceC2026t) {
            this.f189680b = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f189683e = list.get(0);
                this.f189684f = (InterfaceC1988i.b) w11.m204369e(bVar);
            }
            if (this.f189682d == null) {
                this.f189682d = m207009c(interfaceC2026t, this.f189680b, this.f189683e, this.f189679a);
            }
            m207020m(interfaceC2026t.getCurrentTimeline());
        }

        /* JADX INFO: renamed from: l */
        public void m207019l(InterfaceC2026t interfaceC2026t) {
            this.f189682d = m207009c(interfaceC2026t, this.f189680b, this.f189683e, this.f189679a);
            m207020m(interfaceC2026t.getCurrentTimeline());
        }

        /* JADX INFO: renamed from: m */
        public final void m207020m(AbstractC1857c0 abstractC1857c0) {
            ImmutableList<InterfaceC1988i.b> immutableList;
            ImmutableMap.C2809b<InterfaceC1988i.b, AbstractC1857c0> c2809bBuilder = ImmutableMap.builder();
            if (this.f189680b.isEmpty()) {
                m207011b(c2809bBuilder, this.f189683e, abstractC1857c0);
                if (!k950.m148863a(this.f189684f, this.f189683e)) {
                    m207011b(c2809bBuilder, this.f189684f, abstractC1857c0);
                }
                if (!k950.m148863a(this.f189682d, this.f189683e) && !k950.m148863a(this.f189682d, this.f189684f)) {
                    m207011b(c2809bBuilder, this.f189682d, abstractC1857c0);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.f189680b.size();
                    immutableList = this.f189680b;
                    if (i >= size) {
                        break;
                    }
                    m207011b(c2809bBuilder, immutableList.get(i), abstractC1857c0);
                    i++;
                }
                if (!immutableList.contains(this.f189682d)) {
                    m207011b(c2809bBuilder, this.f189682d, abstractC1857c0);
                }
            }
            this.f189681c = c2809bBuilder.mo15714d();
        }
    }

    public wld(qa5 qa5Var) {
        this.f189670a = (qa5) w11.m204369e(qa5Var);
        this.f189675f = new bqr<>(bmk0.m105099R(), qa5Var, new bqr.InterfaceC16084b() { // from class: l.jkd
            @Override // p153l.bqr.InterfaceC16084b
            /* JADX INFO: renamed from: a */
            public final void mo105967a(Object obj, zri zriVar) {
                wld.m206934B0((hk0) obj, zriVar);
            }
        });
        AbstractC1857c0.b bVar = new AbstractC1857c0.b();
        this.f189671b = bVar;
        this.f189672c = new AbstractC1857c0.d();
        this.f189673d = new C21139a(bVar);
        this.f189674e = new SparseArray<>();
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m206934B0(hk0 hk0Var, zri zriVar) {
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m206935B1(hk0.C17480a c17480a, int i, InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, hk0 hk0Var) {
        hk0Var.m135564c(c17480a, i);
        hk0Var.mo100962b0(c17480a, eVar, eVar2, i);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m206939D1(hk0.C17480a c17480a, String str, long j, long j2, hk0 hk0Var) {
        hk0Var.m135579k0(c17480a, str, j);
        hk0Var.m135550N(c17480a, str, j2, j);
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m206941E1(hk0.C17480a c17480a, String str, long j, long j2, hk0 hk0Var) {
        hk0Var.m135574h0(c17480a, str, j);
        hk0Var.m135600w0(c17480a, str, j2, j);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m206957S0(hk0.C17480a c17480a, int i, hk0 hk0Var) {
        hk0Var.m135578k(c17480a);
        hk0Var.m135577j0(c17480a, i);
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m206961W0(hk0.C17480a c17480a, zjl0 zjl0Var, hk0 hk0Var) {
        hk0Var.mo100964j(c17480a, zjl0Var);
        hk0Var.m135568e0(c17480a, zjl0Var.f204682a, zjl0Var.f204683b, zjl0Var.f204684c, zjl0Var.f204685d);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m206967c1(hk0.C17480a c17480a, boolean z, hk0 hk0Var) {
        hk0Var.m135570f0(c17480a, z);
        hk0Var.m135549K(c17480a, z);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m206989v1(hk0.C17480a c17480a, C1894k c1894k, nid nidVar, hk0 hk0Var) {
        hk0Var.m135562a0(c17480a, c1894k);
        hk0Var.m135565c0(c17480a, c1894k, nidVar);
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m206991w1(hk0.C17480a c17480a, C1894k c1894k, nid nidVar, hk0 hk0Var) {
        hk0Var.m135596t0(c17480a, c1894k);
        hk0Var.m135545G(c17480a, c1894k, nidVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: B */
    public final void mo10940B(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1002, new bqr.InterfaceC16083a() { // from class: l.sld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135603z(c17480aM207002L1, mtvVar, ktxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: C */
    public final void mo11808C(AbstractC1857c0 abstractC1857c0, final int i) {
        this.f189673d.m207019l((InterfaceC2026t) w11.m204369e(this.f189676g));
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 0, new bqr.InterfaceC16083a() { // from class: l.dld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135557W(c17480aM206998H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: D */
    public final void mo11809D(final int i) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 21, new bqr.InterfaceC16083a() { // from class: l.ujd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135576i0(c17480aM207004N1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: E */
    public void mo11810E(final C1945o c1945o) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 14, new bqr.InterfaceC16083a() { // from class: l.njd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135588p(c17480aM206998H1, c1945o);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: F */
    public final void mo11811F(final boolean z) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 9, new bqr.InterfaceC16083a() { // from class: l.ljd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135594s0(c17480aM206998H1, z);
            }
        });
    }

    @Override // p153l.dk0
    @CallSuper
    /* JADX INFO: renamed from: G */
    public void mo116163G(final InterfaceC2026t interfaceC2026t, Looper looper) {
        w11.m204371g(this.f189676g == null || this.f189673d.f189680b.isEmpty());
        this.f189676g = (InterfaceC2026t) w11.m204369e(interfaceC2026t);
        this.f189677h = this.f189670a.mo111761c(looper, null);
        this.f189675f = this.f189675f.m105959e(looper, new bqr.InterfaceC16084b() { // from class: l.vjd
            @Override // p153l.bqr.InterfaceC16084b
            /* JADX INFO: renamed from: a */
            public final void mo105967a(Object obj, zri zriVar) {
                hk0 hk0Var = (hk0) obj;
                hk0Var.mo100965q(interfaceC2026t, new hk0.C17481b(zriVar, this.f184372a.f189674e));
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: H */
    public void mo11812H(final int i, final boolean z) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 30, new bqr.InterfaceC16083a() { // from class: l.hld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135548J(c17480aM206998H1, i, z);
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public final hk0.C17480a m206998H1() {
        return m207000J1(this.f189673d.m207012d());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: I */
    public void mo11813I(@Nullable final PlaybackException playbackException) {
        final hk0.C17480a c17480aM207005O1 = m207005O1(playbackException);
        m207007Q1(c17480aM207005O1, 10, new bqr.InterfaceC16083a() { // from class: l.ukd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135587o0(c17480aM207005O1, playbackException);
            }
        });
    }

    @RequiresNonNull({GameIdentity.player})
    /* JADX INFO: renamed from: I1 */
    public final hk0.C17480a m206999I1(AbstractC1857c0 abstractC1857c0, int i, @Nullable InterfaceC1988i.b bVar) {
        InterfaceC1988i.b bVar2 = abstractC1857c0.m9776u() ? null : bVar;
        long jElapsedRealtime = this.f189670a.elapsedRealtime();
        boolean z = abstractC1857c0.equals(this.f189676g.getCurrentTimeline()) && i == this.f189676g.getCurrentMediaItemIndex();
        long jM9804d = 0;
        if (bVar2 == null || !bVar2.m128142b()) {
            if (z) {
                jM9804d = this.f189676g.getContentPosition();
            } else if (!abstractC1857c0.m9776u()) {
                jM9804d = abstractC1857c0.m9774r(i, this.f189672c).m9804d();
            }
        } else if (z && this.f189676g.getCurrentAdGroupIndex() == bVar2.f101423b && this.f189676g.getCurrentAdIndexInAdGroup() == bVar2.f101424c) {
            jM9804d = this.f189676g.getCurrentPosition();
        }
        return new hk0.C17480a(jElapsedRealtime, abstractC1857c0, i, bVar2, jM9804d, this.f189676g.getCurrentTimeline(), this.f189676g.getCurrentMediaItemIndex(), this.f189673d.m207012d(), this.f189676g.getCurrentPosition(), this.f189676g.getTotalBufferedDuration());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: J */
    public final void mo11814J(final PlaybackException playbackException) {
        final hk0.C17480a c17480aM207005O1 = m207005O1(playbackException);
        m207007Q1(c17480aM207005O1, 10, new bqr.InterfaceC16083a() { // from class: l.akd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).mo100956S(c17480aM207005O1, playbackException);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final hk0.C17480a m207000J1(@Nullable InterfaceC1988i.b bVar) {
        w11.m204369e(this.f189676g);
        AbstractC1857c0 abstractC1857c0M207014f = bVar == null ? null : this.f189673d.m207014f(bVar);
        if (bVar != null && abstractC1857c0M207014f != null) {
            return m206999I1(abstractC1857c0M207014f, abstractC1857c0M207014f.mo9454l(bVar.f101422a, this.f189671b).f7339c, bVar);
        }
        int currentMediaItemIndex = this.f189676g.getCurrentMediaItemIndex();
        AbstractC1857c0 currentTimeline = this.f189676g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.mo9775t()) {
            currentTimeline = AbstractC1857c0.f7326a;
        }
        return m206999I1(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: K */
    public void mo11815K(final agj0 agj0Var) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 19, new bqr.InterfaceC16083a() { // from class: l.kkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135553Q(c17480aM206998H1, agj0Var);
            }
        });
    }

    /* JADX INFO: renamed from: K1 */
    public final hk0.C17480a m207001K1() {
        return m207000J1(this.f189673d.m207013e());
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: L */
    public final void mo10942L(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1000, new bqr.InterfaceC16083a() { // from class: l.ald
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135597u(c17480aM207002L1, mtvVar, ktxVar);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public final hk0.C17480a m207002L1(int i, @Nullable InterfaceC1988i.b bVar) {
        w11.m204369e(this.f189676g);
        if (bVar != null) {
            return this.f189673d.m207014f(bVar) != null ? m207000J1(bVar) : m206999I1(AbstractC1857c0.f7326a, i, bVar);
        }
        AbstractC1857c0 currentTimeline = this.f189676g.getCurrentTimeline();
        if (i >= currentTimeline.mo9775t()) {
            currentTimeline = AbstractC1857c0.f7326a;
        }
        return m206999I1(currentTimeline, i, null);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: M */
    public final void mo11816M(final C1841a c1841a) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 20, new bqr.InterfaceC16083a() { // from class: l.vld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135560Z(c17480aM207004N1, c1841a);
            }
        });
    }

    /* JADX INFO: renamed from: M1 */
    public final hk0.C17480a m207003M1() {
        return m207000J1(this.f189673d.m207015g());
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: N */
    public final void mo9966N(int i, @Nullable InterfaceC1988i.b bVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1023, new bqr.InterfaceC16083a() { // from class: l.qld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135566d0(c17480aM207002L1);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public final hk0.C17480a m207004N1() {
        return m207000J1(this.f189673d.m207016h());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: O */
    public final void mo11817O(final boolean z, final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 5, new bqr.InterfaceC16083a() { // from class: l.tjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135552P(c17480aM206998H1, z, i);
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public final hk0.C17480a m207005O1(@Nullable PlaybackException playbackException) {
        fyx fyxVar;
        return (!(playbackException instanceof ExoPlaybackException) || (fyxVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? m206998H1() : m207000J1(new InterfaceC1988i.b(fyxVar));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: P */
    public final void mo9967P(int i, @Nullable InterfaceC1988i.b bVar, final int i2) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1022, new bqr.InterfaceC16083a() { // from class: l.eld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206957S0(c17480aM207002L1, i2, (hk0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public final void m207006P1() {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, TXLiteAVCode.EVT_SW_ENCODER_START_SUCC, new bqr.InterfaceC16083a() { // from class: l.pld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135593s(c17480aM206998H1);
            }
        });
        this.f189675f.m105963i();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: Q */
    public final void mo9968Q(int i, @Nullable InterfaceC1988i.b bVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1025, new bqr.InterfaceC16083a() { // from class: l.rld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135554R(c17480aM207002L1);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m207007Q1(hk0.C17480a c17480a, int i, bqr.InterfaceC16083a<hk0> interfaceC16083a) {
        this.f189674e.put(i, c17480a);
        this.f189675f.m105965k(i, interfaceC16083a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: R */
    public void mo11818R(final boolean z) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 7, new bqr.InterfaceC16083a() { // from class: l.uld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135580l(c17480aM206998H1, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: S */
    public final void mo11819S(final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 6, new bqr.InterfaceC16083a() { // from class: l.vkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135572g0(c17480aM206998H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: T */
    public void mo11820T(final InterfaceC2026t.b bVar) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 13, new bqr.InterfaceC16083a() { // from class: l.dkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135601x0(c17480aM206998H1, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: U */
    public final void mo11821U(final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 4, new bqr.InterfaceC16083a() { // from class: l.hkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135585n0(c17480aM206998H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: V */
    public final void mo10943V(int i, @Nullable InterfaceC1988i.b bVar, final ktx ktxVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1005, new bqr.InterfaceC16083a() { // from class: l.ykd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135571g(c17480aM207002L1, ktxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: W */
    public void mo11822W(final C1891h c1891h) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 29, new bqr.InterfaceC16083a() { // from class: l.gld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135599v0(c17480aM206998H1, c1891h);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: X */
    public final void mo116164X() {
        if (this.f189678i) {
            return;
        }
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        this.f189678i = true;
        m207007Q1(c17480aM206998H1, -1, new bqr.InterfaceC16083a() { // from class: l.sjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135582m(c17480aM206998H1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: Y */
    public final void mo10944Y(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1001, new bqr.InterfaceC16083a() { // from class: l.qjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135589p0(c17480aM207002L1, mtvVar, ktxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: Z */
    public final void mo10945Z(int i, @Nullable InterfaceC1988i.b bVar, final mtv mtvVar, final ktx ktxVar, final IOException iOException, final boolean z) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1003, new bqr.InterfaceC16083a() { // from class: l.zjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).mo100947L(c17480aM207002L1, mtvVar, ktxVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: a */
    public final void mo11823a(final boolean z) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 23, new bqr.InterfaceC16083a() { // from class: l.tld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135559Y(c17480aM207004N1, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: a0 */
    public final void mo9969a0(int i, @Nullable InterfaceC1988i.b bVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START, new bqr.InterfaceC16083a() { // from class: l.kld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135561a(c17480aM207002L1);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: b */
    public final void mo116165b(final Exception exc) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1014, new bqr.InterfaceC16083a() { // from class: l.wkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135592r0(c17480aM207004N1, exc);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: c */
    public final void mo116166c(final String str) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1019, new bqr.InterfaceC16083a() { // from class: l.jld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135595t(c17480aM207004N1, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: d */
    public void mo11825d(final qyb qybVar) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 27, new bqr.InterfaceC16083a() { // from class: l.ckd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135542D(c17480aM206998H1, qybVar);
            }
        });
    }

    @Override // p153l.dk0
    @CallSuper
    /* JADX INFO: renamed from: d0 */
    public void mo116167d0(hk0 hk0Var) {
        w11.m204369e(hk0Var);
        this.f189675f.m105957c(hk0Var);
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: e */
    public final void mo116168e(final String str) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1012, new bqr.InterfaceC16083a() { // from class: l.mkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135543E(c17480aM207004N1, str);
            }
        });
    }

    @Override // p153l.dk0
    @CallSuper
    /* JADX INFO: renamed from: e0 */
    public void mo116169e0(hk0 hk0Var) {
        this.f189675f.m105964j(hk0Var);
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: f */
    public final void mo116170f(final String str, final long j, final long j2) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1008, new bqr.InterfaceC16083a() { // from class: l.ijd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206939D1(c17480aM207004N1, str, j2, j, (hk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: f0 */
    public final void mo11826f0(final int i, final int i2) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 24, new bqr.InterfaceC16083a() { // from class: l.yjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135556U(c17480aM207004N1, i, i2);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: g */
    public final void mo116171g(final C1894k c1894k, @Nullable final nid nidVar) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1009, new bqr.InterfaceC16083a() { // from class: l.mjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206989v1(c17480aM207004N1, c1894k, nidVar, (hk0) obj);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: h */
    public final void mo116172h(final C1894k c1894k, @Nullable final nid nidVar) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1017, new bqr.InterfaceC16083a() { // from class: l.fkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206991w1(c17480aM207004N1, c1894k, nidVar, (hk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: h0 */
    public void mo11828h0(final C1861d0 c1861d0) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 2, new bqr.InterfaceC16083a() { // from class: l.skd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135567e(c17480aM206998H1, c1861d0);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: i */
    public final void mo116173i(final int i, final long j) {
        final hk0.C17480a c17480aM207003M1 = m207003M1();
        m207007Q1(c17480aM207003M1, 1018, new bqr.InterfaceC16083a() { // from class: l.tkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135598v(c17480aM207003M1, i, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: i0 */
    public final void mo11829i0(final boolean z) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 3, new bqr.InterfaceC16083a() { // from class: l.lld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206967c1(c17480aM206998H1, z, (hk0) obj);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: j */
    public final void mo116174j(final Exception exc) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, new bqr.InterfaceC16083a() { // from class: l.kjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135590q0(c17480aM207004N1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: j0 */
    public final void mo9971j0(int i, @Nullable InterfaceC1988i.b bVar, final Exception exc) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1024, new bqr.InterfaceC16083a() { // from class: l.zkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135547I(c17480aM207002L1, exc);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: k */
    public final void mo116175k(final long j, final int i) {
        final hk0.C17480a c17480aM207003M1 = m207003M1();
        m207007Q1(c17480aM207003M1, 1021, new bqr.InterfaceC16083a() { // from class: l.xkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135541C(c17480aM207003M1, j, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: k0 */
    public final void mo11830k0(final float f) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 22, new bqr.InterfaceC16083a() { // from class: l.fld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135551O(c17480aM207004N1, f);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: l */
    public final void mo116176l(final String str, final long j, final long j2) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1016, new bqr.InterfaceC16083a() { // from class: l.ikd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206941E1(c17480aM207004N1, str, j2, j, (hk0) obj);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: m */
    public final void mo116177m(final jid jidVar) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1015, new bqr.InterfaceC16083a() { // from class: l.gkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135591r(c17480aM207004N1, jidVar);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: m0 */
    public final void mo116178m0(List<InterfaceC1988i.b> list, @Nullable InterfaceC1988i.b bVar) {
        this.f189673d.m207018k(list, bVar, (InterfaceC2026t) w11.m204369e(this.f189676g));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: n */
    public final void mo11832n(final Metadata metadata) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 28, new bqr.InterfaceC16083a() { // from class: l.ild
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135546H(c17480aM206998H1, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: n0 */
    public final void mo11833n0(final boolean z, final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, -1, new bqr.InterfaceC16083a() { // from class: l.rjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135581l0(c17480aM206998H1, z, i);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: o */
    public final void mo116179o(final jid jidVar) {
        final hk0.C17480a c17480aM207003M1 = m207003M1();
        m207007Q1(c17480aM207003M1, 1020, new bqr.InterfaceC16083a() { // from class: l.pkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).mo100944B(c17480aM207003M1, jidVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: o0 */
    public final void mo11834o0(@Nullable final C1944n c1944n, final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 1, new bqr.InterfaceC16083a() { // from class: l.bkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135563b(c17480aM206998H1, c1944n, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: p */
    public void mo11835p(final List<myb> list) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 27, new bqr.InterfaceC16083a() { // from class: l.rkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135558X(c17480aM206998H1, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1989j
    /* JADX INFO: renamed from: p0 */
    public final void mo10946p0(int i, @Nullable InterfaceC1988i.b bVar, final ktx ktxVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, 1004, new bqr.InterfaceC16083a() { // from class: l.wjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).mo100967w(c17480aM207002L1, ktxVar);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: q */
    public final void mo116180q(final long j) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1010, new bqr.InterfaceC16083a() { // from class: l.okd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135544F(c17480aM207004N1, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1877b
    /* JADX INFO: renamed from: q0 */
    public final void mo9972q0(int i, @Nullable InterfaceC1988i.b bVar) {
        final hk0.C17480a c17480aM207002L1 = m207002L1(i, bVar);
        m207007Q1(c17480aM207002L1, TXLiteAVCode.EVT_HW_ENCODER_START_SUCC, new bqr.InterfaceC16083a() { // from class: l.qkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135540A(c17480aM207002L1);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: r */
    public final void mo116181r(final Exception exc) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1030, new bqr.InterfaceC16083a() { // from class: l.jjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135602y(c17480aM207004N1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: r0 */
    public void mo11836r0(final C1945o c1945o) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 15, new bqr.InterfaceC16083a() { // from class: l.xjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135573h(c17480aM206998H1, c1945o);
            }
        });
    }

    @Override // p153l.dk0
    @CallSuper
    public void release() {
        ((sxk) w11.m204373i(this.f189677h)).mo131271i(new Runnable() { // from class: l.ojd
            @Override // java.lang.Runnable
            public final void run() {
                this.f147650a.m207006P1();
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: s */
    public final void mo11837s(final C1953s c1953s) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 12, new bqr.InterfaceC16083a() { // from class: l.pjd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135575i(c17480aM206998H1, c1953s);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: t */
    public final void mo116182t(final jid jidVar) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1007, new bqr.InterfaceC16083a() { // from class: l.cld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135583m0(c17480aM207004N1, jidVar);
            }
        });
    }

    @Override // p153l.md2.InterfaceC18588a
    /* JADX INFO: renamed from: u */
    public final void mo157945u(final int i, final long j, final long j2) {
        final hk0.C17480a c17480aM207001K1 = m207001K1();
        m207007Q1(c17480aM207001K1, 1006, new bqr.InterfaceC16083a() { // from class: l.ekd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).mo100966u0(c17480aM207001K1, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: u0 */
    public final void mo11838u0(final int i) {
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 8, new bqr.InterfaceC16083a() { // from class: l.nkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135555T(c17480aM206998H1, i);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: v */
    public final void mo116183v(final jid jidVar) {
        final hk0.C17480a c17480aM207003M1 = m207003M1();
        m207007Q1(c17480aM207003M1, 1013, new bqr.InterfaceC16083a() { // from class: l.lkd
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135586o(c17480aM207003M1, jidVar);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: w */
    public final void mo116184w(final Object obj, final long j) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 26, new bqr.InterfaceC16083a() { // from class: l.nld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj2) {
                ((hk0) obj2).m135569f(c17480aM207004N1, obj, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: x */
    public final void mo11839x(final zjl0 zjl0Var) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 25, new bqr.InterfaceC16083a() { // from class: l.mld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206961W0(c17480aM207004N1, zjl0Var, (hk0) obj);
            }
        });
    }

    @Override // p153l.dk0
    /* JADX INFO: renamed from: y */
    public final void mo116185y(final int i, final long j, final long j2) {
        final hk0.C17480a c17480aM207004N1 = m207004N1();
        m207007Q1(c17480aM207004N1, 1011, new bqr.InterfaceC16083a() { // from class: l.old
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                ((hk0) obj).m135584n(c17480aM207004N1, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: z */
    public final void mo11840z(final InterfaceC2026t.e eVar, final InterfaceC2026t.e eVar2, final int i) {
        if (i == 1) {
            this.f189678i = false;
        }
        this.f189673d.m207017j((InterfaceC2026t) w11.m204369e(this.f189676g));
        final hk0.C17480a c17480aM206998H1 = m206998H1();
        m207007Q1(c17480aM206998H1, 11, new bqr.InterfaceC16083a() { // from class: l.bld
            @Override // p153l.bqr.InterfaceC16083a
            public final void invoke(Object obj) {
                wld.m206935B1(c17480aM206998H1, i, eVar, eVar2, (hk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: b0 */
    public void mo11824b0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: A */
    public void mo11807A(boolean z) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: g0 */
    public void mo11827g0(int i) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2026t.d
    /* JADX INFO: renamed from: l0 */
    public void mo11831l0(InterfaceC2026t interfaceC2026t, InterfaceC2026t.c cVar) {
    }
}
