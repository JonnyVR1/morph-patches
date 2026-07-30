package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gyq {

    /* JADX INFO: renamed from: a */
    public List<hyq> f105032a;

    /* JADX INFO: renamed from: b */
    public int f105033b = 3;

    /* JADX INFO: renamed from: a */
    public List<hyq> m128726a() {
        return this.f105032a;
    }

    /* JADX INFO: renamed from: b */
    public int m128727b() {
        return this.f105033b * 2;
    }

    /* JADX INFO: renamed from: c */
    public int m128728c() {
        return this.f105033b;
    }

    /* JADX INFO: renamed from: d */
    public void m128729d(List<hyq> list) {
        ArrayList arrayList = new ArrayList();
        this.f105032a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: e */
    public void m128730e(int i) {
        this.f105033b = i;
    }
}
