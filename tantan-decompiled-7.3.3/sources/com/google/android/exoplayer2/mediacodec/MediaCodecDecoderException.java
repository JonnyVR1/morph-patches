package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import p153l.bmk0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final C1908d codecInfo;

    @Nullable
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable th, @Nullable C1908d c1908d) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c1908d == null ? null : c1908d.f7936a);
        super(sb.toString(), th);
        this.codecInfo = c1908d;
        this.diagnosticInfo = bmk0.f77313a >= 21 ? getDiagnosticInfoV21(th) : null;
    }

    @Nullable
    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
