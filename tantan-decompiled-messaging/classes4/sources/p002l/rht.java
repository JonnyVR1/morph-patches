package p002l;

import android.net.Uri;
import android.text.TextUtils;
import com.p1.mobile.putong.live.base.bean.UserRightType;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rht {
    /* JADX INFO: renamed from: a */
    public static boolean m21994a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Uri.parse(str).getBooleanQueryParameter(str2, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m21995b(c2e0 c2e0Var, UserRightType userRightType) {
        ypv.a.y(c2e0Var, userRightType);
    }
}
