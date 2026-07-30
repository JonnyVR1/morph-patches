package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p149l.dhw0;
import p149l.ehw0;
import p149l.fhw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2283x2 extends ehw0 {

    /* JADX INFO: renamed from: d */
    public Object[] f10102d;

    /* JADX INFO: renamed from: e */
    public int f10103e;

    public C2283x2(int i) {
        super(i);
        this.f10102d = new Object[zzgaf.zzh(i)];
    }

    @Override // p149l.fhw0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ fhw0 mo13444a(Object obj) {
        m13445g(obj);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C2283x2 m13445g(Object obj) {
        obj.getClass();
        if (this.f10102d != null) {
            int iZzh = zzgaf.zzh(this.f91520b);
            Object[] objArr = this.f10102d;
            if (iZzh <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM111842a = dhw0.m111842a(iHashCode);
                while (true) {
                    int i = iM111842a & length;
                    Object[] objArr2 = this.f10102d;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.f10103e += iHashCode;
                        super.m116605c(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    iM111842a = i + 1;
                }
            }
        }
        this.f10102d = null;
        super.m116605c(obj);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C2283x2 m13446h(Iterable iterable) {
        iterable.getClass();
        if (this.f10102d == null) {
            super.m116606d(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m13445g(it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final zzgaf m13447i() {
        zzgaf zzgafVarZzv;
        int i = this.f91520b;
        if (i == 0) {
            return zzgbq.zza;
        }
        if (i == 1) {
            Object obj = this.f91519a[0];
            Objects.requireNonNull(obj);
            return new zzgcb(obj);
        }
        if (this.f10102d == null || zzgaf.zzh(i) != this.f10102d.length) {
            zzgafVarZzv = zzgaf.zzv(this.f91520b, this.f91519a);
            this.f91520b = zzgafVarZzv.size();
        } else {
            int i2 = this.f91520b;
            Object[] objArrCopyOf = this.f91519a;
            if (zzgaf.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.f10103e;
            Object[] objArr = this.f10102d;
            zzgafVarZzv = new zzgbq(objArrCopyOf, i3, objArr, objArr.length - 1, this.f91520b);
        }
        this.f91521c = true;
        this.f10102d = null;
        return zzgafVarZzv;
    }

    public C2283x2() {
        super(4);
    }
}
