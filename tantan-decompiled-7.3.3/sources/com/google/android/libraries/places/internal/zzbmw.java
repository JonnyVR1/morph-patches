package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbmw implements zzbis {
    private final zzbmv zza;
    private zzbra zzc;
    private final zzbrb zzg;
    private final zzbqo zzh;
    private boolean zzi;
    private int zzj;
    private long zzl;
    private int zzb = -1;
    private zzazc zzd = zzaza.zza;
    private final zzbmu zze = new zzbmu(this, null);
    private final ByteBuffer zzf = ByteBuffer.allocate(5);
    private int zzk = -1;

    public zzbmw(zzbmv zzbmvVar, zzbrb zzbrbVar, zzbqo zzbqoVar) {
        this.zza = zzbmvVar;
        this.zzg = zzbrbVar;
        this.zzh = zzbqoVar;
    }

    private final void zzi(boolean z, boolean z2) {
        zzbra zzbraVar = this.zzc;
        this.zzc = null;
        this.zza.zzi(zzbraVar, z, z2, this.zzj);
        this.zzj = 0;
    }

    private final void zzj(zzbms zzbmsVar, boolean z) {
        int iZza = zzbms.zza(zzbmsVar);
        int i = this.zzb;
        if (i >= 0 && iZza > i) {
            throw new zzbdq(zzbdo.zzj.zzg(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZza), Integer.valueOf(this.zzb))), null);
        }
        this.zzf.clear();
        this.zzf.put(z ? (byte) 1 : (byte) 0).putInt(iZza);
        zzbrb zzbrbVar = this.zzg;
        ByteBuffer byteBuffer = this.zzf;
        zzbra zzbraVarZza = zzbrbVar.zza(5);
        zzbraVarZza.zzd(byteBuffer.array(), 0, byteBuffer.position());
        if (iZza == 0) {
            this.zzc = zzbraVarZza;
            return;
        }
        this.zza.zzi(zzbraVarZza, false, false, this.zzj - 1);
        this.zzj = 1;
        List list = zzbmsVar.zzb;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            this.zza.zzi((zzbra) list.get(i2), false, false, 0);
        }
        this.zzc = (zzbra) list.get(list.size() - 1);
        this.zzl = iZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            zzbra zzbraVar = this.zzc;
            if (zzbraVar != null && zzbraVar.zzb() == 0) {
                zzi(false, false);
            }
            if (this.zzc == null) {
                this.zzc = this.zzg.zza(i2);
            }
            int iMin = Math.min(i2, this.zzc.zzb());
            this.zzc.zzd(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbis
    public final /* synthetic */ zzbis zza(zzazc zzazcVar) {
        this.zzd = zzazcVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbis
    public final void zzb() {
        if (this.zzi) {
            return;
        }
        this.zzi = true;
        zzbra zzbraVar = this.zzc;
        if (zzbraVar != null && zzbraVar.zza() == 0) {
            this.zzc = null;
        }
        zzi(true, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbis
    public final void zzc() {
        zzbra zzbraVar = this.zzc;
        if (zzbraVar == null || zzbraVar.zza() <= 0) {
            return;
        }
        zzi(false, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbis
    public final void zzd(int i) {
        zzmt.zzp(this.zzb == -1, "max size already set");
        this.zzb = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzbis
    public final void zze(InputStream inputStream) {
        int iZza;
        if (this.zzi) {
            wtq0.m207906a("Framer already closed");
            return;
        }
        this.zzj++;
        int i = this.zzk + 1;
        this.zzk = i;
        this.zzl = 0L;
        this.zzh.zzi(i);
        zzazc zzazcVar = this.zzd;
        zzazb zzazbVar = zzaza.zza;
        zzbmr zzbmrVar = null;
        try {
            int iAvailable = inputStream.available();
            if (iAvailable != 0 && zzazcVar != zzazbVar) {
                zzbms zzbmsVar = new zzbms(this, zzbmrVar);
                try {
                    iZza = inputStream.zza(zzbmsVar);
                    zzbmsVar.close();
                    int i2 = this.zzb;
                    if (i2 >= 0 && iZza > i2) {
                        throw new zzbdq(zzbdo.zzj.zzg(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iZza), Integer.valueOf(this.zzb))), null);
                    }
                    zzj(zzbmsVar, true);
                } catch (Throwable th) {
                    zzbmsVar.close();
                    throw th;
                }
            } else if (iAvailable != -1) {
                this.zzl = iAvailable;
                int i3 = this.zzb;
                if (i3 >= 0 && iAvailable > i3) {
                    throw new zzbdq(zzbdo.zzj.zzg(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(this.zzb))), null);
                }
                this.zzf.clear();
                this.zzf.put((byte) 0).putInt(iAvailable);
                if (this.zzc == null) {
                    this.zzc = this.zzg.zza(this.zzf.position() + iAvailable);
                }
                zzk(this.zzf.array(), 0, this.zzf.position());
                iZza = inputStream.zza(this.zze);
            } else {
                zzbms zzbmsVar2 = new zzbms(this, zzbmrVar);
                iZza = inputStream.zza(zzbmsVar2);
                zzj(zzbmsVar2, false);
            }
            if (iAvailable != -1 && iZza != iAvailable) {
                throw new zzbdq(zzbdo.zzo.zzg(String.format("Message length inaccurate %s != %s", Integer.valueOf(iZza), Integer.valueOf(iAvailable))), null);
            }
            long j = iZza;
            this.zzh.zzk(j);
            this.zzh.zzl(this.zzl);
            this.zzh.zzj(this.zzk, this.zzl, j);
        } catch (zzbdq e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbdq(zzbdo.zzo.zzg("Failed to frame message").zzf(e2), null);
        } catch (RuntimeException e3) {
            throw new zzbdq(zzbdo.zzo.zzg("Failed to frame message").zzf(e3), null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbis
    public final boolean zzf() {
        return this.zzi;
    }
}
