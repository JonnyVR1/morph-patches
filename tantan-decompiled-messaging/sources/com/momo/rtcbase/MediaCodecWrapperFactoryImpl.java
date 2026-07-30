package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // com.momo.rtcbase.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }
    }

    @Override // com.momo.rtcbase.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
