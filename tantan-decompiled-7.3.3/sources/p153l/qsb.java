package p153l;

import com.p051p1.mobile.putong.core.data.Coupon;
import com.tantanapp.common.data.orm.Index;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qsb extends wzh0<Coupon> {
    public qsb(h9c h9cVar, String str, vzf0<Coupon> vzf0Var, List<Index> list, int i) {
        super(h9cVar, str, vzf0Var, list, i);
    }

    /* JADX INFO: renamed from: F */
    public wzh0<Coupon>.C21213a m177756F() {
        return new wzh0.C21213a("queryAllCoupons", null, Coupon.f21122ID.DESC, 0, 20);
    }
}
