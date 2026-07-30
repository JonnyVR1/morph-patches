package p149l;

import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Explore;
import com.p046p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.verification.remind.confirm.AvatarConfirmAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class wn1 extends jq2<zn1> {

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, rxc0> f187233a;

    /* JADX INFO: renamed from: b */
    public int f187234b;

    /* JADX INFO: renamed from: c */
    public boolean f187235c;

    /* JADX INFO: renamed from: d */
    public Runnable f187236d;

    /* JADX INFO: renamed from: e */
    public Runnable f187237e;

    /* JADX INFO: renamed from: f */
    public c4g0 f187238f;

    /* JADX INFO: renamed from: g */
    public rxc0 f187239g;

    /* JADX INFO: renamed from: h */
    public C22392a<Integer> f187240h;

    /* JADX INFO: renamed from: l.wn1$a */
    public class RunnableC20918a implements Runnable {
        public RunnableC20918a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wn1.this.f187235c) {
                return;
            }
            wn1.this.act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: l.wn1$b */
    public class RunnableC20919b implements Runnable {
        public RunnableC20919b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Network.isConnected(wn1.this.act())) {
                CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
            wn1.this.m204593W0();
        }
    }

    public wn1(mcr mcrVar) {
        super(mcrVar);
        this.f187233a = new HashMap<>();
        this.f187234b = -1;
        this.f187235c = false;
        this.f187236d = null;
        this.f187237e = null;
        this.f187238f = null;
        this.f187239g = null;
        this.f187240h = C22392a.m221513c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m204556E0(Bundle bundle) {
        ((zn1) this.viewModel).m219397f();
    }

    /* JADX INFO: renamed from: C0 */
    public void m204577C0() {
        if (NullChecker.m81303a(this.f187239g) && NullChecker.m81303a(this.f187239g.m181519n())) {
            this.f187239g.m181519n().run();
            zvf0.m220399u("e_verificationresults_continue_button", "p_verification_results", j760.m140076a("continue_type", this.f187239g.m181522q()), j760.m140076a("validation_type", m204578D0(this.f187234b)));
        }
    }

    /* JADX INFO: renamed from: D0 */
    public String m204578D0(int i) {
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
    public final /* synthetic */ void m204579F0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m204580G0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m204581H0() {
        AvatarConfirmAct.m56075b2(act(), this.f187234b);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m204582I0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m204583J0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m204584L0() {
        AvatarConfirmAct.m56075b2(act(), this.f187234b);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m204585N0() {
        AvatarConfirmAct.m56075b2(act(), 1);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m204586O0(Integer num) {
        if (num.intValue() >= 1) {
            this.f187235c = true;
            if (NullChecker.m81303a(this.f187237e)) {
                e51.m114745J(this.f187237e);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ j760 m204587P0(Integer num) {
        return j760.m140076a(this.f187233a.get(num), num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m204588Q0(j760 j760Var) {
        this.f187239g = (rxc0) j760Var.f116564a;
        zvf0.m220369B("e_validation_status", "p_verification_results", j760.m140076a("validation_type", m204578D0(this.f187234b)), j760.m140076a("verification_results", this.f187239g.m181524s()));
        ((zn1) this.viewModel).m219400k((rxc0) j760Var.f116564a, this.f187234b, ((Integer) j760Var.f116565b).intValue());
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m204589R0(PicVerificationInfo picVerificationInfo) {
        if (TEnum.equals(picVerificationInfo.status, "pending") || TEnum.equals(picVerificationInfo.status, StudentVerificationStatus.prePending)) {
            this.f187240h.m132487l(0);
            return;
        }
        boolean zEquals = TEnum.equals(picVerificationInfo.status, "verified");
        C22392a<Integer> c22392a = this.f187240h;
        if (zEquals) {
            c22392a.m132487l(1);
        } else {
            c22392a.m132487l(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m204590S0(j760 j760Var) {
        StudentVerificationStatus studentVerificationStatus = ((IdCardVerificationInfo) j760Var.f116564a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) j760Var.f116565b).status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f187240h.m132487l(1);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            C22392a<Integer> c22392a = this.f187240h;
            if (zEquals) {
                c22392a.m132487l(0);
                return;
            } else {
                c22392a.m132487l(3);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f187240h.m132487l(2);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f187240h.m132487l(0);
            return;
        }
        boolean zEquals2 = TEnum.equals(studentVerificationStatus, "invalid");
        C22392a<Integer> c22392a2 = this.f187240h;
        if (zEquals2) {
            c22392a2.m132487l(2);
        } else {
            c22392a2.m132487l(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m204591U0(j760 j760Var) {
        StudentVerificationStatus studentVerificationStatus = ((PicVerificationInfo) j760Var.f116564a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) j760Var.f116565b).status;
        if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, StudentVerificationStatus.prePending)) {
            this.f187240h.m132487l(0);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            this.f187240h.m132487l(2);
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus2, "verified");
        C22392a<Integer> c22392a = this.f187240h;
        if (zEquals) {
            c22392a.m132487l(1);
        } else {
            c22392a.m132487l(3);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m204592V0(Intent intent) {
        this.f187235c = false;
        this.f187240h.m132487l(0);
        this.f187234b = intent.getIntExtra("verification_type", -1);
        mo39469Z();
        mo39470a0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m204593W0() {
        e51.m114743H(act(), this.f187237e, 20000L);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m204594X0() {
        if (this.f187236d == null) {
            this.f187236d = new RunnableC20918a();
        }
        if (this.f187237e == null) {
            this.f187237e = new RunnableC20919b();
        }
        m204593W0();
        e51.m114743H(act(), this.f187236d, Constants.ONE_MIN_IN_MILLIS);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m204595Y0() {
        if (this.f187234b < 0) {
            return;
        }
        mkd0.m154992z(this.f187238f);
        if (NullChecker.m81303a(this.f187236d)) {
            e51.m114745J(this.f187236d);
        }
        if (NullChecker.m81303a(this.f187237e)) {
            e51.m114745J(this.f187237e);
        }
        int i = this.f187234b;
        if (i == 1) {
            this.f187238f = duringCreated(CoreModule.f17545c.f19552B0.m31611j4().map(new w9j() { // from class: l.fn1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo;
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.gn1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103569a.m204589R0((PicVerificationInfo) obj);
                }
            }));
            return;
        }
        if (i == 2) {
            this.f187238f = duringCreated(CoreModule.f17545c.f19552B0.m31611j4().map(new w9j() { // from class: l.hn1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return j760.m140076a(verificationCenter.idCard, verificationCenter.picVerificationInfo);
                }
            }).filter(new w9j() { // from class: l.in1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a(((j760) obj).f116564a));
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.jn1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f118743a.m204590S0((j760) obj);
                }
            }));
        } else if (i == 3) {
            this.f187238f = duringCreated(CoreModule.f17545c.f19552B0.m31611j4().map(new w9j() { // from class: l.kn1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return j760.m140076a(verificationCenter.ctdidVerificationInfo, verificationCenter.picVerificationInfo);
                }
            }).filter(new w9j() { // from class: l.ln1
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a(((j760) obj).f116564a));
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.mn1
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f134726a.m204591U0((j760) obj);
                }
            }));
        } else {
            act().m66873d2();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f187233a.clear();
        if (this.f187234b == -1) {
            this.f187234b = act().getIntent().getIntExtra("verification_type", -1);
        }
        if (this.f187234b < 0) {
            act().m66873d2();
            return;
        }
        creates(new e30() { // from class: l.dn1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87019a.m204556E0((Bundle) obj);
            }
        });
        int i = this.f187234b;
        if (i == 1) {
            rxc0.C19808a c19808a = new rxc0.C19808a();
            c19808a.m181541j(upa.m194847z() ? "https://fe-static.tancdn.com/v1/raw/ca9b50be-31bd-4aa0-aa4a-699b6d4969ad14.svga" : "https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m181540i(upa.m194847z() ? x2c0.f189242Co : x2c0.f189210Bo).m181543l(x2c0.f189687R0).m181535d(x2c0.f190603u0).m181542k("验证中...").m181536e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m181534c("继续探索").m181544m(213).m181537f(Explore.TYPE, "pending").m181539h(false).m181533b(new Runnable() { // from class: l.nn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139690a.m204579F0();
                }
            }).m181538g(0);
            this.f187233a.put(0, c19808a.m181532a());
            rxc0.C19808a c19808a2 = new rxc0.C19808a();
            c19808a2.m181540i(upa.m194847z() ? x2c0.f189306Eo : x2c0.f189274Do).m181543l(x2c0.f189687R0).m181535d(x2c0.f190507r0).m181542k("头像本人认证通过").m181536e("当前头像和扫脸信息比对通过").m181534c("继续探索").m181537f(Explore.TYPE, "success").m181544m(110).m181533b(new Runnable() { // from class: l.on1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144735a.m204580G0();
                }
            }).m181539h(true).m181538g(f6c0.f95538R);
            this.f187233a.put(1, c19808a2.m181532a());
            rxc0.C19808a c19808a3 = new rxc0.C19808a();
            c19808a3.m181540i(upa.m194847z() ? x2c0.f189178Ao : x2c0.f190787zo).m181543l(x2c0.f189218C0).m181535d(x2c0.f190539s0).m181542k("头像本人认证失败").m181536e("当前头像和扫脸信息差异过大").m181534c("重新认证").m181544m(110).m181539h(false).m181537f("reverify", "fail").m181533b(new Runnable() { // from class: l.pn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150319a.m204581H0();
                }
            }).m181538g(f6c0.f95490O);
            this.f187233a.put(2, c19808a3.m181532a());
            return;
        }
        if (i == 2) {
            rxc0.C19808a c19808a4 = new rxc0.C19808a();
            c19808a4.m181541j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m181540i(upa.m194847z() ? x2c0.f189242Co : x2c0.f189210Bo).m181543l(x2c0.f189656Q0).m181535d(x2c0.f190603u0).m181542k("验证中...").m181536e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m181534c("继续探索").m181544m(213).m181539h(false).m181537f(Explore.TYPE, "pending").m181533b(new Runnable() { // from class: l.qn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155374a.m204582I0();
                }
            }).m181538g(0);
            this.f187233a.put(0, c19808a4.m181532a());
            rxc0.C19808a c19808a5 = new rxc0.C19808a();
            c19808a5.m181540i(upa.m194847z() ? x2c0.f189432Io : x2c0.f189401Ho).m181543l(x2c0.f189656Q0).m181535d(x2c0.f190571t0).m181542k("实名 · 头像本人认证通过").m181536e("扫脸信息和身份信息及头像比对通过").m181534c("继续探索").m181544m(110).m181539h(true).m181537f(Explore.TYPE, "success").m181533b(new Runnable() { // from class: l.rn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160231a.m204583J0();
                }
            }).m181538g(f6c0.f95554S);
            this.f187233a.put(1, c19808a5.m181532a());
            rxc0.C19808a c19808a6 = new rxc0.C19808a();
            c19808a6.m181540i(upa.m194847z() ? x2c0.f189178Ao : x2c0.f190787zo).m181543l(x2c0.f189218C0).m181535d(x2c0.f190539s0).m181542k("实名 · 头像本人认证失败").m181536e("身份信息和扫脸信息差异过大").m181534c("重新认证").m181544m(110).m181539h(false).m181537f("reverify", "fail").m181533b(new Runnable() { // from class: l.sn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165405a.m204584L0();
                }
            }).m181538g(f6c0.f95490O);
            this.f187233a.put(2, c19808a6.m181532a());
            rxc0.C19808a c19808a7 = new rxc0.C19808a();
            c19808a7.m181540i(upa.m194847z() ? x2c0.f189178Ao : x2c0.f190787zo).m181543l(x2c0.f189218C0).m181535d(x2c0.f190539s0).m181542k("实名 · 头像本人认证未激活").m181536e("当前头像和扫脸信息差异过大").m181534c("重新认证").m181544m(110).m181537f("reverify", "continue").m181533b(new Runnable() { // from class: l.tn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171203a.m204585N0();
                }
            }).m181539h(false).m181538g(f6c0.f95490O);
            this.f187233a.put(3, c19808a7.m181532a());
            return;
        }
        if (i == 3) {
            rxc0.C19808a c19808a8 = new rxc0.C19808a();
            c19808a8.m181541j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m181540i(upa.m194847z() ? x2c0.f189242Co : x2c0.f189210Bo).m181543l(x2c0.f189687R0).m181535d(x2c0.f190603u0).m181542k("验证中...").m181536e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m181544m(213).m181539h(false).m181537f(Explore.TYPE, "pending").m181538g(0);
            this.f187233a.put(0, c19808a8.m181532a());
            rxc0.C19808a c19808a9 = new rxc0.C19808a();
            c19808a9.m181540i(upa.m194847z() ? x2c0.f189370Go : x2c0.f189338Fo).m181543l(x2c0.f189687R0).m181535d(x2c0.f190507r0).m181542k("国家网络身份认证通过").m181536e("身份信息验证通过").m181537f(Explore.TYPE, "success").m181544m(110).m181539h(true).m181538g(f6c0.f95538R);
            this.f187233a.put(1, c19808a9.m181532a());
            rxc0.C19808a c19808a10 = new rxc0.C19808a();
            c19808a10.m181540i(upa.m194847z() ? x2c0.f189178Ao : x2c0.f190787zo).m181543l(x2c0.f189218C0).m181535d(x2c0.f190539s0).m181542k("国家网络身份认证失败").m181536e("国家网络身份认证失败  身份信息和扫脸信息差异较大").m181544m(110).m181534c("重新认证").m181537f("reverify", "fail").m181539h(false).m181538g(f6c0.f95490O);
            this.f187233a.put(2, c19808a10.m181532a());
            rxc0.C19808a c19808a11 = new rxc0.C19808a();
            c19808a11.m181540i(upa.m194847z() ? x2c0.f189178Ao : x2c0.f190787zo).m181543l(x2c0.f189218C0).m181535d(x2c0.f190539s0).m181542k("国家网络身份认证未激活").m181536e("当前头像和扫脸信息差异过大").m181534c("重新认证").m181544m(110).m181537f("reverify", "continue").m181539h(false).m181538g(f6c0.f95490O);
            this.f187233a.put(3, c19808a11.m181532a());
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated((C22306c) this.f187240h.distinctUntilChanged().map(new w9j() { // from class: l.un1
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f177328a.m204587P0((Integer) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.vn1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182201a.m204588Q0((j760) obj);
            }
        }));
        duringCreated(this.f187240h.distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.en1
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92274a.m204586O0((Integer) obj);
            }
        }));
        m204595Y0();
        m204594X0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
