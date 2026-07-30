package p149l;

import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class knd0 extends AbstractC20353u4 {
    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: j */
    public void mo94418j(gi60 gi60Var) {
        gi60Var.m126260e().m131224m("1元秒杀", true);
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: w */
    public boolean mo94420w(gi60 gi60Var) {
        C8765d.a aVarM191648f = m191648f();
        if (NullChecker.m81303a(aVarM191648f) && TEnum.equals(aVarM191648f.m53579f(), "svip")) {
            Merchandise merchandiseM53601s = aVarM191648f.m53601s();
            if (NullChecker.m81303a(merchandiseM53601s) && aVarM191648f.m53601s().autoRenewable() && merchandiseM53601s.monthly() && rxa0.m181490k(merchandiseM53601s)) {
                return true;
            }
        }
        return false;
    }
}
