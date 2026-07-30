package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import p153l.ad60;
import p153l.g8g0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.g */
/* JADX INFO: loaded from: classes7.dex */
public class C3993g extends AbstractC3999m {

    /* JADX INFO: renamed from: K */
    private FFVideoDecoder f14011K = new FFVideoDecoder();

    /* JADX INFO: renamed from: L */
    private c f14012L = new c();

    /* JADX INFO: renamed from: M */
    private b f14013M = new b();

    /* JADX INFO: renamed from: N */
    private Thread f14014N = null;

    /* JADX INFO: renamed from: O */
    private Thread f14015O = null;

    /* JADX INFO: renamed from: P */
    private boolean f14016P = false;

    /* JADX INFO: renamed from: Q */
    private boolean f14017Q = false;

    /* JADX INFO: renamed from: R */
    private boolean f14018R = false;

    /* JADX INFO: renamed from: S */
    private boolean f14019S = true;

    /* JADX INFO: renamed from: T */
    private long f14020T = 0;

    /* JADX INFO: renamed from: U */
    private long f14021U = 0;

    /* JADX INFO: renamed from: V */
    private Thread f14022V = null;

    /* JADX INFO: renamed from: W */
    private boolean f14023W = false;

    /* JADX INFO: renamed from: X */
    private boolean f14024X = false;

    /* JADX INFO: renamed from: Y */
    private boolean f14025Y = false;

    /* JADX INFO: renamed from: Z */
    private boolean f14026Z = false;

    /* JADX INFO: renamed from: a0 */
    private boolean f14027a0 = true;

    /* JADX INFO: renamed from: b0 */
    private Boolean f14028b0 = Boolean.FALSE;

    /* JADX INFO: renamed from: c0 */
    private Object f14029c0 = new Object();

    /* JADX INFO: renamed from: d0 */
    private Object f14030d0 = new Object();

    /* JADX INFO: renamed from: e0 */
    private Object f14031e0 = new Object();

    /* JADX INFO: renamed from: f0 */
    private int f14032f0 = 1;

    /* JADX INFO: renamed from: g0 */
    private LinkedList<ByteBuffer> f14033g0 = new LinkedList<>();

    /* JADX INFO: renamed from: h0 */
    protected long f14034h0 = -1;

    /* JADX INFO: renamed from: i0 */
    protected long f14035i0 = 0;

    /* JADX INFO: renamed from: j0 */
    protected long f14036j0 = -1;

