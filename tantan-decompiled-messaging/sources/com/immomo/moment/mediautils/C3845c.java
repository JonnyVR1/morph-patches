package com.immomo.moment.mediautils;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import p149l.kmw;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.c */
/* JADX INFO: loaded from: classes7.dex */
public class C3845c extends AbstractC3844b {

    /* JADX INFO: renamed from: A */
    private FFVideoDecoder f13268A = new FFVideoDecoder();

    /* JADX INFO: renamed from: B */
    private a f13269B = new a();

    /* JADX INFO: renamed from: C */
    private Thread f13270C = null;

    /* JADX INFO: renamed from: D */
    private boolean f13271D = false;

    /* JADX INFO: renamed from: E */
    private boolean f13272E = false;

    /* JADX INFO: renamed from: F */
    private boolean f13273F = false;

    /* JADX INFO: renamed from: G */
    private Object f13274G = new Object();

    /* JADX INFO: renamed from: H */
    private boolean f13275H = false;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.c$a$a, reason: collision with other inner class name */
        public class RunnableC22692a implements Runnable {
            public RunnableC22692a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3845c.this.f13253l) {
                    try {
                        if (C3845c.this.f13268A != null) {
                            MDLog.m7389d("AudioDecoderBySoft", "AudioDecoder release");
                            C3845c.this.f13268A.release();
                            C3845c.this.f13268A = null;
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
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 464
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.immomo.moment.mediautils.C3845c.a.run():void");
        }
    }

    /* JADX INFO: renamed from: t */
    private synchronized void m18711t() {
        synchronized (this.f13253l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13268A;
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
    private synchronized void m18712u(long j) {
        synchronized (this.f13253l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13268A;
                if (fFVideoDecoder != null) {
                    fFVideoDecoder.pause();
                    this.f13262u.clear();
                    this.f13261t.clear();
                    this.f13254m = null;
                    long j2 = this.f13255n;
                    if (j2 != 0) {
                        long j3 = this.f13256o;
                        if (j3 != 0) {
                            if (j < j2 || j >= j3) {
                                j = j2;
                            }
                            this.f13268A.seek(j / 1000);
                        } else {
                            this.f13268A.seek(j / 1000);
                        }
                    } else {
                        this.f13268A.seek(j / 1000);
                    }
                    this.f13268A.resume();
                    this.f13258q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x008d A[SYNTHETIC] */
    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo18691b(ByteBuffer byteBuffer, int i) {
        int iRemaining;
        ByteBuffer byteBuffer2;
        if (!this.f13273F) {
            return false;
        }
        int i2 = 0;
        while (i > 0) {
            if (this.f13254m == null) {
                if (this.f13261t.size() > 0) {
                    try {
                        ByteBuffer byteBufferPoll = this.f13261t.poll();
                        this.f13254m = byteBufferPoll;
                        byteBufferPoll.position(0);
                    } catch (Exception e) {
                        MDLog.printErrStackTrace(MDLogTag.AUDIO_DECODE_TAG, e);
                        kmw kmwVar = this.f13244c;
                        if (kmwVar != null) {
                            kmwVar.mo130269a(-102, -102, "Soft readSampleData exception:" + zzf0.m221017a(e));
                        }
                        return false;
                    }
                } else if (!this.f13259r && !this.f13258q) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                        iRemaining = this.f13254m.remaining();
                        byteBuffer2 = this.f13254m;
                        if (iRemaining >= i) {
                            byteBuffer2.get(byteBuffer.array(), i2, i);
                            i2 += i;
                            i = 0;
                        } else {
                            int iRemaining2 = byteBuffer2.remaining();
                            this.f13254m.get(byteBuffer.array(), i2, iRemaining2);
                            i2 += iRemaining2;
                            i -= iRemaining2;
                            this.f13262u.offer(this.f13254m);
                            this.f13254m = null;
                        }
                    }
                } else {
                    if (!this.f13257p) {
                        return false;
                    }
                    if (this.f13262u.size() <= 0) {
                        return false;
                    }
                    ByteBuffer byteBufferPoll2 = this.f13262u.poll();
                    this.f13254m = byteBufferPoll2;
                    if (byteBufferPoll2 == null) {
                        return false;
                    }
                    byteBufferPoll2.position(0);
                }
            }
            iRemaining = this.f13254m.remaining();
            byteBuffer2 = this.f13254m;
            if (iRemaining >= i) {
                byteBuffer2.get(byteBuffer.array(), i2, i);
                i2 += i;
                i = 0;
            } else {
                int iRemaining3 = byteBuffer2.remaining();
                this.f13254m.get(byteBuffer.array(), i2, iRemaining3);
                i2 += iRemaining3;
                i -= iRemaining3;
                this.f13262u.offer(this.f13254m);
                this.f13254m = null;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0025 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:37:0x0021, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0010, B:12:0x001c, B:11:0x0017, B:13:0x001e, B:14:0x0020, B:21:0x002e, B:23:0x0036, B:24:0x003b, B:26:0x0043, B:27:0x0048, B:31:0x004e, B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:36:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[Catch: all -> 0x0014, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000d, B:6:0x0010, B:12:0x001c, B:11:0x0017, B:13:0x001e, B:14:0x0020, B:21:0x002e, B:23:0x0036, B:24:0x003b, B:26:0x0043, B:27:0x0048, B:31:0x004e, B:15:0x0021, B:17:0x0025, B:20:0x002d), top: B:36:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: c */
    public synchronized void mo18692c() {
        FFVideoDecoder fFVideoDecoder;
        MDLog.m7389d("AudioDecoderBySoft", "release");
        Thread thread = this.f13270C;
        if (thread != null) {
            this.f13275H = true;
            try {
                thread.join();
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace("AudioDecoderBySoft", e);
            }
            this.f13270C = null;
            synchronized (this.f13253l) {
                try {
                    fFVideoDecoder = this.f13268A;
                    if (fFVideoDecoder != null) {
                        fFVideoDecoder.release();
                        this.f13268A = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f13261t.size() > 0) {
                this.f13261t.clear();
            }
            if (this.f13262u.size() > 0) {
                this.f13262u.clear();
            }
            this.f13273F = false;
        } else {
            synchronized (this.f13253l) {
                fFVideoDecoder = this.f13268A;
                if (fFVideoDecoder != null) {
                    fFVideoDecoder.release();
                    this.f13268A = null;
                }
                if (this.f13261t.size() > 0) {
                    this.f13261t.clear();
                }
                if (this.f13262u.size() > 0) {
                    this.f13262u.clear();
                }
                this.f13273F = false;
            }
        }
        throw th;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: d */
    public synchronized void mo18693d(long j) {
        MDLog.m7389d("AudioDecoderBySoft", "seek:" + j);
        m18712u(j);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo18694e(String str) {
        if (str == null) {
            kmw kmwVar = this.f13244c;
            if (kmwVar != null) {
                kmwVar.mo130269a(-103, -103, "Soft Init audio demuxer error! File:" + str);
            }
            return false;
        }
        MDLog.m7389d("AudioDecoderBySoft", "path:".concat(str));
        synchronized (this.f13253l) {
            FFVideoDecoder fFVideoDecoder = this.f13268A;
            if (fFVideoDecoder == null) {
                return false;
            }
            fFVideoDecoder.setDataSource(str);
            this.f13268A.selectMeidaTrack(1);
            this.f13268A.setDecoderRange(this.f13255n, this.f13256o, false);
            this.f13268A.setOutAudioInfo(this.f13248g, this.f13250i, this.f13249h);
            boolean zPrepare = this.f13268A.prepare();
            if (zPrepare) {
                this.f13245d = this.f13268A.getSampleRate();
                this.f13247f = this.f13268A.getAudioChannel();
                this.f13246e = this.f13268A.getAudioBits();
                MDLog.m7389d("AudioDecoderBySoft", "source sampleRate:" + this.f13245d + " SampleChannels:" + this.f13247f + " SampleBits:" + this.f13246e);
                if (this.f13248g <= 0) {
                    this.f13248g = this.f13245d;
                }
                if (this.f13250i <= 0) {
                    this.f13250i = this.f13247f;
                }
                if (this.f13249h <= 0) {
                    this.f13249h = this.f13246e;
                }
                if (!this.f13260s) {
                    MDLog.m7399w("AudioDecoderBySoft", "Do not use resample!");
                    this.f13248g = this.f13245d;
                    this.f13250i = this.f13247f;
                    int i = this.f13246e;
                    if (i == 16 || i == 8) {
                        this.f13249h = i;
                    } else {
                        MDLog.m7399w("AudioDecoderBySoft", "resample for smaplebit:" + this.f13246e + "->mDstSampleBits:" + this.f13249h);
                        this.f13260s = true;
                        this.f13268A.setOutAudioInfo(this.f13248g, this.f13250i, this.f13249h);
                    }
                }
                AbstractC3844b.a aVar = this.f13243b;
                if (aVar != null) {
                    aVar.mo18681a(this.f13248g, this.f13250i, this.f13249h);
                }
                long videoDuration = this.f13268A.getVideoDuration();
                this.f13251j = videoDuration;
                long j = this.f13255n;
                if (videoDuration < j) {
                    this.f13255n = 0L;
                } else {
                    this.f13268A.seek(j / 1000);
                    MDLog.m7389d("AudioDecoderBySoft", "start Seek:" + this.f13255n + " mEndPosUs:" + this.f13256o);
                }
                this.f13251j -= this.f13255n;
                this.f13268A.start();
                Thread thread = new Thread(this.f13269B, "getAMeidaTh");
                this.f13270C = thread;
                thread.start();
                MDLog.m7389d("AudioDecoderBySoft", "Prepare Complete  Success!!");
            } else {
                MDLog.m7389d("AudioDecoderBySoft", "Prepare Complete Failed !!");
                kmw kmwVar2 = this.f13244c;
                if (kmwVar2 != null) {
                    kmwVar2.mo130269a(TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION, TXEAudioDef.TXE_AUDIO_PLAY_ERR_REPEAT_OPTION, "Soft Init audio prepare error! File:".concat(str));
                }
            }
            return zPrepare;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: f */
    public synchronized void mo18695f(boolean z) {
        MDLog.m7389d("AudioDecoderBySoft", "setDecoderCycleMode:" + z);
        this.f13257p = z;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: g */
    public synchronized void mo18696g(long j, long j2) {
        try {
            MDLog.m7395i("AudioDecoderBySoft", "startPtsMs = " + j + " durationMs = " + j2);
            if (j >= 0) {
                this.f13255n = j * 1000;
            } else {
                this.f13255n = 0L;
            }
            if (j2 >= 0) {
                this.f13256o = this.f13255n + (j2 * 1000);
            } else {
                this.f13256o = 0L;
            }
            MDLog.m7389d("AudioDecoderBySoft", "mStartPosUs:" + this.f13255n + " mEndPos:" + this.f13256o);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: k */
    public synchronized void mo18697k(int i, int i2, int i3) {
        MDLog.m7389d("AudioDecoderBySoft", "dst sampleRate:" + i + " SampleChannels:" + i2 + " SampleBits:" + i3);
        this.f13260s = true;
        this.f13249h = i3;
        this.f13250i = i2;
        this.f13248g = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: m */
    public synchronized void mo18698m() {
        MDLog.m7395i("AudioDecoderBySoft", "startDecoding !!!");
        if (this.f13273F) {
            MDLog.m7389d("AudioDecoderBySoft", " mStartPosUs:" + this.f13255n);
            m18712u(this.f13255n);
            m18711t();
            return;
        }
        synchronized (this.f13253l) {
            try {
                FFVideoDecoder fFVideoDecoder = this.f13268A;
                if (fFVideoDecoder != null) {
                    this.f13273F = fFVideoDecoder.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13271D = false;
    }
}
