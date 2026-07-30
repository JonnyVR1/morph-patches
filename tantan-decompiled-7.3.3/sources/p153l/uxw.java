package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public final class uxw extends vxw {
    /* JADX INFO: renamed from: b */
    public static boolean m198546b() {
        return vxw.m203890b();
    }

    /* JADX INFO: renamed from: c */
    public static Intent m198547c(Context context) {
        if (TextUtils.isEmpty(ka5.f124624a)) {
            return vxw.m203889a(context);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(ka5.f124624a));
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            return intent;
        } catch (Exception unused) {
            return vxw.m203889a(context);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m198548d(Activity activity) {
        Intent intentM198547c = m198547c(activity);
        if (intentM198547c != null) {
            activity.startActivity(intentM198547c);
        }
    }
}
