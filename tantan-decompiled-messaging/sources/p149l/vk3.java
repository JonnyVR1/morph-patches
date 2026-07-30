package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vk3 {
    /* JADX INFO: renamed from: g */
    public static void m198714g(final Act act) {
        act.duringCreated(CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("oDiamond"))).filter(new w9j() { // from class: l.pk3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.qk3
            @Override // p149l.e30
            public final void call(Object obj) {
                List list = (List) obj;
                new yab0(act, PurchaseType.TYPE_O_DIAMOND, "p_home,upgrade_odiamond", (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.tk3
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
                    }
                }), (Merchandise) vwb.m200346r(list, new w9j() { // from class: l.uk3
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
                    }
                }), null).m213829v();
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m198715h(Act act) {
        List<Merchandise> listM30579D5 = CoreModule.f17545c.f19654j0.m30579D5(ProductCategory.get("svip"));
        Merchandise merchandise = (Merchandise) vwb.m200346r(listM30579D5, new w9j() { // from class: l.rk3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
            }
        });
        Merchandise merchandise2 = (Merchandise) vwb.m200346r(listM30579D5, new w9j() { // from class: l.sk3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
            }
        });
        if (NullChecker.m81303a(merchandise)) {
            new yab0(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, "p_home,upgrade_svip", merchandise, merchandise2, 8L).m213829v();
        }
    }
}
