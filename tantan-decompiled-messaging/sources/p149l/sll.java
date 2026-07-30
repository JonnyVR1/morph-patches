package p149l;

import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes9.dex */
public class sll extends AbstractC20353u4 {
    /* JADX INFO: renamed from: A */
    public final boolean m184832A(gi60 gi60Var) {
        return !sab0.m182891i(gi60Var.m126261f()) && !sab0.m182897o(gi60Var.m126261f()) && m191653m() && m191654n();
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
        String str;
        String str2;
        if (!m184832A(gi60Var)) {
            gi60Var.m126260e().m131223l("确认协议并支付");
            return;
        }
        if (NullChecker.m81303a(m191648f())) {
            str = NumberFormat.getNumberInstance().format(m191652l() ? m191657q().getFirstCouponPrice() : m191657q().defaultStockKeepUnit.prices.price);
            str2 = m191657q().defaultStockKeepUnit.prices.currencySymbol;
        } else {
            str = "";
            str2 = "";
        }
        gi60Var.m126260e().m131223l(String.format("确认协议免密付%s%s", str2, str));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        if (!NullChecker.m81303a(gi60Var.m126259d()) || !gi60Var.m126259d().m53531m()) {
            return false;
        }
        if (sab0.m182897o(gi60Var.m126261f()) && gi60Var.m126259d().m53520b().m53605w() == 12) {
            return false;
        }
        return (sab0.m182891i(gi60Var.m126261f()) && gi60Var.m126259d().m53520b().m53605w() == 12) ? false : true;
    }
}
