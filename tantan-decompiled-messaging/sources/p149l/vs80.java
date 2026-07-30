package p149l;

import androidx.annotation.StringRes;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantan.core.base.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class vs80 {
    /* JADX INFO: renamed from: a */
    public static String m199852a(@StringRes int i, Object... objArr) {
        return vwb.m200297K(objArr) ? CoreModule.f17544b.getString(i) : CoreModule.f17544b.getString(i, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m199853b(PurchaseType purchaseType) {
        if (sab0.m182891i(purchaseType)) {
            return "解锁黑金会员";
        }
        return sab0.m182897o(purchaseType) ? "解锁白金会员" : CoreModule.f17544b.getString(R$string.f55763O);
    }
}
