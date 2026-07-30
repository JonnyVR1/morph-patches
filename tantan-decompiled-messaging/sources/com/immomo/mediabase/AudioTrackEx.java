package com.immomo.mediabase;

import android.media.AudioTrack;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class AudioTrackEx {
    private static final String TAG = "AudioTrackEx_HUOHL";
    private int mSampleRate = 44100;
    private int mChannel = 12;
    private int mSapleBits = 3;
    private int mStreamType = 3;
    private int mBufferSizeInBytes = 0;
    private AudioTrack mAudioTrack = null;

    public void flush() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.flush();
        }
    }

    public int getMinBufferSize() {
        return AudioTrack.getMinBufferSize(this.mSampleRate, this.mChannel, this.mSapleBits);
    }

    public int initAudioTrackEx(MediaFormat mediaFormat, int i) {
        if (mediaFormat == null) {
            return -1;
        }
        try {
            this.mSampleRate = mediaFormat.getInteger("sample-rate");
            this.mChannel = mediaFormat.getInteger("channel-count");
            int integer = mediaFormat.getInteger("pcm-encoding");
            if (integer == 3) {
                this.mSapleBits = 8;
            } else if (integer == 2) {
                this.mSapleBits = 16;
            } else {
                if (integer != 4) {
                    return -2;
                }
                this.mSapleBits = 32;
            }
            return initAudioTrackEx(this.mSampleRate, this.mChannel, this.mSapleBits, i);
        } catch (Exception unused) {
            return -3;
        }
    }

    public void pausePlay() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.pause();
        }
    }

    public void release() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.mAudioTrack.release();
        }
    }

    public void setBufferSize(int i) {
        int minBufferSize = getMinBufferSize();
        if (i < minBufferSize) {
            this.mBufferSizeInBytes = minBufferSize * 2;
        } else {
            this.mBufferSizeInBytes = minBufferSize;
        }
    }

    public int startPlay() {
        if (this.mAudioTrack == null) {
            this.mAudioTrack = new AudioTrack(this.mStreamType, this.mSampleRate, this.mChannel, this.mSapleBits, this.mBufferSizeInBytes, 1);
        }
        this.mAudioTrack.play();
        return 0;
    }

    public void stopPlay() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
        }
    }

    public int writeSample(ByteBuffer byteBuffer, boolean z) {
        if (this.mAudioTrack == null) {
            return -1;
        }
        int iLimit = byteBuffer.limit();
        return iLimit - this.mAudioTrack.write(byteBuffer, iLimit, !z ? 1 : 0);
    }

    public int writeSample(byte[] bArr, int i, int i2) {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null) {
            return -1;
        }
        return i2 - audioTrack.write(bArr, i, i2);
    }

    public int writeSample(byte[] bArr, int i) {
        return writeSample(bArr, 0, i);
    }

    public int initAudioTrackEx(int i, int i2, int i3, int i4) {
        this.mSampleRate = i;
        if (i3 == 8) {
            this.mSapleBits = 3;
        } else if (i3 == 16) {
            this.mSapleBits = 2;
        } else if (i3 == 32) {
            this.mSapleBits = 4;
        }
        if (i2 == 1) {
            this.mChannel = 4;
        } else if (i2 == 2) {
            this.mChannel = 12;
        }
        this.mBufferSizeInBytes = getMinBufferSize() * 2;
        return 0;
    }
}
