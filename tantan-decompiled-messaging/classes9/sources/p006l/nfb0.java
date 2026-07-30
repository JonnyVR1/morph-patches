package p006l;

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
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.ark;
import l.cwf0;
import l.e30;
import l.f30;
import l.i0e;
import l.j760;
import l.l5j0;
import l.mkd0;
import l.ofb0;
import l.s7m;
import l.uq40;
import l.vwb;
import l.xdl0;
import l.yij0;
import l.zvf0;
import v.VIcon;
import v.VImage;
import v.VLinear;
import v.VListCell;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nfb0 implements s7m<seb0> {

    /* JADX INFO: renamed from: A */
    public boolean f17645A = false;

    /* JADX INFO: renamed from: B */
    public boolean f17646B = false;

    /* JADX INFO: renamed from: C */
    public String f17647C = "";

    /* JADX INFO: renamed from: a */
    public VNavigationBar f17648a;

    /* JADX INFO: renamed from: b */
    public VLinear f17649b;

    /* JADX INFO: renamed from: c */
    public VText f17650c;

    /* JADX INFO: renamed from: d */
    public VListCell f17651d;

    /* JADX INFO: renamed from: e */
    public VListCell f17652e;

    /* JADX INFO: renamed from: f */
    public VLinear f17653f;

    /* JADX INFO: renamed from: g */
    public VText f17654g;

    /* JADX INFO: renamed from: h */
    public View f17655h;

    /* JADX INFO: renamed from: i */
    public VLinear f17656i;

    /* JADX INFO: renamed from: j */
    public VText f17657j;

    /* JADX INFO: renamed from: k */
    public VListCell f17658k;

    /* JADX INFO: renamed from: l */
    public VListCell f17659l;

    /* JADX INFO: renamed from: m */
    public VListCell f17660m;

    /* JADX INFO: renamed from: n */
    public VLinear f17661n;

    /* JADX INFO: renamed from: o */
    public VText f17662o;

    /* JADX INFO: renamed from: p */
    public VText f17663p;

    /* JADX INFO: renamed from: q */
    public VListCell f17664q;

    /* JADX INFO: renamed from: r */
    public VLinear f17665r;

    /* JADX INFO: renamed from: s */
    public View f17666s;

    /* JADX INFO: renamed from: t */
    public VText f17667t;

    /* JADX INFO: renamed from: u */
    public VListCell f17668u;

    /* JADX INFO: renamed from: v */
    public VLinear f17669v;

    /* JADX INFO: renamed from: w */
    public VText f17670w;

    /* JADX INFO: renamed from: x */
    public VText f17671x;

    /* JADX INFO: renamed from: y */
    public Act f17672y;

    /* JADX INFO: renamed from: z */
    public seb0 f17673z;

    public nfb0(Act act) {
        this.f17672y = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m20075E(View view) {
        this.f17672y.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m20076F(View view) {
        if (NotificationCheckerCommon.a() == NotificationCheckerCommon.State.closed) {
            this.f17645A = true;
            uq40.A();
            return;
        }
        boolean zT = yij0.T(this.f17651d);
        zvf0.u("e_push_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch", zT ? "off_on" : "on_off")});
        seb0 seb0Var = this.f17673z;
        if (zT) {
            seb0Var.m23705q0("allPushEnable", true);
        } else {
            seb0Var.m23705q0("allPushEnable", false);
        }
        m20115U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m20077G(View view) {
        zvf0.A("e_pushoff_mode_timesetting", "p_message_push_settings", new j760[]{vwb.Y("pushoff_time_setting", ((String) ark.g.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip())) + "-" + ((String) ark.h.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip() - 1)))});
        ark.X0(this.f17672y, CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip(), CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip(), new f30() { // from class: l.dfb0
            public final void call(Object obj, Object obj2) {
                this.f10382a.m20109O((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m20078H(View view) {
        boolean zT = yij0.T(this.f17652e);
        zvf0.u("e_push_detail_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch", zT ? "off_on" : "on_off")});
        this.f17673z.m23701k0(zT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m20079I(View view) {
        boolean zT = yij0.T(this.f17658k);
        zvf0.u("e_friend_message_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch_change", zT ? "off2on" : "on2off")});
        seb0 seb0Var = this.f17673z;
        if (zT) {
            seb0Var.m23705q0("msgPush", true);
        } else {
            seb0Var.m23705q0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m20080J(View view) {
        boolean zT = yij0.T(this.f17659l);
        zvf0.u("e_moment_push_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch_change", zT ? "off2on" : "on2off")});
        seb0 seb0Var = this.f17673z;
        if (zT) {
            seb0Var.m23705q0("momentPush", true);
        } else {
            seb0Var.m23705q0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m20081K(View view) {
        boolean zT = yij0.T(this.f17660m);
        zvf0.u("e_live_push_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch_change", zT ? "off2on" : "on2off")});
        seb0 seb0Var = this.f17673z;
        if (zT) {
            seb0Var.m23705q0("livePush", true);
        } else {
            seb0Var.m23705q0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m20082L(View view) {
        zvf0.r("e_chatroom_setting", "p_message_push_settings");
        m20118X(this.f17672y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m20083M(View view) {
        boolean zT = yij0.T(this.f17664q);
        zvf0.u("e_personal_reference_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch_change", zT ? "off2on" : "on2off")});
        seb0 seb0Var = this.f17673z;
        if (zT) {
            seb0Var.m23705q0("recommendPush", true);
        } else {
            seb0Var.m23705q0("recommendPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m20084N(View view) {
        boolean zT = yij0.T(this.f17668u);
        zvf0.u("e_pushoff_mode_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch_change", zT ? "off2on" : "on2off")});
        VLinear vLinear = this.f17669v;
        if (zT) {
            xdl0.M(vLinear, true);
            this.f17673z.m23705q0("silentSwitch", true);
        } else {
            xdl0.M(vLinear, false);
            this.f17673z.m23705q0("silentSwitch", false);
        }
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m20119i1(seb0 seb0Var) {
        this.f17673z = seb0Var;
    }

    /* JADX INFO: renamed from: B */
    public void m20106B() {
        this.f17672y.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ueb0
            public final void call(Object obj) {
                this.f23511a.m20107C((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m20107C(c cVar) {
        if (cVar == c.i) {
            m20117W();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m20108C0() {
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m20109O(Integer num, Integer num2) {
        this.f17673z.m23706r0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f17671x;
        StringBuilder sb = new StringBuilder();
        List list = ark.g;
        sb.append((String) list.get(num.intValue()));
        sb.append(" - ");
        List list2 = ark.h;
        sb.append((String) list2.get(num2.intValue()));
        vText.setText(sb.toString());
        zvf0.v("e_pushoff_mode_timesetting", "p_message_push_settings", new j760[]{vwb.Y("pushoff_time_setting", ((String) list.get(num.intValue())) + "-" + ((String) list2.get(num2.intValue())))});
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m20110P(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f17647C = "all";
        xdl0.M(vImage, true);
        xdl0.M(vImage2, false);
        xdl0.M(vImage3, false);
        xdl0.M(vImage4, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m20111Q(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f17647C = "like";
        xdl0.M(vImage, false);
        xdl0.M(vImage2, true);
        xdl0.M(vImage3, false);
        xdl0.M(vImage4, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m20112R(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f17647C = "friend";
        xdl0.M(vImage, false);
        xdl0.M(vImage2, false);
        xdl0.M(vImage3, true);
        xdl0.M(vImage4, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m20113S(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f17647C = AccountMakeupPageAdapter.MakeupItem.NONE;
        xdl0.M(vImage, false);
        xdl0.M(vImage2, false);
        xdl0.M(vImage3, false);
        xdl0.M(vImage4, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m20114T(l5j0 l5j0Var, View view) {
        this.f17673z.m23704p0(this.f17647C);
        m20116V();
        String str = this.f17647C;
        if (TextUtils.equals(str, "friend")) {
            str = "friends";
        }
        zvf0.u("e_push_scope_finish", "p_push_scope_popup", new j760[]{vwb.Y("push_scope", str)});
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: U */
    public void m20115U() {
        boolean zU = yij0.u(this.f17651d);
        xdl0.M(this.f17652e, zU);
        if (this.f17646B) {
            xdl0.M(this.f17653f, zU);
        }
        xdl0.M(this.f17655h, zU);
        xdl0.M(this.f17666s, zU);
        xdl0.M(this.f17656i, zU);
        xdl0.M(this.f17665r, zU);
    }

    /* JADX INFO: renamed from: V */
    public void m20116V() {
        if (TextUtils.equals(this.f17647C, "all")) {
            this.f17663p.setText("所有人");
            return;
        }
        if (TextUtils.equals(this.f17647C, "like")) {
            this.f17663p.setText("仅喜欢过的人");
        } else if (TextUtils.equals(this.f17647C, "friend")) {
            this.f17663p.setText("仅好友");
        } else if (TextUtils.equals(this.f17647C, AccountMakeupPageAdapter.MakeupItem.NONE)) {
            this.f17663p.setText("不接收");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m20117W() {
        if (this.f17645A) {
            this.f17645A = false;
            boolean zT = yij0.T(this.f17651d);
            zvf0.u("e_push_switch", "p_message_push_settings", new j760[]{vwb.Y("push_switch", zT ? "off_on" : "on_off")});
            seb0 seb0Var = this.f17673z;
            if (zT) {
                seb0Var.m23705q0("allPushEnable", true);
            } else {
                seb0Var.m23705q0("allPushEnable", false);
            }
        }
        m20115U();
    }

    /* JADX INFO: renamed from: X */
    public void m20118X(Act act) {
        final cwf0 cwf0VarC = i0e.c("p_push_scope_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{j760.a("push_setting_source", "chatroom")});
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCancelable(true);
        l5j0Var.setContentView(f6c0.f12159db);
        VIcon vIconFindViewById = l5j0Var.findViewById(u4c0.f23158p4);
        TextView textView = (TextView) l5j0Var.findViewById(u4c0.f23141o4);
        TextView textView2 = (TextView) l5j0Var.findViewById(u4c0.f23175q4);
        VRelative vRelativeFindViewById = l5j0Var.findViewById(u4c0.f23053j1);
        VRelative vRelativeFindViewById2 = l5j0Var.findViewById(u4c0.f23155p1);
        VRelative vRelativeFindViewById3 = l5j0Var.findViewById(u4c0.f23121n1);
        VRelative vRelativeFindViewById4 = l5j0Var.findViewById(u4c0.f23087l1);
        final VImage vImageFindViewById = l5j0Var.findViewById(u4c0.f22498C);
        final VImage vImageFindViewById2 = l5j0Var.findViewById(u4c0.f22943c9);
        final VImage vImageFindViewById3 = l5j0Var.findViewById(u4c0.f22469A4);
        final VImage vImageFindViewById4 = l5j0Var.findViewById(u4c0.f22517D1);
        VText vTextFindViewById = l5j0Var.findViewById(u4c0.f23070k1);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vTextFindViewById.setTypeface(typeface);
        l5j0Var.findViewById(u4c0.f23172q1).setTypeface(typeface);
        l5j0Var.findViewById(u4c0.f23138o1).setTypeface(typeface);
        l5j0Var.findViewById(u4c0.f23104m1).setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView.setTypeface(typeface);
        String str = this.f17673z.f21272b.getSettingGroup().live.voiceNotification;
        this.f17647C = str;
        if (TextUtils.equals(str, "all")) {
            xdl0.M(vImageFindViewById, true);
        } else if (TextUtils.equals(this.f17647C, "like")) {
            xdl0.M(vImageFindViewById2, true);
        } else if (TextUtils.equals(this.f17647C, "friend")) {
            xdl0.M(vImageFindViewById3, true);
        } else if (TextUtils.equals(this.f17647C, AccountMakeupPageAdapter.MakeupItem.NONE)) {
            xdl0.M(vImageFindViewById4, true);
        }
        xdl0.E0(vRelativeFindViewById, new View.OnClickListener() { // from class: l.veb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24288a.m20110P(vImageFindViewById, vImageFindViewById2, vImageFindViewById3, vImageFindViewById4, view);
            }
        });
        xdl0.E0(vRelativeFindViewById2, new View.OnClickListener() { // from class: l.web0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25118a.m20111Q(vImageFindViewById, vImageFindViewById2, vImageFindViewById3, vImageFindViewById4, view);
            }
        });
        xdl0.E0(vRelativeFindViewById3, new View.OnClickListener() { // from class: l.xeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27481a.m20112R(vImageFindViewById, vImageFindViewById2, vImageFindViewById3, vImageFindViewById4, view);
            }
        });
        xdl0.E0(vRelativeFindViewById4, new View.OnClickListener() { // from class: l.yeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28177a.m20113S(vImageFindViewById, vImageFindViewById2, vImageFindViewById3, vImageFindViewById4, view);
            }
        });
        xdl0.E0(vIconFindViewById, new View.OnClickListener() { // from class: l.zeb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l5j0Var.dismiss();
            }
        });
        xdl0.E0(textView2, new View.OnClickListener() { // from class: l.afb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8244a.m20114T(l5j0Var, view);
            }
        });
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bfb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        l5j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.cfb0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        Window window = l5j0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(u4c0.f23139o2)).setBackgroundResource(x2c0.f26718gp);
        }
        l5j0Var.show();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20121z(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m20120r() {
        this.f17648a.setTitle("消息通知设置");
        this.f17648a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.teb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22055a.m20075E(view);
            }
        });
        this.f17658k.setTitleBottomPadding(5);
        this.f17659l.setTitleBottomPadding(5);
        this.f17660m.setTitleBottomPadding(5);
        this.f17664q.setTitleBottomPadding(5);
        this.f17668u.setTitleBottomPadding(5);
        this.f17658k.setSubTitleSize(13);
        this.f17659l.setSubTitleSize(13);
        this.f17660m.setSubTitleSize(13);
        this.f17668u.setSubTitleSize(13);
        this.f17664q.setSubTitleSize(13);
        VListCell vListCell = this.f17651d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vListCell.setTitleTypeface(typeface);
        this.f17652e.setTitleTypeface(typeface);
        this.f17658k.setTitleTypeface(typeface);
        this.f17659l.setTitleTypeface(typeface);
        this.f17660m.setTitleTypeface(typeface);
        this.f17664q.setTitleTypeface(typeface);
        this.f17668u.setTitleTypeface(typeface);
        this.f17662o.setTypeface(typeface);
        this.f17670w.setTypeface(typeface);
        this.f17650c.setTypeface(typeface);
        this.f17667t.setTypeface(typeface);
        this.f17657j.setTypeface(typeface);
        this.f17654g.setTypeface(typeface);
        yij0.t(this.f17651d, CoreModule.f1534c.f3628e0.m21490p9().getUserPushAllEnable());
        yij0.t(this.f17652e, CoreModule.f1534c.f3628e0.m21490p9().settings.previewPushMessage().booleanValue());
        yij0.t(this.f17658k, CoreModule.f1534c.f3628e0.m21490p9().settings.userMsgPushTip().booleanValue());
        yij0.t(this.f17659l, CoreModule.f1534c.f3628e0.m21490p9().settings.userMomentPushTip().booleanValue());
        yij0.t(this.f17660m, CoreModule.f1534c.f3628e0.m21490p9().settings.userLivePushTip().booleanValue());
        yij0.t(this.f17664q, CoreModule.f1534c.f3628e0.m21490p9().settings.userRecommendPushTip().booleanValue());
        yij0.t(this.f17668u, CoreModule.f1534c.f3628e0.m21490p9().settings.userSilentSwitchPushTip().booleanValue());
        this.f17647C = CoreModule.f1534c.f3628e0.m21490p9().settings.uservoiceNotification();
        m20116V();
        zvf0.x("e_push_switch", "p_message_push_settings");
        this.f17651d.setOnClickListener(new View.OnClickListener() { // from class: l.efb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11125a.m20076F(view);
            }
        });
        zvf0.x("e_push_detail_switch", "p_message_push_settings");
        this.f17652e.setOnClickListener(new View.OnClickListener() { // from class: l.ffb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12705a.m20078H(view);
            }
        });
        this.f17646B = false;
        xdl0.M(this.f17653f, false);
        zvf0.x("e_friend_message_switch", "p_message_push_settings");
        this.f17658k.setOnClickListener(new View.OnClickListener() { // from class: l.gfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13303a.m20079I(view);
            }
        });
        zvf0.x("e_moment_push_switch", "p_message_push_settings");
        this.f17659l.setOnClickListener(new View.OnClickListener() { // from class: l.hfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13864a.m20080J(view);
            }
        });
        zvf0.x("e_live_push_switch", "p_message_push_settings");
        this.f17660m.setOnClickListener(new View.OnClickListener() { // from class: l.ifb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14429a.m20081K(view);
            }
        });
        zvf0.x("e_chatroom_setting", "p_message_push_settings");
        this.f17661n.setOnClickListener(new View.OnClickListener() { // from class: l.jfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15140a.m20082L(view);
            }
        });
        zvf0.x("e_personal_reference_switch", "p_message_push_settings");
        this.f17664q.setOnClickListener(new View.OnClickListener() { // from class: l.kfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15803a.m20083M(view);
            }
        });
        zvf0.x("e_pushoff_mode_switch", "p_message_push_settings");
        this.f17668u.setOnClickListener(new View.OnClickListener() { // from class: l.lfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16391a.m20084N(view);
            }
        });
        this.f17669v.setOnClickListener(new View.OnClickListener() { // from class: l.mfb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16958a.m20077G(view);
            }
        });
        xdl0.M(this.f17669v, yij0.u(this.f17668u));
        if (CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() < 0 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() > 23 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip() < 1 || CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f17671x.setText(((String) ark.g.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushStartTimeTip())) + " - " + ((String) ark.h.get(CoreModule.f1534c.f3628e0.m21490p9().settings.userPushEndTimeTip() - 1)));
        m20115U();
    }

    /* JADX INFO: renamed from: z */
    public View m20121z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofb0.b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
