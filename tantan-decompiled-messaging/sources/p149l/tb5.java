package p149l;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u0006-"}, m87232d2 = {"Ll/tb5;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "k", "(Landroid/app/Activity;)V", "j", RXScreenCaptureService.KEY_INDEX, "e", Constants.INAPP_DATA_TAG, "", "f", "()Ljava/lang/String;", "", "g", "()Z", "appIndexingEnabled", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "applicationId", "c", "(Ljava/lang/String;)V", "h", "Ll/icl0;", "a", "Ll/icl0;", "viewIndexingTrigger", "Landroid/hardware/SensorManager;", "b", "Landroid/hardware/SensorManager;", "sensorManager", "Ll/hcl0;", "Ll/hcl0;", "viewIndexer", "Ljava/lang/String;", "deviceSessionID", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "isAppIndexingEnabled", "Z", "isCheckingSession", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class tb5 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static SensorManager sensorManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static hcl0 viewIndexer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String deviceSessionID;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static volatile boolean isCheckingSession;

    @NotNull
    public static final tb5 INSTANCE = new tb5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final icl0 viewIndexingTrigger = new icl0();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m187797a(String str) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            AttributionIdentifiers attributionIdentifiersM8652e = AttributionIdentifiers.INSTANCE.m8652e(C1577c.m8047l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((attributionIdentifiersM8652e != null ? attributionIdentifiersM8652e.m8644h() : null) != null) {
                jSONArray.put(attributionIdentifiersM8652e.m8644h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(nv0.m161522e() ? "1" : "0");
            Locale localeM8807B = C1657e.m8807B();
            jSONArray.put(localeM8807B.getLanguage() + '_' + localeM8807B.getCountry());
            String string = jSONArray.toString();
            string.getClass();
            bundle.putString("device_session_id", m187801f());
            bundle.putString("extinfo", string);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean z = true;
            JSONObject graphObject = companion.m7555A(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, null).m7525j().getGraphObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (graphObject == null || !graphObject.optBoolean("is_app_indexing_enabled", false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (atomicBoolean.get()) {
                hcl0 hcl0Var = viewIndexer;
                if (hcl0Var != null) {
                    hcl0Var.m130451h();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m187798b(C1656d c1656d, String str) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            str.getClass();
            boolean z = c1656d != null && c1656d.getCodelessEventsEnabled();
            boolean zM8055t = C1577c.m8055t();
            if (z && zM8055t) {
                INSTANCE.m187807c(str);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m187799d() {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m187800e() {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m187801f() {
        if (lsb.m151554d(tb5.class)) {
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
            lsb.m151552b(th, tb5.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m187802g() {
        if (lsb.m151554d(tb5.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m187803i(@NotNull Activity activity) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            activity.getClass();
            vb5.INSTANCE.m197692a().m197688f(activity);
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m187804j(@NotNull Activity activity) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            activity.getClass();
            if (isCodelessEnabled.get()) {
                vb5.INSTANCE.m197692a().m197690h(activity);
                hcl0 hcl0Var = viewIndexer;
                if (hcl0Var != null) {
                    hcl0Var.m130453j();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 != null) {
                    sensorManager2.unregisterListener(viewIndexingTrigger);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final void m187805k(@NotNull Activity activity) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            activity.getClass();
            if (isCodelessEnabled.get()) {
                vb5.INSTANCE.m197692a().m197687e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strM8048m = C1577c.m8048m();
                final C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(strM8048m);
                if ((c1656dM8689f != null && c1656dM8689f.getCodelessEventsEnabled()) || INSTANCE.m187808h()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    hcl0 hcl0Var = new hcl0(activity);
                    viewIndexer = hcl0Var;
                    icl0 icl0Var = viewIndexingTrigger;
                    icl0Var.m135359a(new icl0.InterfaceC17519b() { // from class: l.rb5
                        @Override // p149l.icl0.InterfaceC17519b
                        /* JADX INFO: renamed from: a */
                        public final void mo135360a() {
                            tb5.m187798b(c1656dM8689f, strM8048m);
                        }
                    });
                    sensorManager2.registerListener(icl0Var, defaultSensor, 2);
                    if (c1656dM8689f != null && c1656dM8689f.getCodelessEventsEnabled()) {
                        hcl0Var.m130451h();
                    }
                }
                tb5 tb5Var = INSTANCE;
                if (!tb5Var.m187808h() || isAppIndexingEnabled.get()) {
                    return;
                }
                tb5Var.m187807c(strM8048m);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: l */
    public static final void m187806l(boolean appIndexingEnabled) {
        if (lsb.m151554d(tb5.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th) {
            lsb.m151552b(th, tb5.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m187807c(final String applicationId) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            C1577c.m8056u().execute(new Runnable() { // from class: l.sb5
                @Override // java.lang.Runnable
                public final void run() {
                    tb5.m187797a(applicationId);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m187808h() {
        lsb.m151554d(this);
        return false;
    }
}
