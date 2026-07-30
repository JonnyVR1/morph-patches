package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.PrivilegePaymentView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.e30;
import l.m690;
import l.p2b0;
import l.sab0;
import l.wek0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.d1m;
import p006l.g6a;
import p006l.j5b0;
import p006l.q0b0;
import p006l.u0b0;
import p006l.u7b0;
import p006l.w0c0;
import p006l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00152\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0015¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u0010\u0019R\"\u00108\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010B\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>R\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010DR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010FR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010HR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010PR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/content/PrivilegePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "Ll/j5b0;", "mediator", "", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ll/j5b0;)V", "d", "()V", "e", "h", "", "alpha", "setViewsAlpha", "(F)V", "currentPagePurchaseType", "setCurrentPurchaseType", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Ll/e30;", "Lcom/p1/mobile/putong/data/PayMethod;", "onPayTypeSelectAction", "setOnPayTypeSelect", "(Ll/e30;)V", "Ll/d30;", "onNoPrivilegeClick", "setOnNoPrivilegeClick", "(Ll/d30;)V", "g", "", "c", "()Z", "j", "i", "a", "Landroid/view/View;", "get_divider", "()Landroid/view/View;", "set_divider", "(Landroid/view/View;)V", "_divider", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "get_agreement", "set_agreement", "_agreement", "Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Ll/j5b0;", "", "Ll/d1m;", "Ljava/util/List;", "purchaseComponentsList", "Ll/u7b0;", "Ll/u7b0;", "paymentComponent", "Ll/d1m;", "agreementComponent", "k", "Ll/e30;", "l", "Ll/d30;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public j5b0 mediator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public u7b0 paymentComponent;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public d1m agreementComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public e30<PayMethod> onPayTypeSelectAction;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public d30 onNoPrivilegeClick;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.PrivilegePaymentView$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0421a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7296a;

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
            f7296a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PrivilegePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Act actD = xdl0.D(getContext());
        actD.getClass();
        this.act = actD;
        this.from = wek0.a;
        this.purchaseComponentsList = new ArrayList();
        LayoutInflater layoutInflaterInflater = this.act.inflater();
        layoutInflaterInflater.getClass();
        m10370b(layoutInflaterInflater, this);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: k */
    public static final void m10369k(PrivilegePaymentView privilegePaymentView, Integer num) {
        j5b0 j5b0Var;
        if (num == null || num.intValue() != 3 || (j5b0Var = privilegePaymentView.mediator) == null) {
            return;
        }
        PayMethod payMethod = PayMethod.get("alipay");
        payMethod.getClass();
        j5b0Var.m17281e0(payMethod);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m10370b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = m690.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10371c() {
        Enum r1 = this.purchaseType;
        if (r1 == null) {
            Intrinsics.r("purchaseType");
            r1 = null;
        }
        switch (C0421a.f7296a[r1.ordinal()]) {
            case 1:
                return xma.m27357N3();
            case 2:
                return xma.m27351F3();
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return xma.m27353H3();
            case CameraSticker.STATE_ERROR /* 4 */:
                return xma.m27355L3();
            case 5:
                return xma.m27347B3();
            case 6:
                return CoreModule.f1534c.f3628e0.m21490p9().isVIP();
            case 7:
                return xma.m27358O3();
            default:
                return xma.m27355L3();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10372d() {
        m10378j();
        m10377i();
    }

    /* JADX INFO: renamed from: e */
    public final void m10373e() {
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo12554b();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10374f(@NotNull PurchaseType purchaseType, @Nullable String from, @Nullable j5b0 mediator) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.mediator = mediator;
        this.from = from;
    }

    /* JADX INFO: renamed from: g */
    public final void m10375g() {
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
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
        Intrinsics.r("_agreement");
        return null;
    }

    @NotNull
    public final View get_divider() {
        View view = this._divider;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_divider");
        return null;
    }

    @NotNull
    public final FrameLayout get_payment() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_payment");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m10376h() {
        boolean zM10371c = m10371c();
        if (zM10371c) {
            xdl0.M(get_divider(), false);
            xdl0.M(get_agreement(), false);
        } else {
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.r("purchaseType");
                purchaseType = null;
            }
            if (sab0.i(purchaseType) && g6a.m15592o()) {
                get_divider().setBackgroundColor(this.act.color(w0c0.f24687f1));
            }
            xdl0.M(get_divider(), true);
            xdl0.M(get_agreement(), true);
        }
        u7b0 u7b0Var = this.paymentComponent;
        if (u7b0Var != null) {
            u7b0Var.m25101u0(zM10371c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m10377i() {
        PurchaseType purchaseType;
        d1m q0b0Var;
        if (this.agreementComponent != null || (purchaseType = this.purchaseType) == null) {
            return;
        }
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.d(purchaseType)) {
            boolean z = p2b0.h().z();
            Act act = this.act;
            if (z) {
                PurchaseType purchaseType3 = this.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.r("purchaseType");
                } else {
                    purchaseType2 = purchaseType3;
                }
                q0b0Var = new u0b0(act, purchaseType2, this.from, this.mediator);
            } else {
                PurchaseType purchaseType4 = this.purchaseType;
                if (purchaseType4 == null) {
                    Intrinsics.r("purchaseType");
                } else {
                    purchaseType2 = purchaseType4;
                }
                q0b0Var = new q0b0(act, purchaseType2, this.from, this.mediator);
            }
            this.agreementComponent = q0b0Var;
            if (q0b0Var instanceof u0b0) {
                u0b0 u0b0Var = (u0b0) q0b0Var;
                u0b0Var.m24887t(true);
                u0b0Var.m24889v(true);
            } else if (q0b0Var instanceof q0b0) {
                q0b0 q0b0Var2 = (q0b0) q0b0Var;
                q0b0Var2.m21913w(true);
                q0b0Var2.m21915y(true);
            }
            get_agreement().addView(q0b0Var.mo11783a(get_agreement()));
            q0b0Var.register();
            this.purchaseComponentsList.add(q0b0Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10378j() {
        if (this.paymentComponent != null || this.purchaseType == null) {
            return;
        }
        Act act = this.act;
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        u7b0 u7b0Var = new u7b0(act, purchaseType, this.from, this.mediator);
        this.paymentComponent = u7b0Var;
        get_payment().addView(u7b0Var.mo11783a(get_payment()));
        ViewParent parent = getParent();
        parent.getClass();
        u7b0Var.m25104x0((ViewGroup) parent);
        u7b0Var.m25083A0(this.onPayTypeSelectAction);
        u7b0Var.m25106z0(this.onNoPrivilegeClick);
        u7b0Var.m19666O(new e30() { // from class: l.l690
            public final void call(Object obj) {
                PrivilegePaymentView.m10369k(this.f16246a, (Integer) obj);
            }
        });
        u7b0Var.register();
        this.purchaseComponentsList.add(u7b0Var);
    }

    public final void setCurrentPurchaseType(@NotNull PurchaseType currentPagePurchaseType) {
        currentPagePurchaseType.getClass();
        u7b0 u7b0Var = this.paymentComponent;
        if (u7b0Var != null) {
            u7b0Var.m25105y0(currentPagePurchaseType);
        }
    }

    public final void setOnNoPrivilegeClick(@NotNull d30 onNoPrivilegeClick) {
        onNoPrivilegeClick.getClass();
        this.onNoPrivilegeClick = onNoPrivilegeClick;
    }

    public final void setOnPayTypeSelect(@Nullable e30<PayMethod> onPayTypeSelectAction) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PrivilegePaymentView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ PrivilegePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
