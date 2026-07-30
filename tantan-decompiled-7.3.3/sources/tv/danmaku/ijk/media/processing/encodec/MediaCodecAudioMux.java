package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecAudioMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f209076v;

    /* JADX INFO: renamed from: w */
    private long f209077w;

    /* JADX INFO: renamed from: x */
    private long f209078x;

    /* JADX INFO: renamed from: y */
    private long f209079y;

    public MediaCodecAudioMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f209076v = "MediaCodecAudioMux";
        this.f209077w = 0L;
        this.f209078x = 0L;
        this.f209079y = 0L;
    }

    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo223376c() throws IOException {
        try {
            if (this.f209090f == null) {
                while (!Thread.interrupted() && !this.f209092h) {
                    t9c.m189745c("MediaCodecAudioMux", "dequeueOutputBuffer :");
                    this.f209091g = this.f209087c.dequeueOutputBuffer(this.f209088d, 500000L);
                    t9c.m189745c("MediaCodecAudioMux", "dequeueOutputBuffer :" + this.f209091g);
                    int i = this.f209091g;
                    if (i >= 0) {
                        ByteBuffer byteBuffer = this.f209089e[i];
                        this.f209090f = byteBuffer;
                        byteBuffer.position(this.f209088d.offset);
                        long j = this.f209078x;
                        MediaCodec.BufferInfo bufferInfo = this.f209088d;
                        this.f209078x = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f209077w != 0) {
                                break;
                            }
                            this.f209077w = System.currentTimeMillis();
                            break;
                        }
                        t9c.m189745c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f209091g);
                        int iPosition = this.f209088d.size - this.f209090f.position();
                        t9c.m189745c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f209091g + ";len:" + iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f209090f.get(bArr);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iPosition);
                        byteBufferAllocate.put(bArr);
                        byteBufferAllocate.rewind();
                        synchronized (this.f209102r) {
                            try {
                                SinkBase sinkBase = this.f209101q;
                                if (sinkBase != null) {
                                    sinkBase.writeAudioExtradata(byteBufferAllocate, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f209087c.releaseOutputBuffer(this.f209091g, false);
                        this.f209090f = null;
                        return;
                    }
                    if (i == -3) {
                        this.f209089e = this.f209087c.getOutputBuffers();
                        t9c.m189747e("MediaCodecAudioMux", "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f209087c.getOutputFormat();
                        this.f209086b = outputFormat;
                        t9c.m189747e("MediaCodecAudioMux", outputFormat.toString());
                    } else if (i == -1) {
                        t9c.m189745c("MediaCodecAudioMux", "No buffer available...");
                    } else {
                        t9c.m189745c("MediaCodecAudioMux", "Message: " + this.f209091g);
                    }
                }
            }
            ByteBuffer byteBuffer2 = this.f209090f;
            if (byteBuffer2 == null) {
                return;
            }
            int iPosition2 = this.f209088d.size - byteBuffer2.position();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition2);
            byte[] bArr2 = new byte[iPosition2];
            this.f209090f.get(bArr2, 0, iPosition2);
            byteBufferAllocate2.put(bArr2);
            byteBufferAllocate2.rewind();
            if (this.f209090f.position() >= this.f209088d.size) {
                this.f209087c.releaseOutputBuffer(this.f209091g, false);
                this.f209090f = null;
            }
            t9c.m189743a("MediaCodecAudioMux", "audio mux !" + byteBufferAllocate2 + "presentationTimeUs" + this.f209088d.presentationTimeUs);
            m223379p(byteBufferAllocate2, iPosition2, this.f209088d.presentationTimeUs, 0);
        } catch (RuntimeException e) {
            t9c.m189745c("MediaCodecAudioMux", "MediaCodecAudioMux error !");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public long m223377n() {
        return this.f209078x;
    }

    /* JADX INFO: renamed from: o */
    public long m223378o() {
        return this.f209077w;
    }

    /* JADX INFO: renamed from: p */
    public void m223379p(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f209079y == 0) {
            this.f209079y = j;
        }
        synchronized (this.f209102r) {
            this.f209101q.writeAudioPacket((j - this.f209079y) / 1000, byteBuffer, i, i2);
        }
    }
}
