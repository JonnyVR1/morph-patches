package com.facebook.appevents.iap;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1577c;
import com.facebook.appevents.iap.C1558a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.oj1;
import p149l.zpm;

/* JADX INFO: renamed from: com.facebook.appevents.iap.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m87232d2 = {"Lcom/facebook/appevents/iap/a;", "", "<init>", "()V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "g", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "e", "h", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "purchases", "", "isSubscription", "f", "(Landroid/content/Context;Ljava/util/ArrayList;Z)V", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "c", "Ljava/lang/Boolean;", "hasBillingService", Constants.INAPP_DATA_TAG, "hasBillingActivity", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callbacks", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Ljava/lang/Object;", "inAppBillingObj", RXScreenCaptureService.KEY_INDEX, "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1558a {

    @NotNull
    public static final C1558a INSTANCE = new C1558a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1558a.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isTracking = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Boolean hasBillingService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Boolean hasBillingActivity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static Application.ActivityLifecycleCallbacks callbacks;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static Intent intent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static Object inAppBillingObj;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static InAppPurchaseUtils.BillingClientVersion billingClientVersion;

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$a */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/facebook/appevents/iap/a$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            name.getClass();
            service.getClass();
            C1558a c1558a = C1558a.INSTANCE;
            C1558a.inAppBillingObj = zpm.m219678a(C1577c.m8047l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            name.getClass();
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m87232d2 = {"com/facebook/appevents/iap/a$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class b implements Application.ActivityLifecycleCallbacks {
        /* JADX INFO: renamed from: a */
        public static void m7828a() {
            Context contextM8047l = C1577c.m8047l();
            ArrayList<String> arrayListM219681i = zpm.m219681i(contextM8047l, C1558a.inAppBillingObj);
            if (arrayListM219681i.isEmpty()) {
                arrayListM219681i = zpm.m219680g(contextM8047l, C1558a.inAppBillingObj);
            }
            C1558a.INSTANCE.m7826f(contextM8047l, arrayListM219681i, false);
        }

        /* JADX INFO: renamed from: b */
        public static void m7829b() {
            Context contextM8047l = C1577c.m8047l();
            ArrayList<String> arrayListM219681i = zpm.m219681i(contextM8047l, C1558a.inAppBillingObj);
            C1558a c1558a = C1558a.INSTANCE;
            c1558a.m7826f(contextM8047l, arrayListM219681i, false);
            c1558a.m7826f(contextM8047l, zpm.m219682j(contextM8047l, C1558a.inAppBillingObj), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            activity.getClass();
            try {
                C1577c.m8056u().execute(new Runnable() { // from class: l.qpm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1558a.b.m7829b();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            activity.getClass();
            outState.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            activity.getClass();
            try {
                if (Intrinsics.m87488d(C1558a.hasBillingActivity, Boolean.TRUE) && Intrinsics.m87488d(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C1577c.m8056u().execute(new Runnable() { // from class: l.ppm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1558a.b.m7828a();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7824g(@NotNull InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        billingClientVersion2.getClass();
        C1558a c1558a = INSTANCE;
        c1558a.m7825e();
        if (!Intrinsics.m87488d(hasBillingService, Boolean.FALSE) && oj1.m164591g()) {
            billingClientVersion = billingClientVersion2;
            c1558a.m7827h();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7825e() {
        if (hasBillingService != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(InAppPurchaseUtils.m7815a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        hasBillingService = boolValueOf;
        if (Intrinsics.m87488d(boolValueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(InAppPurchaseUtils.m7815a("com.android.billingclient.api.ProxyBillingActivity") != null);
        zpm.m219679b();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        intent2.getClass();
        intent = intent2;
        serviceConnection = new a();
        callbacks = new b();
    }

    /* JADX INFO: renamed from: f */
    public final void m7826f(Context context, ArrayList<String> purchases, boolean isSubscription) {
        if (purchases.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : purchases) {
            try {
                String string = new JSONObject(str).getString("productId");
                string.getClass();
                str.getClass();
                map.put(string, str);
                arrayList.add(string);
            } catch (JSONException e) {
                Log.e(TAG, "Error parsing in-app purchase data.", e);
            }
        }
        for (Map.Entry<String, String> entry : zpm.m219683k(context, arrayList, inAppBillingObj, isSubscription).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str2 = (String) map.get(key);
            if (str2 != null) {
                oj1.m164595k(str2, value, isSubscription, billingClientVersion, false, 16, null);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7827h() {
        if (isTracking.compareAndSet(false, true)) {
            Context contextM8047l = C1577c.m8047l();
            if (contextM8047l instanceof Application) {
                Application application = (Application) contextM8047l;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                ServiceConnection serviceConnection2 = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.m87502r("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    Intrinsics.m87502r("intent");
                    intent2 = null;
                }
                ServiceConnection serviceConnection3 = serviceConnection;
                if (serviceConnection3 == null) {
                    Intrinsics.m87502r("serviceConnection");
                } else {
                    serviceConnection2 = serviceConnection3;
                }
                contextM8047l.bindService(intent2, serviceConnection2, 1);
            }
        }
    }
}
