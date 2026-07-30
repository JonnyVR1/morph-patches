package com.tencent.liteav.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.muxer.jni.TXSWMuxerJNI;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.tencent.liteav.muxer.d */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(18)
public class C14283d implements InterfaceC14280a {

    /* JADX INFO: renamed from: a */
    public static float f60250a = 0.5f;

    /* JADX INFO: renamed from: b */
    public static float f60251b = 0.8f;

    /* JADX INFO: renamed from: c */
    public static float f60252c = 1.25f;

    /* JADX INFO: renamed from: d */
    public static float f60253d = 2.0f;

    /* JADX INFO: renamed from: f */
    private TXSWMuxerJNI f60255f;

    /* JADX INFO: renamed from: e */
    private int f60254e = 2;

    /* JADX INFO: renamed from: g */
    private String f60256g = null;

    /* JADX INFO: renamed from: h */
    private MediaFormat f60257h = null;

    /* JADX INFO: renamed from: i */
    private MediaFormat f60258i = null;

    /* JADX INFO: renamed from: j */
    private int f60259j = 0;

    /* JADX INFO: renamed from: k */
    private int f60260k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f60261l = false;

    /* JADX INFO: renamed from: m */
    private boolean f60262m = false;

    /* JADX INFO: renamed from: n */
    private ConcurrentLinkedQueue<a> f60263n = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: o */
    private ConcurrentLinkedQueue<a> f60264o = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: p */
    private long f60265p = -1;

    /* JADX INFO: renamed from: q */
    private long f60266q = -1;

    /* JADX INFO: renamed from: r */
    private long f60267r = -1;

