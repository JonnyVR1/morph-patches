package p149l;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class i2l {

    /* JADX INFO: renamed from: b */
    public static final String[] f110561b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c */
    public static final int[][] f110562c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f110563d;

    /* JADX INFO: renamed from: e */
    public static final int[][] f110564e;

    /* JADX INFO: renamed from: a */
    public final byte[] f110565a;

    /* JADX INFO: renamed from: l.i2l$a */
    public class C17463a implements Comparator<bvf0> {
        public C17463a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(bvf0 bvf0Var, bvf0 bvf0Var2) {
            return bvf0Var.m104026d() - bvf0Var2.m104026d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f110563d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f110563d[0][i] = i - 63;
        }
        f110563d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f110563d[1][i2] = i2 - 95;
        }
        f110563d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f110563d[2][i3] = i3 - 46;
        }
        int[] iArr2 = f110563d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f110563d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f110563d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f110564e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f110564e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public i2l(byte[] bArr) {
        this.f110565a = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static Collection<bvf0> m134053b(Iterable<bvf0> iterable) {
        LinkedList linkedList = new LinkedList();
        for (bvf0 bvf0Var : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(bvf0Var);
                    break;
                }
                bvf0 bvf0Var2 = (bvf0) it.next();
                if (bvf0Var2.m104028f(bvf0Var)) {
                    break;
                }
                if (bvf0Var.m104028f(bvf0Var2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: d */
    public static void m134054d(bvf0 bvf0Var, int i, int i2, Collection<bvf0> collection) {
        bvf0 bvf0VarM104024b = bvf0Var.m104024b(i);
        collection.add(bvf0VarM104024b.m104029g(4, i2));
        if (bvf0Var.m104027e() != 4) {
            collection.add(bvf0VarM104024b.m104030h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(bvf0VarM104024b.m104029g(2, 16 - i2).m104029g(2, 1));
        }
        if (bvf0Var.m104025c() > 0) {
            collection.add(bvf0Var.m104023a(i).m104023a(i + 1));
        }
    }

    /* JADX INFO: renamed from: f */
    public static Collection<bvf0> m134055f(Iterable<bvf0> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<bvf0> it = iterable.iterator();
        while (it.hasNext()) {
            m134054d(it.next(), i, i2, linkedList);
        }
        return m134053b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX INFO: renamed from: a */
    public m03 m134056a() {
        int i;
        Collection<bvf0> collectionSingletonList = Collections.singletonList(bvf0.f77438e);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f110565a;
            if (i2 >= bArr.length) {
                return ((bvf0) Collections.min(collectionSingletonList, new C17463a())).m104031i(this.f110565a);
            }
            int i3 = i2 + 1;
            byte b = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b2 = bArr[i2];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                    } else if (b == 32) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                } else if (b == 32) {
                    i = 4;
                } else {
                    i = 0;
                }
            } else if (b == 10) {
                i = 2;
            } else {
                i = 0;
            }
            if (i > 0) {
                collectionSingletonList = m134055f(collectionSingletonList, i2, i);
                i2 = i3;
            } else {
                collectionSingletonList = m134058e(collectionSingletonList, i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m134057c(bvf0 bvf0Var, int i, Collection<bvf0> collection) {
        char c = (char) (this.f110565a[i] & 255);
        boolean z = f110563d[bvf0Var.m104027e()][c] > 0;
        bvf0 bvf0VarM104024b = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f110563d[i2][c];
            if (i3 > 0) {
                if (bvf0VarM104024b == null) {
                    bvf0VarM104024b = bvf0Var.m104024b(i);
                }
                if (!z || i2 == bvf0Var.m104027e() || i2 == 2) {
                    collection.add(bvf0VarM104024b.m104029g(i2, i3));
                }
                if (!z && f110564e[bvf0Var.m104027e()][i2] >= 0) {
                    collection.add(bvf0VarM104024b.m104030h(i2, i3));
                }
            }
        }
        if (bvf0Var.m104025c() > 0 || f110563d[bvf0Var.m104027e()][c] == 0) {
            collection.add(bvf0Var.m104023a(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public final Collection<bvf0> m134058e(Iterable<bvf0> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator<bvf0> it = iterable.iterator();
        while (it.hasNext()) {
            m134057c(it.next(), i, linkedList);
        }
        return m134053b(linkedList);
    }
}
