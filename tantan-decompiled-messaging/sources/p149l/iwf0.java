package p149l;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR2\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010 R2\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006#"}, m87232d2 = {"Ll/iwf0;", "", "<init>", "()V", "", "b", "Landroid/os/Bundle;", "parameters", "g", "(Landroid/os/Bundle;)V", "e", "Lorg/json/JSONArray;", "schema", "a", "(Lorg/json/JSONArray;)V", "paramValues", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "f", "(Lorg/json/JSONArray;)Ljava/util/HashSet;", "value", "", "expressions", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/util/Set;)Z", "enumValues", "c", "Z", "enabled", "", "Ljava/util/Map;", "regexRestrictionsConfig", "enumRestrictionsConfig", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class iwf0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    @NotNull
    public static final iwf0 INSTANCE = new iwf0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> regexRestrictionsConfig = new HashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Map<String, HashSet<String>> enumRestrictionsConfig = new HashMap();

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m138742b() {
        if (lsb.m151554d(iwf0.class)) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            INSTANCE.m138747e();
            enabled = (regexRestrictionsConfig.isEmpty() && enumRestrictionsConfig.isEmpty()) ? false : true;
        } catch (Throwable th) {
            lsb.m151552b(th, iwf0.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m138743g(@Nullable Bundle parameters) {
        if (lsb.m151554d(iwf0.class)) {
            return;
        }
        try {
            if (enabled && parameters != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : parameters.keySet()) {
                    String strValueOf = String.valueOf(parameters.get(str));
                    boolean z = regexRestrictionsConfig.get(str) != null;
                    boolean z2 = enumRestrictionsConfig.get(str) != null;
                    if (z || z2) {
                        iwf0 iwf0Var = INSTANCE;
                        boolean zM138746d = iwf0Var.m138746d(strValueOf, regexRestrictionsConfig.get(str));
                        boolean zM138745c = iwf0Var.m138745c(strValueOf, enumRestrictionsConfig.get(str));
                        if (!zM138746d && !zM138745c) {
                            str.getClass();
                            arrayList.add(str);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    parameters.remove((String) it.next());
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, iwf0.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m138744a(JSONArray schema) {
        if (lsb.m151554d(this) || schema == null) {
            return;
        }
        try {
            if (enabled) {
                return;
            }
            int length = schema.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = schema.getJSONObject(i);
                String string = jSONObject.getString(Constants.KEY_KEY);
                if (string != null && string.length() != 0) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length2 = jSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            boolean z = jSONArray.getJSONObject(i2).getBoolean("require_exact_match");
                            HashSet<String> hashSetM138748f = m138748f(jSONArray.getJSONObject(i2).getJSONArray("potential_matches"));
                            if (z) {
                                Map<String, HashSet<String>> map = enumRestrictionsConfig;
                                string.getClass();
                                HashSet<String> hashSet = enumRestrictionsConfig.get(string);
                                if (hashSet != null) {
                                    hashSet.addAll(hashSetM138748f);
                                    hashSetM138748f = hashSet;
                                }
                                map.put(string, hashSetM138748f);
                            } else {
                                Map<String, HashSet<String>> map2 = regexRestrictionsConfig;
                                string.getClass();
                                HashSet<String> hashSet2 = regexRestrictionsConfig.get(string);
                                if (hashSet2 != null) {
                                    hashSet2.addAll(hashSetM138748f);
                                    hashSetM138748f = hashSet2;
                                }
                                map2.put(string, hashSetM138748f);
                            }
                        }
                    } catch (Exception unused) {
                        enumRestrictionsConfig.remove(string);
                        regexRestrictionsConfig.remove(string);
                    }
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m138745c(String value, Set<String> enumValues) {
        if (!lsb.m151554d(this) && enumValues != null) {
            try {
                Set<String> set = enumValues;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                for (String str : set) {
                    Locale locale = Locale.ROOT;
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = value.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (Intrinsics.m87488d(lowerCase, lowerCase2)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m138746d(String value, Set<String> expressions) {
        if (!lsb.m151554d(this) && expressions != null) {
            try {
                Set<String> set = expressions;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (new Regex((String) it.next()).matches(value)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m138747e() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null) {
                return;
            }
            m138744a(c1656dM8693r.getSchemaRestrictions());
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final HashSet<String> m138748f(JSONArray paramValues) {
        try {
            if (lsb.m151554d(this)) {
                return null;
            }
            try {
                HashSet<String> hashSetM8848m = C1657e.m8848m(paramValues);
                return hashSetM8848m == null ? new HashSet<>() : hashSetM8848m;
            } catch (Exception unused) {
                return new HashSet<>();
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }
}
