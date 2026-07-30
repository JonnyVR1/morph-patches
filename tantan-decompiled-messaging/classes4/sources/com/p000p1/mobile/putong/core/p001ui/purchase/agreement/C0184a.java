package com.p000p1.mobile.putong.core.p001ui.purchase.agreement;

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
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p000p1.mobile.putong.core.p001ui.purchase.agreement.C0184a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d3c0;
import l.dsa;
import l.e30;
import l.mel;
import l.sab0;
import l.t100;
import l.we60;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.sd0;
import v.VCheckBox;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.agreement.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010(\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u001fR\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u0002078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010MR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010OR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010Q¨\u0006S"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/agreement/a;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "g", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "privilegeStyle", "d", "(Z)Landroid/view/View;", "", "agreement", "", "b", "(Ljava/lang/CharSequence;)V", "c", "()Ljava/lang/Boolean;", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "a", "()Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "m", "()V", "Ll/e30;", "callback", "n", "(Ll/e30;)V", "isChecked", "h", "(Z)V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "composePurchaseType", "autoAgreementIsClick", "forceShowCheck", "Lcom/p1/mobile/putong/data/PayMethod;", "currentPayMethod", "o", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lcom/p1/mobile/putong/core/data/PurchaseType;ZZZLcom/p1/mobile/putong/data/PayMethod;)V", "l", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "act", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "i", "()Landroid/widget/LinearLayout;", "set_agreement_container", "(Landroid/widget/LinearLayout;)V", "_agreement_container", "Lv/VCheckBox;", "Lv/VCheckBox;", "k", "()Lv/VCheckBox;", "set_agreement_container_check", "(Lv/VCheckBox;)V", "_agreement_container_check", "Lv/VText;", "Lv/VText;", "j", "()Lv/VText;", "set_agreement_container_agreement", "(Lv/VText;)V", "_agreement_container_agreement", "e", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "f", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "detail", "Lcom/p1/mobile/putong/core/ui/purchase/agreement/AgreementComponent$AgreementState;", "state", "Ll/e30;", "", "I", "agreementPadding", "Z", "purchasePageType", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0184a implements InterfaceC0185b {

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
    public C0190d detail;

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
    public static void m3770e(C0184a c0184a, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        AgreementComponent.AgreementState agreementState = z ? AgreementComponent.AgreementState.checked : AgreementComponent.AgreementState.unchecked;
        c0184a.state = agreementState;
        e30<Boolean> e30Var = c0184a.callback;
        if (e30Var != null) {
            e30Var.call(Boolean.valueOf(agreementState == AgreementComponent.AgreementState.checked));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m3771f(C0184a c0184a) {
        c0184a.m3779j().requestLayout();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.purchase.agreement.InterfaceC0185b
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public AgreementComponent.AgreementState getState() {
        return this.state;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.purchase.agreement.InterfaceC0185b
    /* JADX INFO: renamed from: b */
    public void mo3773b(@NotNull CharSequence agreement) {
        agreement.getClass();
        if (agreement instanceof Spannable) {
            m3779j().setOnTouchListener(new sd0((Spannable) agreement));
        } else {
            m3779j().setOnTouchListener(null);
        }
        m3779j().setText(agreement);
        m3779j().post(new Runnable() { // from class: l.lel
            @Override // java.lang.Runnable
            public final void run() {
                C0184a.m3771f(this.f14810a);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.purchase.agreement.InterfaceC0185b
    @NotNull
    /* JADX INFO: renamed from: c */
    public Boolean mo3774c() {
        if (this._agreement_container != null && m3778i().getVisibility() == 0 && m3778i().isShown()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.act.getWindow().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int[] iArr = new int[2];
            m3778i().getLocationOnScreen(iArr);
            int iMax = Math.max(iArr[0], 0);
            int iMin = Math.min(iArr[0] + m3778i().getWidth(), displayMetrics.widthPixels);
            if (iMin > iMax) {
                return Boolean.valueOf(iMin - iMax > displayMetrics.widthPixels / 2);
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.purchase.agreement.InterfaceC0185b
    @NotNull
    /* JADX INFO: renamed from: d */
    public View mo3775d(boolean privilegeStyle) {
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        View viewM3776g = m3776g(layoutInflaterInflater, null);
        if (this.purchasePageType) {
            ViewGroup.LayoutParams layoutParams = m3778i().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 8388611;
            int i = this.agreementPadding;
            layoutParams2.leftMargin = i;
            layoutParams2.rightMargin = i;
            m3778i().setLayoutParams(layoutParams2);
            m3779j().setGravity(8388627);
        }
        m3779j().setTextColor(we60.Q(privilegeStyle));
        m3779j().setTextSize(10.0f);
        m3779j().setClickable(true);
        m3779j().setMaxLines(2);
        m3779j().setEllipsize(TextUtils.TruncateAt.END);
        m3780k().setChecked(false);
        m3780k().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.kel
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C0184a.m3770e(this.f14300a, compoundButton, z);
            }
        });
        return viewM3776g;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final View m3776g(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = mel.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: h */
    public final void m3777h(boolean isChecked) {
        m3780k().setChecked(isChecked);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final LinearLayout m3778i() {
        LinearLayout linearLayout = this._agreement_container;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_agreement_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VText m3779j() {
        VText vText = this._agreement_container_agreement;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_agreement_container_agreement");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VCheckBox m3780k() {
        VCheckBox vCheckBox = this._agreement_container_check;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_agreement_container_check");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m3781l(boolean privilegeStyle) {
        Drawable drawable;
        if (this.currentPurchaseType != null) {
            xdl0.V(m3778i(), this.agreementPadding);
            xdl0.W(m3778i(), this.agreementPadding);
            m3779j().setGravity(19);
            VCheckBox vCheckBoxM3780k = m3780k();
            if (!privilegeStyle) {
                xdl0.V(m3778i(), t100.d(26.0f));
                xdl0.W(m3778i(), t100.d(26.0f));
                drawable = this.act.drawable(d3c0.Za);
            } else if (sab0.w(this.currentPurchaseType)) {
                boolean z = this.purchasePageType;
                Act act = this.act;
                drawable = z ? act.drawable(d3c0.J6) : act.drawable(d3c0.Z7);
            } else if (sab0.q(this.currentPurchaseType)) {
                boolean z2 = this.purchasePageType;
                Act act2 = this.act;
                drawable = z2 ? act2.drawable(d3c0.J6) : act2.drawable(d3c0.Y7);
            } else if (sab0.i(this.currentPurchaseType)) {
                boolean z3 = this.purchasePageType;
                Act act3 = this.act;
                drawable = z3 ? act3.drawable(d3c0.Q6) : act3.drawable(d3c0.I6);
            } else {
                boolean zO = sab0.o(this.currentPurchaseType);
                Act act4 = this.act;
                drawable = zO ? act4.drawable(d3c0.w7) : act4.drawable(d3c0.Z7);
            }
            vCheckBoxM3780k.setBackground(drawable);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3782m() {
        m3780k().setChecked(true);
        e30<Boolean> e30Var = this.callback;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3783n(@NotNull e30<Boolean> callback) {
        callback.getClass();
        this.callback = callback;
    }

    /* JADX INFO: renamed from: o */
    public final void m3784o(@NotNull C0190d purchaseSection, @NotNull PurchaseType composePurchaseType, boolean autoAgreementIsClick, boolean privilegeStyle, boolean forceShowCheck, @Nullable PayMethod currentPayMethod) {
        purchaseSection.getClass();
        composePurchaseType.getClass();
        if (sab0.d(composePurchaseType)) {
            m3780k().setChecked(autoAgreementIsClick);
            boolean zM4097m = purchaseSection.m4097m();
            this.detail = purchaseSection;
            this.currentPurchaseType = composePurchaseType;
            if (zM4097m && dsa.s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB")) {
                m3781l(privilegeStyle);
            }
            xdl0.M(m3780k(), (purchaseSection.m4097m() || forceShowCheck) && dsa.s("PURCHASE_DIALOG_SINGLEPURCHASE_DIALOG_TAB") && !TEnum.equals(currentPayMethod, "jingdong"));
        }
    }
}
