package p153l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class sk60 extends AbstractC19971s4 {
    /* JADX INFO: renamed from: A */
    private CharSequence m186402A(String str) {
        if (!"en".equals(Network.language())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, str.length(), 33);
        return spannableString;
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: i */
    public void mo114832i(lq60 lq60Var) {
        PurchaseType purchaseTypeM155323f = lq60Var.m155323f();
        PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        lq60Var.m155322e().m159475l((purchaseTypeM155323f == purchaseType && CoreModule.f18264c.f20381e0.m116600p9().isVIP() && joa.m146386f4()) ? m186402A(String.format(lq60Var.m155318a().string(R$string.f28462u1), Integer.valueOf(purchaseType.getPrivilegeData(null).size()))) : lq60Var.m155318a().getString(R$string.f28004G));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        C8928d.a aVarM184309f = m184309f();
        return NullChecker.m82486a(aVarM184309f) && TEnum.equals(aVarM184309f.m54762f(), ProductCategory.tttVip) && lq60Var.m155321d().m54714m() && lq60Var.m155321d().m54703b().m54788w() == 1 && m184313l() && CoreModule.m30933P().m143405a().mo34428U() && m184315n() && !m184314m();
    }
}
