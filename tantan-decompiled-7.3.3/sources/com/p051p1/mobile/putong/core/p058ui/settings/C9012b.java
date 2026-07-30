package com.p051p1.mobile.putong.core.p058ui.settings;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AdvancedSettings;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.account.SwitchAccountAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.HelpCenterFrag;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.SettingsFilterItemWithInfo;
import com.p051p1.mobile.putong.core.p058ui.settings.relationshiplooking.RelationshipLookingAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p151v.VButton_FakeShadowSmall;
import p151v.VCheckBox;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VLinear_FakeShadow;
import p151v.VProgressBar;
import p151v.VRangeSeekBar;
import p151v.VScroll;
import p151v.VSwitch;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.a0f0;
import p153l.adc0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.d09;
import p153l.d79;
import p153l.dbc0;
import p153l.fwk;
import p153l.gra;
import p153l.i4g0;
import p153l.i6e;
import p153l.iam;
import p153l.iz40;
import p153l.joa;
import p153l.jxd0;
import p153l.jyb;
import p153l.k3d0;
import p153l.kec0;
import p153l.l4g0;
import p153l.l51;
import p153l.lik0;
import p153l.lyh0;
import p153l.nmp;
import p153l.pgj;
import p153l.psd0;
import p153l.qa00;
import p153l.qi40;
import p153l.s7a;
import p153l.w1e;
import p153l.wtd0;
import p153l.x20;
import p153l.xve0;
import p153l.xxv;
import p153l.y20;
import p153l.yra;
import p153l.yyh0;
import p153l.z20;
import p153l.zvk;
import p153l.zze0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b */
/* JADX INFO: loaded from: classes12.dex */
public class C9012b implements iam<C9011a>, C4468a.a {

    /* JADX INFO: renamed from: k2 */
    public static jxd0 f36747k2;

    /* JADX INFO: renamed from: l2 */
    public static jxd0 f36748l2;

    /* JADX INFO: renamed from: m2 */
    public static jxd0 f36749m2;

    /* JADX INFO: renamed from: n2 */
    public static jxd0 f36750n2;

    /* JADX INFO: renamed from: o2 */
    public static final int f36751o2;

    /* JADX INFO: renamed from: A */
    public VText f36752A;

    /* JADX INFO: renamed from: A1 */
    public SettingsItem f36753A1;

    /* JADX INFO: renamed from: B */
    public VFrame f36754B;

    /* JADX INFO: renamed from: B1 */
    public SettingsItem f36755B1;

    /* JADX INFO: renamed from: C */
    public VText f36756C;

    /* JADX INFO: renamed from: C1 */
    public SettingsItem f36757C1;

    /* JADX INFO: renamed from: D */
    public VText f36758D;

    /* JADX INFO: renamed from: D1 */
    public SettingsItem f36759D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f36760E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f36761E0;

    /* JADX INFO: renamed from: E1 */
    public LinearLayout f36762E1;

    /* JADX INFO: renamed from: F */
    public VText f36763F;

    /* JADX INFO: renamed from: F0 */
    public VText f36764F0;

    /* JADX INFO: renamed from: F1 */
    public SettingsItem f36765F1;

    /* JADX INFO: renamed from: G */
    public AgeRangeSeekBar f36766G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f36767G0;

    /* JADX INFO: renamed from: G1 */
    public SettingsItem f36768G1;

    /* JADX INFO: renamed from: H */
    public VText f36769H;

    /* JADX INFO: renamed from: H0 */
    public SettingsItem f36770H0;

    /* JADX INFO: renamed from: H1 */
    public SettingsItem f36771H1;

    /* JADX INFO: renamed from: I */
    public LinearLayout f36772I;

    /* JADX INFO: renamed from: I0 */
    public View f36773I0;

    /* JADX INFO: renamed from: I1 */
    public SettingsItem f36774I1;

    /* JADX INFO: renamed from: J */
    public FrameLayout f36775J;

    /* JADX INFO: renamed from: J0 */
    public VText f36776J0;

    /* JADX INFO: renamed from: J1 */
    public LinearLayout f36777J1;

    /* JADX INFO: renamed from: K */
    public VText f36778K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f36779K0;

    /* JADX INFO: renamed from: K1 */
    public MyTabAbSettingsItem f36780K1;

    /* JADX INFO: renamed from: L */
    public LinearLayout f36781L;

    /* JADX INFO: renamed from: L0 */
    public VText f36782L0;

    /* JADX INFO: renamed from: L1 */
    public MyTabAbSettingsItem f36783L1;

    /* JADX INFO: renamed from: M */
    public SeekBar f36784M;

    /* JADX INFO: renamed from: M0 */
    public VText f36785M0;

    /* JADX INFO: renamed from: M1 */
    public MyTabAbSettingsItem f36786M1;

    /* JADX INFO: renamed from: N */
    public VFrame f36787N;

    /* JADX INFO: renamed from: N0 */
    public VText f36788N0;

    /* JADX INFO: renamed from: N1 */
    public MyTabAbSettingsItem f36789N1;

    /* JADX INFO: renamed from: O */
    public VFrame f36790O;

    /* JADX INFO: renamed from: O0 */
    public VText f36791O0;

    /* JADX INFO: renamed from: O1 */
    public VButton_FakeShadowSmall f36792O1;

    /* JADX INFO: renamed from: P */
    public VText f36793P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f36794P0;

    /* JADX INFO: renamed from: P1 */
    public VLinear_FakeShadow f36795P1;

    /* JADX INFO: renamed from: Q */
    public FrameLayout f36796Q;

    /* JADX INFO: renamed from: Q0 */
    public View f36797Q0;

    /* JADX INFO: renamed from: Q1 */
    public TextView f36798Q1;

