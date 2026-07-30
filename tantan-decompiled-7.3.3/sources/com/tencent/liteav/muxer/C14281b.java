package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.tencent.liteav.muxer.b */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(18)
public class C14281b implements InterfaceC14280a {

    /* JADX INFO: renamed from: a */
    public static float f60228a = 0.5f;

    /* JADX INFO: renamed from: b */
    public static float f60229b = 0.8f;

    /* JADX INFO: renamed from: c */
    public static float f60230c = 1.25f;

    /* JADX INFO: renamed from: d */
    public static float f60231d = 2.0f;

    /* JADX INFO: renamed from: f */
    private MediaMuxer f60233f;

    /* JADX INFO: renamed from: e */
    private int f60232e = 2;

    /* JADX INFO: renamed from: g */
    private String f60234g = null;

    /* JADX INFO: renamed from: h */
    private MediaFormat f60235h = null;

    /* JADX INFO: renamed from: i */
    private MediaFormat f60236i = null;

    /* JADX INFO: renamed from: j */
    private int f60237j = 0;

    /* JADX INFO: renamed from: k */
    private int f60238k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f60239l = false;

    /* JADX INFO: renamed from: m */
    private boolean f60240m = false;

    /* JADX INFO: renamed from: n */
    private ConcurrentLinkedQueue<a> f60241n = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: o */
    private ConcurrentLinkedQueue<a> f60242o = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: p */
    private long f60243p = -1;

    /* JADX INFO: renamed from: q */
    private long f60244q = -1;

    /* JADX INFO: renamed from: r */
    private long f60245r = -1;

