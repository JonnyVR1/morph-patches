package p153l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class bur0 implements itr0 {

    /* JADX INFO: renamed from: a */
    public final dfw0 f78535a = new dfw0(new byte[5], 5);

    /* JADX INFO: renamed from: b */
    public final SparseArray f78536b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f78537c = new SparseIntArray();

    /* JADX INFO: renamed from: d */
    public final int f78538d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cur0 f78539e;

    public bur0(cur0 cur0Var, int i) {
        this.f78539e = cur0Var;
        this.f78538d = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    @Override // p153l.itr0
    /* JADX INFO: renamed from: b */
    public final void mo100404b(bgw0 bgw0Var) {
        int i;
        int i2;
        int i3;
        if (bgw0Var.m104245B() != 2) {
            return;
        }
        nnw0 nnw0Var = (nnw0) this.f78539e.f83873a.get(0);
        if ((bgw0Var.m104245B() & 128) != 0) {
            bgw0Var.m104270l(1);
            int iM104249F = bgw0Var.m104249F();
            int i4 = 3;
            bgw0Var.m104270l(3);
            bgw0Var.m104264f(this.f78535a, 2);
            this.f78535a.m115561m(3);
            int i5 = 13;
            this.f78539e.f83889q = this.f78535a.m115552d(13);
            bgw0Var.m104264f(this.f78535a, 2);
            int i6 = 4;
            this.f78535a.m115561m(4);
            int i7 = 12;
            bgw0Var.m104270l(this.f78535a.m115552d(12));
            this.f78536b.clear();
            this.f78537c.clear();
            int iM104275q = bgw0Var.m104275q();
            while (iM104275q > 0) {
                int i8 = 5;
                bgw0Var.m104264f(this.f78535a, 5);
                dfw0 dfw0Var = this.f78535a;
                int iM115552d = dfw0Var.m115552d(8);
                dfw0Var.m115561m(i4);
                int iM115552d2 = this.f78535a.m115552d(i5);
                this.f78535a.m115561m(i6);
                int iM115552d3 = this.f78535a.m115552d(i7);
                int iM104277s = bgw0Var.m104277s();
                int i9 = iM104277s + iM115552d3;
                ArrayList arrayList = null;
                String strTrim = null;
                int i10 = -1;
                while (true) {
                    if (bgw0Var.m104277s() >= i9) {
                        i = i6;
                        break;
                    }
                    int iM104245B = bgw0Var.m104245B();
                    int iM104277s2 = bgw0Var.m104277s() + bgw0Var.m104245B();
                    if (iM104277s2 > i9) {
                        i = 4;
                        break;
                    }
                    if (iM104245B == i8) {
                        long jM104253J = bgw0Var.m104253J();
                        if (jM104253J == 1094921523) {
                            iM104275q = iM104275q;
                            i10 = 129;
                            i2 = 4;
                            iM104277s2 = iM104277s2;
                        } else {
                            if (jM104253J == 1161904947) {
                                iM104275q = iM104275q;
                                i10 = 135;
                            } else if (jM104253J == 1094921524) {
                                iM104275q = iM104275q;
                                i10 = 172;
                            } else if (jM104253J == 1212503619) {
                                i3 = 36;
                                i10 = i3;
                            }
                            i2 = 4;
                        }
                    } else if (iM104245B == 106) {
                        iM104275q = iM104275q;
                        i10 = 129;
                        i2 = 4;
                        iM104277s2 = iM104277s2;
                    } else if (iM104245B == 122) {
                        iM104275q = iM104275q;
                        i10 = 135;
                        i2 = 4;
                    } else if (iM104245B == 127) {
                        if (bgw0Var.m104245B() == 21) {
                            iM104275q = iM104275q;
                            i10 = 172;
                        }
                        i2 = 4;
                    } else if (iM104245B == 123) {
                        i3 = CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
                        i10 = i3;
                        i2 = 4;
                    } else if (iM104245B == 10) {
                        strTrim = bgw0Var.m104259a(i4, cow0.f82931c).trim();
                        i2 = 4;
                    } else if (iM104245B == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (bgw0Var.m104277s() < iM104277s2) {
                            String strTrim2 = bgw0Var.m104259a(i4, cow0.f82931c).trim();
                            int iM104245B2 = bgw0Var.m104245B();
                            int i11 = iM104275q;
                            byte[] bArr = new byte[4];
                            bgw0Var.m104265g(bArr, 0, 4);
                            arrayList2.add(new dur0(strTrim2, iM104245B2, bArr));
                            iM104275q = i11;
                            iM104277s2 = iM104277s2;
                            i4 = 3;
                        }
                        iM104275q = iM104275q;
                        iM104277s2 = iM104277s2;
                        i2 = 4;
                        arrayList = arrayList2;
                        i10 = 89;
                    } else {
                        iM104275q = iM104275q;
                        iM104277s2 = iM104277s2;
                        i2 = 4;
                        if (iM104245B == 111) {
                            i10 = 257;
                        }
                    }
                    bgw0Var.m104270l(iM104277s2 - bgw0Var.m104277s());
                    i6 = i2;
                    iM104275q = iM104275q;
                    i4 = 3;
                    i8 = 5;
                }
                int i12 = iM104275q;
                bgw0Var.m104269k(i9);
                eur0 eur0Var = new eur0(i10, strTrim, arrayList, Arrays.copyOfRange(bgw0Var.m104271m(), iM104277s, i9));
                if (iM115552d == 6 || iM115552d == 5) {
                    iM115552d = eur0Var.f95950a;
                }
                int i13 = i12 - (iM115552d3 + 5);
                if (!this.f78539e.f83879g.get(iM115552d2)) {
                    hur0 hur0VarMo127540a = this.f78539e.f83876d.mo127540a(iM115552d, eur0Var);
                    this.f78537c.put(iM115552d2, iM115552d2);
                    this.f78536b.put(iM115552d2, hur0VarMo127540a);
                }
                iM104275q = i13;
                i6 = i;
                i4 = 3;
                i7 = 12;
                i5 = 13;
            }
            int size = this.f78537c.size();
            for (int i14 = 0; i14 < size; i14++) {
                SparseIntArray sparseIntArray = this.f78537c;
                cur0 cur0Var = this.f78539e;
                int iKeyAt = sparseIntArray.keyAt(i14);
                int iValueAt = sparseIntArray.valueAt(i14);
                cur0Var.f83879g.put(iKeyAt, true);
                this.f78539e.f83880h.put(iValueAt, true);
                hur0 hur0Var = (hur0) this.f78536b.valueAt(i14);
                if (hur0Var != null) {
                    hur0Var.mo100239a(nnw0Var, this.f78539e.f83883k, new gur0(iM104249F, iKeyAt, 8192));
                    this.f78539e.f83878f.put(iValueAt, hur0Var);
                }
            }
            this.f78539e.f83878f.remove(this.f78538d);
            this.f78539e.f83884l = 0;
            cur0 cur0Var2 = this.f78539e;
            if (cur0Var2.f83884l == 0) {
                cur0Var2.f83883k.mo101544c();
                this.f78539e.f83885m = true;
            }
        }
    }

    @Override // p153l.itr0
    /* JADX INFO: renamed from: a */
    public final void mo100403a(nnw0 nnw0Var, ser0 ser0Var, gur0 gur0Var) {
    }
}
