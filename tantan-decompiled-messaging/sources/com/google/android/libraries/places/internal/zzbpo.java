package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
abstract class zzbpo implements zzbfr {
    private static final zzbdo zza;
    private static final Random zzb;
    static final zzbca zzh;
    static final zzbca zzi;
    private zzboy zzA;
    private long zzB;
    private zzbdo zzC;
    private boolean zzD;
    private final zzbcl zzc;
    private final Executor zzd;
    private final ScheduledExecutorService zzf;
    private final zzbcf zzg;
    private final zzbpp zzj;
    private final zzbje zzk;
    private final boolean zzl;
    private final zzbox zzn;
    private final long zzo;
    private final long zzp;
    private final zzbpn zzq;
    private zzbpb zzw;
    private long zzx;
    private zzbft zzy;
    private zzboy zzz;
    private final Executor zze = new zzbdw(new zzbof(this));
    private final Object zzm = new Object();
    private final zzbjj zzr = new zzbjj();
    private volatile zzbpd zzs = new zzbpd(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    private final AtomicBoolean zzt = new AtomicBoolean();
    private final AtomicInteger zzu = new AtomicInteger();
    private final AtomicInteger zzv = new AtomicInteger();

    static {
        zzbbx zzbbxVar = zzbcf.zzb;
        zzh = zzbca.zzc("grpc-previous-rpc-attempts", zzbbxVar);
        zzi = zzbca.zzc("grpc-retry-pushback-ms", zzbbxVar);
        zza = zzbdo.zzb.zzg("Stream thrown away because RetriableStream committed");
        zzb = new Random();
    }

    public zzbpo(zzbcl zzbclVar, zzbcf zzbcfVar, zzbox zzboxVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, zzbpp zzbppVar, zzbje zzbjeVar, zzbpn zzbpnVar) {
        this.zzc = zzbclVar;
        this.zzn = zzboxVar;
        this.zzo = j;
        this.zzp = j2;
        this.zzd = executor;
        this.zzf = scheduledExecutorService;
        this.zzg = zzbcfVar;
        this.zzj = zzbppVar;
        if (zzbppVar != null) {
            this.zzB = zzbppVar.zzb;
        }
        this.zzk = zzbjeVar;
        zzmt.zzf(zzbppVar == null || zzbjeVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.zzl = zzbjeVar != null;
        this.zzq = zzbpnVar;
    }

    public static /* bridge */ /* synthetic */ void zzW(zzbpo zzbpoVar, zzbpm zzbpmVar) {
        Runnable runnableZzag = zzbpoVar.zzag(zzbpmVar);
        if (runnableZzag != null) {
            zzbpoVar.zzd.execute(runnableZzag);
        }
    }

    public static /* bridge */ /* synthetic */ void zzZ(zzbpo zzbpoVar, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            zzbpoVar.zzaj();
            return;
        }
        synchronized (zzbpoVar.zzm) {
            try {
                zzboy zzboyVar = zzbpoVar.zzA;
                if (zzboyVar == null) {
                    return;
                }
                Future futureZza = zzboyVar.zza();
                zzboy zzboyVar2 = new zzboy(zzbpoVar.zzm);
                zzbpoVar.zzA = zzboyVar2;
                if (futureZza != null) {
                    futureZza.cancel(false);
                }
                zzboyVar2.zzb(zzbpoVar.zzf.schedule(new zzbpa(zzbpoVar, zzboyVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbpm zzaf(int i, boolean z) {
        int i2;
        do {
            i2 = this.zzv.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.zzv.compareAndSet(i2, i2 + 1));
        zzbpm zzbpmVar = new zzbpm(i);
        zzbos zzbosVar = new zzbos(this, new zzbow(this, zzbpmVar));
        zzbcf zzbcfVar = this.zzg;
        zzbcf zzbcfVar2 = new zzbcf();
        zzbcfVar2.zze(zzbcfVar);
        if (i > 0) {
            zzbcfVar2.zzf(zzh, String.valueOf(i));
        }
        zzbpmVar.zza = zzb(zzbcfVar2, zzbosVar, i, z);
        return zzbpmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable zzag(zzbpm zzbpmVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.zzm) {
            try {
                if (this.zzs.zzf != null) {
                    return null;
                }
                Collection collection = this.zzs.zzc;
                zzbpd zzbpdVar = this.zzs;
                zzmt.zzp(zzbpdVar.zzf == null, "Already committed");
                List list2 = zzbpdVar.zzb;
                if (zzbpdVar.zzc.contains(zzbpmVar)) {
                    list = null;
                    collectionSingleton = Collections.singleton(zzbpmVar);
                    z = true;
                } else {
                    list = list2;
                    collectionSingleton = Collections.EMPTY_LIST;
                    z = false;
                }
                this.zzs = new zzbpd(list, collectionSingleton, zzbpdVar.zzd, zzbpmVar, zzbpdVar.zzg, z, zzbpdVar.zzh, zzbpdVar.zze);
                this.zzn.zza(-this.zzx);
                zzboy zzboyVar = this.zzz;
                boolean z2 = zzboyVar != null ? zzboyVar.zzc : false;
                if (zzboyVar != null) {
                    Future futureZza = zzboyVar.zza();
                    this.zzz = null;
                    future = futureZza;
                } else {
                    future = null;
                }
                zzboy zzboyVar2 = this.zzA;
                if (zzboyVar2 != null) {
                    Future futureZza2 = zzboyVar2.zza();
                    this.zzA = null;
                    future2 = futureZza2;
                } else {
                    future2 = null;
                }
                return new zzboh(this, collection, zzbpmVar, future, z2, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzah(zzbov zzbovVar) {
        Collection collection;
        synchronized (this.zzm) {
            try {
                if (!this.zzs.zza) {
                    this.zzs.zzb.add(zzbovVar);
                }
                collection = this.zzs.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zzbovVar.zza((zzbpm) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r5 >= r2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r6 = (com.google.android.libraries.places.internal.zzbov) r3.get(r5);
        r6.zza(r10);
        r4 = r4 | (r6 instanceof com.google.android.libraries.places.internal.zzbpc);
        r6 = r9.zzs;
        r8 = r6.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a5, code lost:
    
        if (r8 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r8 != r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r6.zzg == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzai(com.google.android.libraries.places.internal.zzbpm r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.zzm
            monitor-enter(r5)
            com.google.android.libraries.places.internal.zzbpd r6 = r9.zzs     // Catch: java.lang.Throwable -> L12
            com.google.android.libraries.places.internal.zzbpm r7 = r6.zzf     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L12:
            r9 = move-exception
            goto Lb2
        L15:
            boolean r7 = r6.zzg     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L37
        L1b:
            java.util.List r7 = r6.zzb     // Catch: java.lang.Throwable -> L12
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r7) goto L61
            com.google.android.libraries.places.internal.zzbpd r0 = r6.zzc(r10)     // Catch: java.lang.Throwable -> L12
            r9.zzs = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.zzp()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            com.google.android.libraries.places.internal.zzbot r1 = new com.google.android.libraries.places.internal.zzbot     // Catch: java.lang.Throwable -> L12
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L37:
            if (r1 == 0) goto L44
            java.util.concurrent.Executor r9 = r9.zze
            com.google.android.libraries.places.internal.zzbdw r9 = (com.google.android.libraries.places.internal.zzbdw) r9
            r9.zzc(r1)
            r9.zzb()
            return
        L44:
            if (r4 != 0) goto L50
            com.google.android.libraries.places.internal.zzbfr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbpl r1 = new com.google.android.libraries.places.internal.zzbpl
            r1.<init>(r9, r10)
            r0.zzo(r1)
        L50:
            com.google.android.libraries.places.internal.zzbfr r0 = r10.zza
            com.google.android.libraries.places.internal.zzbpd r1 = r9.zzs
            com.google.android.libraries.places.internal.zzbpm r1 = r1.zzf
            if (r1 != r10) goto L5b
            com.google.android.libraries.places.internal.zzbdo r9 = r9.zzC
            goto L5d
        L5b:
            com.google.android.libraries.places.internal.zzbdo r9 = com.google.android.libraries.places.internal.zzbpo.zza
        L5d:
            r0.zzh(r9)
            return
        L61:
            boolean r7 = r10.zzb     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L67
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L67:
            int r7 = r2 + 128
            java.util.List r8 = r6.zzb     // Catch: java.lang.Throwable -> L12
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L81
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.zzb     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L8d
        L81:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.zzb     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L8d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L93:
            if (r5 >= r2) goto Laf
            java.lang.Object r6 = r3.get(r5)
            com.google.android.libraries.places.internal.zzbov r6 = (com.google.android.libraries.places.internal.zzbov) r6
            r6.zza(r10)
            boolean r6 = r6 instanceof com.google.android.libraries.places.internal.zzbpc
            r4 = r4 | r6
            com.google.android.libraries.places.internal.zzbpd r6 = r9.zzs
            com.google.android.libraries.places.internal.zzbpm r8 = r6.zzf
            if (r8 == 0) goto La9
            if (r8 != r10) goto Laf
        La9:
            boolean r6 = r6.zzg
            int r5 = r5 + 1
            if (r6 == 0) goto L93
        Laf:
            r2 = r7
            goto L5
        Lb2:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbpo.zzai(com.google.android.libraries.places.internal.zzbpm):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaj() {
        Future future;
        synchronized (this.zzm) {
            try {
                zzboy zzboyVar = this.zzA;
                future = null;
                if (zzboyVar != null) {
                    Future futureZza = zzboyVar.zza();
                    this.zzA = null;
                    future = futureZza;
                }
                this.zzs = this.zzs.zzb();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(zzbdo zzbdoVar, zzbfs zzbfsVar, zzbcf zzbcfVar) {
        this.zzw = new zzbpb(zzbdoVar, zzbfsVar, zzbcfVar);
        if (this.zzv.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            zzbdw zzbdwVar = (zzbdw) this.zze;
            zzbdwVar.zzc(new zzbou(this, zzbdoVar, zzbfsVar, zzbcfVar));
            zzbdwVar.zzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzal(zzbpd zzbpdVar) {
        return zzbpdVar.zzf == null && zzbpdVar.zze < this.zzk.zza && !zzbpdVar.zzh;
    }

    public abstract zzbdo zza();

    public final void zzab(Object obj) {
        zzbpd zzbpdVar = this.zzs;
        if (zzbpdVar.zza) {
            zzbpdVar.zzf.zza.zzw(this.zzc.zzc(obj));
        } else {
            zzah(new zzbor(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final zzaye zzam() {
        throw null;
    }

    public abstract zzbfr zzb(zzbcf zzbcfVar, zzayu zzayuVar, int i, boolean z);

    public abstract void zzc();

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzg(zzbjj zzbjjVar) {
        zzbpd zzbpdVar;
        synchronized (this.zzm) {
            zzbjjVar.zzb("closed", this.zzr);
            zzbpdVar = this.zzs;
        }
        if (zzbpdVar.zzf != null) {
            zzbjj zzbjjVar2 = new zzbjj();
            zzbpdVar.zzf.zza.zzg(zzbjjVar2);
            zzbjjVar.zzb("committed", zzbjjVar2);
            return;
        }
        zzbjj zzbjjVar3 = new zzbjj();
        for (zzbpm zzbpmVar : zzbpdVar.zzc) {
            zzbjj zzbjjVar4 = new zzbjj();
            zzbpmVar.zza.zzg(zzbjjVar4);
            zzbjjVar3.zza(zzbjjVar4);
        }
        zzbjjVar.zzb("open", zzbjjVar3);
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzh(zzbdo zzbdoVar) {
        zzbpm zzbpmVar;
        zzbpm zzbpmVar2 = new zzbpm(0);
        zzbpmVar2.zza = new zzbmy();
        Runnable runnableZzag = zzag(zzbpmVar2);
        Object obj = this.zzm;
        if (runnableZzag != null) {
            synchronized (obj) {
                this.zzs = this.zzs.zzc(zzbpmVar2);
            }
            runnableZzag.run();
            zzak(zzbdoVar, zzbfs.PROCESSED, new zzbcf());
            return;
        }
        synchronized (obj) {
            try {
                if (this.zzs.zzc.contains(this.zzs.zzf)) {
                    zzbpmVar = this.zzs.zzf;
                } else {
                    this.zzC = zzbdoVar;
                    zzbpmVar = null;
                }
                zzbpd zzbpdVar = this.zzs;
                this.zzs = new zzbpd(zzbpdVar.zzb, zzbpdVar.zzc, zzbpdVar.zzd, zzbpdVar.zzf, true, zzbpdVar.zza, zzbpdVar.zzh, zzbpdVar.zze);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzbpmVar != null) {
            zzbpmVar.zza.zzh(zzbdoVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzj() {
        zzah(new zzbom(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzk(zzazn zzaznVar) {
        zzah(new zzboj(this, zzaznVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzl(zzazq zzazqVar) {
        zzah(new zzbok(this, zzazqVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzm(int i) {
        zzah(new zzbon(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzn(int i) {
        zzah(new zzboo(this, i));
    }

    @Override // com.google.android.libraries.places.internal.zzbfr
    public final void zzo(zzbft zzbftVar) {
        zzboy zzboyVar;
        zzbpn zzbpnVar;
        this.zzy = zzbftVar;
        zzbdo zzbdoVarZza = zza();
        if (zzbdoVarZza != null) {
            zzh(zzbdoVarZza);
            return;
        }
        synchronized (this.zzm) {
            this.zzs.zzb.add(new zzbpc(this));
        }
        zzbpm zzbpmVarZzaf = zzaf(0, false);
        if (zzbpmVarZzaf == null) {
            return;
        }
        if (this.zzl) {
            synchronized (this.zzm) {
                try {
                    this.zzs = this.zzs.zza(zzbpmVarZzaf);
                    zzboyVar = null;
                    if (zzal(this.zzs) && ((zzbpnVar = this.zzq) == null || zzbpnVar.zza())) {
                        zzboyVar = new zzboy(this.zzm);
                        this.zzA = zzboyVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzboyVar != null) {
                zzboyVar.zzb(this.zzf.schedule(new zzbpa(this, zzboyVar), this.zzk.zzb, TimeUnit.NANOSECONDS));
            }
        }
        zzai(zzbpmVarZzaf);
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final boolean zzp() {
        Iterator it = this.zzs.zzc.iterator();
        while (it.hasNext()) {
            if (((zzbpm) it.next()).zza.zzp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzr() {
        zzbpd zzbpdVar = this.zzs;
        if (zzbpdVar.zza) {
            zzbpdVar.zzf.zza.zzr();
        } else {
            zzah(new zzbol(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzt() {
        zzah(new zzbop(this));
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzu(int i) {
        zzbpd zzbpdVar = this.zzs;
        if (zzbpdVar.zza) {
            zzbpdVar.zzf.zza.zzu(2);
        } else {
            zzah(new zzboq(this, 2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzv(zzazc zzazcVar) {
        zzah(new zzboi(this, zzazcVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbqp
    public final void zzw(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }
}
