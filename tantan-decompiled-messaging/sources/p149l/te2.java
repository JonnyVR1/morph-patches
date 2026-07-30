package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.se2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class te2<T extends se2> extends sq2<T> {

    /* JADX INFO: renamed from: l.te2$a */
    public class C20160a extends skd {
        public C20160a() {
        }

        @Override // p149l.skd, p149l.lt0
        /* JADX INFO: renamed from: c */
        public Map<String, String> mo151658c() {
            return null;
        }

        @Override // p149l.skd, p149l.lt0
        /* JADX INFO: renamed from: d */
        public Map<String, String> mo151659d() {
            HashMap map = new HashMap();
            map.put("Content-Encoding", "gizp");
            return map;
        }

        @Override // p149l.skd, p149l.lt0
        /* JADX INFO: renamed from: e */
        public List<String> mo151660e() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("secret");
            arrayList.add("User-Agent");
            return arrayList;
        }
    }

    public te2(String str, Map<String, String> map, Map<String, String> map2) {
        m185448r(new C20160a());
        this.f165913b = str;
        if (map != null) {
            this.f165917f.putAll(map);
        }
        if (map2 != null) {
            this.f165918g.putAll(map2);
        }
    }

    @Override // p149l.sq2
    /* JADX INFO: renamed from: j */
    public String mo185441j() {
        return this.f165913b;
    }
}
