package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import p149l.n8c;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecAudioMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f208154v;

    /* JADX INFO: renamed from: w */
    private long f208155w;

    /* JADX INFO: renamed from: x */
    private long f208156x;

    /* JADX INFO: renamed from: y */
    private long f208157y;

    public MediaCodecAudioMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f208154v = "MediaCodecAudioMux";
        this.f208155w = 0L;
        this.f208156x = 0L;
        this.f208157y = 0L;
    }

    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo222130c() throws IOException {
        try {
            if (this.f208168f == null) {
                while (!Thread.interrupted() && !this.f208170h) {
                    n8c.m158485c("MediaCodecAudioMux", "dequeueOutputBuffer :");
                    this.f208169g = this.f208165c.dequeueOutputBuffer(this.f208166d, 500000L);
                    n8c.m158485c("MediaCodecAudioMux", "dequeueOutputBuffer :" + this.f208169g);
                    int i = this.f208169g;
                    if (i >= 0) {
                        ByteBuffer byteBuffer = this.f208167e[i];
                        this.f208168f = byteBuffer;
                        byteBuffer.position(this.f208166d.offset);
                        long j = this.f208156x;
                        MediaCodec.BufferInfo bufferInfo = this.f208166d;
                        this.f208156x = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f208155w != 0) {
                                break;
                            }
                            this.f208155w = System.currentTimeMillis();
                            break;
                        }
                        n8c.m158485c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f208169g);
                        int iPosition = this.f208166d.size - this.f208168f.position();
                        n8c.m158485c("MediaCodecAudioMux", "encoderAudio metadata : " + this.f208169g + ";len:" + iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f208168f.get(bArr);
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iPosition);
                        byteBufferAllocate.put(bArr);
                        byteBufferAllocate.rewind();
                        synchronized (this.f208180r) {
                            try {
                                SinkBase sinkBase = this.f208179q;
                                if (sinkBase != null) {
                                    sinkBase.writeAudioExtradata(byteBufferAllocate, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f208165c.releaseOutputBuffer(this.f208169g, false);
                        this.f208168f = null;
                        return;
                    }
                    if (i == -3) {
                        this.f208167e = this.f208165c.getOutputBuffers();
                        n8c.m158487e("MediaCodecAudioMux", "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.f208165c.getOutputFormat();
                        this.f208164b = outputFormat;
                        n8c.m158487e("MediaCodecAudioMux", outputFormat.toString());
                    } else if (i == -1) {
                        n8c.m158485c("MediaCodecAudioMux", "No buffer available...");
                    } else {
                        n8c.m158485c("MediaCodecAudioMux", "Message: " + this.f208169g);
                    }
                }
            }
            ByteBuffer byteBuffer2 = this.f208168f;
            if (byteBuffer2 == null) {
                return;
            }
            int iPosition2 = this.f208166d.size - byteBuffer2.position();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition2);
            byte[] bArr2 = new byte[iPosition2];
            this.f208168f.get(bArr2, 0, iPosition2);
            byteBufferAllocate2.put(bArr2);
            byteBufferAllocate2.rewind();
            if (this.f208168f.position() >= this.f208166d.size) {
                this.f208165c.releaseOutputBuffer(this.f208169g, false);
                this.f208168f = null;
            }
            n8c.m158483a("MediaCodecAudioMux", "audio mux !" + byteBufferAllocate2 + "presentationTimeUs" + this.f208166d.presentationTimeUs);
            m222133p(byteBufferAllocate2, iPosition2, this.f208166d.presentationTimeUs, 0);
        } catch (RuntimeException e) {
            n8c.m158485c("MediaCodecAudioMux", "MediaCodecAudioMux error !");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public long m222131n() {
        return this.f208156x;
    }

    /* JADX INFO: renamed from: o */
    public long m222132o() {
        return this.f208155w;
    }

    /* JADX INFO: renamed from: p */
    public void m222133p(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f208157y == 0) {
            this.f208157y = j;
        }
        synchronized (this.f208180r) {
            this.f208179q.writeAudioPacket((j - this.f208157y) / 1000, byteBuffer, i, i2);
        }
    }
}
