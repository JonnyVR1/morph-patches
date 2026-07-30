package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import p149l.n8c;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecVideoMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f208158v;

    /* JADX INFO: renamed from: w */
    private long f208159w;

    /* JADX INFO: renamed from: x */
    private long f208160x;

    /* JADX INFO: renamed from: y */
    private long f208161y;

    /* JADX INFO: renamed from: z */
    private long f208162z;

    public MediaCodecVideoMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f208158v = "MediaCodecVideoMux";
        this.f208159w = 0L;
        this.f208160x = 0L;
        this.f208161y = 0L;
        this.f208162z = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0277 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0297 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo222130c() throws IOException {
        MediaCodecVideoMux mediaCodecVideoMux;
        byte[] bArrM222138a;
        ByteBuffer byteBufferAllocate;
        try {
            boolean z = true;
            if (this.f208168f == null) {
                while (!Thread.interrupted() && !this.f208170h) {
                    int iDequeueOutputBuffer = this.f208165c.dequeueOutputBuffer(this.f208166d, 500000L);
                    this.f208169g = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        n8c.m158483a("MediaCodecVideoMux", "Index: " + this.f208169g + " Time: " + this.f208166d.presentationTimeUs + " size: " + this.f208166d.size);
                        ByteBuffer byteBuffer = this.f208167e[this.f208169g];
                        this.f208168f = byteBuffer;
                        byteBuffer.position(0);
                        long j = this.f208161y;
                        MediaCodec.BufferInfo bufferInfo = this.f208166d;
                        this.f208161y = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f208160x == 0) {
                                this.f208160x = System.currentTimeMillis();
                            }
                            this.f208159w++;
                            break;
                        }
                        n8c.m158485c("MediaCodecVideoMux", "encoderVideo  metadata : " + this.f208169g);
                        int iPosition = this.f208166d.size - this.f208168f.position();
                        this.f208174l = new byte[iPosition];
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f208168f.get(bArr);
                        this.f208168f.position(0);
                        this.f208168f.get(this.f208174l, 0, iPosition);
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 4; i4 < this.f208166d.size; i4++) {
                            n8c.m158485c("MediaCodecVideoMux", "configdta" + ((int) bArr[i4]));
                            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i4 + 3] == 1) {
                                n8c.m158485c("MediaCodecVideoMux", "find pps" + i4);
                                i = i4 + (-1);
                                i3 = this.f208166d.size + (-1);
                                i2 = i4;
                            }
                        }
                        n8c.m158485c("MediaCodecVideoMux", "spsbegin:0spsend:" + i + ";ppsbegin:" + i2 + ";ppsbegin:" + i3 + ";mBufferInfo.size:" + this.f208166d.size);
                        int i5 = i + 1;
                        this.f208173k = ByteBuffer.allocate(i5);
                        int i6 = (i3 - i2) + 1;
                        this.f208172j = ByteBuffer.allocate(i6);
                        this.f208173k.put(bArr, 0, i5);
                        this.f208172j.put(bArr, i2, i6);
                        n8c.m158485c("MediaCodecVideoMux", "spslen:" + this.f208172j.limit() + ";mPpsblen:" + this.f208173k.limit() + ";mBufferInfo.size:" + this.f208166d.size);
                        byteBufferAllocate2.put(bArr);
                        byteBufferAllocate2.rewind();
                        synchronized (this.f208180r) {
                            try {
                                SinkBase sinkBase = this.f208179q;
                                if (sinkBase != null) {
                                    sinkBase.writeVideoExtradata(byteBufferAllocate2, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f208165c.releaseOutputBuffer(this.f208169g, false);
                        this.f208168f = null;
                        return;
                    }
                    if (iDequeueOutputBuffer == -3) {
                        this.f208167e = this.f208165c.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f208165c.getOutputFormat();
                        this.f208164b = outputFormat;
                        n8c.m158487e("MediaCodecVideoMux", outputFormat.toString());
                    } else if (iDequeueOutputBuffer == -1) {
                        n8c.m158490h("MediaCodecVideoMux", "No buffer available...");
                    } else {
                        n8c.m158485c("MediaCodecVideoMux", "Message: " + this.f208169g);
                    }
                    n8c.m158485c("MediaCodecVideoMux", "MediaCodecVideoMux error !");
                    StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener = mediaCodecVideoMux.f208178p;
                    if (packetBufferlingStatusListener != null) {
                        packetBufferlingStatusListener.mo222744a(104, 100000L);
                    }
                    e.printStackTrace();
                    return;
                }
            }
            ByteBuffer byteBuffer2 = this.f208168f;
            if (byteBuffer2 == null) {
                return;
            }
            byteBuffer2.position(0);
            int iPosition2 = this.f208166d.size - this.f208168f.position();
            byte[] bArr2 = new byte[iPosition2];
            this.f208168f.get(bArr2);
            m222139b(bArr2);
            byte b = bArr2[4];
            int i7 = b & 31;
            try {
                if ((b & 96) != 0 || i7 != 6) {
                    if (i7 == 5) {
                        bArrM222138a = m222138a();
                        iPosition2 += this.f208174l.length;
                        if (bArrM222138a != null) {
                            iPosition2 += bArrM222138a.length;
                        }
                    }
                    byteBufferAllocate = ByteBuffer.allocate(iPosition2);
                    byteBufferAllocate.clear();
                    this.f208173k.rewind();
                    this.f208172j.rewind();
                    byteBufferAllocate.clear();
                    this.f208173k.rewind();
                    this.f208172j.rewind();
                    if (z) {
                        byteBufferAllocate.put(this.f208173k);
                        byteBufferAllocate.put(this.f208172j);
                    }
                    byteBufferAllocate.put(bArr2);
                    if (z && bArrM222138a != null) {
                        byteBufferAllocate.put(bArrM222138a);
                    }
                    if (this.f208168f.position() >= this.f208166d.size) {
                        this.f208165c.releaseOutputBuffer(this.f208169g, false);
                        this.f208168f = null;
                    }
                    n8c.m158483a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f208166d.presentationTimeUs + ";frametype" + i7);
                    mediaCodecVideoMux = this;
                    mediaCodecVideoMux.m222137q(byteBufferAllocate, byteBufferAllocate.limit(), this.f208166d.presentationTimeUs, i7);
                    return;
                }
                n8c.m158483a("MediaCodecVideoMux", "sei found !");
                mediaCodecVideoMux.m222137q(byteBufferAllocate, byteBufferAllocate.limit(), this.f208166d.presentationTimeUs, i7);
                return;
            } catch (RuntimeException e) {
                e = e;
            }
            bArrM222138a = null;
            z = false;
            byteBufferAllocate = ByteBuffer.allocate(iPosition2);
            byteBufferAllocate.clear();
            this.f208173k.rewind();
            this.f208172j.rewind();
            byteBufferAllocate.clear();
            this.f208173k.rewind();
            this.f208172j.rewind();
            if (z) {
                byteBufferAllocate.put(this.f208173k);
                byteBufferAllocate.put(this.f208172j);
            }
            byteBufferAllocate.put(bArr2);
            if (z) {
                byteBufferAllocate.put(bArrM222138a);
            }
            if (this.f208168f.position() >= this.f208166d.size) {
                this.f208165c.releaseOutputBuffer(this.f208169g, false);
                this.f208168f = null;
            }
            n8c.m158483a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f208166d.presentationTimeUs + ";frametype" + i7);
            mediaCodecVideoMux = this;
        } catch (RuntimeException e2) {
            e = e2;
            mediaCodecVideoMux = this;
        }
    }

    /* JADX INFO: renamed from: n */
    public long m222134n() {
        return this.f208160x;
    }

    /* JADX INFO: renamed from: o */
    public long m222135o() {
        return this.f208161y;
    }

    /* JADX INFO: renamed from: p */
    public long m222136p() {
        return this.f208159w;
    }

    /* JADX INFO: renamed from: q */
    public void m222137q(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f208162z == 0) {
            this.f208162z = j;
        }
        synchronized (this.f208180r) {
            try {
                SinkBase sinkBase = this.f208179q;
                if (sinkBase != null) {
                    sinkBase.writeVideoPacket((j - this.f208162z) / 1000, byteBuffer, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
