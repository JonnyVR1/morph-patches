package p006l;

import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class sll extends AbstractC1333u4 {
    /* JADX INFO: renamed from: A */
    public final boolean m23892A(gi60 gi60Var) {
        return !sab0.i(gi60Var.m15805f()) && !sab0.o(gi60Var.m15805f()) && m24951m() && m24952n();
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
        String str;
        String str2;
        if (!m23892A(gi60Var)) {
            gi60Var.m15804e().m16229l("确认协议并支付");
            return;
        }
        if (NullChecker.a(m24946f())) {
            str = NumberFormat.getNumberInstance().format(m24950l() ? m24955q().getFirstCouponPrice() : m24955q().defaultStockKeepUnit.prices.price);
            str2 = m24955q().defaultStockKeepUnit.prices.currencySymbol;
        } else {
            str = "";
            str2 = "";
        }
        gi60Var.m15804e().m16229l(String.format("确认协议免密付%s%s", str2, str));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        if (!NullChecker.a(gi60Var.m15803d()) || !gi60Var.m15803d().m()) {
            return false;
        }
        if (sab0.o(gi60Var.m15805f()) && gi60Var.m15803d().b().w() == 12) {
            return false;
        }
        return (sab0.i(gi60Var.m15805f()) && gi60Var.m15803d().b().w() == 12) ? false : true;
    }
}
