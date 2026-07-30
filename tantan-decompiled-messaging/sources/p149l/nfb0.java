package p149l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VIcon;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class nfb0 implements s7m<seb0> {

    /* JADX INFO: renamed from: A */
    public boolean f138730A = false;

    /* JADX INFO: renamed from: B */
    public boolean f138731B = false;

    /* JADX INFO: renamed from: C */
    public String f138732C = "";

    /* JADX INFO: renamed from: a */
    public VNavigationBar f138733a;

    /* JADX INFO: renamed from: b */
    public VLinear f138734b;

    /* JADX INFO: renamed from: c */
    public VText f138735c;

    /* JADX INFO: renamed from: d */
    public VListCell f138736d;

    /* JADX INFO: renamed from: e */
    public VListCell f138737e;

    /* JADX INFO: renamed from: f */
    public VLinear f138738f;

    /* JADX INFO: renamed from: g */
    public VText f138739g;

    /* JADX INFO: renamed from: h */
    public View f138740h;

    /* JADX INFO: renamed from: i */
    public VLinear f138741i;

    /* JADX INFO: renamed from: j */
    public VText f138742j;

    /* JADX INFO: renamed from: k */
    public VListCell f138743k;

    /* JADX INFO: renamed from: l */
    public VListCell f138744l;

    /* JADX INFO: renamed from: m */
    public VListCell f138745m;

    /* JADX INFO: renamed from: n */
    public VLinear f138746n;

    /* JADX INFO: renamed from: o */
    public VText f138747o;

    /* JADX INFO: renamed from: p */
    public VText f138748p;

    /* JADX INFO: renamed from: q */
    public VListCell f138749q;

    /* JADX INFO: renamed from: r */
    public VLinear f138750r;

    /* JADX INFO: renamed from: s */
    public View f138751s;

    /* JADX INFO: renamed from: t */
    public VText f138752t;

    /* JADX INFO: renamed from: u */
    public VListCell f138753u;

    /* JADX INFO: renamed from: v */
    public VLinear f138754v;

    /* JADX INFO: renamed from: w */
    public VText f138755w;

    /* JADX INFO: renamed from: x */
    public VText f138756x;

    /* JADX INFO: renamed from: y */
    public Act f138757y;

    /* JADX INFO: renamed from: z */
    public seb0 f138758z;

    public nfb0(Act act) {
        this.f138757y = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m159178E(View view) {
        this.f138757y.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m159179F(View view) {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed) {
            this.f138730A = true;
            uq40.m194951A();
            return;
        }
        boolean zM214942T = yij0.m214942T(this.f138736d);
        zvf0.m220399u("e_push_switch", "p_message_push_settings", vwb.m200311Y("push_switch", zM214942T ? "off_on" : "on_off"));
        seb0 seb0Var = this.f138758z;
        if (zM214942T) {
            seb0Var.m183596q0("allPushEnable", true);
        } else {
            seb0Var.m183596q0("allPushEnable", false);
        }
        m159217U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m159180G(View view) {
        zvf0.m220368A("e_pushoff_mode_timesetting", "p_message_push_settings", vwb.m200311Y("pushoff_time_setting", ark.f71284g.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip()) + "-" + ark.f71285h.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip() - 1)));
        ark.m98457X0(this.f138757y, CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip(), CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip(), new f30() { // from class: l.dfb0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f85910a.m159211O((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m159181H(View view) {
        boolean zM214942T = yij0.m214942T(this.f138737e);
        zvf0.m220399u("e_push_detail_switch", "p_message_push_settings", vwb.m200311Y("push_switch", zM214942T ? "off_on" : "on_off"));
        this.f138758z.m183592k0(zM214942T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m159182I(View view) {
        boolean zM214942T = yij0.m214942T(this.f138743k);
        zvf0.m220399u("e_friend_message_switch", "p_message_push_settings", vwb.m200311Y("push_switch_change", zM214942T ? "off2on" : "on2off"));
        seb0 seb0Var = this.f138758z;
        if (zM214942T) {
            seb0Var.m183596q0("msgPush", true);
        } else {
            seb0Var.m183596q0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m159183J(View view) {
        boolean zM214942T = yij0.m214942T(this.f138744l);
        zvf0.m220399u("e_moment_push_switch", "p_message_push_settings", vwb.m200311Y("push_switch_change", zM214942T ? "off2on" : "on2off"));
        seb0 seb0Var = this.f138758z;
        if (zM214942T) {
            seb0Var.m183596q0("momentPush", true);
        } else {
            seb0Var.m183596q0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m159184K(View view) {
        boolean zM214942T = yij0.m214942T(this.f138745m);
        zvf0.m220399u("e_live_push_switch", "p_message_push_settings", vwb.m200311Y("push_switch_change", zM214942T ? "off2on" : "on2off"));
        seb0 seb0Var = this.f138758z;
        if (zM214942T) {
            seb0Var.m183596q0("livePush", true);
        } else {
            seb0Var.m183596q0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m159185L(View view) {
        zvf0.m220396r("e_chatroom_setting", "p_message_push_settings");
        m159220X(this.f138757y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m159186M(View view) {
        boolean zM214942T = yij0.m214942T(this.f138749q);
        zvf0.m220399u("e_personal_reference_switch", "p_message_push_settings", vwb.m200311Y("push_switch_change", zM214942T ? "off2on" : "on2off"));
        seb0 seb0Var = this.f138758z;
        if (zM214942T) {
            seb0Var.m183596q0("recommendPush", true);
        } else {
            seb0Var.m183596q0("recommendPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m159187N(View view) {
        boolean zM214942T = yij0.m214942T(this.f138753u);
        zvf0.m220399u("e_pushoff_mode_switch", "p_message_push_settings", vwb.m200311Y("push_switch_change", zM214942T ? "off2on" : "on2off"));
        VLinear vLinear = this.f138754v;
        if (zM214942T) {
            xdl0.m208344M(vLinear, true);
            this.f138758z.m183596q0("silentSwitch", true);
        } else {
            xdl0.m208344M(vLinear, false);
            this.f138758z.m183596q0("silentSwitch", false);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(seb0 seb0Var) {
        this.f138758z = seb0Var;
    }

    /* JADX INFO: renamed from: B */
    public void m159209B() {
        this.f138757y.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ueb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176022a.m159210C((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m159210C(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m159219W();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m159211O(Integer num, Integer num2) {
        this.f138758z.m183597r0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f138756x;
        StringBuilder sb = new StringBuilder();
        List<String> list = ark.f71284g;
        sb.append(list.get(num.intValue()));
        sb.append(" - ");
        List<String> list2 = ark.f71285h;
        sb.append(list2.get(num2.intValue()));
        vText.setText(sb.toString());
        zvf0.m220400v("e_pushoff_mode_timesetting", "p_message_push_settings", vwb.m200311Y("pushoff_time_setting", list.get(num.intValue()) + "-" + list2.get(num2.intValue())));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m159212P(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f138732C = "all";
        xdl0.m208344M(vImage, true);
        xdl0.m208344M(vImage2, false);
        xdl0.m208344M(vImage3, false);
        xdl0.m208344M(vImage4, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m159213Q(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f138732C = "like";
        xdl0.m208344M(vImage, false);
        xdl0.m208344M(vImage2, true);
        xdl0.m208344M(vImage3, false);
        xdl0.m208344M(vImage4, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m159214R(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f138732C = "friend";
        xdl0.m208344M(vImage, false);
        xdl0.m208344M(vImage2, false);
        xdl0.m208344M(vImage3, true);
        xdl0.m208344M(vImage4, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m159215S(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f138732C = "none";
        xdl0.m208344M(vImage, false);
        xdl0.m208344M(vImage2, false);
        xdl0.m208344M(vImage3, false);
        xdl0.m208344M(vImage4, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m159216T(l5j0 l5j0Var, View view) {
        this.f138758z.m183595p0(this.f138732C);
        m159218V();
        String str = this.f138732C;
        if (TextUtils.equals(str, "friend")) {
            str = "friends";
        }
        zvf0.m220399u("e_push_scope_finish", "p_push_scope_popup", vwb.m200311Y("push_scope", str));
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: U */
    public void m159217U() {
        boolean zM214965u = yij0.m214965u(this.f138736d);
        xdl0.m208344M(this.f138737e, zM214965u);
        if (this.f138731B) {
            xdl0.m208344M(this.f138738f, zM214965u);
        }
        xdl0.m208344M(this.f138740h, zM214965u);
        xdl0.m208344M(this.f138751s, zM214965u);
        xdl0.m208344M(this.f138741i, zM214965u);
        xdl0.m208344M(this.f138750r, zM214965u);
    }

    /* JADX INFO: renamed from: V */
    public void m159218V() {
        if (TextUtils.equals(this.f138732C, "all")) {
            this.f138748p.setText("所有人");
            return;
        }
        if (TextUtils.equals(this.f138732C, "like")) {
            this.f138748p.setText("仅喜欢过的人");
        } else if (TextUtils.equals(this.f138732C, "friend")) {
            this.f138748p.setText("仅好友");
        } else if (TextUtils.equals(this.f138732C, "none")) {
            this.f138748p.setText("不接收");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m159219W() {
        if (this.f138730A) {
            this.f138730A = false;
            boolean zM214942T = yij0.m214942T(this.f138736d);
            zvf0.m220399u("e_push_switch", "p_message_push_settings", vwb.m200311Y("push_switch", zM214942T ? "off_on" : "on_off"));
            seb0 seb0Var = this.f138758z;
            if (zM214942T) {
                seb0Var.m183596q0("allPushEnable", true);
            } else {
                seb0Var.m183596q0("allPushEnable", false);
            }
        }
        m159217U();
    }

    /* JADX INFO: renamed from: X */
    public void m159220X(Act act) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_push_scope_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(j760.m140076a("push_setting_source", "chatroom"));
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCancelable(true);
        l5j0Var.setContentView(f6c0.f95745db);
        VIcon vIcon = (VIcon) l5j0Var.findViewById(u4c0.f174410p4);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f174393o4);
        TextView textView2 = (TextView) l5j0Var.findViewById(u4c0.f174427q4);
        VRelative vRelative = (VRelative) l5j0Var.findViewById(u4c0.f174305j1);
        VRelative vRelative2 = (VRelative) l5j0Var.findViewById(u4c0.f174407p1);
        VRelative vRelative3 = (VRelative) l5j0Var.findViewById(u4c0.f174373n1);
        VRelative vRelative4 = (VRelative) l5j0Var.findViewById(u4c0.f174339l1);
        final VImage vImage = (VImage) l5j0Var.findViewById(u4c0.f173750C);
        final VImage vImage2 = (VImage) l5j0Var.findViewById(u4c0.f174195c9);
        final VImage vImage3 = (VImage) l5j0Var.findViewById(u4c0.f173721A4);
        final VImage vImage4 = (VImage) l5j0Var.findViewById(u4c0.f173769D1);
        VText vText = (VText) l5j0Var.findViewById(u4c0.f174322k1);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        ((VText) l5j0Var.findViewById(u4c0.f174424q1)).setTypeface(typeface);
        ((VText) l5j0Var.findViewById(u4c0.f174390o1)).setTypeface(typeface);
        ((VText) l5j0Var.findViewById(u4c0.f174356m1)).setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView.setTypeface(typeface);
        String str = this.f138758z.f163940b.getSettingGroup().live.voiceNotification;
        this.f138732C = str;
        if (TextUtils.equals(str, "all")) {
            xdl0.m208344M(vImage, true);
        } else if (TextUtils.equals(this.f138732C, "like")) {
            xdl0.m208344M(vImage2, true);
        } else if (TextUtils.equals(this.f138732C, "friend")) {
            xdl0.m208344M(vImage3, true);
        } else if (TextUtils.equals(this.f138732C, "none")) {
            xdl0.m208344M(vImage4, true);
        }
        xdl0.m208329E0(vRelative, new View.OnClickListener() { // from class: l.veb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181168a.m159212P(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        xdl0.m208329E0(vRelative2, new View.OnClickListener() { // from class: l.web0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f185919a.m159213Q(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        xdl0.m208329E0(vRelative3, new View.OnClickListener() { // from class: l.xeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192547a.m159214R(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        xdl0.m208329E0(vRelative4, new View.OnClickListener() { // from class: l.yeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197674a.m159215S(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        xdl0.m208329E0(vIcon, new View.OnClickListener() { // from class: l.zeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.dismiss();
            }
        });
        xdl0.m208329E0(textView2, new View.OnClickListener() { // from class: l.afb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69163a.m159216T(l5j0Var, view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bfb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cfb0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        Window window = l5j0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f174391o2)).setBackgroundResource(x2c0.f190182gp);
        }
        l5j0Var.show();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m159222z(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m159221r() {
        this.f138733a.setTitle("消息通知设置");
        this.f138733a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.teb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169809a.m159178E(view);
            }
        });
        this.f138743k.setTitleBottomPadding(5);
        this.f138744l.setTitleBottomPadding(5);
        this.f138745m.setTitleBottomPadding(5);
        this.f138749q.setTitleBottomPadding(5);
        this.f138753u.setTitleBottomPadding(5);
        this.f138743k.setSubTitleSize(13);
        this.f138744l.setSubTitleSize(13);
        this.f138745m.setSubTitleSize(13);
        this.f138753u.setSubTitleSize(13);
        this.f138749q.setSubTitleSize(13);
        VListCell vListCell = this.f138736d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vListCell.setTitleTypeface(typeface);
        this.f138737e.setTitleTypeface(typeface);
        this.f138743k.setTitleTypeface(typeface);
        this.f138744l.setTitleTypeface(typeface);
        this.f138745m.setTitleTypeface(typeface);
        this.f138749q.setTitleTypeface(typeface);
        this.f138753u.setTitleTypeface(typeface);
        this.f138747o.setTypeface(typeface);
        this.f138755w.setTypeface(typeface);
        this.f138735c.setTypeface(typeface);
        this.f138752t.setTypeface(typeface);
        this.f138742j.setTypeface(typeface);
        this.f138739g.setTypeface(typeface);
        yij0.m214964t(this.f138736d, CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable());
        yij0.m214964t(this.f138737e, CoreModule.f17545c.f19639e0.m169527p9().settings.previewPushMessage().booleanValue());
        yij0.m214964t(this.f138743k, CoreModule.f17545c.f19639e0.m169527p9().settings.userMsgPushTip().booleanValue());
        yij0.m214964t(this.f138744l, CoreModule.f17545c.f19639e0.m169527p9().settings.userMomentPushTip().booleanValue());
        yij0.m214964t(this.f138745m, CoreModule.f17545c.f19639e0.m169527p9().settings.userLivePushTip().booleanValue());
        yij0.m214964t(this.f138749q, CoreModule.f17545c.f19639e0.m169527p9().settings.userRecommendPushTip().booleanValue());
        yij0.m214964t(this.f138753u, CoreModule.f17545c.f19639e0.m169527p9().settings.userSilentSwitchPushTip().booleanValue());
        this.f138732C = CoreModule.f17545c.f19639e0.m169527p9().settings.uservoiceNotification();
        m159218V();
        zvf0.m220402x("e_push_switch", "p_message_push_settings");
        this.f138736d.setOnClickListener(new View.OnClickListener() { // from class: l.efb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90817a.m159179F(view);
            }
        });
        zvf0.m220402x("e_push_detail_switch", "p_message_push_settings");
        this.f138737e.setOnClickListener(new View.OnClickListener() { // from class: l.ffb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97200a.m159181H(view);
            }
        });
        this.f138731B = false;
        xdl0.m208344M(this.f138738f, false);
        zvf0.m220402x("e_friend_message_switch", "p_message_push_settings");
        this.f138743k.setOnClickListener(new View.OnClickListener() { // from class: l.gfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102355a.m159182I(view);
            }
        });
        zvf0.m220402x("e_moment_push_switch", "p_message_push_settings");
        this.f138744l.setOnClickListener(new View.OnClickListener() { // from class: l.hfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107466a.m159183J(view);
            }
        });
        zvf0.m220402x("e_live_push_switch", "p_message_push_settings");
        this.f138745m.setOnClickListener(new View.OnClickListener() { // from class: l.ifb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112973a.m159184K(view);
            }
        });
        zvf0.m220402x("e_chatroom_setting", "p_message_push_settings");
        this.f138746n.setOnClickListener(new View.OnClickListener() { // from class: l.jfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117651a.m159185L(view);
            }
        });
        zvf0.m220402x("e_personal_reference_switch", "p_message_push_settings");
        this.f138749q.setOnClickListener(new View.OnClickListener() { // from class: l.kfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122913a.m159186M(view);
            }
        });
        zvf0.m220402x("e_pushoff_mode_switch", "p_message_push_settings");
        this.f138753u.setOnClickListener(new View.OnClickListener() { // from class: l.lfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127862a.m159187N(view);
            }
        });
        this.f138754v.setOnClickListener(new View.OnClickListener() { // from class: l.mfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133575a.m159180G(view);
            }
        });
        xdl0.m208344M(this.f138754v, yij0.m214965u(this.f138753u));
        if (CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() < 0 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() > 23 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip() < 1 || CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f138756x.setText(ark.f71284g.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushStartTimeTip()) + " - " + ark.f71285h.get(CoreModule.f17545c.f19639e0.m169527p9().settings.userPushEndTimeTip() - 1));
        m159217U();
    }

    /* JADX INFO: renamed from: z */
    public View m159222z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofb0.m164062b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
