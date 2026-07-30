package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ol3 {
    /* JADX INFO: renamed from: g */
    public static void m168099g(final Act act) {
        act.duringCreated(CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("oDiamond"))).filter(new qcj() { // from class: l.il3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jl3
            @Override // p153l.y20
            public final void call(Object obj) {
                List list = (List) obj;
                new cjb0(act, PurchaseType.TYPE_O_DIAMOND, "p_home,upgrade_odiamond", (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.ml3
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
                    }
                }), (Merchandise) jyb.m147529r(list, new qcj() { // from class: l.nl3
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
                    }
                }), null).m110108v();
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m168100h(Act act) {
        List<Merchandise> listM31582D5 = CoreModule.f18264c.f20396j0.m31582D5(ProductCategory.get("svip"));
        Merchandise merchandise = (Merchandise) jyb.m147529r(listM31582D5, new qcj() { // from class: l.kl3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
            }
        });
        Merchandise merchandise2 = (Merchandise) jyb.m147529r(listM31582D5, new qcj() { // from class: l.ll3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
            }
        });
        if (NullChecker.m82486a(merchandise)) {
            new cjb0(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, "p_home,upgrade_svip", merchandise, merchandise2, 8L).m110108v();
        }
    }
}
