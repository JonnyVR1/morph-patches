package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import p149l.lmr;
import p149l.mbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2278w5 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f10100a;

    /* JADX INFO: renamed from: b */
    public zzgyg f10101b;

    public /* synthetic */ C2278w5(zzgyl zzgylVar, mbx0 mbx0Var) {
        if (!(zzgylVar instanceof zzhbx)) {
            this.f10100a = null;
            this.f10101b = (zzgyg) zzgylVar;
            return;
        }
        zzhbx zzhbxVar = (zzhbx) zzgylVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhbxVar.zzf());
        this.f10100a = arrayDeque;
        arrayDeque.push(zzhbxVar);
        this.f10101b = m13435b(zzhbxVar.zzd);
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzgyg next() {
        zzgyg zzgygVarM13435b;
        zzgyg zzgygVar = this.f10101b;
        zzgyg zzgygVar2 = null;
        if (zzgygVar == null) {
            lmr.m150601a();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.f10100a;
            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                zzgygVarM13435b = m13435b(((zzhbx) this.f10100a.pop()).zze);
            }
            this.f10101b = zzgygVar2;
            return zzgygVar;
        } while (zzgygVarM13435b.zzd() == 0);
        zzgygVar2 = zzgygVarM13435b;
        this.f10101b = zzgygVar2;
        return zzgygVar;
    }

    /* JADX INFO: renamed from: b */
    public final zzgyg m13435b(zzgyl zzgylVar) {
        while (zzgylVar instanceof zzhbx) {
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            this.f10100a.push(zzhbxVar);
            zzgylVar = zzhbxVar.zzd;
        }
        return (zzgyg) zzgylVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10101b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
