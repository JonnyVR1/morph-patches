package p153l;

import androidx.annotation.StringRes;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantan.core.base.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class z090 {
    /* JADX INFO: renamed from: a */
    public static String m218106a(@StringRes int i, Object... objArr) {
        return jyb.m147480K(objArr) ? CoreModule.f18263b.getString(i) : CoreModule.f18263b.getString(i, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m218107b(PurchaseType purchaseType) {
        if (wib0.m206565i(purchaseType)) {
            return "解锁黑金会员";
        }
        return wib0.m206571o(purchaseType) ? "解锁白金会员" : CoreModule.f18263b.getString(R$string.f56611O);
    }
}
