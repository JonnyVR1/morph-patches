package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
import p149l.ig3;
import p149l.lbx0;
import p149l.nbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2270v5 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f10079a = new ArrayDeque();

    public /* synthetic */ C2270v5(lbx0 lbx0Var) {
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ zzgyl m13381a(C2270v5 c2270v5, zzgyl zzgylVar, zzgyl zzgylVar2) {
        c2270v5.m13383b(zzgylVar);
        c2270v5.m13383b(zzgylVar2);
        zzgyl zzhbxVar = (zzgyl) c2270v5.f10079a.pop();
        while (!c2270v5.f10079a.isEmpty()) {
            zzhbxVar = new zzhbx((zzgyl) c2270v5.f10079a.pop(), zzhbxVar);
        }
        return zzhbxVar;
    }

    /* JADX INFO: renamed from: c */
    public static final int m13382c(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhbx.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX INFO: renamed from: b */
    public final void m13383b(zzgyl zzgylVar) {
        nbx0 nbx0Var;
        if (!zzgylVar.zzh()) {
            if (!(zzgylVar instanceof zzhbx)) {
                ig3.m135964a("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgylVar.getClass())));
                return;
            }
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            m13383b(zzhbxVar.zzd);
            m13383b(zzhbxVar.zze);
            return;
        }
        int iM13382c = m13382c(zzgylVar.zzd());
        ArrayDeque arrayDeque = this.f10079a;
        int iZzc = zzhbx.zzc(iM13382c + 1);
        if (arrayDeque.isEmpty() || ((zzgyl) this.f10079a.peek()).zzd() >= iZzc) {
            this.f10079a.push(zzgylVar);
            return;
        }
        int iZzc2 = zzhbx.zzc(iM13382c);
        zzgyl zzhbxVar2 = (zzgyl) this.f10079a.pop();
        while (true) {
            nbx0Var = null;
            if (this.f10079a.isEmpty() || ((zzgyl) this.f10079a.peek()).zzd() >= iZzc2) {
                break;
            } else {
                zzhbxVar2 = new zzhbx((zzgyl) this.f10079a.pop(), zzhbxVar2);
            }
        }
        zzhbx zzhbxVar3 = new zzhbx(zzhbxVar2, zzgylVar);
        while (!this.f10079a.isEmpty()) {
            int iM13382c2 = m13382c(zzhbxVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.f10079a;
            if (((zzgyl) arrayDeque2.peek()).zzd() >= zzhbx.zzc(iM13382c2)) {
                break;
            } else {
                zzhbxVar3 = new zzhbx((zzgyl) this.f10079a.pop(), zzhbxVar3);
            }
        }
        this.f10079a.push(zzhbxVar3);
    }
}
