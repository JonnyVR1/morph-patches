package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class vuw extends wuw {
    /* JADX INFO: renamed from: b */
    public static boolean m200136b() {
        return wuw.m205683b();
    }

    /* JADX INFO: renamed from: c */
    public static Intent m200137c(Context context) {
        if (TextUtils.isEmpty(j95.f116861a)) {
            return wuw.m205682a(context);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(j95.f116861a));
            intent.setFlags(268435456);
            return intent;
        } catch (Exception unused) {
            return wuw.m205682a(context);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m200138d(Activity activity) {
        Intent intentM200137c = m200137c(activity);
        if (intentM200137c != null) {
            activity.startActivity(intentM200137c);
        }
    }
}
