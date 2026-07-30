package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.appevents.C1557h;
import com.facebook.internal.C1657e;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p149l.lsb;
import p149l.m100;

/* JADX INFO: renamed from: com.facebook.appevents.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R$\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R$\u0010&\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006'"}, m87232d2 = {"Lcom/facebook/appevents/h;", "", "<init>", "()V", "", "e", "", "b", "()Ljava/lang/String;", "", "ud", "g", "(Ljava/util/Map;)V", Constants.KEY_KEY, "value", "h", "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "type", "data", "f", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "externalHashedUserData", "internalHashedUserData", "()Ljava/util/Map;", "enabledInternalUserData", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class C1557h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static SharedPreferences sharedPreferences;

    @NotNull
    public static final C1557h INSTANCE = new C1557h();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1557h.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> externalHashedUserData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> internalHashedUserData = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m7807a(String str, String str2) {
        if (lsb.m151554d(C1557h.class)) {
            return;
        }
        try {
            str.getClass();
            str2.getClass();
            if (!initialized.get()) {
                INSTANCE.m7812d();
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                Intrinsics.m87502r("sharedPreferences");
                sharedPreferences2 = null;
            }
            sharedPreferences2.edit().putString(str, str2).apply();
        } catch (Throwable th) {
            lsb.m151552b(th, C1557h.class);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m7808b() {
        if (lsb.m151554d(C1557h.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.m7812d();
            }
            HashMap map = new HashMap();
            map.putAll(externalHashedUserData);
            map.putAll(INSTANCE.m7811c());
            return C1657e.m8847l0(map);
        } catch (Throwable th) {
            lsb.m151552b(th, C1557h.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m7809e() {
        if (lsb.m151554d(C1557h.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            INSTANCE.m7812d();
        } catch (Throwable th) {
            lsb.m151552b(th, C1557h.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m7810g(@NotNull Map<String, String> ud) {
        String[] strArr;
        List<String> listSplit;
        if (lsb.m151554d(C1557h.class)) {
            return;
        }
        try {
            ud.getClass();
            if (!initialized.get()) {
                INSTANCE.m7812d();
            }
            for (Map.Entry<String, String> entry : ud.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                C1557h c1557h = INSTANCE;
                int length = value.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.m87489e(value.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String strM8812E0 = C1657e.m8812E0(c1557h.m7813f(key, value.subSequence(i, length + 1).toString()));
                ConcurrentHashMap<String, String> concurrentHashMap = internalHashedUserData;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    if (str == null || (listSplit = new Regex(Constants.SEPARATOR_COMMA).split(str, 0)) == null || (strArr = (String[]) listSplit.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                    if (setMutableSetOf.contains(strM8812E0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(strM8812E0);
                    } else if (strArr.length < 5) {
                        sb.append(str);
                        sb.append(Constants.SEPARATOR_COMMA);
                        sb.append(strM8812E0);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(strArr[i2]);
                            sb.append(Constants.SEPARATOR_COMMA);
                        }
                        sb.append(strM8812E0);
                        setMutableSetOf.remove(strArr[0]);
                    }
                    internalHashedUserData.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, strM8812E0);
                }
            }
            INSTANCE.m7814h("com.facebook.appevents.UserDataStore.internalUserData", C1657e.m8847l0(internalHashedUserData));
        } catch (Throwable th) {
            lsb.m151552b(th, C1557h.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Map<String, String> m7811c() {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            Set<String> setM152553b = m100.INSTANCE.m152553b();
            for (String str : internalHashedUserData.keySet()) {
                if (setM152553b.contains(str)) {
                    map.put(str, internalHashedUserData.get(str));
                }
            }
            return map;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7812d() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C1577c.m8047l());
            defaultSharedPreferences.getClass();
            sharedPreferences = defaultSharedPreferences;
            SharedPreferences sharedPreferences2 = null;
            if (defaultSharedPreferences == null) {
                Intrinsics.m87502r("sharedPreferences");
                defaultSharedPreferences = null;
            }
            String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
            if (string == null) {
                string = "";
            }
            SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 == null) {
                Intrinsics.m87502r("sharedPreferences");
            } else {
                sharedPreferences2 = sharedPreferences3;
            }
            String string2 = sharedPreferences2.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
            if (string2 == null) {
                string2 = "";
            }
            externalHashedUserData.putAll(C1657e.m8840h0(string));
            internalHashedUserData.putAll(C1657e.m8840h0(string2));
            atomicBoolean.set(true);
            return;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return;
        }
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final String m7813f(String type, String data) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            int length = data.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m87489e(data.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String lowerCase = data.subSequence(i, length + 1).toString().toLowerCase();
            lowerCase.getClass();
            if (Intrinsics.m87488d("em", type)) {
                if (!Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    Log.e(TAG, "Setting email failure: this is not a valid email address");
                    return "";
                }
            } else {
                if (Intrinsics.m87488d("ph", type)) {
                    return new Regex("[^0-9]").replace(lowerCase, "");
                }
                if (Intrinsics.m87488d("ge", type)) {
                    String strSubstring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : "";
                    if (!Intrinsics.m87488d("f", strSubstring) && !Intrinsics.m87488d("m", strSubstring)) {
                        Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                        return "";
                    }
                    return strSubstring;
                }
            }
            return lowerCase;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7814h(final String key, final String value) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1577c.m8056u().execute(new Runnable() { // from class: l.w4k0
                @Override // java.lang.Runnable
                public final void run() {
                    C1557h.m7807a(key, value);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
