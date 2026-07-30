package com.p000p1.mobile.putong.core.p004ui.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.SettingsFilterItemWithInfo;
import com.p000p1.mobile.putong.core.p004ui.settings.relationshiplooking.RelationshipLookingAct;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.VipNewUtils;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.AdvancedSettings;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.ui.account.SwitchAccountAct;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.core.ui.helpcenter.HelpCenterFrag;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.eqh0;
import l.f30;
import l.f9k0;
import l.hpd0;
import l.hvc0;
import l.i0e;
import l.j760;
import l.jtk;
import l.mkd0;
import l.mqa;
import l.ptk;
import l.qqh0;
import l.s7m;
import l.sre0;
import l.t100;
import l.u4e;
import l.uq40;
import l.vwb;
import l.wvv;
import l.xdl0;
import l.yij0;
import l.zvf0;
import p006l.ca40;
import p006l.f6c0;
import p006l.g6a;
import p006l.nkp;
import p006l.qne0;
import p006l.tre0;
import p006l.u4c0;
import p006l.u59;
import p006l.uld0;
import p006l.upa;
import p006l.vdj;
import p006l.vy8;
import p006l.x2c0;
import p006l.xma;
import v.VButton_FakeShadowSmall;
import v.VCheckBox;
import v.VFrame;
import v.VLinear;
import v.VLinear_FakeShadow;
import v.VProgressBar;
import v.VRangeSeekBar;
import v.VScroll;
import v.VSwitch;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0285b implements s7m<C0284a>, com.p1.mobile.android.app.a.a {

    /* JADX INFO: renamed from: k2 */
    public static hpd0 f5680k2;

    /* JADX INFO: renamed from: l2 */
    public static hpd0 f5681l2;

    /* JADX INFO: renamed from: m2 */
    public static hpd0 f5682m2;

    /* JADX INFO: renamed from: n2 */
    public static hpd0 f5683n2;

    /* JADX INFO: renamed from: o2 */
    public static final int f5684o2;

    /* JADX INFO: renamed from: A */
    public VText f5685A;

    /* JADX INFO: renamed from: A1 */
    public SettingsItem f5686A1;

    /* JADX INFO: renamed from: B */
    public VFrame f5687B;

    /* JADX INFO: renamed from: B1 */
    public SettingsItem f5688B1;

    /* JADX INFO: renamed from: C */
    public VText f5689C;

    /* JADX INFO: renamed from: C1 */
    public SettingsItem f5690C1;

    /* JADX INFO: renamed from: D */
    public VText f5691D;

    /* JADX INFO: renamed from: D1 */
    public SettingsItem f5692D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f5693E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f5694E0;

    /* JADX INFO: renamed from: E1 */
    public LinearLayout f5695E1;

    /* JADX INFO: renamed from: F */
    public VText f5696F;

    /* JADX INFO: renamed from: F0 */
    public VText f5697F0;

    /* JADX INFO: renamed from: F1 */
    public SettingsItem f5698F1;

    /* JADX INFO: renamed from: G */
    public AgeRangeSeekBar f5699G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f5700G0;

    /* JADX INFO: renamed from: G1 */
    public SettingsItem f5701G1;

    /* JADX INFO: renamed from: H */
    public VText f5702H;

    /* JADX INFO: renamed from: H0 */
    public SettingsItem f5703H0;

    /* JADX INFO: renamed from: H1 */
    public SettingsItem f5704H1;

    /* JADX INFO: renamed from: I */
    public LinearLayout f5705I;

    /* JADX INFO: renamed from: I0 */
    public View f5706I0;

    /* JADX INFO: renamed from: I1 */
    public SettingsItem f5707I1;

    /* JADX INFO: renamed from: J */
    public FrameLayout f5708J;

    /* JADX INFO: renamed from: J0 */
    public VText f5709J0;

    /* JADX INFO: renamed from: J1 */
    public LinearLayout f5710J1;

    /* JADX INFO: renamed from: K */
    public VText f5711K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f5712K0;

    /* JADX INFO: renamed from: K1 */
    public MyTabAbSettingsItem f5713K1;

    /* JADX INFO: renamed from: L */
    public LinearLayout f5714L;

    /* JADX INFO: renamed from: L0 */
    public VText f5715L0;

    /* JADX INFO: renamed from: L1 */
    public MyTabAbSettingsItem f5716L1;

    /* JADX INFO: renamed from: M */
    public SeekBar f5717M;

    /* JADX INFO: renamed from: M0 */
    public VText f5718M0;

    /* JADX INFO: renamed from: M1 */
    public MyTabAbSettingsItem f5719M1;

    /* JADX INFO: renamed from: N */
    public VFrame f5720N;

    /* JADX INFO: renamed from: N0 */
    public VText f5721N0;

    /* JADX INFO: renamed from: N1 */
    public MyTabAbSettingsItem f5722N1;

    /* JADX INFO: renamed from: O */
    public VFrame f5723O;

    /* JADX INFO: renamed from: O0 */
    public VText f5724O0;

    /* JADX INFO: renamed from: O1 */
    public VButton_FakeShadowSmall f5725O1;

    /* JADX INFO: renamed from: P */
    public VText f5726P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f5727P0;

    /* JADX INFO: renamed from: P1 */
    public VLinear_FakeShadow f5728P1;

    /* JADX INFO: renamed from: Q */
    public FrameLayout f5729Q;

    /* JADX INFO: renamed from: Q0 */
    public View f5730Q0;

    /* JADX INFO: renamed from: Q1 */
    public TextView f5731Q1;

    /* JADX INFO: renamed from: R */
    public VText f5732R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f5733R0;

    /* JADX INFO: renamed from: R1 */
    public View f5734R1;

    /* JADX INFO: renamed from: S */
    public LinearLayout f5735S;

    /* JADX INFO: renamed from: S0 */
    public TextView f5736S0;

    /* JADX INFO: renamed from: S1 */
    public VButton_FakeShadowSmall f5737S1;

    /* JADX INFO: renamed from: T */
    public AgeRangeSeekBar f5738T;

    /* JADX INFO: renamed from: T0 */
    public VText f5739T0;

    /* JADX INFO: renamed from: T1 */
    public VText f5740T1;

    /* JADX INFO: renamed from: U */
    public VFrame f5741U;

    /* JADX INFO: renamed from: U0 */
    public LinearLayout f5742U0;

    /* JADX INFO: renamed from: U1 */
    public VText f5743U1;

    /* JADX INFO: renamed from: V */
    public VText f5744V;

    /* JADX INFO: renamed from: V0 */
    public VFrame f5745V0;

    /* JADX INFO: renamed from: V1 */
    public View f5746V1;

    /* JADX INFO: renamed from: W */
    public VText f5747W;

    /* JADX INFO: renamed from: W0 */
    public VText f5748W0;

    /* JADX INFO: renamed from: W1 */
    public VText f5749W1;

    /* JADX INFO: renamed from: X */
    public SettingsFilterItemWithInfo f5750X;

    /* JADX INFO: renamed from: X0 */
    public SeekBar f5751X0;

    /* JADX INFO: renamed from: X1 */
    public SeekBar f5752X1;

    /* JADX INFO: renamed from: Y */
    public VFrame f5753Y;

    /* JADX INFO: renamed from: Y0 */
    public SettingsItem f5754Y0;

    /* JADX INFO: renamed from: Y1 */
    public VFrame f5755Y1;

    /* JADX INFO: renamed from: Z */
    public VSwitch f5756Z;

    /* JADX INFO: renamed from: Z0 */
    public SettingsItem f5757Z0;

    /* JADX INFO: renamed from: Z1 */
    public VFrame f5758Z1;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f5759a;

    /* JADX INFO: renamed from: a1 */
    public SettingsItem f5760a1;

    /* JADX INFO: renamed from: a2 */
    public VText f5761a2;

    /* JADX INFO: renamed from: b */
    public VProgressBar f5762b;

    /* JADX INFO: renamed from: b1 */
    public SettingsItem f5763b1;

    /* JADX INFO: renamed from: b2 */
    public VText f5764b2;

    /* JADX INFO: renamed from: c */
    public VScroll f5765c;

    /* JADX INFO: renamed from: c1 */
    public SettingsItem f5766c1;

    /* JADX INFO: renamed from: c2 */
    public AgeRangeSeekBar f5767c2;

    /* JADX INFO: renamed from: d */
    public LinearLayout f5768d;

    /* JADX INFO: renamed from: d1 */
    public SettingsItem f5769d1;

    /* JADX INFO: renamed from: d2 */
    public C0284a f5770d2;

    /* JADX INFO: renamed from: e */
    public FrameLayout f5771e;

    /* JADX INFO: renamed from: e1 */
    public VLinear f5772e1;

    /* JADX INFO: renamed from: f */
    public VText f5774f;

    /* JADX INFO: renamed from: f1 */
    public SettingsItem f5775f1;

    /* JADX INFO: renamed from: f2 */
    public PutongFrag f5776f2;

    /* JADX INFO: renamed from: g */
    public View f5777g;

    /* JADX INFO: renamed from: g1 */
    public View f5778g1;

    /* JADX INFO: renamed from: h */
    public VText f5780h;

    /* JADX INFO: renamed from: h1 */
    public LinearLayout f5781h1;

    /* JADX INFO: renamed from: i */
    public VFrame f5783i;

    /* JADX INFO: renamed from: i1 */
    public SeekBar f5784i1;

    /* JADX INFO: renamed from: j */
    public VText f5786j;

    /* JADX INFO: renamed from: j1 */
    public VText f5787j1;

    /* JADX INFO: renamed from: k */
    public VText f5789k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f5790k0;

    /* JADX INFO: renamed from: k1 */
    public VFrame f5791k1;

    /* JADX INFO: renamed from: l */
    public VText f5792l;

    /* JADX INFO: renamed from: l1 */
    public VFrame f5793l1;

    /* JADX INFO: renamed from: m */
    public LinearLayout f5794m;

    /* JADX INFO: renamed from: m1 */
    public VText f5795m1;

    /* JADX INFO: renamed from: n */
    public VText f5796n;

    /* JADX INFO: renamed from: n1 */
    public AgeRangeSeekBar f5797n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f5798o;

    /* JADX INFO: renamed from: o1 */
    public VText f5799o1;

    /* JADX INFO: renamed from: p */
    public VFrame f5800p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f5801p0;

    /* JADX INFO: renamed from: p1 */
    public View f5802p1;

    /* JADX INFO: renamed from: q */
    public VText f5803q;

    /* JADX INFO: renamed from: q1 */
    public SettingsItem f5804q1;

    /* JADX INFO: renamed from: r */
    public LinearLayout f5805r;

    /* JADX INFO: renamed from: r1 */
    public SettingsItem f5806r1;

    /* JADX INFO: renamed from: s */
    public VText f5807s;

    /* JADX INFO: renamed from: s1 */
    public SettingsItem f5808s1;

    /* JADX INFO: renamed from: t */
    public SeekBar f5809t;

    /* JADX INFO: renamed from: t1 */
    public SettingsItem f5810t1;

    /* JADX INFO: renamed from: u */
    public VText f5811u;

    /* JADX INFO: renamed from: u1 */
    public SettingsItem f5812u1;

    /* JADX INFO: renamed from: v */
    public VFrame f5813v;

    /* JADX INFO: renamed from: v1 */
    public SettingsItem f5814v1;

    /* JADX INFO: renamed from: w */
    public VFrame f5815w;

    /* JADX INFO: renamed from: w1 */
    public SettingsItem f5816w1;

    /* JADX INFO: renamed from: x */
    public VText f5817x;

    /* JADX INFO: renamed from: x1 */
    public SettingsItem f5818x1;

    /* JADX INFO: renamed from: y */
    public SeekBar f5819y;

    /* JADX INFO: renamed from: y1 */
    public SettingsItem f5820y1;

    /* JADX INFO: renamed from: z */
    public VFrame f5821z;

    /* JADX INFO: renamed from: z1 */
    public SettingsItem f5822z1;

    /* JADX INFO: renamed from: e2 */
    public final hpd0 f5773e2 = new hpd0("notificationDotClicked" + CoreModule.m1850H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g2 */
    public String f5779g2 = null;

    /* JADX INFO: renamed from: h2 */
    public String f5782h2 = null;

    /* JADX INFO: renamed from: i2 */
    public boolean f5785i2 = false;

    /* JADX INFO: renamed from: j2 */
    public ca40 f5788j2 = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_share_tantan_new_ui_button", C0285b.this.f5776f2.pageId(), new j760[]{vwb.Y("share_to", "system")});
            CoreDlg.D1(C0285b.this.act(), "menu", vwb.f0(new LinkChannel[]{LinkChannel.get("unknown")}));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$b */
    public class b implements com.p1.mobile.android.app.a.a {
        public b() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m8731a(int i, int i2, Intent intent) {
            if (i != 12 || !NullChecker.a(intent) || i2 != -1) {
                return false;
            }
            C0285b.this.m8665E1(intent.getStringExtra("key_intl_friend_purpose"));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$c */
    public class c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f5825a;

        public c(Runnable runnable) {
            this.f5825a = runnable;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C0285b.this.f5770d2.m8542V3(i);
            this.f5825a.run();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C0285b.this.f5770d2.m8593x3();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f5680k2 = new hpd0("SWITCH_ACCOUNT_CLICKED", bool);
        f5681l2 = new hpd0("SHARE_DOT_CLICKED" + CoreModule.m1850H().userId(), bool);
        f5682m2 = new hpd0("ONLY_NOTIFY_CLICKED" + CoreModule.m1850H().userId(), bool);
        f5683n2 = new hpd0("NOTICE_DOT_CLICKED" + CoreModule.m1850H().userId(), bool);
        f5684o2 = t100.d(50.0f);
    }

    public C0285b(PutongFrag putongFrag) {
        this.f5776f2 = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m8610G0(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m8612H0() {
        int width = this.f5786j.getWidth();
        xdl0.V(this.f5789k, width);
        xdl0.V(this.f5792l, width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m8614I0(View view) {
        zvf0.r("e_intl_ai_translate", "p_settings_view");
        act().startActivity(AITranslateSettingAct.m8365Y1(act()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m8616J0(View view) {
        this.f5770d2.m8492B3(this.f5790k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m8618K0(View view) {
        zvf0.r("e_setting_page_hide_active_time_button", "p_settings_view");
        this.f5770d2.m8564f3(yij0.T(this.f5775f1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m8620L0(View view) {
        this.f5770d2.m8587t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m8623N0(View view) {
        this.f5770d2.m8564f3(yij0.T(this.f5754Y0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m8626P0(View view) {
        this.f5770d2.m8581p3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m8628Q0(View view) {
        if (xdl0.O0(this.f5810t1.f5639e)) {
            f5682m2.put(Boolean.TRUE);
            this.f5810t1.m8409c(false);
        }
        boolean z = NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed;
        zvf0.u("e_push_settings", "p_settings_view", new j760[]{vwb.Y("push_status", z ? "off" : "on")});
        if (!z) {
            this.f5770d2.m8578n3();
        } else {
            uq40.A();
            act().duringCreated(CoreModule.f1534c.f3628e0.m21372K9("allPushEnable", true, 0, 0)).subscribe(mkd0.L(mkd0.B()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m8630R0(View view) {
        zvf0.r("e_chat_settings", "p_settings_view");
        this.f5770d2.m8562e3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m8632S0(View view) {
        if (vy8.m26018i()) {
            f5683n2.put(Boolean.TRUE);
        }
        if (vy8.m26018i()) {
            this.f5814v1.m8409c(false);
        }
        this.f5770d2.m8560d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m8634T0(View view) {
        this.f5770d2.m8576m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m8636U0(View view) {
        f5681l2.put(Boolean.TRUE);
        this.f5820y1.m8409c(false);
        this.f5770d2.m8579o3();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m8657A0(Boolean bool, Boolean bool2) {
        xdl0.M(this.f5790k0, bool.booleanValue());
        yij0.t(this.f5790k0, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: A1 */
    public void m8658A1() {
        yij0.T(this.f5703H0);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m8659B0(VCheckBox vCheckBox) {
        boolean zIsChecked = vCheckBox.isChecked();
        zvf0.u("e_sign_out_botton", m8682a1(), new j760[]{vwb.Y("if_save_login_info", zIsChecked ? "yes" : "no")});
        this.f5770d2.m8533S3(zIsChecked);
    }

    /* JADX INFO: renamed from: B1 */
    public void m8660B1() {
        if (NullChecker.a(this.f5698F1) && xdl0.O0(this.f5698F1.f5639e)) {
            zvf0.s("e_red_dot_me_settings_help", "p_settings_view", u4e.c("red_dot", "red_dot_normal", "help_and_feedback_tab", "setting_page", "tips"));
        } else {
            zvf0.s("e_red_dot_me_settings_help", "p_settings_view", u4e.d());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8661C0() {
        return this.f5776f2.act();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m8662C1() {
        if (xdl0.O0(this.f5734R1)) {
            return;
        }
        zvf0.s("e_red_dot_me_settings_help", "p_settings_view", u4e.d());
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8663D0(View view) {
        final VCheckBox vCheckBoxInflate = act().inflater().inflate(f6c0.f12235i2, (ViewGroup) null);
        vCheckBoxInflate.setText(R$string.f2758nm);
        vCheckBoxInflate.setTextColor(-6710887);
        vCheckBoxInflate.setChecked(true);
        int iD = t100.d(20.0f);
        zvf0.A("e_sign_out_botton", m8682a1(), new j760[]{vwb.Y("if_save_login_info", vCheckBoxInflate.isChecked() ? "yes" : "no")});
        act().dialog().E0(R$string.f2820pm).H0(-14606047).D(R$string.f2789om).G(-6710887).P(vCheckBoxInflate, false).C(iD, 0, iD, 0).k0(R$string.f2397c).t0(R$string.f2727mm, new Runnable() { // from class: l.dre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10541a.m8659B0(vCheckBoxInflate);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m8664E0(boolean z, View view) {
        m8662C1();
        if (!z) {
            f5680k2.put(Boolean.TRUE);
        }
        this.f5734R1.setVisibility(8);
        act().startActivity(SwitchAccountAct.V1(act(), (String) null));
    }

    /* JADX INFO: renamed from: E1 */
    public final void m8665E1(String str) {
        if (TextUtils.isEmpty(str)) {
            m8667G1(null);
            return;
        }
        for (ca40 ca40Var : qne0.f19942i) {
            if (TextUtils.equals(str, ca40Var.f9555d)) {
                m8667G1(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m8666F1(boolean z) {
        if (NullChecker.a(this.f5806r1)) {
            this.f5806r1.setSubTitleText(hvc0.c(z ? R$string.f2269Xn : R$string.f2299Yn));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m8667G1(ca40 ca40Var) {
        this.f5788j2 = ca40Var;
        VText vText = this.f5747W;
        if (ca40Var != null) {
            vText.setText(ca40Var.f9553b);
        } else {
            vText.setText("");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m8668M0(View view) {
        Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", HelpCenterFrag.class.getSimpleName());
        act().startActivity(intent);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ boolean m8669O0(View view) {
        this.f5743U1.setVisibility(0);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public View m8670V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sre0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m8671V0() {
        this.f5765c.fullScroll(130);
    }

    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void m8696i1(C0284a c0284a) {
        this.f5770d2 = c0284a;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m8673W0(String str) {
        this.f5783i.performClick();
    }

    /* JADX INFO: renamed from: X */
    public void m8674X() {
        yij0.T(this.f5769d1);
        this.f5770d2.m8553a2(yij0.u(this.f5769d1));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m8675X0(String str) {
        this.f5782h2 = null;
    }

    /* JADX INFO: renamed from: Y */
    public void m8676Y() {
        yij0.T(this.f5766c1);
        this.f5770d2.m8513L1(yij0.u(this.f5766c1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m8677Y0() {
    }

    /* JADX INFO: renamed from: Z */
    public void m8678Z() {
        yij0.T(this.f5763b1);
        this.f5770d2.m8547Y1(yij0.u(this.f5763b1));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m8679Z0(Throwable th) {
        yij0.T(this.f5775f1);
        yij0.T(this.f5754Y0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m8680a(int i, int i2, Intent intent) {
        if (intent == null || i != 18) {
            return false;
        }
        SettingGroups serializableExtra = intent.getSerializableExtra("result_data");
        if (!(serializableExtra instanceof SettingGroups)) {
            return true;
        }
        this.f5770d2.m8545X1(serializableExtra);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m8681a0() {
        yij0.T(this.f5760a1);
        this.f5770d2.m8550Z1(yij0.u(this.f5760a1));
    }

    /* JADX INFO: renamed from: a1 */
    public String m8682a1() {
        return this.f5776f2.pageId();
    }

    @Nullable
    public Act act() {
        return this.f5776f2.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m8683b0() {
        if (!yij0.u(this.f5757Z0)) {
            CoreDlg.a2(act(), new Runnable() { // from class: l.kre0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15973a.m8709p0();
                }
            });
        } else {
            yij0.T(this.f5757Z0);
            this.f5770d2.m8530R3(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m8684c0() {
        if (NullChecker.a(this.f5776f2.getArguments())) {
            return this.f5776f2.getArguments().getBoolean("autoSearch", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public String m8685d0() {
        return NullChecker.a(this.f5776f2.getArguments()) ? this.f5776f2.getArguments().getString("gender", "") : "";
    }

    /* JADX INFO: renamed from: d1 */
    public void m8686d1() {
        if (((Boolean) f5682m2.get()).booleanValue() || NotificationCheckerCommon.a() != NotificationCheckerCommon.State.closed) {
            this.f5810t1.m8409c(false);
        } else {
            this.f5810t1.m8409c(true);
        }
        NotificationCheckerCommon.State stateA = NotificationCheckerCommon.a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        SettingsItem settingsItem = this.f5810t1;
        if (stateA == state) {
            settingsItem.setSubTitleText("当前无法接收新消息通知");
        } else {
            settingsItem.setSubTitleText("设置接收的消息类型和内容");
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public int m8687e0() {
        if (NullChecker.a(this.f5776f2.getArguments())) {
            return this.f5776f2.getArguments().getInt("maxAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e1 */
    public void m8688e1(boolean z, int i) {
        this.f5698F1.f5639e.setBackgroundResource(i);
        m8712q1(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f0 */
    public int m8689f0() {
        if (NullChecker.a(this.f5776f2.getArguments())) {
            return this.f5776f2.getArguments().getInt("minAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f1 */
    public void m8690f1(boolean z) {
        yij0.t(this.f5775f1, z);
        yij0.t(this.f5754Y0, z);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m8691g0() {
        if (NullChecker.a(this.f5776f2.getArguments())) {
            return this.f5776f2.getArguments().getBoolean("scroll_to_bottom", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: g1 */
    public void m8692g1(String str) {
        this.f5761a2.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public int m8693h0() {
        if (NullChecker.a(this.f5776f2.getArguments())) {
            return this.f5776f2.getArguments().getInt("searchRadius", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public void m8694h1(boolean z) {
        View view = this.f5777g;
        if (z) {
            view.setVisibility(0);
            this.f5771e.setVisibility(0);
        } else {
            view.setVisibility(8);
            this.f5771e.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8695i0() {
        boolean zIsBlackDiamondVIP = CoreModule.f1534c.f3628e0.m21490p9().isBlackDiamondVIP();
        VLinear vLinear = this.f5700G0;
        if (!zIsBlackDiamondVIP) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        yij0.t(this.f5703H0, true ^ CoreModule.f1534c.f3628e0.m21490p9().hideBlackDiamondTag());
        xdl0.E0(this.f5703H0, new View.OnClickListener() { // from class: l.gre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13461a.m8711q0(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8670V(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8697j0() {
        xdl0.M(this.f5706I0, true);
        xdl0.M(this.f5783i, false);
        xdl0.M(this.f5709J0, true);
        VFrame vFrame = this.f5712K0;
        this.f5783i = vFrame;
        xdl0.M(vFrame, true);
        this.f5786j = this.f5715L0;
        this.f5789k = this.f5718M0;
        this.f5792l = this.f5721N0;
        this.f5794m = null;
        this.f5796n = this.f5724O0;
        xdl0.M0(this.f5815w, false);
        xdl0.M0(this.f5819y, false);
        xdl0.M(this.f5742U0, true);
        this.f5815w = this.f5745V0;
        this.f5817x = this.f5748W0;
        this.f5819y = this.f5751X0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m8698j1() {
        e51.G(new Runnable() { // from class: l.fre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12875a.m8671V0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m8699k0() {
        int iM8510J3;
        if (nkp.m20155a() || !IntlCountryCodeController.m14o()) {
            xdl0.E0(this.f5783i, this.f5770d2.m8574l3());
            this.f5770d2.m8557c2();
        } else {
            this.f5783i.setVisibility(8);
        }
        xdl0.E0(this.f5758Z1, this.f5770d2.m8591w3());
        this.f5770d2.m8521O3();
        Runnable runnable = new Runnable() { // from class: l.qqe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f19980a.m8716s0();
            }
        };
        runnable.run();
        boolean zM5f = IntlCountryCodeController.m5f();
        SeekBar seekBar = this.f5752X1;
        if (zM5f) {
            seekBar.setMax(60);
            iM8510J3 = this.f5770d2.m8507I3();
        } else {
            seekBar.setMax(this.f5770d2.m8508J1());
            iM8510J3 = this.f5770d2.m8510J3();
            if (iM8510J3 == this.f5752X1.getProgress()) {
                this.f5752X1.setProgress(iM8510J3 + 1);
            }
        }
        this.f5752X1.setProgress(iM8510J3);
        this.f5752X1.setOnSeekBarChangeListener(new c(runnable));
        yij0.t(this.f5755Y1, this.f5770d2.m8499F1());
        this.f5755Y1.setOnClickListener(new View.OnClickListener() { // from class: l.rqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20680a.m8718t0(view);
            }
        });
        final Runnable runnable2 = new Runnable() { // from class: l.tqe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22238a.m8720u0();
            }
        };
        runnable2.run();
        this.f5767c2.e(Integer.valueOf(this.f5770d2.m8525Q1()), Integer.valueOf(this.f5770d2.m8522P1()));
        this.f5767c2.setSelectedMinValue(Integer.valueOf(this.f5770d2.m8531S1()));
        this.f5767c2.setSelectedMaxValue(Integer.valueOf(this.f5770d2.m8528R1()));
        this.f5767c2.setNotifyWhileDragging(true);
        this.f5767c2.setOnRangeSeekBarChangeListener(new VRangeSeekBar.b() { // from class: l.uqe0
            /* JADX INFO: renamed from: a */
            public final void m25550a(VRangeSeekBar vRangeSeekBar, Object obj, Object obj2, boolean z) {
                this.f23709a.m8722v0(runnable2, vRangeSeekBar, (Integer) obj, (Integer) obj2, z);
            }
        });
        if (this.f5770d2.m8540V1() == null) {
            xdl0.M(this.f5801p0, false);
        } else {
            this.f5697F0.setText(this.f5770d2.m8540V1());
            xdl0.E0(this.f5694E0, new View.OnClickListener() { // from class: l.vqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24419a.m8726x0(view);
                }
            });
        }
        m8705n0();
    }

    /* JADX INFO: renamed from: k1 */
    public void m8700k1(String str) {
        this.f5804q1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m8701l0() {
        zvf0.x("e_intl_show_verified_switch", "p_settings_view");
        uld0.m25255e().m25265n();
        xdl0.M(this.f5741U, true);
        xdl0.M(this.f5750X, true);
        boolean zM5874ve = CoreModule.f1546o.m25559d().m5874ve(CoreModule.f1534c.f3628e0.m21483na());
        SettingsFilterItemWithInfo settingsFilterItemWithInfo = this.f5750X;
        if (zM5874ve) {
            settingsFilterItemWithInfo.setTitleIconRes(x2c0.f26235Rc);
            VText vText = this.f5744V;
            mqa.a(vText, vText.getContext().getResources().getDrawable(x2c0.f26235Rc));
        } else {
            settingsFilterItemWithInfo.setTitleIconRes(x2c0.f26204Qc);
            VText vText2 = this.f5744V;
            mqa.a(vText2, vText2.getContext().getResources().getDrawable(x2c0.f26204Qc));
        }
        this.f5750X.m8735j0(true ^ ((Boolean) uld0.m25255e().m25261h().get()).booleanValue());
        xdl0.E0(this.f5750X, new View.OnClickListener() { // from class: l.ere0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11415a.m8727y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public void m8702l1(AdvancedSettings advancedSettings) {
        advancedSettings.realFace = Boolean.valueOf(yij0.u(this.f5750X));
        ca40 ca40Var = this.f5788j2;
        if (ca40Var != null) {
            advancedSettings.intlFriendPurpose = ca40Var.f9555d;
        } else {
            advancedSettings.intlFriendPurpose = "";
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m8703m0(AdvancedSettings advancedSettings) {
        yij0.t(this.f5750X, advancedSettings.realFace.booleanValue());
        this.f5750X.m8734i0();
        m8665E1(advancedSettings.intlFriendPurpose);
        xdl0.E0(this.f5741U, new View.OnClickListener() { // from class: l.zqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28914a.m8729z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public void m8704m1(String str) {
        if (NullChecker.a(this.f5792l)) {
            this.f5792l.setText(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m8705n0() {
        this.f5770d2.m8559d2(new f30() { // from class: l.yqe0
            public final void call(Object obj, Object obj2) {
                this.f28347a.m8657A0((Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m8706n1(String str) {
        if (NullChecker.a(this.f5789k)) {
            this.f5789k.setText(str);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m8707o0() {
        xdl0.E0(this.f5737S1, new View.OnClickListener() { // from class: l.hqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14021a.m8663D0(view);
            }
        });
        if (!CoreModule.m1855Q().rb()) {
            this.f5728P1.setVisibility(8);
            this.f5734R1.setVisibility(8);
            return;
        }
        final boolean zBooleanValue = ((Boolean) f5680k2.get()).booleanValue();
        this.f5728P1.setVisibility(0);
        this.f5734R1.setVisibility(0);
        this.f5731Q1.setTypeface(eqh0.c(3));
        this.f5728P1.setOnClickListener(new View.OnClickListener() { // from class: l.sqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21596a.m8664E0(zBooleanValue, view);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m8708o1(boolean z) {
        this.f5690C1.m8409c(z);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m8709p0() {
        yij0.T(this.f5757Z0);
        this.f5770d2.m8530R3(yij0.u(this.f5757Z0));
    }

    /* JADX INFO: renamed from: p1 */
    public void m8710p1(String str) {
        this.f5690C1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m8711q0(View view) {
        this.f5770d2.m8558c3(CoreModule.f1534c.f3628e0.m21490p9().hideBlackDiamondTag());
    }

    /* JADX INFO: renamed from: q1 */
    public void m8712q1(Boolean bool) {
        this.f5698F1.m8409c(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r */
    public void m8713r() {
        if (this.f5692D1 == null) {
            this.f5692D1 = (SettingsItem) this.f5768d.findViewById(u4c0.f22997fc);
        }
        this.f5759a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.lre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16606a.m8610G0(view);
            }
        });
        this.f5759a.getLeftIconContainer().setBackgroundResource(x2c0.f26978p);
        this.f5786j.post(new Runnable() { // from class: l.rre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20691a.m8612H0();
            }
        });
        this.f5749W1 = this.f5711K;
        this.f5752X1 = this.f5717M;
        this.f5755Y1 = this.f5720N;
        this.f5758Z1 = this.f5723O;
        this.f5761a2 = this.f5726P;
        this.f5764b2 = this.f5732R;
        this.f5767c2 = this.f5738T;
        if (g6a.m15590m()) {
            m8697j0();
        }
        this.f5746V1.setVisibility(0);
        this.f5796n.setText(R$string.f2691lh);
        m8725w1(wvv.u() || wvv.t());
        xdl0.M(this.f5727P0, false);
        if (xdl0.O0(this.f5727P0)) {
            xdl0.M(this.f5769d1, true);
            this.f5769d1.setSubTitleText(act().string(R$string.f2677l3));
            if (upa.m25327E2()) {
                this.f5757Z0.setTitleText("仅限心动对象可见");
                this.f5757Z0.setSubTitleText("开启后，只有你右滑过的人才能滑到你");
            }
            xdl0.E0(this.f5757Z0, this.f5770d2.m8572k3());
            xdl0.E0(this.f5760a1, this.f5770d2.m8571j3());
            xdl0.E0(this.f5763b1, this.f5770d2.m8570i3());
            xdl0.E0(this.f5766c1, this.f5770d2.m8568h3());
            xdl0.E0(this.f5769d1, this.f5770d2.m8566g3());
            xdl0.E0(this.f5754Y0, new View.OnClickListener() { // from class: l.iqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14704a.m8623N0(view);
                }
            });
            xdl0.l(this.f5739T0, act().drawable(VipNewUtils.m11002g()));
        } else {
            xdl0.M(this.f5730Q0, false);
        }
        xdl0.E0(this.f5774f, this.f5770d2.m8597z3());
        this.f5740T1.setText(this.f5770d2.m8543W1());
        this.f5743U1.setText(tre0.m24808a());
        this.f5740T1.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jqe0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f15324a.m8669O0(view);
            }
        });
        qqh0 qqh0Var = qqh0.INSTANCE;
        if (qqh0Var.i()) {
            this.f5698F1.setTitleText(act().getString(R$string.f1956Na));
        }
        xdl0.E0(this.f5698F1, this.f5770d2.m8512K3());
        this.f5770d2.m8496D3();
        xdl0.E0(this.f5804q1, this.f5770d2.m8586s3());
        if (upa.m25322D2()) {
            this.f5806r1.setTitleText("隐私设置");
        }
        xdl0.E0(this.f5806r1, new View.OnClickListener() { // from class: l.kqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15963a.m8626P0(view);
            }
        });
        if (upa.m25322D2()) {
            xdl0.M(this.f5814v1, false);
            xdl0.M(this.f5810t1, true);
            xdl0.M(this.f5812u1, true);
            zvf0.x("e_push_settings", "p_settings_view");
            xdl0.E0(this.f5810t1, new View.OnClickListener() { // from class: l.lqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16580a.m8628Q0(view);
                }
            });
            zvf0.x("e_chat_settings", "p_settings_view");
            xdl0.E0(this.f5812u1, new View.OnClickListener() { // from class: l.mqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17187a.m8630R0(view);
                }
            });
        } else {
            if (vy8.m26018i() && !((Boolean) f5683n2.get()).booleanValue()) {
                this.f5814v1.m8409c(true);
            }
            xdl0.E0(this.f5814v1, new View.OnClickListener() { // from class: l.nqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17809a.m8632S0(view);
                }
            });
        }
        if (upa.m25327E2()) {
            xdl0.M(this.f5806r1, false);
            xdl0.M(this.f5818x1, true);
            xdl0.M(this.f5820y1, true);
            xdl0.E0(this.f5818x1, new View.OnClickListener() { // from class: l.oqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18331a.m8634T0(view);
                }
            });
            xdl0.E0(this.f5820y1, new View.OnClickListener() { // from class: l.pqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19266a.m8636U0(view);
                }
            });
            if (!f9k0.a() && !((Boolean) f5681l2.get()).booleanValue()) {
                this.f5820y1.m8409c(true);
            }
        }
        if (CoreModule.m1855Q().hasLiveSettingEntry()) {
            xdl0.M(this.f5822z1, true);
            xdl0.E0(this.f5822z1, this.f5770d2.m8588u3());
        }
        xdl0.E0(this.f5692D1, new View.OnClickListener() { // from class: l.mre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17213a.m8614I0(view);
            }
        });
        xdl0.E0(this.f5686A1, this.f5770d2.m8595y3());
        xdl0.E0(this.f5690C1, this.f5770d2.m8589v3());
        xdl0.E0(this.f5707I1, this.f5770d2.m8584r3());
        xdl0.E0(this.f5790k0, new View.OnClickListener() { // from class: l.nre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17827a.m8616J0(view);
            }
        });
        xdl0.M(this.f5725O1, vdj.m25804a() || nkp.m20156b());
        if (vdj.m25804a() || nkp.m20156b()) {
            xdl0.E0(this.f5725O1, this.f5770d2.m8582q3());
        }
        zvf0.x("e_setting_page_hide_active_time_button", "p_settings_view");
        xdl0.M(this.f5772e1, true);
        xdl0.E0(this.f5775f1, new View.OnClickListener() { // from class: l.ore0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18351a.m8618K0(view);
            }
        });
        if (u59.m24981S()) {
            m8701l0();
        }
        this.f5776f2.setHasOptionsMenu(true);
        act().setTitle(R$string.f2508fi);
        this.f5770d2.m8555b2();
        this.f5770d2.m8502H1();
        m8695i0();
        if (upa.m25409W2()) {
            xdl0.M(this.f5808s1, true);
            this.f5808s1.setTitleText("防骚扰");
            this.f5808s1.setSubTitleText("开启后，在聊天中将不再收到相关消息");
            xdl0.E0(this.f5808s1, new View.OnClickListener() { // from class: l.pre0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19275a.m8620L0(view);
                }
            });
        }
        if (qqh0Var.i()) {
            xdl0.M(this.f5701G1, true);
            this.f5701G1.setOnClickListener(new View.OnClickListener() { // from class: l.qre0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19991a.m8668M0(view);
                }
            });
            xdl0.M(this.f5704H1, true);
            this.f5704H1.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m8714r0(String str) {
        this.f5749W1.setText(str);
    }

    /* JADX INFO: renamed from: r1 */
    public void m8715r1(int i) {
        final cwf0 cwf0VarC = i0e.c("p_suggest_users_gender_selection_view", Dialog.class.getName());
        act().dialog().E0(R$string.f2391bo).f0(this.f5770d2.f5664m).h0(i, this.f5770d2.m8517N1(i)).k0(R$string.f2397c).B0(new DialogInterface.OnShowListener() { // from class: l.ire0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.jre0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m8716s0() {
        this.f5770d2.m8539U3(new e30() { // from class: l.cre0
            public final void call(Object obj) {
                this.f9802a.m8714r0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public void m8717s1(SettingGroups settingGroups) {
        if (NullChecker.a(this.f5776f2) && NullChecker.a(act())) {
            act().startActivityForResult(IntlSettingGenderAct.INSTANCE.m8374a(act(), settingGroups), 18);
            act().registerOnActivityResultListener(this);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m8718t0(View view) {
        this.f5770d2.m8516M3(yij0.T(this.f5755Y1));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m8719t1() {
        CoreModule.m1854P().m11706a().m5502pr(act(), "{p_settings_view,e_intl_show_verified_switch,click}", Privilege.intl_advanced_filter);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m8720u0() {
        this.f5764b2.setText(this.f5770d2.m8534T1());
    }

    /* JADX INFO: renamed from: u1 */
    public void m8721u1(boolean z) {
        VScroll vScroll = this.f5765c;
        if (z) {
            vScroll.setVisibility(4);
            this.f5762b.setVisibility(0);
        } else {
            vScroll.setVisibility(0);
            this.f5762b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m8722v0(final Runnable runnable, VRangeSeekBar vRangeSeekBar, Integer num, Integer num2, boolean z) {
        this.f5770d2.m8536T3(num.intValue(), num2.intValue(), new d30() { // from class: l.hre0
            public final void call() {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public void m8723v1() {
        if (TextUtils.isEmpty(this.f5782h2)) {
            jtk jtkVar = new jtk(act());
            TextView textView = new TextView(act());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R$string.f1969Nn);
            textView.getPaint().setFakeBoldText(true);
            jtkVar.j(textView).e(new int[]{-17664}).i(jtk.A | jtk.C).m(t100.d(90.0f)).n(t100.d(5.0f)).h(70).f(t100.d(10.0f)).o(t100.d(5.0f)).a(3000L).c(true).b(new jtk.a() { // from class: l.wqe0
                /* JADX INFO: renamed from: a */
                public final void m26631a(String str) {
                    this.f25318a.m8673W0(str);
                }
            }).d(new jtk.b() { // from class: l.xqe0
                /* JADX INFO: renamed from: a */
                public final void m27600a(String str) {
                    this.f27682a.m8675X0(str);
                }
            });
            this.f5782h2 = ptk.h().r(jtkVar, this.f5792l, this.f5768d);
            CoreModule.f1534c.f3643j0.f3277a0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m8724w0(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f5697F0.setText(charSequence);
        this.f5770d2.m8519N3(list, i);
    }

    /* JADX INFO: renamed from: w1 */
    public void m8725w1(boolean z) {
        LinearLayout linearLayout = this.f5794m;
        if (linearLayout != null) {
            xdl0.M(linearLayout, z);
        } else if (g6a.m15590m()) {
            xdl0.M(this.f5724O0, z);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m8726x0(View view) {
        final ArrayList arrayListF0 = vwb.f0(new String[]{act().getString(R$string.f1909Ln), act().getString(R$string.f1849Jn), act().getString(R$string.f1939Mn), act().getString(R$string.f1879Kn)});
        act().dialog().E0(R$string.f1819In).e0(arrayListF0).h0(this.f5770d2.m8537U1(arrayListF0), new Dialog.g() { // from class: l.are0
            /* JADX INFO: renamed from: a */
            public final void m12183a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f8457a.m8724w0(arrayListF0, dialog, view2, i, charSequence);
            }
        }).z().show();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m8727y0(View view) {
        zvf0.r("e_intl_show_verified_switch", "p_settings_view");
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        uld0.m25255e().m25267p();
        this.f5750X.m8735j0(false);
        if (userM21490p9 == null) {
            return;
        }
        if (!yij0.u(this.f5750X) && xma.m27379e4() && xma.m27389j4()) {
            m8719t1();
        } else {
            yij0.T(this.f5750X);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m8728y1() {
        yij0.T(this.f5775f1);
        com.p1.mobile.putong.core.ui.purchase.c.J1(act(), "p_settings,privacy", Privilege.vip_membership_active_time_gp);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m8729z0(View view) {
        ca40 ca40Var = this.f5788j2;
        act().startActivityForResult(12, RelationshipLookingAct.m9076V1(view.getContext(), ca40Var != null ? ca40Var.f9555d : ""), new b());
        zvf0.r("e_intl_select_looking_for", "p_settings_view");
    }

    /* JADX INFO: renamed from: z1 */
    public void m8730z1() {
        final cwf0 cwf0VarC = i0e.c("p_school_identify_makeSure_guide", Dialog.class.getName());
        cwf0VarC.o(u4e.b("passive", "alert", "alert_system", "priority_recommend_student_button", "setting_page", "click"));
        i0e.f(cwf0VarC);
        act().dialog().F(act().getString(R$string.f2150To)).m0(act().getString(R$string.f2397c)).v0(act().getString(R$string.f1706F0), this.f5770d2.m8490A3()).V(new DialogInterface.OnDismissListener() { // from class: l.bre0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
    }
}
