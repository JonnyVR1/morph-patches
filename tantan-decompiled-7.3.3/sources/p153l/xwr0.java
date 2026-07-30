package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xwr0 {

    /* JADX INFO: renamed from: d */
    public static final Comparator f196541d = new wwr0();

    /* JADX INFO: renamed from: a */
    public final List f196542a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f196543b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    public int f196544c = 0;

    public xwr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m213436a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f196542a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f196543b, bArr, f196541d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f196543b.add(iBinarySearch, bArr);
                this.f196544c += length;
                m213438c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized byte[] m213437b(int i) {
        for (int i2 = 0; i2 < this.f196543b.size(); i2++) {
            byte[] bArr = (byte[]) this.f196543b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.f196544c -= length;
                this.f196543b.remove(i2);
                this.f196542a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m213438c() {
        while (this.f196544c > 4096) {
            byte[] bArr = (byte[]) this.f196542a.remove(0);
            this.f196543b.remove(bArr);
            this.f196544c -= bArr.length;
        }
    }
}
