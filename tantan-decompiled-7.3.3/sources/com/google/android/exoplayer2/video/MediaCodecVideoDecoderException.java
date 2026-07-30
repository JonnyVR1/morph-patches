package com.google.android.exoplayer2.video;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.mediacodec.C1908d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaCodecVideoDecoderException extends MediaCodecDecoderException {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public MediaCodecVideoDecoderException(Throwable th, @Nullable C1908d c1908d, @Nullable Surface surface) {
        super(th, c1908d);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
