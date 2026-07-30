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
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C1553e;
import com.facebook.appevents.iap.C1563f;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppLinkManager;
import com.facebook.appevents.ondeviceprocessing.C1573a;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.C1655c;
import com.facebook.internal.C1657e;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ark0;
import p149l.b2s;
import p149l.bwm;
import p149l.fje0;
import p149l.hwv;
import p149l.jw0;
import p149l.lsb;
import p149l.n50;
import p149l.p620;
import p149l.qkq0;
import p149l.uxv;

/* JADX INFO: renamed from: com.facebook.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002CHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0015H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000eH\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000eH\u0003¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u000eH\u0007¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0015H\u0007¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\u000eH\u0007¢\u0006\u0004\b0\u0010\u0010J\u0017\u00101\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000eH\u0007¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0007¢\u0006\u0004\b4\u0010\u0010J\u000f\u00105\u001a\u00020\nH\u0007¢\u0006\u0004\b5\u0010\fJ\u0017\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u00020\nH\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0007¢\u0006\u0004\b9\u0010\fJ\u000f\u0010:\u001a\u00020\nH\u0007¢\u0006\u0004\b:\u0010\fJ\u000f\u0010;\u001a\u00020\nH\u0007¢\u0006\u0004\b;\u0010\fJ\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010AR\u001c\u0010E\u001a\n B*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u0012\u0012\u0004\u0012\u00020 0Fj\b\u0012\u0004\u0012\u00020 `G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010DR\u0018\u0010P\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010DR\u0018\u0010R\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010DR\u0018\u0010U\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010]\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010[R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020<0^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010_R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010aR\u0016\u0010b\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010e\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010dR\u0016\u0010f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010DR\u0016\u0010g\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u0010[R\u0016\u0010h\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b=\u0010[R\u0016\u0010i\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b@\u0010[R\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010kR\u0016\u0010m\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010DR\u0016\u0010n\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0016\u0010q\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010pR\u0016\u0010r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010[¨\u0006s"}, m87232d2 = {"Lcom/facebook/c;", "", "<init>", "()V", "Ljava/util/concurrent/Executor;", "u", "()Ljava/util/concurrent/Executor;", "", "B", "()J", "", "D", "()Z", "G", "", BaseSei.f13930X, "()Ljava/lang/String;", "E", ResourceDirection.f38808v, "w", BaseSei.f13932Z, "Landroid/content/Context;", "applicationContext", "", "L", "(Landroid/content/Context;)V", "Lcom/facebook/c$b;", "callback", "M", "(Landroid/content/Context;Lcom/facebook/c$b;)V", "F", "j", "Lcom/facebook/LoggingBehavior;", CreditScoreTaskType.behavior, "H", "(Lcom/facebook/LoggingBehavior;)Z", BaseSei.f13931Y, BLiveStormDanmakuGiftResourceType.f44444l, "()Landroid/content/Context;", "context", "applicationId", "K", "(Landroid/content/Context;Ljava/lang/String;)V", "J", b2s.C_ZONE, "A", "(Landroid/content/Context;)Z", "I", "m", "N", "(Ljava/lang/String;)V", "n", BLiveStormDanmakuGiftResourceType.f44446s, "o", "flag", BloodType.f38728O, "(Z)V", "p", Constants.KEY_T, "k", "Ljava/io/File;", "q", "()Ljava/io/File;", "", "r", "()I", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "loggingBehaviors", "c", "Ljava/util/concurrent/Executor;", "executor", Constants.INAPP_DATA_TAG, "e", "applicationName", "f", "appClientToken", "g", "Ljava/lang/Boolean;", "codelessDebugLogEnabled", "Ljava/util/concurrent/atomic/AtomicLong;", "h", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", RXScreenCaptureService.KEY_INDEX, "Z", "isDebugEnabledField", "isLegacyTokenUpgradeSupported", "Ll/hwv;", "Ll/hwv;", "cacheDir", "Landroid/content/Context;", "callbackRequestCodeOffset", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "graphApiVersion", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "instagramDomain", "facebookDomain", "Lcom/facebook/c$a;", "Lcom/facebook/c$a;", "graphRequestCreator", "isFullyInitialized", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C1577c {

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
    public static hwv<File> cacheDir;

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
    public static final C1577c INSTANCE = new C1577c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1577c.class.getCanonicalName();

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
    public static String graphApiVersion = fje0.m121580a();

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
    public static a graphRequestCreator = new a() { // from class: l.juf
        @Override // com.facebook.C1577c.a
        /* JADX INFO: renamed from: a */
        public final GraphRequest mo8063a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC1516b interfaceC1516b) {
            return C1577c.m8037b(accessToken, str, jSONObject, interfaceC1516b);
        }
    };

    /* JADX INFO: renamed from: com.facebook.c$a */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bá\u0080\u0001\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/facebook/c$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "a", "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$b;)Lcom/facebook/GraphRequest;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @VisibleForTesting
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        GraphRequest mo8063a(@Nullable AccessToken accessToken, @Nullable String publishUrl, @Nullable JSONObject publishParams, @Nullable GraphRequest.InterfaceC1516b callback);
    }

    /* JADX INFO: renamed from: com.facebook.c$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/facebook/c$b;", "", "", "a", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void m8064a();
    }

    @JvmStatic
    /* JADX INFO: renamed from: A */
    public static final boolean m8022A(@NotNull Context context) {
        context.getClass();
        ark0.m98523l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    @JvmStatic
    /* JADX INFO: renamed from: B */
    public static final long m8023B() {
        ark0.m98523l();
        return onProgressThreshold.get();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: C */
    public static final String m8024C() {
        return "18.0.3";
    }

    @JvmStatic
    /* JADX INFO: renamed from: D */
    public static final boolean m8025D() {
        return isDebugEnabledField;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: E */
    public static final synchronized boolean m8026E() {
        return isFullyInitialized;
    }

    @JvmStatic
    /* JADX INFO: renamed from: F */
    public static final boolean m8027F() {
        return sdkInitialized.get();
    }

    @JvmStatic
    /* JADX INFO: renamed from: G */
    public static final boolean m8028G() {
        return isLegacyTokenUpgradeSupported;
    }

    @JvmStatic
    /* JADX INFO: renamed from: H */
    public static final boolean m8029H(@NotNull LoggingBehavior behavior) {
        boolean z;
        behavior.getClass();
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z = m8025D() && hashSet.contains(behavior);
        }
        return z;
    }

    @JvmStatic
    /* JADX INFO: renamed from: I */
    public static final void m8030I(@Nullable Context context) {
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
                    if (C15386d.m93483J(lowerCase, "fb", false, 2, null)) {
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
    public static final void m8031K(@NotNull Context context, @NotNull final String applicationId2) {
        if (lsb.m151554d(C1577c.class)) {
            return;
        }
        try {
            context.getClass();
            applicationId2.getClass();
            final Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 == null) {
                return;
            }
            if (!C1655c.m8766d("app_events_killswitch", m8048m(), false)) {
                m8056u().execute(new Runnable() { // from class: l.ruf
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1577c.m8039d(applicationContext2, applicationId2);
                    }
                });
            }
            if (FeatureManager.m8679g(FeatureManager.Feature.OnDeviceEventProcessing) && C1573a.m7980d()) {
                C1573a.m7982f(applicationId2, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1577c.class);
        }
    }

    @Deprecated
    @JvmStatic
    /* JADX INFO: renamed from: L */
    public static final synchronized void m8032L(@NotNull Context applicationContext2) {
        applicationContext2.getClass();
        m8033M(applicationContext2, null);
    }

    @Deprecated
    @JvmStatic
    /* JADX INFO: renamed from: M */
    public static final synchronized void m8033M(@NotNull Context applicationContext2, @Nullable final b callback) {
        applicationContext2.getClass();
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (callback != null) {
                callback.m8064a();
            }
            return;
        }
        ark0.m98516e(applicationContext2, false);
        ark0.m98517f(applicationContext2, false);
        Context applicationContext3 = applicationContext2.getApplicationContext();
        applicationContext3.getClass();
        applicationContext = applicationContext3;
        AppEventsLogger.INSTANCE.m7648c(applicationContext2);
        Context context = applicationContext;
        Context context2 = null;
        if (context == null) {
            Intrinsics.m87502r("applicationContext");
            context = null;
        }
        m8030I(context);
        String str = applicationId;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = appClientToken;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (m8050o()) {
            m8045j();
        }
        Context context3 = applicationContext;
        if (context3 == null) {
            Intrinsics.m87502r("applicationContext");
            context3 = null;
        }
        if ((context3 instanceof Application) && C1663j.m8911f()) {
            Context context4 = applicationContext;
            if (context4 == null) {
                Intrinsics.m87502r("applicationContext");
                context4 = null;
            }
            n50.m157975u((Application) context4, applicationId);
        } else {
            C1563f.m7899i();
        }
        AppLinkManager appLinkManagerM7934a = AppLinkManager.INSTANCE.m7934a();
        if (appLinkManagerM7934a != null) {
            Context context5 = applicationContext;
            if (context5 == null) {
                Intrinsics.m87502r("applicationContext");
                context5 = null;
            }
            appLinkManagerM7934a.m7933i((Application) context5);
        }
        FetchedAppSettingsManager.m8691h();
        p620.m167597z();
        BoltsMeasurementEventListener.Companion c1635a = BoltsMeasurementEventListener.INSTANCE;
        Context context6 = applicationContext;
        if (context6 == null) {
            Intrinsics.m87502r("applicationContext");
        } else {
            context2 = context6;
        }
        c1635a.m8659a(context2);
        cacheDir = new hwv<>(new Callable() { // from class: l.kuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1577c.m8044i();
            }
        });
        FeatureManager.m8676a(FeatureManager.Feature.Instrument, new FeatureManager.InterfaceC1642a() { // from class: l.luf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                C1577c.m8042g(z);
            }
        });
        FeatureManager.m8676a(FeatureManager.Feature.AppEvents, new FeatureManager.InterfaceC1642a() { // from class: l.muf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                C1577c.m8041f(z);
            }
        });
        FeatureManager.m8676a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.InterfaceC1642a() { // from class: l.nuf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                C1577c.m8036a(z);
            }
        });
        FeatureManager.m8676a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.InterfaceC1642a() { // from class: l.ouf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                C1577c.m8038c(z);
            }
        });
        FeatureManager.m8676a(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.InterfaceC1642a() { // from class: l.puf
            @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
            /* JADX INFO: renamed from: a */
            public final void mo8684a(boolean z) {
                C1577c.m8043h(z);
            }
        });
        m8056u().execute(new FutureTask(new Callable(callback) { // from class: l.quf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1577c.m8040e(null);
            }
        }));
    }

    @JvmStatic
    /* JADX INFO: renamed from: N */
    public static final void m8034N(@NotNull String applicationId2) {
        applicationId2.getClass();
        ark0.m98518g(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    @JvmStatic
    /* JADX INFO: renamed from: O */
    public static final void m8035O(boolean flag) {
        C1663j.m8915r(flag);
        if (flag) {
            m8045j();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8036a(boolean z) {
        if (z) {
            hasCustomTabsPrefetching = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static GraphRequest m8037b(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.InterfaceC1516b interfaceC1516b) {
        return GraphRequest.INSTANCE.m7587z(accessToken, str, jSONObject, interfaceC1516b);
    }

    /* JADX INFO: renamed from: c */
    public static void m8038c(boolean z) {
        if (z) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8039d(Context context, String str) {
        context.getClass();
        str.getClass();
        INSTANCE.m8062J(context, str);
    }

    /* JADX INFO: renamed from: e */
    public static Void m8040e(b bVar) {
        C1575b.INSTANCE.m8008e().m7996j();
        C1611g.INSTANCE.m8386a().m8382d();
        if (AccessToken.INSTANCE.m7438g()) {
            Profile.Companion c1525b = Profile.INSTANCE;
            if (c1525b.m7622b() == null) {
                c1525b.m7621a();
            }
        }
        if (bVar != null) {
            bVar.m8064a();
        }
        AppEventsLogger.Companion c1533a = AppEventsLogger.INSTANCE;
        c1533a.m7651f(m8047l(), applicationId);
        C1663j.m8913m();
        Context applicationContext2 = m8047l().getApplicationContext();
        applicationContext2.getClass();
        c1533a.m7652g(applicationContext2).m7644b();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m8041f(boolean z) {
        if (z) {
            jw0.m143584a();
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8042g(boolean z) {
        if (z) {
            bwm.m104163d();
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m8043h(boolean z) {
        if (z) {
            bypassAppSwitch = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public static File m8044i() {
        Context context = applicationContext;
        if (context == null) {
            Intrinsics.m87502r("applicationContext");
            context = null;
        }
        return context.getCacheDir();
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m8045j() {
        isFullyInitialized = true;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m8046k() {
        return C1663j.m8909d();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Context m8047l() {
        ark0.m98523l();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        Intrinsics.m87502r("applicationContext");
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m8048m() {
        ark0.m98523l();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String m8049n() {
        ark0.m98523l();
        return applicationName;
    }

    @JvmStatic
    /* JADX INFO: renamed from: o */
    public static final boolean m8050o() {
        return C1663j.m8910e();
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final boolean m8051p() {
        return C1663j.m8911f();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: q */
    public static final File m8052q() {
        ark0.m98523l();
        hwv<File> hwvVar = cacheDir;
        if (hwvVar == null) {
            Intrinsics.m87502r("cacheDir");
            hwvVar = null;
        }
        return hwvVar.m133270b();
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final int m8053r() {
        ark0.m98523l();
        return callbackRequestCodeOffset;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: s */
    public static final String m8054s() {
        ark0.m98523l();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    @JvmStatic
    /* JADX INFO: renamed from: t */
    public static final boolean m8055t() {
        return C1663j.m8912g();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: u */
    public static final Executor m8056u() {
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
            qkq0.m175383a("Required value was null.");
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: v */
    public static final String m8057v() {
        return facebookDomain;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: w */
    public static final String m8058w() {
        return "fb.gg";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: x */
    public static final String m8059x() {
        String str = TAG;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        C1657e.m8844j0(str, String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1)));
        return graphApiVersion;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: y */
    public static final String m8060y() {
        AccessToken accessTokenM7436e = AccessToken.INSTANCE.m7436e();
        return C1657e.m8813F(accessTokenM7436e != null ? accessTokenM7436e.getGraphDomain() : null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: z */
    public static final String m8061z() {
        return instagramDomain;
    }

    /* JADX INFO: renamed from: J */
    public final void m8062J(Context context, String applicationId2) {
        try {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                AttributionIdentifiers attributionIdentifiersM8652e = AttributionIdentifiers.INSTANCE.m8652e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str = applicationId2 + "ping";
                long j = sharedPreferences.getLong(str, 0L);
                try {
                    JSONObject jSONObjectM7924a = AppEventsLoggerUtility.m7924a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionIdentifiersM8652e, AppEventsLogger.INSTANCE.m7648c(context), m8022A(context), context);
                    String strM7762l = C1553e.INSTANCE.m7762l();
                    if (strM7762l != null) {
                        jSONObjectM7924a.put("install_referrer", strM7762l);
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    GraphRequest graphRequestMo8063a = graphRequestCreator.mo8063a(null, String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId2}, 1)), jSONObjectM7924a, null);
                    if (j == 0 && graphRequestMo8063a.m7525j().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(str, System.currentTimeMillis());
                        editorEdit.apply();
                        uxv.Companion c20533a = uxv.INSTANCE;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        String str2 = TAG;
                        str2.getClass();
                        c20533a.m196207b(loggingBehavior, str2, "MOBILE_APP_INSTALL has been logged");
                    }
                } catch (JSONException e) {
                    throw new FacebookException("An error occurred while publishing install.", e);
                }
            } catch (Exception e2) {
                C1657e.m8842i0("Facebook-publish", e2);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
