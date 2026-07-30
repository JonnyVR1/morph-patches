package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzbms extends OutputStream {
    final /* synthetic */ zzbmw zza;
    private final List zzb = new ArrayList();
    private zzbra zzc;

    public /* synthetic */ zzbms(zzbmw zzbmwVar, zzbmr zzbmrVar) {
        this.zza = zzbmwVar;
    }

    public static /* bridge */ /* synthetic */ int zza(zzbms zzbmsVar) {
        Iterator it = zzbmsVar.zzb.iterator();
        int iZza = 0;
        while (it.hasNext()) {
            iZza += ((zzbra) it.next()).zza();
        }
        return iZza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.zzc == null) {
            zzbra zzbraVarZza = this.zza.zzg.zza(i2);
            this.zzc = zzbraVarZza;
            this.zzb.add(zzbraVarZza);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.zzc.zzb());
            zzbra zzbraVar = this.zzc;
            if (iMin == 0) {
                int iZza = zzbraVar.zza();
                zzbra zzbraVarZza2 = this.zza.zzg.zza(Math.max(i2, iZza + iZza));
                this.zzc = zzbraVarZza2;
                this.zzb.add(zzbraVarZza2);
            } else {
                zzbraVar.zzd(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        zzbra zzbraVar = this.zzc;
        byte b = (byte) i;
        if (zzbraVar == null || zzbraVar.zzb() <= 0) {
            write(new byte[]{b}, 0, 1);
        } else {
            zzbraVar.zzc(b);
        }
    }
}
