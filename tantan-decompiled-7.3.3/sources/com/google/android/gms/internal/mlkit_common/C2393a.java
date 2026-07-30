package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import p153l.ijr0;
import p153l.j1z0;
import p153l.oar0;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_common.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2393a {

    /* JADX INFO: renamed from: a */
    public Object[] f10338a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f10339b = 0;

    /* JADX INFO: renamed from: c */
    public ijr0 f10340c;

    /* JADX INFO: renamed from: a */
    public final C2393a m14768a(Object obj, Object obj2) {
        int i = this.f10339b + 1;
        Object[] objArr = this.f10338a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10338a = Arrays.copyOf(objArr, oar0.m166849a(length, i2));
        }
        j1z0.m143160a(obj, obj2);
        Object[] objArr2 = this.f10338a;
        int i3 = this.f10339b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f10339b = i3 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zzai m14769b() {
        ijr0 ijr0Var = this.f10340c;
        if (ijr0Var != null) {
            throw ijr0Var.m140239a();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.f10339b, this.f10338a, this);
        ijr0 ijr0Var2 = this.f10340c;
        if (ijr0Var2 == null) {
            return zzaqVarZzg;
        }
        throw ijr0Var2.m140239a();
    }
}
