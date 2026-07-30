package com.p051p1.mobile.putong.core.p058ui.profile.loop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.p058ui.ProfileEditInfoException;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.C8834a;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.C22421c;
import p153l.a3b0;
import p153l.ar2;
import p153l.bqa0;
import p153l.bsj0;
import p153l.bzw;
import p153l.gdc0;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.ner;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.sfj0;
import p153l.th0;
import p153l.tr90;
import p153l.tu2;
import p153l.uxj0;
import p153l.wx6;
import p153l.xra;
import p153l.y20;
import p153l.z7c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8834a extends ar2<C8835b> {

    /* JADX INFO: renamed from: a */
    public String f34258a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f34259b;

    /* JADX INFO: renamed from: c */
    public int f34260c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f34261d;

    /* JADX INFO: renamed from: e */
    public LoopInputType f34262e;

    /* JADX INFO: renamed from: f */
    public String f34263f;

    /* JADX INFO: renamed from: g */
    public String f34264g;

    /* JADX INFO: renamed from: h */
    public ArrayList<LoopInputType> f34265h;

    /* JADX INFO: renamed from: i */
    public User f34266i;

    /* JADX INFO: renamed from: j */
    public User f34267j;

    /* JADX INFO: renamed from: k */
    public int f34268k;

    /* JADX INFO: renamed from: l */
    public boolean f34269l;

    /* JADX INFO: renamed from: m */
    public boolean f34270m;

    /* JADX INFO: renamed from: n */
    public boolean f34271n;

    /* JADX INFO: renamed from: o */
    public Fragment f34272o;

    /* JADX INFO: renamed from: p */
    public ArrayList<LoopInputType> f34273p;

    /* JADX INFO: renamed from: q */
    public boolean f34274q;

    /* JADX INFO: renamed from: r */
    public bqa0 f34275r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34276a;

        static {
            int[] iArr = new int[LoopFragmentFactory.LoopCreateEntryType.values().length];
            f34276a = iArr;
            try {
                iArr[LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_EXPLORE_UPLOAD_PET_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34276a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C8834a(ner nerVar) {
        super(nerVar);
        this.f34258a = "profile_guide";
        this.f34259b = null;
        this.f34260c = 0;
        this.f34265h = new ArrayList<>();
        this.f34268k = 0;
        this.f34269l = true;
        this.f34270m = true;
        this.f34271n = false;
        this.f34273p = new ArrayList<>();
        this.f34274q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m52695C0(Bundle bundle) {
        if (!NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            act().m68056e2();
            return;
        }
        tr90.m192424k(act());
        ((C8835b) this.viewModel).m52757r();
        m52697Y0(act().getIntent().getExtras());
        ((C8835b) this.viewModel).m52753e(this.f34263f, this.f34261d, this.f34265h.size());
    }

    /* JADX INFO: renamed from: S0 */
    private void m52696S0() {
        User userMo225055clone = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
        final User userSubtract = userMo225055clone.subtract(CoreModule.f18264c.f20381e0.m116600p9());
        if (!NullChecker.m82486a(userSubtract)) {
            m52740s0();
            return;
        }
        act().progress(R$string.f28619R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.apa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C8834a.m52712n0((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.bpa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77744a.m52719G0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.cpa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82983a.m52720H0((uxj0) obj);
            }
        }, new y20() { // from class: l.dpa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90040a.m52721I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m52697Y0(Bundle bundle) {
        this.f34261d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f34262e = (LoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f34263f = bundle.getString("loop_edit_from", "");
        this.f34264g = bundle.getString("ext_value", "");
        this.f34271n = bundle.getBoolean("loop_edit_patch_flag");
        if (this.f34261d == null) {
            this.f34261d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        if (xra.m212791j()) {
            switch (a.f34276a[this.f34261d.ordinal()]) {
                case 1:
                    this.f34258a = "edit_profile";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f34258a = this.f34263f;
                    break;
                case 7:
                    this.f34258a = "profile_guide";
                    break;
                case 8:
                    this.f34258a = "invisible_photo_card";
                    break;
                case 9:
                    this.f34258a = "invisible_photo_profile";
                    break;
            }
        } else {
            this.f34258a = this.f34261d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT ? "profile_guide" : "edit_profile";
        }
        if (xra.m212787f()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f34261d;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE) {
                this.f34258a = "mytab_ideal_exposure";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK) {
                this.f34258a = "match_satisfied";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM) {
                this.f34258a = "check_other_ideal_type";
            }
        }
        if (this.f34261d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT && !TextUtils.isEmpty(bundle.getString("loop_create_from_page"))) {
            this.f34258a = bundle.getString("loop_create_from_page");
        }
        this.f34266i = gta.m132210e().m132214d().mo34760Uc().mo225055clone();
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = this.f34261d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType2 == null ? "null" : loopCreateEntryType2.toString());
            stringBuffer.append(" firstShow:");
            LoopInputType loopInputType = this.f34262e;
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f34266i;
            stringBuffer.append(user == null ? "null" : user.f56859id);
            stringBuffer.append(" from:");
            String str2 = this.f34263f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(this.f34266i.profile.work.industry) && !this.f34266i.profile.studies.active) {
                this.f34269l = false;
            }
        } catch (Exception e) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: entryType: a null object reference +" + e);
            CrashHelper.m82479c(new NullPointerException("edit white screen = " + e));
        }
        User userMo34760Uc = gta.m132210e().m132214d().mo34760Uc();
        this.f34267j = userMo34760Uc;
        if (userMo34760Uc != null) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + this.f34267j.f56859id);
        } else {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        if (TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE)) {
            this.f34271n = true;
        }
        m52698a1();
    }

    /* JADX INFO: renamed from: a1 */
    private void m52698a1() {
        LoopInputType loopInputType;
        ArrayList<LoopInputType> arrayListM52642C = LoopFragmentFactory.m52642C(this.f34261d, this.f34262e, this.f34266i, this.f34269l, this.f34270m, this.f34263f, this.f34267j);
        tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList是否为空:" + jyb.m147479J(this.f34265h) + "  orderList是否为空:" + jyb.m147479J(arrayListM52642C));
        if (jyb.m147479J(this.f34265h)) {
            this.f34265h.addAll(arrayListM52642C);
        } else {
            LoopInputType loopInputType2 = this.f34259b;
            if (loopInputType2 != null) {
                int iIndexOf = this.f34265h.indexOf(loopInputType2);
                tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f34265h.size() + " showIndex:" + iIndexOf);
                if (iIndexOf >= 0) {
                    for (int size = this.f34265h.size() - 1; size > iIndexOf; size--) {
                        this.f34265h.remove(size);
                    }
                }
                int iIndexOf2 = arrayListM52642C.indexOf(this.f34259b);
                tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：orderList.size():" + arrayListM52642C.size() + " orderIndex:" + iIndexOf2);
                if (iIndexOf2 >= 0) {
                    while (iIndexOf2 < arrayListM52642C.size()) {
                        if (this.f34265h.indexOf(arrayListM52642C.get(iIndexOf2)) < 0) {
                            this.f34265h.add(arrayListM52642C.get(iIndexOf2));
                        }
                        iIndexOf2++;
                    }
                }
            }
        }
        int i = 0;
        while (true) {
            if (i >= this.f34265h.size()) {
                loopInputType = null;
                break;
            }
            loopInputType = this.f34265h.get(i);
            if (this.f34273p.indexOf(loopInputType) < 0) {
                break;
            } else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("showNext showProgressAnim：hasShowList.size():");
        sb.append(this.f34273p.size());
        sb.append(" readyShow :");
        sb.append(loopInputType == null ? "null" : loopInputType.title);
        tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        m52699c1();
        tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f34265h.size());
        if (loopInputType != null) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showNextFragment: readyShow.title:" + loopInputType.title);
            m52733b1(loopInputType);
            return;
        }
        if (TextUtils.equals(this.f34263f, CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG) || TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_HOME_CARD_FAKE_BUILD) || this.f34261d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext onFakeComplete");
            m52725O0();
        } else {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext saveAndFinish");
            m52729U0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    private void m52699c1() {
        ((C8835b) this.viewModel).m52755k(this.f34265h.size(), this.f34260c);
    }

    /* JADX INFO: renamed from: d1 */
    private void m52700d1() {
        String string = act().getString(R$string.f28694f0);
        String string2 = act().getString(R$string.f28700g0);
        String string3 = act().getString(R$string.f28700g0);
        new th0.C20312a(act()).m191160s(string2).m191148g(false).m191151j(string).m191159r(string3).m191156o(new View.OnClickListener() { // from class: l.uoa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180030a.m52723L0(view);
            }
        }).m191147f(act().getString(R$string.f28688e0)).m191144c(new View.OnClickListener() { // from class: l.woa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8834a.m52713o0(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: h1 */
    private void m52705h1() {
        LoopInputType loopInputType = this.f34259b;
        if (loopInputType == null) {
            return;
        }
        sfj0.m185596c("e_edit_specific_profile_exit", loopInputType.pageId, sfj0.C20032a.m185615h("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: i1 */
    private void m52707i1() {
        LoopInputType loopInputType = this.f34259b;
        if (loopInputType == null) {
            return;
        }
        sfj0.m185601h("e_edit_specific_profile_exit", loopInputType.pageId, sfj0.C20032a.m185615h("specific_edit_page_name", loopInputType.pageName));
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ ProfileEditInfo m52712n0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m52713o0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m52714A0() {
        return this.f34265h.size() <= 1 || this.f34260c == this.f34265h.size() - 1;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m52716D0() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m52717E0(uxj0 uxj0Var) {
        m52727Q0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ C22421c m52719G0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116620u9(user);
        }
        User user2 = this.f34267j;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        bzw.m107267i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m52720H0(uxj0 uxj0Var) {
        act().progressDismiss();
        m52730V0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m52721I0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            r1j0.m179415b("上传失败");
        } else if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            o1j0.m165649w(R$string.f28771s);
        } else {
            r1j0.m179419f(R$string.f28654Y0);
        }
        m52730V0(false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m52722J0(Bundle bundle) {
        m52707i1();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m52723L0(View view) {
        m52729U0();
    }

    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final void m52718F0(Throwable th) {
        act().progressDismiss();
        if (bsj0.m106250H(th)) {
            return;
        }
        act().dialog().m21499D(R$string.f28679c3).m21555t0(R$string.f28711i, new Runnable() { // from class: l.epa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f95219a.m52716D0();
            }
        }).m21540k0(R$string.f28663a).m21567z0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m52725O0() {
        act().hideInput();
        m52736g1();
    }

    /* JADX INFO: renamed from: P0 */
    public void m52726P0(boolean z) {
        this.f34260c++;
        if (z) {
            this.f34268k++;
        }
        m52698a1();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m52727Q0() {
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m52728R0(User user) {
        if (NullChecker.m82486a(user)) {
            duringCreated(CoreModule.f18264c.f20381e0.m116620u9(user)).subscribe(psd0.m173597H(new y20() { // from class: l.yoa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200964a.m52717E0((uxj0) obj);
                }
            }, new y20() { // from class: l.zoa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205307a.m52718F0((Throwable) obj);
                }
            }));
        } else {
            m52727Q0();
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m52729U0() {
        if (this.f34271n) {
            m52696S0();
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f34267j);
        a3b0.m95791a(this.f34267j, "saveAndFinish");
        act().setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: V0 */
    public void m52730V0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f34267j);
        a3b0.m95791a(this.f34267j, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: W0 */
    public void m52731W0(bqa0 bqa0Var) {
        this.f34275r = bqa0Var;
    }

    /* JADX INFO: renamed from: X0 */
    public void m52732X0(boolean z) {
        ((C8835b) this.viewModel).m52754j(z);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        creates(new y20() { // from class: l.xoa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195566a.m52695C0((Bundle) obj);
            }
        });
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m52733b1(LoopInputType loopInputType) {
        String string;
        this.f34273p.add(loopInputType);
        this.f34259b = loopInputType;
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        Fragment fragmentInstantiate = supportFragmentManager.m2584r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f34272o = fragmentInstantiate;
        if (fragmentInstantiate instanceof Frag) {
            ((Frag) fragmentInstantiate).creates(new y20() { // from class: l.voa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185019a.m52722J0((Bundle) obj);
                }
            });
        }
        if (!(this.f34272o instanceof ProfileLoopTextInputFrag)) {
            act().hideInput();
        }
        Fragment fragment = this.f34272o;
        if (fragment instanceof ProfileEditLoopBaseFrag) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFrag = (ProfileEditLoopBaseFrag) fragment;
            int i = this.f34260c;
            profileEditLoopBaseFrag.m52785a5(loopInputType, i, this.f34268k, i == this.f34265h.size() - 1, this.f34258a, this.f34263f, this.f34264g);
        }
        if (this.f34260c > 0) {
            abstractC0428kM2568m.m2814u(z7c0.f203236e, z7c0.f203237f);
            abstractC0428kM2568m.m2813t(gdc0.f103696x, this.f34272o, "input_text");
        } else {
            abstractC0428kM2568m.m2805c(gdc0.f103696x, this.f34272o, "input_text");
        }
        try {
            StringBuilder sb = new StringBuilder("showNextFragment fragmentTransaction.commitAllowingStateLoss():hasShowList.size() :");
            sb.append(this.f34273p.size());
            sb.append(" currentType:");
            sb.append(NullChecker.m82486a(this.f34259b) ? this.f34259b.title : " null");
            sb.append(" currentType.pageId:");
            if (NullChecker.m82486a(this.f34259b)) {
                string = this.f34259b.pageId;
            } else {
                StringBuilder sb2 = new StringBuilder("null currentType.pageName:");
                sb2.append(NullChecker.m82486a(this.f34259b) ? this.f34259b.pageName : "null");
                string = sb2.toString();
            }
            sb.append(string);
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        } catch (Exception unused) {
        }
        try {
            abstractC0428kM2568m.mo2709j();
        } catch (Exception e) {
            tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m52734e1() {
        return ((C8835b) this.viewModel).m52756l();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m52735f1() {
        if (TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_EXPLORE)) {
            i4g0.m138520r("e_tantanx_pet_upload_normalguide_close", "p_tantanx_pet_photo_normalguide");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m52736g1() {
        act().progress(R$string.f28619R0);
        if (TextUtils.equals(this.f34263f, CoreStaticData.SeriousPurposeDlgType.SERIOUS_PURPOSE_DIALOG) || TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_HOME_CARD_FAKE_BUILD)) {
            m52728R0(this.f34267j.mo225055clone().subtract(this.f34266i));
            return;
        }
        if (this.f34261d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m52728R0(this.f34267j);
            return;
        }
        User userMe_ = CoreModule.m30930K().me_();
        if (NullChecker.m82486a(userMe_)) {
            m52728R0(this.f34267j.mo225055clone().subtract(userMe_.mo225055clone()));
        } else {
            m52727Q0();
        }
    }

    public String getFrom() {
        return this.f34263f;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m52737p0() {
        try {
            Fragment fragmentM2558i0 = act().getSupportFragmentManager().m2558i0("input_text");
            if (fragmentM2558i0 == null || !fragmentM2558i0.isVisible()) {
                int childCount = ((C8835b) this.viewModel).f34285i.getChildCount();
                if (ProfileInfoLoopEditAct.f34253g != null) {
                    tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f34253g.toJson());
                }
                tu2.m192703a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.m82479c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m52705h1();
        if (jyb.m147479J(LoopFragmentFactory.m52642C(this.f34261d, null, this.f34266i, this.f34269l, this.f34270m, this.f34263f, this.f34267j)) || (xra.m212791j() && (TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_EXPLORE) || TextUtils.equals(this.f34263f, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)))) {
            m52740s0();
            m52735f1();
            return true;
        }
        if (this.f34261d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m52725O0();
            return true;
        }
        m52700d1();
        return true;
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void mo52715C(C8835b c8835b) {
        super.mo52715C(c8835b);
    }

    /* JADX INFO: renamed from: r0 */
    public void m52739r0() {
        if (NullChecker.m82486a(this.f34275r)) {
            this.f34275r.mo52792h1();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m52740s0() {
        act().hideInput();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: t0 */
    public Fragment m52741t0() {
        return this.f34272o;
    }

    /* JADX INFO: renamed from: u0 */
    public User m52742u0() {
        return gta.m132210e().m132214d().mo34760Uc();
    }

    /* JADX INFO: renamed from: x0 */
    public LoopFragmentFactory.LoopCreateEntryType m52743x0() {
        return this.f34261d;
    }

    /* JADX INFO: renamed from: y0 */
    public User m52744y0() {
        return this.f34266i;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m52745z0() {
        return this.f34261d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
    }
}
