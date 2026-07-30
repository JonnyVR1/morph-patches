package p149l;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class bvf0 {

    /* JADX INFO: renamed from: e */
    public static final bvf0 f77438e = new bvf0(usi0.f177978b, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f77439a;

    /* JADX INFO: renamed from: b */
    public final usi0 f77440b;

    /* JADX INFO: renamed from: c */
    public final int f77441c;

    /* JADX INFO: renamed from: d */
    public final int f77442d;

    public bvf0(usi0 usi0Var, int i, int i2, int i3) {
        this.f77440b = usi0Var;
        this.f77439a = i;
        this.f77441c = i2;
        this.f77442d = i3;
    }

    /* JADX INFO: renamed from: a */
    public bvf0 m104023a(int i) {
        int i2;
        usi0 usi0VarM195204a = this.f77440b;
        int i3 = this.f77439a;
        int i4 = this.f77442d;
        if (i3 == 4 || i3 == 2) {
            int i5 = i2l.f110562c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            usi0VarM195204a = usi0VarM195204a.m195204a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f77441c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        bvf0 bvf0Var = new bvf0(usi0VarM195204a, i3, i8 + 1, i4 + i2);
        return bvf0Var.f77441c == 2078 ? bvf0Var.m104024b(i + 1) : bvf0Var;
    }

    /* JADX INFO: renamed from: b */
    public bvf0 m104024b(int i) {
        int i2 = this.f77441c;
        return i2 == 0 ? this : new bvf0(this.f77440b.m195205b(i - i2, i2), this.f77439a, 0, this.f77442d);
    }

    /* JADX INFO: renamed from: c */
    public int m104025c() {
        return this.f77441c;
    }

    /* JADX INFO: renamed from: d */
    public int m104026d() {
        return this.f77442d;
    }

    /* JADX INFO: renamed from: e */
    public int m104027e() {
        return this.f77439a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m104028f(bvf0 bvf0Var) {
        int i;
        int i2 = this.f77442d + (i2l.f110562c[this.f77439a][bvf0Var.f77439a] >> 16);
        int i3 = bvf0Var.f77441c;
        if (i3 > 0 && ((i = this.f77441c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= bvf0Var.f77442d;
    }

    /* JADX INFO: renamed from: g */
    public bvf0 m104029g(int i, int i2) {
        int i3 = this.f77442d;
        usi0 usi0VarM195204a = this.f77440b;
        int i4 = this.f77439a;
        if (i != i4) {
            int i5 = i2l.f110562c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            usi0VarM195204a = usi0VarM195204a.m195204a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new bvf0(usi0VarM195204a.m195204a(i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: renamed from: h */
    public bvf0 m104030h(int i, int i2) {
        usi0 usi0Var = this.f77440b;
        int i3 = this.f77439a;
        int i4 = i3 == 2 ? 4 : 5;
        return new bvf0(usi0Var.m195204a(i2l.f110564e[i3][i], i4).m195204a(i2, 5), this.f77439a, 0, this.f77442d + i4 + 5);
    }

    /* JADX INFO: renamed from: i */
    public m03 m104031i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (usi0 usi0VarM195206d = m104024b(bArr.length).f77440b; usi0VarM195206d != null; usi0VarM195206d = usi0VarM195206d.m195206d()) {
            linkedList.addFirst(usi0VarM195206d);
        }
        m03 m03Var = new m03();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((usi0) it.next()).mo176936c(m03Var, bArr);
        }
        return m03Var;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", i2l.f110561b[this.f77439a], Integer.valueOf(this.f77442d), Integer.valueOf(this.f77441c));
    }
}