    /* JADX INFO: renamed from: com.tencent.liteav.muxer.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        ByteBuffer f60268a;

        /* JADX INFO: renamed from: b */
        MediaCodec.BufferInfo f60269b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f60268a = byteBuffer;
            this.f60269b = bufferInfo;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m84835a() {
            return this.f60268a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m84836b() {
            return this.f60269b;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m84825c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs - this.f60265p;
        if (j < 0) {
            TXCLog.m84149e("TXCMP4SWMuxer", "pts error! first frame offset timeus = " + this.f60265p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j = this.f60266q;
            if (j <= 0) {
                j = 0;
            }
        }
        if (j < this.f60266q) {
            TXCLog.m84156w("TXCMP4SWMuxer", "video is not in chronological order. current frame's pts(" + j + ") smaller than pre frame's pts(" + this.f60266q + ")");
        } else {
            this.f60266q = j;
        }
        int i = this.f60254e;
        if (i != 2) {
            if (i == 3) {
                f = j;
                f2 = f60251b;
            } else if (i == 4) {
                f = j;
                f2 = f60250a;
            } else if (i == 1) {
                f = j;
                f2 = f60252c;
            } else if (i == 0) {
                f = j;
                f2 = f60253d;
            }
            j = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f60255f.m84839a(byteBuffer, 1, bufferInfo.offset, bufferInfo.size, bufferInfo.flags == 1 ? 1 : 0, bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 1) != 0) {
                this.f60262m = true;
            }
        } catch (IllegalArgumentException e) {
            TXCLog.m84149e("TXCMP4SWMuxer", "write frame IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m84149e("TXCMP4SWMuxer", "write frame IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m84827d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.f60265p;
        long j3 = j - j2;
        if (j2 < 0 || j3 < 0) {
            TXCLog.m84156w("TXCMP4SWMuxer", "drop sample. first frame offset timeus = " + this.f60265p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j3 < this.f60267r) {
            TXCLog.m84149e("TXCMP4SWMuxer", "audio is not in chronological order. current audio's pts pts(" + j3 + ") must larger than pre audio's pts(" + this.f60267r + ")");
            j3 = this.f60267r + 1;
        } else {
            this.f60267r = j3;
        }
        int i = this.f60254e;
        if (i != 2) {
            if (i == 3) {
                f = j3;
                f2 = f60251b;
            } else if (i == 4) {
                f = j3;
                f2 = f60250a;
            } else if (i == 1) {
                f = j3;
                f2 = f60252c;
            } else if (i == 0) {
                f = j3;
                f2 = f60253d;
            }
            j3 = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j3;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f60255f.m84839a(byteBuffer, 0, bufferInfo.offset, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
        } catch (IllegalArgumentException e) {
            TXCLog.m84149e("TXCMP4SWMuxer", "write sample IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m84149e("TXCMP4SWMuxer", "write sample IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: e */
    private ByteBuffer m84828e() {
        return this.f60257h.getByteBuffer("csd-0");
    }

    /* JADX INFO: renamed from: f */
    private ByteBuffer m84829f() {
        return this.f60257h.getByteBuffer("csd-1");
    }

    /* JADX INFO: renamed from: g */
    private long m84830g() {
        a aVarPeek;
        long j = this.f60263n.size() > 0 ? this.f60263n.peek().m84836b().presentationTimeUs : 0L;
        if (this.f60264o.size() > 0 && (aVarPeek = this.f60264o.peek()) != null && aVarPeek.m84836b() != null) {
            long j2 = this.f60264o.peek().m84836b().presentationTimeUs;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: h */
    private void m84831h() {
        while (this.f60263n.size() > 0) {
            a aVarPoll = this.f60263n.poll();
            m84825c(aVarPoll.m84835a(), aVarPoll.m84836b());
        }
        while (this.f60264o.size() > 0) {
            a aVarPoll2 = this.f60264o.poll();
            m84827d(aVarPoll2.m84835a(), aVarPoll2.m84836b());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m84832i() {
        while (this.f60263n.size() > 0) {
            a aVarPoll = this.f60263n.poll();
            m84823a(aVarPoll.m84836b().presentationTimeUs);
            m84825c(aVarPoll.m84835a(), aVarPoll.m84836b());
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized int mo84805a() {
        String str = this.f60256g;
        if (str != null && !str.isEmpty()) {
            if (!mo84812c()) {
                TXCLog.m84149e("TXCMP4SWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f60255f != null) {
                TXCLog.m84156w("TXCMP4SWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.m84147d("TXCMP4SWMuxer", "start");
            this.f60255f = new TXSWMuxerJNI();
            TXSWMuxerJNI.AVOptions aVOptions = new TXSWMuxerJNI.AVOptions();
            MediaFormat mediaFormat = this.f60257h;
            if (mediaFormat != null) {
                int integer = mediaFormat.getInteger("width");
                aVOptions.videoHeight = this.f60257h.getInteger("height");
                aVOptions.videoWidth = integer;
                aVOptions.videoGOP = this.f60257h.containsKey("i-frame-interval") ? this.f60257h.getInteger("i-frame-interval") : 3;
            }
            MediaFormat mediaFormat2 = this.f60258i;
            if (mediaFormat2 != null) {
                int integer2 = mediaFormat2.getInteger("channel-count");
                int integer3 = this.f60258i.getInteger("sample-rate");
                aVOptions.audioChannels = integer2;
                aVOptions.audioSampleRate = integer3;
            }
            ByteBuffer byteBufferM84828e = m84828e();
            ByteBuffer byteBufferM84829f = m84829f();
            ByteBuffer byteBufferM84826d = this.f60258i != null ? m84826d() : null;
            if (byteBufferM84828e != null && byteBufferM84829f != null) {
                if (this.f60258i != null && byteBufferM84826d == null) {
                    TXCLog.m84149e("TXCMP4SWMuxer", "audio format contains error csd!");
                    return -3;
                }
                this.f60255f.m84843a(byteBufferM84828e, byteBufferM84828e.capacity(), byteBufferM84829f, byteBufferM84829f.capacity());
                if (this.f60258i != null) {
                    this.f60255f.m84842a(byteBufferM84826d, byteBufferM84826d.capacity());
                }
                this.f60255f.m84840a(aVOptions);
                this.f60255f.m84841a(this.f60256g);
                this.f60255f.m84838a();
                this.f60265p = -1L;
                this.f60261l = true;
                this.f60262m = false;
                this.f60266q = -1L;
                this.f60267r = -1L;
                return 0;
            }
            TXCLog.m84149e("TXCMP4SWMuxer", "video format contains error csd!");
            return -3;
        }
        TXCLog.m84149e("TXCMP4SWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public synchronized int mo84809b() {
        if (this.f60255f != null) {
            m84831h();
            TXCLog.m84147d("TXCMP4SWMuxer", "stop. start flag = " + this.f60261l + ", video key frame set = " + this.f60262m);
            try {
                try {
                    if (this.f60261l && this.f60262m) {
                        this.f60255f.m84844b();
                    }
                    this.f60255f.m84845c();
                    this.f60261l = false;
                    this.f60255f = null;
                    this.f60262m = false;
                    this.f60263n.clear();
                    this.f60264o.clear();
                    this.f60257h = null;
                    this.f60258i = null;
                    this.f60266q = -1L;
                    this.f60267r = -1L;
                } catch (Exception e) {
                    TXCLog.m84149e("TXCMP4SWMuxer", "muxer stop/release exception: " + e);
                    this.f60261l = false;
                    this.f60255f = null;
                    this.f60262m = false;
                    this.f60263n.clear();
                    this.f60264o.clear();
                    this.f60257h = null;
                    this.f60258i = null;
                    this.f60266q = -1L;
                    this.f60267r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f60261l = false;
                this.f60255f = null;
                this.f60262m = false;
                this.f60263n.clear();
                this.f60264o.clear();
                this.f60257h = null;
                this.f60258i = null;
                this.f60266q = -1L;
                this.f60267r = -1L;
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: b */
    public synchronized void mo84810b(MediaFormat mediaFormat) {
        TXCLog.m84147d("TXCMP4SWMuxer", "addAudioTrack:" + mediaFormat);
        this.f60258i = mediaFormat;
        this.f60264o.clear();
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
        m84833a(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84834b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m84824a(false, byteBuffer, bufferInfo);
    }

    /* JADX INFO: renamed from: d */
    private ByteBuffer m84826d() {
        ByteBuffer byteBuffer = this.f60258i.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return byteBuffer;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo84812c() {
        return this.f60257h != null;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized void mo84806a(MediaFormat mediaFormat) {
        TXCLog.m84147d("TXCMP4SWMuxer", "addVideoTrack:" + mediaFormat);
        this.f60257h = mediaFormat;
        this.f60263n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14280a
    /* JADX INFO: renamed from: a */
    public synchronized void mo84807a(String str) {
        try {
            this.f60256g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f60256g);
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
                    TXCLog.m84150e("TXCMP4SWMuxer", "create new file failed.", e);
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
        m84834b(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m84833a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f60255f == null) {
            m84824a(true, byteBuffer, bufferInfo);
            TXCLog.m84156w("TXCMP4SWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f60265p < 0) {
            m84824a(true, byteBuffer, bufferInfo);
            this.f60265p = m84830g();
            TXCLog.m84147d("TXCMP4SWMuxer", "first frame offset = " + this.f60265p);
            m84832i();
        } else {
            m84823a(bufferInfo.presentationTimeUs);
            m84825c(byteBuffer, bufferInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84824a(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
            if (this.f60263n.size() < 200) {
                this.f60263n.add(aVar);
                return;
            } else {
                TXCLog.m84149e("TXCMP4SWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            }
        }
        this.f60264o.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m84823a(long j) {
        while (this.f60264o.size() > 0) {
            if (this.f60264o.peek().m84836b() == null) {
                TXCLog.m84149e("TXCMP4SWMuxer", "flushAudioCache, bufferInfo is null");
                this.f60264o.remove();
            } else {
                if (this.f60264o.peek().m84836b().presentationTimeUs >= j) {
                    return;
                }
                a aVarPoll = this.f60264o.poll();
                m84827d(aVarPoll.m84835a(), aVarPoll.m84836b());
            }
        }
    }
}
