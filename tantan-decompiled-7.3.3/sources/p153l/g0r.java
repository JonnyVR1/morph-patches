package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g0r {

    /* JADX INFO: renamed from: a */
    public List<h0r> f101675a;

    /* JADX INFO: renamed from: b */
    public int f101676b = 3;

    /* JADX INFO: renamed from: a */
    public List<h0r> m128463a() {
        return this.f101675a;
    }

    /* JADX INFO: renamed from: b */
    public int m128464b() {
        return this.f101676b * 2;
    }

    /* JADX INFO: renamed from: c */
    public int m128465c() {
        return this.f101676b;
    }

    /* JADX INFO: renamed from: d */
    public void m128466d(List<h0r> list) {
        ArrayList arrayList = new ArrayList();
        this.f101675a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: e */
    public void m128467e(int i) {
        this.f101676b = i;
    }
}
