package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p153l.lqw0;
import p153l.srw0;
import p153l.tpw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2298w2 {

    /* JADX INFO: renamed from: a */
    public Object[] f10133a;

    /* JADX INFO: renamed from: b */
    public int f10134b;

    /* JADX INFO: renamed from: c */
    public srw0 f10135c;

    public C2298w2(int i) {
        this.f10133a = new Object[i + i];
        this.f10134b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final C2298w2 m13473a(Object obj, Object obj2) {
        m13476d(this.f10134b + 1);
        tpw0.m192214b(obj, obj2);
        Object[] objArr = this.f10133a;
        int i = this.f10134b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f10134b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C2298w2 m13474b(Iterable iterable) {
        if (iterable instanceof Collection) {
            m13476d(this.f10134b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m13473a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final zzgad m13475c() {
        srw0 srw0Var = this.f10135c;
        if (srw0Var != null) {
            throw srw0Var.m187639a();
        }
        zzgbp zzgbpVarZzj = zzgbp.zzj(this.f10134b, this.f10133a, this);
        srw0 srw0Var2 = this.f10135c;
        if (srw0Var2 == null) {
            return zzgbpVarZzj;
        }
        throw srw0Var2.m187639a();
    }

    /* JADX INFO: renamed from: d */
    public final void m13476d(int i) {
        Object[] objArr = this.f10133a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10133a = Arrays.copyOf(objArr, lqw0.m155511b(length, i2));
        }
    }

    public C2298w2() {
        this(4);
    }
}
