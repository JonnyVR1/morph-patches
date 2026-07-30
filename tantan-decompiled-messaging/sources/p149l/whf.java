package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.ProfileEditInfoException;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class whf extends jq2<bif> {

    /* JADX INFO: renamed from: a */
    public final Act f186417a;

    /* JADX INFO: renamed from: b */
    public boolean f186418b;

    /* JADX INFO: renamed from: c */
    public ExpLoopInputType f186419c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f186420d;

    /* JADX INFO: renamed from: e */
    public ExpLoopInputType f186421e;

    /* JADX INFO: renamed from: f */
    public String f186422f;

    /* JADX INFO: renamed from: g */
    public User f186423g;

    /* JADX INFO: renamed from: h */
    public User f186424h;

    /* JADX INFO: renamed from: i */
    public final HashSet<ExpLoopInputType> f186425i;

    /* JADX INFO: renamed from: j */
    public final HashSet<ExpLoopInputType> f186426j;

    /* JADX INFO: renamed from: k */
    public ExpProfileEditLoopBaseFrag f186427k;

    /* JADX INFO: renamed from: l */
    public ArrayList<ExpLoopInputType> f186428l;

    /* JADX INFO: renamed from: m */
    public ArrayList<ExpLoopInputType> f186429m;

    /* JADX INFO: renamed from: n */
    public final eif f186430n;

    /* JADX INFO: renamed from: o */
    public gif f186431o;

    public whf(mcr mcrVar) {
        super(mcrVar);
        this.f186418b = false;
        this.f186419c = null;
        this.f186425i = new HashSet<>();
        this.f186426j = new HashSet<>();
        this.f186428l = new ArrayList<>();
        this.f186429m = new ArrayList<>();
        this.f186430n = new eif(this);
        this.f186417a = (Act) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m203165C0(Bundle bundle) {
        pj90.m169799k(act());
        ((bif) this.viewModel).m102024r();
        m203190S0(this.f186417a.getIntent().getExtras());
    }

    /* JADX INFO: renamed from: O0 */
    private void m203166O0() {
        User userMo223809clone = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
        final User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (!NullChecker.m81303a(userSubtract)) {
            m203208t0();
            return;
        }
        act().progress(R$string.f17842J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.ohf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return whf.m203168e0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.phf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148925a.m203178D0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.qhf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154464a.m203179E0((roj0) obj);
            }
        }, new e30() { // from class: l.rhf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159359a.m203180F0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    private void m203167W0() {
        if (this.f186420d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            new xh0.C21150a(act()).m208740s("是否退出").m208728g(false).m208731j(this.f186417a.getString(R$string.f18110S3)).m208739r("继续填写").m208727f("确认退出").m208724c(new View.OnClickListener() { // from class: l.uhf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176551a.m203184J0(view);
                }
            }).m208722a().m208721g();
        } else if (this.f186428l.size() == 1) {
            m203208t0();
        } else {
            new xh0.C21150a(act()).m208740s("还差一点就完成啦").m208728g(false).m208731j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").m208739r("继续填写").m208727f("确认退出").m208724c(new View.OnClickListener() { // from class: l.thf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f170244a.m203183I0(view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ ProfileEditInfo m203168e0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m203177A0() {
        return this.f186428l.size() <= 1 || vwb.m200300N(this.f186428l) == this.f186419c;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ C22306c m203178D0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169547u9(user);
        }
        User user2 = this.f186424h;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m109076i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m203179E0(roj0 roj0Var) {
        act().progressDismiss();
        m203188Q0(true);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m203180F0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.m165778b("上传失败");
        } else if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.m151593w(com.p046p1.mobile.putong.core.profile.R$string.f27923s);
        } else {
            osi0.m165782f(com.p046p1.mobile.putong.core.profile.R$string.f27806Y0);
        }
        m203188Q0(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Boolean m203181G0(ExpLoopInputType expLoopInputType) {
        return Boolean.valueOf(!expLoopInputType.hasInfoExist(this.f186423g, this.f186420d));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m203182H0(Bundle bundle) {
        m203196b1();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m203183I0(View view) {
        m203187P0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m203184J0(View view) {
        m203187P0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m203185L0(boolean z) {
        this.f186425i.add(this.f186419c);
        if (z) {
            this.f186426j.add(this.f186419c);
        }
        m203193X0();
    }

    /* JADX INFO: renamed from: N0 */
    public void m203186N0() {
        m203194Y0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m203187P0() {
        if (this.f186418b) {
            m203166O0();
        } else {
            m203188Q0(true);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m203188Q0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f186424h);
        wua0.m205597a(this.f186424h, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: R0 */
    public void m203189R0(gif gifVar) {
        this.f186431o = gifVar;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m203190S0(Bundle bundle) {
        this.f186420d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f186421e = (ExpLoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f186422f = bundle.getString("loop_edit_from", "");
        if (this.f186420d == null) {
            this.f186420d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        this.f186418b = bundle.getBoolean("loop_edit_save_user", false);
        if (wn90.m204602F().f187269a == null) {
            ura.m195053e().m195057d().mo33944xc(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
        }
        this.f186423g = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
        ura.m195053e().m195057d().mo33888no(this.f186423g.profile.studies.active);
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f186420d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            ExpLoopInputType expLoopInputType = this.f186421e;
            stringBuffer.append(expLoopInputType == null ? "null" : expLoopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f186423g;
            stringBuffer.append(user == null ? "null" : user.f56011id);
            stringBuffer.append(" from:");
            String str2 = this.f186422f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        User userMo33757Uc = ura.m195053e().m195057d().mo33757Uc();
        this.f186424h = userMo33757Uc;
        if (userMo33757Uc != null) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + this.f186424h.f56011id);
        } else {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        ((bif) this.viewModel).m102022p(this.f186430n.m116676c(this.f186420d));
        ArrayList<ExpLoopInputType> arrayListM116678e = this.f186430n.m116678e(this.f186420d, this.f186421e);
        this.f186428l = arrayListM116678e;
        ArrayList<ExpLoopInputType> arrayListM200339n = vwb.m200339n(arrayListM116678e, new w9j() { // from class: l.vhf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f181500a.m203181G0((ExpLoopInputType) obj);
            }
        });
        this.f186428l = arrayListM200339n;
        ExpLoopInputType expLoopInputType2 = this.f186421e;
        if (expLoopInputType2 != null) {
            arrayListM200339n.add(0, expLoopInputType2);
        }
        m203193X0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m203191U0(ExpLoopInputType expLoopInputType, boolean z) {
        ExpLoopInputType expLoopInputType2;
        m203201g1(expLoopInputType);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        Class fragment = expLoopInputType.getFragment();
        if (fragment == null) {
            act().lambda$debugItems$19();
        }
        Fragment fragmentInstantiate = supportFragmentManager.m2583r0().instantiate(fragment.getClassLoader(), fragment.getName());
        if (fragmentInstantiate instanceof ExpProfileEditLoopBaseFrag) {
            ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag = (ExpProfileEditLoopBaseFrag) fragmentInstantiate;
            this.f186427k = expProfileEditLoopBaseFrag;
            expProfileEditLoopBaseFrag.creates(new e30() { // from class: l.shf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f164560a.m203182H0((Bundle) obj);
                }
            });
            expLoopInputType2 = expLoopInputType;
            this.f186427k.m51252U4(this.f186420d, expLoopInputType2, this.f186425i.size(), this.f186426j.size(), m203177A0());
        } else {
            expLoopInputType2 = expLoopInputType;
        }
        if (z) {
            abstractC0427kM2567m.m2813u(rzb0.f161648t, rzb0.f161649u);
        } else {
            abstractC0427kM2567m.m2813u(rzb0.f161647s, rzb0.f161650v);
        }
        abstractC0427kM2567m.m2812t(u4c0.f174395o6, fragmentInstantiate, "input_text");
        this.f186419c = expLoopInputType2;
        m203192V0();
        ((bif) this.viewModel).m102021n();
        try {
            abstractC0427kM2567m.mo2708j();
        } catch (Exception e) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m203192V0() {
        ((bif) this.viewModel).m102031z(this.f186428l.size(), Math.max(this.f186428l.indexOf(this.f186419c), 0));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m203193X0() {
        ExpLoopInputType expLoopInputType;
        ExpLoopInputType expLoopInputType2 = this.f186419c;
        if (expLoopInputType2 != null) {
            this.f186429m.add(0, expLoopInputType2);
        }
        int iIndexOf = this.f186428l.indexOf(this.f186419c) + 1;
        while (true) {
            if (iIndexOf >= this.f186428l.size()) {
                expLoopInputType = null;
                break;
            }
            expLoopInputType = this.f186428l.get(iIndexOf);
            if (expLoopInputType == this.f186421e || expLoopInputType.checkIfNeed(m203210x0())) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (expLoopInputType == null) {
            m203187P0();
        } else {
            m203191U0(expLoopInputType, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m203194Y0() {
        if (vwb.m200296J(this.f186429m)) {
            return;
        }
        m203191U0(this.f186429m.remove(0), false);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.nhf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138974a.m203165C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final void m203195a1() {
        ExpLoopInputType expLoopInputType = this.f186419c;
        if (expLoopInputType == null) {
            return;
        }
        o6j0.m162859c("e_edit_specific_profile_exit", expLoopInputType.getPageId(), o6j0.C18854a.m162878h("specific_edit_page_name", this.f186419c.pageName));
    }

    /* JADX INFO: renamed from: b1 */
    public final void m203196b1() {
        ExpLoopInputType expLoopInputType = this.f186419c;
        if (expLoopInputType == null) {
            return;
        }
        o6j0.m162864h("e_edit_specific_profile_exit", expLoopInputType.getPageId(), o6j0.C18854a.m162878h("specific_edit_page_name", this.f186419c.pageName));
    }

    /* JADX INFO: renamed from: c1 */
    public void m203197c1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.m220399u("e_edit_specific_profile_next", expLoopInputType.getPageId(), vwb.m200311Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: d1 */
    public void m203198d1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.m220368A("e_edit_specific_profile_next", expLoopInputType.getPageId(), vwb.m200311Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: e1 */
    public void m203199e1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.m220399u("e_edit_specific_profile_skip", expLoopInputType.getPageId(), vwb.m200311Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: f1 */
    public void m203200f1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.m220368A("e_edit_specific_profile_skip", expLoopInputType.getPageId(), vwb.m200311Y("specific_edit_page_name", expLoopInputType.pageName));
    }

    /* JADX INFO: renamed from: g1 */
    public final void m203201g1(ExpLoopInputType expLoopInputType) {
        ((bif) this.viewModel).m102019f();
        ((bif) this.viewModel).m102023q(false);
        boolean zBooleanValue = this.f186430n.m116679f(this.f186420d).booleanValue();
        V v2 = this.viewModel;
        if (zBooleanValue) {
            ((bif) v2).m102026u(!vwb.m200296J(this.f186429m));
        } else {
            ((bif) v2).m102026u(false);
        }
        boolean zBooleanValue2 = this.f186430n.m116682i(this.f186420d, expLoopInputType).booleanValue();
        V v3 = this.viewModel;
        if (zBooleanValue2) {
            ((bif) v3).m102027v(true);
            m203200f1(expLoopInputType);
        } else {
            ((bif) v3).m102027v(false);
        }
        expLoopInputType.updateButtonState((bif) this.viewModel);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m203202n0() {
        Iterator<ExpLoopInputType> it = this.f186428l.iterator();
        while (it.hasNext()) {
            if (!it.next().canExit(this.f186424h, this.f186420d)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m203203o0() {
        try {
            Fragment fragmentM2557i0 = act().getSupportFragmentManager().m2557i0("input_text");
            if (fragmentM2557i0 == null || !fragmentM2557i0.isVisible()) {
                int childCount = ((bif) this.viewModel).f75738d.getChildCount();
                if (ProfileInfoLoopEditAct.f33405g != null) {
                    du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f33405g.toJson());
                }
                du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.m81296c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m203195a1();
        if (m203202n0()) {
            m203187P0();
            return true;
        }
        m203167W0();
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m203204p0() {
        return this.f186419c.hasWheelDataChanged(this.f186424h);
    }

    /* JADX INFO: renamed from: q0 */
    public void m203205q0() {
        gif gifVar = this.f186431o;
        if (gifVar == null || !gifVar.mo51254x3()) {
            return;
        }
        this.f186431o.mo51253t0();
        m203197c1(this.f186419c);
    }

    /* JADX INFO: renamed from: r0 */
    public void m203206r0() {
        gif gifVar = this.f186431o;
        if (gifVar == null || !gifVar.mo51254x3()) {
            return;
        }
        this.f186431o.mo51242L();
    }

    /* JADX INFO: renamed from: s0 */
    public void m203207s0() {
        gif gifVar = this.f186431o;
        if (gifVar != null) {
            gifVar.mo51244N();
            m203199e1(this.f186419c);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m203208t0() {
        act().hideInput();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: u0 */
    public ExpProfileEditLoopBaseFrag m203209u0() {
        return this.f186427k;
    }

    /* JADX INFO: renamed from: x0 */
    public User m203210x0() {
        return this.f186424h;
    }

    /* JADX INFO: renamed from: y0 */
    public String m203211y0() {
        return this.f186430n.m116677d(this.f186420d, this.f186422f);
    }

    /* JADX INFO: renamed from: z0 */
    public User m203212z0() {
        return this.f186423g;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
