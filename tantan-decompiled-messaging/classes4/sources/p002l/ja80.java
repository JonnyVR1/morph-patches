package p002l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ja80 {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<xr2>> f13650a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m15780a(xr2 xr2Var) {
        int i = xr2Var.f22423c;
        List<xr2> arrayList = this.f13650a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f13650a.put(i, arrayList);
        }
        arrayList.add(xr2Var);
        xmr.m26035b("TantanListView", "添加item到poll复用池 " + i);
    }

    /* JADX INFO: renamed from: b */
    public xr2 m15781b(int i) {
        List<xr2> list = this.f13650a.get(i);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
