package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.p046p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes9.dex */
public class a0d0 extends AbstractC20353u4 {
    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
        if (gi60Var.m126261f() != PurchaseType.TYPE_O_DIAMOND || !C8766e.m53650x(gi60Var.m126257b())) {
            gi60Var.m126260e().m131223l(gi60Var.m126256a().string(R$string.f27665y8));
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        gi60Var.m126260e().m131223l(String.format("%1$s%2$s %3$s", m191657q().defaultStockKeepUnit.prices.currencySymbol, numberInstance.format(m191657q().defaultStockKeepUnit.prices.price), gi60Var.m126256a().string(R$string.f27665y8)));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: j */
    public void mo94418j(gi60 gi60Var) {
        gi60Var.m126260e().m131224m("", false);
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        return (gi60Var.m126261f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || gi60Var.m126261f() == PurchaseType.TYPE_O_DIAMOND) && C8766e.m53650x(gi60Var.m126257b());
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: w */
    public boolean mo94420w(gi60 gi60Var) {
        return (gi60Var.m126261f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || gi60Var.m126261f() == PurchaseType.TYPE_O_DIAMOND) && C8766e.m53650x(gi60Var.m126257b());
    }
}
