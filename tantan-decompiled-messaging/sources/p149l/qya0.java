package p149l;

import com.p046p1.mobile.putong.core.data.MonetizationPromotion;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qya0 extends orh0<MonetizationPromotion> {
    public qya0(b8c b8cVar, String str, mrf0<MonetizationPromotion> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<MonetizationPromotion>.C19008a m177026F() {
        return new orh0.C19008a("queryAllPromotions", null, MonetizationPromotion.f20451ID.DESC, 0, 20);
    }
}
