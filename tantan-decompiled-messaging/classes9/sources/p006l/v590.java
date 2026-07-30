package p006l;

import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class v590 {

    /* JADX INFO: renamed from: a */
    public final Act f24150a;

    public v590(Act act) {
        this.f24150a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m25754a(Privilege privilege, x590 x590Var) {
        return x590Var.f27352a == privilege && x590Var.f27353b;
    }

    /* JADX INFO: renamed from: b */
    public final List<x590> m25755b(Privilege[] privilegeArr, PurchaseType purchaseType, List<x590> list) {
        ArrayList arrayList = new ArrayList();
        boolean zV = sab0.v(purchaseType);
        for (Privilege privilege : privilegeArr) {
            if (privilege != Privilege.loveBuzz || t49.m24450e()) {
                Privilege privilegeM25760g = m25760g(privilege, zV);
                arrayList.add(new x590(privilegeM25760g, m25762i(privilegeM25760g, purchaseType, list)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List<bek> m25756c(PurchaseType purchaseType, List<x590> list) {
        Privilege[][] privilegeArrM25758e = m25758e();
        String[] strArrM25759f = m25759f();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < privilegeArrM25758e.length; i++) {
            arrayList.add(new bek(strArrM25759f[i], m25755b(privilegeArrM25758e[i], purchaseType, list)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public List<x590> m25757d(PurchaseType purchaseType) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP((Gender) null);
        if (sab0.v(purchaseType)) {
            m25763j(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            for (Privilege privilege : privilegeDataForGP) {
                arrayList.add(new x590(privilege, m25761h(privilege, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final Privilege[][] m25758e() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: f */
    public final String[] m25759f() {
        return new String[]{this.f24150a.getString(R$string.f1598Bc), this.f24150a.getString(R$string.f1628Cc), this.f24150a.getString(R$string.f1658Dc)};
    }

    /* JADX INFO: renamed from: g */
    public final Privilege m25760g(Privilege privilege, boolean z) {
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
    public boolean m25761h(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
        if (sab0.w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (sab0.w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((arrayList == null || !arrayList.contains(privilege)) && sab0.s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m25762i(final Privilege privilege, PurchaseType purchaseType, List<x590> list) {
        return list.stream().anyMatch(new Predicate() { // from class: l.u590
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return v590.m25754a(privilege, (x590) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m25763j(ArrayList<Privilege> arrayList) {
        ArrayList<Privilege> privilegeDataForGP = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeDataForGP((Gender) null);
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
