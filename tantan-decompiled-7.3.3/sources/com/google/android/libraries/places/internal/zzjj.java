package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import p153l.sni0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzjj {
    private final zzjf zza;
    private final Map zzb = new HashMap();

    public zzjj(zzjf zzjfVar) {
        this.zza = zzjfVar;
    }

    public final boolean zza(final sni0 sni0Var, long j, String str) {
        if (this.zzb.containsKey(sni0Var)) {
            return false;
        }
        HandlerThread handlerThread = new HandlerThread("timeoutHandlerThread");
        handlerThread.start();
        this.zzb.put(sni0Var, handlerThread);
        final String str2 = "Location timeout.";
        return new Handler(handlerThread.getLooper()).postDelayed(new Runnable(str2) { // from class: com.google.android.libraries.places.internal.zzjg
            public final /* synthetic */ String zzb = "Location timeout.";

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.m186942d(new ApiException(new Status(15, this.zzb)));
            }
        }, j);
    }

    public final boolean zzb(sni0 sni0Var) {
        HandlerThread handlerThread = (HandlerThread) this.zzb.remove(sni0Var);
        if (handlerThread == null) {
            return false;
        }
        return handlerThread.quit();
    }
}
