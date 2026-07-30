package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class iry0 implements cqy0, bqy0 {

    /* JADX INFO: renamed from: a */
    public final cqy0[] f114704a;

    /* JADX INFO: renamed from: e */
    @Nullable
    public bqy0 f114708e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public kty0 f114709f;

    /* JADX INFO: renamed from: i */
    public final ppy0 f114712i;

    /* JADX INFO: renamed from: c */
    public final ArrayList f114706c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f114707d = new HashMap();

    /* JADX INFO: renamed from: h */
    public bty0 f114711h = new opy0(new bty0[0]);

    /* JADX INFO: renamed from: b */
    public final IdentityHashMap f114705b = new IdentityHashMap();

    /* JADX INFO: renamed from: g */
    public cqy0[] f114710g = new cqy0[0];

    public iry0(ppy0 ppy0Var, long[] jArr, cqy0... cqy0VarArr) {
        this.f114712i = ppy0Var;
        this.f114704a = cqy0VarArr;
        for (int i = 0; i < cqy0VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f114704a[i] = new hty0(cqy0VarArr[i], j);
            }
        }
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: a */
    public final boolean mo103896a(a1y0 a1y0Var) {
        if (this.f114706c.isEmpty()) {
            return this.f114711h.mo103896a(a1y0Var);
        }
        int size = this.f114706c.size();
        for (int i = 0; i < size; i++) {
            ((cqy0) this.f114706c.get(i)).mo103896a(a1y0Var);
        }
        return false;
    }

    @Override // p149l.cqy0, p149l.bty0
    /* JADX INFO: renamed from: b */
    public final void mo103897b(long j) {
        this.f114711h.mo103897b(j);
    }

    @Override // p149l.aty0
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12580c(bty0 bty0Var) {
        bqy0 bqy0Var = this.f114708e;
        bqy0Var.getClass();
        bqy0Var.mo12580c(this);
    }

    @Override // p149l.bqy0
    /* JADX INFO: renamed from: d */
    public final void mo12582d(cqy0 cqy0Var) {
        this.f114706c.remove(cqy0Var);
        if (!this.f114706c.isEmpty()) {
            return;
        }
        int i = 0;
        for (cqy0 cqy0Var2 : this.f114704a) {
            i += cqy0Var2.zzh().f124629a;
        }
        ntt0[] ntt0VarArr = new ntt0[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            cqy0[] cqy0VarArr = this.f114704a;
            if (i2 >= cqy0VarArr.length) {
                this.f114709f = new kty0(ntt0VarArr);
                bqy0 bqy0Var = this.f114708e;
                bqy0Var.getClass();
                bqy0Var.mo12582d(this);
                return;
            }
            kty0 kty0VarZzh = cqy0VarArr[i2].zzh();
            int i4 = kty0VarZzh.f124629a;
            int i5 = 0;
            while (i5 < i4) {
                ntt0 ntt0VarM147224b = kty0VarZzh.m147224b(i5);
                ntt0 ntt0VarM161415c = ntt0VarM147224b.m161415c(i2 + ":" + ntt0VarM147224b.f140536b);
                this.f114707d.put(ntt0VarM161415c, ntt0VarM147224b);
                ntt0VarArr[i3] = ntt0VarM161415c;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: e */
    public final long mo108304e(hwy0[] hwy0VarArr, boolean[] zArr, zsy0[] zsy0VarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = hwy0VarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = hwy0VarArr.length;
            if (i2 >= length) {
                break;
            }
            zsy0 zsy0Var = zsy0VarArr[i2];
            Integer num = zsy0Var == null ? null : (Integer) this.f114705b.get(zsy0Var);
            iArr[i2] = num == null ? -1 : num.intValue();
            hwy0 hwy0Var = hwy0VarArr[i2];
            if (hwy0Var != null) {
                String str = hwy0Var.zze().f140536b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.f114705b.clear();
        zsy0[] zsy0VarArr2 = new zsy0[length];
        zsy0[] zsy0VarArr3 = new zsy0[length];
        hwy0[] hwy0VarArr2 = new hwy0[length];
        ArrayList arrayList = new ArrayList(this.f114704a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f114704a.length) {
            for (int i4 = i; i4 < hwy0VarArr.length; i4++) {
                zsy0VarArr3[i4] = iArr[i4] == i3 ? zsy0VarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    hwy0 hwy0Var2 = hwy0VarArr[i4];
                    hwy0Var2.getClass();
                    ntt0 ntt0Var = (ntt0) this.f114707d.get(hwy0Var2.zze());
                    ntt0Var.getClass();
                    hwy0VarArr2[i4] = new hry0(hwy0Var2, ntt0Var);
                } else {
                    hwy0VarArr2[i4] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jMo108304e = this.f114704a[i3].mo108304e(hwy0VarArr2, zArr, zsy0VarArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = jMo108304e;
            } else if (jMo108304e != j2) {
                qkq0.m175383a("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i5 = 0; i5 < hwy0VarArr.length; i5++) {
                if (iArr2[i5] == i3) {
                    zsy0 zsy0Var2 = zsy0VarArr3[i5];
                    zsy0Var2.getClass();
                    zsy0VarArr2[i5] = zsy0Var2;
                    this.f114705b.put(zsy0Var2, Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    f5v0.m119535f(zsy0VarArr3[i5] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f114704a[i3]);
            }
            i3++;
            arrayList = arrayList2;
            i = 0;
        }
        int i6 = i;
        System.arraycopy(zsy0VarArr2, i6, zsy0VarArr, i6, length);
        cqy0[] cqy0VarArr = (cqy0[]) arrayList.toArray(new cqy0[i6]);
        this.f114710g = cqy0VarArr;
        this.f114711h = new opy0(cqy0VarArr);
        return j2;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: f */
    public final long mo108305f(long j, a6y0 a6y0Var) {
        cqy0[] cqy0VarArr = this.f114710g;
        return (cqy0VarArr.length > 0 ? cqy0VarArr[0] : this.f114704a[0]).mo108305f(j, a6y0Var);
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: g */
    public final void mo108306g(long j, boolean z) {
        for (cqy0 cqy0Var : this.f114710g) {
            cqy0Var.mo108306g(j, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final cqy0 m137934h(int i) {
        cqy0 cqy0Var = this.f114704a[i];
        return cqy0Var instanceof hty0 ? ((hty0) cqy0Var).m132943h() : cqy0Var;
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: k */
    public final void mo108307k(bqy0 bqy0Var, long j) {
        this.f114708e = bqy0Var;
        Collections.addAll(this.f114706c, this.f114704a);
        int i = 0;
        while (true) {
            cqy0[] cqy0VarArr = this.f114704a;
            if (i >= cqy0VarArr.length) {
                return;
            }
            cqy0VarArr[i].mo108307k(this, j);
            i++;
        }
    }

    @Override // p149l.cqy0
    /* JADX INFO: renamed from: l */
    public final long mo108308l(long j) {
        long jMo108308l = this.f114710g[0].mo108308l(j);
        int i = 1;
        while (true) {
            cqy0[] cqy0VarArr = this.f114710g;
            if (i >= cqy0VarArr.length) {
                return jMo108308l;
            }
            if (cqy0VarArr[i].mo108308l(jMo108308l) != jMo108308l) {
                qkq0.m175383a("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzb() {
        return this.f114711h.zzb();
    }

    @Override // p149l.cqy0, p149l.bty0
    public final long zzc() {
        return this.f114711h.zzc();
    }

    @Override // p149l.cqy0
    public final long zzd() {
        long j = -9223372036854775807L;
        for (cqy0 cqy0Var : this.f114710g) {
            long jZzd = cqy0Var.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && cqy0Var.mo108308l(j) != j) {
                    qkq0.m175383a("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j == -9223372036854775807L) {
                for (cqy0 cqy0Var2 : this.f114710g) {
                    if (cqy0Var2 == cqy0Var) {
                        break;
                    }
                    if (cqy0Var2.mo108308l(jZzd) != jZzd) {
                        qkq0.m175383a("Unexpected child seekToUs result.");
                        return 0L;
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                qkq0.m175383a("Conflicting discontinuities.");
                return 0L;
            }
        }
        return j;
    }

    @Override // p149l.cqy0
    public final kty0 zzh() {
        kty0 kty0Var = this.f114709f;
        kty0Var.getClass();
        return kty0Var;
    }

    @Override // p149l.cqy0
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            cqy0[] cqy0VarArr = this.f114704a;
            if (i >= cqy0VarArr.length) {
                return;
            }
            cqy0VarArr[i].zzk();
            i++;
        }
    }

    @Override // p149l.cqy0, p149l.bty0
    public final boolean zzp() {
        return this.f114711h.zzp();
    }
}
