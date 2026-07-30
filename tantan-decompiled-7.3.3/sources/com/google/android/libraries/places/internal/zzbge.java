package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import p153l.gig0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbge extends zzbeg {
    private static final zzbgc zza = new zzbfx();
    private static final zzbgc zzb = new zzbfy();
    private static final zzbgc zzc = new zzbfz();
    private static final zzbgc zzd = new zzbga();
    private static final zzbgd zze = new zzbgb();
    private final Deque zzf;
    private Deque zzg;
    private int zzh;
    private final Queue zzi;
    private boolean zzj;

    public zzbge() {
        this.zzi = new ArrayDeque(2);
        this.zzf = new ArrayDeque();
    }

    private final int zzm(zzbgd zzbgdVar, int i, Object obj, int i2) throws IOException {
        zza(i);
        if (!this.zzf.isEmpty()) {
            zzp();
        }
        while (i > 0 && !this.zzf.isEmpty()) {
            zzbnv zzbnvVar = (zzbnv) this.zzf.peek();
            int iMin = Math.min(i, zzbnvVar.zzf());
            i2 = zzbgdVar.zza(zzbnvVar, iMin, obj, i2);
            i -= iMin;
            this.zzh -= iMin;
            zzp();
        }
        if (i <= 0) {
            return i2;
        }
        gig0.m130323a("Failed executing read operation");
        return 0;
    }

    private final int zzn(zzbgc zzbgcVar, int i, Object obj, int i2) {
        try {
            return zzm(zzbgcVar, i, obj, i2);
        } catch (IOException e) {
            gig0.m130323a(e);
            return 0;
        }
    }

    private final void zzo() {
        if (!this.zzj) {
            ((zzbnv) this.zzf.remove()).close();
            return;
        }
        this.zzg.add((zzbnv) this.zzf.remove());
        zzbnv zzbnvVar = (zzbnv) this.zzf.peek();
        if (zzbnvVar != null) {
            zzbnvVar.zzb();
        }
    }

    private final void zzp() {
        if (((zzbnv) this.zzf.peek()).zzf() == 0) {
            zzo();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (!this.zzf.isEmpty()) {
            ((zzbnv) this.zzf.remove()).close();
        }
        if (this.zzg != null) {
            while (!this.zzg.isEmpty()) {
                ((zzbnv) this.zzg.remove()).close();
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final void zzb() {
        if (this.zzg == null) {
            this.zzg = new ArrayDeque(Math.min(this.zzf.size(), 16));
        }
        while (!this.zzg.isEmpty()) {
            ((zzbnv) this.zzg.remove()).close();
        }
        this.zzj = true;
        zzbnv zzbnvVar = (zzbnv) this.zzf.peek();
        if (zzbnvVar != null) {
            zzbnvVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final void zzc() {
        if (!this.zzj) {
            throw new InvalidMarkException();
        }
        zzbnv zzbnvVar = (zzbnv) this.zzf.peek();
        if (zzbnvVar != null) {
            int iZzf = zzbnvVar.zzf();
            zzbnvVar.zzc();
            this.zzh += zzbnvVar.zzf() - iZzf;
        }
        while (true) {
            zzbnv zzbnvVar2 = (zzbnv) this.zzg.pollLast();
            if (zzbnvVar2 == null) {
                return;
            }
            zzbnvVar2.zzc();
            this.zzf.addFirst(zzbnvVar2);
            this.zzh += zzbnvVar2.zzf();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbeg, com.google.android.libraries.places.internal.zzbnv
    public final boolean zzd() {
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            if (!((zzbnv) it.next()).zzd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zze() {
        return zzn(zza, 1, null, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final int zzf() {
        return this.zzh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.libraries.places.internal.zzbnv] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.libraries.places.internal.zzbnv] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.libraries.places.internal.zzbge] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.libraries.places.internal.zzbge] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.google.android.libraries.places.internal.zzbnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbnv zzg(int i) {
        zzbnv zzbnvVarZzg;
        int i2;
        zzbnv zzbnvVarZzg2;
        ?? r1;
        ?? r0;
        if (i <= 0) {
            return zzbny.zza();
        }
        zza(i);
        this.zzh -= i;
        ?? r2 = 0;
        ?? zzbgeVar = 0;
        while (true) {
            zzbnv zzbnvVar = (zzbnv) this.zzf.peek();
            int iZzf = zzbnvVar.zzf();
            if (iZzf > i) {
                zzbnvVarZzg2 = zzbnvVar.zzg(i);
                i2 = 0;
            } else {
                if (this.zzj) {
                    zzbnvVarZzg = zzbnvVar.zzg(iZzf);
                    zzo();
                } else {
                    zzbnvVarZzg = (zzbnv) this.zzf.poll();
                }
                zzbnv zzbnvVar2 = zzbnvVarZzg;
                i2 = i - iZzf;
                zzbnvVarZzg2 = zzbnvVar2;
            }
            if (r2 == 0) {
                r0 = zzbnvVarZzg2;
            } else {
                if (zzbgeVar == 0) {
                    zzbgeVar = new zzbge(i2 != 0 ? Math.min(this.zzf.size() + 2, 16) : 2);
                    zzbgeVar.zzh(r2);
                    r2 = zzbgeVar;
                }
                zzbgeVar.zzh(zzbnvVarZzg2);
                r0 = r2;
                r1 = zzbgeVar;
            }
            if (i2 <= 0) {
                break;
            }
            r1 = zzbgeVar;
            i = i2;
            r2 = r0;
            zzbgeVar = r1;
        }
        return r0;
    }

    public final void zzh(zzbnv zzbnvVar) {
        boolean z = this.zzj && this.zzf.isEmpty();
        if (zzbnvVar instanceof zzbge) {
            zzbge zzbgeVar = (zzbge) zzbnvVar;
            while (!zzbgeVar.zzf.isEmpty()) {
                this.zzf.add((zzbnv) zzbgeVar.zzf.remove());
            }
            this.zzh += zzbgeVar.zzh;
            zzbgeVar.zzh = 0;
            zzbgeVar.close();
        } else {
            this.zzf.add(zzbnvVar);
            this.zzh += zzbnvVar.zzf();
        }
        if (z) {
            ((zzbnv) this.zzf.peek()).zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzi(ByteBuffer byteBuffer) {
        zzn(zzd, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzj(OutputStream outputStream, int i) throws IOException {
        zzm(zze, i, outputStream, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzk(byte[] bArr, int i, int i2) {
        zzn(zzc, i2, bArr, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbnv
    public final void zzl(int i) {
        zzn(zzb, i, null, 0);
    }

    public zzbge(int i) {
        this.zzi = new ArrayDeque(2);
        this.zzf = new ArrayDeque(i);
    }
}
