package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zlc0 {

    /* JADX INFO: renamed from: a */
    public final gjj f203616a;

    /* JADX INFO: renamed from: b */
    public final List<hjj> f203617b;

    public zlc0(gjj gjjVar) {
        this.f203616a = gjjVar;
        ArrayList arrayList = new ArrayList();
        this.f203617b = arrayList;
        arrayList.add(new hjj(gjjVar, new int[]{1}));
    }

    /* JADX INFO: renamed from: a */
    public final hjj m219273a(int i) {
        if (i >= this.f203617b.size()) {
            List<hjj> list = this.f203617b;
            hjj hjjVarM131384i = list.get(list.size() - 1);
            for (int size = this.f203617b.size(); size <= i; size++) {
                gjj gjjVar = this.f203616a;
                hjjVarM131384i = hjjVarM131384i.m131384i(new hjj(gjjVar, new int[]{1, gjjVar.m126539c((size - 1) + gjjVar.m126540d())}));
                this.f203617b.add(hjjVarM131384i);
            }
        }
        return this.f203617b.get(i);
    }

    /* JADX INFO: renamed from: b */
    public void m219274b(int[] iArr, int i) {
        if (i == 0) {
            ig3.m135964a("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            ig3.m135964a("No data bytes provided");
            return;
        }
        hjj hjjVarM219273a = m219273a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM131380e = new hjj(this.f203616a, iArr2).m131385j(i, 1).m131377b(hjjVarM219273a)[1].m131380e();
        int length2 = i - iArrM131380e.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM131380e, 0, iArr, length + length2, iArrM131380e.length);
    }
}
