package p153l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J3\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\b2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0016R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, m88121d2 = {"Ll/ype0;", "", "<init>", "()V", "", "a", "Landroid/os/Bundle;", "parameters", "", "eventName", "c", "(Landroid/os/Bundle;Ljava/lang/String;)V", "b", "parameterKey", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "sensitiveParamsForEvent", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/util/HashSet;)Z", "Z", "enabled", "Ljava/util/HashSet;", "defaultSensitiveParameters", "", "Ljava/util/Map;", "sensitiveParameters", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ype0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final ype0 INSTANCE = new ype0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static HashSet<String> defaultSensitiveParameters = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m217017a() {
        if (ztb.m221490d(ype0.class)) {
            return;
        }
        try {
            INSTANCE.m217019b();
            if (defaultSensitiveParameters.isEmpty() && sensitiveParameters.isEmpty()) {
                enabled = false;
            } else {
                enabled = true;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, ype0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m217018c(@Nullable Bundle parameters, @NotNull String eventName) {
        if (ztb.m221490d(ype0.class)) {
            return;
        }
        try {
            eventName.getClass();
            if (enabled && parameters != null) {
                if (!defaultSensitiveParameters.isEmpty() || sensitiveParameters.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet<String> hashSet = sensitiveParameters.get(eventName);
                        for (String str : new ArrayList(parameters.keySet())) {
                            ype0 ype0Var = INSTANCE;
                            str.getClass();
                            if (ype0Var.m217020d(str, hashSet)) {
                                parameters.remove(str);
                                jSONArray.put(str);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        parameters.putString("_filteredKey", jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, ype0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m217019b() {
        HashSet<String> hashSetM8902m;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            C1679d c1679dM8747r = FetchedAppSettingsManager.m8747r(C1600c.m8102m(), false);
            if (c1679dM8747r == null) {
                return;
            }
            try {
                defaultSensitiveParameters = new HashSet<>();
                sensitiveParameters = new HashMap();
                JSONArray sensitiveParams = c1679dM8747r.getSensitiveParams();
                if (sensitiveParams == null || sensitiveParams.length() == 0) {
                    return;
                }
                int length = sensitiveParams.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = sensitiveParams.getJSONObject(i);
                    boolean zHas = jSONObject.has(Constants.KEY_KEY);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(Constants.KEY_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (jSONArray != null && (hashSetM8902m = C1680e.m8902m(jSONArray)) != null) {
                            if (string.equals("_MTSDK_Default_")) {
                                defaultSensitiveParameters = hashSetM8902m;
                            } else {
                                sensitiveParameters.put(string, hashSetM8902m);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m217020d(String parameterKey, HashSet<String> sensitiveParamsForEvent) {
        if (ztb.m221490d(this)) {
            return false;
        }
        try {
            if (defaultSensitiveParameters.contains(parameterKey)) {
                return true;
            }
            return (sensitiveParamsForEvent == null || sensitiveParamsForEvent.isEmpty() || !sensitiveParamsForEvent.contains(parameterKey)) ? false : true;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return false;
        }
    }
}
