package p153l;

import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class mvd0 extends AbstractC19971s4 {
    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: j */
    public void mo114833j(lq60 lq60Var) {
        lq60Var.m155322e().m159476m("1元秒杀", true);
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: w */
    public boolean mo114835w(lq60 lq60Var) {
        C8928d.a aVarM184309f = m184309f();
        if (NullChecker.m82486a(aVarM184309f) && TEnum.equals(aVarM184309f.m54762f(), "svip")) {
            Merchandise merchandiseM54784s = aVarM184309f.m54784s();
            if (NullChecker.m82486a(merchandiseM54784s) && aVarM184309f.m54784s().autoRenewable() && merchandiseM54784s.monthly() && v5b0.m199785k(merchandiseM54784s)) {
                return true;
            }
        }
        return false;
    }
}
