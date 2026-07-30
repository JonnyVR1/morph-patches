package p006l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.text.DecimalFormat;
import kotlin.Metadata;
import l.rxa0;
import l.sab0;
import l.v5h0;
import l.we60;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll/pd0;", "Ll/hml;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fd0;", "requestData", "", "b", "(Ll/fd0;)Z", "", "a", "(Ll/fd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pd0 implements hml {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    public pd0(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
    }

    @Override // p006l.hml
    @NotNull
    /* JADX INFO: renamed from: a */
    public CharSequence mo16164a(@NotNull fd0 requestData) {
        CharSequence charSequenceX;
        CharSequence charSequenceT;
        CharSequence charSequenceT2;
        requestData.getClass();
        if (g6a.m15583f() && requestData.getMerchandise().monthType() && requestData.getMerchandise().autoRenewable() && requestData.getMerchandise().quantity == 6 && v5h0.f(requestData.getMerchandise())) {
            CharSequence charSequenceC = v5h0.c(this.purchaseType, requestData.getPrivilegeStyle());
            charSequenceC.getClass();
            return charSequenceC;
        }
        if (requestData.getMerchandise().monthly() && requestData.getMerchandise().autoRenewable() && rxa0.k(requestData.getMerchandise())) {
            CharSequence charSequenceY = requestData.getIsInNewMyTab() ? we60.y(requestData.getMerchandise().defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(requestData.getMerchandise().defaultStockKeepUnit.prices.price)) : we60.L(requestData.getMerchandise().defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(requestData.getMerchandise().defaultStockKeepUnit.prices.price));
            charSequenceY.getClass();
            return charSequenceY;
        }
        if (rxa0.p(requestData.getMerchandise(), ProductCategory.get("svip"), "lowPriceCustomerSVIP")) {
            if (TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) {
                charSequenceT2 = requestData.getIsInNewMyTab() ? we60.u(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle()) : we60.I(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle());
            } else {
                charSequenceT2 = requestData.getIsInNewMyTab() ? we60.t(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle()) : we60.H(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle());
            }
            charSequenceT2.getClass();
            return charSequenceT2;
        }
        if (rxa0.p(requestData.getMerchandise(), ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP")) {
            if (TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) {
                charSequenceT = requestData.getIsInNewMyTab() ? we60.u(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle()) : we60.I(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle());
            } else {
                charSequenceT = requestData.getIsInNewMyTab() ? we60.t(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle()) : we60.H(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle());
            }
            charSequenceT.getClass();
            return charSequenceT;
        }
        if (requestData.getIsInNewMyTab() && rxa0.v("svip", requestData.getMerchandise())) {
            charSequenceX = we60.t(requestData.getMerchandise(), this.purchaseType, requestData.getPrivilegeStyle());
        } else {
            boolean isInNewMyTab = requestData.getIsInNewMyTab();
            PurchaseType purchaseType = this.purchaseType;
            charSequenceX = isInNewMyTab ? we60.x(purchaseType, requestData.getPrivilegeStyle()) : we60.G(purchaseType, requestData.getPrivilegeStyle());
        }
        charSequenceX.getClass();
        return charSequenceX;
    }

    @Override // p006l.hml
    /* JADX INFO: renamed from: b */
    public boolean mo16165b(@NotNull fd0 requestData) {
        requestData.getClass();
        return sab0.q(this.purchaseType) && requestData.getMerchandise().autoRenewable();
    }
}
