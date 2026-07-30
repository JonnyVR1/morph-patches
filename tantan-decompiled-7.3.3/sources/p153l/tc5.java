package p153l;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u0006-"}, m88121d2 = {"Ll/tc5;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "k", "(Landroid/app/Activity;)V", "j", RXScreenCaptureService.KEY_INDEX, "e", Constants.INAPP_DATA_TAG, "", "f", "()Ljava/lang/String;", "", "g", "()Z", "appIndexingEnabled", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "applicationId", "c", "(Ljava/lang/String;)V", "h", "Ll/mll0;", "a", "Ll/mll0;", "viewIndexingTrigger", "Landroid/hardware/SensorManager;", "b", "Landroid/hardware/SensorManager;", "sensorManager", "Ll/lll0;", "Ll/lll0;", "viewIndexer", "Ljava/lang/String;", "deviceSessionID", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "isAppIndexingEnabled", "Z", "isCheckingSession", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class tc5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static SensorManager sensorManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static lll0 viewIndexer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String deviceSessionID;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static volatile boolean isCheckingSession;

    @NotNull
    public static final tc5 INSTANCE = new tc5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final mll0 viewIndexingTrigger = new mll0();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m190422a(String str) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            AttributionIdentifiers attributionIdentifiersM8706e = AttributionIdentifiers.INSTANCE.m8706e(C1600c.m8101l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((attributionIdentifiersM8706e != null ? attributionIdentifiersM8706e.m8698h() : null) != null) {
                jSONArray.put(attributionIdentifiersM8706e.m8698h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(uv0.m198221e() ? "1" : "0");
            Locale localeM8861B = C1680e.m8861B();
            jSONArray.put(localeM8861B.getLanguage() + '_' + localeM8861B.getCountry());
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("device_session_id", m190426f());
            bundle.putString("extinfo", string);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z = true;
            JSONObject graphObject = companion.m7609A(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, null).m7579j().getGraphObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (graphObject == null || !graphObject.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (atomicBoolean.get()) {
                lll0 lll0Var = viewIndexer;
                if (lll0Var != null) {
                    lll0Var.m154755h();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m190423b(C1679d c1679d, String str) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            str.getClass();
            boolean z = c1679d != null && c1679d.getCodelessEventsEnabled();
            boolean zM8109t = C1600c.m8109t();
            if (z && zM8109t) {
                INSTANCE.m190432c(str);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m190424d() {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m190425e() {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m190426f() {
        if (ztb.m221490d(tc5.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            str.getClass();
            return str;
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m190427g() {
        if (ztb.m221490d(tc5.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m190428i(@NotNull Activity activity) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            activity.getClass();
            vc5.INSTANCE.m200772a().m200768f(activity);
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m190429j(@NotNull Activity activity) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            activity.getClass();
            if (isCodelessEnabled.get()) {
                vc5.INSTANCE.m200772a().m200770h(activity);
                lll0 lll0Var = viewIndexer;
                if (lll0Var != null) {
                    lll0Var.m154757j();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m190430k(@NotNull Activity activity) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            activity.getClass();
            if (isCodelessEnabled.get()) {
                vc5.INSTANCE.m200772a().m200767e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strM8102m = C1600c.m8102m();
                final C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(strM8102m);
                if ((c1679dM8743f != null && c1679dM8743f.getCodelessEventsEnabled()) || INSTANCE.m190433h()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    lll0 lll0Var = new lll0(activity);
                    viewIndexer = lll0Var;
                    mll0 mll0Var = viewIndexingTrigger;
                    mll0Var.m158923a(new mll0.InterfaceC18652b() { // from class: l.rc5
                        @Override // p153l.mll0.InterfaceC18652b
                        /* JADX INFO: renamed from: a */
                        public final void mo158924a() {
                            tc5.m190423b(c1679dM8743f, strM8102m);
                        }
                    });
                    sensorManager2.registerListener(mll0Var, defaultSensor, 2);
                    if (c1679dM8743f != null && c1679dM8743f.getCodelessEventsEnabled()) {
                        lll0Var.m154755h();
                    }
                }
                tc5 tc5Var = INSTANCE;
                if (!tc5Var.m190433h() || isAppIndexingEnabled.get()) {
                    return;
                }
                tc5Var.m190432c(strM8102m);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m190431l(boolean appIndexingEnabled) {
        if (ztb.m221490d(tc5.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th) {
            ztb.m221488b(th, tc5.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m190432c(final String applicationId) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            C1600c.m8110u().execute(new Runnable() { // from class: l.sc5
                @Override // java.lang.Runnable
                public final void run() {
                    tc5.m190422a(applicationId);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m190433h() {
        ztb.m221490d(this);
        return false;
    }
}
