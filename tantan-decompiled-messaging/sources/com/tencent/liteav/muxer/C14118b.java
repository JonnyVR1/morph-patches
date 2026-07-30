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
public class C14118b implements InterfaceC14117a {

    /* JADX INFO: renamed from: a */
    public static float f59380a = 0.5f;

    /* JADX INFO: renamed from: b */
    public static float f59381b = 0.8f;

    /* JADX INFO: renamed from: c */
    public static float f59382c = 1.25f;

    /* JADX INFO: renamed from: d */
    public static float f59383d = 2.0f;

    /* JADX INFO: renamed from: f */
    private MediaMuxer f59385f;

    /* JADX INFO: renamed from: e */
    private int f59384e = 2;

    /* JADX INFO: renamed from: g */
    private String f59386g = null;

    /* JADX INFO: renamed from: h */
    private MediaFormat f59387h = null;

    /* JADX INFO: renamed from: i */
    private MediaFormat f59388i = null;

    /* JADX INFO: renamed from: j */
    private int f59389j = 0;

    /* JADX INFO: renamed from: k */
    private int f59390k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f59391l = false;

    /* JADX INFO: renamed from: m */
    private boolean f59392m = false;

    /* JADX INFO: renamed from: n */
    private ConcurrentLinkedQueue<a> f59393n = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: o */
    private ConcurrentLinkedQueue<a> f59394o = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: p */
    private long f59395p = -1;

    /* JADX INFO: renamed from: q */
    private long f59396q = -1;

    /* JADX INFO: renamed from: r */
    private long f59397r = -1;

    /* JADX INFO: renamed from: com.tencent.liteav.muxer.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        ByteBuffer f59398a;

        /* JADX INFO: renamed from: b */
        MediaCodec.BufferInfo f59399b;

