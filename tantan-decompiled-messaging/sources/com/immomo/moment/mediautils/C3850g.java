package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import p149l.u460;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.g */
/* JADX INFO: loaded from: classes7.dex */
public class C3850g extends AbstractC3856m {

    /* JADX INFO: renamed from: K */
    private FFVideoDecoder f13317K = new FFVideoDecoder();

    /* JADX INFO: renamed from: L */
    private c f13318L = new c();

    /* JADX INFO: renamed from: M */
    private b f13319M = new b();

    /* JADX INFO: renamed from: N */
    private Thread f13320N = null;

    /* JADX INFO: renamed from: O */
    private Thread f13321O = null;

    /* JADX INFO: renamed from: P */
    private boolean f13322P = false;

    /* JADX INFO: renamed from: Q */
    private boolean f13323Q = false;

    /* JADX INFO: renamed from: R */
    private boolean f13324R = false;

    /* JADX INFO: renamed from: S */
    private boolean f13325S = true;

    /* JADX INFO: renamed from: T */
    private long f13326T = 0;

    /* JADX INFO: renamed from: U */
    private long f13327U = 0;

    /* JADX INFO: renamed from: V */
    private Thread f13328V = null;

    /* JADX INFO: renamed from: W */
    private boolean f13329W = false;

    /* JADX INFO: renamed from: X */
    private boolean f13330X = false;

    /* JADX INFO: renamed from: Y */
    private boolean f13331Y = false;

    /* JADX INFO: renamed from: Z */
    private boolean f13332Z = false;

    /* JADX INFO: renamed from: a0 */
    private boolean f13333a0 = true;

    /* JADX INFO: renamed from: b0 */
    private Boolean f13334b0 = Boolean.FALSE;

    /* JADX INFO: renamed from: c0 */
    private Object f13335c0 = new Object();

    /* JADX INFO: renamed from: d0 */
    private Object f13336d0 = new Object();

    /* JADX INFO: renamed from: e0 */
    private Object f13337e0 = new Object();

    /* JADX INFO: renamed from: f0 */
    private int f13338f0 = 1;

    /* JADX INFO: renamed from: g0 */
    private LinkedList<ByteBuffer> f13339g0 = new LinkedList<>();

    /* JADX INFO: renamed from: h0 */
    protected long f13340h0 = -1;

    /* JADX INFO: renamed from: i0 */
    protected long f13341i0 = 0;

    /* JADX INFO: renamed from: j0 */
    protected long f13342j0 = -1;

