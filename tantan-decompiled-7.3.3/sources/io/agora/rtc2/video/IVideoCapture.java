package io.agora.rtc2.video;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.CalledByNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface IVideoCapture {

    @VisibleForTesting
    public interface Events {
        void onAvailable(int i);

        void onError(int i, String str);

        void onFrameCaptured(VideoFrame videoFrame);

        void onFrameDropped(int i);

        void onI420FrameAvailable(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, int i5, int i6, long j, VideoFrameMetaInfo videoFrameMetaInfo);

        void onStarted();
    }

    @CalledByNative
    boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat);

    @CalledByNative
    void deallocate();

    @CalledByNative
    void dispose();

    @CalledByNative
    VideoCaptureFormat getCaptureFormat();

    @VisibleForTesting
    void setEventsCallback(Events events);

    @CalledByNative
    boolean startCaptureMaybeAsync();

    @CalledByNative
    void stopCaptureAndBlockUntilStopped();
}
