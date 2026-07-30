package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbjg extends zzbee {
    private static final zzbaq zza;
    private static final zzbca zzb;
    private zzbdo zzc;
    private zzbcf zzd;
    private Charset zze;
    private boolean zzf;

    static {
        zzbjf zzbjfVar = new zzbjf();
        zza = zzbjfVar;
        zzb = zzbar.zzb(":status", zzbjfVar);
    }

    public zzbjg(int i, zzbqo zzbqoVar, zzbqz zzbqzVar, zzayj zzayjVar) {
        super(i, zzbqoVar, zzbqzVar, zzayjVar);
        this.zze = zzmb.zzc;
    }

    private static Charset zzG(zzbcf zzbcfVar) {
        String str = (String) zzbcfVar.zzb(zzbjd.zzh);
        if (str != null) {
            String[] strArrSplit = str.split("charset=", 2);
            try {
                return Charset.forName(strArrSplit[strArrSplit.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return zzmb.zzc;
    }

    private static void zzH(zzbcf zzbcfVar) {
        zzbcfVar.zzd(zzb);
        zzbcfVar.zzd(zzbat.zzb);
        zzbcfVar.zzd(zzbat.zza);
    }

    private static final zzbdo zzI(zzbcf zzbcfVar) {
        char cCharAt;
        Integer num = (Integer) zzbcfVar.zzb(zzb);
        if (num == null) {
            return zzbdo.zzo.zzg("Missing HTTP status code");
        }
        String str = (String) zzbcfVar.zzb(zzbjd.zzh);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return zzbjd.zza(num.intValue()).zzc("invalid content-type: ".concat(String.valueOf(str)));
    }

    public abstract void zzA(zzbdo zzbdoVar, boolean z, zzbcf zzbcfVar);

    public final void zzB(zzbnv zzbnvVar, boolean z) {
        zzbdo zzbdoVar = this.zzc;
        if (zzbdoVar != null) {
            Charset charset = this.zze;
            zzmt.zzc(charset, "charset");
            int iZzf = zzbnvVar.zzf();
            byte[] bArr = new byte[iZzf];
            zzbnvVar.zzk(bArr, 0, iZzf);
            this.zzc = zzbdoVar.zzc("DATA-----------------------------\n".concat(new String(bArr, charset)));
            zzbnvVar.close();
            if (this.zzc.zzi().length() > 1000 || z) {
                zzA(this.zzc, false, this.zzd);
                return;
            }
            return;
        }
        if (!this.zzf) {
            zzA(zzbdo.zzo.zzg("headers not received before payload"), false, new zzbcf());
            return;
        }
        int iZzf2 = zzbnvVar.zzf();
        zzf(zzbnvVar);
        if (z) {
            if (iZzf2 > 0) {
                this.zzc = zzbdo.zzo.zzg("Received unexpected EOS on non-empty DATA frame from server");
            } else {
                this.zzc = zzbdo.zzo.zzg("Received unexpected EOS on empty DATA frame from server");
            }
            zzbcf zzbcfVar = new zzbcf();
            this.zzd = zzbcfVar;
            zzj(this.zzc, zzbfs.PROCESSED, false, zzbcfVar);
        }
    }

    public final void zzC(zzbcf zzbcfVar) {
        zzbdo zzbdoVar = this.zzc;
        if (zzbdoVar != null) {
            this.zzc = zzbdoVar.zzc("headers: ".concat(zzbcfVar.toString()));
            return;
        }
        try {
            if (this.zzf) {
                this.zzc = zzbdo.zzo.zzg("Received headers twice");
            } else {
                Integer num = (Integer) zzbcfVar.zzb(zzb);
                if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                    this.zzf = true;
                    zzbdo zzbdoVarZzI = zzI(zzbcfVar);
                    this.zzc = zzbdoVarZzI;
                    if (zzbdoVarZzI != null) {
                        this.zzc = zzbdoVarZzI.zzc("headers: ".concat(zzbcfVar.toString()));
                        this.zzd = zzbcfVar;
                        this.zze = zzG(zzbcfVar);
                        return;
                    }
                    zzH(zzbcfVar);
                    zzg(zzbcfVar);
                }
            }
            zzbdo zzbdoVar2 = this.zzc;
            if (zzbdoVar2 != null) {
                this.zzc = zzbdoVar2.zzc("headers: ".concat(zzbcfVar.toString()));
                this.zzd = zzbcfVar;
                this.zze = zzG(zzbcfVar);
            }
        } catch (Throwable th) {
            zzbdo zzbdoVar3 = this.zzc;
            if (zzbdoVar3 != null) {
                this.zzc = zzbdoVar3.zzc("headers: ".concat(zzbcfVar.toString()));
                this.zzd = zzbcfVar;
                this.zze = zzG(zzbcfVar);
            }
            throw th;
        }
    }

    public final void zzD(zzbcf zzbcfVar) {
        zzbdo zzbdoVarZzc;
        zzbdo zzbdoVarZzI = this.zzc;
        if (zzbdoVarZzI == null && !this.zzf) {
            zzbdoVarZzI = zzI(zzbcfVar);
            this.zzc = zzbdoVarZzI;
            if (zzbdoVarZzI != null) {
                this.zzd = zzbcfVar;
            }
        }
        if (zzbdoVarZzI != null) {
            zzbdo zzbdoVarZzc2 = zzbdoVarZzI.zzc("trailers: ".concat(zzbcfVar.toString()));
            this.zzc = zzbdoVarZzc2;
            zzA(zzbdoVarZzc2, false, this.zzd);
            return;
        }
        zzbdo zzbdoVar = (zzbdo) zzbcfVar.zzb(zzbat.zzb);
        if (zzbdoVar != null) {
            zzbdoVarZzc = zzbdoVar.zzg((String) zzbcfVar.zzb(zzbat.zza));
        } else if (this.zzf) {
            zzbdoVarZzc = zzbdo.zzc.zzg("missing GRPC status in response");
        } else {
            Integer num = (Integer) zzbcfVar.zzb(zzb);
            zzbdoVarZzc = (num != null ? zzbjd.zza(num.intValue()) : zzbdo.zzo.zzg("missing HTTP status code")).zzc("missing GRPC status, inferred error from HTTP status code");
        }
        zzH(zzbcfVar);
        zzh(zzbcfVar, zzbdoVarZzc);
    }
}
