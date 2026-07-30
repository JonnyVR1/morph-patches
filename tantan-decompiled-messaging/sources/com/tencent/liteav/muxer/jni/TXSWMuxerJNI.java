package com.tencent.liteav.muxer.jni;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXSWMuxerJNI {

    /* JADX INFO: renamed from: a */
    private long f59422a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f59423b = true;

    /* JADX INFO: renamed from: c */
    private volatile boolean f59424c;

    public static class AVOptions {
        public int videoWidth = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int videoHeight = 540;
        public int videoGOP = 12;
        public int audioSampleRate = 0;
        public int audioChannels = 0;
    }

    public TXSWMuxerJNI() {
        this.f59422a = -1L;
        this.f59422a = init();
    }

    private native long init();

    private native void release(long j);

    private native void setAVParams(long j, AVOptions aVOptions);

    private native void setAudioCSD(long j, byte[] bArr);

    private native void setDstPath(long j, String str);

    private native void setVideoCSD(long j, byte[] bArr, byte[] bArr2);

    private native int start(long j);

    private native int stop(long j);

    private native int writeFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, long j2);

    /* JADX INFO: renamed from: a */
    public int m83656a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (!this.f59423b) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f59424c) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        int iWriteFrame = writeFrame(this.f59422a, m83654b(byteBuffer, i3), i, i2, i3, i4, j);
        if (iWriteFrame != 0) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer write frame error!");
        }
        return iWriteFrame;
    }

    /* JADX INFO: renamed from: b */
    public int m83661b() {
        if (!this.f59423b) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f59424c) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        this.f59424c = false;
        int iStop = stop(this.f59422a);
        if (iStop != 0) {
            TXCLog.m82966e("TXSWMuxerJNI", "Stop Muxer Error!!!");
        }
        return iStop;
    }

    /* JADX INFO: renamed from: c */
    public void m83662c() {
        if (!this.f59423b) {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return;
        }
        release(this.f59422a);
        this.f59423b = false;
        this.f59424c = false;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m83654b(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m83658a(String str) {
        if (this.f59423b) {
            setDstPath(this.f59422a, str);
        } else {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83660a(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        if (this.f59423b) {
            setVideoCSD(this.f59422a, m83654b(byteBuffer, i), m83654b(byteBuffer2, i2));
        } else {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83659a(ByteBuffer byteBuffer, int i) {
        if (this.f59423b) {
            setAudioCSD(this.f59422a, m83654b(byteBuffer, i));
        } else {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83657a(AVOptions aVOptions) {
        if (this.f59423b) {
            setAVParams(this.f59422a, aVOptions);
        } else {
            TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public int m83655a() {
        if (this.f59423b) {
            int iStart = start(this.f59422a);
            if (iStart == 0) {
                this.f59424c = true;
                return iStart;
            }
            TXCLog.m82966e("TXSWMuxerJNI", "Start Muxer Error!!!");
            return iStart;
        }
        TXCLog.m82966e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }
}
