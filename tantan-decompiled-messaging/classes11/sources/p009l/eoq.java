package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class eoq {
    /* JADX INFO: renamed from: a */
    public static Object[] m14054a(JSONArray jSONArray, String str) {
        if (!NullChecker.a(jSONArray)) {
            return null;
        }
        try {
            if ("Integer".equalsIgnoreCase(str)) {
                Integer[] numArr = new Integer[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    numArr[i] = Integer.valueOf(jSONArray.getInt(i));
                }
                return numArr;
            }
            if ("String".equalsIgnoreCase(str)) {
                String[] strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.getString(i2);
                }
                return strArr;
            }
            if ("Long".equalsIgnoreCase(str)) {
                Long[] lArr = new Long[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    lArr[i3] = Long.valueOf(jSONArray.getLong(i3));
                }
                return lArr;
            }
            if ("Double".equalsIgnoreCase(str)) {
                Double[] dArr = new Double[jSONArray.length()];
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    dArr[i4] = Double.valueOf(jSONArray.getDouble(i4));
                }
                return dArr;
            }
            if (!"Boolean".equalsIgnoreCase(str)) {
                return null;
            }
            Boolean[] boolArr = new Boolean[jSONArray.length()];
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                boolArr[i5] = Boolean.valueOf(jSONArray.getBoolean(i5));
            }
            return boolArr;
        } catch (Exception e) {
            Object[] objArr = new Object[0];
            CrashHelper.c(e);
            return objArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m14055b(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        if ("Integer".equalsIgnoreCase(str)) {
            return Integer.valueOf(jSONObject.getInt("value"));
        }
        if ("String".equalsIgnoreCase(str)) {
            return jSONObject.getString("value").replaceAll("\\\\", "");
        }
        if ("Long".equalsIgnoreCase(str)) {
            return Long.valueOf(jSONObject.getLong("value"));
        }
        if ("Double".equalsIgnoreCase(str)) {
            return Double.valueOf(jSONObject.getDouble("value"));
        }
        if ("Boolean".equalsIgnoreCase(str)) {
            return Boolean.valueOf(jSONObject.getBoolean("value"));
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m14056c(String str, String str2) {
        Object objM14054a;
        if (TextUtils.isEmpty(str2)) {
            return new Object[0];
        }
        try {
            JSONArray jSONArray = new JSONArray(str2);
            Object[] objArr = new Object[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has(MiniWidgetProvider.KEY_TYPE)) {
                    String string = jSONObject.getString(MiniWidgetProvider.KEY_TYPE);
                    objM14054a = (jSONObject.has("isArray") && jSONObject.getBoolean("isArray")) ? m14054a(jSONObject.getJSONArray("value"), string) : m14055b(jSONObject, string);
                } else {
                    objM14054a = null;
                }
                objArr[i] = objM14054a;
            }
            return objArr;
        } catch (JSONException e) {
            CrashHelper.c(new IllegalArgumentException("key:" + str + "methodParams :" + str2, e));
            return new Object[0];
        }
    }
}
