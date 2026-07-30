package com.momo.mcamera.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import p149l.jfd0;
import p149l.upk0;
import p149l.zyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MediaEncoder implements Runnable {
    private static final boolean DEBUG = false;
    protected static final int MSG_FRAME_AVAILABLE = 1;
    protected static final int MSG_STOP_RECORDING = 9;
    private static final String TAG = "MediaEncoder";
    protected static final int TIMEOUT_USEC = 10000;
    private MediaCodec.BufferInfo mBufferInfo;
    protected volatile boolean mIsCapturing;
    protected boolean mIsEOS;
    protected final MediaEncoderListener mListener;
    public MediaCodec mMediaCodec;
    protected boolean mMuxerStarted;
    private int mRequestDrain;
    protected volatile boolean mRequestStop;
    protected final Object mSync;
    protected int mTrackIndex;
    protected final WeakReference<MediaMuxerWrapper> mWeakMuxer;
    private long prevOutputPTSUs;
    public ProcessSurface processSurface;
    int recordNumber;
    private long startTime;

    public interface MediaEncoderListener {
        void onFail(Exception exc);

        void onPrepared(MediaEncoder mediaEncoder);

        void onStopped(MediaEncoder mediaEncoder);
    }

    @TargetApi(16)
    public MediaEncoder(MediaMuxerWrapper mediaMuxerWrapper, MediaEncoderListener mediaEncoderListener) {
        Object obj = new Object();
        this.mSync = obj;
        this.prevOutputPTSUs = 0L;
        if (mediaEncoderListener == null) {
            jfd0.m141176a("MediaEncoderListener is null");
            throw null;
        }
        if (mediaMuxerWrapper == null) {
            jfd0.m141176a("MediaMuxerWrapper is null");
            throw null;
        }
        this.mWeakMuxer = new WeakReference<>(mediaMuxerWrapper);
        mediaMuxerWrapper.addEncoder(this);
        this.mListener = mediaEncoderListener;
        synchronized (obj) {
            this.mBufferInfo = new MediaCodec.BufferInfo();
            new Thread(this, getClass().getSimpleName()).start();
            try {
                obj.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    @TargetApi(16)
    public void drain() {
        MediaMuxerWrapper mediaMuxerWrapper;
        if (this.mMediaCodec == null || (mediaMuxerWrapper = this.mWeakMuxer.get()) == null) {
            return;
        }
        while (true) {
            int i = 0;
            while (this.mIsCapturing) {
                int iDequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, 10000L);
                if (iDequeueOutputBuffer == -1) {
                    if (!this.mIsEOS && (i = i + 1) > 5) {
                        return;
                    }
                } else if (iDequeueOutputBuffer == -3) {
                    this.mMediaCodec.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    if (this.mMuxerStarted) {
                        upk0.m194883a("format changed twice");
                        return;
                    }
                    this.mTrackIndex = mediaMuxerWrapper.addTrack(this.mMediaCodec.getOutputFormat());
                    this.mMuxerStarted = true;
                    if (mediaMuxerWrapper.start()) {
                        continue;
                    } else {
                        synchronized (mediaMuxerWrapper) {
                            while (!mediaMuxerWrapper.isStarted()) {
                                try {
                                    mediaMuxerWrapper.wait(100L);
                                } catch (InterruptedException unused) {
                                    return;
                                }
                            }
                        }
                    }
                } else if (iDequeueOutputBuffer >= 0) {
                    ByteBuffer byteBuffer = this.mMediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
                    if (byteBuffer == null) {
                        this.processSurface.isRenderDrawing.set(false);
                        zyp.m220936a("encoderOutputBuffer ", iDequeueOutputBuffer, " was null");
                        return;
                    }
                    MediaCodec.BufferInfo bufferInfo = this.mBufferInfo;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!this.mMuxerStarted) {
                            upk0.m194883a("drain:muxer hasn't started");
                            return;
                        }
                        if (this.processSurface.getCurrentBuffer() != null) {
                            this.mBufferInfo.presentationTimeUs = getPTSUs(this.processSurface.getCurrentBuffer());
                            mediaMuxerWrapper.writeSampleData(this.mTrackIndex, byteBuffer, this.mBufferInfo);
                            this.recordNumber++;
                            ProcessSurface processSurface = this.processSurface;
                            if (processSurface != null) {
                                processSurface.isRenderDrawing.set(false);
                            }
                            this.prevOutputPTSUs = this.mBufferInfo.presentationTimeUs;
                            i = 0;
                        } else {
                            ProcessSurface processSurface2 = this.processSurface;
                            if (processSurface2 != null) {
                                processSurface2.isRenderDrawing.set(false);
                                MDLog.m7389d("MediaEncoder", "MediaEncoder drain:recorder isDrawing" + this.processSurface.isRenderDrawing);
                            }
                        }
                    }
                    this.mMediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.mBufferInfo.flags & 4) != 0) {
                        this.mIsCapturing = false;
                        return;
                    }
                } else {
                    continue;
                }
            }
            return;
        }
    }

    @TargetApi(16)
    public void encode(ByteBuffer byteBuffer, int i, long j) {
        if (this.mIsCapturing) {
            ByteBuffer[] inputBuffers = this.mMediaCodec.getInputBuffers();
            while (this.mIsCapturing) {
                int iDequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(10000L);
                if (iDequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer2 = inputBuffers[iDequeueInputBuffer];
                    byteBuffer2.clear();
                    if (byteBuffer != null) {
                        byteBuffer2.put(byteBuffer);
                    }
                    if (i > 0) {
                        this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, i, j, 0);
                        return;
                    } else {
                        this.mIsEOS = true;
                        this.mMediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, j, 4);
                        return;
                    }
                }
            }
        }
    }

    public boolean frameAvailableSoon() {
        synchronized (this.mSync) {
            try {
                if (this.mIsCapturing && !this.mRequestStop) {
                    this.mRequestDrain++;
                    this.mSync.notifyAll();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getOutputPath() {
        MediaMuxerWrapper mediaMuxerWrapper = this.mWeakMuxer.get();
        if (mediaMuxerWrapper != null) {
            return mediaMuxerWrapper.getOutputPath();
        }
        return null;
    }

    @TargetApi(16)
    public long getPTSUs(MediaCodec.BufferInfo bufferInfo) {
        if (bufferInfo == null) {
            long jNanoTime = System.nanoTime() / 1000;
            long j = this.prevOutputPTSUs;
            return jNanoTime < j ? (j - jNanoTime) + jNanoTime : jNanoTime;
        }
        if (this.prevOutputPTSUs != 0) {
            return this.startTime + this.processSurface.getCurrentBuffer().presentationTimeUs;
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        this.startTime = jNanoTime2;
        return jNanoTime2;
    }

    public abstract void prepare(ProcessSurface processSurface, MediaFormat mediaFormat) throws IOException;

    @TargetApi(16)
    public void release() {
        this.mIsCapturing = false;
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                this.mMediaCodec.release();
                this.mMediaCodec = null;
            } catch (Exception unused) {
            }
        }
        if (this.mMuxerStarted) {
            WeakReference<MediaMuxerWrapper> weakReference = this.mWeakMuxer;
            MediaMuxerWrapper mediaMuxerWrapper = weakReference != null ? weakReference.get() : null;
            if (mediaMuxerWrapper != null) {
                try {
                    mediaMuxerWrapper.stop();
                    this.mListener.onStopped(this);
                } catch (Exception unused2) {
                    this.mListener.onStopped(this);
                }
            }
        }
        this.mBufferInfo = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        boolean z2;
        synchronized (this.mSync) {
            this.mRequestStop = false;
            this.mRequestDrain = 0;
            this.mSync.notify();
        }
        while (true) {
            synchronized (this.mSync) {
                try {
                    z = this.mRequestStop;
                    int i = this.mRequestDrain;
                    z2 = i > 0;
                    if (z2) {
                        this.mRequestDrain = i - 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                break;
            }
            if (z2) {
                drain();
            } else {
                synchronized (this.mSync) {
                    try {
                        try {
                            this.mSync.wait();
                        } catch (InterruptedException unused) {
                            synchronized (this.mSync) {
                                this.mRequestStop = true;
                                this.mIsCapturing = false;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.mSync) {
                this.mRequestStop = true;
                this.mIsCapturing = false;
            }
        }
        signalEndOfInputStream();
        release();
        synchronized (this.mSync) {
            this.mRequestStop = true;
            this.mIsCapturing = false;
        }
    }

    public void signalEndOfInputStream() {
        encode(null, 0, getPTSUs(this.processSurface.getCurrentBuffer()));
    }

    public void startRecording() {
        synchronized (this.mSync) {
            this.mIsCapturing = true;
            this.mRequestStop = false;
            this.mSync.notifyAll();
        }
    }

    public void stopRecording() {
        synchronized (this.mSync) {
            try {
                if (this.mIsCapturing && !this.mRequestStop) {
                    this.mRequestStop = true;
                    this.mSync.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
