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
public class C14120d implements InterfaceC14117a {

    /* JADX INFO: renamed from: a */
    public static float f59402a = 0.5f;

    /* JADX INFO: renamed from: b */
    public static float f59403b = 0.8f;

    /* JADX INFO: renamed from: c */
    public static float f59404c = 1.25f;

    /* JADX INFO: renamed from: d */
    public static float f59405d = 2.0f;

    /* JADX INFO: renamed from: f */
    private TXSWMuxerJNI f59407f;

    /* JADX INFO: renamed from: e */
    private int f59406e = 2;

    /* JADX INFO: renamed from: g */
    private String f59408g = null;

    /* JADX INFO: renamed from: h */
    private MediaFormat f59409h = null;

    /* JADX INFO: renamed from: i */
    private MediaFormat f59410i = null;

    /* JADX INFO: renamed from: j */
    private int f59411j = 0;

    /* JADX INFO: renamed from: k */
    private int f59412k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f59413l = false;

    /* JADX INFO: renamed from: m */
    private boolean f59414m = false;

    /* JADX INFO: renamed from: n */
    private ConcurrentLinkedQueue<a> f59415n = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: o */
    private ConcurrentLinkedQueue<a> f59416o = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: p */
    private long f59417p = -1;

    /* JADX INFO: renamed from: q */
    private long f59418q = -1;

    /* JADX INFO: renamed from: r */
    private long f59419r = -1;

