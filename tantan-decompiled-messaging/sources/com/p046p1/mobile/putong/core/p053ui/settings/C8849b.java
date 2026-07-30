package com.p046p1.mobile.putong.core.p053ui.settings;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AdvancedSettings;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.p053ui.account.SwitchAccountAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.HelpCenterFrag;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.SettingsFilterItemWithInfo;
import com.p046p1.mobile.putong.core.p053ui.settings.relationshiplooking.RelationshipLookingAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p147v.VButton_FakeShadowSmall;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VLinear_FakeShadow;
import p147v.VProgressBar;
import p147v.VRangeSeekBar;
import p147v.VScroll;
import p147v.VSwitch;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.ca40;
import p149l.cwf0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.f30;
import p149l.f6c0;
import p149l.f9k0;
import p149l.g6a;
import p149l.hpd0;
import p149l.hvc0;
import p149l.i0e;
import p149l.jtk;
import p149l.mkd0;
import p149l.mqa;
import p149l.nkp;
import p149l.ptk;
import p149l.qne0;
import p149l.qqh0;
import p149l.s7m;
import p149l.sre0;
import p149l.t100;
import p149l.tre0;
import p149l.u4c0;
import p149l.u4e;
import p149l.u59;
import p149l.uld0;
import p149l.upa;
import p149l.uq40;
import p149l.vdj;
import p149l.vwb;
import p149l.vy8;
import p149l.wvv;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b */
/* JADX INFO: loaded from: classes9.dex */
public class C8849b implements s7m<C8848a>, C4317a.a {

    /* JADX INFO: renamed from: k2 */
    public static hpd0 f35899k2;

    /* JADX INFO: renamed from: l2 */
    public static hpd0 f35900l2;

    /* JADX INFO: renamed from: m2 */
    public static hpd0 f35901m2;

    /* JADX INFO: renamed from: n2 */
    public static hpd0 f35902n2;

    /* JADX INFO: renamed from: o2 */
    public static final int f35903o2;

    /* JADX INFO: renamed from: A */
    public VText f35904A;

    /* JADX INFO: renamed from: A1 */
    public SettingsItem f35905A1;

    /* JADX INFO: renamed from: B */
    public VFrame f35906B;

    /* JADX INFO: renamed from: B1 */
    public SettingsItem f35907B1;

    /* JADX INFO: renamed from: C */
    public VText f35908C;

    /* JADX INFO: renamed from: C1 */
    public SettingsItem f35909C1;

    /* JADX INFO: renamed from: D */
    public VText f35910D;

    /* JADX INFO: renamed from: D1 */
    public SettingsItem f35911D1;

    /* JADX INFO: renamed from: E */
    public LinearLayout f35912E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f35913E0;

    /* JADX INFO: renamed from: E1 */
    public LinearLayout f35914E1;

    /* JADX INFO: renamed from: F */
    public VText f35915F;

    /* JADX INFO: renamed from: F0 */
    public VText f35916F0;

    /* JADX INFO: renamed from: F1 */
    public SettingsItem f35917F1;

    /* JADX INFO: renamed from: G */
    public AgeRangeSeekBar f35918G;

    /* JADX INFO: renamed from: G0 */
    public VLinear f35919G0;

    /* JADX INFO: renamed from: G1 */
    public SettingsItem f35920G1;

    /* JADX INFO: renamed from: H */
    public VText f35921H;

    /* JADX INFO: renamed from: H0 */
    public SettingsItem f35922H0;

    /* JADX INFO: renamed from: H1 */
    public SettingsItem f35923H1;

    /* JADX INFO: renamed from: I */
    public LinearLayout f35924I;

    /* JADX INFO: renamed from: I0 */
    public View f35925I0;

    /* JADX INFO: renamed from: I1 */
    public SettingsItem f35926I1;

    /* JADX INFO: renamed from: J */
    public FrameLayout f35927J;

    /* JADX INFO: renamed from: J0 */
    public VText f35928J0;

    /* JADX INFO: renamed from: J1 */
    public LinearLayout f35929J1;

    /* JADX INFO: renamed from: K */
    public VText f35930K;

    /* JADX INFO: renamed from: K0 */
    public VFrame f35931K0;

    /* JADX INFO: renamed from: K1 */
    public MyTabAbSettingsItem f35932K1;

    /* JADX INFO: renamed from: L */
    public LinearLayout f35933L;

    /* JADX INFO: renamed from: L0 */
    public VText f35934L0;

    /* JADX INFO: renamed from: L1 */
    public MyTabAbSettingsItem f35935L1;

    /* JADX INFO: renamed from: M */
    public SeekBar f35936M;

    /* JADX INFO: renamed from: M0 */
    public VText f35937M0;

    /* JADX INFO: renamed from: M1 */
    public MyTabAbSettingsItem f35938M1;

    /* JADX INFO: renamed from: N */
    public VFrame f35939N;

    /* JADX INFO: renamed from: N0 */
    public VText f35940N0;

    /* JADX INFO: renamed from: N1 */
    public MyTabAbSettingsItem f35941N1;

    /* JADX INFO: renamed from: O */
    public VFrame f35942O;

    /* JADX INFO: renamed from: O0 */
    public VText f35943O0;

    /* JADX INFO: renamed from: O1 */
    public VButton_FakeShadowSmall f35944O1;

    /* JADX INFO: renamed from: P */
    public VText f35945P;

    /* JADX INFO: renamed from: P0 */
    public LinearLayout f35946P0;

    /* JADX INFO: renamed from: P1 */
    public VLinear_FakeShadow f35947P1;

    /* JADX INFO: renamed from: Q */
    public FrameLayout f35948Q;

    /* JADX INFO: renamed from: Q0 */
    public View f35949Q0;

    /* JADX INFO: renamed from: Q1 */
    public TextView f35950Q1;

    /* JADX INFO: renamed from: R */
    public VText f35951R;

