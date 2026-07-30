package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.CharEncoding;
import org.eclipse.jetty.http.HttpHeaderValues;

/* JADX INFO: loaded from: classes7.dex */
final class zzbfq extends zzayo {
    private static final Logger zza = Logger.getLogger(zzbfq.class.getName());
    private static final byte[] zzb = HttpHeaderValues.GZIP.getBytes(Charset.forName(CharEncoding.US_ASCII));
    private static final double zzc = 1.0E9d;
    private final zzbcl zzd;
    private final zzbvs zze;
    private final Executor zzf;
    private final boolean zzg;
    private final zzbfg zzh;
    private final zzazj zzi;
    private zzbfj zzj;
    private final boolean zzk;
    private zzayj zzl;
    private zzbfr zzm;
    private boolean zzn;
    private boolean zzo;
    private final zzbfp zzp;
    private final ScheduledExecutorService zzq;
    private zzazq zzr = zzazq.zzb();
    private zzazd zzs = zzazd.zza();

    public zzbfq(zzbcl zzbclVar, Executor executor, zzayj zzayjVar, zzbfp zzbfpVar, ScheduledExecutorService scheduledExecutorService, zzbfg zzbfgVar, zzbam zzbamVar) {
        this.zzd = zzbclVar;
        this.zze = zzbvr.zzc(zzbclVar.zzf(), System.identityHashCode(this));
        if (executor == zzakb.zza()) {
            this.zzf = new zzbpx();
            this.zzg = true;
        } else {
            this.zzf = new zzbqe(executor);
            this.zzg = false;
        }
        this.zzh = zzbfgVar;
        this.zzi = zzazj.zzb();
        this.zzk = zzbclVar.zzb() == zzbcj.UNARY || zzbclVar.zzb() == zzbcj.SERVER_STREAMING;
        this.zzl = zzayjVar;
        this.zzp = zzbfpVar;
        this.zzq = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzazn zzr() {
        zzazn zzaznVarZzi = this.zzl.zzi();
        if (zzaznVarZzi == null) {
            return null;
        }
        return zzaznVarZzi;
    }

    private final void zzs(Object obj) {
        zzmt.zzp(this.zzm != null, "Not started");
        zzmt.zzp(!this.zzn, "call was cancelled");
        zzmt.zzp(!this.zzo, "call was half-closed");
        try {
            zzbfr zzbfrVar = this.zzm;
            if (zzbfrVar instanceof zzbpo) {
                ((zzbpo) zzbfrVar).zzab(obj);
            } else {
                zzbfrVar.zzw(this.zzd.zzc(obj));
            }
            if (this.zzk) {
                return;
            }
            this.zzm.zzr();
        } catch (Error e) {
            this.zzm.zzh(zzbdo.zzb.zzg("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.zzm.zzh(zzbdo.zzb.zzf(e2).zzg("Failed to stream message"));
        }
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd(FirebaseAnalytics.Param.METHOD, this.zzd);
        return zzmmVarZzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zza(String str, Throwable th) {
        int i = zzbvr.zza;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            zza.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.zzn) {
            return;
        }
        this.zzn = true;
        try {
            if (this.zzm != null) {
                zzbdo zzbdoVar = zzbdo.zzb;
                zzbdo zzbdoVarZzg = str != null ? zzbdoVar.zzg(str) : zzbdoVar.zzg("Call cancelled without message");
                if (th != null) {
                    zzbdoVarZzg = zzbdoVarZzg.zzf(th);
                }
                this.zzm.zzh(zzbdoVarZzg);
            }
            if (this.zzj != null) {
            }
        } finally {
            zzbfj zzbfjVar = this.zzj;
            if (zzbfjVar != null) {
                zzbfjVar.zzd();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzb() {
        int i = zzbvr.zza;
        zzmt.zzp(this.zzm != null, "Not started");
        zzmt.zzp(!this.zzn, "call was cancelled");
        zzmt.zzp(!this.zzo, "call already half-closed");
        this.zzo = true;
        this.zzm.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzc(int i) {
        int i2 = zzbvr.zza;
        zzmt.zzp(this.zzm != null, "Not started");
        this.zzm.zzu(2);
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zzd(Object obj) {
        int i = zzbvr.zza;
        zzs(obj);
    }

    @Override // com.google.android.libraries.places.internal.zzayo
    public final void zze(zzayn zzaynVar, zzbcf zzbcfVar) {
        int i = zzbvr.zza;
        zzmt.zzp(this.zzm == null, "Already started");
        zzmt.zzp(!this.zzn, "call was cancelled");
        zzbmg zzbmgVar = (zzbmg) this.zzl.zzl(zzbmg.zza);
        if (zzbmgVar != null) {
            Long l2 = zzbmgVar.zzb;
            if (l2 != null) {
                zzazn zzaznVarZzd = zzazn.zzd(l2.longValue(), TimeUnit.NANOSECONDS);
                zzazn zzaznVarZzi = this.zzl.zzi();
                if (zzaznVarZzi == null || zzaznVarZzd.compareTo(zzaznVarZzi) < 0) {
                    this.zzl = this.zzl.zza(zzaznVarZzd);
                }
            }
            Boolean bool = zzbmgVar.zzc;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                zzayj zzayjVar = this.zzl;
                this.zzl = zBooleanValue ? zzayjVar.zzg() : zzayjVar.zzh();
            }
            if (zzbmgVar.zzd != null) {
                Integer numZzj = this.zzl.zzj();
                zzayj zzayjVar2 = this.zzl;
                if (numZzj != null) {
                    this.zzl = zzayjVar2.zzc(Math.min(numZzj.intValue(), zzbmgVar.zzd.intValue()));
                } else {
                    this.zzl = zzayjVar2.zzc(zzbmgVar.zzd.intValue());
                }
            }
            if (zzbmgVar.zze != null) {
                Integer numZzk = this.zzl.zzk();
                zzayj zzayjVar3 = this.zzl;
                if (numZzk != null) {
                    this.zzl = zzayjVar3.zzd(Math.min(numZzk.intValue(), zzbmgVar.zze.intValue()));
                } else {
                    this.zzl = zzayjVar3.zzd(zzbmgVar.zze.intValue());
                }
            }
        }
        zzazb zzazbVar = zzaza.zza;
        zzazq zzazqVar = this.zzr;
        zzbcfVar.zzd(zzbjd.zzg);
        zzbcfVar.zzd(zzbjd.zzc);
        zzbca zzbcaVar = zzbjd.zzd;
        zzbcfVar.zzd(zzbcaVar);
        byte[] bArrZza = zzban.zza(zzazqVar);
        if (bArrZza.length != 0) {
            zzbcfVar.zzf(zzbcaVar, bArrZza);
        }
        zzbcfVar.zzd(zzbjd.zze);
        zzbcfVar.zzd(zzbjd.zzf);
        zzazn zzaznVarZzr = zzr();
        boolean z = zzaznVarZzr != null && zzaznVarZzr.equals(null);
        zzbfj zzbfjVar = new zzbfj(this, zzaznVarZzr, z);
        this.zzj = zzbfjVar;
        if (zzaznVarZzr == null || zzbfjVar.zzd > 0) {
            this.zzm = this.zzp.zza(this.zzd, this.zzl, zzbcfVar, this.zzi);
        } else {
            zzayx[] zzayxVarArrZzk = zzbjd.zzk(this.zzl, zzbcfVar, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l3 = (Long) this.zzl.zzl(zzayx.zza);
            double d = this.zzj.zzd;
            double d2 = zzc;
            this.zzm = new zzbil(zzbdo.zze.zzg(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l3 == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : l3.longValue() / d2))), zzbfs.PROCESSED, zzayxVarArrZzk);
        }
        if (this.zzg) {
            this.zzm.zzt();
        }
        if (this.zzl.zzj() != null) {
            this.zzm.zzm(this.zzl.zzj().intValue());
        }
        if (this.zzl.zzk() != null) {
            this.zzm.zzn(this.zzl.zzk().intValue());
        }
        if (zzaznVarZzr != null) {
            this.zzm.zzk(zzaznVarZzr);
        }
        this.zzm.zzv(zzazbVar);
        this.zzm.zzl(this.zzr);
        this.zzh.zzb();
        this.zzm.zzo(new zzbfo(this, zzaynVar));
        this.zzj.zzc();
    }

    public final zzbfq zzm(zzazd zzazdVar) {
        this.zzs = zzazdVar;
        return this;
    }

    public final zzbfq zzn(zzazq zzazqVar) {
        this.zzr = zzazqVar;
        return this;
    }
}
