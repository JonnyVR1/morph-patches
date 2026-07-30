package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p153l.jqw0;
import p153l.kqw0;
import p153l.lqw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2306x2 extends kqw0 {

    /* JADX INFO: renamed from: d */
    public Object[] f10139d;

    /* JADX INFO: renamed from: e */
    public int f10140e;

    public C2306x2(int i) {
        super(i);
        this.f10139d = new Object[zzgaf.zzh(i)];
    }

    @Override // p153l.lqw0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ lqw0 mo13498a(Object obj) {
        m13499g(obj);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C2306x2 m13499g(Object obj) {
        obj.getClass();
        if (this.f10139d != null) {
            int iZzh = zzgaf.zzh(this.f128398b);
            Object[] objArr = this.f10139d;
            if (iZzh <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM146640a = jqw0.m146640a(iHashCode);
                while (true) {
                    int i = iM146640a & length;
                    Object[] objArr2 = this.f10139d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f10140e += iHashCode;
                        super.m150965c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM146640a = i + 1;
                }
            }
        }
        this.f10139d = null;
        super.m150965c(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C2306x2 m13500h(Iterable iterable) {
        iterable.getClass();
        if (this.f10139d == null) {
            super.m150966d(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m13499g(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final zzgaf m13501i() {
        zzgaf zzgafVarZzv;
        int i = this.f128398b;
        if (i == 0) {
            return zzgbq.zza;
        }
        if (i == 1) {
            Object obj = this.f128397a[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        if (this.f10139d == null || zzgaf.zzh(i) != this.f10139d.length) {
            zzgafVarZzv = zzgaf.zzv(this.f128398b, this.f128397a);
            this.f128398b = zzgafVarZzv.size();
        } else {
            int i2 = this.f128398b;
            Object[] objArrCopyOf = this.f128397a;
            if (zzgaf.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.f10140e;
            Object[] objArr = this.f10139d;
            zzgafVarZzv = new zzgbq(objArrCopyOf, i3, objArr, objArr.length - 1, this.f128398b);
        }
        this.f128399c = true;
        this.f10139d = null;
        return zzgafVarZzv;
    }

    public C2306x2() {
        super(4);
    }
}
