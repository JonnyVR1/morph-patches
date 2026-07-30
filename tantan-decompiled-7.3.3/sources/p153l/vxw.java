package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import io.agora.rtc2.internal.AudioRoutingController;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class vxw {
    /* JADX INFO: renamed from: a */
    public static Intent m203889a(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
        for (ResolveInfo resolveInfo : uc60.m195383f(context, intent, 0)) {
            if ("com.android.vending".equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.addFlags(2097152);
                intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                intent.setComponent(componentName);
                return intent;
            }
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m203890b() {
        Iterator<ResolveInfo> it = k26.m147943a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + k26.m147943a().getPackageName())), 0).iterator();
        while (it.hasNext()) {
            if ("com.android.vending".equals(it.next().activityInfo.applicationInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}
