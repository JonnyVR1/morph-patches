package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class o190 {

    /* JADX INFO: renamed from: a */
    public final IntlVipNewUiFrag f144630a;

    public o190(IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f144630a = intlVipNewUiFrag;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m165582b(PurchaseType purchaseType, Privilege privilege) {
        ArrayList<Privilege> privilegeDataForGP;
        return ((wib0.m206579w(purchaseType) && privilege == Privilege.vip_super_like) || (privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null)) == null || !privilegeDataForGP.contains(privilege)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final PurchaseType m165583c(Privilege privilege, PurchaseType purchaseType, ArrayList<PurchaseType> arrayList) {
        PurchaseType purchaseType2;
        int iIndexOf = arrayList.indexOf(purchaseType);
        if (iIndexOf < 0) {
            return null;
        }
        if (privilege == Privilege.see_who_likes_me && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m165584d(arrayList, iIndexOf, privilege);
        }
        if (privilege == Privilege.premium_compliment && purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m165584d(arrayList, iIndexOf, privilege);
        }
        do {
            iIndexOf++;
            if (iIndexOf >= arrayList.size()) {
                return null;
            }
            purchaseType2 = arrayList.get(iIndexOf);
        } while (!m165582b(purchaseType2, privilege));
        return purchaseType2;
    }

    /* JADX INFO: renamed from: d */
    public final PurchaseType m165584d(ArrayList<PurchaseType> arrayList, int i, Privilege privilege) {
        while (true) {
            i++;
            if (i >= arrayList.size()) {
                return null;
            }
            PurchaseType purchaseType = arrayList.get(i);
            if (wib0.m206573q(purchaseType) && m165582b(purchaseType, privilege)) {
                return purchaseType;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m165585e(Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f144630a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        yj90.m216399b(privilege, this.f144630a);
        if (d79.m114668a0()) {
            m165587g(purchaseType, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m165586f(final Privilege privilege, PurchaseType purchaseType) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f144630a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        yj90.m216399b(privilege, this.f144630a);
        ArrayList<PurchaseType> arrayListM130951q0 = gnp.m130951q0();
        if (jyb.m147479J(arrayListM130951q0)) {
            return;
        }
        final PurchaseType purchaseTypeM165583c = m165583c(privilege, purchaseType, arrayListM130951q0);
        if (purchaseTypeM165583c == null) {
            if (d79.m114668a0()) {
                m165587g(purchaseType, privilege);
                return;
            }
            return;
        }
        int iM129970d = ge90.m129970d(purchaseTypeM165583c, new j0p());
        if (iM129970d >= 0) {
            this.f144630a.m57536S4(iM129970d);
            if (d79.m114668a0()) {
                View view = this.f144630a.getView();
                if (view != null) {
                    view.postDelayed(new Runnable() { // from class: l.n190
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f139731a.m165587g(purchaseTypeM165583c, privilege);
                        }
                    }, 300L);
                } else {
                    m165587g(purchaseTypeM165583c, privilege);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m165587g(PurchaseType purchaseType, Privilege privilege) {
        IntlVipNewUiFrag intlVipNewUiFrag = this.f144630a;
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        String str = privilege == Privilege.premium_compliment ? "p_privileges_view,e_whisper_unlock_btn_click,click" : "p_privileges_view,e_ttc_subcription_privilege_description,click";
        if (wib0.m206573q(purchaseType)) {
            C8927c.m54687x0(this.f144630a.act(), str, privilege);
            return;
        }
        if (wib0.m206578v(purchaseType)) {
            C8927c.m54591L0(this.f144630a.act(), str, null, null, null, privilege);
        } else if (wib0.m206579w(purchaseType)) {
            C8927c.m54589K1(this.f144630a.act(), str, privilege, null, null);
        } else if (wib0.m206575s(purchaseType)) {
            C8927c.m54559A1(this.f144630a.act(), str);
        }
    }
}
