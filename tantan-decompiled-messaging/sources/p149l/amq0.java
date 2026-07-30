package p149l;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class amq0 extends JSONObject implements ylq0 {

    /* JADX INFO: renamed from: b */
    private static final int f70669b = 2;

    /* JADX INFO: renamed from: c */
    private static final int f70670c = 3;

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, Integer> f70671a = new LinkedHashMap<>();

    @Override // p149l.ylq0
    /* JADX INFO: renamed from: a */
    public int mo97683a() {
        int iIntValue = f70669b;
        Iterator<Integer> it = this.f70671a.values().iterator();
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) throws JSONException {
        JSONObject jSONObjectPut = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            boolean z = obj instanceof ylq0;
            LinkedHashMap<String, Integer> linkedHashMap = this.f70671a;
            if (z) {
                linkedHashMap.put(str, Integer.valueOf(str.length() + ((ylq0) obj).mo97683a() + f70670c));
                return jSONObjectPut;
            }
            linkedHashMap.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + f70670c + f70669b));
        }
        return jSONObjectPut;
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f70671a.remove(str);
        return super.remove(str);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f70671a.put(str, Integer.valueOf(str.length() + String.valueOf(j).length() + f70670c));
        }
        return super.put(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            this.f70671a.put(str, Integer.valueOf(str.length() + String.valueOf(d).length() + f70670c));
        }
        return super.put(str, d);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f70671a.put(str, Integer.valueOf(str.length() + String.valueOf(i).length() + f70670c));
        }
        return super.put(str, i);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f70671a.put(str, Integer.valueOf(str.length() + String.valueOf(z).length() + f70670c));
        }
        return super.put(str, z);
    }
}