    /* JADX INFO: renamed from: k0 */
    Runnable f14037k0 = new a();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.g$a */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0081  */
        @Override // java.lang.Runnable
        public void run() {
            long j;
            C3993g c3993g = C3993g.this;
            if (c3993g.f14222f <= 0) {
                c3993g.f14222f = c3993g.f14219c;
            }
            if (c3993g.f14224h <= 0) {
                c3993g.f14224h = c3993g.f14221e;
            }
            if (c3993g.f14223g <= 0) {
                c3993g.f14223g = c3993g.f14220d;
            }
            if (c3993g.f14207A == null) {
                c3993g.f14207A = new MediaFormat();
            }
            C3993g c3993g2 = C3993g.this;
            c3993g2.f14207A.setInteger("channel-count", c3993g2.f14224h);
            C3993g c3993g3 = C3993g.this;
            c3993g3.f14207A.setInteger("sample-rate", c3993g3.f14222f);
            C3993g c3993g4 = C3993g.this;
            c3993g4.f14207A.setInteger("bit-width", c3993g4.f14223g);
            C3993g c3993g5 = C3993g.this;
            AbstractC3999m.c cVar = c3993g5.f14240x;
            if (cVar != null) {
                cVar.mo19922d(c3993g5.f14207A);
            }
            C3993g c3993g6 = C3993g.this;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((c3993g6.f14223g * 1024) * c3993g6.f14224h) / 8);
            C3993g c3993g7 = C3993g.this;
            long j2 = c3993g7.f14231o;
            if (j2 >= 0) {
                long j3 = c3993g7.f14233q;
                if (j3 <= 0 || j3 <= j2) {
                    j = c3993g7.f14229m;
                    j2 = 0;
                } else {
                    long j4 = j3 - j2;
                    j = c3993g7.f14229m;
                    if (j4 <= j) {
                        j = j4 + j2;
                    }
                }
            } else {
                j = c3993g7.f14229m;
                j2 = 0;
            }
            while (!C3993g.this.f14018R) {
                if (C3993g.this.f14023W || C3993g.this.f14021U - C3993g.this.f14020T > HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT) {
                    if (C3993g.this.f14023W) {
                        j2 = 0;
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    C3993g c3993g8 = C3993g.this;
                    if (j2 <= j) {
                        if (c3993g8.f14240x != null) {
                            byteBufferAllocate.position(0);
                            C3993g.this.f14240x.mo19923e(byteBufferAllocate, byteBufferAllocate.capacity(), j2);
                        }
                        C3993g c3993g9 = C3993g.this;
                        j2 = (long) (j2 + ((1024.0d / ((double) c3993g9.f14222f)) * 1000000.0d));
                        c3993g9.f14021U = j2;
                    } else {
                        if (c3993g8.f14235s) {
                            break;
                        }
                        if (c3993g8.f14240x != null && !c3993g8.f14016P) {
                            C3993g.this.f14240x.mo19921c();
                            C3993g.this.f14016P = true;
                        }
                        try {
                            Thread.sleep(5L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
            C3993g c3993g10 = C3993g.this;
            if (c3993g10.f14240x == null || !c3993g10.f14027a0) {
                return;
            }
            if (!C3993g.this.f14016P) {
                C3993g.this.f14240x.mo19921c();
                C3993g.this.f14016P = true;
            }
            C3993g.this.f14240x.mo19920a();
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
            C3993g c3993g;
            AbstractC3999m.e eVar;
            MediaFormat mediaFormat;
            C3993g c3993g2 = C3993g.this;
            AbstractC3999m.c cVar = c3993g2.f14240x;
            if (cVar != null && (mediaFormat = c3993g2.f14207A) != null) {
                cVar.mo19922d(mediaFormat);
            }
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (C3993g.this.f14018R) {
                        break loop0;
                    }
                    if (!C3993g.this.f14023W) {
                        C3993g c3993g3 = C3993g.this;
                        if (c3993g3.f14240x != null && c3993g3.f14011K.getAudioFrameCnt() > 0) {
                            System.currentTimeMillis();
                            ad60 audioFrame = C3993g.this.f14011K.getAudioFrame();
                            if (audioFrame == null) {
                                continue;
                            } else {
                                MediaCodec.BufferInfo bufferInfoM97016b = audioFrame.m97016b();
                                if (C3993g.this.m19764Y(bufferInfoM97016b.presentationTimeUs)) {
                                    C3993g.this.f14240x.mo19923e(audioFrame.m97015a(), bufferInfoM97016b.size, bufferInfoM97016b.presentationTimeUs);
                                    System.currentTimeMillis();
                                    if (C3993g.this.f14023W) {
                                        synchronized (C3993g.this.f14030d0) {
                                            C3993g.this.f14024X = true;
                                            C3993g.this.f14030d0.notifyAll();
                                        }
                                    }
                                    if (!C3993g.this.f14016P && C3993g.this.f14011K.getStatus() != 0) {
                                        c3993g = C3993g.this;
                                        if (c3993g.f14240x != null && !c3993g.f14016P && (C3993g.this.f14032f0 & 1) != 0) {
                                            MDLog.m7443d("FFDecoderWrapper", "Audio Decoder finished!");
                                            C3993g.this.f14240x.mo19921c();
                                            C3993g.this.f14240x.mo19920a();
                                            C3993g.this.f14016P = true;
                                            eVar = C3993g.this.f14241y;
                                            if (eVar != null) {
                                                eVar.mo19928e(null);
                                            }
                                        }
                                        if (C3993g.this.f14235s) {
                                            break loop0;
                                        }
                                    }
                                    if (z) {
                                        break;
                                    }
                                } else {
                                    long j = bufferInfoM97016b.presentationTimeUs;
                                    C3993g c3993g4 = C3993g.this;
                                    if (j > c3993g4.f14233q && c3993g4.f14240x != null && !c3993g4.f14016P && (C3993g.this.f14032f0 & 1) != 0) {
                                        MDLog.m7443d("FFDecoderWrapper", "Audio Decoder finished!");
                                        C3993g.this.f14240x.mo19921c();
                                        C3993g.this.f14240x.mo19920a();
                                        C3993g.this.f14016P = true;
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                    if (C3993g.this.f14023W) {
                        synchronized (C3993g.this.f14030d0) {
                            C3993g.this.f14024X = true;
                            C3993g.this.f14030d0.notifyAll();
                        }
                    }
                    if (!C3993g.this.f14016P) {
                        c3993g = C3993g.this;
                        if (c3993g.f14240x != null) {
                            MDLog.m7443d("FFDecoderWrapper", "Audio Decoder finished!");
                            C3993g.this.f14240x.mo19921c();
                            C3993g.this.f14240x.mo19920a();
                            C3993g.this.f14016P = true;
                            eVar = C3993g.this.f14241y;
                            if (eVar != null) {
                                eVar.mo19928e(null);
                            }
                        }
                        if (C3993g.this.f14235s) {
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
            MDLog.m7443d("FFDecoderWrapper", "Fetch Audio Thread exit!");
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
            C3993g c3993g;
            AbstractC3999m.e eVar;
            MediaFormat mediaFormat;
            C3993g c3993g2 = C3993g.this;
            AbstractC3999m.e eVar2 = c3993g2.f14241y;
            if (eVar2 != null && (mediaFormat = c3993g2.f14208B) != null) {
                eVar2.mo19927d(mediaFormat);
            }
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (C3993g.this.f14018R) {
                        break loop0;
                    }
                    C3993g c3993g3 = C3993g.this;
                    if (c3993g3.f14241y == null || c3993g3.f14023W || C3993g.this.f14033g0.size() >= 3 || C3993g.this.f14011K.getVideoFrameCnt() <= 0) {
                        z = true;
                        if (C3993g.this.f14023W) {
                            synchronized (C3993g.this.f14029c0) {
                                C3993g.this.f14025Y = true;
                                C3993g.this.f14029c0.notifyAll();
                            }
                        }
                        if (!C3993g.this.f14017Q && C3993g.this.f14011K.getStatus() != 0) {
                            c3993g = C3993g.this;
                            if (c3993g.f14241y != null && !c3993g.f14017Q && (C3993g.this.f14032f0 & 16) != 0) {
                                MDLog.m7443d("FFDecoderWrapper", "Video decoder finished!");
                                C3993g.this.f14241y.mo19926c();
                                C3993g.this.f14241y.mo19924a();
                                C3993g.this.f14017Q = true;
                                eVar = C3993g.this.f14241y;
                                if (eVar != null) {
                                    eVar.mo19928e(null);
                                }
                            }
                            if (C3993g.this.f14235s) {
                                break loop0;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        ad60 videoFrame = C3993g.this.f14011K.getVideoFrame();
                        if (videoFrame == null) {
                            continue;
                        } else {
                            MediaCodec.BufferInfo bufferInfoM97016b = videoFrame.m97016b();
                            synchronized (C3993g.this.f14031e0) {
                                C3993g.this.f14033g0.offer(videoFrame.m97015a());
                            }
                            C3993g.this.f14020T = bufferInfoM97016b.presentationTimeUs;
                            if (C3993g.this.m19765Z(bufferInfoM97016b.presentationTimeUs)) {
                                C3993g.this.f14241y.mo19928e(bufferInfoM97016b);
                                if (C3993g.this.f14023W) {
                                    synchronized (C3993g.this.f14029c0) {
                                        C3993g.this.f14025Y = true;
                                        C3993g.this.f14029c0.notifyAll();
                                    }
                                }
                                if (!C3993g.this.f14017Q) {
                                    c3993g = C3993g.this;
                                    if (c3993g.f14241y != null) {
                                        MDLog.m7443d("FFDecoderWrapper", "Video decoder finished!");
                                        C3993g.this.f14241y.mo19926c();
                                        C3993g.this.f14241y.mo19924a();
                                        C3993g.this.f14017Q = true;
                                        eVar = C3993g.this.f14241y;
                                        if (eVar != null) {
                                            eVar.mo19928e(null);
                                        }
                                    }
                                    if (C3993g.this.f14235s) {
                                        break loop0;
                                        break loop0;
                                    }
                                }
                                if (z) {
                                    break;
                                }
                            } else {
                                long j = bufferInfoM97016b.presentationTimeUs;
                                C3993g c3993g4 = C3993g.this;
                                if (j > c3993g4.f14233q && c3993g4.f14241y != null && !c3993g4.f14017Q && (C3993g.this.f14032f0 & 16) != 0) {
                                    MDLog.m7443d("FFDecoderWrapper", "Video decoder finished!");
                                    C3993g.this.f14241y.mo19926c();
                                    C3993g.this.f14241y.mo19924a();
                                    C3993g.this.f14017Q = true;
                                    AbstractC3999m.e eVar3 = C3993g.this.f14241y;
                                    if (eVar3 != null) {
                                        eVar3.mo19928e(null);
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
            MDLog.m7443d("FFDecoderWrapper", "Fetch Video Thread exit!");
        }
    }

    public C3993g() {
        this.f14231o = 0L;
        this.f14233q = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public boolean m19764Y(long j) {
        long j2 = this.f14034h0;
        if (j2 >= 0) {
            long j3 = this.f14036j0;
            if (j3 > 0 && j3 > j2) {
                if (j >= this.f14035i0 && j <= j3) {
                    return true;
                }
                MDLog.m7443d("FFDecoderWrapper", "out of range curPts:" + j + " mStartPtsUs:" + this.f14231o + " mEndPtsUs:" + this.f14233q + " mSeekStartPts:" + this.f14232p);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public boolean m19765Z(long j) {
        long j2 = this.f14231o;
        if (j2 >= 0) {
            long j3 = this.f14233q;
            if (j3 > 0 && j3 > j2) {
                if (j >= this.f14232p && j <= j3) {
                    return true;
                }
                MDLog.m7443d("FFDecoderWrapper", "out of range curPts:" + j + " mStartPtsUs:" + this.f14231o + " mEndPtsUs:" + this.f14233q + " mSeekStartPts:" + this.f14232p);
                return false;
            }
        }
        return true;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: B */
    public boolean mo19766B() {
        MDLog.m7443d("FFDecoderWrapper", "start pid:" + Thread.currentThread().getId());
        if (this.f14028b0.booleanValue()) {
            m19768a0(this.f14231o);
            mo19773s();
            this.f14232p = this.f14231o;
            return true;
        }
        this.f14028b0 = Boolean.valueOf(this.f14011K.start());
        this.f14023W = false;
        Thread thread = new Thread(this.f14012L, "getMeidaTh");
        this.f14014N = thread;
        thread.start();
        Thread thread2 = new Thread(this.f14013M, "getAMeidaTh");
        this.f14015O = thread2;
        thread2.start();
        this.f14232p = this.f14231o;
        return this.f14028b0.booleanValue();
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: C */
    public boolean mo19767C(long j) {
        MDLog.m7443d("FFDecoderWrapper", "startWidthTime ptsUs:" + j + " pid:" + Thread.currentThread().getId());
        if (this.f14028b0.booleanValue()) {
            MDLog.m7443d("FFDecoderWrapper", "already decoding");
            if (this.f14215I) {
                this.f14232p = 0L;
                this.f14233q -= j;
                this.f14034h0 = 0L;
                this.f14035i0 = j;
                this.f14036j0 = this.f14229m;
            } else {
                this.f14232p = j;
            }
            m19768a0(j);
            mo19773s();
            return true;
        }
        MDLog.m7443d("FFDecoderWrapper", "start decoding");
        this.f14011K.seek(j);
        this.f14028b0 = Boolean.valueOf(this.f14011K.start());
        Thread thread = new Thread(this.f14012L, "getMeidaTh");
        this.f14014N = thread;
        thread.start();
        Thread thread2 = new Thread(this.f14013M, "getAMeidaTh");
        this.f14015O = thread2;
        thread2.start();
        if (this.f14215I) {
            this.f14232p = 0L;
            this.f14233q -= j;
        } else {
            this.f14232p = j;
        }
        return this.f14028b0.booleanValue();
    }

    /* JADX INFO: renamed from: a0 */
    public void m19768a0(long j) {
        MDLog.m7443d("FFDecoderWrapper", "seek:" + j);
        synchronized (this.f14031e0) {
            this.f14033g0.clear();
        }
        this.f14011K.seek(j / 1000);
        this.f14021U = 0L;
        this.f14016P = false;
        this.f14017Q = false;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: o */
    public void mo19769o() {
        MDLog.m7443d("FFDecoderWrapper", "pause");
        this.f14023W = true;
        this.f14011K.pause();
        synchronized (this.f14029c0) {
            while (!this.f14025Y) {
                try {
                    this.f14029c0.wait(15L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (this.f14030d0) {
            while (!this.f14024X) {
                try {
                    this.f14030d0.wait(15L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: p */
    public boolean mo19770p(String str, int i) {
        MDLog.m7443d("FFDecoderWrapper", "prepare path:" + str + " sourceType:" + i + " mStartPtsUs:" + this.f14231o + " mEndPtsUs:" + this.f14233q);
        if (str == null) {
            return false;
        }
        this.f14032f0 = i;
        this.f14011K.setDataSource(str);
        this.f14011K.selectMeidaTrack(i);
        super.mo19774t(this.f14231o, this.f14233q, this.f14215I);
        this.f14011K.setDecoderRange(this.f14231o / 1000, this.f14233q / 1000, this.f14215I);
        this.f14011K.setOutAudioInfo(this.f14222f, this.f14224h, this.f14223g);
        boolean zPrepare = this.f14011K.prepare();
        if (!zPrepare) {
            MDLog.m7443d("FFDecoderWrapper", "Prepare Complete Failed !!");
            return zPrepare;
        }
        int sampleRate = this.f14011K.getSampleRate();
        int audioChannel = this.f14011K.getAudioChannel();
        int audioBits = this.f14011K.getAudioBits();
        if (this.f14222f <= 0 && sampleRate != 0) {
            this.f14222f = sampleRate;
        }
        if (this.f14224h <= 0 && audioChannel != 0) {
            this.f14224h = audioChannel;
        }
        if (this.f14223g <= 0 && audioBits != 0) {
            this.f14223g = audioBits;
        }
        this.f14217a = this.f14011K.getWidth();
        this.f14218b = this.f14011K.getHeight();
        this.f14227k = this.f14011K.getRotation();
        this.f14229m = this.f14011K.getVideoDuration();
        if (this.f14208B == null) {
            this.f14208B = new MediaFormat();
        }
        this.f14208B.setInteger("width", this.f14217a);
        this.f14208B.setInteger("height", this.f14218b);
        this.f14208B.setInteger("rotation-degrees", this.f14227k);
        MDLog.m7443d("FFDecoderWrapper", "mVideoWidth:" + this.f14217a + " mVideoHeight:" + this.f14218b + " mRotation:" + this.f14227k);
        if (audioBits != 0 && audioChannel != 0 && sampleRate != 0) {
            if (this.f14207A == null) {
                this.f14207A = new MediaFormat();
            }
            MDLog.m7443d("FFDecoderWrapper", "Set audio media format !!");
            this.f14207A.setInteger("sample-rate", sampleRate);
            this.f14207A.setInteger("channel-count", audioChannel);
        } else if (sampleRate == 0 && audioChannel == 0 && audioBits == 0 && (this.f14032f0 & 1) != 0 && this.f14019S) {
            this.f14018R = false;
            if (this.f14207A == null) {
                this.f14207A = new MediaFormat();
            }
            MDLog.m7443d("FFDecoderWrapper", "Set dumy audio media format !!");
            this.f14207A.setInteger("sample-rate", this.f14222f);
            this.f14207A.setInteger("channel-count", this.f14224h);
            Thread thread = new Thread(this.f14037k0, "InsertMuteAudioData" + g8g0.m129407b());
            this.f14022V = thread;
            thread.start();
        }
        this.f14011K.start();
        MDLog.m7443d("FFDecoderWrapper", "Prepare Complete  Success!!");
        return zPrepare;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: q */
    public void mo19771q() {
        MDLog.m7443d("FFDecoderWrapper", "release");
        this.f14018R = true;
        Thread thread = this.f14022V;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f14022V = null;
        }
        MDLog.m7443d("FFDecoderWrapper", "release0");
        Thread thread2 = this.f14014N;
        if (thread2 != null) {
            try {
                thread2.join();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            this.f14014N = null;
        }
        MDLog.m7443d("FFDecoderWrapper", "release1");
        Thread thread3 = this.f14015O;
        if (thread3 != null) {
            try {
                thread3.join();
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
            this.f14015O = null;
        }
        MDLog.m7443d("FFDecoderWrapper", "release end");
        synchronized (this.f14031e0) {
            this.f14033g0.clear();
        }
        this.f14011K.release();
        super.mo19771q();
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: r */
    public void mo19772r(Boolean bool) {
        ByteBuffer byteBufferPollFirst;
        if (this.f14011K == null || this.f14241y == null) {
            return;
        }
        synchronized (this.f14031e0) {
            try {
                byteBufferPollFirst = this.f14033g0.size() > 0 ? this.f14033g0.pollFirst() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!bool.booleanValue() || byteBufferPollFirst == null) {
            return;
        }
        this.f14241y.mo19925b(byteBufferPollFirst);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: s */
    public void mo19773s() {
        MDLog.m7443d("FFDecoderWrapper", "resume");
        this.f14011K.resume();
        this.f14023W = false;
        this.f14024X = false;
        this.f14025Y = false;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3999m
    /* JADX INFO: renamed from: t */
    public void mo19774t(long j, long j2, boolean z) {
        MDLog.m7443d("FFDecoderWrapper", "startPtsUs:" + j + " endPtsUs:" + j2 + " mStartPtsUs:" + this.f14231o + " mEndPtsUs:" + this.f14233q + " mNeedReverse:" + this.f14215I);
        long j3 = this.f14231o;
        long j4 = this.f14233q;
        boolean z2 = this.f14215I;
        super.mo19774t(j, j2, z);
        long j5 = this.f14231o;
        if (j3 == j5 && j4 == this.f14233q && z2 == this.f14215I) {
            MDLog.m7443d("FFDecoderWrapper", "no change");
            return;
        }
        if (j >= 0) {
            this.f14034h0 = j;
        }
        if (j >= 0 && j < j2) {
            this.f14036j0 = j2;
        }
        this.f14011K.setDecoderRange(j5 / 1000, this.f14233q / 1000, this.f14215I);
        MDLog.m7443d("FFDecoderWrapper", "changed, mStartPtsUs:" + this.f14231o + " mEndPtsUs:" + this.f14233q);
    }
}
