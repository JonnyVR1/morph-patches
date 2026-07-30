package tech.sud.runtime.component.p022d;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.C1241g;
import tech.sud.runtime.p018a.InterfaceC1193a;

/* JADX INFO: renamed from: tech.sud.runtime.component.d.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1210a {

    /* JADX INFO: renamed from: a */
    private final Map<String, InterfaceC1193a.a> f11296a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final C1241g f11297b;

    public C1210a(C1241g c1241g) {
        this.f11297b = c1241g;
    }

    /* JADX INFO: renamed from: a */
    public void m10211a(String str, String str2) {
        if (str.equals("@onState") && this.f11296a.containsKey("@sudGameStarted") && str2.contains("\"state\":\"running\"")) {
            m10211a("@sudGameStarted", "1");
        }
        if (!this.f11296a.containsKey(str)) {
            C1228f.m10330d("SudNative", "J: " + str + " not found");
            return;
        }
        boolean zContainsKey = this.f11296a.containsKey("@interfaceCounter2");
        Map<String, InterfaceC1193a.a> map = this.f11296a;
        if (zContainsKey) {
            map.get("@interfaceCounter2").mo10060a(new JSONArray().put(str).put(str2).toString());
        } else if (map.containsKey("@interfaceCounter")) {
            this.f11296a.get("@interfaceCounter").mo10060a(str);
        }
        try {
            this.f11296a.get(str).mo10060a(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10214b(String str, String str2) {
        this.f11297b.m10459a(1, new JSONArray().put(str).put(str2).toString());
    }

    /* JADX INFO: renamed from: a */
    public boolean m10213a(String str) {
        return this.f11296a.containsKey(str);
    }

    /* JADX INFO: renamed from: a */
    public void m10212a(String str, InterfaceC1193a.a aVar) {
        if (this.f11296a.containsKey(str)) {
            C1228f.m10330d("SudNative", "J: " + str + " has been registered");
        }
        this.f11296a.put(str, aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m10210a() {
        this.f11296a.clear();
    }
}
