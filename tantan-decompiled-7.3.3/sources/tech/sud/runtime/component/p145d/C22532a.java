package tech.sud.runtime.component.p145d;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.C22563g;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: renamed from: tech.sud.runtime.component.d.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22532a {

    /* JADX INFO: renamed from: a */
    private final Map<String, InterfaceC22515a.a> f208593a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C22563g f208594b;

    public C22532a(C22563g c22563g) {
        this.f208594b = c22563g;
    }

    /* JADX INFO: renamed from: a */
    public void m222986a(String str, String str2) {
        if (str.equals("@onState") && this.f208593a.containsKey("@sudGameStarted") && str2.contains("\"state\":\"running\"")) {
            m222986a("@sudGameStarted", "1");
        }
        if (!this.f208593a.containsKey(str)) {
            C22550f.m223105d("SudNative", "J: " + str + " not found");
            return;
        }
        boolean zContainsKey = this.f208593a.containsKey("@interfaceCounter2");
        Map<String, InterfaceC22515a.a> map = this.f208593a;
        if (zContainsKey) {
            map.get("@interfaceCounter2").mo106566a(new JSONArray().put(str).put(str2).toString());
        } else if (map.containsKey("@interfaceCounter")) {
            this.f208593a.get("@interfaceCounter").mo106566a(str);
        }
        try {
            this.f208593a.get(str).mo106566a(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m222989b(String str, String str2) {
        this.f208594b.m223234a(1, new JSONArray().put(str).put(str2).toString());
    }

    /* JADX INFO: renamed from: a */
    public boolean m222988a(String str) {
        return this.f208593a.containsKey(str);
    }

    /* JADX INFO: renamed from: a */
    public void m222987a(String str, InterfaceC22515a.a aVar) {
        if (this.f208593a.containsKey(str)) {
            C22550f.m223105d("SudNative", "J: " + str + " has been registered");
        }
        this.f208593a.put(str, aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m222985a() {
        this.f208593a.clear();
    }
}
