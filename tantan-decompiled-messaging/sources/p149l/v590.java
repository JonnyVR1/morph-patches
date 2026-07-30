package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes9.dex */
public final class v590 {

    /* JADX INFO: renamed from: a */
    public final Act f180015a;

    public v590(Act act) {
        this.f180015a = act;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m197096a(Privilege privilege, x590 x590Var) {
        return x590Var.f191099a == privilege && x590Var.f191100b;
    }

    /* JADX INFO: renamed from: b */
    public final List<x590> m197097b(Privilege[] privilegeArr, PurchaseType purchaseType, List<x590> list) {
        ArrayList arrayList = new ArrayList();
        boolean zM182904v = sab0.m182904v(purchaseType);
        for (Privilege privilege : privilegeArr) {
            if (privilege != Privilege.loveBuzz || t49.m187151e()) {
                Privilege privilegeM197102g = m197102g(privilege, zM182904v);
                arrayList.add(new x590(privilegeM197102g, m197104i(privilegeM197102g, purchaseType, list)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public List<bek> m197098c(PurchaseType purchaseType, List<x590> list) {
        Privilege[][] privilegeArrM197100e = m197100e();
        String[] strArrM197101f = m197101f();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < privilegeArrM197100e.length; i++) {
            arrayList.add(new bek(strArrM197101f[i], m197097b(privilegeArrM197100e[i], purchaseType, list)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public List<x590> m197099d(PurchaseType purchaseType) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        if (sab0.m182904v(purchaseType)) {
            m197105j(privilegeDataForGP);
        }
        if (privilegeDataForGP != null) {
            for (Privilege privilege : privilegeDataForGP) {
                arrayList.add(new x590(privilege, m197103h(privilege, purchaseType, privilegeDataForGP)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final Privilege[][] m197100e() {
        return new Privilege[][]{new Privilege[]{Privilege.vip_unlimited_likes, Privilege.vip_super_like, Privilege.premium_compliment, Privilege.immediately_match}, new Privilege[]{Privilege.see_who_likes_me, Privilege.boost, Privilege.intl_advanced_filter, Privilege.intl_visitor, Privilege.tribe, Privilege.loveBuzz}, new Privilege[]{Privilege.vip_undo, Privilege.vip_location, Privilege.message_read_state, Privilege.intl_no_ad, Privilege.vip_membership_active_time_gp, Privilege.vip_badge, Privilege.vip_membership_search_gp}};
    }

    /* JADX INFO: renamed from: f */
    public final String[] m197101f() {
        return new String[]{this.f180015a.getString(R$string.f17609Bc), this.f180015a.getString(R$string.f17639Cc), this.f180015a.getString(R$string.f17669Dc)};
    }

    /* JADX INFO: renamed from: g */
    public final Privilege m197102g(Privilege privilege, boolean z) {
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
    public boolean m197103h(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
        if (sab0.m182905w(purchaseType) && privilege == Privilege.vip_super_like) {
            return false;
        }
        if (sab0.m182905w(purchaseType) && privilege == Privilege.premium_compliment) {
            return false;
        }
        return ((arrayList == null || !arrayList.contains(privilege)) && sab0.m182901s(purchaseType) && (privilege == Privilege.vip_unlimited_likes || privilege == Privilege.see_who_likes_me)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m197104i(final Privilege privilege, PurchaseType purchaseType, List<x590> list) {
        return list.stream().anyMatch(new Predicate() { // from class: l.u590
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return v590.m197096a(privilege, (x590) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m197105j(ArrayList<Privilege> arrayList) {
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
