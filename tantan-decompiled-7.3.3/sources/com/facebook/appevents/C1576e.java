package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.facebook.AccessToken;
import com.facebook.C1600c;
import com.facebook.C1686j;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C1576e;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.iap.C1587g;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.ondeviceprocessing.C1596a;
import com.facebook.internal.C1678c;
import com.facebook.internal.C1680e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p153l.asm;
import p153l.g0l0;
import p153l.i50;
import p153l.nd2;
import p153l.q43;
import p153l.qrm;
import p153l.rzv;
import p153l.s4g0;
import p153l.t860;
import p153l.vj1;
import p153l.whw;
import p153l.wtq0;
import p153l.ype0;
import p153l.ywm;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.appevents.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 62\u00020\u0001:\u0001/B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB'\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J?\u0010#\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J+\u0010'\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b'\u0010(JA\u0010)\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b)\u0010*JI\u0010-\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\"\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, m88121d2 = {"Lcom/facebook/appevents/e;", "", "", "activityName", "applicationId", "Lcom/facebook/AccessToken;", "accessToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "eventName", "Landroid/os/Bundle;", "parameters", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "valueToSum", "k", "(Ljava/lang/String;DLandroid/os/Bundle;)V", "buttonText", "o", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "purchaseAmount", "Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lcom/facebook/appevents/g;", "operationalData", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "", "isImplicitlyLogged", "r", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;ZLcom/facebook/appevents/g;)V", "j", "()V", "p", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "q", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/g;)V", "Ljava/util/UUID;", "currentSessionId", "m", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZLjava/util/UUID;Lcom/facebook/appevents/g;)V", "a", "Ljava/lang/String;", "contextName", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "b", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1576e {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f6031c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public static ScheduledThreadPoolExecutor f6032d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static AppEventsLogger.FlushBehavior f6033e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Object f6034f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public static String f6035g;

    /* JADX INFO: renamed from: h */
    public static boolean f6036h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static String f6037i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String contextName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public AccessTokenAppIdPair accessTokenAppId;

    /* JADX INFO: renamed from: com.facebook.appevents.e$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u0003J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\tJ\u0019\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u0007H\u0002¢\u0006\u0004\b0\u0010!R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00102R\u0014\u00109\u001a\u0002088\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u00102R\u0014\u0010<\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00102R\u0014\u0010=\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00102R\u0018\u0010>\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00102R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0014\u0010G\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006I"}, m88121d2 = {"Lcom/facebook/appevents/e$a;", "", "<init>", "()V", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "k", "()Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "m", "()Ljava/lang/String;", "Landroid/app/Application;", "application", "applicationId", "", "f", "(Landroid/app/Application;Ljava/lang/String;)V", "Landroid/os/Bundle;", CommandMessage.PARAMS, "Lcom/facebook/appevents/g;", "operationalData", "", "isImplicitlyLogged", "Lkotlin/Pair;", "g", "(Landroid/os/Bundle;Lcom/facebook/appevents/g;Z)Lkotlin/Pair;", "Landroid/content/Context;", "context", "n", "(Landroid/content/Context;Ljava/lang/String;)V", "r", BLiveStormDanmakuGiftResourceType.f45292l, "referrer", BLiveStormDanmakuGiftResourceType.f45294s, "(Ljava/lang/String;)V", "h", "Ljava/util/concurrent/Executor;", RXScreenCaptureService.KEY_INDEX, "()Ljava/util/concurrent/Executor;", "j", "(Landroid/content/Context;)Ljava/lang/String;", "o", "Lcom/facebook/appevents/AppEvent;", NotificationCompat.CATEGORY_EVENT, "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppId", "p", "(Lcom/facebook/appevents/AppEvent;Lcom/facebook/appevents/AccessTokenAppIdPair;)V", "message", "q", "ACCOUNT_KIT_EVENT_NAME_PREFIX", "Ljava/lang/String;", "APP_EVENTS_KILLSWITCH", "APP_EVENT_NAME_PUSH_OPENED", "APP_EVENT_PREFERENCES", "APP_EVENT_PUSH_PARAMETER_ACTION", "APP_EVENT_PUSH_PARAMETER_CAMPAIGN", "", "APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS", "I", "PUSH_PAYLOAD_CAMPAIGN_KEY", "PUSH_PAYLOAD_KEY", "TAG", "anonymousAppDeviceGUID", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "flushBehaviorField", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "isActivateAppEventRequested", "Z", "pushNotificationsRegistrationIdField", "staticLock", "Ljava/lang/Object;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.appevents.e$a$a, reason: collision with other inner class name */
        @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"com/facebook/appevents/e$a$a", "Ll/ywm$a;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "a", "(Ljava/lang/String;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class C22785a implements ywm.InterfaceC21692a {
            @Override // p153l.ywm.InterfaceC21692a
            /* JADX INFO: renamed from: a */
            public void mo7824a(@Nullable String s) {
                C1576e.INSTANCE.m7823s(s);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static void m7805a() {
            HashSet hashSet = new HashSet();
            Iterator<AccessTokenAppIdPair> it = C1575d.m7782l().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getApplicationId());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                FetchedAppSettingsManager.m8747r((String) it2.next(), true);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m7806b(Context context, C1576e c1576e) {
            context.getClass();
            c1576e.getClass();
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
                c1576e.m7801p("fb_sdk_initialize", null, bundle);
            }
        }

        @JvmStatic
        /* JADX INFO: renamed from: f */
        public final void m7810f(@NotNull Application application, @Nullable String applicationId) {
            application.getClass();
            if (!C1600c.m8081F()) {
                throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
            }
            C1559a.m7710d();
            C1580h.m7863e();
            if (applicationId == null) {
                applicationId = C1600c.m8102m();
            }
            C1600c.m8085K(application, applicationId);
            i50.m138600u(application, applicationId);
            if (FeatureManager.m8733g(FeatureManager.Feature.GPSPACAProcessing)) {
                t860.INSTANCE.m189642e(applicationId, "fb_mobile_app_install");
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: g */
        public final Pair<Bundle, C1578g> m7811g(@Nullable Bundle params, @Nullable C1578g operationalData, boolean isImplicitlyLogged) {
            C1578g.Companion aVar;
            OperationalDataEnum operationalDataEnum;
            String str = vj1.m201431g() ? "1" : "0";
            C1578g.Companion aVar2 = C1578g.INSTANCE;
            OperationalDataEnum operationalDataEnum2 = OperationalDataEnum.IAPParameters;
            Pair<Bundle, C1578g> pairM7847b = aVar2.m7847b(operationalDataEnum2, "is_implicit_purchase_logging_enabled", str, params, operationalData);
            Object objM7848c = aVar2.m7848c(operationalDataEnum2, "fb_iap_product_id", params, operationalData);
            String str2 = objM7848c instanceof String ? (String) objM7848c : null;
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
                    Pair<Bundle, C1578g> pairM7847b2 = aVar.m7847b(operationalDataEnum, "fb_content_id", str2, params, operationalData);
                    pairM7847b = aVar.m7847b(operationalDataEnum, "android_dynamic_ads_content_id", "client_manual", pairM7847b2.getFirst(), pairM7847b2.getSecond());
                }
            }
            Pair<Bundle, C1578g> pairM7847b3 = aVar.m7847b(operationalDataEnum, "is_autolog_app_events_enabled", C1686j.m8965f() ? "1" : "0", pairM7847b.getFirst(), pairM7847b.getSecond());
            return new Pair<>(pairM7847b3.getFirst(), pairM7847b3.getSecond());
        }

        /* JADX INFO: renamed from: h */
        public final void m7812h() {
            if (m7815k() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                C1575d.m7780j(FlushReason.EAGER_FLUSHING_EVENT);
            }
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: i */
        public final Executor m7813i() {
            if (C1576e.m7787b() == null) {
                m7819o();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7787b = C1576e.m7787b();
            if (scheduledThreadPoolExecutorM7787b != null) {
                return scheduledThreadPoolExecutorM7787b;
            }
            wtq0.m207906a("Required value was null.");
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: j */
        public final String m7814j(@NotNull Context context) {
            context.getClass();
            if (C1576e.m7786a() == null) {
                synchronized (C1576e.m7790e()) {
                    try {
                        if (C1576e.m7786a() == null) {
                            C1576e.m7793h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                            if (C1576e.m7786a() == null) {
                                C1576e.m7793h("XZ" + UUID.randomUUID());
                                context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", C1576e.m7786a()).apply();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            String strM7786a = C1576e.m7786a();
            if (strM7786a != null) {
                return strM7786a;
            }
            wtq0.m207906a("Required value was null.");
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: k */
        public final AppEventsLogger.FlushBehavior m7815k() {
            AppEventsLogger.FlushBehavior flushBehaviorM7788c;
            synchronized (C1576e.m7790e()) {
                flushBehaviorM7788c = C1576e.m7788c();
            }
            return flushBehaviorM7788c;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: l */
        public final String m7816l() {
            ywm.m217617d(new C22785a());
            return C1600c.m8101l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: m */
        public final String m7817m() {
            String strM7789d;
            synchronized (C1576e.m7790e()) {
                strM7789d = C1576e.m7789d();
            }
            return strM7789d;
        }

        @JvmStatic
        /* JADX INFO: renamed from: n */
        public final void m7818n(@NotNull final Context context, @Nullable String applicationId) {
            context.getClass();
            if (C1600c.m8105p()) {
                final C1576e c1576e = new C1576e(context, applicationId, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7787b = C1576e.m7787b();
                if (scheduledThreadPoolExecutorM7787b != null) {
                    scheduledThreadPoolExecutorM7787b.execute(new Runnable() { // from class: l.zv0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1576e.Companion.m7806b(context, c1576e);
                        }
                    });
                } else {
                    wtq0.m207906a("Required value was null.");
                }
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m7819o() {
            synchronized (C1576e.m7790e()) {
                if (C1576e.m7787b() != null) {
                    return;
                }
                C1576e.m7794i(new ScheduledThreadPoolExecutor(1));
                Unit unit = Unit.INSTANCE;
                Runnable runnable = new Runnable() { // from class: l.yv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1576e.Companion.m7805a();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM7787b = C1576e.m7787b();
                if (scheduledThreadPoolExecutorM7787b != null) {
                    scheduledThreadPoolExecutorM7787b.scheduleAtFixedRate(runnable, 0L, 86400L, TimeUnit.SECONDS);
                } else {
                    wtq0.m207906a("Required value was null.");
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m7820p(AppEvent event, AccessTokenAppIdPair accessTokenAppId) {
            C1575d.m7777g(accessTokenAppId, event);
            if (FeatureManager.m8733g(FeatureManager.Feature.OnDevicePostInstallEventProcessing) && C1596a.m8034d()) {
                C1596a.m8035e(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m8733g(FeatureManager.Feature.GPSARATriggers)) {
                GpsAraTriggersManager.INSTANCE.m7858i(accessTokenAppId.getApplicationId(), event);
            }
            if (FeatureManager.m8733g(FeatureManager.Feature.GPSPACAProcessing)) {
                t860.INSTANCE.m189641d(accessTokenAppId.getApplicationId(), event);
            }
            if (event.getIsImplicit() || C1576e.m7791f()) {
                return;
            }
            if (Intrinsics.m88377d(event.getName(), "fb_mobile_activate_app")) {
                C1576e.m7792g(true);
            } else {
                rzv.INSTANCE.m183848b(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m7821q(String message) {
            rzv.INSTANCE.m183848b(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", message);
        }

        @JvmStatic
        /* JADX INFO: renamed from: r */
        public final void m7822r() {
            C1575d.m7784n();
        }

        @JvmStatic
        /* JADX INFO: renamed from: s */
        public final void m7823s(@Nullable String referrer) {
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (referrer != null) {
                sharedPreferences.edit().putString("install_referrer", referrer).apply();
            }
        }

        public Companion() {
        }
    }

    static {
        String canonicalName = C1576e.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f6031c = canonicalName;
        f6033e = AppEventsLogger.FlushBehavior.AUTO;
        f6034f = new Object();
    }

    public C1576e(@NotNull String str, @Nullable String str2, @Nullable AccessToken accessToken) {
        str.getClass();
        g0l0.m128441l();
        this.contextName = str;
        accessToken = accessToken == null ? AccessToken.INSTANCE.m7490e() : accessToken;
        if (accessToken == null || accessToken.m7478q() || !(str2 == null || Intrinsics.m88377d(str2, accessToken.getApplicationId()))) {
            str2 = str2 == null ? C1680e.m8871J(C1600c.m8101l()) : str2;
            if (str2 == null) {
                wtq0.m207906a("Required value was null.");
                throw null;
            }
            this.accessTokenAppId = new AccessTokenAppIdPair(null, str2);
        } else {
            this.accessTokenAppId = new AccessTokenAppIdPair(accessToken);
        }
        INSTANCE.m7819o();
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m7786a() {
        if (ztb.m221490d(C1576e.class)) {
            return null;
        }
        try {
            return f6035g;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m7787b() {
        if (ztb.m221490d(C1576e.class)) {
            return null;
        }
        try {
            return f6032d;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AppEventsLogger.FlushBehavior m7788c() {
        if (ztb.m221490d(C1576e.class)) {
            return null;
        }
        try {
            return f6033e;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ String m7789d() {
        if (ztb.m221490d(C1576e.class)) {
            return null;
        }
        try {
            return f6037i;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ Object m7790e() {
        if (ztb.m221490d(C1576e.class)) {
            return null;
        }
        try {
            return f6034f;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ boolean m7791f() {
        if (ztb.m221490d(C1576e.class)) {
            return false;
        }
        try {
            return f6036h;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ void m7792g(boolean z) {
        if (ztb.m221490d(C1576e.class)) {
            return;
        }
        try {
            f6036h = z;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ void m7793h(String str) {
        if (ztb.m221490d(C1576e.class)) {
            return;
        }
        try {
            f6035g = str;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ void m7794i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (ztb.m221490d(C1576e.class)) {
            return;
        }
        try {
            f6032d = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m7795n(C1576e c1576e, String str, Double d, Bundle bundle, boolean z, UUID uuid, C1578g c1578g, int i, Object obj) {
        if (ztb.m221490d(C1576e.class)) {
            return;
        }
        if ((i & 32) != 0) {
            c1578g = null;
        }
        try {
            c1576e.m7799m(str, d, bundle, z, uuid, c1578g);
        } catch (Throwable th) {
            ztb.m221488b(th, C1576e.class);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7796j() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1575d.m7780j(FlushReason.EXPLICIT);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7797k(@Nullable String eventName, double valueToSum, @Nullable Bundle parameters) {
        C1576e c1576e;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            c1576e = this;
            try {
                m7795n(c1576e, eventName, Double.valueOf(valueToSum), parameters, false, i50.m138596n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                ztb.m221488b(th, c1576e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1576e = this;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m7798l(@Nullable String eventName, @Nullable Bundle parameters) {
        C1576e c1576e;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            c1576e = this;
            try {
                m7795n(c1576e, eventName, null, parameters, false, i50.m138596n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                ztb.m221488b(th, c1576e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1576e = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX INFO: renamed from: m */
    public final void m7799m(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable UUID currentSessionId, @Nullable C1578g operationalData) {
        Bundle bundle;
        C1578g c1578gComponent2 = operationalData;
        if (ztb.m221490d(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            if (isImplicitlyLogged || !vj1.m201431g() || (!Intrinsics.m88377d(eventName, "fb_mobile_purchase") && !Intrinsics.m88377d(eventName, "Subscribe") && !Intrinsics.m88377d(eventName, "StartTrial"))) {
                bundle = parameters;
            } else if ((FeatureManager.m8733g(FeatureManager.Feature.AndroidManualImplicitPurchaseDedupe) && Intrinsics.m88377d(eventName, "fb_mobile_purchase")) || (FeatureManager.m8733g(FeatureManager.Feature.AndroidManualImplicitSubsDedupe) && (Intrinsics.m88377d(eventName, "Subscribe") || Intrinsics.m88377d(eventName, "StartTrial")))) {
                asm asmVar = asm.INSTANCE;
                Double dM99948g = asmVar.m99948g(valueToSum, parameters);
                Currency currencyM99943b = asmVar.m99943b(parameters);
                if (dM99948g == null || currencyM99943b == null) {
                    bundle = parameters;
                } else {
                    Pair<Bundle, C1578g> pairM99942a = asmVar.m99942a(C1587g.m7960f(CollectionsKt.listOf(new qrm(eventName, dM99948g.doubleValue(), currencyM99943b)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(parameters, c1578gComponent2))), parameters, c1578gComponent2);
                    Bundle bundleComponent1 = pairM99942a.component1();
                    c1578gComponent2 = pairM99942a.component2();
                    bundle = bundleComponent1;
                }
            } else {
                bundle = parameters;
            }
            if (C1678c.m8820d("app_events_killswitch", C1600c.m8102m(), false)) {
                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                return;
            }
            if (q43.m175193b(eventName)) {
                return;
            }
            Companion companion = INSTANCE;
            Pair<Bundle, C1578g> pairM7811g = companion.m7811g(bundle, c1578gComponent2, isImplicitlyLogged);
            Bundle bundleComponent2 = pairM7811g.component1();
            C1578g c1578gComponent3 = pairM7811g.component2();
            try {
                if (!ProtectedModeManager.INSTANCE.m7977g(bundleComponent2)) {
                    ype0.m217018c(bundleComponent2, eventName);
                }
                nd2.m162607d(bundleComponent2);
                whw.m206516h(bundleComponent2, eventName);
                s4g0.m184552g(bundleComponent2);
                ProtectedModeManager.m7973f(bundleComponent2);
                companion.m7820p(new AppEvent(this.contextName, eventName, valueToSum, bundleComponent2, isImplicitlyLogged, i50.m138597p(), currentSessionId, c1578gComponent3), this.accessTokenAppId);
            } catch (FacebookException e) {
                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            } catch (JSONException e2) {
                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m7800o(@Nullable String eventName, @Nullable String buttonText) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", buttonText);
            m7798l(eventName, bundle);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m7801p(@Nullable String eventName, @Nullable Double valueToSum, @Nullable Bundle parameters) {
        C1576e c1576e;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            c1576e = this;
            try {
                m7795n(c1576e, eventName, valueToSum, parameters, true, i50.m138596n(), null, 32, null);
            } catch (Throwable th) {
                th = th;
                ztb.m221488b(th, c1576e);
            }
        } catch (Throwable th2) {
            th = th2;
            c1576e = this;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m7802q(@Nullable String eventName, @Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1578g operationalData) {
        Throwable th;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (purchaseAmount == null || currency == null) {
                C1680e.m8898j0(f6031c, "purchaseAmount and currency cannot be null");
                return;
            }
            if (parameters == null) {
                try {
                    parameters = new Bundle();
                } catch (Throwable th2) {
                    th = th2;
                    ztb.m221488b(th, this);
                }
            }
            Bundle bundle = parameters;
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                m7799m(eventName, Double.valueOf(purchaseAmount.doubleValue()), bundle, true, i50.m138596n(), operationalData);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                ztb.m221488b(th, this);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m7803r(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, boolean isImplicitlyLogged, @Nullable C1578g operationalData) {
        Throwable th;
        C1576e c1576e;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (purchaseAmount == null) {
                INSTANCE.m7821q("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                INSTANCE.m7821q("currency cannot be null");
                return;
            }
            if (parameters == null) {
                parameters = new Bundle();
            }
            Bundle bundle = parameters;
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                c1576e = this;
                try {
                    c1576e.m7799m("fb_mobile_purchase", Double.valueOf(purchaseAmount.doubleValue()), bundle, isImplicitlyLogged, i50.m138596n(), operationalData);
                    INSTANCE.m7812h();
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    ztb.m221488b(th, c1576e);
                }
            } catch (Throwable th3) {
                th = th3;
                c1576e = this;
            }
        } catch (Throwable th4) {
            th = th4;
            c1576e = this;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7804s(@Nullable BigDecimal purchaseAmount, @Nullable Currency currency, @Nullable Bundle parameters, @Nullable C1578g operationalData) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m7803r(purchaseAmount, currency, parameters, true, operationalData);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    public C1576e(@Nullable Context context, @Nullable String str, @Nullable AccessToken accessToken) {
        this(C1680e.m8917u(context), str, accessToken);
    }
}
