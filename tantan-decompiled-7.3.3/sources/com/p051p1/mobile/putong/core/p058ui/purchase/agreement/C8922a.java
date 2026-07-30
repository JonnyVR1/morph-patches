package com.p051p1.mobile.putong.core.p058ui.purchase.agreement;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.camera.TTCameraConfig;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.agreement.C8922a;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VCheckBox;
import p151v.VText;
import p153l.bn60;
import p153l.bnl0;
import p153l.chl;
import p153l.jbc0;
import p153l.od0;
import p153l.pta;
import p153l.qa00;
import p153l.wib0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.agreement.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010(\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u001fR\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010OR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010Q¨\u0006S"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/agreement/a;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "privilegeStyle", Constants.INAPP_DATA_TAG, "(Z)Landroid/view/View;", "", TTCameraConfig.TYPE_AGREEMENT, "", "b", "(Ljava/lang/CharSequence;)V", "c", "()Ljava/lang/Boolean;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "a", "()Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "m", "()V", "Ll/y20;", "callback", "n", "(Ll/y20;)V", "isChecked", "h", "(Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "composePurchaseType", "autoAgreementIsClick", "forceShowCheck", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "o", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/data/PurchaseType;ZZZLcom/p1/mobile/putong/data/PayMethod;)V", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/LinearLayout;", "set_agreement_container", "(Landroid/widget/LinearLayout;)V", "_agreement_container", "Lv/VCheckBox;", "Lv/VCheckBox;", "k", "()Lv/VCheckBox;", "set_agreement_container_check", "(Lv/VCheckBox;)V", "_agreement_container_check", "Lv/VText;", "Lv/VText;", "j", "()Lv/VText;", "set_agreement_container_agreement", "(Lv/VText;)V", "_agreement_container_agreement", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "f", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "detail", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "state", "Ll/y20;", "", "I", "agreementPadding", "Z", "purchasePageType", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8922a implements InterfaceC8923b {

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
    public C8928d detail;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public AgreementComponent.AgreementState state;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public y20<Boolean> callback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int agreementPadding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean purchasePageType;

    /* JADX INFO: renamed from: e */
    public static void m54387e(C8922a c8922a, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        AgreementComponent.AgreementState agreementState = z ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        c8922a.state = agreementState;
        y20<Boolean> y20Var = c8922a.callback;
        if (y20Var != null) {
            y20Var.call(Boolean.valueOf(agreementState == AgreementComponent.AgreementState.checked));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m54388f(C8922a c8922a) {
        c8922a.m54396j().requestLayout();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.agreement.InterfaceC8923b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public AgreementComponent.AgreementState getState() {
        return this.state;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.agreement.InterfaceC8923b
    /* JADX INFO: renamed from: b */
    public void mo54390b(@NotNull CharSequence agreement) {
        agreement.getClass();
        if (agreement instanceof Spannable) {
            m54396j().setOnTouchListener(new od0((Spannable) agreement));
        } else {
            m54396j().setOnTouchListener(null);
        }
        m54396j().setText(agreement);
        m54396j().post(new Runnable() { // from class: l.bhl
            @Override // java.lang.Runnable
            public final void run() {
                C8922a.m54388f(this.f76793a);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.agreement.InterfaceC8923b
    @NotNull
    /* JADX INFO: renamed from: c */
    public Boolean mo54391c() {
        if (this._agreement_container != null && m54395i().getVisibility() == 0 && m54395i().isShown()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.act.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int[] iArr = new int[2];
            m54395i().getLocationOnScreen(iArr);
            int iMax = Math.max(iArr[0], 0);
            int iMin = Math.min(iArr[0] + m54395i().getWidth(), displayMetrics.widthPixels);
            if (iMin > iMax) {
                return Boolean.valueOf(iMin - iMax > displayMetrics.widthPixels / 2);
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.agreement.InterfaceC8923b
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo54392d(boolean privilegeStyle) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        View viewM54393g = m54393g(layoutInflaterInflater, null);
        if (this.purchasePageType) {
            ViewGroup.LayoutParams layoutParams = m54395i().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388611;
            int i = this.agreementPadding;
            layoutParams2.leftMargin = i;
            layoutParams2.rightMargin = i;
            m54395i().setLayoutParams(layoutParams2);
            m54396j().setGravity(8388627);
        }
        m54396j().setTextColor(bn60.m105334Q(privilegeStyle));
        m54396j().setTextSize(10.0f);
        m54396j().setClickable(true);
        m54396j().setMaxLines(2);
        m54396j().setEllipsize(TextUtils.TruncateAt.END);
        m54397k().setChecked(false);
        m54397k().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ahl
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C8922a.m54387e(this.f71373a, compoundButton, z);
            }
        });
        return viewM54393g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m54393g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM109838b = chl.m109838b(this, inflater, parent);
        viewM109838b.getClass();
        return viewM109838b;
    }

    /* JADX INFO: renamed from: h */
    public final void m54394h(boolean isChecked) {
        m54397k().setChecked(isChecked);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LinearLayout m54395i() {
        LinearLayout linearLayout = this._agreement_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_agreement_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m54396j() {
        VText vText = this._agreement_container_agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_agreement_container_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VCheckBox m54397k() {
        VCheckBox vCheckBox = this._agreement_container_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.m88391r("_agreement_container_check");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m54398l(boolean privilegeStyle) {
        Drawable drawable;
        if (this.currentPurchaseType != null) {
            bnl0.m105538V(m54395i(), this.agreementPadding);
            bnl0.m105539W(m54395i(), this.agreementPadding);
            m54396j().setGravity(19);
            VCheckBox vCheckBoxM54397k = m54397k();
            if (!privilegeStyle) {
                bnl0.m105538V(m54395i(), qa00.m175859d(26.0f));
                bnl0.m105539W(m54395i(), qa00.m175859d(26.0f));
                drawable = this.act.drawable(jbc0.f119494Za);
            } else if (wib0.m206579w(this.currentPurchaseType)) {
                boolean z = this.purchasePageType;
                Act act = this.act;
                drawable = z ? act.drawable(jbc0.f119275J6) : act.drawable(jbc0.f119491Z7);
            } else if (wib0.m206573q(this.currentPurchaseType)) {
                boolean z2 = this.purchasePageType;
                Act act2 = this.act;
                drawable = z2 ? act2.drawable(jbc0.f119275J6) : act2.drawable(jbc0.f119478Y7);
            } else if (wib0.m206565i(this.currentPurchaseType)) {
                boolean z3 = this.purchasePageType;
                Act act3 = this.act;
                drawable = z3 ? act3.drawable(jbc0.f119373Q6) : act3.drawable(jbc0.f119261I6);
            } else {
                boolean zM206571o = wib0.m206571o(this.currentPurchaseType);
                Act act4 = this.act;
                drawable = zM206571o ? act4.drawable(jbc0.f119812w7) : act4.drawable(jbc0.f119491Z7);
            }
            vCheckBoxM54397k.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m54399m() {
        m54397k().setChecked(true);
        y20<Boolean> y20Var = this.callback;
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m54400n(@NotNull y20<Boolean> callback) {
        callback.getClass();
        this.callback = callback;
    }

    /* JADX INFO: renamed from: o */
    public final void m54401o(@NotNull C8928d purchaseSection, @NotNull PurchaseType composePurchaseType, boolean autoAgreementIsClick, boolean privilegeStyle, boolean forceShowCheck, @Nullable PayMethod currentPayMethod) {
        purchaseSection.getClass();
        composePurchaseType.getClass();
        if (wib0.m206560d(composePurchaseType)) {
            m54397k().setChecked(autoAgreementIsClick);
            boolean zM54714m = purchaseSection.m54714m();
            this.detail = purchaseSection;
            this.currentPurchaseType = composePurchaseType;
            if (zM54714m && pta.m173726s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB")) {
                m54398l(privilegeStyle);
            }
            bnl0.m105524M(m54397k(), (purchaseSection.m54714m() || forceShowCheck) && pta.m173726s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB") && !TEnum.equals(currentPayMethod, PayMethod.jingdong));
        }
    }
}
