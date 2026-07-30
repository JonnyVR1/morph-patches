package p153l;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class vrf {

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f185459a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, JSONObject> f185460b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<File> f185461c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> m202490a() {
        return this.f185459a;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<File> m202491b() {
        return this.f185461c;
    }

    /* JADX INFO: renamed from: c */
    public HashMap<String, JSONObject> m202492c() {
        return this.f185460b;
    }

    /* JADX INFO: renamed from: d */
    public void m202493d(String str, String str2) {
        this.f185459a.put(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m202494e(String str, JSONObject jSONObject) {
        this.f185460b.put(str, jSONObject);
    }
}
