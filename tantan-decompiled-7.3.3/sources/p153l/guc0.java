package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class guc0 {

    /* JADX INFO: renamed from: a */
    public final zlj f106483a;

    /* JADX INFO: renamed from: b */
    public final List<amj> f106484b;

    public guc0(zlj zljVar) {
        this.f106483a = zljVar;
        ArrayList arrayList = new ArrayList();
        this.f106484b = arrayList;
        arrayList.add(new amj(zljVar, new int[]{1}));
    }

    /* JADX INFO: renamed from: a */
    public final amj m132277a(int i) {
        if (i >= this.f106484b.size()) {
            List<amj> list = this.f106484b;
            amj amjVarM98842i = list.get(list.size() - 1);
            for (int size = this.f106484b.size(); size <= i; size++) {
                zlj zljVar = this.f106483a;
                amjVarM98842i = amjVarM98842i.m98842i(new amj(zljVar, new int[]{1, zljVar.m220219c((size - 1) + zljVar.m220220d())}));
                this.f106484b.add(amjVarM98842i);
            }
        }
        return this.f106484b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public void m132278b(int[] iArr, int i) {
        if (i == 0) {
            wg3.m206174a("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            wg3.m206174a("No data bytes provided");
            return;
        }
        amj amjVarM132277a = m132277a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM98838e = new amj(this.f106483a, iArr2).m98843j(i, 1).m98835b(amjVarM132277a)[1].m98838e();
        int length2 = i - iArrM98838e.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM98838e, 0, iArr, length + length2, iArrM98838e.length);
    }
}
