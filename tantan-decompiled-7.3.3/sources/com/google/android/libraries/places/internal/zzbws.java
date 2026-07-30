package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface zzbws extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long zza(@NotNull zzbwb zzbwbVar, long j) throws IOException;
}
