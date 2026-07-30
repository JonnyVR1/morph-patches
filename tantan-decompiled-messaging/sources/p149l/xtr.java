package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class xtr {
    /* JADX INFO: renamed from: a */
    public static String m211021a(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            return w8u.m202217t(R$string.f44153b0);
        }
        String str = ((TantanException.Client.CoreService) th).metaMessage;
        return !TextUtils.isEmpty(str) ? str : w8u.m202217t(R$string.f44153b0);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m211022b(int i, Throwable th) {
        return (th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == i;
    }

    /* JADX INFO: renamed from: c */
    public static void m211023c(Throwable th) {
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151593w(R$string.f44153b0);
            return;
        }
        String str = ((TantanException.Client.CoreService) th).metaMessage;
        if (TextUtils.isEmpty(str)) {
            lsi0.m151593w(R$string.f44153b0);
        } else {
            lsi0.m151595y(str);
        }
    }
}
