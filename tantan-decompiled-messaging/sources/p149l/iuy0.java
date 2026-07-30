package p149l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class iuy0 implements hwy0 {

    /* JADX INFO: renamed from: a */
    public final ntt0 f115064a;

    /* JADX INFO: renamed from: b */
    public final int f115065b;

    /* JADX INFO: renamed from: c */
    public final int[] f115066c;

    /* JADX INFO: renamed from: d */
    public final mhr0[] f115067d;

    /* JADX INFO: renamed from: e */
    public int f115068e;

    public iuy0(ntt0 ntt0Var, int[] iArr, int i) {
        mhr0[] mhr0VarArr;
        int length = iArr.length;
        f5v0.m119535f(length > 0);
        ntt0Var.getClass();
        this.f115064a = ntt0Var;
        this.f115065b = length;
        this.f115067d = new mhr0[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            mhr0VarArr = this.f115067d;
            if (i2 >= length2) {
                break;
            }
            mhr0VarArr[i2] = ntt0Var.m161414b(iArr[i2]);
            i2++;
        }
        Arrays.sort(mhr0VarArr, new Comparator() { // from class: l.huy0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((mhr0) obj2).f133888h - ((mhr0) obj).f133888h;
            }
        });
        this.f115066c = new int[this.f115065b];
        for (int i3 = 0; i3 < this.f115065b; i3++) {
            this.f115066c[i3] = ntt0Var.m161413a(this.f115067d[i3]);
        }
    }

    @Override // p149l.lwy0
    /* JADX INFO: renamed from: e */
    public final int mo132765e(int i) {
        for (int i2 = 0; i2 < this.f115065b; i2++) {
            if (this.f115066c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            iuy0 iuy0Var = (iuy0) obj;
            if (this.f115064a.equals(iuy0Var.f115064a) && Arrays.equals(this.f115066c, iuy0Var.f115066c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f115068e;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f115064a) * 31) + Arrays.hashCode(this.f115066c);
        this.f115068e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // p149l.lwy0
    public final int zza(int i) {
        return this.f115066c[0];
    }

    @Override // p149l.lwy0
    public final int zzc() {
        return this.f115066c.length;
    }

    @Override // p149l.lwy0
    public final mhr0 zzd(int i) {
        return this.f115067d[i];
    }

    @Override // p149l.lwy0
    public final ntt0 zze() {
        return this.f115064a;
    }
}
