package p153l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class gvq0 extends JSONObject implements evq0 {

    /* JADX INFO: renamed from: b */
    private static final int f106672b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f106673c = 3;

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, Integer> f106674a = new LinkedHashMap<>();

    @Override // p153l.evq0
    /* JADX INFO: renamed from: a */
    public int mo122813a() {
        int iIntValue = f106672b;
        Iterator<Integer> it = this.f106674a.values().iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) throws JSONException {
        JSONObject jSONObjectPut = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            boolean z = obj instanceof evq0;
            LinkedHashMap<String, Integer> linkedHashMap = this.f106674a;
            if (z) {
                linkedHashMap.put(str, Integer.valueOf(str.length() + ((evq0) obj).mo122813a() + f106673c));
                return jSONObjectPut;
            }
            linkedHashMap.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + f106673c + f106672b));
        }
        return jSONObjectPut;
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f106674a.remove(str);
        return super.remove(str);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f106674a.put(str, Integer.valueOf(str.length() + String.valueOf(j).length() + f106673c));
        }
        return super.put(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            this.f106674a.put(str, Integer.valueOf(str.length() + String.valueOf(d).length() + f106673c));
        }
        return super.put(str, d);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f106674a.put(str, Integer.valueOf(str.length() + String.valueOf(i).length() + f106673c));
        }
        return super.put(str, i);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f106674a.put(str, Integer.valueOf(str.length() + String.valueOf(z).length() + f106673c));
        }
        return super.put(str, z);
    }
}
