package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class yvr {
    /* JADX INFO: renamed from: a */
    public static String m217555a(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            return xau.m209910t(R$string.f45001b0);
        }
        String str = ((TantanException.Client.CoreService) th).metaMessage;
        return !TextUtils.isEmpty(str) ? str : xau.m209910t(R$string.f45001b0);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m217556b(int i, Throwable th) {
        return (th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == i;
    }

    /* JADX INFO: renamed from: c */
    public static void m217557c(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165649w(R$string.f45001b0);
            return;
        }
        String str = ((TantanException.Client.CoreService) th).metaMessage;
        if (TextUtils.isEmpty(str)) {
            o1j0.m165649w(R$string.f45001b0);
        } else {
            o1j0.m165651y(str);
        }
    }
}
