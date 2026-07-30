package com.tencent.liteav.muxer.jni;

import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class TXSWMuxerJNI {

    /* JADX INFO: renamed from: a */
    private long f60270a;

    /* JADX INFO: renamed from: b */
    private volatile boolean f60271b = true;

    /* JADX INFO: renamed from: c */
    private volatile boolean f60272c;

    public static class AVOptions {
        public int videoWidth = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        public int videoHeight = 540;
        public int videoGOP = 12;
        public int audioSampleRate = 0;
        public int audioChannels = 0;
    }

    public TXSWMuxerJNI() {
        this.f60270a = -1L;
        this.f60270a = init();
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
    public int m84839a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (!this.f60271b) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f60272c) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        int iWriteFrame = writeFrame(this.f60270a, m84837b(byteBuffer, i3), i, i2, i3, i4, j);
        if (iWriteFrame != 0) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer write frame error!");
        }
        return iWriteFrame;
    }

    /* JADX INFO: renamed from: b */
    public int m84844b() {
        if (!this.f60271b) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return -1;
        }
        if (!this.f60272c) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't start yet!");
            return -1;
        }
        this.f60272c = false;
        int iStop = stop(this.f60270a);
        if (iStop != 0) {
            TXCLog.m84149e("TXSWMuxerJNI", "Stop Muxer Error!!!");
        }
        return iStop;
    }

    /* JADX INFO: renamed from: c */
    public void m84845c() {
        if (!this.f60271b) {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
            return;
        }
        release(this.f60270a);
        this.f60271b = false;
        this.f60272c = false;
    }

    /* JADX INFO: renamed from: b */
    private byte[] m84837b(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public void m84841a(String str) {
        if (this.f60271b) {
            setDstPath(this.f60270a, str);
        } else {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84843a(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2) {
        if (this.f60271b) {
            setVideoCSD(this.f60270a, m84837b(byteBuffer, i), m84837b(byteBuffer2, i2));
        } else {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84842a(ByteBuffer byteBuffer, int i) {
        if (this.f60271b) {
            setAudioCSD(this.f60270a, m84837b(byteBuffer, i));
        } else {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84840a(AVOptions aVOptions) {
        if (this.f60271b) {
            setAVParams(this.f60270a, aVOptions);
        } else {
            TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
        }
    }

    /* JADX INFO: renamed from: a */
    public int m84838a() {
        if (this.f60271b) {
            int iStart = start(this.f60270a);
            if (iStart == 0) {
                this.f60272c = true;
                return iStart;
            }
            TXCLog.m84149e("TXSWMuxerJNI", "Start Muxer Error!!!");
            return iStart;
        }
        TXCLog.m84149e("TXSWMuxerJNI", "Muxer isn't init yet!");
        return -1;
    }
}
