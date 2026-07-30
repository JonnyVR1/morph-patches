package p149l;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.Message;
import com.p046p1.mobile.putong.data.Mobile;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*¨\u0006,"}, m87232d2 = {"Ll/yfw;", "", "<init>", "()V", "", "a", "Lorg/json/JSONObject;", "logic", "", "c", "(Lorg/json/JSONObject;)Ljava/lang/String;", "variable", "values", "Landroid/os/Bundle;", "data", "", "j", "(Ljava/lang/String;Lorg/json/JSONObject;Landroid/os/Bundle;)Z", "Lorg/json/JSONArray;", "jsonArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "(Lorg/json/JSONArray;)Ljava/util/ArrayList;", "ruleString", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", CommandMessage.PARAMS, Constants.INAPP_DATA_TAG, "(Landroid/os/Bundle;)Ljava/lang/String;", NotificationCompat.CATEGORY_EVENT, "h", "(Landroid/os/Bundle;Ljava/lang/String;)V", "b", RXScreenCaptureService.KEY_INDEX, "(Landroid/os/Bundle;)V", "g", "Z", "enabled", "Lorg/json/JSONArray;", "MACARules", "", "[Ljava/lang/String;", UserMetadata.KEYDATA_FILENAME, "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class yfw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static JSONArray MACARules;

    @NotNull
    public static final yfw INSTANCE = new yfw();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static String[] keys = {NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m214583a() {
        if (lsb.m151554d(yfw.class)) {
            return;
        }
        try {
            INSTANCE.m214592g();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m214584b(@NotNull Bundle params, @NotNull String event) {
        if (lsb.m151554d(yfw.class)) {
            return;
        }
        try {
            params.getClass();
            event.getClass();
            params.putString(NotificationCompat.CATEGORY_EVENT, event);
            StringBuilder sb = new StringBuilder();
            C1657e c1657e = C1657e.INSTANCE;
            Locale localeM8870I = c1657e.m8870I();
            String language = localeM8870I != null ? localeM8870I.getLanguage() : null;
            String str = "";
            if (language == null) {
                language = "";
            }
            sb.append(language);
            sb.append('_');
            Locale localeM8870I2 = c1657e.m8870I();
            String country = localeM8870I2 != null ? localeM8870I2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb.append(country);
            params.putString("_locale", sb.toString());
            String strM8872P = c1657e.m8872P();
            if (strM8872P == null) {
                strM8872P = "";
            }
            params.putString("_appVersion", strM8872P);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", Mobile.TYPE);
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            params.putString("_deviceModel", str2);
            params.putString("_nativeAppID", C1577c.m8048m());
            String strM8872P2 = c1657e.m8872P();
            if (strM8872P2 != null) {
                str = strM8872P2;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", c1657e.m8868E());
            params.putString("_carrier", c1657e.m8888z());
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", c1657e.m8885x());
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m214585c(@NotNull JSONObject logic) {
        if (lsb.m151554d(yfw.class)) {
            return null;
        }
        try {
            logic.getClass();
            Iterator<String> itKeys = logic.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m214586d(@Nullable Bundle params) {
        String strOptString;
        if (lsb.m151554d(yfw.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return WeJson.EMPTY_ARR;
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return WeJson.EMPTY_ARR;
            }
            JSONArray jSONArray2 = MACARules;
            jSONArray2.getClass();
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                String strOptString2 = jSONArray2.optString(i);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString(Message.RULE)) != null && m214588f(strOptString, params)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            string.getClass();
            return string;
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final ArrayList<String> m214587e(@Nullable JSONArray jsonArray) {
        if (lsb.m151554d(yfw.class) || jsonArray == null) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            int length = jsonArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jsonArray.get(i).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m214588f(@Nullable String ruleString, @Nullable Bundle data) {
        if (!lsb.m151554d(yfw.class) && ruleString != null && data != null) {
            try {
                JSONObject jSONObject = new JSONObject(ruleString);
                String strM214585c = m214585c(jSONObject);
                if (strM214585c == null) {
                    return false;
                }
                Object obj = jSONObject.get(strM214585c);
                int iHashCode = strM214585c.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strM214585c.equals("not")) {
                            return !m214588f(obj.toString(), data);
                        }
                    } else if (strM214585c.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (!m214588f(jSONArray.get(i).toString(), data)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strM214585c.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (m214588f(jSONArray2.get(i2).toString(), data)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return m214591j(strM214585c, jSONObject2, data);
            } catch (Throwable th) {
                lsb.m151552b(th, yfw.class);
            }
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final void m214589h(@Nullable Bundle params, @NotNull String event) {
        if (lsb.m151554d(yfw.class)) {
            return;
        }
        try {
            event.getClass();
            if (!enabled || params == null) {
                return;
            }
            try {
                m214584b(params, event);
                params.putString("_audiencePropertyIds", m214586d(params));
                params.putString("cs_maca", "1");
                m214590i(params);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final void m214590i(@NotNull Bundle params) {
        if (lsb.m151554d(yfw.class)) {
            return;
        }
        try {
            params.getClass();
            for (String str : keys) {
                params.remove(str);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x01d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x0202 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:130:0x0203 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x0210 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:0x0211 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0217 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0218 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0222 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0262 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:190:0x02fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:191:0x02fb A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:197:0x030f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:198:0x0310 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:211:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:0: B:140:0x021c->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:? A[LOOP:1: B:155:0x025c->B:215:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:5:0x000a, B:8:0x0017, B:11:0x0032, B:20:0x0045, B:27:0x0060, B:28:0x0065, B:30:0x006a, B:33:0x0074, B:35:0x008d, B:38:0x0097, B:42:0x00a3, B:136:0x0211, B:139:0x0218, B:140:0x021c, B:142:0x0222, B:45:0x00ad, B:48:0x00b7, B:50:0x00d0, B:151:0x0251, B:154:0x0258, B:155:0x025c, B:157:0x0262, B:53:0x00da, B:56:0x00e4, B:58:0x00fd, B:108:0x01ad, B:61:0x0107, B:101:0x0191, B:64:0x0111, B:91:0x016b, B:67:0x011b, B:70:0x0125, B:127:0x01f2, B:73:0x012f, B:76:0x0139, B:198:0x0310, B:79:0x0143, B:115:0x01c3, B:82:0x014d, B:85:0x0157, B:122:0x01df, B:88:0x0161, B:95:0x017d, B:98:0x0187, B:105:0x01a3, B:112:0x01b9, B:119:0x01d5, B:124:0x01e8, B:131:0x0204, B:146:0x0244, B:161:0x0284, B:164:0x028e, B:168:0x02aa, B:171:0x02b4, B:173:0x02bd, B:191:0x02fb, B:176:0x02c6, B:179:0x02cf, B:181:0x02dd, B:184:0x02e6, B:186:0x02ef, B:193:0x0304, B:200:0x0319, B:203:0x0322, B:23:0x0056), top: B:209:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x017c A[RETURN] */
    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m214591j(@NotNull String variable, @NotNull JSONObject values, @Nullable Bundle data) {
        Object obj;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        if (lsb.m151554d(yfw.class)) {
            return false;
        }
        try {
            variable.getClass();
            values.getClass();
            String strM214585c = m214585c(values);
            if (strM214585c == null) {
                return false;
            }
            String string = values.get(strM214585c).toString();
            ArrayList<String> arrayListM214587e = m214587e(values.optJSONArray(strM214585c));
            if (Intrinsics.m87488d(strM214585c, "exists")) {
                return data != null && data.containsKey(variable) == Boolean.parseBoolean(string);
            }
            if (data != null) {
                String lowerCase5 = variable.toLowerCase(Locale.ROOT);
                lowerCase5.getClass();
                obj = data.get(lowerCase5);
                if (obj == null) {
                    if (data != null) {
                        obj = data.get(variable);
                    } else {
                        obj = null;
                    }
                    if (obj == null) {
                        return false;
                    }
                }
            } else {
                if (data != null) {
                    obj = data.get(variable);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    return false;
                }
            }
            switch (strM214585c.hashCode()) {
                case -1729128927:
                    if (strM214585c.equals("i_not_contains")) {
                        String string2 = obj.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase6 = string2.toLowerCase(locale);
                        lowerCase6.getClass();
                        String lowerCase7 = string.toLowerCase(locale);
                        lowerCase7.getClass();
                        return !StringsKt.m93412P(lowerCase6, lowerCase7, false, 2, null);
                    }
                    return false;
                case -1179774633:
                    if (!strM214585c.equals("is_any")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    return arrayListM214587e.contains(obj.toString());
                case -1039699439:
                    if (!strM214585c.equals("not_in")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    return arrayListM214587e.contains(obj.toString());
                case -969266188:
                    if (strM214585c.equals("starts_with")) {
                        return C15386d.m93483J(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -966353971:
                    if (strM214585c.equals("regex_match")) {
                        return new Regex(string).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!strM214585c.equals("is_not_any")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    return arrayListM214587e.contains(obj.toString());
                case -567445985:
                    if (strM214585c.equals("contains")) {
                        return StringsKt.m93412P(obj.toString(), string, false, 2, null);
                    }
                    return false;
                case -327990090:
                    if (!strM214585c.equals("i_str_neq")) {
                        return false;
                    }
                    String string3 = obj.toString();
                    Locale locale2 = Locale.ROOT;
                    String lowerCase8 = string3.toLowerCase(locale2);
                    lowerCase8.getClass();
                    String lowerCase9 = string.toLowerCase(locale2);
                    lowerCase9.getClass();
                    return !Intrinsics.m87488d(lowerCase8, lowerCase9);
                case -159812115:
                    if (!strM214585c.equals("i_is_any")) {
                        return false;
                    }
                    if (arrayListM214587e != null || arrayListM214587e.isEmpty()) {
                        return false;
                    }
                    for (String str : arrayListM214587e) {
                        Locale locale3 = Locale.ROOT;
                        lowerCase = str.toLowerCase(locale3);
                        lowerCase.getClass();
                        lowerCase2 = obj.toString().toLowerCase(locale3);
                        lowerCase2.getClass();
                        if (Intrinsics.m87488d(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case -92753547:
                    if (!strM214585c.equals("i_str_not_in")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    if (arrayListM214587e.isEmpty()) {
                        return true;
                    }
                    for (String str2 : arrayListM214587e) {
                        Locale locale4 = Locale.ROOT;
                        lowerCase3 = str2.toLowerCase(locale4);
                        lowerCase3.getClass();
                        lowerCase4 = obj.toString().toLowerCase(locale4);
                        lowerCase4.getClass();
                        if (Intrinsics.m87488d(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 60:
                    if (!strM214585c.equals("<")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 61:
                    if (!strM214585c.equals("=")) {
                        return false;
                    }
                    return Intrinsics.m87488d(obj.toString(), string);
                case 62:
                    if (!strM214585c.equals(">")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1084:
                    if (!strM214585c.equals("!=")) {
                        return false;
                    }
                    if (Intrinsics.m87488d(obj.toString(), string)) {
                        return false;
                    }
                    return true;
                case 1921:
                    if (!strM214585c.equals("<=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 1952:
                    if (!strM214585c.equals("==")) {
                        return false;
                    }
                    return Intrinsics.m87488d(obj.toString(), string);
                case 1983:
                    if (!strM214585c.equals(">=")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3244:
                    if (!strM214585c.equals("eq")) {
                        return false;
                    }
                    return Intrinsics.m87488d(obj.toString(), string);
                case 3294:
                    if (!strM214585c.equals("ge")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3309:
                    if (!strM214585c.equals("gt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) > Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3365:
                    if (!strM214585c.equals("in")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    return arrayListM214587e.contains(obj.toString());
                case 3449:
                    if (!strM214585c.equals("le")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3464:
                    if (!strM214585c.equals("lt")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) < Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 3511:
                    if (!strM214585c.equals("ne")) {
                        return false;
                    }
                    if (Intrinsics.m87488d(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 102680:
                    if (!strM214585c.equals("gte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 107485:
                    if (!strM214585c.equals("lte")) {
                        return false;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        return true;
                    }
                    return false;
                case 108954:
                    if (!strM214585c.equals("neq")) {
                        return false;
                    }
                    if (Intrinsics.m87488d(obj.toString(), string)) {
                        return true;
                    }
                    return false;
                case 127966736:
                    if (!strM214585c.equals("i_str_eq")) {
                        return false;
                    }
                    String string4 = obj.toString();
                    Locale locale5 = Locale.ROOT;
                    String lowerCase10 = string4.toLowerCase(locale5);
                    lowerCase10.getClass();
                    String lowerCase11 = string.toLowerCase(locale5);
                    lowerCase11.getClass();
                    return Intrinsics.m87488d(lowerCase10, lowerCase11);
                case 127966857:
                    if (!strM214585c.equals("i_str_in")) {
                        return false;
                    }
                    if (arrayListM214587e != null) {
                        return false;
                    }
                    while (r7.hasNext()) {
                        Locale locale6 = Locale.ROOT;
                        lowerCase = str.toLowerCase(locale6);
                        lowerCase.getClass();
                        lowerCase2 = obj.toString().toLowerCase(locale6);
                        lowerCase2.getClass();
                        if (Intrinsics.m87488d(lowerCase, lowerCase2)) {
                            return true;
                        }
                    }
                    return false;
                case 363990325:
                    if (!strM214585c.equals("i_contains")) {
                        return false;
                    }
                    String string5 = obj.toString();
                    Locale locale7 = Locale.ROOT;
                    String lowerCase12 = string5.toLowerCase(locale7);
                    lowerCase12.getClass();
                    String lowerCase13 = string.toLowerCase(locale7);
                    lowerCase13.getClass();
                    return StringsKt.m93412P(lowerCase12, lowerCase13, false, 2, null);
                case 1091487233:
                    if (!strM214585c.equals("i_is_not_any")) {
                        return false;
                    }
                    if (arrayListM214587e == null) {
                        return false;
                    }
                    if (arrayListM214587e.isEmpty()) {
                        return true;
                    }
                    while (r7.hasNext()) {
                        Locale locale8 = Locale.ROOT;
                        lowerCase3 = str2.toLowerCase(locale8);
                        lowerCase3.getClass();
                        lowerCase4 = obj.toString().toLowerCase(locale8);
                        lowerCase4.getClass();
                        if (Intrinsics.m87488d(lowerCase3, lowerCase4)) {
                            return false;
                        }
                    }
                    return true;
                case 1918401035:
                    return strM214585c.equals("not_contains") && !StringsKt.m93412P(obj.toString(), string, false, 2, null);
                case 1961112862:
                    if (!strM214585c.equals("i_starts_with")) {
                        return false;
                    }
                    String string6 = obj.toString();
                    Locale locale9 = Locale.ROOT;
                    String lowerCase14 = string6.toLowerCase(locale9);
                    lowerCase14.getClass();
                    String lowerCase15 = string.toLowerCase(locale9);
                    lowerCase15.getClass();
                    return C15386d.m93483J(lowerCase14, lowerCase15, false, 2, null);
                default:
                    return false;
            }
        } catch (Throwable th) {
            lsb.m151552b(th, yfw.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m214592g() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            C1656d c1656dM8693r = FetchedAppSettingsManager.m8693r(C1577c.m8048m(), false);
            if (c1656dM8693r == null) {
                return;
            }
            MACARules = c1656dM8693r.getMACARuleMatchingSetting();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
