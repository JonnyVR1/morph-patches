package p149l;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class lnd0 extends AbstractC20353u4 {
    /* JADX INFO: renamed from: A */
    public CharSequence m150669A(String str) {
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
        gi60Var.m126260e().m131223l(m150669A(String.format(m191645c().string(R$string.f27614u1), Integer.valueOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.getPrivilegeData(null).size()))));
    }

    @Override // p149l.AbstractC20353u4
    /* JADX INFO: renamed from: u */
    public boolean mo94419u(gi60 gi60Var) {
        return gi60Var.m126261f() == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && CoreModule.f17545c.f19639e0.m169527p9().isVIP() && xma.m210071e4();
    }
}
