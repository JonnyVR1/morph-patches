package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/gd0;", "Ll/tol;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/bd0;", "requestData", "", "b", "(Ll/bd0;)Z", "", "a", "(Ll/bd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gd0 implements tol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public gd0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p153l.tol
    @NotNull
    /* JADX INFO: renamed from: a */
    public CharSequence mo115313a(@NotNull bd0 requestData) {
        CharSequence charSequenceM105328K;
        requestData.getClass();
        C8928d.a detail = requestData.getDetail();
        String strM54782q = detail.m54782q();
        String strM54780o = detail.m54780o();
        Merchandise merchandise = requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String();
        if ((wib0.m206573q(this.purchaseType) || wib0.m206565i(this.purchaseType)) && C8929e.m54833x(this.from)) {
            String strString = this.act.string(R$string.f28017H1);
            strString.getClass();
            return strString;
        }
        if (requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthly() && wib0.m206573q(this.purchaseType) && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() && v5b0.m199785k(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) {
            CharSequence charSequenceM105329L = bn60.m105329L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceM105329L.getClass();
            return charSequenceM105329L;
        }
        if (wib0.m206573q(this.purchaseType) && merchandise.autoRenewable() && merchandise.monthly() && v5b0.m199785k(merchandise)) {
            CharSequence charSequenceM105329L2 = bn60.m105329L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceM105329L2.getClass();
            return charSequenceM105329L2;
        }
        if (!(CoreModule.m30933P().m143405a().mo34527j3() && CoreModule.f18264c.f20333O0.m31084u3(this.purchaseType)) && NullChecker.m82486a(detail.m54784s())) {
            boolean zM199790p = v5b0.m199790p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks);
            PurchaseType purchaseType = this.purchaseType;
            if (zM199790p) {
                charSequenceM105328K = bn60.m105328K(merchandise, purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            } else if (wib0.m206573q(purchaseType) && v5b0.m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
                charSequenceM105328K = (pta.m173729v(detail) && TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) ? bn60.m105326I(merchandise, this.purchaseType, requestData.getPrivilegeStyle()) : bn60.m105328K(merchandise, this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            } else if (wib0.m206573q(this.purchaseType) && v5b0.m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
                charSequenceM105328K = bn60.m105328K(merchandise, this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            } else if (wib0.m206579w(this.purchaseType) && v5b0.m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP)) {
                charSequenceM105328K = bn60.m105328K(merchandise, this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            } else {
                charSequenceM105328K = (wib0.m206579w(this.purchaseType) && merchandise.monthly() && v5b0.m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) ? bn60.m105328K(merchandise, this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle()) : bn60.m105327J(this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            }
            charSequenceM105328K.getClass();
            return charSequenceM105328K;
        }
        if (wib0.m206579w(this.purchaseType) && merchandise.monthly() && v5b0.m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            CharSequence charSequenceM105328K2 = bn60.m105328K(merchandise, this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            charSequenceM105328K2.getClass();
            return charSequenceM105328K2;
        }
        if (CoreModule.m30933P().m143405a().mo34352K4()) {
            CharSequence charSequenceM105327J = bn60.m105327J(this.purchaseType, detail.m54778n(), requestData.getPrivilegeStyle());
            charSequenceM105327J.getClass();
            return charSequenceM105327J;
        }
        boolean zMo34510h5 = CoreModule.m30933P().m143405a().mo34510h5();
        PurchaseType purchaseType2 = this.purchaseType;
        if (zMo34510h5) {
            CharSequence charSequenceM105327J2 = bn60.m105327J(purchaseType2, detail.m54778n(), requestData.getPrivilegeStyle());
            charSequenceM105327J2.getClass();
            return charSequenceM105327J2;
        }
        boolean zM206574r = wib0.m206574r(purchaseType2);
        PurchaseType purchaseType3 = this.purchaseType;
        if (zM206574r) {
            String string = (wib0.m206579w(purchaseType3) || wib0.m206567k(this.purchaseType)) ? this.act.getString(R$string.f28101O8, String.valueOf(merchandise.quantity), strM54782q) : this.act.getString(R$string.f28090N8, String.valueOf(merchandise.quantity), strM54780o);
            string.getClass();
            return string;
        }
        if (!wib0.m206575s(purchaseType3) && !wib0.m206573q(this.purchaseType) && (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType || !CoreModule.m30933P().m143405a().mo180446c())) {
            String string2 = this.act.getString(R$string.f28068L8, String.valueOf(merchandise.quantity), strM54782q);
            string2.getClass();
            return string2;
        }
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType) {
            strM54782q = strM54780o;
        }
        String string3 = this.act.getString(R$string.f28079M8, String.valueOf(merchandise.quantity), strM54782q);
        string3.getClass();
        return string3;
    }

    @Override // p153l.tol
    /* JADX INFO: renamed from: b */
    public boolean mo115314b(@NotNull bd0 requestData) {
        requestData.getClass();
        return ((!requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthly() || !wib0.m206573q(this.purchaseType) || !requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() || !v5b0.m199785k(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) && CoreModule.m30933P().m143405a().mo34527j3() && CoreModule.f18264c.f20333O0.m31084u3(this.purchaseType)) ? false : true;
    }
}
