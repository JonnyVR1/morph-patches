package p006l;

import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.rxa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class knd0 extends AbstractC1333u4 {
    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: j */
    public void mo11678j(gi60 gi60Var) {
        gi60Var.m15804e().m16230m("1元秒杀", true);
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: w */
    public boolean mo11680w(gi60 gi60Var) {
        d.a aVarM24946f = m24946f();
        if (NullChecker.a(aVarM24946f) && TEnum.equals(aVarM24946f.f(), "svip")) {
            Merchandise merchandiseS = aVarM24946f.s();
            if (NullChecker.a(merchandiseS) && aVarM24946f.s().autoRenewable() && merchandiseS.monthly() && rxa0.k(merchandiseS)) {
                return true;
            }
        }
        return false;
    }
}
