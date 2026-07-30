package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import l.fy80;
import l.juk;
import l.rza;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fxo {
    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C0389b m15509a(Privilege privilege, PurchaseType purchaseType, boolean z) {
        String string;
        if (sab0.v(purchaseType)) {
            wx80 wx80VarM14315b = dyo.m14315b(purchaseType, privilege);
            string = wx80VarM14315b.m26849t().toString();
            wx80VarM14315b.m26829d().toString();
        } else {
            wx80 wx80VarM = fy80.m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || ura.m25555e().m25559d().m5671Oi()) ? wx80VarM.m26849t().toString() : CoreModule.f1533b.getString(R$string.f2886rs, 5);
            wx80VarM.m26846q().toString();
        }
        IntlPrivilegeDescListItem.C0389b c0389b = new IntlPrivilegeDescListItem.C0389b(string, privilege, purchaseType);
        c0389b.f6946f = z;
        return c0389b;
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C0391a m15510b(IntlVipNewUiFrag intlVipNewUiFrag, PurchaseType purchaseType, d dVar) {
        d.a aVarD;
        String string = intlVipNewUiFrag.getString(R$string.f2795os);
        int i = IntlCountryCodeController.m10k() ? R$string.f1893L7 : R$string.f1751Gf;
        if (dVar != null) {
            aVarD = dVar.d() != null ? dVar.d() : dVar.b();
        } else {
            aVarD = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f24635P0 : w0c0.f24626M0;
        if (aVarD != null && CoreModule.f1534c.f3558G2.m13328k3(aVarD.f())) {
            i = R$string.f1781Hf;
            string = "";
        }
        return sab0.v(purchaseType) ? new IntlPrivilegePolicyItem.C0391a("", rza.A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, new Object[]{intlVipNewUiFrag.getString(R$string.f1841Jf), intlVipNewUiFrag.getString(R$string.f1811If)}), w0c0.f24664Z, new String[]{intlVipNewUiFrag.getString(R$string.f1841Jf), juk.j(), intlVipNewUiFrag.getString(R$string.f1811If), juk.i()}), purchaseType) : new IntlPrivilegePolicyItem.C0391a(string, rza.A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, new Object[]{intlVipNewUiFrag.getString(R$string.f1761Gp), intlVipNewUiFrag.getString(R$string.f2418ck)}), i2, new String[]{intlVipNewUiFrag.getString(R$string.f1761Gp), juk.j(), intlVipNewUiFrag.getString(R$string.f2418ck), juk.i()}), purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static IntlPrivilegeSubscriptionItem.C0392a m15511c(PurchaseType purchaseType) {
        return new IntlPrivilegeSubscriptionItem.C0392a(CoreModule.f1533b.getString(R$string.f1835J9), CoreModule.f1533b.getString(R$string.f1805I9), purchaseType);
    }
}
