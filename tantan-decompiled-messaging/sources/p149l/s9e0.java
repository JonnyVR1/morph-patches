package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8766e;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class s9e0 implements cvv.InterfaceC16252c {

    /* JADX INFO: renamed from: a */
    public HashMap<PurchaseType, C8765d.a> f163176a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m182722c() {
        if (CoreModule.f17545c.f19687u0.m30471r5() == null) {
            return 0;
        }
        return Integer.valueOf(CoreModule.f17545c.f19687u0.m30471r5().f19271c);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m182723d() {
        if (CoreModule.f17545c.f19687u0.m30471r5() == null) {
            return "0";
        }
        int i = CoreModule.f17545c.f19687u0.m30471r5().f19270b;
        return i > 98 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object m182727i() {
        HashMap<PurchaseType, C8765d.a> map = this.f163176a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_LIKERS;
        if (map.get(purchaseType) != null) {
            return C8766e.m53643q(this.f163176a.get(purchaseType));
        }
        C8765d.a aVarM182729h = m182729h(ProductCategory.get(ProductCategory.tttSeeWhoLikedMe), purchaseType);
        return NullChecker.m81303a(aVarM182729h) ? C8766e.m53643q(aVarM182729h) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object m182728j() {
        HashMap<PurchaseType, C8765d.a> map = this.f163176a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        if (map.get(purchaseType) != null) {
            return C8766e.m53643q(this.f163176a.get(purchaseType));
        }
        C8765d.a aVarM182729h = m182729h(ProductCategory.get(ProductCategory.tttVip), purchaseType);
        return NullChecker.m81303a(aVarM182729h) ? C8766e.m53643q(aVarM182729h) : "";
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put("see_privilege_member", new cvv.InterfaceC16251b() { // from class: l.m9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Boolean.valueOf(n3b0.m157742q());
            }
        });
        map.put("see_total_num", new cvv.InterfaceC16251b() { // from class: l.n9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return s9e0.m182723d();
            }
        });
        map.put("see_new_num", new cvv.InterfaceC16251b() { // from class: l.o9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return s9e0.m182722c();
            }
        });
        map.put("see_price", new cvv.InterfaceC16251b() { // from class: l.p9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f147763a.m182727i();
            }
        });
        map.put("vip_price", new cvv.InterfaceC16251b() { // from class: l.q9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f153427a.m182728j();
            }
        });
        map.put("quickchat_price", new cvv.InterfaceC16251b() { // from class: l.r9e0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f158361a.m182730k();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final C8765d.a m182729h(ProductCategory productCategory, PurchaseType purchaseType) {
        List<Merchandise> listM30579D5 = CoreModule.f17545c.f19654j0.m30579D5(productCategory);
        if (listM30579D5 == null) {
            return null;
        }
        List<C8765d> listMo107333a = cjy.m107330z(productCategory).mo107333a(CoreModule.f17544b, purchaseType, productCategory, listM30579D5);
        if (NullChecker.m81304b(listMo107333a)) {
            C8765d c8765dM53647u = C8766e.m53647u(listMo107333a);
            if (NullChecker.m81303a(c8765dM53647u)) {
                C8765d.a aVarM53520b = c8765dM53647u.m53520b();
                if (NullChecker.m81303a(aVarM53520b)) {
                    this.f163176a.put(purchaseType, aVarM53520b);
                    return aVarM53520b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object m182730k() {
        HashMap<PurchaseType, C8765d.a> map = this.f163176a;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
        if (map.get(purchaseType) != null) {
            return C8766e.m53643q(this.f163176a.get(purchaseType));
        }
        C8765d.a aVarM182729h = m182729h(ProductCategory.get("quickchatMembership"), purchaseType);
        return NullChecker.m81303a(aVarM182729h) ? C8766e.m53643q(aVarM182729h) : "";
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
    }
}
