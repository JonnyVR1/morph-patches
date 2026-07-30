package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
final class zzp implements ServiceConnection, zzt {
    final /* synthetic */ zzs zza;
    private final Map zzb = new HashMap();
    private int zzc = 2;
    private boolean zzd;

    @Nullable
    private IBinder zze;
    private final zzo zzf;
    private ComponentName zzg;

    public zzp(zzs zzsVar, zzo zzoVar) {
        this.zza = zzsVar;
        this.zzf = zzoVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.zza.zzb) {
            try {
                this.zza.zzd.removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.zza.zzb) {
            try {
                this.zza.zzd.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        return this.zzc;
    }

    public final ComponentName zzb() {
        return this.zzg;
    }

    @Nullable
    public final IBinder zzc() {
        return this.zze;
    }

    public final void zzd(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zze(String str, @Nullable Executor executor) {
        this.zzc = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            zzs zzsVar = this.zza;
            boolean zZza = zzsVar.zzf.zza(zzsVar.zzc, str, this.zzf.zzb(zzsVar.zzc), this, 4225, executor);
            this.zzd = zZza;
            if (zZza) {
                this.zza.zzd.sendMessageDelayed(this.zza.zzd.obtainMessage(1, this.zzf), this.zza.zzh);
            } else {
                this.zzc = 2;
                try {
                    zzs zzsVar2 = this.zza;
                    zzsVar2.zzf.unbindService(zzsVar2.zzc, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void zzf(ServiceConnection serviceConnection, String str) {
        this.zzb.remove(serviceConnection);
    }

    public final void zzg(String str) {
        this.zza.zzd.removeMessages(1, this.zzf);
        zzs zzsVar = this.zza;
        zzsVar.zzf.unbindService(zzsVar.zzc, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final boolean zzh(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzi() {
        return this.zzb.isEmpty();
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
