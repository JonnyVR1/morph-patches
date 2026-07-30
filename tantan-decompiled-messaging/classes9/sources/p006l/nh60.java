package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import l.sab0;
import l.vwb;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ll/nh60;", "Ll/t4;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/ai60;", "request", "", "e", "(Ll/ai60;)Z", "Ll/bi60;", "response", "", "b", "(Ll/ai60;Ll/bi60;)V", "h", "(Ll/ai60;)Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandise", "", "price", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "detail", "i", "(Lcom/p1/mobile/putong/core/data/Merchandise;DLcom/p1/mobile/putong/core/ui/purchase/d$a;)D", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "d", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nh60 extends AbstractC1297t4 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh60(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        super(str);
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
    }

    @Override // p006l.AbstractC1297t4
    /* JADX INFO: renamed from: b */
    public void mo16653b(@NotNull ai60 request, @NotNull bi60 response) {
        String strM25865b;
        request.getClass();
        response.getClass();
        String str = null;
        if (request.getPurchaseSection().n()) {
            strM25865b = "确认协议并支付";
        } else if (sab0.q(this.purchaseType) && CoreModule.f1534c.f3628e0.m21490p9().isVIP() && xma.m27379e4()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strString = this.act.string(R.string.u1);
            strString.getClass();
            strM25865b = String.format(strString, Arrays.copyOf(new Object[]{Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null).size())}, 1));
        } else if (sab0.g(this.purchaseType) || sab0.x(this.purchaseType)) {
            response.m12699m(true);
            d.a aVarM24436g = m24436g(request.getPurchaseSection());
            double firstCouponPrice = aVarM24436g.I() ? aVarM24436g.s().getFirstCouponPrice() : aVarM24436g.s().defaultStockKeepUnit.prices.price;
            getNumberFormat().setMaximumFractionDigits(2);
            String str2 = getNumberFormat().format(firstCouponPrice);
            str2.getClass();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strM25865b = String.format(Locale.CHINESE, "%s%s %s", Arrays.copyOf(new Object[]{aVarM24436g.h(), str2, this.act.string(R.string.b)}, 3));
        } else {
            strM25865b = vs80.m25865b(this.purchaseType);
            strM25865b.getClass();
        }
        response.m12702p(strM25865b);
        if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            str = "限时优惠";
        } else if (sab0.o(this.purchaseType) || sab0.g(this.purchaseType) || sab0.x(this.purchaseType)) {
            str = "限时特惠";
        }
        response.m12700n(str);
        if (sab0.g(this.purchaseType) || sab0.x(this.purchaseType)) {
            response.m12701o(m20122h(request));
        }
    }

    @Override // p006l.AbstractC1297t4
    /* JADX INFO: renamed from: e */
    public boolean mo16654e(@NotNull ai60 request) {
        request.getClass();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final String m20122h(ai60 request) {
        d.a aVarM24436g = m24436g(request.getPurchaseSection());
        Merchandise merchandiseS = aVarM24436g.s();
        if (TEnum.equals(merchandiseS.category, "oDiamond") || TEnum.equals(merchandiseS.category, "platinum") || TEnum.equals(merchandiseS.category, "privateCustom") || TEnum.equals(merchandiseS.category, "oDiamondPrivateCustom") || dsa.m14214v(aVarM24436g)) {
            return "";
        }
        if (merchandiseS.monthly() && !sab0.g(this.purchaseType) && !sab0.x(this.purchaseType)) {
            return "";
        }
        if (m24435f() && TEnum.equals(request.getPayMethod(), "alipay")) {
            return "";
        }
        double firstCouponPrice = merchandiseS.defaultStockKeepUnit.prices.price;
        if (!vwb.J(merchandiseS.localCoupons) && merchandiseS.getFirstCouponPrice() > 0.0d) {
            firstCouponPrice = merchandiseS.getFirstCouponPrice();
        }
        double dM20123i = (TEnum.equals(merchandiseS.category, "femaleVip") || TEnum.equals(merchandiseS.category, "youthVip")) ? m20123i(merchandiseS, firstCouponPrice, aVarM24436g) : Math.abs((aVarM24436g.d() * ((double) merchandiseS.quantity)) - firstCouponPrice);
        String str = aVarM24436g.h() + getNumberFormat().format(dM20123i);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String strString = this.act.string(R.string.W6);
        strString.getClass();
        return String.format(strString, Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: renamed from: i */
    public final double m20123i(Merchandise merchandise, double price, d.a detail) {
        if (!merchandise.autoRenewable()) {
            return Math.abs(merchandise.defaultStockKeepUnit.prices.originalUnitPrice - price);
        }
        boolean zWeekly = merchandise.weekly();
        StockKeepUnit stockKeepUnit = merchandise.defaultStockKeepUnit;
        return zWeekly ? Math.abs(stockKeepUnit.prices.originalUnitPrice - price) : Math.abs((stockKeepUnit.prices.originalUnitPrice * ((double) detail.w())) - price);
    }
}
