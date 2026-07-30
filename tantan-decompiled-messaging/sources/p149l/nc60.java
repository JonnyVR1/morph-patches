package p149l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class nc60 extends AbstractC20353u4 {
    /* JADX INFO: renamed from: A */
    private CharSequence m158926A(String str) {
        if (!"en".equals(Network.language())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, str.length(), 33);
        return spannableString;
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: i */
    public void mo94417i(gi60 gi60Var) {
        PurchaseType purchaseTypeM126261f = gi60Var.m126261f();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        gi60Var.m126260e().m131223l((purchaseTypeM126261f == purchaseType && CoreModule.f17545c.f19639e0.m169527p9().isVIP() && xma.m210071e4()) ? m158926A(String.format(gi60Var.m126256a().string(R$string.f27614u1), Integer.valueOf(purchaseType.getPrivilegeData(null).size()))) : gi60Var.m126256a().getString(R$string.f27156G));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        C8765d.a aVarM191648f = m191648f();
        return NullChecker.m81303a(aVarM191648f) && TEnum.equals(aVarM191648f.m53579f(), ProductCategory.tttVip) && gi60Var.m126259d().m53531m() && gi60Var.m126259d().m53520b().m53605w() == 1 && m191652l() && CoreModule.m29935P().m94651a().mo33425U() && m191654n() && !m191653m();
    }
}
