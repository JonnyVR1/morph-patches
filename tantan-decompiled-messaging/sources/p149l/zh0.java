package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes9.dex */
public class zh0 extends AbstractC20353u4 {
    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: h */
    public void mo191650h(gi60 gi60Var) {
        gi60Var.m126260e().m131222k(m191645c().getString(R$string.f27460h));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
        String str;
        if (NullChecker.m81303a(m191648f())) {
            str = NumberFormat.getNumberInstance().format(m191652l() ? m191657q().getFirstCouponPrice() : m191657q().defaultStockKeepUnit.prices.price);
        } else {
            str = "";
        }
        gi60Var.m126260e().m131223l(m191646d(str));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: s */
    public boolean mo191659s(gi60 gi60Var) {
        return !(CoreModule.m29935P().m94651a().mo158371f() && sab0.m182891i(gi60Var.m126261f())) && !sab0.m182897o(gi60Var.m126261f()) && m191653m() && m191654n();
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        return !(CoreModule.m29935P().m94651a().mo158371f() && sab0.m182891i(gi60Var.m126261f())) && !sab0.m182897o(gi60Var.m126261f()) && m191653m() && m191654n();
    }
}
