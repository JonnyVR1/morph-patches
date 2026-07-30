package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;

/* JADX INFO: loaded from: classes4.dex */
public class rht {
    /* JADX INFO: renamed from: a */
    public static boolean m179462a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Uri.parse(str).getBooleanQueryParameter(str2, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m179463b(c2e0 c2e0Var, UserRightType userRightType) {
        ypv.f199493a.m199382y(c2e0Var, userRightType);
    }
}
