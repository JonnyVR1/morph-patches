package p153l;

import android.text.Editable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wrq {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m207614a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m207619f(new JSONObject(str));
        } catch (JSONException e) {
            Logger.m5930v("Error converting " + str + " from JSON", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static <T> List<T> m207615b(@Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return m207617d(jSONArray);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T> List<T> m207616c(@Nullable JSONArray jSONArray) {
        Object objM207615b = m207615b(jSONArray);
        if (objM207615b == null) {
            objM207615b = new ArrayList();
        }
        return (List) m207623j(objM207615b);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> List<T> m207617d(@NonNull JSONArray jSONArray) {
        Object obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt == null || objOpt == (obj = JSONObject.NULL)) {
                objOpt = null;
            } else if (objOpt instanceof JSONObject) {
                objOpt = m207619f((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = m207615b((JSONArray) objOpt);
            } else if (obj.equals(objOpt)) {
                objOpt = null;
            }
            arrayList.add(objOpt);
        }
        return (List) m207623j(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m207618e(Iterable<?> iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objM207618e : iterable) {
            if (objM207618e instanceof Map) {
                objM207618e = m207620g((Map) m207623j(objM207618e));
            } else if (objM207618e instanceof Iterable) {
                objM207618e = m207618e((Iterable) objM207618e);
            } else if (objM207618e == null) {
                objM207618e = JSONObject.NULL;
            }
            jSONArray.put(objM207618e);
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: f */
    public static <T> Map<String, T> m207619f(JSONObject jSONObject) {
        Object obj;
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt == null || objOpt == (obj = JSONObject.NULL)) {
                objOpt = null;
            } else if (objOpt instanceof JSONObject) {
                objOpt = m207619f((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = m207615b((JSONArray) objOpt);
            } else if (obj.equals(objOpt)) {
                objOpt = null;
            }
            map.put(next, m207623j(objOpt));
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    private static JSONObject m207620g(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = m207620g((Map) m207623j(value));
            } else if (value instanceof Iterable) {
                value = m207618e((Iterable) value);
            } else if (value instanceof Editable) {
                value = value.toString();
            } else if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static String m207621h(List<?> list) {
        if (list == null) {
            return null;
        }
        try {
            return m207618e(list).toString();
        } catch (JSONException e) {
            Logger.m5930v("Error converting " + list + " to JSON", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m207622i(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        try {
            return m207620g(map).toString();
        } catch (JSONException e) {
            Logger.m5930v("Error converting " + map + " to JSON", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static <T> T m207623j(Object obj) {
        return obj;
    }
}
