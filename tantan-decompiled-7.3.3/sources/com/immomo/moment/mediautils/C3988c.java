package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p153l.ad60;
import p153l.g8g0;
import p153l.jpw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.c */
/* JADX INFO: loaded from: classes7.dex */
public class C3988c extends AbstractC3987b {

    /* JADX INFO: renamed from: A */
    private FFVideoDecoder f13962A = new FFVideoDecoder();

    /* JADX INFO: renamed from: B */
    private a f13963B = new a();

    /* JADX INFO: renamed from: C */
    private Thread f13964C = null;

    /* JADX INFO: renamed from: D */
    private boolean f13965D = false;

    /* JADX INFO: renamed from: E */
    private boolean f13966E = false;

    /* JADX INFO: renamed from: F */
    private boolean f13967F = false;

    /* JADX INFO: renamed from: G */
    private Object f13968G = new Object();

    /* JADX INFO: renamed from: H */
    private boolean f13969H = false;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.c$a$a, reason: collision with other inner class name */
        public class RunnableC22808a implements Runnable {
            public RunnableC22808a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3988c.this.f13947l) {
                    try {
                        if (C3988c.this.f13962A != null) {
                            MDLog.m7443d("AudioDecoderBySoft", "AudioDecoder release");
                            C3988c.this.f13962A.release();
                            C3988c.this.f13962A = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:92:0x01aa, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x01ab, code lost:
        
            r1.printStackTrace();
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            C3988c c3988c;
            int audioFrameCnt;
            int status;
            ad60 audioFrame;
            MDLog.m7443d("AudioDecoderBySoft", "start getAudioData");
            loop0: while (true) {
                boolean z = false;
                do {
                    boolean z2 = C3988c.this.f13969H;
                    c3988c = C3988c.this;
                    if (z2) {
                        break loop0;
                    }
                    synchronized (c3988c.f13947l) {
                        try {
                            audioFrameCnt = C3988c.this.f13962A != null ? C3988c.this.f13962A.getAudioFrameCnt() : 0;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (C3988c.this.f13965D || audioFrameCnt <= 0) {
                        z = true;
                    } else {
                        System.currentTimeMillis();
                        synchronized (C3988c.this.f13947l) {
                            try {
                                audioFrame = C3988c.this.f13962A != null ? C3988c.this.f13962A.getAudioFrame() : null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (audioFrame != null) {
                            MediaCodec.BufferInfo bufferInfoM97016b = audioFrame.m97016b();
                            ByteBuffer byteBufferM97015a = audioFrame.m97015a();
                            int i = bufferInfoM97016b.size;
                            if (i > 0) {
                                C3988c c3988c2 = C3988c.this;
                                if (c3988c2.f13954s) {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                                    byteBufferAllocate.position(0);
                                    byteBufferM97015a.position(0);
                                    byteBufferAllocate.put(byteBufferM97015a.array(), 0, bufferInfoM97016b.size);
                                    byteBufferAllocate.position(0);
                                    C3988c.this.f13955t.offer(byteBufferAllocate);
                                    C3988c.this.getClass();
                                    AbstractC3987b.b bVar = C3988c.this.f13936a;
                                    if (bVar != null) {
                                        bVar.mo19662a(byteBufferM97015a, bufferInfoM97016b.size, bufferInfoM97016b.presentationTimeUs);
                                    }
                                } else {
                                    if (c3988c2.f13946k) {
                                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                                        byteBufferAllocate2.position(0);
                                        byteBufferM97015a.position(0);
                                        byteBufferAllocate2.put(byteBufferM97015a.array(), 0, bufferInfoM97016b.size);
                                        byteBufferAllocate2.position(0);
                                        C3988c.this.f13955t.offer(byteBufferAllocate2);
                                    }
                                    AbstractC3987b.b bVar2 = C3988c.this.f13936a;
                                    if (bVar2 != null) {
                                        bVar2.mo19662a(byteBufferM97015a, bufferInfoM97016b.size, bufferInfoM97016b.presentationTimeUs);
                                    }
                                    C3988c.this.getClass();
                                }
                                C3988c c3988c3 = C3988c.this;
                                long j = c3988c3.f13950o;
                                if (j != 0 && bufferInfoM97016b.presentationTimeUs >= j && c3988c3.f13946k) {
                                    MDLog.m7443d("AudioDecoderBySoft", "reach range end");
                                    C3988c c3988c4 = C3988c.this;
                                    c3988c4.f13953r = true;
                                    if (c3988c4.f13936a != null) {
                                        MDLog.m7443d("AudioDecoderBySoft", "mOnDataListener.onFinished");
                                        C3988c.this.f13936a.onFinished();
                                    }
                                    C3988c.this.getClass();
                                    if (C3988c.this.f13962A != null) {
                                        new Thread(new RunnableC22808a(), "AudioDecoderRelease" + g8g0.m129407b()).start();
                                    }
                                }
                            }
                            System.currentTimeMillis();
                        } else {
                            MDLog.m7453w("AudioDecoderBySoft", "packet is null and wait 10ms");
                            z = true;
                        }
                    }
                    if (C3988c.this.f13965D) {
                        synchronized (C3988c.this.f13968G) {
                            C3988c.this.f13966E = true;
                            C3988c.this.f13968G.notifyAll();
                        }
                    }
                    synchronized (C3988c.this.f13947l) {
                        try {
                            status = C3988c.this.f13962A != null ? C3988c.this.f13962A.getStatus() : -1;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (status != 0) {
                        C3988c c3988c5 = C3988c.this;
                        if (!c3988c5.f13953r) {
                            if (c3988c5.f13936a != null) {
                                MDLog.m7443d("AudioDecoderBySoft", "mOnDataListener.onFinished");
                                C3988c.this.f13936a.onFinished();
                            }
                            C3988c.this.getClass();
                        }
                        C3988c c3988c6 = C3988c.this;
                        c3988c6.f13953r = true;
                        if (status < 0) {
                            jpw jpwVar = c3988c6.f13938c;
                        }
                    }
                } while (!z);
                Thread.sleep(10L);
            }
            if (!c3988c.f13946k && c3988c.f13936a != null) {
                MDLog.m7443d("AudioDecoderBySoft", "mOnDataListener.onFinished");
                C3988c.this.f13936a.onFinished();
            }
            C3988c.this.getClass();
        }
    }

    /* JADX INFO: renamed from: t */
    private synchronized void m19691t() {
        synchronized (this.f13947l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13962A;
                if (fFVideoDecoder != null) {
                    fFVideoDecoder.resume();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:5:0x0004, B:7:0x0008, B:9:0x0022, B:17:0x0033, B:21:0x0042, B:20:0x003c, B:22:0x004a), top: B:30:0x0004, outer: #1 }] */
    /* JADX INFO: renamed from: u */
    private synchronized void m19692u(long j) {
        synchronized (this.f13947l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13962A;
                if (fFVideoDecoder != null) {
                    fFVideoDecoder.pause();
                    this.f13956u.clear();
                    this.f13955t.clear();
                    this.f13948m = null;
                    long j2 = this.f13949n;
                    if (j2 != 0) {
                        long j3 = this.f13950o;
                        if (j3 != 0) {
                            if (j < j2 || j >= j3) {
                                j = j2;
                            }
                            this.f13962A.seek(j / 1000);
                        } else {
                            this.f13962A.seek(j / 1000);
                        }
                    } else {
                        this.f13962A.seek(j / 1000);
                    }
                    this.f13962A.resume();
                    this.f13952q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008d A[SYNTHETIC] */
    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo19671b(ByteBuffer byteBuffer, int i) {
        int iRemaining;
        ByteBuffer byteBuffer2;
        if (!this.f13967F) {
            return false;
        }
        int i2 = 0;
        while (i > 0) {
            if (this.f13948m == null) {
                if (this.f13955t.size() > 0) {
                    try {
                        ByteBuffer byteBufferPoll = this.f13955t.poll();
                        this.f13948m = byteBufferPoll;
                        byteBufferPoll.position(0);
                    } catch (Exception e) {
                        MDLog.printErrStackTrace(MDLogTag.AUDIO_DECODE_TAG, e);
                        jpw jpwVar = this.f13938c;
                        if (jpwVar != null) {
                            jpwVar.mo115360a(-102, -102, "Soft readSampleData exception:" + g8g0.m129406a(e));
                        }
                        return false;
                    }
                } else if (!this.f13953r && !this.f13952q) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        iRemaining = this.f13948m.remaining();
                        byteBuffer2 = this.f13948m;
                        if (iRemaining >= i) {
                            byteBuffer2.get(byteBuffer.array(), i2, i);
                            i2 += i;
                            i = 0;
                        } else {
                            int iRemaining2 = byteBuffer2.remaining();
                            this.f13948m.get(byteBuffer.array(), i2, iRemaining2);
                            i2 += iRemaining2;
                            i -= iRemaining2;
                            this.f13956u.offer(this.f13948m);
                            this.f13948m = null;
                        }
                    }
                } else {
                    if (!this.f13951p) {
                        return false;
                    }
                    if (this.f13956u.size() <= 0) {
                        return false;
                    }
                    ByteBuffer byteBufferPoll2 = this.f13956u.poll();
                    this.f13948m = byteBufferPoll2;
                    if (byteBufferPoll2 == null) {
                        return false;
                    }
                    byteBufferPoll2.position(0);
                }
            }
            iRemaining = this.f13948m.remaining();
            byteBuffer2 = this.f13948m;
            if (iRemaining >= i) {
                byteBuffer2.get(byteBuffer.array(), i2, i);
                i2 += i;
                i = 0;
            } else {
                int iRemaining3 = byteBuffer2.remaining();
                this.f13948m.get(byteBuffer.array(), i2, iRemaining3);
                i2 += iRemaining3;
                i -= iRemaining3;
                this.f13956u.offer(this.f13948m);
                this.f13948m = null;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:37:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0010, B:12:0x001c, B:11:0x0017, B:13:0x001e, B:14:0x0020, B:21:0x002e, B:23:0x0036, B:24:0x003b, B:26:0x0043, B:27:0x0048, B:31:0x004e, B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:36:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0010, B:12:0x001c, B:11:0x0017, B:13:0x001e, B:14:0x0020, B:21:0x002e, B:23:0x0036, B:24:0x003b, B:26:0x0043, B:27:0x0048, B:31:0x004e, B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:36:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: c */
    public synchronized void mo19672c() {
        FFVideoDecoder fFVideoDecoder;
        MDLog.m7443d("AudioDecoderBySoft", "release");
        Thread thread = this.f13964C;
        if (thread != null) {
            this.f13969H = true;
            try {
                thread.join();
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace("AudioDecoderBySoft", e);
            }
            this.f13964C = null;
            synchronized (this.f13947l) {
                try {
                    fFVideoDecoder = this.f13962A;
                    if (fFVideoDecoder != null) {
                        fFVideoDecoder.release();
                        this.f13962A = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f13955t.size() > 0) {
                this.f13955t.clear();
            }
            if (this.f13956u.size() > 0) {
                this.f13956u.clear();
            }
            this.f13967F = false;
        } else {
            synchronized (this.f13947l) {
                fFVideoDecoder = this.f13962A;
                if (fFVideoDecoder != null) {
                    fFVideoDecoder.release();
                    this.f13962A = null;
                }
                if (this.f13955t.size() > 0) {
                    this.f13955t.clear();
                }
                if (this.f13956u.size() > 0) {
                    this.f13956u.clear();
                }
                this.f13967F = false;
            }
        }
        throw th;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: d */
    public synchronized void mo19673d(long j) {
        MDLog.m7443d("AudioDecoderBySoft", "seek:" + j);
        m19692u(j);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo19674e(String str) {
        if (str == null) {
            jpw jpwVar = this.f13938c;
            if (jpwVar != null) {
                jpwVar.mo115360a(-103, -103, "Soft Init audio demuxer error! File:" + str);
            }
            return false;
        }
        MDLog.m7443d("AudioDecoderBySoft", "path:".concat(str));
        synchronized (this.f13947l) {
            FFVideoDecoder fFVideoDecoder = this.f13962A;
            if (fFVideoDecoder == null) {
                return false;
            }
            fFVideoDecoder.setDataSource(str);
            this.f13962A.selectMeidaTrack(1);
            this.f13962A.setDecoderRange(this.f13949n, this.f13950o, false);
            this.f13962A.setOutAudioInfo(this.f13942g, this.f13944i, this.f13943h);
            boolean zPrepare = this.f13962A.prepare();
            if (zPrepare) {
                this.f13939d = this.f13962A.getSampleRate();
                this.f13941f = this.f13962A.getAudioChannel();
                this.f13940e = this.f13962A.getAudioBits();
                MDLog.m7443d("AudioDecoderBySoft", "source sampleRate:" + this.f13939d + " SampleChannels:" + this.f13941f + " SampleBits:" + this.f13940e);
                if (this.f13942g <= 0) {
                    this.f13942g = this.f13939d;
                }
                if (this.f13944i <= 0) {
                    this.f13944i = this.f13941f;
                }
                if (this.f13943h <= 0) {
                    this.f13943h = this.f13940e;
                }
                if (!this.f13954s) {
                    MDLog.m7453w("AudioDecoderBySoft", "Do not use resample!");
                    this.f13942g = this.f13939d;
                    this.f13944i = this.f13941f;
                    int i = this.f13940e;
                    if (i == 16 || i == 8) {
                        this.f13943h = i;
                    } else {
                        MDLog.m7453w("AudioDecoderBySoft", "resample for smaplebit:" + this.f13940e + "->mDstSampleBits:" + this.f13943h);
                        this.f13954s = true;
                        this.f13962A.setOutAudioInfo(this.f13942g, this.f13944i, this.f13943h);
                    }
                }
                AbstractC3987b.a aVar = this.f13937b;
                if (aVar != null) {
                    aVar.mo19661a(this.f13942g, this.f13944i, this.f13943h);
                }
                long videoDuration = this.f13962A.getVideoDuration();
                this.f13945j = videoDuration;
                long j = this.f13949n;
                if (videoDuration < j) {
                    this.f13949n = 0L;
                } else {
                    this.f13962A.seek(j / 1000);
                    MDLog.m7443d("AudioDecoderBySoft", "start Seek:" + this.f13949n + " mEndPosUs:" + this.f13950o);
                }
                this.f13945j -= this.f13949n;
                this.f13962A.start();
                Thread thread = new Thread(this.f13963B, "getAMeidaTh");
                this.f13964C = thread;
                thread.start();
                MDLog.m7443d("AudioDecoderBySoft", "Prepare Complete  Success!!");
            } else {
                MDLog.m7443d("AudioDecoderBySoft", "Prepare Complete Failed !!");
                jpw jpwVar2 = this.f13938c;
                if (jpwVar2 != null) {
                    jpwVar2.mo115360a(TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION, TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION, "Soft Init audio prepare error! File:".concat(str));
                }
            }
            return zPrepare;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: f */
    public synchronized void mo19675f(boolean z) {
        MDLog.m7443d("AudioDecoderBySoft", "setDecoderCycleMode:" + z);
        this.f13951p = z;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: g */
    public synchronized void mo19676g(long j, long j2) {
        try {
            MDLog.m7449i("AudioDecoderBySoft", "startPtsMs = " + j + " durationMs = " + j2);
            if (j >= 0) {
                this.f13949n = j * 1000;
            } else {
                this.f13949n = 0L;
            }
            if (j2 >= 0) {
                this.f13950o = this.f13949n + (j2 * 1000);
            } else {
                this.f13950o = 0L;
            }
            MDLog.m7443d("AudioDecoderBySoft", "mStartPosUs:" + this.f13949n + " mEndPos:" + this.f13950o);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: k */
    public synchronized void mo19677k(int i, int i2, int i3) {
        MDLog.m7443d("AudioDecoderBySoft", "dst sampleRate:" + i + " SampleChannels:" + i2 + " SampleBits:" + i3);
        this.f13954s = true;
        this.f13943h = i3;
        this.f13944i = i2;
        this.f13942g = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: m */
    public synchronized void mo19678m() {
        MDLog.m7449i("AudioDecoderBySoft", "startDecoding !!!");
        if (this.f13967F) {
            MDLog.m7443d("AudioDecoderBySoft", " mStartPosUs:" + this.f13949n);
            m19692u(this.f13949n);
            m19691t();
            return;
        }
        synchronized (this.f13947l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13962A;
                if (fFVideoDecoder != null) {
                    this.f13967F = fFVideoDecoder.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13965D = false;
    }
}
