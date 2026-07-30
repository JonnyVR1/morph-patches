package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1663j;
import com.facebook.appevents.C1554f;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.lsb;

/* JADX INFO: renamed from: com.facebook.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b \u0010\u000bJ\u0011\u0010!\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\u000eJ\u0011\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\"\u0010\u000eR\u001c\u0010'\u001a\n $*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010)R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010-\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010.\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010/\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u00100\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u0014\u00101\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u00103¨\u00065"}, m87232d2 = {"Lcom/facebook/j;", "", "<init>", "()V", "", "m", "", "flag", "r", "(Z)V", "e", "()Z", "f", "p", "()Ljava/lang/Boolean;", Constants.INAPP_DATA_TAG, "g", RXScreenCaptureService.KEY_INDEX, "", "Lcom/facebook/j$a;", "userSettings", "j", "([Lcom/facebook/j$a;)V", "h", "userSetting", Constants.KEY_T, "(Lcom/facebook/j$a;)V", "q", BLiveStormDanmakuGiftResourceType.f44444l, "o", "n", BLiveStormDanmakuGiftResourceType.f44446s, "b", "c", "k", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "isFetchingCodelessStatus", "Lcom/facebook/j$a;", "autoInitEnabled", "autoLogAppEventsEnabledLocally", "advertiserIDCollectionEnabled", "codelessSetupEnabled", "monitorEnabled", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "userSettingPref", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1663j {

    @NotNull
    public static final C1663j INSTANCE = new C1663j();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1663j.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final a autoInitEnabled = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final a autoLogAppEventsEnabledLocally = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final a advertiserIDCollectionEnabled = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final a codelessSetupEnabled = new a(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final a monitorEnabled = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static SharedPreferences userSettingPref;

    /* JADX INFO: renamed from: com.facebook.j$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\t\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, m87232d2 = {"Lcom/facebook/j$a;", "", "", "defaultVal", "", Constants.KEY_KEY, "<init>", "(ZLjava/lang/String;)V", "e", "()Z", "a", "Z", "setDefaultVal", "(Z)V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "c", "Ljava/lang/Boolean;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Boolean;", "g", "(Ljava/lang/Boolean;)V", "value", "", "J", "()J", "f", "(J)V", "lastTS", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean defaultVal;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String key;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Boolean value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long lastTS;

        public a(boolean z, @NotNull String str) {
            str.getClass();
            this.defaultVal = z;
            this.key = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getLastTS() {
            return this.lastTS;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m8932e() {
            Boolean bool = this.value;
            return bool != null ? bool.booleanValue() : this.defaultVal;
        }

        /* JADX INFO: renamed from: f */
        public final void m8933f(long j) {
            this.lastTS = j;
        }

        /* JADX INFO: renamed from: g */
        public final void m8934g(@Nullable Boolean bool) {
            this.value = bool;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8908a(long j) {
        C1656d c1656dM8693r;
        if (lsb.m151554d(C1663j.class)) {
            return;
        }
        try {
            if (advertiserIDCollectionEnabled.m8932e() && (c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false)) != null && c1656dM8693r.getCodelessEventsEnabled()) {
                AttributionIdentifiers attributionIdentifiersM8652e = AttributionIdentifiers.INSTANCE.m8652e(C1577c.m8047l());
                String strM8644h = (attributionIdentifiersM8652e == null || attributionIdentifiersM8652e.m8644h() == null) ? null : attributionIdentifiersM8652e.m8644h();
                if (strM8644h != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("advertiser_id", strM8644h);
                    bundle.putString("fields", "auto_event_setup_enabled");
                    GraphRequest graphRequestM7585x = GraphRequest.INSTANCE.m7585x(null, "app", null);
                    graphRequestM7585x.m7520G(bundle);
                    JSONObject graphObject = graphRequestM7585x.m7525j().getGraphObject();
                    if (graphObject != null) {
                        a aVar = codelessSetupEnabled;
                        aVar.m8934g(Boolean.valueOf(graphObject.optBoolean("auto_event_setup_enabled", false)));
                        aVar.m8933f(j);
                        INSTANCE.m8927t(aVar);
                    }
                }
            }
            isFetchingCodelessStatus.set(false);
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m8909d() {
        if (lsb.m151554d(C1663j.class)) {
            return false;
        }
        try {
            INSTANCE.m8919i();
            return advertiserIDCollectionEnabled.m8932e();
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m8910e() {
        if (lsb.m151554d(C1663j.class)) {
            return false;
        }
        try {
            INSTANCE.m8919i();
            return autoInitEnabled.m8932e();
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m8911f() {
        if (lsb.m151554d(C1663j.class)) {
            return false;
        }
        try {
            C1663j c1663j = INSTANCE;
            c1663j.m8919i();
            return c1663j.m8916b();
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m8912g() {
        if (lsb.m151554d(C1663j.class)) {
            return false;
        }
        try {
            INSTANCE.m8919i();
            return codelessSetupEnabled.m8932e();
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: m */
    public static final void m8913m() {
        if (lsb.m151554d(C1663j.class)) {
            return;
        }
        try {
            Context contextM8047l = C1577c.m8047l();
            ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            C1554f c1554f = new C1554f(contextM8047l);
            Bundle bundle2 = new Bundle();
            if (!C1657e.m8823U()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c1554f.m7774d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final Boolean m8914p() {
        String str = "";
        if (lsb.m151554d(C1663j.class)) {
            return null;
        }
        try {
            INSTANCE.m8926s();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.m87502r("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(autoLogAppEventsEnabledLocally.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    return Boolean.valueOf(new JSONObject(str).getBoolean("value"));
                }
            } catch (JSONException e) {
                C1657e.m8842i0(TAG, e);
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: r */
    public static final void m8915r(boolean flag) {
        if (lsb.m151554d(C1663j.class)) {
            return;
        }
        try {
            a aVar = autoInitEnabled;
            aVar.m8934g(Boolean.valueOf(flag));
            aVar.m8933f(System.currentTimeMillis());
            if (isInitialized.get()) {
                INSTANCE.m8927t(aVar);
            } else {
                INSTANCE.m8919i();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, C1663j.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8916b() {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            Map<String, Boolean> mapM8690g = FetchedAppSettingsManager.m8690g();
            if (mapM8690g != null && !mapM8690g.isEmpty()) {
                Boolean bool = mapM8690g.get("auto_log_app_events_enabled");
                Boolean bool2 = mapM8690g.get("auto_log_app_events_default");
                if (bool != null) {
                    return bool.booleanValue();
                }
                Boolean boolM8917c = m8917c();
                if (boolM8917c != null) {
                    return boolM8917c.booleanValue();
                }
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return true;
            }
            return autoLogAppEventsEnabledLocally.m8932e();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m8917c() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            Boolean boolM8914p = m8914p();
            if (boolM8914p != null) {
                return boolM8914p;
            }
            Boolean boolM8921k = m8921k();
            if (boolM8921k != null) {
                return boolM8921k;
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8918h() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            a aVar = codelessSetupEnabled;
            m8925q(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.getValue() == null || jCurrentTimeMillis - aVar.getLastTS() >= 604800000) {
                aVar.m8934g(null);
                aVar.m8933f(0L);
                if (isFetchingCodelessStatus.compareAndSet(false, true)) {
                    C1577c.m8056u().execute(new Runnable() { // from class: l.e9k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1663j.m8908a(jCurrentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m8919i() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (C1577c.m8027F() && isInitialized.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = C1577c.m8047l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                sharedPreferences.getClass();
                userSettingPref = sharedPreferences;
                m8920j(autoLogAppEventsEnabledLocally, advertiserIDCollectionEnabled, autoInitEnabled);
                m8918h();
                m8924o();
                m8923n();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8920j(a... userSettings) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            for (a aVar : userSettings) {
                if (aVar == codelessSetupEnabled) {
                    m8918h();
                } else if (aVar.getValue() == null) {
                    m8925q(aVar);
                    if (aVar.getValue() == null) {
                        m8922l(aVar);
                    }
                } else {
                    m8927t(aVar);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Boolean m8921k() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            m8926s();
            try {
                Context contextM8047l = C1577c.m8047l();
                ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    a aVar = autoLogAppEventsEnabledLocally;
                    if (bundle.containsKey(aVar.getKey())) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.getKey()));
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                C1657e.m8842i0(TAG, e);
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8922l(a userSetting) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m8926s();
            try {
                Context contextM8047l = C1577c.m8047l();
                ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
                applicationInfo.getClass();
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(userSetting.getKey())) {
                    return;
                }
                userSetting.m8934g(Boolean.valueOf(applicationInfo.metaData.getBoolean(userSetting.getKey(), userSetting.getDefaultVal())));
            } catch (PackageManager.NameNotFoundException e) {
                C1657e.m8842i0(TAG, e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8923n() {
        int i;
        int i2;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (isInitialized.get() && C1577c.m8027F()) {
                Context contextM8047l = C1577c.m8047l();
                int i3 = (autoInitEnabled.m8932e() ? 1 : 0) | ((autoLogAppEventsEnabledLocally.m8932e() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.m8932e() ? 1 : 0) << 2) | ((monitorEnabled.m8932e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = userSettingPref;
                SharedPreferences sharedPreferences2 = null;
                if (sharedPreferences == null) {
                    Intrinsics.m87502r("userSettingPref");
                    sharedPreferences = null;
                }
                int i4 = 0;
                int i5 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i5 != i3) {
                    SharedPreferences sharedPreferences3 = userSettingPref;
                    if (sharedPreferences3 == null) {
                        Intrinsics.m87502r("userSettingPref");
                    } else {
                        sharedPreferences2 = sharedPreferences3;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i3).apply();
                    try {
                        ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
                        applicationInfo.getClass();
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            i2 = 0;
                            i = 0;
                            while (i4 < 4) {
                                try {
                                    i |= (applicationInfo.metaData.containsKey(strArr[i4]) ? 1 : 0) << i4;
                                    i2 |= (applicationInfo.metaData.getBoolean(strArr[i4], zArr[i4]) ? 1 : 0) << i4;
                                    i4++;
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i4 = i2;
                                    i2 = i4;
                                    i4 = i;
                                    C1554f c1554f = new C1554f(contextM8047l);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("usage", i4);
                                    bundle.putInt("initial", i2);
                                    bundle.putInt("previous", i5);
                                    bundle.putInt("current", i3);
                                    c1554f.m7772b(bundle);
                                }
                            }
                            i4 = i;
                        } else {
                            i2 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i = 0;
                    }
                    C1554f c1554f2 = new C1554f(contextM8047l);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("usage", i4);
                    bundle2.putInt("initial", i2);
                    bundle2.putInt("previous", i5);
                    bundle2.putInt("current", i3);
                    c1554f2.m7772b(bundle2);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8924o() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            Context contextM8047l = C1577c.m8047l();
            ApplicationInfo applicationInfo = contextM8047l.getPackageManager().getApplicationInfo(contextM8047l.getPackageName(), 128);
            applicationInfo.getClass();
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                bundle.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                m8909d();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8925q(a userSetting) {
        String str = "";
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m8926s();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.m87502r("userSettingPref");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString(userSetting.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    userSetting.m8934g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    userSetting.m8933f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e) {
                C1657e.m8842i0(TAG, e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8926s() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8927t(a userSetting) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m8926s();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", userSetting.getValue());
                jSONObject.put("last_timestamp", userSetting.getLastTS());
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    Intrinsics.m87502r("userSettingPref");
                    sharedPreferences = null;
                }
                sharedPreferences.edit().putString(userSetting.getKey(), jSONObject.toString()).apply();
                m8923n();
            } catch (Exception e) {
                C1657e.m8842i0(TAG, e);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
