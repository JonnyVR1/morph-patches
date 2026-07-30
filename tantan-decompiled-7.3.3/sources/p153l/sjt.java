package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;

/* JADX INFO: loaded from: classes4.dex */
public class sjt {
    /* JADX INFO: renamed from: a */
    public static boolean m186307a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Uri.parse(str).getBooleanQueryParameter(str2, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m186308b(gae0 gae0Var, UserRightType userRightType) {
        zrv.f205799a.m207704y(gae0Var, userRightType);
    }
}
