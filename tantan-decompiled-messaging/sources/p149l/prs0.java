package p149l;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class prs0 {

    /* JADX INFO: renamed from: a */
    public static final kqs0 f150945a = new zos0();

    @Nullable
    /* JADX INFO: renamed from: a */
    public static Bundle m171060a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object objOpt2 = null;
                        for (int i2 = 0; objOpt2 == null && i2 < length; i2++) {
                            objOpt2 = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                        }
                        if (objOpt2 == null) {
                            x2t0.m206869g("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? m171060a(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            x2t0.m206869g(String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next));
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, m171060a((JSONObject) objOpt));
                } else {
                    x2t0.m206869g("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static String m171061b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM171072m = m171072m(jSONObject, strArr);
        return jSONObjectM171072m == null ? "" : jSONObjectM171072m.optString(strArr[0], "");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static List m171062c(@Nullable JSONArray jSONArray, @Nullable List list) throws JSONException {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: d */
    public static List m171063d(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static JSONArray m171064e(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(m171064e(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(m171067h(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    qkq0.m175383a("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                    return null;
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m171065f(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static JSONObject m171066g(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM171072m = m171072m(jSONObject, strArr);
        if (jSONObjectM171072m == null) {
            return null;
        }
        return jSONObjectM171072m.optJSONObject(strArr[1]);
    }

    /* JADX INFO: renamed from: h */
    public static JSONObject m171067h(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, m171064e(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, m171067h(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    qkq0.m175383a("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                    return null;
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    /* JADX INFO: renamed from: i */
    public static void m171068i(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m171069j(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    m171068i(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m171069j(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    m171069j(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    m171068i(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m171070k(boolean z, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM171072m = m171072m(jSONObject, strArr);
        if (jSONObjectM171072m == null) {
            return false;
        }
        return jSONObjectM171072m.optBoolean(strArr[strArr.length - 1], false);
    }

    /* JADX INFO: renamed from: l */
    public static String m171071l(oxv0 oxv0Var) {
        if (oxv0Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            m171073n(jsonWriter, oxv0Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e) {
            x2t0.m206867e("Error when writing JSON.", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static JSONObject m171072m(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i]);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: n */
    public static void m171073n(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof oxv0) {
            m171069j(jsonWriter, ((oxv0) obj).f146256d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m171073n(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                m171073n(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
