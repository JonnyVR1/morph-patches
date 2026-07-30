package p149l;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wkr0 implements j5r0 {

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final c6r0 f186801r = new c6r0() { // from class: l.tkr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new wkr0(1, 1, pfr0.f148583a, new hew0(0L), new pir0(0), 112800)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final List f186802a;

    /* JADX INFO: renamed from: b */
    public final v6w0 f186803b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f186804c;

    /* JADX INFO: renamed from: d */
    public final zkr0 f186805d;

    /* JADX INFO: renamed from: e */
    public final pfr0 f186806e;

    /* JADX INFO: renamed from: f */
    public final SparseArray f186807f;

    /* JADX INFO: renamed from: g */
    public final SparseBooleanArray f186808g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f186809h;

    /* JADX INFO: renamed from: i */
    public final skr0 f186810i;

    /* JADX INFO: renamed from: j */
    public rkr0 f186811j;

    /* JADX INFO: renamed from: k */
    public m5r0 f186812k;

    /* JADX INFO: renamed from: l */
    public int f186813l;

    /* JADX INFO: renamed from: m */
    public boolean f186814m;

    /* JADX INFO: renamed from: n */
    public boolean f186815n;

    /* JADX INFO: renamed from: o */
    public boolean f186816o;

    /* JADX INFO: renamed from: p */
    public int f186817p;

    /* JADX INFO: renamed from: q */
    public int f186818q;

    public wkr0(int i, int i2, pfr0 pfr0Var, hew0 hew0Var, zkr0 zkr0Var, int i3) {
        this.f186805d = zkr0Var;
        this.f186806e = pfr0Var;
        this.f186802a = Collections.singletonList(hew0Var);
        this.f186803b = new v6w0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f186808g = sparseBooleanArray;
        this.f186809h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f186807f = sparseArray;
        this.f186804c = new SparseIntArray();
        this.f186810i = new skr0(112800);
        this.f186812k = m5r0.f131414v0;
        this.f186818q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray3 = this.f186807f;
            if (i4 >= size) {
                sparseArray3.put(0, new dkr0(new ukr0(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i4), (blr0) sparseArray2.valueAt(i4));
                i4++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        rkr0 rkr0Var;
        int size = this.f186802a.size();
        for (int i = 0; i < size; i++) {
            hew0 hew0Var = (hew0) this.f186802a.get(i);
            if (hew0Var.m130708f() != -9223372036854775807L) {
                long jM130706d = hew0Var.m130706d();
                if (jM130706d != -9223372036854775807L && jM130706d != 0 && jM130706d != j2) {
                    hew0Var.m130709i(j2);
                }
            } else {
                hew0Var.m130709i(j2);
            }
        }
        if (j2 != 0 && (rkr0Var = this.f186811j) != null) {
            rkr0Var.m197059d(j2);
        }
        this.f186803b.m197259h(0);
        this.f186804c.clear();
        for (int i2 = 0; i2 < this.f186807f.size(); i2++) {
            ((blr0) this.f186807f.valueAt(i2)).zzc();
        }
        this.f186817p = 0;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        byte[] bArrM197264m = this.f186803b.m197264m();
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(bArrM197264m, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z4r0Var.m217119k(i, false);
                    return true;
                }
                if (bArrM197264m[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f186812k = m5r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        long j;
        long jZzd = k5r0Var.zzd();
        long j2 = -1;
        if (this.f186814m) {
            if (jZzd != -1) {
                skr0 skr0Var = this.f186810i;
                if (!skr0Var.m184613d()) {
                    return skr0Var.m184610a(k5r0Var, s6r0Var, this.f186818q);
                }
            }
            if (this.f186815n) {
                j = 0;
            } else {
                this.f186815n = true;
                skr0 skr0Var2 = this.f186810i;
                if (skr0Var2.m184611b() != -9223372036854775807L) {
                    j = 0;
                    rkr0 rkr0Var = new rkr0(skr0Var2.m184612c(), skr0Var2.m184611b(), jZzd, this.f186818q, 112800);
                    this.f186811j = rkr0Var;
                    this.f186812k.mo129455j(rkr0Var.m197057b());
                } else {
                    j = 0;
                    this.f186812k.mo129455j(new u6r0(skr0Var2.m184611b(), 0L));
                }
            }
            if (this.f186816o) {
                this.f186816o = false;
                mo100820c(j, j);
                if (k5r0Var.zzf() != j) {
                    s6r0Var.f162847a = j;
                    return 1;
                }
            }
            rkr0 rkr0Var2 = this.f186811j;
            if (rkr0Var2 != null && rkr0Var2.m197060e()) {
                return rkr0Var2.m197056a(k5r0Var, s6r0Var);
            }
        } else {
            j2 = -1;
        }
        v6w0 v6w0Var = this.f186803b;
        byte[] bArrM197264m = v6w0Var.m197264m();
        if (9400 - v6w0Var.m197270s() < 188) {
            int iM197268q = v6w0Var.m197268q();
            if (iM197268q > 0) {
                System.arraycopy(bArrM197264m, v6w0Var.m197270s(), bArrM197264m, 0, iM197268q);
            }
            this.f186803b.m197260i(bArrM197264m, iM197268q);
        }
        while (true) {
            v6w0 v6w0Var2 = this.f186803b;
            if (v6w0Var2.m197268q() >= 188) {
                int iM197270s = v6w0Var2.m197270s();
                int iM197271t = v6w0Var2.m197271t();
                int iM107578a = clr0.m107578a(v6w0Var2.m197264m(), iM197270s, iM197271t);
                this.f186803b.m197262k(iM107578a);
                int i = iM107578a + 188;
                if (i > iM197271t) {
                    this.f186817p += iM107578a - iM197270s;
                } else {
                    this.f186817p = 0;
                }
                v6w0 v6w0Var3 = this.f186803b;
                int iM197271t2 = v6w0Var3.m197271t();
                if (i > iM197271t2) {
                    return 0;
                }
                int iM197273v = v6w0Var3.m197273v();
                if ((8388608 & iM197273v) != 0) {
                    this.f186803b.m197262k(i);
                    return 0;
                }
                int i2 = (4194304 & iM197273v) != 0 ? 1 : 0;
                int i3 = iM197273v & 32;
                int i4 = (iM197273v >> 8) & 8191;
                blr0 blr0Var = (iM197273v & 16) != 0 ? (blr0) this.f186807f.get(i4) : null;
                if (blr0Var == null) {
                    this.f186803b.m197262k(i);
                    return 0;
                }
                int i5 = iM197273v & 15;
                int i6 = this.f186804c.get(i4, i5 - 1);
                this.f186804c.put(i4, i5);
                if (i6 == i5) {
                    this.f186803b.m197262k(i);
                    return 0;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    blr0Var.zzc();
                }
                if (i3 != 0) {
                    v6w0 v6w0Var4 = this.f186803b;
                    int iM197238B = v6w0Var4.m197238B();
                    i2 |= (v6w0Var4.m197238B() & 64) != 0 ? 2 : 0;
                    this.f186803b.m197263l(iM197238B - 1);
                }
                boolean z = this.f186814m;
                if (z || !this.f186809h.get(i4, false)) {
                    this.f186803b.m197261j(i);
                    blr0Var.mo102559b(this.f186803b, i2);
                    this.f186803b.m197261j(iM197271t2);
                    if (!z) {
                        if (this.f186814m && jZzd != j2) {
                            this.f186816o = true;
                        }
                    }
                } else if (this.f186814m) {
                    this.f186816o = true;
                }
                this.f186803b.m197262k(i);
                return 0;
            }
            int iM197271t3 = v6w0Var2.m197271t();
            int iMo12727a = k5r0Var.mo12727a(bArrM197264m, iM197271t3, 9400 - iM197271t3);
            if (iMo12727a == -1) {
                for (int i7 = 0; i7 < this.f186807f.size(); i7++) {
                    blr0 blr0Var2 = (blr0) this.f186807f.valueAt(i7);
                    if (blr0Var2 instanceof ujr0) {
                        blr0Var2.mo102559b(new v6w0(), 1);
                    }
                }
                return -1;
            }
            this.f186803b.m197261j(iM197271t3 + iMo12727a);
        }
    }

    @Deprecated
    public wkr0() {
        throw null;
    }
}
