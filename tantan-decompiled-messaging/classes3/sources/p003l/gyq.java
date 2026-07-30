package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gyq {

    /* JADX INFO: renamed from: a */
    public List<hyq> f4089a;

    /* JADX INFO: renamed from: b */
    public int f4090b = 3;

    /* JADX INFO: renamed from: a */
    public List<hyq> m4897a() {
        return this.f4089a;
    }

    /* JADX INFO: renamed from: b */
    public int m4898b() {
        return this.f4090b * 2;
    }

    /* JADX INFO: renamed from: c */
    public int m4899c() {
        return this.f4090b;
    }

    /* JADX INFO: renamed from: d */
    public void m4900d(List<hyq> list) {
        ArrayList arrayList = new ArrayList();
        this.f4089a = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: e */
    public void m4901e(int i) {
        this.f4090b = i;
    }
}
