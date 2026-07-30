package p006l;

import android.content.Intent;
import android.os.Bundle;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.camera.TTCameraConfig;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.verification.remind.confirm.AvatarConfirmAct;
import com.p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.c4g0;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.w9j;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wn1 extends jq2<zn1> {

    /* JADX INFO: renamed from: a */
    public HashMap<Integer, rxc0> f25242a;

    /* JADX INFO: renamed from: b */
    public int f25243b;

    /* JADX INFO: renamed from: c */
    public boolean f25244c;

    /* JADX INFO: renamed from: d */
    public Runnable f25245d;

    /* JADX INFO: renamed from: e */
    public Runnable f25246e;

    /* JADX INFO: renamed from: f */
    public c4g0 f25247f;

    /* JADX INFO: renamed from: g */
    public rxc0 f25248g;

    /* JADX INFO: renamed from: h */
    public a<Integer> f25249h;

    /* JADX INFO: renamed from: l.wn1$a */
    public class RunnableC1415a implements Runnable {
        public RunnableC1415a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wn1.this.f25244c) {
                return;
            }
            wn1.this.act().finish();
        }
    }

    /* JADX INFO: renamed from: l.wn1$b */
    public class RunnableC1416b implements Runnable {
        public RunnableC1416b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Network.isConnected(wn1.this.act())) {
                CoreModule.f1534c.f3541B0.m3547p4(CoreModule.m1850H().userId());
            }
            wn1.this.m26548W0();
        }
    }

    public wn1(mcr mcrVar) {
        super(mcrVar);
        this.f25242a = new HashMap<>();
        this.f25243b = -1;
        this.f25244c = false;
        this.f25245d = null;
        this.f25246e = null;
        this.f25247f = null;
        this.f25248g = null;
        this.f25249h = a.c(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m26511E0(Bundle bundle) {
        ((zn1) ((jq2) this).viewModel).m28749f();
    }

    /* JADX INFO: renamed from: C0 */
    public void m26532C0() {
        if (NullChecker.a(this.f25248g) && NullChecker.a(this.f25248g.m23368n())) {
            this.f25248g.m23368n().run();
            zvf0.u("e_verificationresults_continue_button", "p_verification_results", new j760[]{j760.a("continue_type", this.f25248g.m23371q()), j760.a("validation_type", m26533D0(this.f25243b))});
        }
    }

    /* JADX INFO: renamed from: D0 */
    public String m26533D0(int i) {
        String str = "" + i;
        if (i == 1) {
            return TTCameraConfig.TYPE_ID_CARD_AVATAR;
        }
        if (i != 2) {
            return i != 3 ? str : "CTID";
        }
        return "Identity";
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m26534F0() {
        act().finish();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m26535G0() {
        act().finish();
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m26536H0() {
        AvatarConfirmAct.m9500b2(act(), this.f25243b);
        act().finish();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m26537I0() {
        act().finish();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m26538J0() {
        act().finish();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m26539L0() {
        AvatarConfirmAct.m9500b2(act(), this.f25243b);
        act().finish();
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m26540N0() {
        AvatarConfirmAct.m9500b2(act(), 1);
        act().finish();
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m26541O0(Integer num) {
        if (num.intValue() >= 1) {
            this.f25244c = true;
            if (NullChecker.a(this.f25246e)) {
                e51.J(this.f25246e);
            }
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ j760 m26542P0(Integer num) {
        return j760.a(this.f25242a.get(num), num);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m26543Q0(j760 j760Var) {
        this.f25248g = (rxc0) j760Var.a;
        zvf0.B("e_validation_status", "p_verification_results", new j760[]{j760.a("validation_type", m26533D0(this.f25243b)), j760.a("verification_results", this.f25248g.m23373s())});
        ((zn1) ((jq2) this).viewModel).m28753k((rxc0) j760Var.a, this.f25243b, ((Integer) j760Var.b).intValue());
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ void m26544R0(PicVerificationInfo picVerificationInfo) {
        if (TEnum.equals(picVerificationInfo.status, "pending") || TEnum.equals(picVerificationInfo.status, "prePending")) {
            this.f25249h.onNext(0);
            return;
        }
        boolean zEquals = TEnum.equals(picVerificationInfo.status, "verified");
        a<Integer> aVar = this.f25249h;
        if (zEquals) {
            aVar.onNext(1);
        } else {
            aVar.onNext(2);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final /* synthetic */ void m26545S0(j760 j760Var) {
        StudentVerificationStatus studentVerificationStatus = ((IdCardVerificationInfo) j760Var.a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) j760Var.b).status;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f25249h.onNext(1);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            a<Integer> aVar = this.f25249h;
            if (zEquals) {
                aVar.onNext(0);
                return;
            } else {
                aVar.onNext(3);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f25249h.onNext(2);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f25249h.onNext(0);
            return;
        }
        boolean zEquals2 = TEnum.equals(studentVerificationStatus, "invalid");
        a<Integer> aVar2 = this.f25249h;
        if (zEquals2) {
            aVar2.onNext(2);
        } else {
            aVar2.onNext(2);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ void m26546U0(j760 j760Var) {
        StudentVerificationStatus studentVerificationStatus = ((PicVerificationInfo) j760Var.a).status;
        StudentVerificationStatus studentVerificationStatus2 = ((PicVerificationInfo) j760Var.b).status;
        if (TEnum.equals(studentVerificationStatus, "pending") || TEnum.equals(studentVerificationStatus, "prePending")) {
            this.f25249h.onNext(0);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            this.f25249h.onNext(2);
            return;
        }
        boolean zEquals = TEnum.equals(studentVerificationStatus2, "verified");
        a<Integer> aVar = this.f25249h;
        if (zEquals) {
            aVar.onNext(1);
        } else {
            aVar.onNext(3);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m26547V0(Intent intent) {
        this.f25244c = false;
        this.f25249h.onNext(0);
        this.f25243b = intent.getIntExtra("verification_type", -1);
        m26551Z();
        m26552a0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m26548W0() {
        e51.H(act(), this.f25246e, 20000L);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m26549X0() {
        if (this.f25245d == null) {
            this.f25245d = new RunnableC1415a();
        }
        if (this.f25246e == null) {
            this.f25246e = new RunnableC1416b();
        }
        m26548W0();
        e51.H(act(), this.f25245d, 60000L);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m26550Y0() {
        if (this.f25243b < 0) {
            return;
        }
        mkd0.z(this.f25247f);
        if (NullChecker.a(this.f25245d)) {
            e51.J(this.f25245d);
        }
        if (NullChecker.a(this.f25246e)) {
            e51.J(this.f25246e);
        }
        int i = this.f25243b;
        if (i == 1) {
            this.f25247f = duringCreated(CoreModule.f1534c.f3541B0.m3541j4().map(new w9j() { // from class: l.fn1
                public final Object call(Object obj) {
                    return ((VerificationCenter) obj).picVerificationInfo;
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.gn1
                public final void call(Object obj) {
                    this.f13401a.m26544R0((PicVerificationInfo) obj);
                }
            }));
            return;
        }
        if (i == 2) {
            this.f25247f = duringCreated(CoreModule.f1534c.f3541B0.m3541j4().map(new w9j() { // from class: l.hn1
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return j760.a(verificationCenter.idCard, verificationCenter.picVerificationInfo);
                }
            }).filter(new w9j() { // from class: l.in1
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a(((j760) obj).a));
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.jn1
                public final void call(Object obj) {
                    this.f15271a.m26545S0((j760) obj);
                }
            }));
        } else if (i == 3) {
            this.f25247f = duringCreated(CoreModule.f1534c.f3541B0.m3541j4().map(new w9j() { // from class: l.kn1
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return j760.a(verificationCenter.ctdidVerificationInfo, verificationCenter.picVerificationInfo);
                }
            }).filter(new w9j() { // from class: l.ln1
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a(((j760) obj).a));
                }
            }).distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.mn1
                public final void call(Object obj) {
                    this.f17122a.m26546U0((j760) obj);
                }
            }));
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m26551Z() {
        super.Z();
        this.f25242a.clear();
        if (this.f25243b == -1) {
            this.f25243b = act().getIntent().getIntExtra("verification_type", -1);
        }
        if (this.f25243b < 0) {
            act().finish();
            return;
        }
        creates(new e30() { // from class: l.dn1
            public final void call(Object obj) {
                this.f10484a.m26511E0((Bundle) obj);
            }
        });
        int i = this.f25243b;
        if (i == 1) {
            rxc0.C1242a c1242a = new rxc0.C1242a();
            c1242a.m23390j(upa.m25545z() ? "https://fe-static.tancdn.com/v1/raw/ca9b50be-31bd-4aa0-aa4a-699b6d4969ad14.svga" : "https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m23389i(upa.m25545z() ? x2c0.f25778Co : x2c0.f25746Bo).m23392l(x2c0.f26223R0).m23384d(x2c0.f27139u0).m23391k("验证中...").m23385e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m23383c("继续探索").m23393m(213).m23386f("explore", "pending").m23388h(false).m23382b(new Runnable() { // from class: l.nn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17750a.m26534F0();
                }
            }).m23387g(0);
            this.f25242a.put(0, c1242a.m23381a());
            rxc0.C1242a c1242a2 = new rxc0.C1242a();
            c1242a2.m23389i(upa.m25545z() ? x2c0.f25842Eo : x2c0.f25810Do).m23392l(x2c0.f26223R0).m23384d(x2c0.f27043r0).m23391k("头像本人认证通过").m23385e("当前头像和扫脸信息比对通过").m23383c("继续探索").m23386f("explore", "success").m23393m(110).m23382b(new Runnable() { // from class: l.on1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18288a.m26535G0();
                }
            }).m23388h(true).m23387g(f6c0.f11952R);
            this.f25242a.put(1, c1242a2.m23381a());
            rxc0.C1242a c1242a3 = new rxc0.C1242a();
            c1242a3.m23389i(upa.m25545z() ? x2c0.f25714Ao : x2c0.f27323zo).m23392l(x2c0.f25754C0).m23384d(x2c0.f27075s0).m23391k("头像本人认证失败").m23385e("当前头像和扫脸信息差异过大").m23383c("重新认证").m23393m(110).m23388h(false).m23386f("reverify", "fail").m23382b(new Runnable() { // from class: l.pn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19213a.m26536H0();
                }
            }).m23387g(f6c0.f11904O);
            this.f25242a.put(2, c1242a3.m23381a());
            return;
        }
        if (i == 2) {
            rxc0.C1242a c1242a4 = new rxc0.C1242a();
            c1242a4.m23390j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m23389i(upa.m25545z() ? x2c0.f25778Co : x2c0.f25746Bo).m23392l(x2c0.f26192Q0).m23384d(x2c0.f27139u0).m23391k("验证中...").m23385e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m23383c("继续探索").m23393m(213).m23388h(false).m23386f("explore", "pending").m23382b(new Runnable() { // from class: l.qn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19920a.m26537I0();
                }
            }).m23387g(0);
            this.f25242a.put(0, c1242a4.m23381a());
            rxc0.C1242a c1242a5 = new rxc0.C1242a();
            c1242a5.m23389i(upa.m25545z() ? x2c0.f25968Io : x2c0.f25937Ho).m23392l(x2c0.f26192Q0).m23384d(x2c0.f27107t0).m23391k("实名 · 头像本人认证通过").m23385e("扫脸信息和身份信息及头像比对通过").m23383c("继续探索").m23393m(110).m23388h(true).m23386f("explore", "success").m23382b(new Runnable() { // from class: l.rn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20639a.m26538J0();
                }
            }).m23387g(f6c0.f11968S);
            this.f25242a.put(1, c1242a5.m23381a());
            rxc0.C1242a c1242a6 = new rxc0.C1242a();
            c1242a6.m23389i(upa.m25545z() ? x2c0.f25714Ao : x2c0.f27323zo).m23392l(x2c0.f25754C0).m23384d(x2c0.f27075s0).m23391k("实名 · 头像本人认证失败").m23385e("身份信息和扫脸信息差异过大").m23383c("重新认证").m23393m(110).m23388h(false).m23386f("reverify", "fail").m23382b(new Runnable() { // from class: l.sn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21433a.m26539L0();
                }
            }).m23387g(f6c0.f11904O);
            this.f25242a.put(2, c1242a6.m23381a());
            rxc0.C1242a c1242a7 = new rxc0.C1242a();
            c1242a7.m23389i(upa.m25545z() ? x2c0.f25714Ao : x2c0.f27323zo).m23392l(x2c0.f25754C0).m23384d(x2c0.f27075s0).m23391k("实名 · 头像本人认证未激活").m23385e("当前头像和扫脸信息差异过大").m23383c("重新认证").m23393m(110).m23386f("reverify", "continue").m23382b(new Runnable() { // from class: l.tn1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22187a.m26540N0();
                }
            }).m23388h(false).m23387g(f6c0.f11904O);
            this.f25242a.put(3, c1242a7.m23381a());
            return;
        }
        if (i == 3) {
            rxc0.C1242a c1242a8 = new rxc0.C1242a();
            c1242a8.m23390j("https://auto.tancdn.com/v1/raw/c6047f91-771c-4f25-87ee-d192ed485f2b14.svga").m23389i(upa.m25545z() ? x2c0.f25778Co : x2c0.f25746Bo).m23392l(x2c0.f26223R0).m23384d(x2c0.f27139u0).m23391k("验证中...").m23385e("预计还需要1-2分钟，稍后可前往认证中心查看结果").m23393m(213).m23388h(false).m23386f("explore", "pending").m23387g(0);
            this.f25242a.put(0, c1242a8.m23381a());
            rxc0.C1242a c1242a9 = new rxc0.C1242a();
            c1242a9.m23389i(upa.m25545z() ? x2c0.f25906Go : x2c0.f25874Fo).m23392l(x2c0.f26223R0).m23384d(x2c0.f27043r0).m23391k("国家网络身份认证通过").m23385e("身份信息验证通过").m23386f("explore", "success").m23393m(110).m23388h(true).m23387g(f6c0.f11952R);
            this.f25242a.put(1, c1242a9.m23381a());
            rxc0.C1242a c1242a10 = new rxc0.C1242a();
            c1242a10.m23389i(upa.m25545z() ? x2c0.f25714Ao : x2c0.f27323zo).m23392l(x2c0.f25754C0).m23384d(x2c0.f27075s0).m23391k("国家网络身份认证失败").m23385e("国家网络身份认证失败  身份信息和扫脸信息差异较大").m23393m(110).m23383c("重新认证").m23386f("reverify", "fail").m23388h(false).m23387g(f6c0.f11904O);
            this.f25242a.put(2, c1242a10.m23381a());
            rxc0.C1242a c1242a11 = new rxc0.C1242a();
            c1242a11.m23389i(upa.m25545z() ? x2c0.f25714Ao : x2c0.f27323zo).m23392l(x2c0.f25754C0).m23384d(x2c0.f27075s0).m23391k("国家网络身份认证未激活").m23385e("当前头像和扫脸信息差异过大").m23383c("重新认证").m23393m(110).m23386f("reverify", "continue").m23388h(false).m23387g(f6c0.f11904O);
            this.f25242a.put(3, c1242a11.m23381a());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m26552a0() {
        super.a0();
        duringCreated(this.f25249h.distinctUntilChanged().map(new w9j() { // from class: l.un1
            public final Object call(Object obj) {
                return this.f23661a.m26542P0((Integer) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.vn1
            public final void call(Object obj) {
                this.f24386a.m26543Q0((j760) obj);
            }
        }));
        duringCreated(this.f25249h.distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.en1
            public final void call(Object obj) {
                this.f11281a.m26541O0((Integer) obj);
            }
        }));
        m26550Y0();
        m26549X0();
    }

    public void destroy() {
    }
}
