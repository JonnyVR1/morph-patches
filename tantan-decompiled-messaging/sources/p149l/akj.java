package p149l;

import fi.iki.elonen.NanoHTTPD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class akj implements zjj {

    /* JADX INFO: renamed from: c */
    private ArrayList<zjj> f70279c;

    public akj(zjj... zjjVarArr) {
        if (zjjVarArr != null) {
            m97154c(Arrays.asList(zjjVarArr));
        }
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: a */
    public boolean mo97152a(Map<String, String> map, String str, String str2) {
        return true;
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: b */
    public NanoHTTPD.Response mo97153b(Map<String, String> map, String str, String str2) {
        NanoHTTPD.Response responseMo97153b;
        ArrayList<zjj> arrayList = this.f70279c;
        if (arrayList == null || arrayList.isEmpty()) {
            return fqd.m122696c(zjj.f203418a);
        }
        int size = this.f70279c.size();
        for (int i = 0; i < size; i++) {
            zjj zjjVar = this.f70279c.get(i);
            if (zjjVar != null && zjjVar.mo97152a(map, str, str2) && (responseMo97153b = zjjVar.mo97153b(map, str, str2)) != null) {
                return responseMo97153b;
            }
        }
        return fqd.m122698e(str, map, zjj.f203418a);
    }

    /* JADX INFO: renamed from: c */
    public void m97154c(Collection<zjj> collection) {
        if (this.f70279c == null) {
            this.f70279c = new ArrayList<>();
        }
        this.f70279c.addAll(collection);
    }
}
