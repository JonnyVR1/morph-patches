package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o0z0 implements izy0, hzy0 {

    /* JADX INFO: renamed from: a */
    public final izy0[] f144606a;

    /* JADX INFO: renamed from: e */
    @Nullable
    public hzy0 f144610e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public q2z0 f144611f;

    /* JADX INFO: renamed from: i */
    public final vyy0 f144614i;

    /* JADX INFO: renamed from: c */
    public final ArrayList f144608c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f144609d = new HashMap();

    /* JADX INFO: renamed from: h */
    public h2z0 f144613h = new uyy0(new h2z0[0]);

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap f144607b = new IdentityHashMap();

    /* JADX INFO: renamed from: g */
    public izy0[] f144612g = new izy0[0];

    public o0z0(vyy0 vyy0Var, long[] jArr, izy0... izy0VarArr) {
        this.f144614i = vyy0Var;
        this.f144606a = izy0VarArr;
        for (int i = 0; i < izy0VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f144606a[i] = new n2z0(izy0VarArr[i], j);
            }
        }
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: a */
    public final boolean mo101542a(gay0 gay0Var) {
        if (this.f144608c.isEmpty()) {
            return this.f144613h.mo101542a(gay0Var);
        }
        int size = this.f144608c.size();
        for (int i = 0; i < size; i++) {
            ((izy0) this.f144608c.get(i)).mo101542a(gay0Var);
        }
        return false;
    }

    @Override // p153l.izy0, p153l.h2z0
    /* JADX INFO: renamed from: b */
    public final void mo101543b(long j) {
        this.f144613h.mo101543b(j);
    }

    @Override // p153l.g2z0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12634c(h2z0 h2z0Var) {
        hzy0 hzy0Var = this.f144610e;
        hzy0Var.getClass();
        hzy0Var.mo12634c(this);
    }

    @Override // p153l.hzy0
    /* JADX INFO: renamed from: d */
    public final void mo12636d(izy0 izy0Var) {
        this.f144608c.remove(izy0Var);
        if (!this.f144608c.isEmpty()) {
            return;
        }
        int i = 0;
        for (izy0 izy0Var2 : this.f144606a) {
            i += izy0Var2.zzh().f155401a;
        }
        t2u0[] t2u0VarArr = new t2u0[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            izy0[] izy0VarArr = this.f144606a;
            if (i2 >= izy0VarArr.length) {
                this.f144611f = new q2z0(t2u0VarArr);
                hzy0 hzy0Var = this.f144610e;
                hzy0Var.getClass();
                hzy0Var.mo12636d(this);
                return;
            }
            q2z0 q2z0VarZzh = izy0VarArr[i2].zzh();
            int i4 = q2z0VarZzh.f155401a;
            int i5 = 0;
            while (i5 < i4) {
                t2u0 t2u0VarM175102b = q2z0VarZzh.m175102b(i5);
                t2u0 t2u0VarM189004c = t2u0VarM175102b.m189004c(i2 + ":" + t2u0VarM175102b.f171821b);
                this.f144609d.put(t2u0VarM189004c, t2u0VarM175102b);
                t2u0VarArr[i3] = t2u0VarM189004c;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: e */
    public final long mo101546e(n5z0[] n5z0VarArr, boolean[] zArr, f2z0[] f2z0VarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = n5z0VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = n5z0VarArr.length;
            if (i2 >= length) {
                break;
            }
            f2z0 f2z0Var = f2z0VarArr[i2];
            Integer num = f2z0Var == null ? null : (Integer) this.f144607b.get(f2z0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            n5z0 n5z0Var = n5z0VarArr[i2];
            if (n5z0Var != null) {
                String str = n5z0Var.zze().f171821b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.f144607b.clear();
        f2z0[] f2z0VarArr2 = new f2z0[length];
        f2z0[] f2z0VarArr3 = new f2z0[length];
        n5z0[] n5z0VarArr2 = new n5z0[length];
        ArrayList arrayList = new ArrayList(this.f144606a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f144606a.length) {
            for (int i4 = i; i4 < n5z0VarArr.length; i4++) {
                f2z0VarArr3[i4] = iArr[i4] == i3 ? f2z0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    n5z0 n5z0Var2 = n5z0VarArr[i4];
                    n5z0Var2.getClass();
                    t2u0 t2u0Var = (t2u0) this.f144609d.get(n5z0Var2.zze());
                    t2u0Var.getClass();
                    n5z0VarArr2[i4] = new n0z0(n5z0Var2, t2u0Var);
                } else {
                    n5z0VarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jMo101546e = this.f144606a[i3].mo101546e(n5z0VarArr2, zArr, f2z0VarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = jMo101546e;
            } else if (jMo101546e != j2) {
                wtq0.m207906a("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i5 = 0; i5 < n5z0VarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    f2z0 f2z0Var2 = f2z0VarArr3[i5];
                    f2z0Var2.getClass();
                    f2z0VarArr2[i5] = f2z0Var2;
                    this.f144607b.put(f2z0Var2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    lev0.m153958f(f2z0VarArr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f144606a[i3]);
            }
            i3++;
            arrayList = arrayList2;
            i = 0;
        }
        int i6 = i;
        System.arraycopy(f2z0VarArr2, i6, f2z0VarArr, i6, length);
        izy0[] izy0VarArr = (izy0[]) arrayList.toArray(new izy0[i6]);
        this.f144612g = izy0VarArr;
        this.f144613h = new uyy0(izy0VarArr);
        return j2;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: f */
    public final long mo101547f(long j, gfy0 gfy0Var) {
        izy0[] izy0VarArr = this.f144612g;
        return (izy0VarArr.length > 0 ? izy0VarArr[0] : this.f144606a[0]).mo101547f(j, gfy0Var);
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: g */
    public final void mo101548g(long j, boolean z) {
        for (izy0 izy0Var : this.f144612g) {
            izy0Var.mo101548g(j, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final izy0 m165568h(int i) {
        izy0 izy0Var = this.f144606a[i];
        return izy0Var instanceof n2z0 ? ((n2z0) izy0Var).m161259h() : izy0Var;
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: k */
    public final void mo101552k(hzy0 hzy0Var, long j) {
        this.f144610e = hzy0Var;
        Collections.addAll(this.f144608c, this.f144606a);
        int i = 0;
        while (true) {
            izy0[] izy0VarArr = this.f144606a;
            if (i >= izy0VarArr.length) {
                return;
            }
            izy0VarArr[i].mo101552k(this, j);
            i++;
        }
    }

    @Override // p153l.izy0
    /* JADX INFO: renamed from: l */
    public final long mo101553l(long j) {
        long jMo101553l = this.f144612g[0].mo101553l(j);
        int i = 1;
        while (true) {
            izy0[] izy0VarArr = this.f144612g;
            if (i >= izy0VarArr.length) {
                return jMo101553l;
            }
            if (izy0VarArr[i].mo101553l(jMo101553l) != jMo101553l) {
                wtq0.m207906a("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzb() {
        return this.f144613h.zzb();
    }

    @Override // p153l.izy0, p153l.h2z0
    public final long zzc() {
        return this.f144613h.zzc();
    }

    @Override // p153l.izy0
    public final long zzd() {
        long j = -9223372036854775807L;
        for (izy0 izy0Var : this.f144612g) {
            long jZzd = izy0Var.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && izy0Var.mo101553l(j) != j) {
                    wtq0.m207906a("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j == -9223372036854775807L) {
                for (izy0 izy0Var2 : this.f144612g) {
                    if (izy0Var2 == izy0Var) {
                        break;
                    }
                    if (izy0Var2.mo101553l(jZzd) != jZzd) {
                        wtq0.m207906a("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                wtq0.m207906a("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j;
    }

    @Override // p153l.izy0
    public final q2z0 zzh() {
        q2z0 q2z0Var = this.f144611f;
        q2z0Var.getClass();
        return q2z0Var;
    }

    @Override // p153l.izy0
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            izy0[] izy0VarArr = this.f144606a;
            if (i >= izy0VarArr.length) {
                return;
            }
            izy0VarArr[i].zzk();
            i++;
        }
    }

    @Override // p153l.izy0, p153l.h2z0
    public final boolean zzp() {
        return this.f144613h.zzp();
    }
}
