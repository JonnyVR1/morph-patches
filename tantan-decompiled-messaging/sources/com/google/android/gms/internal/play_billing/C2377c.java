package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.h6s0;
import p149l.ig3;
import p149l.jst0;
import p149l.m5s0;
import p149l.nat0;
import p149l.pou0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2377c {

    /* JADX INFO: renamed from: a */
    public final List f10314a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C2377c m14753a(zzdh zzdhVar) {
        if (zzdhVar.zzd()) {
            ig3.m135964a(h6s0.m129526a("range must not be empty, but was %s", zzdhVar));
            return null;
        }
        this.f10314a.add(zzdhVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final C2377c m14754b(C2377c c2377c) {
        Iterator it = c2377c.f10314a.iterator();
        while (it.hasNext()) {
            m14753a((zzdh) it.next());
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final zzct m14755c() {
        nat0 nat0Var = new nat0(this.f10314a.size());
        Collections.sort(this.f10314a, zzdg.zza);
        Iterator it = this.f10314a.iterator();
        jst0 jst0Var = it instanceof jst0 ? (jst0) it : new jst0(it);
        while (jst0Var.hasNext()) {
            zzdh zzdhVarZzc = (zzdh) jst0Var.next();
            while (jst0Var.hasNext()) {
                zzdh zzdhVar = (zzdh) jst0Var.zza();
                if (zzdhVarZzc.zza.compareTo(zzdhVar.zzb) > 0 || zzdhVar.zza.compareTo(zzdhVarZzc.zzb) > 0) {
                    break;
                }
                m5s0.m153145d(zzdhVarZzc.zzb(zzdhVar).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdhVarZzc, zzdhVar);
                zzdhVarZzc = zzdhVarZzc.zzc((zzdh) jst0Var.next());
            }
            nat0Var.m158714e(zzdhVarZzc);
        }
        zzco zzcoVarM158715f = nat0Var.m158715f();
        if (zzcoVarM158715f.isEmpty()) {
            return zzct.zzb();
        }
        if (zzcoVarM158715f.size() == 1) {
            pou0 pou0VarListIterator = zzcoVarM158715f.listIterator(0);
            Object next = pou0VarListIterator.next();
            if (pou0VarListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                for (int i = 0; i < 4 && pou0VarListIterator.hasNext(); i++) {
                    sb.append(", ");
                    sb.append(pou0VarListIterator.next());
                }
                if (pou0VarListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            if (((zzdh) next).equals(zzdh.zza())) {
                return zzct.zza();
            }
        }
        return new zzct(zzcoVarM158715f);
    }
}
