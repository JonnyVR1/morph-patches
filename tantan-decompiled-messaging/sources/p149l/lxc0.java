package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J!\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/lxc0;", "", "<init>", "()V", "", "a", "", "eventName", "e", "(Ljava/lang/String;)Ljava/lang/String;", "", "parameters", "f", "(Ljava/util/Map;Ljava/lang/String;)V", "c", "paramKey", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "Z", "enabled", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "Ll/lxc0$a;", "Ljava/util/List;", "restrictiveParamFilters", "", "Ljava/util/Set;", "restrictedEvents", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class lxc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final lxc0 INSTANCE = new lxc0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = lxc0.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final List<C18345a> restrictiveParamFilters = new ArrayList();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: l.lxc0$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/lxc0$a;", "", "", "eventName", "", "restrictiveParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "(Ljava/util/Map;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18345a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Map<String, String> restrictiveParams;

        public C18345a(@NotNull String str, @NotNull Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.eventName = str;
            this.restrictiveParams = map;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Map<String, String> m152056b() {
            return this.restrictiveParams;
        }

        /* JADX INFO: renamed from: c */
        public final void m152057c(@NotNull Map<String, String> map) {
            map.getClass();
            this.restrictiveParams = map;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m152049a() {
        if (lsb.m151554d(lxc0.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.m152053c();
        } catch (Throwable th) {
            lsb.m151552b(th, lxc0.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m152050e(@NotNull String eventName) {
        if (lsb.m151554d(lxc0.class)) {
            return null;
        }
        try {
            eventName.getClass();
            return (enabled && INSTANCE.m152054d(eventName)) ? "_removed_" : eventName;
        } catch (Throwable th) {
            lsb.m151552b(th, lxc0.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m152051f(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (lsb.m151554d(lxc0.class)) {
            return;
        }
        try {
            parameters.getClass();
            eventName.getClass();
            if (enabled) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String strM152052b = INSTANCE.m152052b(eventName, str);
                    if (strM152052b != null) {
                        map.put(str, strM152052b);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put("_restrictedParams", jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, lxc0.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m152052b(String eventName, String paramKey) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            for (C18345a c18345a : new ArrayList(restrictiveParamFilters)) {
                if (c18345a != null && Intrinsics.m87488d(eventName, c18345a.getEventName())) {
                    for (String str : c18345a.m152056b().keySet()) {
                        if (Intrinsics.m87488d(paramKey, str)) {
                            return c18345a.m152056b().get(str);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m152053c() {
        String restrictiveDataSetting;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null || (restrictiveDataSetting = c1656dM8693r.getRestrictiveDataSetting()) == null || restrictiveDataSetting.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
            restrictiveParamFilters.clear();
            restrictedEvents.clear();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    next.getClass();
                    C18345a c18345a = new C18345a(next, new HashMap());
                    if (jSONObjectOptJSONObject != null) {
                        c18345a.m152057c(C1657e.m8854p(jSONObjectOptJSONObject));
                        restrictiveParamFilters.add(c18345a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        restrictedEvents.add(c18345a.getEventName());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m152054d(String eventName) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }
}
