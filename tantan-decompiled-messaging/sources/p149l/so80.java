package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.filter.FilterVerificationUserMsgDlg;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VScroll;
import p147v.VSwitch;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class so80 implements s7m<do80> {

    /* JADX INFO: renamed from: A */
    public VText f165568A;

    /* JADX INFO: renamed from: B */
    public VText f165569B;

    /* JADX INFO: renamed from: C */
    public VSwitch f165570C;

    /* JADX INFO: renamed from: D */
    public VFrame f165571D;

    /* JADX INFO: renamed from: E */
    public VText f165572E;

    /* JADX INFO: renamed from: E0 */
    public VText f165573E0;

    /* JADX INFO: renamed from: F */
    public VText f165574F;

    /* JADX INFO: renamed from: F0 */
    public VSwitch f165575F0;

    /* JADX INFO: renamed from: G */
    public VSwitch f165576G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f165577G0;

    /* JADX INFO: renamed from: H */
    public VFrame f165578H;

    /* JADX INFO: renamed from: H0 */
    public VText f165579H0;

    /* JADX INFO: renamed from: I */
    public VText f165580I;

    /* JADX INFO: renamed from: I0 */
    public VSwitch f165581I0;

    /* JADX INFO: renamed from: J */
    public VText f165582J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f165583J0;

    /* JADX INFO: renamed from: K */
    public VSwitch f165584K;

    /* JADX INFO: renamed from: K0 */
    public ImageView f165585K0;

    /* JADX INFO: renamed from: L */
    public VFrame f165586L;

    /* JADX INFO: renamed from: L0 */
    public TextView f165587L0;

    /* JADX INFO: renamed from: M */
    public VText f165588M;

    /* JADX INFO: renamed from: M0 */
    public View f165589M0;

    /* JADX INFO: renamed from: N */
    public VText f165590N;

    /* JADX INFO: renamed from: N0 */
    public VText f165591N0;

    /* JADX INFO: renamed from: O */
    public VSwitch f165592O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f165593O0;

    /* JADX INFO: renamed from: P */
    public VFrame f165594P;

    /* JADX INFO: renamed from: P0 */
    public VText f165595P0;

    /* JADX INFO: renamed from: Q */
    public VFrame f165596Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f165597Q0;

    /* JADX INFO: renamed from: R */
    public VText f165598R;

    /* JADX INFO: renamed from: R0 */
    public VText f165599R0;

    /* JADX INFO: renamed from: S */
    public VFrame f165600S;

    /* JADX INFO: renamed from: S0 */
    public View f165601S0;

    /* JADX INFO: renamed from: T */
    public VSwitch f165602T;

    /* JADX INFO: renamed from: T0 */
    public VText f165603T0;

    /* JADX INFO: renamed from: U */
    public VFrame f165604U;

    /* JADX INFO: renamed from: U0 */
    public VLinear f165605U0;

    /* JADX INFO: renamed from: V */
    public VSwitch f165606V;

    /* JADX INFO: renamed from: V0 */
    public VText f165607V0;

    /* JADX INFO: renamed from: W */
    public VFrame f165608W;

    /* JADX INFO: renamed from: W0 */
    public VLinear f165609W0;

    /* JADX INFO: renamed from: X */
    public VFrame f165610X;

    /* JADX INFO: renamed from: X0 */
    public View f165611X0;

    /* JADX INFO: renamed from: Y */
    public VSwitch f165612Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f165613Y0;

    /* JADX INFO: renamed from: Z */
    public VLinear f165614Z;

    /* JADX INFO: renamed from: Z0 */
    public VFrame f165615Z0;

    /* JADX INFO: renamed from: a */
    public VLinear f165616a;

    /* JADX INFO: renamed from: a1 */
    public VText f165617a1;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f165618b;

    /* JADX INFO: renamed from: b1 */
    public VFrame f165619b1;

    /* JADX INFO: renamed from: c */
    public VProgressBar f165620c;

    /* JADX INFO: renamed from: c1 */
    public VText f165621c1;

    /* JADX INFO: renamed from: d */
    public VScroll f165622d;

    /* JADX INFO: renamed from: d1 */
    public SettingGroups f165623d1;

    /* JADX INFO: renamed from: e */
    public VText f165624e;

    /* JADX INFO: renamed from: e1 */
    public User f165625e1;

    /* JADX INFO: renamed from: f */
    public LinearLayout f165626f;

    /* JADX INFO: renamed from: f1 */
    public Settings f165627f1;

    /* JADX INFO: renamed from: g */
    public VFrame f165628g;

    /* JADX INFO: renamed from: g1 */
    public do80 f165629g1;

    /* JADX INFO: renamed from: h */
    public VText f165630h;

    /* JADX INFO: renamed from: h1 */
    public Act f165631h1;

    /* JADX INFO: renamed from: i */
    public VSwitch f165632i;

    /* JADX INFO: renamed from: i1 */
    public boolean f165633i1;

    /* JADX INFO: renamed from: j */
    public VFrame f165634j;

    /* JADX INFO: renamed from: k */
    public VText f165635k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f165636k0;

    /* JADX INFO: renamed from: l */
    public VSwitch f165637l;

    /* JADX INFO: renamed from: m */
    public VFrame f165638m;

    /* JADX INFO: renamed from: n */
    public VText f165639n;

    /* JADX INFO: renamed from: o */
    public VSwitch f165640o;

    /* JADX INFO: renamed from: p */
    public VFrame f165641p;

    /* JADX INFO: renamed from: p0 */
    public VText f165642p0;

    /* JADX INFO: renamed from: q */
    public VText f165643q;

    /* JADX INFO: renamed from: r */
    public VSwitch f165644r;

    /* JADX INFO: renamed from: s */
    public VFrame f165645s;

    /* JADX INFO: renamed from: t */
    public VText f165646t;

    /* JADX INFO: renamed from: u */
    public VSwitch f165647u;

    /* JADX INFO: renamed from: v */
    public VFrame f165648v;

    /* JADX INFO: renamed from: w */
    public VText f165649w;

    /* JADX INFO: renamed from: x */
    public VText f165650x;

    /* JADX INFO: renamed from: y */
    public VSwitch f165651y;

    /* JADX INFO: renamed from: z */
    public VFrame f165652z;

    /* JADX INFO: renamed from: l.so80$a */
    public class ViewOnClickListenerC20002a implements View.OnClickListener {
        public ViewOnClickListenerC20002a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_paip_choose_avatar", "p_privacy_and_permission_settings_view", j760.m140076a("switch_config_type", so80.this.f165627f1.aiPictureEnable().booleanValue() ? "0" : "1"));
            so80.this.f165629g1.m112785Y0(yij0.m214942T(so80.this.f165648v));
        }
    }

    /* JADX INFO: renamed from: l.so80$b */
    public class ViewOnClickListenerC20003b implements View.OnClickListener {
        public ViewOnClickListenerC20003b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            so80.this.f165629g1.m112795l1();
            zvf0.m220399u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760("push_switch_change", so80.this.f165627f1.getSettingGroup().privacy.onlineReminder.booleanValue() ? "off2on" : "on2off"));
        }
    }

    /* JADX INFO: renamed from: l.so80$c */
    public class ViewOnClickListenerC20004c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f165655a;

        public ViewOnClickListenerC20004c(boolean z) {
            this.f165655a = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            so80.this.f165629g1.m112784X0(!this.f165655a);
        }
    }

    /* JADX INFO: renamed from: l.so80$d */
    public class ViewOnClickListenerC20005d implements View.OnClickListener {
        public ViewOnClickListenerC20005d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            if (!NullChecker.m81303a(verificationCenterM31612k4) || !NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo)) {
                FilterVerificationUserMsgDlg.m45397K(so80.this.getAct(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
                return;
            }
            if (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
                so80.this.f165629g1.m112786a1(yij0.m214942T(so80.this.f165578H));
            } else if (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, StudentVerificationStatus.prePending)) {
                lsi0.m151595y("认证审核中，审核成功后可更改设置");
            } else {
                FilterVerificationUserMsgDlg.m45397K(so80.this.getAct(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
            }
        }
    }

    public so80(Act act) {
        this.f165631h1 = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m185240H(View view) {
        this.f165629g1.m112794k1(yij0.m214965u(this.f165628g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m185241J(View view) {
        this.f165629g1.m112787b1(yij0.m214942T(this.f165645s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m185242K(View view) {
        m185282b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m185243L(View view) {
        this.f165629g1.m112796m1(yij0.m214942T(this.f165604U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m185244M(View view) {
        this.f165629g1.m112772F0();
        zvf0.m220396r("e_personalized_recommendation_document", "p_privacy_and_permission_settings_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m185245N(View view) {
        this.f165629g1.m112768A0(yij0.m214942T(this.f165593O0));
        o6j0.m162861e("e_privacy_permission_settings_album", "p_privacy_and_permission_settings_view", j760.m140076a("album_management_button_status", this.f165627f1.hidePublicMoment().booleanValue() ? "button_open" : "button_off"));
        lsi0.m151593w(this.f165627f1.hidePublicMoment().booleanValue() ? R$string.f18383b5 : R$string.f18628j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m185246O(View view) {
        this.f165629g1.m112769C0(yij0.m214942T(this.f165614Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m185247Q(View view) {
        if (this.f165627f1.heartbeatDisable().booleanValue()) {
            this.f165629g1.m112793j1(false);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m185248X() {
        Object obj;
        if (!this.f165633i1) {
            yij0.m214964t(this.f165628g, this.f165627f1.hideContacts().booleanValue() && PermissionHelper.m79881b("android.permission.READ_CONTACTS"));
            this.f165628g.setOnClickListener(new View.OnClickListener() { // from class: l.lo80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129078a.m185240H(view);
                }
            });
        }
        yij0.m214964t(this.f165634j, !this.f165627f1.hideMutualContacts().booleanValue());
        this.f165634j.setOnClickListener(new View.OnClickListener() { // from class: l.no80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139822a.m185271I(view);
            }
        });
        xdl0.m208344M(this.f165645s, false);
        yij0.m214964t(this.f165645s, !CoreModule.f17545c.f19558D0.f20129T.get().booleanValue());
        this.f165645s.setOnClickListener(new View.OnClickListener() { // from class: l.oo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144857a.m185241J(view);
            }
        });
        xdl0.m208344M(this.f165586L, false);
        yij0.m214964t(this.f165586L, !this.f165627f1.heartbeatDisable().booleanValue());
        this.f165586L.setOnClickListener(new View.OnClickListener() { // from class: l.po80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150493a.m185247Q(view);
            }
        });
        xdl0.m208344M(this.f165648v, false);
        yij0.m214964t(this.f165648v, this.f165627f1.aiPictureEnable().booleanValue());
        zvf0.m220402x("e_paip_choose_avatar", "p_privacy_and_permission_settings_view");
        xdl0.m208329E0(this.f165648v, new ViewOnClickListenerC20002a());
        yij0.m214964t(this.f165600S, this.f165627f1.personalizeSuggest().booleanValue());
        this.f165600S.setOnClickListener(new View.OnClickListener() { // from class: l.qo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155543a.m185242K(view);
            }
        });
        yij0.m214964t(this.f165604U, this.f165627f1.personalizeAdsSuggest());
        this.f165604U.setOnClickListener(new View.OnClickListener() { // from class: l.ro80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160369a.m185243L(view);
            }
        });
        xdl0.m208329E0(this.f165608W, new View.OnClickListener() { // from class: l.fo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98516a.m185244M(view);
            }
        });
        zvf0.m220402x("e_personalized_recommend_button", "p_privacy_and_permission_settings_view");
        yij0.m214964t(this.f165593O0, this.f165627f1.hidePublicMoment().booleanValue());
        this.f165593O0.setOnClickListener(new View.OnClickListener() { // from class: l.go80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103665a.m185245N(view);
            }
        });
        yij0.m214964t(this.f165614Z, this.f165627f1.hideSchoolName());
        this.f165614Z.setOnClickListener(new View.OnClickListener() { // from class: l.ho80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108801a.m185246O(view);
            }
        });
        xdl0.m208344M(this.f165610X, false);
        if (CoreModule.m29934N().mo60328Vg()) {
            xdl0.m208344M(this.f165619b1, this.f165629g1.m112771E0());
            yij0.m214964t(this.f165619b1, this.f165627f1.hideAutoLike().booleanValue());
            this.f165619b1.setOnClickListener(new View.OnClickListener() { // from class: l.io80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114113a.m185269F(view);
                }
            });
        }
        if (upa.m194841x3() && NullChecker.m81303a(this.f165625e1) && this.f165625e1.isFemale()) {
            xdl0.m208344M(this.f165577G0, true);
            if (NullChecker.m81303a(this.f165625e1.settings) && !vwb.m200296J(this.f165625e1.settings.settingGroups) && NullChecker.m81303a(this.f165625e1.settings.settingGroups.get(0).privacy)) {
                Boolean bool = this.f165625e1.settings.settingGroups.get(0).privacy.onlineReminder;
                m185265A(bool.booleanValue());
                if (!bool.booleanValue()) {
                    obj = "close";
                }
                xdl0.m208329E0(this.f165577G0, new ViewOnClickListenerC20003b());
                zvf0.m220368A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760("switch_type", obj));
            } else {
                m185265A(true);
            }
            obj = "open";
            xdl0.m208329E0(this.f165577G0, new ViewOnClickListenerC20003b());
            zvf0.m220368A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760("switch_type", obj));
        }
        if (!y19.m212171f() || this.f165625e1.isFemale()) {
            xdl0.m208344M(this.f165638m, false);
        } else {
            xdl0.m208344M(this.f165638m, true);
            final boolean zBooleanValue = this.f165627f1.unrepliedReminder().booleanValue();
            yij0.m214964t(this.f165638m, this.f165627f1.unrepliedReminder().booleanValue());
            xdl0.m208329E0(this.f165638m, new View.OnClickListener() { // from class: l.mo80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134872a.m185270G(zBooleanValue, view);
                }
            });
            zvf0.m220368A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760("gender", "male"), new j760("switch_type", zBooleanValue ? "open" : "close"));
        }
        m185281a0();
        xdl0.m208344M(this.f165652z, false);
        xdl0.m208344M(this.f165571D, false);
        boolean z = (!upa.m194745e2() || this.f165627f1.getSettingGroup() == null || this.f165627f1.getSettingGroup().marriage == null) ? false : true;
        VText vText = this.f165603T0;
        if (z) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f165611X0, true);
        } else {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f165611X0, false);
        }
        VLinear vLinear = this.f165605U0;
        if (z) {
            xdl0.m208344M(vLinear, true);
            boolean z2 = this.f165627f1.getSettingGroup().marriage.closeMode;
            yij0.m214964t(this.f165605U0, !z2);
            xdl0.m208329E0(this.f165605U0, new ViewOnClickListenerC20004c(z2));
        } else {
            xdl0.m208344M(vLinear, false);
        }
        xdl0.m208344M(this.f165609W0, false);
    }

    /* JADX INFO: renamed from: A */
    public void m185265A(boolean z) {
        yij0.m214964t(this.f165577G0, z);
    }

    /* JADX INFO: renamed from: B */
    public boolean m185266B() {
        return xdl0.m208349O0(this.f165614Z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m185267C(View view) {
        getAct().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f165631h1;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m185268E(View view) {
        this.f165629g1.m112788c1();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m185269F(View view) {
        this.f165629g1.m112799z0(yij0.m214942T(this.f165619b1));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m185270G(boolean z, View view) {
        zvf0.m220399u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760("gender", "male"), new j760("push_switch_change", z ? "on2off" : "off2on"));
        this.f165629g1.m112798o1(yij0.m214942T(this.f165638m));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m185271I(View view) {
        this.f165629g1.m112789d1(yij0.m214965u(this.f165634j));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m185272P(View view) {
        this.f165629g1.m112770D0(yij0.m214942T(this.f165636k0));
    }

    /* JADX INFO: renamed from: R */
    public void m185273R(String str) {
        if (TextUtils.equals(str, "other_setting")) {
            this.f165633i1 = true;
            this.f165618b.setTitle("其他设置");
            this.f165624e.setText("常规");
            xdl0.m208344M(this.f165628g, false);
        } else {
            boolean zM194624D2 = upa.m194624D2();
            VNavigationBar vNavigationBar = this.f165618b;
            if (zM194624D2) {
                vNavigationBar.setTitle("隐私设置");
            } else {
                vNavigationBar.setTitle(R$string.f18250Wn);
            }
        }
        this.f165618b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.eo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92426a.m185267C(view);
            }
        });
        xdl0.m208344M(this.f165600S, true);
        xdl0.m208344M(this.f165604U, false);
        xdl0.m208344M(this.f165608W, false);
        xdl0.m208344M(this.f165597Q0, false);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (TEnum.equals(userM169527p9.source, "facebook") || TEnum.equals(userM169527p9.source, "google")) {
            xdl0.m208344M(this.f165628g, false);
            xdl0.m208344M(this.f165634j, false);
            xdl0.m208344M(this.f165614Z, false);
        }
        boolean z = userM169527p9.profile.studies.verified;
        VLinear vLinear = this.f165614Z;
        if (z) {
            vLinear.setVisibility(0);
        } else {
            vLinear.setVisibility(8);
        }
        this.f165615Z0.setOnClickListener(new View.OnClickListener() { // from class: l.jo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118922a.m185268E(view);
            }
        });
        SettingGroups settingGroups = CoreModule.f17545c.f19639e0.f149253R.get();
        this.f165623d1 = settingGroups;
        m185279Y(settingGroups);
        xdl0.m208344M(this.f165594P, false);
        xdl0.m208344M(this.f165596Q, false);
        if (upa.m194624D2()) {
            this.f165598R.setText("接收聊天室邀请");
        }
        xdl0.m208344M(this.f165601S0, false);
        xdl0.m208344M(this.f165615Z0, false);
        xdl0.m208344M(this.f165613Y0, false);
    }

    /* JADX INFO: renamed from: S */
    public void m185274S(Throwable th) {
        this.f165631h1.progressDismiss();
        this.f165623d1.fake.syncMoment = Boolean.valueOf(yij0.m214942T(this.f165597Q0));
        this.f165623d1.privacy.hideVIP = Boolean.valueOf(yij0.m214942T(this.f165636k0));
    }

    /* JADX INFO: renamed from: T */
    public void m185275T() {
        this.f165622d.setVisibility(4);
        this.f165620c.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m185276U(Throwable th) {
        this.f165631h1.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: V */
    public void m185277V() {
        this.f165631h1.progressDismiss();
        m185248X();
    }

    /* JADX INFO: renamed from: W */
    public void m185278W(String str, boolean z) {
        this.f165631h1.progress(str, z);
    }

    /* JADX INFO: renamed from: Y */
    public void m185279Y(SettingGroups settingGroups) {
        this.f165631h1.progressDismiss();
        xdl0.m208345M0(this.f165636k0, true);
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP() || CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            yij0.m214964t(this.f165636k0, settingGroups.privacy.hideVIP.booleanValue());
            if (CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
                this.f165573E0.setText(this.f165631h1.getString(R$string.f18688l3));
            }
            this.f165636k0.setOnClickListener(new View.OnClickListener() { // from class: l.ko80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123971a.m185272P(view);
                }
            });
            return;
        }
        yij0.m214964t(this.f165636k0, false);
        this.f165642p0.setTextColor(getAct().getResources().getColor(w0c0.f183886s1));
        this.f165636k0.setClickable(false);
        this.f165636k0.setFocusable(false);
        this.f165575F0.setClickable(false);
    }

    /* JADX INFO: renamed from: Z */
    public void m185280Z(User user, Settings settings) {
        if (this.f165622d.getVisibility() == 4) {
            this.f165622d.setVisibility(0);
            this.f165620c.setVisibility(4);
        }
        this.f165625e1 = user;
        this.f165627f1 = settings;
        m185248X();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m185281a0() {
        if (y19.m212160T()) {
            xdl0.m208344M(this.f165578H, true);
            yij0.m214964t(this.f165578H, this.f165627f1.justReceiveVeriUserMsg().booleanValue() && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified());
            xdl0.m208329E0(this.f165578H, new ViewOnClickListenerC20005d());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m185282b0() {
        this.f165629g1.m112797n1(yij0.m214942T(this.f165600S));
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m185283c0() {
        return yij0.m214942T(this.f165628g);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m185284d0() {
        return yij0.m214942T(this.f165634j);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m185285v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m185285v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return to80.m189845b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m185286w() {
        xdl0.m208344M(this.f165615Z0, true);
        xdl0.m208344M(this.f165613Y0, true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(do80 do80Var) {
        this.f165629g1 = do80Var;
    }

    /* JADX INFO: renamed from: y */
    public void m185288y(boolean z) {
        yij0.m214964t(this.f165628g, z);
    }

    /* JADX INFO: renamed from: z */
    public void m185289z(boolean z) {
        yij0.m214964t(this.f165634j, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
