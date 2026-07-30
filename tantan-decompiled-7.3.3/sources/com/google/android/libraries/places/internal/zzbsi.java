package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsi {
    private final Logger zza;
    private final Level zzb;

    public zzbsi(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        zzmt.zzc(level, FirebaseAnalytics.Param.LEVEL);
        this.zzb = level;
        zzmt.zzc(logger, "logger");
        this.zza = logger;
    }

    private static String zzk(zzbwb zzbwbVar) {
        return zzbwbVar.zzg() <= 64 ? zzbwbVar.zzz().zze() : String.valueOf(zzbwbVar.zzA((int) Math.min(zzbwbVar.zzg(), 64L)).zze()).concat("...");
    }

    private final boolean zzl() {
        return this.zza.isLoggable(this.zzb);
    }

    public final void zza(int i, int i2, zzbwb zzbwbVar, int i3, boolean z) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logData", zzbsg.zza(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + zzk(zzbwbVar));
        }
    }

    public final void zzb(int i, int i2, zzbtp zzbtpVar, zzbwf zzbwfVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbsg.zza(i);
            String strValueOf = String.valueOf(zzbtpVar);
            int iZzc = zzbwfVar.zzc();
            zzbwb zzbwbVar = new zzbwb();
            zzbwbVar.zzk(zzbwfVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", strZza + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + strValueOf + " length=" + iZzc + " bytes=" + zzk(zzbwbVar));
        }
    }

    public final void zzc(int i, int i2, List list, boolean z) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logHeaders", "INBOUND HEADERS: streamId=" + i2 + " headers=" + list.toString() + " endStream=" + z);
        }
    }

    public final void zzd(int i, long j) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", zzbsg.zza(i) + " PING: ack=false bytes=" + j);
        }
    }

    public final void zze(int i, long j) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", zzbsg.zza(2) + " PING: ack=true bytes=" + j);
        }
    }

    public final void zzf(int i, int i2, int i3, List list) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", "INBOUND PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + list.toString());
        }
    }

    public final void zzg(int i, int i2, zzbtp zzbtpVar) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", zzbsg.zza(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(zzbtpVar));
        }
    }

    public final void zzh(int i, zzbue zzbueVar) {
        if (zzl()) {
            Logger logger = this.zza;
            Level level = this.zzb;
            String strZza = zzbsg.zza(i);
            EnumMap enumMap = new EnumMap(zzbsh.class);
            for (zzbsh zzbshVar : zzbsh.values()) {
                if (zzbueVar.zzf(zzbshVar.zza())) {
                    enumMap.put(zzbshVar, Integer.valueOf(zzbueVar.zza(zzbshVar.zza())));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", strZza + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    public final void zzi(int i) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logSettingsAck", zzbsg.zza(2).concat(" SETTINGS: ack=true"));
        }
    }

    public final void zzj(int i, int i2, long j) {
        if (zzl()) {
            this.zza.logp(this.zzb, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", zzbsg.zza(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }
}
