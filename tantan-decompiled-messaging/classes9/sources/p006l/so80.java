package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.filter.FilterVerificationUserMsgDlg;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.lsi0;
import l.o6j0;
import l.s7m;
import l.to80;
import l.vwb;
import l.xdl0;
import l.y19;
import l.yij0;
import l.zvf0;
import v.VFrame;
import v.VLinear;
import v.VProgressBar;
import v.VScroll;
import v.VSwitch;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class so80 implements s7m<do80> {

    /* JADX INFO: renamed from: A */
    public VText f21457A;

    /* JADX INFO: renamed from: B */
    public VText f21458B;

    /* JADX INFO: renamed from: C */
    public VSwitch f21459C;

    /* JADX INFO: renamed from: D */
    public VFrame f21460D;

    /* JADX INFO: renamed from: E */
    public VText f21461E;

    /* JADX INFO: renamed from: E0 */
    public VText f21462E0;

    /* JADX INFO: renamed from: F */
    public VText f21463F;

    /* JADX INFO: renamed from: F0 */
    public VSwitch f21464F0;

    /* JADX INFO: renamed from: G */
    public VSwitch f21465G;

    /* JADX INFO: renamed from: G0 */
    public VFrame f21466G0;

    /* JADX INFO: renamed from: H */
    public VFrame f21467H;

    /* JADX INFO: renamed from: H0 */
    public VText f21468H0;

    /* JADX INFO: renamed from: I */
    public VText f21469I;

    /* JADX INFO: renamed from: I0 */
    public VSwitch f21470I0;

    /* JADX INFO: renamed from: J */
    public VText f21471J;

    /* JADX INFO: renamed from: J0 */
    public LinearLayout f21472J0;

    /* JADX INFO: renamed from: K */
    public VSwitch f21473K;

    /* JADX INFO: renamed from: K0 */
    public ImageView f21474K0;

    /* JADX INFO: renamed from: L */
    public VFrame f21475L;

    /* JADX INFO: renamed from: L0 */
    public TextView f21476L0;

    /* JADX INFO: renamed from: M */
    public VText f21477M;

    /* JADX INFO: renamed from: M0 */
    public View f21478M0;

    /* JADX INFO: renamed from: N */
    public VText f21479N;

    /* JADX INFO: renamed from: N0 */
    public VText f21480N0;

    /* JADX INFO: renamed from: O */
    public VSwitch f21481O;

    /* JADX INFO: renamed from: O0 */
    public VLinear f21482O0;

    /* JADX INFO: renamed from: P */
    public VFrame f21483P;

    /* JADX INFO: renamed from: P0 */
    public VText f21484P0;

    /* JADX INFO: renamed from: Q */
    public VFrame f21485Q;

    /* JADX INFO: renamed from: Q0 */
    public VLinear f21486Q0;

    /* JADX INFO: renamed from: R */
    public VText f21487R;

    /* JADX INFO: renamed from: R0 */
    public VText f21488R0;

    /* JADX INFO: renamed from: S */
    public VFrame f21489S;

    /* JADX INFO: renamed from: S0 */
    public View f21490S0;

    /* JADX INFO: renamed from: T */
    public VSwitch f21491T;

    /* JADX INFO: renamed from: T0 */
    public VText f21492T0;

    /* JADX INFO: renamed from: U */
    public VFrame f21493U;

    /* JADX INFO: renamed from: U0 */
    public VLinear f21494U0;

    /* JADX INFO: renamed from: V */
    public VSwitch f21495V;

    /* JADX INFO: renamed from: V0 */
    public VText f21496V0;

    /* JADX INFO: renamed from: W */
    public VFrame f21497W;

    /* JADX INFO: renamed from: W0 */
    public VLinear f21498W0;

    /* JADX INFO: renamed from: X */
    public VFrame f21499X;

    /* JADX INFO: renamed from: X0 */
    public View f21500X0;

    /* JADX INFO: renamed from: Y */
    public VSwitch f21501Y;

    /* JADX INFO: renamed from: Y0 */
    public VText f21502Y0;

    /* JADX INFO: renamed from: Z */
    public VLinear f21503Z;

    /* JADX INFO: renamed from: Z0 */
    public VFrame f21504Z0;

    /* JADX INFO: renamed from: a */
    public VLinear f21505a;

    /* JADX INFO: renamed from: a1 */
    public VText f21506a1;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f21507b;

    /* JADX INFO: renamed from: b1 */
    public VFrame f21508b1;

    /* JADX INFO: renamed from: c */
    public VProgressBar f21509c;

    /* JADX INFO: renamed from: c1 */
    public VText f21510c1;

    /* JADX INFO: renamed from: d */
    public VScroll f21511d;

    /* JADX INFO: renamed from: d1 */
    public SettingGroups f21512d1;

    /* JADX INFO: renamed from: e */
    public VText f21513e;

    /* JADX INFO: renamed from: e1 */
    public User f21514e1;

    /* JADX INFO: renamed from: f */
    public LinearLayout f21515f;

    /* JADX INFO: renamed from: f1 */
    public Settings f21516f1;

    /* JADX INFO: renamed from: g */
    public VFrame f21517g;

    /* JADX INFO: renamed from: g1 */
    public do80 f21518g1;

    /* JADX INFO: renamed from: h */
    public VText f21519h;

    /* JADX INFO: renamed from: h1 */
    public Act f21520h1;

    /* JADX INFO: renamed from: i */
    public VSwitch f21521i;

    /* JADX INFO: renamed from: i1 */
    public boolean f21522i1;

    /* JADX INFO: renamed from: j */
    public VFrame f21523j;

    /* JADX INFO: renamed from: k */
    public VText f21524k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f21525k0;

    /* JADX INFO: renamed from: l */
    public VSwitch f21526l;

    /* JADX INFO: renamed from: m */
    public VFrame f21527m;

    /* JADX INFO: renamed from: n */
    public VText f21528n;

    /* JADX INFO: renamed from: o */
    public VSwitch f21529o;

    /* JADX INFO: renamed from: p */
    public VFrame f21530p;

    /* JADX INFO: renamed from: p0 */
    public VText f21531p0;

    /* JADX INFO: renamed from: q */
    public VText f21532q;

    /* JADX INFO: renamed from: r */
    public VSwitch f21533r;

    /* JADX INFO: renamed from: s */
    public VFrame f21534s;

    /* JADX INFO: renamed from: t */
    public VText f21535t;

    /* JADX INFO: renamed from: u */
    public VSwitch f21536u;

    /* JADX INFO: renamed from: v */
    public VFrame f21537v;

    /* JADX INFO: renamed from: w */
    public VText f21538w;

    /* JADX INFO: renamed from: x */
    public VText f21539x;

    /* JADX INFO: renamed from: y */
    public VSwitch f21540y;

    /* JADX INFO: renamed from: z */
    public VFrame f21541z;

    /* JADX INFO: renamed from: l.so80$a */
    public class ViewOnClickListenerC1274a implements View.OnClickListener {
        public ViewOnClickListenerC1274a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_paip_choose_avatar", "p_privacy_and_permission_settings_view", new j760[]{j760.a("switch_config_type", so80.this.f21516f1.aiPictureEnable().booleanValue() ? "0" : "1")});
            so80.this.f21518g1.m14148Y0(yij0.T(so80.this.f21537v));
        }
    }

    /* JADX INFO: renamed from: l.so80$b */
    public class ViewOnClickListenerC1275b implements View.OnClickListener {
        public ViewOnClickListenerC1275b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            so80.this.f21518g1.m14160l1();
            zvf0.u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760[]{new j760("push_switch_change", so80.this.f21516f1.getSettingGroup().privacy.onlineReminder.booleanValue() ? "off2on" : "on2off")});
        }
    }

    /* JADX INFO: renamed from: l.so80$c */
    public class ViewOnClickListenerC1276c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f21544a;

        public ViewOnClickListenerC1276c(boolean z) {
            this.f21544a = z;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            so80.this.f21518g1.m14147X0(!this.f21544a);
        }
    }

    /* JADX INFO: renamed from: l.so80$d */
    public class ViewOnClickListenerC1277d implements View.OnClickListener {
        public ViewOnClickListenerC1277d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
            if (!NullChecker.a(verificationCenterM3542k4) || !NullChecker.a(verificationCenterM3542k4.picVerificationInfo)) {
                FilterVerificationUserMsgDlg.K(so80.this.act(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
                return;
            }
            if (TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "verified")) {
                so80.this.f21518g1.m14151a1(yij0.T(so80.this.f21467H));
            } else if (TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "prePending")) {
                lsi0.y("认证审核中，审核成功后可更改设置");
            } else {
                FilterVerificationUserMsgDlg.K(so80.this.act(), FilterVerificationUserMsgDlg.FilterFrom.SETTING_PAGE);
            }
        }
    }

    public so80(Act act) {
        this.f21520h1 = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m23952H(View view) {
        this.f21518g1.m14159k1(yij0.u(this.f21517g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m23953J(View view) {
        this.f21518g1.m14152b1(yij0.T(this.f21534s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m23954K(View view) {
        m23995b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m23955L(View view) {
        this.f21518g1.m14161m1(yij0.T(this.f21493U));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m23956M(View view) {
        this.f21518g1.m14135F0();
        zvf0.r("e_personalized_recommendation_document", "p_privacy_and_permission_settings_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m23957N(View view) {
        this.f21518g1.m14131A0(yij0.T(this.f21482O0));
        o6j0.e("e_privacy_permission_settings_album", "p_privacy_and_permission_settings_view", new j760[]{j760.a("album_management_button_status", this.f21516f1.hidePublicMoment().booleanValue() ? "button_open" : "button_off")});
        lsi0.w(this.f21516f1.hidePublicMoment().booleanValue() ? R$string.f2372b5 : R$string.f2617j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m23958O(View view) {
        this.f21518g1.m14132C0(yij0.T(this.f21503Z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public void m23959Q(View view) {
        if (this.f21516f1.heartbeatDisable().booleanValue()) {
            this.f21518g1.m14158j1(false);
        }
    }

    /* JADX INFO: renamed from: X */
    private void m23960X() {
        Object obj;
        if (!this.f21522i1) {
            yij0.t(this.f21517g, this.f21516f1.hideContacts().booleanValue() && PermissionHelper.b(new String[]{"android.permission.READ_CONTACTS"}));
            this.f21517g.setOnClickListener(new View.OnClickListener() { // from class: l.lo80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16536a.m23952H(view);
                }
            });
        }
        yij0.t(this.f21523j, !this.f21516f1.hideMutualContacts().booleanValue());
        this.f21523j.setOnClickListener(new View.OnClickListener() { // from class: l.no80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17760a.m23984I(view);
            }
        });
        xdl0.M(this.f21534s, false);
        yij0.t(this.f21534s, !((Boolean) CoreModule.f1534c.f3547D0.f4118T.get()).booleanValue());
        this.f21534s.setOnClickListener(new View.OnClickListener() { // from class: l.oo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18300a.m23953J(view);
            }
        });
        xdl0.M(this.f21475L, false);
        yij0.t(this.f21475L, !this.f21516f1.heartbeatDisable().booleanValue());
        this.f21475L.setOnClickListener(new View.OnClickListener() { // from class: l.po80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19234a.m23959Q(view);
            }
        });
        xdl0.M(this.f21537v, false);
        yij0.t(this.f21537v, this.f21516f1.aiPictureEnable().booleanValue());
        zvf0.x("e_paip_choose_avatar", "p_privacy_and_permission_settings_view");
        xdl0.E0(this.f21537v, new ViewOnClickListenerC1274a());
        yij0.t(this.f21489S, this.f21516f1.personalizeSuggest().booleanValue());
        this.f21489S.setOnClickListener(new View.OnClickListener() { // from class: l.qo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19951a.m23954K(view);
            }
        });
        yij0.t(this.f21493U, this.f21516f1.personalizeAdsSuggest());
        this.f21493U.setOnClickListener(new View.OnClickListener() { // from class: l.ro80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20658a.m23955L(view);
            }
        });
        xdl0.E0(this.f21497W, new View.OnClickListener() { // from class: l.fo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12813a.m23956M(view);
            }
        });
        zvf0.x("e_personalized_recommend_button", "p_privacy_and_permission_settings_view");
        yij0.t(this.f21482O0, this.f21516f1.hidePublicMoment().booleanValue());
        this.f21482O0.setOnClickListener(new View.OnClickListener() { // from class: l.go80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13417a.m23957N(view);
            }
        });
        yij0.t(this.f21503Z, this.f21516f1.hideSchoolName());
        this.f21503Z.setOnClickListener(new View.OnClickListener() { // from class: l.ho80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13986a.m23958O(view);
            }
        });
        xdl0.M(this.f21499X, false);
        if (CoreModule.m1853N().Vg()) {
            xdl0.M(this.f21508b1, this.f21518g1.m14134E0());
            yij0.t(this.f21508b1, this.f21516f1.hideAutoLike().booleanValue());
            this.f21508b1.setOnClickListener(new View.OnClickListener() { // from class: l.io80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14585a.m23982F(view);
                }
            });
        }
        if (upa.m25539x3() && NullChecker.a(this.f21514e1) && this.f21514e1.isFemale()) {
            xdl0.M(this.f21466G0, true);
            if (NullChecker.a(this.f21514e1.settings) && !vwb.J(this.f21514e1.settings.settingGroups) && NullChecker.a(((SettingGroups) this.f21514e1.settings.settingGroups.get(0)).privacy)) {
                Boolean bool = ((SettingGroups) this.f21514e1.settings.settingGroups.get(0)).privacy.onlineReminder;
                m23977A(bool.booleanValue());
                if (!bool.booleanValue()) {
                    obj = "close";
                }
                xdl0.E0(this.f21466G0, new ViewOnClickListenerC1275b());
                zvf0.A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760[]{new j760("switch_type", obj)});
            } else {
                m23977A(true);
            }
            obj = "open";
            xdl0.E0(this.f21466G0, new ViewOnClickListenerC1275b());
            zvf0.A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760[]{new j760("switch_type", obj)});
        }
        if (!y19.f() || this.f21514e1.isFemale()) {
            xdl0.M(this.f21527m, false);
        } else {
            xdl0.M(this.f21527m, true);
            final boolean zBooleanValue = this.f21516f1.unrepliedReminder().booleanValue();
            yij0.t(this.f21527m, this.f21516f1.unrepliedReminder().booleanValue());
            xdl0.E0(this.f21527m, new View.OnClickListener() { // from class: l.mo80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17150a.m23983G(zBooleanValue, view);
                }
            });
            zvf0.A("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760[]{new j760("gender", "male"), new j760("switch_type", zBooleanValue ? "open" : "close")});
        }
        m23994a0();
        xdl0.M(this.f21541z, false);
        xdl0.M(this.f21460D, false);
        boolean z = (!upa.m25443e2() || this.f21516f1.getSettingGroup() == null || this.f21516f1.getSettingGroup().marriage == null) ? false : true;
        VText vText = this.f21492T0;
        if (z) {
            xdl0.M(vText, true);
            xdl0.M(this.f21500X0, true);
        } else {
            xdl0.M(vText, false);
            xdl0.M(this.f21500X0, false);
        }
        VLinear vLinear = this.f21494U0;
        if (z) {
            xdl0.M(vLinear, true);
            boolean z2 = this.f21516f1.getSettingGroup().marriage.closeMode;
            yij0.t(this.f21494U0, !z2);
            xdl0.E0(this.f21494U0, new ViewOnClickListenerC1276c(z2));
        } else {
            xdl0.M(vLinear, false);
        }
        xdl0.M(this.f21498W0, false);
    }

    /* JADX INFO: renamed from: A */
    public void m23977A(boolean z) {
        yij0.t(this.f21466G0, z);
    }

    /* JADX INFO: renamed from: B */
    public boolean m23978B() {
        return xdl0.O0(this.f21503Z);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m23979C(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23980C0() {
        return this.f21520h1;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m23981E(View view) {
        this.f21518g1.m14153c1();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m23982F(View view) {
        this.f21518g1.m14164z0(yij0.T(this.f21508b1));
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m23983G(boolean z, View view) {
        zvf0.u("e_friend_active_remind", "p_privacy_and_permission_settings_view", new j760[]{new j760("gender", "male"), new j760("push_switch_change", z ? "on2off" : "off2on")});
        this.f21518g1.m14163o1(yij0.T(this.f21527m));
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m23984I(View view) {
        this.f21518g1.m14154d1(yij0.u(this.f21523j));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m23985P(View view) {
        this.f21518g1.m14133D0(yij0.T(this.f21525k0));
    }

    /* JADX INFO: renamed from: R */
    public void m23986R(String str) {
        if (TextUtils.equals(str, "other_setting")) {
            this.f21522i1 = true;
            this.f21507b.setTitle("其他设置");
            this.f21513e.setText("常规");
            xdl0.M(this.f21517g, false);
        } else {
            boolean zM25322D2 = upa.m25322D2();
            VNavigationBar vNavigationBar = this.f21507b;
            if (zM25322D2) {
                vNavigationBar.setTitle("隐私设置");
            } else {
                vNavigationBar.setTitle(R$string.f2239Wn);
            }
        }
        this.f21507b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.eo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11300a.m23979C(view);
            }
        });
        xdl0.M(this.f21489S, true);
        xdl0.M(this.f21493U, false);
        xdl0.M(this.f21497W, false);
        xdl0.M(this.f21486Q0, false);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (TEnum.equals(userM21490p9.source, "facebook") || TEnum.equals(userM21490p9.source, "google")) {
            xdl0.M(this.f21517g, false);
            xdl0.M(this.f21523j, false);
            xdl0.M(this.f21503Z, false);
        }
        boolean z = userM21490p9.profile.studies.verified;
        VLinear vLinear = this.f21503Z;
        if (z) {
            vLinear.setVisibility(0);
        } else {
            vLinear.setVisibility(8);
        }
        this.f21504Z0.setOnClickListener(new View.OnClickListener() { // from class: l.jo80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15289a.m23981E(view);
            }
        });
        SettingGroups settingGroups = (SettingGroups) CoreModule.f1534c.f3628e0.f18865R.get();
        this.f21512d1 = settingGroups;
        m23992Y(settingGroups);
        xdl0.M(this.f21483P, false);
        xdl0.M(this.f21485Q, false);
        if (upa.m25322D2()) {
            this.f21487R.setText("接收聊天室邀请");
        }
        xdl0.M(this.f21490S0, false);
        xdl0.M(this.f21504Z0, false);
        xdl0.M(this.f21502Y0, false);
    }

    /* JADX INFO: renamed from: S */
    public void m23987S(Throwable th) {
        this.f21520h1.progressDismiss();
        this.f21512d1.fake.syncMoment = Boolean.valueOf(yij0.T(this.f21486Q0));
        this.f21512d1.privacy.hideVIP = Boolean.valueOf(yij0.T(this.f21525k0));
    }

    /* JADX INFO: renamed from: T */
    public void m23988T() {
        this.f21511d.setVisibility(4);
        this.f21509c.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public void m23989U(Throwable th) {
        this.f21520h1.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: V */
    public void m23990V() {
        this.f21520h1.progressDismiss();
        m23960X();
    }

    /* JADX INFO: renamed from: W */
    public void m23991W(String str, boolean z) {
        this.f21520h1.progress(str, z);
    }

    /* JADX INFO: renamed from: Y */
    public void m23992Y(SettingGroups settingGroups) {
        this.f21520h1.progressDismiss();
        xdl0.M0(this.f21525k0, true);
        if (CoreModule.f1534c.f3628e0.m21490p9().isVIP() || CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
            yij0.t(this.f21525k0, settingGroups.privacy.hideVIP.booleanValue());
            if (CoreModule.f1534c.f3628e0.m21490p9().isSVIP()) {
                this.f21462E0.setText(this.f21520h1.getString(R$string.f2677l3));
            }
            this.f21525k0.setOnClickListener(new View.OnClickListener() { // from class: l.ko80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15923a.m23985P(view);
                }
            });
            return;
        }
        yij0.t(this.f21525k0, false);
        this.f21531p0.setTextColor(act().getResources().getColor(w0c0.f24726s1));
        this.f21525k0.setClickable(false);
        this.f21525k0.setFocusable(false);
        this.f21464F0.setClickable(false);
    }

    /* JADX INFO: renamed from: Z */
    public void m23993Z(User user, Settings settings) {
        if (this.f21511d.getVisibility() == 4) {
            this.f21511d.setVisibility(0);
            this.f21509c.setVisibility(4);
        }
        this.f21514e1 = user;
        this.f21516f1 = settings;
        m23960X();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m23994a0() {
        if (y19.T()) {
            xdl0.M(this.f21467H, true);
            yij0.t(this.f21467H, this.f21516f1.justReceiveVeriUserMsg().booleanValue() && CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified());
            xdl0.E0(this.f21467H, new ViewOnClickListenerC1277d());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m23995b0() {
        this.f21518g1.m14162n1(yij0.T(this.f21489S));
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m23996c0() {
        return yij0.T(this.f21517g);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m23997d0() {
        return yij0.T(this.f21523j);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23999v(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: v */
    public View m23999v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return to80.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: w */
    public void m24000w() {
        xdl0.M(this.f21504Z0, true);
        xdl0.M(this.f21502Y0, true);
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m23998i1(do80 do80Var) {
        this.f21518g1 = do80Var;
    }

    /* JADX INFO: renamed from: y */
    public void m24002y(boolean z) {
        yij0.t(this.f21517g, z);
    }

    /* JADX INFO: renamed from: z */
    public void m24003z(boolean z) {
        yij0.t(this.f21523j, z);
    }

    public void destroy() {
    }
}
