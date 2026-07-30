package p149l;

import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.NumberFormat;

/* JADX INFO: renamed from: l.new, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class Cnew extends AbstractC20353u4 {
    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
        String string;
        if (m191653m() && m191654n()) {
            string = (String) m191646d(NumberFormat.getNumberInstance().format(m191652l() ? m191657q().getFirstCouponPrice() : m191657q().defaultStockKeepUnit.prices.price));
        } else {
            string = m191645c().getString(R$string.f27156G);
        }
        gi60Var.m126260e().m131223l(string);
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        C8765d.a aVarM191648f = m191648f();
        return NullChecker.m81303a(aVarM191648f) && TEnum.equals(aVarM191648f.m53579f(), ProductCategory.tttVip) && gi60Var.m126259d().m53531m() && m191652l();
    }
}
