package com.google.android.libraries.places.internal;

import java.util.logging.Logger;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
final /* synthetic */ class zzbwi {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger("okio.Okio");

    public static final boolean zza(@NotNull AssertionError assertionError) {
        String message;
        assertionError.getClass();
        return (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !StringsKt.m94303P(message, "getsockname failed", false, 2, null)) ? false : true;
    }
}
