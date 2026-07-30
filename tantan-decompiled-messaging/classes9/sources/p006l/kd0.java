package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import kotlin.Metadata;
import l.rxa0;
import l.sab0;
import l.we60;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll/kd0;", "Ll/hml;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Ll/fd0;", "requestData", "", "b", "(Ll/fd0;)Z", "", "a", "(Ll/fd0;)Ljava/lang/CharSequence;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Override // p006l.hml
    @NotNull
    /* JADX INFO: renamed from: a */
    public CharSequence mo16164a(@NotNull fd0 requestData) {
        CharSequence charSequenceK;
        requestData.getClass();
        d.a detail = requestData.getDetail();
        String strQ = detail.q();
        String strO = detail.o();
        Merchandise merchandise = requestData.getMerchandise();
        if ((sab0.q(this.purchaseType) || sab0.i(this.purchaseType)) && e.x(this.from)) {
            String strString = this.act.string(R.string.H1);
            strString.getClass();
            return strString;
        }
        if (requestData.getMerchandise().monthly() && sab0.q(this.purchaseType) && requestData.getMerchandise().autoRenewable() && rxa0.k(requestData.getMerchandise())) {
            CharSequence charSequenceL = we60.L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceL.getClass();
            return charSequenceL;
        }
        if (sab0.q(this.purchaseType) && merchandise.autoRenewable() && merchandise.monthly() && rxa0.k(merchandise)) {
            CharSequence charSequenceL2 = we60.L(merchandise.defaultStockKeepUnit.prices.currencySymbol, new DecimalFormat("#.#").format(merchandise.defaultStockKeepUnit.prices.price));
            charSequenceL2.getClass();
            return charSequenceL2;
        }
        if (!(CoreModule.m1854P().m11706a().m5461j3() && CoreModule.f1534c.f3580O0.m2014u3(this.purchaseType)) && NullChecker.a(detail.s())) {
            boolean zP = rxa0.p(merchandise, ProductCategory.get("svipPicksMembership"), "lowPriceSVIPPicks");
            PurchaseType purchaseType = this.purchaseType;
            if (zP) {
                charSequenceK = we60.K(merchandise, purchaseType, detail.n(), requestData.getPrivilegeStyle());
            } else if (sab0.q(purchaseType) && rxa0.p(merchandise, ProductCategory.get("svip"), "lowPriceCustomerSVIP")) {
                charSequenceK = (dsa.m14214v(detail) && TEnum.equals(requestData.getCurrentPayMethod(), "wechat")) ? we60.I(merchandise, this.purchaseType, requestData.getPrivilegeStyle()) : we60.K(merchandise, this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            } else if (sab0.q(this.purchaseType) && rxa0.p(merchandise, ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP")) {
                charSequenceK = we60.K(merchandise, this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            } else if (sab0.w(this.purchaseType) && rxa0.p(merchandise, ProductCategory.get("tttVip"), "lowPriceCustomerVIP")) {
                charSequenceK = we60.K(merchandise, this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            } else {
                charSequenceK = (sab0.w(this.purchaseType) && merchandise.monthly() && rxa0.p(merchandise, ProductCategory.get("tttVip"), "lowPrice3Month")) ? we60.K(merchandise, this.purchaseType, detail.n(), requestData.getPrivilegeStyle()) : we60.J(this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            }
            charSequenceK.getClass();
            return charSequenceK;
        }
        if (sab0.w(this.purchaseType) && merchandise.monthly() && rxa0.p(merchandise, ProductCategory.get("tttVip"), "lowPrice3Month")) {
            CharSequence charSequenceK2 = we60.K(merchandise, this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            charSequenceK2.getClass();
            return charSequenceK2;
        }
        if (CoreModule.m1854P().m11706a().m5286K4()) {
            CharSequence charSequenceJ = we60.J(this.purchaseType, detail.n(), requestData.getPrivilegeStyle());
            charSequenceJ.getClass();
            return charSequenceJ;
        }
        boolean zM5444h5 = CoreModule.m1854P().m11706a().m5444h5();
        PurchaseType purchaseType2 = this.purchaseType;
        if (zM5444h5) {
            CharSequence charSequenceJ2 = we60.J(purchaseType2, detail.n(), requestData.getPrivilegeStyle());
            charSequenceJ2.getClass();
            return charSequenceJ2;
        }
        boolean zR = sab0.r(purchaseType2);
        PurchaseType purchaseType3 = this.purchaseType;
        if (zR) {
            String string = (sab0.w(purchaseType3) || sab0.k(this.purchaseType)) ? this.act.getString(R.string.O8, String.valueOf(merchandise.quantity), strQ) : this.act.getString(R.string.N8, String.valueOf(merchandise.quantity), strO);
            string.getClass();
            return string;
        }
        if (!sab0.s(purchaseType3) && !sab0.q(this.purchaseType) && (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType || !CoreModule.m1854P().m11706a().m19862c())) {
            String string2 = this.act.getString(R.string.L8, String.valueOf(merchandise.quantity), strQ);
            string2.getClass();
            return string2;
        }
        if (PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS != this.purchaseType) {
            strQ = strO;
        }
        String string3 = this.act.getString(R.string.M8, String.valueOf(merchandise.quantity), strQ);
        string3.getClass();
        return string3;
    }

    @Override // p006l.hml
    /* JADX INFO: renamed from: b */
    public boolean mo16165b(@NotNull fd0 requestData) {
        requestData.getClass();
        return ((!requestData.getMerchandise().monthly() || !sab0.q(this.purchaseType) || !requestData.getMerchandise().autoRenewable() || !rxa0.k(requestData.getMerchandise())) && CoreModule.m1854P().m11706a().m5461j3() && CoreModule.f1534c.f3580O0.m2014u3(this.purchaseType)) ? false : true;
    }
}
