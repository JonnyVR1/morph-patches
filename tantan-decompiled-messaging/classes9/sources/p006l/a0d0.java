package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.e;
import java.text.NumberFormat;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class a0d0 extends AbstractC1333u4 {
    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
        if (gi60Var.m15805f() != PurchaseType.TYPE_O_DIAMOND || !e.x(gi60Var.m15801b())) {
            gi60Var.m15804e().m16229l(gi60Var.m15800a().string(R.string.y8));
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        gi60Var.m15804e().m16229l(String.format("%1$s%2$s %3$s", m24955q().defaultStockKeepUnit.prices.currencySymbol, numberInstance.format(m24955q().defaultStockKeepUnit.prices.price), gi60Var.m15800a().string(R.string.y8)));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: j */
    public void mo11678j(gi60 gi60Var) {
        gi60Var.m15804e().m16230m("", false);
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        return (gi60Var.m15805f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || gi60Var.m15805f() == PurchaseType.TYPE_O_DIAMOND) && e.x(gi60Var.m15801b());
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: w */
    public boolean mo11680w(gi60 gi60Var) {
        return (gi60Var.m15805f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || gi60Var.m15805f() == PurchaseType.TYPE_O_DIAMOND) && e.x(gi60Var.m15801b());
    }
}
