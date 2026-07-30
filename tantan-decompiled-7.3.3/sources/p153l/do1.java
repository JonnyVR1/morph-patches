package p153l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Explore;
import com.p051p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.verification.remind.confirm.AvatarConfirmAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes12.dex */
public class do1 extends ar2<go1> {

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, u5d0> f89854a;

    /* JADX INFO: renamed from: b */
    public int f89855b;

    /* JADX INFO: renamed from: c */
    public boolean f89856c;

    /* JADX INFO: renamed from: d */
    public Runnable f89857d;

    /* JADX INFO: renamed from: e */
    public Runnable f89858e;

    /* JADX INFO: renamed from: f */
    public kcg0 f89859f;

    /* JADX INFO: renamed from: g */
    public u5d0 f89860g;

    /* JADX INFO: renamed from: h */
    public C22507a<Integer> f89861h;

    /* JADX INFO: renamed from: l.do1$a */
    public class RunnableC16587a implements Runnable {
        public RunnableC16587a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (do1.this.f89856c) {
                return;
            }
            do1.this.act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: l.do1$b */
    public class RunnableC16588b implements Runnable {
        public RunnableC16588b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Network.isConnected(do1.this.act())) {
                CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
            do1.this.m117127W0();
        }
    }

    public do1(ner nerVar) {
        super(nerVar);
        this.f89854a = new HashMap<>();
        this.f89855b = -1;
        this.f89856c = false;
        this.f89857d = null;
        this.f89858e = null;
        this.f89859f = null;
        this.f89860g = null;
        this.f89861h = C22507a.m222759c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m117090E0(Bundle bundle) {
        ((go1) this.viewModel).m131027f();
    }

    /* JADX INFO: renamed from: C0 */
    public void m117111C0() {
        if (NullChecker.m82486a(this.f89860g) && NullChecker.m82486a(this.f89860g.m194558n())) {
            this.f89860g.m194558n().run();
            i4g0.m138523u("e_verificationresults_continue_button", "p_verification_results", pf60.m172085a("continue_type", this.f89860g.m194561q()), pf60.m172085a("validation_type", m117112D0(this.f89855b)));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public String m117112D0(int i) {
        String str = "" + i;
        if (i == 1) {
            return "avatar";
        }
        if (i != 2) {
            return i != 3 ? str : "CTID";
        }
        return "Identity";
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m117113F0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m117114G0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m117115H0() {
        AvatarConfirmAct.m57258c2(act(), this.f89855b);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m117116I0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m117117J0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m117118L0() {
        AvatarConfirmAct.m57258c2(act(), this.f89855b);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m117119N0() {
        AvatarConfirmAct.m57258c2(act(), 1);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m117120O0(Integer num) {
        if (num.intValue() >= 1) {
            this.f89856c = true;
            if (NullChecker.m82486a(this.f89858e)) {
                l51.m152890J(this.f89858e);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ pf60 m117121P0(Integer num) {
        return pf60.m172085a(this.f89854a.get(num), num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m117122Q0(pf60 pf60Var) {
        this.f89860g = (u5d0) pf60Var.f152156a;
        i4g0.m138493B("e_validation_status", "p_verification_results", pf60.m172085a("validation_type", m117112D0(this.f89855b)), pf60.m172085a("verification_results", this.f89860g.m194563s()));
        ((go1) this.viewModel).m131030k((u5d0) pf60Var.f152156a, this.f89855b, ((Integer) pf60Var.f152157b).intValue());
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m117123R0(PicVerificationInfo picVerificationInfo) {
        if (TEnum.equals(picVerificationInfo.status, "pending") || TEnum.equals(picVerificationInfo.status, StudentVerificationStatus.prePending)) {
            this.f89861h.m137019l(0);
            return;
        }
        boolean zEquals = TEnum.equals(picVerificationInfo.status, "verified");
        C22507a<Integer> c22507a = this.f89861h;
        if (zEquals) {
            c22507a.m137019l(1);
        } else {
            c22507a.m137019l(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m117124S0(pf60 pf60Var) {
        StudentVerificationStatus studentVerificationStatus = ((IdCardVerificationInfo) pf60Var.f152156a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) pf60Var.f152157b).status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f89861h.m137019l(1);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            C22507a<Integer> c22507a = this.f89861h;
            if (zEquals) {
                c22507a.m137019l(0);
                return;
            } else {
                c22507a.m137019l(3);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f89861h.m137019l(2);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f89861h.m137019l(0);
            return;
        }
        boolean zEquals2 = TEnum.equals(studentVerificationStatus, "invalid");
        C22507a<Integer> c22507a2 = this.f89861h;
        if (zEquals2) {
            c22507a2.m137019l(2);
        } else {
            c22507a2.m137019l(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m117125U0(pf60 pf60Var) {
        StudentVerificationStatus studentVerificationStatus = ((PicVerificationInfo) pf60Var.f152156a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) pf60Var.f152157b).status;
        if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending)) {
            this.f89861h.m137019l(0);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            this.f89861h.m137019l(2);
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus2, "verified");
        C22507a<Integer> c22507a = this.f89861h;
        if (zEquals) {
            c22507a.m137019l(1);
        } else {
            c22507a.m137019l(3);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m117126V0(Intent intent) {
        this.f89856c = false;
        this.f89861h.m137019l(0);
        this.f89855b = intent.getIntExtra("verification_type", -1);
        mo40472Z();
        mo40473a0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m117127W0() {
        l51.m152888H(act(), this.f89858e, 20000L);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m117128X0() {
        if (this.f89857d == null) {
            this.f89857d = new RunnableC16587a();
        }
        if (this.f89858e == null) {
            this.f89858e = new RunnableC16588b();
        }
        m117127W0();
        l51.m152888H(act(), this.f89857d, Constants.ONE_MIN_IN_MILLIS);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m117129Y0() {
        if (this.f89855b < 0) {
            return;
        }
        psd0.m173633z(this.f89859f);
        if (NullChecker.m82486a(this.f89857d)) {
            l51.m152890J(this.f89857d);
        }
        if (NullChecker.m82486a(this.f89858e)) {
            l51.m152890J(this.f89858e);
        }
        int i = this.f89855b;
        if (i == 1) {
            this.f89859f = duringCreated(CoreModule.f18264c.f20294B0.m32614j4().map(new qcj() { // from class: l.mn1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo;
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.nn1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f142754a.m117123R0((PicVerificationInfo) obj);
                }
            }));
            return;
        }
        if (i == 2) {
            this.f89859f = duringCreated(CoreModule.f18264c.f20294B0.m32614j4().map(new qcj() { // from class: l.on1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return pf60.m172085a(verificationCenter.idCard, verificationCenter.picVerificationInfo);
                }
            }).filter(new qcj() { // from class: l.pn1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a(((pf60) obj).f152156a));
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.qn1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158455a.m117124S0((pf60) obj);
                }
            }));
        } else if (i == 3) {
            this.f89859f = duringCreated(CoreModule.f18264c.f20294B0.m32614j4().map(new qcj() { // from class: l.rn1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return pf60.m172085a(verificationCenter.ctdidVerificationInfo, verificationCenter.picVerificationInfo);
                }
            }).filter(new qcj() { // from class: l.sn1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a(((pf60) obj).f152156a));
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.tn1
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175217a.m117125U0((pf60) obj);
                }
            }));
        } else {
            act().m68056e2();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f89854a.clear();
        if (this.f89855b == -1) {
            this.f89855b = act().getIntent().getIntExtra("verification_type", -1);
        }
        if (this.f89855b < 0) {
            act().m68056e2();
            return;
        }
        creates(new y20() { // from class: l.kn1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127547a.m117090E0((Bundle) obj);
            }
        });
        int i = this.f89855b;
        if (i == 1) {
            u5d0.C20488a c20488a = new u5d0.C20488a();
            c20488a.m194580j(gra.m131778z() ? "https://fe-static.tancdn.com/v1/raw/ca9b50be-31bd-4aa0-aa4a-699b6d4969ad14.svga" : "https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m194579i(gra.m131778z() ? dbc0.f87359qp : dbc0.f87326pp).m194582l(dbc0.f86553S0).m194574d(dbc0.f87498v0).m194581k("验证中...").m194575e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m194573c("继续探索").m194583m(213).m194576f(Explore.TYPE, "pending").m194578h(false).m194572b(new Runnable() { // from class: l.un1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179694a.m117113F0();
                }
            }).m194577g(0);
            this.f89854a.put(0, c20488a.m194571a());
            u5d0.C20488a c20488a2 = new u5d0.C20488a();
            c20488a2.m194579i(gra.m131778z() ? dbc0.f87425sp : dbc0.f87392rp).m194582l(dbc0.f86553S0).m194574d(dbc0.f87400s0).m194581k("头像本人认证通过").m194575e("当前头像和扫脸信息比对通过").m194573c("继续探索").m194576f(Explore.TYPE, "success").m194583m(110).m194572b(new Runnable() { // from class: l.vn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184800a.m117114G0();
                }
            }).m194578h(true).m194577g(kec0.f125592R);
            this.f89854a.put(1, c20488a2.m194571a());
            u5d0.C20488a c20488a3 = new u5d0.C20488a();
            c20488a3.m194579i(gra.m131778z() ? dbc0.f87293op : dbc0.f87260np).m194582l(dbc0.f86073D0).m194574d(dbc0.f87433t0).m194581k("头像本人认证失败").m194575e("当前头像和扫脸信息差异过大").m194573c("重新认证").m194583m(110).m194578h(false).m194576f("reverify", "fail").m194572b(new Runnable() { // from class: l.wn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f189847a.m117115H0();
                }
            }).m194577g(kec0.f125544O);
            this.f89854a.put(2, c20488a3.m194571a());
            return;
        }
        if (i == 2) {
            u5d0.C20488a c20488a4 = new u5d0.C20488a();
            c20488a4.m194580j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m194579i(gra.m131778z() ? dbc0.f87359qp : dbc0.f87326pp).m194582l(dbc0.f86521R0).m194574d(dbc0.f87498v0).m194581k("验证中...").m194575e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m194573c("继续探索").m194583m(213).m194578h(false).m194576f(Explore.TYPE, "pending").m194572b(new Runnable() { // from class: l.xn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195351a.m117116I0();
                }
            }).m194577g(0);
            this.f89854a.put(0, c20488a4.m194571a());
            u5d0.C20488a c20488a5 = new u5d0.C20488a();
            c20488a5.m194579i(gra.m131778z() ? dbc0.f87555wp : dbc0.f87523vp).m194582l(dbc0.f86521R0).m194574d(dbc0.f87466u0).m194581k("实名 · 头像本人认证通过").m194575e("扫脸信息和身份信息及头像比对通过").m194573c("继续探索").m194583m(110).m194578h(true).m194576f(Explore.TYPE, "success").m194572b(new Runnable() { // from class: l.yn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200766a.m117117J0();
                }
            }).m194577g(kec0.f125608S);
            this.f89854a.put(1, c20488a5.m194571a());
            u5d0.C20488a c20488a6 = new u5d0.C20488a();
            c20488a6.m194579i(gra.m131778z() ? dbc0.f87293op : dbc0.f87260np).m194582l(dbc0.f86073D0).m194574d(dbc0.f87433t0).m194581k("实名 · 头像本人认证失败").m194575e("身份信息和扫脸信息差异过大").m194573c("重新认证").m194583m(110).m194578h(false).m194576f("reverify", "fail").m194572b(new Runnable() { // from class: l.zn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205169a.m117118L0();
                }
            }).m194577g(kec0.f125544O);
            this.f89854a.put(2, c20488a6.m194571a());
            u5d0.C20488a c20488a7 = new u5d0.C20488a();
            c20488a7.m194579i(gra.m131778z() ? dbc0.f87293op : dbc0.f87260np).m194582l(dbc0.f86073D0).m194574d(dbc0.f87433t0).m194581k("实名 · 头像本人认证未激活").m194575e("当前头像和扫脸信息差异过大").m194573c("重新认证").m194583m(110).m194576f("reverify", "continue").m194572b(new Runnable() { // from class: l.ao1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72410a.m117119N0();
                }
            }).m194578h(false).m194577g(kec0.f125544O);
            this.f89854a.put(3, c20488a7.m194571a());
            return;
        }
        if (i == 3) {
            u5d0.C20488a c20488a8 = new u5d0.C20488a();
            c20488a8.m194580j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m194579i(gra.m131778z() ? dbc0.f87359qp : dbc0.f87326pp).m194582l(dbc0.f86553S0).m194574d(dbc0.f87498v0).m194581k("验证中...").m194575e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m194583m(213).m194578h(false).m194576f(Explore.TYPE, "pending").m194577g(0);
            this.f89854a.put(0, c20488a8.m194571a());
            u5d0.C20488a c20488a9 = new u5d0.C20488a();
            c20488a9.m194579i(gra.m131778z() ? dbc0.f87491up : dbc0.f87458tp).m194582l(dbc0.f86553S0).m194574d(dbc0.f87400s0).m194581k("国家网络身份认证通过").m194575e("身份信息验证通过").m194576f(Explore.TYPE, "success").m194583m(110).m194578h(true).m194577g(kec0.f125592R);
            this.f89854a.put(1, c20488a9.m194571a());
            u5d0.C20488a c20488a10 = new u5d0.C20488a();
            c20488a10.m194579i(gra.m131778z() ? dbc0.f87293op : dbc0.f87260np).m194582l(dbc0.f86073D0).m194574d(dbc0.f87433t0).m194581k("国家网络身份认证失败").m194575e("国家网络身份认证失败  身份信息和扫脸信息差异较大").m194583m(110).m194573c("重新认证").m194576f("reverify", "fail").m194578h(false).m194577g(kec0.f125544O);
            this.f89854a.put(2, c20488a10.m194571a());
            u5d0.C20488a c20488a11 = new u5d0.C20488a();
            c20488a11.m194579i(gra.m131778z() ? dbc0.f87293op : dbc0.f87260np).m194582l(dbc0.f86073D0).m194574d(dbc0.f87433t0).m194581k("国家网络身份认证未激活").m194575e("当前头像和扫脸信息差异过大").m194573c("重新认证").m194583m(110).m194576f("reverify", "continue").m194578h(false).m194577g(kec0.f125544O);
            this.f89854a.put(3, c20488a11.m194571a());
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated((C22421c) this.f89861h.distinctUntilChanged().map(new qcj() { // from class: l.bo1
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77606a.m117121P0((Integer) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.co1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82800a.m117122Q0((pf60) obj);
            }
        }));
        duringCreated(this.f89861h.distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.ln1
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132734a.m117120O0((Integer) obj);
            }
        }));
        m117129Y0();
        m117128X0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
