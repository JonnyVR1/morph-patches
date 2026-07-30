package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p153l.iig0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbun implements zzbci {
    private static final ThreadLocal zza = new ThreadLocal();
    private final zzavn zzb;
    private final zzavf zzc;

    public zzbun(zzavf zzavfVar, int i) {
        zzmt.zzc(zzavfVar, "defaultInstance cannot be null");
        this.zzc = zzavfVar;
        this.zzb = zzavfVar.zzaz();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.libraries.places.internal.zzbci
    public final /* bridge */ /* synthetic */ InputStream zza(Object obj) {
        return new zzbum(obj, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.libraries.places.internal.zzavf, java.lang.Object] */
    @Override // com.google.android.libraries.places.internal.zzbci
    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        zzasq zzasqVarZzI;
        byte[] bArr;
        if (inputStream instanceof zzbum) {
            zzbum zzbumVar = (zzbum) inputStream;
            if (zzbumVar.zzc() == this.zzb) {
                try {
                    return zzbumVar.zzb();
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            if (inputStream instanceof zzbav) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.zzc;
                    }
                    zzasqVarZzI = null;
                } else {
                    ThreadLocal threadLocal = zza;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = iAvailable;
                    while (i > 0) {
                        int i2 = inputStream.read(bArr, iAvailable - i, i);
                        if (i2 == -1) {
                            break;
                        }
                        i -= i2;
                    }
                    if (i != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i));
                    }
                    zzasqVarZzI = zzasq.zzJ(bArr, 0, iAvailable);
                }
            } else {
                zzasqVarZzI = null;
            }
            if (zzasqVarZzI == null) {
                zzasqVarZzI = zzasq.zzI(inputStream, 4096);
            }
            zzasqVarZzI.zzG(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            try {
                ?? Zza = this.zzb.zza(zzasqVarZzI, zzbuo.zza);
                try {
                    zzasqVarZzI.zzz(0);
                    return Zza;
                } catch (zzauf e) {
                    e.zzh(Zza);
                    throw e;
                }
            } catch (zzauf e2) {
                throw new zzbdq(zzbdo.zzo.zzg("Invalid protobuf byte sequence").zzf(e2), null);
            }
        } catch (IOException e3) {
            iig0.m140070a(e3);
            return null;
        }
    }
}
