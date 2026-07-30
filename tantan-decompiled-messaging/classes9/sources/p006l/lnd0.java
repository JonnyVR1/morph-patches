package p006l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lnd0 extends AbstractC1333u4 {
    /* JADX INFO: renamed from: A */
    public CharSequence m18892A(String str) {
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
        gi60Var.m15804e().m16229l(m18892A(String.format(m24943c().string(R.string.u1), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData((Gender) null).size()))));
    }

    @Override // p006l.AbstractC1333u4
    /* JADX INFO: renamed from: u */
    public boolean mo11679u(gi60 gi60Var) {
        return gi60Var.m15805f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f1534c.f3628e0.m21490p9().isVIP() && xma.m27379e4();
    }
}
