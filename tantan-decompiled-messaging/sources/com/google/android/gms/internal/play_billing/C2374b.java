package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import p149l.tgt0;
import p149l.vrs0;
import p149l.z7t0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2374b {

    /* JADX INFO: renamed from: a */
    public Object[] f10307a = new Object[8];

    /* JADX INFO: renamed from: b */
    public int f10308b = 0;

    /* JADX INFO: renamed from: c */
    public tgt0 f10309c;

    /* JADX INFO: renamed from: a */
    public final C2374b m14748a(Object obj, Object obj2) {
        int i = this.f10308b + 1;
        Object[] objArr = this.f10307a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f10307a = Arrays.copyOf(objArr, z7t0.m217505a(length, i2));
        }
        vrs0.m199752b(obj, obj2);
        Object[] objArr2 = this.f10307a;
        int i3 = this.f10308b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f10308b = i3 + 1;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final zzcr m14749b() {
        tgt0 tgt0Var = this.f10309c;
        if (tgt0Var != null) {
            throw tgt0Var.m188825a();
        }
        zzdp zzdpVarZzg = zzdp.zzg(this.f10308b, this.f10307a, this);
        tgt0 tgt0Var2 = this.f10309c;
        if (tgt0Var2 == null) {
            return zzdpVarZzg;
        }
        throw tgt0Var2.m188825a();
    }
}
