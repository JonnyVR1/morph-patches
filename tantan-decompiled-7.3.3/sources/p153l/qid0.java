package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.mln.OfficialShowMessage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLivePkInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LivePkMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class qid0 {

    /* JADX INFO: renamed from: a */
    public final ngj0 f157816a;

    /* JADX INFO: renamed from: b */
    public final z20<Boolean, Boolean> f157817b;

    /* JADX INFO: renamed from: c */
    public final nsf0 f157818c;

    /* JADX INFO: renamed from: d */
    public boolean f157819d;

    /* JADX INFO: renamed from: e */
    public qwl f157820e;

    /* JADX INFO: renamed from: g */
    public int f157822g;

    /* JADX INFO: renamed from: h */
    public oo2 f157823h;

    /* JADX INFO: renamed from: j */
    public Runnable f157825j;

    /* JADX INFO: renamed from: k */
    public BLiveStreamUrl f157826k;

    /* JADX INFO: renamed from: l */
    public long f157827l;

    /* JADX INFO: renamed from: m */
    public boolean f157828m;

    /* JADX INFO: renamed from: f */
    public C22507a<Pair<Boolean, Boolean>> f157821f = C22507a.m222758b();

    /* JADX INFO: renamed from: i */
    public pwl f157824i = new C19579a();

    /* JADX INFO: renamed from: l.qid0$a */
    public class C19579a extends lct {
        public C19579a() {
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: D0 */
        public void mo120245D0() {
            qid0.this.m176700I().mo74532p(false);
            qid0.this.m176743z0(false);
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: O */
        public void mo120246O() {
            qid0.this.m176743z0(true);
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: R1 */
        public void mo120247R1(float f) {
            qid0.this.m176735r0(f);
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: f2 */
        public void mo120248f2() {
            qid0.this.f157819d = false;
            qid0.this.m176743z0(false);
            qid0.this.m176705N();
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: l0 */
        public void mo123267l0(int i) {
            qid0.this.f157819d = true;
            if (qid0.this.f157823h.m202195r() && !qid0.this.m176696E()) {
                qid0.this.m176741x0();
            }
        }

        @Override // p153l.lct, p153l.pwl
        /* JADX INFO: renamed from: u1 */
        public void mo120249u1() {
            qid0.this.f157819d = false;
            qid0.this.m176705N();
            qid0.this.m176743z0(false);
        }
    }

    public qid0(nsf0 nsf0Var, oo2 oo2Var, ngj0 ngj0Var, z20<Boolean, Boolean> z20Var) {
        this.f157818c = nsf0Var;
        this.f157823h = oo2Var;
        this.f157816a = ngj0Var;
        this.f157817b = z20Var;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C22421c m176680r(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m176681s(Throwable th) {
    }

    /* JADX INFO: renamed from: A0 */
    public final void m176689A0() {
        m176743z0(false);
        m176691B0(zrv.f205803e.getString(R$string.f47792Rj));
        this.f157822g = 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m176690B() {
        if (this.f157825j == null) {
            this.f157825j = new Runnable() { // from class: l.pid0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152527a.m176715X();
                }
            };
        }
        l51.m152888H(zrv.f205803e, this.f157825j, 3000L);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m176691B0(String str) {
        if (m176713V()) {
            m176700I().mo74531o(str);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m176692C() {
        return m176713V() && this.f157823h.m202196s();
    }

    /* JADX INFO: renamed from: C0 */
    public final void m176693C0(BLiveAbsData bLiveAbsData) {
        this.f157823h.m168485V(bLiveAbsData);
    }

    /* JADX INFO: renamed from: D */
    public final void m176694D(ugd0 ugd0Var) {
        this.f157823h.m168500a0(ugd0Var.f138293c);
        this.f157823h.mo168476S(ugd0Var);
    }

    /* JADX INFO: renamed from: D0 */
    public void m176695D0(boolean z) {
        qwl qwlVar = this.f157820e;
        if (qwlVar == null) {
            return;
        }
        qwlVar.mo178522b(z);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m176696E() {
        if (!ConnectivityReceiver.m82467g()) {
            m176743z0(false);
            m176691B0(zrv.f205803e.getString(R$string.f47502E9));
            return true;
        }
        if (!ConnectivityReceiver.m82471k()) {
            return false;
        }
        m176743z0(false);
        m176691B0(zrv.f205803e.getString(R$string.f47590I9));
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m176697F() {
        if (m176713V()) {
            m176700I().destroy();
        }
        qwl qwlVar = this.f157820e;
        if (qwlVar != null) {
            qwlVar.reset();
        }
    }

    /* JADX INFO: renamed from: G */
    public final <T> C22421c<T> m176698G(final C22421c<T> c22421c) {
        return psd0.m173593D(new pcj() { // from class: l.oid0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qid0.m176680r(c22421c);
            }
        }, this.f157821f, false);
    }

    /* JADX INFO: renamed from: H */
    public String m176699H() {
        return this.f157816a.f141831d;
    }

    /* JADX INFO: renamed from: I */
    public final lwl m176700I() {
        return (lwl) this.f157816a.f141828a;
    }

    /* JADX INFO: renamed from: J */
    public String m176701J() {
        return this.f157816a.f141830c;
    }

    /* JADX INFO: renamed from: K */
    public qwl m176702K() {
        return this.f157820e;
    }

    /* JADX INFO: renamed from: L */
    public oo2 m176703L() {
        return this.f157823h;
    }

    /* JADX INFO: renamed from: M */
    public final void m176704M(String str) {
        o1j0.m165651y("主播去公演房秀场啦");
        z20<Boolean, Boolean> z20Var = this.f157817b;
        if (z20Var != null) {
            Boolean bool = Boolean.TRUE;
            z20Var.call(bool, bool);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m176705N() {
        if (m176713V()) {
            m176700I().mo74530n();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m176706O(qwl qwlVar) {
        if (qwlVar != null) {
            this.f157820e = qwlVar;
            qwlVar.mo178527g(true);
        }
        m176707P();
        m176709R();
        m176708Q();
        m176730m0();
        m176712U();
        this.f157821f.m137019l(new Pair<>(Boolean.FALSE, Boolean.TRUE));
    }

    /* JADX INFO: renamed from: P */
    public final void m176707P() {
        m176698G(this.f157823h.m168539n1()).subscribe(dhw.m115825d(new y20() { // from class: l.jid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121075a.m176717Z((LiveControlMessage) obj);
            }
        }));
        m176698G(this.f157823h.m168545q1().m98252S()).subscribe(dhw.m115825d(new y20() { // from class: l.kid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126980a.m176718a0((OfficialShowMessage.OfficialShowJump) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Q */
    public final void m176708Q() {
        m176698G(this.f157823h.m168545q1().m98256U()).subscribe(dhw.m115825d(new y20() { // from class: l.hid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110016a.m176738u0((LivePkMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final void m176709R() {
        m176705N();
        m176743z0(true);
        if (this.f157820e == null) {
            s310 s310Var = new s310(zrv.f205803e);
            this.f157820e = s310Var;
            s310Var.mo178527g(true);
        }
        m176698G(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.lid0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        })).subscribe(dhw.m115825d(new y20() { // from class: l.mid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136957a.m176719b0((NetworkInfo) obj);
            }
        }));
        m176698G(this.f157823h.m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.nid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142117a.m176720c0((jsv) obj);
            }
        }));
        oo2 oo2Var = this.f157823h;
        ngj0 ngj0Var = this.f157816a;
        ipp0.m141533a(oo2Var, "windowroom", "start", 0L, ngj0Var.f141831d, ngj0Var.f141830c);
        this.f157827l = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: S */
    public final void m176710S(BLive bLive) {
        m176711T(bLive, false);
    }

    /* JADX INFO: renamed from: T */
    public final void m176711T(final BLive bLive, final boolean z) {
        if (m176713V()) {
            m176743z0(true);
            m176705N();
            this.f157819d = false;
            m176737t0(bLive);
            m176698G(LivingNormalApiProvider.m72647g5(bLive).flatMap(new qcj() { // from class: l.yhd0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f199955a.m176721d0(z, bLive, (ugd0) obj);
                }
            })).subscribe(dhw.m115826e(new y20() { // from class: l.zhd0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204409a.m176722e0(z, obj);
                }
            }, new y20() { // from class: l.aid0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f71523a.m176723f0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m176712U() {
        m176698G(Act.foreground()).subscribe(dhw.m115825d(new y20() { // from class: l.xhd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194355a.m176724g0((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final boolean m176713V() {
        return this.f157816a.f141828a != null;
    }

    /* JADX INFO: renamed from: W */
    public final void m176714W(String str) {
        BLive bLiveNew_ = BLive.new_();
        bLiveNew_.f45171id = str;
        m176711T(bLiveNew_, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m176715X() {
        if (m176692C()) {
            ngj0 ngj0Var = this.f157816a;
            m176698G(LivingNormalApiProvider.m72584Z5(ngj0Var.f141830c, ngj0Var.f141831d)).subscribe(dhw.m115826e(new y20() { // from class: l.fid0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f99179a.m176716Y((BLive) obj);
                }
            }, new y20() { // from class: l.gid0
                @Override // p153l.y20
                public final void call(Object obj) {
                    qid0.m176681s((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m176716Y(BLive bLive) {
        if (bLive == null || bLive.isOfficialShowRoom()) {
            z20<Boolean, Boolean> z20Var = this.f157817b;
            if (z20Var != null) {
                Boolean bool = Boolean.TRUE;
                z20Var.call(bool, bool);
            }
            o1j0.m165651y("当前直播已结束");
            return;
        }
        if (m176692C()) {
            nsh0.m164608j("live_float_window", "playNext:" + bLive.f45171id);
            m176710S(bLive);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m176717Z(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                oo2 oo2Var = this.f157823h;
                oo2Var.mo118370K1(oo2Var.m202194o());
                break;
            case "live_pull_update_video_quality":
                m176739v0();
                break;
            case "boot":
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47799S5));
                this.f157817b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "stop":
            case "force_stop":
                this.f157823h.mo160116h(v9s.f183031e);
                break;
            case "pause":
                this.f157823h.mo160116h(qcu.f156623b);
                break;
            case "start":
                m176714W(liveControlMessage.liveId);
                break;
            case "forbidden_multidevice":
                o1j0.m165651y(liveControlMessage.isAnchor ? zrv.f205803e.getString(R$string.f47820T5) : zrv.f205803e.getString(R$string.f47778R5));
                this.f157817b.call(Boolean.TRUE, Boolean.FALSE);
                break;
            case "recover":
                m176714W(liveControlMessage.liveId);
                break;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m176718a0(OfficialShowMessage.OfficialShowJump officialShowJump) {
        m176704M(officialShowJump.getOfficialShowLiveId());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m176719b0(NetworkInfo networkInfo) {
        if (this.f157819d) {
            m176731n0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m176720c0(jsv jsvVar) {
        int iM146875a = jsvVar.m146875a();
        if (iM146875a == 2) {
            m176733p0();
        } else if (iM146875a == 3) {
            m176734q0();
        } else {
            if (iM146875a != 4) {
                return;
            }
            m176732o0();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ C22421c m176721d0(boolean z, BLive bLive, ugd0 ugd0Var) {
        m176694D(ugd0Var);
        if (z) {
            return C22421c.just(uxj0.f181467a);
        }
        return LivingNormalApiProvider.m72574Y4(ugd0Var.f138292b.f45172id, zrv.f205799a.m207631D0(), this.f157823h.mo160117o0(), NullChecker.m82486a(bLive.recommendInfo) ? bLive.recommendInfo.category : null, m176703L().m202200x());
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m176722e0(boolean z, Object obj) {
        this.f157823h.mo183435j().memberCount += 1.0d;
        m176693C0(this.f157823h.mo183435j());
        if (z) {
            return;
        }
        Act.C4450r c4450rForeground_ = Act.foreground_();
        oo2 oo2Var = this.f157823h;
        if (c4450rForeground_ != null) {
            ngj0 ngj0Var = this.f157816a;
            ipp0.m141533a(oo2Var, "windowroom", "start", 0L, ngj0Var.f141831d, ngj0Var.f141830c);
        } else {
            ngj0 ngj0Var2 = this.f157816a;
            ipp0.m141533a(oo2Var, "backgroundroom", "start", 0L, ngj0Var2.f141831d, ngj0Var2.f141830c);
        }
        this.f157827l = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m176723f0(Throwable th) {
        m176743z0(false);
        m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m176724g0(Act.C4450r c4450r) {
        if (c4450r != null && this.f157828m) {
            this.f157828m = false;
            oo2 oo2Var = this.f157823h;
            long jM174454o = pzi0.m174454o() - this.f157827l;
            ngj0 ngj0Var = this.f157816a;
            ipp0.m141533a(oo2Var, "backgroundroom", "ending", jM174454o, ngj0Var.f141831d, ngj0Var.f141830c);
            oo2 oo2Var2 = this.f157823h;
            ngj0 ngj0Var2 = this.f157816a;
            ipp0.m141533a(oo2Var2, "windowroom", "start", 0L, ngj0Var2.f141831d, ngj0Var2.f141830c);
            this.f157827l = pzi0.m174454o();
            return;
        }
        if (c4450r == null) {
            this.f157828m = true;
            oo2 oo2Var3 = this.f157823h;
            long jM174454o2 = pzi0.m174454o() - this.f157827l;
            ngj0 ngj0Var3 = this.f157816a;
            ipp0.m141533a(oo2Var3, "windowroom", "ending", jM174454o2, ngj0Var3.f141831d, ngj0Var3.f141830c);
            oo2 oo2Var4 = this.f157823h;
            ngj0 ngj0Var4 = this.f157816a;
            ipp0.m141533a(oo2Var4, "backgroundroom", "start", 0L, ngj0Var4.f141831d, ngj0Var4.f141830c);
            this.f157827l = pzi0.m174454o();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m176725h0(User user) {
        m176703L().m168482U(user.localFollowship);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m176726i0(ugd0 ugd0Var) {
        nsh0.m164608j("live_float_window", "onErrorClicked, new address:" + ugd0Var.f138293c.streamUrl.pullFlv + ",ipv6: " + ugd0Var.f138293c.streamUrl.pullFlvIpv6);
        m176743z0(false);
        m176694D(ugd0Var);
        this.f157823h.m168485V(ugd0Var.f138293c);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m176727j0(Throwable th) {
        StringBuilder sb = new StringBuilder("onErrorClicked fail. reason:");
        sb.append(th == null ? "" : th.getMessage());
        fhw.m125605a("live_float_window", sb.toString());
        this.f157819d = true;
        m176743z0(false);
        m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m176728k0(BLive bLive) {
        if (bLive == null) {
            this.f157819d = true;
            m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
            return;
        }
        nsh0.m164608j(v2t.f182113c, "roomManage refreshStreamAddress success, new address:" + bLive.streamUrl.pullFlv + ", ipv6: " + bLive.streamUrl.pullFlvIpv6);
        this.f157823h.mo183431g(bLive);
        this.f157823h.m168485V(bLive);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m176729l0(Throwable th) {
        this.f157819d = true;
        m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m176730m0() {
        m176698G(((jfv) zrv.m221194l(htd0.f111520b)).m144720g()).subscribe(dhw.m115825d(new y20() { // from class: l.iid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115085a.m176725h0((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m176731n0() {
        BLiveAbsData bLiveAbsDataMo183435j = this.f157823h.mo183435j();
        this.f157819d = false;
        m176743z0(true);
        m176691B0(zrv.f205803e.getString(R$string.f47528Fd));
        m176698G(LivingNormalApiProvider.m72647g5(bLiveAbsDataMo183435j)).subscribe(dhw.m115826e(new y20() { // from class: l.did0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88626a.m176726i0((ugd0) obj);
            }
        }, new y20() { // from class: l.eid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94140a.m176727j0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m176732o0() {
        this.f157819d = false;
        m176743z0(false);
        m176695D0(true);
        m176691B0(zrv.f205803e.getString(R$string.f47905X6));
        m176697F();
        m176700I().mo74532p(true);
        Act.C4450r c4450rForeground_ = Act.foreground_();
        oo2 oo2Var = this.f157823h;
        if (c4450rForeground_ != null) {
            long jM174454o = pzi0.m174454o() - this.f157827l;
            ngj0 ngj0Var = this.f157816a;
            ipp0.m141533a(oo2Var, "windowroom", "ending", jM174454o, ngj0Var.f141831d, ngj0Var.f141830c);
        } else {
            long jM174454o2 = pzi0.m174454o() - this.f157827l;
            ngj0 ngj0Var2 = this.f157816a;
            ipp0.m141533a(oo2Var, "backgroundroom", "ending", jM174454o2, ngj0Var2.f141831d, ngj0Var2.f141830c);
        }
        m176690B();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m176733p0() {
        m176705N();
        oo2 oo2Var = this.f157823h;
        oo2Var.mo146096e2(false, oo2Var.mo183435j());
        BLiveStreamUrl bLiveStreamUrl = this.f157826k;
        if (bLiveStreamUrl != null && TextUtils.equals(bLiveStreamUrl.pullFlv, this.f157823h.mo183435j().streamUrl.pullFlv)) {
            this.f157826k = null;
            return;
        }
        this.f157826k = null;
        if (m176736s0(this.f157823h.mo183435j()) != 0) {
            m176743z0(false);
            m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m176734q0() {
        m176695D0(false);
        m176689A0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m176735r0(float f) {
        this.f157818c.m164595b(new nsf0.C18943a(f));
    }

    /* JADX INFO: renamed from: s0 */
    public final int m176736s0(BLiveAbsData bLiveAbsData) {
        if (this.f157820e == null) {
            s310 s310Var = new s310(zrv.f205803e);
            this.f157820e = s310Var;
            s310Var.mo178527g(true);
        }
        this.f157820e.mo178526f(m176700I().getPlayerContainer());
        this.f157820e.mo178523c(this.f157824i);
        boolean zIsPlaying = this.f157820e.isPlaying();
        qwl qwlVar = this.f157820e;
        if (zIsPlaying) {
            qwlVar.mo178524d(m176700I().getPlayerContainer());
            m176705N();
            m176743z0(false);
            m176700I().mo74532p(false);
        } else {
            qwlVar.mo178532l("", "floatWindow", bLiveAbsData);
            qwl qwlVar2 = this.f157820e;
            BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
            qwlVar2.mo178530j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f45267id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        }
        boolean zBooleanValue = this.f157816a.f141829b.get().booleanValue();
        this.f157820e.setMute(zBooleanValue);
        m176700I().setVoiceSelected(!zBooleanValue);
        return 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m176737t0(BLive bLive) {
        BLiveStreamUrl bLiveStreamUrl = bLive.streamUrl;
        if (bLiveStreamUrl != null) {
            if ((TextUtils.isEmpty(bLiveStreamUrl.pullFlv) && TextUtils.isEmpty(bLive.streamUrl.pullFlvIpv6)) || bLive.streamCdnInfo == null) {
                return;
            }
            this.f157826k = bLive.streamUrl;
            nsh0.m164608j(v2t.f182113c, "float window quickPlay:" + this.f157826k.pullFlv + ",ipv6: " + this.f157826k.pullFlvIpv6);
            if (m176736s0(bLive) == 0) {
                m176705N();
            } else {
                m176743z0(false);
                m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m176738u0(LivePkMessage livePkMessage) {
        BLive bLive = (BLive) this.f157823h.mo183435j();
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
    public final void m176739v0() {
        m176743z0(true);
        m176698G(LivingNormalApiProvider.m72468M6(this.f157823h.m202191k(), this.f157823h.m168538n0() == null ? "" : this.f157823h.m168538n0().callback)).subscribe(dhw.m115826e(new y20() { // from class: l.bid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76860a.m176728k0((BLive) obj);
            }
        }, new y20() { // from class: l.cid0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81929a.m176729l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public void m176740w0(boolean z, boolean z2, boolean z3) {
        l51.m152890J(this.f157825j);
        this.f157821f.onCompleted();
        this.f157820e.mo178528h(this.f157824i);
        m176695D0(true);
        m176697F();
        ((hiv) zrv.m221194l(htd0.f111521c)).m135153e();
        oo2 oo2Var = this.f157823h;
        if (oo2Var != null) {
            long jM174454o = pzi0.m174454o() - this.f157827l;
            ngj0 ngj0Var = this.f157816a;
            ipp0.m141533a(oo2Var, "windowroom", "ending", jM174454o, ngj0Var.f141831d, ngj0Var.f141830c);
            if (z) {
                oo2 oo2Var2 = this.f157823h;
                oo2Var2.m168518g2(oo2Var2.mo183435j());
            }
            if (z2) {
                LivingNormalApiProvider.m72404F5(this.f157823h.m202194o(), zrv.f205799a.m207631D0(), this.f157823h.m202200x());
            }
        }
        if (z3) {
            this.f157823h = null;
        }
        this.f157825j = null;
        this.f157820e = null;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m176741x0() {
        nsh0.m164608j(v2t.f182113c, "roomManage retryConnect");
        if (this.f157822g < zrv.m221193k().m203555X4()) {
            this.f157822g++;
            m176739v0();
        } else {
            m176691B0(zrv.f205803e.getString(R$string.f47834Tj));
            this.f157819d = true;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m176742y0(boolean z) {
        this.f157820e.setMute(z);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m176743z0(boolean z) {
        if (m176713V()) {
            if (z) {
                m176700I().mo74531o(zrv.f205803e.getString(R$string.f47528Fd));
            } else {
                m176700I().mo74530n();
            }
            m176700I().mo74529m(z);
        }
    }
}
