package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes12.dex */
public class lgw extends AbstractC19971s4 {
    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
        String string;
        if (m184314m() && m184315n()) {
            string = (String) m184307d(NumberFormat.getNumberInstance().format(m184313l() ? m184318q().getFirstCouponPrice() : m184318q().defaultStockKeepUnit.prices.price));
        } else {
            string = m184306c().getString(R$string.f28004G);
        }
        lq60Var.m155322e().m159475l(string);
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        C8928d.a aVarM184309f = m184309f();
        return NullChecker.m82486a(aVarM184309f) && TEnum.equals(aVarM184309f.m54762f(), ProductCategory.tttVip) && lq60Var.m155321d().m54714m() && m184313l();
    }
}
