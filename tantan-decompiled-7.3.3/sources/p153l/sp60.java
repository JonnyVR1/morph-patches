package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m88121d2 = {"Ll/sp60;", "Ll/r4;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fq60;", SocialConstants.TYPE_REQUEST, "", "e", "(Ll/fq60;)Z", "Ll/gq60;", "response", "", "b", "(Ll/fq60;Ll/gq60;)V", "h", "(Ll/fq60;)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", FirebaseAnalytics.Param.PRICE, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/data/Merchandise;DLcom/p1/mobile/putong/core/ui/purchase/d$a;)D", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class sp60 extends AbstractC19757r4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: b */
    public void mo99414b(@NotNull fq60 request, @NotNull gq60 response) {
        String strM218107b;
        request.getClass();
        response.getClass();
        String str = null;
        if (request.getPurchaseSection().m54715n()) {
            strM218107b = "确认协议并支付";
        } else if (wib0.m206573q(this.purchaseType) && CoreModule.f18264c.f20381e0.m116600p9().isVIP() && joa.m146386f4()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strString = this.act.string(R$string.f28462u1);
            strString.getClass();
            strM218107b = String.format(strString, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size())}, 1));
        } else if (wib0.m206563g(this.purchaseType) || wib0.m206580x(this.purchaseType)) {
            response.m131354m(true);
            C8928d.a aVarM179724g = m179724g(request.getPurchaseSection());
            double firstCouponPrice = aVarM179724g.m54736I() ? aVarM179724g.m54784s().getFirstCouponPrice() : aVarM179724g.m54784s().defaultStockKeepUnit.prices.price;
            getNumberFormat().setMaximumFractionDigits(2);
            String str2 = getNumberFormat().format(firstCouponPrice);
            str2.getClass();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strM218107b = String.format(Locale.CHINESE, "%s%s %s", Arrays.copyOf(new Object[]{aVarM179724g.m54766h(), str2, this.act.string(R$string.f28236b)}, 3));
        } else {
            strM218107b = z090.m218107b(this.purchaseType);
            strM218107b.getClass();
        }
        response.m131357p(strM218107b);
        if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            str = "限时优惠";
        } else if (wib0.m206571o(this.purchaseType) || wib0.m206563g(this.purchaseType) || wib0.m206580x(this.purchaseType)) {
            str = "限时特惠";
        }
        response.m131355n(str);
        if (wib0.m206563g(this.purchaseType) || wib0.m206580x(this.purchaseType)) {
            response.m131356o(m187328h(request));
        }
    }

    @Override // p153l.AbstractC19757r4
    /* JADX INFO: renamed from: e */
    public boolean mo99415e(@NotNull fq60 request) {
        request.getClass();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final String m187328h(fq60 request) {
        C8928d.a aVarM179724g = m179724g(request.getPurchaseSection());
        Merchandise merchandiseM54784s = aVarM179724g.m54784s();
        if (TEnum.equals(merchandiseM54784s.category, "oDiamond") || TEnum.equals(merchandiseM54784s.category, "platinum") || TEnum.equals(merchandiseM54784s.category, "privateCustom") || TEnum.equals(merchandiseM54784s.category, ProductCategory.oDiamondPrivateCustom) || pta.m173729v(aVarM179724g)) {
            return "";
        }
        if (merchandiseM54784s.monthly() && !wib0.m206563g(this.purchaseType) && !wib0.m206580x(this.purchaseType)) {
            return "";
        }
        if (m179723f() && TEnum.equals(request.getPayMethod(), "alipay")) {
            return "";
        }
        double firstCouponPrice = merchandiseM54784s.defaultStockKeepUnit.prices.price;
        if (!jyb.m147479J(merchandiseM54784s.localCoupons) && merchandiseM54784s.getFirstCouponPrice() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            firstCouponPrice = merchandiseM54784s.getFirstCouponPrice();
        }
        double dM187329i = (TEnum.equals(merchandiseM54784s.category, "femaleVip") || TEnum.equals(merchandiseM54784s.category, "youthVip")) ? m187329i(merchandiseM54784s, firstCouponPrice, aVarM179724g) : Math.abs((aVarM179724g.m54758d() * ((double) merchandiseM54784s.quantity)) - firstCouponPrice);
        String str = aVarM179724g.m54766h() + getNumberFormat().format(dM187329i);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strString = this.act.string(R$string.f28187W6);
        strString.getClass();
        return String.format(strString, Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: i */
    public final double m187329i(Merchandise merchandise, double price, C8928d.a detail) {
        if (!merchandise.autoRenewable()) {
            return Math.abs(merchandise.defaultStockKeepUnit.prices.originalUnitPrice - price);
        }
        boolean zWeekly = merchandise.weekly();
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        return zWeekly ? Math.abs(stockKeepUnit.prices.originalUnitPrice - price) : Math.abs((stockKeepUnit.prices.originalUnitPrice * ((double) detail.m54788w())) - price);
    }
}
