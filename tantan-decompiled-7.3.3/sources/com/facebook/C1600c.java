package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C1576e;
import com.facebook.appevents.iap.C1586f;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.ondeviceprocessing.C1596a;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.C1678c;
import com.facebook.internal.C1680e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.c4s;
import p153l.cym;
import p153l.g0l0;
import p153l.i50;
import p153l.iyv;
import p153l.kre0;
import p153l.qw0;
import p153l.rzv;
import p153l.wtq0;
import p153l.xe20;
import p153l.ztb;

/* JADX INFO: renamed from: com.facebook.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002CHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0015H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000eH\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000eH\u0003¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u000eH\u0007¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0015H\u0007¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u000eH\u0007¢\u0006\u0004\b0\u0010\u0010J\u0017\u00101\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000eH\u0007¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0007¢\u0006\u0004\b4\u0010\u0010J\u000f\u00105\u001a\u00020\nH\u0007¢\u0006\u0004\b5\u0010\fJ\u0017\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u00020\nH\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\fJ\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b:\u0010\fJ\u000f\u0010;\u001a\u00020\nH\u0007¢\u0006\u0004\b;\u0010\fJ\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AR\u001c\u0010E\u001a\n B*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u0012\u0012\u0004\u0012\u00020 0Fj\b\u0012\u0004\u0012\u00020 `G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0018\u0010P\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010DR\u0018\u0010R\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010DR\u0018\u0010U\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020<0^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010_R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010aR\u0016\u0010b\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010dR\u0016\u0010f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0016\u0010g\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u0010[R\u0016\u0010h\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0016\u0010i\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010[R\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010kR\u0016\u0010m\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010DR\u0016\u0010n\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0016\u0010q\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010pR\u0016\u0010r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010[¨\u0006s"}, m88121d2 = {"Lcom/facebook/c;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "u", "()Ljava/util/concurrent/Executor;", "", "B", "()J", "", "D", "()Z", "G", "", BaseSei.f14624X, "()Ljava/lang/String;", "E", ResourceDirection.f39656v, "w", BaseSei.f14626Z, "Landroid/content/Context;", "applicationContext", "", "L", "(Landroid/content/Context;)V", "Lcom/facebook/c$b;", "callback", "M", "(Landroid/content/Context;Lcom/facebook/c$b;)V", "F", "j", "Lcom/facebook/LoggingBehavior;", CreditScoreTaskType.behavior, "H", "(Lcom/facebook/LoggingBehavior;)Z", BaseSei.f14625Y, BLiveStormDanmakuGiftResourceType.f45292l, "()Landroid/content/Context;", "context", "applicationId", "K", "(Landroid/content/Context;Ljava/lang/String;)V", "J", c4s.C_ZONE, "A", "(Landroid/content/Context;)Z", "I", "m", "N", "(Ljava/lang/String;)V", "n", BLiveStormDanmakuGiftResourceType.f45294s, "o", "flag", BloodType.f39576O, "(Z)V", "p", Constants.KEY_T, "k", "Ljava/io/File;", "q", "()Ljava/io/File;", "", "r", "()I", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "loggingBehaviors", "c", "Ljava/util/concurrent/Executor;", "executor", Constants.INAPP_DATA_TAG, "e", "applicationName", "f", "appClientToken", "g", "Ljava/lang/Boolean;", "codelessDebugLogEnabled", "Ljava/util/concurrent/atomic/AtomicLong;", "h", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", RXScreenCaptureService.KEY_INDEX, "Z", "isDebugEnabledField", "isLegacyTokenUpgradeSupported", "Ll/iyv;", "Ll/iyv;", "cacheDir", "Landroid/content/Context;", "callbackRequestCodeOffset", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "graphApiVersion", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "instagramDomain", "facebookDomain", "Lcom/facebook/c$a;", "Lcom/facebook/c$a;", "graphRequestCreator", "isFullyInitialized", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C1600c {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Executor executor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static volatile String applicationId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static volatile String applicationName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public static volatile String appClientToken;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static volatile Boolean codelessDebugLogEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static volatile boolean isDebugEnabledField;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static boolean isLegacyTokenUpgradeSupported;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static iyv<File> cacheDir;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static Context applicationContext;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @JvmField
    public static boolean hasCustomTabsPrefetching;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @JvmField
    public static boolean ignoreAppSwitchToLoggedOut;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @JvmField
    public static boolean bypassAppSwitch;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static boolean isFullyInitialized;

    @NotNull
    public static final C1600c INSTANCE = new C1600c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1600c.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final HashSet<LoggingBehavior> loggingBehaviors = SetsKt.hashSetOf(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static AtomicLong onProgressThreshold = new AtomicLong(65536);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static int callbackRequestCodeOffset = 64206;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static final ReentrantLock LOCK = new ReentrantLock();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static String graphApiVersion = kre0.m151031a();

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static volatile String instagramDomain = "instagram.com";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static volatile String facebookDomain = "facebook.com";

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public static a graphRequestCreator = new a() { // from class: l.xvf
        @Override // com.facebook.C1600c.a
        /* JADX INFO: renamed from: a */
        public final GraphRequest mo8117a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC1539b interfaceC1539b) {
            return C1600c.m8091b(accessToken, str, jSONObject, interfaceC1539b);
        }
    };

    /* JADX INFO: renamed from: com.facebook.c$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Lcom/facebook/c$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "a", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @VisibleForTesting
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        GraphRequest mo8117a(@Nullable AccessToken accessToken, @Nullable String publishUrl, @Nullable JSONObject publishParams, @Nullable GraphRequest.InterfaceC1539b callback);
    }

    /* JADX INFO: renamed from: com.facebook.c$b */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/facebook/c$b;", "", "", "a", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void m8118a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final boolean m8076A(@NotNull Context context) {
        context.getClass();
        g0l0.m128441l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final long m8077B() {
        g0l0.m128441l();
        return onProgressThreshold.get();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m8078C() {
        return "18.0.3";
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final boolean m8079D() {
        return isDebugEnabledField;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: E */
    public static final synchronized boolean m8080E() {
        return isFullyInitialized;
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final boolean m8081F() {
        return sdkInitialized.get();
    }

    @JvmStatic
    /* JADX INFO: renamed from: G */
    public static final boolean m8082G() {
        return isLegacyTokenUpgradeSupported;
    }

    @JvmStatic
    /* JADX INFO: renamed from: H */
    public static final boolean m8083H(@NotNull LoggingBehavior behavior) {
        boolean z;
        behavior.getClass();
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z = m8079D() && hashSet.contains(behavior);
        }
        return z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m8084I(@Nullable Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            applicationInfo.getClass();
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (C15493d.m94374J(lowerCase, "fb", false, 2, null)) {
                        applicationId = str.substring(2);
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (callbackRequestCodeOffset == 64206) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 3)
    /* JADX INFO: renamed from: K */
    public static final void m8085K(@NotNull Context context, @NotNull final String applicationId2) {
        if (ztb.m221490d(C1600c.class)) {
            return;
        }
        try {
            context.getClass();
            applicationId2.getClass();
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            if (!C1678c.m8820d("app_events_killswitch", m8102m(), false)) {
                m8110u().execute(new Runnable() { // from class: l.fwf
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1600c.m8093d(applicationContext2, applicationId2);
                    }
                });
            }
            if (FeatureManager.m8733g(FeatureManager.Feature.OnDeviceEventProcessing) && C1596a.m8034d()) {
                C1596a.m8036f(applicationId2, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            ztb.m221488b(th, C1600c.class);
        }
    }

    @Deprecated
    @JvmStatic
    /* JADX INFO: renamed from: L */
    public static final synchronized void m8086L(@NotNull Context applicationContext2) {
        applicationContext2.getClass();
        m8087M(applicationContext2, null);
    }

    @Deprecated
    @JvmStatic
    /* JADX INFO: renamed from: M */
    public static final synchronized void m8087M(@NotNull Context applicationContext2, @Nullable final b callback) {
        applicationContext2.getClass();
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (callback != null) {
                callback.m8118a();
            }
            return;
        }
        g0l0.m128434e(applicationContext2, false);
        g0l0.m128435f(applicationContext2, false);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        applicationContext3.getClass();
        applicationContext = applicationContext3;
        AppEventsLogger.INSTANCE.m7702c(applicationContext2);
        Context context = applicationContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.m88391r("applicationContext");
            context = null;
        }
        m8084I(context);
        String str = applicationId;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = appClientToken;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (m8104o()) {
            m8099j();
        }
        Context context3 = applicationContext;
        if (context3 == null) {
            Intrinsics.m88391r("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && C1686j.m8965f()) {
            Context context4 = applicationContext;
            if (context4 == null) {
                Intrinsics.m88391r("applicationContext");
                context4 = null;
            }
            i50.m138600u((Application) context4, applicationId);
        } else {
            C1586f.m7953i();
        }
        AppLinkManager appLinkManagerM7988a = AppLinkManager.INSTANCE.m7988a();
        if (appLinkManagerM7988a != null) {
            Context context5 = applicationContext;
            if (context5 == null) {
                Intrinsics.m88391r("applicationContext");
                context5 = null;
            }
            appLinkManagerM7988a.m7987i((Application) context5);
        }
        FetchedAppSettingsManager.m8745h();
        xe20.m210534z();
        BoltsMeasurementEventListener.Companion c1658a = BoltsMeasurementEventListener.INSTANCE;
        Context context6 = applicationContext;
        if (context6 == null) {
            Intrinsics.m88391r("applicationContext");
        } else {
            context2 = context6;
        }
        c1658a.m8713a(context2);
        cacheDir = new iyv<>(new Callable() { // from class: l.yvf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1600c.m8098i();
            }
        });
        FeatureManager.m8730a(FeatureManager.Feature.Instrument, new FeatureManager.InterfaceC1665a() { // from class: l.zvf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
            /* JADX INFO: renamed from: a */
            public final void mo8738a(boolean z) {
                C1600c.m8096g(z);
            }
        });
        FeatureManager.m8730a(FeatureManager.Feature.AppEvents, new FeatureManager.InterfaceC1665a() { // from class: l.awf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
            /* JADX INFO: renamed from: a */
            public final void mo8738a(boolean z) {
                C1600c.m8095f(z);
            }
        });
        FeatureManager.m8730a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.InterfaceC1665a() { // from class: l.bwf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
            /* JADX INFO: renamed from: a */
            public final void mo8738a(boolean z) {
                C1600c.m8090a(z);
            }
        });
        FeatureManager.m8730a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.InterfaceC1665a() { // from class: l.cwf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
            /* JADX INFO: renamed from: a */
            public final void mo8738a(boolean z) {
                C1600c.m8092c(z);
            }
        });
        FeatureManager.m8730a(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.InterfaceC1665a() { // from class: l.dwf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
            /* JADX INFO: renamed from: a */
            public final void mo8738a(boolean z) {
                C1600c.m8097h(z);
            }
        });
        m8110u().execute(new FutureTask(new Callable(callback) { // from class: l.ewf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1600c.m8094e(null);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: N */
    public static final void m8088N(@NotNull String applicationId2) {
        applicationId2.getClass();
        g0l0.m128436g(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final void m8089O(boolean flag) {
        C1686j.m8969r(flag);
        if (flag) {
            m8099j();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8090a(boolean z) {
        if (z) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static GraphRequest m8091b(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC1539b interfaceC1539b) {
        return GraphRequest.INSTANCE.m7641z(accessToken, str, jSONObject, interfaceC1539b);
    }

    /* JADX INFO: renamed from: c */
    public static void m8092c(boolean z) {
        if (z) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8093d(Context context, String str) {
        context.getClass();
        str.getClass();
        INSTANCE.m8116J(context, str);
    }

    /* JADX INFO: renamed from: e */
    public static Void m8094e(b bVar) {
        C1598b.INSTANCE.m8062e().m8050j();
        C1634g.INSTANCE.m8440a().m8436d();
        if (AccessToken.INSTANCE.m7492g()) {
            Profile.Companion c1548b = Profile.INSTANCE;
            if (c1548b.m7676b() == null) {
                c1548b.m7675a();
            }
        }
        if (bVar != null) {
            bVar.m8118a();
        }
        AppEventsLogger.Companion c1556a = AppEventsLogger.INSTANCE;
        c1556a.m7705f(m8101l(), applicationId);
        C1686j.m8967m();
        Context applicationContext2 = m8101l().getApplicationContext();
        applicationContext2.getClass();
        c1556a.m7706g(applicationContext2).m7698b();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m8095f(boolean z) {
        if (z) {
            qw0.m178401a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8096g(boolean z) {
        if (z) {
            cym.m113206d();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8097h(boolean z) {
        if (z) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static File m8098i() {
        Context context = applicationContext;
        if (context == null) {
            Intrinsics.m88391r("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m8099j() {
        isFullyInitialized = true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m8100k() {
        return C1686j.m8963d();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Context m8101l() {
        g0l0.m128441l();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.m88391r("applicationContext");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m8102m() {
        g0l0.m128441l();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String m8103n() {
        g0l0.m128441l();
        return applicationName;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m8104o() {
        return C1686j.m8964e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m8105p() {
        return C1686j.m8965f();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final File m8106q() {
        g0l0.m128441l();
        iyv<File> iyvVar = cacheDir;
        if (iyvVar == null) {
            Intrinsics.m88391r("cacheDir");
            iyvVar = null;
        }
        return iyvVar.m142746b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final int m8107r() {
        g0l0.m128441l();
        return callbackRequestCodeOffset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m8108s() {
        g0l0.m128441l();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final boolean m8109t() {
        return C1686j.m8966g();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Executor m8110u() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            wtq0.m207906a("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m8111v() {
        return facebookDomain;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m8112w() {
        return "fb.gg";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m8113x() {
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        C1680e.m8898j0(str, String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1)));
        return graphApiVersion;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m8114y() {
        AccessToken accessTokenM7490e = AccessToken.INSTANCE.m7490e();
        return C1680e.m8867F(accessTokenM7490e != null ? accessTokenM7490e.getGraphDomain() : null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: z */
    public static final String m8115z() {
        return instagramDomain;
    }

    /* JADX INFO: renamed from: J */
    public final void m8116J(Context context, String applicationId2) {
        try {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiersM8706e = AttributionIdentifiers.INSTANCE.m8706e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str = applicationId2 + "ping";
                long j = sharedPreferences.getLong(str, 0L);
                try {
                    JSONObject jSONObjectM7978a = AppEventsLoggerUtility.m7978a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiersM8706e, AppEventsLogger.INSTANCE.m7702c(context), m8076A(context), context);
                    String strM7816l = C1576e.INSTANCE.m7816l();
                    if (strM7816l != null) {
                        jSONObjectM7978a.put("install_referrer", strM7816l);
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    GraphRequest graphRequestMo8117a = graphRequestCreator.mo8117a(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId2}, 1)), jSONObjectM7978a, null);
                    if (j == 0 && graphRequestMo8117a.m7579j().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str, System.currentTimeMillis());
                        editorEdit.apply();
                        rzv.Companion c19943a = rzv.INSTANCE;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        String str2 = TAG;
                        str2.getClass();
                        c19943a.m183848b(loggingBehavior, str2, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                C1680e.m8896i0("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
