package com.p046p1.mobile.putong.core.p053ui.profile.loop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.ProfileEditInfoException;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.C8671a;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;
import p149l.a5c0;
import p149l.cww;
import p149l.du2;
import p149l.e30;
import p149l.jq2;
import p149l.lqa;
import p149l.lsi0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.osi0;
import p149l.pj90;
import p149l.roj0;
import p149l.tw6;
import p149l.tzb0;
import p149l.ura;
import p149l.vwb;
import p149l.w9j;
import p149l.wua0;
import p149l.xh0;
import p149l.xha0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8671a extends jq2<C8672b> {

    /* JADX INFO: renamed from: a */
    public String f33410a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f33411b;

    /* JADX INFO: renamed from: c */
    public int f33412c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f33413d;

    /* JADX INFO: renamed from: e */
    public LoopInputType f33414e;

    /* JADX INFO: renamed from: f */
    public String f33415f;

    /* JADX INFO: renamed from: g */
    public String f33416g;

    /* JADX INFO: renamed from: h */
    public ArrayList<LoopInputType> f33417h;

    /* JADX INFO: renamed from: i */
    public User f33418i;

    /* JADX INFO: renamed from: j */
    public User f33419j;

    /* JADX INFO: renamed from: k */
    public int f33420k;

    /* JADX INFO: renamed from: l */
    public boolean f33421l;

    /* JADX INFO: renamed from: m */
    public boolean f33422m;

    /* JADX INFO: renamed from: n */
    public boolean f33423n;

    /* JADX INFO: renamed from: o */
    public Fragment f33424o;

    /* JADX INFO: renamed from: p */
    public ArrayList<LoopInputType> f33425p;

    /* JADX INFO: renamed from: q */
    public boolean f33426q;

    /* JADX INFO: renamed from: r */
    public xha0 f33427r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33428a;

        static {
            int[] iArr = new int[LoopFragmentFactory.LoopCreateEntryType.values().length];
            f33428a = iArr;
            try {
                iArr[LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_EXPLORE_UPLOAD_PET_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33428a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C8671a(mcr mcrVar) {
        super(mcrVar);
        this.f33410a = "profile_guide";
        this.f33411b = null;
        this.f33412c = 0;
        this.f33417h = new ArrayList<>();
        this.f33420k = 0;
        this.f33421l = true;
        this.f33422m = true;
        this.f33423n = false;
        this.f33425p = new ArrayList<>();
        this.f33426q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m51512C0(Bundle bundle) {
        if (!NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            act().m66873d2();
            return;
        }
        pj90.m169799k(act());
        ((C8672b) this.viewModel).m51574r();
        m51514Y0(act().getIntent().getExtras());
        ((C8672b) this.viewModel).m51570e(this.f33415f, this.f33413d, this.f33417h.size());
    }

    /* JADX INFO: renamed from: S0 */
    private void m51513S0() {
        User userMo223809clone = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
        final User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (!NullChecker.m81303a(userSubtract)) {
            m51557s0();
            return;
        }
        act().progress(R$string.f27771R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.wga0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C8671a.m51529n0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.xga0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192751a.m51536G0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.yga0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198148a.m51537H0((roj0) obj);
            }
        }, new e30() { // from class: l.zga0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203031a.m51538I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m51514Y0(Bundle bundle) {
        this.f33413d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f33414e = (LoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f33415f = bundle.getString("loop_edit_from", "");
        this.f33416g = bundle.getString("ext_value", "");
        this.f33423n = bundle.getBoolean("loop_edit_patch_flag");
        if (this.f33413d == null) {
            this.f33413d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        if (lqa.m150972j()) {
            switch (a.f33428a[this.f33413d.ordinal()]) {
                case 1:
                    this.f33410a = "edit_profile";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f33410a = this.f33415f;
                    break;
                case 7:
                    this.f33410a = "profile_guide";
                    break;
                case 8:
                    this.f33410a = "invisible_photo_card";
                    break;
                case 9:
                    this.f33410a = "invisible_photo_profile";
                    break;
            }
        } else {
            this.f33410a = this.f33413d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT ? "profile_guide" : "edit_profile";
        }
        if (lqa.m150968f()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f33413d;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE) {
                this.f33410a = "mytab_ideal_exposure";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK) {
                this.f33410a = "match_satisfied";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM) {
                this.f33410a = "check_other_ideal_type";
            }
        }
        if (this.f33413d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT && !TextUtils.isEmpty(bundle.getString("loop_create_from_page"))) {
            this.f33410a = bundle.getString("loop_create_from_page");
        }
        this.f33418i = ura.m195053e().m195057d().mo33757Uc().mo223809clone();
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = this.f33413d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType2 == null ? "null" : loopCreateEntryType2.toString());
            stringBuffer.append(" firstShow:");
            LoopInputType loopInputType = this.f33414e;
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f33418i;
            stringBuffer.append(user == null ? "null" : user.f56011id);
            stringBuffer.append(" from:");
            String str2 = this.f33415f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(this.f33418i.profile.work.industry) && !this.f33418i.profile.studies.active) {
                this.f33421l = false;
            }
        } catch (Exception e) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: entryType: a null object reference +" + e);
            CrashHelper.m81296c(new NullPointerException("edit white screen = " + e));
        }
        User userMo33757Uc = ura.m195053e().m195057d().mo33757Uc();
        this.f33419j = userMo33757Uc;
        if (userMo33757Uc != null) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + this.f33419j.f56011id);
        } else {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        if (TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE)) {
            this.f33423n = true;
        }
        m51515a1();
    }

    /* JADX INFO: renamed from: a1 */
    private void m51515a1() {
        LoopInputType loopInputType;
        ArrayList<LoopInputType> arrayListM51459C = LoopFragmentFactory.m51459C(this.f33413d, this.f33414e, this.f33418i, this.f33421l, this.f33422m, this.f33415f, this.f33419j);
        du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList是否为空:" + vwb.m200296J(this.f33417h) + "  orderList是否为空:" + vwb.m200296J(arrayListM51459C));
        if (vwb.m200296J(this.f33417h)) {
            this.f33417h.addAll(arrayListM51459C);
        } else {
            LoopInputType loopInputType2 = this.f33411b;
            if (loopInputType2 != null) {
                int iIndexOf = this.f33417h.indexOf(loopInputType2);
                du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f33417h.size() + " showIndex:" + iIndexOf);
                if (iIndexOf >= 0) {
                    for (int size = this.f33417h.size() - 1; size > iIndexOf; size--) {
                        this.f33417h.remove(size);
                    }
                }
                int iIndexOf2 = arrayListM51459C.indexOf(this.f33411b);
                du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：orderList.size():" + arrayListM51459C.size() + " orderIndex:" + iIndexOf2);
                if (iIndexOf2 >= 0) {
                    while (iIndexOf2 < arrayListM51459C.size()) {
                        if (this.f33417h.indexOf(arrayListM51459C.get(iIndexOf2)) < 0) {
                            this.f33417h.add(arrayListM51459C.get(iIndexOf2));
                        }
                        iIndexOf2++;
                    }
                }
            }
        }
        int i = 0;
        while (true) {
            if (i >= this.f33417h.size()) {
                loopInputType = null;
                break;
            }
            loopInputType = this.f33417h.get(i);
            if (this.f33425p.indexOf(loopInputType) < 0) {
                break;
            } else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("showNext showProgressAnim：hasShowList.size():");
        sb.append(this.f33425p.size());
        sb.append(" readyShow :");
        sb.append(loopInputType == null ? "null" : loopInputType.title);
        du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        m51516c1();
        du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f33417h.size());
        if (loopInputType != null) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showNextFragment: readyShow.title:" + loopInputType.title);
            m51550b1(loopInputType);
            return;
        }
        if (TextUtils.equals(this.f33415f, CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG) || TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_HOME_CARD_FAKE_BUILD) || this.f33413d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext onFakeComplete");
            m51542O0();
        } else {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext saveAndFinish");
            m51546U0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    private void m51516c1() {
        ((C8672b) this.viewModel).m51572k(this.f33417h.size(), this.f33412c);
    }

    /* JADX INFO: renamed from: d1 */
    private void m51517d1() {
        String string = act().getString(R$string.f27846f0);
        String string2 = act().getString(R$string.f27852g0);
        String string3 = act().getString(R$string.f27852g0);
        new xh0.C21150a(act()).m208740s(string2).m208728g(false).m208731j(string).m208739r(string3).m208736o(new View.OnClickListener() { // from class: l.qga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154319a.m51540L0(view);
            }
        }).m208727f(act().getString(R$string.f27840e0)).m208724c(new View.OnClickListener() { // from class: l.sga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8671a.m51530o0(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: h1 */
    private void m51522h1() {
        LoopInputType loopInputType = this.f33411b;
        if (loopInputType == null) {
            return;
        }
        o6j0.m162859c("e_edit_specific_profile_exit", loopInputType.pageId, o6j0.C18854a.m162878h("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: i1 */
    private void m51524i1() {
        LoopInputType loopInputType = this.f33411b;
        if (loopInputType == null) {
            return;
        }
        o6j0.m162864h("e_edit_specific_profile_exit", loopInputType.pageId, o6j0.C18854a.m162878h("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ ProfileEditInfo m51529n0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m51530o0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m51531A0() {
        return this.f33417h.size() <= 1 || this.f33412c == this.f33417h.size() - 1;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m51533D0() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m51534E0(roj0 roj0Var) {
        m51544Q0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ C22306c m51536G0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169547u9(user);
        }
        User user2 = this.f33419j;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m109076i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m51537H0(roj0 roj0Var) {
        act().progressDismiss();
        m51547V0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m51538I0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.m165778b("上传失败");
        } else if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.m151593w(R$string.f27923s);
        } else {
            osi0.m165782f(R$string.f27806Y0);
        }
        m51547V0(false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m51539J0(Bundle bundle) {
        m51524i1();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m51540L0(View view) {
        m51546U0();
    }

    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final void m51535F0(Throwable th) {
        act().progressDismiss();
        if (yij0.m214930H(th)) {
            return;
        }
        act().dialog().m20500D(R$string.f27831c3).m20556t0(R$string.f27863i, new Runnable() { // from class: l.aha0
            @Override // java.lang.Runnable
            public final void run() {
                this.f69577a.m51533D0();
            }
        }).m20541k0(R$string.f27815a).m20568z0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m51542O0() {
        act().hideInput();
        m51553g1();
    }

    /* JADX INFO: renamed from: P0 */
    public void m51543P0(boolean z) {
        this.f33412c++;
        if (z) {
            this.f33420k++;
        }
        m51515a1();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m51544Q0() {
        act().progressDismiss();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m51545R0(User user) {
        if (NullChecker.m81303a(user)) {
            duringCreated(CoreModule.f17545c.f19639e0.m169547u9(user)).subscribe(mkd0.m154956H(new e30() { // from class: l.uga0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f176366a.m51534E0((roj0) obj);
                }
            }, new e30() { // from class: l.vga0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181360a.m51535F0((Throwable) obj);
                }
            }));
        } else {
            m51544Q0();
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m51546U0() {
        if (this.f33423n) {
            m51513S0();
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f33419j);
        wua0.m205597a(this.f33419j, "saveAndFinish");
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: V0 */
    public void m51547V0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f33419j);
        wua0.m205597a(this.f33419j, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: W0 */
    public void m51548W0(xha0 xha0Var) {
        this.f33427r = xha0Var;
    }

    /* JADX INFO: renamed from: X0 */
    public void m51549X0(boolean z) {
        ((C8672b) this.viewModel).m51571j(z);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        creates(new e30() { // from class: l.tga0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170079a.m51512C0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m51550b1(LoopInputType loopInputType) {
        String string;
        this.f33425p.add(loopInputType);
        this.f33411b = loopInputType;
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        Fragment fragmentInstantiate = supportFragmentManager.m2583r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f33424o = fragmentInstantiate;
        if (fragmentInstantiate instanceof Frag) {
            ((Frag) fragmentInstantiate).creates(new e30() { // from class: l.rga0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f159235a.m51539J0((Bundle) obj);
                }
            });
        }
        if (!(this.f33424o instanceof ProfileLoopTextInputFrag)) {
            act().hideInput();
        }
        Fragment fragment = this.f33424o;
        if (fragment instanceof ProfileEditLoopBaseFrag) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFrag = (ProfileEditLoopBaseFrag) fragment;
            int i = this.f33412c;
            profileEditLoopBaseFrag.m51602a5(loopInputType, i, this.f33420k, i == this.f33417h.size() - 1, this.f33410a, this.f33415f, this.f33416g);
        }
        if (this.f33412c > 0) {
            abstractC0427kM2567m.m2813u(tzb0.f172718e, tzb0.f172719f);
            abstractC0427kM2567m.m2812t(a5c0.f67701x, this.f33424o, "input_text");
        } else {
            abstractC0427kM2567m.m2804c(a5c0.f67701x, this.f33424o, "input_text");
        }
        try {
            StringBuilder sb = new StringBuilder("showNextFragment fragmentTransaction.commitAllowingStateLoss():hasShowList.size() :");
            sb.append(this.f33425p.size());
            sb.append(" currentType:");
            sb.append(NullChecker.m81303a(this.f33411b) ? this.f33411b.title : " null");
            sb.append(" currentType.pageId:");
            if (NullChecker.m81303a(this.f33411b)) {
                string = this.f33411b.pageId;
            } else {
                StringBuilder sb2 = new StringBuilder("null currentType.pageName:");
                sb2.append(NullChecker.m81303a(this.f33411b) ? this.f33411b.pageName : "null");
                string = sb2.toString();
            }
            sb.append(string);
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        } catch (Exception unused) {
        }
        try {
            abstractC0427kM2567m.mo2708j();
        } catch (Exception e) {
            du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m51551e1() {
        return ((C8672b) this.viewModel).m51573l();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m51552f1() {
        if (TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_EXPLORE)) {
            zvf0.m220396r("e_tantanx_pet_upload_normalguide_close", "p_tantanx_pet_photo_normalguide");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m51553g1() {
        act().progress(R$string.f27771R0);
        if (TextUtils.equals(this.f33415f, CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG) || TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_HOME_CARD_FAKE_BUILD)) {
            m51545R0(this.f33419j.mo223809clone().subtract(this.f33418i));
            return;
        }
        if (this.f33413d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m51545R0(this.f33419j);
            return;
        }
        User userMe_ = CoreModule.m29932K().me_();
        if (NullChecker.m81303a(userMe_)) {
            m51545R0(this.f33419j.mo223809clone().subtract(userMe_.mo223809clone()));
        } else {
            m51544Q0();
        }
    }

    public String getFrom() {
        return this.f33415f;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m51554p0() {
        try {
            Fragment fragmentM2557i0 = act().getSupportFragmentManager().m2557i0("input_text");
            if (fragmentM2557i0 == null || !fragmentM2557i0.isVisible()) {
                int childCount = ((C8672b) this.viewModel).f33437i.getChildCount();
                if (ProfileInfoLoopEditAct.f33405g != null) {
                    du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f33405g.toJson());
                }
                du2.m113670a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.m81296c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m51522h1();
        if (vwb.m200296J(LoopFragmentFactory.m51459C(this.f33413d, null, this.f33418i, this.f33421l, this.f33422m, this.f33415f, this.f33419j)) || (lqa.m150972j() && (TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_EXPLORE) || TextUtils.equals(this.f33415f, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)))) {
            m51557s0();
            m51552f1();
            return true;
        }
        if (this.f33413d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m51542O0();
            return true;
        }
        m51517d1();
        return true;
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(C8672b c8672b) {
        super.mo51532C(c8672b);
    }

    /* JADX INFO: renamed from: r0 */
    public void m51556r0() {
        if (NullChecker.m81303a(this.f33427r)) {
            this.f33427r.mo51609h1();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m51557s0() {
        act().hideInput();
        act().m66873d2();
    }

    /* JADX INFO: renamed from: t0 */
    public Fragment m51558t0() {
        return this.f33424o;
    }

    /* JADX INFO: renamed from: u0 */
    public User m51559u0() {
        return ura.m195053e().m195057d().mo33757Uc();
    }

    /* JADX INFO: renamed from: x0 */
    public LoopFragmentFactory.LoopCreateEntryType m51560x0() {
        return this.f33413d;
    }

    /* JADX INFO: renamed from: y0 */
    public User m51561y0() {
        return this.f33418i;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m51562z0() {
        return this.f33413d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
    }
}
