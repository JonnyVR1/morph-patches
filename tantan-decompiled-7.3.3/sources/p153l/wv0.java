package p153l;

import android.content.SharedPreferences;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import com.facebook.internal.C1680e;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R@\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00168A@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/wv0;", "", "<init>", "()V", "", "b", "Lcom/facebook/GraphResponse;", "response", "c", "(Lcom/facebook/GraphResponse;)V", "", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "", "Z", "e", "()Z", "setEnabled$facebook_core_release", "(Z)V", "isEnabled", "", "valuesToSave", Constants.INAPP_DATA_TAG, "()Ljava/util/Map;", "f", "(Ljava/util/Map;)V", "savedCloudBridgeCredentials", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class wv0 {

    @NotNull
    public static final wv0 INSTANCE = new wv0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = wv0.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isEnabled;

    /* JADX INFO: renamed from: a */
    public static void m207982a(GraphResponse graphResponse) {
        graphResponse.getClass();
        INSTANCE.m207985c(graphResponse);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m207983b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, C1600c.m8102m() + "/cloudbridge_settings", null, HttpMethod.GET, new GraphRequest.InterfaceC1539b() { // from class: l.vv0
                @Override // com.facebook.GraphRequest.InterfaceC1539b
                /* JADX INFO: renamed from: a */
                public final void mo7602a(GraphResponse graphResponse) {
                    wv0.m207982a(graphResponse);
                }
            }, null, 32, null);
            rzv.Companion companion = rzv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m183849c(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.m7580k();
        } catch (JSONException e) {
            rzv.Companion companion2 = rzv.INSTANCE;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = TAG;
            str2.getClass();
            companion2.m183849c(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", l6f.m153059b(e));
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Map<String, Object> m207984d() {
        if (ztb.m221490d(wv0.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (string != null && !StringsKt.m94329e0(string) && string2 != null && !StringsKt.m94329e0(string2) && string3 != null && !StringsKt.m94329e0(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, wv0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m207985c(@NotNull GraphResponse response) {
        Object obj;
        boolean zBooleanValue;
        response.getClass();
        if (response.getError() != null) {
            rzv.Companion companion = rzv.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            str.getClass();
            companion.m183849c(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", response.getError().toString(), String.valueOf(response.getError().getException()));
            Map<String, Object> mapM207984d = m207984d();
            if (mapM207984d != null) {
                URL url = new URL(String.valueOf(mapM207984d.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests.m7742d(String.valueOf(mapM207984d.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + url.getHost(), String.valueOf(mapM207984d.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                isEnabled = true;
                return;
            }
            return;
        }
        rzv.Companion companion2 = rzv.INSTANCE;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String str2 = TAG;
        str2.getClass();
        companion2.m183849c(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", response);
        JSONObject graphObject = response.getGraphObject();
        if (graphObject != null) {
            try {
                obj = graphObject.get("data");
            } catch (NullPointerException e) {
                rzv.Companion companion3 = rzv.INSTANCE;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.APP_EVENTS;
                String str3 = TAG;
                str3.getClass();
                companion3.m183849c(loggingBehavior3, str3, "CloudBridge Settings API response is not a valid json: \n%s ", l6f.m153059b(e));
                return;
            } catch (JSONException e2) {
                rzv.Companion companion4 = rzv.INSTANCE;
                LoggingBehavior loggingBehavior4 = LoggingBehavior.APP_EVENTS;
                String str4 = TAG;
                str4.getClass();
                companion4.m183849c(loggingBehavior4, str4, "CloudBridge Settings API response is not a valid json: \n%s ", l6f.m153059b(e2));
                return;
            }
        } else {
            obj = null;
        }
        obj.getClass();
        Map<String, ? extends Object> mapM8906o = C1680e.m8906o(new JSONObject((String) CollectionsKt.firstOrNull((List) C1680e.m8904n((JSONArray) obj))));
        String str5 = (String) mapM8906o.get(SettingsAPIFields.URL.getRawValue());
        String str6 = (String) mapM8906o.get(SettingsAPIFields.DATASETID.getRawValue());
        String str7 = (String) mapM8906o.get(SettingsAPIFields.ACCESSKEY.getRawValue());
        if (str5 == null || str6 == null || str7 == null) {
            str2.getClass();
            companion2.m183848b(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
            return;
        }
        try {
            AppEventsConversionsAPITransformerWebRequests.m7742d(str6, str5, str7);
            m207987f(mapM8906o);
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
            if (mapM8906o.get(settingsAPIFields.getRawValue()) != null) {
                Object obj2 = mapM8906o.get(settingsAPIFields.getRawValue());
                obj2.getClass();
                zBooleanValue = ((Boolean) obj2).booleanValue();
            } else {
                zBooleanValue = false;
            }
            isEnabled = zBooleanValue;
        } catch (MalformedURLException e3) {
            rzv.Companion companion5 = rzv.INSTANCE;
            LoggingBehavior loggingBehavior5 = LoggingBehavior.APP_EVENTS;
            String str8 = TAG;
            str8.getClass();
            companion5.m183849c(loggingBehavior5, str8, "CloudBridge Settings API response doesn't have valid url\n %s ", l6f.m153059b(e3));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m207986e() {
        return isEnabled;
    }

    /* JADX INFO: renamed from: f */
    public final void m207987f(@Nullable Map<String, ? extends Object> map) {
        SharedPreferences sharedPreferences = C1600c.m8101l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        editorEdit2.putString(settingsAPIFields.getRawValue(), obj.toString());
        editorEdit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        editorEdit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        editorEdit2.apply();
        rzv.INSTANCE.m183849c(LoggingBehavior.APP_EVENTS, TAG.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
