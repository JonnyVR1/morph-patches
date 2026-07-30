package com.p074ss.bytertc.audio.device.hwearback;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;

/* JADX INFO: loaded from: classes11.dex */
public class SlientPlayer {
    private static final String TAG = "SlientPlayer";
    private PlaybackThread mPlaybackThread;
    private AudioTrack mTrack = null;
    private int mSampleRate = 44100;
    private int mChannelConfig = 12;
    private int mAudioFormat = 2;
    private boolean mRequireDeepBuffer = false;
    private boolean mIsPlaying = false;
    private int mTrackBufSize = AudioTrack.getMinBufferSize(44100, 12, 2);

    public class PlaybackThread extends Thread {
        private boolean isStop = false;

        public PlaybackThread() {
        }

        public synchronized void closeThread() {
            try {
                notify();
                this.isStop = true;
                interrupt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioTrack audioTrack;
            int unused = SlientPlayer.this.mSampleRate;
            int unused2 = SlientPlayer.this.mChannelConfig;
            int unused3 = SlientPlayer.this.mAudioFormat;
            int unused4 = SlientPlayer.this.mTrackBufSize;
            boolean unused5 = SlientPlayer.this.mRequireDeepBuffer;
            try {
                if (!SlientPlayer.this.mRequireDeepBuffer || Build.VERSION.SDK_INT < 26) {
                    audioTrack = new AudioTrack(3, SlientPlayer.this.mSampleRate, SlientPlayer.this.mChannelConfig, SlientPlayer.this.mAudioFormat, SlientPlayer.this.mTrackBufSize, 1);
                } else {
                    audioTrack = new AudioTrack.Builder().setAudioFormat(new AudioFormat.Builder().setSampleRate(SlientPlayer.this.mSampleRate).setChannelMask(SlientPlayer.this.mChannelConfig).setEncoding(SlientPlayer.this.mAudioFormat).build()).setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build()).setBufferSizeInBytes(SlientPlayer.this.mTrackBufSize).setPerformanceMode(2).build();
                }
                audioTrack.play();
                int i = SlientPlayer.this.mTrackBufSize;
                byte[] bArr = new byte[i];
                while (!this.isStop && !isInterrupted()) {
                    try {
                        audioTrack.write(bArr, 0, i);
                    } catch (Exception unused6) {
                    }
                }
                audioTrack.stop();
                audioTrack.flush();
                audioTrack.release();
            } catch (Exception e) {
                RXLogging.m5746w(SlientPlayer.TAG, "SlientPlayer createAudioTrack has exception: " + Log.getStackTraceString(e));
            }
        }
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public void play() {
        if (!this.mIsPlaying && this.mPlaybackThread == null) {
            this.mIsPlaying = true;
            PlaybackThread playbackThread = new PlaybackThread();
            this.mPlaybackThread = playbackThread;
            playbackThread.start();
        }
    }

    public void setRequireDeepBuffer(boolean z) {
        this.mRequireDeepBuffer = z;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public void stop() {
        PlaybackThread playbackThread = this.mPlaybackThread;
        if (playbackThread != null) {
            this.mIsPlaying = false;
            playbackThread.closeThread();
            this.mPlaybackThread = null;
        }
    }
}
