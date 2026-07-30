package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.ze2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class af2<T extends ze2> extends ir2<T> {

    /* JADX INFO: renamed from: l.af2$a */
    public class C15693a extends yld {
        public C15693a() {
        }

        @Override // p153l.yld, p153l.rt0
        /* JADX INFO: renamed from: c */
        public Map<String, String> mo97274c() {
            return null;
        }

        @Override // p153l.yld, p153l.rt0
        /* JADX INFO: renamed from: d */
        public Map<String, String> mo97275d() {
            HashMap map = new HashMap();
            map.put("Content-Encoding", "gizp");
            return map;
        }

        @Override // p153l.yld, p153l.rt0
        /* JADX INFO: renamed from: e */
        public List<String> mo97276e() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("secret");
            arrayList.add("User-Agent");
            return arrayList;
        }
    }

    public af2(String str, Map<String, String> map, Map<String, String> map2) {
        m141764r(new C15693a());
        this.f116490b = str;
        if (map != null) {
            this.f116494f.putAll(map);
        }
        if (map2 != null) {
            this.f116495g.putAll(map2);
        }
    }

    @Override // p153l.ir2
    /* JADX INFO: renamed from: j */
    public String mo97273j() {
        return this.f116490b;
    }
}
