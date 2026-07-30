package p003l;

import com.p000p1.mobile.putong.core.data.Merchandise;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.yab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vk3 {
    /* JADX INFO: renamed from: g */
    public static void m10238g(final Act act) {
        act.duringCreated(CoreModule.c.j0.y5(ProductCategory.get("oDiamond"))).filter(new w9j() { // from class: l.pk3
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.qk3
            public final void call(Object obj) {
                List list = (List) obj;
                new yab0(act, PurchaseType.TYPE_O_DIAMOND, "p_home,upgrade_odiamond", (Merchandise) vwb.r(list, new w9j() { // from class: l.tk3
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.noneRenewable());
                    }
                }), (Merchandise) vwb.r(list, new w9j() { // from class: l.uk3
                    public final Object call(Object obj2) {
                        Merchandise merchandise = (Merchandise) obj2;
                        return Boolean.valueOf(merchandise.monthly() && merchandise.autoRenewable());
                    }
                }), (Long) null).v();
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static void m10239h(Act act) {
        List listD5 = CoreModule.c.j0.D5(ProductCategory.get("svip"));
        Merchandise merchandise = (Merchandise) vwb.r(listD5, new w9j() { // from class: l.rk3
            public final Object call(Object obj) {
                Merchandise merchandise2 = (Merchandise) obj;
                return Boolean.valueOf(merchandise2.monthly() && merchandise2.noneRenewable());
            }
        });
        Merchandise merchandise2 = (Merchandise) vwb.r(listD5, new w9j() { // from class: l.sk3
            public final Object call(Object obj) {
                Merchandise merchandise3 = (Merchandise) obj;
                return Boolean.valueOf(merchandise3.monthly() && merchandise3.autoRenewable());
            }
        });
        if (NullChecker.a(merchandise)) {
            new yab0(act, PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, "p_home,upgrade_svip", merchandise, merchandise2, 8L).v();
        }
    }
}
