package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2458g;
import java.util.Objects;
import p149l.mgy0;
import p149l.q8s0;
import p149l.ujx0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzp extends BroadcastReceiver {
    private final ujx0 zza;

    public zzp(ujx0 ujx0Var) {
        this.zza = ujx0Var;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.zza.zzj().m211417F().m123936a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzj().m211417F().m123936a("App receiver called with null action");
            return;
        }
        final ujx0 ujx0Var = this.zza;
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            ujx0Var.zzj().m211417F().m123936a("App receiver called with unknown action");
        } else if (mgy0.m154586a() && ujx0Var.m194128u().m192629B(null, q8s0.f153235J0)) {
            ujx0Var.zzj().m211416E().m123936a("App receiver notified triggers are available");
            ujx0Var.zzl().m146305w(new Runnable() { // from class: l.ojy0
                @Override // java.lang.Runnable
                public final void run() {
                    ujx0 ujx0Var2 = ujx0Var;
                    if (!ujx0Var2.m194106G().m101479R0()) {
                        ujx0Var2.zzj().m211417F().m123936a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C2458g c2458gM194102C = ujx0Var2.m194102C();
                    Objects.requireNonNull(c2458gM194102C);
                    new Thread(new Runnable() { // from class: l.fly0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c2458gM194102C.m15228y0();
                        }
                    }).start();
                }
            });
        }
    }
}
