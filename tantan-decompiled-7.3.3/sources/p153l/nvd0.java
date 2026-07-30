package p153l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class nvd0 extends AbstractC19971s4 {
    /* JADX INFO: renamed from: A */
    public CharSequence m164872A(String str) {
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
        lq60Var.m155322e().m159475l(m164872A(String.format(m184306c().string(R$string.f28462u1), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size()))));
    }

    @Override // p153l.AbstractC19971s4
    /* JADX INFO: renamed from: u */
    public boolean mo114834u(lq60 lq60Var) {
        return lq60Var.m155323f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f18264c.f20381e0.m116600p9().isVIP() && joa.m146386f4();
    }
}
