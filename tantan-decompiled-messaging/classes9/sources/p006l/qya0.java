package p006l;

import com.p1.mobile.putong.core.data.MonetizationPromotion;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.data.orm.Index;
import com.tantanapp.common.data.orm.OrderedColumn;
import java.util.List;
import l.b8c;
import l.mrf0;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qya0 extends orh0<MonetizationPromotion> {
    public qya0(b8c b8cVar, String str, mrf0<MonetizationPromotion> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<MonetizationPromotion>.a m22514F() {
        return new orh0.a(this, "queryAllPromotions", (Filter) null, ((OrderedColumn) MonetizationPromotion.ID).DESC, 0, 20);
    }
}
