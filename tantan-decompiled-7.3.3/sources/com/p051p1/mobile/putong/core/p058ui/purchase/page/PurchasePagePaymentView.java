package com.p051p1.mobile.putong.core.p058ui.purchase.page;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a30;
import p153l.bnl0;
import p153l.efb0;
import p153l.ndb0;
import p153l.tab0;
import p153l.u8b0;
import p153l.w3m;
import p153l.wib0;
import p153l.y20;
import p153l.y8b0;
import p153l.ydb0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00152\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\u00152\u001c\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\"¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u00020\u00152\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0011\u0018\u00010\"¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0019J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010\u0019J\u000f\u0010/\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010\u0019R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u0016\u0010<\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020?0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010@R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010BR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR,\u0010O\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0011\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010C¨\u0006T"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePagePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", "f", "()V", "Ll/y20;", "", "dialogStateAction", "setDialogStateAction", "(Ll/y20;)V", "other", "setOnlineMatchPushUser", "(Ljava/lang/String;)V", "Ll/a30;", "Lcom/p1/mobile/android/app/Act;", "onPaySuccess", "setOnPaymentSuccess", "(Ll/a30;)V", "failed", "setOnPaymentFailed", Constants.INAPP_DATA_TAG, "", "show", "setPageState", "(Z)V", "b", "g", "e", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "get_agreement", "set_agreement", "_agreement", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/ndb0;", "", "Ll/w3m;", "Ljava/util/List;", "purchaseComponentsList", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Ll/efb0;", "h", "Ll/efb0;", "paymentComponent", RXScreenCaptureService.KEY_INDEX, "Ll/w3m;", "agreementComponent", "j", "Ll/y20;", "k", "Ll/a30;", "onPaymentSuccessAction", BLiveStormDanmakuGiftResourceType.f45292l, "onPaymentFailedAction", "m", "onlineMatchPushUser", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class PurchasePagePaymentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _payment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _agreement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public efb0 paymentComponent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public w3m agreementComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String onlineMatchPushUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePagePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        this.act = (Act) activityM105506D;
        this.purchaseComponentsList = new ArrayList();
        this.from = "p_purchase_page";
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        m55346a(layoutInflaterInflater, this);
        setOrientation(1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m55346a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM215207b = ydb0.m215207b(this, inflater, parent);
        viewM215207b.getClass();
        return viewM215207b;
    }

    /* JADX INFO: renamed from: b */
    public final void m55347b() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206565i(purchaseType)) {
            setBackgroundColor(Color.parseColor("#2D2117"));
        } else {
            setBackgroundColor(Color.parseColor("#ffffffff"));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m55348c(@NotNull PurchaseType purchaseType, @Nullable String from, @Nullable ndb0 mediator) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.mediator = mediator;
        this.from = from;
    }

    /* JADX INFO: renamed from: d */
    public final void m55349d() {
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m55350e() {
        PurchaseType purchaseType;
        w3m u8b0Var;
        if (this.agreementComponent != null || (purchaseType = this.purchaseType) == null) {
            return;
        }
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206560d(purchaseType)) {
            boolean zM189835z = tab0.m189811h().m189835z();
            Act act = this.act;
            if (zM189835z) {
                PurchaseType purchaseType3 = this.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.m88391r("purchaseType");
                } else {
                    purchaseType2 = purchaseType3;
                }
                u8b0Var = new y8b0(act, purchaseType2, "purchasePage", this.mediator);
            } else {
                PurchaseType purchaseType4 = this.purchaseType;
                if (purchaseType4 == null) {
                    Intrinsics.m88391r("purchaseType");
                } else {
                    purchaseType2 = purchaseType4;
                }
                u8b0Var = new u8b0(act, purchaseType2, "purchasePage", this.mediator);
            }
            this.agreementComponent = u8b0Var;
            if (u8b0Var instanceof y8b0) {
                y8b0 y8b0Var = (y8b0) u8b0Var;
                y8b0Var.m214747t(true);
                y8b0Var.m214748u(true);
            } else if (u8b0Var instanceof u8b0) {
                u8b0 u8b0Var2 = (u8b0) u8b0Var;
                u8b0Var2.m195011w(true);
                u8b0Var2.m195012x(true);
            }
            get_agreement().addView(u8b0Var.mo96551a(get_agreement()));
            u8b0Var.register();
            this.purchaseComponentsList.add(u8b0Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m55351f() {
        m55347b();
        m55352g();
        m55350e();
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo152867b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m55352g() {
        if (this.paymentComponent != null || this.purchaseType == null) {
            return;
        }
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        efb0 efb0Var = new efb0(act, purchaseType, this.from, this.mediator);
        this.paymentComponent = efb0Var;
        get_payment().addView(efb0Var.mo96551a(get_payment()));
        efb0Var.m152860O(this.dialogStateAction);
        String str = this.onlineMatchPushUser;
        if (str != null) {
            efb0Var.m152863R(str);
        }
        efb0Var.m152862Q(this.onPaymentSuccessAction);
        efb0Var.register();
        this.purchaseComponentsList.add(efb0Var);
    }

    @NotNull
    public final FrameLayout get_agreement() {
        FrameLayout frameLayout = this._agreement;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_agreement");
        return null;
    }

    @NotNull
    public final FrameLayout get_payment() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_payment");
        return null;
    }

    public final void setDialogStateAction(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setOnPaymentFailed(@Nullable a30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    public final void setOnlineMatchPushUser(@Nullable String other) {
        this.onlineMatchPushUser = other;
    }

    public final void setPageState(boolean show) {
        efb0 efb0Var = this.paymentComponent;
        if (efb0Var != null) {
            efb0Var.m120670o0(show);
        }
    }

    public final void set_agreement(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._agreement = frameLayout;
    }

    public final void set_payment(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._payment = frameLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePagePaymentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PurchasePagePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
