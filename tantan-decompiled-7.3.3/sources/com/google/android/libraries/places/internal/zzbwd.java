package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface zzbwd extends ReadableByteChannel, zzbws {
    void zzD(long j) throws IOException;

    void zzF(long j) throws IOException;

    byte zzc() throws IOException;

    int zze() throws IOException;

    @NotNull
    zzbwf zzy(long j) throws IOException;
}
