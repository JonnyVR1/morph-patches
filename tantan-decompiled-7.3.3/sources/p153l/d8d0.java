package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.p051p1.mobile.putong.core.pay.R$string;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes12.dex */
public class d8d0 extends AbstractC19971s4 {
    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
        if (lq60Var.m155323f() != PurchaseType.TYPE_O_DIAMOND || !C8929e.m54833x(lq60Var.m155319b())) {
            lq60Var.m155322e().m159475l(lq60Var.m155318a().string(R$string.f28513y8));
            return;
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(1);
        lq60Var.m155322e().m159475l(String.format("%1$s%2$s %3$s", m184318q().defaultStockKeepUnit.prices.currencySymbol, numberInstance.format(m184318q().defaultStockKeepUnit.prices.price), lq60Var.m155318a().string(R$string.f28513y8)));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: j */
    public void mo114833j(lq60 lq60Var) {
        lq60Var.m155322e().m159476m("", false);
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        return (lq60Var.m155323f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || lq60Var.m155323f() == PurchaseType.TYPE_O_DIAMOND) && C8929e.m54833x(lq60Var.m155319b());
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: w */
    public boolean mo114835w(lq60 lq60Var) {
        return (lq60Var.m155323f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE || lq60Var.m155323f() == PurchaseType.TYPE_O_DIAMOND) && C8929e.m54833x(lq60Var.m155319b());
    }
}
