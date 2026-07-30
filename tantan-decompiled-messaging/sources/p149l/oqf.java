package p149l;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class oqf {

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f145133a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public HashMap<String, JSONObject> f145134b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<File> f145135c;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> m165422a() {
        return this.f145133a;
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<File> m165423b() {
        return this.f145135c;
    }

    /* JADX INFO: renamed from: c */
    public HashMap<String, JSONObject> m165424c() {
        return this.f145134b;
    }

    /* JADX INFO: renamed from: d */
    public void m165425d(String str, String str2) {
        this.f145133a.put(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public void m165426e(String str, JSONObject jSONObject) {
        this.f145134b.put(str, jSONObject);
    }
}
