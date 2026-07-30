package io.agora.base.internal.video;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.agora.base.VideoFrame;

/* JADX INFO: loaded from: classes2.dex */
public interface IHandlerReplaceable {
    VideoFrame.Buffer applyNewI420Handler(@NonNull Handler handler, @NonNull YuvConverter yuvConverter);

    @Nullable
    Handler getToI420Handler();

    @Nullable
    YuvConverter getYuvConverter();
}
