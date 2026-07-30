package p006l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nc60 extends AbstractC1333u4 {
    /* JADX INFO: renamed from: A */
    private CharSequence m20047A(String str) {
        if (!"en".equals(Network.language())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, str.length(), 33);
        return spannableString;
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: i */
    public void mo11677i(gi60 gi60Var) {
        PurchaseType purchaseTypeM15805f = gi60Var.m15805f();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        gi60Var.m15804e().m16229l((purchaseTypeM15805f == purchaseType && CoreModule.f1534c.f3628e0.m21490p9().isVIP() && xma.m27379e4()) ? m20047A(String.format(gi60Var.m15800a().string(R.string.u1), Integer.valueOf(purchaseType.getPrivilegeData((Gender) null).size()))) : gi60Var.m15800a().getString(R.string.G));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        d.a aVarM24946f = m24946f();
        return NullChecker.a(aVarM24946f) && TEnum.equals(aVarM24946f.f(), "tttVip") && gi60Var.m15803d().m() && gi60Var.m15803d().b().w() == 1 && m24950l() && CoreModule.m1854P().m11706a().m5362U() && m24952n() && !m24951m();
    }
}
