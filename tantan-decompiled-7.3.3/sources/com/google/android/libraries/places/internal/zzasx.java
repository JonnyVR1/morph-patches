package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzasx extends zzarz {
    private static final Logger zza = Logger.getLogger(zzasx.class.getName());
    private static final boolean zzb = zzawx.zzx();
    public static final /* synthetic */ int zzf = 0;
    zzasy zze;

    public /* synthetic */ zzasx(zzasw zzaswVar) {
    }

    public static int zzA(String str) {
        int length;
        try {
            length = zzaxc.zzc(str);
        } catch (zzaxb unused) {
            length = str.getBytes(zzaud.zzb).length;
        }
        return zzB(length) + length;
    }

    public static int zzB(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzC(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzasx zzD(byte[] bArr, int i, int i2) {
        return new zzast(bArr, i, i2);
    }

    @Deprecated
    public static int zzy(int i, zzavf zzavfVar, zzavt zzavtVar) {
        int iZzB = zzB(i << 3);
        return iZzB + iZzB + ((zzart) zzavfVar).zzak(zzavtVar);
    }

    public static int zzz(zzavf zzavfVar, zzavt zzavtVar) {
        int iZzak = ((zzart) zzavfVar).zzak(zzavtVar);
        return zzB(iZzak) + iZzak;
    }

    public final void zzE() {
        if (zzb() == 0) {
            return;
        }
        wtq0.m207906a("Did not write as much data as expected.");
    }

    public final void zzF(String str, zzaxb zzaxbVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaxbVar);
        byte[] bytes = str.getBytes(zzaud.zzb);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzasu(e);
        }
    }

    public abstract void zzJ() throws IOException;

    public abstract void zzK(byte b) throws IOException;

    public abstract void zzL(int i, boolean z) throws IOException;

    public abstract void zzM(int i, zzask zzaskVar) throws IOException;

    @Override // com.google.android.libraries.places.internal.zzarz
    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzavf zzavfVar, zzavt zzavtVar) throws IOException;

    public abstract void zzo(int i, zzavf zzavfVar) throws IOException;

    public abstract void zzp(int i, zzask zzaskVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i, int i2) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j) throws IOException;

    public abstract void zzw(long j) throws IOException;

    private zzasx() {
        throw null;
    }
}
