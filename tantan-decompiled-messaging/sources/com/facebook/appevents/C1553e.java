package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.AccessToken;
import com.facebook.C1577c;
import com.facebook.C1663j;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C1553e;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.iap.C1564g;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.ondeviceprocessing.C1573a;
import com.facebook.internal.C1655c;
import com.facebook.internal.C1657e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p149l.a43;
import p149l.ark0;
import p149l.gd2;
import p149l.iwf0;
import p149l.lsb;
import p149l.n50;
import p149l.o060;
import p149l.oj1;
import p149l.opm;
import p149l.qkq0;
import p149l.the0;
import p149l.uxv;
import p149l.xum;
import p149l.yfw;
import p149l.ypm;

/* JADX INFO: renamed from: com.facebook.appevents.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 62\u00020\u0001:\u0001/B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J?\u0010#\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J+\u0010'\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(JA\u0010)\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b)\u0010*JI\u0010-\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, m87232d2 = {"Lcom/facebook/appevents/e;", "", "", "activityName", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "k", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "buttonText", "o", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lcom/facebook/appevents/g;", "operationalData", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "", "isImplicitlyLogged", "r", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;ZLcom/facebook/appevents/g;)V", "j", "()V", "p", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "q", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "Ljava/util/UUID;", "currentSessionId", "m", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;Lcom/facebook/appevents/g;)V", "a", "Ljava/lang/String;", "contextName", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "b", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1553e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f5994c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static ScheduledThreadPoolExecutor f5995d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static AppEventsLogger.FlushBehavior f5996e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Object f5997f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static String f5998g;

    /* JADX INFO: renamed from: h */
    public static boolean f5999h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static String f6000i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String contextName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AccessTokenAppIdPair accessTokenAppId;

    /* JADX INFO: renamed from: com.facebook.appevents.e$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u0003J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\tJ\u0019\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010!R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00109\u001a\u0002088\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00102R\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00102R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00102R\u0018\u0010>\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, m87232d2 = {"Lcom/facebook/appevents/e$a;", "", "<init>", "()V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "k", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "m", "()Ljava/lang/String;", "Landroid/app/Application;", "application", "applicationId", "", "f", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/os/Bundle;", CommandMessage.PARAMS, "Lcom/facebook/appevents/g;", "operationalData", "", "isImplicitlyLogged", "Lkotlin/Pair;", "g", "(Landroid/os/Bundle;Lcom/facebook/appevents/g;Z)Lkotlin/Pair;", "Landroid/content/Context;", "context", "n", "(Landroid/content/Context;Ljava/lang/String;)V", "r", BLiveStormDanmakuGiftResourceType.f44444l, "referrer", BLiveStormDanmakuGiftResourceType.f44446s, "(Ljava/lang/String;)V", "h", "Ljava/util/concurrent/Executor;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/concurrent/Executor;", "j", "(Landroid/content/Context;)Ljava/lang/String;", "o", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "p", "(Lcom/facebook/appevents/AppEvent;Lcom/facebook/appevents/AccessTokenAppIdPair;)V", "message", "q", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "Ljava/lang/String;", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "I", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "isActivateAppEventRequested", "Z", "pushNotificationsRegistrationIdField", "staticLock", "Ljava/lang/Object;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.appevents.e$a$a, reason: collision with other inner class name */
        @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/facebook/appevents/e$a$a", "Ll/xum$a;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "a", "(Ljava/lang/String;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class C22669a implements xum.InterfaceC21222a {
            @Override // p149l.xum.InterfaceC21222a
            /* JADX INFO: renamed from: a */
            public void mo7770a(@Nullable String s) {
                C1553e.INSTANCE.m7769s(s);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m7751a() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = C1552d.m7728l().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.m8693r((String) it2.next(), true);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m7752b(Context context, C1553e c1553e) {
            context.getClass();
            c1553e.getClass();
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                c1553e.m7747p("fb_sdk_initialize", null, bundle);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m7756f(@NotNull Application application, @Nullable String applicationId) {
            application.getClass();
            if (!C1577c.m8027F()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            C1536a.m7656d();
            C1557h.m7809e();
            if (applicationId == null) {
                applicationId = C1577c.m8048m();
            }
            C1577c.m8031K(application, applicationId);
            n50.m157975u(application, applicationId);
            if (FeatureManager.m8679g(FeatureManager.Feature.GPSPACAProcessing)) {
                o060.INSTANCE.m162126e(applicationId, "fb_mobile_app_install");
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: g */
        public final Pair<Bundle, C1555g> m7757g(@Nullable Bundle params, @Nullable C1555g operationalData, boolean isImplicitlyLogged) {
            C1555g.Companion aVar;
            OperationalDataEnum operationalDataEnum;
            String str = oj1.m164591g() ? "1" : "0";
            C1555g.Companion aVar2 = C1555g.INSTANCE;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            Pair<Bundle, C1555g> pairM7793b = aVar2.m7793b(operationalDataEnum2, "is_implicit_purchase_logging_enabled", str, params, operationalData);
            Object objM7794c = aVar2.m7794c(operationalDataEnum2, "fb_iap_product_id", params, operationalData);
            String str2 = objM7794c instanceof String ? (String) objM7794c : null;
            if (isImplicitlyLogged) {
                aVar = aVar2;
                operationalDataEnum = operationalDataEnum2;
            } else {
                if ((params != null ? params.getString("fb_content_id") : null) != null || str2 == null) {
                    aVar = aVar2;
                    operationalDataEnum = operationalDataEnum2;
                } else {
                    aVar = aVar2;
                    operationalDataEnum = operationalDataEnum2;
                    Pair<Bundle, C1555g> pairM7793b2 = aVar.m7793b(operationalDataEnum, "fb_content_id", str2, params, operationalData);
                    pairM7793b = aVar.m7793b(operationalDataEnum, "android_dynamic_ads_content_id", "client_manual", pairM7793b2.getFirst(), pairM7793b2.getSecond());
                }
            }
            Pair<Bundle, C1555g> pairM7793b3 = aVar.m7793b(operationalDataEnum, "is_autolog_app_events_enabled", C1663j.m8911f() ? "1" : "0", pairM7793b.getFirst(), pairM7793b.getSecond());
            return new Pair<>(pairM7793b3.getFirst(), pairM7793b3.getSecond());
        }

        /* JADX INFO: renamed from: h */
        public final void m7758h() {
            if (m7761k() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                C1552d.m7726j(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final Executor m7759i() {
            if (C1553e.m7733b() == null) {
                m7765o();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7733b = C1553e.m7733b();
            if (scheduledThreadPoolExecutorM7733b != null) {
                return scheduledThreadPoolExecutorM7733b;
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final String m7760j(@NotNull Context context) {
            context.getClass();
            if (C1553e.m7732a() == null) {
                synchronized (C1553e.m7736e()) {
                    try {
                        if (C1553e.m7732a() == null) {
                            C1553e.m7739h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (C1553e.m7732a() == null) {
                                C1553e.m7739h("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C1553e.m7732a()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String strM7732a = C1553e.m7732a();
            if (strM7732a != null) {
                return strM7732a;
            }
            qkq0.m175383a("Required value was null.");
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final AppEventsLogger.FlushBehavior m7761k() {
            AppEventsLogger.FlushBehavior flushBehaviorM7734c;
            synchronized (C1553e.m7736e()) {
                flushBehaviorM7734c = C1553e.m7734c();
            }
            return flushBehaviorM7734c;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: l */
        public final String m7762l() {
            xum.m211142d(new C22669a());
            return C1577c.m8047l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: m */
        public final String m7763m() {
            String strM7735d;
            synchronized (C1553e.m7736e()) {
                strM7735d = C1553e.m7735d();
            }
            return strM7735d;
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m7764n(@NotNull final Context context, @Nullable String applicationId) {
            context.getClass();
            if (C1577c.m8051p()) {
                final C1553e c1553e = new C1553e(context, applicationId, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7733b = C1553e.m7733b();
                if (scheduledThreadPoolExecutorM7733b != null) {
                    scheduledThreadPoolExecutorM7733b.execute(new Runnable() { // from class: l.sv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1553e.Companion.m7752b(context, c1553e);
                        }
                    });
                } else {
                    qkq0.m175383a("Required value was null.");
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m7765o() {
            synchronized (C1553e.m7736e()) {
                if (C1553e.m7733b() != null) {
                    return;
                }
                C1553e.m7740i(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.INSTANCE;
                Runnable runnable = new Runnable() { // from class: l.rv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1553e.Companion.m7751a();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7733b = C1553e.m7733b();
                if (scheduledThreadPoolExecutorM7733b != null) {
                    scheduledThreadPoolExecutorM7733b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                } else {
                    qkq0.m175383a("Required value was null.");
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m7766p(AppEvent event, AccessTokenAppIdPair accessTokenAppId) {
            C1552d.m7723g(accessTokenAppId, event);
            if (FeatureManager.m8679g(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && C1573a.m7980d()) {
                C1573a.m7981e(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m8679g(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.m7804i(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m8679g(FeatureManager.Feature.GPSPACAProcessing)) {
                o060.INSTANCE.m162125d(accessTokenAppId.getApplicationId(), event);
            }
            if (event.getIsImplicit() || C1553e.m7737f()) {
                return;
            }
            if (Intrinsics.m87488d(event.getName(), "fb_mobile_activate_app")) {
                C1553e.m7738g(true);
            } else {
                uxv.INSTANCE.m196207b(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m7767q(String message) {
            uxv.INSTANCE.m196207b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", message);
        }

        @JvmStatic
        /* JADX INFO: renamed from: r */
        public final void m7768r() {
            C1552d.m7730n();
        }

        @JvmStatic
        /* JADX INFO: renamed from: s */
        public final void m7769s(@Nullable String referrer) {
            SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (referrer != null) {
                sharedPreferences.edit().putString("install_referrer", referrer).apply();
            }
        }

        public Companion() {
        }
    }

    static {
        String canonicalName = C1553e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f5994c = canonicalName;
        f5996e = AppEventsLogger.FlushBehavior.AUTO;
        f5997f = new Object();
    }

    public C1553e(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        str.getClass();
        ark0.m98523l();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.INSTANCE.m7436e() : accessToken;
        if (accessToken == null || accessToken.m7424q() || !(str2 == null || Intrinsics.m87488d(str2, accessToken.getApplicationId()))) {
            str2 = str2 == null ? C1657e.m8817J(C1577c.m8047l()) : str2;
            if (str2 == null) {
                qkq0.m175383a("Required value was null.");
                throw null;
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str2);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        INSTANCE.m7765o();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m7732a() {
        if (lsb.m151554d(C1553e.class)) {
            return null;
        }
        try {
            return f5998g;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m7733b() {
        if (lsb.m151554d(C1553e.class)) {
            return null;
        }
        try {
            return f5995d;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AppEventsLogger.FlushBehavior m7734c() {
        if (lsb.m151554d(C1553e.class)) {
            return null;
        }
        try {
            return f5996e;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ String m7735d() {
        if (lsb.m151554d(C1553e.class)) {
            return null;
        }
        try {
            return f6000i;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Object m7736e() {
        if (lsb.m151554d(C1553e.class)) {
            return null;
        }
        try {
            return f5997f;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ boolean m7737f() {
        if (lsb.m151554d(C1553e.class)) {
            return false;
        }
        try {
            return f5999h;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m7738g(boolean z) {
        if (lsb.m151554d(C1553e.class)) {
            return;
        }
        try {
            f5999h = z;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ void m7739h(String str) {
        if (lsb.m151554d(C1553e.class)) {
            return;
        }
        try {
            f5998g = str;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ void m7740i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (lsb.m151554d(C1553e.class)) {
            return;
        }
        try {
            f5995d = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m7741n(C1553e c1553e, String str, Double d, Bundle bundle, boolean z, UUID uuid, C1555g c1555g, int i, Object obj) {
        if (lsb.m151554d(C1553e.class)) {
            return;
        }
        if ((i & 32) != 0) {
            c1555g = null;
        }
        try {
            c1553e.m7745m(str, d, bundle, z, uuid, c1555g);
        } catch (Throwable th) {
            lsb.m151552b(th, C1553e.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7742j() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1552d.m7726j(FlushReason.EXPLICIT);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7743k(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        C1553e c1553e;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            c1553e = this;
            try {
                m7741n(c1553e, eventName, Double.valueOf(valueToSum), parameters, false, n50.m157971n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                lsb.m151552b(th, c1553e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1553e = this;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7744l(@Nullable String eventName, @Nullable Bundle parameters) {
        C1553e c1553e;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            c1553e = this;
            try {
                m7741n(c1553e, eventName, null, parameters, false, n50.m157971n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                lsb.m151552b(th, c1553e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1553e = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX INFO: renamed from: m */
    public final void m7745m(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable UUID currentSessionId, @Nullable C1555g operationalData) {
        Bundle bundle;
        C1555g c1555gComponent2 = operationalData;
        if (lsb.m151554d(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            if (isImplicitlyLogged || !oj1.m164591g() || (!Intrinsics.m87488d(eventName, "fb_mobile_purchase") && !Intrinsics.m87488d(eventName, "Subscribe") && !Intrinsics.m87488d(eventName, "StartTrial"))) {
                bundle = parameters;
            } else if ((FeatureManager.m8679g(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe) && Intrinsics.m87488d(eventName, "fb_mobile_purchase")) || (FeatureManager.m8679g(FeatureManager.Feature.AndroidManualImplicitSubsDedupe) && (Intrinsics.m87488d(eventName, "Subscribe") || Intrinsics.m87488d(eventName, "StartTrial")))) {
                ypm ypmVar = ypm.INSTANCE;
                Double dM215647g = ypmVar.m215647g(valueToSum, parameters);
                Currency currencyM215642b = ypmVar.m215642b(parameters);
                if (dM215647g == null || currencyM215642b == null) {
                    bundle = parameters;
                } else {
                    Pair<Bundle, C1555g> pairM215641a = ypmVar.m215641a(C1564g.m7906f(CollectionsKt.listOf(new opm(eventName, dM215647g.doubleValue(), currencyM215642b)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(parameters, c1555gComponent2))), parameters, c1555gComponent2);
                    Bundle bundleComponent1 = pairM215641a.component1();
                    c1555gComponent2 = pairM215641a.component2();
                    bundle = bundleComponent1;
                }
            } else {
                bundle = parameters;
            }
            if (C1655c.m8766d("app_events_killswitch", C1577c.m8048m(), false)) {
                uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            if (a43.m94766b(eventName)) {
                return;
            }
            Companion companion = INSTANCE;
            Pair<Bundle, C1555g> pairM7757g = companion.m7757g(bundle, c1555gComponent2, isImplicitlyLogged);
            Bundle bundleComponent2 = pairM7757g.component1();
            C1555g c1555gComponent3 = pairM7757g.component2();
            try {
                if (!ProtectedModeManager.INSTANCE.m7923g(bundleComponent2)) {
                    the0.m188903c(bundleComponent2, eventName);
                }
                gd2.m125531d(bundleComponent2);
                yfw.m214589h(bundleComponent2, eventName);
                iwf0.m138743g(bundleComponent2);
                ProtectedModeManager.m7919f(bundleComponent2);
                companion.m7766p(new AppEvent(this.contextName, eventName, valueToSum, bundleComponent2, isImplicitlyLogged, n50.m157972p(), currentSessionId, c1555gComponent3), this.accessTokenAppId);
            } catch (FacebookException e) {
                uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (JSONException e2) {
                uxv.INSTANCE.m196208c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7746o(@Nullable String eventName, @Nullable String buttonText) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", buttonText);
            m7744l(eventName, bundle);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7747p(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        C1553e c1553e;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            c1553e = this;
            try {
                m7741n(c1553e, eventName, valueToSum, parameters, true, n50.m157971n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                lsb.m151552b(th, c1553e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1553e = this;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7748q(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1555g operationalData) {
        Throwable th;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (purchaseAmount == null || currency == null) {
                C1657e.m8844j0(f5994c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (parameters == null) {
                try {
                    parameters = new Bundle();
                } catch (Throwable th2) {
                    th = th2;
                    lsb.m151552b(th, this);
                }
            }
            Bundle bundle = parameters;
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                m7745m(eventName, Double.valueOf(purchaseAmount.doubleValue()), bundle, true, n50.m157971n(), operationalData);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                lsb.m151552b(th, this);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7749r(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable C1555g operationalData) {
        Throwable th;
        C1553e c1553e;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (purchaseAmount == null) {
                INSTANCE.m7767q("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.m7767q("currency cannot be null");
                return;
            }
            if (parameters == null) {
                parameters = new Bundle();
            }
            Bundle bundle = parameters;
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                c1553e = this;
                try {
                    c1553e.m7745m("fb_mobile_purchase", Double.valueOf(purchaseAmount.doubleValue()), bundle, isImplicitlyLogged, n50.m157971n(), operationalData);
                    INSTANCE.m7758h();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    lsb.m151552b(th, c1553e);
                }
            } catch (Throwable th3) {
                th = th3;
                c1553e = this;
            }
        } catch (Throwable th4) {
            th = th4;
            c1553e = this;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7750s(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1555g operationalData) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m7749r(purchaseAmount, currency, parameters, true, operationalData);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    public C1553e(@Nullable Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        this(C1657e.m8863u(context), str, accessToken);
    }
}
