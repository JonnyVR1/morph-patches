package com.google.android.libraries.places.internal;

import android.content.Context;
import android.location.Location;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import p153l.gg4;
import p153l.j26;
import p153l.s26;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzel {
    private static final long zza = HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
    private final FusedLocationProviderClient zzb;
    private final zzjj zzc;
    private final Context zzd;

    public zzel(Context context, FusedLocationProviderClient fusedLocationProviderClient, zzjj zzjjVar) {
        this.zzd = context;
        this.zzb = fusedLocationProviderClient;
        this.zzc = zzjjVar;
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Task zza(gg4 gg4Var) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        long j = zza;
        CurrentLocationRequest.Builder durationMillis = builder.setDurationMillis(j);
        if (j26.m143188a(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            durationMillis.setPriority(100);
        } else {
            durationMillis.setPriority(102);
        }
        final zzjj zzjjVar = this.zzc;
        Task<Location> currentLocation = this.zzb.getCurrentLocation(durationMillis.build(), gg4Var);
        final sni0 sni0Var = gg4Var == null ? new sni0() : new sni0(gg4Var);
        zzjjVar.zza(sni0Var, j, "Location timeout.");
        currentLocation.mo15425j(new s26() { // from class: com.google.android.libraries.places.internal.zzjh
            @Override // p153l.s26
            public final Object then(Task task) {
                sni0 sni0Var2 = sni0Var;
                Exception excMo15426k = task.mo15426k();
                if (task.mo15431p()) {
                    sni0Var2.m186941c(task.mo15427l());
                } else if (!task.mo15429n() && excMo15426k != null) {
                    sni0Var2.m186940b(excMo15426k);
                }
                return sni0Var2.m186939a();
            }
        });
        sni0Var.m186939a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzji
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzjjVar.zzb(sni0Var);
            }
        });
        return sni0Var.m186939a().mo15425j(new zzek(this));
    }
}
