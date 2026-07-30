package p009l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.VoiceSweet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bsm;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.ho2;
import l.jo0;
import l.jp50;
import l.mkd0;
import l.soj0;
import l.w9j;
import l.wxs;
import l.x6s;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gso0<D extends ho2> extends x6s<D, hqo0> {

    /* JADX INFO: renamed from: j */
    public gpo0 f13718j;

    /* JADX INFO: renamed from: k */
    public lso0 f13719k;

    /* JADX INFO: renamed from: l */
    public final nqo0 f13720l;

    /* JADX INFO: renamed from: m */
    public xqo0 f13721m;

    /* JADX INFO: renamed from: n */
    public cro0 f13722n;

    /* JADX INFO: renamed from: o */
    public c4g0 f13723o;

    /* JADX INFO: renamed from: p */
    public long f13724p;

    public gso0(bsm bsmVar) {
        super(bsmVar);
        C(new hqo0(bsmVar.a, this));
        this.f13720l = z2(new nqo0(bsmVar));
        this.f13721m = z2(new xqo0(bsmVar));
        cro0 cro0Var = new cro0(bsmVar.a, this);
        this.f13722n = cro0Var;
        cro0Var.m12797n(this);
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ void m15225T3(Throwable th) {
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ void m15226U3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public /* synthetic */ void m15234k4(VoiceSweet.VoiceCpBindMessage voiceCpBindMessage) {
        ((bwr) this).viewModel.m15941O(voiceCpBindMessage);
        gpo0 gpo0Var = this.f13718j;
        if (gpo0Var != null) {
            gpo0Var.m15199P4(voiceCpBindMessage, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m15235l4(soj0 soj0Var) {
        ((bwr) this).viewModel.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public /* synthetic */ void m15236m4(soj0 soj0Var) {
        if (((bwr) this).viewModel.isShowing()) {
            this.f13718j.m15199P4(null, null);
            if (this.f13721m.isShowing()) {
                this.f13721m.m24964V3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public /* synthetic */ void m15237n4(soj0 soj0Var) {
        npo0.m19005c();
        m15246f4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public /* synthetic */ void m15238o4(String str) {
        ((bwr) this).viewModel.m15941O(null);
        gpo0 gpo0Var = this.f13718j;
        if (gpo0Var != null) {
            gpo0Var.m15199P4(null, str);
        }
        gpo0 gpo0Var2 = this.f13718j;
        if (gpo0Var2 != null) {
            gpo0Var2.m15203T4(str, 1);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public void m15239O3() {
        super.O3();
        nqo0 nqo0Var = this.f13720l;
        if (nqo0Var != null) {
            nqo0Var.m19040b4(false);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m15240P3() {
        super.P3();
        nqo0 nqo0Var = this.f13720l;
        if (nqo0Var != null) {
            nqo0Var.m19040b4(true);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m15241R3() {
        super.R3();
        if (this.f13718j == null) {
            this.f13718j = z2(new gpo0(((wxs) this).e, ((bwr) this).viewModel.f14221l, this));
        }
        if (this.f13719k == null) {
            this.f13719k = z2(new lso0(((wxs) this).e, ((bwr) this).viewModel.f14222m));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m15242T() {
        super/*l.k4t*/.T();
    }

    /* JADX INFO: renamed from: c4 */
    public boolean m15243c4() {
        cro0 cro0Var;
        qro0 qro0Var = this.f13718j.f13682n;
        return ((qro0Var != null && qro0Var.isShowing()) || ((cro0Var = this.f13722n) != null && cro0Var.isShowing())) && System.currentTimeMillis() - this.f13724p > 30000;
    }

    /* JADX INFO: renamed from: d4 */
    public void m15244d4() {
        ((bwr) this).viewModel.p();
    }

    /* JADX INFO: renamed from: e4 */
    public void m15245e4() {
        gpo0 gpo0Var = this.f13718j;
        if (gpo0Var != null) {
            gpo0Var.m15213s4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m15246f4() {
        duringCreated(bno0.m12174q("")).subscribe(ffw.e(new e30() { // from class: l.eso0
            public final void call(Object obj) {
                this.f12681a.m15248h4((List) obj);
            }
        }, new e30() { // from class: l.fso0
            public final void call(Object obj) {
                gso0.m15225T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public boolean m15247g4() {
        gpo0 gpo0Var = this.f13718j;
        return gpo0Var != null && gpo0Var.m15216u4();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m15248h4(List list) {
        this.f13722n.m12794M(list);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ Boolean m15249i4(Long l2) {
        return Boolean.valueOf(m15243c4());
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m15250j4(Long l2) {
        this.f13724p = System.currentTimeMillis();
        qro0 qro0Var = this.f13718j.f13682n;
        if (qro0Var != null && qro0Var.isShowing() && !TextUtils.isEmpty(this.f13718j.f13682n.f19480r)) {
            this.f13718j.m15208Y4();
            return;
        }
        cro0 cro0Var = this.f13722n;
        if (cro0Var == null || !cro0Var.isShowing()) {
            m15258u4();
        } else {
            m15246f4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m15251n() {
        super/*l.h4t*/.n();
        m15258u4();
    }

    /* JADX INFO: renamed from: p4 */
    public void m15252p4(int i) {
        if (i == 0) {
            this.f13718j.m15199P4(null, null);
        } else if (i == 1) {
            this.f13719k.m18049N3();
            npo0.m19007e();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public void m15253q4() {
        this.f13721m.m24966X3();
    }

    /* JADX INFO: renamed from: r4 */
    public void m15254r4() {
        String strZ5 = ypv.m25490k().z5();
        if (TextUtils.isEmpty(strZ5)) {
            return;
        }
        jp50.a aVar = new jp50.a(9000);
        aVar.B(strZ5);
        aVar.z(1.0d, 0.7d);
        aVar.t(80);
        F2().OpenH5Event.open().j(aVar.q());
    }

    /* JADX INFO: renamed from: s4 */
    public boolean m15255s4() {
        gpo0 gpo0Var = this.f13718j;
        if (gpo0Var == null) {
            return false;
        }
        return !gpo0Var.m15212r4();
    }

    /* JADX INFO: renamed from: t */
    public void m15256t() {
        super/*l.k4t*/.t();
        duringCreated((c) F2().VoiceSweetEvent.showSweetCpDialog().g()).subscribe(ffw.d(new e30() { // from class: l.zro0
            public final void call(Object obj) {
                this.f23856a.m15234k4((VoiceSweet.VoiceCpBindMessage) obj);
            }
        }));
        duringCreated((c) F2().VoiceSweetEvent.dismissSweetCpDialog().g()).subscribe(ffw.d(new e30() { // from class: l.aso0
            public final void call(Object obj) {
                this.f9668a.m15235l4((soj0) obj);
            }
        }));
        duringCreated((c) F2().VoiceSweetEvent.undateRecommendUser().g()).subscribe(ffw.d(new e30() { // from class: l.bso0
            public final void call(Object obj) {
                this.f10296a.m15236m4((soj0) obj);
            }
        }));
        duringCreated((c) F2().VoiceSweetEvent.showLimitHouseDialog().g()).subscribe(ffw.d(new e30() { // from class: l.cso0
            public final void call(Object obj) {
                this.f10760a.m15237n4((soj0) obj);
            }
        }));
        duringCreated((c) F2().VoiceSweetEvent.showSweetCpHouse().g()).subscribe(ffw.d(new e30() { // from class: l.dso0
            public final void call(Object obj) {
                this.f11979a.m15238o4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m15257t4() {
        mkd0.z(this.f13723o);
        this.f13723o = duringCreated(c.interval(30L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).filter(new w9j() { // from class: l.wro0
            public final Object call(Object obj) {
                return this.f22292a.m15249i4((Long) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.xro0
            public final void call(Object obj) {
                this.f22702a.m15250j4((Long) obj);
            }
        }, new e30() { // from class: l.yro0
            public final void call(Object obj) {
                gso0.m15226U3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m15258u4() {
        mkd0.z(this.f13723o);
    }

    /* JADX INFO: renamed from: v4 */
    public void m15259v4() {
        F2().VoiceSweetEvent.showUnbindCpDialog().p();
    }
}
