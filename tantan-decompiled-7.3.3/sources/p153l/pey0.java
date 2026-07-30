package p153l;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pey0 extends jvx0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f152134o = 0;

    /* JADX INFO: renamed from: h */
    public final int f152135h;

    /* JADX INFO: renamed from: i */
    public final int f152136i;

    /* JADX INFO: renamed from: j */
    public final int[] f152137j;

    /* JADX INFO: renamed from: k */
    public final int[] f152138k;

    /* JADX INFO: renamed from: l */
    public final d0u0[] f152139l;

    /* JADX INFO: renamed from: m */
    public final Object[] f152140m;

    /* JADX INFO: renamed from: n */
    public final HashMap f152141n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pey0(d0u0[] d0u0VarArr, Object[] objArr, i2z0 i2z0Var) {
        super(false, i2z0Var);
        int i = 0;
        this.f152139l = d0u0VarArr;
        int length = d0u0VarArr.length;
        this.f152137j = new int[length];
        this.f152138k = new int[length];
        this.f152140m = objArr;
        this.f152141n = new HashMap();
        int iMo113459c = 0;
        int iMo113458b = 0;
        int i2 = 0;
        while (i < d0u0VarArr.length) {
            d0u0 d0u0Var = d0u0VarArr[i];
            this.f152139l[i2] = d0u0Var;
            this.f152138k[i2] = iMo113459c;
            this.f152137j[i2] = iMo113458b;
            iMo113459c += d0u0Var.mo113459c();
            iMo113458b += this.f152139l[i2].mo113458b();
            this.f152141n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f152135h = iMo113459c;
        this.f152136i = iMo113458b;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: b */
    public final int mo113458b() {
        return this.f152136i;
    }

    @Override // p153l.d0u0
    /* JADX INFO: renamed from: c */
    public final int mo113459c() {
        return this.f152135h;
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: p */
    public final int mo147107p(Object obj) {
        Integer num = (Integer) this.f152141n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: q */
    public final int mo147108q(int i) {
        return mpw0.m159419q(this.f152137j, i + 1, false, false);
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: r */
    public final int mo147109r(int i) {
        return mpw0.m159419q(this.f152138k, i + 1, false, false);
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: s */
    public final int mo147110s(int i) {
        return this.f152137j[i];
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: t */
    public final int mo147111t(int i) {
        return this.f152138k[i];
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: u */
    public final d0u0 mo147112u(int i) {
        return this.f152139l[i];
    }

    @Override // p153l.jvx0
    /* JADX INFO: renamed from: v */
    public final Object mo147113v(int i) {
        return this.f152140m[i];
    }

    /* JADX INFO: renamed from: y */
    public final List m172065y() {
        return Arrays.asList(this.f152139l);
    }

    /* JADX INFO: renamed from: z */
    public final pey0 m172066z(i2z0 i2z0Var) {
        d0u0[] d0u0VarArr = new d0u0[this.f152139l.length];
        int i = 0;
        while (true) {
            d0u0[] d0u0VarArr2 = this.f152139l;
            if (i >= d0u0VarArr2.length) {
                return new pey0(d0u0VarArr, this.f152140m, i2z0Var);
            }
            d0u0VarArr[i] = new mey0(this, d0u0VarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public pey0(Collection collection, i2z0 i2z0Var) {
        d0u0[] d0u0VarArr = new d0u0[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            d0u0VarArr[i2] = ((hby0) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((hby0) it2.next()).zzb();
            i++;
        }
        this(d0u0VarArr, objArr, i2z0Var);
    }
}
