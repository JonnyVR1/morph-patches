package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class wuw {
    /* JADX INFO: renamed from: a */
    public static Intent m205682a(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName));
        for (ResolveInfo resolveInfo : o460.m162553f(context, intent, 0)) {
            if ("com.android.vending".equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addFlags(268435456);
                intent.addFlags(2097152);
                intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                intent.setComponent(componentName);
                return intent;
            }
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m205683b() {
        Iterator<ResolveInfo> it = f16.m119092a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + f16.m119092a().getPackageName())), 0).iterator();
        while (it.hasNext()) {
            if ("com.android.vending".equals(it.next().activityInfo.applicationInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}
