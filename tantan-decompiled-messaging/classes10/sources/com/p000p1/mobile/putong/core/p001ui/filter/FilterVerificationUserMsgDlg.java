package com.p000p1.mobile.putong.core.p001ui.filter;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.data.SeeSwitchName;
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.filter.FilterVerificationUserMsgDlg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.cjj0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.eqh0;
import l.i0e;
import l.j760;
import l.l5j0;
import l.lsi0;
import l.mkd0;
import l.on6;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.yk5;
import l.zvf0;
import p003l.a1c0;
import p003l.c3c0;
import p003l.l6c0;
import p003l.x7c0;
import p003l.y4c0;
import rx.c;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FilterVerificationUserMsgDlg extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f1559f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f1560g;

    /* JADX INFO: renamed from: h */
    public VFrame f1561h;

    /* JADX INFO: renamed from: i */
    public VText f1562i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f1563j;

    /* JADX INFO: renamed from: k */
    public cwf0 f1564k;

    /* JADX INFO: renamed from: l */
    public FilterFrom f1565l;

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
    public class ViewOnClickListenerC3108a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f1566a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f1567b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FilterFrom f1568c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ VCheckBox[] f1569d;

        public ViewOnClickListenerC3108a(yk5 yk5Var, boolean z, FilterFrom filterFrom, VCheckBox[] vCheckBoxArr) {
            this.f1566a = yk5Var;
            this.f1567b = z;
            this.f1568c = filterFrom;
            this.f1569d = vCheckBoxArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1566a.dismiss();
            if (this.f1567b && this.f1568c == FilterFrom.MSG_PAGE) {
                return;
            }
            this.f1569d[0].setChecked(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterVerificationUserMsgDlg(@NonNull Act act, FilterFrom filterFrom) {
        super(act, x7c0.f8376c);
        FilterFrom filterFrom2 = FilterFrom.CONV_LIST;
        this.f1559f = act;
        this.f1565l = filterFrom;
        boolean zM2728O = m2728O(CoreModule.c.B0.q4());
        cwf0 cwf0VarC = i0e.c("p_settings_chat_to_verified", Dialog.class.getName());
        this.f1564k = cwf0VarC;
        cwf0VarC.p(new j760[]{j760.a("setting_chat_to_verified_page_status", !zM2728O ? "default" : "pending_result"), j760.a("verify_to_chat_origin", filterFrom == filterFrom2 ? SeeSwitchName.message_tab : "chat_details")});
        i0e.f(this.f1564k);
        setContentView(l6c0.f6096w1);
        m2727N();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lki
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f6161a.m2736S(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2718D(dd80[] dd80VarArr, VerificationCenter verificationCenter) {
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") && NullChecker.a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m2719E(c4g0[] c4g0VarArr, FilterFrom filterFrom, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.z(c4g0VarArr[0]);
        if (filterFrom == FilterFrom.MSG_PAGE) {
            i0e.e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m2721G(Act act, User user, View view) {
        if (act instanceof MessagesAct) {
            ((MessagesAct) act).l().v6("messages_thumbnail_left");
        }
        zvf0.u("e_disable_chat_popup_photo", "p_disable_chat_lead_to_verify", new j760[]{j760.a("to_userid", ((DbObject) user).id)});
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m2722H(dd80[] dd80VarArr, d30 d30Var, View view) {
        dd80VarArr[0].dismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m2723J(Act act) {
        CoreModule.P().i().J0(act);
    }

    /* JADX INFO: renamed from: K */
    public static dd80 m2724K(Act act, FilterFrom filterFrom) {
        return m2726M(act, filterFrom, null, null);
    }

    /* JADX INFO: renamed from: L */
    public static dd80 m2725L(Act act, FilterFrom filterFrom, @Nullable User user) {
        return m2726M(act, filterFrom, user, null);
    }

    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX INFO: renamed from: M */
    public static dd80 m2726M(final Act act, final FilterFrom filterFrom, @Nullable final User user, final d30 d30Var) {
        ?? r2;
        dd80.a aVar = new dd80.a(act);
        View viewInflate = LayoutInflater.from(act).inflate(l6c0.f5901T3, (ViewGroup) null);
        final dd80[] dd80VarArr = new dd80[1];
        final c4g0[] c4g0VarArr = new c4g0[1];
        VText vTextFindViewById = viewInflate.findViewById(y4c0.f8761S4);
        VImage vImageFindViewById = viewInflate.findViewById(y4c0.f8745Q0);
        VText vTextFindViewById2 = viewInflate.findViewById(y4c0.f8812b0);
        final View[] viewArr = {viewInflate.findViewById(y4c0.f8696I)};
        VText vTextFindViewById3 = viewInflate.findViewById(y4c0.f8754R3);
        VButton vButtonFindViewById = viewInflate.findViewById(y4c0.f8893m4);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(y4c0.f8841f1);
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        final cwf0 cwf0VarC = i0e.c(filterFrom == filterFrom2 ? "p_disable_chat_lead_to_verify" : "p_popup_verify_to_set", Dialog.class.getName());
        vTextFindViewById.setTypeface((Typeface) null, 1);
        vTextFindViewById3.setTypeface(eqh0.c(3), 0);
        vButtonFindViewById.setTypeface(eqh0.c(3), 0);
        if (filterFrom == filterFrom2 && NullChecker.a(user)) {
            cwf0VarC.p(new j760[]{j760.a("to_userid", ((DbObject) user).id)});
            vTextFindViewById.setText("对方希望你完成认证");
            StringBuilder sb = new StringBuilder("对方设置了只接收认证用户的消息，仅需几步完成验证，即刻与");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("开始互动");
            vTextFindViewById2.setText(sb.toString());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vDraweeViewFindViewById.getLayoutParams();
            int iD = t100.d(100.0f);
            layoutParams.height = iD;
            layoutParams.width = iD;
            layoutParams.topMargin = t100.d(36.0f);
            layoutParams.bottomMargin = t100.d(26.0f);
            vDraweeViewFindViewById.setLayoutParams(layoutParams);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.v(true);
            vDraweeViewFindViewById.getHierarchy().H(roundingParams);
            xdl0.E0(vDraweeViewFindViewById, new View.OnClickListener() { // from class: l.fki
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterVerificationUserMsgDlg.m2721G(act, user, view);
                }
            });
            qib0.G.L0(vDraweeViewFindViewById, user.fp().profileSmall().formatted());
        } else if (filterFrom == FilterFrom.CONV_LIST || filterFrom == FilterFrom.MSG_DEEPLINK || filterFrom == FilterFrom.SETTING_PAGE) {
            vDraweeViewFindViewById.setImageResource(CoreModule.P().i().R5());
            vTextFindViewById.setText("真实头像认证");
            vTextFindViewById2.setText("完成认证后，可设置只和完成认证的用户聊天");
        }
        i0e.f(cwf0VarC);
        String string = act.getResources().getString(R$string.f385B6);
        vTextFindViewById3.setText(act.getResources().getString(R$string.f752t5) + string);
        boolean zM2728O = m2728O(CoreModule.c.B0.q4());
        final yk5 yk5Var = new yk5(act, 1);
        yk5Var.D(new ViewOnClickListenerC3108a(yk5Var, zM2728O, filterFrom, viewArr));
        cjj0.a(vTextFindViewById3, string, Color.parseColor("#FE7E1D"), new d30() { // from class: l.gki
            public final void call() {
                yk5Var.show();
            }
        });
        xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.hki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m2722H(dd80VarArr, d30Var, view);
            }
        });
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.iki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m2731x(viewArr, filterFrom, dd80VarArr, act, view);
            }
        });
        if (filterFrom == filterFrom2 && zM2728O) {
            r2 = 0;
            vButtonFindViewById.setEnabled(false);
            vButtonFindViewById.setText("认证审核中");
            viewArr[0].setEnabled(false);
            vButtonFindViewById.setTextColor(act.getResources().getColor(a1c0.f2712t));
            vButtonFindViewById.setBackgroundResource(c3c0.f3870p5);
        } else {
            r2 = 0;
        }
        dd80VarArr[r2] = aVar.R(viewInflate).P((boolean) r2).n0(new DialogInterface.OnDismissListener() { // from class: l.jki
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FilterVerificationUserMsgDlg.m2719E(c4g0VarArr, filterFrom, cwf0VarC, dialogInterface);
            }
        }).r0();
        c4g0VarArr[r2] = act.duringCreated(CoreModule.c.B0.j4()).subscribe(mkd0.G(new e30() { // from class: l.kki
            public final void call(Object obj) {
                FilterVerificationUserMsgDlg.m2718D(dd80VarArr, (VerificationCenter) obj);
            }
        }));
        return dd80VarArr[r2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    private void m2727N() {
        VImage vImageFindViewById = findViewById(y4c0.f8745Q0);
        vImageFindViewById.setImageResource(CoreModule.P().i().m5());
        this.f1560g = findViewById(y4c0.f8759S2);
        this.f1562i = findViewById(y4c0.f8857h3);
        this.f1563j = (FrameLayout) findViewById(y4c0.f8747Q2);
        this.f1561h = findViewById(y4c0.f8753R2);
        findViewById(y4c0.f8751R0).setTypeface((Typeface) null, 1);
        xdl0.E0(vImageFindViewById, new View.OnClickListener() { // from class: l.mki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6353a.m2729P(view);
            }
        });
        xdl0.E0(this.f1561h, new View.OnClickListener() { // from class: l.nki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6514a.m2730Q(view);
            }
        });
        duringCreated(c.combineLatest(CoreModule.c.e0.o9(), CoreModule.c.B0.j4(), new on6())).subscribe(mkd0.G(new e30() { // from class: l.oki
            public final void call(Object obj) {
                this.f6673a.m2735R((j760) obj);
            }
        }));
        BottomSheetBehavior.from(findViewById(R.id.design_bottom_sheet)).setState(3);
        PutongAct.setLightStatusBar(getWindow(), 16);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m2728O(VerificationCenter verificationCenter) {
        if (NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo)) {
            return TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, "prePending");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m2729P(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m2730Q(View view) {
        m2734I();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m2731x(VCheckBox[] vCheckBoxArr, FilterFrom filterFrom, dd80[] dd80VarArr, Act act, View view) {
        if (!vCheckBoxArr[0].isChecked()) {
            lsi0.y("请先勾选并同意《认证协议》后再进行认证哦~");
            return;
        }
        if (m2728O(CoreModule.c.B0.q4())) {
            lsi0.y("认证审核中，请稍后再试");
            return;
        }
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        if (filterFrom == filterFrom2) {
            zvf0.r("e_start_verification", "p_disable_chat_lead_to_verify");
        } else {
            zvf0.r("e_start_verification", "p_popup_verify_to_set");
        }
        if (filterFrom != filterFrom2) {
            dd80VarArr[0].dismiss();
        }
        m2723J(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m2734I() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (verificationCenterK4 == null || verificationCenterK4.picVerificationInfo == null) {
            dismiss();
            m2725L(this.f1559f, this.f1565l, null);
        } else {
            if (m2728O(verificationCenterK4)) {
                return;
            }
            if (TEnum.equals(verificationCenterK4.picVerificationInfo.status, StudentVerificationStatus.get("verified"))) {
                m2737T(!CoreModule.c.e0.p9().isOpenFilterVeriMsg());
            } else {
                dismiss();
                m2725L(this.f1559f, this.f1565l, null);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m2735R(j760 j760Var) {
        boolean zM2728O = m2728O((VerificationCenter) j760Var.b);
        VText vText = this.f1562i;
        if (zM2728O) {
            xdl0.M(vText, true);
            xdl0.M(this.f1563j, false);
        } else {
            xdl0.M(vText, false);
            xdl0.M(this.f1563j, true);
            this.f1560g.setChecked(CoreModule.c.e0.g8());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m2736S(DialogInterface dialogInterface) {
        i0e.e(this.f1564k);
    }

    /* JADX INFO: renamed from: T */
    public final void m2737T(boolean z) {
        zvf0.u("e_chat_to_verified_switch", "p_settings_chat_to_verified", new j760[]{vwb.Y("after_status", z ? "on" : "off")});
        CoreModule.c.e0.B9(z);
    }
}
