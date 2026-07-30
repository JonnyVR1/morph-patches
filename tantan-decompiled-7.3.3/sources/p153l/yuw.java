package p153l;

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
public final class yuw {
    /* JADX INFO: renamed from: a */
    private static void m217474a(Context context) {
        String str = context.getApplicationInfo().className;
        if (str == null || str.isEmpty()) {
            Logger.m5923i("Unable to determine Application Class");
        } else if (str.equals("com.clevertap.android.sdk.Application")) {
            Logger.m5923i("AndroidManifest.xml uses the CleverTap Application class, be sure you have properly added the CleverTap Account ID and Token to your AndroidManifest.xml, \nor set them programmatically in the onCreate method of your custom application class prior to calling super.onCreate()");
        } else {
            Logger.m5923i("Application Class is ".concat(str));
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m217475b(Context context, cob0 cob0Var) {
        try {
            m217479f((Application) context.getApplicationContext(), CTPushNotificationReceiver.class.getName());
            m217480g((Application) context.getApplicationContext(), CTNotificationIntentService.class.getName());
            m217478e((Application) context.getApplicationContext(), InAppNotificationActivity.class);
            m217478e((Application) context.getApplicationContext(), CTInboxActivity.class);
            m217479f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceReceiver");
            m217479f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTLocationUpdateReceiver");
            m217479f((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceBootReceiver");
        } catch (Exception e) {
            Logger.m5927v("Receiver/Service issue : " + e.toString());
        }
        ArrayList<kob0> arrayListM111631x = cob0Var.m111631x();
        if (arrayListM111631x == null) {
            return;
        }
        Iterator<kob0> it = arrayListM111631x.iterator();
        while (it.hasNext()) {
            if (it.next() == gmb0.f104964a) {
                try {
                    m217480g((Application) context.getApplicationContext(), "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService");
                } catch (Error e2) {
                    Logger.m5927v("FATAL : " + e2.getMessage());
                } catch (Exception e3) {
                    Logger.m5927v("Receiver/Service issue : " + e3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static void m217476c(uzd uzdVar) {
        Logger.m5923i("SDK Version Code is " + uzdVar.m198774V());
    }

    /* JADX INFO: renamed from: d */
    public static void m217477d(Context context, uzd uzdVar, cob0 cob0Var) {
        if (!Utils.m5977t(context, "android.permission.INTERNET")) {
            Logger.m5919d("Missing Permission: android.permission.INTERNET");
        }
        m217476c(uzdVar);
        m217481h(context);
        m217475b(context, cob0Var);
        if (TextUtils.isEmpty(ManifestInfo.getInstance(context).m5941j())) {
            return;
        }
        Logger.m5923i("We have noticed that your app is using a custom FCM Sender ID, this feature will be DISCONTINUED from the next version of the CleverTap Android SDK. With the next release, CleverTap Android SDK will only fetch the token using the google-services.json. Please reach out to CleverTap Support for any questions.");
    }

    /* JADX INFO: renamed from: e */
    private static void m217478e(Application application, Class cls) throws PackageManager.NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (activityInfo.name.equals(name)) {
                Logger.m5923i(name.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        Logger.m5923i(name.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    /* JADX INFO: renamed from: f */
    private static void m217479f(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ActivityInfo activityInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers) {
            if (activityInfo.name.equals(str)) {
                Logger.m5923i(str.replaceFirst("com.clevertap.android.", "") + " is present");
                return;
            }
        }
        Logger.m5923i(str.replaceFirst("com.clevertap.android.", "") + " not present");
    }

    /* JADX INFO: renamed from: g */
    private static void m217480g(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ServiceInfo serviceInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services) {
            if (serviceInfo.name.equals(str)) {
                Logger.m5923i(str.replaceFirst("com.clevertap.android.sdk.", "") + " is present");
                return;
            }
        }
        Logger.m5923i(str.replaceFirst("com.clevertap.android.sdk.", "") + " not present");
    }

    /* JADX INFO: renamed from: h */
    private static void m217481h(Context context) {
        if (b50.f75008a || CleverTapAPI.m5816W()) {
            return;
        }
        Logger.m5923i("Activity Lifecycle Callback not registered. Either set the android:name in your AndroidManifest.xml application tag to com.clevertap.android.sdk.Application, \n or, if you have a custom Application class, call ActivityLifecycleCallback.register(this); before super.onCreate() in your class");
        m217474a(context);
    }
}
