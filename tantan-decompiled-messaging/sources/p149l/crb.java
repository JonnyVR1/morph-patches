package p149l;

import com.p046p1.mobile.putong.core.data.Coupon;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class crb extends orh0<Coupon> {
    public crb(b8c b8cVar, String str, mrf0<Coupon> mrf0Var, List<Index> list, int i) {
        super(b8cVar, str, mrf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public orh0<Coupon>.C19008a m108352F() {
        return new orh0.C19008a("queryAllCoupons", null, Coupon.f20380ID.DESC, 0, 20);
    }
}
