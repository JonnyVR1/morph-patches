package p149l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class nad0 {

    /* JADX INFO: renamed from: a */
    public final j7j0 f137876a;

    /* JADX INFO: renamed from: b */
    public final f30<Boolean, Boolean> f137877b;

    /* JADX INFO: renamed from: c */
    public final ekf0 f137878c;

    /* JADX INFO: renamed from: d */
    public boolean f137879d;

    /* JADX INFO: renamed from: e */
    public cul f137880e;

    /* JADX INFO: renamed from: g */
    public int f137882g;

    /* JADX INFO: renamed from: h */
    public ho2 f137883h;

    /* JADX INFO: renamed from: j */
    public Runnable f137885j;

    /* JADX INFO: renamed from: k */
    public BLiveStreamUrl f137886k;

    /* JADX INFO: renamed from: l */
    public long f137887l;

    /* JADX INFO: renamed from: m */
    public boolean f137888m;

    /* JADX INFO: renamed from: f */
    public C22392a<Pair<Boolean, Boolean>> f137881f = C22392a.m221512b();

    /* JADX INFO: renamed from: i */
    public bul f137884i = new C18642a();

    /* JADX INFO: renamed from: l.nad0$a */
    public class C18642a extends kat {
        public C18642a() {
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: D0 */
        public void mo103933D0() {
            nad0.this.m158631I().mo73349p(false);
            nad0.this.m158674z0(false);
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: O */
        public void mo103935O() {
            nad0.this.m158674z0(true);
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: R1 */
        public void mo103937R1(float f) {
            nad0.this.m158666r0(f);
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: f2 */
        public void mo103939f2() {
            nad0.this.f137879d = false;
            nad0.this.m158674z0(false);
            nad0.this.m158636N();
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: l0 */
        public void mo103940l0(int i) {
            nad0.this.f137879d = true;
            if (nad0.this.f137883h.m149820r() && !nad0.this.m158627E()) {
                nad0.this.m158672x0();
            }
        }

        @Override // p149l.kat, p149l.bul
        /* JADX INFO: renamed from: u1 */
        public void mo103945u1() {
            nad0.this.f137879d = false;
            nad0.this.m158636N();
            nad0.this.m158674z0(false);
        }
    }

    public nad0(ekf0 ekf0Var, ho2 ho2Var, j7j0 j7j0Var, f30<Boolean, Boolean> f30Var) {
        this.f137878c = ekf0Var;
        this.f137883h = ho2Var;
        this.f137876a = j7j0Var;
        this.f137877b = f30Var;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C22306c m158611r(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m158612s(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m158620A0() {
        m158674z0(false);
        m158622B0(ypv.f199497e.getString(R$string.f46944Rj));
        this.f137882g = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m158621B() {
        if (this.f137885j == null) {
            this.f137885j = new Runnable() { // from class: l.mad0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f132842a.m158646X();
                }
            };
        }
        e51.m114743H(ypv.f199497e, this.f137885j, 3000L);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m158622B0(String str) {
        if (m158644V()) {
            m158631I().mo73348o(str);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m158623C() {
        return m158644V() && this.f137883h.m149821s();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m158624C0(BLiveAbsData bLiveAbsData) {
        this.f137883h.m132099V(bLiveAbsData);
    }

    /* JADX INFO: renamed from: D */
    public final void m158625D(r8d0 r8d0Var) {
        this.f137883h.m132114a0(r8d0Var.f187610c);
        this.f137883h.mo132090S(r8d0Var);
    }

    /* JADX INFO: renamed from: D0 */
    public void m158626D0(boolean z) {
        cul culVar = this.f137880e;
        if (culVar == null) {
            return;
        }
        culVar.mo108790b(z);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m158627E() {
        if (!ConnectivityReceiver.m81284g()) {
            m158674z0(false);
            m158622B0(ypv.f199497e.getString(R$string.f46654E9));
            return true;
        }
        if (!ConnectivityReceiver.m81288k()) {
            return false;
        }
        m158674z0(false);
        m158622B0(ypv.f199497e.getString(R$string.f46742I9));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m158628F() {
        if (m158644V()) {
            m158631I().destroy();
        }
        cul culVar = this.f137880e;
        if (culVar != null) {
            culVar.reset();
        }
    }

    /* JADX INFO: renamed from: G */
    public final <T> C22306c<T> m158629G(final C22306c<T> c22306c) {
        return mkd0.m154952D(new v9j() { // from class: l.lad0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return nad0.m158611r(c22306c);
            }
        }, this.f137881f, false);
    }

    /* JADX INFO: renamed from: H */
    public String m158630H() {
        return this.f137876a.f116612d;
    }

    /* JADX INFO: renamed from: I */
    public final xtl m158631I() {
        return (xtl) this.f137876a.f116609a;
    }

    /* JADX INFO: renamed from: J */
    public String m158632J() {
        return this.f137876a.f116611c;
    }

    /* JADX INFO: renamed from: K */
    public cul m158633K() {
        return this.f137880e;
    }

    /* JADX INFO: renamed from: L */
    public ho2 m158634L() {
        return this.f137883h;
    }

    /* JADX INFO: renamed from: M */
    public final void m158635M(String str) {
        lsi0.m151595y("主播去公演房秀场啦");
        f30<Boolean, Boolean> f30Var = this.f137877b;
        if (f30Var != null) {
            Boolean bool = Boolean.TRUE;
            f30Var.call(bool, bool);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m158636N() {
        if (m158644V()) {
            m158631I().mo73347n();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m158637O(cul culVar) {
        if (culVar != null) {
            this.f137880e = culVar;
            culVar.mo108795g(true);
        }
        m158638P();
        m158640R();
        m158639Q();
        m158661m0();
        m158643U();
        this.f137881f.m132487l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: P */
    public final void m158638P() {
        m158629G(this.f137883h.m132153n1()).subscribe(ffw.m121193d(new e30() { // from class: l.gad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101662a.m158648Z((LiveControlMessage) obj);
            }
        }));
        m158629G(this.f137883h.m132160q1().m189070S()).subscribe(ffw.m121193d(new e30() { // from class: l.had0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106733a.m158649a0((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m158639Q() {
        m158629G(this.f137883h.m132160q1().m189074U()).subscribe(ffw.m121193d(new e30() { // from class: l.ead0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f90189a.m158669u0((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final void m158640R() {
        m158636N();
        m158674z0(true);
        if (this.f137880e == null) {
            jv00 jv00Var = new jv00(ypv.f199497e);
            this.f137880e = jv00Var;
            jv00Var.mo108795g(true);
        }
        m158629G(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.iad0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        })).subscribe(ffw.m121193d(new e30() { // from class: l.jad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117079a.m158650b0((NetworkInfo) obj);
            }
        }));
        m158629G(this.f137883h.m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.kad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122108a.m158651c0((iqv) obj);
            }
        }));
        ho2 ho2Var = this.f137883h;
        j7j0 j7j0Var = this.f137876a;
        egp0.m116297a(ho2Var, "windowroom", "start", 0L, j7j0Var.f116612d, j7j0Var.f116611c);
        this.f137887l = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: S */
    public final void m158641S(BLive bLive) {
        m158642T(bLive, false);
    }

    /* JADX INFO: renamed from: T */
    public final void m158642T(final BLive bLive, final boolean z) {
        if (m158644V()) {
            m158674z0(true);
            m158636N();
            this.f137879d = false;
            m158668t0(bLive);
            m158629G(LivingNormalApiProvider.m71464g5(bLive).flatMap(new w9j() { // from class: l.v9d0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f180629a.m158652d0(z, bLive, (r8d0) obj);
                }
            })).subscribe(ffw.m121194e(new e30() { // from class: l.w9d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185340a.m158653e0(z, obj);
                }
            }, new e30() { // from class: l.x9d0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f191611a.m158654f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m158643U() {
        m158629G(Act.foreground()).subscribe(ffw.m121193d(new e30() { // from class: l.u9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175253a.m158655g0((Act.C4299r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final boolean m158644V() {
        return this.f137876a.f116609a != null;
    }

    /* JADX INFO: renamed from: W */
    public final void m158645W(String str) {
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f44323id = str;
        m158642T(bLiveNew_, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m158646X() {
        if (m158623C()) {
            j7j0 j7j0Var = this.f137876a;
            m158629G(LivingNormalApiProvider.m71401Z5(j7j0Var.f116611c, j7j0Var.f116612d)).subscribe(ffw.m121194e(new e30() { // from class: l.cad0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f80025a.m158647Y((BLive) obj);
                }
            }, new e30() { // from class: l.dad0
                @Override // p149l.e30
                public final void call(Object obj) {
                    nad0.m158612s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m158647Y(BLive bLive) {
        if (bLive == null || bLive.isOfficialShowRoom()) {
            f30<Boolean, Boolean> f30Var = this.f137877b;
            if (f30Var != null) {
                Boolean bool = Boolean.TRUE;
                f30Var.call(bool, bool);
            }
            lsi0.m151595y("当前直播已结束");
            return;
        }
        if (m158623C()) {
            gkh0.m126627j("live_float_window", "playNext:" + bLive.f44323id);
            m158641S(bLive);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m158648Z(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ho2 ho2Var = this.f137883h;
                ho2Var.mo132074K1(ho2Var.m149818o());
                break;
            case "live_pull_update_video_quality":
                m158670v0();
                break;
            case "boot":
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46951S5));
                this.f137877b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "stop":
            case "force_stop":
                this.f137883h.mo149812h(u7s.f175055e);
                break;
            case "pause":
                this.f137883h.mo149812h(pau.f148011b);
                break;
            case "start":
                m158645W(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                lsi0.m151595y(liveControlMessage.isAnchor ? ypv.f199497e.getString(R$string.f46972T5) : ypv.f199497e.getString(R$string.f46930R5));
                this.f137877b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "recover":
                m158645W(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m158649a0(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m158635M(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m158650b0(NetworkInfo networkInfo) {
        if (this.f137879d) {
            m158662n0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m158651c0(iqv iqvVar) {
        int iM137794a = iqvVar.m137794a();
        if (iM137794a == 2) {
            m158664p0();
        } else if (iM137794a == 3) {
            m158665q0();
        } else {
            if (iM137794a != 4) {
                return;
            }
            m158663o0();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ C22306c m158652d0(boolean z, BLive bLive, r8d0 r8d0Var) {
        m158625D(r8d0Var);
        if (z) {
            return C22306c.just(roj0.f160388a);
        }
        return LivingNormalApiProvider.m71391Y4(r8d0Var.f187609b.f44324id, ypv.f199493a.m199309D0(), this.f137883h.mo132155o0(), NullChecker.m81303a(bLive.recommendInfo) ? bLive.recommendInfo.category : null, m158634L().m149826x());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m158653e0(boolean z, Object obj) {
        this.f137883h.mo149813j().memberCount += 1.0d;
        m158624C0(this.f137883h.mo149813j());
        if (z) {
            return;
        }
        Act.C4299r c4299rForeground_ = Act.foreground_();
        ho2 ho2Var = this.f137883h;
        if (c4299rForeground_ != null) {
            j7j0 j7j0Var = this.f137876a;
            egp0.m116297a(ho2Var, "windowroom", "start", 0L, j7j0Var.f116612d, j7j0Var.f116611c);
        } else {
            j7j0 j7j0Var2 = this.f137876a;
            egp0.m116297a(ho2Var, "backgroundroom", "start", 0L, j7j0Var2.f116612d, j7j0Var2.f116611c);
        }
        this.f137887l = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m158654f0(Throwable th) {
        m158674z0(false);
        m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m158655g0(Act.C4299r c4299r) {
        if (c4299r != null && this.f137888m) {
            this.f137888m = false;
            ho2 ho2Var = this.f137883h;
            long jM155944o = mqi0.m155944o() - this.f137887l;
            j7j0 j7j0Var = this.f137876a;
            egp0.m116297a(ho2Var, "backgroundroom", "ending", jM155944o, j7j0Var.f116612d, j7j0Var.f116611c);
            ho2 ho2Var2 = this.f137883h;
            j7j0 j7j0Var2 = this.f137876a;
            egp0.m116297a(ho2Var2, "windowroom", "start", 0L, j7j0Var2.f116612d, j7j0Var2.f116611c);
            this.f137887l = mqi0.m155944o();
            return;
        }
        if (c4299r == null) {
            this.f137888m = true;
            ho2 ho2Var3 = this.f137883h;
            long jM155944o2 = mqi0.m155944o() - this.f137887l;
            j7j0 j7j0Var3 = this.f137876a;
            egp0.m116297a(ho2Var3, "windowroom", "ending", jM155944o2, j7j0Var3.f116612d, j7j0Var3.f116611c);
            ho2 ho2Var4 = this.f137883h;
            j7j0 j7j0Var4 = this.f137876a;
            egp0.m116297a(ho2Var4, "backgroundroom", "start", 0L, j7j0Var4.f116612d, j7j0Var4.f116611c);
            this.f137887l = mqi0.m155944o();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m158656h0(User user) {
        m158634L().m132096U(user.localFollowship);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m158657i0(r8d0 r8d0Var) {
        gkh0.m126627j("live_float_window", "onErrorClicked, new address:" + r8d0Var.f187610c.streamUrl.pullFlv + ",ipv6: " + r8d0Var.f187610c.streamUrl.pullFlvIpv6);
        m158674z0(false);
        m158625D(r8d0Var);
        this.f137883h.m132099V(r8d0Var.f187610c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m158658j0(Throwable th) {
        StringBuilder sb = new StringBuilder("onErrorClicked fail. reason:");
        sb.append(th == null ? "" : th.getMessage());
        hfw.m130790a("live_float_window", sb.toString());
        this.f137879d = true;
        m158674z0(false);
        m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m158659k0(BLive bLive) {
        if (bLive == null) {
            this.f137879d = true;
            m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
            return;
        }
        gkh0.m126627j(u0t.f172944c, "roomManage refreshStreamAddress success, new address:" + bLive.streamUrl.pullFlv + ", ipv6: " + bLive.streamUrl.pullFlvIpv6);
        this.f137883h.mo149811g(bLive);
        this.f137883h.m132099V(bLive);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m158660l0(Throwable th) {
        this.f137879d = true;
        m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m158661m0() {
        m158629G(((idv) ypv.m215673l(fld0.f98147b)).m135635g()).subscribe(ffw.m121193d(new e30() { // from class: l.fad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96593a.m158656h0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m158662n0() {
        BLiveAbsData bLiveAbsDataMo149813j = this.f137883h.mo149813j();
        this.f137879d = false;
        m158674z0(true);
        m158622B0(ypv.f199497e.getString(R$string.f46680Fd));
        m158629G(LivingNormalApiProvider.m71464g5(bLiveAbsDataMo149813j)).subscribe(ffw.m121194e(new e30() { // from class: l.aad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68548a.m158657i0((r8d0) obj);
            }
        }, new e30() { // from class: l.bad0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74671a.m158658j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m158663o0() {
        this.f137879d = false;
        m158674z0(false);
        m158626D0(true);
        m158622B0(ypv.f199497e.getString(R$string.f47057X6));
        m158628F();
        m158631I().mo73349p(true);
        Act.C4299r c4299rForeground_ = Act.foreground_();
        ho2 ho2Var = this.f137883h;
        if (c4299rForeground_ != null) {
            long jM155944o = mqi0.m155944o() - this.f137887l;
            j7j0 j7j0Var = this.f137876a;
            egp0.m116297a(ho2Var, "windowroom", "ending", jM155944o, j7j0Var.f116612d, j7j0Var.f116611c);
        } else {
            long jM155944o2 = mqi0.m155944o() - this.f137887l;
            j7j0 j7j0Var2 = this.f137876a;
            egp0.m116297a(ho2Var, "backgroundroom", "ending", jM155944o2, j7j0Var2.f116612d, j7j0Var2.f116611c);
        }
        m158621B();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m158664p0() {
        m158636N();
        ho2 ho2Var = this.f137883h;
        ho2Var.mo97489e2(false, ho2Var.mo149813j());
        BLiveStreamUrl bLiveStreamUrl = this.f137886k;
        if (bLiveStreamUrl != null && TextUtils.equals(bLiveStreamUrl.pullFlv, this.f137883h.mo149813j().streamUrl.pullFlv)) {
            this.f137886k = null;
            return;
        }
        this.f137886k = null;
        if (m158667s0(this.f137883h.mo149813j()) != 0) {
            m158674z0(false);
            m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m158665q0() {
        m158626D0(false);
        m158620A0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m158666r0(float f) {
        this.f137878c.m116961b(new ekf0.C16637a(f));
    }

    /* JADX INFO: renamed from: s0 */
    public final int m158667s0(BLiveAbsData bLiveAbsData) {
        if (this.f137880e == null) {
            jv00 jv00Var = new jv00(ypv.f199497e);
            this.f137880e = jv00Var;
            jv00Var.mo108795g(true);
        }
        this.f137880e.mo108794f(m158631I().getPlayerContainer());
        this.f137880e.mo108791c(this.f137884i);
        boolean zIsPlaying = this.f137880e.isPlaying();
        cul culVar = this.f137880e;
        if (zIsPlaying) {
            culVar.mo108792d(m158631I().getPlayerContainer());
            m158636N();
            m158674z0(false);
            m158631I().mo73349p(false);
        } else {
            culVar.mo108800l("", "floatWindow", bLiveAbsData);
            cul culVar2 = this.f137880e;
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
            culVar2.mo108798j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f44419id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        }
        boolean zBooleanValue = this.f137876a.f116610b.get().booleanValue();
        this.f137880e.setMute(zBooleanValue);
        m158631I().setVoiceSelected(!zBooleanValue);
        return 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m158668t0(BLive bLive) {
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(bLive.streamUrl.pullFlvIpv6)) || bLive.streamCdnInfo == null) {
                return;
            }
            this.f137886k = bLive.streamUrl;
            gkh0.m126627j(u0t.f172944c, "float window quickPlay:" + this.f137886k.pullFlv + ",ipv6: " + this.f137886k.pullFlvIpv6);
            if (m158667s0(bLive) == 0) {
                m158636N();
            } else {
                m158674z0(false);
                m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m158669u0(LivePkMessage livePkMessage) {
        BLive bLive = (BLive) this.f137883h.mo149813j();
        String str = livePkMessage.type;
        str.getClass();
        switch (str) {
            case "pk_created":
            case "pk_result":
            case "pk_start":
                BLivePkInfo bLivePkInfoNew_ = BLivePkInfo.new_();
                bLive.pkInfo = bLivePkInfoNew_;
                bLivePkInfoNew_.ongoingId = livePkMessage.pkInfo.getId();
                break;
            case "pk_end":
                bLive.pkInfo = BLivePkInfo.new_();
                break;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m158670v0() {
        m158674z0(true);
        m158629G(LivingNormalApiProvider.m71285M6(this.f137883h.m149814k(), this.f137883h.m132152n0() == null ? "" : this.f137883h.m132152n0().callback)).subscribe(ffw.m121194e(new e30() { // from class: l.y9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196961a.m158659k0((BLive) obj);
            }
        }, new e30() { // from class: l.z9d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202287a.m158660l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m158671w0(boolean z, boolean z2, boolean z3) {
        e51.m114745J(this.f137885j);
        this.f137881f.onCompleted();
        this.f137880e.mo108796h(this.f137884i);
        m158626D0(true);
        m158628F();
        ((ggv) ypv.m215673l(fld0.f98148c)).m126019e();
        ho2 ho2Var = this.f137883h;
        if (ho2Var != null) {
            long jM155944o = mqi0.m155944o() - this.f137887l;
            j7j0 j7j0Var = this.f137876a;
            egp0.m116297a(ho2Var, "windowroom", "ending", jM155944o, j7j0Var.f116612d, j7j0Var.f116611c);
            if (z) {
                ho2 ho2Var2 = this.f137883h;
                ho2Var2.m132132g2(ho2Var2.mo149813j());
            }
            if (z2) {
                LivingNormalApiProvider.m71221F5(this.f137883h.m149818o(), ypv.f199493a.m199309D0(), this.f137883h.m149826x());
            }
        }
        if (z3) {
            this.f137883h = null;
        }
        this.f137885j = null;
        this.f137880e = null;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m158672x0() {
        gkh0.m126627j(u0t.f172944c, "roomManage retryConnect");
        if (this.f137882g < ypv.m215672k().m195768X4()) {
            this.f137882g++;
            m158670v0();
        } else {
            m158622B0(ypv.f199497e.getString(R$string.f46986Tj));
            this.f137879d = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m158673y0(boolean z) {
        this.f137880e.setMute(z);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m158674z0(boolean z) {
        if (m158644V()) {
            if (z) {
                m158631I().mo73348o(ypv.f199497e.getString(R$string.f46680Fd));
            } else {
                m158631I().mo73347n();
            }
            m158631I().mo73346m(z);
        }
    }
}
