package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbwo {

    @NotNull
    public static final zzbwo zza = new zzbwo();

    @NotNull
    private static final zzbwn zzb = new zzbwn(new byte[0], 0, 0, false, false);
    private static final int zzc;

    @NotNull
    private static final AtomicReference[] zzd;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        zzc = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        zzd = atomicReferenceArr;
    }

    private zzbwo() {
    }

    @JvmStatic
    @NotNull
    public static final zzbwn zza() {
        AtomicReference atomicReferenceZzc = zzc();
        zzbwn zzbwnVar = zzb;
        zzbwn zzbwnVar2 = (zzbwn) atomicReferenceZzc.getAndSet(zzbwnVar);
        if (zzbwnVar2 == zzbwnVar) {
            return new zzbwn();
        }
        if (zzbwnVar2 == null) {
            atomicReferenceZzc.set(null);
            return new zzbwn();
        }
        atomicReferenceZzc.set(zzbwnVar2.zzg);
        zzbwnVar2.zzg = null;
        zzbwnVar2.zzd = 0;
        return zzbwnVar2;
    }

    @JvmStatic
    public static final void zzb(@NotNull zzbwn zzbwnVar) {
        zzbwnVar.getClass();
        if (zzbwnVar.zzg != null || zzbwnVar.zzh != null) {
            wg3.m206174a("Failed requirement.");
            return;
        }
        if (zzbwnVar.zze) {
            return;
        }
        AtomicReference atomicReferenceZzc = zzc();
        zzbwn zzbwnVar2 = zzb;
        zzbwn zzbwnVar3 = (zzbwn) atomicReferenceZzc.getAndSet(zzbwnVar2);
        if (zzbwnVar3 != zzbwnVar2) {
            int i = zzbwnVar3 != null ? zzbwnVar3.zzd : 0;
            if (i >= 65536) {
                atomicReferenceZzc.set(zzbwnVar3);
                return;
            }
            zzbwnVar.zzg = zzbwnVar3;
            zzbwnVar.zzc = 0;
            zzbwnVar.zzd = i + 8192;
            atomicReferenceZzc.set(zzbwnVar);
        }
    }

    private static final AtomicReference zzc() {
        return zzd[(int) (Thread.currentThread().getId() & (((long) zzc) - 1))];
    }
}
