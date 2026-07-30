package p153l;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class fvq0 extends JSONArray implements evq0 {

    /* JADX INFO: renamed from: a */
    private int f101083a = 2;

    @Override // p153l.evq0
    /* JADX INFO: renamed from: a */
    public int mo122813a() {
        return this.f101083a + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof evq0) {
            this.f101083a += ((evq0) obj).mo122813a();
        }
        return super.put(obj);
    }
}
