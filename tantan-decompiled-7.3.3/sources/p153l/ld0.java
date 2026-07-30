package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tencent.open.SocialConstants;
import java.text.DecimalFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/ld0;", "Ll/tol;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/bd0;", "requestData", "", "b", "(Ll/bd0;)Z", "", "a", "(Ll/bd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ld0 implements tol {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public ld0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
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
        CharSequence charSequenceM105365x;
        CharSequence charSequenceM105361t;
        CharSequence charSequenceM105361t2;
        requestData.getClass();
        if (s7a.m184977f() && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthType() && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().quantity == 6 && deh0.m115415f(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) {
            CharSequence charSequenceM115413c = deh0.m115413c(this.purchaseType, requestData.getPrivilegeStyle());
            charSequenceM115413c.getClass();
            return charSequenceM115413c;
        }
        if (requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().monthly() && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable() && v5b0.m199785k(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) {
            CharSequence charSequenceM105366y = requestData.getIsInNewMyTab() ? bn60.m105366y(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().defaultStockKeepUnit.prices.price)) : bn60.m105329L(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().defaultStockKeepUnit.prices.price));
            charSequenceM105366y.getClass();
            return charSequenceM105366y;
        }
        if (v5b0.m199790p(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            if (TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) {
                charSequenceM105361t2 = requestData.getIsInNewMyTab() ? bn60.m105362u(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle()) : bn60.m105326I(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle());
            } else {
                charSequenceM105361t2 = requestData.getIsInNewMyTab() ? bn60.m105361t(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle()) : bn60.m105325H(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle());
            }
            charSequenceM105361t2.getClass();
            return charSequenceM105361t2;
        }
        if (v5b0.m199790p(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            if (TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) {
                charSequenceM105361t = requestData.getIsInNewMyTab() ? bn60.m105362u(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle()) : bn60.m105326I(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle());
            } else {
                charSequenceM105361t = requestData.getIsInNewMyTab() ? bn60.m105361t(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle()) : bn60.m105325H(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle());
            }
            charSequenceM105361t.getClass();
            return charSequenceM105361t;
        }
        if (requestData.getIsInNewMyTab() && v5b0.m199796v("svip", requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String())) {
            charSequenceM105365x = bn60.m105361t(requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String(), this.purchaseType, requestData.getPrivilegeStyle());
        } else {
            boolean isInNewMyTab = requestData.getIsInNewMyTab();
            PurchaseType purchaseType = this.purchaseType;
            charSequenceM105365x = isInNewMyTab ? bn60.m105365x(purchaseType, requestData.getPrivilegeStyle()) : bn60.m105324G(purchaseType, requestData.getPrivilegeStyle());
        }
        charSequenceM105365x.getClass();
        return charSequenceM105365x;
    }

    @Override // p153l.tol
    /* JADX INFO: renamed from: b */
    public boolean mo115314b(@NotNull bd0 requestData) {
        requestData.getClass();
        return wib0.m206573q(this.purchaseType) && requestData.getCom.p1.mobile.putong.core.data.Merchandise.TYPE java.lang.String().autoRenewable();
    }
}