    /* JADX INFO: renamed from: com.tencent.liteav.muxer.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        ByteBuffer f60246a;

        /* JADX INFO: renamed from: b */
        MediaCodec.BufferInfo f60247b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f60246a = byteBuffer;
            this.f60247b = bufferInfo;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m84820a() {
            return this.f60246a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m84821b() {
            return this.f60247b;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84814c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs - this.f60243p;
        if (j < 0) {
            TXCLog.m84149e("TXCMP4HWMuxer", "pts error! first frame offset timeus = " + this.f60243p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j = this.f60244q;
            if (j <= 0) {
                j = 0;
            }
        }
        if (j < this.f60244q) {
            TXCLog.m84156w("TXCMP4HWMuxer", "video is not in chronological order. current frame's pts(" + j + ") smaller than pre frame's pts(" + this.f60244q + ")");
        } else {
            this.f60244q = j;
        }
        int i = this.f60232e;
        if (i != 2) {
            if (i == 3) {
                f = j;
                f2 = f60229b;
            } else if (i == 4) {
                f = j;
                f2 = f60228a;
            } else if (i == 1) {
                f = j;
                f2 = f60230c;
            } else if (i == 0) {
                f = j;
                f2 = f60231d;
            }
            j = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f60233f.writeSampleData(this.f60238k, byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f60240m = true;
            }
        } catch (IllegalArgumentException e) {
            TXCLog.m84149e("TXCMP4HWMuxer", "write frame IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m84149e("TXCMP4HWMuxer", "write frame IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m84816d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.f60243p;
        long j3 = j - j2;
        if (j2 < 0 || j3 < 0) {
            TXCLog.m84156w("TXCMP4HWMuxer", "drop sample. first frame offset timeus = " + this.f60243p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j3 < this.f60245r) {
            TXCLog.m84149e("TXCMP4HWMuxer", "audio is not in chronological order. current audio's pts pts(" + j3 + ") must larger than pre audio's pts(" + this.f60245r + ")");
            j3 = this.f60245r + 1;
        } else {
            this.f60245r = j3;
        }
        int i = this.f60232e;
        if (i != 2) {
            if (i == 3) {
                f = j3;
                f2 = f60229b;
            } else if (i == 4) {
                f = j3;
                f2 = f60228a;
            } else if (i == 1) {
                f = j3;
                f2 = f60230c;
            } else if (i == 0) {
                f = j3;
                f2 = f60231d;
            }
            j3 = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j3;
        try {
            this.f60233f.writeSampleData(this.f60237j, byteBuffer, bufferInfo);
        } catch (IllegalArgumentException e) {
            TXCLog.m84149e("TXCMP4HWMuxer", "write sample IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m84149e("TXCMP4HWMuxer", "write sample IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m84817e() {
        while (this.f60241n.size() > 0) {
            a aVarPoll = this.f60241n.poll();
            m84814c(aVarPoll.m84820a(), aVarPoll.m84821b());
        }
        while (this.f60242o.size() > 0) {
            a aVarPoll2 = this.f60242o.poll();
            m84816d(aVarPoll2.m84820a(), aVarPoll2.m84821b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized int mo84805a() {
        MediaFormat mediaFormat;
        String str = this.f60234g;
        if (str != null && !str.isEmpty()) {
            if (!mo84812c()) {
                TXCLog.m84149e("TXCMP4HWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f60233f != null) {
                TXCLog.m84156w("TXCMP4HWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.m84147d("TXCMP4HWMuxer", "start");
            try {
                MediaMuxer mediaMuxer = new MediaMuxer(this.f60234g, 0);
                this.f60233f = mediaMuxer;
                MediaFormat mediaFormat2 = this.f60235h;
                if (mediaFormat2 == null) {
                    mediaFormat = this.f60236i;
                    if (mediaFormat != null) {
                        this.f60237j = this.f60233f.addTrack(mediaFormat);
                    }
                    this.f60233f.start();
                    this.f60243p = -1L;
                    this.f60239l = true;
                    this.f60240m = false;
                    this.f60244q = -1L;
                    this.f60245r = -1L;
                    return 0;
                }
                try {
                    this.f60238k = mediaMuxer.addTrack(mediaFormat2);
                    mediaFormat = this.f60236i;
                    if (mediaFormat != null) {
                        try {
                            this.f60237j = this.f60233f.addTrack(mediaFormat);
                        } catch (IllegalArgumentException e) {
                            TXCLog.m84149e("TXCMP4HWMuxer", "addAudioTrack IllegalArgumentException: " + e);
                            return -7;
                        } catch (IllegalStateException e2) {
                            TXCLog.m84149e("TXCMP4HWMuxer", "addAudioTrack IllegalStateException: " + e2);
                            return -8;
                        }
                    }
                    this.f60233f.start();
                    this.f60243p = -1L;
                    this.f60239l = true;
                    this.f60240m = false;
                    this.f60244q = -1L;
                    this.f60245r = -1L;
                    return 0;
                } catch (IllegalArgumentException e3) {
                    TXCLog.m84149e("TXCMP4HWMuxer", "addVideoTrack IllegalArgumentException: " + e3);
                    return -5;
                } catch (IllegalStateException e4) {
                    TXCLog.m84149e("TXCMP4HWMuxer", "addVideoTrack IllegalStateException: " + e4);
                    return -6;
                }
            } catch (IOException e5) {
                TXCLog.m84149e("TXCMP4HWMuxer", "create MediaMuxer exception:" + e5);
                return -4;
            }
            throw th;
        }
        TXCLog.m84149e("TXCMP4HWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public synchronized int mo84809b() {
        if (this.f60233f != null) {
            TXCLog.m84147d("TXCMP4HWMuxer", "stop. start flag = " + this.f60239l + ", video key frame set = " + this.f60240m);
            try {
                try {
                    if (this.f60239l && this.f60240m) {
                        this.f60233f.stop();
                    }
                    this.f60233f.release();
                    this.f60239l = false;
                    this.f60233f = null;
                    this.f60240m = false;
                    this.f60241n.clear();
                    this.f60242o.clear();
                    this.f60235h = null;
                    this.f60236i = null;
                    this.f60244q = -1L;
                    this.f60245r = -1L;
                } catch (Exception e) {
                    TXCLog.m84149e("TXCMP4HWMuxer", "muxer stop/release exception: " + e);
                    this.f60239l = false;
                    this.f60233f = null;
                    this.f60240m = false;
                    this.f60241n.clear();
                    this.f60242o.clear();
                    this.f60235h = null;
                    this.f60236i = null;
                    this.f60244q = -1L;
                    this.f60245r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f60239l = false;
                this.f60233f = null;
                this.f60240m = false;
                this.f60241n.clear();
                this.f60242o.clear();
                this.f60235h = null;
                this.f60236i = null;
                this.f60244q = -1L;
                this.f60245r = -1L;
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public synchronized void mo84810b(MediaFormat mediaFormat) {
        TXCLog.m84147d("TXCMP4HWMuxer", "addAudioTrack:" + mediaFormat);
        this.f60236i = mediaFormat;
        this.f60242o.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public synchronized void mo84811b(byte[] bArr, int i, int i2, long j, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.put(bArr, i, i2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j;
        bufferInfo.offset = 0;
        bufferInfo.size = i2;
        bufferInfo.flags = i3;
        m84818a(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84819b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f60233f != null && this.f60243p >= 0) {
            m84816d(byteBuffer, bufferInfo);
            return;
        }
        TXCLog.m84147d("TXCMP4HWMuxer", "cache sample before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
        m84813a(false, byteBuffer, bufferInfo);
    }

    /* JADX INFO: renamed from: d */
    private long m84815d() {
        a aVarPeek;
        long j = this.f60241n.size() > 0 ? this.f60241n.peek().m84821b().presentationTimeUs : 0L;
        if (this.f60242o.size() > 0 && (aVarPeek = this.f60242o.peek()) != null && aVarPeek.m84821b() != null) {
            long j2 = this.f60242o.peek().m84821b().presentationTimeUs;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo84812c() {
        return this.f60235h != null;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized void mo84806a(MediaFormat mediaFormat) {
        TXCLog.m84147d("TXCMP4HWMuxer", "addVideoTrack:" + mediaFormat);
        this.f60235h = mediaFormat;
        this.f60241n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized void mo84807a(String str) {
        try {
            this.f60234g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f60234g);
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    TXCLog.m84150e("TXCMP4HWMuxer", "create new file failed.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized void mo84808a(byte[] bArr, int i, int i2, long j, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.put(bArr, i, i2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j;
        bufferInfo.offset = 0;
        bufferInfo.size = i2;
        bufferInfo.flags = i3;
        m84819b(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84818a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f60233f == null) {
            m84813a(true, byteBuffer, bufferInfo);
            TXCLog.m84156w("TXCMP4HWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f60243p < 0) {
            m84813a(true, byteBuffer, bufferInfo);
            this.f60243p = m84815d();
            TXCLog.m84147d("TXCMP4HWMuxer", "first frame offset = " + this.f60243p);
            m84817e();
        } else {
            m84814c(byteBuffer, bufferInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84813a(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (byteBuffer == null || bufferInfo == null) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        if (bufferInfo.size > 0) {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.size);
        }
        byteBufferAllocateDirect.rewind();
        byteBufferAllocateDirect.put(byteBuffer);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        a aVar = new a(byteBufferAllocateDirect, bufferInfo2);
        if (z) {
            if (this.f60241n.size() >= 200) {
                TXCLog.m84149e("TXCMP4HWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            } else {
                this.f60241n.add(aVar);
                return;
            }
        }
        if (this.f60242o.size() >= 600) {
            TXCLog.m84149e("TXCMP4HWMuxer", "drop audio frame. audio cache size is larger than 600");
        } else {
            this.f60242o.add(aVar);
        }
    }
}
