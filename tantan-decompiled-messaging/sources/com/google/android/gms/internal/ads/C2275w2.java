package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p149l.fhw0;
import p149l.miw0;
import p149l.ngw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2275w2 {

    /* JADX INFO: renamed from: a */
    public Object[] f10096a;

    /* JADX INFO: renamed from: b */
    public int f10097b;

    /* JADX INFO: renamed from: c */
    public miw0 f10098c;

    public C2275w2(int i) {
        this.f10096a = new Object[i + i];
        this.f10097b = 0;
    }

    /* JADX INFO: renamed from: a */
    public final C2275w2 m13419a(Object obj, Object obj2) {
        m13422d(this.f10097b + 1);
        ngw0.m159362b(obj, obj2);
        Object[] objArr = this.f10096a;
        int i = this.f10097b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f10097b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C2275w2 m13420b(Iterable iterable) {
        if (iterable instanceof Collection) {
            m13422d(this.f10097b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m13419a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final zzgad m13421c() {
        miw0 miw0Var = this.f10098c;
        if (miw0Var != null) {
            throw miw0Var.m154763a();
        }
        zzgbp zzgbpVarZzj = zzgbp.zzj(this.f10097b, this.f10096a, this);
        miw0 miw0Var2 = this.f10098c;
        if (miw0Var2 == null) {
            return zzgbpVarZzj;
        }
        throw miw0Var2.m154763a();
    }

    /* JADX INFO: renamed from: d */
    public final void m13422d(int i) {
        Object[] objArr = this.f10096a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10096a = Arrays.copyOf(objArr, fhw0.m121469b(length, i2));
        }
    }

    public C2275w2() {
        this(4);
    }
}
