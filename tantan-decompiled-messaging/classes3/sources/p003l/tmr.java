package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tmr {

    /* JADX INFO: renamed from: a */
    public final int f7558a;

    /* JADX INFO: renamed from: b */
    public Object[] f7559b;

    /* JADX INFO: renamed from: c */
    public Object[] f7560c;

    /* JADX INFO: renamed from: d */
    public volatile int f7561d;

    /* JADX INFO: renamed from: e */
    public int f7562e;

    public tmr(int i) {
        this.f7558a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m7820a(Object obj) {
        if (this.f7561d == 0) {
            Object[] objArr = new Object[this.f7558a + 1];
            this.f7559b = objArr;
            this.f7560c = objArr;
            objArr[0] = obj;
            this.f7562e = 1;
            this.f7561d = 1;
            return;
        }
        int i = this.f7562e;
        int i2 = this.f7558a;
        if (i != i2) {
            this.f7560c[i] = obj;
            this.f7562e = i + 1;
            this.f7561d++;
        } else {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f7560c[i2] = objArr2;
            this.f7560c = objArr2;
            this.f7562e = 1;
            this.f7561d++;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object[] m7821b() {
        return this.f7559b;
    }

    /* JADX INFO: renamed from: c */
    public int m7822c() {
        return this.f7561d;
    }

    /* JADX INFO: renamed from: d */
    public List<Object> m7823d() {
        int i = this.f7558a;
        int i2 = this.f7561d;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArrM7821b = m7821b();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(objArrM7821b[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                objArrM7821b = (Object[]) objArrM7821b[i];
                i4 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return m7823d().toString();
    }
}
