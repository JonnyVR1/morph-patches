package p153l;

import android.text.TextUtils;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class dqq {
    /* JADX INFO: renamed from: a */
    public static Object[] m117556a(JSONArray jSONArray, String str) {
        if (!NullChecker.m82486a(jSONArray)) {
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
            CrashHelper.m82479c(e);
            return objArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Object m117557b(JSONObject jSONObject, String str) throws JSONException {
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
    public static Object[] m117558c(String str, String str2) {
        Object objM117556a;
        if (TextUtils.isEmpty(str2)) {
            return new Object[0];
        }
        try {
            JSONArray jSONArray = new JSONArray(str2);
            Object[] objArr = new Object[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("type")) {
                    String string = jSONObject.getString("type");
                    objM117556a = (jSONObject.has("isArray") && jSONObject.getBoolean("isArray")) ? m117556a(jSONObject.getJSONArray("value"), string) : m117557b(jSONObject, string);
                } else {
                    objM117556a = null;
                }
                objArr[i] = objM117556a;
            }
            return objArr;
        } catch (JSONException e) {
            CrashHelper.m82479c(new IllegalArgumentException("key:" + str + "methodParams :" + str2, e));
            return new Object[0];
        }
    }
}
