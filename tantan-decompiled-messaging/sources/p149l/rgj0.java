package p149l;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* JADX INFO: loaded from: classes7.dex */
public final class rgj0 {

    /* JADX INFO: renamed from: c */
    public static final int[] f159261c = {1, 1, 2};

    /* JADX INFO: renamed from: a */
    public final pgj0 f159262a = new pgj0();

    /* JADX INFO: renamed from: b */
    public final qgj0 f159263b = new qgj0();

    /* JADX INFO: renamed from: a */
    public oxc0 m179169a(int i, m03 m03Var, int i2) throws NotFoundException {
        int[] iArrM184104m = sgj0.m184104m(m03Var, i2, false, f159261c);
        try {
            return this.f159263b.m174437b(i, m03Var, iArrM184104m);
        } catch (ReaderException unused) {
            return this.f159262a.m168756b(i, m03Var, iArrM184104m);
        }
    }
}
