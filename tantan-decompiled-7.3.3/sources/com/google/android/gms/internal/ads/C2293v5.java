package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;
import p153l.rkx0;
import p153l.tkx0;
import p153l.wg3;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2293v5 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f10116a = new ArrayDeque();

    public /* synthetic */ C2293v5(rkx0 rkx0Var) {
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ zzgyl m13435a(C2293v5 c2293v5, zzgyl zzgylVar, zzgyl zzgylVar2) {
        c2293v5.m13437b(zzgylVar);
        c2293v5.m13437b(zzgylVar2);
        zzgyl zzhbxVar = (zzgyl) c2293v5.f10116a.pop();
        while (!c2293v5.f10116a.isEmpty()) {
            zzhbxVar = new zzhbx((zzgyl) c2293v5.f10116a.pop(), zzhbxVar);
        }
        return zzhbxVar;
    }

    /* JADX INFO: renamed from: c */
    public static final int m13436c(int i) {
        int iBinarySearch = Arrays.binarySearch(zzhbx.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* JADX INFO: renamed from: b */
    public final void m13437b(zzgyl zzgylVar) {
        tkx0 tkx0Var;
        if (!zzgylVar.zzh()) {
            if (!(zzgylVar instanceof zzhbx)) {
                wg3.m206174a("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgylVar.getClass())));
                return;
            }
            zzhbx zzhbxVar = (zzhbx) zzgylVar;
            m13437b(zzhbxVar.zzd);
            m13437b(zzhbxVar.zze);
            return;
        }
        int iM13436c = m13436c(zzgylVar.zzd());
        ArrayDeque arrayDeque = this.f10116a;
        int iZzc = zzhbx.zzc(iM13436c + 1);
        if (arrayDeque.isEmpty() || ((zzgyl) this.f10116a.peek()).zzd() >= iZzc) {
            this.f10116a.push(zzgylVar);
            return;
        }
        int iZzc2 = zzhbx.zzc(iM13436c);
        zzgyl zzhbxVar2 = (zzgyl) this.f10116a.pop();
        while (true) {
            tkx0Var = null;
            if (this.f10116a.isEmpty() || ((zzgyl) this.f10116a.peek()).zzd() >= iZzc2) {
                break;
            } else {
                zzhbxVar2 = new zzhbx((zzgyl) this.f10116a.pop(), zzhbxVar2);
            }
        }
        zzhbx zzhbxVar3 = new zzhbx(zzhbxVar2, zzgylVar);
        while (!this.f10116a.isEmpty()) {
            int iM13436c2 = m13436c(zzhbxVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.f10116a;
            if (((zzgyl) arrayDeque2.peek()).zzd() >= zzhbx.zzc(iM13436c2)) {
                break;
            } else {
                zzhbxVar3 = new zzhbx((zzgyl) this.f10116a.pop(), zzhbxVar3);
            }
        }
        this.f10116a.push(zzhbxVar3);
    }
}
