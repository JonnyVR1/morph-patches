package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.ProfileEditInfoException;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public class y1x extends ar2<b2x> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MarrySeriesType> f197145a;

    /* JADX INFO: renamed from: b */
    public User f197146b;

    /* JADX INFO: renamed from: c */
    public boolean f197147c;

    /* JADX INFO: renamed from: d */
    public boolean f197148d;

    /* JADX INFO: renamed from: e */
    public MarrySeriesType f197149e;

    /* JADX INFO: renamed from: f */
    public String f197150f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileBaseMvpFrag f197151g;

    public y1x(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ ProfileEditInfo m213969f0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    private void m213976o0() {
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f197146b);
        act().hideInput();
        act().setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: u0 */
    private void m213977u0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().m68056e2();
            return;
        }
        this.f197150f = extras.getString("from");
        this.f197146b = (User) extras.getSerializable("args_edit_user");
        this.f197147c = extras.getBoolean("args_patch_user_at_once");
        this.f197148d = extras.getBoolean("args_secondary_page");
        this.f197145a = (ArrayList) extras.getSerializable("args_type_list");
        if (extras.getBoolean("args_loop")) {
            this.f197145a = l5x.m153024u(jyb.m147479J(this.f197145a) ? null : this.f197145a.get(0), this.f197146b);
        }
        if (jyb.m147479J(this.f197145a)) {
            act().m68056e2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m213978z0(Bundle bundle) {
        ((b2x) this.viewModel).m102261f();
        m213989N0(true);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m213979A0(View view) {
        m213988L0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m213980C0(View view) {
        m213988L0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m213981D0(View view) {
        m213976o0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ C22421c m213982E0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116620u9(user);
        }
        User user2 = this.f197146b;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        bzw.m107267i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m213983F0(uxj0 uxj0Var) {
        act().progressDismiss();
        m213976o0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m213984G0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            r1j0.m179415b("上传失败");
        } else if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            o1j0.m165649w(R$string.f28771s);
        } else {
            r1j0.m179419f(R$string.f28654Y0);
        }
        if (((b2x) this.viewModel).act().m48639d2()) {
            m213976o0();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m213985H0() {
        if (this.f197145a.indexOf(this.f197149e) + 1 > this.f197145a.size() - 1) {
            m213988L0();
        } else {
            m213989N0(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m213986I0() {
        if (this.f197145a.size() == 1) {
            m213976o0();
            return;
        }
        if (((b2x) this.viewModel).act().m48639d2()) {
            new th0.C20312a(act()).m191160s("还差一点就完成啦").m191148g(true).m191143b(true).m191151j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").m191159r("继续填写").m191147f("确认退出").m191144c(new View.OnClickListener() { // from class: l.r1x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f160861a.m213979A0(view);
                }
            }).m191142a().m191141g();
        } else if (m213997x0()) {
            new th0.C20312a(act()).m191160s("确认退出").m191148g(true).m191143b(true).m191151j(act().getString(R$string.f28694f0)).m191159r("继续填写").m191147f("确认退出").m191144c(new View.OnClickListener() { // from class: l.s1x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165813a.m213980C0(view);
                }
            }).m191142a().m191141g();
        } else {
            new th0.C20312a(act()).m191160s("还差一点就完成啦！").m191148g(true).m191143b(true).m191151j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").m191159r("继续填写").m191147f("确认退出").m191144c(new View.OnClickListener() { // from class: l.t1x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171698a.m213981D0(view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m213987J0() {
        if (m213991n0()) {
            this.f197151g.f31267A.mo95577e(this.f197149e, this.f197146b);
            m213985H0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m213988L0() {
        if (!this.f197147c) {
            m213976o0();
            return;
        }
        if (this.f197149e == MarrySeriesType.PROLOGUE && this.f197145a.size() == 1 && this.f197146b.subtract(CoreModule.f18264c.f20381e0.m116600p9()) == null) {
            m213976o0();
            return;
        }
        User userMo225055clone = this.f197146b.mo225055clone();
        final User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (!NullChecker.m82486a(userSubtract)) {
            m213976o0();
            return;
        }
        act().progress(R$string.f28619R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.u1x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return y1x.m213969f0((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.v1x
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f182029a.m213982E0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.w1x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186845a.m213983F0((uxj0) obj);
            }
        }, new y20() { // from class: l.x1x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192102a.m213984G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m213989N0(boolean z) {
        if (jyb.m147479J(this.f197145a)) {
            return;
        }
        if (m213994r0() + 1 >= this.f197145a.size()) {
            return;
        }
        this.f197149e = this.f197145a.get(m213994r0() + 1);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        Class<?> fragClass = this.f197149e.getFragClass();
        if (fragClass == null) {
            return;
        }
        MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag = (MarryEditProfileBaseMvpFrag) supportFragmentManager.m2584r0().instantiate(fragClass.getClassLoader(), fragClass.getName());
        this.f197151g = marryEditProfileBaseMvpFrag;
        if (z) {
            marryEditProfileBaseMvpFrag.m48683R4();
        }
        if (m213994r0() > 0) {
            abstractC0428kM2568m.m2814u(z7c0.f203236e, z7c0.f203237f);
            abstractC0428kM2568m.m2812s(gdc0.f103690r, this.f197151g);
        } else {
            abstractC0428kM2568m.m2804b(gdc0.f103690r, this.f197151g);
        }
        abstractC0428kM2568m.mo2709j();
        ((b2x) this.viewModel).m102263l(m213994r0(), this.f197145a.size() - 1);
        ((b2x) this.viewModel).m102262k(m213994r0() == this.f197145a.size() - 1);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m213977u0();
        creates(new y20() { // from class: l.q1x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155226a.m213978z0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(b2x b2xVar) {
        super.mo52715C(b2xVar);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m213991n0() {
        if (!this.f197151g.f31267A.mo95575b(this.f197149e, this.f197146b)) {
            return false;
        }
        pf60<Boolean, String> pf60VarMo137939d = this.f197151g.f31267A.mo137939d(this.f197149e);
        if (!this.f197149e.isRequired() || pf60VarMo137939d.f152156a.booleanValue()) {
            return true;
        }
        r1j0.m179420g(TextUtils.isEmpty(pf60VarMo137939d.f152157b) ? "请填写内容/选择选项，完善资料可以为你推荐更合适的人" : pf60VarMo137939d.f152157b);
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public MarryEditProfileBaseMvpFrag m213992p0() {
        return this.f197151g;
    }

    /* JADX INFO: renamed from: q0 */
    public MarrySeriesType m213993q0() {
        return this.f197149e;
    }

    /* JADX INFO: renamed from: r0 */
    public int m213994r0() {
        MarrySeriesType marrySeriesType;
        if (jyb.m147479J(this.f197145a) || (marrySeriesType = this.f197149e) == null) {
            return -1;
        }
        return this.f197145a.indexOf(marrySeriesType);
    }

    /* JADX INFO: renamed from: s0 */
    public ArrayList<MarrySeriesType> m213995s0() {
        return this.f197145a;
    }

    /* JADX INFO: renamed from: t0 */
    public User m213996t0() {
        return this.f197146b;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m213997x0() {
        return TextUtils.equals(this.f197150f, "from_ideal_type_swipe_guide");
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m213998y0() {
        return this.f197148d;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