        public a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            this.f59398a = byteBuffer;
            this.f59399b = bufferInfo;
        }

        /* JADX INFO: renamed from: a */
        public ByteBuffer m83637a() {
            return this.f59398a;
        }

        /* JADX INFO: renamed from: b */
        public MediaCodec.BufferInfo m83638b() {
            return this.f59399b;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m83631c(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs - this.f59395p;
        if (j < 0) {
            TXCLog.m82966e("TXCMP4HWMuxer", "pts error! first frame offset timeus = " + this.f59395p + ", current timeus = " + bufferInfo.presentationTimeUs);
            j = this.f59396q;
            if (j <= 0) {
                j = 0;
            }
        }
        if (j < this.f59396q) {
            TXCLog.m82973w("TXCMP4HWMuxer", "video is not in chronological order. current frame's pts(" + j + ") smaller than pre frame's pts(" + this.f59396q + ")");
        } else {
            this.f59396q = j;
        }
        int i = this.f59384e;
        if (i != 2) {
            if (i == 3) {
                f = j;
                f2 = f59381b;
            } else if (i == 4) {
                f = j;
                f2 = f59380a;
            } else if (i == 1) {
                f = j;
                f2 = f59382c;
            } else if (i == 0) {
                f = j;
                f2 = f59383d;
            }
            j = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j;
        try {
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.f59385f.writeSampleData(this.f59390k, byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f59392m = true;
            }
        } catch (IllegalArgumentException e) {
            TXCLog.m82966e("TXCMP4HWMuxer", "write frame IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m82966e("TXCMP4HWMuxer", "write frame IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m83633d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        float f;
        float f2;
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.f59395p;
        long j3 = j - j2;
        if (j2 < 0 || j3 < 0) {
            TXCLog.m82973w("TXCMP4HWMuxer", "drop sample. first frame offset timeus = " + this.f59395p + ", current sample timeus = " + bufferInfo.presentationTimeUs);
            return;
        }
        if (j3 < this.f59397r) {
            TXCLog.m82966e("TXCMP4HWMuxer", "audio is not in chronological order. current audio's pts pts(" + j3 + ") must larger than pre audio's pts(" + this.f59397r + ")");
            j3 = this.f59397r + 1;
        } else {
            this.f59397r = j3;
        }
        int i = this.f59384e;
        if (i != 2) {
            if (i == 3) {
                f = j3;
                f2 = f59381b;
            } else if (i == 4) {
                f = j3;
                f2 = f59380a;
            } else if (i == 1) {
                f = j3;
                f2 = f59382c;
            } else if (i == 0) {
                f = j3;
                f2 = f59383d;
            }
            j3 = (long) (f * f2);
        }
        bufferInfo.presentationTimeUs = j3;
        try {
            this.f59385f.writeSampleData(this.f59389j, byteBuffer, bufferInfo);
        } catch (IllegalArgumentException e) {
            TXCLog.m82966e("TXCMP4HWMuxer", "write sample IllegalArgumentException: " + e);
        } catch (IllegalStateException e2) {
            TXCLog.m82966e("TXCMP4HWMuxer", "write sample IllegalStateException: " + e2);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m83634e() {
        while (this.f59393n.size() > 0) {
            a aVarPoll = this.f59393n.poll();
            m83631c(aVarPoll.m83637a(), aVarPoll.m83638b());
        }
        while (this.f59394o.size() > 0) {
            a aVarPoll2 = this.f59394o.poll();
            m83633d(aVarPoll2.m83637a(), aVarPoll2.m83638b());
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized int mo83622a() {
        MediaFormat mediaFormat;
        String str = this.f59386g;
        if (str != null && !str.isEmpty()) {
            if (!mo83629c()) {
                TXCLog.m82966e("TXCMP4HWMuxer", "video track not set yet!");
                return -2;
            }
            if (this.f59385f != null) {
                TXCLog.m82973w("TXCMP4HWMuxer", "start has been called. stop must be called before start");
                return 0;
            }
            TXCLog.m82964d("TXCMP4HWMuxer", "start");
            try {
                MediaMuxer mediaMuxer = new MediaMuxer(this.f59386g, 0);
                this.f59385f = mediaMuxer;
                MediaFormat mediaFormat2 = this.f59387h;
                if (mediaFormat2 == null) {
                    mediaFormat = this.f59388i;
                    if (mediaFormat != null) {
                        this.f59389j = this.f59385f.addTrack(mediaFormat);
                    }
                    this.f59385f.start();
                    this.f59395p = -1L;
                    this.f59391l = true;
                    this.f59392m = false;
                    this.f59396q = -1L;
                    this.f59397r = -1L;
                    return 0;
                }
                try {
                    this.f59390k = mediaMuxer.addTrack(mediaFormat2);
                    mediaFormat = this.f59388i;
                    if (mediaFormat != null) {
                        try {
                            this.f59389j = this.f59385f.addTrack(mediaFormat);
                        } catch (IllegalArgumentException e) {
                            TXCLog.m82966e("TXCMP4HWMuxer", "addAudioTrack IllegalArgumentException: " + e);
                            return -7;
                        } catch (IllegalStateException e2) {
                            TXCLog.m82966e("TXCMP4HWMuxer", "addAudioTrack IllegalStateException: " + e2);
                            return -8;
                        }
                    }
                    this.f59385f.start();
                    this.f59395p = -1L;
                    this.f59391l = true;
                    this.f59392m = false;
                    this.f59396q = -1L;
                    this.f59397r = -1L;
                    return 0;
                } catch (IllegalArgumentException e3) {
                    TXCLog.m82966e("TXCMP4HWMuxer", "addVideoTrack IllegalArgumentException: " + e3);
                    return -5;
                } catch (IllegalStateException e4) {
                    TXCLog.m82966e("TXCMP4HWMuxer", "addVideoTrack IllegalStateException: " + e4);
                    return -6;
                }
            } catch (IOException e5) {
                TXCLog.m82966e("TXCMP4HWMuxer", "create MediaMuxer exception:" + e5);
                return -4;
            }
            throw th;
        }
        TXCLog.m82966e("TXCMP4HWMuxer", "target path not set yet!");
        return -1;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public synchronized int mo83626b() {
        if (this.f59385f != null) {
            TXCLog.m82964d("TXCMP4HWMuxer", "stop. start flag = " + this.f59391l + ", video key frame set = " + this.f59392m);
            try {
                try {
                    if (this.f59391l && this.f59392m) {
                        this.f59385f.stop();
                    }
                    this.f59385f.release();
                    this.f59391l = false;
                    this.f59385f = null;
                    this.f59392m = false;
                    this.f59393n.clear();
                    this.f59394o.clear();
                    this.f59387h = null;
                    this.f59388i = null;
                    this.f59396q = -1L;
                    this.f59397r = -1L;
                } catch (Exception e) {
                    TXCLog.m82966e("TXCMP4HWMuxer", "muxer stop/release exception: " + e);
                    this.f59391l = false;
                    this.f59385f = null;
                    this.f59392m = false;
                    this.f59393n.clear();
                    this.f59394o.clear();
                    this.f59387h = null;
                    this.f59388i = null;
                    this.f59396q = -1L;
                    this.f59397r = -1L;
                    return -1;
                }
            } catch (Throwable th) {
                this.f59391l = false;
                this.f59385f = null;
                this.f59392m = false;
                this.f59393n.clear();
                this.f59394o.clear();
                this.f59387h = null;
                this.f59388i = null;
                this.f59396q = -1L;
                this.f59397r = -1L;
                throw th;
            }
        }
        return 0;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: b */
    public synchronized void mo83627b(MediaFormat mediaFormat) {
        TXCLog.m82964d("TXCMP4HWMuxer", "addAudioTrack:" + mediaFormat);
        this.f59388i = mediaFormat;
        this.f59394o.clear();
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
        m83635a(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m83636b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f59385f != null && this.f59395p >= 0) {
            m83633d(byteBuffer, bufferInfo);
            return;
        }
        TXCLog.m82964d("TXCMP4HWMuxer", "cache sample before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
        m83630a(false, byteBuffer, bufferInfo);
    }

    /* JADX INFO: renamed from: d */
    private long m83632d() {
        a aVarPeek;
        long j = this.f59393n.size() > 0 ? this.f59393n.peek().m83638b().presentationTimeUs : 0L;
        if (this.f59394o.size() > 0 && (aVarPeek = this.f59394o.peek()) != null && aVarPeek.m83638b() != null) {
            long j2 = this.f59394o.peek().m83638b().presentationTimeUs;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo83629c() {
        return this.f59387h != null;
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized void mo83623a(MediaFormat mediaFormat) {
        TXCLog.m82964d("TXCMP4HWMuxer", "addVideoTrack:" + mediaFormat);
        this.f59387h = mediaFormat;
        this.f59393n.clear();
    }

    @Override // com.tencent.liteav.muxer.InterfaceC14117a
    /* JADX INFO: renamed from: a */
    public synchronized void mo83624a(String str) {
        try {
            this.f59386g = str;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(this.f59386g);
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
                    TXCLog.m82967e("TXCMP4HWMuxer", "create new file failed.", e);
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
        m83636b(byteBufferAllocateDirect, bufferInfo);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m83635a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f59385f == null) {
            m83630a(true, byteBuffer, bufferInfo);
            TXCLog.m82973w("TXCMP4HWMuxer", "cache frame before muexer ready. ptsUs: " + bufferInfo.presentationTimeUs);
            return;
        }
        if (this.f59395p < 0) {
            m83630a(true, byteBuffer, bufferInfo);
            this.f59395p = m83632d();
            TXCLog.m82964d("TXCMP4HWMuxer", "first frame offset = " + this.f59395p);
            m83634e();
        } else {
            m83631c(byteBuffer, bufferInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83630a(boolean z, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
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
            if (this.f59393n.size() >= 200) {
                TXCLog.m82966e("TXCMP4HWMuxer", "drop video frame. video cache size is larger than 200");
                return;
            } else {
                this.f59393n.add(aVar);
                return;
            }
        }
        if (this.f59394o.size() >= 600) {
            TXCLog.m82966e("TXCMP4HWMuxer", "drop audio frame. audio cache size is larger than 600");
        } else {
            this.f59394o.add(aVar);
        }
    }
}
