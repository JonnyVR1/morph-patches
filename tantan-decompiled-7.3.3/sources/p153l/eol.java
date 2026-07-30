package p153l;

import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes12.dex */
public class eol extends AbstractC19971s4 {
    /* JADX INFO: renamed from: A */
    public final boolean m121753A(lq60 lq60Var) {
        return !wib0.m206565i(lq60Var.m155323f()) && !wib0.m206571o(lq60Var.m155323f()) && m184314m() && m184315n();
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
        String str;
        String str2;
        if (!m121753A(lq60Var)) {
            lq60Var.m155322e().m159475l("确认协议并支付");
            return;
        }
        if (NullChecker.m82486a(m184309f())) {
            str = NumberFormat.getNumberInstance().format(m184313l() ? m184318q().getFirstCouponPrice() : m184318q().defaultStockKeepUnit.prices.price);
            str2 = m184318q().defaultStockKeepUnit.prices.currencySymbol;
        } else {
            str = "";
            str2 = "";
        }
        lq60Var.m155322e().m159475l(String.format("确认协议免密付%s%s", str2, str));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        if (!NullChecker.m82486a(lq60Var.m155321d()) || !lq60Var.m155321d().m54714m()) {
            return false;
        }
        if (wib0.m206571o(lq60Var.m155323f()) && lq60Var.m155321d().m54703b().m54788w() == 12) {
            return false;
        }
        return (wib0.m206565i(lq60Var.m155323f()) && lq60Var.m155321d().m54703b().m54788w() == 12) ? false : true;
    }
}
