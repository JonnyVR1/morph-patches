package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.rzv;
import p153l.wtq0;

/* JADX INFO: renamed from: com.facebook.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\fB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, m88121d2 = {"Lcom/facebook/f;", "", "Landroid/content/Context;", "context", "", "cacheKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "", "a", "()V", Constants.KEY_KEY, StickerBundle.TYPE, "b", "(Ljava/lang/String;Landroid/os/Bundle;)V", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "cache", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1623f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final String f6403c = C1623f.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final SharedPreferences cache;

    /* JADX INFO: renamed from: com.facebook.f$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ%\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0018R\u0014\u0010+\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0018R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\u0018R\u0014\u0010-\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u0018R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u0018R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u0018R\u0014\u00100\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\u0018R\u0014\u00101\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u0018R\u0014\u00102\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\u0018R\u0014\u00103\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u0018R\u0014\u00104\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u0018R\u0014\u00105\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u0018R\u0014\u00106\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010\u0018R\u0014\u00107\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u0018R\u0014\u00108\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010\u0018R\u0014\u00109\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010\u0018R\u0014\u0010:\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010\u0018R\u0014\u0010;\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010\u0018R\u0014\u0010<\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010\u0018¨\u0006="}, m88121d2 = {"Lcom/facebook/f$a;", "", "<init>", "()V", "Landroid/os/Bundle;", StickerBundle.TYPE, "", "g", "(Landroid/os/Bundle;)Z", "", "f", "(Landroid/os/Bundle;)Ljava/lang/String;", "Ljava/util/Date;", "c", "(Landroid/os/Bundle;)Ljava/util/Date;", "Lcom/facebook/AccessTokenSource;", "e", "(Landroid/os/Bundle;)Lcom/facebook/AccessTokenSource;", Constants.INAPP_DATA_TAG, "a", Constants.KEY_KEY, "b", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/Date;", "APPLICATION_ID_KEY", "Ljava/lang/String;", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "", "INVALID_BUNDLE_MILLISECONDS", "J", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "kotlin.jvm.PlatformType", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: a */
        public final String m8376a(@NotNull Bundle bundle) {
            bundle.getClass();
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        /* JADX INFO: renamed from: b */
        public final Date m8377b(Bundle bundle, String key) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(key, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: c */
        public final Date m8378c(@NotNull Bundle bundle) {
            bundle.getClass();
            return m8377b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: d */
        public final Date m8379d(@NotNull Bundle bundle) {
            bundle.getClass();
            return m8377b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: e */
        public final AccessTokenSource m8380e(@NotNull Bundle bundle) {
            bundle.getClass();
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (AccessTokenSource) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @JvmStatic
        @Nullable
        /* JADX INFO: renamed from: f */
        public final String m8381f(@NotNull Bundle bundle) {
            bundle.getClass();
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        @JvmStatic
        /* JADX INFO: renamed from: g */
        public final boolean m8382g(@Nullable Bundle bundle) {
            String string;
            return (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public Companion() {
        }
    }

    @JvmOverloads
    public C1623f(@NotNull Context context, @Nullable String str) {
        context.getClass();
        str = (str == null || str.length() == 0) ? "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY" : str;
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        sharedPreferences.getClass();
        this.cache = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final void m8373a() {
        this.cache.edit().clear().apply();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m8374b(String key, Bundle bundle) throws JSONException {
        String str;
        String string;
        String string2 = this.cache.getString(key, WeJson.EMPTY_MAP);
        if (string2 == null) {
            wtq0.m207906a("Required value was null.");
            return;
        }
        JSONObject jSONObject = new JSONObject(string2);
        String string3 = jSONObject.getString("valueType");
        if (string3 != null) {
            int i = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals("stringList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        ArrayList<String> arrayList = new ArrayList<>(length);
                        while (i < length) {
                            Object obj = jSONArray.get(i);
                            if (obj == JSONObject.NULL) {
                                str = null;
                            } else {
                                obj.getClass();
                                str = (String) obj;
                            }
                            arrayList.add(i, str);
                            i++;
                        }
                        bundle.putStringArrayList(key, arrayList);
                        break;
                    }
                    break;
                case -1383386164:
                    if (string3.equals("bool[]")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        while (i < length2) {
                            zArr[i] = jSONArray2.getBoolean(i);
                            i++;
                        }
                        bundle.putBooleanArray(key, zArr);
                        break;
                    }
                    break;
                case -1374008726:
                    if (string3.equals("byte[]")) {
                        JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        while (i < length3) {
                            bArr[i] = (byte) jSONArray3.getInt(i);
                            i++;
                        }
                        bundle.putByteArray(key, bArr);
                        break;
                    }
                    break;
                case -1361632968:
                    if (string3.equals("char[]")) {
                        JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        for (int i2 = 0; i2 < length4; i2++) {
                            String string4 = jSONArray4.getString(i2);
                            if (string4 != null && string4.length() == 1) {
                                cArr[i2] = string4.charAt(0);
                            }
                        }
                        bundle.putCharArray(key, cArr);
                        break;
                    }
                    break;
                case -1325958191:
                    if (string3.equals(com.meituan.robust.Constants.DOUBLE)) {
                        bundle.putDouble(key, jSONObject.getDouble("value"));
                        break;
                    }
                    break;
                case -1097129250:
                    if (string3.equals("long[]")) {
                        JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        while (i < length5) {
                            jArr[i] = jSONArray5.getLong(i);
                            i++;
                        }
                        bundle.putLongArray(key, jArr);
                        break;
                    }
                    break;
                case -891985903:
                    if (string3.equals("string")) {
                        bundle.putString(key, jSONObject.getString("value"));
                        break;
                    }
                    break;
                case -766441794:
                    if (string3.equals("float[]")) {
                        JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        while (i < length6) {
                            fArr[i] = (float) jSONArray6.getDouble(i);
                            i++;
                        }
                        bundle.putFloatArray(key, fArr);
                        break;
                    }
                    break;
                case 104431:
                    if (string3.equals(com.meituan.robust.Constants.INT)) {
                        bundle.putInt(key, jSONObject.getInt("value"));
                        break;
                    }
                    break;
                case 3029738:
                    if (string3.equals("bool")) {
                        bundle.putBoolean(key, jSONObject.getBoolean("value"));
                        break;
                    }
                    break;
                case 3039496:
                    if (string3.equals(com.meituan.robust.Constants.BYTE)) {
                        bundle.putByte(key, (byte) jSONObject.getInt("value"));
                        break;
                    }
                    break;
                case 3052374:
                    if (string3.equals(com.meituan.robust.Constants.CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(key, string.charAt(0));
                    }
                    break;
                case 3118337:
                    if (string3.equals("enum")) {
                        try {
                            bundle.putSerializable(key, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                        } catch (ClassNotFoundException | IllegalArgumentException unused) {
                            return;
                        }
                        break;
                    }
                    break;
                case 3327612:
                    if (string3.equals(com.meituan.robust.Constants.LONG)) {
                        bundle.putLong(key, jSONObject.getLong("value"));
                        break;
                    }
                    break;
                case 97526364:
                    if (string3.equals(com.meituan.robust.Constants.FLOAT)) {
                        bundle.putFloat(key, (float) jSONObject.getDouble("value"));
                        break;
                    }
                    break;
                case 100361105:
                    if (string3.equals("int[]")) {
                        JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        while (i < length7) {
                            iArr[i] = jSONArray7.getInt(i);
                            i++;
                        }
                        bundle.putIntArray(key, iArr);
                        break;
                    }
                    break;
                case 109413500:
                    if (string3.equals(com.meituan.robust.Constants.SHORT)) {
                        bundle.putShort(key, (short) jSONObject.getInt("value"));
                        break;
                    }
                    break;
                case 1359468275:
                    if (string3.equals("double[]")) {
                        JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        while (i < length8) {
                            dArr[i] = jSONArray8.getDouble(i);
                            i++;
                        }
                        bundle.putDoubleArray(key, dArr);
                        break;
                    }
                    break;
                case 2067161310:
                    if (string3.equals("short[]")) {
                        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        while (i < length9) {
                            sArr[i] = (short) jSONArray9.getInt(i);
                            i++;
                        }
                        bundle.putShortArray(key, sArr);
                        break;
                    }
                    break;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Bundle m8375c() {
        Bundle bundle = new Bundle();
        for (String str : this.cache.getAll().keySet()) {
            try {
                str.getClass();
                m8374b(str, bundle);
            } catch (JSONException e) {
                rzv.Companion companion = rzv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str2 = f6403c;
                str2.getClass();
                companion.m183847a(loggingBehavior, 5, str2, "Error reading cached value for key: '" + str + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ C1623f(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
