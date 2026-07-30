package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.ProfileEditInfoException;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class cjf extends ar2<hjf> {

    /* JADX INFO: renamed from: a */
    public final Act f82137a;

    /* JADX INFO: renamed from: b */
    public boolean f82138b;

    /* JADX INFO: renamed from: c */
    public ExpLoopInputType f82139c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f82140d;

    /* JADX INFO: renamed from: e */
    public ExpLoopInputType f82141e;

    /* JADX INFO: renamed from: f */
    public String f82142f;

    /* JADX INFO: renamed from: g */
    public User f82143g;

    /* JADX INFO: renamed from: h */
    public User f82144h;

    /* JADX INFO: renamed from: i */
    public final HashSet<ExpLoopInputType> f82145i;

    /* JADX INFO: renamed from: j */
    public final HashSet<ExpLoopInputType> f82146j;

    /* JADX INFO: renamed from: k */
    public ExpProfileEditLoopBaseFrag f82147k;

    /* JADX INFO: renamed from: l */
    public ArrayList<ExpLoopInputType> f82148l;

    /* JADX INFO: renamed from: m */
    public ArrayList<ExpLoopInputType> f82149m;

    /* JADX INFO: renamed from: n */
    public final kjf f82150n;

    /* JADX INFO: renamed from: o */
    public mjf f82151o;

    public cjf(ner nerVar) {
        super(nerVar);
        this.f82138b = false;
        this.f82139c = null;
        this.f82145i = new HashSet<>();
        this.f82146j = new HashSet<>();
        this.f82148l = new ArrayList<>();
        this.f82149m = new ArrayList<>();
        this.f82150n = new kjf(this);
        this.f82137a = (Act) nerVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m110131C0(Bundle bundle) {
        tr90.m192424k(act());
        ((hjf) this.viewModel).m135349r();
        m110156S0(this.f82137a.getIntent().getExtras());
    }

    /* JADX INFO: renamed from: O0 */
    private void m110132O0() {
        User userMo225055clone = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
        final User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (!NullChecker.m82486a(userSubtract)) {
            m110174t0();
            return;
        }
        act().progress(R$string.f18632L5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.uif
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cjf.m110134e0((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.vif
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184230a.m110144D0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.wif
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189353a.m110145E0((uxj0) obj);
            }
        }, new y20() { // from class: l.xif
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194461a.m110146F0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    private void m110133W0() {
        if (this.f82140d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            new th0.C20312a(act()).m191160s("是否退出").m191148g(false).m191151j(this.f82137a.getString(R$string.f18900U3)).m191159r("继续填写").m191147f("确认退出").m191144c(new View.OnClickListener() { // from class: l.ajf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71821a.m110150J0(view);
                }
            }).m191142a().m191141g();
        } else if (this.f82148l.size() == 1) {
            m110174t0();
        } else {
            new th0.C20312a(act()).m191160s("还差一点就完成啦").m191148g(false).m191151j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").m191159r("继续填写").m191147f("确认退出").m191144c(new View.OnClickListener() { // from class: l.zif
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204508a.m110149I0(view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ ProfileEditInfo m110134e0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m110143A0() {
        return this.f82148l.size() <= 1 || jyb.m147483N(this.f82148l) == this.f82139c;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22421c m110144D0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116620u9(user);
        }
        User user2 = this.f82144h;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        bzw.m107267i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m110145E0(uxj0 uxj0Var) {
        act().progressDismiss();
        m110154Q0(true);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m110146F0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            r1j0.m179415b("上传失败");
        } else if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            o1j0.m165649w(com.p051p1.mobile.putong.core.profile.R$string.f28771s);
        } else {
            r1j0.m179419f(com.p051p1.mobile.putong.core.profile.R$string.f28654Y0);
        }
        m110154Q0(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Boolean m110147G0(ExpLoopInputType expLoopInputType) {
        return Boolean.valueOf(!expLoopInputType.hasInfoExist(this.f82143g, this.f82140d));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m110148H0(Bundle bundle) {
        m110162b1();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m110149I0(View view) {
        m110153P0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m110150J0(View view) {
        m110153P0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m110151L0(boolean z) {
        this.f82145i.add(this.f82139c);
        if (z) {
            this.f82146j.add(this.f82139c);
        }
        m110159X0();
    }

    /* JADX INFO: renamed from: N0 */
    public void m110152N0() {
        m110160Y0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m110153P0() {
        if (this.f82138b) {
            m110132O0();
        } else {
            m110154Q0(true);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m110154Q0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f82144h);
        a3b0.m95791a(this.f82144h, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: R0 */
    public void m110155R0(mjf mjfVar) {
        this.f82151o = mjfVar;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m110156S0(Bundle bundle) {
        this.f82140d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f82141e = (ExpLoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f82142f = bundle.getString("loop_edit_from", "");
        if (this.f82140d == null) {
            this.f82140d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        this.f82138b = bundle.getBoolean("loop_edit_save_user", false);
        if (aw90.m100562F().f73701a == null) {
            gta.m132210e().m132214d().mo34947xc(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
        }
        this.f82143g = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
        gta.m132210e().m132214d().mo34891no(this.f82143g.profile.studies.active);
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f82140d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            ExpLoopInputType expLoopInputType = this.f82141e;
            stringBuffer.append(expLoopInputType == null ? "null" : expLoopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f82143g;
            stringBuffer.append(user == null ? "null" : user.f56859id);
            stringBuffer.append(" from:");
            String str2 = this.f82142f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        User userMo34760Uc = gta.m132210e().m132214d().mo34760Uc();
        this.f82144h = userMo34760Uc;
        if (userMo34760Uc != null) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + this.f82144h.f56859id);
        } else {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        ((hjf) this.viewModel).m135347p(this.f82150n.m150036c(this.f82140d));
        ArrayList<ExpLoopInputType> arrayListM150038e = this.f82150n.m150038e(this.f82140d, this.f82141e);
        this.f82148l = arrayListM150038e;
        ArrayList<ExpLoopInputType> arrayListM147522n = jyb.m147522n(arrayListM150038e, new qcj() { // from class: l.bjf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f76986a.m110147G0((ExpLoopInputType) obj);
            }
        });
        this.f82148l = arrayListM147522n;
        ExpLoopInputType expLoopInputType2 = this.f82141e;
        if (expLoopInputType2 != null) {
            arrayListM147522n.add(0, expLoopInputType2);
        }
        m110159X0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m110157U0(ExpLoopInputType expLoopInputType, boolean z) {
        ExpLoopInputType expLoopInputType2;
        m110167g1(expLoopInputType);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        Class fragment = expLoopInputType.getFragment();
        if (fragment == null) {
            act().lambda$debugItems$19();
        }
        Fragment fragmentInstantiate = supportFragmentManager.m2584r0().instantiate(fragment.getClassLoader(), fragment.getName());
        if (fragmentInstantiate instanceof ExpProfileEditLoopBaseFrag) {
            ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag = (ExpProfileEditLoopBaseFrag) fragmentInstantiate;
            this.f82147k = expProfileEditLoopBaseFrag;
            expProfileEditLoopBaseFrag.creates(new y20() { // from class: l.yif
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200082a.m110148H0((Bundle) obj);
                }
            });
            expLoopInputType2 = expLoopInputType;
            this.f82147k.m52435U4(this.f82140d, expLoopInputType2, this.f82145i.size(), this.f82146j.size(), m110143A0());
        } else {
            expLoopInputType2 = expLoopInputType;
        }
        if (z) {
            abstractC0428kM2568m.m2814u(x7c0.f192705t, x7c0.f192706u);
        } else {
            abstractC0428kM2568m.m2814u(x7c0.f192704s, x7c0.f192707v);
        }
        abstractC0428kM2568m.m2813t(adc0.f70520q6, fragmentInstantiate, "input_text");
        this.f82139c = expLoopInputType2;
        m110158V0();
        ((hjf) this.viewModel).m135346n();
        try {
            abstractC0428kM2568m.mo2709j();
        } catch (Exception e) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m110158V0() {
        ((hjf) this.viewModel).m135356z(this.f82148l.size(), Math.max(this.f82148l.indexOf(this.f82139c), 0));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m110159X0() {
        ExpLoopInputType expLoopInputType;
        ExpLoopInputType expLoopInputType2 = this.f82139c;
        if (expLoopInputType2 != null) {
            this.f82149m.add(0, expLoopInputType2);
        }
        int iIndexOf = this.f82148l.indexOf(this.f82139c) + 1;
        while (true) {
            if (iIndexOf >= this.f82148l.size()) {
                expLoopInputType = null;
                break;
            }
            expLoopInputType = this.f82148l.get(iIndexOf);
            if (expLoopInputType == this.f82141e || expLoopInputType.checkIfNeed(m110176x0())) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (expLoopInputType == null) {
            m110153P0();
        } else {
            m110157U0(expLoopInputType, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m110160Y0() {
        if (jyb.m147479J(this.f82149m)) {
            return;
        }
        m110157U0(this.f82149m.remove(0), false);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.tif
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174458a.m110131C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final void m110161a1() {
        ExpLoopInputType expLoopInputType = this.f82139c;
        if (expLoopInputType == null) {
            return;
        }
        sfj0.m185596c("e_edit_specific_profile_exit", expLoopInputType.getPageId(), sfj0.C20032a.m185615h("specific_edit_page_name", this.f82139c.pageName));
    }

    /* JADX INFO: renamed from: b1 */
    public final void m110162b1() {
        ExpLoopInputType expLoopInputType = this.f82139c;
        if (expLoopInputType == null) {
            return;
        }
        sfj0.m185601h("e_edit_specific_profile_exit", expLoopInputType.getPageId(), sfj0.C20032a.m185615h("specific_edit_page_name", this.f82139c.pageName));
    }

    /* JADX INFO: renamed from: c1 */
    public void m110163c1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        i4g0.m138523u("e_edit_specific_profile_next", expLoopInputType.getPageId(), jyb.m147494Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: d1 */
    public void m110164d1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        i4g0.m138492A("e_edit_specific_profile_next", expLoopInputType.getPageId(), jyb.m147494Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: e1 */
    public void m110165e1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        i4g0.m138523u("e_edit_specific_profile_skip", expLoopInputType.getPageId(), jyb.m147494Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: f1 */
    public void m110166f1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        i4g0.m138492A("e_edit_specific_profile_skip", expLoopInputType.getPageId(), jyb.m147494Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m110167g1(ExpLoopInputType expLoopInputType) {
        ((hjf) this.viewModel).m135344f();
        ((hjf) this.viewModel).m135348q(false);
        boolean zBooleanValue = this.f82150n.m150039f(this.f82140d).booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((hjf) v2).m135351u(!jyb.m147479J(this.f82149m));
        } else {
            ((hjf) v2).m135351u(false);
        }
        boolean zBooleanValue2 = this.f82150n.m150042i(this.f82140d, expLoopInputType).booleanValue();
        V v3 = this.viewModel;
        if (zBooleanValue2) {
            ((hjf) v3).m135352v(true);
            m110166f1(expLoopInputType);
        } else {
            ((hjf) v3).m135352v(false);
        }
        expLoopInputType.updateButtonState((hjf) this.viewModel);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m110168n0() {
        Iterator<ExpLoopInputType> it = this.f82148l.iterator();
        while (it.hasNext()) {
            if (!it.next().canExit(this.f82144h, this.f82140d)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m110169o0() {
        try {
            Fragment fragmentM2558i0 = act().getSupportFragmentManager().m2558i0("input_text");
            if (fragmentM2558i0 == null || !fragmentM2558i0.isVisible()) {
                int childCount = ((hjf) this.viewModel).f110188d.getChildCount();
                if (ProfileInfoLoopEditAct.f34253g != null) {
                    tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f34253g.toJson());
                }
                tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.m82479c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m110161a1();
        if (m110168n0()) {
            m110153P0();
            return true;
        }
        m110133W0();
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m110170p0() {
        return this.f82139c.hasWheelDataChanged(this.f82144h);
    }

    /* JADX INFO: renamed from: q0 */
    public void m110171q0() {
        mjf mjfVar = this.f82151o;
        if (mjfVar == null || !mjfVar.mo52437x3()) {
            return;
        }
        this.f82151o.mo52436t0();
        m110163c1(this.f82139c);
    }

    /* JADX INFO: renamed from: r0 */
    public void m110172r0() {
        mjf mjfVar = this.f82151o;
        if (mjfVar == null || !mjfVar.mo52437x3()) {
            return;
        }
        this.f82151o.mo52425L();
    }

    /* JADX INFO: renamed from: s0 */
    public void m110173s0() {
        mjf mjfVar = this.f82151o;
        if (mjfVar != null) {
            mjfVar.mo52427N();
            m110165e1(this.f82139c);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m110174t0() {
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u0 */
    public ExpProfileEditLoopBaseFrag m110175u0() {
        return this.f82147k;
    }

    /* JADX INFO: renamed from: x0 */
    public User m110176x0() {
        return this.f82144h;
    }

    /* JADX INFO: renamed from: y0 */
    public String m110177y0() {
        return this.f82150n.m150037d(this.f82140d, this.f82142f);
    }

    /* JADX INFO: renamed from: z0 */
    public User m110178z0() {
        return this.f82143g;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
