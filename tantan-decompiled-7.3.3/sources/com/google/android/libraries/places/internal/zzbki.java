package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.gig0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbki implements Runnable {
    private static final Logger zza = Logger.getLogger(zzbki.class.getName());
    private final Runnable zzb;

    public zzbki(Runnable runnable) {
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.run();
        } catch (Throwable th) {
            zza.logp(Level.SEVERE, "io.grpc.internal.LogExceptionRunnable", "run", "Exception while executing runnable ".concat(this.zzb.toString()), th);
            zznd.zza(th);
            gig0.m130323a(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.zzb.toString() + ")";
    }
}
