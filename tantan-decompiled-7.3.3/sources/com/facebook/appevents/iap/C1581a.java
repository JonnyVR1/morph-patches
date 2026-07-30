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
import com.facebook.C1600c;
import com.facebook.appevents.iap.C1581a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.bsm;
import p153l.vj1;

/* JADX INFO: renamed from: com.facebook.appevents.iap.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m88121d2 = {"Lcom/facebook/appevents/iap/a;", "", "<init>", "()V", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "", "g", "(Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)V", "e", "h", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "purchases", "", "isSubscription", "f", "(Landroid/content/Context;Ljava/util/ArrayList;Z)V", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "c", "Ljava/lang/Boolean;", "hasBillingService", Constants.INAPP_DATA_TAG, "hasBillingActivity", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callbacks", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "Ljava/lang/Object;", "inAppBillingObj", RXScreenCaptureService.KEY_INDEX, "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1581a {

    @NotNull
    public static final C1581a INSTANCE = new C1581a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1581a.class.getCanonicalName();

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
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/facebook/appevents/iap/a$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", AuthenticationTokenClaims.JSON_KEY_NAME, "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName name, @NotNull IBinder service) {
            name.getClass();
            service.getClass();
            C1581a c1581a = C1581a.INSTANCE;
            C1581a.inAppBillingObj = bsm.m106293a(C1600c.m8101l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName name) {
            name.getClass();
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.iap.a$b */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, m88121d2 = {"com/facebook/appevents/iap/a$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "onActivityResumed", "(Landroid/app/Activity;)V", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class b implements Application.ActivityLifecycleCallbacks {
        /* JADX INFO: renamed from: a */
        public static void m7882a() {
            Context contextM8101l = C1600c.m8101l();
            ArrayList<String> arrayListM106296i = bsm.m106296i(contextM8101l, C1581a.inAppBillingObj);
            if (arrayListM106296i.isEmpty()) {
                arrayListM106296i = bsm.m106295g(contextM8101l, C1581a.inAppBillingObj);
            }
            C1581a.INSTANCE.m7880f(contextM8101l, arrayListM106296i, false);
        }

        /* JADX INFO: renamed from: b */
        public static void m7883b() {
            Context contextM8101l = C1600c.m8101l();
            ArrayList<String> arrayListM106296i = bsm.m106296i(contextM8101l, C1581a.inAppBillingObj);
            C1581a c1581a = C1581a.INSTANCE;
            c1581a.m7880f(contextM8101l, arrayListM106296i, false);
            c1581a.m7880f(contextM8101l, bsm.m106297j(contextM8101l, C1581a.inAppBillingObj), true);
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
                C1600c.m8110u().execute(new Runnable() { // from class: l.srm
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1581a.b.m7883b();
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
                if (Intrinsics.m88377d(C1581a.hasBillingActivity, Boolean.TRUE) && Intrinsics.m88377d(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    C1600c.m8110u().execute(new Runnable() { // from class: l.rrm
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1581a.b.m7882a();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7878g(@NotNull InAppPurchaseUtils.BillingClientVersion billingClientVersion2) {
        billingClientVersion2.getClass();
        C1581a c1581a = INSTANCE;
        c1581a.m7879e();
        if (!Intrinsics.m88377d(hasBillingService, Boolean.FALSE) && vj1.m201431g()) {
            billingClientVersion = billingClientVersion2;
            c1581a.m7881h();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7879e() {
        if (hasBillingService != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(InAppPurchaseUtils.m7869a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        hasBillingService = boolValueOf;
        if (Intrinsics.m88377d(boolValueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(InAppPurchaseUtils.m7869a("com.android.billingclient.api.ProxyBillingActivity") != null);
        bsm.m106294b();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        intent2.getClass();
        intent = intent2;
        serviceConnection = new a();
        callbacks = new b();
    }

    /* JADX INFO: renamed from: f */
    public final void m7880f(Context context, ArrayList<String> purchases, boolean isSubscription) {
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
        for (Map.Entry<String, String> entry : bsm.m106298k(context, arrayList, inAppBillingObj, isSubscription).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str2 = (String) map.get(key);
            if (str2 != null) {
                vj1.m201435k(str2, value, isSubscription, billingClientVersion, false, 16, null);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7881h() {
        if (isTracking.compareAndSet(false, true)) {
            Context contextM8101l = C1600c.m8101l();
            if (contextM8101l instanceof Application) {
                Application application = (Application) contextM8101l;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                ServiceConnection serviceConnection2 = null;
                if (activityLifecycleCallbacks == null) {
                    Intrinsics.m88391r("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    Intrinsics.m88391r("intent");
                    intent2 = null;
                }
                ServiceConnection serviceConnection3 = serviceConnection;
                if (serviceConnection3 == null) {
                    Intrinsics.m88391r("serviceConnection");
                } else {
                    serviceConnection2 = serviceConnection3;
                }
                contextM8101l.bindService(intent2, serviceConnection2, 1);
            }
        }
    }
}
