package p002l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLive;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.bul;
import l.cul;
import l.e30;
import l.e51;
import l.egp0;
import l.f30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.gkh0;
import l.hfw;
import l.idv;
import l.kat;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.r8d0;
import l.roj0;
import l.u0t;
import l.v9j;
import l.w9j;
import l.wq2;
import l.ypv;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nad0 {

    /* JADX INFO: renamed from: a */
    public final j7j0 f15887a;

    /* JADX INFO: renamed from: b */
    public final f30<Boolean, Boolean> f15888b;

    /* JADX INFO: renamed from: c */
    public final ekf0 f15889c;

    /* JADX INFO: renamed from: d */
    public boolean f15890d;

    /* JADX INFO: renamed from: e */
    public cul f15891e;

    /* JADX INFO: renamed from: g */
    public int f15893g;

    /* JADX INFO: renamed from: h */
    public ho2 f15894h;

    /* JADX INFO: renamed from: j */
    public Runnable f15896j;

    /* JADX INFO: renamed from: k */
    public BLiveStreamUrl f15897k;

    /* JADX INFO: renamed from: l */
    public long f15898l;

    /* JADX INFO: renamed from: m */
    public boolean f15899m;

    /* JADX INFO: renamed from: f */
    public a<Pair<Boolean, Boolean>> f15892f = a.b();

    /* JADX INFO: renamed from: i */
    public bul f15895i = new C0697a();

    /* JADX INFO: renamed from: l.nad0$a */
    public class C0697a extends kat {
        public C0697a() {
        }

        /* JADX INFO: renamed from: D0 */
        public void m18629D0() {
            nad0.this.m18585I().mo6885p(false);
            nad0.this.m18628z0(false);
        }

        /* JADX INFO: renamed from: O */
        public void m18630O() {
            nad0.this.m18628z0(true);
        }

        /* JADX INFO: renamed from: R1 */
        public void m18631R1(float f) {
            nad0.this.m18620r0(f);
        }

        /* JADX INFO: renamed from: f2 */
        public void m18632f2() {
            nad0.this.f15890d = false;
            nad0.this.m18628z0(false);
            nad0.this.m18590N();
        }

        /* JADX INFO: renamed from: l0 */
        public void m18633l0(int i) {
            nad0.this.f15890d = true;
            if (nad0.this.f15894h.m17241r() && !nad0.this.m18581E()) {
                nad0.this.m18626x0();
            }
        }

        /* JADX INFO: renamed from: u1 */
        public void m18634u1() {
            nad0.this.f15890d = false;
            nad0.this.m18590N();
            nad0.this.m18628z0(false);
        }
    }

    public nad0(ekf0 ekf0Var, ho2 ho2Var, j7j0 j7j0Var, f30<Boolean, Boolean> f30Var) {
        this.f15889c = ekf0Var;
        this.f15894h = ho2Var;
        this.f15887a = j7j0Var;
        this.f15888b = f30Var;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ c m18565r(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m18566s(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m18574A0() {
        m18628z0(false);
        m18576B0(ypv.e.getString(R$string.f2986Rj));
        this.f15893g = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m18575B() {
        if (this.f15896j == null) {
            this.f15896j = new Runnable() { // from class: l.mad0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15293a.m18600X();
                }
            };
        }
        e51.H(ypv.e, this.f15896j, 3000L);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m18576B0(String str) {
        if (m18598V()) {
            m18585I().mo6884o(str);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18577C() {
        return m18598V() && this.f15894h.m17242s();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m18578C0(BLiveAbsData bLiveAbsData) {
        this.f15894h.m14535V(bLiveAbsData);
    }

    /* JADX INFO: renamed from: D */
    public final void m18579D(r8d0 r8d0Var) {
        this.f15894h.m14550a0(((wq2) r8d0Var).c);
        this.f15894h.m14526S(r8d0Var);
    }

    /* JADX INFO: renamed from: D0 */
    public void m18580D0(boolean z) {
        cul culVar = this.f15891e;
        if (culVar == null) {
            return;
        }
        culVar.b(z);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m18581E() {
        if (!ConnectivityReceiver.g()) {
            m18628z0(false);
            m18576B0(ypv.e.getString(R$string.f2696E9));
            return true;
        }
        if (!ConnectivityReceiver.k()) {
            return false;
        }
        m18628z0(false);
        m18576B0(ypv.e.getString(R$string.f2784I9));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m18582F() {
        if (m18598V()) {
            m18585I().destroy();
        }
        cul culVar = this.f15891e;
        if (culVar != null) {
            culVar.reset();
        }
    }

    /* JADX INFO: renamed from: G */
    public final <T> c<T> m18583G(final c<T> cVar) {
        return mkd0.D(new v9j() { // from class: l.lad0
            public final Object call() {
                return nad0.m18565r(cVar);
            }
        }, this.f15892f, false);
    }

    /* JADX INFO: renamed from: H */
    public String m18584H() {
        return this.f15887a.f13620d;
    }

    /* JADX INFO: renamed from: I */
    public final xtl m18585I() {
        return (xtl) this.f15887a.f13617a;
    }

    /* JADX INFO: renamed from: J */
    public String m18586J() {
        return this.f15887a.f13619c;
    }

    /* JADX INFO: renamed from: K */
    public cul m18587K() {
        return this.f15891e;
    }

    /* JADX INFO: renamed from: L */
    public ho2 m18588L() {
        return this.f15894h;
    }

    /* JADX INFO: renamed from: M */
    public final void m18589M(String str) {
        lsi0.y("主播去公演房秀场啦");
        f30<Boolean, Boolean> f30Var = this.f15888b;
        if (f30Var != null) {
            Boolean bool = Boolean.TRUE;
            f30Var.call(bool, bool);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m18590N() {
        if (m18598V()) {
            m18585I().mo6883n();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m18591O(cul culVar) {
        if (culVar != null) {
            this.f15891e = culVar;
            culVar.g(true);
        }
        m18592P();
        m18594R();
        m18593Q();
        m18615m0();
        m18597U();
        this.f15892f.onNext(new Pair(Boolean.FALSE, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: P */
    public final void m18592P() {
        m18583G(this.f15894h.m14589n1()).subscribe(ffw.d(new e30() { // from class: l.gad0
            public final void call(Object obj) {
                this.f11316a.m18602Z((LiveControlMessage) obj);
            }
        }));
        m18583G(this.f15894h.m14596q1().S()).subscribe(ffw.d(new e30() { // from class: l.had0
            public final void call(Object obj) {
                this.f11953a.m18603a0((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m18593Q() {
        m18583G(this.f15894h.m14596q1().U()).subscribe(ffw.d(new e30() { // from class: l.ead0
            public final void call(Object obj) {
                this.f9647a.m18623u0((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final void m18594R() {
        m18590N();
        m18628z0(true);
        if (this.f15891e == null) {
            jv00 jv00Var = new jv00(ypv.e);
            this.f15891e = jv00Var;
            jv00Var.g(true);
        }
        m18583G(ConnectivityReceiver.m().skip(1).filter(new w9j() { // from class: l.iad0
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        })).subscribe(ffw.d(new e30() { // from class: l.jad0
            public final void call(Object obj) {
                this.f13652a.m18604b0((NetworkInfo) obj);
            }
        }));
        m18583G(this.f15894h.m17236l()).subscribe(ffw.d(new e30() { // from class: l.kad0
            public final void call(Object obj) {
                this.f14262a.m18605c0((iqv) obj);
            }
        }));
        ho2 ho2Var = this.f15894h;
        j7j0 j7j0Var = this.f15887a;
        egp0.a(ho2Var, "windowroom", "start", 0L, j7j0Var.f13620d, j7j0Var.f13619c);
        this.f15898l = mqi0.o();
    }

    /* JADX INFO: renamed from: S */
    public final void m18595S(BLive bLive) {
        m18596T(bLive, false);
    }

    /* JADX INFO: renamed from: T */
    public final void m18596T(final BLive bLive, final boolean z) {
        if (m18598V()) {
            m18628z0(true);
            m18590N();
            this.f15890d = false;
            m18622t0(bLive);
            m18583G(LivingNormalApiProvider.m4830g5(bLive).flatMap(new w9j() { // from class: l.v9d0
                public final Object call(Object obj) {
                    return this.f21039a.m18606d0(z, bLive, (r8d0) obj);
                }
            })).subscribe(ffw.e(new e30() { // from class: l.w9d0
                public final void call(Object obj) {
                    this.f21570a.m18607e0(z, obj);
                }
            }, new e30() { // from class: l.x9d0
                public final void call(Object obj) {
                    this.f22174a.m18608f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m18597U() {
        m18583G(Act.foreground()).subscribe(ffw.d(new e30() { // from class: l.u9d0
            public final void call(Object obj) {
                this.f20549a.m18609g0((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final boolean m18598V() {
        return this.f15887a.f13617a != null;
    }

    /* JADX INFO: renamed from: W */
    public final void m18599W(String str) {
        BLive bLiveNew_ = BLive.new_();
        ((BLiveAbsData) bLiveNew_).id = str;
        m18596T(bLiveNew_, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m18600X() {
        if (m18577C()) {
            j7j0 j7j0Var = this.f15887a;
            m18583G(LivingNormalApiProvider.m4767Z5(j7j0Var.f13619c, j7j0Var.f13620d)).subscribe(ffw.e(new e30() { // from class: l.cad0
                public final void call(Object obj) {
                    this.f8568a.m18601Y((BLive) obj);
                }
            }, new e30() { // from class: l.dad0
                public final void call(Object obj) {
                    nad0.m18566s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m18601Y(BLive bLive) {
        if (bLive == null || bLive.isOfficialShowRoom()) {
            f30<Boolean, Boolean> f30Var = this.f15888b;
            if (f30Var != null) {
                Boolean bool = Boolean.TRUE;
                f30Var.call(bool, bool);
            }
            lsi0.y("当前直播已结束");
            return;
        }
        if (m18577C()) {
            gkh0.j("live_float_window", "playNext:" + ((BLiveAbsData) bLive).id);
            m18595S(bLive);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m18602Z(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ho2 ho2Var = this.f15894h;
                ho2Var.mo14510K1(ho2Var.m17239o());
                break;
            case "live_pull_update_video_quality":
                m18624v0();
                break;
            case "boot":
                lsi0.y(ypv.e.getString(R$string.f2993S5));
                this.f15888b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "stop":
            case "force_stop":
                this.f15894h.mo17233h(u7s.f20528e);
                break;
            case "pause":
                this.f15894h.mo17233h(pau.f17177b);
                break;
            case "start":
                m18599W(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                lsi0.y(liveControlMessage.isAnchor ? ypv.e.getString(R$string.f3014T5) : ypv.e.getString(R$string.f2972R5));
                this.f15888b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "recover":
                m18599W(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m18603a0(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m18589M(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m18604b0(NetworkInfo networkInfo) {
        if (this.f15890d) {
            m18616n0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m18605c0(iqv iqvVar) {
        int iM15298a = iqvVar.m15298a();
        if (iM15298a == 2) {
            m18618p0();
        } else if (iM15298a == 3) {
            m18619q0();
        } else {
            if (iM15298a != 4) {
                return;
            }
            m18617o0();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ c m18606d0(boolean z, BLive bLive, r8d0 r8d0Var) {
        m18579D(r8d0Var);
        if (z) {
            return c.just(roj0.a);
        }
        return LivingNormalApiProvider.m4757Y4(((wq2) r8d0Var).b.id, ypv.a.D0(), this.f15894h.mo14591o0(), NullChecker.a(((BLiveAbsData) bLive).recommendInfo) ? ((BLiveAbsData) bLive).recommendInfo.category : null, m18588L().m17247x());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m18607e0(boolean z, Object obj) {
        this.f15894h.m17234j().memberCount += 1.0d;
        m18578C0(this.f15894h.m17234j());
        if (z) {
            return;
        }
        Act.r rVarForeground_ = Act.foreground_();
        ho2 ho2Var = this.f15894h;
        if (rVarForeground_ != null) {
            j7j0 j7j0Var = this.f15887a;
            egp0.a(ho2Var, "windowroom", "start", 0L, j7j0Var.f13620d, j7j0Var.f13619c);
        } else {
            j7j0 j7j0Var2 = this.f15887a;
            egp0.a(ho2Var, "backgroundroom", "start", 0L, j7j0Var2.f13620d, j7j0Var2.f13619c);
        }
        this.f15898l = mqi0.o();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m18608f0(Throwable th) {
        m18628z0(false);
        m18576B0(ypv.e.getString(R$string.f3028Tj));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m18609g0(Act.r rVar) {
        if (rVar != null && this.f15899m) {
            this.f15899m = false;
            ho2 ho2Var = this.f15894h;
            long jO = mqi0.o() - this.f15898l;
            j7j0 j7j0Var = this.f15887a;
            egp0.a(ho2Var, "backgroundroom", "ending", jO, j7j0Var.f13620d, j7j0Var.f13619c);
            ho2 ho2Var2 = this.f15894h;
            j7j0 j7j0Var2 = this.f15887a;
            egp0.a(ho2Var2, "windowroom", "start", 0L, j7j0Var2.f13620d, j7j0Var2.f13619c);
            this.f15898l = mqi0.o();
            return;
        }
        if (rVar == null) {
            this.f15899m = true;
            ho2 ho2Var3 = this.f15894h;
            long jO2 = mqi0.o() - this.f15898l;
            j7j0 j7j0Var3 = this.f15887a;
            egp0.a(ho2Var3, "windowroom", "ending", jO2, j7j0Var3.f13620d, j7j0Var3.f13619c);
            ho2 ho2Var4 = this.f15894h;
            j7j0 j7j0Var4 = this.f15887a;
            egp0.a(ho2Var4, "backgroundroom", "start", 0L, j7j0Var4.f13620d, j7j0Var4.f13619c);
            this.f15898l = mqi0.o();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m18610h0(User user) {
        m18588L().m14532U(user.localFollowship);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m18611i0(r8d0 r8d0Var) {
        gkh0.j("live_float_window", "onErrorClicked, new address:" + ((wq2) r8d0Var).c.streamUrl.pullFlv + ",ipv6: " + ((wq2) r8d0Var).c.streamUrl.pullFlvIpv6);
        m18628z0(false);
        m18579D(r8d0Var);
        this.f15894h.m14535V(((wq2) r8d0Var).c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m18612j0(Throwable th) {
        StringBuilder sb = new StringBuilder("onErrorClicked fail. reason:");
        sb.append(th == null ? "" : th.getMessage());
        hfw.a("live_float_window", sb.toString());
        this.f15890d = true;
        m18628z0(false);
        m18576B0(ypv.e.getString(R$string.f3028Tj));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m18613k0(BLive bLive) {
        if (bLive == null) {
            this.f15890d = true;
            m18576B0(ypv.e.getString(R$string.f3028Tj));
            return;
        }
        gkh0.j(u0t.c, "roomManage refreshStreamAddress success, new address:" + ((BLiveAbsData) bLive).streamUrl.pullFlv + ", ipv6: " + ((BLiveAbsData) bLive).streamUrl.pullFlvIpv6);
        this.f15894h.m17232g(bLive);
        this.f15894h.m14535V(bLive);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m18614l0(Throwable th) {
        this.f15890d = true;
        m18576B0(ypv.e.getString(R$string.f3028Tj));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m18615m0() {
        m18583G(((idv) ypv.l(fld0.b)).g()).subscribe(ffw.d(new e30() { // from class: l.fad0
            public final void call(Object obj) {
                this.f10203a.m18610h0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m18616n0() {
        BLiveAbsData bLiveAbsDataM17234j = this.f15894h.m17234j();
        this.f15890d = false;
        m18628z0(true);
        m18576B0(ypv.e.getString(R$string.f2722Fd));
        m18583G(LivingNormalApiProvider.m4830g5(bLiveAbsDataM17234j)).subscribe(ffw.e(new e30() { // from class: l.aad0
            public final void call(Object obj) {
                this.f7471a.m18611i0((r8d0) obj);
            }
        }, new e30() { // from class: l.bad0
            public final void call(Object obj) {
                this.f8044a.m18612j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m18617o0() {
        this.f15890d = false;
        m18628z0(false);
        m18580D0(true);
        m18576B0(ypv.e.getString(R$string.f3099X6));
        m18582F();
        m18585I().mo6885p(true);
        Act.r rVarForeground_ = Act.foreground_();
        ho2 ho2Var = this.f15894h;
        if (rVarForeground_ != null) {
            long jO = mqi0.o() - this.f15898l;
            j7j0 j7j0Var = this.f15887a;
            egp0.a(ho2Var, "windowroom", "ending", jO, j7j0Var.f13620d, j7j0Var.f13619c);
        } else {
            long jO2 = mqi0.o() - this.f15898l;
            j7j0 j7j0Var2 = this.f15887a;
            egp0.a(ho2Var, "backgroundroom", "ending", jO2, j7j0Var2.f13620d, j7j0Var2.f13619c);
        }
        m18575B();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m18618p0() {
        m18590N();
        ho2 ho2Var = this.f15894h;
        ho2Var.mo9892e2(false, ho2Var.m17234j());
        BLiveStreamUrl bLiveStreamUrl = this.f15897k;
        if (bLiveStreamUrl != null && TextUtils.equals(bLiveStreamUrl.pullFlv, this.f15894h.m17234j().streamUrl.pullFlv)) {
            this.f15897k = null;
            return;
        }
        this.f15897k = null;
        if (m18621s0(this.f15894h.m17234j()) != 0) {
            m18628z0(false);
            m18576B0(ypv.e.getString(R$string.f3028Tj));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m18619q0() {
        m18580D0(false);
        m18574A0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m18620r0(float f) {
        this.f15889c.m12573b(new ekf0.C0546a(f));
    }

    /* JADX INFO: renamed from: s0 */
    public final int m18621s0(BLiveAbsData bLiveAbsData) {
        if (this.f15891e == null) {
            jv00 jv00Var = new jv00(ypv.e);
            this.f15891e = jv00Var;
            jv00Var.g(true);
        }
        this.f15891e.f(m18585I().getPlayerContainer());
        this.f15891e.c(this.f15895i);
        boolean zIsPlaying = this.f15891e.isPlaying();
        cul culVar = this.f15891e;
        if (zIsPlaying) {
            culVar.d(m18585I().getPlayerContainer());
            m18590N();
            m18628z0(false);
            m18585I().mo6885p(false);
        } else {
            culVar.l("", "floatWindow", bLiveAbsData);
            cul culVar2 = this.f15891e;
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
            culVar2.j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        }
        boolean zBooleanValue = ((Boolean) this.f15887a.f13618b.get()).booleanValue();
        this.f15891e.setMute(zBooleanValue);
        m18585I().setVoiceSelected(!zBooleanValue);
        return 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m18622t0(BLive bLive) {
        BLiveStreamUrl bLiveStreamUrl = ((BLiveAbsData) bLive).streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(((BLiveAbsData) bLive).streamUrl.pullFlvIpv6)) || ((BLiveAbsData) bLive).streamCdnInfo == null) {
                return;
            }
            this.f15897k = ((BLiveAbsData) bLive).streamUrl;
            gkh0.j(u0t.c, "float window quickPlay:" + this.f15897k.pullFlv + ",ipv6: " + this.f15897k.pullFlvIpv6);
            if (m18621s0(bLive) == 0) {
                m18590N();
            } else {
                m18628z0(false);
                m18576B0(ypv.e.getString(R$string.f3028Tj));
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m18623u0(LivePkMessage livePkMessage) {
        BLive bLiveM17234j = this.f15894h.m17234j();
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_created":
            case "pk_result":
            case "pk_start":
                BLivePkInfo bLivePkInfoNew_ = BLivePkInfo.new_();
                bLiveM17234j.pkInfo = bLivePkInfoNew_;
                bLivePkInfoNew_.ongoingId = livePkMessage.pkInfo.getId();
                break;
            case "pk_end":
                bLiveM17234j.pkInfo = BLivePkInfo.new_();
                break;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m18624v0() {
        m18628z0(true);
        m18583G(LivingNormalApiProvider.m4651M6(this.f15894h.m17235k(), this.f15894h.m14588n0() == null ? "" : this.f15894h.m14588n0().callback)).subscribe(ffw.e(new e30() { // from class: l.y9d0
            public final void call(Object obj) {
                this.f22745a.m18613k0((BLive) obj);
            }
        }, new e30() { // from class: l.z9d0
            public final void call(Object obj) {
                this.f23313a.m18614l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m18625w0(boolean z, boolean z2, boolean z3) {
        e51.J(this.f15896j);
        this.f15892f.onCompleted();
        this.f15891e.h(this.f15895i);
        m18580D0(true);
        m18582F();
        ((ggv) ypv.l(fld0.c)).e();
        ho2 ho2Var = this.f15894h;
        if (ho2Var != null) {
            long jO = mqi0.o() - this.f15898l;
            j7j0 j7j0Var = this.f15887a;
            egp0.a(ho2Var, "windowroom", "ending", jO, j7j0Var.f13620d, j7j0Var.f13619c);
            if (z) {
                ho2 ho2Var2 = this.f15894h;
                ho2Var2.m14568g2(ho2Var2.m17234j());
            }
            if (z2) {
                LivingNormalApiProvider.m4587F5(this.f15894h.m17239o(), ypv.a.D0(), this.f15894h.m17247x());
            }
        }
        if (z3) {
            this.f15894h = null;
        }
        this.f15896j = null;
        this.f15891e = null;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m18626x0() {
        gkh0.j(u0t.c, "roomManage retryConnect");
        if (this.f15893g < ypv.k().X4()) {
            this.f15893g++;
            m18624v0();
        } else {
            m18576B0(ypv.e.getString(R$string.f3028Tj));
            this.f15890d = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m18627y0(boolean z) {
        this.f15891e.setMute(z);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m18628z0(boolean z) {
        if (m18598V()) {
            if (z) {
                m18585I().mo6884o(ypv.e.getString(R$string.f2722Fd));
            } else {
                m18585I().mo6883n();
            }
            m18585I().mo6882m(z);
        }
    }
}
