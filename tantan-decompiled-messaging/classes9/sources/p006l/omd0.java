package p006l;

import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class omd0 extends AbstractC1333u4 {
    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
        String string;
        if (m24951m() && m24952n()) {
            string = (String) m24944d(NumberFormat.getNumberInstance().format(m24950l() ? m24955q().getFirstCouponPrice() : m24955q().defaultStockKeepUnit.prices.price));
        } else {
            string = m24943c().getString(R.string.G);
        }
        gi60Var.m15804e().m16229l(string);
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        d.a aVarM24946f = m24946f();
        return NullChecker.a(aVarM24946f) && TEnum.equals(aVarM24946f.f(), "svip") && gi60Var.m15803d().m() && m24950l();
    }
}
