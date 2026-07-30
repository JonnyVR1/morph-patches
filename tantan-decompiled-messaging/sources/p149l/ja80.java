package p149l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ja80 {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<xr2>> f117068a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m140690a(xr2 xr2Var) {
        int i = xr2Var.f194080c;
        List<xr2> arrayList = this.f117068a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f117068a.put(i, arrayList);
        }
        arrayList.add(xr2Var);
        xmr.m210146b("TantanListView", "添加item到poll复用池 " + i);
    }

    /* JADX INFO: renamed from: b */
    public xr2 m140691b(int i) {
        List<xr2> list = this.f117068a.get(i);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
