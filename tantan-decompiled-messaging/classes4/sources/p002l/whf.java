package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.ui.ProfileEditInfoException;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l.cww;
import l.du2;
import l.e30;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.pj90;
import l.roj0;
import l.rzb0;
import l.s7m;
import l.tw6;
import l.u4c0;
import l.ura;
import l.vwb;
import l.w9j;
import l.wn90;
import l.wua0;
import l.xh0;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class whf extends jq2<bif> {

    /* JADX INFO: renamed from: a */
    public final Act f21768a;

    /* JADX INFO: renamed from: b */
    public boolean f21769b;

    /* JADX INFO: renamed from: c */
    public ExpLoopInputType f21770c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f21771d;

    /* JADX INFO: renamed from: e */
    public ExpLoopInputType f21772e;

    /* JADX INFO: renamed from: f */
    public String f21773f;

    /* JADX INFO: renamed from: g */
    public User f21774g;

    /* JADX INFO: renamed from: h */
    public User f21775h;

    /* JADX INFO: renamed from: i */
    public final HashSet<ExpLoopInputType> f21776i;

    /* JADX INFO: renamed from: j */
    public final HashSet<ExpLoopInputType> f21777j;

    /* JADX INFO: renamed from: k */
    public ExpProfileEditLoopBaseFrag f21778k;

    /* JADX INFO: renamed from: l */
    public ArrayList<ExpLoopInputType> f21779l;

    /* JADX INFO: renamed from: m */
    public ArrayList<ExpLoopInputType> f21780m;

    /* JADX INFO: renamed from: n */
    public final eif f21781n;

    /* JADX INFO: renamed from: o */
    public gif f21782o;

    public whf(mcr mcrVar) {
        super(mcrVar);
        this.f21769b = false;
        this.f21770c = null;
        this.f21776i = new HashSet<>();
        this.f21777j = new HashSet<>();
        this.f21779l = new ArrayList<>();
        this.f21780m = new ArrayList<>();
        this.f21781n = new eif(this);
        this.f21768a = (Act) mcrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m24614C0(Bundle bundle) {
        pj90.k(act());
        ((bif) ((jq2) this).viewModel).m10365r();
        m24639S0(this.f21768a.getIntent().getExtras());
    }

    /* JADX INFO: renamed from: O0 */
    private void m24615O0() {
        User userClone = ura.e().d().Uc().clone();
        final User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (!NullChecker.a(userSubtract)) {
            m24658t0();
            return;
        }
        act().progress(R.string.J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.ohf
            public final Object call(Object obj) {
                return whf.m24617e0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.phf
            public final Object call(Object obj) {
                return this.f17368a.m24627D0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.qhf
            public final void call(Object obj) {
                this.f17997a.m24628E0((roj0) obj);
            }
        }, new e30() { // from class: l.rhf
            public final void call(Object obj) {
                this.f18523a.m24629F0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W0 */
    private void m24616W0() {
        if (this.f21771d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_PICKS) {
            new xh0.a(act()).s("是否退出").g(false).j(this.f21768a.getString(R.string.S3)).r("继续填写").f("确认退出").c(new View.OnClickListener() { // from class: l.uhf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20655a.m24633J0(view);
                }
            }).a().g();
        } else if (this.f21779l.size() == 1) {
            m24658t0();
        } else {
            new xh0.a(act()).s("还差一点就完成啦").g(false).j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").r("继续填写").f("确认退出").c(new View.OnClickListener() { // from class: l.thf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20236a.m24632I0(view);
                }
            }).a().g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ ProfileEditInfo m24617e0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m24626A0() {
        return this.f21779l.size() <= 1 || vwb.N(this.f21779l) == this.f21770c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.core.ui.ProfileEditInfoException */
    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ c m24627D0(User user, ProfileEditInfo profileEditInfo) throws ProfileEditInfoException {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.u9(user);
        }
        User user2 = this.f21775h;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m24628E0(roj0 roj0Var) {
        act().progressDismiss();
        m24637Q0(true);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m24629F0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.b("上传失败");
        } else if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.w(com.p1.mobile.putong.core.profile.R.string.s);
        } else {
            osi0.f(com.p1.mobile.putong.core.profile.R.string.Y0);
        }
        m24637Q0(false);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ Boolean m24630G0(ExpLoopInputType expLoopInputType) {
        return Boolean.valueOf(!expLoopInputType.hasInfoExist(this.f21774g, this.f21771d));
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m24631H0(Bundle bundle) {
        m24646b1();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m24632I0(View view) {
        m24636P0();
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m24633J0(View view) {
        m24636P0();
    }

    /* JADX INFO: renamed from: L0 */
    public void m24634L0(boolean z) {
        this.f21776i.add(this.f21770c);
        if (z) {
            this.f21777j.add(this.f21770c);
        }
        m24642X0();
    }

    /* JADX INFO: renamed from: N0 */
    public void m24635N0() {
        m24643Y0();
    }

    /* JADX INFO: renamed from: P0 */
    public void m24636P0() {
        if (this.f21769b) {
            m24615O0();
        } else {
            m24637Q0(true);
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m24637Q0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", (Serializable) this.f21775h);
        wua0.a(this.f21775h, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: R0 */
    public void m24638R0(gif gifVar) {
        this.f21782o = gifVar;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m24639S0(Bundle bundle) {
        this.f21771d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f21772e = (ExpLoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f21773f = bundle.getString("loop_edit_from", "");
        if (this.f21771d == null) {
            this.f21771d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        this.f21769b = bundle.getBoolean("loop_edit_save_user", false);
        if (wn90.F().a == null) {
            ura.e().d().xc(CoreModule.c.e0.na().clone());
        }
        this.f21774g = ura.e().d().Uc().clone();
        ura.e().d().no(this.f21774g.profile.studies.active);
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f21771d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType == null ? "null" : loopCreateEntryType.toString());
            stringBuffer.append(" firstShow:");
            ExpLoopInputType expLoopInputType = this.f21772e;
            stringBuffer.append(expLoopInputType == null ? "null" : expLoopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f21774g;
            stringBuffer.append(user == null ? "null" : ((DbObject) user).id);
            stringBuffer.append(" from:");
            String str2 = this.f21773f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        User userUc = ura.e().d().Uc();
        this.f21775h = userUc;
        if (userUc != null) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + ((DbObject) this.f21775h).id);
        } else {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        ((bif) ((jq2) this).viewModel).m10363p(this.f21781n.m12563c(this.f21771d));
        ArrayList<ExpLoopInputType> arrayListM12565e = this.f21781n.m12565e(this.f21771d, this.f21772e);
        this.f21779l = arrayListM12565e;
        ArrayList<ExpLoopInputType> arrayListN = vwb.n(arrayListM12565e, new w9j() { // from class: l.vhf
            public final Object call(Object obj) {
                return this.f21131a.m24630G0((ExpLoopInputType) obj);
            }
        });
        this.f21779l = arrayListN;
        ExpLoopInputType expLoopInputType2 = this.f21772e;
        if (expLoopInputType2 != null) {
            arrayListN.add(0, expLoopInputType2);
        }
        m24642X0();
    }

    /* JADX INFO: renamed from: U0 */
    public final void m24640U0(ExpLoopInputType expLoopInputType, boolean z) {
        ExpLoopInputType expLoopInputType2;
        m24651g1(expLoopInputType);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        k kVarM = supportFragmentManager.m();
        Class fragment = expLoopInputType.getFragment();
        if (fragment == null) {
            act().finish();
        }
        ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFragInstantiate = supportFragmentManager.r0().instantiate(fragment.getClassLoader(), fragment.getName());
        if (expProfileEditLoopBaseFragInstantiate instanceof ExpProfileEditLoopBaseFrag) {
            ExpProfileEditLoopBaseFrag expProfileEditLoopBaseFrag = expProfileEditLoopBaseFragInstantiate;
            this.f21778k = expProfileEditLoopBaseFrag;
            expProfileEditLoopBaseFrag.creates(new e30() { // from class: l.shf
                public final void call(Object obj) {
                    this.f19020a.m24631H0((Bundle) obj);
                }
            });
            expLoopInputType2 = expLoopInputType;
            this.f21778k.m1707U4(this.f21771d, expLoopInputType2, this.f21776i.size(), this.f21777j.size(), m24626A0());
        } else {
            expLoopInputType2 = expLoopInputType;
        }
        if (z) {
            kVarM.u(rzb0.t, rzb0.u);
        } else {
            kVarM.u(rzb0.s, rzb0.v);
        }
        kVarM.t(u4c0.o6, expProfileEditLoopBaseFragInstantiate, "input_text");
        this.f21770c = expLoopInputType2;
        m24641V0();
        ((bif) ((jq2) this).viewModel).m10362n();
        try {
            kVarM.j();
        } catch (Exception e) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m24641V0() {
        ((bif) ((jq2) this).viewModel).m10372z(this.f21779l.size(), Math.max(this.f21779l.indexOf(this.f21770c), 0));
    }

    /* JADX INFO: renamed from: X0 */
    public final void m24642X0() {
        ExpLoopInputType expLoopInputType;
        ExpLoopInputType expLoopInputType2 = this.f21770c;
        if (expLoopInputType2 != null) {
            this.f21780m.add(0, expLoopInputType2);
        }
        int iIndexOf = this.f21779l.indexOf(this.f21770c) + 1;
        while (true) {
            if (iIndexOf >= this.f21779l.size()) {
                expLoopInputType = null;
                break;
            }
            expLoopInputType = this.f21779l.get(iIndexOf);
            if (expLoopInputType == this.f21772e || expLoopInputType.checkIfNeed(m24660x0())) {
                break;
            } else {
                iIndexOf++;
            }
        }
        if (expLoopInputType == null) {
            m24636P0();
        } else {
            m24640U0(expLoopInputType, true);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m24643Y0() {
        if (vwb.J(this.f21780m)) {
            return;
        }
        m24640U0(this.f21780m.remove(0), false);
    }

    /* JADX INFO: renamed from: Z */
    public void m24644Z() {
        super.Z();
        creates(new e30() { // from class: l.nhf
            public final void call(Object obj) {
                this.f16035a.m24614C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a1 */
    public final void m24645a1() {
        ExpLoopInputType expLoopInputType = this.f21770c;
        if (expLoopInputType == null) {
            return;
        }
        o6j0.c("e_edit_specific_profile_exit", expLoopInputType.getPageId(), new o6j0.a[]{o6j0.a.h("specific_edit_page_name", this.f21770c.pageName)});
    }

    /* JADX INFO: renamed from: b1 */
    public final void m24646b1() {
        ExpLoopInputType expLoopInputType = this.f21770c;
        if (expLoopInputType == null) {
            return;
        }
        o6j0.h("e_edit_specific_profile_exit", expLoopInputType.getPageId(), new o6j0.a[]{o6j0.a.h("specific_edit_page_name", this.f21770c.pageName)});
    }

    /* JADX INFO: renamed from: c1 */
    public void m24647c1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.u("e_edit_specific_profile_next", expLoopInputType.getPageId(), new j760[]{vwb.Y("specific_edit_page_name", expLoopInputType.pageName)});
    }

    /* JADX INFO: renamed from: d1 */
    public void m24648d1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.A("e_edit_specific_profile_next", expLoopInputType.getPageId(), new j760[]{vwb.Y("specific_edit_page_name", expLoopInputType.pageName)});
    }

    /* JADX INFO: renamed from: e1 */
    public void m24649e1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.u("e_edit_specific_profile_skip", expLoopInputType.getPageId(), new j760[]{vwb.Y("specific_edit_page_name", expLoopInputType.pageName)});
    }

    /* JADX INFO: renamed from: f1 */
    public void m24650f1(ExpLoopInputType expLoopInputType) {
        if (expLoopInputType == null) {
            return;
        }
        zvf0.A("e_edit_specific_profile_skip", expLoopInputType.getPageId(), new j760[]{vwb.Y("specific_edit_page_name", expLoopInputType.pageName)});
    }

    /* JADX INFO: renamed from: g1 */
    public final void m24651g1(ExpLoopInputType expLoopInputType) {
        ((bif) ((jq2) this).viewModel).m10359f();
        ((bif) ((jq2) this).viewModel).m10364q(false);
        boolean zBooleanValue = this.f21781n.m12566f(this.f21771d).booleanValue();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zBooleanValue) {
            ((bif) s7mVar).m10367u(!vwb.J(this.f21780m));
        } else {
            ((bif) s7mVar).m10367u(false);
        }
        boolean zBooleanValue2 = this.f21781n.m12569i(this.f21771d, expLoopInputType).booleanValue();
        s7m s7mVar2 = ((jq2) this).viewModel;
        if (zBooleanValue2) {
            ((bif) s7mVar2).m10368v(true);
            m24650f1(expLoopInputType);
        } else {
            ((bif) s7mVar2).m10368v(false);
        }
        expLoopInputType.updateButtonState((bif) ((jq2) this).viewModel);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m24652n0() {
        Iterator<ExpLoopInputType> it = this.f21779l.iterator();
        while (it.hasNext()) {
            if (!it.next().canExit(this.f21775h, this.f21771d)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m24653o0() {
        try {
            Fragment fragmentI0 = act().getSupportFragmentManager().i0("input_text");
            if (fragmentI0 == null || !fragmentI0.isVisible()) {
                int childCount = ((bif) ((jq2) this).viewModel).f8156d.getChildCount();
                if (ProfileInfoLoopEditAct.f1227g != null) {
                    du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f1227g.toJson());
                }
                du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m24645a1();
        if (m24652n0()) {
            m24636P0();
            return true;
        }
        m24616W0();
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m24654p0() {
        return this.f21770c.hasWheelDataChanged(this.f21775h);
    }

    /* JADX INFO: renamed from: q0 */
    public void m24655q0() {
        gif gifVar = this.f21782o;
        if (gifVar == null || !gifVar.mo1710x3()) {
            return;
        }
        this.f21782o.mo1709t0();
        m24647c1(this.f21770c);
    }

    /* JADX INFO: renamed from: r0 */
    public void m24656r0() {
        gif gifVar = this.f21782o;
        if (gifVar == null || !gifVar.mo1710x3()) {
            return;
        }
        this.f21782o.mo1697L();
    }

    /* JADX INFO: renamed from: s0 */
    public void m24657s0() {
        gif gifVar = this.f21782o;
        if (gifVar != null) {
            gifVar.mo1699N();
            m24649e1(this.f21770c);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m24658t0() {
        act().hideInput();
        act().finish();
    }

    /* JADX INFO: renamed from: u0 */
    public ExpProfileEditLoopBaseFrag m24659u0() {
        return this.f21778k;
    }

    /* JADX INFO: renamed from: x0 */
    public User m24660x0() {
        return this.f21775h;
    }

    /* JADX INFO: renamed from: y0 */
    public String m24661y0() {
        return this.f21781n.m12564d(this.f21771d, this.f21773f);
    }

    /* JADX INFO: renamed from: z0 */
    public User m24662z0() {
        return this.f21774g;
    }

    public void destroy() {
    }
}
