package tv.danmaku.ijk.media.processing.encodec;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.immomo.mediacore.sink.SinkBase;
import java.io.IOException;
import java.nio.ByteBuffer;
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.StreamProducer;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class MediaCodecVideoMux extends MuxBase {

    /* JADX INFO: renamed from: v */
    public final String f209080v;

    /* JADX INFO: renamed from: w */
    private long f209081w;

    /* JADX INFO: renamed from: x */
    private long f209082x;

    /* JADX INFO: renamed from: y */
    private long f209083y;

    /* JADX INFO: renamed from: z */
    private long f209084z;

    public MediaCodecVideoMux(MediaCodec mediaCodec, SinkBase sinkBase) {
        super(mediaCodec, sinkBase);
        this.f209080v = "MediaCodecVideoMux";
        this.f209081w = 0L;
        this.f209082x = 0L;
        this.f209083y = 0L;
        this.f209084z = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0277 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0297 A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:2:0x0000, B:4:0x0008, B:6:0x000e, B:8:0x0012, B:10:0x0021, B:12:0x0070, B:13:0x00b1, B:15:0x00b7, B:17:0x00d3, B:19:0x00d9, B:21:0x00df, B:23:0x00e5, B:26:0x0109, B:27:0x010c, B:28:0x019d, B:35:0x01aa, B:38:0x01b5, B:39:0x01b6, B:41:0x01be, B:42:0x01c4, B:45:0x01cf, B:48:0x01dc, B:51:0x01f2, B:52:0x01fb, B:53:0x0215, B:56:0x021a, B:60:0x023d, B:67:0x0257, B:69:0x0277, B:70:0x0281, B:73:0x0288, B:74:0x028b, B:76:0x0297, B:77:0x02a0, B:63:0x0248, B:65:0x0252, B:29:0x019e, B:31:0x01a2, B:34:0x01a9), top: B:87:0x0000, inners: #1 }] */
    @Override // tv.danmaku.ijk.media.processing.encodec.MuxBase
    /* JADX INFO: renamed from: c */
    public void mo223376c() throws IOException {
        MediaCodecVideoMux mediaCodecVideoMux;
        byte[] bArrM223384a;
        ByteBuffer byteBufferAllocate;
        try {
            boolean z = true;
            if (this.f209090f == null) {
                while (!Thread.interrupted() && !this.f209092h) {
                    int iDequeueOutputBuffer = this.f209087c.dequeueOutputBuffer(this.f209088d, 500000L);
                    this.f209091g = iDequeueOutputBuffer;
                    if (iDequeueOutputBuffer >= 0) {
                        t9c.m189743a("MediaCodecVideoMux", "Index: " + this.f209091g + " Time: " + this.f209088d.presentationTimeUs + " size: " + this.f209088d.size);
                        ByteBuffer byteBuffer = this.f209089e[this.f209091g];
                        this.f209090f = byteBuffer;
                        byteBuffer.position(0);
                        long j = this.f209083y;
                        MediaCodec.BufferInfo bufferInfo = this.f209088d;
                        this.f209083y = (j + ((long) bufferInfo.size)) - ((long) bufferInfo.offset);
                        if ((bufferInfo.flags & 2) == 0) {
                            if (this.f209082x == 0) {
                                this.f209082x = System.currentTimeMillis();
                            }
                            this.f209081w++;
                            break;
                        }
                        t9c.m189745c("MediaCodecVideoMux", "encoderVideo  metadata : " + this.f209091g);
                        int iPosition = this.f209088d.size - this.f209090f.position();
                        this.f209096l = new byte[iPosition];
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iPosition);
                        byte[] bArr = new byte[iPosition];
                        this.f209090f.get(bArr);
                        this.f209090f.position(0);
                        this.f209090f.get(this.f209096l, 0, iPosition);
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        for (int i4 = 4; i4 < this.f209088d.size; i4++) {
                            t9c.m189745c("MediaCodecVideoMux", "configdta" + ((int) bArr[i4]));
                            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 0 && bArr[i4 + 3] == 1) {
                                t9c.m189745c("MediaCodecVideoMux", "find pps" + i4);
                                i = i4 + (-1);
                                i3 = this.f209088d.size + (-1);
                                i2 = i4;
                            }
                        }
                        t9c.m189745c("MediaCodecVideoMux", "spsbegin:0spsend:" + i + ";ppsbegin:" + i2 + ";ppsbegin:" + i3 + ";mBufferInfo.size:" + this.f209088d.size);
                        int i5 = i + 1;
                        this.f209095k = ByteBuffer.allocate(i5);
                        int i6 = (i3 - i2) + 1;
                        this.f209094j = ByteBuffer.allocate(i6);
                        this.f209095k.put(bArr, 0, i5);
                        this.f209094j.put(bArr, i2, i6);
                        t9c.m189745c("MediaCodecVideoMux", "spslen:" + this.f209094j.limit() + ";mPpsblen:" + this.f209095k.limit() + ";mBufferInfo.size:" + this.f209088d.size);
                        byteBufferAllocate2.put(bArr);
                        byteBufferAllocate2.rewind();
                        synchronized (this.f209102r) {
                            try {
                                SinkBase sinkBase = this.f209101q;
                                if (sinkBase != null) {
                                    sinkBase.writeVideoExtradata(byteBufferAllocate2, iPosition);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        this.f209087c.releaseOutputBuffer(this.f209091g, false);
                        this.f209090f = null;
                        return;
                    }
                    if (iDequeueOutputBuffer == -3) {
                        this.f209089e = this.f209087c.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f209087c.getOutputFormat();
                        this.f209086b = outputFormat;
                        t9c.m189747e("MediaCodecVideoMux", outputFormat.toString());
                    } else if (iDequeueOutputBuffer == -1) {
                        t9c.m189750h("MediaCodecVideoMux", "No buffer available...");
                    } else {
                        t9c.m189745c("MediaCodecVideoMux", "Message: " + this.f209091g);
                    }
                    t9c.m189745c("MediaCodecVideoMux", "MediaCodecVideoMux error !");
                    StreamProducer.PacketBufferlingStatusListener packetBufferlingStatusListener = mediaCodecVideoMux.f209100p;
                    if (packetBufferlingStatusListener != null) {
                        packetBufferlingStatusListener.mo223990a(104, 100000L);
                    }
                    e.printStackTrace();
                    return;
                }
            }
            ByteBuffer byteBuffer2 = this.f209090f;
            if (byteBuffer2 == null) {
                return;
            }
            byteBuffer2.position(0);
            int iPosition2 = this.f209088d.size - this.f209090f.position();
            byte[] bArr2 = new byte[iPosition2];
            this.f209090f.get(bArr2);
            m223385b(bArr2);
            byte b = bArr2[4];
            int i7 = b & 31;
            try {
                if ((b & 96) != 0 || i7 != 6) {
                    if (i7 == 5) {
                        bArrM223384a = m223384a();
                        iPosition2 += this.f209096l.length;
                        if (bArrM223384a != null) {
                            iPosition2 += bArrM223384a.length;
                        }
                    }
                    byteBufferAllocate = ByteBuffer.allocate(iPosition2);
                    byteBufferAllocate.clear();
                    this.f209095k.rewind();
                    this.f209094j.rewind();
                    byteBufferAllocate.clear();
                    this.f209095k.rewind();
                    this.f209094j.rewind();
                    if (z) {
                        byteBufferAllocate.put(this.f209095k);
                        byteBufferAllocate.put(this.f209094j);
                    }
                    byteBufferAllocate.put(bArr2);
                    if (z && bArrM223384a != null) {
                        byteBufferAllocate.put(bArrM223384a);
                    }
                    if (this.f209090f.position() >= this.f209088d.size) {
                        this.f209087c.releaseOutputBuffer(this.f209091g, false);
                        this.f209090f = null;
                    }
                    t9c.m189743a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f209088d.presentationTimeUs + ";frametype" + i7);
                    mediaCodecVideoMux = this;
                    mediaCodecVideoMux.m223383q(byteBufferAllocate, byteBufferAllocate.limit(), this.f209088d.presentationTimeUs, i7);
                    return;
                }
                t9c.m189743a("MediaCodecVideoMux", "sei found !");
                mediaCodecVideoMux.m223383q(byteBufferAllocate, byteBufferAllocate.limit(), this.f209088d.presentationTimeUs, i7);
                return;
            } catch (RuntimeException e) {
                e = e;
            }
            bArrM223384a = null;
            z = false;
            byteBufferAllocate = ByteBuffer.allocate(iPosition2);
            byteBufferAllocate.clear();
            this.f209095k.rewind();
            this.f209094j.rewind();
            byteBufferAllocate.clear();
            this.f209095k.rewind();
            this.f209094j.rewind();
            if (z) {
                byteBufferAllocate.put(this.f209095k);
                byteBufferAllocate.put(this.f209094j);
            }
            byteBufferAllocate.put(bArr2);
            if (z) {
                byteBufferAllocate.put(bArrM223384a);
            }
            if (this.f209090f.position() >= this.f209088d.size) {
                this.f209087c.releaseOutputBuffer(this.f209091g, false);
                this.f209090f = null;
            }
            t9c.m189743a("MediaCodecVideoMux", "video mux presentationTimeUs: presentationTimeUs" + this.f209088d.presentationTimeUs + ";frametype" + i7);
            mediaCodecVideoMux = this;
        } catch (RuntimeException e2) {
            e = e2;
            mediaCodecVideoMux = this;
        }
    }

    /* JADX INFO: renamed from: n */
    public long m223380n() {
        return this.f209082x;
    }

    /* JADX INFO: renamed from: o */
    public long m223381o() {
        return this.f209083y;
    }

    /* JADX INFO: renamed from: p */
    public long m223382p() {
        return this.f209081w;
    }

    /* JADX INFO: renamed from: q */
    public void m223383q(ByteBuffer byteBuffer, int i, long j, int i2) {
        if (this.f209084z == 0) {
            this.f209084z = j;
        }
        synchronized (this.f209102r) {
            try {
                SinkBase sinkBase = this.f209101q;
                if (sinkBase != null) {
                    sinkBase.writeVideoPacket((j - this.f209084z) / 1000, byteBuffer, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
