package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.byj0;
import p153l.c1n;
import p153l.iy5;
import p153l.m31;
import p153l.vj1;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002L8B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001e0\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u0004\u0018\u00010(2\b\u0010&\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J)\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\u0010+\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J[\u00104\u001a:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-02\u0018\u000101j\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060-02\u0018\u0001`32\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u00100\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b6\u0010!R\u001c\u0010:\u001a\n 7*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010D\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010B0B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000b0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010FR\u0016\u0010I\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010J¨\u0006M"}, m88121d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager;", "", "<init>", "()V", "", "h", "", "applicationId", "Lcom/facebook/internal/d;", "f", "(Ljava/lang/String;)Lcom/facebook/internal/d;", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "callback", Constants.INAPP_DATA_TAG, "(Lcom/facebook/internal/FetchedAppSettingsManager$a;)V", "", "", "g", "()Ljava/util/Map;", "forceRequery", "r", "(Ljava/lang/String;Z)Lcom/facebook/internal/d;", "Lorg/json/JSONObject;", "settingsJSON", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/facebook/internal/d;", "q", "e", "(Ljava/lang/String;)Lorg/json/JSONObject;", "dialogConfigResponse", "", "Lcom/facebook/internal/d$b;", "n", "(Lorg/json/JSONObject;)Ljava/util/Map;", "parameters", "", "m", "(Lorg/json/JSONObject;)Ljava/lang/Long;", "protectedModeSettings", "ruleType", "Lorg/json/JSONArray;", "p", "(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONArray;", "originalJSON", Constants.KEY_KEY, "", "j", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/List;", "getTestValues", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "k", "(Lorg/json/JSONObject;Z)Ljava/util/ArrayList;", "o", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "b", "Ljava/util/List;", "APP_SETTING_FIELDS", "c", "Ljava/util/Map;", "fetchedAppSettings", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "Ljava/util/concurrent/atomic/AtomicReference;", "loadingState", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "fetchedAppSettingsCallbacks", "Z", "printedSDKUpdatedMessage", "Lorg/json/JSONArray;", "unityEventBindings", "FetchAppSettingState", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FetchedAppSettingsManager {

    @NotNull
    public static final FetchedAppSettingsManager INSTANCE = new FetchedAppSettingsManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = FetchedAppSettingsManager.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> APP_SETTING_FIELDS = CollectionsKt.listOf((Object[]) new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", "app_events_config.os_version(" + Build.VERSION.RELEASE + ')'});

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Map<String, C1679d> fetchedAppSettings = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<FetchAppSettingState> loadingState = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentLinkedQueue<InterfaceC1668a> fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean printedSDKUpdatedMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static JSONArray unityEventBindings;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$FetchAppSettingState;", "", "(Ljava/lang/String;I)V", "NOT_LOADED", "LOADING", "SUCCESS", "ERROR", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* JADX INFO: renamed from: com.facebook.internal.FetchedAppSettingsManager$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/internal/FetchedAppSettingsManager$a;", "", "Lcom/facebook/internal/d;", "fetchedAppSettings", "", "a", "(Lcom/facebook/internal/d;)V", "onError", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC1668a {
        /* JADX INFO: renamed from: a */
        void mo8757a(@Nullable C1679d fetchedAppSettings);

        void onError();
    }

    /* JADX INFO: renamed from: a */
    public static void m8739a(Context context, String str, String str2) {
        JSONObject jSONObject;
        context.getClass();
        str.getClass();
        str2.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        C1679d c1679dM8749i = null;
        String string = sharedPreferences.getString(str, null);
        if (!C1680e.m8886c0(string)) {
            if (string == null) {
                wtq0.m207906a("Required value was null.");
                return;
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                C1680e.m8896i0("FacebookSDK", e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                c1679dM8749i = INSTANCE.m8749i(str2, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        JSONObject jSONObjectM8748e = fetchedAppSettingsManager.m8748e(str2);
        if (jSONObjectM8748e != null) {
            fetchedAppSettingsManager.m8749i(str2, jSONObjectM8748e);
            sharedPreferences.edit().putString(str, jSONObjectM8748e.toString()).apply();
        }
        if (c1679dM8749i != null) {
            String strM8848t = c1679dM8749i.getSdkUpdateMessage();
            if (!printedSDKUpdatedMessage && strM8848t != null && strM8848t.length() > 0) {
                printedSDKUpdatedMessage = true;
            }
        }
        C1678c.m8823k(str2, true);
        vj1.m201432h();
        loadingState.set(fetchedAppSettings.containsKey(str2) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.m8756q();
    }

    /* JADX INFO: renamed from: b */
    public static void m8740b(InterfaceC1668a interfaceC1668a) {
        interfaceC1668a.onError();
    }

    /* JADX INFO: renamed from: c */
    public static void m8741c(InterfaceC1668a interfaceC1668a, C1679d c1679d) {
        interfaceC1668a.mo8757a(c1679d);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m8742d(@NotNull InterfaceC1668a callback) {
        callback.getClass();
        fetchedAppSettingsCallbacks.add(callback);
        m8745h();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final C1679d m8743f(@Nullable String applicationId) {
        if (applicationId != null) {
            return fetchedAppSettings.get(applicationId);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Map<String, Boolean> m8744g() {
        JSONObject jSONObject;
        Context contextM8101l = C1600c.m8101l();
        String strM8102m = C1600c.m8102m();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = contextM8101l.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM8102m}, 1)), null);
        if (!C1680e.m8886c0(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    C1680e.m8896i0("FacebookSDK", e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    return INSTANCE.m8754o(jSONObject);
                }
            } else {
                wtq0.m207906a("Required value was null.");
            }
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m8745h() {
        final Context contextM8101l = C1600c.m8101l();
        final String strM8102m = C1600c.m8102m();
        if (C1680e.m8886c0(strM8102m)) {
            loadingState.set(FetchAppSettingState.ERROR);
            INSTANCE.m8756q();
            return;
        }
        if (fetchedAppSettings.containsKey(strM8102m)) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            INSTANCE.m8756q();
            return;
        }
        AtomicReference<FetchAppSettingState> atomicReference = loadingState;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!m31.m156916a(atomicReference, fetchAppSettingState, fetchAppSettingState2) && !m31.m156916a(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2)) {
            INSTANCE.m8756q();
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        final String str = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strM8102m}, 1));
        C1600c.m8110u().execute(new Runnable() { // from class: l.eii
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.m8739a(contextM8101l, str, strM8102m);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ ArrayList m8746l(FetchedAppSettingsManager fetchedAppSettingsManager, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fetchedAppSettingsManager.m8751k(jSONObject, z);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: r */
    public static final C1679d m8747r(@NotNull String applicationId, boolean forceRequery) {
        applicationId.getClass();
        if (!forceRequery) {
            Map<String, C1679d> map = fetchedAppSettings;
            if (map.containsKey(applicationId)) {
                return map.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = INSTANCE;
        C1679d c1679dM8749i = fetchedAppSettingsManager.m8749i(applicationId, fetchedAppSettingsManager.m8748e(applicationId));
        if (Intrinsics.m88377d(applicationId, C1600c.m8102m())) {
            loadingState.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.m8756q();
        }
        return c1679dM8749i;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m8748e(String applicationId) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(APP_SETTING_FIELDS);
        bundle.putString("fields", TextUtils.join(Constants.SEPARATOR_COMMA, arrayList));
        GraphRequest graphRequestM7639x = GraphRequest.INSTANCE.m7639x(null, "app", null);
        graphRequestM7639x.m7571D(true);
        graphRequestM7639x.m7574G(bundle);
        JSONObject jSONObjectM7659d = graphRequestM7639x.m7579j().getJsonObject();
        return jSONObjectM7659d == null ? new JSONObject() : jSONObjectM7659d;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final C1679d m8749i(@NotNull String applicationId, @NotNull JSONObject settingsJSON) {
        applicationId.getClass();
        settingsJSON.getClass();
        JSONArray jSONArrayOptJSONArray = settingsJSON.optJSONArray("android_sdk_error_categories");
        C1676a.Companion aVar = C1676a.INSTANCE;
        C1676a c1676aM8811a = aVar.m8811a(jSONArrayOptJSONArray);
        if (c1676aM8811a == null) {
            c1676aM8811a = aVar.m8812b();
        }
        C1676a c1676a = c1676aM8811a;
        int iOptInt = settingsJSON.optInt("app_events_feature_bitmask", 0);
        boolean z = (iOptInt & 8) != 0;
        boolean z2 = (iOptInt & 16) != 0;
        boolean z3 = (iOptInt & 32) != 0;
        boolean z4 = (iOptInt & 256) != 0;
        boolean z5 = (iOptInt & 16384) != 0;
        JSONArray jSONArrayOptJSONArray2 = settingsJSON.optJSONArray("auto_event_mapping_android");
        unityEventBindings = jSONArrayOptJSONArray2;
        if (jSONArrayOptJSONArray2 != null && c1n.m107628b()) {
            byj0.m107023c(jSONArrayOptJSONArray2 != null ? jSONArrayOptJSONArray2.toString() : null);
        }
        JSONObject jSONObjectOptJSONObject = settingsJSON.optJSONObject("app_events_config");
        boolean zOptBoolean = settingsJSON.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString = settingsJSON.optString("gdpv4_nux_content", "");
        strOptString.getClass();
        boolean zOptBoolean2 = settingsJSON.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = settingsJSON.optInt("app_events_session_timeout", iy5.m142609a());
        EnumSet<SmartLoginOption> enumSetM8758a = SmartLoginOption.INSTANCE.m8758a(settingsJSON.optLong("seamless_login"));
        Map<String, Map<String, C1679d.b>> mapM8753n = m8753n(settingsJSON.optJSONObject("android_dialog_configs"));
        String strOptString2 = settingsJSON.optString("smart_login_bookmark_icon_url");
        strOptString2.getClass();
        String strOptString3 = settingsJSON.optString("smart_login_menu_icon_url");
        strOptString3.getClass();
        String strOptString4 = settingsJSON.optString("sdk_update_message");
        strOptString4.getClass();
        C1679d c1679d = new C1679d(zOptBoolean, strOptString, zOptBoolean2, iOptInt2, enumSetM8758a, mapM8753n, z, c1676a, strOptString2, strOptString3, z2, z3, jSONArrayOptJSONArray2, strOptString4, z4, z5, settingsJSON.optString("aam_rules"), settingsJSON.optString("suggested_events_setting"), settingsJSON.optString("restrictive_data_filter_params"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "maca_rules"), m8754o(settingsJSON), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "blocklist_events"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "redacted_events"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "sensitive_params"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_schema"), m8755p(settingsJSON.optJSONObject("protected_mode_rules"), "standard_params_blocked"), m8750j(jSONObjectOptJSONObject, "fb_currency"), m8750j(jSONObjectOptJSONObject, "_valueToSum"), m8746l(this, jSONObjectOptJSONObject, false, 2, null), m8751k(jSONObjectOptJSONObject, true), m8752m(settingsJSON.optJSONObject("app_events_config")));
        fetchedAppSettings.put(applicationId, c1679d);
        return c1679d;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m8750j(JSONObject originalJSON, String key) {
        JSONArray jSONArray;
        if (originalJSON != null) {
            try {
                jSONArray = originalJSON.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (Intrinsics.m88377d(jSONObject.getString(Constants.KEY_KEY), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (Intrinsics.m88377d(jSONObject2.getString(Constants.KEY_KEY), key)) {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i3 = 0; i3 < length3; i3++) {
                            arrayList.add(jSONArray3.getJSONObject(i3).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList<Pair<String, List<String>>> m8751k(JSONObject originalJSON, boolean getTestValues) {
        JSONArray jSONArray;
        ArrayList<Pair<String, List<String>>> arrayList;
        ArrayList<Pair<String, List<String>>> arrayList2 = null;
        if (originalJSON != null) {
            try {
                jSONArray = originalJSON.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return arrayList2;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<Pair<String, List<String>>> arrayList3 = null;
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString(Constants.KEY_KEY);
            if ((!Intrinsics.m88377d(string, "prod_keys") || !getTestValues) && (!Intrinsics.m88377d(string, "test_keys") || getTestValues)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                int i2 = 0;
                while (i2 < length2) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    String string2 = jSONObject2.getString(Constants.KEY_KEY);
                    if (Intrinsics.m88377d(string2, "_valueToSum") || Intrinsics.m88377d(string2, "fb_currency")) {
                        arrayList = arrayList2;
                    } else {
                        JSONArray jSONArray3 = jSONObject2.getJSONArray("value");
                        ArrayList arrayList4 = new ArrayList();
                        int length3 = jSONArray3.length();
                        int i3 = 0;
                        while (i3 < length3) {
                            ArrayList<Pair<String, List<String>>> arrayList5 = arrayList2;
                            try {
                                arrayList4.add(jSONArray3.getJSONObject(i3).getString("value"));
                                i3++;
                                arrayList2 = arrayList5;
                            } catch (Exception unused2) {
                                return arrayList5;
                            }
                        }
                        arrayList = arrayList2;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                        }
                        arrayList3.add(new Pair<>(string2, arrayList4));
                    }
                    i2++;
                    arrayList2 = arrayList;
                }
            }
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: m */
    public final Long m8752m(JSONObject parameters) {
        if (parameters == null) {
            return null;
        }
        try {
            return Long.valueOf(parameters.optLong("iap_manual_and_auto_log_dedup_window_millis"));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Map<String, Map<String, C1679d.b>> m8753n(JSONObject dialogConfigResponse) {
        JSONArray jSONArrayOptJSONArray;
        HashMap map = new HashMap();
        if (dialogConfigResponse != null && (jSONArrayOptJSONArray = dialogConfigResponse.optJSONArray("data")) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                C1679d.b.Companion aVar = C1679d.b.INSTANCE;
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                jSONObjectOptJSONObject.getClass();
                C1679d.b bVarM8857a = aVar.m8857a(jSONObjectOptJSONObject);
                if (bVarM8857a != null) {
                    String strM8855a = bVarM8857a.getDialogName();
                    Map map2 = (Map) map.get(strM8855a);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(strM8855a, map2);
                    }
                    map2.put(bVarM8857a.getFeatureName(), bVarM8857a);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, Boolean> m8754o(JSONObject settingsJSON) {
        if (settingsJSON == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (!settingsJSON.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(settingsJSON.getBoolean("auto_log_app_events_default")));
            } catch (JSONException e) {
                C1680e.m8896i0("FacebookSDK", e);
            }
        }
        if (!settingsJSON.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(settingsJSON.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException e2) {
                C1680e.m8896i0("FacebookSDK", e2);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public final JSONArray m8755p(JSONObject protectedModeSettings, String ruleType) {
        if (protectedModeSettings != null) {
            return protectedModeSettings.optJSONArray(ruleType);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m8756q() {
        FetchAppSettingState fetchAppSettingState = loadingState.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final C1679d c1679d = fetchedAppSettings.get(C1600c.m8102m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC1668a> concurrentLinkedQueue = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final InterfaceC1668a interfaceC1668aPoll = concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: l.cii
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m8740b(interfaceC1668aPoll);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<InterfaceC1668a> concurrentLinkedQueue2 = fetchedAppSettingsCallbacks;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final InterfaceC1668a interfaceC1668aPoll2 = concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: l.dii
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m8741c(interfaceC1668aPoll2, c1679d);
                        }
                    });
                }
            }
        }
    }
}
