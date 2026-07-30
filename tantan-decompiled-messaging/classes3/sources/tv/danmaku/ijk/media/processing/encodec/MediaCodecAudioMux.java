package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import l.n8c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecAudioMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f11779v;

    /* JADX INFO: renamed from: w */
    private long f11780w;

    /* JADX INFO: renamed from: x */
    private long f11781x;

    /* JADX INFO: renamed from: y */
    private long f11782y;

    public MediaCodecAudioMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f11779v = "MediaCodecAudioMux";
        this.f11780w = 0L;
        this.f11781x = 0L;
        this.f11782y = 0L;
    }

    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo10601c() throws IOException {
        try {
            if (this.f11793f == null) {
                while (!Thread.interrupted() && !this.f11795h) {
                    n8c.c("MediaCodecAudioMux", "dequeueOutputBuffer :");
                    this.f11794g = this.f11790c.dequeueOutputBuffer(this.f11791d, 500000L);
                    n8c.c("MediaCodecAudioMux", "dequeueOutputBuffer :" + this.f11794g);
                    int i = this.f11794g;
                    if (i >= 0) {
                        ByteBuffer byteBuffer = this.f11792e[i];
                        this.f11793f = byteBuffer;
                        byteBuffer.position(this.f11791d.offset);
                        long j = this.f11781x;
                        MediaCodec.BufferInfo bufferInfo = this.f11791d;
                        this.f11781x = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f11780w != 0) {
                                break;
                            }
                            this.f11780w = System.currentTimeMillis();
                            break;
                        }
                        n8c.c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f11794g);
                        int iPosition = this.f11791d.size - this.f11793f.position();
                        n8c.c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f11794g + ";len:" + iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f11793f.get(bArr);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iPosition);
                        byteBufferAllocate.put(bArr);
                        byteBufferAllocate.rewind();
                        synchronized (this.f11805r) {
                            try {
                                SinkBase sinkBase = this.f11804q;
                                if (sinkBase != null) {
                                    sinkBase.writeAudioExtradata(byteBufferAllocate, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f11790c.releaseOutputBuffer(this.f11794g, false);
                        this.f11793f = null;
                        return;
                    }
                    if (i == -3) {
                        this.f11792e = this.f11790c.getOutputBuffers();
                        n8c.e("MediaCodecAudioMux", "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f11790c.getOutputFormat();
                        this.f11789b = outputFormat;
                        n8c.e("MediaCodecAudioMux", outputFormat.toString());
                    } else if (i == -1) {
                        n8c.c("MediaCodecAudioMux", "No buffer available...");
                    } else {
                        n8c.c("MediaCodecAudioMux", "Message: " + this.f11794g);
                    }
                }
            }
            ByteBuffer byteBuffer2 = this.f11793f;
            if (byteBuffer2 == null) {
                return;
            }
            int iPosition2 = this.f11791d.size - byteBuffer2.position();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition2);
            byte[] bArr2 = new byte[iPosition2];
            this.f11793f.get(bArr2, 0, iPosition2);
            byteBufferAllocate2.put(bArr2);
            byteBufferAllocate2.rewind();
            if (this.f11793f.position() >= this.f11791d.size) {
                this.f11790c.releaseOutputBuffer(this.f11794g, false);
                this.f11793f = null;
            }
            n8c.a("MediaCodecAudioMux", "audio mux !" + byteBufferAllocate2 + "presentationTimeUs" + this.f11791d.presentationTimeUs);
            m10604p(byteBufferAllocate2, iPosition2, this.f11791d.presentationTimeUs, 0);
        } catch (RuntimeException e) {
            n8c.c("MediaCodecAudioMux", "MediaCodecAudioMux error !");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public long m10602n() {
        return this.f11781x;
    }

    /* JADX INFO: renamed from: o */
    public long m10603o() {
        return this.f11780w;
    }

    /* JADX INFO: renamed from: p */
    public void m10604p(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f11782y == 0) {
            this.f11782y = j;
        }
        synchronized (this.f11805r) {
            this.f11804q.writeAudioPacket((j - this.f11782y) / 1000, byteBuffer, i, i2);
        }
    }
}
