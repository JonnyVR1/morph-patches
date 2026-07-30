package p153l;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class k3g0 {

    /* JADX INFO: renamed from: e */
    public static final k3g0 f123712e = new k3g0(x1j0.f192066b, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f123713a;

    /* JADX INFO: renamed from: b */
    public final x1j0 f123714b;

    /* JADX INFO: renamed from: c */
    public final int f123715c;

    /* JADX INFO: renamed from: d */
    public final int f123716d;

    public k3g0(x1j0 x1j0Var, int i, int i2, int i3) {
        this.f123714b = x1j0Var;
        this.f123713a = i;
        this.f123715c = i2;
        this.f123716d = i3;
    }

    /* JADX INFO: renamed from: a */
    public k3g0 m148017a(int i) {
        int i2;
        x1j0 x1j0VarM209062a = this.f123714b;
        int i3 = this.f123713a;
        int i4 = this.f123716d;
        if (i3 == 4 || i3 == 2) {
            int i5 = y4l.f197478c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            x1j0VarM209062a = x1j0VarM209062a.m209062a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f123715c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        k3g0 k3g0Var = new k3g0(x1j0VarM209062a, i3, i8 + 1, i4 + i2);
        return k3g0Var.f123715c == 2078 ? k3g0Var.m148018b(i + 1) : k3g0Var;
    }

    /* JADX INFO: renamed from: b */
    public k3g0 m148018b(int i) {
        int i2 = this.f123715c;
        return i2 == 0 ? this : new k3g0(this.f123714b.m209063b(i - i2, i2), this.f123713a, 0, this.f123716d);
    }

    /* JADX INFO: renamed from: c */
    public int m148019c() {
        return this.f123715c;
    }

    /* JADX INFO: renamed from: d */
    public int m148020d() {
        return this.f123716d;
    }

    /* JADX INFO: renamed from: e */
    public int m148021e() {
        return this.f123713a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m148022f(k3g0 k3g0Var) {
        int i;
        int i2 = this.f123716d + (y4l.f197478c[this.f123713a][k3g0Var.f123713a] >> 16);
        int i3 = k3g0Var.f123715c;
        if (i3 > 0 && ((i = this.f123715c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= k3g0Var.f123716d;
    }

    /* JADX INFO: renamed from: g */
    public k3g0 m148023g(int i, int i2) {
        int i3 = this.f123716d;
        x1j0 x1j0VarM209062a = this.f123714b;
        int i4 = this.f123713a;
        if (i != i4) {
            int i5 = y4l.f197478c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            x1j0VarM209062a = x1j0VarM209062a.m209062a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new k3g0(x1j0VarM209062a.m209062a(i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: renamed from: h */
    public k3g0 m148024h(int i, int i2) {
        x1j0 x1j0Var = this.f123714b;
        int i3 = this.f123713a;
        int i4 = i3 == 2 ? 4 : 5;
        return new k3g0(x1j0Var.m209062a(y4l.f197480e[i3][i], i4).m209062a(i2, 5), this.f123713a, 0, this.f123716d + i4 + 5);
    }

    /* JADX INFO: renamed from: i */
    public b13 m148025i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (x1j0 x1j0VarM209064d = m148018b(bArr.length).f123714b; x1j0VarM209064d != null; x1j0VarM209064d = x1j0VarM209064d.m209064d()) {
            linkedList.addFirst(x1j0VarM209064d);
        }
        b13 b13Var = new b13();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((x1j0) it.next()).mo99476c(b13Var, bArr);
        }
        return b13Var;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", y4l.f197477b[this.f123713a], Integer.valueOf(this.f123716d), Integer.valueOf(this.f123715c));
    }
}
