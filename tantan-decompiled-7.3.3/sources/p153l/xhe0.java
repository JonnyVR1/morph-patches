package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8929e;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class xhe0 implements dxv.InterfaceC16648c {

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8928d.a> f194360a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m211027c() {
        if (CoreModule.f18264c.f20429u0.m31479t5() == null) {
            return 0;
        }
        return Integer.valueOf(CoreModule.f18264c.f20429u0.m31479t5().f20013c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m211028d() {
        if (CoreModule.f18264c.f20429u0.m31479t5() == null) {
            return "0";
        }
        int i = CoreModule.f18264c.f20429u0.m31479t5().f20012b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object m211032i() {
        HashMap<PurchaseType, C8928d.a> map = this.f194360a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        if (map.get(purchaseType) != null) {
            return C8929e.m54826q(this.f194360a.get(purchaseType));
        }
        C8928d.a aVarM211034h = m211034h(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), purchaseType);
        return NullChecker.m82486a(aVarM211034h) ? C8929e.m54826q(aVarM211034h) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object m211033j() {
        HashMap<PurchaseType, C8928d.a> map = this.f194360a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        if (map.get(purchaseType) != null) {
            return C8929e.m54826q(this.f194360a.get(purchaseType));
        }
        C8928d.a aVarM211034h = m211034h(ProductCategory.get(ProductCategory.tttVip), purchaseType);
        return NullChecker.m82486a(aVarM211034h) ? C8929e.m54826q(aVarM211034h) : "";
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put("see_privilege_member", new dxv.InterfaceC16647b() { // from class: l.rhe0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Boolean.valueOf(rbb0.m180744q());
            }
        });
        map.put("see_total_num", new dxv.InterfaceC16647b() { // from class: l.she0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return xhe0.m211028d();
            }
        });
        map.put("see_new_num", new dxv.InterfaceC16647b() { // from class: l.the0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return xhe0.m211027c();
            }
        });
        map.put("see_price", new dxv.InterfaceC16647b() { // from class: l.uhe0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f179023a.m211032i();
            }
        });
        map.put("vip_price", new dxv.InterfaceC16647b() { // from class: l.vhe0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f184162a.m211033j();
            }
        });
        map.put("quickchat_price", new dxv.InterfaceC16647b() { // from class: l.whe0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f189147a.m211035k();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final C8928d.a m211034h(ProductCategory productCategory, PurchaseType purchaseType) {
        List<Merchandise> listM31582D5 = CoreModule.f18264c.f20396j0.m31582D5(productCategory);
        if (listM31582D5 == null) {
            return null;
        }
        List<C8928d> listMo147671a = zry.m221275z(productCategory).mo147671a(CoreModule.f18263b, purchaseType, productCategory, listM31582D5);
        if (NullChecker.m82487b(listMo147671a)) {
            C8928d c8928dM54830u = C8929e.m54830u(listMo147671a);
            if (NullChecker.m82486a(c8928dM54830u)) {
                C8928d.a aVarM54703b = c8928dM54830u.m54703b();
                if (NullChecker.m82486a(aVarM54703b)) {
                    this.f194360a.put(purchaseType, aVarM54703b);
                    return aVarM54703b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object m211035k() {
        HashMap<PurchaseType, C8928d.a> map = this.f194360a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
        if (map.get(purchaseType) != null) {
            return C8929e.m54826q(this.f194360a.get(purchaseType));
        }
        C8928d.a aVarM211034h = m211034h(ProductCategory.get("quickchatMembership"), purchaseType);
        return NullChecker.m82486a(aVarM211034h) ? C8929e.m54826q(aVarM211034h) : "";
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
    }
}
