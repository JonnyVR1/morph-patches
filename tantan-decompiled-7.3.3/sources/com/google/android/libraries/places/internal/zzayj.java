package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public final class zzayj {
    public static final zzayj zza;
    private final zzazn zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    static {
        zzayg zzaygVar = new zzayg();
        zzaygVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzaygVar.zzd = Collections.EMPTY_LIST;
        zza = new zzayj(zzaygVar, null);
    }

    public /* synthetic */ zzayj(zzayg zzaygVar, zzayi zzayiVar) {
        this.zzb = zzaygVar.zza;
        this.zzc = zzaygVar.zzb;
        this.zzd = zzaygVar.zzc;
        this.zze = zzaygVar.zzd;
        this.zzf = zzaygVar.zze;
        this.zzg = zzaygVar.zzf;
        this.zzh = zzaygVar.zzg;
    }

    private static zzayg zzp(zzayj zzayjVar) {
        zzayg zzaygVar = new zzayg();
        zzaygVar.zza = zzayjVar.zzb;
        zzaygVar.zzb = zzayjVar.zzc;
        zzaygVar.zzc = zzayjVar.zzd;
        zzaygVar.zzd = zzayjVar.zze;
        zzaygVar.zze = zzayjVar.zzf;
        zzaygVar.zzf = zzayjVar.zzg;
        zzaygVar.zzg = zzayjVar.zzh;
        return zzaygVar;
    }

    public final String toString() {
        zzmm zzmmVarZzb = zzmn.zzb(this);
        zzmmVarZzb.zzd("deadline", this.zzb);
        zzmmVarZzb.zzd("authority", null);
        zzmmVarZzb.zzd("callCredentials", null);
        Executor executor = this.zzc;
        zzmmVarZzb.zzd("executor", executor != null ? executor.getClass() : null);
        zzmmVarZzb.zzd("compressorName", null);
        zzmmVarZzb.zzd("customOptions", Arrays.deepToString(this.zzd));
        zzmmVarZzb.zze("waitForReady", zzo());
        zzmmVarZzb.zzd("maxInboundMessageSize", this.zzg);
        zzmmVarZzb.zzd("maxOutboundMessageSize", this.zzh);
        zzmmVarZzb.zzd("streamTracerFactories", this.zze);
        return zzmmVarZzb.toString();
    }

    public final zzayj zza(zzazn zzaznVar) {
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zza = zzaznVar;
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzb(Executor executor) {
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zzb = executor;
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzc(int i) {
        zzmt.zzh(i >= 0, "invalid maxsize %s", i);
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zzf = Integer.valueOf(i);
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzd(int i) {
        zzmt.zzh(i >= 0, "invalid maxsize %s", i);
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zzg = Integer.valueOf(i);
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zze(zzayh zzayhVar, Object obj) {
        zzmt.zzc(zzayhVar, Constants.KEY_KEY);
        zzmt.zzc(obj, "value");
        zzayg zzaygVarZzp = zzp(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (zzayhVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.zzd.length + (i == -1 ? 1 : 0), 2);
        zzaygVarZzp.zzc = objArr2;
        Object[][] objArr3 = this.zzd;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        Object[][] objArr4 = zzaygVarZzp.zzc;
        if (i == -1) {
            objArr4[this.zzd.length] = new Object[]{zzayhVar, obj};
        } else {
            objArr4[i] = new Object[]{zzayhVar, obj};
        }
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzf(zzayu zzayuVar) {
        ArrayList arrayList = new ArrayList(this.zze.size() + 1);
        arrayList.addAll(this.zze);
        arrayList.add(zzayuVar);
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzg() {
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zze = Boolean.TRUE;
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzayj zzh() {
        zzayg zzaygVarZzp = zzp(this);
        zzaygVarZzp.zze = Boolean.FALSE;
        return new zzayj(zzaygVarZzp, null);
    }

    public final zzazn zzi() {
        return this.zzb;
    }

    public final Integer zzj() {
        return this.zzg;
    }

    public final Integer zzk() {
        return this.zzh;
    }

    public final Object zzl(zzayh zzayhVar) {
        zzmt.zzc(zzayhVar, Constants.KEY_KEY);
        int i = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i >= objArr.length) {
                zzayh.zzb(zzayhVar);
                return null;
            }
            if (zzayhVar.equals(objArr[i][0])) {
                return this.zzd[i][1];
            }
            i++;
        }
    }

    public final List zzm() {
        return this.zze;
    }

    public final Executor zzn() {
        return this.zzc;
    }

    public final boolean zzo() {
        return Boolean.TRUE.equals(this.zzf);
    }
}
