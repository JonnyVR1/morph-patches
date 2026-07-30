package p153l;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class y4l {

    /* JADX INFO: renamed from: b */
    public static final String[] f197477b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c */
    public static final int[][] f197478c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f197479d;

    /* JADX INFO: renamed from: e */
    public static final int[][] f197480e;

    /* JADX INFO: renamed from: a */
    public final byte[] f197481a;

    /* JADX INFO: renamed from: l.y4l$a */
    public class C21516a implements Comparator<k3g0> {
        public C21516a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(k3g0 k3g0Var, k3g0 k3g0Var2) {
            return k3g0Var.m148020d() - k3g0Var2.m148020d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        f197479d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f197479d[0][i] = i - 63;
        }
        f197479d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f197479d[1][i2] = i2 - 95;
        }
        f197479d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f197479d[2][i3] = i3 - 46;
        }
        int[] iArr2 = f197479d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f197479d[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                f197479d[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        f197480e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f197480e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public y4l(byte[] bArr) {
        this.f197481a = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static Collection<k3g0> m214236b(Iterable<k3g0> iterable) {
        LinkedList linkedList = new LinkedList();
        for (k3g0 k3g0Var : iterable) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedList.add(k3g0Var);
                    break;
                }
                k3g0 k3g0Var2 = (k3g0) it.next();
                if (k3g0Var2.m148022f(k3g0Var)) {
                    break;
                }
                if (k3g0Var.m148022f(k3g0Var2)) {
                    it.remove();
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: d */
    public static void m214237d(k3g0 k3g0Var, int i, int i2, Collection<k3g0> collection) {
        k3g0 k3g0VarM148018b = k3g0Var.m148018b(i);
        collection.add(k3g0VarM148018b.m148023g(4, i2));
        if (k3g0Var.m148021e() != 4) {
            collection.add(k3g0VarM148018b.m148024h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(k3g0VarM148018b.m148023g(2, 16 - i2).m148023g(2, 1));
        }
        if (k3g0Var.m148019c() > 0) {
            collection.add(k3g0Var.m148017a(i).m148017a(i + 1));
        }
    }

    /* JADX INFO: renamed from: f */
    public static Collection<k3g0> m214238f(Iterable<k3g0> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<k3g0> it = iterable.iterator();
        while (it.hasNext()) {
            m214237d(it.next(), i, i2, linkedList);
        }
        return m214236b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    /* JADX INFO: renamed from: a */
    public b13 m214239a() {
        int i;
        Collection<k3g0> collectionSingletonList = Collections.singletonList(k3g0.f123712e);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f197481a;
            if (i2 >= bArr.length) {
                return ((k3g0) Collections.min(collectionSingletonList, new C21516a())).m148025i(this.f197481a);
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
                collectionSingletonList = m214238f(collectionSingletonList, i2, i);
                i2 = i3;
            } else {
                collectionSingletonList = m214241e(collectionSingletonList, i2);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m214240c(k3g0 k3g0Var, int i, Collection<k3g0> collection) {
        char c = (char) (this.f197481a[i] & 255);
        boolean z = f197479d[k3g0Var.m148021e()][c] > 0;
        k3g0 k3g0VarM148018b = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f197479d[i2][c];
            if (i3 > 0) {
                if (k3g0VarM148018b == null) {
                    k3g0VarM148018b = k3g0Var.m148018b(i);
                }
                if (!z || i2 == k3g0Var.m148021e() || i2 == 2) {
                    collection.add(k3g0VarM148018b.m148023g(i2, i3));
                }
                if (!z && f197480e[k3g0Var.m148021e()][i2] >= 0) {
                    collection.add(k3g0VarM148018b.m148024h(i2, i3));
                }
            }
        }
        if (k3g0Var.m148019c() > 0 || f197479d[k3g0Var.m148021e()][c] == 0) {
            collection.add(k3g0Var.m148017a(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public final Collection<k3g0> m214241e(Iterable<k3g0> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator<k3g0> it = iterable.iterator();
        while (it.hasNext()) {
            m214240c(it.next(), i, linkedList);
        }
        return m214236b(linkedList);
    }
}
