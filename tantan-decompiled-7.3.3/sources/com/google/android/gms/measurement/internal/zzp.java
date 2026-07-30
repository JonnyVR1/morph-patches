package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.measurement.internal.C2481g;
import java.util.Objects;
import p153l.atx0;
import p153l.spy0;
import p153l.whs0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzp extends BroadcastReceiver {
    private final atx0 zza;

    public zzp(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.zza.zzj().m114563F().m153300a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.zza.zzj().m114563F().m153300a("App receiver called with null action");
            return;
        }
        final atx0 atx0Var = this.zza;
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            atx0Var.zzj().m114563F().m153300a("App receiver called with unknown action");
        } else if (spy0.m187491a() && atx0Var.m100308u().m98421B(null, whs0.f189211J0)) {
            atx0Var.zzj().m114562E().m153300a("App receiver notified triggers are available");
            atx0Var.zzl().m177841w(new Runnable() { // from class: l.usy0
                @Override // java.lang.Runnable
                public final void run() {
                    atx0 atx0Var2 = atx0Var;
                    if (!atx0Var2.m100286G().m136346R0()) {
                        atx0Var2.zzj().m114563F().m153300a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C2481g c2481gM100282C = atx0Var2.m100282C();
                    Objects.requireNonNull(c2481gM100282C);
                    new Thread(new Runnable() { // from class: l.luy0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c2481gM100282C.m15282y0();
                        }
                    }).start();
                }
            });
        }
    }
}
