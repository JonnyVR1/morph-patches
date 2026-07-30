package p009l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import l.j95;
import l.wuw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class vuw extends wuw {
    /* JADX INFO: renamed from: b */
    public static boolean m23735b() {
        return wuw.b();
    }

    /* JADX INFO: renamed from: c */
    public static Intent m23736c(Context context) {
        if (TextUtils.isEmpty(j95.a)) {
            return wuw.a(context);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(j95.a));
            intent.setFlags(268435456);
            return intent;
        } catch (Exception unused) {
            return wuw.a(context);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m23737d(Activity activity) {
        Intent intentM23736c = m23736c(activity);
        if (intentM23736c != null) {
            activity.startActivity(intentM23736c);
        }
    }
}
