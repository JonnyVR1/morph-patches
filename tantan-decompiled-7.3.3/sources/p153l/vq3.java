package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vq3 {

    /* JADX INFO: renamed from: e */
    protected static final Comparator<byte[]> f185325e = new C20901a();

    /* JADX INFO: renamed from: a */
    private final List<byte[]> f185326a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<byte[]> f185327b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    private int f185328c = 0;

    /* JADX INFO: renamed from: d */
    private final int f185329d;

    /* JADX INFO: renamed from: l.vq3$a */
    public class C20901a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public vq3(int i) {
        this.f185329d = i;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m202353c() {
        while (this.f185328c > this.f185329d) {
            byte[] bArrRemove = this.f185326a.remove(0);
            this.f185327b.remove(bArrRemove);
            this.f185328c -= bArrRemove.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized byte[] m202354a(int i) {
        for (int i2 = 0; i2 < this.f185327b.size(); i2++) {
            byte[] bArr = this.f185327b.get(i2);
            if (bArr.length >= i) {
                this.f185328c -= bArr.length;
                this.f185327b.remove(i2);
                this.f185326a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m202355b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f185329d) {
                this.f185326a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f185327b, bArr, f185325e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f185327b.add(iBinarySearch, bArr);
                this.f185328c += bArr.length;
                m202353c();
            }
        }
    }
}
