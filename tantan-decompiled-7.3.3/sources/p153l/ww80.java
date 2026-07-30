package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.filter.FilterVerificationUserMsgDlg;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class ww80 implements iam<hw80> {

    /* JADX INFO: renamed from: A */
    public VText f191162A;

    /* JADX INFO: renamed from: B */
    public VText f191163B;

    /* JADX INFO: renamed from: C */
    public VSwitch f191164C;

    /* JADX INFO: renamed from: D */
    public VFrame f191165D;

    /* JADX INFO: renamed from: E */
    public VText f191166E;

    /* JADX INFO: renamed from: E0 */
    public VText f191167E0;

    /* JADX INFO: renamed from: F */
    public VText f191168F;

    /* JADX INFO: renamed from: F0 */
    public VSwitch f191169F0;

    /* JADX INFO: renamed from: G */
    public VSwitch f191170G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f191171G0;

    /* JADX INFO: renamed from: H */
    public VFrame f191172H;

    /* JADX INFO: renamed from: H0 */
    public VText f191173H0;

    /* JADX INFO: renamed from: I */
    public VText f191174I;

    /* JADX INFO: renamed from: I0 */
    public VSwitch f191175I0;

    /* JADX INFO: renamed from: J */
    public VText f191176J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f191177J0;

    /* JADX INFO: renamed from: K */
    public VSwitch f191178K;

    /* JADX INFO: renamed from: K0 */
    public ImageView f191179K0;

    /* JADX INFO: renamed from: L */
    public VFrame f191180L;

    /* JADX INFO: renamed from: L0 */
    public TextView f191181L0;

    /* JADX INFO: renamed from: M */
    public VText f191182M;

    /* JADX INFO: renamed from: M0 */
    public View f191183M0;

    /* JADX INFO: renamed from: N */
    public VText f191184N;

    /* JADX INFO: renamed from: N0 */
    public VText f191185N0;

    /* JADX INFO: renamed from: O */
    public VSwitch f191186O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f191187O0;

    /* JADX INFO: renamed from: P */
    public VFrame f191188P;

    /* JADX INFO: renamed from: P0 */
    public VText f191189P0;

    /* JADX INFO: renamed from: Q */
    public VFrame f191190Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f191191Q0;

    /* JADX INFO: renamed from: R */
    public VText f191192R;

    /* JADX INFO: renamed from: R0 */
    public VText f191193R0;

    /* JADX INFO: renamed from: S */
    public VFrame f191194S;

    /* JADX INFO: renamed from: S0 */
    public View f191195S0;

    /* JADX INFO: renamed from: T */
    public VSwitch f191196T;

    /* JADX INFO: renamed from: T0 */
    public VText f191197T0;

    /* JADX INFO: renamed from: U */
    public VFrame f191198U;

    /* JADX INFO: renamed from: U0 */
    public VLinear f191199U0;

    /* JADX INFO: renamed from: V */
    public VSwitch f191200V;

    /* JADX INFO: renamed from: V0 */
    public VText f191201V0;

    /* JADX INFO: renamed from: W */
    public VFrame f191202W;

    /* JADX INFO: renamed from: W0 */
    public VLinear f191203W0;

    /* JADX INFO: renamed from: X */
    public VFrame f191204X;

    /* JADX INFO: renamed from: X0 */
    public View f191205X0;

    /* JADX INFO: renamed from: Y */
    public VSwitch f191206Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f191207Y0;

    /* JADX INFO: renamed from: Z */
    public VLinear f191208Z;

    /* JADX INFO: renamed from: Z0 */
    public VFrame f191209Z0;

    /* JADX INFO: renamed from: a */
    public VLinear f191210a;

    /* JADX INFO: renamed from: a1 */
    public VText f191211a1;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f191212b;

    /* JADX INFO: renamed from: b1 */
    public VFrame f191213b1;

    /* JADX INFO: renamed from: c */
    public VProgressBar f191214c;

    /* JADX INFO: renamed from: c1 */
    public VText f191215c1;

    /* JADX INFO: renamed from: d */
    public VScroll f191216d;

    /* JADX INFO: renamed from: d1 */
    public SettingGroups f191217d1;

    /* JADX INFO: renamed from: e */
    public VText f191218e;

    /* JADX INFO: renamed from: e1 */
    public User f191219e1;

    /* JADX INFO: renamed from: f */
    public LinearLayout f191220f;

    /* JADX INFO: renamed from: f1 */
    public Settings f191221f1;

    /* JADX INFO: renamed from: g */
    public VFrame f191222g;

    /* JADX INFO: renamed from: g1 */
    public hw80 f191223g1;

    /* JADX INFO: renamed from: h */
    public VText f191224h;

    /* JADX INFO: renamed from: h1 */
    public Act f191225h1;

    /* JADX INFO: renamed from: i */
    public VSwitch f191226i;

    /* JADX INFO: renamed from: i1 */
    public boolean f191227i1;

    /* JADX INFO: renamed from: j */
    public VFrame f191228j;

    /* JADX INFO: renamed from: k */
    public VText f191229k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f191230k0;

    /* JADX INFO: renamed from: l */
    public VSwitch f191231l;

    /* JADX INFO: renamed from: m */
    public VFrame f191232m;

    /* JADX INFO: renamed from: n */
    public VText f191233n;

    /* JADX INFO: renamed from: o */
    public VSwitch f191234o;

    /* JADX INFO: renamed from: p */
    public VFrame f191235p;

    /* JADX INFO: renamed from: p0 */
    public VText f191236p0;

    /* JADX INFO: renamed from: q */
    public VText f191237q;

    /* JADX INFO: renamed from: r */
    public VSwitch f191238r;

    /* JADX INFO: renamed from: s */
    public VFrame f191239s;

    /* JADX INFO: renamed from: t */
    public VText f191240t;

    /* JADX INFO: renamed from: u */
    public VSwitch f191241u;

    /* JADX INFO: renamed from: v */
    public VFrame f191242v;

    /* JADX INFO: renamed from: w */
    public VText f191243w;

    /* JADX INFO: renamed from: x */
    public VText f191244x;

    /* JADX INFO: renamed from: y */
    public VSwitch f191245y;

    /* JADX INFO: renamed from: z */
    public VFrame f191246z;

    /* JADX INFO: renamed from: l.ww80$a */
    public class ViewOnClickListenerC21189a implements View.OnClickListener {
        public ViewOnClickListenerC21189a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_paip_choose_avatar", "p_privacy_and_permission_settings_view", pf60.m172085a("switch_config_type", ww80.this.f191221f1.aiPictureEnable().booleanValue() ? "0" : "1"));
            ww80.this.f191223g1.m137454Y0(bsj0.m106262T(ww80.this.f191242v));
        }
    }

    /* JADX INFO: renamed from: l.ww80$b */
    public class ViewOnClickListenerC21190b implements View.OnClickListener {
        public ViewOnClickListenerC21190b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ww80.this.f191223g1.m137464l1();
            i4g0.m138523u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new pf60("push_switch_change", ww80.this.f191221f1.getSettingGroup().privacy.onlineReminder.booleanValue() ? "off2on" : "on2off"));
        }
    }

    /* JADX INFO: renamed from: l.ww80$c */
    public class ViewOnClickListenerC21191c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f191249a;

        public ViewOnClickListenerC21191c(boolean z) {
            this.f191249a = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ww80.this.f191223g1.m137453X0(!this.f191249a);
        }
    }

    /* JADX INFO: renamed from: l.ww80$d */
    public class ViewOnClickListenerC21192d implements View.OnClickListener {
        public ViewOnClickListenerC21192d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            if (!NullChecker.m82486a(verificationCenterM32615k4) || !NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo)) {
                FilterVerificationUserMsgDlg.m46580K(ww80.this.getAct(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
                return;
            }
            if (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
                ww80.this.f191223g1.m137455a1(bsj0.m106262T(ww80.this.f191172H));
            } else if (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
                o1j0.m165651y("认证审核中，审核成功后可更改设置");
            } else {
                FilterVerificationUserMsgDlg.m46580K(ww80.this.getAct(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
            }
        }
    }

    public ww80(Act act) {
        this.f191225h1 = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m208156H(View view) {
        this.f191223g1.m137463k1(bsj0.m106285u(this.f191222g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m208157J(View view) {
        this.f191223g1.m137456b1(bsj0.m106262T(this.f191239s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m208158K(View view) {
        m208198b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m208159L(View view) {
        this.f191223g1.m137465m1(bsj0.m106262T(this.f191198U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m208160M(View view) {
        this.f191223g1.m137441F0();
        i4g0.m138520r("e_personalized_recommendation_document", "p_privacy_and_permission_settings_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m208161N(View view) {
        this.f191223g1.m137437A0(bsj0.m106262T(this.f191187O0));
        sfj0.m185598e("e_privacy_permission_settings_album", "p_privacy_and_permission_settings_view", pf60.m172085a("album_management_button_status", this.f191221f1.hidePublicMoment().booleanValue() ? "button_open" : "button_off"));
        o1j0.m165649w(this.f191221f1.hidePublicMoment().booleanValue() ? R$string.f19175d5 : R$string.f19420l5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m208162O(View view) {
        this.f191223g1.m137438C0(bsj0.m106262T(this.f191208Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m208163Q(View view) {
        if (this.f191221f1.heartbeatDisable().booleanValue()) {
            this.f191223g1.m137462j1(false);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m208164X() {
        Object obj;
        if (!this.f191227i1) {
            bsj0.m106284t(this.f191222g, this.f191221f1.hideContacts().booleanValue() && PermissionHelper.m81064b("android.permission.READ_CONTACTS"));
            this.f191222g.setOnClickListener(new View.OnClickListener() { // from class: l.pw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154384a.m208156H(view);
                }
            });
        }
        bsj0.m106284t(this.f191228j, !this.f191221f1.hideMutualContacts().booleanValue());
        this.f191228j.setOnClickListener(new View.OnClickListener() { // from class: l.rw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165120a.m208187I(view);
            }
        });
        bnl0.m105524M(this.f191239s, false);
        bsj0.m106284t(this.f191239s, !CoreModule.f18264c.f20300D0.f20871T.get().booleanValue());
        this.f191239s.setOnClickListener(new View.OnClickListener() { // from class: l.sw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170927a.m208157J(view);
            }
        });
        bnl0.m105524M(this.f191180L, false);
        bsj0.m106284t(this.f191180L, !this.f191221f1.heartbeatDisable().booleanValue());
        this.f191180L.setOnClickListener(new View.OnClickListener() { // from class: l.tw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176386a.m208163Q(view);
            }
        });
        bnl0.m105524M(this.f191242v, false);
        bsj0.m106284t(this.f191242v, this.f191221f1.aiPictureEnable().booleanValue());
        i4g0.m138526x("e_paip_choose_avatar", "p_privacy_and_permission_settings_view");
        bnl0.m105509E0(this.f191242v, new ViewOnClickListenerC21189a());
        bsj0.m106284t(this.f191194S, this.f191221f1.personalizeSuggest().booleanValue());
        this.f191194S.setOnClickListener(new View.OnClickListener() { // from class: l.uw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181248a.m208158K(view);
            }
        });
        bsj0.m106284t(this.f191198U, this.f191221f1.personalizeAdsSuggest());
        this.f191198U.setOnClickListener(new View.OnClickListener() { // from class: l.vw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186108a.m208159L(view);
            }
        });
        bnl0.m105509E0(this.f191202W, new View.OnClickListener() { // from class: l.jw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122898a.m208160M(view);
            }
        });
        i4g0.m138526x("e_personalized_recommend_button", "p_privacy_and_permission_settings_view");
        bsj0.m106284t(this.f191187O0, this.f191221f1.hidePublicMoment().booleanValue());
        this.f191187O0.setOnClickListener(new View.OnClickListener() { // from class: l.kw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129040a.m208161N(view);
            }
        });
        bsj0.m106284t(this.f191208Z, this.f191221f1.hideSchoolName());
        this.f191208Z.setOnClickListener(new View.OnClickListener() { // from class: l.lw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133788a.m208162O(view);
            }
        });
        bnl0.m105524M(this.f191204X, false);
        if (CoreModule.m30932N().mo61512Vg()) {
            bnl0.m105524M(this.f191213b1, this.f191223g1.m137440E0());
            bsj0.m106284t(this.f191213b1, this.f191221f1.hideAutoLike().booleanValue());
            this.f191213b1.setOnClickListener(new View.OnClickListener() { // from class: l.mw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139035a.m208185F(view);
                }
            });
        }
        if (gra.m131772x3() && NullChecker.m82486a(this.f191219e1) && this.f191219e1.isFemale()) {
            bnl0.m105524M(this.f191171G0, true);
            if (NullChecker.m82486a(this.f191219e1.settings) && !jyb.m147479J(this.f191219e1.settings.settingGroups) && NullChecker.m82486a(this.f191219e1.settings.settingGroups.get(0).privacy)) {
                Boolean bool = this.f191219e1.settings.settingGroups.get(0).privacy.onlineReminder;
                m208181A(bool.booleanValue());
                if (!bool.booleanValue()) {
                    obj = "close";
                }
                bnl0.m105509E0(this.f191171G0, new ViewOnClickListenerC21190b());
                i4g0.m138492A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new pf60("switch_type", obj));
            } else {
                m208181A(true);
            }
            obj = "open";
            bnl0.m105509E0(this.f191171G0, new ViewOnClickListenerC21190b());
            i4g0.m138492A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new pf60("switch_type", obj));
        }
        if (!h39.m133442f() || this.f191219e1.isFemale()) {
            bnl0.m105524M(this.f191232m, false);
        } else {
            bnl0.m105524M(this.f191232m, true);
            final boolean zBooleanValue = this.f191221f1.unrepliedReminder().booleanValue();
            bsj0.m106284t(this.f191232m, this.f191221f1.unrepliedReminder().booleanValue());
            bnl0.m105509E0(this.f191232m, new View.OnClickListener() { // from class: l.qw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159871a.m208186G(zBooleanValue, view);
                }
            });
            i4g0.m138492A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new pf60("gender", "male"), new pf60("switch_type", zBooleanValue ? "open" : "close"));
        }
        m208197a0();
        bnl0.m105524M(this.f191246z, false);
        bnl0.m105524M(this.f191165D, false);
        boolean z = (!gra.m131676e2() || this.f191221f1.getSettingGroup() == null || this.f191221f1.getSettingGroup().marriage == null) ? false : true;
        VText vText = this.f191197T0;
        if (z) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f191205X0, true);
        } else {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f191205X0, false);
        }
        VLinear vLinear = this.f191199U0;
        if (z) {
            bnl0.m105524M(vLinear, true);
            boolean z2 = this.f191221f1.getSettingGroup().marriage.closeMode;
            bsj0.m106284t(this.f191199U0, !z2);
            bnl0.m105509E0(this.f191199U0, new ViewOnClickListenerC21191c(z2));
        } else {
            bnl0.m105524M(vLinear, false);
        }
        bnl0.m105524M(this.f191203W0, false);
    }

    /* JADX INFO: renamed from: A */
    public void m208181A(boolean z) {
        bsj0.m106284t(this.f191171G0, z);
    }

    /* JADX INFO: renamed from: B */
    public boolean m208182B() {
        return bnl0.m105529O0(this.f191208Z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m208183C(View view) {
        getAct().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f191225h1;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m208184E(View view) {
        this.f191223g1.m137457c1();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m208185F(View view) {
        this.f191223g1.m137468z0(bsj0.m106262T(this.f191213b1));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m208186G(boolean z, View view) {
        i4g0.m138523u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new pf60("gender", "male"), new pf60("push_switch_change", z ? "on2off" : "off2on"));
        this.f191223g1.m137467o1(bsj0.m106262T(this.f191232m));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m208187I(View view) {
        this.f191223g1.m137458d1(bsj0.m106285u(this.f191228j));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m208188P(View view) {
        this.f191223g1.m137439D0(bsj0.m106262T(this.f191230k0));
    }

    /* JADX INFO: renamed from: R */
    public void m208189R(String str) {
        if (TextUtils.equals(str, "other_setting")) {
            this.f191227i1 = true;
            this.f191212b.setTitle("其他设置");
            this.f191218e.setText("常规");
            bnl0.m105524M(this.f191222g, false);
        } else {
            boolean zM131555D2 = gra.m131555D2();
            VNavigationBar vNavigationBar = this.f191212b;
            if (zM131555D2) {
                vNavigationBar.setTitle("隐私设置");
            } else {
                vNavigationBar.setTitle(R$string.f19687to);
            }
        }
        this.f191212b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.iw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117255a.m208183C(view);
            }
        });
        bnl0.m105524M(this.f191194S, true);
        bnl0.m105524M(this.f191198U, false);
        bnl0.m105524M(this.f191202W, false);
        bnl0.m105524M(this.f191191Q0, false);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (TEnum.equals(userM116600p9.source, "facebook") || TEnum.equals(userM116600p9.source, "google")) {
            bnl0.m105524M(this.f191222g, false);
            bnl0.m105524M(this.f191228j, false);
            bnl0.m105524M(this.f191208Z, false);
        }
        boolean z = userM116600p9.profile.studies.verified;
        VLinear vLinear = this.f191208Z;
        if (z) {
            vLinear.setVisibility(0);
        } else {
            vLinear.setVisibility(8);
        }
        this.f191209Z0.setOnClickListener(new View.OnClickListener() { // from class: l.nw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143934a.m208184E(view);
            }
        });
        SettingGroups settingGroups = CoreModule.f18264c.f20381e0.f89110R.get();
        this.f191217d1 = settingGroups;
        m208195Y(settingGroups);
        bnl0.m105524M(this.f191188P, false);
        bnl0.m105524M(this.f191190Q, false);
        if (gra.m131555D2()) {
            this.f191192R.setText("接收聊天室邀请");
        }
        bnl0.m105524M(this.f191195S0, false);
        bnl0.m105524M(this.f191209Z0, false);
        bnl0.m105524M(this.f191207Y0, false);
    }

    /* JADX INFO: renamed from: S */
    public void m208190S(Throwable th) {
        this.f191225h1.progressDismiss();
        this.f191217d1.fake.syncMoment = Boolean.valueOf(bsj0.m106262T(this.f191191Q0));
        this.f191217d1.privacy.hideVIP = Boolean.valueOf(bsj0.m106262T(this.f191230k0));
    }

    /* JADX INFO: renamed from: T */
    public void m208191T() {
        this.f191216d.setVisibility(4);
        this.f191214c.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m208192U(Throwable th) {
        this.f191225h1.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: V */
    public void m208193V() {
        this.f191225h1.progressDismiss();
        m208164X();
    }

    /* JADX INFO: renamed from: W */
    public void m208194W(String str, boolean z) {
        this.f191225h1.progress(str, z);
    }

    /* JADX INFO: renamed from: Y */
    public void m208195Y(SettingGroups settingGroups) {
        this.f191225h1.progressDismiss();
        bnl0.m105525M0(this.f191230k0, true);
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP() || CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            bsj0.m106284t(this.f191230k0, settingGroups.privacy.hideVIP.booleanValue());
            if (CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
                this.f191167E0.setText(this.f191225h1.getString(R$string.f19480n3));
            }
            this.f191230k0.setOnClickListener(new View.OnClickListener() { // from class: l.ow80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f149462a.m208188P(view);
                }
            });
            return;
        }
        bsj0.m106284t(this.f191230k0, false);
        this.f191236p0.setTextColor(getAct().getResources().getColor(c9c0.f80459t1));
        this.f191230k0.setClickable(false);
        this.f191230k0.setFocusable(false);
        this.f191169F0.setClickable(false);
    }

    /* JADX INFO: renamed from: Z */
    public void m208196Z(User user, Settings settings) {
        if (this.f191216d.getVisibility() == 4) {
            this.f191216d.setVisibility(0);
            this.f191214c.setVisibility(4);
        }
        this.f191219e1 = user;
        this.f191221f1 = settings;
        m208164X();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m208197a0() {
        if (h39.m133431T()) {
            bnl0.m105524M(this.f191172H, true);
            bsj0.m106284t(this.f191172H, this.f191221f1.justReceiveVeriUserMsg().booleanValue() && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified());
            bnl0.m105509E0(this.f191172H, new ViewOnClickListenerC21192d());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m208198b0() {
        this.f191223g1.m137466n1(bsj0.m106262T(this.f191194S));
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m208199c0() {
        return bsj0.m106262T(this.f191222g);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m208200d0() {
        return bsj0.m106262T(this.f191228j);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m208201v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m208201v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xw80.m213300b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m208202w() {
        bnl0.m105524M(this.f191209Z0, true);
        bnl0.m105524M(this.f191207Y0, true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(hw80 hw80Var) {
        this.f191223g1 = hw80Var;
    }

    /* JADX INFO: renamed from: y */
    public void m208204y(boolean z) {
        bsj0.m106284t(this.f191222g, z);
    }

    /* JADX INFO: renamed from: z */
    public void m208205z(boolean z) {
        bsj0.m106284t(this.f191228j, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
