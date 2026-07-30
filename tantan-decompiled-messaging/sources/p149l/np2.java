package p149l;

import com.google.android.exoplayer2.source.C1973q;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class np2 implements o35.InterfaceC18830b {

    /* JADX INFO: renamed from: a */
    public final int[] f139906a;

    /* JADX INFO: renamed from: b */
    public final C1973q[] f139907b;

    public np2(int[] iArr, C1973q[] c1973qArr) {
        this.f139906a = iArr;
        this.f139907b = c1973qArr;
    }

    /* JADX INFO: renamed from: a */
    public int[] m160442a() {
        int[] iArr = new int[this.f139907b.length];
        int i = 0;
        while (true) {
            C1973q[] c1973qArr = this.f139907b;
            if (i >= c1973qArr.length) {
                return iArr;
            }
            iArr[i] = c1973qArr[i].m11419G();
            i++;
        }
    }

    @Override // p149l.o35.InterfaceC18830b
    /* JADX INFO: renamed from: b */
    public m6j0 mo160443b(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f139906a;
            if (i3 >= iArr.length) {
                jwv.m143683c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new nee();
            }
            if (i2 == iArr[i3]) {
                return this.f139907b[i3];
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m160444c(long j) {
        for (C1973q c1973q : this.f139907b) {
            c1973q.m11438Z(j);
        }
    }
}
