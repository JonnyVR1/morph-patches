package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Gender;
import java.util.ArrayList;
import l.d30;
import l.e30;
import l.sab0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class kt80 {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f15991a;

    public kt80(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f15991a = intlVipNewUiFrag;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18262b(PurchaseType purchaseType, Privilege privilege) {
        ArrayList privilegeDataForGP;
        return ((sab0.w(purchaseType) && privilege == Privilege.vip_super_like) || (privilegeDataForGP = purchaseType.getPrivilegeDataForGP((Gender) null)) == null || !privilegeDataForGP.contains(privilege)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final PurchaseType m18263c(Privilege privilege, PurchaseType purchaseType, ArrayList<PurchaseType> arrayList) {
        PurchaseType purchaseType2;
        int iIndexOf = arrayList.indexOf(purchaseType);
        if (iIndexOf < 0) {
            return null;
        }
        if (privilege == Privilege.see_who_likes_me && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m18264d(arrayList, iIndexOf, privilege);
        }
        if (privilege == Privilege.premium_compliment && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m18264d(arrayList, iIndexOf, privilege);
        }
        do {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return null;
            }
            purchaseType2 = arrayList.get(iIndexOf);
        } while (!m18262b(purchaseType2, privilege));
        return purchaseType2;
    }

    /* JADX INFO: renamed from: d */
    public final PurchaseType m18264d(ArrayList<PurchaseType> arrayList, int i, Privilege privilege) {
        while (true) {
            i++;
            if (i >= arrayList.size()) {
                return null;
            }
            PurchaseType purchaseType = arrayList.get(i);
            if (sab0.q(purchaseType) && m18262b(purchaseType, privilege)) {
                return purchaseType;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18265e(Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f15991a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        ub90.m25172b(privilege, this.f15991a);
        if (u59.m24988Z()) {
            m18267g(purchaseType, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m18266f(final Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f15991a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        ub90.m25172b(privilege, this.f15991a);
        ArrayList<PurchaseType> arrayListM15879q0 = glp.m15879q0();
        if (vwb.J(arrayListM15879q0)) {
            return;
        }
        final PurchaseType purchaseTypeM18263c = m18263c(privilege, purchaseType, arrayListM15879q0);
        if (purchaseTypeM18263c == null) {
            if (u59.m24988Z()) {
                m18267g(purchaseType, privilege);
                return;
            }
            return;
        }
        int iM13204d = c690.m13204d(purchaseTypeM18263c, new jyo());
        if (iM13204d >= 0) {
            this.f15991a.m9790S4(iM13204d);
            if (u59.m24988Z()) {
                View view = this.f15991a.getView();
                if (view != null) {
                    view.postDelayed(new Runnable() { // from class: l.jt80
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f15386a.m18267g(purchaseTypeM18263c, privilege);
                        }
                    }, 300L);
                } else {
                    m18267g(purchaseTypeM18263c, privilege);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m18267g(PurchaseType purchaseType, Privilege privilege) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f15991a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        String str = privilege == Privilege.premium_compliment ? "p_privileges_view,e_whisper_unlock_btn_click,click" : "p_privileges_view,e_ttc_subcription_privilege_description,click";
        if (sab0.q(purchaseType)) {
            c.x0(this.f15991a.act(), str, privilege);
            return;
        }
        if (sab0.v(purchaseType)) {
            c.L0(this.f15991a.act(), str, (e30) null, (d30) null, (d30) null, privilege);
        } else if (sab0.w(purchaseType)) {
            c.K1(this.f15991a.act(), str, privilege, (d30) null, (d30) null);
        } else if (sab0.s(purchaseType)) {
            c.A1(this.f15991a.act(), str);
        }
    }
}
