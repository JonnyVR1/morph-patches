package com.google.android.libraries.places.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes7.dex */
final class zzbme extends WeakReference {
    private static final boolean zza = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException zzb;
    private final ReferenceQueue zzc;
    private final ConcurrentMap zzd;
    private final String zze;
    private final Reference zzf;
    private final AtomicBoolean zzg;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        zzb = runtimeException;
    }

    public zzbme(zzbmf zzbmfVar, zzbbr zzbbrVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(zzbmfVar, referenceQueue);
        this.zzg = new AtomicBoolean();
        this.zzf = new SoftReference(zza ? new RuntimeException("ManagedChannel allocation site") : zzb);
        this.zze = zzbbrVar.toString();
        this.zzc = referenceQueue;
        this.zzd = concurrentMap;
        concurrentMap.put(this, this);
        zza(referenceQueue);
    }

    public static int zza(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            zzbme zzbmeVar = (zzbme) referenceQueue.poll();
            if (zzbmeVar == null) {
                return i;
            }
            RuntimeException runtimeException = (RuntimeException) zzbmeVar.zzf.get();
            zzbmeVar.zzb();
            if (!zzbmeVar.zzg.get()) {
                i++;
                Level level = Level.SEVERE;
                if (zzbmf.zzc.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(zzbmf.zzc.getName());
                    logRecord.setParameters(new Object[]{zzbmeVar.zze});
                    logRecord.setThrown(runtimeException);
                    zzbmf.zzc.log(logRecord);
                }
            }
        }
    }

    private final void zzb() {
        super.clear();
        this.zzd.remove(this);
        this.zzf.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        zzb();
        zza(this.zzc);
    }
}
