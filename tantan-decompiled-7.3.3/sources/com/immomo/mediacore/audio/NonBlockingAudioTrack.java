package com.immomo.mediacore.audio;

import android.media.AudioTrack;
import android.os.Process;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.fig0;

/* JADX INFO: loaded from: classes7.dex */
public class NonBlockingAudioTrack {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "NonBlockingAudioTrack";
    private AudioTrack mAudioTrack;
    private int mBufferSizeInFrames;
    private int mFrameSize;
    private int mSampleRate;
    private Thread mThread;
    private boolean mWriteMorePending = false;
    private int mNumFramesSubmitted = 0;
    private int mNumBytesQueued = 0;
    private boolean mThreadStarted = true;
    private boolean mIsPlayAudioTrack = false;
    private LinkedBlockingQueue<QueueElem> mQueue = new LinkedBlockingQueue<>();

    public class QueueElem {
        byte[] data;
        int offset;
        int size;

        public QueueElem() {
        }
    }

    public NonBlockingAudioTrack(int i, int i2) {
        int i3;
        this.mThread = null;
        if (i2 == 1) {
            i3 = 4;
        } else if (i2 == 2) {
            i3 = 12;
        } else {
            if (i2 != 6) {
                fig0.m125680a();
                throw null;
            }
            i3 = 252;
        }
        int i4 = i3;
        int minBufferSize = AudioTrack.getMinBufferSize(i, i4, 2) * 2;
        this.mAudioTrack = new AudioTrack(3, i, i4, 2, minBufferSize, 1);
        this.mSampleRate = i;
        int i5 = i2 * 2;
        this.mFrameSize = i5;
        this.mBufferSizeInFrames = minBufferSize / i5;
        this.mThread = new Thread(new Runnable() { // from class: com.immomo.mediacore.audio.NonBlockingAudioTrack.1
            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(-19);
                while (NonBlockingAudioTrack.this.mThreadStarted) {
                    NonBlockingAudioTrack.this.process();
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException unused) {
                        String unused2 = NonBlockingAudioTrack.TAG;
                    }
                }
            }
        }, "live-media-NBTrack");
    }

    private void cancelWriteMore() {
        this.mWriteMorePending = false;
    }

    private void playAudioTrack() {
        if (this.mIsPlayAudioTrack) {
            return;
        }
        try {
            this.mAudioTrack.play();
            this.mIsPlayAudioTrack = true;
        } catch (Exception unused) {
            this.mIsPlayAudioTrack = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void process() {
        this.mWriteMorePending = false;
        writeMore();
    }

    private void scheduleWriteMore() {
        if (this.mWriteMorePending) {
            return;
        }
        try {
            int playbackHeadPosition = ((this.mNumFramesSubmitted - this.mAudioTrack.getPlaybackHeadPosition()) * 1000) / this.mSampleRate;
        } catch (Exception unused) {
        }
        this.mWriteMorePending = true;
    }

    private void writeMore() {
        if (this.mQueue.isEmpty()) {
            return;
        }
        try {
            int playbackHeadPosition = (this.mBufferSizeInFrames - (this.mNumFramesSubmitted - this.mAudioTrack.getPlaybackHeadPosition())) * this.mFrameSize;
            while (playbackHeadPosition > 0) {
                QueueElem audioData = getAudioData();
                if (audioData == null) {
                    return;
                }
                int i = audioData.size;
                if (i > playbackHeadPosition) {
                    i = playbackHeadPosition;
                }
                int iWrite = this.mAudioTrack.write(audioData.data, audioData.offset, i);
                playAudioTrack();
                this.mNumFramesSubmitted += iWrite / this.mFrameSize;
                int i2 = audioData.size - i;
                audioData.size = i2;
                playbackHeadPosition -= i;
                this.mNumBytesQueued -= i;
                if (i2 != 0) {
                    audioData.offset += i;
                } else if (this.mQueue.isEmpty()) {
                    break;
                }
            }
        } catch (Exception unused) {
        }
        if (this.mQueue.isEmpty()) {
            return;
        }
        scheduleWriteMore();
    }

    public QueueElem getAudioData() {
        try {
            if (this.mQueue.size() > 0) {
                return this.mQueue.take();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public long getAudioTimeUs() {
        return (((long) this.mAudioTrack.getPlaybackHeadPosition()) * 1000000) / ((long) this.mSampleRate);
    }

    public int getNumBytesQueued() {
        return this.mNumBytesQueued;
    }

    public int getPlayState() {
        return this.mAudioTrack.getPlayState();
    }

    public void pause() {
        cancelWriteMore();
        this.mAudioTrack.pause();
    }

    public void play() {
        this.mThread.start();
        playAudioTrack();
    }

    public void release() {
        cancelWriteMore();
        stop();
        this.mThreadStarted = false;
        this.mAudioTrack.release();
        this.mAudioTrack = null;
    }

    public void stop() {
        cancelWriteMore();
        this.mThreadStarted = false;
        try {
            this.mAudioTrack.stop();
        } catch (Exception unused) {
        }
        this.mNumFramesSubmitted = 0;
        this.mQueue.clear();
        this.mNumBytesQueued = 0;
    }

    public void write(byte[] bArr, int i) {
        QueueElem queueElem = new QueueElem();
        queueElem.data = bArr;
        queueElem.offset = 0;
        queueElem.size = i;
        this.mNumBytesQueued += i;
        if (this.mQueue.size() > 10) {
            this.mQueue.clear();
        }
        this.mQueue.offer(queueElem);
    }
}
