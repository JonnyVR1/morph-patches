package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import p153l.b1t0;
import p153l.fht0;
import p153l.zpt0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2397b {

    /* JADX INFO: renamed from: a */
    public Object[] f10344a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f10345b = 0;

    /* JADX INFO: renamed from: c */
    public zpt0 f10346c;

    /* JADX INFO: renamed from: a */
    public final C2397b m14802a(Object obj, Object obj2) {
        int i = this.f10345b + 1;
        Object[] objArr = this.f10344a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10344a = Arrays.copyOf(objArr, fht0.m125603a(length, i2));
        }
        b1t0.m101504b(obj, obj2);
        Object[] objArr2 = this.f10344a;
        int i3 = this.f10345b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f10345b = i3 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zzcr m14803b() {
        zpt0 zpt0Var = this.f10346c;
        if (zpt0Var != null) {
            throw zpt0Var.m220930a();
        }
        zzdp zzdpVarZzg = zzdp.zzg(this.f10345b, this.f10344a, this);
        zpt0 zpt0Var2 = this.f10346c;
        if (zpt0Var2 == null) {
            return zzdpVarZzg;
        }
        throw zpt0Var2.m220930a();
    }
}
