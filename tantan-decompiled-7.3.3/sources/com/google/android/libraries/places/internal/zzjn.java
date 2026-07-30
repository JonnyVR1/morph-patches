package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.libraries.places.api.net.PlacesClient;
import org.java_websocket.WebSocket;
import p153l.b3d0;
import p153l.zmp0;

/* JADX INFO: loaded from: classes7.dex */
final class zzjn implements zzjq {
    private final zzjs zza;
    private final Context zzb;
    private final zzkb zzc;
    private final zzjn zzd = this;
    private final zzaxy zze = zzaxz.zza(zzdx.zza());
    private final zzaxy zzf;
    private final zzaxy zzg;
    private final zzaxy zzh;
    private final zzaxy zzi;
    private final zzaxy zzj;
    private final zzaxy zzk;
    private final zzaxy zzl;
    private final zzaxy zzm;
    private final zzaxy zzn;

    public /* synthetic */ zzjn(Context context, zzjs zzjsVar, zzkb zzkbVar, zzjm zzjmVar) {
        this.zza = zzjsVar;
        this.zzb = context;
        this.zzc = zzkbVar;
        zzaxy zzaxyVarZza = zzaxw.zza(zzgg.zza());
        this.zzf = zzaxyVarZza;
        this.zzg = zzaxw.zza(new zzhn(zzaxyVarZza));
        this.zzh = zzaxw.zza(new zzhl(zzaxyVarZza));
        this.zzi = zzaxw.zza(zzgm.zza());
        this.zzj = zzaxw.zza(zzgj.zza());
        this.zzk = zzaxw.zza(new zzgd(zzaxyVarZza));
        zzaxy zzaxyVarZza2 = zzaxw.zza(zzhj.zza());
        this.zzl = zzaxyVarZza2;
        this.zzm = zzaxw.zza(new zzhf(zzaxyVarZza2));
        this.zzn = zzaxw.zza(new zzhp(zzaxyVarZza2));
    }

    private final zzes zzb() {
        return zzet.zza(new zzkf(this.zzb), this.zzc, this.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzjq
    public final PlacesClient zza() {
        zzki zzkiVar = new zzki(this.zzb);
        Context applicationContext = this.zzb.getApplicationContext();
        zzaxx.zza(applicationContext);
        b3d0 b3d0VarM220474a = zmp0.m220474a(applicationContext);
        zzaxx.zza(b3d0VarM220474a);
        zzfa zzfaVarZza = zzfb.zza(b3d0VarM220474a, new zzij());
        Context applicationContext2 = this.zzb.getApplicationContext();
        zzaxx.zza(applicationContext2);
        b3d0 b3d0VarM220474a2 = zmp0.m220474a(applicationContext2);
        zzaxx.zza(b3d0VarM220474a2);
        zzfg zzfgVarZza = zzfh.zza(b3d0VarM220474a2);
        zzaxy zzaxyVar = this.zze;
        zziu zziuVarZza = zziv.zza(this.zza, zzkiVar, zzfaVarZza, zzfgVarZza, zzb(), (zzdv) zzaxyVar.zzb(), zzhw.zza(), zzia.zza(zziy.zza()), zzie.zza(), zzii.zza(zziy.zza()));
        Context context = this.zzb;
        Context applicationContext3 = context.getApplicationContext();
        zzaxx.zza(applicationContext3);
        Context applicationContext4 = context.getApplicationContext();
        zzaxx.zza(applicationContext4);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(applicationContext4);
        zzaxx.zza(fusedLocationProviderClient);
        zzel zzelVarZza = zzem.zza(applicationContext3, fusedLocationProviderClient, new zzjj(new zzjf()));
        Context applicationContext5 = this.zzb.getApplicationContext();
        zzaxx.zza(applicationContext5);
        zzeq zzeqVarZza = zzer.zza(applicationContext5, (zzdv) this.zze.zzb());
        zzaxy zzaxyVar2 = this.zze;
        zzes zzesVarZzb = zzb();
        zzdv zzdvVar = (zzdv) zzaxyVar2.zzb();
        zzbrv zzbrvVarZze = zzbrv.zze("places.googleapis.com", WebSocket.DEFAULT_WSS_PORT);
        zzbrvVarZze.zzf();
        zzapv zzapvVarZza = zzapw.zza(zzbrvVarZze.zza());
        zzaxy zzaxyVar3 = this.zze;
        zzes zzesVarZzb2 = zzb();
        zzdv zzdvVar2 = (zzdv) zzaxyVar3.zzb();
        zzaxy zzaxyVar4 = this.zzn;
        zzaxy zzaxyVar5 = this.zzm;
        zzaxy zzaxyVar6 = this.zzk;
        zzaxy zzaxyVar7 = this.zzj;
        zzaxy zzaxyVar8 = this.zzi;
        zzaxy zzaxyVar9 = this.zzh;
        Object objZzb = this.zzg.zzb();
        Object objZzb2 = zzaxyVar9.zzb();
        Object objZzb3 = zzaxyVar8.zzb();
        Object objZzb4 = zzaxyVar7.zzb();
        Object objZzb5 = zzaxyVar6.zzb();
        Object objZzb6 = zzaxyVar5.zzb();
        Object objZzb7 = zzaxyVar4.zzb();
        Context applicationContext6 = this.zzb.getApplicationContext();
        zzaxx.zza(applicationContext6);
        return zzgb.zza(this.zza, zziuVarZza, zzelVarZza, zzeqVarZza, zzesVarZzb, zzdvVar, zzhd.zza(this.zza, zzapvVarZza, zzesVarZzb2, zzdvVar2, objZzb, objZzb2, objZzb3, objZzb4, objZzb5, objZzb6, objZzb7, new zzjw(applicationContext6)));
    }
}
