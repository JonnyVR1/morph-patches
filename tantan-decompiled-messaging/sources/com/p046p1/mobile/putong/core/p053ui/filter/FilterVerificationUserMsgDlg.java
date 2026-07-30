package com.p046p1.mobile.putong.core.p053ui.filter;

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
import com.google.android.material.C2466R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.filter.FilterVerificationUserMsgDlg;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.c4g0;
import p149l.cjj0;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.djj;
import p149l.e30;
import p149l.eqh0;
import p149l.i0e;
import p149l.j760;
import p149l.l5j0;
import p149l.l6c0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.on6;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x7c0;
import p149l.xdl0;
import p149l.y4c0;
import p149l.yk5;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class FilterVerificationUserMsgDlg extends l5j0 {

    /* JADX INFO: renamed from: f */
    public Act f29165f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f29166g;

    /* JADX INFO: renamed from: h */
    public VFrame f29167h;

    /* JADX INFO: renamed from: i */
    public VText f29168i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f29169j;

    /* JADX INFO: renamed from: k */
    public cwf0 f29170k;

    /* JADX INFO: renamed from: l */
    public FilterFrom f29171l;

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
    public class ViewOnClickListenerC8333a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ yk5 f29172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f29173b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ FilterFrom f29174c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ VCheckBox[] f29175d;

        public ViewOnClickListenerC8333a(yk5 yk5Var, boolean z, FilterFrom filterFrom, VCheckBox[] vCheckBoxArr) {
            this.f29172a = yk5Var;
            this.f29173b = z;
            this.f29174c = filterFrom;
            this.f29175d = vCheckBoxArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f29172a.m101651T();
            if (this.f29173b && this.f29174c == FilterFrom.MSG_PAGE) {
                return;
            }
            this.f29175d[0].setChecked(true);
        }
    }

    public FilterVerificationUserMsgDlg(@NonNull Act act, FilterFrom filterFrom) {
        super(act, x7c0.f191334c);
        FilterFrom filterFrom2 = FilterFrom.CONV_LIST;
        this.f29165f = act;
        this.f29171l = filterFrom;
        boolean zM45401O = m45401O(CoreModule.f17545c.f19552B0.m31618q4());
        cwf0 cwf0VarM133794c = i0e.m133794c("p_settings_chat_to_verified", Dialog.class.getName());
        this.f29170k = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(j760.m140076a("setting_chat_to_verified_page_status", !zM45401O ? "default" : "pending_result"), j760.m140076a("verify_to_chat_origin", filterFrom == filterFrom2 ? SeeSwitchName.message_tab : "chat_details"));
        i0e.m133797f(this.f29170k);
        setContentView(l6c0.f126587w1);
        m45400N();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.lki
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f128536a.m45409S(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m45391D(dd80[] dd80VarArr, VerificationCenter verificationCenter) {
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo) && TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") && NullChecker.m81303a(dd80VarArr[0]) && dd80VarArr[0].isShowing()) {
            dd80VarArr[0].dismiss();
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m45392E(c4g0[] c4g0VarArr, FilterFrom filterFrom, cwf0 cwf0Var, DialogInterface dialogInterface) {
        mkd0.m154992z(c4g0VarArr[0]);
        if (filterFrom == FilterFrom.MSG_PAGE) {
            i0e.m133796e(cwf0Var);
        }
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m45394G(Act act, User user, View view) {
        if (act instanceof MessagesAct) {
            ((MessagesAct) act).mo48974l().m120850v6("messages_thumbnail_left");
        }
        zvf0.m220399u("e_disable_chat_popup_photo", "p_disable_chat_lead_to_verify", j760.m140076a("to_userid", user.f56011id));
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m45395H(dd80[] dd80VarArr, d30 d30Var, View view) {
        dd80VarArr[0].dismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m45396J(Act act) {
        CoreModule.m29935P().m94658i().mo158248J0(act);
    }

    /* JADX INFO: renamed from: K */
    public static dd80 m45397K(Act act, FilterFrom filterFrom) {
        return m45399M(act, filterFrom, null, null);
    }

    /* JADX INFO: renamed from: L */
    public static dd80 m45398L(Act act, FilterFrom filterFrom, @Nullable User user) {
        return m45399M(act, filterFrom, user, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX INFO: renamed from: M */
    public static dd80 m45399M(final Act act, final FilterFrom filterFrom, @Nullable final User user, final d30 d30Var) {
        ?? r2;
        dd80.C16336a c16336a = new dd80.C16336a(act);
        View viewInflate = LayoutInflater.from(act).inflate(l6c0.f126392T3, (ViewGroup) null);
        final dd80[] dd80VarArr = new dd80[1];
        final c4g0[] c4g0VarArr = new c4g0[1];
        VText vText = (VText) viewInflate.findViewById(y4c0.f196044S4);
        VImage vImage = (VImage) viewInflate.findViewById(y4c0.f196028Q0);
        VText vText2 = (VText) viewInflate.findViewById(y4c0.f196095b0);
        final VCheckBox[] vCheckBoxArr = {(VCheckBox) viewInflate.findViewById(y4c0.f195979I)};
        VText vText3 = (VText) viewInflate.findViewById(y4c0.f196037R3);
        VButton vButton = (VButton) viewInflate.findViewById(y4c0.f196176m4);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196124f1);
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        final cwf0 cwf0VarM133794c = i0e.m133794c(filterFrom == filterFrom2 ? "p_disable_chat_lead_to_verify" : "p_popup_verify_to_set", Dialog.class.getName());
        vText.setTypeface(null, 1);
        vText3.setTypeface(eqh0.m117752c(3), 0);
        vButton.setTypeface(eqh0.m117752c(3), 0);
        if (filterFrom == filterFrom2 && NullChecker.m81303a(user)) {
            cwf0VarM133794c.m109040p(j760.m140076a("to_userid", user.f56011id));
            vText.setText("对方希望你完成认证");
            StringBuilder sb = new StringBuilder("对方设置了只接收认证用户的消息，仅需几步完成验证，即刻与");
            sb.append(user.isFemale() ? "她" : "他");
            sb.append("开始互动");
            vText2.setText(sb.toString());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int iM186890d = t100.m186890d(100.0f);
            layoutParams.height = iM186890d;
            layoutParams.width = iM186890d;
            layoutParams.topMargin = t100.m186890d(36.0f);
            layoutParams.bottomMargin = t100.m186890d(26.0f);
            simpleDraweeView.setLayoutParams(layoutParams);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
            ((djj) simpleDraweeView.getHierarchy()).m112053H(roundingParams);
            xdl0.m208329E0(simpleDraweeView, new View.OnClickListener() { // from class: l.fki
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterVerificationUserMsgDlg.m45394G(act, user, view);
                }
            });
            qib0.f154691G.m102331L0(simpleDraweeView, user.m60124fp().profileSmall().formatted());
        } else if (filterFrom == FilterFrom.CONV_LIST || filterFrom == FilterFrom.MSG_DEEPLINK || filterFrom == FilterFrom.SETTING_PAGE) {
            simpleDraweeView.setImageResource(CoreModule.m29935P().m94658i().mo158297R5());
            vText.setText("真实头像认证");
            vText2.setText("完成认证后，可设置只和完成认证的用户聊天");
        }
        i0e.m133797f(cwf0VarM133794c);
        String string = act.getResources().getString(R$string.f20723B6);
        vText3.setText(act.getResources().getString(R$string.f21090t5) + string);
        boolean zM45401O = m45401O(CoreModule.f17545c.f19552B0.m31618q4());
        final yk5 yk5Var = new yk5(act, 1);
        yk5Var.m215118D(new ViewOnClickListenerC8333a(yk5Var, zM45401O, filterFrom, vCheckBoxArr));
        cjj0.m107173a(vText3, string, Color.parseColor("#FE7E1D"), new d30() { // from class: l.gki
            @Override // p149l.d30
            public final void call() {
                yk5Var.show();
            }
        });
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.hki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m45395H(dd80VarArr, d30Var, view);
            }
        });
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.iki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterVerificationUserMsgDlg.m45404x(vCheckBoxArr, filterFrom, dd80VarArr, act, view);
            }
        });
        if (filterFrom == filterFrom2 && zM45401O) {
            r2 = 0;
            vButton.setEnabled(false);
            vButton.setText("认证审核中");
            vCheckBoxArr[0].setEnabled(false);
            vButton.setTextColor(act.getResources().getColor(a1c0.f67166t));
            vButton.setBackgroundResource(c3c0.f78833p5);
        } else {
            r2 = 0;
        }
        dd80VarArr[r2] = c16336a.m110963R(viewInflate).m110961P(r2).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.jki
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FilterVerificationUserMsgDlg.m45392E(c4g0VarArr, filterFrom, cwf0VarM133794c, dialogInterface);
            }
        }).m110989r0();
        c4g0VarArr[r2] = act.duringCreated(CoreModule.f17545c.f19552B0.m31611j4()).subscribe(mkd0.m154955G(new e30() { // from class: l.kki
            @Override // p149l.e30
            public final void call(Object obj) {
                FilterVerificationUserMsgDlg.m45391D(dd80VarArr, (VerificationCenter) obj);
            }
        }));
        return dd80VarArr[r2];
    }

    /* JADX INFO: renamed from: N */
    private void m45400N() {
        VImage vImage = (VImage) findViewById(y4c0.f196028Q0);
        vImage.setImageResource(CoreModule.m29935P().m94658i().mo158411m5());
        this.f29166g = (VSwitchButton) findViewById(y4c0.f196042S2);
        this.f29168i = (VText) findViewById(y4c0.f196140h3);
        this.f29169j = (FrameLayout) findViewById(y4c0.f196030Q2);
        this.f29167h = (VFrame) findViewById(y4c0.f196036R2);
        ((VText) findViewById(y4c0.f196034R0)).setTypeface(null, 1);
        xdl0.m208329E0(vImage, new View.OnClickListener() { // from class: l.mki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134330a.m45402P(view);
            }
        });
        xdl0.m208329E0(this.f29167h, new View.OnClickListener() { // from class: l.nki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139428a.m45403Q(view);
            }
        });
        duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19552B0.m31611j4(), new on6())).subscribe(mkd0.m154955G(new e30() { // from class: l.oki
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144436a.m45408R((j760) obj);
            }
        }));
        BottomSheetBehavior.from(findViewById(C2466R.id.design_bottom_sheet)).setState(3);
        PutongAct.setLightStatusBar(getWindow(), 16);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m45401O(VerificationCenter verificationCenter) {
        if (NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo)) {
            return TEnum.equals(verificationCenter.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenter.picVerificationInfo.status, StudentVerificationStatus.prePending);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m45402P(View view) {
        m101651T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m45403Q(View view) {
        m45407I();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m45404x(VCheckBox[] vCheckBoxArr, FilterFrom filterFrom, dd80[] dd80VarArr, Act act, View view) {
        if (!vCheckBoxArr[0].isChecked()) {
            lsi0.m151595y("请先勾选并同意《认证协议》后再进行认证哦~");
            return;
        }
        if (m45401O(CoreModule.f17545c.f19552B0.m31618q4())) {
            lsi0.m151595y("认证审核中，请稍后再试");
            return;
        }
        FilterFrom filterFrom2 = FilterFrom.MSG_PAGE;
        if (filterFrom == filterFrom2) {
            zvf0.m220396r("e_start_verification", "p_disable_chat_lead_to_verify");
        } else {
            zvf0.m220396r("e_start_verification", "p_popup_verify_to_set");
        }
        if (filterFrom != filterFrom2) {
            dd80VarArr[0].dismiss();
        }
        m45396J(act);
    }

    /* JADX INFO: renamed from: I */
    public final void m45407I() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (verificationCenterM31612k4 == null || verificationCenterM31612k4.picVerificationInfo == null) {
            m101651T();
            m45398L(this.f29165f, this.f29171l, null);
        } else {
            if (m45401O(verificationCenterM31612k4)) {
                return;
            }
            if (TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, StudentVerificationStatus.get("verified"))) {
                m45410T(!CoreModule.f17545c.f19639e0.m169527p9().isOpenFilterVeriMsg());
            } else {
                m101651T();
                m45398L(this.f29165f, this.f29171l, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m45408R(j760 j760Var) {
        boolean zM45401O = m45401O((VerificationCenter) j760Var.f116565b);
        VText vText = this.f29168i;
        if (zM45401O) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f29169j, false);
        } else {
            xdl0.m208344M(vText, false);
            xdl0.m208344M(this.f29169j, true);
            this.f29166g.setChecked(CoreModule.f17545c.f19639e0.m169490g8());
        }
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m45409S(DialogInterface dialogInterface) {
        i0e.m133796e(this.f29170k);
    }

    /* JADX INFO: renamed from: T */
    public final void m45410T(boolean z) {
        zvf0.m220399u("e_chat_to_verified_switch", "p_settings_chat_to_verified", vwb.m200311Y("after_status", z ? "on" : BLiveOperationTitleShowType.off));
        CoreModule.f17545c.f19639e0.m169373B9(z);
    }
}
