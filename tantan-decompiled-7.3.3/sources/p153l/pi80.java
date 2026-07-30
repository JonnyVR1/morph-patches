package p153l;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pi80 {

    /* JADX INFO: renamed from: a */
    public SparseArray<List<ns2>> f152520a = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public void m172356a(ns2 ns2Var) {
        int i = ns2Var.f143456c;
        List<ns2> arrayList = this.f152520a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f152520a.put(i, arrayList);
        }
        arrayList.add(ns2Var);
        yor.m216991b("TantanListView", "添加item到poll复用池 " + i);
    }

    /* JADX INFO: renamed from: b */
    public ns2 m172357b(int i) {
        List<ns2> list = this.f152520a.get(i);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }
}
