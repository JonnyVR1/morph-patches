package com.immomo.mediabase;

import android.media.AudioTrack;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioPlayer {
    private static int STATUS_PAUSE = 2;
    private static int STATUS_RUNNING = 1;
    AudioAvailableBufferCountCallbackListener audioAvailableBufferCountCallbackListener;
    AudioOriginPtsCallbackListener audioOriginPtsCallbackListener;
    AudioPlayerThread audioPlayerThread;
    AudioPlayingPtsCallbackListener audioPlayingPtsCallbackListener;
    private List<AudioProcessor> mAudioProcessorList;
    private AudioTrack mAudioPlayer = null;
    private int mAudioSampleRate = 0;
    private int mAudioChannels = 0;
    private int mAudioBits = 0;
    private int mAudioBufSize = 0;
    private byte[] mAudioBuffer = null;
    private int mDataSizeInBuffer = 0;
    private boolean mIsPaused = false;
    private Object syncObj = new Object();
    private LinkedList<PacketData> mAudioDataList = new LinkedList<>();
    private volatile boolean mExit = false;
    private int mCurrentStatus = 0;
    private int mStreamType = 3;

    public interface AudioAvailableBufferCountCallbackListener {
        void onAudioAvailableBufferCount(int i);
    }

    public interface AudioOriginPtsCallbackListener {
        void onAudioOriginPosition(long j);
    }

    public class AudioPlayerThread extends Thread {
        public AudioPlayerThread() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!AudioPlayer.this.mExit) {
                int size = AudioPlayer.this.mAudioDataList.size();
                AudioPlayer audioPlayer = AudioPlayer.this;
                if (size > 0) {
                    try {
                        if (audioPlayer.mCurrentStatus == AudioPlayer.STATUS_RUNNING) {
                            synchronized (AudioPlayer.this.syncObj) {
                                try {
                                    if (AudioPlayer.this.mAudioDataList.size() > 0) {
                                        PacketData packetData = (PacketData) AudioPlayer.this.mAudioDataList.pollFirst();
                                        AudioOriginPtsCallbackListener audioOriginPtsCallbackListener = AudioPlayer.this.audioOriginPtsCallbackListener;
                                        if (audioOriginPtsCallbackListener != null) {
                                            audioOriginPtsCallbackListener.onAudioOriginPosition(packetData.getFrameBufferInfo().presentationTimeUs);
                                        }
                                        AudioPlayer audioPlayer2 = AudioPlayer.this;
                                        AudioAvailableBufferCountCallbackListener audioAvailableBufferCountCallbackListener = audioPlayer2.audioAvailableBufferCountCallbackListener;
                                        if (audioAvailableBufferCountCallbackListener != null) {
                                            audioAvailableBufferCountCallbackListener.onAudioAvailableBufferCount(audioPlayer2.mAudioDataList.size());
                                        }
                                        PacketData packetDataAudioProcess = AudioPlayer.this.audioProcess(packetData);
                                        if (packetDataAudioProcess != null) {
                                            long j = packetDataAudioProcess.getFrameBufferInfo().presentationTimeUs;
                                            AudioPlayingPtsCallbackListener audioPlayingPtsCallbackListener = AudioPlayer.this.audioPlayingPtsCallbackListener;
                                            if (audioPlayingPtsCallbackListener != null) {
                                                audioPlayingPtsCallbackListener.onAudioPlayingPosition(j);
                                            }
                                            AudioPlayer.this.writeAudio(packetDataAudioProcess.getFrameBuffer().array(), packetDataAudioProcess.getFrameBufferInfo().size);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            try {
                                Thread.sleep(5L);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else {
                    synchronized (audioPlayer.syncObj) {
                        try {
                            if (!AudioPlayer.this.mExit) {
                                AudioPlayer.this.syncObj.wait();
                            }
                        } catch (InterruptedException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public interface AudioPlayingPtsCallbackListener {
        void onAudioPlayingPosition(long j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized PacketData audioProcess(PacketData packetData) {
        if (packetData == null) {
            return null;
        }
        List<AudioProcessor> list = this.mAudioProcessorList;
        if (list != null) {
            Iterator<AudioProcessor> it = list.iterator();
            while (it.hasNext()) {
                packetData = it.next().processAudioFrame(packetData, packetData.getFrameBufferInfo().size, packetData.getFrameBufferInfo().presentationTimeUs);
                if (packetData == null) {
                    return packetData;
                }
            }
        }
        return packetData;
    }

    public synchronized void addAudioProcessList(List<AudioProcessor> list) {
        this.mAudioProcessorList = list;
    }

    public synchronized void addAudioProcessor(AudioProcessor audioProcessor) {
        if (audioProcessor == null) {
            return;
        }
        try {
            if (this.mAudioProcessorList == null) {
                this.mAudioProcessorList = new ArrayList();
            }
            this.mAudioProcessorList.add(audioProcessor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public int getMiniBufferSize() {
        return this.mAudioBufSize;
    }

    public void pause() {
        this.mCurrentStatus = STATUS_PAUSE;
        AudioTrack audioTrack = this.mAudioPlayer;
        if (audioTrack != null) {
            audioTrack.pause();
            this.mIsPaused = true;
        }
    }

    public boolean prepare(int i, int i2, int i3) {
        if (i != 0 && i2 != 0 && i3 != 0) {
            this.mAudioSampleRate = i;
            this.mAudioBits = i2;
            this.mAudioChannels = i3;
            int i4 = i3 == 2 ? 12 : 4;
            int i5 = i2 != 16 ? 3 : 2;
            try {
                this.mAudioBufSize = AudioTrack.getMinBufferSize(i, i4, i5);
                AudioTrack audioTrack = new AudioTrack(this.mStreamType, this.mAudioSampleRate, i4, i5, this.mAudioBufSize, 1);
                this.mAudioPlayer = audioTrack;
                audioTrack.play();
                this.mAudioBuffer = new byte[this.mAudioBufSize];
                AudioPlayerThread audioPlayerThread = new AudioPlayerThread();
                this.audioPlayerThread = audioPlayerThread;
                audioPlayerThread.start();
                this.mCurrentStatus = STATUS_RUNNING;
                return true;
            } catch (Exception unused) {
                this.mAudioPlayer = null;
            }
        }
        return false;
    }

    public void release() {
        this.mExit = true;
        if (this.audioPlayerThread != null) {
            try {
                synchronized (this.syncObj) {
                    this.syncObj.notifyAll();
                }
                this.audioPlayerThread.interrupt();
                this.audioPlayerThread.join(50L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AudioTrack audioTrack = this.mAudioPlayer;
        if (audioTrack != null) {
            audioTrack.release();
        }
        this.mAudioDataList.clear();
    }

    public void reset() {
        synchronized (this.syncObj) {
            try {
                this.mAudioDataList.clear();
                AudioTrack audioTrack = this.mAudioPlayer;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
                AudioPlayingPtsCallbackListener audioPlayingPtsCallbackListener = this.audioPlayingPtsCallbackListener;
                if (audioPlayingPtsCallbackListener != null) {
                    audioPlayingPtsCallbackListener.onAudioPlayingPosition(0L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resume() {
        AudioTrack audioTrack = this.mAudioPlayer;
        if (audioTrack != null) {
            if (this.mIsPaused) {
                audioTrack.play();
                this.mIsPaused = false;
            }
            this.mCurrentStatus = STATUS_RUNNING;
        }
    }

    public void setAudioOriginPtsCallbackListener(AudioOriginPtsCallbackListener audioOriginPtsCallbackListener) {
        this.audioOriginPtsCallbackListener = audioOriginPtsCallbackListener;
    }

    public void setAudioPlayingPtsCallbackListener(AudioPlayingPtsCallbackListener audioPlayingPtsCallbackListener) {
        this.audioPlayingPtsCallbackListener = audioPlayingPtsCallbackListener;
    }

    public void setAudioRestBufferCountCallbackListener(AudioAvailableBufferCountCallbackListener audioAvailableBufferCountCallbackListener) {
        this.audioAvailableBufferCountCallbackListener = audioAvailableBufferCountCallbackListener;
    }

    public void setStreamType(int i) {
        this.mStreamType = i;
    }

    public void writeAudio(ByteBuffer byteBuffer, int i) {
        if (this.mAudioPlayer == null || byteBuffer == null) {
            return;
        }
        int i2 = this.mAudioBufSize - this.mDataSizeInBuffer;
        while (i > 0) {
            byte[] bArr = this.mAudioBuffer;
            if (i >= i2) {
                byteBuffer.get(bArr, this.mDataSizeInBuffer, i2);
                i -= i2;
                this.mAudioPlayer.write(this.mAudioBuffer, 0, this.mDataSizeInBuffer);
                this.mDataSizeInBuffer = 0;
                i2 = this.mAudioBufSize;
            } else {
                byteBuffer.get(bArr, this.mDataSizeInBuffer, i);
                this.mDataSizeInBuffer += i;
                i = 0;
            }
        }
    }

    public void writeAudio(PacketData packetData) {
        synchronized (this.syncObj) {
            if (packetData != null) {
                try {
                    this.mAudioDataList.addLast(packetData);
                    this.syncObj.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void writeAudio(byte[] bArr, int i) {
        if (this.mAudioPlayer == null || bArr == null) {
            return;
        }
        int i2 = 0;
        do {
            int iWrite = this.mAudioPlayer.write(bArr, i2, i);
            if (iWrite >= 0) {
                i2 += iWrite;
                i -= iWrite;
            }
            if (iWrite < 0 || i <= 0) {
                return;
            }
        } while (!this.mIsPaused);
    }
}
