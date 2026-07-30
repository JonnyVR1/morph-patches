package p153l;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class cur0 implements per0 {

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final ifr0 f83872r = new ifr0() { // from class: l.ztr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new cur0(1, 1, vor0.f185158a, new nnw0(0L), new vrr0(0), 112800)};
        }
    };

    /* JADX INFO: renamed from: a */
    public final List f83873a;

    /* JADX INFO: renamed from: b */
    public final bgw0 f83874b;

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f83875c;

    /* JADX INFO: renamed from: d */
    public final fur0 f83876d;

    /* JADX INFO: renamed from: e */
    public final vor0 f83877e;

    /* JADX INFO: renamed from: f */
    public final SparseArray f83878f;

    /* JADX INFO: renamed from: g */
    public final SparseBooleanArray f83879g;

    /* JADX INFO: renamed from: h */
    public final SparseBooleanArray f83880h;

    /* JADX INFO: renamed from: i */
    public final ytr0 f83881i;

    /* JADX INFO: renamed from: j */
    public xtr0 f83882j;

    /* JADX INFO: renamed from: k */
    public ser0 f83883k;

    /* JADX INFO: renamed from: l */
    public int f83884l;

    /* JADX INFO: renamed from: m */
    public boolean f83885m;

    /* JADX INFO: renamed from: n */
    public boolean f83886n;

    /* JADX INFO: renamed from: o */
    public boolean f83887o;

    /* JADX INFO: renamed from: p */
    public int f83888p;

    /* JADX INFO: renamed from: q */
    public int f83889q;

    public cur0(int i, int i2, vor0 vor0Var, nnw0 nnw0Var, fur0 fur0Var, int i3) {
        this.f83876d = fur0Var;
        this.f83877e = vor0Var;
        this.f83873a = Collections.singletonList(nnw0Var);
        this.f83874b = new bgw0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f83879g = sparseBooleanArray;
        this.f83880h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f83878f = sparseArray;
        this.f83875c = new SparseIntArray();
        this.f83881i = new ytr0(112800);
        this.f83883k = ser0.f167641v0;
        this.f83889q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray3 = this.f83878f;
            if (i4 >= size) {
                sparseArray3.put(0, new jtr0(new aur0(this)));
                return;
            } else {
                sparseArray3.put(sparseArray2.keyAt(i4), (hur0) sparseArray2.valueAt(i4));
                i4++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        xtr0 xtr0Var;
        int size = this.f83873a.size();
        for (int i = 0; i < size; i++) {
            nnw0 nnw0Var = (nnw0) this.f83873a.get(i);
            if (nnw0Var.m164003f() != -9223372036854775807L) {
                long jM164001d = nnw0Var.m164001d();
                if (jM164001d != -9223372036854775807L && jM164001d != 0 && jM164001d != j2) {
                    nnw0Var.m164004i(j2);
                }
            } else {
                nnw0Var.m164004i(j2);
            }
        }
        if (j2 != 0 && (xtr0Var = this.f83882j) != null) {
            xtr0Var.m103780d(j2);
        }
        this.f83874b.m104266h(0);
        this.f83875c.clear();
        for (int i2 = 0; i2 < this.f83878f.size(); i2++) {
            ((hur0) this.f83878f.valueAt(i2)).zzc();
        }
        this.f83888p = 0;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        byte[] bArrM104271m = this.f83874b.m104271m();
        fer0 fer0Var = (fer0) qer0Var;
        fer0Var.mo125313c(bArrM104271m, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    fer0Var.m125319k(i, false);
                    return true;
                }
                if (bArrM104271m[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f83883k = ser0Var;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        long j;
        long jZzd = qer0Var.zzd();
        long j2 = -1;
        if (this.f83885m) {
            if (jZzd != -1) {
                ytr0 ytr0Var = this.f83881i;
                if (!ytr0Var.m217343d()) {
                    return ytr0Var.m217340a(qer0Var, yfr0Var, this.f83889q);
                }
            }
            if (this.f83886n) {
                j = 0;
            } else {
                this.f83886n = true;
                ytr0 ytr0Var2 = this.f83881i;
                if (ytr0Var2.m217341b() != -9223372036854775807L) {
                    j = 0;
                    xtr0 xtr0Var = new xtr0(ytr0Var2.m217342c(), ytr0Var2.m217341b(), jZzd, this.f83889q, 112800);
                    this.f83882j = xtr0Var;
                    this.f83883k.mo101551j(xtr0Var.m103778b());
                } else {
                    j = 0;
                    this.f83883k.mo101551j(new agr0(ytr0Var2.m217341b(), 0L));
                }
            }
            if (this.f83887o) {
                this.f83887o = false;
                mo97906c(j, j);
                if (qer0Var.zzf() != j) {
                    yfr0Var.f199649a = j;
                    return 1;
                }
            }
            xtr0 xtr0Var2 = this.f83882j;
            if (xtr0Var2 != null && xtr0Var2.m103781e()) {
                return xtr0Var2.m103777a(qer0Var, yfr0Var);
            }
        } else {
            j2 = -1;
        }
        bgw0 bgw0Var = this.f83874b;
        byte[] bArrM104271m = bgw0Var.m104271m();
        if (9400 - bgw0Var.m104277s() < 188) {
            int iM104275q = bgw0Var.m104275q();
            if (iM104275q > 0) {
                System.arraycopy(bArrM104271m, bgw0Var.m104277s(), bArrM104271m, 0, iM104275q);
            }
            this.f83874b.m104267i(bArrM104271m, iM104275q);
        }
        while (true) {
            bgw0 bgw0Var2 = this.f83874b;
            if (bgw0Var2.m104275q() >= 188) {
                int iM104277s = bgw0Var2.m104277s();
                int iM104278t = bgw0Var2.m104278t();
                int iM142234a = iur0.m142234a(bgw0Var2.m104271m(), iM104277s, iM104278t);
                this.f83874b.m104269k(iM142234a);
                int i = iM142234a + 188;
                if (i > iM104278t) {
                    this.f83888p += iM142234a - iM104277s;
                } else {
                    this.f83888p = 0;
                }
                bgw0 bgw0Var3 = this.f83874b;
                int iM104278t2 = bgw0Var3.m104278t();
                if (i > iM104278t2) {
                    return 0;
                }
                int iM104280v = bgw0Var3.m104280v();
                if ((8388608 & iM104280v) != 0) {
                    this.f83874b.m104269k(i);
                    return 0;
                }
                int i2 = (4194304 & iM104280v) != 0 ? 1 : 0;
                int i3 = iM104280v & 32;
                int i4 = (iM104280v >> 8) & 8191;
                hur0 hur0Var = (iM104280v & 16) != 0 ? (hur0) this.f83878f.get(i4) : null;
                if (hur0Var == null) {
                    this.f83874b.m104269k(i);
                    return 0;
                }
                int i5 = iM104280v & 15;
                int i6 = this.f83875c.get(i4, i5 - 1);
                this.f83875c.put(i4, i5);
                if (i6 == i5) {
                    this.f83874b.m104269k(i);
                    return 0;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    hur0Var.zzc();
                }
                if (i3 != 0) {
                    bgw0 bgw0Var4 = this.f83874b;
                    int iM104245B = bgw0Var4.m104245B();
                    i2 |= (bgw0Var4.m104245B() & 64) != 0 ? 2 : 0;
                    this.f83874b.m104270l(iM104245B - 1);
                }
                boolean z = this.f83885m;
                if (z || !this.f83880h.get(i4, false)) {
                    this.f83874b.m104268j(i);
                    hur0Var.mo100240b(this.f83874b, i2);
                    this.f83874b.m104268j(iM104278t2);
                    if (!z) {
                        if (this.f83885m && jZzd != j2) {
                            this.f83887o = true;
                        }
                    }
                } else if (this.f83885m) {
                    this.f83887o = true;
                }
                this.f83874b.m104269k(i);
                return 0;
            }
            int iM104278t3 = bgw0Var2.m104278t();
            int iMo12781a = qer0Var.mo12781a(bArrM104271m, iM104278t3, 9400 - iM104278t3);
            if (iMo12781a == -1) {
                for (int i7 = 0; i7 < this.f83878f.size(); i7++) {
                    hur0 hur0Var2 = (hur0) this.f83878f.valueAt(i7);
                    if (hur0Var2 instanceof atr0) {
                        hur0Var2.mo100240b(new bgw0(), 1);
                    }
                }
                return -1;
            }
            this.f83874b.m104268j(iM104278t3 + iMo12781a);
        }
    }

    @Deprecated
    public cur0() {
        throw null;
    }
}
