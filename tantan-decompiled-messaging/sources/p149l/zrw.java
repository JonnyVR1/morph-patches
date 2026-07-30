package p149l;

import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inbox.CTInboxActivity;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.clevertap.android.sdk.pushnotification.CTPushNotificationReceiver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zrw {
    /* JADX INFO: renamed from: a */
    private static void m219983a(Context context) {
        String str = context.getApplicationInfo().className;
        if (str == null || str.isEmpty()) {
            Logger.m5869i("Unable to determine Application Class");
        } else if (str.equals("com.clevertap.android.sdk.Application")) {
            Logger.m5869i("AndroidManifest.xml uses the CleverTap Application class, be sure you have properly added the CleverTap Account ID and Token to your AndroidManifest.xml, \nor set them programmatically in the onCreate method of your custom application class prior to calling super.onCreate()");
        } else {
            Logger.m5869i("Application Class is ".concat(str));
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m219984b(Context context, yfb0 yfb0Var) {
        try {
            m219988f((Application) context.getApplicationContext(), CTPushNotificationReceiver.class.getName());
            m219989g((Application) context.getApplicationContext(), CTNotificationIntentService.class.getName());
            m219987e((Application) context.getApplicationContext(), InAppNotificationActivity.class);
            m219987e((Application) context.getApplicationContext(), CTInboxActivity.class);
            m219988f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceReceiver");
            m219988f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTLocationUpdateReceiver");
            m219988f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceBootReceiver");
        } catch (Exception e) {
            Logger.m5873v("Receiver/Service issue : " + e.toString());
        }
        ArrayList<ggb0> arrayListM214542x = yfb0Var.m214542x();
        if (arrayListM214542x == null) {
            return;
        }
        Iterator<ggb0> it = arrayListM214542x.iterator();
        while (it.hasNext()) {
            if (it.next() == ceb0.f80450a) {
                try {
                    m219989g((Application) context.getApplicationContext(), "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService");
                } catch (Error e2) {
                    Logger.m5873v("FATAL : " + e2.getMessage());
                } catch (Exception e3) {
                    Logger.m5873v("Receiver/Service issue : " + e3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m219985c(hyd hydVar) {
        Logger.m5869i("SDK Version Code is " + hydVar.m133551V());
    }

    /* JADX INFO: renamed from: d */
    public static void m219986d(Context context, hyd hydVar, yfb0 yfb0Var) {
        if (!Utils.m5923t(context, "android.permission.INTERNET")) {
            Logger.m5865d("Missing Permission: android.permission.INTERNET");
        }
        m219985c(hydVar);
        m219990h(context);
        m219984b(context, yfb0Var);
        if (TextUtils.isEmpty(ManifestInfo.getInstance(context).m5887j())) {
            return;
        }
        Logger.m5869i("We have noticed that your app is using a custom FCM Sender ID, this feature will be DISCONTINUED from the next version of the CleverTap Android SDK. With the next release, CleverTap Android SDK will only fetch the token using the google-services.json. Please reach out to CleverTap Support for any questions.");
    }

    /* JADX INFO: renamed from: e */
    private static void m219987e(Application application, Class cls) throws PackageManager.NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (activityInfo.name.equals(name)) {
                Logger.m5869i(name.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        Logger.m5869i(name.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    /* JADX INFO: renamed from: f */
    private static void m219988f(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ActivityInfo activityInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers) {
            if (activityInfo.name.equals(str)) {
                Logger.m5869i(str.replaceFirst("com.clevertap.android.", "") + " is present");
                return;
            }
        }
        Logger.m5869i(str.replaceFirst("com.clevertap.android.", "") + " not present");
    }

    /* JADX INFO: renamed from: g */
    private static void m219989g(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ServiceInfo serviceInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services) {
            if (serviceInfo.name.equals(str)) {
                Logger.m5869i(str.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        Logger.m5869i(str.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    /* JADX INFO: renamed from: h */
    private static void m219990h(Context context) {
        if (g50.f100597a || CleverTapAPI.m5762W()) {
            return;
        }
        Logger.m5869i("Activity Lifecycle Callback not registered. Either set the android:name in your AndroidManifest.xml application tag to com.clevertap.android.sdk.Application, \n or, if you have a custom Application class, call ActivityLifecycleCallback.register(this); before super.onCreate() in your class");
        m219983a(context);
    }
}
