package p149l;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class vkr0 implements ckr0 {

    /* JADX INFO: renamed from: a */
    public final x5w0 f181837a = new x5w0(new byte[5], 5);

    /* JADX INFO: renamed from: b */
    public final SparseArray f181838b = new SparseArray();

    /* JADX INFO: renamed from: c */
    public final SparseIntArray f181839c = new SparseIntArray();

    /* JADX INFO: renamed from: d */
    public final int f181840d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ wkr0 f181841e;

    public vkr0(wkr0 wkr0Var, int i) {
        this.f181841e = wkr0Var;
        this.f181840d = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101  */
    @Override // p149l.ckr0
    /* JADX INFO: renamed from: b */
    public final void mo107428b(v6w0 v6w0Var) {
        int i;
        int i2;
        int i3;
        if (v6w0Var.m197238B() != 2) {
            return;
        }
        hew0 hew0Var = (hew0) this.f181841e.f186802a.get(0);
        if ((v6w0Var.m197238B() & 128) != 0) {
            v6w0Var.m197263l(1);
            int iM197242F = v6w0Var.m197242F();
            int i4 = 3;
            v6w0Var.m197263l(3);
            v6w0Var.m197257f(this.f181837a, 2);
            this.f181837a.m207159m(3);
            int i5 = 13;
            this.f181841e.f186818q = this.f181837a.m207150d(13);
            v6w0Var.m197257f(this.f181837a, 2);
            int i6 = 4;
            this.f181837a.m207159m(4);
            int i7 = 12;
            v6w0Var.m197263l(this.f181837a.m207150d(12));
            this.f181838b.clear();
            this.f181839c.clear();
            int iM197268q = v6w0Var.m197268q();
            while (iM197268q > 0) {
                int i8 = 5;
                v6w0Var.m197257f(this.f181837a, 5);
                x5w0 x5w0Var = this.f181837a;
                int iM207150d = x5w0Var.m207150d(8);
                x5w0Var.m207159m(i4);
                int iM207150d2 = this.f181837a.m207150d(i5);
                this.f181837a.m207159m(i6);
                int iM207150d3 = this.f181837a.m207150d(i7);
                int iM197270s = v6w0Var.m197270s();
                int i9 = iM197270s + iM207150d3;
                ArrayList arrayList = null;
                String strTrim = null;
                int i10 = -1;
                while (true) {
                    if (v6w0Var.m197270s() >= i9) {
                        i = i6;
                        break;
                    }
                    int iM197238B = v6w0Var.m197238B();
                    int iM197270s2 = v6w0Var.m197270s() + v6w0Var.m197238B();
                    if (iM197270s2 > i9) {
                        i = 4;
                        break;
                    }
                    if (iM197238B == i8) {
                        long jM197246J = v6w0Var.m197246J();
                        if (jM197246J == 1094921523) {
                            iM197268q = iM197268q;
                            i10 = 129;
                            i2 = 4;
                            iM197270s2 = iM197270s2;
                        } else {
                            if (jM197246J == 1161904947) {
                                iM197268q = iM197268q;
                                i10 = 135;
                            } else if (jM197246J == 1094921524) {
                                iM197268q = iM197268q;
                                i10 = 172;
                            } else if (jM197246J == 1212503619) {
                                i3 = 36;
                                i10 = i3;
                            }
                            i2 = 4;
                        }
                    } else if (iM197238B == 106) {
                        iM197268q = iM197268q;
                        i10 = 129;
                        i2 = 4;
                        iM197270s2 = iM197270s2;
                    } else if (iM197238B == 122) {
                        iM197268q = iM197268q;
                        i10 = 135;
                        i2 = 4;
                    } else if (iM197238B == 127) {
                        if (v6w0Var.m197238B() == 21) {
                            iM197268q = iM197268q;
                            i10 = 172;
                        }
                        i2 = 4;
                    } else if (iM197238B == 123) {
                        i3 = CipherSuite.TLS_PSK_WITH_RC4_128_SHA;
                        i10 = i3;
                        i2 = 4;
                    } else if (iM197238B == 10) {
                        strTrim = v6w0Var.m197252a(i4, wew0.f185990c).trim();
                        i2 = 4;
                    } else if (iM197238B == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (v6w0Var.m197270s() < iM197270s2) {
                            String strTrim2 = v6w0Var.m197252a(i4, wew0.f185990c).trim();
                            int iM197238B2 = v6w0Var.m197238B();
                            int i11 = iM197268q;
                            byte[] bArr = new byte[4];
                            v6w0Var.m197258g(bArr, 0, 4);
                            arrayList2.add(new xkr0(strTrim2, iM197238B2, bArr));
                            iM197268q = i11;
                            iM197270s2 = iM197270s2;
                            i4 = 3;
                        }
                        iM197268q = iM197268q;
                        iM197270s2 = iM197270s2;
                        i2 = 4;
                        arrayList = arrayList2;
                        i10 = 89;
                    } else {
                        iM197268q = iM197268q;
                        iM197270s2 = iM197270s2;
                        i2 = 4;
                        if (iM197238B == 111) {
                            i10 = 257;
                        }
                    }
                    v6w0Var.m197263l(iM197270s2 - v6w0Var.m197270s());
                    i6 = i2;
                    iM197268q = iM197268q;
                    i4 = 3;
                    i8 = 5;
                }
                int i12 = iM197268q;
                v6w0Var.m197262k(i9);
                ykr0 ykr0Var = new ykr0(i10, strTrim, arrayList, Arrays.copyOfRange(v6w0Var.m197264m(), iM197270s, i9));
                if (iM207150d == 6 || iM207150d == 5) {
                    iM207150d = ykr0Var.f198826a;
                }
                int i13 = i12 - (iM207150d3 + 5);
                if (!this.f181841e.f186808g.get(iM207150d2)) {
                    blr0 blr0VarMo169758a = this.f181841e.f186805d.mo169758a(iM207150d, ykr0Var);
                    this.f181839c.put(iM207150d2, iM207150d2);
                    this.f181838b.put(iM207150d2, blr0VarMo169758a);
                }
                iM197268q = i13;
                i6 = i;
                i4 = 3;
                i7 = 12;
                i5 = 13;
            }
            int size = this.f181839c.size();
            for (int i14 = 0; i14 < size; i14++) {
                SparseIntArray sparseIntArray = this.f181839c;
                wkr0 wkr0Var = this.f181841e;
                int iKeyAt = sparseIntArray.keyAt(i14);
                int iValueAt = sparseIntArray.valueAt(i14);
                wkr0Var.f186808g.put(iKeyAt, true);
                this.f181841e.f186809h.put(iValueAt, true);
                blr0 blr0Var = (blr0) this.f181838b.valueAt(i14);
                if (blr0Var != null) {
                    blr0Var.mo102558a(hew0Var, this.f181841e.f186812k, new alr0(iM197242F, iKeyAt, 8192));
                    this.f181841e.f186807f.put(iValueAt, blr0Var);
                }
            }
            this.f181841e.f186807f.remove(this.f181840d);
            this.f181841e.f186813l = 0;
            wkr0 wkr0Var2 = this.f181841e;
            if (wkr0Var2.f186813l == 0) {
                wkr0Var2.f186812k.mo129453c();
                this.f181841e.f186814m = true;
            }
        }
    }

    @Override // p149l.ckr0
    /* JADX INFO: renamed from: a */
    public final void mo107427a(hew0 hew0Var, m5r0 m5r0Var, alr0 alr0Var) {
    }
}
