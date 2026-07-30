package com.p046p1.mobile.putong.core.p053ui.purchase.agreement;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.camera.TTCameraConfig;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.agreement.C8759a;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VCheckBox;
import p147v.VText;
import p149l.d3c0;
import p149l.dsa;
import p149l.e30;
import p149l.mel;
import p149l.sab0;
import p149l.sd0;
import p149l.t100;
import p149l.we60;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.agreement.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010(\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u001fR\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010OR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010Q¨\u0006S"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/agreement/a;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "privilegeStyle", Constants.INAPP_DATA_TAG, "(Z)Landroid/view/View;", "", TTCameraConfig.TYPE_AGREEMENT, "", "b", "(Ljava/lang/CharSequence;)V", "c", "()Ljava/lang/Boolean;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "a", "()Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "m", "()V", "Ll/e30;", "callback", "n", "(Ll/e30;)V", "isChecked", "h", "(Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "composePurchaseType", "autoAgreementIsClick", "forceShowCheck", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "o", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/data/PurchaseType;ZZZLcom/p1/mobile/putong/data/PayMethod;)V", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/LinearLayout;", "set_agreement_container", "(Landroid/widget/LinearLayout;)V", "_agreement_container", "Lv/VCheckBox;", "Lv/VCheckBox;", "k", "()Lv/VCheckBox;", "set_agreement_container_check", "(Lv/VCheckBox;)V", "_agreement_container_check", "Lv/VText;", "Lv/VText;", "j", "()Lv/VText;", "set_agreement_container_agreement", "(Lv/VText;)V", "_agreement_container_agreement", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "f", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "detail", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "state", "Ll/e30;", "", "I", "agreementPadding", "Z", "purchasePageType", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8759a implements InterfaceC8760b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _agreement_container;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VCheckBox _agreement_container_check;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _agreement_container_agreement;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PurchaseType currentPurchaseType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C8765d detail;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public AgreementComponent.AgreementState state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public e30<Boolean> callback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int agreementPadding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: e */
    public static void m53204e(C8759a c8759a, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        AgreementComponent.AgreementState agreementState = z ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        c8759a.state = agreementState;
        e30<Boolean> e30Var = c8759a.callback;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(agreementState == AgreementComponent.AgreementState.checked));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m53205f(C8759a c8759a) {
        c8759a.m53213j().requestLayout();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.agreement.InterfaceC8760b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public AgreementComponent.AgreementState getState() {
        return this.state;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.agreement.InterfaceC8760b
    /* JADX INFO: renamed from: b */
    public void mo53207b(@NotNull CharSequence agreement) {
        agreement.getClass();
        if (agreement instanceof Spannable) {
            m53213j().setOnTouchListener(new sd0((Spannable) agreement));
        } else {
            m53213j().setOnTouchListener(null);
        }
        m53213j().setText(agreement);
        m53213j().post(new Runnable() { // from class: l.lel
            @Override // java.lang.Runnable
            public final void run() {
                C8759a.m53205f(this.f127721a);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.agreement.InterfaceC8760b
    @NotNull
    /* JADX INFO: renamed from: c */
    public Boolean mo53208c() {
        if (this._agreement_container != null && m53212i().getVisibility() == 0 && m53212i().isShown()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.act.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int[] iArr = new int[2];
            m53212i().getLocationOnScreen(iArr);
            int iMax = Math.max(iArr[0], 0);
            int iMin = Math.min(iArr[0] + m53212i().getWidth(), displayMetrics.widthPixels);
            if (iMin > iMax) {
                return Boolean.valueOf(iMin - iMax > displayMetrics.widthPixels / 2);
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.agreement.InterfaceC8760b
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo53209d(boolean privilegeStyle) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        View viewM53210g = m53210g(layoutInflaterInflater, null);
        if (this.purchasePageType) {
            ViewGroup.LayoutParams layoutParams = m53212i().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388611;
            int i = this.agreementPadding;
            layoutParams2.leftMargin = i;
            layoutParams2.rightMargin = i;
            m53212i().setLayoutParams(layoutParams2);
            m53213j().setGravity(8388627);
        }
        m53213j().setTextColor(we60.m202852Q(privilegeStyle));
        m53213j().setTextSize(10.0f);
        m53213j().setClickable(true);
        m53213j().setMaxLines(2);
        m53213j().setEllipsize(TextUtils.TruncateAt.END);
        m53214k().setChecked(false);
        m53214k().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.kel
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C8759a.m53204e(this.f122720a, compoundButton, z);
            }
        });
        return viewM53210g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m53210g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM154254b = mel.m154254b(this, inflater, parent);
        viewM154254b.getClass();
        return viewM154254b;
    }

    /* JADX INFO: renamed from: h */
    public final void m53211h(boolean isChecked) {
        m53214k().setChecked(isChecked);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LinearLayout m53212i() {
        LinearLayout linearLayout = this._agreement_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_agreement_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m53213j() {
        VText vText = this._agreement_container_agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_agreement_container_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VCheckBox m53214k() {
        VCheckBox vCheckBox = this._agreement_container_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m87502r("_agreement_container_check");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m53215l(boolean privilegeStyle) {
        Drawable drawable;
        if (this.currentPurchaseType != null) {
            xdl0.m208358V(m53212i(), this.agreementPadding);
            xdl0.m208359W(m53212i(), this.agreementPadding);
            m53213j().setGravity(19);
            VCheckBox vCheckBoxM53214k = m53214k();
            if (!privilegeStyle) {
                xdl0.m208358V(m53212i(), t100.m186890d(26.0f));
                xdl0.m208359W(m53212i(), t100.m186890d(26.0f));
                drawable = this.act.drawable(d3c0.f83839Za);
            } else if (sab0.m182905w(this.currentPurchaseType)) {
                boolean z = this.purchasePageType;
                Act act = this.act;
                drawable = z ? act.drawable(d3c0.f83620J6) : act.drawable(d3c0.f83836Z7);
            } else if (sab0.m182899q(this.currentPurchaseType)) {
                boolean z2 = this.purchasePageType;
                Act act2 = this.act;
                drawable = z2 ? act2.drawable(d3c0.f83620J6) : act2.drawable(d3c0.f83823Y7);
            } else if (sab0.m182891i(this.currentPurchaseType)) {
                boolean z3 = this.purchasePageType;
                Act act3 = this.act;
                drawable = z3 ? act3.drawable(d3c0.f83718Q6) : act3.drawable(d3c0.f83606I6);
            } else {
                boolean zM182897o = sab0.m182897o(this.currentPurchaseType);
                Act act4 = this.act;
                drawable = zM182897o ? act4.drawable(d3c0.f84157w7) : act4.drawable(d3c0.f83836Z7);
            }
            vCheckBoxM53214k.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m53216m() {
        m53214k().setChecked(true);
        e30<Boolean> e30Var = this.callback;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m53217n(@NotNull e30<Boolean> callback) {
        callback.getClass();
        this.callback = callback;
    }

    /* JADX INFO: renamed from: o */
    public final void m53218o(@NotNull C8765d purchaseSection, @NotNull PurchaseType composePurchaseType, boolean autoAgreementIsClick, boolean privilegeStyle, boolean forceShowCheck, @Nullable PayMethod currentPayMethod) {
        purchaseSection.getClass();
        composePurchaseType.getClass();
        if (sab0.m182886d(composePurchaseType)) {
            m53214k().setChecked(autoAgreementIsClick);
            boolean zM53531m = purchaseSection.m53531m();
            this.detail = purchaseSection;
            this.currentPurchaseType = composePurchaseType;
            if (zM53531m && dsa.m113446s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB")) {
                m53215l(privilegeStyle);
            }
            xdl0.m208344M(m53214k(), (purchaseSection.m53531m() || forceShowCheck) && dsa.m113446s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB") && !TEnum.equals(currentPayMethod, PayMethod.jingdong));
        }
    }
}