    /* JADX INFO: renamed from: R0 */
    public LinearLayout f35952R0;

    /* JADX INFO: renamed from: R1 */
    public View f35953R1;

    /* JADX INFO: renamed from: S */
    public LinearLayout f35954S;

    /* JADX INFO: renamed from: S0 */
    public TextView f35955S0;

    /* JADX INFO: renamed from: S1 */
    public VButton_FakeShadowSmall f35956S1;

    /* JADX INFO: renamed from: T */
    public AgeRangeSeekBar f35957T;

    /* JADX INFO: renamed from: T0 */
    public VText f35958T0;

    /* JADX INFO: renamed from: T1 */
    public VText f35959T1;

    /* JADX INFO: renamed from: U */
    public VFrame f35960U;

    /* JADX INFO: renamed from: U0 */
    public LinearLayout f35961U0;

    /* JADX INFO: renamed from: U1 */
    public VText f35962U1;

    /* JADX INFO: renamed from: V */
    public VText f35963V;

    /* JADX INFO: renamed from: V0 */
    public VFrame f35964V0;

    /* JADX INFO: renamed from: V1 */
    public View f35965V1;

    /* JADX INFO: renamed from: W */
    public VText f35966W;

    /* JADX INFO: renamed from: W0 */
    public VText f35967W0;

    /* JADX INFO: renamed from: W1 */
    public VText f35968W1;

    /* JADX INFO: renamed from: X */
    public SettingsFilterItemWithInfo f35969X;

    /* JADX INFO: renamed from: X0 */
    public SeekBar f35970X0;

    /* JADX INFO: renamed from: X1 */
    public SeekBar f35971X1;

    /* JADX INFO: renamed from: Y */
    public VFrame f35972Y;

    /* JADX INFO: renamed from: Y0 */
    public SettingsItem f35973Y0;

    /* JADX INFO: renamed from: Y1 */
    public VFrame f35974Y1;

    /* JADX INFO: renamed from: Z */
    public VSwitch f35975Z;

    /* JADX INFO: renamed from: Z0 */
    public SettingsItem f35976Z0;

    /* JADX INFO: renamed from: Z1 */
    public VFrame f35977Z1;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f35978a;

    /* JADX INFO: renamed from: a1 */
    public SettingsItem f35979a1;

    /* JADX INFO: renamed from: a2 */
    public VText f35980a2;

    /* JADX INFO: renamed from: b */
    public VProgressBar f35981b;

    /* JADX INFO: renamed from: b1 */
    public SettingsItem f35982b1;

    /* JADX INFO: renamed from: b2 */
    public VText f35983b2;

    /* JADX INFO: renamed from: c */
    public VScroll f35984c;

    /* JADX INFO: renamed from: c1 */
    public SettingsItem f35985c1;

    /* JADX INFO: renamed from: c2 */
    public AgeRangeSeekBar f35986c2;

    /* JADX INFO: renamed from: d */
    public LinearLayout f35987d;

    /* JADX INFO: renamed from: d1 */
    public SettingsItem f35988d1;

    /* JADX INFO: renamed from: d2 */
    public C8848a f35989d2;

    /* JADX INFO: renamed from: e */
    public FrameLayout f35990e;

    /* JADX INFO: renamed from: e1 */
    public VLinear f35991e1;

    /* JADX INFO: renamed from: f */
    public VText f35993f;

    /* JADX INFO: renamed from: f1 */
    public SettingsItem f35994f1;

    /* JADX INFO: renamed from: f2 */
    public PutongFrag f35995f2;

    /* JADX INFO: renamed from: g */
    public View f35996g;

    /* JADX INFO: renamed from: g1 */
    public View f35997g1;

    /* JADX INFO: renamed from: h */
    public VText f35999h;

    /* JADX INFO: renamed from: h1 */
    public LinearLayout f36000h1;

    /* JADX INFO: renamed from: i */
    public VFrame f36002i;

    /* JADX INFO: renamed from: i1 */
    public SeekBar f36003i1;

    /* JADX INFO: renamed from: j */
    public VText f36005j;

    /* JADX INFO: renamed from: j1 */
    public VText f36006j1;

    /* JADX INFO: renamed from: k */
    public VText f36008k;

    /* JADX INFO: renamed from: k0 */
    public VFrame f36009k0;

    /* JADX INFO: renamed from: k1 */
    public VFrame f36010k1;

    /* JADX INFO: renamed from: l */
    public VText f36011l;

    /* JADX INFO: renamed from: l1 */
    public VFrame f36012l1;

    /* JADX INFO: renamed from: m */
    public LinearLayout f36013m;

    /* JADX INFO: renamed from: m1 */
    public VText f36014m1;

    /* JADX INFO: renamed from: n */
    public VText f36015n;

    /* JADX INFO: renamed from: n1 */
    public AgeRangeSeekBar f36016n1;

    /* JADX INFO: renamed from: o */
    public LinearLayout f36017o;

    /* JADX INFO: renamed from: o1 */
    public VText f36018o1;

    /* JADX INFO: renamed from: p */
    public VFrame f36019p;

    /* JADX INFO: renamed from: p0 */
    public LinearLayout f36020p0;

    /* JADX INFO: renamed from: p1 */
    public View f36021p1;

    /* JADX INFO: renamed from: q */
    public VText f36022q;

    /* JADX INFO: renamed from: q1 */
    public SettingsItem f36023q1;

    /* JADX INFO: renamed from: r */
    public LinearLayout f36024r;

    /* JADX INFO: renamed from: r1 */
    public SettingsItem f36025r1;

    /* JADX INFO: renamed from: s */
    public VText f36026s;

    /* JADX INFO: renamed from: s1 */
    public SettingsItem f36027s1;

    /* JADX INFO: renamed from: t */
    public SeekBar f36028t;

    /* JADX INFO: renamed from: t1 */
    public SettingsItem f36029t1;

    /* JADX INFO: renamed from: u */
    public VText f36030u;

