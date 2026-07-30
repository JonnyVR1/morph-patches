package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbcf {
    private Object[] zze;
    private int zzf;
    private static final Logger zzd = Logger.getLogger(zzbcf.class.getName());
    public static final zzbby zza = new zzbbt();
    public static final zzbbx zzb = new zzbbu();
    static final zzsi zzc = zzsi.zzj().zzf();

    public zzbcf(int i, Object[] objArr) {
        this.zzf = i;
        this.zze = objArr;
    }

    private final int zzh() {
        Object[] objArr = this.zze;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final Object zzi(int i) {
        return this.zze[i + i + 1];
    }

    private final void zzj(int i) {
        Object[] objArr = new Object[i];
        if (!zzk()) {
            Object[] objArr2 = this.zze;
            int i2 = this.zzf;
            System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.zze = objArr;
    }

    private final boolean zzk() {
        return this.zzf == 0;
    }

    private final byte[] zzl(int i) {
        return (byte[]) this.zze[i + i];
    }

    private final byte[] zzm(int i) {
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return (byte[]) objZzi;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.zzf; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] bArrZzl = zzl(i);
            Charset charset = zzmb.zza;
            String str = new String(bArrZzl, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                zzsi zzsiVar = zzc;
                byte[] bArrZzm = zzm(i);
                sb.append(zzsiVar.zzk(bArrZzm, 0, bArrZzm.length));
            } else {
                sb.append(new String(zzm(i), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final int zza() {
        return this.zzf;
    }

    public final Object zzb(zzbca zzbcaVar) {
        int i = this.zzf;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(zzbcaVar.zze(), zzl(i)));
        Object objZzi = zzi(i);
        if (objZzi instanceof byte[]) {
            return zzbcaVar.zza((byte[]) objZzi);
        }
        throw null;
    }

    public final void zzd(zzbca zzbcaVar) {
        if (zzk()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.zzf;
            if (i >= i3) {
                Arrays.fill(this.zze, i2 + i2, i3 + i3, (Object) null);
                this.zzf = i2;
                return;
            }
            if (!Arrays.equals(zzbcaVar.zze(), zzl(i))) {
                int i4 = i2 + i2;
                this.zze[i4] = zzl(i);
                Object objZzi = zzi(i);
                if (this.zze instanceof byte[][]) {
                    zzj(zzh());
                }
                this.zze[i4 + 1] = objZzi;
                i2++;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final void zze(zzbcf zzbcfVar) {
        if (zzbcfVar.zzk()) {
            return;
        }
        int iZzh = zzh();
        int i = this.zzf;
        int i2 = i + i;
        int i3 = iZzh - i2;
        if (zzk()) {
            int i4 = zzbcfVar.zzf;
            zzj(i2 + i4 + i4);
        } else {
            int i5 = zzbcfVar.zzf;
            if (i3 < i5 + i5) {
                int i6 = zzbcfVar.zzf;
                zzj(i2 + i6 + i6);
            }
        }
        Object[] objArr = zzbcfVar.zze;
        Object[] objArr2 = this.zze;
        int i7 = this.zzf;
        int i8 = zzbcfVar.zzf;
        System.arraycopy(objArr, 0, objArr2, i7 + i7, i8 + i8);
        this.zzf += zzbcfVar.zzf;
    }

    public final void zzf(zzbca zzbcaVar, Object obj) {
        zzmt.zzc(zzbcaVar, Constants.KEY_KEY);
        zzmt.zzc(obj, "value");
        int i = this.zzf;
        int i2 = i + i;
        if (i2 == 0 || i2 == zzh()) {
            zzj(Math.max(i2 + i2, 8));
        }
        int i3 = this.zzf;
        this.zze[i3 + i3] = zzbcaVar.zze();
        int i4 = this.zzf;
        this.zze[i4 + i4 + 1] = zzbcaVar.zzb(obj);
        this.zzf++;
    }

    public final byte[][] zzg() {
        int i = this.zzf;
        int i2 = i + i;
        byte[][] bArr = new byte[i2][];
        Object[] objArr = this.zze;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i2);
            return bArr;
        }
        for (int i3 = 0; i3 < this.zzf; i3++) {
            int i4 = i3 + i3;
            bArr[i4] = zzl(i3);
            bArr[i4 + 1] = zzm(i3);
        }
        return bArr;
    }

    public zzbcf() {
    }
}
