package tech.sud.runtime.component.p141d;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.C22448g;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: renamed from: tech.sud.runtime.component.d.a */
/* JADX INFO: loaded from: classes3.dex */
public class C22417a {

    /* JADX INFO: renamed from: a */
    private final Map<String, InterfaceC22400a.a> f207671a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C22448g f207672b;

    public C22417a(C22448g c22448g) {
        this.f207672b = c22448g;
    }

    /* JADX INFO: renamed from: a */
    public void m221740a(String str, String str2) {
        if (str.equals("@onState") && this.f207671a.containsKey("@sudGameStarted") && str2.contains("\"state\":\"running\"")) {
            m221740a("@sudGameStarted", "1");
        }
        if (!this.f207671a.containsKey(str)) {
            C22435f.m221859d("SudNative", "J: " + str + " not found");
            return;
        }
        boolean zContainsKey = this.f207671a.containsKey("@interfaceCounter2");
        Map<String, InterfaceC22400a.a> map = this.f207671a;
        if (zContainsKey) {
            map.get("@interfaceCounter2").mo95422a(new JSONArray().put(str).put(str2).toString());
        } else if (map.containsKey("@interfaceCounter")) {
            this.f207671a.get("@interfaceCounter").mo95422a(str);
        }
        try {
            this.f207671a.get(str).mo95422a(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m221743b(String str, String str2) {
        this.f207672b.m221988a(1, new JSONArray().put(str).put(str2).toString());
    }

    /* JADX INFO: renamed from: a */
    public boolean m221742a(String str) {
        return this.f207671a.containsKey(str);
    }

    /* JADX INFO: renamed from: a */
    public void m221741a(String str, InterfaceC22400a.a aVar) {
        if (this.f207671a.containsKey(str)) {
            C22435f.m221859d("SudNative", "J: " + str + " has been registered");
        }
        this.f207671a.put(str, aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m221739a() {
        this.f207671a.clear();
    }
}
