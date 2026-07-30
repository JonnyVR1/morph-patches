package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class rnb0 implements iam<wmb0> {

    /* JADX INFO: renamed from: A */
    public boolean f163985A = false;

    /* JADX INFO: renamed from: B */
    public boolean f163986B = false;

    /* JADX INFO: renamed from: C */
    public String f163987C = "";

    /* JADX INFO: renamed from: a */
    public VNavigationBar f163988a;

    /* JADX INFO: renamed from: b */
    public VLinear f163989b;

    /* JADX INFO: renamed from: c */
    public VText f163990c;

    /* JADX INFO: renamed from: d */
    public VListCell f163991d;

    /* JADX INFO: renamed from: e */
    public VListCell f163992e;

    /* JADX INFO: renamed from: f */
    public VLinear f163993f;

    /* JADX INFO: renamed from: g */
    public VText f163994g;

    /* JADX INFO: renamed from: h */
    public View f163995h;

    /* JADX INFO: renamed from: i */
    public VLinear f163996i;

    /* JADX INFO: renamed from: j */
    public VText f163997j;

    /* JADX INFO: renamed from: k */
    public VListCell f163998k;

    /* JADX INFO: renamed from: l */
    public VListCell f163999l;

    /* JADX INFO: renamed from: m */
    public VListCell f164000m;

    /* JADX INFO: renamed from: n */
    public VLinear f164001n;

    /* JADX INFO: renamed from: o */
    public VText f164002o;

    /* JADX INFO: renamed from: p */
    public VText f164003p;

    /* JADX INFO: renamed from: q */
    public VListCell f164004q;

    /* JADX INFO: renamed from: r */
    public VLinear f164005r;

    /* JADX INFO: renamed from: s */
    public View f164006s;

    /* JADX INFO: renamed from: t */
    public VText f164007t;

    /* JADX INFO: renamed from: u */
    public VListCell f164008u;

    /* JADX INFO: renamed from: v */
    public VLinear f164009v;

    /* JADX INFO: renamed from: w */
    public VText f164010w;

    /* JADX INFO: renamed from: x */
    public VText f164011x;

    /* JADX INFO: renamed from: y */
    public Act f164012y;

    /* JADX INFO: renamed from: z */
    public wmb0 f164013z;

    public rnb0(Act act) {
        this.f164012y = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m182167E(View view) {
        this.f164012y.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m182168F(View view) {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed) {
            this.f163985A = true;
            iz40.m142756A();
            return;
        }
        boolean zM106262T = bsj0.m106262T(this.f163991d);
        i4g0.m138523u("e_push_switch", "p_message_push_settings", jyb.m147494Y("push_switch", zM106262T ? "off_on" : "on_off"));
        wmb0 wmb0Var = this.f164013z;
        if (zM106262T) {
            wmb0Var.m207103q0("allPushEnable", true);
        } else {
            wmb0Var.m207103q0("allPushEnable", false);
        }
        m182206U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m182169G(View view) {
        i4g0.m138492A("e_pushoff_mode_timesetting", "p_message_push_settings", jyb.m147494Y("pushoff_time_setting", qtk.f159454g.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip()) + "-" + qtk.f159455h.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip() - 1)));
        qtk.m178007X0(this.f164012y, CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip(), CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip(), new z20() { // from class: l.hnb0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f110718a.m182200O((Integer) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m182170H(View view) {
        boolean zM106262T = bsj0.m106262T(this.f163992e);
        i4g0.m138523u("e_push_detail_switch", "p_message_push_settings", jyb.m147494Y("push_switch", zM106262T ? "off_on" : "on_off"));
        this.f164013z.m207099k0(zM106262T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m182171I(View view) {
        boolean zM106262T = bsj0.m106262T(this.f163998k);
        i4g0.m138523u("e_friend_message_switch", "p_message_push_settings", jyb.m147494Y("push_switch_change", zM106262T ? "off2on" : "on2off"));
        wmb0 wmb0Var = this.f164013z;
        if (zM106262T) {
            wmb0Var.m207103q0("msgPush", true);
        } else {
            wmb0Var.m207103q0("msgPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m182172J(View view) {
        boolean zM106262T = bsj0.m106262T(this.f163999l);
        i4g0.m138523u("e_moment_push_switch", "p_message_push_settings", jyb.m147494Y("push_switch_change", zM106262T ? "off2on" : "on2off"));
        wmb0 wmb0Var = this.f164013z;
        if (zM106262T) {
            wmb0Var.m207103q0("momentPush", true);
        } else {
            wmb0Var.m207103q0("momentPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m182173K(View view) {
        boolean zM106262T = bsj0.m106262T(this.f164000m);
        i4g0.m138523u("e_live_push_switch", "p_message_push_settings", jyb.m147494Y("push_switch_change", zM106262T ? "off2on" : "on2off"));
        wmb0 wmb0Var = this.f164013z;
        if (zM106262T) {
            wmb0Var.m207103q0("livePush", true);
        } else {
            wmb0Var.m207103q0("livePush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m182174L(View view) {
        i4g0.m138520r("e_chatroom_setting", "p_message_push_settings");
        m182209X(this.f164012y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m182175M(View view) {
        boolean zM106262T = bsj0.m106262T(this.f164004q);
        i4g0.m138523u("e_personal_reference_switch", "p_message_push_settings", jyb.m147494Y("push_switch_change", zM106262T ? "off2on" : "on2off"));
        wmb0 wmb0Var = this.f164013z;
        if (zM106262T) {
            wmb0Var.m207103q0("recommendPush", true);
        } else {
            wmb0Var.m207103q0("recommendPush", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m182176N(View view) {
        boolean zM106262T = bsj0.m106262T(this.f164008u);
        i4g0.m138523u("e_pushoff_mode_switch", "p_message_push_settings", jyb.m147494Y("push_switch_change", zM106262T ? "off2on" : "on2off"));
        VLinear vLinear = this.f164009v;
        if (zM106262T) {
            bnl0.m105524M(vLinear, true);
            this.f164013z.m207103q0("silentSwitch", true);
        } else {
            bnl0.m105524M(vLinear, false);
            this.f164013z.m207103q0("silentSwitch", false);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(wmb0 wmb0Var) {
        this.f164013z = wmb0Var;
    }

    /* JADX INFO: renamed from: B */
    public void m182198B() {
        this.f164012y.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ymb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200651a.m182199C((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m182199C(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m182208W();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m182200O(Integer num, Integer num2) {
        this.f164013z.m207104r0("pushTime", true, num.intValue(), num2.intValue() + 1);
        VText vText = this.f164011x;
        StringBuilder sb = new StringBuilder();
        List<String> list = qtk.f159454g;
        sb.append(list.get(num.intValue()));
        sb.append(" - ");
        List<String> list2 = qtk.f159455h;
        sb.append(list2.get(num2.intValue()));
        vText.setText(sb.toString());
        i4g0.m138524v("e_pushoff_mode_timesetting", "p_message_push_settings", jyb.m147494Y("pushoff_time_setting", list.get(num.intValue()) + "-" + list2.get(num2.intValue())));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m182201P(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f163987C = "all";
        bnl0.m105524M(vImage, true);
        bnl0.m105524M(vImage2, false);
        bnl0.m105524M(vImage3, false);
        bnl0.m105524M(vImage4, false);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m182202Q(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f163987C = "like";
        bnl0.m105524M(vImage, false);
        bnl0.m105524M(vImage2, true);
        bnl0.m105524M(vImage3, false);
        bnl0.m105524M(vImage4, false);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m182203R(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f163987C = "friend";
        bnl0.m105524M(vImage, false);
        bnl0.m105524M(vImage2, false);
        bnl0.m105524M(vImage3, true);
        bnl0.m105524M(vImage4, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m182204S(VImage vImage, VImage vImage2, VImage vImage3, VImage vImage4, View view) {
        this.f163987C = "none";
        bnl0.m105524M(vImage, false);
        bnl0.m105524M(vImage2, false);
        bnl0.m105524M(vImage3, false);
        bnl0.m105524M(vImage4, true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m182205T(pej0 pej0Var, View view) {
        this.f164013z.m207102p0(this.f163987C);
        m182207V();
        String str = this.f163987C;
        if (TextUtils.equals(str, "friend")) {
            str = "friends";
        }
        i4g0.m138523u("e_push_scope_finish", "p_push_scope_popup", jyb.m147494Y("push_scope", str));
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: U */
    public void m182206U() {
        boolean zM106285u = bsj0.m106285u(this.f163991d);
        bnl0.m105524M(this.f163992e, zM106285u);
        if (this.f163986B) {
            bnl0.m105524M(this.f163993f, zM106285u);
        }
        bnl0.m105524M(this.f163995h, zM106285u);
        bnl0.m105524M(this.f164006s, zM106285u);
        bnl0.m105524M(this.f163996i, zM106285u);
        bnl0.m105524M(this.f164005r, zM106285u);
    }

    /* JADX INFO: renamed from: V */
    public void m182207V() {
        if (TextUtils.equals(this.f163987C, "all")) {
            this.f164003p.setText("所有人");
            return;
        }
        if (TextUtils.equals(this.f163987C, "like")) {
            this.f164003p.setText("仅喜欢过的人");
        } else if (TextUtils.equals(this.f163987C, "friend")) {
            this.f164003p.setText("仅好友");
        } else if (TextUtils.equals(this.f163987C, "none")) {
            this.f164003p.setText("不接收");
        }
    }

    /* JADX INFO: renamed from: W */
    public void m182208W() {
        if (this.f163985A) {
            this.f163985A = false;
            boolean zM106262T = bsj0.m106262T(this.f163991d);
            i4g0.m138523u("e_push_switch", "p_message_push_settings", jyb.m147494Y("push_switch", zM106262T ? "off_on" : "on_off"));
            wmb0 wmb0Var = this.f164013z;
            if (zM106262T) {
                wmb0Var.m207103q0("allPushEnable", true);
            } else {
                wmb0Var.m207103q0("allPushEnable", false);
            }
        }
        m182206U();
    }

    /* JADX INFO: renamed from: X */
    public void m182209X(Act act) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_push_scope_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pf60.m172085a("push_setting_source", "chatroom"));
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCancelable(true);
        pej0Var.setContentView(kec0.f125917kb);
        VIcon vIcon = (VIcon) pej0Var.findViewById(adc0.f70535r4);
        TextView textView = (TextView) pej0Var.findViewById(adc0.f70518q4);
        TextView textView2 = (TextView) pej0Var.findViewById(adc0.f70552s4);
        VRelative vRelative = (VRelative) pej0Var.findViewById(adc0.f70396j1);
        VRelative vRelative2 = (VRelative) pej0Var.findViewById(adc0.f70498p1);
        VRelative vRelative3 = (VRelative) pej0Var.findViewById(adc0.f70464n1);
        VRelative vRelative4 = (VRelative) pej0Var.findViewById(adc0.f70430l1);
        final VImage vImage = (VImage) pej0Var.findViewById(adc0.f69838C);
        final VImage vImage2 = (VImage) pej0Var.findViewById(adc0.f70320e9);
        final VImage vImage3 = (VImage) pej0Var.findViewById(adc0.f69843C4);
        final VImage vImage4 = (VImage) pej0Var.findViewById(adc0.f69857D1);
        VText vText = (VText) pej0Var.findViewById(adc0.f70413k1);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        ((VText) pej0Var.findViewById(adc0.f70515q1)).setTypeface(typeface);
        ((VText) pej0Var.findViewById(adc0.f70481o1)).setTypeface(typeface);
        ((VText) pej0Var.findViewById(adc0.f70447m1)).setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView.setTypeface(typeface);
        String str = this.f164013z.f189789b.getSettingGroup().live.voiceNotification;
        this.f163987C = str;
        if (TextUtils.equals(str, "all")) {
            bnl0.m105524M(vImage, true);
        } else if (TextUtils.equals(this.f163987C, "like")) {
            bnl0.m105524M(vImage2, true);
        } else if (TextUtils.equals(this.f163987C, "friend")) {
            bnl0.m105524M(vImage3, true);
        } else if (TextUtils.equals(this.f163987C, "none")) {
            bnl0.m105524M(vImage4, true);
        }
        bnl0.m105509E0(vRelative, new View.OnClickListener() { // from class: l.zmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205055a.m182201P(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        bnl0.m105509E0(vRelative2, new View.OnClickListener() { // from class: l.anb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72336a.m182202Q(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        bnl0.m105509E0(vRelative3, new View.OnClickListener() { // from class: l.bnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77447a.m182203R(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        bnl0.m105509E0(vRelative4, new View.OnClickListener() { // from class: l.cnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82708a.m182204S(vImage, vImage2, vImage3, vImage4, view);
            }
        });
        bnl0.m105509E0(vIcon, new View.OnClickListener() { // from class: l.dnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pej0Var.dismiss();
            }
        });
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.enb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94751a.m182205T(pej0Var, view);
            }
        });
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fnb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        pej0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.gnb0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        Window window = pej0Var.getWindow();
        window.setDimAmount(0.3f);
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(adc0.f70516q2)).setBackgroundResource(dbc0.f86642Up);
        }
        pej0Var.show();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m182211z(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m182210r() {
        this.f163988a.setTitle("消息通知设置");
        this.f163988a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xmb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195062a.m182167E(view);
            }
        });
        this.f163998k.setTitleBottomPadding(5);
        this.f163999l.setTitleBottomPadding(5);
        this.f164000m.setTitleBottomPadding(5);
        this.f164004q.setTitleBottomPadding(5);
        this.f164008u.setTitleBottomPadding(5);
        this.f163998k.setSubTitleSize(13);
        this.f163999l.setSubTitleSize(13);
        this.f164000m.setSubTitleSize(13);
        this.f164008u.setSubTitleSize(13);
        this.f164004q.setSubTitleSize(13);
        VListCell vListCell = this.f163991d;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vListCell.setTitleTypeface(typeface);
        this.f163992e.setTitleTypeface(typeface);
        this.f163998k.setTitleTypeface(typeface);
        this.f163999l.setTitleTypeface(typeface);
        this.f164000m.setTitleTypeface(typeface);
        this.f164004q.setTitleTypeface(typeface);
        this.f164008u.setTitleTypeface(typeface);
        this.f164002o.setTypeface(typeface);
        this.f164010w.setTypeface(typeface);
        this.f163990c.setTypeface(typeface);
        this.f164007t.setTypeface(typeface);
        this.f163997j.setTypeface(typeface);
        this.f163994g.setTypeface(typeface);
        bsj0.m106284t(this.f163991d, CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable());
        bsj0.m106284t(this.f163992e, CoreModule.f18264c.f20381e0.m116600p9().settings.previewPushMessage().booleanValue());
        bsj0.m106284t(this.f163998k, CoreModule.f18264c.f20381e0.m116600p9().settings.userMsgPushTip().booleanValue());
        bsj0.m106284t(this.f163999l, CoreModule.f18264c.f20381e0.m116600p9().settings.userMomentPushTip().booleanValue());
        bsj0.m106284t(this.f164000m, CoreModule.f18264c.f20381e0.m116600p9().settings.userLivePushTip().booleanValue());
        bsj0.m106284t(this.f164004q, CoreModule.f18264c.f20381e0.m116600p9().settings.userRecommendPushTip().booleanValue());
        bsj0.m106284t(this.f164008u, CoreModule.f18264c.f20381e0.m116600p9().settings.userSilentSwitchPushTip().booleanValue());
        this.f163987C = CoreModule.f18264c.f20381e0.m116600p9().settings.uservoiceNotification();
        m182207V();
        i4g0.m138526x("e_push_switch", "p_message_push_settings");
        this.f163991d.setOnClickListener(new View.OnClickListener() { // from class: l.inb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115897a.m182168F(view);
            }
        });
        i4g0.m138526x("e_push_detail_switch", "p_message_push_settings");
        this.f163992e.setOnClickListener(new View.OnClickListener() { // from class: l.jnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121764a.m182170H(view);
            }
        });
        this.f163986B = false;
        bnl0.m105524M(this.f163993f, false);
        i4g0.m138526x("e_friend_message_switch", "p_message_push_settings");
        this.f163998k.setOnClickListener(new View.OnClickListener() { // from class: l.knb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127573a.m182171I(view);
            }
        });
        i4g0.m138526x("e_moment_push_switch", "p_message_push_settings");
        this.f163999l.setOnClickListener(new View.OnClickListener() { // from class: l.lnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132754a.m182172J(view);
            }
        });
        i4g0.m138526x("e_live_push_switch", "p_message_push_settings");
        this.f164000m.setOnClickListener(new View.OnClickListener() { // from class: l.mnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137669a.m182173K(view);
            }
        });
        i4g0.m138526x("e_chatroom_setting", "p_message_push_settings");
        this.f164001n.setOnClickListener(new View.OnClickListener() { // from class: l.nnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142774a.m182174L(view);
            }
        });
        i4g0.m138526x("e_personal_reference_switch", "p_message_push_settings");
        this.f164004q.setOnClickListener(new View.OnClickListener() { // from class: l.onb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148077a.m182175M(view);
            }
        });
        i4g0.m138526x("e_pushoff_mode_switch", "p_message_push_settings");
        this.f164008u.setOnClickListener(new View.OnClickListener() { // from class: l.pnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153283a.m182176N(view);
            }
        });
        this.f164009v.setOnClickListener(new View.OnClickListener() { // from class: l.qnb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158477a.m182169G(view);
            }
        });
        bnl0.m105524M(this.f164009v, bsj0.m106285u(this.f164008u));
        if (CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() < 0 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() > 23 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip() < 1 || CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip() > 24) {
            return;
        }
        this.f164011x.setText(qtk.f159454g.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushStartTimeTip()) + " - " + qtk.f159455h.get(CoreModule.f18264c.f20381e0.m116600p9().settings.userPushEndTimeTip() - 1));
        m182206U();
    }

    /* JADX INFO: renamed from: z */
    public View m182211z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return snb0.m186888b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
