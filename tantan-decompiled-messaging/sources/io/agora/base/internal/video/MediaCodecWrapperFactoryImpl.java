package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @Nullable
        public MediaCodecInfo.CodecCapabilities getCodecInfo(String str) {
            MediaCodecInfo codecInfo = this.mediaCodec.getCodecInfo();
            if (codecInfo != null) {
                return codecInfo.getCapabilitiesForType(str);
            }
            return null;
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        @TargetApi(18)
        public void signalEndOfInputStream() {
            this.mediaCodec.signalEndOfInputStream();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // io.agora.base.internal.video.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    @Override // io.agora.base.internal.video.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
