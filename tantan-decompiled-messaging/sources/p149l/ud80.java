package p149l;

import fi.iki.elonen.NanoHTTPD;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ud80 implements td80 {

    /* JADX INFO: renamed from: c */
    private ArrayList<td80> f175903c;

    public ud80(td80... td80VarArr) {
        if (td80VarArr != null) {
            m193126c(Arrays.asList(td80VarArr));
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
        ArrayList<td80> arrayList = this.f175903c;
        if (arrayList == null || arrayList.isEmpty()) {
            return fqd.m122696c(td80.f169502b);
        }
        int size = this.f175903c.size();
        for (int i = 0; i < size; i++) {
            td80 td80Var = this.f175903c.get(i);
            if (td80Var != null && td80Var.mo97152a(map, str, str2) && (responseMo97153b = td80Var.mo97153b(map, str, str2)) != null) {
                return responseMo97153b;
            }
        }
        return fqd.m122698e(str, map, td80.f169502b);
    }

    /* JADX INFO: renamed from: c */
    public void m193126c(Collection<td80> collection) {
        if (this.f175903c == null) {
            this.f175903c = new ArrayList<>();
        }
        this.f175903c.addAll(collection);
    }
}
