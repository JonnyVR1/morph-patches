package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class kt80 {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f124570a;

    public kt80(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f124570a = intlVipNewUiFrag;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m147199b(PurchaseType purchaseType, Privilege privilege) {
        ArrayList<Privilege> privilegeDataForGP;
        return ((sab0.m182905w(purchaseType) && privilege == Privilege.vip_super_like) || (privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null)) == null || !privilegeDataForGP.contains(privilege)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final PurchaseType m147200c(Privilege privilege, PurchaseType purchaseType, ArrayList<PurchaseType> arrayList) {
        PurchaseType purchaseType2;
        int iIndexOf = arrayList.indexOf(purchaseType);
        if (iIndexOf < 0) {
            return null;
        }
        if (privilege == Privilege.see_who_likes_me && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m147201d(arrayList, iIndexOf, privilege);
        }
        if (privilege == Privilege.premium_compliment && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m147201d(arrayList, iIndexOf, privilege);
        }
        do {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return null;
            }
            purchaseType2 = arrayList.get(iIndexOf);
        } while (!m147199b(purchaseType2, privilege));
        return purchaseType2;
    }

    /* JADX INFO: renamed from: d */
    public final PurchaseType m147201d(ArrayList<PurchaseType> arrayList, int i, Privilege privilege) {
        while (true) {
            i++;
            if (i >= arrayList.size()) {
                return null;
            }
            PurchaseType purchaseType = arrayList.get(i);
            if (sab0.m182899q(purchaseType) && m147199b(purchaseType, privilege)) {
                return purchaseType;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m147202e(Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f124570a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        ub90.m192818b(privilege, this.f124570a);
        if (u59.m191817Z()) {
            m147204g(purchaseType, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m147203f(final Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f124570a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        ub90.m192818b(privilege, this.f124570a);
        ArrayList<PurchaseType> arrayListM126902q0 = glp.m126902q0();
        if (vwb.m200296J(arrayListM126902q0)) {
            return;
        }
        final PurchaseType purchaseTypeM147200c = m147200c(privilege, purchaseType, arrayListM126902q0);
        if (purchaseTypeM147200c == null) {
            if (u59.m191817Z()) {
                m147204g(purchaseType, privilege);
                return;
            }
            return;
        }
        int iM105375d = c690.m105375d(purchaseTypeM147200c, new jyo());
        if (iM105375d >= 0) {
            this.f124570a.m56353S4(iM105375d);
            if (u59.m191817Z()) {
                View view = this.f124570a.getView();
                if (view != null) {
                    view.postDelayed(new Runnable() { // from class: l.jt80
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f119578a.m147204g(purchaseTypeM147200c, privilege);
                        }
                    }, 300L);
                } else {
                    m147204g(purchaseTypeM147200c, privilege);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m147204g(PurchaseType purchaseType, Privilege privilege) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f124570a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        String str = privilege == Privilege.premium_compliment ? "p_privileges_view,e_whisper_unlock_btn_click,click" : "p_privileges_view,e_ttc_subcription_privilege_description,click";
        if (sab0.m182899q(purchaseType)) {
            C8764c.m53504x0(this.f124570a.act(), str, privilege);
            return;
        }
        if (sab0.m182904v(purchaseType)) {
            C8764c.m53408L0(this.f124570a.act(), str, null, null, null, privilege);
        } else if (sab0.m182905w(purchaseType)) {
            C8764c.m53406K1(this.f124570a.act(), str, privilege, null, null);
        } else if (sab0.m182901s(purchaseType)) {
            C8764c.m53376A1(this.f124570a.act(), str);
        }
    }
}
