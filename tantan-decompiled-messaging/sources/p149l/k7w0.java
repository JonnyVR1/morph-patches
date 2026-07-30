package p149l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k7w0 {

    /* JADX INFO: renamed from: a */
    public static WindowManager f121649a;

    /* JADX INFO: renamed from: b */
    public static final String[] f121650b = {BaseSei.f13930X, BaseSei.f13931Y, "width", "height"};

    /* JADX INFO: renamed from: c */
    public static float f121651c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: renamed from: a */
    public static JSONObject m144704a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BaseSei.f13930X, i / f121651c);
            jSONObject.put(BaseSei.f13931Y, i2 / f121651c);
            jSONObject.put("width", i3 / f121651c);
            jSONObject.put("height", i4 / f121651c);
            return jSONObject;
        } catch (JSONException e) {
            l7w0.m148830a("Error with creating viewStateObject", e);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m144705b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            l7w0.m148830a("Error with setting ad session id", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m144706c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m144707d(Context context) {
        if (context != null) {
            f121651c = context.getResources().getDisplayMetrics().density;
            f121649a = (WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m144708e(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            l7w0.m148830a("JSONException during JSONObject.put for name [" + str + Constants.AES_SUFFIX, e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m144709f(JSONObject jSONObject) {
        float f;
        float f2;
        if (f121649a != null) {
            Point point = new Point(0, 0);
            f121649a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = f121651c;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf A[LOOP:1: B:42:0x00ab->B:46:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static boolean m144710g(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int i;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f121650b;
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (jSONObject.optDouble(str) == jSONObject2.optDouble(str)) {
                }
            }
            if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("isFriendlyObstructionFor");
                JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                if (jSONArrayOptJSONArray3 == null && jSONArrayOptJSONArray4 == null) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null) {
                    }
                    if (m144711h(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                        for (i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            if (m144710g(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                            }
                        }
                        return true;
                    }
                } else if (m144711h(jSONArrayOptJSONArray3, jSONArrayOptJSONArray4)) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        if (jSONArrayOptJSONArray3.optString(i3, "").equals(jSONArrayOptJSONArray4.optString(i3, ""))) {
                        }
                    }
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                    jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray2 != null) {
                        if (m144711h(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
                            while (i < jSONArrayOptJSONArray.length()) {
                                if (m144710g(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m144711h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
