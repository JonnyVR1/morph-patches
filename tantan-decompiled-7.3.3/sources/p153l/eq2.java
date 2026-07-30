package p153l;

import com.google.android.exoplayer2.source.C1996q;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class eq2 implements p45.InterfaceC19292b {

    /* JADX INFO: renamed from: a */
    public final int[] f95292a;

    /* JADX INFO: renamed from: b */
    public final C1996q[] f95293b;

    public eq2(int[] iArr, C1996q[] c1996qArr) {
        this.f95292a = iArr;
        this.f95293b = c1996qArr;
    }

    /* JADX INFO: renamed from: a */
    public int[] m121889a() {
        int[] iArr = new int[this.f95293b.length];
        int i = 0;
        while (true) {
            C1996q[] c1996qArr = this.f95293b;
            if (i >= c1996qArr.length) {
                return iArr;
            }
            iArr[i] = c1996qArr[i].m11473G();
            i++;
        }
    }

    @Override // p153l.p45.InterfaceC19292b
    /* JADX INFO: renamed from: b */
    public qfj0 mo121890b(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f95292a;
            if (i3 >= iArr.length) {
                kyv.m152145c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new rfe();
            }
            if (i2 == iArr[i3]) {
                return this.f95293b[i3];
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m121891c(long j) {
        for (C1996q c1996q : this.f95293b) {
            c1996q.m11492Z(j);
        }
    }
}
