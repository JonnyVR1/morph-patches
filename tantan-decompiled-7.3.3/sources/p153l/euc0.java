package p153l;

import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR2\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u00110\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Ll/euc0;", "", "<init>", "()V", "", "a", "", "eventName", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "c", "b", "", "Z", "enabled", "", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "Ljava/util/Map;", "redactedEvents", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class euc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final euc0 INSTANCE = new euc0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> redactedEvents = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m122555a() {
        if (ztb.m221490d(euc0.class)) {
            return;
        }
        try {
            INSTANCE.m122558c();
            if (redactedEvents.isEmpty()) {
                return;
            }
            enabled = true;
        } catch (Throwable th) {
            ztb.m221488b(th, euc0.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m122556d(@NotNull String eventName) {
        String strM122557b;
        if (ztb.m221490d(euc0.class)) {
            return null;
        }
        try {
            eventName.getClass();
            return (!enabled || (strM122557b = INSTANCE.m122557b(eventName)) == null) ? eventName : strM122557b;
        } catch (Throwable th) {
            ztb.m221488b(th, euc0.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m122557b(String eventName) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            for (String str : redactedEvents.keySet()) {
                HashSet<String> hashSet = redactedEvents.get(str);
                if (hashSet != null && hashSet.contains(eventName)) {
                    return str;
                }
            }
            return null;
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m122558c() {
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
                redactedEvents = new HashMap();
                JSONArray redactedEvents2 = c1679dM8747r.getRedactedEvents();
                if (redactedEvents2 == null || redactedEvents2.length() == 0) {
                    return;
                }
                int length = redactedEvents2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = redactedEvents2.getJSONObject(i);
                    boolean zHas = jSONObject.has(Constants.KEY_KEY);
                    boolean zHas2 = jSONObject.has("value");
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(Constants.KEY_KEY);
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (string != null && (hashSetM8902m = C1680e.m8902m(jSONArray)) != null) {
                            redactedEvents.put(string, hashSetM8902m);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
