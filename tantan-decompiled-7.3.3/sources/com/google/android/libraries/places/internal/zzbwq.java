package com.google.android.libraries.places.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface zzbwq extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    void zzn(@NotNull zzbwb zzbwbVar, long j) throws IOException;
}
