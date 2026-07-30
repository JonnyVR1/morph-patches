package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.C1885d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th, @Nullable C1885d c1885d, @Nullable Surface surface) {
        super(th, c1885d);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
