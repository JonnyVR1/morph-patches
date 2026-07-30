package p149l;

import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class zlq0 extends JSONArray implements ylq0 {

    /* JADX INFO: renamed from: a */
    private int f203652a = 2;

    @Override // p149l.ylq0
    /* JADX INFO: renamed from: a */
    public int mo97683a() {
        return this.f203652a + (length() - 1);
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof ylq0) {
            this.f203652a += ((ylq0) obj).mo97683a();
        }
        return super.put(obj);
    }
}
