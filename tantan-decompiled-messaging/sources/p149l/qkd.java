package p149l;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1868h;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.C1930s;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class qkd implements hk0 {

    /* JADX INFO: renamed from: a */
    public final p95 f155099a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1834c0.b f155100b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1834c0.d f155101c;

    /* JADX INFO: renamed from: d */
    public final C19529a f155102d;

    /* JADX INFO: renamed from: e */
    public final SparseArray<lk0.C18238a> f155103e;

    /* JADX INFO: renamed from: f */
    public aor<lk0> f155104f;

    /* JADX INFO: renamed from: g */
    public InterfaceC2003t f155105g;

    /* JADX INFO: renamed from: h */
    public cvk f155106h;

    /* JADX INFO: renamed from: i */
    public boolean f155107i;

    /* JADX INFO: renamed from: l.qkd$a */
    public static final class C19529a {

        /* JADX INFO: renamed from: a */
        public final AbstractC1834c0.b f155108a;

        /* JADX INFO: renamed from: b */
        public ImmutableList<InterfaceC1965i.b> f155109b = ImmutableList.m15685of();

        /* JADX INFO: renamed from: c */
        public ImmutableMap<InterfaceC1965i.b, AbstractC1834c0> f155110c = ImmutableMap.m15715of();

        /* JADX INFO: renamed from: d */
        @Nullable
        public InterfaceC1965i.b f155111d;

        /* JADX INFO: renamed from: e */
        public InterfaceC1965i.b f155112e;

        /* JADX INFO: renamed from: f */
        public InterfaceC1965i.b f155113f;

        public C19529a(AbstractC1834c0.b bVar) {
            this.f155108a = bVar;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public static InterfaceC1965i.b m175345c(InterfaceC2003t interfaceC2003t, ImmutableList<InterfaceC1965i.b> immutableList, @Nullable InterfaceC1965i.b bVar, AbstractC1834c0.b bVar2) {
            AbstractC1834c0 currentTimeline = interfaceC2003t.getCurrentTimeline();
            int currentPeriodIndex = interfaceC2003t.getCurrentPeriodIndex();
            Object objMo9402q = currentTimeline.m9722u() ? null : currentTimeline.mo9402q(currentPeriodIndex);
            int iM9730g = (interfaceC2003t.isPlayingAd() || currentTimeline.m9722u()) ? -1 : currentTimeline.m9716j(currentPeriodIndex, bVar2).m9730g(vck0.m197806J0(interfaceC2003t.getCurrentPosition()) - bVar2.m9740q());
            for (int i = 0; i < immutableList.size(); i++) {
                InterfaceC1965i.b bVar3 = immutableList.get(i);
                if (m175346i(bVar3, objMo9402q, interfaceC2003t.isPlayingAd(), interfaceC2003t.getCurrentAdGroupIndex(), interfaceC2003t.getCurrentAdIndexInAdGroup(), iM9730g)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null && m175346i(bVar, objMo9402q, interfaceC2003t.isPlayingAd(), interfaceC2003t.getCurrentAdGroupIndex(), interfaceC2003t.getCurrentAdIndexInAdGroup(), iM9730g)) {
                return bVar;
            }
            return null;
        }

        /* JADX INFO: renamed from: i */
        public static boolean m175346i(InterfaceC1965i.b bVar, @Nullable Object obj, boolean z, int i, int i2, int i3) {
            if (!bVar.f114355a.equals(obj)) {
                return false;
            }
            if (z && bVar.f114356b == i && bVar.f114357c == i2) {
                return true;
            }
            return !z && bVar.f114356b == -1 && bVar.f114359e == i3;
        }

        /* JADX INFO: renamed from: b */
        public final void m175347b(ImmutableMap.C2786b<InterfaceC1965i.b, AbstractC1834c0> c2786b, @Nullable InterfaceC1965i.b bVar, AbstractC1834c0 abstractC1834c0) {
            if (bVar == null) {
                return;
            }
            if (abstractC1834c0.mo9396f(bVar.f114355a) != -1) {
                c2786b.mo15661g(bVar, abstractC1834c0);
                return;
            }
            AbstractC1834c0 abstractC1834c1 = this.f155110c.get(bVar);
            if (abstractC1834c1 != null) {
                c2786b.mo15661g(bVar, abstractC1834c1);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public InterfaceC1965i.b m175348d() {
            return this.f155111d;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public InterfaceC1965i.b m175349e() {
            if (this.f155109b.isEmpty()) {
                return null;
            }
            return (InterfaceC1965i.b) aiq.m96881g(this.f155109b);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public AbstractC1834c0 m175350f(InterfaceC1965i.b bVar) {
            return this.f155110c.get(bVar);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public InterfaceC1965i.b m175351g() {
            return this.f155112e;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public InterfaceC1965i.b m175352h() {
            return this.f155113f;
        }

        /* JADX INFO: renamed from: j */
        public void m175353j(InterfaceC2003t interfaceC2003t) {
            this.f155111d = m175345c(interfaceC2003t, this.f155109b, this.f155112e, this.f155108a);
        }

        /* JADX INFO: renamed from: k */
        public void m175354k(List<InterfaceC1965i.b> list, @Nullable InterfaceC1965i.b bVar, InterfaceC2003t interfaceC2003t) {
            this.f155109b = ImmutableList.copyOf((Collection) list);
            if (!list.isEmpty()) {
                this.f155112e = list.get(0);
                this.f155113f = (InterfaceC1965i.b) p11.m167011e(bVar);
            }
            if (this.f155111d == null) {
                this.f155111d = m175345c(interfaceC2003t, this.f155109b, this.f155112e, this.f155108a);
            }
            m175356m(interfaceC2003t.getCurrentTimeline());
        }

        /* JADX INFO: renamed from: l */
        public void m175355l(InterfaceC2003t interfaceC2003t) {
            this.f155111d = m175345c(interfaceC2003t, this.f155109b, this.f155112e, this.f155108a);
            m175356m(interfaceC2003t.getCurrentTimeline());
        }

        /* JADX INFO: renamed from: m */
        public final void m175356m(AbstractC1834c0 abstractC1834c0) {
            ImmutableList<InterfaceC1965i.b> immutableList;
            ImmutableMap.C2786b<InterfaceC1965i.b, AbstractC1834c0> c2786bBuilder = ImmutableMap.builder();
            if (this.f155109b.isEmpty()) {
                m175347b(c2786bBuilder, this.f155112e, abstractC1834c0);
                if (!v050.m196470a(this.f155113f, this.f155112e)) {
                    m175347b(c2786bBuilder, this.f155113f, abstractC1834c0);
                }
                if (!v050.m196470a(this.f155111d, this.f155112e) && !v050.m196470a(this.f155111d, this.f155113f)) {
                    m175347b(c2786bBuilder, this.f155111d, abstractC1834c0);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.f155109b.size();
                    immutableList = this.f155109b;
                    if (i >= size) {
                        break;
                    }
                    m175347b(c2786bBuilder, immutableList.get(i), abstractC1834c0);
                    i++;
                }
                if (!immutableList.contains(this.f155111d)) {
                    m175347b(c2786bBuilder, this.f155111d, abstractC1834c0);
                }
            }
            this.f155110c = c2786bBuilder.mo15660d();
        }
    }

    public qkd(p95 p95Var) {
        this.f155099a = (p95) p11.m167011e(p95Var);
        this.f155104f = new aor<>(vck0.m197821R(), p95Var, new aor.InterfaceC15679b() { // from class: l.djd
            @Override // p149l.aor.InterfaceC15679b
            /* JADX INFO: renamed from: a */
            public final void mo97946a(Object obj, dpi dpiVar) {
                qkd.m175270B0((lk0) obj, dpiVar);
            }
        });
        AbstractC1834c0.b bVar = new AbstractC1834c0.b();
        this.f155100b = bVar;
        this.f155101c = new AbstractC1834c0.d();
        this.f155102d = new C19529a(bVar);
        this.f155103e = new SparseArray<>();
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ void m175270B0(lk0 lk0Var, dpi dpiVar) {
    }

    /* JADX INFO: renamed from: B1 */
    public static /* synthetic */ void m175271B1(lk0.C18238a c18238a, int i, InterfaceC2003t.e eVar, InterfaceC2003t.e eVar2, lk0 lk0Var) {
        lk0Var.m150079c(c18238a, i);
        lk0Var.mo112960b0(c18238a, eVar, eVar2, i);
    }

    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ void m175275D1(lk0.C18238a c18238a, String str, long j, long j2, lk0 lk0Var) {
        lk0Var.m150094k0(c18238a, str, j);
        lk0Var.m150065N(c18238a, str, j2, j);
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m175277E1(lk0.C18238a c18238a, String str, long j, long j2, lk0 lk0Var) {
        lk0Var.m150089h0(c18238a, str, j);
        lk0Var.m150115w0(c18238a, str, j2, j);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m175293S0(lk0.C18238a c18238a, int i, lk0 lk0Var) {
        lk0Var.m150093k(c18238a);
        lk0Var.m150092j0(c18238a, i);
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m175297W0(lk0.C18238a c18238a, val0 val0Var, lk0 lk0Var) {
        lk0Var.mo112961j(c18238a, val0Var);
        lk0Var.m150083e0(c18238a, val0Var.f180765a, val0Var.f180766b, val0Var.f180767c, val0Var.f180768d);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m175303c1(lk0.C18238a c18238a, boolean z, lk0 lk0Var) {
        lk0Var.m150085f0(c18238a, z);
        lk0Var.m150064K(c18238a, z);
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m175325v1(lk0.C18238a c18238a, C1871k c1871k, hhd hhdVar, lk0 lk0Var) {
        lk0Var.m150077a0(c18238a, c1871k);
        lk0Var.m150080c0(c18238a, c1871k, hhdVar);
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m175327w1(lk0.C18238a c18238a, C1871k c1871k, hhd hhdVar, lk0 lk0Var) {
        lk0Var.m150111t0(c18238a, c1871k);
        lk0Var.m150060G(c18238a, c1871k, hhdVar);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: B */
    public final void mo10886B(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1002, new aor.InterfaceC15678a() { // from class: l.mkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150118z(c18238aM175338L1, lrvVar, nkxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: C */
    public final void mo11754C(AbstractC1834c0 abstractC1834c0, final int i) {
        this.f155102d.m175355l((InterfaceC2003t) p11.m167011e(this.f155105g));
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 0, new aor.InterfaceC15678a() { // from class: l.xjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150072W(c18238aM175334H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: D */
    public final void mo11755D(final int i) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 21, new aor.InterfaceC15678a() { // from class: l.oid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150091i0(c18238aM175340N1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: E */
    public void mo11756E(final C1922o c1922o) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 14, new aor.InterfaceC15678a() { // from class: l.hid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150103p(c18238aM175334H1, c1922o);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: F */
    public final void mo11757F(final boolean z) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 9, new aor.InterfaceC15678a() { // from class: l.fid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150109s0(c18238aM175334H1, z);
            }
        });
    }

    @Override // p149l.hk0
    @CallSuper
    /* JADX INFO: renamed from: G */
    public void mo131425G(final InterfaceC2003t interfaceC2003t, Looper looper) {
        p11.m167013g(this.f155105g == null || this.f155102d.f155109b.isEmpty());
        this.f155105g = (InterfaceC2003t) p11.m167011e(interfaceC2003t);
        this.f155106h = this.f155099a.mo167857c(looper, null);
        this.f155104f = this.f155104f.m97938e(looper, new aor.InterfaceC15679b() { // from class: l.pid
            @Override // p149l.aor.InterfaceC15679b
            /* JADX INFO: renamed from: a */
            public final void mo97946a(Object obj, dpi dpiVar) {
                lk0 lk0Var = (lk0) obj;
                lk0Var.mo112962q(interfaceC2003t, new lk0.C18239b(dpiVar, this.f149539a.f155103e));
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: H */
    public void mo11758H(final int i, final boolean z) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 30, new aor.InterfaceC15678a() { // from class: l.bkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150063J(c18238aM175334H1, i, z);
            }
        });
    }

    /* JADX INFO: renamed from: H1 */
    public final lk0.C18238a m175334H1() {
        return m175336J1(this.f155102d.m175348d());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: I */
    public void mo11759I(@Nullable final PlaybackException playbackException) {
        final lk0.C18238a c18238aM175341O1 = m175341O1(playbackException);
        m175343Q1(c18238aM175341O1, 10, new aor.InterfaceC15678a() { // from class: l.ojd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150102o0(c18238aM175341O1, playbackException);
            }
        });
    }

    @RequiresNonNull({GameIdentity.player})
    /* JADX INFO: renamed from: I1 */
    public final lk0.C18238a m175335I1(AbstractC1834c0 abstractC1834c0, int i, @Nullable InterfaceC1965i.b bVar) {
        InterfaceC1965i.b bVar2 = abstractC1834c0.m9722u() ? null : bVar;
        long jElapsedRealtime = this.f155099a.elapsedRealtime();
        boolean z = abstractC1834c0.equals(this.f155105g.getCurrentTimeline()) && i == this.f155105g.getCurrentMediaItemIndex();
        long jM9750d = 0;
        if (bVar2 == null || !bVar2.m137607b()) {
            if (z) {
                jM9750d = this.f155105g.getContentPosition();
            } else if (!abstractC1834c0.m9722u()) {
                jM9750d = abstractC1834c0.m9720r(i, this.f155101c).m9750d();
            }
        } else if (z && this.f155105g.getCurrentAdGroupIndex() == bVar2.f114356b && this.f155105g.getCurrentAdIndexInAdGroup() == bVar2.f114357c) {
            jM9750d = this.f155105g.getCurrentPosition();
        }
        return new lk0.C18238a(jElapsedRealtime, abstractC1834c0, i, bVar2, jM9750d, this.f155105g.getCurrentTimeline(), this.f155105g.getCurrentMediaItemIndex(), this.f155102d.m175348d(), this.f155105g.getCurrentPosition(), this.f155105g.getTotalBufferedDuration());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: J */
    public final void mo11760J(final PlaybackException playbackException) {
        final lk0.C18238a c18238aM175341O1 = m175341O1(playbackException);
        m175343Q1(c18238aM175341O1, 10, new aor.InterfaceC15678a() { // from class: l.uid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).mo112955S(c18238aM175341O1, playbackException);
            }
        });
    }

    /* JADX INFO: renamed from: J1 */
    public final lk0.C18238a m175336J1(@Nullable InterfaceC1965i.b bVar) {
        p11.m167011e(this.f155105g);
        AbstractC1834c0 abstractC1834c0M175350f = bVar == null ? null : this.f155102d.m175350f(bVar);
        if (bVar != null && abstractC1834c0M175350f != null) {
            return m175335I1(abstractC1834c0M175350f, abstractC1834c0M175350f.mo9400l(bVar.f114355a, this.f155100b).f7302c, bVar);
        }
        int currentMediaItemIndex = this.f155105g.getCurrentMediaItemIndex();
        AbstractC1834c0 currentTimeline = this.f155105g.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.mo9721t()) {
            currentTimeline = AbstractC1834c0.f7289a;
        }
        return m175335I1(currentTimeline, currentMediaItemIndex, null);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: K */
    public void mo11761K(final w6j0 w6j0Var) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 19, new aor.InterfaceC15678a() { // from class: l.ejd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150068Q(c18238aM175334H1, w6j0Var);
            }
        });
    }

    /* JADX INFO: renamed from: K1 */
    public final lk0.C18238a m175337K1() {
        return m175336J1(this.f155102d.m175349e());
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: L */
    public final void mo10888L(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1000, new aor.InterfaceC15678a() { // from class: l.ujd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150112u(c18238aM175338L1, lrvVar, nkxVar);
            }
        });
    }

    /* JADX INFO: renamed from: L1 */
    public final lk0.C18238a m175338L1(int i, @Nullable InterfaceC1965i.b bVar) {
        p11.m167011e(this.f155105g);
        if (bVar != null) {
            return this.f155102d.m175350f(bVar) != null ? m175336J1(bVar) : m175335I1(AbstractC1834c0.f7289a, i, bVar);
        }
        AbstractC1834c0 currentTimeline = this.f155105g.getCurrentTimeline();
        if (i >= currentTimeline.mo9721t()) {
            currentTimeline = AbstractC1834c0.f7289a;
        }
        return m175335I1(currentTimeline, i, null);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: M */
    public final void mo11762M(final C1818a c1818a) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 20, new aor.InterfaceC15678a() { // from class: l.pkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150075Z(c18238aM175340N1, c1818a);
            }
        });
    }

    /* JADX INFO: renamed from: M1 */
    public final lk0.C18238a m175339M1() {
        return m175336J1(this.f155102d.m175351g());
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: N */
    public final void mo9912N(int i, @Nullable InterfaceC1965i.b bVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1023, new aor.InterfaceC15678a() { // from class: l.kkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150081d0(c18238aM175338L1);
            }
        });
    }

    /* JADX INFO: renamed from: N1 */
    public final lk0.C18238a m175340N1() {
        return m175336J1(this.f155102d.m175352h());
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: O */
    public final void mo11763O(final boolean z, final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 5, new aor.InterfaceC15678a() { // from class: l.nid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150067P(c18238aM175334H1, z, i);
            }
        });
    }

    /* JADX INFO: renamed from: O1 */
    public final lk0.C18238a m175341O1(@Nullable PlaybackException playbackException) {
        ipx ipxVar;
        return (!(playbackException instanceof ExoPlaybackException) || (ipxVar = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? m175334H1() : m175336J1(new InterfaceC1965i.b(ipxVar));
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: P */
    public final void mo9913P(int i, @Nullable InterfaceC1965i.b bVar, final int i2) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1022, new aor.InterfaceC15678a() { // from class: l.yjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175293S0(c18238aM175338L1, i2, (lk0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public final void m175342P1() {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, TXLiteAVCode.EVT_SW_ENCODER_START_SUCC, new aor.InterfaceC15678a() { // from class: l.jkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150108s(c18238aM175334H1);
            }
        });
        this.f155104f.m97942i();
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: Q */
    public final void mo9914Q(int i, @Nullable InterfaceC1965i.b bVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1025, new aor.InterfaceC15678a() { // from class: l.lkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150069R(c18238aM175338L1);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m175343Q1(lk0.C18238a c18238a, int i, aor.InterfaceC15678a<lk0> interfaceC15678a) {
        this.f155103e.put(i, c18238a);
        this.f155104f.m97944k(i, interfaceC15678a);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: R */
    public void mo11764R(final boolean z) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 7, new aor.InterfaceC15678a() { // from class: l.okd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150095l(c18238aM175334H1, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: S */
    public final void mo11765S(final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 6, new aor.InterfaceC15678a() { // from class: l.pjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150087g0(c18238aM175334H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: T */
    public void mo11766T(final InterfaceC2003t.b bVar) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 13, new aor.InterfaceC15678a() { // from class: l.xid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150116x0(c18238aM175334H1, bVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: U */
    public final void mo11767U(final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 4, new aor.InterfaceC15678a() { // from class: l.bjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150100n0(c18238aM175334H1, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: V */
    public final void mo10889V(int i, @Nullable InterfaceC1965i.b bVar, final nkx nkxVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1005, new aor.InterfaceC15678a() { // from class: l.sjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150086g(c18238aM175338L1, nkxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: W */
    public void mo11768W(final C1868h c1868h) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 29, new aor.InterfaceC15678a() { // from class: l.akd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150114v0(c18238aM175334H1, c1868h);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: X */
    public final void mo131426X() {
        if (this.f155107i) {
            return;
        }
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        this.f155107i = true;
        m175343Q1(c18238aM175334H1, -1, new aor.InterfaceC15678a() { // from class: l.mid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150097m(c18238aM175334H1);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: Y */
    public final void mo10890Y(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1001, new aor.InterfaceC15678a() { // from class: l.kid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150104p0(c18238aM175338L1, lrvVar, nkxVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: Z */
    public final void mo10891Z(int i, @Nullable InterfaceC1965i.b bVar, final lrv lrvVar, final nkx nkxVar, final IOException iOException, final boolean z) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1003, new aor.InterfaceC15678a() { // from class: l.tid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).mo112947L(c18238aM175338L1, lrvVar, nkxVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: a */
    public final void mo11769a(final boolean z) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 23, new aor.InterfaceC15678a() { // from class: l.nkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150074Y(c18238aM175340N1, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: a0 */
    public final void mo9915a0(int i, @Nullable InterfaceC1965i.b bVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, TXLiteAVCode.EVT_RTMP_PUSH_PUBLISH_START, new aor.InterfaceC15678a() { // from class: l.ekd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150076a(c18238aM175338L1);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: b */
    public final void mo131427b(final Exception exc) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1014, new aor.InterfaceC15678a() { // from class: l.qjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150107r0(c18238aM175340N1, exc);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: c */
    public final void mo131428c(final String str) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1019, new aor.InterfaceC15678a() { // from class: l.dkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150110t(c18238aM175340N1, str);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: d */
    public void mo11771d(final cxb cxbVar) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 27, new aor.InterfaceC15678a() { // from class: l.wid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150057D(c18238aM175334H1, cxbVar);
            }
        });
    }

    @Override // p149l.hk0
    @CallSuper
    /* JADX INFO: renamed from: d0 */
    public void mo131429d0(lk0 lk0Var) {
        p11.m167011e(lk0Var);
        this.f155104f.m97936c(lk0Var);
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: e */
    public final void mo131430e(final String str) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1012, new aor.InterfaceC15678a() { // from class: l.gjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150058E(c18238aM175340N1, str);
            }
        });
    }

    @Override // p149l.hk0
    @CallSuper
    /* JADX INFO: renamed from: e0 */
    public void mo131431e0(lk0 lk0Var) {
        this.f155104f.m97943j(lk0Var);
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: f */
    public final void mo131432f(final String str, final long j, final long j2) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1008, new aor.InterfaceC15678a() { // from class: l.cid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175275D1(c18238aM175340N1, str, j2, j, (lk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: f0 */
    public final void mo11772f0(final int i, final int i2) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 24, new aor.InterfaceC15678a() { // from class: l.sid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150071U(c18238aM175340N1, i, i2);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: g */
    public final void mo131433g(final C1871k c1871k, @Nullable final hhd hhdVar) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1009, new aor.InterfaceC15678a() { // from class: l.gid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175325v1(c18238aM175340N1, c1871k, hhdVar, (lk0) obj);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: h */
    public final void mo131434h(final C1871k c1871k, @Nullable final hhd hhdVar) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1017, new aor.InterfaceC15678a() { // from class: l.zid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175327w1(c18238aM175340N1, c1871k, hhdVar, (lk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: h0 */
    public void mo11774h0(final C1838d0 c1838d0) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 2, new aor.InterfaceC15678a() { // from class: l.mjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150082e(c18238aM175334H1, c1838d0);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: i */
    public final void mo131435i(final int i, final long j) {
        final lk0.C18238a c18238aM175339M1 = m175339M1();
        m175343Q1(c18238aM175339M1, 1018, new aor.InterfaceC15678a() { // from class: l.njd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150113v(c18238aM175339M1, i, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: i0 */
    public final void mo11775i0(final boolean z) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 3, new aor.InterfaceC15678a() { // from class: l.fkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175303c1(c18238aM175334H1, z, (lk0) obj);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: j */
    public final void mo131436j(final Exception exc) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, new aor.InterfaceC15678a() { // from class: l.eid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150105q0(c18238aM175340N1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: j0 */
    public final void mo9917j0(int i, @Nullable InterfaceC1965i.b bVar, final Exception exc) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1024, new aor.InterfaceC15678a() { // from class: l.tjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150062I(c18238aM175338L1, exc);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: k */
    public final void mo131437k(final long j, final int i) {
        final lk0.C18238a c18238aM175339M1 = m175339M1();
        m175343Q1(c18238aM175339M1, 1021, new aor.InterfaceC15678a() { // from class: l.rjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150056C(c18238aM175339M1, j, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: k0 */
    public final void mo11776k0(final float f) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 22, new aor.InterfaceC15678a() { // from class: l.zjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150066O(c18238aM175340N1, f);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: l */
    public final void mo131438l(final String str, final long j, final long j2) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1016, new aor.InterfaceC15678a() { // from class: l.cjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175277E1(c18238aM175340N1, str, j2, j, (lk0) obj);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: m */
    public final void mo131439m(final dhd dhdVar) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1015, new aor.InterfaceC15678a() { // from class: l.ajd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150106r(c18238aM175340N1, dhdVar);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: m0 */
    public final void mo131440m0(List<InterfaceC1965i.b> list, @Nullable InterfaceC1965i.b bVar) {
        this.f155102d.m175354k(list, bVar, (InterfaceC2003t) p11.m167011e(this.f155105g));
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: n */
    public final void mo11778n(final Metadata metadata) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 28, new aor.InterfaceC15678a() { // from class: l.ckd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150061H(c18238aM175334H1, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: n0 */
    public final void mo11779n0(final boolean z, final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, -1, new aor.InterfaceC15678a() { // from class: l.lid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150096l0(c18238aM175334H1, z, i);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: o */
    public final void mo131441o(final dhd dhdVar) {
        final lk0.C18238a c18238aM175339M1 = m175339M1();
        m175343Q1(c18238aM175339M1, 1020, new aor.InterfaceC15678a() { // from class: l.jjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).mo112944B(c18238aM175339M1, dhdVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: o0 */
    public final void mo11780o0(@Nullable final C1921n c1921n, final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 1, new aor.InterfaceC15678a() { // from class: l.vid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150078b(c18238aM175334H1, c1921n, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: p */
    public void mo11781p(final List<ywb> list) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 27, new aor.InterfaceC15678a() { // from class: l.ljd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150073X(c18238aM175334H1, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC1966j
    /* JADX INFO: renamed from: p0 */
    public final void mo10892p0(int i, @Nullable InterfaceC1965i.b bVar, final nkx nkxVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, 1004, new aor.InterfaceC15678a() { // from class: l.qid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).mo112964w(c18238aM175338L1, nkxVar);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: q */
    public final void mo131442q(final long j) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1010, new aor.InterfaceC15678a() { // from class: l.ijd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150059F(c18238aM175340N1, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1854b
    /* JADX INFO: renamed from: q0 */
    public final void mo9918q0(int i, @Nullable InterfaceC1965i.b bVar) {
        final lk0.C18238a c18238aM175338L1 = m175338L1(i, bVar);
        m175343Q1(c18238aM175338L1, TXLiteAVCode.EVT_HW_ENCODER_START_SUCC, new aor.InterfaceC15678a() { // from class: l.kjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150055A(c18238aM175338L1);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: r */
    public final void mo131443r(final Exception exc) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1030, new aor.InterfaceC15678a() { // from class: l.did
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150117y(c18238aM175340N1, exc);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: r0 */
    public void mo11782r0(final C1922o c1922o) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 15, new aor.InterfaceC15678a() { // from class: l.rid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150088h(c18238aM175334H1, c1922o);
            }
        });
    }

    @Override // p149l.hk0
    @CallSuper
    public void release() {
        ((cvk) p11.m167015i(this.f155106h)).mo108865a(new Runnable() { // from class: l.iid
            @Override // java.lang.Runnable
            public final void run() {
                this.f113396a.m175342P1();
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: s */
    public final void mo11783s(final C1930s c1930s) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 12, new aor.InterfaceC15678a() { // from class: l.jid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150090i(c18238aM175334H1, c1930s);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: t */
    public final void mo131444t(final dhd dhdVar) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1007, new aor.InterfaceC15678a() { // from class: l.wjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150098m0(c18238aM175340N1, dhdVar);
            }
        });
    }

    @Override // p149l.fd2.InterfaceC16803a
    /* JADX INFO: renamed from: u */
    public final void mo120880u(final int i, final long j, final long j2) {
        final lk0.C18238a c18238aM175337K1 = m175337K1();
        m175343Q1(c18238aM175337K1, 1006, new aor.InterfaceC15678a() { // from class: l.yid
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).mo112963u0(c18238aM175337K1, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: u0 */
    public final void mo11784u0(final int i) {
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 8, new aor.InterfaceC15678a() { // from class: l.hjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150070T(c18238aM175334H1, i);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: v */
    public final void mo131445v(final dhd dhdVar) {
        final lk0.C18238a c18238aM175339M1 = m175339M1();
        m175343Q1(c18238aM175339M1, 1013, new aor.InterfaceC15678a() { // from class: l.fjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150101o(c18238aM175339M1, dhdVar);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: w */
    public final void mo131446w(final Object obj, final long j) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 26, new aor.InterfaceC15678a() { // from class: l.hkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj2) {
                ((lk0) obj2).m150084f(c18238aM175340N1, obj, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: x */
    public final void mo11785x(final val0 val0Var) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 25, new aor.InterfaceC15678a() { // from class: l.gkd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175297W0(c18238aM175340N1, val0Var, (lk0) obj);
            }
        });
    }

    @Override // p149l.hk0
    /* JADX INFO: renamed from: y */
    public final void mo131447y(final int i, final long j, final long j2) {
        final lk0.C18238a c18238aM175340N1 = m175340N1();
        m175343Q1(c18238aM175340N1, 1011, new aor.InterfaceC15678a() { // from class: l.ikd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                ((lk0) obj).m150099n(c18238aM175340N1, i, j, j2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: z */
    public final void mo11786z(final InterfaceC2003t.e eVar, final InterfaceC2003t.e eVar2, final int i) {
        if (i == 1) {
            this.f155107i = false;
        }
        this.f155102d.m175353j((InterfaceC2003t) p11.m167011e(this.f155105g));
        final lk0.C18238a c18238aM175334H1 = m175334H1();
        m175343Q1(c18238aM175334H1, 11, new aor.InterfaceC15678a() { // from class: l.vjd
            @Override // p149l.aor.InterfaceC15678a
            public final void invoke(Object obj) {
                qkd.m175271B1(c18238aM175334H1, i, eVar, eVar2, (lk0) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: b0 */
    public void mo11770b0() {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: A */
    public void mo11753A(boolean z) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: g0 */
    public void mo11773g0(int i) {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2003t.d
    /* JADX INFO: renamed from: l0 */
    public void mo11777l0(InterfaceC2003t interfaceC2003t, InterfaceC2003t.c cVar) {
    }
}