    /* JADX INFO: renamed from: u1 */
    public SettingsItem f36031u1;

    /* JADX INFO: renamed from: v */
    public VFrame f36032v;

    /* JADX INFO: renamed from: v1 */
    public SettingsItem f36033v1;

    /* JADX INFO: renamed from: w */
    public VFrame f36034w;

    /* JADX INFO: renamed from: w1 */
    public SettingsItem f36035w1;

    /* JADX INFO: renamed from: x */
    public VText f36036x;

    /* JADX INFO: renamed from: x1 */
    public SettingsItem f36037x1;

    /* JADX INFO: renamed from: y */
    public SeekBar f36038y;

    /* JADX INFO: renamed from: y1 */
    public SettingsItem f36039y1;

    /* JADX INFO: renamed from: z */
    public VFrame f36040z;

    /* JADX INFO: renamed from: z1 */
    public SettingsItem f36041z1;

    /* JADX INFO: renamed from: e2 */
    public final hpd0 f35992e2 = new hpd0("notificationDotClicked" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: g2 */
    public String f35998g2 = null;

    /* JADX INFO: renamed from: h2 */
    public String f36001h2 = null;

    /* JADX INFO: renamed from: i2 */
    public boolean f36004i2 = false;

    /* JADX INFO: renamed from: j2 */
    public ca40 f36007j2 = null;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_share_tantan_new_ui_button", C8849b.this.f35995f2.pageId(), vwb.m200311Y("share_to", "system"));
            CoreDlg.m44978D1(C8849b.this.getAct(), NavigationIntent.menu, vwb.m200324f0(LinkChannel.get("unknown")));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$b */
    public class b implements C4317a.a {
        public b() {
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i != 12 || !NullChecker.m81303a(intent) || i2 != -1) {
                return false;
            }
            C8849b.this.m55295E1(intent.getStringExtra("key_intl_friend_purpose"));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.settings.b$c */
    public class c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f36044a;

        public c(Runnable runnable) {
            this.f36044a = runnable;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C8849b.this.f35989d2.m55175V3(i);
            this.f36044a.run();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            C8849b.this.f35989d2.m55224x3();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f35899k2 = new hpd0("SWITCH_ACCOUNT_CLICKED", bool);
        f35900l2 = new hpd0("SHARE_DOT_CLICKED" + CoreModule.m29931H().userId(), bool);
        f35901m2 = new hpd0("ONLY_NOTIFY_CLICKED" + CoreModule.m29931H().userId(), bool);
        f35902n2 = new hpd0("NOTICE_DOT_CLICKED" + CoreModule.m29931H().userId(), bool);
        f35903o2 = t100.m186890d(50.0f);
    }

    public C8849b(PutongFrag putongFrag) {
        this.f35995f2 = putongFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m55241G0(View view) {
        getAct().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m55243H0() {
        int width = this.f36005j.getWidth();
        xdl0.m208358V(this.f36008k, width);
        xdl0.m208358V(this.f36011l, width);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m55245I0(View view) {
        zvf0.m220396r("e_intl_ai_translate", "p_settings_view");
        getAct().startActivity(AITranslateSettingAct.m54999Y1(getAct()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public /* synthetic */ void m55247J0(View view) {
        this.f35989d2.m55125B3(this.f36009k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public /* synthetic */ void m55249K0(View view) {
        zvf0.m220396r("e_setting_page_hide_active_time_button", "p_settings_view");
        this.f35989d2.m55195f3(yij0.m214942T(this.f35994f1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m55251L0(View view) {
        this.f35989d2.m55218t3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public /* synthetic */ void m55254N0(View view) {
        this.f35989d2.m55195f3(yij0.m214942T(this.f35973Y0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public /* synthetic */ void m55257P0(View view) {
        this.f35989d2.m55212p3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public /* synthetic */ void m55259Q0(View view) {
        if (xdl0.m208349O0(this.f36029t1.f35858e)) {
            f35901m2.put(Boolean.TRUE);
            this.f36029t1.m55042c(false);
        }
        boolean z = NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed;
        zvf0.m220399u("e_push_settings", "p_settings_view", vwb.m200311Y("push_status", z ? BLiveOperationTitleShowType.off : "on"));
        if (!z) {
            this.f35989d2.m55209n3();
        } else {
            uq40.m194951A();
            getAct().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("allPushEnable", true, 0, 0)).subscribe(mkd0.m154960L(mkd0.m154950B()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public /* synthetic */ void m55261R0(View view) {
        zvf0.m220396r("e_chat_settings", "p_settings_view");
        this.f35989d2.m55193e3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public /* synthetic */ void m55263S0(View view) {
        if (vy8.m200611i()) {
            f35902n2.put(Boolean.TRUE);
        }
        if (vy8.m200611i()) {
            this.f36033v1.m55042c(false);
        }
        this.f35989d2.m55191d3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m55265T0(View view) {
        this.f35989d2.m55207m3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m55267U0(View view) {
        f35900l2.put(Boolean.TRUE);
        this.f36039y1.m55042c(false);
        this.f35989d2.m55210o3();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m55288A0(Boolean bool, Boolean bool2) {
        xdl0.m208344M(this.f36009k0, bool.booleanValue());
        yij0.m214964t(this.f36009k0, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: A1 */
    public void m55289A1() {
        yij0.m214942T(this.f35922H0);
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m55290B0(VCheckBox vCheckBox) {
        boolean zIsChecked = vCheckBox.isChecked();
        zvf0.m220399u("e_sign_out_botton", m55311a1(), vwb.m200311Y("if_save_login_info", zIsChecked ? "yes" : "no"));
        this.f35989d2.m55166S3(zIsChecked);
    }

    /* JADX INFO: renamed from: B1 */
    public void m55291B1() {
        if (NullChecker.m81303a(this.f35917F1) && xdl0.m208349O0(this.f35917F1.f35858e)) {
            zvf0.m220397s("e_red_dot_me_settings_help", "p_settings_view", u4e.m191728c("red_dot", "red_dot_normal", "help_and_feedback_tab", "setting_page", "tips"));
        } else {
            zvf0.m220397s("e_red_dot_me_settings_help", "p_settings_view", u4e.m191729d());
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f35995f2.act();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m55292C1() {
        if (xdl0.m208349O0(this.f35953R1)) {
            return;
        }
        zvf0.m220397s("e_red_dot_me_settings_help", "p_settings_view", u4e.m191729d());
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m55293D0(View view) {
        final VCheckBox vCheckBox = (VCheckBox) getAct().inflater().inflate(f6c0.f95821i2, (ViewGroup) null);
        vCheckBox.setText(R$string.f18769nm);
        vCheckBox.setTextColor(-6710887);
        vCheckBox.setChecked(true);
        int iM186890d = t100.m186890d(20.0f);
        zvf0.m220368A("e_sign_out_botton", m55311a1(), vwb.m200311Y("if_save_login_info", vCheckBox.isChecked() ? "yes" : "no"));
        getAct().dialog().m20503E0(R$string.f18831pm).m20509H0(-14606047).m20500D(R$string.f18800om).m20506G(-6710887).m20520P(vCheckBox, false).m20498C(iM186890d, 0, iM186890d, 0).m20541k0(R$string.f18408c).m20556t0(R$string.f18738mm, new Runnable() { // from class: l.dre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87609a.m55290B0(vCheckBox);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m55294E0(boolean z, View view) {
        m55292C1();
        if (!z) {
            f35899k2.put(Boolean.TRUE);
        }
        this.f35953R1.setVisibility(8);
        getAct().startActivity(SwitchAccountAct.m44196V1(getAct(), null));
    }

    /* JADX INFO: renamed from: E1 */
    public final void m55295E1(String str) {
        if (TextUtils.isEmpty(str)) {
            m55297G1(null);
            return;
        }
        for (ca40 ca40Var : qne0.f155429i) {
            if (TextUtils.equals(str, ca40Var.f80004d)) {
                m55297G1(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m55296F1(boolean z) {
        if (NullChecker.m81303a(this.f36025r1)) {
            this.f36025r1.setSubTitleText(hvc0.m133156c(z ? R$string.f18280Xn : R$string.f18310Yn));
        }
    }

    /* JADX INFO: renamed from: G1 */
    public final void m55297G1(ca40 ca40Var) {
        this.f36007j2 = ca40Var;
        VText vText = this.f35966W;
        if (ca40Var != null) {
            vText.setText(ca40Var.f80002b);
        } else {
            vText.setText("");
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final /* synthetic */ void m55298M0(View view) {
        Intent intent = new Intent(getAct(), (Class<?>) NewUI1ContainerActivity.class);
        intent.putExtra("fragmentName", HelpCenterFrag.class.getSimpleName());
        getAct().startActivity(intent);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ boolean m55299O0(View view) {
        this.f35962U1.setVisibility(0);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public View m55300V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sre0.m185690b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V0 */
    public final /* synthetic */ void m55301V0() {
        this.f35984c.fullScroll(130);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8848a c8848a) {
        this.f35989d2 = c8848a;
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m55303W0(String str) {
        this.f36002i.performClick();
    }

    /* JADX INFO: renamed from: X */
    public void m55304X() {
        yij0.m214942T(this.f35988d1);
        this.f35989d2.m55184a2(yij0.m214965u(this.f35988d1));
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m55305X0(String str) {
        this.f36001h2 = null;
    }

    /* JADX INFO: renamed from: Y */
    public void m55306Y() {
        yij0.m214942T(this.f35985c1);
        this.f35989d2.m55146L1(yij0.m214965u(this.f35985c1));
    }

    /* JADX INFO: renamed from: Y0 */
    public void m55307Y0() {
    }

    /* JADX INFO: renamed from: Z */
    public void m55308Z() {
        yij0.m214942T(this.f35982b1);
        this.f35989d2.m55180Y1(yij0.m214965u(this.f35982b1));
    }

    /* JADX INFO: renamed from: Z0 */
    public void m55309Z0(Throwable th) {
        yij0.m214942T(this.f35994f1);
        yij0.m214942T(this.f35973Y0);
    }

    @Override // com.p046p1.mobile.android.app.C4317a.a
    /* JADX INFO: renamed from: a */
    public boolean mo20401a(int i, int i2, Intent intent) {
        if (intent == null || i != 18) {
            return false;
        }
        Serializable serializableExtra = intent.getSerializableExtra("result_data");
        if (!(serializableExtra instanceof SettingGroups)) {
            return true;
        }
        this.f35989d2.m55178X1((SettingGroups) serializableExtra);
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public void m55310a0() {
        yij0.m214942T(this.f35979a1);
        this.f35989d2.m55182Z1(yij0.m214965u(this.f35979a1));
    }

    /* JADX INFO: renamed from: a1 */
    public String m55311a1() {
        return this.f35995f2.pageId();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f35995f2.act();
    }

    /* JADX INFO: renamed from: b0 */
    public void m55312b0() {
        if (!yij0.m214965u(this.f35976Z0)) {
            CoreDlg.m45047a2(getAct(), new Runnable() { // from class: l.kre0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124349a.m55337p0();
                }
            });
        } else {
            yij0.m214942T(this.f35976Z0);
            this.f35989d2.m55163R3(false);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m55313c0() {
        if (NullChecker.m81303a(this.f35995f2.getArguments())) {
            return this.f35995f2.getArguments().getBoolean("autoSearch", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public String m55314d0() {
        return NullChecker.m81303a(this.f35995f2.getArguments()) ? this.f35995f2.getArguments().getString("gender", "") : "";
    }

    /* JADX INFO: renamed from: d1 */
    public void m55315d1() {
        if (f35901m2.get().booleanValue() || NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed) {
            this.f36029t1.m55042c(false);
        } else {
            this.f36029t1.m55042c(true);
        }
        NotificationCheckerCommon.State stateM79220a = NotificationCheckerCommon.m79220a();
        NotificationCheckerCommon.State state = NotificationCheckerCommon.State.closed;
        SettingsItem settingsItem = this.f36029t1;
        if (stateM79220a == state) {
            settingsItem.setSubTitleText("当前无法接收新消息通知");
        } else {
            settingsItem.setSubTitleText("设置接收的消息类型和内容");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public int m55316e0() {
        if (NullChecker.m81303a(this.f35995f2.getArguments())) {
            return this.f35995f2.getArguments().getInt("maxAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: e1 */
    public void m55317e1(boolean z, int i) {
        this.f35917F1.f35858e.setBackgroundResource(i);
        m55340q1(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f0 */
    public int m55318f0() {
        if (NullChecker.m81303a(this.f35995f2.getArguments())) {
            return this.f35995f2.getArguments().getInt("minAge", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f1 */
    public void m55319f1(boolean z) {
        yij0.m214964t(this.f35994f1, z);
        yij0.m214964t(this.f35973Y0, z);
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m55320g0() {
        if (NullChecker.m81303a(this.f35995f2.getArguments())) {
            return this.f35995f2.getArguments().getBoolean("scroll_to_bottom", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: g1 */
    public void m55321g1(String str) {
        this.f35980a2.setText(str);
    }

    /* JADX INFO: renamed from: h0 */
    public int m55322h0() {
        if (NullChecker.m81303a(this.f35995f2.getArguments())) {
            return this.f35995f2.getArguments().getInt("searchRadius", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public void m55323h1(boolean z) {
        View view = this.f35996g;
        if (z) {
            view.setVisibility(0);
            this.f35990e.setVisibility(0);
        } else {
            view.setVisibility(8);
            this.f35990e.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55324i0() {
        boolean zIsBlackDiamondVIP = CoreModule.f17545c.f19639e0.m169527p9().isBlackDiamondVIP();
        VLinear vLinear = this.f35919G0;
        if (!zIsBlackDiamondVIP) {
            xdl0.m208344M(vLinear, false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        yij0.m214964t(this.f35922H0, true ^ CoreModule.f17545c.f19639e0.m169527p9().hideBlackDiamondTag());
        xdl0.m208329E0(this.f35922H0, new View.OnClickListener() { // from class: l.gre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104052a.m55339q0(view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m55300V(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55325j0() {
        xdl0.m208344M(this.f35925I0, true);
        xdl0.m208344M(this.f36002i, false);
        xdl0.m208344M(this.f35928J0, true);
        VFrame vFrame = this.f35931K0;
        this.f36002i = vFrame;
        xdl0.m208344M(vFrame, true);
        this.f36005j = this.f35934L0;
        this.f36008k = this.f35937M0;
        this.f36011l = this.f35940N0;
        this.f36013m = null;
        this.f36015n = this.f35943O0;
        xdl0.m208345M0(this.f36034w, false);
        xdl0.m208345M0(this.f36038y, false);
        xdl0.m208344M(this.f35961U0, true);
        this.f36034w = this.f35964V0;
        this.f36036x = this.f35967W0;
        this.f36038y = this.f35970X0;
    }

    /* JADX INFO: renamed from: j1 */
    public void m55326j1() {
        e51.m114742G(new Runnable() { // from class: l.fre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98926a.m55301V0();
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public void m55327k0() {
        int iM55143J3;
        if (nkp.m159982a() || !IntlCountryCodeController.m28119o()) {
            xdl0.m208329E0(this.f36002i, this.f35989d2.m55205l3());
            this.f35989d2.m55188c2();
        } else {
            this.f36002i.setVisibility(8);
        }
        xdl0.m208329E0(this.f35977Z1, this.f35989d2.m55222w3());
        this.f35989d2.m55154O3();
        Runnable runnable = new Runnable() { // from class: l.qqe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f155885a.m55344s0();
            }
        };
        runnable.run();
        boolean zM28110f = IntlCountryCodeController.m28110f();
        SeekBar seekBar = this.f35971X1;
        if (zM28110f) {
            seekBar.setMax(60);
            iM55143J3 = this.f35989d2.m55140I3();
        } else {
            seekBar.setMax(this.f35989d2.m55141J1());
            iM55143J3 = this.f35989d2.m55143J3();
            if (iM55143J3 == this.f35971X1.getProgress()) {
                this.f35971X1.setProgress(iM55143J3 + 1);
            }
        }
        this.f35971X1.setProgress(iM55143J3);
        this.f35971X1.setOnSeekBarChangeListener(new c(runnable));
        yij0.m214964t(this.f35974Y1, this.f35989d2.m55132F1());
        this.f35974Y1.setOnClickListener(new View.OnClickListener() { // from class: l.rqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160619a.m55346t0(view);
            }
        });
        final Runnable runnable2 = new Runnable() { // from class: l.tqe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171578a.m55348u0();
            }
        };
        runnable2.run();
        this.f35986c2.m223171e(Integer.valueOf(this.f35989d2.m55158Q1()), Integer.valueOf(this.f35989d2.m55155P1()));
        this.f35986c2.setSelectedMinValue(Integer.valueOf(this.f35989d2.m55164S1()));
        this.f35986c2.setSelectedMaxValue(Integer.valueOf(this.f35989d2.m55161R1()));
        this.f35986c2.setNotifyWhileDragging(true);
        this.f35986c2.setOnRangeSeekBarChangeListener(new VRangeSeekBar.InterfaceC22563b() { // from class: l.uqe0
            @Override // p147v.VRangeSeekBar.InterfaceC22563b
            /* JADX INFO: renamed from: a */
            public final void mo194990a(VRangeSeekBar vRangeSeekBar, Object obj, Object obj2, boolean z) {
                this.f177743a.m55350v0(runnable2, vRangeSeekBar, (Integer) obj, (Integer) obj2, z);
            }
        });
        if (this.f35989d2.m55173V1() == null) {
            xdl0.m208344M(this.f36020p0, false);
        } else {
            this.f35916F0.setText(this.f35989d2.m55173V1());
            xdl0.m208329E0(this.f35913E0, new View.OnClickListener() { // from class: l.vqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182626a.m55354x0(view);
                }
            });
        }
        m55333n0();
    }

    /* JADX INFO: renamed from: k1 */
    public void m55328k1(String str) {
        this.f36023q1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m55329l0() {
        zvf0.m220402x("e_intl_show_verified_switch", "p_settings_view");
        uld0.m194220e().m194230n();
        xdl0.m208344M(this.f35960U, true);
        xdl0.m208344M(this.f35969X, true);
        boolean zMo33937ve = CoreModule.f17557o.m195057d().mo33937ve(CoreModule.f17545c.f19639e0.m169520na());
        SettingsFilterItemWithInfo settingsFilterItemWithInfo = this.f35969X;
        if (zMo33937ve) {
            settingsFilterItemWithInfo.setTitleIconRes(x2c0.f189699Rc);
            VText vText = this.f35963V;
            mqa.m155878a(vText, vText.getContext().getResources().getDrawable(x2c0.f189699Rc));
        } else {
            settingsFilterItemWithInfo.setTitleIconRes(x2c0.f189668Qc);
            VText vText2 = this.f35963V;
            mqa.m155878a(vText2, vText2.getContext().getResources().getDrawable(x2c0.f189668Qc));
        }
        this.f35969X.m55362j0(true ^ uld0.m194220e().m194226h().get().booleanValue());
        xdl0.m208329E0(this.f35969X, new View.OnClickListener() { // from class: l.ere0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92910a.m55355y0(view);
            }
        });
    }

    /* JADX INFO: renamed from: l1 */
    public void m55330l1(AdvancedSettings advancedSettings) {
        advancedSettings.realFace = Boolean.valueOf(yij0.m214965u(this.f35969X));
        ca40 ca40Var = this.f36007j2;
        if (ca40Var != null) {
            advancedSettings.intlFriendPurpose = ca40Var.f80004d;
        } else {
            advancedSettings.intlFriendPurpose = "";
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m55331m0(AdvancedSettings advancedSettings) {
        yij0.m214964t(this.f35969X, advancedSettings.realFace.booleanValue());
        this.f35969X.m55361i0();
        m55295E1(advancedSettings.intlFriendPurpose);
        xdl0.m208329E0(this.f35960U, new View.OnClickListener() { // from class: l.zqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204376a.m55357z0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public void m55332m1(String str) {
        if (NullChecker.m81303a(this.f36011l)) {
            this.f36011l.setText(str);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m55333n0() {
        this.f35989d2.m55190d2(new f30() { // from class: l.yqe0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f199548a.m55288A0((Boolean) obj, (Boolean) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public void m55334n1(String str) {
        if (NullChecker.m81303a(this.f36008k)) {
            this.f36008k.setText(str);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m55335o0() {
        xdl0.m208329E0(this.f35956S1, new View.OnClickListener() { // from class: l.hqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109053a.m55293D0(view);
            }
        });
        if (!CoreModule.m29936Q().mo67281rb()) {
            this.f35947P1.setVisibility(8);
            this.f35953R1.setVisibility(8);
            return;
        }
        final boolean zBooleanValue = f35899k2.get().booleanValue();
        this.f35947P1.setVisibility(0);
        this.f35953R1.setVisibility(0);
        this.f35950Q1.setTypeface(eqh0.m117752c(3));
        this.f35947P1.setOnClickListener(new View.OnClickListener() { // from class: l.sqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165981a.m55294E0(zBooleanValue, view);
            }
        });
    }

    /* JADX INFO: renamed from: o1 */
    public void m55336o1(boolean z) {
        this.f35909C1.m55042c(z);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m55337p0() {
        yij0.m214942T(this.f35976Z0);
        this.f35989d2.m55163R3(yij0.m214965u(this.f35976Z0));
    }

    /* JADX INFO: renamed from: p1 */
    public void m55338p1(String str) {
        this.f35909C1.setSubTitleText(str);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m55339q0(View view) {
        this.f35989d2.m55189c3(CoreModule.f17545c.f19639e0.m169527p9().hideBlackDiamondTag());
    }

    /* JADX INFO: renamed from: q1 */
    public void m55340q1(Boolean bool) {
        this.f35917F1.m55042c(bool.booleanValue());
    }

    /* JADX INFO: renamed from: r */
    public void m55341r() {
        if (this.f35911D1 == null) {
            this.f35911D1 = (SettingsItem) this.f35987d.findViewById(u4c0.f174249fc);
        }
        this.f35978a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.lre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129693a.m55241G0(view);
            }
        });
        this.f35978a.getLeftIconContainer().setBackgroundResource(x2c0.f190442p);
        this.f36005j.post(new Runnable() { // from class: l.rre0
            @Override // java.lang.Runnable
            public final void run() {
                this.f160742a.m55243H0();
            }
        });
        this.f35968W1 = this.f35930K;
        this.f35971X1 = this.f35936M;
        this.f35974Y1 = this.f35939N;
        this.f35977Z1 = this.f35942O;
        this.f35980a2 = this.f35945P;
        this.f35983b2 = this.f35951R;
        this.f35986c2 = this.f35957T;
        if (g6a.m124564m()) {
            m55325j0();
        }
        this.f35965V1.setVisibility(0);
        this.f36015n.setText(R$string.f18702lh);
        m55353w1(wvv.m205781u() || wvv.m205780t());
        xdl0.m208344M(this.f35946P0, false);
        if (xdl0.m208349O0(this.f35946P0)) {
            xdl0.m208344M(this.f35988d1, true);
            this.f35988d1.setSubTitleText(getAct().string(R$string.f18688l3));
            if (upa.m194629E2()) {
                this.f35976Z0.setTitleText("仅限心动对象可见");
                this.f35976Z0.setSubTitleText("开启后，只有你右滑过的人才能滑到你");
            }
            xdl0.m208329E0(this.f35976Z0, this.f35989d2.m55203k3());
            xdl0.m208329E0(this.f35979a1, this.f35989d2.m55202j3());
            xdl0.m208329E0(this.f35982b1, this.f35989d2.m55201i3());
            xdl0.m208329E0(this.f35985c1, this.f35989d2.m55199h3());
            xdl0.m208329E0(this.f35988d1, this.f35989d2.m55197g3());
            xdl0.m208329E0(this.f35973Y0, new View.OnClickListener() { // from class: l.iqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114499a.m55254N0(view);
                }
            });
            xdl0.m208385l(this.f35958T0, getAct().drawable(VipNewUtils.m57510g()));
        } else {
            xdl0.m208344M(this.f35949Q0, false);
        }
        xdl0.m208329E0(this.f35993f, this.f35989d2.m55228z3());
        this.f35959T1.setText(this.f35989d2.m55176W1());
        this.f35962U1.setText(tre0.m190411a());
        this.f35959T1.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.jqe0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f119260a.m55299O0(view);
            }
        });
        qqh0 qqh0Var = qqh0.INSTANCE;
        if (qqh0Var.m175930i()) {
            this.f35917F1.setTitleText(getAct().getString(R$string.f17967Na));
        }
        xdl0.m208329E0(this.f35917F1, this.f35989d2.m55145K3());
        this.f35989d2.m55129D3();
        xdl0.m208329E0(this.f36023q1, this.f35989d2.m55217s3());
        if (upa.m194624D2()) {
            this.f36025r1.setTitleText("隐私设置");
        }
        xdl0.m208329E0(this.f36025r1, new View.OnClickListener() { // from class: l.kqe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124254a.m55257P0(view);
            }
        });
        if (upa.m194624D2()) {
            xdl0.m208344M(this.f36033v1, false);
            xdl0.m208344M(this.f36029t1, true);
            xdl0.m208344M(this.f36031u1, true);
            zvf0.m220402x("e_push_settings", "p_settings_view");
            xdl0.m208329E0(this.f36029t1, new View.OnClickListener() { // from class: l.lqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129330a.m55259Q0(view);
                }
            });
            zvf0.m220402x("e_chat_settings", "p_settings_view");
            xdl0.m208329E0(this.f36031u1, new View.OnClickListener() { // from class: l.mqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135216a.m55261R0(view);
                }
            });
        } else {
            if (vy8.m200611i() && !f35902n2.get().booleanValue()) {
                this.f36033v1.m55042c(true);
            }
            xdl0.m208329E0(this.f36033v1, new View.OnClickListener() { // from class: l.nqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140059a.m55263S0(view);
                }
            });
        }
        if (upa.m194629E2()) {
            xdl0.m208344M(this.f36025r1, false);
            xdl0.m208344M(this.f36037x1, true);
            xdl0.m208344M(this.f36039y1, true);
            xdl0.m208329E0(this.f36037x1, new View.OnClickListener() { // from class: l.oqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145132a.m55265T0(view);
                }
            });
            xdl0.m208329E0(this.f36039y1, new View.OnClickListener() { // from class: l.pqe0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150783a.m55267U0(view);
                }
            });
            if (!f9k0.m120088a() && !f35900l2.get().booleanValue()) {
                this.f36039y1.m55042c(true);
            }
        }
        if (CoreModule.m29936Q().hasLiveSettingEntry()) {
            xdl0.m208344M(this.f36041z1, true);
            xdl0.m208329E0(this.f36041z1, this.f35989d2.m55219u3());
        }
        xdl0.m208329E0(this.f35911D1, new View.OnClickListener() { // from class: l.mre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135360a.m55245I0(view);
            }
        });
        xdl0.m208329E0(this.f35905A1, this.f35989d2.m55226y3());
        xdl0.m208329E0(this.f35909C1, this.f35989d2.m55220v3());
        xdl0.m208329E0(this.f35926I1, this.f35989d2.m55215r3());
        xdl0.m208329E0(this.f36009k0, new View.OnClickListener() { // from class: l.nre0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140185a.m55247J0(view);
            }
        });
        xdl0.m208344M(this.f35944O1, vdj.m197999a() || nkp.m159983b());
        if (vdj.m197999a() || nkp.m159983b()) {
            xdl0.m208329E0(this.f35944O1, this.f35989d2.m55213q3());
        }
        zvf0.m220402x("e_setting_page_hide_active_time_button", "p_settings_view");
        xdl0.m208344M(this.f35991e1, true);
        xdl0.m208329E0(this.f35994f1, new View.OnClickListener() { // from class: l.ore0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145267a.m55249K0(view);
            }
        });
        if (u59.m191810S()) {
            m55329l0();
        }
        this.f35995f2.setHasOptionsMenu(true);
        getAct().setTitle(R$string.f18519fi);
        this.f35989d2.m55186b2();
        this.f35989d2.m55135H1();
        m55324i0();
        if (upa.m194711W2()) {
            xdl0.m208344M(this.f36027s1, true);
            this.f36027s1.setTitleText("防骚扰");
            this.f36027s1.setSubTitleText("开启后，在聊天中将不再收到相关消息");
            xdl0.m208329E0(this.f36027s1, new View.OnClickListener() { // from class: l.pre0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150876a.m55251L0(view);
                }
            });
        }
        if (qqh0Var.m175930i()) {
            xdl0.m208344M(this.f35920G1, true);
            this.f35920G1.setOnClickListener(new View.OnClickListener() { // from class: l.qre0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155985a.m55298M0(view);
                }
            });
            xdl0.m208344M(this.f35923H1, true);
            this.f35923H1.setOnClickListener(new a());
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m55342r0(String str) {
        this.f35968W1.setText(str);
    }

    /* JADX INFO: renamed from: r1 */
    public void m55343r1(int i) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_suggest_users_gender_selection_view", Dialog.class.getName());
        getAct().dialog().m20503E0(R$string.f18402bo).m20536f0(this.f35989d2.f35883m).m20538h0(i, this.f35989d2.m55150N1(i)).m20541k0(R$string.f18408c).m20497B0(new DialogInterface.OnShowListener() { // from class: l.ire0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.jre0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m55344s0() {
        this.f35989d2.m55172U3(new e30() { // from class: l.cre0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82212a.m55342r0((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s1 */
    public void m55345s1(SettingGroups settingGroups) {
        if (NullChecker.m81303a(this.f35995f2) && NullChecker.m81303a(getAct())) {
            getAct().startActivityForResult(IntlSettingGenderAct.INSTANCE.m55008a(getAct(), settingGroups), 18);
            getAct().registerOnActivityResultListener(this);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m55346t0(View view) {
        this.f35989d2.m55149M3(yij0.m214942T(this.f35974Y1));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m55347t1() {
        CoreModule.m29935P().m94651a().mo33565pr(getAct(), "{p_settings_view,e_intl_show_verified_switch,click}", Privilege.intl_advanced_filter);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m55348u0() {
        this.f35983b2.setText(this.f35989d2.m55167T1());
    }

    /* JADX INFO: renamed from: u1 */
    public void m55349u1(boolean z) {
        VScroll vScroll = this.f35984c;
        if (z) {
            vScroll.setVisibility(4);
            this.f35981b.setVisibility(0);
        } else {
            vScroll.setVisibility(0);
            this.f35981b.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m55350v0(final Runnable runnable, VRangeSeekBar vRangeSeekBar, Integer num, Integer num2, boolean z) {
        this.f35989d2.m55169T3(num.intValue(), num2.intValue(), new d30() { // from class: l.hre0
            @Override // p149l.d30
            public final void call() {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: v1 */
    public void m55351v1() {
        if (TextUtils.isEmpty(this.f36001h2)) {
            jtk jtkVar = new jtk(getAct());
            TextView textView = new TextView(getAct());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R$string.f17980Nn);
            textView.getPaint().setFakeBoldText(true);
            jtkVar.m143118j(textView).m143113e(-17664).m143117i(jtk.f119614A | jtk.f119616C).m143121m(t100.m186890d(90.0f)).m143122n(t100.m186890d(5.0f)).m143116h(70).m143114f(t100.m186890d(10.0f)).m143123o(t100.m186890d(5.0f)).m143109a(3000L).m143111c(true).m143110b(new jtk.InterfaceC17856a() { // from class: l.wqe0
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f187689a.m55303W0(str);
                }
            }).m143112d(new jtk.InterfaceC17857b() { // from class: l.xqe0
                @Override // p149l.jtk.InterfaceC17857b
                /* JADX INFO: renamed from: a */
                public final void mo135260a(String str) {
                    this.f194006a.m55305X0(str);
                }
            });
            this.f36001h2 = ptk.m171332h().m171344r(jtkVar, this.f36011l, this.f35987d);
            CoreModule.f17545c.f19654j0.f19288a0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m55352w0(List list, Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f35916F0.setText(charSequence);
        this.f35989d2.m55152N3(list, i);
    }

    /* JADX INFO: renamed from: w1 */
    public void m55353w1(boolean z) {
        LinearLayout linearLayout = this.f36013m;
        if (linearLayout != null) {
            xdl0.m208344M(linearLayout, z);
        } else if (g6a.m124564m()) {
            xdl0.m208344M(this.f35943O0, z);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m55354x0(View view) {
        final ArrayList arrayListM200324f0 = vwb.m200324f0(getAct().getString(R$string.f17920Ln), getAct().getString(R$string.f17860Jn), getAct().getString(R$string.f17950Mn), getAct().getString(R$string.f17890Kn));
        getAct().dialog().m20503E0(R$string.f17830In).m20535e0(arrayListM200324f0).m20538h0(this.f35989d2.m55170U1(arrayListM200324f0), new Dialog.InterfaceC4311g() { // from class: l.are0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f71262a.m55352w0(arrayListM200324f0, dialog, view2, i, charSequence);
            }
        }).m20567z().show();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m55355y0(View view) {
        zvf0.m220396r("e_intl_show_verified_switch", "p_settings_view");
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        uld0.m194220e().m194232p();
        this.f35969X.m55362j0(false);
        if (userM169527p9 == null) {
            return;
        }
        if (!yij0.m214965u(this.f35969X) && xma.m210071e4() && xma.m210081j4()) {
            m55347t1();
        } else {
            yij0.m214942T(this.f35969X);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public void m55356y1() {
        yij0.m214942T(this.f35994f1);
        C8764c.m53403J1(getAct(), "p_settings,privacy", Privilege.vip_membership_active_time_gp);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m55357z0(View view) {
        ca40 ca40Var = this.f36007j2;
        getAct().startActivityForResult(12, RelationshipLookingAct.m55679V1(view.getContext(), ca40Var != null ? ca40Var.f80004d : ""), new b());
        zvf0.m220396r("e_intl_select_looking_for", "p_settings_view");
    }

    /* JADX INFO: renamed from: z1 */
    public void m55358z1() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_school_identify_makeSure_guide", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_system", "priority_recommend_student_button", "setting_page", "click"));
        i0e.m133797f(cwf0VarM133794c);
        getAct().dialog().m20504F(getAct().getString(R$string.f18161To)).m20543m0(getAct().getString(R$string.f18408c)).m20560v0(getAct().getString(R$string.f17717F0), this.f35989d2.m55123A3()).m20526V(new DialogInterface.OnDismissListener() { // from class: l.bre0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
    }
}
