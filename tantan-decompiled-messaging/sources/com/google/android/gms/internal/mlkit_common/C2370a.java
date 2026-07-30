package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import p149l.car0;
import p149l.dsy0;
import p149l.i1r0;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_common.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2370a {

    /* JADX INFO: renamed from: a */
    public Object[] f10301a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f10302b = 0;

    /* JADX INFO: renamed from: c */
    public car0 f10303c;

    /* JADX INFO: renamed from: a */
    public final C2370a m14714a(Object obj, Object obj2) {
        int i = this.f10302b + 1;
        Object[] objArr = this.f10301a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10301a = Arrays.copyOf(objArr, i1r0.m134005a(length, i2));
        }
        dsy0.m113500a(obj, obj2);
        Object[] objArr2 = this.f10301a;
        int i3 = this.f10302b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f10302b = i3 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zzai m14715b() {
        car0 car0Var = this.f10303c;
        if (car0Var != null) {
            throw car0Var.m105934a();
        }
        zzaq zzaqVarZzg = zzaq.zzg(this.f10302b, this.f10301a, this);
        car0 car0Var2 = this.f10303c;
        if (car0Var2 == null) {
            return zzaqVarZzg;
        }
        throw car0Var2.m105934a();
    }
}
