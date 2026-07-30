package p153l;

import com.p051p1.mobile.putong.core.data.MonetizationPromotion;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class u6b0 extends wzh0<MonetizationPromotion> {
    public u6b0(h9c h9cVar, String str, vzf0<MonetizationPromotion> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0<MonetizationPromotion>.C21213a m194659F() {
        return new wzh0.C21213a("queryAllPromotions", null, MonetizationPromotion.f21193ID.DESC, 0, 20);
    }
}
