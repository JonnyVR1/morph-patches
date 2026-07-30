package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p153l.nfs0;
import p153l.p1u0;
import p153l.ses0;
import p153l.tjt0;
import p153l.vxu0;
import p153l.wg3;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2400c {

    /* JADX INFO: renamed from: a */
    public final List f10351a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C2400c m14807a(zzdh zzdhVar) {
        if (zzdhVar.zzd()) {
            wg3.m206174a(nfs0.m162939a("range must not be empty, but was %s", zzdhVar));
            return null;
        }
        this.f10351a.add(zzdhVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2400c m14808b(C2400c c2400c) {
        Iterator it = c2400c.f10351a.iterator();
        while (it.hasNext()) {
            m14807a((zzdh) it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final zzct m14809c() {
        tjt0 tjt0Var = new tjt0(this.f10351a.size());
        Collections.sort(this.f10351a, zzdg.zza);
        Iterator it = this.f10351a.iterator();
        p1u0 p1u0Var = it instanceof p1u0 ? (p1u0) it : new p1u0(it);
        while (p1u0Var.hasNext()) {
            zzdh zzdhVarZzc = (zzdh) p1u0Var.next();
            while (p1u0Var.hasNext()) {
                zzdh zzdhVar = (zzdh) p1u0Var.zza();
                if (zzdhVarZzc.zza.compareTo(zzdhVar.zzb) > 0 || zzdhVar.zza.compareTo(zzdhVarZzc.zzb) > 0) {
                    break;
                }
                ses0.m185569d(zzdhVarZzc.zzb(zzdhVar).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdhVarZzc, zzdhVar);
                zzdhVarZzc = zzdhVarZzc.zzc((zzdh) p1u0Var.next());
            }
            tjt0Var.m191454e(zzdhVarZzc);
        }
        zzco zzcoVarM191455f = tjt0Var.m191455f();
        if (zzcoVarM191455f.isEmpty()) {
            return zzct.zzb();
        }
        if (zzcoVarM191455f.size() == 1) {
            vxu0 vxu0VarListIterator = zzcoVarM191455f.listIterator(0);
            Object next = vxu0VarListIterator.next();
            if (vxu0VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                for (int i = 0; i < 4 && vxu0VarListIterator.hasNext(); i++) {
                    sb.append(", ");
                    sb.append(vxu0VarListIterator.next());
                }
                if (vxu0VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            if (((zzdh) next).equals(zzdh.zza())) {
                return zzct.zza();
            }
        }
        return new zzct(zzcoVarM191455f);
    }
}
