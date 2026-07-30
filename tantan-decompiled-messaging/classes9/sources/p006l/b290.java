package p006l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePaymentView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeEntranceView;
import com.p1.mobile.putong.core.ui.banner.view.PrivilegeViewType;
import com.p1.mobile.putong.data.PayMethod;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.d30;
import l.d3c0;
import l.e190;
import l.e30;
import l.e51;
import l.eqh0;
import l.j760;
import l.lsi0;
import l.mep0;
import l.mqi0;
import l.sab0;
import l.svq;
import l.t100;
import l.vwb;
import l.wf60;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VCheckBox;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\bJ\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010-J\u0017\u00101\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010-J\u0017\u00102\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010-J\u0017\u00104\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010-J\u0017\u00105\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010-J\u0017\u00106\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010-J\u000f\u00107\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010\bJ\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\bJ\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\bJ\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0017H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010WR\u001e\u0010\\\u001a\n Y*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, d2 = {"Ll/b290;", "Ll/a5;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "X", "()V", "", "timeValue", "", "C", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", "O", "(Lcom/p1/mobile/putong/data/PayMethod;)V", "V", "W", "D", "()Ljava/lang/String;", "K", "", "M", "()Z", "P", "N", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "topView", "Y", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "centerView", "T", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;", "bottomView", "Q", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;)V", "J", "a0", "category", "", "B", "(Ljava/lang/String;)I", "E", "I", "H", "G", "F", "x", "A", "z", "y", "L", "isDefaultButtonType", "b0", "(Z)V", "a", "b", "m", "hidden", "j", "h", "d", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "contentLayout", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getTimer", "()Ljava/lang/Runnable;", "setTimer", "(Ljava/lang/Runnable;)V", "timer", "Lcom/p1/mobile/putong/core/data/Merchandise;", "i", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "Lcom/p1/mobile/putong/core/data/PendingPaymentGuidance;", "Lcom/p1/mobile/putong/core/data/PendingPaymentGuidance;", "pendingPaymentGuidance", "kotlin.jvm.PlatformType", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "l", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/hab0;", "Ll/hab0;", "purchaseTrackBase", "Lcom/p1/mobile/putong/core/data/Coupon;", "n", "Lcom/p1/mobile/putong/core/data/Coupon;", "curCoupon", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class b290 extends AbstractC0495a5 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntranceSingleTextWithIconBgView topView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePromotionBottomView centerView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PrivilegeEntrancePaymentView bottomView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public LinearLayout contentLayout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public Runnable timer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Merchandise merchandise;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public PendingPaymentGuidance pendingPaymentGuidance;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public PayMethod curPayMethod;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public hab0 purchaseTrackBase;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Coupon curCoupon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b290(@NotNull PrivilegeEntranceView.a aVar) {
        super(aVar);
        aVar.getClass();
        this.timer = new Runnable() { // from class: l.t190
            @Override // java.lang.Runnable
            public final void run() {
                b290.m12454t(this.f21802a);
            }
        };
        this.curPayMethod = PayMethod.get("alipay");
    }

    /* JADX INFO: renamed from: R */
    public static final void m12446R(final b290 b290Var, View view) {
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance = b290Var.pendingPaymentGuidance;
        PurchaseType purchaseType = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        String str = pendingPaymentGuidance.guideType;
        Merchandise merchandise = b290Var.merchandise;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        PendingPaymentGuidance pendingPaymentGuidance2 = b290Var.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance2 = null;
        }
        List<PayMethod> listM26404r = wi60VarM26386m.m26404r(str, merchandise, pendingPaymentGuidance2.platform);
        Act actA = b290Var.getPrivilegeEntranceInfo().a();
        PurchaseType purchaseType2 = b290Var.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        new wf60(actA, purchaseType).t(listM26404r).r(b290Var.curPayMethod).q(new e30() { // from class: l.x190
            public final void call(Object obj) {
                b290.m12447S(this.f25669a, (PayMethod) obj);
            }
        }).n(!b290Var.m12471N()).s();
    }

    /* JADX INFO: renamed from: S */
    public static final void m12447S(b290 b290Var, PayMethod payMethod) {
        payMethod.getClass();
        b290Var.m12472O(payMethod);
    }

    /* JADX INFO: renamed from: U */
    public static final void m12448U(b290 b290Var, View view) {
        hab0 hab0Var = b290Var.purchaseTrackBase;
        if (hab0Var != null) {
            Merchandise merchandise = b290Var.merchandise;
            PurchaseType purchaseType = null;
            if (merchandise == null) {
                Intrinsics.r("merchandise");
                merchandise = null;
            }
            PayMethod payMethod = b290Var.curPayMethod;
            payMethod.getClass();
            wi60 wi60VarM26386m = wi60.m26386m();
            PendingPaymentGuidance pendingPaymentGuidance = b290Var.pendingPaymentGuidance;
            if (pendingPaymentGuidance == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance = null;
            }
            String str = pendingPaymentGuidance.guideType;
            PayMethod payMethod2 = b290Var.curPayMethod;
            PurchaseType purchaseType2 = b290Var.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType = purchaseType2;
            }
            hab0Var.m16130w(merchandise, payMethod, false, wi60VarM26386m.m26394H(str, payMethod2, purchaseType));
        }
        b290Var.m12467J();
    }

    /* JADX INFO: renamed from: Z */
    public static final void m12449Z(b290 b290Var, View view) {
        String strMo11695h = b290Var.mo11695h();
        String strM11751f = b290Var.m11751f();
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance = b290Var.pendingPaymentGuidance;
        Merchandise merchandise = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        zvf0.u(strMo11695h, strM11751f, new j760[]{vwb.Y("payment_status", wi60VarM26386m.m26405s(pendingPaymentGuidance.guideType))});
        wi60 wi60VarM26386m2 = wi60.m26386m();
        Merchandise merchandise2 = b290Var.merchandise;
        if (merchandise2 == null) {
            Intrinsics.r("merchandise");
        } else {
            merchandise = merchandise2;
        }
        String strM26400n = wi60VarM26386m2.m26400n(merchandise.category);
        strM26400n.getClass();
        b290Var.m11756o(strM26400n);
    }

    /* JADX INFO: renamed from: p */
    public static void m12450p(Integer num) {
    }

    /* JADX INFO: renamed from: t */
    public static void m12454t(b290 b290Var) {
        b290Var.m12478X();
    }

    /* JADX INFO: renamed from: u */
    public static void m12455u(b290 b290Var) {
        b290Var.m12481b0(false);
    }

    /* JADX INFO: renamed from: w */
    public static void m12457w(b290 b290Var) {
        VCheckBox vCheckBox;
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = b290Var.bottomView;
        if (privilegeEntrancePaymentView != null && (vCheckBox = privilegeEntrancePaymentView.get_check()) != null) {
            vCheckBox.setChecked(true);
        }
        b290Var.m12481b0(true);
        b290Var.m12467J();
    }

    /* JADX INFO: renamed from: A */
    public final int m12458A(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return Color.parseColor("#E5D35006");
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? getPrivilegeEntranceInfo().a().color(b1c0.Q) : Color.parseColor("#E5EDD7A3");
            }
        } else if (category.equals("tttVip")) {
            return Color.parseColor("#9D5C36");
        }
        return Color.parseColor("#9D5C36");
    }

    /* JADX INFO: renamed from: B */
    public final int m12459B(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.w8;
                }
            } else if (category.equals("oDiamond")) {
                return d3c0.q4;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.Ca;
        }
        return d3c0.Ca;
    }

    /* JADX INFO: renamed from: C */
    public final CharSequence m12460C(String timeValue) {
        return "待支付·" + timeValue;
    }

    /* JADX INFO: renamed from: D */
    public final String m12461D() {
        Coupon coupon;
        Merchandise merchandise = this.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        double couponPrice = merchandise.defaultStockKeepUnit.prices.price;
        if (m12471N() && (coupon = this.curCoupon) != null) {
            if (coupon.endTime - mqi0.o() > 0.0d) {
                couponPrice = coupon.getCouponPrice();
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.r("merchandise");
        } else {
            merchandise2 = merchandise3;
        }
        return String.format("%s个月会员仅需%s元", Arrays.copyOf(new Object[]{Integer.valueOf(merchandise2.quantity), getPrivilegeEntranceInfo().b().format(couponPrice)}, 2));
    }

    /* JADX INFO: renamed from: E */
    public final int m12462E(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.t3;
                }
            } else if (category.equals("oDiamond")) {
                if (g6a.m15592o()) {
                    return 0;
                }
                return d3c0.n3;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.D3;
        }
        return d3c0.D3;
    }

    /* JADX INFO: renamed from: F */
    public final int m12463F(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.q8;
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? d3c0.t5 : d3c0.n4;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.va;
        }
        return d3c0.va;
    }

    /* JADX INFO: renamed from: G */
    public final int m12464G(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.g6;
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? d3c0.A5 : d3c0.U9;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.l6;
        }
        return d3c0.l6;
    }

    /* JADX INFO: renamed from: H */
    public final int m12465H(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.f6;
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? d3c0.u5 : d3c0.d6;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.k6;
        }
        return d3c0.k6;
    }

    /* JADX INFO: renamed from: I */
    public final int m12466I(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.A3;
                }
            } else if (category.equals("oDiamond")) {
                if (g6a.m15592o()) {
                    return 0;
                }
                return d3c0.x4;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.B3;
        }
        return d3c0.B3;
    }

    /* JADX INFO: renamed from: J */
    public final void m12467J() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView;
        VCheckBox vCheckBox;
        Coupon coupon;
        if (m12471N() && (coupon = this.curCoupon) != null) {
            if (coupon.endTime - mqi0.o() <= 0.0d) {
                lsi0.y("优惠券已过期");
                CoreModule.f1534c.f3623c1.m16941N3();
                m12480a0();
                return;
            }
        }
        if (!m12470M() || (privilegeEntrancePaymentView = this.bottomView) == null || (vCheckBox = privilegeEntrancePaymentView.get_check()) == null || vCheckBox.isChecked()) {
            m12473P();
            return;
        }
        Act actA = getPrivilegeEntranceInfo().a();
        hab0 hab0Var = this.purchaseTrackBase;
        dsa.m14191C(actA, hab0Var != null ? hab0Var.mo16113e() : null, new d30() { // from class: l.y190
            public final void call() {
                b290.m12457w(this.f27858a);
            }
        }, new d30() { // from class: l.z190
            public final void call() {
                b290.m12455u(this.f28553a);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m12468K() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            if (!m12470M()) {
                xdl0.M(privilegeEntrancePaymentView.get_check(), false);
            } else {
                xdl0.M(privilegeEntrancePaymentView.get_check(), true);
                privilegeEntrancePaymentView.get_check().setChecked(false);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m12469L() {
        Merchandise merchandise = this.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        ProductCategory productCategory = merchandise.category;
        productCategory.getClass();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.none;
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        x5b0 x5b0Var = new x5b0(productCategory, purchaseTrackPageType, wi60VarM26386m.m26406t(pendingPaymentGuidance.guideType, false));
        this.purchaseTrackBase = x5b0Var;
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.r("merchandise");
        } else {
            merchandise2 = merchandise3;
        }
        ProductCategory productCategory2 = merchandise2.category;
        productCategory2.getClass();
        x5b0Var.m16123o(productCategory2);
        hab0 hab0Var = this.purchaseTrackBase;
        if (hab0Var != null) {
            hab0Var.m16124p(m11751f());
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m12470M() {
        wi60 wi60VarM26386m = wi60.m26386m();
        Merchandise merchandise = this.merchandise;
        PendingPaymentGuidance pendingPaymentGuidance = null;
        if (merchandise == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        }
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.r("pendingPaymentGuidance");
        } else {
            pendingPaymentGuidance = pendingPaymentGuidance2;
        }
        return wi60VarM26386m.m26407u(merchandise, pendingPaymentGuidance.guideType);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m12471N() {
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        return wi60VarM26386m.m26408v(pendingPaymentGuidance.guideType);
    }

    /* JADX INFO: renamed from: O */
    public final void m12472O(PayMethod payMethod) {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            boolean zM26394H = false;
            xdl0.M(privilegeEntrancePaymentView.get_prom_text(), false);
            this.curPayMethod = payMethod;
            if (TEnum.equals(payMethod, "wechat")) {
                privilegeEntrancePaymentView.get_pay_way_txt().setText(R.string.H);
                privilegeEntrancePaymentView.get_pay_way_txt().setCompoundDrawablesWithIntrinsicBounds(CoreModule.f1533b.getResources().getDrawable(d3c0.e3), (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                wi60 wi60VarM26386m = wi60.m26386m();
                PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.r("pendingPaymentGuidance");
                    pendingPaymentGuidance = null;
                }
                String str = pendingPaymentGuidance.guideType;
                PayMethod payMethod2 = this.curPayMethod;
                PurchaseType purchaseType = this.purchaseType;
                if (purchaseType == null) {
                    Intrinsics.r("purchaseType");
                    purchaseType = null;
                }
                zM26394H = wi60VarM26386m.m26394H(str, payMethod2, purchaseType);
                privilegeEntrancePaymentView.get_pay_way_txt().setText(zM26394H ? R.string.h : R.string.C);
                privilegeEntrancePaymentView.get_pay_way_txt().setCompoundDrawablesWithIntrinsicBounds(CoreModule.f1533b.getResources().getDrawable(d3c0.f3), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.centerView;
            if (privilegeEntrancePromotionBottomView != null) {
                if (zM26394H) {
                    privilegeEntrancePromotionBottomView.get_goto_buy().setText("免密支付");
                } else {
                    privilegeEntrancePromotionBottomView.get_goto_buy().setText("去支付");
                }
            }
            m12476V();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m12473P() {
        Merchandise merchandise;
        PurchaseType purchaseType;
        PendingPaymentGuidance pendingPaymentGuidance;
        hab0 hab0Var = this.purchaseTrackBase;
        String purchaseTrackId = hab0Var != null ? hab0Var.getPurchaseTrackId() : null;
        wi60 wi60VarM26386m = wi60.m26386m();
        Act actA = getPrivilegeEntranceInfo().a();
        Merchandise merchandise2 = this.merchandise;
        if (merchandise2 == null) {
            Intrinsics.r("merchandise");
            merchandise = null;
        } else {
            merchandise = merchandise2;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        } else {
            purchaseType = purchaseType2;
        }
        PayMethod payMethod = this.curPayMethod;
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        } else {
            pendingPaymentGuidance = pendingPaymentGuidance2;
        }
        wi60VarM26386m.m26391E(actA, merchandise, purchaseType, payMethod, purchaseTrackId, pendingPaymentGuidance, this.curCoupon, "p_navigation,privilege_button", new e30() { // from class: l.a290
            public final void call(Object obj) {
                b290.m12450p((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m12474Q(PrivilegeEntrancePaymentView bottomView) {
        if (bottomView != null) {
            PayMethod payMethod = this.curPayMethod;
            payMethod.getClass();
            m12472O(payMethod);
            m12477W();
            m12468K();
            xdl0.E0(bottomView.get_pay_way(), new View.OnClickListener() { // from class: l.w190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b290.m12446R(this.f24757a, view);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX INFO: renamed from: T */
    public final void m12475T(PrivilegeEntrancePromotionBottomView centerView) {
        PendingPaymentGuidance pendingPaymentGuidance;
        if (centerView != null) {
            PendingPaymentGuidance pendingPaymentGuidance2 = null;
            if (g6a.m15592o()) {
                PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance3 == null) {
                    Intrinsics.r("pendingPaymentGuidance");
                    pendingPaymentGuidance3 = null;
                }
                if (TextUtils.equals(pendingPaymentGuidance3.productType, "oDiamond")) {
                    xdl0.M(centerView.get_divider(), true);
                    centerView.get_divider().setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33CE9C5F"), Color.parseColor("#33FECF95"), Color.parseColor("#33CE9C5F")}));
                    centerView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                } else {
                    xdl0.M(centerView.get_divider(), false);
                    TextView textView = centerView.get_buy_tip();
                    pendingPaymentGuidance = this.pendingPaymentGuidance;
                    if (pendingPaymentGuidance == null) {
                        Intrinsics.r("pendingPaymentGuidance");
                        pendingPaymentGuidance = null;
                    }
                    String str = pendingPaymentGuidance.productType;
                    str.getClass();
                    textView.setTextColor(m12458A(str));
                }
            } else {
                xdl0.M(centerView.get_divider(), false);
                TextView textView2 = centerView.get_buy_tip();
                pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.r("pendingPaymentGuidance");
                    pendingPaymentGuidance = null;
                }
                String str2 = pendingPaymentGuidance.productType;
                str2.getClass();
                textView2.setTextColor(m12458A(str2));
            }
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            String str3 = pendingPaymentGuidance4.productType;
            str3.getClass();
            centerView.setBackgroundResource(m12482x(str3));
            xdl0.M(centerView.get_promotion_icon(), false);
            VText vText = centerView.get_promotion_desc();
            PendingPaymentGuidance pendingPaymentGuidance5 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance5 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance5 = null;
            }
            String str4 = pendingPaymentGuidance5.productType;
            str4.getClass();
            vText.setTextColor(m12458A(str4));
            centerView.get_promotion_desc().setText(m12461D());
            centerView.get_promotion_desc().setTypeface(eqh0.c(3));
            TextView textView3 = centerView.get_buy_tip();
            PendingPaymentGuidance pendingPaymentGuidance6 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance6 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance6 = null;
            }
            textView3.setText(pendingPaymentGuidance6.paymentFailMsg);
            VText vText2 = centerView.get_goto_buy();
            PendingPaymentGuidance pendingPaymentGuidance7 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance7 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance7 = null;
            }
            String str5 = pendingPaymentGuidance7.productType;
            str5.getClass();
            vText2.setTextColor(m12484z(str5));
            centerView.get_goto_buy().setTypeface(eqh0.c(3));
            VText vText3 = centerView.get_goto_buy();
            PendingPaymentGuidance pendingPaymentGuidance8 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance8 == null) {
                Intrinsics.r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance2 = pendingPaymentGuidance8;
            }
            String str6 = pendingPaymentGuidance2.productType;
            str6.getClass();
            vText3.setBackgroundResource(m12483y(str6));
            xdl0.E0(centerView.get_goto_buy(), new View.OnClickListener() { // from class: l.v190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b290.m12448U(this.f23907a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m12476V() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView;
        if (!CoreModule.m1854P().m11706a().m5462jh() || (privilegeEntrancePaymentView = this.bottomView) == null) {
            return;
        }
        if (!TEnum.equals(this.curPayMethod, "alipay")) {
            xdl0.M(privilegeEntrancePaymentView.get_prom_text(), false);
        } else {
            privilegeEntrancePaymentView.get_prom_text().setText(CoreModule.m1854P().m11706a().m5239D6());
            xdl0.M(privilegeEntrancePaymentView.get_prom_text(), true);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m12477W() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            VText vText = privilegeEntrancePaymentView.get_member_protocol();
            wi60 wi60VarM26386m = wi60.m26386m();
            Merchandise merchandise = this.merchandise;
            PendingPaymentGuidance pendingPaymentGuidance = null;
            if (merchandise == null) {
                Intrinsics.r("merchandise");
                merchandise = null;
            }
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.r("purchaseType");
                purchaseType = null;
            }
            PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance2 == null) {
                Intrinsics.r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance = pendingPaymentGuidance2;
            }
            vText.setText(wi60VarM26386m.m26398k(merchandise, purchaseType, pendingPaymentGuidance.guideType));
            privilegeEntrancePaymentView.get_member_protocol().setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m12478X() {
        e51.J(this.timer);
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        PendingPaymentGuidance pendingPaymentGuidance2 = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        if (pendingPaymentGuidance.endTime <= mqi0.o()) {
            m12480a0();
            return;
        }
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance3 == null) {
            Intrinsics.r("pendingPaymentGuidance");
        } else {
            pendingPaymentGuidance2 = pendingPaymentGuidance3;
        }
        j760<Boolean, String> j760VarM26399l = wi60VarM26386m.m26399l(pendingPaymentGuidance2.endTime);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.topView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            TextView textView = privilegeEntranceSingleTextWithIconBgView.get_time_desc();
            Object obj = j760VarM26399l.b;
            obj.getClass();
            textView.setText(m12460C((String) obj));
        }
        Object obj2 = j760VarM26399l.a;
        obj2.getClass();
        if (((Boolean) obj2).booleanValue()) {
            e51.H(getPrivilegeEntranceInfo().a(), this.timer, 1000L);
        } else {
            m12480a0();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m12479Y(PrivilegeEntranceSingleTextWithIconBgView topView) {
        if (topView != null) {
            PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
            PendingPaymentGuidance pendingPaymentGuidance2 = null;
            if (pendingPaymentGuidance == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance = null;
            }
            String str = pendingPaymentGuidance.productType;
            str.getClass();
            topView.setBackgroundResource(m12462E(str));
            VImage vImage = topView.get_texture();
            PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance3 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance3 = null;
            }
            String str2 = pendingPaymentGuidance3.productType;
            str2.getClass();
            vImage.setImageResource(m12466I(str2));
            VImage vImage2 = topView.get_privilege_icon_simple();
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            String str3 = pendingPaymentGuidance4.productType;
            str3.getClass();
            vImage2.setImageResource(m12465H(str3));
            VImage vImage3 = topView.get_privilege_icon();
            PendingPaymentGuidance pendingPaymentGuidance5 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance5 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance5 = null;
            }
            String str4 = pendingPaymentGuidance5.productType;
            str4.getClass();
            vImage3.setImageResource(m12464G(str4));
            if (g6a.m15592o()) {
                PendingPaymentGuidance pendingPaymentGuidance6 = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance6 == null) {
                    Intrinsics.r("pendingPaymentGuidance");
                    pendingPaymentGuidance6 = null;
                }
                if (TextUtils.equals(pendingPaymentGuidance6.productType, "oDiamond")) {
                    ConstraintLayout.a layoutParams = topView.get_privilege_icon().getLayoutParams();
                    ConstraintLayout.a aVar = layoutParams instanceof ConstraintLayout.a ? layoutParams : null;
                    if (aVar != null) {
                        aVar.d = 0;
                        aVar.e = -1;
                    }
                    xdl0.V(topView.get_privilege_icon(), t100.D);
                }
            }
            VImage vImage4 = topView.get_go();
            PendingPaymentGuidance pendingPaymentGuidance7 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance7 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance7 = null;
            }
            String str5 = pendingPaymentGuidance7.productType;
            str5.getClass();
            vImage4.setImageResource(m12463F(str5));
            xdl0.M(topView.get_desc(), false);
            PendingPaymentGuidance pendingPaymentGuidance8 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance8 == null) {
                Intrinsics.r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance2 = pendingPaymentGuidance8;
            }
            if (pendingPaymentGuidance2.remainingTime > 0) {
                xdl0.M(topView.get_time_desc(), true);
                m12478X();
            }
            xdl0.E0(topView, new View.OnClickListener() { // from class: l.u190
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b290.m12449Z(this.f22421a, view);
                }
            });
        }
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: a */
    public boolean mo11693a() {
        if (!g6a.m15593p() || !wi60.m26386m().m26389C()) {
            return false;
        }
        PendingPaymentGuidance pendingPaymentGuidanceM26403q = wi60.m26386m().m26403q();
        pendingPaymentGuidanceM26403q.getClass();
        this.pendingPaymentGuidance = pendingPaymentGuidanceM26403q;
        Merchandise merchandiseM26401o = wi60.m26386m().m26401o();
        merchandiseM26401o.getClass();
        this.merchandise = merchandiseM26401o;
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        Merchandise merchandise = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        this.curPayMethod = PayMethod.get(pendingPaymentGuidance.platform);
        Merchandise merchandise2 = this.merchandise;
        if (merchandise2 == null) {
            Intrinsics.r("merchandise");
            merchandise2 = null;
        }
        PurchaseType purchaseTypeB = sab0.b(merchandise2.category);
        purchaseTypeB.getClass();
        this.purchaseType = purchaseTypeB;
        this.curCoupon = null;
        if (!m12471N()) {
            return true;
        }
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.r("merchandise");
            merchandise3 = null;
        }
        if (!NullChecker.a(merchandise3.localCoupons)) {
            return true;
        }
        Merchandise merchandise4 = this.merchandise;
        if (merchandise4 == null) {
            Intrinsics.r("merchandise");
            merchandise4 = null;
        }
        if (merchandise4.localCoupons.size() <= 0) {
            return true;
        }
        Merchandise merchandise5 = this.merchandise;
        if (merchandise5 == null) {
            Intrinsics.r("merchandise");
        } else {
            merchandise = merchandise5;
        }
        Coupon coupon = (Coupon) merchandise.localCoupons.get(0);
        if (coupon.endTime - mqi0.o() <= 0.0d) {
            return true;
        }
        this.curCoupon = coupon;
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12480a0() {
        wi60.m26386m().m26392F(getPrivilegeEntranceInfo().a(), null);
    }

    @Override // p006l.s0m
    /* JADX INFO: renamed from: b */
    public void mo11694b() {
        getPrivilegeEntranceInfo().b().setMaximumFractionDigits(1);
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().a());
        this.contentLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.topView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.centerView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, svq.c(47));
        int iC = svq.c(5);
        layoutParams.leftMargin = iC;
        layoutParams.rightMargin = iC;
        layoutParams.topMargin = iC;
        layoutParams.bottomMargin = iC;
        LinearLayout linearLayout2 = this.contentLayout;
        if (linearLayout2 != null) {
            linearLayout2.addView((View) this.topView, (ViewGroup.LayoutParams) layoutParams);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, svq.c(76));
        layoutParams2.leftMargin = iC;
        layoutParams2.rightMargin = iC;
        layoutParams2.bottomMargin = iC;
        LinearLayout linearLayout3 = this.contentLayout;
        if (linearLayout3 != null) {
            linearLayout3.addView((View) this.centerView, (ViewGroup.LayoutParams) layoutParams2);
        }
        getPrivilegeEntranceInfo().c().addView(this.contentLayout, new LinearLayout.LayoutParams(-1, -2));
        this.bottomView = m11753i(getPrivilegeEntranceInfo().a(), getPrivilegeEntranceInfo().c(), PrivilegeViewType.PAYMENT_VIEW);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
        layoutParams3.topMargin = svq.c(6);
        layoutParams3.bottomMargin = 0;
        getPrivilegeEntranceInfo().c().addView((View) this.bottomView, (ViewGroup.LayoutParams) layoutParams3);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m12481b0(boolean isDefaultButtonType) {
        PendingPaymentGuidance pendingPaymentGuidance;
        PendingPaymentGuidance pendingPaymentGuidance2;
        hab0 hab0Var = this.purchaseTrackBase;
        if (hab0Var != null) {
            Merchandise merchandise = this.merchandise;
            if (merchandise == null) {
                Intrinsics.r("merchandise");
                merchandise = null;
                pendingPaymentGuidance = null;
            } else {
                pendingPaymentGuidance = null;
            }
            PayMethod payMethod = this.curPayMethod;
            payMethod.getClass();
            wi60 wi60VarM26386m = wi60.m26386m();
            PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance3 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance3 = pendingPaymentGuidance;
            }
            String str = pendingPaymentGuidance3.guideType;
            PayMethod payMethod2 = this.curPayMethod;
            PendingPaymentGuidance pendingPaymentGuidance4 = this.purchaseType;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.r("purchaseType");
                pendingPaymentGuidance4 = pendingPaymentGuidance;
            }
            boolean zM26394H = wi60VarM26386m.m26394H(str, payMethod2, pendingPaymentGuidance4);
            hab0 hab0Var2 = this.purchaseTrackBase;
            PendingPaymentGuidance pendingPaymentGuidanceMo16113e = hab0Var2 != null ? hab0Var2.mo16113e() : pendingPaymentGuidance;
            PendingPaymentGuidance pendingPaymentGuidance5 = this.purchaseType;
            if (pendingPaymentGuidance5 == null) {
                Intrinsics.r("purchaseType");
                pendingPaymentGuidance2 = pendingPaymentGuidance;
            } else {
                pendingPaymentGuidance2 = pendingPaymentGuidance5;
            }
            hab0Var.m16126r(merchandise, payMethod, false, zM26394H, pendingPaymentGuidanceMo16113e, pendingPaymentGuidance2, isDefaultButtonType);
        }
    }

    @Override // p006l.AbstractC0495a5
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo11695h() {
        return "e_privilege_banner_payment";
    }

    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: j */
    public void mo11696j(boolean hidden) {
        if (hidden) {
            e51.J(this.timer);
        } else if (this.topView != null) {
            m12478X();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    @Override // p006l.AbstractC0495a5
    /* JADX INFO: renamed from: m */
    public void mo11697m() {
        LinearLayout linearLayout;
        PendingPaymentGuidance pendingPaymentGuidance;
        if (this.pendingPaymentGuidance == null || this.merchandise == null) {
            return;
        }
        wi60 wi60VarM26386m = wi60.m26386m();
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        PendingPaymentGuidance pendingPaymentGuidance3 = null;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.r("pendingPaymentGuidance");
            pendingPaymentGuidance2 = null;
        }
        m11755n(MapsKt.mapOf(new Pair("payment_status", wi60VarM26386m.m26405s(pendingPaymentGuidance2.guideType))));
        super.mo11697m();
        m12469L();
        if (g6a.m15592o()) {
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            if (TextUtils.equals(pendingPaymentGuidance4.productType, "oDiamond")) {
                LinearLayout linearLayout2 = this.contentLayout;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new e190(true));
                }
                LinearLayout linearLayout3 = this.contentLayout;
                if (linearLayout3 != null) {
                    mep0.d1(linearLayout3, t100.i);
                }
            } else {
                linearLayout = this.contentLayout;
                if (linearLayout != null) {
                    pendingPaymentGuidance = this.pendingPaymentGuidance;
                    if (pendingPaymentGuidance == null) {
                        Intrinsics.r("pendingPaymentGuidance");
                    } else {
                        pendingPaymentGuidance3 = pendingPaymentGuidance;
                    }
                    String str = pendingPaymentGuidance3.productType;
                    str.getClass();
                    linearLayout.setBackgroundResource(m12459B(str));
                }
            }
        } else {
            linearLayout = this.contentLayout;
            if (linearLayout != null) {
                pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.r("pendingPaymentGuidance");
                } else {
                    pendingPaymentGuidance3 = pendingPaymentGuidance;
                }
                String str2 = pendingPaymentGuidance3.productType;
                str2.getClass();
                linearLayout.setBackgroundResource(m12459B(str2));
            }
        }
        m12479Y(this.topView);
        m12475T(this.centerView);
        m12474Q(this.bottomView);
    }

    /* JADX INFO: renamed from: x */
    public final int m12482x(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.Ea;
                }
            } else if (category.equals("oDiamond")) {
                if (g6a.m15592o()) {
                    return 0;
                }
                return d3c0.o3;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.Ga;
        }
        return d3c0.Ga;
    }

    /* JADX INFO: renamed from: y */
    public final int m12483y(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return d3c0.x8;
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? d3c0.q5 : d3c0.J5;
            }
        } else if (category.equals("tttVip")) {
            return d3c0.E3;
        }
        return d3c0.E3;
    }

    /* JADX INFO: renamed from: z */
    public final int m12484z(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return Color.parseColor("#AB3E00");
                }
            } else if (category.equals("oDiamond")) {
                return g6a.m15592o() ? getPrivilegeEntranceInfo().a().color(b1c0.J) : Color.parseColor("#2D1A09");
            }
        } else if (category.equals("tttVip")) {
            return Color.parseColor("#9B4918");
        }
        return Color.parseColor("#9B4918");
    }
}
