package com.p000p1.mobile.putong.core.p001ui.profile.loop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.C0096a;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopTextInputFrag;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.ProfileEditInfoException;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import l.a5c0;
import l.cww;
import l.du2;
import l.e30;
import l.jq2;
import l.lqa;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.osi0;
import l.pj90;
import l.roj0;
import l.tw6;
import l.tzb0;
import l.ura;
import l.vwb;
import l.w9j;
import l.wua0;
import l.xh0;
import l.yij0;
import l.zvf0;
import p002l.xha0;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0096a extends jq2<C0097b> {

    /* JADX INFO: renamed from: a */
    public String f1232a;

    /* JADX INFO: renamed from: b */
    public LoopInputType f1233b;

    /* JADX INFO: renamed from: c */
    public int f1234c;

    /* JADX INFO: renamed from: d */
    public LoopFragmentFactory.LoopCreateEntryType f1235d;

    /* JADX INFO: renamed from: e */
    public LoopInputType f1236e;

    /* JADX INFO: renamed from: f */
    public String f1237f;

    /* JADX INFO: renamed from: g */
    public String f1238g;

    /* JADX INFO: renamed from: h */
    public ArrayList<LoopInputType> f1239h;

    /* JADX INFO: renamed from: i */
    public User f1240i;

    /* JADX INFO: renamed from: j */
    public User f1241j;

    /* JADX INFO: renamed from: k */
    public int f1242k;

    /* JADX INFO: renamed from: l */
    public boolean f1243l;

    /* JADX INFO: renamed from: m */
    public boolean f1244m;

    /* JADX INFO: renamed from: n */
    public boolean f1245n;

    /* JADX INFO: renamed from: o */
    public Fragment f1246o;

    /* JADX INFO: renamed from: p */
    public ArrayList<LoopInputType> f1247p;

    /* JADX INFO: renamed from: q */
    public boolean f1248q;

    /* JADX INFO: renamed from: r */
    public xha0 f1249r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1250a;

        static {
            int[] iArr = new int[LoopFragmentFactory.LoopCreateEntryType.values().length];
            f1250a = iArr;
            try {
                iArr[LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_EXPLORE_UPLOAD_PET_PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1250a[LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0096a(mcr mcrVar) {
        super(mcrVar);
        this.f1232a = "profile_guide";
        this.f1233b = null;
        this.f1234c = 0;
        this.f1239h = new ArrayList<>();
        this.f1242k = 0;
        this.f1243l = true;
        this.f1244m = true;
        this.f1245n = false;
        this.f1247p = new ArrayList<>();
        this.f1248q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m1994C0(Bundle bundle) {
        if (!NullChecker.a(ura.e().d().Uc())) {
            act().finish();
            return;
        }
        pj90.k(act());
        ((C0097b) ((jq2) this).viewModel).m2060r();
        m1996Y0(act().getIntent().getExtras());
        ((C0097b) ((jq2) this).viewModel).m2055e(this.f1237f, this.f1235d, this.f1239h.size());
    }

    /* JADX INFO: renamed from: S0 */
    private void m1995S0() {
        User userClone = ura.e().d().Uc().clone();
        final User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (!NullChecker.a(userSubtract)) {
            m2041s0();
            return;
        }
        act().progress(R.string.R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.wga0
            public final Object call(Object obj) {
                return C0096a.m2011n0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.xga0
            public final Object call(Object obj) {
                return this.f22269a.m2018G0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.yga0
            public final void call(Object obj) {
                this.f22867a.m2019H0((roj0) obj);
            }
        }, new e30() { // from class: l.zga0
            public final void call(Object obj) {
                this.f23395a.m2020I0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    private void m1996Y0(Bundle bundle) {
        this.f1235d = (LoopFragmentFactory.LoopCreateEntryType) bundle.getSerializable("loop_edit_entry_type");
        this.f1236e = (LoopInputType) bundle.getSerializable("loop_eidt_first_type");
        this.f1237f = bundle.getString("loop_edit_from", "");
        this.f1238g = bundle.getString("ext_value", "");
        this.f1245n = bundle.getBoolean("loop_edit_patch_flag");
        if (this.f1235d == null) {
            this.f1235d = LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT;
        }
        if (lqa.j()) {
            switch (a.f1250a[this.f1235d.ordinal()]) {
                case 1:
                    this.f1232a = "edit_profile";
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f1232a = this.f1237f;
                    break;
                case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                    this.f1232a = "profile_guide";
                    break;
                case ExpLoopInputType.GAME_NAME /* 8 */:
                    this.f1232a = "invisible_photo_card";
                    break;
                case ExpLoopInputType.GAME_TOGETHER /* 9 */:
                    this.f1232a = "invisible_photo_profile";
                    break;
            }
        } else {
            this.f1232a = this.f1235d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_EDIT ? "profile_guide" : "edit_profile";
        }
        if (lqa.f()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = this.f1235d;
            if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE) {
                this.f1232a = "mytab_ideal_exposure";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK) {
                this.f1232a = "match_satisfied";
            } else if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM) {
                this.f1232a = "check_other_ideal_type";
            }
        }
        if (this.f1235d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT && !TextUtils.isEmpty(bundle.getString("loop_create_from_page"))) {
            this.f1232a = bundle.getString("loop_create_from_page");
        }
        this.f1240i = ura.e().d().Uc().clone();
        try {
            StringBuffer stringBuffer = new StringBuffer(" showFragment entryType:");
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = this.f1235d;
            String str = "null";
            stringBuffer.append(loopCreateEntryType2 == null ? "null" : loopCreateEntryType2.toString());
            stringBuffer.append(" firstShow:");
            LoopInputType loopInputType = this.f1236e;
            stringBuffer.append(loopInputType == null ? "null" : loopInputType.title);
            stringBuffer.append(" oldUser:");
            User user = this.f1240i;
            stringBuffer.append(user == null ? "null" : ((DbObject) user).id);
            stringBuffer.append(" from:");
            String str2 = this.f1237f;
            if (str2 != null) {
                str = str2;
            }
            stringBuffer.append(str);
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", stringBuffer.toString());
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(this.f1240i.profile.work.industry) && !this.f1240i.profile.studies.active) {
                this.f1243l = false;
            }
        } catch (Exception e) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: entryType: a null object reference +" + e);
            CrashHelper.c(new NullPointerException("edit white screen = " + e));
        }
        User userUc = ura.e().d().Uc();
        this.f1241j = userUc;
        if (userUc != null) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:" + ((DbObject) this.f1241j).id);
        } else {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " showFragment args: editUser:null");
        }
        if (TextUtils.equals(this.f1237f, "from_card_guide_improve_profile")) {
            this.f1245n = true;
        }
        m1997a1();
    }

    /* JADX INFO: renamed from: a1 */
    private void m1997a1() {
        LoopInputType loopInputType;
        ArrayList<LoopInputType> arrayListM1941C = LoopFragmentFactory.m1941C(this.f1235d, this.f1236e, this.f1240i, this.f1243l, this.f1244m, this.f1237f, this.f1241j);
        du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList是否为空:" + vwb.J(this.f1239h) + "  orderList是否为空:" + vwb.J(arrayListM1941C));
        if (vwb.J(this.f1239h)) {
            this.f1239h.addAll(arrayListM1941C);
        } else {
            LoopInputType loopInputType2 = this.f1233b;
            if (loopInputType2 != null) {
                int iIndexOf = this.f1239h.indexOf(loopInputType2);
                du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f1239h.size() + " showIndex:" + iIndexOf);
                if (iIndexOf >= 0) {
                    for (int size = this.f1239h.size() - 1; size > iIndexOf; size--) {
                        this.f1239h.remove(size);
                    }
                }
                int iIndexOf2 = arrayListM1941C.indexOf(this.f1233b);
                du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：orderList.size():" + arrayListM1941C.size() + " orderIndex:" + iIndexOf2);
                if (iIndexOf2 >= 0) {
                    while (iIndexOf2 < arrayListM1941C.size()) {
                        if (this.f1239h.indexOf(arrayListM1941C.get(iIndexOf2)) < 0) {
                            this.f1239h.add(arrayListM1941C.get(iIndexOf2));
                        }
                        iIndexOf2++;
                    }
                }
            }
        }
        int i = 0;
        while (true) {
            if (i >= this.f1239h.size()) {
                loopInputType = null;
                break;
            }
            loopInputType = this.f1239h.get(i);
            if (this.f1247p.indexOf(loopInputType) < 0) {
                break;
            } else {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder("showNext showProgressAnim：hasShowList.size():");
        sb.append(this.f1247p.size());
        sb.append(" readyShow :");
        sb.append(loopInputType == null ? "null" : loopInputType.title);
        du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        m1998c1();
        du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showProgressAnim：showList.size():" + this.f1239h.size());
        if (loopInputType != null) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext showNextFragment: readyShow.title:" + loopInputType.title);
            m2034b1(loopInputType);
            return;
        }
        if (TextUtils.equals(this.f1237f, "serious_purpose_dialog") || TextUtils.equals(this.f1237f, "from_home_card_fake_build") || this.f1235d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext onFakeComplete");
            m2024O0();
        } else {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNext saveAndFinish");
            m2028U0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    private void m1998c1() {
        ((C0097b) ((jq2) this).viewModel).m2058k(this.f1239h.size(), this.f1234c);
    }

    /* JADX INFO: renamed from: d1 */
    private void m1999d1() {
        String string = act().getString(R.string.f0);
        String string2 = act().getString(R.string.g0);
        String string3 = act().getString(R.string.g0);
        new xh0.a(act()).s(string2).g(false).j(string).r(string3).o(new View.OnClickListener() { // from class: l.qga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17975a.m2022L0(view);
            }
        }).f(act().getString(R.string.e0)).c(new View.OnClickListener() { // from class: l.sga0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0096a.m2012o0(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: h1 */
    private void m2004h1() {
        LoopInputType loopInputType = this.f1233b;
        if (loopInputType == null) {
            return;
        }
        o6j0.c("e_edit_specific_profile_exit", loopInputType.pageId, new o6j0.a[]{o6j0.a.h("specific_edit_page_name", loopInputType.pageName)});
    }

    /* JADX INFO: renamed from: i1 */
    private void m2006i1() {
        LoopInputType loopInputType = this.f1233b;
        if (loopInputType == null) {
            return;
        }
        o6j0.h("e_edit_specific_profile_exit", loopInputType.pageId, new o6j0.a[]{o6j0.a.h("specific_edit_page_name", loopInputType.pageName)});
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ ProfileEditInfo m2011n0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m2012o0(View view) {
    }

    /* JADX INFO: renamed from: A0 */
    public boolean m2013A0() {
        return this.f1239h.size() <= 1 || this.f1234c == this.f1239h.size() - 1;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m2015D0() {
        act().finish();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m2016E0(roj0 roj0Var) {
        m2026Q0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.core.ui.ProfileEditInfoException */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ c m2018G0(User user, ProfileEditInfo profileEditInfo) throws ProfileEditInfoException {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.u9(user);
        }
        User user2 = this.f1241j;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m2019H0(roj0 roj0Var) {
        act().progressDismiss();
        m2029V0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m2020I0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.b("上传失败");
        } else if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.w(R.string.s);
        } else {
            osi0.f(R.string.Y0);
        }
        m2029V0(false);
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m2021J0(Bundle bundle) {
        m2006i1();
    }

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ void m2022L0(View view) {
        m2028U0();
    }

    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final void m2017F0(Throwable th) {
        act().progressDismiss();
        if (yij0.H(th)) {
            return;
        }
        act().dialog().D(R.string.c3).t0(R.string.i, new Runnable() { // from class: l.aha0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7613a.m2015D0();
            }
        }).k0(R.string.a).z0();
    }

    /* JADX INFO: renamed from: O0 */
    public void m2024O0() {
        act().hideInput();
        m2037g1();
    }

    /* JADX INFO: renamed from: P0 */
    public void m2025P0(boolean z) {
        this.f1234c++;
        if (z) {
            this.f1242k++;
        }
        m1997a1();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m2026Q0() {
        act().progressDismiss();
        act().finish();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m2027R0(User user) {
        if (NullChecker.a(user)) {
            duringCreated(CoreModule.c.e0.u9(user)).subscribe(mkd0.H(new e30() { // from class: l.uga0
                public final void call(Object obj) {
                    this.f20630a.m2016E0((roj0) obj);
                }
            }, new e30() { // from class: l.vga0
                public final void call(Object obj) {
                    this.f21118a.m2017F0((Throwable) obj);
                }
            }));
        } else {
            m2026Q0();
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m2028U0() {
        if (this.f1245n) {
            m1995S0();
            return;
        }
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", (Serializable) this.f1241j);
        wua0.a(this.f1241j, "saveAndFinish");
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: V0 */
    public void m2029V0(boolean z) {
        act().hideInput();
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", (Serializable) this.f1241j);
        wua0.a(this.f1241j, "saveAndFinish");
        act().setResult(z ? -1 : 0, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: W0 */
    public void m2030W0(xha0 xha0Var) {
        this.f1249r = xha0Var;
    }

    /* JADX INFO: renamed from: X0 */
    public void m2031X0(boolean z) {
        ((C0097b) ((jq2) this).viewModel).m2057j(z);
    }

    /* JADX INFO: renamed from: Z */
    public void m2032Z() {
        super.Z();
        creates(new e30() { // from class: l.tga0
            public final void call(Object obj) {
                this.f20226a.m1994C0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m2033a0() {
        super.a0();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m2034b1(LoopInputType loopInputType) {
        String string;
        this.f1247p.add(loopInputType);
        this.f1233b = loopInputType;
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        k kVarM = supportFragmentManager.m();
        Frag fragInstantiate = supportFragmentManager.r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f1246o = fragInstantiate;
        if (fragInstantiate instanceof Frag) {
            fragInstantiate.creates(new e30() { // from class: l.rga0
                public final void call(Object obj) {
                    this.f18503a.m2021J0((Bundle) obj);
                }
            });
        }
        if (!(this.f1246o instanceof ProfileLoopTextInputFrag)) {
            act().hideInput();
        }
        ProfileEditLoopBaseFrag profileEditLoopBaseFrag = this.f1246o;
        if (profileEditLoopBaseFrag instanceof ProfileEditLoopBaseFrag) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFrag2 = profileEditLoopBaseFrag;
            int i = this.f1234c;
            profileEditLoopBaseFrag2.m2088a5(loopInputType, i, this.f1242k, i == this.f1239h.size() - 1, this.f1232a, this.f1237f, this.f1238g);
        }
        if (this.f1234c > 0) {
            kVarM.u(tzb0.e, tzb0.f);
            kVarM.t(a5c0.x, this.f1246o, "input_text");
        } else {
            kVarM.c(a5c0.x, this.f1246o, "input_text");
        }
        try {
            StringBuilder sb = new StringBuilder("showNextFragment fragmentTransaction.commitAllowingStateLoss():hasShowList.size() :");
            sb.append(this.f1247p.size());
            sb.append(" currentType:");
            sb.append(NullChecker.a(this.f1233b) ? this.f1233b.title : " null");
            sb.append(" currentType.pageId:");
            if (NullChecker.a(this.f1233b)) {
                string = this.f1233b.pageId;
            } else {
                StringBuilder sb2 = new StringBuilder("null currentType.pageName:");
                sb2.append(NullChecker.a(this.f1233b) ? this.f1233b.pageName : "null");
                string = sb2.toString();
            }
            sb.append(string);
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", sb.toString());
        } catch (Exception unused) {
        }
        try {
            kVarM.j();
        } catch (Exception e) {
            du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", "showNextFragment commitAllowingStateLoss 异常" + e.getMessage());
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m2035e1() {
        return ((C0097b) ((jq2) this).viewModel).m2059l();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2036f1() {
        if (TextUtils.equals(this.f1237f, "from_explore_card")) {
            zvf0.r("e_tantanx_pet_upload_normalguide_close", "p_tantanx_pet_photo_normalguide");
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m2037g1() {
        act().progress(R.string.R0);
        if (TextUtils.equals(this.f1237f, "serious_purpose_dialog") || TextUtils.equals(this.f1237f, "from_home_card_fake_build")) {
            m2027R0(this.f1241j.clone().subtract(this.f1240i));
            return;
        }
        if (this.f1235d != LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m2027R0(this.f1241j);
            return;
        }
        User userMe_ = CoreModule.K().me_();
        if (NullChecker.a(userMe_)) {
            m2027R0(this.f1241j.clone().subtract(userMe_.clone()));
        } else {
            m2026Q0();
        }
    }

    public String getFrom() {
        return this.f1237f;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean m2038p0() {
        try {
            Fragment fragmentI0 = act().getSupportFragmentManager().i0("input_text");
            if (fragmentI0 == null || !fragmentI0.isVisible()) {
                int childCount = ((C0097b) ((jq2) this).viewModel).f1259i.getChildCount();
                if (ProfileInfoLoopEditAct.f1227g != null) {
                    du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress user:" + ProfileInfoLoopEditAct.f1227g.toJson());
                }
                du2.a("ProfileInfoLoopEditAct_white_screen_issue_tracking", " backPress childCount:" + childCount);
                CrashHelper.c(new RuntimeException("ProfileInfoLoopEditAct_WhiteScreenIssue"));
            }
        } catch (Exception unused) {
        }
        m2004h1();
        if (vwb.J(LoopFragmentFactory.m1941C(this.f1235d, null, this.f1240i, this.f1243l, this.f1244m, this.f1237f, this.f1241j)) || (lqa.j() && (TextUtils.equals(this.f1237f, "from_card_upload_photo") || TextUtils.equals(this.f1237f, "from_explore_card") || TextUtils.equals(this.f1237f, "from_profile_upload_photo")))) {
            m2041s0();
            m2036f1();
            return true;
        }
        if (this.f1235d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT) {
            m2024O0();
            return true;
        }
        m1999d1();
        return true;
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m2014C(C0097b c0097b) {
        super.C(c0097b);
    }

    /* JADX INFO: renamed from: r0 */
    public void m2040r0() {
        if (NullChecker.a(this.f1249r)) {
            this.f1249r.mo2095h1();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m2041s0() {
        act().hideInput();
        act().finish();
    }

    /* JADX INFO: renamed from: t0 */
    public Fragment m2042t0() {
        return this.f1246o;
    }

    /* JADX INFO: renamed from: u0 */
    public User m2043u0() {
        return ura.e().d().Uc();
    }

    /* JADX INFO: renamed from: x0 */
    public LoopFragmentFactory.LoopCreateEntryType m2044x0() {
        return this.f1235d;
    }

    /* JADX INFO: renamed from: y0 */
    public User m2045y0() {
        return this.f1240i;
    }

    /* JADX INFO: renamed from: z0 */
    public boolean m2046z0() {
        return this.f1235d == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
    }
}
