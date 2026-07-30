package com.facebook.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.FacebookRequestError;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C15386d;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: com.facebook.internal.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \"2\u00020\u0001:\u0001\u0018B\u0081\u0001\b\u0000\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R-\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR-\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f¨\u0006#"}, m87232d2 = {"Lcom/facebook/internal/a;", "", "", "", "", "otherErrors", "transientErrors", "loginRecoverableErrors", "", "otherRecoveryMessage", "transientRecoveryMessage", "loginRecoverableRecoveryMessage", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/FacebookRequestError$Category;", "category", Constants.INAPP_DATA_TAG, "(Lcom/facebook/FacebookRequestError$Category;)Ljava/lang/String;", "errorCode", "errorSubCode", "", "isTransient", "c", "(IIZ)Lcom/facebook/FacebookRequestError$Category;", "a", "Ljava/util/Map;", "getOtherErrors", "()Ljava/util/Map;", "b", "getTransientErrors", "getLoginRecoverableErrors", "Ljava/lang/String;", "e", "f", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C1653a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    @Nullable
    public static C1653a f6644g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> otherErrors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> transientErrors;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Map<Integer, Set<Integer>> loginRecoverableErrors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String otherRecoveryMessage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String transientRecoveryMessage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String loginRecoverableRecoveryMessage;

    /* JADX INFO: renamed from: com.facebook.internal.a$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\r\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010\"\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, m87232d2 = {"Lcom/facebook/internal/a$a;", "", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/internal/a;", "a", "(Lorg/json/JSONArray;)Lcom/facebook/internal/a;", "Lorg/json/JSONObject;", "definition", "", "", "", Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;)Ljava/util/Map;", "b", "()Lcom/facebook/internal/a;", "getDefaultErrorClassification$annotations", "defaultErrorClassification", "c", "defaultErrorClassificationImpl", "EC_APP_NOT_INSTALLED", "I", "EC_APP_TOO_MANY_CALLS", "EC_INVALID_SESSION", "EC_INVALID_TOKEN", "EC_RATE", "EC_SERVICE_UNAVAILABLE", "EC_TOO_MANY_USER_ACTION_CALLS", "EC_USER_TOO_MANY_CALLS", "ESC_APP_INACTIVE", "ESC_APP_NOT_INSTALLED", "", "KEY_LOGIN_RECOVERABLE", "Ljava/lang/String;", "KEY_NAME", "KEY_OTHER", "KEY_RECOVERY_MESSAGE", "KEY_TRANSIENT", "defaultInstance", "Lcom/facebook/internal/a;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final C1653a m8757a(@Nullable JSONArray jsonArray) {
            String strOptString;
            if (jsonArray == null) {
                return null;
            }
            int length = jsonArray.length();
            Map<Integer, Set<Integer>> mapM8760d = null;
            Map<Integer, Set<Integer>> mapM8760d2 = null;
            Map<Integer, Set<Integer>> mapM8760d3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString(AuthenticationTokenClaims.JSON_KEY_NAME)) != null) {
                    if (C15386d.m93490x(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM8760d = m8760d(jSONObjectOptJSONObject);
                    } else if (C15386d.m93490x(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM8760d2 = m8760d(jSONObjectOptJSONObject);
                    } else if (C15386d.m93490x(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapM8760d3 = m8760d(jSONObjectOptJSONObject);
                    }
                }
            }
            return new C1653a(mapM8760d, mapM8760d2, mapM8760d3, strOptString2, strOptString3, strOptString4);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final synchronized C1653a m8758b() {
            C1653a c1653a;
            try {
                if (C1653a.f6644g == null) {
                    C1653a.f6644g = m8759c();
                }
                c1653a = C1653a.f6644g;
                c1653a.getClass();
            } catch (Throwable th) {
                throw th;
            }
            return c1653a;
        }

        /* JADX INFO: renamed from: c */
        public final C1653a m8759c() {
            return new C1653a(null, MapsKt.hashMapOf(TuplesKt.m87240a(2, null), TuplesKt.m87240a(4, null), TuplesKt.m87240a(9, null), TuplesKt.m87240a(17, null), TuplesKt.m87240a(341, null)), MapsKt.hashMapOf(TuplesKt.m87240a(102, null), TuplesKt.m87240a(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256), null), TuplesKt.m87240a(Integer.valueOf(HttpStatus.PRECONDITION_FAILED_412), null)), null, null, null);
        }

        /* JADX INFO: renamed from: d */
        public final Map<Integer, Set<Integer>> m8760d(JSONObject definition) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = definition.optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.a$b */
    @Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6651a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            try {
                iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6651a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1653a(@Nullable Map<Integer, ? extends Set<Integer>> map, @Nullable Map<Integer, ? extends Set<Integer>> map2, @Nullable Map<Integer, ? extends Set<Integer>> map3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final FacebookRequestError.Category m8755c(int errorCode, int errorSubCode, boolean isTransient) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (isTransient) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.otherErrors;
        if (map != null && map.containsKey(Integer.valueOf(errorCode)) && ((set3 = this.otherErrors.get(Integer.valueOf(errorCode))) == null || set3.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(Integer.valueOf(errorCode)) && ((set2 = this.loginRecoverableErrors.get(Integer.valueOf(errorCode))) == null || set2.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.transientErrors;
        return (map3 != null && map3.containsKey(Integer.valueOf(errorCode)) && ((set = this.transientErrors.get(Integer.valueOf(errorCode))) == null || set.contains(Integer.valueOf(errorSubCode)))) ? FacebookRequestError.Category.TRANSIENT : FacebookRequestError.Category.OTHER;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m8756d(@Nullable FacebookRequestError.Category category) {
        int i = category == null ? -1 : b.f6651a[category.ordinal()];
        if (i == 1) {
            return this.otherRecoveryMessage;
        }
        if (i == 2) {
            return this.loginRecoverableRecoveryMessage;
        }
        if (i != 3) {
            return null;
        }
        return this.transientRecoveryMessage;
    }
}