    /* JADX INFO: renamed from: k0 */
    Runnable f13343k0 = new a();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.g$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0081  */
        @Override // java.lang.Runnable
        public void run() {
            long j;
            C3850g c3850g = C3850g.this;
            if (c3850g.f13528f <= 0) {
                c3850g.f13528f = c3850g.f13525c;
            }
            if (c3850g.f13530h <= 0) {
                c3850g.f13530h = c3850g.f13527e;
            }
            if (c3850g.f13529g <= 0) {
                c3850g.f13529g = c3850g.f13526d;
            }
            if (c3850g.f13513A == null) {
                c3850g.f13513A = new MediaFormat();
            }
            C3850g c3850g2 = C3850g.this;
            c3850g2.f13513A.setInteger("channel-count", c3850g2.f13530h);
            C3850g c3850g3 = C3850g.this;
            c3850g3.f13513A.setInteger("sample-rate", c3850g3.f13528f);
            C3850g c3850g4 = C3850g.this;
            c3850g4.f13513A.setInteger("bit-width", c3850g4.f13529g);
            C3850g c3850g5 = C3850g.this;
            AbstractC3856m.c cVar = c3850g5.f13546x;
            if (cVar != null) {
                cVar.mo18942d(c3850g5.f13513A);
            }
            C3850g c3850g6 = C3850g.this;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((c3850g6.f13529g * 1024) * c3850g6.f13530h) / 8);
            C3850g c3850g7 = C3850g.this;
            long j2 = c3850g7.f13537o;
            if (j2 >= 0) {
                long j3 = c3850g7.f13539q;
                if (j3 <= 0 || j3 <= j2) {
                    j = c3850g7.f13535m;
                    j2 = 0;
                } else {
                    long j4 = j3 - j2;
                    j = c3850g7.f13535m;
                    if (j4 <= j) {
                        j = j4 + j2;
                    }
                }
            } else {
                j = c3850g7.f13535m;
                j2 = 0;
            }
            while (!C3850g.this.f13324R) {
                if (C3850g.this.f13329W || C3850g.this.f13327U - C3850g.this.f13326T > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                    if (C3850g.this.f13329W) {
                        j2 = 0;
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    C3850g c3850g8 = C3850g.this;
                    if (j2 <= j) {
                        if (c3850g8.f13546x != null) {
                            byteBufferAllocate.position(0);
                            C3850g.this.f13546x.mo18943e(byteBufferAllocate, byteBufferAllocate.capacity(), j2);
                        }
                        C3850g c3850g9 = C3850g.this;
                        j2 = (long) (j2 + ((1024.0d / ((double) c3850g9.f13528f)) * 1000000.0d));
                        c3850g9.f13327U = j2;
                    } else {
                        if (c3850g8.f13541s) {
                            break;
                        }
                        if (c3850g8.f13546x != null && !c3850g8.f13322P) {
                            C3850g.this.f13546x.mo18941c();
                            C3850g.this.f13322P = true;
                        }
                        try {
                            Thread.sleep(5L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            C3850g c3850g10 = C3850g.this;
            if (c3850g10.f13546x == null || !c3850g10.f13333a0) {
                return;
            }
            if (!C3850g.this.f13322P) {
                C3850g.this.f13546x.mo18941c();
                C3850g.this.f13322P = true;
            }
            C3850g.this.f13546x.mo18940a();
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.g$b */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:55:0x0105  */
        /* JADX WARN: Code duplicated, block: B:67:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x011f A[EDGE_INSN: B:72:0x011f->B:65:0x011f BREAK  A[LOOP:0: B:8:0x000e->B:73:0x000e, LOOP_LABEL: LOOP:0: B:8:0x000e->B:73:0x000e], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x000f A[SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            C3850g c3850g;
            AbstractC3856m.e eVar;
            MediaFormat mediaFormat;
            C3850g c3850g2 = C3850g.this;
            AbstractC3856m.c cVar = c3850g2.f13546x;
            if (cVar != null && (mediaFormat = c3850g2.f13513A) != null) {
                cVar.mo18942d(mediaFormat);
            }
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (C3850g.this.f13324R) {
                        break loop0;
                    }
                    if (!C3850g.this.f13329W) {
                        C3850g c3850g3 = C3850g.this;
                        if (c3850g3.f13546x != null && c3850g3.f13317K.getAudioFrameCnt() > 0) {
                            System.currentTimeMillis();
                            u460 audioFrame = C3850g.this.f13317K.getAudioFrame();
                            if (audioFrame == null) {
                                continue;
                            } else {
                                MediaCodec.BufferInfo bufferInfoM191673b = audioFrame.m191673b();
                                if (C3850g.this.m18784Y(bufferInfoM191673b.presentationTimeUs)) {
                                    C3850g.this.f13546x.mo18943e(audioFrame.m191672a(), bufferInfoM191673b.size, bufferInfoM191673b.presentationTimeUs);
                                    System.currentTimeMillis();
                                    if (C3850g.this.f13329W) {
                                        synchronized (C3850g.this.f13336d0) {
                                            C3850g.this.f13330X = true;
                                            C3850g.this.f13336d0.notifyAll();
                                        }
                                    }
                                    if (!C3850g.this.f13322P && C3850g.this.f13317K.getStatus() != 0) {
                                        c3850g = C3850g.this;
                                        if (c3850g.f13546x != null && !c3850g.f13322P && (C3850g.this.f13338f0 & 1) != 0) {
                                            MDLog.m7389d("FFDecoderWrapper", "Audio Decoder finished!");
                                            C3850g.this.f13546x.mo18941c();
                                            C3850g.this.f13546x.mo18940a();
                                            C3850g.this.f13322P = true;
                                            eVar = C3850g.this.f13547y;
                                            if (eVar != null) {
                                                eVar.mo18948e(null);
                                            }
                                        }
                                        if (C3850g.this.f13541s) {
                                            break loop0;
                                        }
                                    }
                                    if (z) {
                                        break;
                                    }
                                } else {
                                    long j = bufferInfoM191673b.presentationTimeUs;
                                    C3850g c3850g4 = C3850g.this;
                                    if (j > c3850g4.f13539q && c3850g4.f13546x != null && !c3850g4.f13322P && (C3850g.this.f13338f0 & 1) != 0) {
                                        MDLog.m7389d("FFDecoderWrapper", "Audio Decoder finished!");
                                        C3850g.this.f13546x.mo18941c();
                                        C3850g.this.f13546x.mo18940a();
                                        C3850g.this.f13322P = true;
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                    if (C3850g.this.f13329W) {
                        synchronized (C3850g.this.f13336d0) {
                            C3850g.this.f13330X = true;
                            C3850g.this.f13336d0.notifyAll();
                        }
                    }
                    if (!C3850g.this.f13322P) {
                        c3850g = C3850g.this;
                        if (c3850g.f13546x != null) {
                            MDLog.m7389d("FFDecoderWrapper", "Audio Decoder finished!");
                            C3850g.this.f13546x.mo18941c();
                            C3850g.this.f13546x.mo18940a();
                            C3850g.this.f13322P = true;
                            eVar = C3850g.this.f13547y;
                            if (eVar != null) {
                                eVar.mo18948e(null);
                            }
                        }
                        if (C3850g.this.f13541s) {
                            break loop0;
                            break loop0;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            MDLog.m7389d("FFDecoderWrapper", "Fetch Audio Thread exit!");
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.g$c */
    public class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:104:0x000f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:66:0x0130  */
        /* JADX WARN: Code duplicated, block: B:82:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0149 A[EDGE_INSN: B:85:0x0149->B:76:0x0149 BREAK  A[LOOP:0: B:8:0x000e->B:86:0x000e, LOOP_LABEL: LOOP:0: B:8:0x000e->B:86:0x000e], SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            C3850g c3850g;
            AbstractC3856m.e eVar;
            MediaFormat mediaFormat;
            C3850g c3850g2 = C3850g.this;
            AbstractC3856m.e eVar2 = c3850g2.f13547y;
            if (eVar2 != null && (mediaFormat = c3850g2.f13514B) != null) {
                eVar2.mo18947d(mediaFormat);
            }
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (C3850g.this.f13324R) {
                        break loop0;
                    }
                    C3850g c3850g3 = C3850g.this;
                    if (c3850g3.f13547y == null || c3850g3.f13329W || C3850g.this.f13339g0.size() >= 3 || C3850g.this.f13317K.getVideoFrameCnt() <= 0) {
                        z = true;
                        if (C3850g.this.f13329W) {
                            synchronized (C3850g.this.f13335c0) {
                                C3850g.this.f13331Y = true;
                                C3850g.this.f13335c0.notifyAll();
                            }
                        }
                        if (!C3850g.this.f13323Q && C3850g.this.f13317K.getStatus() != 0) {
                            c3850g = C3850g.this;
                            if (c3850g.f13547y != null && !c3850g.f13323Q && (C3850g.this.f13338f0 & 16) != 0) {
                                MDLog.m7389d("FFDecoderWrapper", "Video decoder finished!");
                                C3850g.this.f13547y.mo18946c();
                                C3850g.this.f13547y.mo18944a();
                                C3850g.this.f13323Q = true;
                                eVar = C3850g.this.f13547y;
                                if (eVar != null) {
                                    eVar.mo18948e(null);
                                }
                            }
                            if (C3850g.this.f13541s) {
                                break loop0;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        u460 videoFrame = C3850g.this.f13317K.getVideoFrame();
                        if (videoFrame == null) {
                            continue;
                        } else {
                            MediaCodec.BufferInfo bufferInfoM191673b = videoFrame.m191673b();
                            synchronized (C3850g.this.f13337e0) {
                                C3850g.this.f13339g0.offer(videoFrame.m191672a());
                            }
                            C3850g.this.f13326T = bufferInfoM191673b.presentationTimeUs;
                            if (C3850g.this.m18785Z(bufferInfoM191673b.presentationTimeUs)) {
                                C3850g.this.f13547y.mo18948e(bufferInfoM191673b);
                                if (C3850g.this.f13329W) {
                                    synchronized (C3850g.this.f13335c0) {
                                        C3850g.this.f13331Y = true;
                                        C3850g.this.f13335c0.notifyAll();
                                    }
                                }
                                if (!C3850g.this.f13323Q) {
                                    c3850g = C3850g.this;
                                    if (c3850g.f13547y != null) {
                                        MDLog.m7389d("FFDecoderWrapper", "Video decoder finished!");
                                        C3850g.this.f13547y.mo18946c();
                                        C3850g.this.f13547y.mo18944a();
                                        C3850g.this.f13323Q = true;
                                        eVar = C3850g.this.f13547y;
                                        if (eVar != null) {
                                            eVar.mo18948e(null);
                                        }
                                    }
                                    if (C3850g.this.f13541s) {
                                        break loop0;
                                        break loop0;
                                    }
                                }
                                if (z) {
                                    break;
                                }
                            } else {
                                long j = bufferInfoM191673b.presentationTimeUs;
                                C3850g c3850g4 = C3850g.this;
                                if (j > c3850g4.f13539q && c3850g4.f13547y != null && !c3850g4.f13323Q && (C3850g.this.f13338f0 & 16) != 0) {
                                    MDLog.m7389d("FFDecoderWrapper", "Video decoder finished!");
                                    C3850g.this.f13547y.mo18946c();
                                    C3850g.this.f13547y.mo18944a();
                                    C3850g.this.f13323Q = true;
                                    AbstractC3856m.e eVar3 = C3850g.this.f13547y;
                                    if (eVar3 != null) {
                                        eVar3.mo18948e(null);
                                    }
                                }
                            }
                        }
                    }
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            MDLog.m7389d("FFDecoderWrapper", "Fetch Video Thread exit!");
        }
    }

    public C3850g() {
        this.f13537o = 0L;
        this.f13539q = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public boolean m18784Y(long j) {
        long j2 = this.f13340h0;
        if (j2 >= 0) {
            long j3 = this.f13342j0;
            if (j3 > 0 && j3 > j2) {
                if (j >= this.f13341i0 && j <= j3) {
                    return true;
                }
                MDLog.m7389d("FFDecoderWrapper", "out of range curPts:" + j + " mStartPtsUs:" + this.f13537o + " mEndPtsUs:" + this.f13539q + " mSeekStartPts:" + this.f13538p);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public boolean m18785Z(long j) {
        long j2 = this.f13537o;
        if (j2 >= 0) {
            long j3 = this.f13539q;
            if (j3 > 0 && j3 > j2) {
                if (j >= this.f13538p && j <= j3) {
                    return true;
                }
                MDLog.m7389d("FFDecoderWrapper", "out of range curPts:" + j + " mStartPtsUs:" + this.f13537o + " mEndPtsUs:" + this.f13539q + " mSeekStartPts:" + this.f13538p);
                return false;
            }
        }
        return true;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: B */
    public boolean mo18786B() {
        MDLog.m7389d("FFDecoderWrapper", "start pid:" + Thread.currentThread().getId());
        if (this.f13334b0.booleanValue()) {
            m18788a0(this.f13537o);
            mo18793s();
            this.f13538p = this.f13537o;
            return true;
        }
        this.f13334b0 = Boolean.valueOf(this.f13317K.start());
        this.f13329W = false;
        Thread thread = new Thread(this.f13318L, "getMeidaTh");
        this.f13320N = thread;
        thread.start();
        Thread thread2 = new Thread(this.f13319M, "getAMeidaTh");
        this.f13321O = thread2;
        thread2.start();
        this.f13538p = this.f13537o;
        return this.f13334b0.booleanValue();
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: C */
    public boolean mo18787C(long j) {
        MDLog.m7389d("FFDecoderWrapper", "startWidthTime ptsUs:" + j + " pid:" + Thread.currentThread().getId());
        if (this.f13334b0.booleanValue()) {
            MDLog.m7389d("FFDecoderWrapper", "already decoding");
            if (this.f13521I) {
                this.f13538p = 0L;
                this.f13539q -= j;
                this.f13340h0 = 0L;
                this.f13341i0 = j;
                this.f13342j0 = this.f13535m;
            } else {
                this.f13538p = j;
            }
            m18788a0(j);
            mo18793s();
            return true;
        }
        MDLog.m7389d("FFDecoderWrapper", "start decoding");
        this.f13317K.seek(j);
        this.f13334b0 = Boolean.valueOf(this.f13317K.start());
        Thread thread = new Thread(this.f13318L, "getMeidaTh");
        this.f13320N = thread;
        thread.start();
        Thread thread2 = new Thread(this.f13319M, "getAMeidaTh");
        this.f13321O = thread2;
        thread2.start();
        if (this.f13521I) {
            this.f13538p = 0L;
            this.f13539q -= j;
        } else {
            this.f13538p = j;
        }
        return this.f13334b0.booleanValue();
    }

    /* JADX INFO: renamed from: a0 */
    public void m18788a0(long j) {
        MDLog.m7389d("FFDecoderWrapper", "seek:" + j);
        synchronized (this.f13337e0) {
            this.f13339g0.clear();
        }
        this.f13317K.seek(j / 1000);
        this.f13327U = 0L;
        this.f13322P = false;
        this.f13323Q = false;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: o */
    public void mo18789o() {
        MDLog.m7389d("FFDecoderWrapper", "pause");
        this.f13329W = true;
        this.f13317K.pause();
        synchronized (this.f13335c0) {
            while (!this.f13331Y) {
                try {
                    this.f13335c0.wait(15L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (this.f13336d0) {
            while (!this.f13330X) {
                try {
                    this.f13336d0.wait(15L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: p */
    public boolean mo18790p(String str, int i) {
        MDLog.m7389d("FFDecoderWrapper", "prepare path:" + str + " sourceType:" + i + " mStartPtsUs:" + this.f13537o + " mEndPtsUs:" + this.f13539q);
        if (str == null) {
            return false;
        }
        this.f13338f0 = i;
        this.f13317K.setDataSource(str);
        this.f13317K.selectMeidaTrack(i);
        super.mo18794t(this.f13537o, this.f13539q, this.f13521I);
        this.f13317K.setDecoderRange(this.f13537o / 1000, this.f13539q / 1000, this.f13521I);
        this.f13317K.setOutAudioInfo(this.f13528f, this.f13530h, this.f13529g);
        boolean zPrepare = this.f13317K.prepare();
        if (!zPrepare) {
            MDLog.m7389d("FFDecoderWrapper", "Prepare Complete Failed !!");
            return zPrepare;
        }
        int sampleRate = this.f13317K.getSampleRate();
        int audioChannel = this.f13317K.getAudioChannel();
        int audioBits = this.f13317K.getAudioBits();
        if (this.f13528f <= 0 && sampleRate != 0) {
            this.f13528f = sampleRate;
        }
        if (this.f13530h <= 0 && audioChannel != 0) {
            this.f13530h = audioChannel;
        }
        if (this.f13529g <= 0 && audioBits != 0) {
            this.f13529g = audioBits;
        }
        this.f13523a = this.f13317K.getWidth();
        this.f13524b = this.f13317K.getHeight();
        this.f13533k = this.f13317K.getRotation();
        this.f13535m = this.f13317K.getVideoDuration();
        if (this.f13514B == null) {
            this.f13514B = new MediaFormat();
        }
        this.f13514B.setInteger("width", this.f13523a);
        this.f13514B.setInteger("height", this.f13524b);
        this.f13514B.setInteger("rotation-degrees", this.f13533k);
        MDLog.m7389d("FFDecoderWrapper", "mVideoWidth:" + this.f13523a + " mVideoHeight:" + this.f13524b + " mRotation:" + this.f13533k);
        if (audioBits != 0 && audioChannel != 0 && sampleRate != 0) {
            if (this.f13513A == null) {
                this.f13513A = new MediaFormat();
            }
            MDLog.m7389d("FFDecoderWrapper", "Set audio media format !!");
            this.f13513A.setInteger("sample-rate", sampleRate);
            this.f13513A.setInteger("channel-count", audioChannel);
        } else if (sampleRate == 0 && audioChannel == 0 && audioBits == 0 && (this.f13338f0 & 1) != 0 && this.f13325S) {
            this.f13324R = false;
            if (this.f13513A == null) {
                this.f13513A = new MediaFormat();
            }
            MDLog.m7389d("FFDecoderWrapper", "Set dumy audio media format !!");
            this.f13513A.setInteger("sample-rate", this.f13528f);
            this.f13513A.setInteger("channel-count", this.f13530h);
            Thread thread = new Thread(this.f13343k0, "InsertMuteAudioData" + zzf0.m221018b());
            this.f13328V = thread;
            thread.start();
        }
        this.f13317K.start();
        MDLog.m7389d("FFDecoderWrapper", "Prepare Complete  Success!!");
        return zPrepare;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: q */
    public void mo18791q() {
        MDLog.m7389d("FFDecoderWrapper", "release");
        this.f13324R = true;
        Thread thread = this.f13328V;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f13328V = null;
        }
        MDLog.m7389d("FFDecoderWrapper", "release0");
        Thread thread2 = this.f13320N;
        if (thread2 != null) {
            try {
                thread2.join();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            this.f13320N = null;
        }
        MDLog.m7389d("FFDecoderWrapper", "release1");
        Thread thread3 = this.f13321O;
        if (thread3 != null) {
            try {
                thread3.join();
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.f13321O = null;
        }
        MDLog.m7389d("FFDecoderWrapper", "release end");
        synchronized (this.f13337e0) {
            this.f13339g0.clear();
        }
        this.f13317K.release();
        super.mo18791q();
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: r */
    public void mo18792r(Boolean bool) {
        ByteBuffer byteBufferPollFirst;
        if (this.f13317K == null || this.f13547y == null) {
            return;
        }
        synchronized (this.f13337e0) {
            try {
                byteBufferPollFirst = this.f13339g0.size() > 0 ? this.f13339g0.pollFirst() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!bool.booleanValue() || byteBufferPollFirst == null) {
            return;
        }
        this.f13547y.mo18945b(byteBufferPollFirst);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: s */
    public void mo18793s() {
        MDLog.m7389d("FFDecoderWrapper", "resume");
        this.f13317K.resume();
        this.f13329W = false;
        this.f13330X = false;
        this.f13331Y = false;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3856m
    /* JADX INFO: renamed from: t */
    public void mo18794t(long j, long j2, boolean z) {
        MDLog.m7389d("FFDecoderWrapper", "startPtsUs:" + j + " endPtsUs:" + j2 + " mStartPtsUs:" + this.f13537o + " mEndPtsUs:" + this.f13539q + " mNeedReverse:" + this.f13521I);
        long j3 = this.f13537o;
        long j4 = this.f13539q;
        boolean z2 = this.f13521I;
        super.mo18794t(j, j2, z);
        long j5 = this.f13537o;
        if (j3 == j5 && j4 == this.f13539q && z2 == this.f13521I) {
            MDLog.m7389d("FFDecoderWrapper", "no change");
            return;
        }
        if (j >= 0) {
            this.f13340h0 = j;
        }
        if (j >= 0 && j < j2) {
            this.f13342j0 = j2;
        }
        this.f13317K.setDecoderRange(j5 / 1000, this.f13539q / 1000, this.f13521I);
        MDLog.m7389d("FFDecoderWrapper", "changed, mStartPtsUs:" + this.f13537o + " mEndPtsUs:" + this.f13539q);
    }
}
