package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vp3 {

    /* JADX INFO: renamed from: e */
    protected static final Comparator<byte[]> f182448e = new C20712a();

    /* JADX INFO: renamed from: a */
    private final List<byte[]> f182449a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<byte[]> f182450b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    private int f182451c = 0;

    /* JADX INFO: renamed from: d */
    private final int f182452d;

    /* JADX INFO: renamed from: l.vp3$a */
    public class C20712a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public vp3(int i) {
        this.f182452d = i;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m199216c() {
        while (this.f182451c > this.f182452d) {
            byte[] bArrRemove = this.f182449a.remove(0);
            this.f182450b.remove(bArrRemove);
            this.f182451c -= bArrRemove.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m199217a(int i) {
        for (int i2 = 0; i2 < this.f182450b.size(); i2++) {
            byte[] bArr = this.f182450b.get(i2);
            if (bArr.length >= i) {
                this.f182451c -= bArr.length;
                this.f182450b.remove(i2);
                this.f182449a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m199218b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f182452d) {
                this.f182449a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f182450b, bArr, f182448e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f182450b.add(iBinarySearch, bArr);
                this.f182451c += bArr.length;
                m199216c();
            }
        }
    }
}
