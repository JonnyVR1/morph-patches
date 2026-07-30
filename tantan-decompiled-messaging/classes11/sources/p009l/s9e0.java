package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.core.ui.purchase.e;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.n3b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s9e0 implements cvv.InterfaceC0829c {

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, d.a> f20139a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m22006c() {
        if (CoreModule.c.u0.r5() == null) {
            return 0;
        }
        return Integer.valueOf(CoreModule.c.u0.r5().c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m22007d() {
        if (CoreModule.c.u0.r5() == null) {
            return "0";
        }
        int i = CoreModule.c.u0.r5().b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object m22011i() {
        HashMap<PurchaseType, d.a> map = this.f20139a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        if (map.get(purchaseType) != null) {
            return e.q(this.f20139a.get(purchaseType));
        }
        d.a aVarM22013h = m22013h(ProductCategory.get("tttSeeWhoLikedMe"), purchaseType);
        return NullChecker.a(aVarM22013h) ? e.q(aVarM22013h) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object m22012j() {
        HashMap<PurchaseType, d.a> map = this.f20139a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        if (map.get(purchaseType) != null) {
            return e.q(this.f20139a.get(purchaseType));
        }
        d.a aVarM22013h = m22013h(ProductCategory.get("tttVip"), purchaseType);
        return NullChecker.a(aVarM22013h) ? e.q(aVarM22013h) : "";
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("see_privilege_member", new cvv.InterfaceC0828b() { // from class: l.m9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Boolean.valueOf(n3b0.q());
            }
        });
        map.put("see_total_num", new cvv.InterfaceC0828b() { // from class: l.n9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return s9e0.m22007d();
            }
        });
        map.put("see_new_num", new cvv.InterfaceC0828b() { // from class: l.o9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return s9e0.m22006c();
            }
        });
        map.put("see_price", new cvv.InterfaceC0828b() { // from class: l.p9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f18434a.m22011i();
            }
        });
        map.put("vip_price", new cvv.InterfaceC0828b() { // from class: l.q9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f19107a.m22012j();
            }
        });
        map.put("quickchat_price", new cvv.InterfaceC0828b() { // from class: l.r9e0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f19699a.m22014k();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final d.a m22013h(ProductCategory productCategory, PurchaseType purchaseType) {
        List<Merchandise> listD5 = CoreModule.c.j0.D5(productCategory);
        if (listD5 == null) {
            return null;
        }
        List<d> listMo12681a = cjy.m12678z(productCategory).mo12681a(CoreModule.b, purchaseType, productCategory, listD5);
        if (NullChecker.b(listMo12681a)) {
            d dVarU = e.u(listMo12681a);
            if (NullChecker.a(dVarU)) {
                d.a aVarB = dVarU.b();
                if (NullChecker.a(aVarB)) {
                    this.f20139a.put(purchaseType, aVarB);
                    return aVarB;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object m22014k() {
        HashMap<PurchaseType, d.a> map = this.f20139a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
        if (map.get(purchaseType) != null) {
            return e.q(this.f20139a.get(purchaseType));
        }
        d.a aVarM22013h = m22013h(ProductCategory.get("quickchatMembership"), purchaseType);
        return NullChecker.a(aVarM22013h) ? e.q(aVarM22013h) : "";
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
    }
}
