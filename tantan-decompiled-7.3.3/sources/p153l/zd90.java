package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes12.dex */
public final class zd90 {

    /* JADX INFO: renamed from: a */
    public final Act f203861a;

    public zd90(Act act) {
        this.f203861a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m219282a(Privilege privilege, be90 be90Var) {
        return be90Var.f76351a == privilege && be90Var.f76352b;
    }

    /* JADX INFO: renamed from: b */
    public final List<be90> m219283b(Privilege[] privilegeArr, PurchaseType purchaseType, List<be90> list) {
        ArrayList arrayList = new ArrayList();
        boolean zM206578v = wib0.m206578v(purchaseType);
        for (Privilege privilege : privilegeArr) {
            if (privilege != Privilege.loveBuzz || c69.m108119e()) {
                Privilege privilegeM219288g = m219288g(privilege, zM206578v);
                arrayList.add(new be90(privilegeM219288g, m219290i(privilegeM219288g, purchaseType, list)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List<rgk> m219284c(PurchaseType purchaseType, List<be90> list) {
        Privilege[][] privilegeArrM219286e = m219286e();
        String[] strArrM219287f = m219287f();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < privilegeArrM219286e.length; i++) {
            arrayList.add(new rgk(strArrM219287f[i], m219283b(privilegeArrM219286e[i], purchaseType, list)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public List<be90> m219285d(PurchaseType purchaseType) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        if (wib0.m206578v(purchaseType)) {
            m219291j(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            for (Privilege privilege : privilegeDataForGP) {
                arrayList.add(new be90(privilege, m219289h(privilege, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final Privilege[][] m219286e() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: f */
    public final String[] m219287f() {
        return new String[]{this.f203861a.getString(R$string.f18789Qc), this.f203861a.getString(R$string.f18819Rc), this.f203861a.getString(R$string.f18849Sc)};
    }

    /* JADX INFO: renamed from: g */
    public final Privilege m219288g(Privilege privilege, boolean z) {
        if (z) {
            if (privilege == Privilege.vip_super_like) {
                return Privilege.unlimit_free_super_like;
            }
            if (privilege == Privilege.boost) {
                return Privilege.full_boost;
            }
            if (privilege == Privilege.vip_badge) {
                return Privilege.ultra_premium_badge;
            }
        }
        return privilege;
    }

    /* JADX INFO: renamed from: h */
    public boolean m219289h(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
        if (wib0.m206579w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (wib0.m206579w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((arrayList == null || !arrayList.contains(privilege)) && wib0.m206575s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m219290i(final Privilege privilege, PurchaseType purchaseType, List<be90> list) {
        return list.stream().anyMatch(new Predicate() { // from class: l.yd90
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return zd90.m219282a(privilege, (be90) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m219291j(ArrayList<Privilege> arrayList) {
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP(null);
        if (privilegeDataForGP == null || arrayList == null) {
            return;
        }
        for (Privilege privilege : privilegeDataForGP) {
            if (!arrayList.contains(privilege)) {
                arrayList.add(privilege);
            }
        }
    }
}
