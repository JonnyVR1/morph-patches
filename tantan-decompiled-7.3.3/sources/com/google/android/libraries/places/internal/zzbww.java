package com.google.android.libraries.places.internal;

import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbww {
    @NotNull
    public static final String zza(@NotNull byte[] bArr) {
        bArr.getClass();
        return new String(bArr, Charsets.UTF_8);
    }

    @NotNull
    public static final byte[] zzb(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        return bytes;
    }
}
