package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import p153l.mor;
import p153l.skx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2301w5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f10137a;

    /* JADX INFO: renamed from: b */
    public zzgyg f10138b;

    public /* synthetic */ C2301w5(zzgyl zzgylVar, skx0 skx0Var) {
        if (!(zzgylVar instanceof zzhbx)) {
            this.f10137a = null;
            this.f10138b = (zzgyg) zzgylVar;
            return;
        }
        zzhbx zzhbxVar = (zzhbx) zzgylVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbxVar.zzf());
        this.f10137a = arrayDeque;
        arrayDeque.push(zzhbxVar);
        this.f10138b = m13489b(zzhbxVar.zzd);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzgyg next() {
        zzgyg zzgygVarM13489b;
        zzgyg zzgygVar = this.f10138b;
        zzgyg zzgygVar2 = null;
        if (zzgygVar == null) {
            mor.m159308a();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.f10137a;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                zzgygVarM13489b = m13489b(((zzhbx) this.f10137a.pop()).zze);
            }
            this.f10138b = zzgygVar2;
            return zzgygVar;
        } while (zzgygVarM13489b.zzd() == 0);
        zzgygVar2 = zzgygVarM13489b;
        this.f10138b = zzgygVar2;
        return zzgygVar;
    }

    /* JADX INFO: renamed from: b */
    public final zzgyg m13489b(zzgyl zzgylVar) {
        while (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            this.f10137a.push(zzhbxVar);
            zzgylVar = zzhbxVar.zzd;
        }
        return (zzgyg) zzgylVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10138b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
