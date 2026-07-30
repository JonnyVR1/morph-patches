package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class uor {

    /* JADX INFO: renamed from: a */
    public final int f180119a;

    /* JADX INFO: renamed from: b */
    public Object[] f180120b;

    /* JADX INFO: renamed from: c */
    public Object[] f180121c;

    /* JADX INFO: renamed from: d */
    public volatile int f180122d;

    /* JADX INFO: renamed from: e */
    public int f180123e;

    public uor(int i) {
        this.f180119a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m197021a(Object obj) {
        if (this.f180122d == 0) {
            Object[] objArr = new Object[this.f180119a + 1];
            this.f180120b = objArr;
            this.f180121c = objArr;
            objArr[0] = obj;
            this.f180123e = 1;
            this.f180122d = 1;
            return;
        }
        int i = this.f180123e;
        int i2 = this.f180119a;
        if (i != i2) {
            this.f180121c[i] = obj;
            this.f180123e = i + 1;
            this.f180122d++;
        } else {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f180121c[i2] = objArr2;
            this.f180121c = objArr2;
            this.f180123e = 1;
            this.f180122d++;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object[] m197022b() {
        return this.f180120b;
    }

    /* JADX INFO: renamed from: c */
    public int m197023c() {
        return this.f180122d;
    }

    /* JADX INFO: renamed from: d */
    public List<Object> m197024d() {
        int i = this.f180119a;
        int i2 = this.f180122d;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArrM197022b = m197022b();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(objArrM197022b[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                objArrM197022b = (Object[]) objArrM197022b[i];
                i4 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return m197024d().toString();
    }
}
