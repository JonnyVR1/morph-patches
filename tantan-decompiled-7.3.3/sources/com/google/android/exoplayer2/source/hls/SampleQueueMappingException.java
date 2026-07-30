package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
