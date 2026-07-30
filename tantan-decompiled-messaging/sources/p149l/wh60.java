package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/wh60;", "Ll/t4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/ai60;", SocialConstants.TYPE_REQUEST, "h", "(Ll/ai60;)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", FirebaseAnalytics.Param.PRICE, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/data/Merchandise;DLcom/p1/mobile/putong/core/ui/purchase/d$a;)D", "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wh60 extends AbstractC20103t4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    /* JADX INFO: renamed from: h */
    private final String m203112h(ai60 request) {
        C8765d.a aVarM187136g = m187136g(request.getPurchaseSection());
        Merchandise merchandiseM53601s = aVarM187136g.m53601s();
        if (TEnum.equals(merchandiseM53601s.category, "oDiamond") || TEnum.equals(merchandiseM53601s.category, "platinum") || TEnum.equals(merchandiseM53601s.category, ProductCategory.oDiamondPrivateCustom) || TEnum.equals(merchandiseM53601s.category, "privateCustom") || dsa.m113449v(aVarM187136g)) {
            return "";
        }
        if (merchandiseM53601s.monthly() && !sab0.m182889g(this.purchaseType) && !sab0.m182906x(this.purchaseType)) {
            return "";
        }
        if (m187135f() && TEnum.equals(request.getPayMethod(), "alipay")) {
            return "";
        }
        double firstCouponPrice = merchandiseM53601s.defaultStockKeepUnit.prices.price;
        if (!vwb.m200296J(merchandiseM53601s.localCoupons) && merchandiseM53601s.getFirstCouponPrice() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            firstCouponPrice = merchandiseM53601s.getFirstCouponPrice();
        }
        double dM203113i = (TEnum.equals(merchandiseM53601s.category, "femaleVip") || TEnum.equals(merchandiseM53601s.category, "youthVip")) ? m203113i(merchandiseM53601s, firstCouponPrice, aVarM187136g) : Math.abs((aVarM187136g.m53575d() * ((double) merchandiseM53601s.quantity)) - firstCouponPrice);
        String str = aVarM187136g.m53583h() + getNumberFormat().format(dM203113i);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strString = this.act.string(R$string.f27339W6);
        strString.getClass();
        return String.format(strString, Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: i */
    private final double m203113i(Merchandise merchandise, double price, C8765d.a detail) {
        if (!merchandise.autoRenewable()) {
            return Math.abs(merchandise.defaultStockKeepUnit.prices.originalUnitPrice - price);
        }
        boolean zWeekly = merchandise.weekly();
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        return zWeekly ? Math.abs(stockKeepUnit.prices.originalUnitPrice - price) : Math.abs((stockKeepUnit.prices.originalUnitPrice * ((double) detail.m53605w())) - price);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010c  */
    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: b */
    public void mo136186b(@NotNull ai60 request, @NotNull bi60 response) {
        String strString;
        request.getClass();
        response.getClass();
        C8765d.a aVarM187136g = m187136g(request.getPurchaseSection());
        double firstCouponPrice = aVarM187136g.m53553I() ? aVarM187136g.m53601s().getFirstCouponPrice() : aVarM187136g.m53601s().defaultStockKeepUnit.prices.price;
        getNumberFormat().setMaximumFractionDigits(2);
        String str = getNumberFormat().format(firstCouponPrice);
        str.getClass();
        if (!TextUtils.equals(getFrom(), "purchasePage")) {
            response.m101983m(true);
            if (request.getPurchaseSection().m53532n()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strString = String.format("确认协议并支付%s%s", Arrays.copyOf(new Object[]{aVarM187136g.m53583h(), str}, 2));
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                strString = String.format(Locale.CHINESE, "%s%s %s", Arrays.copyOf(new Object[]{aVarM187136g.m53583h(), str, this.act.string(R$string.f27388b)}, 3));
            }
        } else if (sab0.m182889g(this.purchaseType) || sab0.m182906x(this.purchaseType)) {
            response.m101983m(true);
            if (request.getPurchaseSection().m53532n()) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                strString = String.format("确认协议并支付%s%s", Arrays.copyOf(new Object[]{aVarM187136g.m53583h(), str}, 2));
            } else {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                strString = String.format(Locale.CHINESE, "%s%s %s", Arrays.copyOf(new Object[]{aVarM187136g.m53583h(), str, this.act.string(R$string.f27388b)}, 3));
            }
        } else if (request.getPurchaseSection().m53532n()) {
            strString = "确认协议并支付";
        } else {
            strString = this.act.string(R$string.f27388b);
            strString.getClass();
        }
        response.m101986p(strString);
        response.m101985o(m203112h(request));
        String str2 = null;
        if (sab0.m182891i(this.purchaseType)) {
            if (!xma.m210043F3()) {
                str2 = "限时优惠";
            }
        } else if (sab0.m182897o(this.purchaseType) || sab0.m182889g(this.purchaseType) || sab0.m182906x(this.purchaseType)) {
            str2 = "限时特惠";
        } else if (sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            str2 = "限时优惠";
        }
        if (TextUtils.equals(getFrom(), "purchasePage")) {
            response.m101981k(str2);
        } else {
            response.m101984n(str2);
        }
    }

    @Override // p149l.AbstractC20103t4
    /* JADX INFO: renamed from: e */
    public boolean mo136187e(@NotNull ai60 request) {
        request.getClass();
        return true;
    }
}
