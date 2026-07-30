package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceSweet;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes11.dex */
public class gso0<D extends ho2> extends x6s<D, hqo0> {

    /* JADX INFO: renamed from: j */
    public gpo0 f104196j;

    /* JADX INFO: renamed from: k */
    public lso0 f104197k;

    /* JADX INFO: renamed from: l */
    public final nqo0 f104198l;

    /* JADX INFO: renamed from: m */
    public xqo0 f104199m;

    /* JADX INFO: renamed from: n */
    public cro0 f104200n;

    /* JADX INFO: renamed from: o */
    public c4g0 f104201o;

    /* JADX INFO: renamed from: p */
    public long f104202p;

    public gso0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new hqo0(bsmVar.f77095a, this));
        this.f104198l = (nqo0) m144512z2(new nqo0(bsmVar));
        this.f104199m = (xqo0) m144512z2(new xqo0(bsmVar));
        cro0 cro0Var = new cro0(bsmVar.f77095a, this);
        this.f104200n = cro0Var;
        cro0Var.mo21065i1(this);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m127809T3(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m127810U3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m127818k4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        ((hqo0) this.viewModel).m132499O(voiceCpBindMessage);
        gpo0 gpo0Var = this.f104196j;
        if (gpo0Var != null) {
            gpo0Var.m127458P4(voiceCpBindMessage, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m127819l4(soj0 soj0Var) {
        ((hqo0) this.viewModel).mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m127820m4(soj0 soj0Var) {
        if (((hqo0) this.viewModel).isShowing()) {
            this.f104196j.m127458P4(null, null);
            if (this.f104199m.isShowing()) {
                this.f104199m.m210588V3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m127821n4(soj0 soj0Var) {
        npo0.m160531c();
        m127826f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m127822o4(String str) {
        ((hqo0) this.viewModel).m132499O(null);
        gpo0 gpo0Var = this.f104196j;
        if (gpo0Var != null) {
            gpo0Var.m127458P4(null, str);
        }
        gpo0 gpo0Var2 = this.f104196j;
        if (gpo0Var2 != null) {
            gpo0Var2.m127462T4(str, 1);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        nqo0 nqo0Var = this.f104198l;
        if (nqo0Var != null) {
            nqo0Var.m160660b4(false);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        nqo0 nqo0Var = this.f104198l;
        if (nqo0Var != null) {
            nqo0Var.m160660b4(true);
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        if (this.f104196j == null) {
            this.f104196j = (gpo0) m144512z2(new gpo0(this.f188512e, ((hqo0) this.viewModel).f109082l, this));
        }
        if (this.f104197k == null) {
            this.f104197k = (lso0) m144512z2(new lso0(this.f188512e, ((hqo0) this.viewModel).f109083m));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m127823c4() {
        cro0 cro0Var;
        qro0 qro0Var = this.f104196j.f103829n;
        return ((qro0Var != null && qro0Var.isShowing()) || ((cro0Var = this.f104200n) != null && cro0Var.isShowing())) && System.currentTimeMillis() - this.f104202p > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    }

    /* JADX INFO: renamed from: d4 */
    public void m127824d4() {
        ((hqo0) this.viewModel).mo71838p();
    }

    /* JADX INFO: renamed from: e4 */
    public void m127825e4() {
        gpo0 gpo0Var = this.f104196j;
        if (gpo0Var != null) {
            gpo0Var.m127472s4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m127826f4() {
        duringCreated(bno0.m102814q("")).subscribe(ffw.m121194e(new e30() { // from class: l.eso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93043a.m127828h4((List) obj);
            }
        }, new e30() { // from class: l.fso0
            @Override // p149l.e30
            public final void call(Object obj) {
                gso0.m127809T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m127827g4() {
        gpo0 gpo0Var = this.f104196j;
        return gpo0Var != null && gpo0Var.m127474u4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m127828h4(List list) {
        this.f104200n.m108448M(list);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m127829i4(Long l2) {
        return Boolean.valueOf(m127823c4());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m127830j4(Long l2) {
        this.f104202p = System.currentTimeMillis();
        qro0 qro0Var = this.f104196j.f103829n;
        if (qro0Var != null && qro0Var.isShowing() && !TextUtils.isEmpty(this.f104196j.f103829n.f156020r)) {
            this.f104196j.m127467Y4();
            return;
        }
        cro0 cro0Var = this.f104200n;
        if (cro0Var == null || !cro0Var.isShowing()) {
            m127836u4();
        } else {
            m127826f4();
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m127836u4();
    }

    /* JADX INFO: renamed from: p4 */
    public void m127831p4(int i) {
        if (i == 0) {
            this.f104196j.m127458P4(null, null);
        } else if (i == 1) {
            this.f104197k.m151634N3();
            npo0.m160533e();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void m127832q4() {
        this.f104199m.m210590X3();
    }

    /* JADX INFO: renamed from: r4 */
    public void m127833r4() {
        String strM195997z5 = ypv.m215672k().m195997z5();
        if (TextUtils.isEmpty(strM195997z5)) {
            return;
        }
        jp50.C17834a c17834a = new jp50.C17834a(9000);
        c17834a.m142598B(strM195997z5);
        c17834a.m142609z(1.0d, 0.7d);
        c17834a.m142603t(80);
        m206028F2().OpenH5Event.open().mo172463j(c17834a.m142600q());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean m127834s4() {
        gpo0 gpo0Var = this.f104196j;
        if (gpo0Var == null) {
            return false;
        }
        return !gpo0Var.m127471r4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c) m206028F2().VoiceSweetEvent.showSweetCpDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.zro0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204533a.m127818k4((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceSweetEvent.dismissSweetCpDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.aso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71467a.m127819l4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceSweetEvent.undateRecommendUser().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.bso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77112a.m127820m4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceSweetEvent.showLimitHouseDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.cso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82370a.m127821n4((soj0) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().VoiceSweetEvent.showSweetCpHouse().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.dso0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87778a.m127822o4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m127835t4() {
        mkd0.m154992z(this.f104201o);
        this.f104201o = duringCreated(C22306c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.wro0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f187812a.m127829i4((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.xro0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194157a.m127830j4((Long) obj);
            }
        }, new e30() { // from class: l.yro0
            @Override // p149l.e30
            public final void call(Object obj) {
                gso0.m127810U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m127836u4() {
        mkd0.m154992z(this.f104201o);
    }

    /* JADX INFO: renamed from: v4 */
    public void m127837v4() {
        m206028F2().VoiceSweetEvent.showUnbindCpDialog().m172467p();
    }
}
