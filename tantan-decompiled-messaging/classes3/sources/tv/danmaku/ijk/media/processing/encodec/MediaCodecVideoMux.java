package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import l.n8c;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecVideoMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f11783v;

    /* JADX INFO: renamed from: w */
    private long f11784w;

    /* JADX INFO: renamed from: x */
    private long f11785x;

    /* JADX INFO: renamed from: y */
    private long f11786y;

    /* JADX INFO: renamed from: z */
    private long f11787z;

    public MediaCodecVideoMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f11783v = "MediaCodecVideoMux";
        this.f11784w = 0L;
        this.f11785x = 0L;
        this.f11786y = 0L;
        this.f11787z = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0277 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0297 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo10601c() throws IOException {
        MediaCodecVideoMux mediaCodecVideoMux;
        byte[] bArrM10609a;
        ByteBuffer byteBufferAllocate;
        try {
            boolean z = true;
            if (this.f11793f == null) {
                while (!Thread.interrupted() && !this.f11795h) {
                    int iDequeueOutputBuffer = this.f11790c.dequeueOutputBuffer(this.f11791d, 500000L);
                    this.f11794g = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        n8c.a("MediaCodecVideoMux", "Index: " + this.f11794g + " Time: " + this.f11791d.presentationTimeUs + " size: " + this.f11791d.size);
                        ByteBuffer byteBuffer = this.f11792e[this.f11794g];
                        this.f11793f = byteBuffer;
                        byteBuffer.position(0);
                        long j = this.f11786y;
                        MediaCodec.BufferInfo bufferInfo = this.f11791d;
                        this.f11786y = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f11785x == 0) {
                                this.f11785x = System.currentTimeMillis();
                            }
                            this.f11784w++;
                            break;
                        }
                        n8c.c("MediaCodecVideoMux", "encoderVideo  metadata : " + this.f11794g);
                        int iPosition = this.f11791d.size - this.f11793f.position();
                        this.f11799l = new byte[iPosition];
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f11793f.get(bArr);
                        this.f11793f.position(0);
                        this.f11793f.get(this.f11799l, 0, iPosition);
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 4; i4 < this.f11791d.size; i4++) {
                            n8c.c("MediaCodecVideoMux", "configdta" + ((int) bArr[i4]));
                            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i4 + 3] == 1) {
                                n8c.c("MediaCodecVideoMux", "find pps" + i4);
                                i = i4 + (-1);
                                i3 = this.f11791d.size + (-1);
                                i2 = i4;
                            }
                        }
                        n8c.c("MediaCodecVideoMux", "spsbegin:0spsend:" + i + ";ppsbegin:" + i2 + ";ppsbegin:" + i3 + ";mBufferInfo.size:" + this.f11791d.size);
                        int i5 = i + 1;
                        this.f11798k = ByteBuffer.allocate(i5);
                        int i6 = (i3 - i2) + 1;
                        this.f11797j = ByteBuffer.allocate(i6);
                        this.f11798k.put(bArr, 0, i5);
                        this.f11797j.put(bArr, i2, i6);
                        n8c.c("MediaCodecVideoMux", "spslen:" + this.f11797j.limit() + ";mPpsblen:" + this.f11798k.limit() + ";mBufferInfo.size:" + this.f11791d.size);
                        byteBufferAllocate2.put(bArr);
                        byteBufferAllocate2.rewind();
                        synchronized (this.f11805r) {
                            try {
                                SinkBase sinkBase = this.f11804q;
                                if (sinkBase != null) {
                                    sinkBase.writeVideoExtradata(byteBufferAllocate2, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f11790c.releaseOutputBuffer(this.f11794g, false);
                        this.f11793f = null;
                        return;
                    }
                    if (iDequeueOutputBuffer == -3) {
                        this.f11792e = this.f11790c.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f11790c.getOutputFormat();
                        this.f11789b = outputFormat;
                        n8c.e("MediaCodecVideoMux", outputFormat.toString());
                    } else if (iDequeueOutputBuffer == -1) {
                        n8c.h("MediaCodecVideoMux", "No buffer available...");
                    } else {
                        n8c.c("MediaCodecVideoMux", "Message: " + this.f11794g);
                    }
                    n8c.c("MediaCodecVideoMux", "MediaCodecVideoMux error !");
                    StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener = mediaCodecVideoMux.f11803p;
                    if (packetBufferlingStatusListener != null) {
                        packetBufferlingStatusListener.mo11215a(104, 100000L);
                    }
                    e.printStackTrace();
                    return;
                }
            }
            ByteBuffer byteBuffer2 = this.f11793f;
            if (byteBuffer2 == null) {
                return;
            }
            byteBuffer2.position(0);
            int iPosition2 = this.f11791d.size - this.f11793f.position();
            byte[] bArr2 = new byte[iPosition2];
            this.f11793f.get(bArr2);
            m10610b(bArr2);
            byte b = bArr2[4];
            int i7 = b & 31;
            try {
                if ((b & 96) != 0 || i7 != 6) {
                    if (i7 == 5) {
                        bArrM10609a = m10609a();
                        iPosition2 += this.f11799l.length;
                        if (bArrM10609a != null) {
                            iPosition2 += bArrM10609a.length;
                        }
                    }
                    byteBufferAllocate = ByteBuffer.allocate(iPosition2);
                    byteBufferAllocate.clear();
                    this.f11798k.rewind();
                    this.f11797j.rewind();
                    byteBufferAllocate.clear();
                    this.f11798k.rewind();
                    this.f11797j.rewind();
                    if (z) {
                        byteBufferAllocate.put(this.f11798k);
                        byteBufferAllocate.put(this.f11797j);
                    }
                    byteBufferAllocate.put(bArr2);
                    if (z && bArrM10609a != null) {
                        byteBufferAllocate.put(bArrM10609a);
                    }
                    if (this.f11793f.position() >= this.f11791d.size) {
                        this.f11790c.releaseOutputBuffer(this.f11794g, false);
                        this.f11793f = null;
                    }
                    n8c.a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f11791d.presentationTimeUs + ";frametype" + i7);
                    mediaCodecVideoMux = this;
                    mediaCodecVideoMux.m10608q(byteBufferAllocate, byteBufferAllocate.limit(), this.f11791d.presentationTimeUs, i7);
                    return;
                }
                n8c.a("MediaCodecVideoMux", "sei found !");
                mediaCodecVideoMux.m10608q(byteBufferAllocate, byteBufferAllocate.limit(), this.f11791d.presentationTimeUs, i7);
                return;
            } catch (RuntimeException e) {
                e = e;
            }
            bArrM10609a = null;
            z = false;
            byteBufferAllocate = ByteBuffer.allocate(iPosition2);
            byteBufferAllocate.clear();
            this.f11798k.rewind();
            this.f11797j.rewind();
            byteBufferAllocate.clear();
            this.f11798k.rewind();
            this.f11797j.rewind();
            if (z) {
                byteBufferAllocate.put(this.f11798k);
                byteBufferAllocate.put(this.f11797j);
            }
            byteBufferAllocate.put(bArr2);
            if (z) {
                byteBufferAllocate.put(bArrM10609a);
            }
            if (this.f11793f.position() >= this.f11791d.size) {
                this.f11790c.releaseOutputBuffer(this.f11794g, false);
                this.f11793f = null;
            }
            n8c.a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f11791d.presentationTimeUs + ";frametype" + i7);
            mediaCodecVideoMux = this;
        } catch (RuntimeException e2) {
            e = e2;
            mediaCodecVideoMux = this;
        }
    }

    /* JADX INFO: renamed from: n */
    public long m10605n() {
        return this.f11785x;
    }

    /* JADX INFO: renamed from: o */
    public long m10606o() {
        return this.f11786y;
    }

    /* JADX INFO: renamed from: p */
    public long m10607p() {
        return this.f11784w;
    }

    /* JADX INFO: renamed from: q */
    public void m10608q(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f11787z == 0) {
            this.f11787z = j;
        }
        synchronized (this.f11805r) {
            try {
                SinkBase sinkBase = this.f11804q;
                if (sinkBase != null) {
                    sinkBase.writeVideoPacket((j - this.f11787z) / 1000, byteBuffer, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
