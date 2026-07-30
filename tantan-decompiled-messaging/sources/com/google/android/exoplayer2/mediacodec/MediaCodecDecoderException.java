package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.decoder.DecoderException;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class MediaCodecDecoderException extends DecoderException {

    @Nullable
    public final C1885d codecInfo;

    @Nullable
    public final String diagnosticInfo;

    public MediaCodecDecoderException(Throwable th, @Nullable C1885d c1885d) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(c1885d == null ? null : c1885d.f7899a);
        super(sb.toString(), th);
        this.codecInfo = c1885d;
        this.diagnosticInfo = vck0.f180948a >= 21 ? getDiagnosticInfoV21(th) : null;
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
