package p153l;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: loaded from: classes7.dex */
public final class upj0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f180275c = {1, 1, 2};

    /* JADX INFO: renamed from: a */
    public final spj0 f180276a = new spj0();

    /* JADX INFO: renamed from: b */
    public final tpj0 f180277b = new tpj0();

    /* JADX INFO: renamed from: a */
    public r5d0 m197096a(int i, b13 b13Var, int i2) throws NotFoundException {
        int[] iArrM202257m = vpj0.m202257m(b13Var, i2, false, f180275c);
        try {
            return this.f180277b.m192144b(i, b13Var, iArrM202257m);
        } catch (ReaderException unused) {
            return this.f180276a.m187348b(i, b13Var, iArrM202257m);
        }
    }
}
