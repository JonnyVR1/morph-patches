package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes12.dex */
public class fzo {
    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C9116b m128197a(Privilege privilege, PurchaseType purchaseType, boolean z) {
        String string;
        if (wib0.m206578v(purchaseType)) {
            a690 a690VarM113420b = d0p.m113420b(purchaseType, privilege);
            string = a690VarM113420b.m96314t().toString();
            a690VarM113420b.m96294d().toString();
        } else {
            a690 a690VarM143621m = j690.m143621m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || gta.m132210e().m132214d().mo34737Oi()) ? a690VarM143621m.m96314t().toString() : CoreModule.f18263b.getString(R$string.f18715Ns, 5);
            a690VarM143621m.m96311q().toString();
        }
        IntlPrivilegeDescListItem.C9116b c9116b = new IntlPrivilegeDescListItem.C9116b(string, privilege, purchaseType);
        c9116b.f38013f = z;
        return c9116b;
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C9118a m128198b(IntlVipNewUiFrag intlVipNewUiFrag, PurchaseType purchaseType, C8928d c8928d) {
        C8928d.a aVarM54705d;
        String string = intlVipNewUiFrag.getString(R$string.f18624Ks);
        int i = IntlCountryCodeController.m29114k() ? R$string.f18694N7 : R$string.f19032Yf;
        if (c8928d != null) {
            aVarM54705d = c8928d.m54705d() != null ? c8928d.m54705d() : c8928d.m54703b();
        } else {
            aVarM54705d = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? c9c0.f80367Q0 : c9c0.f80358N0;
        if (aVarM54705d != null && CoreModule.f18264c.f20311G2.m153653k3(aVarM54705d.m54762f())) {
            i = R$string.f19062Zf;
            string = "";
        }
        return wib0.m206578v(purchaseType) ? new IntlPrivilegePolicyItem.C9118a("", e1b.m118943A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, intlVipNewUiFrag.getString(R$string.f19124bg), intlVipNewUiFrag.getString(R$string.f19093ag)), c9c0.f80397a0, intlVipNewUiFrag.getString(R$string.f19124bg), zwk.m221910j(), intlVipNewUiFrag.getString(R$string.f19093ag), zwk.m221909i()), purchaseType) : new IntlPrivilegePolicyItem.C9118a(string, e1b.m118943A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, intlVipNewUiFrag.getString(R$string.f19134bq), intlVipNewUiFrag.getString(R$string.f19838yk)), i2, intlVipNewUiFrag.getString(R$string.f19134bq), zwk.m221910j(), intlVipNewUiFrag.getString(R$string.f19838yk), zwk.m221909i()), purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static IntlPrivilegeSubscriptionItem.C9119a m128199c(PurchaseType purchaseType) {
        return new IntlPrivilegeSubscriptionItem.C9119a(CoreModule.f18263b.getString(R$string.f18876T9), CoreModule.f18263b.getString(R$string.f18846S9), purchaseType);
    }
}
