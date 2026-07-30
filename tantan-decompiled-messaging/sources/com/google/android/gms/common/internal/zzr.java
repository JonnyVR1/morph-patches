package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
final class zzr implements Handler.Callback {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.zza.zzb) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    zzp zzpVar = (zzp) this.zza.zzb.get(zzoVar);
                    if (zzpVar != null && zzpVar.zzi()) {
                        if (zzpVar.zzj()) {
                            zzpVar.zzg("GmsClientSupervisor");
                        }
                        this.zza.zzb.remove(zzoVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.zza.zzb) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                zzp zzpVar2 = (zzp) this.zza.zzb.get(zzoVar2);
                if (zzpVar2 != null && zzpVar2.zza() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zzoVar2)), new Exception());
                    ComponentName componentNameZzb = zzpVar2.zzb();
                    if (componentNameZzb == null) {
                        componentNameZzb = zzoVar2.zza();
                    }
                    if (componentNameZzb == null) {
                        String strZzc = zzoVar2.zzc();
                        Preconditions.checkNotNull(strZzc);
                        componentNameZzb = new ComponentName(strZzc, "unknown");
                    }
                    zzpVar2.onServiceDisconnected(componentNameZzb);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
