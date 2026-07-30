package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.AppEvent;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/c3f;", "", "<init>", "()V", "", "a", "", "Lcom/facebook/appevents/AppEvent;", "events", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)V", "", "", "parameters", "eventName", "c", "(Ljava/util/Map;Ljava/lang/String;)V", "b", "", "Z", "enabled", "Ll/c3f$a;", "Ljava/util/List;", "deprecatedParamFilters", "", "Ljava/util/Set;", "deprecatedEvents", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c3f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final c3f INSTANCE = new c3f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<C16049a> deprecatedParamFilters = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> deprecatedEvents = new HashSet();

    /* JADX INFO: renamed from: l.c3f$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/c3f$a;", "", "", "eventName", "", "deprecateParams", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C16049a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<String> deprecateParams;

        public C16049a(@NotNull String str, @NotNull List<String> list) {
            str.getClass();
            list.getClass();
            this.eventName = str;
            this.deprecateParams = list;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<String> m105012a() {
            return this.deprecateParams;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: c */
        public final void m105014c(@NotNull List<String> list) {
            list.getClass();
            this.deprecateParams = list;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m105008a() {
        if (lsb.m151554d(c3f.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.m105011b();
        } catch (Throwable th) {
            lsb.m151552b(th, c3f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m105009c(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        if (lsb.m151554d(c3f.class)) {
            return;
        }
        try {
            parameters.getClass();
            eventName.getClass();
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C16049a c16049a : new ArrayList(deprecatedParamFilters)) {
                    if (Intrinsics.m87488d(c16049a.getEventName(), eventName)) {
                        for (String str : arrayList) {
                            if (c16049a.m105012a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, c3f.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m105010d(@NotNull List<AppEvent> events) {
        if (lsb.m151554d(c3f.class)) {
            return;
        }
        try {
            events.getClass();
            if (enabled) {
                Iterator<AppEvent> it = events.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, c3f.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m105011b() {
        try {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
                if (c1656dM8693r == null) {
                    return;
                }
                String restrictiveDataSetting = c1656dM8693r.getRestrictiveDataSetting();
                if (restrictiveDataSetting != null && restrictiveDataSetting.length() > 0) {
                    JSONObject jSONObject = new JSONObject(restrictiveDataSetting);
                    deprecatedParamFilters.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = deprecatedEvents;
                                next.getClass();
                                set.add(next);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                next.getClass();
                                C16049a c16049a = new C16049a(next, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    c16049a.m105014c(C1657e.m8850n(jSONArrayOptJSONArray));
                                }
                                deprecatedParamFilters.add(c16049a);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
