package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtz implements zzbtr {
    final zzbtu zza;
    private final zzbwd zzb;
    private final zzbtx zzc;

    public zzbtz(zzbwd zzbwdVar, int i, boolean z) {
        this.zzb = zzbwdVar;
        zzbtx zzbtxVar = new zzbtx(zzbwdVar);
        this.zzc = zzbtxVar;
        this.zza = new zzbtu(4096, 4096, zzbtxVar);
    }

    private final List zzb(int i, short s, byte b, int i2) throws IOException {
        zzbtx zzbtxVar = this.zzc;
        zzbtxVar.zzd = i;
        zzbtxVar.zza = i;
        zzbtxVar.zze = s;
        zzbtxVar.zzb = b;
        zzbtxVar.zzc = i2;
        this.zza.zze();
        return this.zza.zzb();
    }

    private final void zzc(zzbtq zzbtqVar, int i) throws IOException {
        this.zzb.zze();
        this.zzb.zzc();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzb.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzbtr
    public final boolean zza(zzbtq zzbtqVar) throws IOException {
        try {
            this.zzb.zzD(9L);
            int iZzb = zzbub.zzb(this.zzb);
            if (iZzb > 16384) {
                throw zzbub.zzi("FRAME_SIZE_ERROR: %s", Integer.valueOf(iZzb));
            }
            byte bZzc = (byte) (this.zzb.zzc() & 255);
            byte bZzc2 = (byte) (this.zzb.zzc() & 255);
            int iZze = this.zzb.zze() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = zzbub.zza;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                zzbub.zza.logp(level, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", zzbty.zza(true, iZze, iZzb, bZzc, bZzc2));
            }
            switch (bZzc) {
                case 0:
                    boolean z = bZzc2 & 1;
                    if ((bZzc2 & HttpTokens.SPACE) != 0) {
                        throw zzbub.zzi("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    }
                    int iZzc = (bZzc2 & 8) != 0 ? this.zzb.zzc() & 255 : 0;
                    zzbtqVar.zza(1 == z, iZze, this.zzb, zzbub.zza(iZzb, bZzc2, (short) iZzc), iZzb);
                    this.zzb.zzF(iZzc);
                    return true;
                case 1:
                    if (iZze == 0) {
                        throw zzbub.zzi("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    }
                    boolean z2 = bZzc2 & 8;
                    boolean z3 = bZzc2 & HttpTokens.SPACE;
                    boolean z4 = bZzc2 & 1;
                    int iZzc2 = z2 != 0 ? this.zzb.zzc() & 255 : 0;
                    if (z3 != 0) {
                        zzc(zzbtqVar, iZze);
                        iZzb -= 5;
                    }
                    short s = (short) iZzc2;
                    zzbtqVar.zzh(false, 1 == z4, iZze, -1, zzb(zzbub.zza(iZzb, bZzc2, s), s, bZzc2, iZze), 4);
                    return true;
                case 2:
                    if (iZzb != 5) {
                        throw zzbub.zzi("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iZzb));
                    }
                    if (iZze == 0) {
                        throw zzbub.zzi("TYPE_PRIORITY streamId == 0", new Object[0]);
                    }
                    zzc(zzbtqVar, iZze);
                    return true;
                case 3:
                    if (iZzb != 4) {
                        throw zzbub.zzi("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iZzb));
                    }
                    if (iZze == 0) {
                        throw zzbub.zzi("TYPE_RST_STREAM streamId == 0", new Object[0]);
                    }
                    int iZze2 = this.zzb.zze();
                    zzbtp zzbtpVarZza = zzbtp.zza(iZze2);
                    if (zzbtpVarZza == null) {
                        throw zzbub.zzi("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iZze2));
                    }
                    zzbtqVar.zze(iZze, zzbtpVarZza);
                    return true;
                case 4:
                    if (iZze != 0) {
                        throw zzbub.zzi("TYPE_SETTINGS streamId != 0", new Object[0]);
                    }
                    if ((bZzc2 & 1) == 0) {
                        if (iZzb % 6 != 0) {
                            throw zzbub.zzi("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iZzb));
                        }
                        zzbue zzbueVar = new zzbue();
                        for (int i = 0; i < iZzb; i += 6) {
                            zzbwd zzbwdVar = this.zzb;
                            zzbwl zzbwlVar = (zzbwl) zzbwdVar;
                            zzbwlVar.zzD(2L);
                            short sZzC = zzbwlVar.zzb.zzC();
                            int iZze3 = zzbwdVar.zze();
                            switch (sZzC) {
                                case 1:
                                case 6:
                                    break;
                                case 2:
                                    if (iZze3 != 0 && iZze3 != 1) {
                                        throw zzbub.zzi("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    }
                                    break;
                                case 3:
                                    sZzC = 4;
                                    break;
                                case 4:
                                    if (iZze3 < 0) {
                                        throw zzbub.zzi("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                    }
                                    sZzC = 7;
                                    break;
                                    break;
                                case 5:
                                    if (iZze3 < 16384 || iZze3 > 16777215) {
                                        throw zzbub.zzi("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iZze3));
                                    }
                                    break;
                                default:
                                    continue;
                                    break;
                            }
                            zzbueVar.zze(sZzC, 0, iZze3);
                        }
                        zzbtqVar.zzf(false, zzbueVar);
                        if (zzbueVar.zzb() >= 0) {
                            this.zza.zzd(zzbueVar.zzb());
                        }
                    } else if (iZzb != 0) {
                        throw zzbub.zzi("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    }
                    return true;
                case 5:
                    if (iZze == 0) {
                        throw zzbub.zzi("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    }
                    short sZzc = (short) ((bZzc2 & 8) != 0 ? this.zzb.zzc() & 255 : 0);
                    zzbtqVar.zzd(iZze, this.zzb.zze() & Api.BaseClientBuilder.API_PRIORITY_OTHER, zzb(zzbub.zza(iZzb - 4, bZzc2, sZzc), sZzc, bZzc2, iZze));
                    return true;
                case 6:
                    if (iZzb != 8) {
                        throw zzbub.zzi("TYPE_PING length != 8: %s", Integer.valueOf(iZzb));
                    }
                    if (iZze != 0) {
                        throw zzbub.zzi("TYPE_PING streamId != 0", new Object[0]);
                    }
                    boolean z5 = 1 == (bZzc2 & 1);
                    zzbwd zzbwdVar2 = this.zzb;
                    zzbtqVar.zzc(z5, zzbwdVar2.zze(), zzbwdVar2.zze());
                    return true;
                case 7:
                    if (iZzb < 8) {
                        throw zzbub.zzi("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iZzb));
                    }
                    if (iZze != 0) {
                        throw zzbub.zzi("TYPE_GOAWAY streamId != 0", new Object[0]);
                    }
                    zzbwd zzbwdVar3 = this.zzb;
                    int i2 = iZzb - 8;
                    int iZze4 = zzbwdVar3.zze();
                    int iZze5 = zzbwdVar3.zze();
                    zzbtp zzbtpVarZza2 = zzbtp.zza(iZze5);
                    if (zzbtpVarZza2 == null) {
                        throw zzbub.zzi("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iZze5));
                    }
                    zzbwf zzbwfVarZzy = zzbwf.zzb;
                    if (i2 > 0) {
                        zzbwfVarZzy = this.zzb.zzy(i2);
                    }
                    zzbtqVar.zzb(iZze4, zzbtpVarZza2, zzbwfVarZzy);
                    return true;
                case 8:
                    if (iZzb != 4) {
                        throw zzbub.zzi("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iZzb));
                    }
                    long jZze = ((long) this.zzb.zze()) & 2147483647L;
                    if (jZze == 0) {
                        throw zzbub.zzi("windowSizeIncrement was 0", new Object[0]);
                    }
                    zzbtqVar.zzg(iZze, jZze);
                    return true;
                default:
                    this.zzb.zzF(iZzb);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