    /* JADX INFO: renamed from: com.tencent.liteav.muxer.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        ByteBuffer f59420a;

        /* JADX INFO: renamed from: b */
        MediaCodec.BufferInfo f59421b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f59420a = byteBuffer;
            this.f59421b = bufferInfo;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m83652a() {
            return this.f59420a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m83653b() {
            return this.f59421b;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83642c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs - this.f59417p;
        if (j < 0) {
            TXCLog.m82966e("TXCMP4SWMuxer", "pts error! first frame offset timeus = " + this.f59417p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j = this.f59418q;
            if (j <= 0) {
                j = 0;
            }
        }
        if (j < this.f59418q) {
            TXCLog.m82973w("TXCMP4SWMuxer", "video is not in chronological order. current frame's pts(" + j + ") smaller than pre frame's pts(" + this.f59418q + ")");
        } else {
            this.f59418q = j;
        }
        int i = this.f59406e;
        if (i != 2) {
            if (i == 3) {
                f = j;
                f2 = f59403b;
            } else if (i == 4) {
                f = j;
                f2 = f59402a;
            } else if (i == 1) {
                f = j;
                f2 = f59404c;
            } else if (i == 0) {
                f = j;
                f2 = f59405d;
            }
            j = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f59407f.m83656a(byteBuffer, 1, bufferInfo.offset, bufferInfo.size, bufferInfo.flags == 1 ? 1 : 0, bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 1) != 0) {
                this.f59414m = true;
            }
        } catch (IllegalArgumentException e) {
            TXCLog.m82966e("TXCMP4SWMuxer", "write frame IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m82966e("TXCMP4SWMuxer", "write frame IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m83644d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.f59417p;
        long j3 = j - j2;
        if (j2 < 0 || j3 < 0) {
            TXCLog.m82973w("TXCMP4SWMuxer", "drop sample. first frame offset timeus = " + this.f59417p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j3 < this.f59419r) {
            TXCLog.m82966e("TXCMP4SWMuxer", "audio is not in chronological order. current audio's pts pts(" + j3 + ") must larger than pre audio's pts(" + this.f59419r + ")");
            j3 = this.f59419r + 1;
        } else {
            this.f59419r = j3;
        }
        int i = this.f59406e;
        if (i != 2) {
            if (i == 3) {
                f = j3;
                f2 = f59403b;
            } else if (i == 4) {
                f = j3;
                f2 = f59402a;
            } else if (i == 1) {
                f = j3;
                f2 = f59404c;
            } else if (i == 0) {
                f = j3;
                f2 = f59405d;
            }
            j3 = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j3;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f59407f.m83656a(byteBuffer, 0, bufferInfo.offset, bufferInfo.size, bufferInfo.flags, bufferInfo.presentationTimeUs);
        } catch (IllegalArgumentException e) {
            TXCLog.m82966e("TXCMP4SWMuxer", "write sample IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m82966e("TXCMP4SWMuxer", "write sample IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: e */
    private ByteBuffer m83645e() {
        return this.f59409h.getByteBuffer("csd-0");
    }

    /* JADX INFO: renamed from: f */
    private ByteBuffer m83646f() {
        return this.f59409h.getByteBuffer("csd-1");
    }

    /* JADX INFO: renamed from: g */
    private long m83647g() {
        a aVarPeek;
        long j = this.f59415n.size() > 0 ? this.f59415n.peek().m83653b().presentationTimeUs : 0L;
        if (this.f59416o.size() > 0 && (aVarPeek = this.f59416o.peek()) != null && aVarPeek.m83653b() != null) {
            long j2 = this.f59416o.peek().m83653b().presentationTimeUs;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: h */
    private void m83648h() {
        while (this.f59415n.size() > 0) {
            a aVarPoll = this.f59415n.poll();
            m83642c(aVarPoll.m83652a(), aVarPoll.m83653b());
        }
        while (this.f59416o.size() > 0) {
            a aVarPoll2 = this.f59416o.poll();
            m83644d(aVarPoll2.m83652a(), aVarPoll2.m83653b());
        }
    }

    /* JADX INFO: renamed from: i */
    private void m83649i() {
        while (this.f59415n.size() > 0) {
            a aVarPoll = this.f59415n.poll();
            m83640a(aVarPoll.m83653b().presentationTimeUs);
            m83642c(aVarPoll.m83652a(), aVarPoll.m83653b());
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized int mo83622a() {
        String str = this.f59408g;
        if (str != null && !str.isEmpty()) {
            if (!mo83629c()) {
                TXCLog.m82966e("TXCMP4SWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f59407f != null) {
                TXCLog.m82973w("TXCMP4SWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.m82964d("TXCMP4SWMuxer", "start");
            this.f59407f = new TXSWMuxerJNI();
            TXSWMuxerJNI.AVOptions aVOptions = new TXSWMuxerJNI.AVOptions();
            MediaFormat mediaFormat = this.f59409h;
            if (mediaFormat != null) {
                int integer = mediaFormat.getInteger("width");
                aVOptions.videoHeight = this.f59409h.getInteger("height");
                aVOptions.videoWidth = integer;
                aVOptions.videoGOP = this.f59409h.containsKey("i-frame-interval") ? this.f59409h.getInteger("i-frame-interval") : 3;
            }
            MediaFormat mediaFormat2 = this.f59410i;
            if (mediaFormat2 != null) {
                int integer2 = mediaFormat2.getInteger("channel-count");
                int integer3 = this.f59410i.getInteger("sample-rate");
                aVOptions.audioChannels = integer2;
                aVOptions.audioSampleRate = integer3;
            }
            ByteBuffer byteBufferM83645e = m83645e();
            ByteBuffer byteBufferM83646f = m83646f();
            ByteBuffer byteBufferM83643d = this.f59410i != null ? m83643d() : null;
            if (byteBufferM83645e != null && byteBufferM83646f != null) {
                if (this.f59410i != null && byteBufferM83643d == null) {
                    TXCLog.m82966e("TXCMP4SWMuxer", "audio format contains error csd!");
                    return -3;
                }
                this.f59407f.m83660a(byteBufferM83645e, byteBufferM83645e.capacity(), byteBufferM83646f, byteBufferM83646f.capacity());
                if (this.f59410i != null) {
                    this.f59407f.m83659a(byteBufferM83643d, byteBufferM83643d.capacity());
                }
                this.f59407f.m83657a(aVOptions);
                this.f59407f.m83658a(this.f59408g);
                this.f59407f.m83655a();
                this.f59417p = -1L;
                this.f59413l = true;
                this.f59414m = false;
                this.f59418q = -1L;
                this.f59419r = -1L;
                return 0;
            }
            TXCLog.m82966e("TXCMP4SWMuxer", "video format contains error csd!");
            return -3;
        }
        TXCLog.m82966e("TXCMP4SWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public synchronized int mo83626b() {
        if (this.f59407f != null) {
            m83648h();
            TXCLog.m82964d("TXCMP4SWMuxer", "stop. start flag = " + this.f59413l + ", video key frame set = " + this.f59414m);
            try {
                try {
                    if (this.f59413l && this.f59414m) {
                        this.f59407f.m83661b();
                    }
                    this.f59407f.m83662c();
                    this.f59413l = false;
                    this.f59407f = null;
                    this.f59414m = false;
                    this.f59415n.clear();
                    this.f59416o.clear();
                    this.f59409h = null;
                    this.f59410i = null;
                    this.f59418q = -1L;
                    this.f59419r = -1L;
                } catch (Exception e) {
                    TXCLog.m82966e("TXCMP4SWMuxer", "muxer stop/release exception: " + e);
                    this.f59413l = false;
                    this.f59407f = null;
                    this.f59414m = false;
                    this.f59415n.clear();
                    this.f59416o.clear();
                    this.f59409h = null;
                    this.f59410i = null;
                    this.f59418q = -1L;
                    this.f59419r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f59413l = false;
                this.f59407f = null;
                this.f59414m = false;
                this.f59415n.clear();
                this.f59416o.clear();
                this.f59409h = null;
                this.f59410i = null;
                this.f59418q = -1L;
                this.f59419r = -1L;
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public synchronized void mo83627b(MediaFormat mediaFormat) {
        TXCLog.m82964d("TXCMP4SWMuxer", "addAudioTrack:" + mediaFormat);
        this.f59410i = mediaFormat;
        this.f59416o.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public synchronized void mo83628b(byte[] bArr, int i, int i2, long j, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.put(bArr, i, i2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j;
        bufferInfo.offset = 0;
        bufferInfo.size = i2;
        bufferInfo.flags = i3;
        m83650a(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83651b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m83641a(false, byteBuffer, bufferInfo);
    }

    /* JADX INFO: renamed from: d */
    private ByteBuffer m83643d() {
        ByteBuffer byteBuffer = this.f59410i.getByteBuffer("csd-0");
        if (byteBuffer != null) {
            byteBuffer.position(0);
        }
        return byteBuffer;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo83629c() {
        return this.f59409h != null;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized void mo83623a(MediaFormat mediaFormat) {
        TXCLog.m82964d("TXCMP4SWMuxer", "addVideoTrack:" + mediaFormat);
        this.f59409h = mediaFormat;
        this.f59415n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized void mo83624a(String str) {
        try {
            this.f59408g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f59408g);
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
                    TXCLog.m82967e("TXCMP4SWMuxer", "create new file failed.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized void mo83625a(byte[] bArr, int i, int i2, long j, int i3) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
        byteBufferAllocateDirect.put(bArr, i, i2);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.presentationTimeUs = j;
        bufferInfo.offset = 0;
        bufferInfo.size = i2;
        bufferInfo.flags = i3;
        m83651b(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83650a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f59407f == null) {
            m83641a(true, byteBuffer, bufferInfo);
            TXCLog.m82973w("TXCMP4SWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f59417p < 0) {
            m83641a(true, byteBuffer, bufferInfo);
            this.f59417p = m83647g();
            TXCLog.m82964d("TXCMP4SWMuxer", "first frame offset = " + this.f59417p);
            m83649i();
        } else {
            m83640a(bufferInfo.presentationTimeUs);
            m83642c(byteBuffer, bufferInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83641a(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
            if (this.f59415n.size() < 200) {
                this.f59415n.add(aVar);
                return;
            } else {
                TXCLog.m82966e("TXCMP4SWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            }
        }
        this.f59416o.add(aVar);
    }

    /* JADX INFO: renamed from: a */
    private void m83640a(long j) {
        while (this.f59416o.size() > 0) {
            if (this.f59416o.peek().m83653b() == null) {
                TXCLog.m82966e("TXCMP4SWMuxer", "flushAudioCache, bufferInfo is null");
                this.f59416o.remove();
            } else {
                if (this.f59416o.peek().m83653b().presentationTimeUs >= j) {
                    return;
                }
                a aVarPoll = this.f59416o.poll();
                m83644d(aVarPoll.m83652a(), aVarPoll.m83653b());
            }
        }
    }
}
