package p153l;

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
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.PendingPaymentGuidance;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePaymentView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntrancePromotionBottomView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceSingleTextWithIconBgView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeEntranceView;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 h2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\bJ\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010-J\u0017\u00101\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010-J\u0017\u00102\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010-J\u0017\u00104\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010-J\u0017\u00105\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010-J\u0017\u00106\u001a\u00020+2\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010-J\u000f\u00107\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010\bJ\u0017\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u000f\u0010<\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010\bJ\u000f\u0010=\u001a\u00020\u0006H\u0016¢\u0006\u0004\b=\u0010\bJ\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u0017H\u0016¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010WR\u001e\u0010\\\u001a\n Y*\u0004\u0018\u00010\u000e0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010`\u001a\u00020]8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010f¨\u0006i"}, m88121d2 = {"Ll/fa90;", "Ll/y4;", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;", "privilegeEntranceInfo", "<init>", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceView$a;)V", "", "X", "()V", "", "timeValue", "", c4s.C_ZONE, "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/putong/data/PayMethod;", "payMethod", BloodType.f39576O, "(Lcom/p1/mobile/putong/data/PayMethod;)V", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", "D", "()Ljava/lang/String;", "K", "", "M", "()Z", "P", "N", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "topView", "Y", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "centerView", p7f.GPS_DIRECTION_TRUE, "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;)V", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;", "bottomView", "Q", "(Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;)V", "J", "a0", "category", "", "B", "(Ljava/lang/String;)I", "E", "I", "H", "G", "F", BaseSei.f14624X, "A", BaseSei.f14626Z, BaseSei.f14625Y, "L", "isDefaultButtonType", "b0", "(Z)V", "a", "b", "m", "hidden", "j", "h", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntranceSingleTextWithIconBgView;", "e", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePromotionBottomView;", "f", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeEntrancePaymentView;", "Landroid/widget/LinearLayout;", "g", "Landroid/widget/LinearLayout;", "contentLayout", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "getTimer", "()Ljava/lang/Runnable;", "setTimer", "(Ljava/lang/Runnable;)V", "timer", "Lcom/p1/mobile/putong/core/data/Merchandise;", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "Lcom/p1/mobile/putong/core/data/PendingPaymentGuidance;", "Lcom/p1/mobile/putong/core/data/PendingPaymentGuidance;", "pendingPaymentGuidance", "kotlin.jvm.PlatformType", "k", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "Lcom/p1/mobile/putong/core/data/PurchaseType;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Ll/lib0;", "Ll/lib0;", "purchaseTrackBase", "Lcom/p1/mobile/putong/core/data/Coupon;", "n", "Lcom/p1/mobile/putong/core/data/Coupon;", "curCoupon", "Companion", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class fa90 extends AbstractC21509y4 {

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
    public lib0 purchaseTrackBase;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Coupon curCoupon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa90(@NotNull PrivilegeEntranceView.C8456a c8456a) {
        super(c8456a);
        c8456a.getClass();
        this.timer = new Runnable() { // from class: l.x990
            @Override // java.lang.Runnable
            public final void run() {
                fa90.m124717t(this.f192923a);
            }
        };
        this.curPayMethod = PayMethod.get("alipay");
    }

    /* JADX INFO: renamed from: R */
    public static final void m124709R(final fa90 fa90Var, View view) {
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance = fa90Var.pendingPaymentGuidance;
        PurchaseType purchaseType = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        String str = pendingPaymentGuidance.guideType;
        Merchandise merchandise = fa90Var.merchandise;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        PendingPaymentGuidance pendingPaymentGuidance2 = fa90Var.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance2 = null;
        }
        List<PayMethod> listM106075r = br60VarM106057m.m106075r(str, merchandise, pendingPaymentGuidance2.platform);
        Act act = fa90Var.getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        PurchaseType purchaseType2 = fa90Var.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType = purchaseType2;
        }
        new bo60(act, purchaseType).m105670t(listM106075r).m105668r(fa90Var.curPayMethod).m105667q(new y20() { // from class: l.ba90
            @Override // p153l.y20
            public final void call(Object obj) {
                fa90.m124710S(this.f75654a, (PayMethod) obj);
            }
        }).m105664n(!fa90Var.m124734N()).m105669s();
    }

    /* JADX INFO: renamed from: S */
    public static final void m124710S(fa90 fa90Var, PayMethod payMethod) {
        payMethod.getClass();
        fa90Var.m124735O(payMethod);
    }

    /* JADX INFO: renamed from: U */
    public static final void m124711U(fa90 fa90Var, View view) {
        lib0 lib0Var = fa90Var.purchaseTrackBase;
        if (lib0Var != null) {
            Merchandise merchandise = fa90Var.merchandise;
            PurchaseType purchaseType = null;
            if (merchandise == null) {
                Intrinsics.m88391r(Merchandise.TYPE);
                merchandise = null;
            }
            PayMethod payMethod = fa90Var.curPayMethod;
            payMethod.getClass();
            br60 br60VarM106057m = br60.m106057m();
            PendingPaymentGuidance pendingPaymentGuidance = fa90Var.pendingPaymentGuidance;
            if (pendingPaymentGuidance == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance = null;
            }
            String str = pendingPaymentGuidance.guideType;
            PayMethod payMethod2 = fa90Var.curPayMethod;
            PurchaseType purchaseType2 = fa90Var.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
            } else {
                purchaseType = purchaseType2;
            }
            lib0Var.m154345w(merchandise, payMethod, false, br60VarM106057m.m106065H(str, payMethod2, purchaseType));
        }
        fa90Var.m124730J();
    }

    /* JADX INFO: renamed from: Z */
    public static final void m124712Z(fa90 fa90Var, View view) {
        String strMo96815h = fa90Var.mo96815h();
        String strM214188f = fa90Var.m214188f();
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance = fa90Var.pendingPaymentGuidance;
        Merchandise merchandise = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        i4g0.m138523u(strMo96815h, strM214188f, jyb.m147494Y("payment_status", br60VarM106057m.m106076s(pendingPaymentGuidance.guideType)));
        br60 br60VarM106057m2 = br60.m106057m();
        Merchandise merchandise2 = fa90Var.merchandise;
        if (merchandise2 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
        } else {
            merchandise = merchandise2;
        }
        String strM106071n = br60VarM106057m2.m106071n(merchandise.category);
        strM106071n.getClass();
        fa90Var.m214193o(strM106071n);
    }

    /* JADX INFO: renamed from: p */
    public static void m124713p(Integer num) {
    }

    /* JADX INFO: renamed from: t */
    public static void m124717t(fa90 fa90Var) {
        fa90Var.m124741X();
    }

    /* JADX INFO: renamed from: u */
    public static void m124718u(fa90 fa90Var) {
        fa90Var.m124744b0(false);
    }

    /* JADX INFO: renamed from: w */
    public static void m124720w(fa90 fa90Var) {
        VCheckBox vCheckBox;
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = fa90Var.bottomView;
        if (privilegeEntrancePaymentView != null && (vCheckBox = privilegeEntrancePaymentView.get_check()) != null) {
            vCheckBox.setChecked(true);
        }
        fa90Var.m124744b0(true);
        fa90Var.m124730J();
    }

    /* JADX INFO: renamed from: A */
    public final int m124721A(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return Color.parseColor("#E5D35006");
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108347Q) : Color.parseColor("#E5EDD7A3");
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return Color.parseColor("#9D5C36");
        }
        return Color.parseColor("#9D5C36");
    }

    /* JADX INFO: renamed from: B */
    public final int m124722B(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119813w8;
                }
            } else if (category.equals("oDiamond")) {
                return jbc0.f119725q4;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119181Ca;
        }
        return jbc0.f119181Ca;
    }

    /* JADX INFO: renamed from: C */
    public final CharSequence m124723C(String timeValue) {
        return "待支付·" + timeValue;
    }

    /* JADX INFO: renamed from: D */
    public final String m124724D() {
        Coupon coupon;
        Merchandise merchandise = this.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        double couponPrice = merchandise.defaultStockKeepUnit.prices.price;
        if (m124734N() && (coupon = this.curCoupon) != null) {
            if (coupon.endTime - pzi0.m174454o() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                couponPrice = coupon.getCouponPrice();
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
        } else {
            merchandise2 = merchandise3;
        }
        return String.format("%s个月会员仅需%s元", Arrays.copyOf(new Object[]{Integer.valueOf(merchandise2.quantity), getPrivilegeEntranceInfo().getNumberFormat().format(couponPrice)}, 2));
    }

    /* JADX INFO: renamed from: E */
    public final int m124725E(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119766t3;
                }
            } else if (category.equals("oDiamond")) {
                if (s7a.m184986o()) {
                    return 0;
                }
                return jbc0.f119682n3;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119188D3;
        }
        return jbc0.f119188D3;
    }

    /* JADX INFO: renamed from: F */
    public final int m124726F(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119729q8;
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? jbc0.f119768t5 : jbc0.f119683n4;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119801va;
        }
        return jbc0.f119801va;
    }

    /* JADX INFO: renamed from: G */
    public final int m124727G(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119587g6;
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? jbc0.f119148A5 : jbc0.f119428U9;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119657l6;
        }
        return jbc0.f119657l6;
    }

    /* JADX INFO: renamed from: H */
    public final int m124728H(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119573f6;
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? jbc0.f119782u5 : jbc0.f119545d6;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119643k6;
        }
        return jbc0.f119643k6;
    }

    /* JADX INFO: renamed from: I */
    public final int m124729I(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119146A3;
                }
            } else if (category.equals("oDiamond")) {
                if (s7a.m184986o()) {
                    return 0;
                }
                return jbc0.f119823x4;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119160B3;
        }
        return jbc0.f119160B3;
    }

    /* JADX INFO: renamed from: J */
    public final void m124730J() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView;
        VCheckBox vCheckBox;
        Coupon coupon;
        if (m124734N() && (coupon = this.curCoupon) != null) {
            if (coupon.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                o1j0.m165651y("优惠券已过期");
                CoreModule.f18264c.f20376c1.m197851N3();
                m124743a0();
                return;
            }
        }
        if (!m124733M() || (privilegeEntrancePaymentView = this.bottomView) == null || (vCheckBox = privilegeEntrancePaymentView.get_check()) == null || vCheckBox.isChecked()) {
            m124736P();
            return;
        }
        Act act = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        lib0 lib0Var = this.purchaseTrackBase;
        pta.m173706C(act, lib0Var != null ? lib0Var.mo103692e() : null, new x20() { // from class: l.ca90
            @Override // p153l.x20
            public final void call() {
                fa90.m124720w(this.f80561a);
            }
        }, new x20() { // from class: l.da90
            @Override // p153l.x20
            public final void call() {
                fa90.m124718u(this.f85853a);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m124731K() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            if (!m124733M()) {
                bnl0.m105524M(privilegeEntrancePaymentView.get_check(), false);
            } else {
                bnl0.m105524M(privilegeEntrancePaymentView.get_check(), true);
                privilegeEntrancePaymentView.get_check().setChecked(false);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m124732L() {
        Merchandise merchandise = this.merchandise;
        Merchandise merchandise2 = null;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        ProductCategory productCategory = merchandise.category;
        productCategory.getClass();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.none;
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        beb0 beb0Var = new beb0(productCategory, purchaseTrackPageType, br60VarM106057m.m106077t(pendingPaymentGuidance.guideType, false));
        this.purchaseTrackBase = beb0Var;
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
        } else {
            merchandise2 = merchandise3;
        }
        ProductCategory productCategory2 = merchandise2.category;
        productCategory2.getClass();
        beb0Var.m154338o(productCategory2);
        lib0 lib0Var = this.purchaseTrackBase;
        if (lib0Var != null) {
            lib0Var.m154339p(m214188f());
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m124733M() {
        br60 br60VarM106057m = br60.m106057m();
        Merchandise merchandise = this.merchandise;
        PendingPaymentGuidance pendingPaymentGuidance = null;
        if (merchandise == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        }
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
        } else {
            pendingPaymentGuidance = pendingPaymentGuidance2;
        }
        return br60VarM106057m.m106078u(merchandise, pendingPaymentGuidance.guideType);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m124734N() {
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        return br60VarM106057m.m106079v(pendingPaymentGuidance.guideType);
    }

    /* JADX INFO: renamed from: O */
    public final void m124735O(PayMethod payMethod) {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            boolean zM106065H = false;
            bnl0.m105524M(privilegeEntrancePaymentView.get_prom_text(), false);
            this.curPayMethod = payMethod;
            if (TEnum.equals(payMethod, "wechat")) {
                privilegeEntrancePaymentView.get_pay_way_txt().setText(R$string.f28015H);
                privilegeEntrancePaymentView.get_pay_way_txt().setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119556e3), (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                br60 br60VarM106057m = br60.m106057m();
                PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.m88391r("pendingPaymentGuidance");
                    pendingPaymentGuidance = null;
                }
                String str = pendingPaymentGuidance.guideType;
                PayMethod payMethod2 = this.curPayMethod;
                PurchaseType purchaseType = this.purchaseType;
                if (purchaseType == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType = null;
                }
                zM106065H = br60VarM106057m.m106065H(str, payMethod2, purchaseType);
                privilegeEntrancePaymentView.get_pay_way_txt().setText(zM106065H ? R$string.f28308h : R$string.f27960C);
                privilegeEntrancePaymentView.get_pay_way_txt().setCompoundDrawablesWithIntrinsicBounds(CoreModule.f18263b.getResources().getDrawable(jbc0.f119570f3), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            PrivilegeEntrancePromotionBottomView privilegeEntrancePromotionBottomView = this.centerView;
            if (privilegeEntrancePromotionBottomView != null) {
                if (zM106065H) {
                    privilegeEntrancePromotionBottomView.get_goto_buy().setText("免密支付");
                } else {
                    privilegeEntrancePromotionBottomView.get_goto_buy().setText("去支付");
                }
            }
            m124739V();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m124736P() {
        Merchandise merchandise;
        PurchaseType purchaseType;
        PendingPaymentGuidance pendingPaymentGuidance;
        lib0 lib0Var = this.purchaseTrackBase;
        String purchaseTrackId = lib0Var != null ? lib0Var.getPurchaseTrackId() : null;
        br60 br60VarM106057m = br60.m106057m();
        Act act = getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String();
        Merchandise merchandise2 = this.merchandise;
        if (merchandise2 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise = null;
        } else {
            merchandise = merchandise2;
        }
        PurchaseType purchaseType2 = this.purchaseType;
        if (purchaseType2 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        } else {
            purchaseType = purchaseType2;
        }
        PayMethod payMethod = this.curPayMethod;
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        } else {
            pendingPaymentGuidance = pendingPaymentGuidance2;
        }
        br60VarM106057m.m106062E(act, merchandise, purchaseType, payMethod, purchaseTrackId, pendingPaymentGuidance, this.curCoupon, "p_navigation,privilege_button", new y20() { // from class: l.ea90
            @Override // p153l.y20
            public final void call(Object obj) {
                fa90.m124713p((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m124737Q(PrivilegeEntrancePaymentView bottomView) {
        if (bottomView != null) {
            PayMethod payMethod = this.curPayMethod;
            payMethod.getClass();
            m124735O(payMethod);
            m124740W();
            m124731K();
            bnl0.m105509E0(bottomView.get_pay_way(), new View.OnClickListener() { // from class: l.aa90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fa90.m124709R(this.f69111a, view);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX INFO: renamed from: T */
    public final void m124738T(PrivilegeEntrancePromotionBottomView centerView) {
        PendingPaymentGuidance pendingPaymentGuidance;
        if (centerView != null) {
            PendingPaymentGuidance pendingPaymentGuidance2 = null;
            if (s7a.m184986o()) {
                PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance3 == null) {
                    Intrinsics.m88391r("pendingPaymentGuidance");
                    pendingPaymentGuidance3 = null;
                }
                if (TextUtils.equals(pendingPaymentGuidance3.productType, "oDiamond")) {
                    bnl0.m105524M(centerView.get_divider(), true);
                    centerView.get_divider().setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33CE9C5F"), Color.parseColor("#33FECF95"), Color.parseColor("#33CE9C5F")}));
                    centerView.get_buy_tip().setTextColor(Color.parseColor("#B3FFD68C"));
                } else {
                    bnl0.m105524M(centerView.get_divider(), false);
                    TextView textView = centerView.get_buy_tip();
                    pendingPaymentGuidance = this.pendingPaymentGuidance;
                    if (pendingPaymentGuidance == null) {
                        Intrinsics.m88391r("pendingPaymentGuidance");
                        pendingPaymentGuidance = null;
                    }
                    String str = pendingPaymentGuidance.productType;
                    str.getClass();
                    textView.setTextColor(m124721A(str));
                }
            } else {
                bnl0.m105524M(centerView.get_divider(), false);
                TextView textView2 = centerView.get_buy_tip();
                pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.m88391r("pendingPaymentGuidance");
                    pendingPaymentGuidance = null;
                }
                String str2 = pendingPaymentGuidance.productType;
                str2.getClass();
                textView2.setTextColor(m124721A(str2));
            }
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            String str3 = pendingPaymentGuidance4.productType;
            str3.getClass();
            centerView.setBackgroundResource(m124745x(str3));
            bnl0.m105524M(centerView.get_promotion_icon(), false);
            VText vText = centerView.get_promotion_desc();
            PendingPaymentGuidance pendingPaymentGuidance5 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance5 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance5 = null;
            }
            String str4 = pendingPaymentGuidance5.productType;
            str4.getClass();
            vText.setTextColor(m124721A(str4));
            centerView.get_promotion_desc().setText(m124724D());
            centerView.get_promotion_desc().setTypeface(lyh0.m156283c(3));
            TextView textView3 = centerView.get_buy_tip();
            PendingPaymentGuidance pendingPaymentGuidance6 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance6 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance6 = null;
            }
            textView3.setText(pendingPaymentGuidance6.paymentFailMsg);
            VText vText2 = centerView.get_goto_buy();
            PendingPaymentGuidance pendingPaymentGuidance7 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance7 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance7 = null;
            }
            String str5 = pendingPaymentGuidance7.productType;
            str5.getClass();
            vText2.setTextColor(m124747z(str5));
            centerView.get_goto_buy().setTypeface(lyh0.m156283c(3));
            VText vText3 = centerView.get_goto_buy();
            PendingPaymentGuidance pendingPaymentGuidance8 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance8 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance2 = pendingPaymentGuidance8;
            }
            String str6 = pendingPaymentGuidance2.productType;
            str6.getClass();
            vText3.setBackgroundResource(m124746y(str6));
            bnl0.m105509E0(centerView.get_goto_buy(), new View.OnClickListener() { // from class: l.z990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fa90.m124711U(this.f203456a, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m124739V() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView;
        if (!CoreModule.m30933P().m143405a().mo34528jh() || (privilegeEntrancePaymentView = this.bottomView) == null) {
            return;
        }
        if (!TEnum.equals(this.curPayMethod, "alipay")) {
            bnl0.m105524M(privilegeEntrancePaymentView.get_prom_text(), false);
        } else {
            privilegeEntrancePaymentView.get_prom_text().setText(CoreModule.m30933P().m143405a().mo34305D6());
            bnl0.m105524M(privilegeEntrancePaymentView.get_prom_text(), true);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m124740W() {
        PrivilegeEntrancePaymentView privilegeEntrancePaymentView = this.bottomView;
        if (privilegeEntrancePaymentView != null) {
            VText vText = privilegeEntrancePaymentView.get_member_protocol();
            br60 br60VarM106057m = br60.m106057m();
            Merchandise merchandise = this.merchandise;
            PendingPaymentGuidance pendingPaymentGuidance = null;
            if (merchandise == null) {
                Intrinsics.m88391r(Merchandise.TYPE);
                merchandise = null;
            }
            PurchaseType purchaseType = this.purchaseType;
            if (purchaseType == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = null;
            }
            PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance2 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance = pendingPaymentGuidance2;
            }
            vText.setText(br60VarM106057m.m106069k(merchandise, purchaseType, pendingPaymentGuidance.guideType));
            privilegeEntrancePaymentView.get_member_protocol().setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m124741X() {
        l51.m152890J(this.timer);
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        PendingPaymentGuidance pendingPaymentGuidance2 = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        if (pendingPaymentGuidance.endTime <= pzi0.m174454o()) {
            m124743a0();
            return;
        }
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
        if (pendingPaymentGuidance3 == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
        } else {
            pendingPaymentGuidance2 = pendingPaymentGuidance3;
        }
        pf60<Boolean, String> pf60VarM106070l = br60VarM106057m.m106070l(pendingPaymentGuidance2.endTime);
        PrivilegeEntranceSingleTextWithIconBgView privilegeEntranceSingleTextWithIconBgView = this.topView;
        if (privilegeEntranceSingleTextWithIconBgView != null) {
            TextView textView = privilegeEntranceSingleTextWithIconBgView.get_time_desc();
            String str = pf60VarM106070l.f152157b;
            str.getClass();
            textView.setText(m124723C(str));
        }
        Boolean bool = pf60VarM106070l.f152156a;
        bool.getClass();
        if (bool.booleanValue()) {
            l51.m152888H(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), this.timer, 1000L);
        } else {
            m124743a0();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m124742Y(PrivilegeEntranceSingleTextWithIconBgView topView) {
        if (topView != null) {
            PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
            PendingPaymentGuidance pendingPaymentGuidance2 = null;
            if (pendingPaymentGuidance == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance = null;
            }
            String str = pendingPaymentGuidance.productType;
            str.getClass();
            topView.setBackgroundResource(m124725E(str));
            VImage vImage = topView.get_texture();
            PendingPaymentGuidance pendingPaymentGuidance3 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance3 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance3 = null;
            }
            String str2 = pendingPaymentGuidance3.productType;
            str2.getClass();
            vImage.setImageResource(m124729I(str2));
            VImage vImage2 = topView.get_privilege_icon_simple();
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            String str3 = pendingPaymentGuidance4.productType;
            str3.getClass();
            vImage2.setImageResource(m124728H(str3));
            VImage vImage3 = topView.get_privilege_icon();
            PendingPaymentGuidance pendingPaymentGuidance5 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance5 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance5 = null;
            }
            String str4 = pendingPaymentGuidance5.productType;
            str4.getClass();
            vImage3.setImageResource(m124727G(str4));
            if (s7a.m184986o()) {
                PendingPaymentGuidance pendingPaymentGuidance6 = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance6 == null) {
                    Intrinsics.m88391r("pendingPaymentGuidance");
                    pendingPaymentGuidance6 = null;
                }
                if (TextUtils.equals(pendingPaymentGuidance6.productType, "oDiamond")) {
                    ViewGroup.LayoutParams layoutParams = topView.get_privilege_icon().getLayoutParams();
                    ConstraintLayout.C0221a c0221a = layoutParams instanceof ConstraintLayout.C0221a ? (ConstraintLayout.C0221a) layoutParams : null;
                    if (c0221a != null) {
                        c0221a.f1243d = 0;
                        c0221a.f1245e = -1;
                    }
                    bnl0.m105538V(topView.get_privilege_icon(), qa00.f156291D);
                }
            }
            VImage vImage4 = topView.get_go();
            PendingPaymentGuidance pendingPaymentGuidance7 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance7 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance7 = null;
            }
            String str5 = pendingPaymentGuidance7.productType;
            str5.getClass();
            vImage4.setImageResource(m124726F(str5));
            bnl0.m105524M(topView.get_desc(), false);
            PendingPaymentGuidance pendingPaymentGuidance8 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance8 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
            } else {
                pendingPaymentGuidance2 = pendingPaymentGuidance8;
            }
            if (pendingPaymentGuidance2.remainingTime > 0) {
                bnl0.m105524M(topView.get_time_desc(), true);
                m124741X();
            }
            bnl0.m105509E0(topView, new View.OnClickListener() { // from class: l.y990
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fa90.m124712Z(this.f198068a, view);
                }
            });
        }
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: a */
    public boolean mo96813a() {
        if (!s7a.m184987p() || !br60.m106057m().m106060C()) {
            return false;
        }
        PendingPaymentGuidance pendingPaymentGuidanceM106074q = br60.m106057m().m106074q();
        pendingPaymentGuidanceM106074q.getClass();
        this.pendingPaymentGuidance = pendingPaymentGuidanceM106074q;
        Merchandise merchandiseM106072o = br60.m106057m().m106072o();
        merchandiseM106072o.getClass();
        this.merchandise = merchandiseM106072o;
        PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
        Merchandise merchandise = null;
        if (pendingPaymentGuidance == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance = null;
        }
        this.curPayMethod = PayMethod.get(pendingPaymentGuidance.platform);
        Merchandise merchandise2 = this.merchandise;
        if (merchandise2 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise2 = null;
        }
        PurchaseType purchaseTypeM206558b = wib0.m206558b(merchandise2.category);
        purchaseTypeM206558b.getClass();
        this.purchaseType = purchaseTypeM206558b;
        this.curCoupon = null;
        if (!m124734N()) {
            return true;
        }
        Merchandise merchandise3 = this.merchandise;
        if (merchandise3 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise3 = null;
        }
        if (!NullChecker.m82486a(merchandise3.localCoupons)) {
            return true;
        }
        Merchandise merchandise4 = this.merchandise;
        if (merchandise4 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
            merchandise4 = null;
        }
        if (merchandise4.localCoupons.size() <= 0) {
            return true;
        }
        Merchandise merchandise5 = this.merchandise;
        if (merchandise5 == null) {
            Intrinsics.m88391r(Merchandise.TYPE);
        } else {
            merchandise = merchandise5;
        }
        Coupon coupon = merchandise.localCoupons.get(0);
        if (coupon.endTime - pzi0.m174454o() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return true;
        }
        this.curCoupon = coupon;
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m124743a0() {
        br60.m106057m().m106063F(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), null);
    }

    @Override // p153l.m3m
    /* JADX INFO: renamed from: b */
    public void mo96814b() {
        getPrivilegeEntranceInfo().getNumberFormat().setMaximumFractionDigits(1);
        LinearLayout linearLayout = new LinearLayout(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String());
        this.contentLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.topView = (PrivilegeEntranceSingleTextWithIconBgView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW);
        this.centerView = (PrivilegeEntrancePromotionBottomView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PROMOTION_BOTTOM_VIEW);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, txq.m193530c(47));
        int iM193530c = txq.m193530c(5);
        layoutParams.leftMargin = iM193530c;
        layoutParams.rightMargin = iM193530c;
        layoutParams.topMargin = iM193530c;
        layoutParams.bottomMargin = iM193530c;
        LinearLayout linearLayout2 = this.contentLayout;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.topView, layoutParams);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, txq.m193530c(76));
        layoutParams2.leftMargin = iM193530c;
        layoutParams2.rightMargin = iM193530c;
        layoutParams2.bottomMargin = iM193530c;
        LinearLayout linearLayout3 = this.contentLayout;
        if (linearLayout3 != null) {
            linearLayout3.addView(this.centerView, layoutParams2);
        }
        getPrivilegeEntranceInfo().getRoot().addView(this.contentLayout, new LinearLayout.LayoutParams(-1, -2));
        this.bottomView = (PrivilegeEntrancePaymentView) m214190i(getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String(), getPrivilegeEntranceInfo().getRoot(), PrivilegeViewType.PAYMENT_VIEW);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
        layoutParams3.topMargin = txq.m193530c(6);
        layoutParams3.bottomMargin = 0;
        getPrivilegeEntranceInfo().getRoot().addView(this.bottomView, layoutParams3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.br60] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.p1.mobile.putong.core.data.PendingPaymentGuidance] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.p1.mobile.putong.core.data.PurchaseType] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: b0 */
    public final void m124744b0(boolean isDefaultButtonType) {
        JSONObject jSONObject;
        PurchaseType purchaseType;
        lib0 lib0Var = this.purchaseTrackBase;
        if (lib0Var != null) {
            Merchandise merchandise = this.merchandise;
            if (merchandise == null) {
                Intrinsics.m88391r(Merchandise.TYPE);
                merchandise = null;
                jSONObject = null;
            } else {
                jSONObject = null;
            }
            PayMethod payMethod = this.curPayMethod;
            payMethod.getClass();
            ?? M106057m = br60.m106057m();
            PendingPaymentGuidance pendingPaymentGuidance = this.pendingPaymentGuidance;
            ?? r5 = pendingPaymentGuidance;
            if (pendingPaymentGuidance == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                r5 = jSONObject;
            }
            String str = r5.guideType;
            PayMethod payMethod2 = this.curPayMethod;
            PurchaseType purchaseType2 = this.purchaseType;
            ?? r7 = purchaseType2;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
                r7 = jSONObject;
            }
            boolean zM106065H = M106057m.m106065H(str, payMethod2, r7);
            lib0 lib0Var2 = this.purchaseTrackBase;
            JSONObject jSONObjectMo103692e = lib0Var2 != null ? lib0Var2.mo103692e() : jSONObject;
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType = jSONObject;
            } else {
                purchaseType = purchaseType3;
            }
            lib0Var.m154341r(merchandise, payMethod, false, zM106065H, jSONObjectMo103692e, purchaseType, isDefaultButtonType);
        }
    }

    @Override // p153l.AbstractC21509y4
    @NotNull
    /* JADX INFO: renamed from: h */
    public String mo96815h() {
        return "e_privilege_banner_payment";
    }

    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: j */
    public void mo96816j(boolean hidden) {
        if (hidden) {
            l51.m152890J(this.timer);
        } else if (this.topView != null) {
            m124741X();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    @Override // p153l.AbstractC21509y4
    /* JADX INFO: renamed from: m */
    public void mo96817m() {
        LinearLayout linearLayout;
        PendingPaymentGuidance pendingPaymentGuidance;
        if (this.pendingPaymentGuidance == null || this.merchandise == null) {
            return;
        }
        br60 br60VarM106057m = br60.m106057m();
        PendingPaymentGuidance pendingPaymentGuidance2 = this.pendingPaymentGuidance;
        PendingPaymentGuidance pendingPaymentGuidance3 = null;
        if (pendingPaymentGuidance2 == null) {
            Intrinsics.m88391r("pendingPaymentGuidance");
            pendingPaymentGuidance2 = null;
        }
        m214192n(MapsKt.mapOf(new Pair("payment_status", br60VarM106057m.m106076s(pendingPaymentGuidance2.guideType))));
        super.mo96817m();
        m124732L();
        if (s7a.m184986o()) {
            PendingPaymentGuidance pendingPaymentGuidance4 = this.pendingPaymentGuidance;
            if (pendingPaymentGuidance4 == null) {
                Intrinsics.m88391r("pendingPaymentGuidance");
                pendingPaymentGuidance4 = null;
            }
            if (TextUtils.equals(pendingPaymentGuidance4.productType, "oDiamond")) {
                LinearLayout linearLayout2 = this.contentLayout;
                if (linearLayout2 != null) {
                    linearLayout2.setBackground(new i990(true));
                }
                LinearLayout linearLayout3 = this.contentLayout;
                if (linearLayout3 != null) {
                    qnp0.m177261d1(linearLayout3, qa00.f156322i);
                }
            } else {
                linearLayout = this.contentLayout;
                if (linearLayout != null) {
                    pendingPaymentGuidance = this.pendingPaymentGuidance;
                    if (pendingPaymentGuidance == null) {
                        Intrinsics.m88391r("pendingPaymentGuidance");
                    } else {
                        pendingPaymentGuidance3 = pendingPaymentGuidance;
                    }
                    String str = pendingPaymentGuidance3.productType;
                    str.getClass();
                    linearLayout.setBackgroundResource(m124722B(str));
                }
            }
        } else {
            linearLayout = this.contentLayout;
            if (linearLayout != null) {
                pendingPaymentGuidance = this.pendingPaymentGuidance;
                if (pendingPaymentGuidance == null) {
                    Intrinsics.m88391r("pendingPaymentGuidance");
                } else {
                    pendingPaymentGuidance3 = pendingPaymentGuidance;
                }
                String str2 = pendingPaymentGuidance3.productType;
                str2.getClass();
                linearLayout.setBackgroundResource(m124722B(str2));
            }
        }
        m124742Y(this.topView);
        m124738T(this.centerView);
        m124737Q(this.bottomView);
    }

    /* JADX INFO: renamed from: x */
    public final int m124745x(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119209Ea;
                }
            } else if (category.equals("oDiamond")) {
                if (s7a.m184986o()) {
                    return 0;
                }
                return jbc0.f119696o3;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119237Ga;
        }
        return jbc0.f119237Ga;
    }

    /* JADX INFO: renamed from: y */
    public final int m124746y(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return jbc0.f119827x8;
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? jbc0.f119726q5 : jbc0.f119274J5;
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return jbc0.f119202E3;
        }
        return jbc0.f119202E3;
    }

    /* JADX INFO: renamed from: z */
    public final int m124747z(String category) {
        int iHashCode = category.hashCode();
        if (iHashCode != -863315575) {
            if (iHashCode != -796840475) {
                if (iHashCode == 3542730 && category.equals("svip")) {
                    return Color.parseColor("#AB3E00");
                }
            } else if (category.equals("oDiamond")) {
                return s7a.m184986o() ? getPrivilegeEntranceInfo().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().color(h9c0.f108340J) : Color.parseColor("#2D1A09");
            }
        } else if (category.equals(ProductCategory.tttVip)) {
            return Color.parseColor("#9B4918");
        }
        return Color.parseColor("#9B4918");
    }
}
