package p153l;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mqw implements ayl {

    /* JADX INFO: renamed from: a */
    private String f138280a;

    /* JADX INFO: renamed from: b */
    private Object f138281b;

    public mqw(String str, Object obj) {
        this.f138280a = str;
        m159612a(obj);
        this.f138281b = obj;
    }

    /* JADX INFO: renamed from: a */
    private void m159612a(Object obj) {
        if (obj == null || (obj instanceof Number) || (obj instanceof String) || (obj instanceof JSONObject) || (obj instanceof JSONArray) || (obj instanceof Boolean)) {
            return;
        }
        wg3.m206174a("value class is not supported");
    }

    @Override // p153l.ayl
    public String getKey() {
        return this.f138280a;
    }

    @Override // p153l.ayl
    public Object getValue() {
        return this.f138281b;
    }
}
