package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbnd {
    private List zza;
    private int zzb;
    private int zzc;

    public zzbnd(List list) {
        this.zza = list == null ? Collections.EMPTY_LIST : list;
    }

    public final int zza() {
        List list = this.zza;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final zzaye zzb() {
        if (zzg()) {
            return ((zzazs) this.zza.get(this.zzb)).zza();
        }
        wtq0.m207906a("Index is off the end of the address group list");
        return null;
    }

    public final SocketAddress zzc() {
        if (zzg()) {
            return (SocketAddress) ((zzazs) this.zza.get(this.zzb)).zzb().get(this.zzc);
        }
        wtq0.m207906a("Index is past the end of the address group list");
        return null;
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zze(zznx zznxVar) {
        List list = zznxVar;
        if (zznxVar == null) {
            list = Collections.EMPTY_LIST;
        }
        this.zza = list;
        zzd();
    }

    public final boolean zzf() {
        if (!zzg()) {
            return false;
        }
        zzazs zzazsVar = (zzazs) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i < zzazsVar.zzb().size()) {
            return true;
        }
        int i2 = this.zzb + 1;
        this.zzb = i2;
        this.zzc = 0;
        return i2 < this.zza.size();
    }

    public final boolean zzg() {
        return this.zzb < this.zza.size();
    }

    public final boolean zzh(SocketAddress socketAddress) {
        for (int i = 0; i < this.zza.size(); i++) {
            int iIndexOf = ((zzazs) this.zza.get(i)).zzb().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.zzb = i;
                this.zzc = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
