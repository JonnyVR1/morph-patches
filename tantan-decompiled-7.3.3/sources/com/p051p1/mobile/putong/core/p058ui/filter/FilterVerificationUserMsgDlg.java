package com.p051p1.mobile.putong.core.p058ui.filter;

import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.C2489R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.filter.FilterVerificationUserMsgDlg;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bm5;
import p153l.bnl0;
import p153l.cgc0;
import p153l.edc0;
import p153l.fsj0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jl80;
import p153l.jyb;
import p153l.kcg0;
import p153l.l4g0;
import p153l.lyh0;
import p153l.o1j0;
import p153l.pej0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qec0;
import p153l.ro6;
import p153l.uqb0;
import p153l.w1e;
import p153l.wlj;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class FilterVerificationUserMsgDlg extends pej0 {

    /* JADX INFO: renamed from: f */
    public Act f30013f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f30014g;

    /* JADX INFO: renamed from: h */
    public VFrame f30015h;

    /* JADX INFO: renamed from: i */
    public VText f30016i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f30017j;

    /* JADX INFO: renamed from: k */
    public l4g0 f30018k;

    /* JADX INFO: renamed from: l */
    public FilterFrom f30019l;

    public enum FilterFrom {
        CONV_LIST("配对列表"),
        MSG_PAGE("消息详情"),
        SETTING_PAGE("设置页面"),
        MSG_DEEPLINK("消息内容点击");

        private String des;

        FilterFrom(String str) {
            this.des = str;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.filter.FilterVerificationUserMsgDlg$a */
    public class ViewOnClickListenerC8496a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bm5 f30020a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f30021b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FilterFrom f30022c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ VCheckBox[] f30023d;

        public ViewOnClickListenerC8496a(bm5 bm5Var, boolean z, FilterFrom filterFrom, VCheckBox[] vCheckBoxArr) {
            this.f30020a = bm5Var;
            this.f30021b = z;
            this.f30022c = filterFrom;
            this.f30023d = vCheckBoxArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f30020a.m176562T();
            if (this.f30021b && this.f30022c == FilterFrom.MSG_PAGE) {
                return;
            }
            this.f30023d[0].setChecked(true);
        }
    }

    public FilterVerificationUserMsgDlg(@NonNull Act act, FilterFrom filterFrom) {
        super(act, cgc0.f81647c);
        FilterFrom filterFrom2 = FilterFrom.CONV_LIST;
        this.f30013f = act;
        this.f30019l = filterFrom;
        boolean zM46584O = m46584O(CoreModule.f18264c.f20294B0.m32621q4());
        l4g0 l4g0VarM204399c = w1e.m204399c("p_settings_chat_to_verified", Dialog.class.getName());
        this.f30018k = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(pf60.m172085a("setting_chat_to_verified_page_status", !zM46584O ? "default" : "pending_result"), pf60.m172085a("verify_to_chat_origin", filterFrom == filterFrom2 ? SeeSwitchName.message_tab : "chat_details"));
        w1e.m204402f(this.f30018k);
        setContentView(qec0.f157143w1);
        m46583N();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.hni
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f110773a.m46592S(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m46574D(jl80[] jl80VarArr, VerificationCenter verificationCenter) {
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") && NullChecker.m82486a(jl80VarArr[0]) && jl80VarArr[0].isShowing()) {
            jl80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m46575E(kcg0[] kcg0VarArr, FilterFrom filterFrom, l4g0 l4g0Var, DialogInterface dialogInterface) {
        psd0.m173633z(kcg0VarArr[0]);
        if (filterFrom == FilterFrom.MSG_PAGE) {
            w1e.m204401e(l4g0Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m46577G(Act act, User user, View view) {
        if (act instanceof MessagesAct) {
            ((MessagesAct) act).mo50158l().m111056v6("messages_thumbnail_left");
        }
        i4g0.m138523u("e_disable_chat_popup_photo", "p_disable_chat_lead_to_verify", pf60.m172085a("to_userid", user.f56859id));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m46578H(jl80[] jl80VarArr, x20 x20Var, View view) {
        jl80VarArr[0].dismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m46579J(Act act) {
        CoreModule.m30933P().m143412i().mo180340J0(act);
    }

    /* JADX INFO: renamed from: K */
    public static jl80 m46580K(Act act, FilterFrom filterFrom) {
        return m46582M(act, filterFrom, null, null);
    }

    /* JADX INFO: renamed from: L */
    public static jl80 m46581L(Act act, FilterFrom filterFrom, @Nullable User user) {
        return m46582M(act, filterFrom, user, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX INFO: renamed from: M */
    public static jl80 m46582M(final Act act, final FilterFrom filterFrom, @Nullable final User user, final x20 x20Var) {
        ?? r2;
        jl80.C17971a c17971a = new jl80.C17971a(act);
        View viewInflate = LayoutInflater.from(act).inflate(qec0.f156948T3, (ViewGroup) null);
        final jl80[] jl80VarArr = new jl80[1];
        final kcg0[] kcg0VarArr = new kcg0[1];
        VText vText = (VText) viewInflate.findViewById(edc0.f93279S4);
        VImage vImage = (VImage) viewInflate.findViewById(edc0.f93263Q0);
        VText vText2 = (VText) viewInflate.findViewById(edc0.f93330b0);
        final VCheckBox[] vCheckBoxArr = {(VCheckBox) viewInflate.findViewById(edc0.f93214I)};
        VText vText3 = (VText) viewInflate.findViewById(edc0.f93272R3);
        VButton vButton = (VButton) viewInflate.findViewById(edc0.f93411m4);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93359f1);
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        final l4g0 l4g0VarM204399c = w1e.m204399c(filterFrom == filterFrom2 ? "p_disable_chat_lead_to_verify" : "p_popup_verify_to_set", Dialog.class.getName());
        vText.setTypeface(null, 1);
        vText3.setTypeface(lyh0.m156283c(3), 0);
        vButton.setTypeface(lyh0.m156283c(3), 0);
        if (filterFrom == filterFrom2 && NullChecker.m82486a(user)) {
            l4g0VarM204399c.m152781p(pf60.m172085a("to_userid", user.f56859id));
            vText.setText("对方希望你完成认证");
            StringBuilder sb = new StringBuilder("对方设置了只接收认证用户的消息，仅需几步完成验证，即刻与");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("开始互动");
            vText2.setText(sb.toString());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int iM175859d = qa00.m175859d(100.0f);
            layoutParams.height = iM175859d;
            layoutParams.width = iM175859d;
            layoutParams.topMargin = qa00.m175859d(36.0f);
            layoutParams.bottomMargin = qa00.m175859d(26.0f);
            simpleDraweeView.setLayoutParams(layoutParams);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
            ((wlj) simpleDraweeView.getHierarchy()).m207045H(roundingParams);
            bnl0.m105509E0(simpleDraweeView, new View.OnClickListener() { // from class: l.bni
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterVerificationUserMsgDlg.m46577G(act, user, view);
                }
            });
            uqb0.f180374G.m127115L0(simpleDraweeView, user.m61308fp().profileSmall().formatted());
        } else if (filterFrom == FilterFrom.CONV_LIST || filterFrom == FilterFrom.MSG_DEEPLINK || filterFrom == FilterFrom.SETTING_PAGE) {
            simpleDraweeView.setImageResource(CoreModule.m30933P().m143412i().mo180389R5());
            vText.setText("真实头像认证");
            vText2.setText("完成认证后，可设置只和完成认证的用户聊天");
        }
        w1e.m204402f(l4g0VarM204399c);
        String string = act.getResources().getString(R$string.f21465B6);
        vText3.setText(act.getResources().getString(R$string.f21832t5) + string);
        boolean zM46584O = m46584O(CoreModule.f18264c.f20294B0.m32621q4());
        final bm5 bm5Var = new bm5(act, 1);
        bm5Var.m104999D(new ViewOnClickListenerC8496a(bm5Var, zM46584O, filterFrom, vCheckBoxArr));
        fsj0.m127199a(vText3, string, Color.parseColor("#FE7E1D"), new x20() { // from class: l.cni
            @Override // p153l.x20
            public final void call() {
                bm5Var.show();
            }
        });
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.dni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m46578H(jl80VarArr, x20Var, view);
            }
        });
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.eni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m46587x(vCheckBoxArr, filterFrom, jl80VarArr, act, view);
            }
        });
        if (filterFrom == filterFrom2 && zM46584O) {
            r2 = 0;
            vButton.setEnabled(false);
            vButton.setText("认证审核中");
            vCheckBoxArr[0].setEnabled(false);
            vButton.setTextColor(act.getResources().getColor(g9c0.f102830t));
            vButton.setBackgroundResource(ibc0.f114108p5);
        } else {
            r2 = 0;
        }
        jl80VarArr[r2] = c17971a.m146023R(viewInflate).m146021P(r2).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.fni
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FilterVerificationUserMsgDlg.m46575E(kcg0VarArr, filterFrom, l4g0VarM204399c, dialogInterface);
            }
        }).m146049r0();
        kcg0VarArr[r2] = act.duringCreated(CoreModule.f18264c.f20294B0.m32614j4()).subscribe(psd0.m173596G(new y20() { // from class: l.gni
            @Override // p153l.y20
            public final void call(Object obj) {
                FilterVerificationUserMsgDlg.m46574D(jl80VarArr, (VerificationCenter) obj);
            }
        }));
        return jl80VarArr[r2];
    }

    /* JADX INFO: renamed from: N */
    private void m46583N() {
        VImage vImage = (VImage) findViewById(edc0.f93263Q0);
        vImage.setImageResource(CoreModule.m30933P().m143412i().mo180503m5());
        this.f30014g = (VSwitchButton) findViewById(edc0.f93277S2);
        this.f30016i = (VText) findViewById(edc0.f93375h3);
        this.f30017j = (FrameLayout) findViewById(edc0.f93265Q2);
        this.f30015h = (VFrame) findViewById(edc0.f93271R2);
        ((VText) findViewById(edc0.f93269R0)).setTypeface(null, 1);
        bnl0.m105509E0(vImage, new View.OnClickListener() { // from class: l.ini
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115955a.m46585P(view);
            }
        });
        bnl0.m105509E0(this.f30015h, new View.OnClickListener() { // from class: l.jni
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121857a.m46586Q(view);
            }
        });
        duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20294B0.m32614j4(), new ro6())).subscribe(psd0.m173596G(new y20() { // from class: l.kni
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127601a.m46591R((pf60) obj);
            }
        }));
        BottomSheetBehavior.from(findViewById(C2489R.id.design_bottom_sheet)).setState(3);
        PutongAct.setLightStatusBar(getWindow(), 16);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m46584O(VerificationCenter verificationCenter) {
        if (NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo)) {
            return TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m46585P(View view) {
        m176562T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m46586Q(View view) {
        m46590I();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m46587x(VCheckBox[] vCheckBoxArr, FilterFrom filterFrom, jl80[] jl80VarArr, Act act, View view) {
        if (!vCheckBoxArr[0].isChecked()) {
            o1j0.m165651y("请先勾选并同意《认证协议》后再进行认证哦~");
            return;
        }
        if (m46584O(CoreModule.f18264c.f20294B0.m32621q4())) {
            o1j0.m165651y("认证审核中，请稍后再试");
            return;
        }
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        if (filterFrom == filterFrom2) {
            i4g0.m138520r("e_start_verification", "p_disable_chat_lead_to_verify");
        } else {
            i4g0.m138520r("e_start_verification", "p_popup_verify_to_set");
        }
        if (filterFrom != filterFrom2) {
            jl80VarArr[0].dismiss();
        }
        m46579J(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m46590I() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 == null || verificationCenterM32615k4.picVerificationInfo == null) {
            m176562T();
            m46581L(this.f30013f, this.f30019l, null);
        } else {
            if (m46584O(verificationCenterM32615k4)) {
                return;
            }
            if (TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, StudentVerificationStatus.get("verified"))) {
                m46593T(!CoreModule.f18264c.f20381e0.m116600p9().isOpenFilterVeriMsg());
            } else {
                m176562T();
                m46581L(this.f30013f, this.f30019l, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m46591R(pf60 pf60Var) {
        boolean zM46584O = m46584O((VerificationCenter) pf60Var.f152157b);
        VText vText = this.f30016i;
        if (zM46584O) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f30017j, false);
        } else {
            bnl0.m105524M(vText, false);
            bnl0.m105524M(this.f30017j, true);
            this.f30014g.setChecked(CoreModule.f18264c.f20381e0.m116563g8());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m46592S(DialogInterface dialogInterface) {
        w1e.m204401e(this.f30018k);
    }

    /* JADX INFO: renamed from: T */
    public final void m46593T(boolean z) {
        i4g0.m138523u("e_chat_to_verified_switch", "p_settings_chat_to_verified", jyb.m147494Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
        CoreModule.f18264c.f20381e0.m116446B9(z);
    }
}
