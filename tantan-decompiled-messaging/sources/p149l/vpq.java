package p149l;

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
public class vpq {
    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m199281a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m199286f(new JSONObject(str));
        } catch (JSONException e) {
            Logger.m5876v("Error converting " + str + " from JSON", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static <T> List<T> m199282b(@Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        return m199284d(jSONArray);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T> List<T> m199283c(@Nullable JSONArray jSONArray) {
        Object objM199282b = m199282b(jSONArray);
        if (objM199282b == null) {
            objM199282b = new ArrayList();
        }
        return (List) m199290j(objM199282b);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> List<T> m199284d(@NonNull JSONArray jSONArray) {
        Object obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objOpt = jSONArray.opt(i);
            if (objOpt == null || objOpt == (obj = JSONObject.NULL)) {
                objOpt = null;
            } else if (objOpt instanceof JSONObject) {
                objOpt = m199286f((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = m199282b((JSONArray) objOpt);
            } else if (obj.equals(objOpt)) {
                objOpt = null;
            }
            arrayList.add(objOpt);
        }
        return (List) m199290j(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m199285e(Iterable<?> iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objM199285e : iterable) {
            if (objM199285e instanceof Map) {
                objM199285e = m199287g((Map) m199290j(objM199285e));
            } else if (objM199285e instanceof Iterable) {
                objM199285e = m199285e((Iterable) objM199285e);
            } else if (objM199285e == null) {
                objM199285e = JSONObject.NULL;
            }
            jSONArray.put(objM199285e);
        }
        return jSONArray;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX INFO: renamed from: f */
    public static <T> Map<String, T> m199286f(JSONObject jSONObject) {
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
                objOpt = m199286f((JSONObject) objOpt);
            } else if (objOpt instanceof JSONArray) {
                objOpt = m199282b((JSONArray) objOpt);
            } else if (obj.equals(objOpt)) {
                objOpt = null;
            }
            map.put(next, m199290j(objOpt));
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    private static JSONObject m199287g(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = m199287g((Map) m199290j(value));
            } else if (value instanceof Iterable) {
                value = m199285e((Iterable) value);
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
    public static String m199288h(List<?> list) {
        if (list == null) {
            return null;
        }
        try {
            return m199285e(list).toString();
        } catch (JSONException e) {
            Logger.m5876v("Error converting " + list + " to JSON", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m199289i(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        try {
            return m199287g(map).toString();
        } catch (JSONException e) {
            Logger.m5876v("Error converting " + map + " to JSON", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static <T> T m199290j(Object obj) {
        return obj;
    }
}