    /* JADX INFO: renamed from: R */
    public VText f36799R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f36800R0;

    /* JADX INFO: renamed from: R1 */
    public View f36801R1;

    /* JADX INFO: renamed from: S */
    public LinearLayout f36802S;

    /* JADX INFO: renamed from: S0 */
    public TextView f36803S0;

    /* JADX INFO: renamed from: S1 */
    public VButton_FakeShadowSmall f36804S1;

    /* JADX INFO: renamed from: T */
    public AgeRangeSeekBar f36805T;

    /* JADX INFO: renamed from: T0 */
    public VText f36806T0;

    /* JADX INFO: renamed from: T1 */
    public VText f36807T1;

    /* JADX INFO: renamed from: U */
    public VFrame f36808U;

    /* JADX INFO: renamed from: U0 */
    public LinearLayout f36809U0;

    /* JADX INFO: renamed from: U1 */
    public VText f36810U1;

    /* JADX INFO: renamed from: V */
    public VText f36811V;

    /* JADX INFO: renamed from: V0 */
    public VFrame f36812V0;

    /* JADX INFO: renamed from: V1 */
    public View f36813V1;

    /* JADX INFO: renamed from: W */
    public VText f36814W;

    /* JADX INFO: renamed from: W0 */
    public VText f36815W0;

    /* JADX INFO: renamed from: W1 */
    public VText f36816W1;

    /* JADX INFO: renamed from: X */
    public SettingsFilterItemWithInfo f36817X;

    /* JADX INFO: renamed from: X0 */
    public SeekBar f36818X0;

    /* JADX INFO: renamed from: X1 */
    public SeekBar f36819X1;

    /* JADX INFO: renamed from: Y */
    public VFrame f36820Y;

    /* JADX INFO: renamed from: Y0 */
    public SettingsItem f36821Y0;

    /* JADX INFO: renamed from: Y1 */
    public VFrame f36822Y1;

    /* JADX INFO: renamed from: Z */
    public VSwitch f36823Z;

    /* JADX INFO: renamed from: Z0 */
    public SettingsItem f36824Z0;

    /* JADX INFO: renamed from: Z1 */
    public VFrame f36825Z1;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f36826a;

    /* JADX INFO: renamed from: a1 */
    public SettingsItem f36827a1;

    /* JADX INFO: renamed from: a2 */
    public VText f36828a2;

    /* JADX INFO: renamed from: b */
    public VProgressBar f36829b;

    /* JADX INFO: renamed from: b1 */
    public SettingsItem f36830b1;

    /* JADX INFO: renamed from: b2 */
    public VText f36831b2;

    /* JADX INFO: renamed from: c */
    public VScroll f36832c;

    /* JADX INFO: renamed from: c1 */
    public SettingsItem f36833c1;

    /* JADX INFO: renamed from: c2 */
    public AgeRangeSeekBar f36834c2;

    /* JADX INFO: renamed from: d */
    public LinearLayout f36835d;

    /* JADX INFO: renamed from: d1 */
    public SettingsItem f36836d1;

    /* JADX INFO: renamed from: d2 */
    public C9011a f36837d2;

    /* JADX INFO: renamed from: e */
    public FrameLayout f36838e;

    /* JADX INFO: renamed from: e1 */
    public VLinear f36839e1;

    /* JADX INFO: renamed from: f */
    public VText f36841f;

    /* JADX INFO: renamed from: f1 */
    public SettingsItem f36842f1;

    /* JADX INFO: renamed from: f2 */
    public PutongFrag f36843f2;

    /* JADX INFO: renamed from: g */
    public View f36844g;

    /* JADX INFO: renamed from: g1 */
    public View f36845g1;

    /* JADX INFO: renamed from: h */
    public VText f36847h;

    /* JADX INFO: renamed from: h1 */
    public LinearLayout f36848h1;

    /* JADX INFO: renamed from: i */
    public VFrame f36850i;

    /* JADX INFO: renamed from: i1 */
    public SeekBar f36851i1;

    /* JADX INFO: renamed from: j */
    public VText f36853j;

    /* JADX INFO: renamed from: j1 */
    public VText f36854j1;

    /* JADX INFO: renamed from: k */
    public VText f36856k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f36857k0;

    /* JADX INFO: renamed from: k1 */
    public VFrame f36858k1;

    /* JADX INFO: renamed from: l */
    public VText f36859l;

    /* JADX INFO: renamed from: l1 */
    public VFrame f36860l1;

    /* JADX INFO: renamed from: m */
    public LinearLayout f36861m;

    /* JADX INFO: renamed from: m1 */
    public VText f36862m1;

    /* JADX INFO: renamed from: n */
    public VText f36863n;

    /* JADX INFO: renamed from: n1 */
    public AgeRangeSeekBar f36864n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f36865o;

    /* JADX INFO: renamed from: o1 */
    public VText f36866o1;

    /* JADX INFO: renamed from: p */
    public VFrame f36867p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f36868p0;

    /* JADX INFO: renamed from: p1 */
    public View f36869p1;

    /* JADX INFO: renamed from: q */
    public VText f36870q;

    /* JADX INFO: renamed from: q1 */
    public SettingsItem f36871q1;

    /* JADX INFO: renamed from: r */
    public LinearLayout f36872r;

    /* JADX INFO: renamed from: r1 */
    public SettingsItem f36873r1;

    /* JADX INFO: renamed from: s */
    public VText f36874s;

    /* JADX INFO: renamed from: s1 */
    public SettingsItem f36875s1;

    /* JADX INFO: renamed from: t */
    public SeekBar f36876t;

    /* JADX INFO: renamed from: t1 */
    public SettingsItem f36877t1;

