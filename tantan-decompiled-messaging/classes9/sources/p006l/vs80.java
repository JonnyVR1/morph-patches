package p006l;

import androidx.annotation.StringRes;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantan.core.base.R;
import l.sab0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class vs80 {
    /* JADX INFO: renamed from: a */
    public static String m25864a(@StringRes int i, Object... objArr) {
        return vwb.K(objArr) ? CoreModule.f1533b.getString(i) : CoreModule.f1533b.getString(i, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m25865b(PurchaseType purchaseType) {
        if (sab0.i(purchaseType)) {
            return "解锁黑金会员";
        }
        return sab0.o(purchaseType) ? "解锁白金会员" : CoreModule.f1533b.getString(R.string.O);
    }
}
