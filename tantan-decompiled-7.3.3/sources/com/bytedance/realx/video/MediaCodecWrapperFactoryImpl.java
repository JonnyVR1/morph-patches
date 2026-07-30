package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {
    @Override // com.bytedance.realx.video.MediaCodecWrapperFactory
    public MediaCodecWrapper createByCodecName(String str) throws IOException {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @TargetApi(18)
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public int dequeueInputBuffer(long j) {
            return this.mediaCodec.dequeueInputBuffer(j);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @RequiresApi(api = 21)
        public ByteBuffer getInputBuffer(int i) {
            return this.mediaCodec.getInputBuffer(i);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public ByteBuffer[] getInputBuffers() {
            return this.mediaCodec.getInputBuffers();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @RequiresApi(api = 21)
        public ByteBuffer getOutputBuffer(int i) {
            return this.mediaCodec.getOutputBuffer(i);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public ByteBuffer[] getOutputBuffers() {
            return this.mediaCodec.getOutputBuffers();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaCodec getRealCodec() {
            return this.mediaCodec;
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
            this.mediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void release() {
            this.mediaCodec.release();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i, boolean z) {
            this.mediaCodec.releaseOutputBuffer(i, z);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void setCallback(MediaCodec.Callback callback, Handler handler) {
            MediaCodec mediaCodec = this.mediaCodec;
            if (handler == null) {
                mediaCodec.setCallback(callback);
            } else {
                mediaCodec.setCallback(callback, handler);
            }
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void setOutputSurface(Surface surface) {
            this.mediaCodec.setOutputSurface(surface);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        @TargetApi(19)
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void start() {
            this.mediaCodec.start();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public void releaseOutputBuffer(int i, long j) {
            this.mediaCodec.releaseOutputBuffer(i, j);
        }

        @Override // com.bytedance.realx.video.MediaCodecWrapper
        public MediaFormat getOutputFormat(int i) {
            return this.mediaCodec.getOutputFormat(i);
        }
    }
}
