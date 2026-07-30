package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(@Nullable Throwable th) {
        super(th);
    }

    public DecoderException(String str, @Nullable Throwable th) {
        super(str, th);
    }
}
