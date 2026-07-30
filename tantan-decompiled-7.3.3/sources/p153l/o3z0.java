package p153l;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class o3z0 implements n5z0 {

    /* JADX INFO: renamed from: a */
    public final t2u0 f144870a;

    /* JADX INFO: renamed from: b */
    public final int f144871b;

    /* JADX INFO: renamed from: c */
    public final int[] f144872c;

    /* JADX INFO: renamed from: d */
    public final sqr0[] f144873d;

    /* JADX INFO: renamed from: e */
    public int f144874e;

    public o3z0(t2u0 t2u0Var, int[] iArr, int i) {
        sqr0[] sqr0VarArr;
        int length = iArr.length;
        lev0.m153958f(length > 0);
        t2u0Var.getClass();
        this.f144870a = t2u0Var;
        this.f144871b = length;
        this.f144873d = new sqr0[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            sqr0VarArr = this.f144873d;
            if (i2 >= length2) {
                break;
            }
            sqr0VarArr[i2] = t2u0Var.m189003b(iArr[i2]);
            i2++;
        }
        Arrays.sort(sqr0VarArr, new Comparator() { // from class: l.n3z0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((sqr0) obj2).f170247h - ((sqr0) obj).f170247h;
            }
        });
        this.f144872c = new int[this.f144871b];
        for (int i3 = 0; i3 < this.f144871b; i3++) {
            this.f144872c[i3] = t2u0Var.m189002a(this.f144873d[i3]);
        }
    }

    @Override // p153l.r5z0
    /* JADX INFO: renamed from: e */
    public final int mo161038e(int i) {
        for (int i2 = 0; i2 < this.f144871b; i2++) {
            if (this.f144872c[i2] == i) {
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
            o3z0 o3z0Var = (o3z0) obj;
            if (this.f144870a.equals(o3z0Var.f144870a) && Arrays.equals(this.f144872c, o3z0Var.f144872c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f144874e;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f144870a) * 31) + Arrays.hashCode(this.f144872c);
        this.f144874e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // p153l.r5z0
    public final int zza(int i) {
        return this.f144872c[0];
    }

    @Override // p153l.r5z0
    public final int zzc() {
        return this.f144872c.length;
    }

    @Override // p153l.r5z0
    public final sqr0 zzd(int i) {
        return this.f144873d[i];
    }

    @Override // p153l.r5z0
    public final t2u0 zze() {
        return this.f144870a;
    }
}
