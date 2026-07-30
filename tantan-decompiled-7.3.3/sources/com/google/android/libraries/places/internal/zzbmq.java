package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbmq implements Closeable, zzbgj {
    private zzbmm zza;
    private int zzb;
    private final zzbqo zzc;
    private final zzbqz zzd;
    private zzazo zze;
    private boolean zzg;
    private zzbge zzh;
    private long zzj;
    private int zzm;
    private int zzp = 1;
    private int zzf = 5;
    private zzbge zzi = new zzbge();
    private boolean zzk = false;
    private int zzl = -1;
    private boolean zzn = false;
    private volatile boolean zzo = false;

    public zzbmq(zzbmm zzbmmVar, zzazo zzazoVar, int i, zzbqo zzbqoVar, zzbqz zzbqzVar) {
        this.zza = zzbmmVar;
        this.zze = zzazoVar;
        this.zzb = i;
        this.zzc = zzbqoVar;
        this.zzd = zzbqzVar;
    }

    private final void zzh() {
        int i;
        InputStream zzbnwVar;
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        loop0: while (this.zzj > 0) {
            try {
                try {
                    if (this.zzh == null) {
                        this.zzh = new zzbge();
                    }
                    i = 0;
                    while (true) {
                        try {
                            int iZzf = this.zzf - this.zzh.zzf();
                            if (iZzf > 0) {
                                if (this.zzi.zzf() == 0) {
                                    if (i <= 0) {
                                        break loop0;
                                    }
                                    this.zza.zzE(i);
                                    if (this.zzp != 2) {
                                        break loop0;
                                    }
                                    this.zzc.zzh(i);
                                    this.zzm += i;
                                    break loop0;
                                }
                                int iMin = Math.min(iZzf, this.zzi.zzf());
                                i += iMin;
                                this.zzh.zzh(this.zzi.zzg(iMin));
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i > 0) {
                                this.zza.zzE(i);
                                if (this.zzp == 2) {
                                    this.zzc.zzh(i);
                                    this.zzm += i;
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0) {
                        this.zza.zzE(i);
                        if (this.zzp == 2) {
                            this.zzc.zzh(i);
                            this.zzm += i;
                        }
                    }
                    int i2 = this.zzp;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        int iZze = this.zzh.zze();
                        if ((iZze & 254) != 0) {
                            throw new zzbdq(zzbdo.zzo.zzg("gRPC frame header malformed: reserved bits not zero"), null);
                        }
                        this.zzg = 1 == (iZze & 1);
                        zzbge zzbgeVar = this.zzh;
                        zzbgeVar.zza(4);
                        int iZze2 = zzbgeVar.zze() | (zzbgeVar.zze() << 24) | (zzbgeVar.zze() << 16) | (zzbgeVar.zze() << 8);
                        this.zzf = iZze2;
                        if (iZze2 < 0 || iZze2 > this.zzb) {
                            throw new zzbdq(zzbdo.zzj.zzg(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.zzb), Integer.valueOf(this.zzf))), null);
                        }
                        int i4 = this.zzl + 1;
                        this.zzl = i4;
                        this.zzc.zze(i4);
                        this.zzd.zzc();
                        this.zzp = 2;
                    } else {
                        if (i3 != 1) {
                            throw new AssertionError("Invalid state: " + (i2 != 1 ? "BODY" : "HEADER"));
                        }
                        this.zzc.zzf(this.zzl, this.zzm, -1L);
                        this.zzm = 0;
                        if (this.zzg) {
                            zzazo zzazoVar = this.zze;
                            if (zzazoVar == zzaza.zza) {
                                throw new zzbdq(zzbdo.zzo.zzg("Can't decode compressed gRPC message as compression not configured"), null);
                            }
                            try {
                                zzbnwVar = new zzbmp(zzazoVar.zza(new zzbnw(this.zzh)), this.zzb, this.zzc);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } else {
                            this.zzc.zzg(this.zzh.zzf());
                            zzbnwVar = new zzbnw(this.zzh);
                        }
                        this.zzh = null;
                        this.zza.zzr(new zzbmo(zzbnwVar, null));
                        this.zzp = 1;
                        this.zzf = 5;
                        this.zzj--;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                }
            } catch (Throwable th3) {
                this.zzk = false;
                throw th3;
            }
        }
        if (this.zzn && zzi()) {
            close();
        }
        this.zzk = false;
    }

    private final boolean zzi() {
        return this.zzi.zzf() == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbgj
    public final void close() {
        if (zzg()) {
            return;
        }
        zzbge zzbgeVar = this.zzh;
        boolean z = false;
        if (zzbgeVar != null && zzbgeVar.zzf() > 0) {
            z = true;
        }
        try {
            zzbge zzbgeVar2 = this.zzi;
            if (zzbgeVar2 != null) {
                zzbgeVar2.close();
            }
            zzbge zzbgeVar3 = this.zzh;
            if (zzbgeVar3 != null) {
                zzbgeVar3.close();
            }
            this.zzi = null;
            this.zzh = null;
            this.zza.zze(z);
        } catch (Throwable th) {
            this.zzi = null;
            this.zzh = null;
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgj
    public final void zza() {
        if (zzg()) {
            return;
        }
        if (zzi()) {
            close();
        } else {
            this.zzn = true;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgj
    public final void zzb(zzbnv zzbnvVar) throws Throwable {
        boolean z = true;
        try {
            if (!zzg() && !this.zzn) {
                this.zzi.zzh(zzbnvVar);
                try {
                    zzh();
                    return;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        zzbnvVar.close();
                    }
                    throw th;
                }
            }
            zzbnvVar.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbgj
    public final void zzc(int i) {
        if (zzg()) {
            return;
        }
        this.zzj += 2;
        zzh();
    }

    @Override // com.google.android.libraries.places.internal.zzbgj
    public final void zzd(zzazo zzazoVar) {
        this.zze = zzazoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbgj
    public final void zze(int i) {
        this.zzb = i;
    }

    public final void zzf(zzbmm zzbmmVar) {
        this.zza = zzbmmVar;
    }

    public final boolean zzg() {
        return this.zzi == null;
    }
}
