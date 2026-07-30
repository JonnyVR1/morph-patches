package com.google.android.libraries.places.internal;

import com.p046p1.mobile.putong.core.data.Reason;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class zzbhy implements zzbfr {
    private volatile boolean zza;
    private zzbft zzb;
    private zzbfr zzc;
    private zzbdo zzd;
    private zzbhx zzf;
    private long zzg;
    private long zzh;
    private List zze = new ArrayList();
    private List zzi = new ArrayList();

    private final void zza(Runnable runnable) {
        zzmt.zzp(this.zzb != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.zza) {
                    runnable.run();
                } else {
                    this.zze.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.zza = r0     // Catch: java.lang.Throwable -> L1d
            com.google.android.libraries.places.internal.zzbhx r0 = r3.zzf     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.zzb()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.zze     // Catch: java.lang.Throwable -> L1d
            r3.zze = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbhy.zzb():void");
    }

    private final void zzi(zzbft zzbftVar) {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.zzi = null;
        this.zzc.zzo(zzbftVar);
    }

    private final void zzq(zzbfr zzbfrVar) {
        zzbfr zzbfrVar2 = this.zzc;
        zzmt.zzr(zzbfrVar2 == null, "realStream already set to %s", zzbfrVar2);
        this.zzc = zzbfrVar;
        this.zzh = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final zzaye zzam() {
        throw null;
    }

    public void zzc(zzbdo zzbdoVar) {
    }

    public final Runnable zze(zzbfr zzbfrVar) {
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzq(zzbfrVar);
                    zzbft zzbftVar = this.zzb;
                    if (zzbftVar == null) {
                        this.zze = null;
                        this.zza = true;
                    }
                    if (zzbftVar != null) {
                        zzi(zzbftVar);
                        return new zzbho(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public void zzg(zzbjj zzbjjVar) {
        synchronized (this) {
            try {
                if (this.zzb == null) {
                    return;
                }
                if (this.zzc != null) {
                    zzbjjVar.zzb("buffered_nanos", Long.valueOf(this.zzh - this.zzg));
                    this.zzc.zzg(zzbjjVar);
                } else {
                    zzbjjVar.zzb("buffered_nanos", Long.valueOf(System.nanoTime() - this.zzg));
                    zzbjjVar.zza("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public void zzh(zzbdo zzbdoVar) {
        boolean z = false;
        zzmt.zzp(this.zzb != null, "May only be called after start");
        zzmt.zzc(zzbdoVar, Reason.TYPE);
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    zzq(zzbmy.zza);
                    this.zzd = zzbdoVar;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zza(new zzbhr(this, zzbdoVar));
            return;
        }
        zzb();
        zzc(zzbdoVar);
        this.zzb.zzd(zzbdoVar, zzbfs.PROCESSED, new zzbcf());
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzj() {
        zzmt.zzp(this.zzb != null, "May only be called after start");
        zza(new zzbhs(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzk(zzazn zzaznVar) {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbhn(this, zzaznVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzl(zzazq zzazqVar) {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        zzmt.zzc(zzazqVar, "decompressorRegistry");
        this.zzi.add(new zzbhk(this, zzazqVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzm(int i) {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbhl(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzn(int i) {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbhm(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzo(zzbft zzbftVar) {
        zzbdo zzbdoVar;
        boolean z;
        zzmt.zzp(this.zzb == null, "already started");
        synchronized (this) {
            try {
                zzbdoVar = this.zzd;
                z = this.zza;
                if (!z) {
                    zzbhx zzbhxVar = new zzbhx(zzbftVar);
                    this.zzf = zzbhxVar;
                    zzbftVar = zzbhxVar;
                }
                this.zzb = zzbftVar;
                this.zzg = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbdoVar != null) {
            zzbftVar.zzd(zzbdoVar, zzbfs.PROCESSED, new zzbcf());
        } else if (z) {
            zzi(zzbftVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final boolean zzp() {
        if (this.zza) {
            return this.zzc.zzp();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzr() {
        zzmt.zzp(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzr();
        } else {
            zza(new zzbhq(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzt() {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbhi(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzu(int i) {
        zzmt.zzp(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzu(2);
        } else {
            zza(new zzbhh(this, 2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzv(zzazc zzazcVar) {
        zzmt.zzp(this.zzb == null, "May only be called before start");
        this.zzi.add(new zzbhj(this, zzazcVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzw(InputStream inputStream) {
        zzmt.zzp(this.zzb != null, "May only be called after start");
        if (this.zza) {
            this.zzc.zzw(inputStream);
        } else {
            zza(new zzbhp(this, inputStream));
        }
    }
}
