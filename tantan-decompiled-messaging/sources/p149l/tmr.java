package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tmr {

    /* JADX INFO: renamed from: a */
    public final int f171163a;

    /* JADX INFO: renamed from: b */
    public Object[] f171164b;

    /* JADX INFO: renamed from: c */
    public Object[] f171165c;

    /* JADX INFO: renamed from: d */
    public volatile int f171166d;

    /* JADX INFO: renamed from: e */
    public int f171167e;

    public tmr(int i) {
        this.f171163a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m189717a(Object obj) {
        if (this.f171166d == 0) {
            Object[] objArr = new Object[this.f171163a + 1];
            this.f171164b = objArr;
            this.f171165c = objArr;
            objArr[0] = obj;
            this.f171167e = 1;
            this.f171166d = 1;
            return;
        }
        int i = this.f171167e;
        int i2 = this.f171163a;
        if (i != i2) {
            this.f171165c[i] = obj;
            this.f171167e = i + 1;
            this.f171166d++;
        } else {
            Object[] objArr2 = new Object[i2 + 1];
            objArr2[0] = obj;
            this.f171165c[i2] = objArr2;
            this.f171165c = objArr2;
            this.f171167e = 1;
            this.f171166d++;
        }
    }

    /* JADX INFO: renamed from: b */
    public Object[] m189718b() {
        return this.f171164b;
    }

    /* JADX INFO: renamed from: c */
    public int m189719c() {
        return this.f171166d;
    }

    /* JADX INFO: renamed from: d */
    public List<Object> m189720d() {
        int i = this.f171163a;
        int i2 = this.f171166d;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] objArrM189718b = m189718b();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(objArrM189718b[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                objArrM189718b = (Object[]) objArrM189718b[i];
                i4 = 0;
            }
        }
        return arrayList;
    }

    public String toString() {
        return m189720d().toString();
    }
}
