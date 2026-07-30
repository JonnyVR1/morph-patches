package com.google.android.libraries.places.internal;

import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwe {
    public /* synthetic */ zzbwe(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @JvmStatic
    @NotNull
    public static final zzbwf zza(@NotNull String str) {
        str.getClass();
        zzbwf zzbwfVar = new zzbwf(zzbww.zzb(str));
        zzbwfVar.zzi(str);
        return zzbwfVar;
    }

    @JvmStatic
    @NotNull
    public static final zzbwf zzb(@NotNull byte... bArr) {
        bArr.getClass();
        return new zzbwf(Arrays.copyOf(bArr, bArr.length));
    }

    private zzbwe() {
        throw null;
    }
}
