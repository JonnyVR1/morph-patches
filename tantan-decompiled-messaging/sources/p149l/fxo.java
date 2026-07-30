package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes9.dex */
public class fxo {
    /* JADX INFO: renamed from: a */
    public static IntlPrivilegeDescListItem.C8953b m123641a(Privilege privilege, PurchaseType purchaseType, boolean z) {
        String string;
        if (sab0.m182904v(purchaseType)) {
            wx80 wx80VarM114088b = dyo.m114088b(purchaseType, privilege);
            string = wx80VarM114088b.m205968t().toString();
            wx80VarM114088b.m205948d().toString();
        } else {
            wx80 wx80VarM123717m = fy80.m123717m(purchaseType, privilege);
            string = (privilege != Privilege.vip_super_like || ura.m195053e().m195057d().mo33734Oi()) ? wx80VarM123717m.m205968t().toString() : CoreModule.f17544b.getString(R$string.f18897rs, 5);
            wx80VarM123717m.m205965q().toString();
        }
        IntlPrivilegeDescListItem.C8953b c8953b = new IntlPrivilegeDescListItem.C8953b(string, privilege, purchaseType);
        c8953b.f37165f = z;
        return c8953b;
    }

    /* JADX INFO: renamed from: b */
    public static IntlPrivilegePolicyItem.C8955a m123642b(IntlVipNewUiFrag intlVipNewUiFrag, PurchaseType purchaseType, C8765d c8765d) {
        C8765d.a aVarM53522d;
        String string = intlVipNewUiFrag.getString(R$string.f18806os);
        int i = IntlCountryCodeController.m28115k() ? R$string.f17904L7 : R$string.f17762Gf;
        if (c8765d != null) {
            aVarM53522d = c8765d.m53522d() != null ? c8765d.m53522d() : c8765d.m53520b();
        } else {
            aVarM53522d = null;
        }
        int i2 = purchaseType != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE ? w0c0.f183795P0 : w0c0.f183786M0;
        if (aVarM53522d != null && CoreModule.f17545c.f19569G2.m105983k3(aVarM53522d.m53579f())) {
            i = R$string.f17792Hf;
            string = "";
        }
        return sab0.m182904v(purchaseType) ? new IntlPrivilegePolicyItem.C8955a("", rza.m181721A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, intlVipNewUiFrag.getString(R$string.f17852Jf), intlVipNewUiFrag.getString(R$string.f17822If)), w0c0.f183824Z, intlVipNewUiFrag.getString(R$string.f17852Jf), juk.m143328j(), intlVipNewUiFrag.getString(R$string.f17822If), juk.m143327i()), purchaseType) : new IntlPrivilegePolicyItem.C8955a(string, rza.m181721A0(intlVipNewUiFrag.act(), intlVipNewUiFrag.getString(i, intlVipNewUiFrag.getString(R$string.f17772Gp), intlVipNewUiFrag.getString(R$string.f18429ck)), i2, intlVipNewUiFrag.getString(R$string.f17772Gp), juk.m143328j(), intlVipNewUiFrag.getString(R$string.f18429ck), juk.m143327i()), purchaseType);
    }

    /* JADX INFO: renamed from: c */
    public static IntlPrivilegeSubscriptionItem.C8956a m123643c(PurchaseType purchaseType) {
        return new IntlPrivilegeSubscriptionItem.C8956a(CoreModule.f17544b.getString(R$string.f17846J9), CoreModule.f17544b.getString(R$string.f17816I9), purchaseType);
    }
}
