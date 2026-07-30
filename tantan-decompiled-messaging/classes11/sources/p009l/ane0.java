package p009l;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import com.p1.mobile.putong.common.R;
import l.bne0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ane0 extends bne0 {

    /* JADX INFO: renamed from: d */
    public static final boolean f9584d;

    static {
        f9584d = Build.VERSION.SDK_INT >= 34;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m11525v() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || !(str.toLowerCase().contains("huawei") || str.toLowerCase().contains("honor") || str.toLowerCase().contains("hw"))) {
            return bne0.f();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m11526w() {
        return bne0.l();
    }

    /* JADX INFO: renamed from: x */
    public static void m11527x(Activity activity) {
        bne0.n(activity, activity.getString(R.string.m2));
    }
}
