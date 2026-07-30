package com.momo.xengine.media;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes8.dex */
public class MediacodecEncoderWrapper implements IMediacodecSurfaceEncoder {
    private MediaCodec videoEncoder = null;
    private MediaCodec audioEncoder = null;
    private Surface surface = null;
    private VideoEncodecThread encodeThread = null;
    private Thread audioThread = null;
    private Mp4MuxerWrapper mediaMuxer = null;
    private EncodeConfig encodeConfig = null;
    private int audioTrackIndex = -1;
    private int mSampleCnt = 0;
    private boolean isStopped = false;
    private LinkedBlockingDeque<AudioSamples> mAudioDataQueue = new LinkedBlockingDeque<>();

    public class AudioRunnable implements Runnable {
        public AudioRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int iFeedData;
            if (MediacodecEncoderWrapper.this.audioEncoder == null || MediacodecEncoderWrapper.this.mediaMuxer == null) {
                return;
            }
            while (true) {
                boolean z = MediacodecEncoderWrapper.this.isStopped;
                MediacodecEncoderWrapper mediacodecEncoderWrapper = MediacodecEncoderWrapper.this;
                if (z) {
                    mediacodecEncoderWrapper.audioEncoder.stop();
                    MediacodecEncoderWrapper.this.audioEncoder.release();
                    MediacodecEncoderWrapper.this.audioEncoder = null;
                    return;
                }
                if (!mediacodecEncoderWrapper.mAudioDataQueue.isEmpty() && (iFeedData = MediacodecEncoderWrapper.this.feedData()) >= 0) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int iDequeueOutputBuffer = MediacodecEncoderWrapper.this.audioEncoder.dequeueOutputBuffer(bufferInfo, 200L);
                    if (iDequeueOutputBuffer == -2) {
                        MediacodecEncoderWrapper mediacodecEncoderWrapper2 = MediacodecEncoderWrapper.this;
                        mediacodecEncoderWrapper2.audioTrackIndex = mediacodecEncoderWrapper2.mediaMuxer.addMediaTrack(MediacodecEncoderWrapper.this.audioEncoder.getOutputFormat(), 1);
                        MediacodecEncoderWrapper.this.mediaMuxer.startMuxing();
                    } else {
                        while (iDequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = MediacodecEncoderWrapper.this.audioEncoder.getOutputBuffer(iDequeueOutputBuffer);
                            outputBuffer.get(new byte[bufferInfo.size]);
                            bufferInfo.presentationTimeUs = (long) (((MediacodecEncoderWrapper.this.mSampleCnt * 1.0f) / MediacodecEncoderWrapper.this.encodeConfig.getAudioSamplesRate()) * 1000000.0f);
                            MediacodecEncoderWrapper.access$612(MediacodecEncoderWrapper.this, iFeedData);
                            MediacodecEncoderWrapper.this.mediaMuxer.writeSampleData(MediacodecEncoderWrapper.this.audioTrackIndex, outputBuffer, bufferInfo);
                            MediacodecEncoderWrapper.this.audioEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            iDequeueOutputBuffer = MediacodecEncoderWrapper.this.audioEncoder.dequeueOutputBuffer(bufferInfo, 200L);
                        }
                    }
                }
            }
        }
    }

    public static class VideoEncodecThread extends Thread {
        private EncodeConfig config;
        private MediaCodec encoder;
        private boolean isExit = false;
        private Mp4MuxerWrapper mediaMuxer;
        private int videoTrackIndex;

        public VideoEncodecThread(MediaCodec mediaCodec, EncodeConfig encodeConfig, Mp4MuxerWrapper mp4MuxerWrapper) {
            this.encoder = mediaCodec;
            this.config = encodeConfig;
            this.mediaMuxer = mp4MuxerWrapper;
        }

        public void exit() {
            this.isExit = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            MediaCodec mediaCodec = this.encoder;
            if (mediaCodec == null || this.mediaMuxer == null) {
                return;
            }
            this.videoTrackIndex = -1;
            this.isExit = false;
            mediaCodec.start();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            EncodeTimestampCalculator encodeTimestampCalculator = new EncodeTimestampCalculator();
            while (!this.isExit) {
                int iDequeueOutputBuffer = this.encoder.dequeueOutputBuffer(bufferInfo, 10000L);
                if (iDequeueOutputBuffer == -2) {
                    this.videoTrackIndex = this.mediaMuxer.addMediaTrack(this.encoder.getOutputFormat(), 2);
                    this.mediaMuxer.startMuxing();
                    while (!this.mediaMuxer.isStarting() && !this.mediaMuxer.isStarting()) {
                    }
                } else {
                    while (iDequeueOutputBuffer >= 0) {
                        ByteBuffer outputBuffer = this.encoder.getOutputBuffer(iDequeueOutputBuffer);
                        outputBuffer.get(new byte[bufferInfo.size]);
                        if (!encodeTimestampCalculator.isInit()) {
                            encodeTimestampCalculator.init(bufferInfo.presentationTimeUs);
                        }
                        if (encodeTimestampCalculator.isInit()) {
                            bufferInfo.presentationTimeUs = encodeTimestampCalculator.calculateTimestamp(bufferInfo.presentationTimeUs, this.config.getSpeed());
                            this.mediaMuxer.writeSampleData(this.videoTrackIndex, outputBuffer, bufferInfo);
                            this.encoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            iDequeueOutputBuffer = this.encoder.dequeueOutputBuffer(bufferInfo, 10000L);
                        }
                    }
                }
            }
            encodeTimestampCalculator.release();
            this.config = null;
            this.encoder.stop();
            this.encoder.release();
            this.encoder = null;
            this.mediaMuxer = null;
        }
    }

    public static /* synthetic */ int access$612(MediacodecEncoderWrapper mediacodecEncoderWrapper, int i) {
        int i2 = mediacodecEncoderWrapper.mSampleCnt + i;
        mediacodecEncoderWrapper.mSampleCnt = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int feedData() throws InterruptedException {
        synchronized (this) {
            AudioSamples audioSamplesTake = null;
            try {
                if (!this.mAudioDataQueue.isEmpty()) {
                    audioSamplesTake = this.mAudioDataQueue.take();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (audioSamplesTake != null && audioSamplesTake.getData() != null) {
                int length = audioSamplesTake.getData().length;
                int sampleBit = this.encodeConfig.getAudioFormat().getSampleBit();
                int iDequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer inputBuffer = this.audioEncoder.getInputBuffer(iDequeueInputBuffer);
                    inputBuffer.clear();
                    inputBuffer.put(audioSamplesTake.getData());
                    this.audioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, length, audioSamplesTake.getTimestamp(), 0);
                    return length / sampleBit;
                }
            }
            return -1;
        }
    }

    private boolean isFinished() {
        return this.mAudioDataQueue.isEmpty();
    }

    private boolean waitFinish() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!isFinished()) {
            if (System.currentTimeMillis() - jCurrentTimeMillis > 10000) {
                return false;
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public Surface getEncoderSurface() {
        MediaCodec mediaCodec = this.videoEncoder;
        if (mediaCodec == null) {
            return null;
        }
        Surface surfaceCreateInputSurface = mediaCodec.createInputSurface();
        this.surface = surfaceCreateInputSurface;
        return surfaceCreateInputSurface;
    }

    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public boolean init(EncodeConfig encodeConfig) {
        this.encodeConfig = encodeConfig;
        try {
            Mp4MuxerWrapper mp4MuxerWrapper = new Mp4MuxerWrapper(encodeConfig.getPath(), 3);
            this.mediaMuxer = mp4MuxerWrapper;
            mp4MuxerWrapper.setVideoOrientation((int) encodeConfig.getRotation());
            this.videoEncoder = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, encodeConfig.getSize().getWidth(), encodeConfig.getSize().getHeight());
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", encodeConfig.getFrameRate());
            mediaFormatCreateVideoFormat.setInteger("bitrate", (int) encodeConfig.getBitrate());
            this.videoEncoder.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.audioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", encodeConfig.getAudioSamplesRate(), encodeConfig.getAudioChannels().getChannelNum());
            mediaFormatCreateAudioFormat.setInteger("bitrate", encodeConfig.getAudioBitrate());
            mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
            mediaFormatCreateAudioFormat.setInteger("max-input-size", encodeConfig.getAudioChannels().getChannelNum() * 1024 * encodeConfig.getAudioFormat().getSampleBit());
            this.audioEncoder.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            this.videoEncoder = null;
            this.audioEncoder = null;
            return false;
        }
    }

    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public void putAudioData(AudioSamples audioSamples) {
        this.mAudioDataQueue.offer(audioSamples);
    }

    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public void release() {
    }

    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public boolean start() {
        synchronized (this) {
            try {
                if (this.videoEncoder == null || this.surface == null || this.encodeConfig == null) {
                    return false;
                }
                this.encodeThread = new VideoEncodecThread(this.videoEncoder, this.encodeConfig, this.mediaMuxer);
                this.audioThread = new Thread(new AudioRunnable());
                try {
                    this.audioEncoder.start();
                    this.encodeThread.start();
                    this.audioThread.start();
                    return true;
                } catch (Exception unused) {
                    this.audioEncoder = null;
                    this.encodeThread.exit();
                    this.encodeThread = null;
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025 A[Catch: all -> 0x0019, TryCatch #0 {, blocks: (B:6:0x000e, B:9:0x0013, B:15:0x001f, B:14:0x001c, B:16:0x0021, B:18:0x0025, B:19:0x002a), top: B:23:0x000e, inners: #1 }] */
    @Override // com.momo.xengine.media.IMediacodecSurfaceEncoder
    public void stop() {
        Mp4MuxerWrapper mp4MuxerWrapper;
        waitFinish();
        VideoEncodecThread videoEncodecThread = this.encodeThread;
        if (videoEncodecThread != null) {
            videoEncodecThread.exit();
            this.encodeThread = null;
        }
        synchronized (this) {
            Thread thread = this.audioThread;
            if (thread != null) {
                try {
                    this.isStopped = true;
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.audioThread = null;
                mp4MuxerWrapper = this.mediaMuxer;
                if (mp4MuxerWrapper != null) {
                    mp4MuxerWrapper.stopMuxing();
                    this.mediaMuxer = null;
                }
            } else {
                mp4MuxerWrapper = this.mediaMuxer;
                if (mp4MuxerWrapper != null) {
                    mp4MuxerWrapper.stopMuxing();
                    this.mediaMuxer = null;
                }
            }
            throw th;
        }
    }
}
