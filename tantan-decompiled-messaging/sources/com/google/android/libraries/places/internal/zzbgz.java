package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class zzbgz extends zzayo {
    private static final Logger zza = Logger.getLogger(zzbgz.class.getName());
    private static final zzayo zzb = new zzbgs();
    private final ScheduledFuture zzc;
    private final Executor zzd;
    private final zzazj zze;
    private volatile boolean zzf;
    private zzayn zzg;
    private zzayo zzh;
    private zzbdo zzi;
    private List zzj = new ArrayList();
    private zzbgy zzk;

    public zzbgz(Executor executor, ScheduledExecutorService scheduledExecutorService, zzazn zzaznVar) {
        ScheduledFuture<?> scheduledFutureSchedule;
        zzmt.zzc(executor, "callExecutor");
        this.zzd = executor;
        zzmt.zzc(scheduledExecutorService, "scheduler");
        this.zze = zzazj.zzb();
        if (zzaznVar == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jZzb = zzaznVar.zzb(timeUnit);
            long jAbs = Math.abs(jZzb) / 1000000000;
            long jAbs2 = Math.abs(jZzb) % 1000000000;
            StringBuilder sb = new StringBuilder();
            if (jZzb < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(jAbs);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorService.schedule(new zzbgl(this, sb), jZzb, timeUnit);
        }
        this.zzc = scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl(zzbdo zzbdoVar, boolean z) {
        zzayn zzaynVar;
        boolean z2;
        synchronized (this) {
            try {
                if (this.zzh == null) {
                    zzo(zzb);
                    zzaynVar = this.zzg;
                    this.zzi = zzbdoVar;
                    z2 = false;
                } else {
                    if (z) {
                        return;
                    }
                    zzaynVar = null;
                    z2 = true;
                }
                if (z2) {
                    zzm(new zzbgo(this, zzbdoVar));
                } else {
                    if (zzaynVar != null) {
                        this.zzd.execute(new zzbgt(this, zzaynVar, zzbdoVar));
                    }
                    zzn();
                }
                zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzm(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.zzf) {
                    runnable.run();
                } else {
                    this.zzj.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzn() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zzj     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.zzj = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.zzf = r0     // Catch: java.lang.Throwable -> L24
            com.google.android.libraries.places.internal.zzbgy r0 = r3.zzk     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.zzd
            com.google.android.libraries.places.internal.zzbgm r2 = new com.google.android.libraries.places.internal.zzbgm
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.zzj     // Catch: java.lang.Throwable -> L24
            r3.zzj = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbgz.zzn():void");
    }

    private final void zzo(zzayo zzayoVar) {
        zzayo zzayoVar2 = this.zzh;
        zzmt.zzr(zzayoVar2 == null, "realCall already set to %s", zzayoVar2);
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzh = zzayoVar;
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd("realCall", this.zzh);
        return zzmmVarZzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zza(String str, Throwable th) {
        zzbdo zzbdoVar = zzbdo.zzb;
        zzbdo zzbdoVarZzg = str != null ? zzbdoVar.zzg(str) : zzbdoVar.zzg("Call cancelled without message");
        if (th != null) {
            zzbdoVarZzg = zzbdoVarZzg.zzf(th);
        }
        zzl(zzbdoVarZzg, false);
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzb() {
        zzm(new zzbgr(this));
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzc(int i) {
        if (this.zzf) {
            this.zzh.zzc(2);
        } else {
            zzm(new zzbgq(this, 2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzd(Object obj) {
        if (this.zzf) {
            this.zzh.zzd(obj);
        } else {
            zzm(new zzbgp(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zze(zzayn zzaynVar, zzbcf zzbcfVar) {
        zzbdo zzbdoVar;
        boolean z;
        zzmt.zzp(this.zzg == null, "already started");
        synchronized (this) {
            try {
                this.zzg = zzaynVar;
                zzbdoVar = this.zzi;
                z = this.zzf;
                if (!z) {
                    zzbgy zzbgyVar = new zzbgy(zzaynVar);
                    this.zzk = zzbgyVar;
                    zzaynVar = zzbgyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbdoVar != null) {
            this.zzd.execute(new zzbgt(this, zzaynVar, zzbdoVar));
        } else if (z) {
            this.zzh.zze(zzaynVar, zzbcfVar);
        } else {
            zzm(new zzbgn(this, zzaynVar, zzbcfVar));
        }
    }

    public final Runnable zzh(zzayo zzayoVar) {
        synchronized (this) {
            try {
                if (this.zzh != null) {
                    return null;
                }
                zzo(zzayoVar);
                return new zzbgk(this, this.zze);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zzk() {
    }
}
