package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.PrivilegePaymentView;
import com.p051p1.mobile.putong.data.PayMethod;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cok0;
import p153l.joa;
import p153l.ndb0;
import p153l.qe90;
import p153l.s7a;
import p153l.tab0;
import p153l.u8b0;
import p153l.w3m;
import p153l.wib0;
import p153l.x20;
import p153l.y20;
import p153l.y8b0;
import p153l.yfb0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0015¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u0010\u0019R\"\u00108\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010B\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010FR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010HR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010PR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/ndb0;", "mediator", "", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/ndb0;)V", Constants.INAPP_DATA_TAG, "()V", "e", "h", "", "alpha", "setViewsAlpha", "(F)V", "currentPagePurchaseType", "setCurrentPurchaseType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/y20;", "Lcom/p1/mobile/putong/data/PayMethod;", "onPayTypeSelectAction", "setOnPayTypeSelect", "(Ll/y20;)V", "Ll/x20;", "onNoPrivilegeClick", "setOnNoPrivilegeClick", "(Ll/x20;)V", "g", "", "c", "()Z", "j", RXScreenCaptureService.KEY_INDEX, "a", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "(Landroid/view/View;)V", "_divider", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "get_agreement", "set_agreement", "_agreement", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Ll/ndb0;", "", "Ll/w3m;", "Ljava/util/List;", "purchaseComponentsList", "Ll/yfb0;", "Ll/yfb0;", "paymentComponent", "Ll/w3m;", "agreementComponent", "k", "Ll/y20;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/x20;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivilegePaymentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _divider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _payment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _agreement;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public yfb0 paymentComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public w3m agreementComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public y20<PayMethod> onPayTypeSelectAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public x20 onNoPrivilegeClick;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.PrivilegePaymentView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C9148a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38363a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            try {
                iArr[PurchaseType.TYPE_SUPREME_PARTNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchaseType.TYPE_O_DIAMOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PurchaseType.TYPE_O_PLATINUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PurchaseType.TYPE_FEMALE_VIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PurchaseType.TYPE_YOUTH_VIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f38363a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        this.act = (Act) activityM105506D;
        this.from = cok0.f82895a;
        this.purchaseComponentsList = new ArrayList();
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        m58082b(layoutInflaterInflater, this);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: k */
    public static final void m58081k(PrivilegePaymentView privilegePaymentView, Integer num) {
        ndb0 ndb0Var;
        if (num == null || num.intValue() != 3 || (ndb0Var = privilegePaymentView.mediator) == null) {
            return;
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        ndb0Var.m162679e0(payMethod);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m58082b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM176233b = qe90.m176233b(this, inflater, parent);
        viewM176233b.getClass();
        return viewM176233b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m58083c() {
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        switch (C9148a.f38363a[purchaseType.ordinal()]) {
            case 1:
                return joa.m146363O3();
            case 2:
                return joa.m146357G3();
            case 3:
                return joa.m146359I3();
            case 4:
                return joa.m146361M3();
            case 5:
                return joa.m146353C3();
            case 6:
                return CoreModule.f18264c.f20381e0.m116600p9().isVIP();
            case 7:
                return joa.m146364P3();
            default:
                return joa.m146361M3();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m58084d() {
        m58090j();
        m58089i();
    }

    /* JADX INFO: renamed from: e */
    public final void m58085e() {
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo152867b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m58086f(@NotNull PurchaseType purchaseType, @Nullable String from, @Nullable ndb0 mediator) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.mediator = mediator;
        this.from = from;
    }

    /* JADX INFO: renamed from: g */
    public final void m58087g() {
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
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
    public final View get_divider() {
        View view = this._divider;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_divider");
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

    /* JADX INFO: renamed from: h */
    public final void m58088h() {
        boolean zM58083c = m58083c();
        if (zM58083c) {
            bnl0.m105524M(get_divider(), false);
            bnl0.m105524M(get_agreement(), false);
        } else {
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
                get_divider().setBackgroundColor(this.act.color(c9c0.f80420g1));
            }
            bnl0.m105524M(get_divider(), true);
            bnl0.m105524M(get_agreement(), true);
        }
        yfb0 yfb0Var = this.paymentComponent;
        if (yfb0Var != null) {
            yfb0Var.m215553u0(zM58083c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m58089i() {
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
                u8b0Var = new y8b0(act, purchaseType2, this.from, this.mediator);
            } else {
                PurchaseType purchaseType4 = this.purchaseType;
                if (purchaseType4 == null) {
                    Intrinsics.m88391r("purchaseType");
                } else {
                    purchaseType2 = purchaseType4;
                }
                u8b0Var = new u8b0(act, purchaseType2, this.from, this.mediator);
            }
            this.agreementComponent = u8b0Var;
            if (u8b0Var instanceof y8b0) {
                y8b0 y8b0Var = (y8b0) u8b0Var;
                y8b0Var.m214747t(true);
                y8b0Var.m214749v(true);
            } else if (u8b0Var instanceof u8b0) {
                u8b0 u8b0Var2 = (u8b0) u8b0Var;
                u8b0Var2.m195011w(true);
                u8b0Var2.m195013y(true);
            }
            get_agreement().addView(u8b0Var.mo96551a(get_agreement()));
            u8b0Var.register();
            this.purchaseComponentsList.add(u8b0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m58090j() {
        if (this.paymentComponent != null || this.purchaseType == null) {
            return;
        }
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        yfb0 yfb0Var = new yfb0(act, purchaseType, this.from, this.mediator);
        this.paymentComponent = yfb0Var;
        get_payment().addView(yfb0Var.mo96551a(get_payment()));
        ViewParent parent = getParent();
        parent.getClass();
        yfb0Var.m215556x0((ViewGroup) parent);
        yfb0Var.m215535A0(this.onPayTypeSelectAction);
        yfb0Var.m215558z0(this.onNoPrivilegeClick);
        yfb0Var.m152860O(new y20() { // from class: l.pe90
            @Override // p153l.y20
            public final void call(Object obj) {
                PrivilegePaymentView.m58081k(this.f151880a, (Integer) obj);
            }
        });
        yfb0Var.register();
        this.purchaseComponentsList.add(yfb0Var);
    }

    public final void setCurrentPurchaseType(@NotNull PurchaseType currentPagePurchaseType) {
        currentPagePurchaseType.getClass();
        yfb0 yfb0Var = this.paymentComponent;
        if (yfb0Var != null) {
            yfb0Var.m215557y0(currentPagePurchaseType);
        }
    }

    public final void setOnNoPrivilegeClick(@NotNull x20 onNoPrivilegeClick) {
        onNoPrivilegeClick.getClass();
        this.onNoPrivilegeClick = onNoPrivilegeClick;
    }

    public final void setOnPayTypeSelect(@Nullable y20<PayMethod> onPayTypeSelectAction) {
        this.onPayTypeSelectAction = onPayTypeSelectAction;
    }

    public final void setViewsAlpha(float alpha) {
        get_payment().setAlpha(alpha);
        get_agreement().setAlpha(alpha);
    }

    public final void set_agreement(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._agreement = frameLayout;
    }

    public final void set_divider(@NotNull View view) {
        view.getClass();
        this._divider = view;
    }

    public final void set_payment(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._payment = frameLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PrivilegePaymentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ PrivilegePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
