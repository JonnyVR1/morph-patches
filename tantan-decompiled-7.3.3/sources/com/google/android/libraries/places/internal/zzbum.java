package com.google.android.libraries.places.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbum extends InputStream implements zzazr, zzbav {
    private zzavf zza;
    private final zzavn zzb;
    private ByteArrayInputStream zzc;

    public zzbum(zzavf zzavfVar, zzavn zzavnVar) {
        this.zza = zzavfVar;
        this.zzb = zzavnVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        zzavf zzavfVar = this.zza;
        if (zzavfVar != null) {
            return zzavfVar.zzaq();
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        zzavf zzavfVar = this.zza;
        if (zzavfVar != null) {
            int iZzaq = zzavfVar.zzaq();
            if (iZzaq == 0) {
                this.zza = null;
                this.zzc = null;
                return -1;
            }
            if (i2 >= iZzaq) {
                zzasx zzasxVarZzD = zzasx.zzD(bArr, i, iZzaq);
                this.zza.zzaK(zzasxVarZzD);
                zzasxVarZzD.zzE();
                this.zza = null;
                this.zzc = null;
                return iZzaq;
            }
            this.zzc = new ByteArrayInputStream(this.zza.zzao());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzazr
    public final int zza(OutputStream outputStream) throws IOException {
        zzavf zzavfVar = this.zza;
        if (zzavfVar != null) {
            int iZzaq = zzavfVar.zzaq();
            this.zza.zzan(outputStream);
            this.zza = null;
            return iZzaq;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream == null) {
            return 0;
        }
        zzmt.zzc(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.zzc = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public final zzavf zzb() {
        zzavf zzavfVar = this.zza;
        if (zzavfVar != null) {
            return zzavfVar;
        }
        wtq0.m207906a("message not available");
        return null;
    }

    public final zzavn zzc() {
        return this.zzb;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzavf zzavfVar = this.zza;
        if (zzavfVar != null) {
            this.zzc = new ByteArrayInputStream(zzavfVar.zzao());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
