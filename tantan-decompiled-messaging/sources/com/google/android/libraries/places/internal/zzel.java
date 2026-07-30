package com.google.android.libraries.places.internal;

import android.content.Context;
import android.location.Location;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import p149l.e16;
import p149l.hf4;
import p149l.n16;
import p149l.sei0;

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
    public final Task zza(hf4 hf4Var) {
        CurrentLocationRequest.Builder builder = new CurrentLocationRequest.Builder();
        long j = zza;
        CurrentLocationRequest.Builder durationMillis = builder.setDurationMillis(j);
        if (e16.m114373a(this.zzd, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            durationMillis.setPriority(100);
        } else {
            durationMillis.setPriority(102);
        }
        final zzjj zzjjVar = this.zzc;
        Task<Location> currentLocation = this.zzb.getCurrentLocation(durationMillis.build(), hf4Var);
        final sei0 sei0Var = hf4Var == null ? new sei0() : new sei0(hf4Var);
        zzjjVar.zza(sei0Var, j, "Location timeout.");
        currentLocation.mo15371j(new n16() { // from class: com.google.android.libraries.places.internal.zzjh
            @Override // p149l.n16
            public final Object then(Task task) {
                sei0 sei0Var2 = sei0Var;
                Exception excMo15372k = task.mo15372k();
                if (task.mo15377p()) {
                    sei0Var2.m183659c(task.mo15373l());
                } else if (!task.mo15375n() && excMo15372k != null) {
                    sei0Var2.m183658b(excMo15372k);
                }
                return sei0Var2.m183657a();
            }
        });
        sei0Var.m183657a().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.libraries.places.internal.zzji
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzjjVar.zzb(sei0Var);
            }
        });
        return sei0Var.m183657a().mo15371j(new zzek(this));
    }
}
