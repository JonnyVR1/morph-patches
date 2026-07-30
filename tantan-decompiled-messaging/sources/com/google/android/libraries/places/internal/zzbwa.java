package com.google.android.libraries.places.internal;

import java.io.Closeable;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwa implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("not attached to a buffer");
    }
}
