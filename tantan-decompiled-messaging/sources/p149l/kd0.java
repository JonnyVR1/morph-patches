package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/kd0;", "Ll/hml;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fd0;", "requestData", "", "b", "(Ll/fd0;)Z", "", "a", "(Ll/fd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class kd0 implements hml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public kd0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p149l.hml
    @NotNull
    /* JADX INFO: renamed from: a */
    public CharSequence mo130527a(@NotNull fd0 requestData) {
        CharSequence charSequenceM202846K;
        requestData.getClass();
        C8765d.a detail = requestData.getDetail();
        String strM53599q = detail.m53599q();
        String strM53597o = detail.m53597o();
        Merchandise merchandise = requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String();
        if ((sab0.m182899q(this.purchaseType) || sab0.m182891i(this.purchaseType)) && C8766e.m53650x(this.from)) {
            String strString = this.act.string(R$string.f27169H1);
            strString.getClass();
            return strString;
        }
        if (requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthly() && sab0.m182899q(this.purchaseType) && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() && rxa0.m181490k(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) {
            CharSequence charSequenceM202847L = we60.m202847L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceM202847L.getClass();
            return charSequenceM202847L;
        }
        if (sab0.m182899q(this.purchaseType) && merchandise.autoRenewable() && merchandise.monthly() && rxa0.m181490k(merchandise)) {
            CharSequence charSequenceM202847L2 = we60.m202847L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceM202847L2.getClass();
            return charSequenceM202847L2;
        }
        if (!(CoreModule.m29935P().m94651a().mo33524j3() && CoreModule.f17545c.f19591O0.m30086u3(this.purchaseType)) && NullChecker.m81303a(detail.m53601s())) {
            boolean zM181495p = rxa0.m181495p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks);
            PurchaseType purchaseType = this.purchaseType;
            if (zM181495p) {
                charSequenceM202846K = we60.m202846K(merchandise, purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            } else if (sab0.m182899q(purchaseType) && rxa0.m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                charSequenceM202846K = (dsa.m113449v(detail) && TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) ? we60.m202844I(merchandise, this.purchaseType, requestData.getPrivilegeStyle()) : we60.m202846K(merchandise, this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            } else if (sab0.m182899q(this.purchaseType) && rxa0.m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                charSequenceM202846K = we60.m202846K(merchandise, this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            } else if (sab0.m182905w(this.purchaseType) && rxa0.m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP)) {
                charSequenceM202846K = we60.m202846K(merchandise, this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            } else {
                charSequenceM202846K = (sab0.m182905w(this.purchaseType) && merchandise.monthly() && rxa0.m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) ? we60.m202846K(merchandise, this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle()) : we60.m202845J(this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            }
            charSequenceM202846K.getClass();
            return charSequenceM202846K;
        }
        if (sab0.m182905w(this.purchaseType) && merchandise.monthly() && rxa0.m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            CharSequence charSequenceM202846K2 = we60.m202846K(merchandise, this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            charSequenceM202846K2.getClass();
            return charSequenceM202846K2;
        }
        if (CoreModule.m29935P().m94651a().mo33349K4()) {
            CharSequence charSequenceM202845J = we60.m202845J(this.purchaseType, detail.m53595n(), requestData.getPrivilegeStyle());
            charSequenceM202845J.getClass();
            return charSequenceM202845J;
        }
        boolean zMo33507h5 = CoreModule.m29935P().m94651a().mo33507h5();
        PurchaseType purchaseType2 = this.purchaseType;
        if (zMo33507h5) {
            CharSequence charSequenceM202845J2 = we60.m202845J(purchaseType2, detail.m53595n(), requestData.getPrivilegeStyle());
            charSequenceM202845J2.getClass();
            return charSequenceM202845J2;
        }
        boolean zM182900r = sab0.m182900r(purchaseType2);
        PurchaseType purchaseType3 = this.purchaseType;
        if (zM182900r) {
            String string = (sab0.m182905w(purchaseType3) || sab0.m182893k(this.purchaseType)) ? this.act.getString(R$string.f27253O8, String.valueOf(merchandise.quantity), strM53599q) : this.act.getString(R$string.f27242N8, String.valueOf(merchandise.quantity), strM53597o);
            string.getClass();
            return string;
        }
        if (!sab0.m182901s(purchaseType3) && !sab0.m182899q(this.purchaseType) && (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType || !CoreModule.m29935P().m94651a().mo158354c())) {
            String string2 = this.act.getString(R$string.f27220L8, String.valueOf(merchandise.quantity), strM53599q);
            string2.getClass();
            return string2;
        }
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType) {
            strM53599q = strM53597o;
        }
        String string3 = this.act.getString(R$string.f27231M8, String.valueOf(merchandise.quantity), strM53599q);
        string3.getClass();
        return string3;
    }

    @Override // p149l.hml
    /* JADX INFO: renamed from: b */
    public boolean mo130528b(@NotNull fd0 requestData) {
        requestData.getClass();
        return ((!requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthly() || !sab0.m182899q(this.purchaseType) || !requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() || !rxa0.m181490k(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) && CoreModule.m29935P().m94651a().mo33524j3() && CoreModule.f17545c.f19591O0.m30086u3(this.purchaseType)) ? false : true;
    }
}