    /* JADX INFO: renamed from: u */
    public VText f36878u;

    /* JADX INFO: renamed from: u1 */
    public SettingsItem f36879u1;

    /* JADX INFO: renamed from: v */
    public VFrame f36880v;

    /* JADX INFO: renamed from: v1 */
    public SettingsItem f36881v1;

    /* JADX INFO: renamed from: w */
    public VFrame f36882w;

    /* JADX INFO: renamed from: w1 */
    public SettingsItem f36883w1;

    /* JADX INFO: renamed from: x */
    public VText f36884x;

    /* JADX INFO: renamed from: x1 */
    public SettingsItem f36885x1;

    /* JADX INFO: renamed from: y */
    public SeekBar f36886y;

    /* JADX INFO: renamed from: y1 */
    public SettingsItem f36887y1;

    /* JADX INFO: renamed from: z */
    public VFrame f36888z;

    /* JADX INFO: renamed from: z1 */
    public SettingsItem f36889z1;

    /* JADX INFO: renamed from: e2 */
    public final jxd0 f36840e2 = new jxd0("notificationDotClicked" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g2 */
    public String f36846g2 = null;

    /* JADX INFO: renamed from: h2 */
    public String f36849h2 = null;

    /* JADX INFO: renamed from: i2 */
    public boolean f36852i2 = false;

    /* JADX INFO: renamed from: j2 */
    public qi40 f36855j2 = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_share_tantan_new_ui_button", C9012b.this.f36843f2.pageId(), jyb.m147494Y("share_to", "system"));
            CoreDlg.m46161D1(C9012b.this.getAct(), NavigationIntent.menu, jyb.m147507f0(LinkChannel.get("unknown")));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$b */
    public class b implements C4468a.a {
        public b() {
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i != 12 || !NullChecker.m82486a(intent) || i2 != -1) {
                return false;
            }
            C9012b.this.m56478E1(intent.getStringExtra("key_intl_friend_purpose"));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$c */
    public class c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f36892a;

        public c(Runnable runnable) {
            this.f36892a = runnable;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C9012b.this.f36837d2.m56358V3(i);
            this.f36892a.run();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C9012b.this.f36837d2.m56407x3();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f36747k2 = new jxd0("SWITCH_ACCOUNT_CLICKED", bool);
        f36748l2 = new jxd0("SHARE_DOT_CLICKED" + CoreModule.m30929H().userId(), bool);
        f36749m2 = new jxd0("ONLY_NOTIFY_CLICKED" + CoreModule.m30929H().userId(), bool);
        f36750n2 = new jxd0("NOTICE_DOT_CLICKED" + CoreModule.m30929H().userId(), bool);
        f36751o2 = qa00.m175859d(50.0f);
    }

    public C9012b(PutongFrag putongFrag) {
        this.f36843f2 = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m56424G0(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m56426H0() {
        int width = this.f36853j.getWidth();
        bnl0.m105538V(this.f36856k, width);
        bnl0.m105538V(this.f36859l, width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m56428I0(View view) {
        i4g0.m138520r("e_intl_ai_translate", "p_settings_view");
        getAct().startActivity(AITranslateSettingAct.m56182Z1(getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m56430J0(View view) {
        this.f36837d2.m56308B3(this.f36857k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m56432K0(View view) {
        i4g0.m138520r("e_setting_page_hide_active_time_button", "p_settings_view");
        this.f36837d2.m56378f3(bsj0.m106262T(this.f36842f1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m56434L0(View view) {
        this.f36837d2.m56401t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m56437N0(View view) {
        this.f36837d2.m56378f3(bsj0.m106262T(this.f36821Y0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m56440P0(View view) {
        this.f36837d2.m56395p3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m56442Q0(View view) {
        if (bnl0.m105529O0(this.f36877t1.f36706e)) {
            f36749m2.put(Boolean.TRUE);
            this.f36877t1.m56225c(false);
        }
        boolean z = NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed;
        i4g0.m138523u("e_push_settings", "p_settings_view", jyb.m147494Y("push_status", z ? BLiveOperationTitleShowType.off : "on"));
        if (!z) {
            this.f36837d2.m56392n3();
        } else {
            iz40.m142756A();
            getAct().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("allPushEnable", true, 0, 0)).subscribe(psd0.m173601L(psd0.m173591B()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m56444R0(View view) {
        i4g0.m138520r("e_chat_settings", "p_settings_view");
        this.f36837d2.m56376e3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m56446S0(View view) {
        if (d09.m113372i()) {
            f36750n2.put(Boolean.TRUE);
        }
        if (d09.m113372i()) {
            this.f36881v1.m56225c(false);
        }
        this.f36837d2.m56374d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m56448T0(View view) {
        this.f36837d2.m56390m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m56450U0(View view) {
        f36748l2.put(Boolean.TRUE);
        this.f36887y1.m56225c(false);
        this.f36837d2.m56393o3();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m56471A0(Boolean bool, Boolean bool2) {
        bnl0.m105524M(this.f36857k0, bool.booleanValue());
        bsj0.m106284t(this.f36857k0, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: A1 */
    public void m56472A1() {
        bsj0.m106262T(this.f36770H0);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m56473B0(VCheckBox vCheckBox) {
        boolean zIsChecked = vCheckBox.isChecked();
        i4g0.m138523u("e_sign_out_botton", m56494a1(), jyb.m147494Y("if_save_login_info", zIsChecked ? "yes" : "no"));
        this.f36837d2.m56349S3(zIsChecked);
    }

    /* JADX INFO: renamed from: B1 */
    public void m56474B1() {
        if (NullChecker.m82486a(this.f36765F1) && bnl0.m105529O0(this.f36765F1.f36706e)) {
            i4g0.m138521s("e_red_dot_me_settings_help", "p_settings_view", i6e.m138811c("red_dot", "red_dot_normal", "help_and_feedback_tab", "setting_page", "tips"));
        } else {
            i4g0.m138521s("e_red_dot_me_settings_help", "p_settings_view", i6e.m138812d());
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f36843f2.act();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m56475C1() {
        if (bnl0.m105529O0(this.f36801R1)) {
            return;
        }
        i4g0.m138521s("e_red_dot_me_settings_help", "p_settings_view", i6e.m138812d());
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m56476D0(View view) {
        final VCheckBox vCheckBox = (VCheckBox) getAct().inflater().inflate(kec0.f125875i2, (ViewGroup) null);
        vCheckBox.setText(R$string.f18587Jm);
        vCheckBox.setTextColor(-6710887);
        vCheckBox.setChecked(true);
        int iM175859d = qa00.m175859d(20.0f);
        i4g0.m138492A("e_sign_out_botton", m56494a1(), jyb.m147494Y("if_save_login_info", vCheckBox.isChecked() ? "yes" : "no"));
        getAct().dialog().m21502E0(R$string.f18649Lm).m21508H0(-14606047).m21499D(R$string.f18618Km).m21505G(-6710887).m21519P(vCheckBox, false).m21497C(iM175859d, 0, iM175859d, 0).m21540k0(R$string.f19138c).m21555t0(R$string.f18556Im, new Runnable() { // from class: l.kze0
            @Override // java.lang.Runnable
            public final void run() {
                this.f129405a.m56473B0(vCheckBox);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m56477E0(boolean z, View view) {
        m56475C1();
        if (!z) {
            f36747k2.put(Boolean.TRUE);
        }
        this.f36801R1.setVisibility(8);
        getAct().startActivity(SwitchAccountAct.m45379X1(getAct(), null));
    }

    /* JADX INFO: renamed from: E1 */
    public final void m56478E1(String str) {
        if (TextUtils.isEmpty(str)) {
            m56480G1(null);
            return;
        }
        for (qi40 qi40Var : xve0.f196393i) {
            if (TextUtils.equals(str, qi40Var.f157801d)) {
                m56480G1(qi40Var);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m56479F1(boolean z) {
        if (NullChecker.m82486a(this.f36873r1)) {
            this.f36873r1.setSubTitleText(k3d0.m148007c(z ? R$string.f19718uo : R$string.f19749vo));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m56480G1(qi40 qi40Var) {
        this.f36855j2 = qi40Var;
        VText vText = this.f36814W;
        if (qi40Var != null) {
            vText.setText(qi40Var.f157799b);
        } else {
            vText.setText("");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m56481M0(View view) {
        Intent intent = new Intent(getAct(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", HelpCenterFrag.class.getSimpleName());
        getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ boolean m56482O0(View view) {
        this.f36810U1.setVisibility(0);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public View m56483V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zze0.m222247b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m56484V0() {
        this.f36832c.fullScroll(130);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C9011a c9011a) {
        this.f36837d2 = c9011a;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m56486W0(String str) {
        this.f36850i.performClick();
    }

    /* JADX INFO: renamed from: X */
    public void m56487X() {
        bsj0.m106262T(this.f36836d1);
        this.f36837d2.m56367a2(bsj0.m106285u(this.f36836d1));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m56488X0(String str) {
        this.f36849h2 = null;
    }

    /* JADX INFO: renamed from: Y */
    public void m56489Y() {
        bsj0.m106262T(this.f36833c1);
        this.f36837d2.m56329L1(bsj0.m106285u(this.f36833c1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m56490Y0() {
    }

    /* JADX INFO: renamed from: Z */
    public void m56491Z() {
        bsj0.m106262T(this.f36830b1);
        this.f36837d2.m56363Y1(bsj0.m106285u(this.f36830b1));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m56492Z0(Throwable th) {
        bsj0.m106262T(this.f36842f1);
        bsj0.m106262T(this.f36821Y0);
    }

    @Override // com.p051p1.mobile.android.app.C4468a.a
    /* JADX INFO: renamed from: a */
    public boolean mo21400a(int i, int i2, Intent intent) {
        if (intent == null || i != 18) {
            return false;
        }
        Serializable serializableExtra = intent.getSerializableExtra("result_data");
        if (!(serializableExtra instanceof SettingGroups)) {
            return true;
        }
        this.f36837d2.m56361X1((SettingGroups) serializableExtra);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m56493a0() {
        bsj0.m106262T(this.f36827a1);
        this.f36837d2.m56365Z1(bsj0.m106285u(this.f36827a1));
    }

    /* JADX INFO: renamed from: a1 */
    public String m56494a1() {
        return this.f36843f2.pageId();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f36843f2.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m56495b0() {
        if (!bsj0.m106285u(this.f36824Z0)) {
            CoreDlg.m46230a2(getAct(), new Runnable() { // from class: l.rze0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165515a.m56520p0();
                }
            });
        } else {
            bsj0.m106262T(this.f36824Z0);
            this.f36837d2.m56346R3(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m56496c0() {
        if (NullChecker.m82486a(this.f36843f2.getArguments())) {
            return this.f36843f2.getArguments().getBoolean("autoSearch", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public String m56497d0() {
        return NullChecker.m82486a(this.f36843f2.getArguments()) ? this.f36843f2.getArguments().getString("gender", "") : "";
    }

    /* JADX INFO: renamed from: d1 */
    public void m56498d1() {
        if (f36749m2.get().booleanValue() || NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed) {
            this.f36877t1.m56225c(false);
        } else {
            this.f36877t1.m56225c(true);
        }
        NotificationCheckerCommon.State stateM80403a = NotificationCheckerCommon.m80403a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        SettingsItem settingsItem = this.f36877t1;
        if (stateM80403a == state) {
            settingsItem.setSubTitleText("当前无法接收新消息通知");
        } else {
            settingsItem.setSubTitleText("设置接收的消息类型和内容");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public int m56499e0() {
        if (NullChecker.m82486a(this.f36843f2.getArguments())) {
            return this.f36843f2.getArguments().getInt("maxAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e1 */
    public void m56500e1(boolean z, int i) {
        this.f36765F1.f36706e.setBackgroundResource(i);
        m56523q1(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f0 */
    public int m56501f0() {
        if (NullChecker.m82486a(this.f36843f2.getArguments())) {
            return this.f36843f2.getArguments().getInt("minAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f1 */
    public void m56502f1(boolean z) {
        bsj0.m106284t(this.f36842f1, z);
        bsj0.m106284t(this.f36821Y0, z);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m56503g0() {
        if (NullChecker.m82486a(this.f36843f2.getArguments())) {
            return this.f36843f2.getArguments().getBoolean("scroll_to_bottom", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: g1 */
    public void m56504g1(String str) {
        this.f36828a2.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public int m56505h0() {
        if (NullChecker.m82486a(this.f36843f2.getArguments())) {
            return this.f36843f2.getArguments().getInt("searchRadius", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public void m56506h1(boolean z) {
        View view = this.f36844g;
        if (z) {
            view.setVisibility(0);
            this.f36838e.setVisibility(0);
        } else {
            view.setVisibility(8);
            this.f36838e.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m56507i0() {
        boolean zIsBlackDiamondVIP = CoreModule.f18264c.f20381e0.m116600p9().isBlackDiamondVIP();
        VLinear vLinear = this.f36767G0;
        if (!zIsBlackDiamondVIP) {
            bnl0.m105524M(vLinear, false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        bsj0.m106284t(this.f36770H0, true ^ CoreModule.f18264c.f20381e0.m116600p9().hideBlackDiamondTag());
        bnl0.m105509E0(this.f36770H0, new View.OnClickListener() { // from class: l.nze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f144429a.m56522q0(view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56483V(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m56508j0() {
        bnl0.m105524M(this.f36773I0, true);
        bnl0.m105524M(this.f36850i, false);
        bnl0.m105524M(this.f36776J0, true);
        VFrame vFrame = this.f36779K0;
        this.f36850i = vFrame;
        bnl0.m105524M(vFrame, true);
        this.f36853j = this.f36782L0;
        this.f36856k = this.f36785M0;
        this.f36859l = this.f36788N0;
        this.f36861m = null;
        this.f36863n = this.f36791O0;
        bnl0.m105525M0(this.f36882w, false);
        bnl0.m105525M0(this.f36886y, false);
        bnl0.m105524M(this.f36809U0, true);
        this.f36882w = this.f36812V0;
        this.f36884x = this.f36815W0;
        this.f36886y = this.f36818X0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m56509j1() {
        l51.m152887G(new Runnable() { // from class: l.mze0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139505a.m56484V0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m56510k0() {
        int iM56326J3;
        if (nmp.m163832a() || !IntlCountryCodeController.m29118o()) {
            bnl0.m105509E0(this.f36850i, this.f36837d2.m56388l3());
            this.f36837d2.m56371c2();
        } else {
            this.f36850i.setVisibility(8);
        }
        bnl0.m105509E0(this.f36825Z1, this.f36837d2.m56405w3());
        this.f36837d2.m56337O3();
        Runnable runnable = new Runnable() { // from class: l.xye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f196743a.m56527s0();
            }
        };
        runnable.run();
        boolean zM29109f = IntlCountryCodeController.m29109f();
        SeekBar seekBar = this.f36819X1;
        if (zM29109f) {
            seekBar.setMax(60);
            iM56326J3 = this.f36837d2.m56323I3();
        } else {
            seekBar.setMax(this.f36837d2.m56324J1());
            iM56326J3 = this.f36837d2.m56326J3();
            if (iM56326J3 == this.f36819X1.getProgress()) {
                this.f36819X1.setProgress(iM56326J3 + 1);
            }
        }
        this.f36819X1.setProgress(iM56326J3);
        this.f36819X1.setOnSeekBarChangeListener(new c(runnable));
        bsj0.m106284t(this.f36822Y1, this.f36837d2.m56315F1());
        this.f36822Y1.setOnClickListener(new View.OnClickListener() { // from class: l.yye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202104a.m56529t0(view);
            }
        });
        final Runnable runnable2 = new Runnable() { // from class: l.aze0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74143a.m56531u0();
            }
        };
        runnable2.run();
        this.f36834c2.m224417e(Integer.valueOf(this.f36837d2.m56341Q1()), Integer.valueOf(this.f36837d2.m56338P1()));
        this.f36834c2.setSelectedMinValue(Integer.valueOf(this.f36837d2.m56347S1()));
        this.f36834c2.setSelectedMaxValue(Integer.valueOf(this.f36837d2.m56344R1()));
        this.f36834c2.setNotifyWhileDragging(true);
        this.f36834c2.setOnRangeSeekBarChangeListener(new VRangeSeekBar.InterfaceC22678b() { // from class: l.bze0
            @Override // p151v.VRangeSeekBar.InterfaceC22678b
            /* JADX INFO: renamed from: a */
            public final void mo107161a(VRangeSeekBar vRangeSeekBar, Object obj, Object obj2, boolean z) {
                this.f79128a.m56533v0(runnable2, vRangeSeekBar, (Integer) obj, (Integer) obj2, z);
            }
        });
        if (this.f36837d2.m56356V1() == null) {
            bnl0.m105524M(this.f36868p0, false);
        } else {
            this.f36764F0.setText(this.f36837d2.m56356V1());
            bnl0.m105509E0(this.f36761E0, new View.OnClickListener() { // from class: l.cze0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84457a.m56537x0(view);
                }
            });
        }
        m56516n0();
    }

    /* JADX INFO: renamed from: k1 */
    public void m56511k1(String str) {
        this.f36871q1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m56512l0() {
        i4g0.m138526x("e_intl_show_verified_switch", "p_settings_view");
        wtd0.m207833e().m207843n();
        bnl0.m105524M(this.f36808U, true);
        bnl0.m105524M(this.f36817X, true);
        boolean zMo34940ve = CoreModule.f18276o.m132214d().mo34940ve(CoreModule.f18264c.f20381e0.m116593na());
        SettingsFilterItemWithInfo settingsFilterItemWithInfo = this.f36817X;
        if (zMo34940ve) {
            settingsFilterItemWithInfo.setTitleIconRes(dbc0.f86565Sc);
            VText vText = this.f36811V;
            yra.m217164a(vText, vText.getContext().getResources().getDrawable(dbc0.f86565Sc));
        } else {
            settingsFilterItemWithInfo.setTitleIconRes(dbc0.f86533Rc);
            VText vText2 = this.f36811V;
            yra.m217164a(vText2, vText2.getContext().getResources().getDrawable(dbc0.f86533Rc));
        }
        this.f36817X.m56545j0(true ^ wtd0.m207833e().m207839h().get().booleanValue());
        bnl0.m105509E0(this.f36817X, new View.OnClickListener() { // from class: l.lze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134186a.m56538y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public void m56513l1(AdvancedSettings advancedSettings) {
        advancedSettings.realFace = Boolean.valueOf(bsj0.m106285u(this.f36817X));
        qi40 qi40Var = this.f36855j2;
        if (qi40Var != null) {
            advancedSettings.intlFriendPurpose = qi40Var.f157801d;
        } else {
            advancedSettings.intlFriendPurpose = "";
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m56514m0(AdvancedSettings advancedSettings) {
        bsj0.m106284t(this.f36817X, advancedSettings.realFace.booleanValue());
        this.f36817X.m56544i0();
        m56478E1(advancedSettings.intlFriendPurpose);
        bnl0.m105509E0(this.f36808U, new View.OnClickListener() { // from class: l.gze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107203a.m56540z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public void m56515m1(String str) {
        if (NullChecker.m82486a(this.f36859l)) {
            this.f36859l.setText(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m56516n0() {
        this.f36837d2.m56373d2(new z20() { // from class: l.fze0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f101477a.m56471A0((Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m56517n1(String str) {
        if (NullChecker.m82486a(this.f36856k)) {
            this.f36856k.setText(str);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m56518o0() {
        bnl0.m105509E0(this.f36804S1, new View.OnClickListener() { // from class: l.oye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149791a.m56476D0(view);
            }
        });
        if (!CoreModule.m30934Q().mo68464rb()) {
            this.f36795P1.setVisibility(8);
            this.f36801R1.setVisibility(8);
            return;
        }
        final boolean zBooleanValue = f36747k2.get().booleanValue();
        this.f36795P1.setVisibility(0);
        this.f36801R1.setVisibility(0);
        this.f36798Q1.setTypeface(lyh0.m156283c(3));
        this.f36795P1.setOnClickListener(new View.OnClickListener() { // from class: l.zye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206574a.m56477E0(zBooleanValue, view);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m56519o1(boolean z) {
        this.f36757C1.m56225c(z);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m56520p0() {
        bsj0.m106262T(this.f36824Z0);
        this.f36837d2.m56346R3(bsj0.m106285u(this.f36824Z0));
    }

    /* JADX INFO: renamed from: p1 */
    public void m56521p1(String str) {
        this.f36757C1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m56522q0(View view) {
        this.f36837d2.m56372c3(CoreModule.f18264c.f20381e0.m116600p9().hideBlackDiamondTag());
    }

    /* JADX INFO: renamed from: q1 */
    public void m56523q1(Boolean bool) {
        this.f36765F1.m56225c(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r */
    public void m56524r() {
        if (this.f36759D1 == null) {
            this.f36759D1 = (SettingsItem) this.f36835d.findViewById(adc0.f70374hc);
        }
        this.f36826a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171382a.m56424G0(view);
            }
        });
        this.f36826a.getLeftIconContainer().setBackgroundResource(dbc0.f87333q);
        this.f36853j.post(new Runnable() { // from class: l.yze0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202191a.m56426H0();
            }
        });
        this.f36816W1 = this.f36778K;
        this.f36819X1 = this.f36784M;
        this.f36822Y1 = this.f36787N;
        this.f36825Z1 = this.f36790O;
        this.f36828a2 = this.f36793P;
        this.f36831b2 = this.f36799R;
        this.f36834c2 = this.f36805T;
        if (s7a.m184984m()) {
            m56508j0();
        }
        this.f36813V1.setVisibility(0);
        this.f36863n.setText(R$string.f18489Gh);
        m56536w1(xxv.m213594u() || xxv.m213593t());
        bnl0.m105524M(this.f36794P0, false);
        if (bnl0.m105529O0(this.f36794P0)) {
            bnl0.m105524M(this.f36836d1, true);
            this.f36836d1.setSubTitleText(getAct().string(R$string.f19480n3));
            if (gra.m131560E2()) {
                this.f36824Z0.setTitleText("仅限心动对象可见");
                this.f36824Z0.setSubTitleText("开启后，只有你右滑过的人才能滑到你");
            }
            bnl0.m105509E0(this.f36824Z0, this.f36837d2.m56386k3());
            bnl0.m105509E0(this.f36827a1, this.f36837d2.m56385j3());
            bnl0.m105509E0(this.f36830b1, this.f36837d2.m56384i3());
            bnl0.m105509E0(this.f36833c1, this.f36837d2.m56382h3());
            bnl0.m105509E0(this.f36836d1, this.f36837d2.m56380g3());
            bnl0.m105509E0(this.f36821Y0, new View.OnClickListener() { // from class: l.pye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f154631a.m56437N0(view);
                }
            });
            bnl0.m105565l(this.f36806T0, getAct().drawable(VipNewUtils.m58693g()));
        } else {
            bnl0.m105524M(this.f36797Q0, false);
        }
        bnl0.m105509E0(this.f36841f, this.f36837d2.m56411z3());
        this.f36807T1.setText(this.f36837d2.m56359W1());
        this.f36810U1.setText(a0f0.m95344a());
        this.f36807T1.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.qye0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f160146a.m56482O0(view);
            }
        });
        yyh0 yyh0Var = yyh0.INSTANCE;
        if (yyh0Var.m217993i()) {
            this.f36765F1.setTitleText(getAct().getString(R$string.f19027Ya));
        }
        bnl0.m105509E0(this.f36765F1, this.f36837d2.m56328K3());
        this.f36837d2.m56312D3();
        bnl0.m105509E0(this.f36871q1, this.f36837d2.m56400s3());
        if (gra.m131555D2()) {
            this.f36873r1.setTitleText("隐私设置");
        }
        bnl0.m105509E0(this.f36873r1, new View.OnClickListener() { // from class: l.rye0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165428a.m56440P0(view);
            }
        });
        if (gra.m131555D2()) {
            bnl0.m105524M(this.f36881v1, false);
            bnl0.m105524M(this.f36877t1, true);
            bnl0.m105524M(this.f36879u1, true);
            i4g0.m138526x("e_push_settings", "p_settings_view");
            bnl0.m105509E0(this.f36877t1, new View.OnClickListener() { // from class: l.sye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171234a.m56442Q0(view);
                }
            });
            i4g0.m138526x("e_chat_settings", "p_settings_view");
            bnl0.m105509E0(this.f36879u1, new View.OnClickListener() { // from class: l.tye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176670a.m56444R0(view);
                }
            });
        } else {
            if (d09.m113372i() && !f36750n2.get().booleanValue()) {
                this.f36881v1.m56225c(true);
            }
            bnl0.m105509E0(this.f36881v1, new View.OnClickListener() { // from class: l.uye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181571a.m56446S0(view);
                }
            });
        }
        if (gra.m131560E2()) {
            bnl0.m105524M(this.f36873r1, false);
            bnl0.m105524M(this.f36885x1, true);
            bnl0.m105524M(this.f36887y1, true);
            bnl0.m105509E0(this.f36885x1, new View.OnClickListener() { // from class: l.vye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186369a.m56448T0(view);
                }
            });
            bnl0.m105509E0(this.f36887y1, new View.OnClickListener() { // from class: l.wye0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191636a.m56450U0(view);
                }
            });
            if (!lik0.m154375a() && !f36748l2.get().booleanValue()) {
                this.f36887y1.m56225c(true);
            }
        }
        if (CoreModule.m30934Q().hasLiveSettingEntry()) {
            bnl0.m105524M(this.f36889z1, true);
            bnl0.m105509E0(this.f36889z1, this.f36837d2.m56402u3());
        }
        bnl0.m105509E0(this.f36759D1, new View.OnClickListener() { // from class: l.tze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176758a.m56428I0(view);
            }
        });
        bnl0.m105509E0(this.f36753A1, this.f36837d2.m56409y3());
        bnl0.m105509E0(this.f36757C1, this.f36837d2.m56403v3());
        bnl0.m105509E0(this.f36774I1, this.f36837d2.m56398r3());
        bnl0.m105509E0(this.f36857k0, new View.OnClickListener() { // from class: l.uze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181782a.m56430J0(view);
            }
        });
        bnl0.m105524M(this.f36792O1, pgj.m172244a() || nmp.m163833b());
        if (pgj.m172244a() || nmp.m163833b()) {
            bnl0.m105509E0(this.f36792O1, this.f36837d2.m56396q3());
        }
        i4g0.m138526x("e_setting_page_hide_active_time_button", "p_settings_view");
        bnl0.m105524M(this.f36839e1, true);
        bnl0.m105509E0(this.f36842f1, new View.OnClickListener() { // from class: l.vze0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186480a.m56432K0(view);
            }
        });
        if (d79.m114661T()) {
            m56512l0();
        }
        this.f36843f2.setHasOptionsMenu(true);
        getAct().setTitle(R$string.f18304Ai);
        this.f36837d2.m56369b2();
        this.f36837d2.m56318H1();
        m56507i0();
        if (gra.m131642W2()) {
            bnl0.m105524M(this.f36875s1, true);
            this.f36875s1.setTitleText("防骚扰");
            this.f36875s1.setSubTitleText("开启后，在聊天中将不再收到相关消息");
            bnl0.m105509E0(this.f36875s1, new View.OnClickListener() { // from class: l.wze0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191748a.m56434L0(view);
                }
            });
        }
        if (yyh0Var.m217993i()) {
            bnl0.m105524M(this.f36768G1, true);
            this.f36768G1.setOnClickListener(new View.OnClickListener() { // from class: l.xze0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196862a.m56481M0(view);
                }
            });
            bnl0.m105524M(this.f36771H1, true);
            this.f36771H1.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m56525r0(String str) {
        this.f36816W1.setText(str);
    }

    /* JADX INFO: renamed from: r1 */
    public void m56526r1(int i) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_suggest_users_gender_selection_view", Dialog.class.getName());
        getAct().dialog().m21502E0(R$string.f19842yo).m21535f0(this.f36837d2.f36731m).m21537h0(i, this.f36837d2.m56333N1(i)).m21540k0(R$string.f19138c).m21496B0(new DialogInterface.OnShowListener() { // from class: l.pze0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.qze0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m56527s0() {
        this.f36837d2.m56355U3(new y20() { // from class: l.jze0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123260a.m56525r0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public void m56528s1(SettingGroups settingGroups) {
        if (NullChecker.m82486a(this.f36843f2) && NullChecker.m82486a(getAct())) {
            getAct().startActivityForResult(IntlSettingGenderAct.INSTANCE.m56191a(getAct(), settingGroups), 18);
            getAct().registerOnActivityResultListener(this);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m56529t0(View view) {
        this.f36837d2.m56332M3(bsj0.m106262T(this.f36822Y1));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m56530t1() {
        CoreModule.m30933P().m143405a().mo34568pr(getAct(), "{p_settings_view,e_intl_show_verified_switch,click}", Privilege.intl_advanced_filter);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m56531u0() {
        this.f36831b2.setText(this.f36837d2.m56350T1());
    }

    /* JADX INFO: renamed from: u1 */
    public void m56532u1(boolean z) {
        VScroll vScroll = this.f36832c;
        if (z) {
            vScroll.setVisibility(4);
            this.f36829b.setVisibility(0);
        } else {
            vScroll.setVisibility(0);
            this.f36829b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m56533v0(final Runnable runnable, VRangeSeekBar vRangeSeekBar, Integer num, Integer num2, boolean z) {
        this.f36837d2.m56352T3(num.intValue(), num2.intValue(), new x20() { // from class: l.oze0
            @Override // p153l.x20
            public final void call() {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public void m56534v1() {
        if (TextUtils.isEmpty(this.f36849h2)) {
            zvk zvkVar = new zvk(getAct());
            TextView textView = new TextView(getAct());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R$string.f19408ko);
            textView.getPaint().setFakeBoldText(true);
            zvkVar.m221765j(textView).m221760e(-17664).m221764i(zvk.f206224A | zvk.f206226C).m221768m(qa00.m175859d(90.0f)).m221769n(qa00.m175859d(5.0f)).m221763h(70).m221761f(qa00.m175859d(10.0f)).m221770o(qa00.m175859d(5.0f)).m221756a(3000L).m221758c(true).m221757b(new zvk.InterfaceC21905a() { // from class: l.dze0
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f91354a.m56486W0(str);
                }
            }).m221759d(new zvk.InterfaceC21906b() { // from class: l.eze0
                @Override // p153l.zvk.InterfaceC21906b
                /* JADX INFO: renamed from: a */
                public final void mo96261a(String str) {
                    this.f96583a.m56488X0(str);
                }
            });
            this.f36849h2 = fwk.m127777h().m127789r(zvkVar, this.f36859l, this.f36835d);
            CoreModule.f18264c.f20396j0.f20030a0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m56535w0(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f36764F0.setText(charSequence);
        this.f36837d2.m56335N3(list, i);
    }

    /* JADX INFO: renamed from: w1 */
    public void m56536w1(boolean z) {
        LinearLayout linearLayout = this.f36861m;
        if (linearLayout != null) {
            bnl0.m105524M(linearLayout, z);
        } else if (s7a.m184984m()) {
            bnl0.m105524M(this.f36791O0, z);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m56537x0(View view) {
        final ArrayList arrayListM147507f0 = jyb.m147507f0(getAct().getString(R$string.f19347io), getAct().getString(R$string.f19286go), getAct().getString(R$string.f19377jo), getAct().getString(R$string.f19317ho));
        getAct().dialog().m21502E0(R$string.f19255fo).m21534e0(arrayListM147507f0).m21537h0(this.f36837d2.m56353U1(arrayListM147507f0), new Dialog.InterfaceC4462g() { // from class: l.hze0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f112239a.m56535w0(arrayListM147507f0, dialog, view2, i, charSequence);
            }
        }).m21566z().show();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m56538y0(View view) {
        i4g0.m138520r("e_intl_show_verified_switch", "p_settings_view");
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        wtd0.m207833e().m207845p();
        this.f36817X.m56545j0(false);
        if (userM116600p9 == null) {
            return;
        }
        if (!bsj0.m106285u(this.f36817X) && joa.m146386f4() && joa.m146396k4()) {
            m56530t1();
        } else {
            bsj0.m106262T(this.f36817X);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m56539y1() {
        bsj0.m106262T(this.f36842f1);
        C8927c.m54586J1(getAct(), "p_settings,privacy", Privilege.vip_membership_active_time_gp);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m56540z0(View view) {
        qi40 qi40Var = this.f36855j2;
        getAct().startActivityForResult(12, RelationshipLookingAct.m56862X1(view.getContext(), qi40Var != null ? qi40Var.f157801d : ""), new b());
        i4g0.m138520r("e_intl_select_looking_for", "p_settings_view");
    }

    /* JADX INFO: renamed from: z1 */
    public void m56541z1() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_school_identify_makeSure_guide", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_system", "priority_recommend_student_button", "setting_page", "click"));
        w1e.m204402f(l4g0VarM204399c);
        getAct().dialog().m21503F(getAct().getString(R$string.f19564pp)).m21542m0(getAct().getString(R$string.f19138c)).m21559v0(getAct().getString(R$string.f18441F0), this.f36837d2.m56306A3()).m21525V(new DialogInterface.OnDismissListener() { // from class: l.ize0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
    }
}
