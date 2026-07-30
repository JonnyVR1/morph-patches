package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class rnr0 {

    /* JADX INFO: renamed from: d */
    public static final Comparator f160309d = new qnr0();

    /* JADX INFO: renamed from: a */
    public final List f160310a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f160311b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    public int f160312c = 0;

    public rnr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m180153a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f160310a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f160311b, bArr, f160309d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f160311b.add(iBinarySearch, bArr);
                this.f160312c += length;
                m180155c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized byte[] m180154b(int i) {
        for (int i2 = 0; i2 < this.f160311b.size(); i2++) {
            byte[] bArr = (byte[]) this.f160311b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f160312c -= length;
                this.f160311b.remove(i2);
                this.f160310a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m180155c() {
        while (this.f160312c > 4096) {
            byte[] bArr = (byte[]) this.f160310a.remove(0);
            this.f160311b.remove(bArr);
            this.f160312c -= bArr.length;
        }
    }
}
