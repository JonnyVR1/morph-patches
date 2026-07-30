package p153l;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zziz;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iny0 implements wfy0 {

    /* JADX INFO: renamed from: a */
    public final mfv0 f116049a;

    /* JADX INFO: renamed from: b */
    public final hwt0 f116050b;

    /* JADX INFO: renamed from: c */
    public final wyt0 f116051c;

    /* JADX INFO: renamed from: d */
    public final fny0 f116052d;

    /* JADX INFO: renamed from: e */
    public final SparseArray f116053e;

    /* JADX INFO: renamed from: f */
    public g1w0 f116054f;

    /* JADX INFO: renamed from: g */
    public oot0 f116055g;

    /* JADX INFO: renamed from: h */
    public usv0 f116056h;

    /* JADX INFO: renamed from: i */
    public boolean f116057i;

    public iny0(mfv0 mfv0Var) {
        mfv0Var.getClass();
        this.f116049a = mfv0Var;
        this.f116054f = new g1w0(mpw0.m159400M(), mfv0Var, new zyv0() { // from class: l.tjy0
            @Override // p153l.zyv0
            /* JADX INFO: renamed from: a */
            public final void mo172464a(Object obj, akr0 akr0Var) {
            }
        });
        hwt0 hwt0Var = new hwt0();
        this.f116050b = hwt0Var;
        this.f116051c = new wyt0();
        this.f116052d = new fny0(hwt0Var);
        this.f116053e = new SparseArray();
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m141185X(iny0 iny0Var) {
        final yfy0 yfy0VarM141207V = iny0Var.m141207V();
        iny0Var.m141210Z(yfy0VarM141207V, TXLiteAVCode.EVT_SW_ENCODER_START_SUCC, new mwv0() { // from class: l.hgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
        iny0Var.f116054f.m128568e();
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: A */
    public final void mo141186A(final Object obj, final long j) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 26, new mwv0() { // from class: l.lmy0
            @Override // p153l.mwv0
            public final void zza(Object obj2) {
                ((dgy0) obj2).mo115768b(yfy0VarM141218d0, obj, j);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: B */
    public final void mo141187B(final gnt0 gnt0Var, final gnt0 gnt0Var2, final int i) {
        if (i == 1) {
            this.f116057i = false;
            i = 1;
        }
        fny0 fny0Var = this.f116052d;
        oot0 oot0Var = this.f116055g;
        oot0Var.getClass();
        fny0Var.m126411g(oot0Var);
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 11, new mwv0() { // from class: l.cmy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115776m(yfy0VarM141207V, gnt0Var, gnt0Var2, i);
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: C */
    public final void mo141188C(final Exception exc) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1030, new mwv0() { // from class: l.giy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: D */
    public final void mo141189D(final long j, final int i) {
        final yfy0 yfy0VarM141216c0 = m141216c0();
        m141210Z(yfy0VarM141216c0, 1021, new mwv0(j, i) { // from class: l.wjy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: E */
    public final void mo141190E(final vwx0 vwx0Var) {
        final yfy0 yfy0VarM141216c0 = m141216c0();
        m141210Z(yfy0VarM141216c0, 1020, new mwv0() { // from class: l.nly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115778p(yfy0VarM141216c0, vwx0Var);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: F */
    public final void mo141191F(final boolean z, final int i) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 5, new mwv0(z, i) { // from class: l.rjy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: G */
    public final void mo141192G(final vwx0 vwx0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1015, new mwv0() { // from class: l.fmy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: H */
    public final void mo141193H(final Exception exc) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1014, new mwv0() { // from class: l.wmy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    @CallSuper
    /* JADX INFO: renamed from: I */
    public final void mo141194I(final oot0 oot0Var, Looper looper) {
        boolean z = true;
        if (this.f116055g != null && !this.f116052d.f99986b.isEmpty()) {
            z = false;
        }
        lev0.m153958f(z);
        oot0Var.getClass();
        this.f116055g = oot0Var;
        this.f116056h = this.f116049a.mo135184a(looper, null);
        this.f116054f = this.f116054f.m128564a(looper, new zyv0() { // from class: l.piy0
            @Override // p153l.zyv0
            /* JADX INFO: renamed from: a */
            public final void mo172464a(Object obj, akr0 akr0Var) {
                this.f152629a.m141209Y(oot0Var, (dgy0) obj, akr0Var);
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: J */
    public final void mo141195J(List list, @Nullable kzy0 kzy0Var) {
        oot0 oot0Var = this.f116055g;
        oot0Var.getClass();
        this.f116052d.m126412h(list, kzy0Var, oot0Var);
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: K */
    public final void mo141196K(d0u0 d0u0Var, final int i) {
        oot0 oot0Var = this.f116055g;
        oot0Var.getClass();
        this.f116052d.m126413i(oot0Var);
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 0, new mwv0(i) { // from class: l.rhy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: L */
    public final void mo141197L(final sqr0 sqr0Var, @Nullable final zwx0 zwx0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1009, new mwv0() { // from class: l.zly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115767a(yfy0VarM141218d0, sqr0Var, zwx0Var);
            }
        });
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: M */
    public final void mo141198M(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final yfy0 yfy0VarM141214b0 = m141214b0(i, kzy0Var);
        m141210Z(yfy0VarM141214b0, 1000, new mwv0() { // from class: l.qgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: N */
    public final void mo141199N(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final yfy0 yfy0VarM141214b0 = m141214b0(i, kzy0Var);
        m141210Z(yfy0VarM141214b0, 1002, new mwv0() { // from class: l.bky0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: O */
    public final void mo141200O(final rzs0 rzs0Var) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 14, new mwv0() { // from class: l.zmy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: P */
    public final void mo141201P(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final yfy0 yfy0VarM141214b0 = m141214b0(i, kzy0Var);
        m141210Z(yfy0VarM141214b0, 1001, new mwv0() { // from class: l.hly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: Q */
    public final void mo141202Q(final boolean z, final int i) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, -1, new mwv0(z, i) { // from class: l.siy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    @CallSuper
    /* JADX INFO: renamed from: R */
    public final void mo141203R(dgy0 dgy0Var) {
        this.f116054f.m128569f(dgy0Var);
    }

    @Override // p153l.wfy0
    @CallSuper
    /* JADX INFO: renamed from: S */
    public final void mo141204S(dgy0 dgy0Var) {
        this.f116054f.m128565b(dgy0Var);
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: T */
    public final void mo141205T(final int i, final long j, final long j2) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1011, new mwv0(i, j, j2) { // from class: l.jiy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: U */
    public final void mo141206U(int i, @Nullable kzy0 kzy0Var, final gzy0 gzy0Var) {
        final yfy0 yfy0VarM141214b0 = m141214b0(i, kzy0Var);
        m141210Z(yfy0VarM141214b0, 1004, new mwv0() { // from class: l.yjy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115772f(yfy0VarM141214b0, gzy0Var);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public final yfy0 m141207V() {
        return m141212a0(this.f116052d.m126407b());
    }

    @RequiresNonNull({GameIdentity.player})
    /* JADX INFO: renamed from: W */
    public final yfy0 m141208W(d0u0 d0u0Var, int i, @Nullable kzy0 kzy0Var) {
        kzy0 kzy0Var2 = true == d0u0Var.m113469o() ? null : kzy0Var;
        long jZza = this.f116049a.zza();
        boolean z = d0u0Var.equals(this.f116055g.zzn()) && i == this.f116055g.zzd();
        long jM159396I = 0;
        if (kzy0Var2 == null || !kzy0Var2.m152240b()) {
            if (z) {
                jM159396I = this.f116055g.zzj();
            } else if (!d0u0Var.m113469o()) {
                long j = d0u0Var.mo107663e(i, this.f116051c, 0L).f191702l;
                jM159396I = mpw0.m159396I(0L);
            }
        } else if (z && this.f116055g.zzb() == kzy0Var2.f129477b && this.f116055g.zzc() == kzy0Var2.f129478c) {
            jM159396I = this.f116055g.zzk();
        }
        return new yfy0(jZza, d0u0Var, i, kzy0Var2, jM159396I, this.f116055g.zzn(), this.f116055g.zzd(), this.f116052d.m126407b(), this.f116055g.zzk(), this.f116055g.zzm());
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m141209Y(oot0 oot0Var, dgy0 dgy0Var, akr0 akr0Var) {
        dgy0Var.mo115770d(oot0Var, new bgy0(akr0Var, this.f116053e));
    }

    /* JADX INFO: renamed from: Z */
    public final void m141210Z(yfy0 yfy0Var, int i, mwv0 mwv0Var) {
        this.f116053e.put(i, yfy0Var);
        g1w0 g1w0Var = this.f116054f;
        g1w0Var.m128567d(i, mwv0Var);
        g1w0Var.m128566c();
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: a */
    public final void mo141211a(final boolean z) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 7, new mwv0(z) { // from class: l.yiy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public final yfy0 m141212a0(@Nullable kzy0 kzy0Var) {
        this.f116055g.getClass();
        d0u0 d0u0VarM126406a = kzy0Var == null ? null : this.f116052d.m126406a(kzy0Var);
        if (kzy0Var != null && d0u0VarM126406a != null) {
            return m141208W(d0u0VarM126406a, d0u0VarM126406a.mo113468n(kzy0Var.f129476a, this.f116050b).f111930c, kzy0Var);
        }
        int iZzd = this.f116055g.zzd();
        d0u0 d0u0VarZzn = this.f116055g.zzn();
        if (iZzd >= d0u0VarZzn.mo113459c()) {
            d0u0VarZzn = d0u0.f84608a;
        }
        return m141208W(d0u0VarZzn, iZzd, null);
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: b */
    public final void mo141213b(final long j) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1010, new mwv0(j) { // from class: l.viy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final yfy0 m141214b0(int i, @Nullable kzy0 kzy0Var) {
        oot0 oot0Var = this.f116055g;
        oot0Var.getClass();
        if (kzy0Var != null) {
            return this.f116052d.m126406a(kzy0Var) != null ? m141212a0(kzy0Var) : m141208W(d0u0.f84608a, i, kzy0Var);
        }
        d0u0 d0u0VarZzn = oot0Var.zzn();
        if (i >= d0u0VarZzn.mo113459c()) {
            d0u0VarZzn = d0u0.f84608a;
        }
        return m141208W(d0u0VarZzn, i, null);
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: c */
    public final void mo141215c(final String str) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1019, new mwv0() { // from class: l.ijy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: c0 */
    public final yfy0 m141216c0() {
        return m141212a0(this.f116052d.m126409d());
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: d */
    public final void mo141217d(final String str, final long j, final long j2) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1008, new mwv0(str, j2, j) { // from class: l.djy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f88956b;

            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: d0 */
    public final yfy0 m141218d0() {
        return m141212a0(this.f116052d.m126410e());
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: e */
    public final void mo141219e(final Exception exc) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, TXLiteAVCode.EVT_LOCAL_RECORD_RESULT, new mwv0() { // from class: l.omy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    public final yfy0 m141220e0(@Nullable zzce zzceVar) {
        kzy0 kzy0Var;
        return (!(zzceVar instanceof zziz) || (kzy0Var = ((zziz) zzceVar).zzj) == null) ? m141207V() : m141212a0(kzy0Var);
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: f */
    public final void mo141221f(final sqr0 sqr0Var, @Nullable final zwx0 zwx0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1017, new mwv0() { // from class: l.kly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115773g(yfy0VarM141218d0, sqr0Var, zwx0Var);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: g */
    public final void mo141222g(final iet0 iet0Var) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 12, new mwv0() { // from class: l.fgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    @CallSuper
    /* JADX INFO: renamed from: h */
    public final void mo141223h() {
        usv0 usv0Var = this.f116056h;
        lev0.m153954b(usv0Var);
        usv0Var.mo121303g(new Runnable() { // from class: l.imy0
            @Override // java.lang.Runnable
            public final void run() {
                iny0.m141185X(this.f115847a);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: i */
    public final void mo141224i(final ojt0 ojt0Var) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 13, new mwv0() { // from class: l.sgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: j */
    public final void mo141225j(final aou0 aou0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 25, new mwv0() { // from class: l.tly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                yfy0 yfy0Var = yfy0VarM141218d0;
                aou0 aou0Var2 = aou0Var;
                ((dgy0) obj).mo115779q(yfy0Var, aou0Var2);
                int i = aou0Var2.f72646a;
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: k */
    public final void mo141226k(@Nullable final trs0 trs0Var, final int i) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 1, new mwv0(trs0Var, i) { // from class: l.uhy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ trs0 f179067b;

            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: l */
    public final void mo141227l(final int i, final long j) {
        final yfy0 yfy0VarM141216c0 = m141216c0();
        m141210Z(yfy0VarM141216c0, 1018, new mwv0() { // from class: l.ljy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115775j(yfy0VarM141216c0, i, j);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: m */
    public final void mo141228m(final zzce zzceVar) {
        final yfy0 yfy0VarM141220e0 = m141220e0(zzceVar);
        m141210Z(yfy0VarM141220e0, 10, new mwv0() { // from class: l.eky0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115769c(yfy0VarM141220e0, zzceVar);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: n */
    public final void mo141229n(final int i) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 6, new mwv0(i) { // from class: l.fjy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: o */
    public final void mo141230o(final jqy0 jqy0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1031, new mwv0() { // from class: l.qly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.a6z0
    /* JADX INFO: renamed from: p */
    public final void mo96351p(final int i, final long j, final long j2) {
        final yfy0 yfy0VarM141212a0 = m141212a0(this.f116052d.m126408c());
        m141210Z(yfy0VarM141212a0, 1006, new mwv0() { // from class: l.aiy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115774h(yfy0VarM141212a0, i, j, j2);
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: q */
    public final void mo141231q(final boolean z) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 23, new mwv0(z) { // from class: l.xhy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: r */
    public final void mo141232r(final int i, final int i2) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 24, new mwv0(i, i2) { // from class: l.cny0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: s */
    public final void mo141233s(final jqy0 jqy0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1032, new mwv0() { // from class: l.tmy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: t */
    public final void mo141234t(final float f) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 22, new mwv0(f) { // from class: l.diy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: u */
    public final void mo141235u(@Nullable final zzce zzceVar) {
        final yfy0 yfy0VarM141220e0 = m141220e0(zzceVar);
        m141210Z(yfy0VarM141220e0, 10, new mwv0() { // from class: l.ojy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: v */
    public final void mo141236v(final vwx0 vwx0Var) {
        final yfy0 yfy0VarM141216c0 = m141216c0();
        m141210Z(yfy0VarM141216c0, 1013, new mwv0() { // from class: l.hky0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: w */
    public final void mo141237w(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var, final IOException iOException, final boolean z) {
        final yfy0 yfy0VarM141214b0 = m141214b0(i, kzy0Var);
        m141210Z(yfy0VarM141214b0, 1003, new mwv0() { // from class: l.miy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115771e(yfy0VarM141214b0, bzy0Var, gzy0Var, iOException, z);
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: x */
    public final void mo141238x(final vwx0 vwx0Var) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1007, new mwv0() { // from class: l.jgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    /* JADX INFO: renamed from: y */
    public final void mo141239y(final uhu0 uhu0Var) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 2, new mwv0() { // from class: l.ajy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    /* JADX INFO: renamed from: z */
    public final void mo141240z(final String str, final long j, final long j2) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1016, new mwv0(str, j2, j) { // from class: l.rmy0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f163947b;

            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    public final void zzb(final boolean z) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 3, new mwv0(z) { // from class: l.lgy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.pkt0
    public final void zzh(final int i) {
        final yfy0 yfy0VarM141207V = m141207V();
        m141210Z(yfy0VarM141207V, 4, new mwv0() { // from class: l.kky0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
                ((dgy0) obj).mo115777o(yfy0VarM141207V, i);
            }
        });
    }

    @Override // p153l.wfy0
    public final void zzu() {
        if (this.f116057i) {
            return;
        }
        final yfy0 yfy0VarM141207V = m141207V();
        this.f116057i = true;
        m141210Z(yfy0VarM141207V, -1, new mwv0() { // from class: l.wly0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }

    @Override // p153l.wfy0
    public final void zzx(final String str) {
        final yfy0 yfy0VarM141218d0 = m141218d0();
        m141210Z(yfy0VarM141218d0, 1012, new mwv0() { // from class: l.ngy0
            @Override // p153l.mwv0
            public final void zza(Object obj) {
            }
        });
    }
}
