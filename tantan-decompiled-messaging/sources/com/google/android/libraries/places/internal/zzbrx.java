package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbrx extends zzbjg implements zzbsp {
    final /* synthetic */ zzbry zza;
    private final int zzb;
    private final Object zzc;
    private List zzd;
    private final zzbwb zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private final zzbrk zzk;
    private final zzbsu zzl;
    private final zzbsf zzm;
    private boolean zzn;
    private final zzbvs zzo;
    private zzbsq zzp;
    private int zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbrx(zzbry zzbryVar, int i, zzbqo zzbqoVar, Object obj, zzbrk zzbrkVar, zzbsu zzbsuVar, zzbsf zzbsfVar, int i2, String str, zzayj zzayjVar) {
        super(i, zzbqoVar, zzbryVar.zze(), zzayjVar);
        this.zza = zzbryVar;
        this.zze = new zzbwb();
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzn = true;
        this.zzq = -1;
        this.zzc = obj;
        this.zzk = zzbrkVar;
        this.zzl = zzbsuVar;
        this.zzm = zzbsfVar;
        this.zzi = i2;
        this.zzj = i2;
        this.zzb = i2;
        this.zzo = zzbvr.zzb(str);
    }

    public static /* bridge */ /* synthetic */ void zzL(zzbrx zzbrxVar, zzbwb zzbwbVar, boolean z, boolean z2) {
        if (zzbrxVar.zzh) {
            return;
        }
        if (!zzbrxVar.zzn) {
            zzmt.zzp(zzbrxVar.zzq != -1, "streamId should be set");
            zzbrxVar.zzl.zze(z, zzbrxVar.zzp, zzbwbVar, z2);
        } else {
            zzbrxVar.zze.zzn(zzbwbVar, (int) zzbwbVar.zzg());
            zzbrxVar.zzf |= z;
            zzbrxVar.zzg |= z2;
        }
    }

    public static /* bridge */ /* synthetic */ void zzM(zzbrx zzbrxVar, zzbcf zzbcfVar, String str) {
        zzbry zzbryVar = zzbrxVar.zza;
        String str2 = zzbryVar.zze;
        String str3 = zzbryVar.zzc;
        boolean zZzT = zzbrxVar.zzm.zzT();
        zzmt.zzc(zzbcfVar, "headers");
        zzmt.zzc(str2, "authority");
        zzbcfVar.zzd(zzbjd.zzh);
        zzbcfVar.zzd(zzbjd.zzi);
        zzbca zzbcaVar = zzbjd.zzj;
        zzbcfVar.zzd(zzbcaVar);
        ArrayList arrayList = new ArrayList(zzbar.zza(zzbcfVar) + 7);
        if (zZzT) {
            arrayList.add(zzbrm.zzb);
        } else {
            arrayList.add(zzbrm.zza);
        }
        arrayList.add(zzbrm.zzc);
        zzbwf zzbwfVar = zzbtt.zze;
        zzbwe zzbweVar = zzbwf.zza;
        arrayList.add(new zzbtt(zzbwfVar, zzbwe.zza(str2)));
        arrayList.add(new zzbtt(zzbtt.zzc, zzbwe.zza(str)));
        arrayList.add(new zzbtt(zzbcaVar.zzd(), str3));
        arrayList.add(zzbrm.zze);
        arrayList.add(zzbrm.zzf);
        byte[][] bArrZza = zzbqu.zza(zzbcfVar);
        for (int i = 0; i < bArrZza.length; i += 2) {
            zzbwf zzbwfVarZzb = zzbwe.zzb(bArrZza[i]);
            if (zzbwfVarZzb.zzn().length != 0 && zzbwfVarZzb.zzn()[0] != 58) {
                arrayList.add(new zzbtt(zzbwfVarZzb, zzbwe.zzb(bArrZza[i + 1])));
            }
        }
        zzbrxVar.zzd = arrayList;
        zzbrxVar.zzm.zzR(zzbrxVar.zza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(zzbdo zzbdoVar, boolean z, zzbcf zzbcfVar) throws EOFException {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        boolean z2 = this.zzn;
        zzbsf zzbsfVar = this.zzm;
        if (!z2) {
            zzbsfVar.zzP(this.zzq, zzbdoVar, zzbfs.PROCESSED, z, zzbtp.CANCEL, zzbcfVar);
            return;
        }
        zzbsfVar.zzQ(this.zza);
        this.zzd = null;
        zzbwb zzbwbVar = this.zze;
        zzbwbVar.zzF(zzbwbVar.zzg());
        this.zzn = false;
        if (zzbcfVar == null) {
            zzbcfVar = new zzbcf();
        }
        zzj(zzbdoVar, zzbfs.PROCESSED, true, zzbcfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjg
    public final void zzA(zzbdo zzbdoVar, boolean z, zzbcf zzbcfVar) throws EOFException {
        zzQ(zzbdoVar, false, zzbcfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbmm
    public final void zzE(int i) {
        int i2 = this.zzj - i;
        this.zzj = i2;
        int i3 = this.zzb;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.zzi += i4;
            this.zzj = i2 + i4;
            this.zzk.zzk(this.zzq, i4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbmm
    public final void zzF(Throwable th) throws EOFException {
        zzQ(zzbdo.zze(th), true, new zzbcf());
    }

    public final int zzG() {
        return this.zzq;
    }

    public final zzbsq zzH() {
        zzbsq zzbsqVar;
        synchronized (this.zzc) {
            zzbsqVar = this.zzp;
        }
        return zzbsqVar;
    }

    public final zzbvs zzI() {
        return this.zzo;
    }

    public final void zzN(int i) {
        zzmt.zzq(this.zzq == -1, "the stream has been started with id %s", i);
        this.zzq = i;
        this.zzp = this.zzl.zzc(this, i);
        zzbrx zzbrxVar = this.zza.zzf;
        super.zzt();
        zzbrxVar.zzm().zzb();
        if (this.zzn) {
            this.zzk.zzj(false, false, this.zzq, 0, this.zzd);
            this.zza.zzd.zzd();
            this.zzd = null;
            if (this.zze.zzg() > 0) {
                this.zzl.zze(this.zzf, this.zzp, this.zze, this.zzg);
            }
            this.zzn = false;
        }
    }

    public final void zzO(zzbwb zzbwbVar, boolean z, int i) {
        int iZzg = this.zzi - (((int) zzbwbVar.zzg()) + i);
        this.zzi = iZzg;
        this.zzj -= i;
        if (iZzg >= 0) {
            super.zzB(new zzbsl(zzbwbVar), z);
        } else {
            this.zzk.zzc(this.zzq, zzbtp.FLOW_CONTROL_ERROR);
            this.zzm.zzP(this.zzq, zzbdo.zzo.zzg("Received data size exceeded our receiving window size"), zzbfs.PROCESSED, false, null, null);
        }
    }

    public final void zzP(List list, boolean z) {
        if (z) {
            zzD(zzbsv.zzb(list));
        } else {
            zzC(zzbsv.zza(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbee, com.google.android.libraries.places.internal.zzbmm
    public final void zze(boolean z) {
        boolean zZzk = zzk();
        zzbsf zzbsfVar = this.zzm;
        if (zZzk) {
            zzbsfVar.zzP(this.zzq, null, zzbfs.PROCESSED, false, null, null);
        } else {
            zzbsfVar.zzP(this.zzq, null, zzbfs.PROCESSED, false, zzbtp.CANCEL, null);
        }
        super.zze(z);
    }

    @Override // com.google.android.libraries.places.internal.zzbel
    public final void zzz(Runnable runnable) {
        synchronized (this.zzc) {
            runnable.run();
        }
    }
}
