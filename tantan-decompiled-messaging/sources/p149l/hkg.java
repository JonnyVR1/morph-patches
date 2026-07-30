package p149l;

import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J+\u0010,\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0)H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b3\u00104J/\u0010:\u001a\u00020\t2\u0006\u00105\u001a\u00020\u00122\n\u00108\u001a\u000606j\u0002`72\n\u00109\u001a\u000606j\u0002`7H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u00100\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u0010<R\"\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010>R\"\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u0010>R\"\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010>R\u0016\u0010C\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010BR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010D¨\u0006F"}, m87232d2 = {"Ll/hkg;", "", "<init>", "()V", "", "f", "()Z", "Ljava/io/File;", "file", "", Constants.INAPP_DATA_TAG, "(Ljava/io/File;)V", "", "buttonText", "activityName", "appName", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "viewHierarchy", "", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)[F", "node", RXScreenCaptureService.KEY_INDEX, "(Lorg/json/JSONObject;)[F", "Lorg/json/JSONArray;", "siblings", "screenName", "formFieldsJSON", "h", "(Lorg/json/JSONObject;Lorg/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[F", IjkMediaMeta.IJKM_KEY_LANGUAGE, NotificationCompat.CATEGORY_EVENT, "textType", "matchText", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "pattern", "k", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "indicators", "values", "g", "([Ljava/lang/String;[Ljava/lang/String;)Z", "j", "(Lorg/json/JSONObject;Lorg/json/JSONArray;)Z", "b", "m", "([F[F)V", "e", "(Lorg/json/JSONObject;)Z", OMSTemplateModeType.view, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "textSB", "hintSB", "n", "(Lorg/json/JSONObject;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)V", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "", "Ljava/util/Map;", "languageInfo", "eventInfo", "textTypeInfo", "Lorg/json/JSONObject;", "rules", "Z", "initialized", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class hkg {

    @NotNull
    public static final hkg INSTANCE = new hkg();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static Map<String, String> languageInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static Map<String, String> eventInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static Map<String, String> textTypeInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static JSONObject rules;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static boolean initialized;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final float[] m131493a(@NotNull JSONObject viewHierarchy, @NotNull String appName) {
        if (lsb.m151554d(hkg.class)) {
            return null;
        }
        try {
            viewHierarchy.getClass();
            appName.getClass();
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                String lowerCase = appName.toLowerCase();
                lowerCase.getClass();
                JSONObject jSONObject = new JSONObject(viewHierarchy.optJSONObject(OMSTemplateModeType.view).toString());
                String strOptString = viewHierarchy.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                hkg hkgVar = INSTANCE;
                hkgVar.m131502j(jSONObject, jSONArray);
                hkgVar.m131505m(fArr, hkgVar.m131501i(jSONObject));
                JSONObject jSONObjectM131497b = hkgVar.m131497b(jSONObject);
                if (jSONObjectM131497b == null) {
                    return null;
                }
                strOptString.getClass();
                String string = jSONObject.toString();
                string.getClass();
                hkgVar.m131505m(fArr, hkgVar.m131500h(jSONObjectM131497b, jSONArray, strOptString, string, lowerCase));
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            lsb.m151552b(th, hkg.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m131494c(@NotNull String buttonText, @NotNull String activityName, @NotNull String appName) {
        if (lsb.m151554d(hkg.class)) {
            return null;
        }
        try {
            buttonText.getClass();
            activityName.getClass();
            appName.getClass();
            String lowerCase = (appName + " | " + activityName + ", " + buttonText).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            lsb.m151552b(th, hkg.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m131495d(@Nullable File file) {
        if (lsb.m151554d(hkg.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, Charsets.UTF_8));
                languageInfo = MapsKt.mapOf(TuplesKt.m87240a("ENGLISH", "1"), TuplesKt.m87240a("GERMAN", "2"), TuplesKt.m87240a("SPANISH", "3"), TuplesKt.m87240a("JAPANESE", "4"));
                eventInfo = MapsKt.mapOf(TuplesKt.m87240a("VIEW_CONTENT", "0"), TuplesKt.m87240a("SEARCH", "1"), TuplesKt.m87240a("ADD_TO_CART", "2"), TuplesKt.m87240a("ADD_TO_WISHLIST", "3"), TuplesKt.m87240a("INITIATE_CHECKOUT", "4"), TuplesKt.m87240a("ADD_PAYMENT_INFO", "5"), TuplesKt.m87240a("PURCHASE", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_INFO), TuplesKt.m87240a("LEAD", "7"), TuplesKt.m87240a("COMPLETE_REGISTRATION", com.tencent.connect.common.Constants.VIA_SHARE_TYPE_PUBLISHVIDEO));
                textTypeInfo = MapsKt.mapOf(TuplesKt.m87240a("BUTTON_TEXT", "1"), TuplesKt.m87240a("PAGE_TITLE", "2"), TuplesKt.m87240a("RESOLVED_DOCUMENT_LINK", "3"), TuplesKt.m87240a("BUTTON_ID", "4"));
                initialized = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            lsb.m151552b(th, hkg.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m131496f() {
        if (lsb.m151554d(hkg.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            lsb.m151552b(th, hkg.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m131497b(JSONObject view) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            if (view.optBoolean("is_interacted")) {
                return view;
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                jSONObject.getClass();
                JSONObject jSONObjectM131497b = m131497b(jSONObject);
                if (jSONObjectM131497b != null) {
                    return jSONObjectM131497b;
                }
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m131498e(JSONObject node) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return ((node.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m131499g(String[] indicators, String[] values) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            for (String str : indicators) {
                for (String str2 : values) {
                    if (StringsKt.m93412P(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final float[] m131500h(JSONObject node, JSONArray siblings, String screenName, String formFieldsJSON, String appName) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = siblings.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = siblings.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject = siblings.getJSONObject(i2);
                    jSONObject.getClass();
                    if (m131498e(jSONObject)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str = screenName + '|' + appName;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m131506n(node, sb2, sb);
            String string = sb.toString();
            String string2 = sb2.toString();
            fArr[15] = m131504l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[16] = m131504l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            fArr[17] = m131504l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
            fArr[18] = StringsKt.m93412P(formFieldsJSON, SignInGrantType.password, false, 2, null) ? 1.0f : 0.0f;
            fArr[19] = m131503k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[20] = m131503k("(?i)(sign in)|login|signIn", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[21] = m131503k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", formFieldsJSON) ? 1.0f : 0.0f;
            fArr[22] = m131504l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[24] = m131504l("ENGLISH", "PURCHASE", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            fArr[25] = m131503k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
            fArr[27] = m131503k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str) ? 1.0f : 0.0f;
            fArr[28] = m131504l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[29] = m131504l("ENGLISH", "LEAD", "PAGE_TITLE", str) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final float[] m131501i(JSONObject node) {
        if (lsb.m151554d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String strOptString = node.optString("text");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = node.optString(TrackReferenceTypeBox.TYPE1);
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            String strOptString3 = node.optString("classname");
            strOptString3.getClass();
            String lowerCase3 = strOptString3.toLowerCase();
            lowerCase3.getClass();
            int iOptInt = node.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m131499g(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m131499g(new String[]{SignInGrantType.password, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m131499g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m131499g(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.m93412P(lowerCase3, OMSTemplateModeType.checkbox, false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m131499g(new String[]{"complete", BLiveVoiceSingTogehterState.confirm, "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.m93412P(lowerCase3, "radio", false, 2, null) && StringsKt.m93412P(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i2);
                    jSONObject.getClass();
                    m131505m(fArr, m131501i(jSONObject));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m131502j(JSONObject node, JSONArray siblings) {
        boolean z;
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            if (node.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = node.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                }
                i++;
            }
            boolean z2 = z;
            JSONArray jSONArray = new JSONArray();
            if (z) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    siblings.put(jSONArrayOptJSONArray.getJSONObject(i2));
                }
                return z2;
            }
            int length3 = jSONArrayOptJSONArray.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i3);
                jSONObject.getClass();
                if (m131502j(jSONObject, siblings)) {
                    jSONArray.put(jSONObject);
                    z2 = true;
                }
            }
            node.put("childviews", jSONArray);
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m131503k(String pattern, String matchText) {
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            return Pattern.compile(pattern).matcher(matchText).find();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m131504l(String language, String event, String textType, String matchText) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (lsb.m151554d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String strOptString = null;
            Map<String, String> map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                Intrinsics.m87502r("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map<String, String> map2 = languageInfo;
                if (map2 == null) {
                    Intrinsics.m87502r("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(map2.get(language));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map3 = eventInfo;
                    if (map3 == null) {
                        Intrinsics.m87502r("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject(map3.get(event));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map<String, String> map4 = textTypeInfo;
                        if (map4 == null) {
                            Intrinsics.m87502r("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString(map.get(textType));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return m131503k(strOptString, matchText);
        } catch (Throwable th) {
            lsb.m151552b(th, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m131505m(float[] a, float[] b) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            int length = a.length;
            for (int i = 0; i < length; i++) {
                a[i] = a[i] + b[i];
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m131506n(JSONObject view, StringBuilder textSB, StringBuilder hintSB) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            String strOptString = view.optString("text", "");
            strOptString.getClass();
            String lowerCase = strOptString.toLowerCase();
            lowerCase.getClass();
            String strOptString2 = view.optString(TrackReferenceTypeBox.TYPE1, "");
            strOptString2.getClass();
            String lowerCase2 = strOptString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                textSB.append(lowerCase);
                textSB.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            if (lowerCase2.length() > 0) {
                hintSB.append(lowerCase2);
                hintSB.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            JSONArray jSONArrayOptJSONArray = view.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    jSONObject.getClass();
                    m131506n(jSONObject, textSB, hintSB);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }
}
