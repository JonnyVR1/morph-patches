package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;
import p149l.y9g0;

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
        y9g0.m213537a("Failed executing read operation");
        return 0;
    }

    private final int zzn(zzbgc zzbgcVar, int i, Object obj, int i2) {
        try {
            return zzm(zzbgcVar, i, obj, i2);
        } catch (IOException e) {
            y9g0.m213537a(e);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.libraries.places.internal.zzbnv zzg(int r7) {
        /*
            r6 = this;
            if (r7 > 0) goto L7
            com.google.android.libraries.places.internal.zzbnv r6 = com.google.android.libraries.places.internal.zzbny.zza()
            return r6
        L7:
            r6.zza(r7)
            int r0 = r6.zzh
            int r0 = r0 - r7
            r6.zzh = r0
            r0 = 0
            r1 = r0
        L11:
            java.util.Deque r2 = r6.zzf
            java.lang.Object r2 = r2.peek()
            com.google.android.libraries.places.internal.zzbnv r2 = (com.google.android.libraries.places.internal.zzbnv) r2
            int r3 = r2.zzf()
            if (r3 <= r7) goto L25
            com.google.android.libraries.places.internal.zzbnv r7 = r2.zzg(r7)
            r2 = 0
            goto L3d
        L25:
            boolean r4 = r6.zzj
            if (r4 == 0) goto L31
            com.google.android.libraries.places.internal.zzbnv r2 = r2.zzg(r3)
            r6.zzo()
            goto L39
        L31:
            java.util.Deque r2 = r6.zzf
            java.lang.Object r2 = r2.poll()
            com.google.android.libraries.places.internal.zzbnv r2 = (com.google.android.libraries.places.internal.zzbnv) r2
        L39:
            int r7 = r7 - r3
            r5 = r2
            r2 = r7
            r7 = r5
        L3d:
            if (r0 != 0) goto L41
            r0 = r7
            goto L60
        L41:
            if (r1 != 0) goto L5d
            com.google.android.libraries.places.internal.zzbge r1 = new com.google.android.libraries.places.internal.zzbge
            r3 = 2
            if (r2 != 0) goto L49
            goto L56
        L49:
            java.util.Deque r4 = r6.zzf
            int r4 = r4.size()
            int r4 = r4 + r3
            r3 = 16
            int r3 = java.lang.Math.min(r4, r3)
        L56:
            r1.<init>(r3)
            r1.zzh(r0)
            r0 = r1
        L5d:
            r1.zzh(r7)
        L60:
            if (r2 > 0) goto L63
            return r0
        L63:
            r7 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbge.zzg(int):com.google.android.libraries.places.internal.zzbnv");
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
