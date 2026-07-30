package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zh0 extends AbstractC1333u4 {
    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: h */
    public void mo24948h(gi60 gi60Var) {
        gi60Var.m15804e().m16228k(m24943c().getString(R.string.h));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
        String str;
        if (NullChecker.a(m24946f())) {
            str = NumberFormat.getNumberInstance().format(m24950l() ? m24955q().getFirstCouponPrice() : m24955q().defaultStockKeepUnit.prices.price);
        } else {
            str = "";
        }
        gi60Var.m15804e().m16229l(m24944d(str));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: s */
    public boolean mo24957s(gi60 gi60Var) {
        return !(CoreModule.m1854P().m11706a().m19879f() && sab0.i(gi60Var.m15805f())) && !sab0.o(gi60Var.m15805f()) && m24951m() && m24952n();
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        return !(CoreModule.m1854P().m11706a().m19879f() && sab0.i(gi60Var.m15805f())) && !sab0.o(gi60Var.m15805f()) && m24951m() && m24952n();
    }
}
