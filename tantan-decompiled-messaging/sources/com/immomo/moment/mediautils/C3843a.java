package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import p149l.kmw;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3843a extends AbstractC3844b {

    /* JADX INFO: renamed from: B */
    private C3853j f13232B;

    /* JADX INFO: renamed from: C */
    private C3851h f13233C;

    /* JADX INFO: renamed from: D */
    private AudioResampleUtils f13234D;

    /* JADX INFO: renamed from: A */
    private String f13231A = MDLogTag.AUDIO_DECODE_TAG;

    /* JADX INFO: renamed from: E */
    private Boolean f13235E = Boolean.FALSE;

    /* JADX INFO: renamed from: F */
    private boolean f13236F = false;

    /* JADX INFO: renamed from: G */
    private ByteBuffer f13237G = null;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$a */
    public class a implements AbstractC3849f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3849f.a
        /* JADX INFO: renamed from: a */
        public void mo18699a(String str) {
            kmw kmwVar = C3843a.this.f13244c;
            if (kmwVar != null) {
                kmwVar.mo130269a(-100, -100, "Init audio demuxer error! Exception:" + str);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$b */
    public class b implements C3851h.d {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.d
        public void onComplete() {
            AbstractC3844b.b bVar;
            C3843a c3843a = C3843a.this;
            c3843a.f13259r = true;
            if (!c3843a.f13252k && (bVar = c3843a.f13242a) != null) {
                bVar.onFinished();
            }
            C3843a.this.getClass();
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$c */
    public class c implements C3851h.b {

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3843a.this.f13253l) {
                    try {
                        if (C3843a.this.f13233C != null) {
                            C3843a.this.f13233C.m18820C();
                            C3843a.this.f13233C = null;
                        }
                        if (C3843a.this.f13232B != null) {
                            C3843a.this.f13232B.mo18759e();
                            C3843a.this.f13232B = null;
                        }
                        if (C3843a.this.f13234D != null) {
                            C3843a.this.f13234D.release();
                            C3843a.this.f13234D = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            int i;
            if (C3843a.this.f13234D == null) {
                if (C3843a.this.f13252k && (i = bufferInfo.size) > 0) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                    byteBuffer.get(byteBufferAllocate.array());
                    byteBufferAllocate.position(0);
                    C3843a.this.f13261t.offer(byteBufferAllocate);
                }
                AbstractC3844b.b bVar = C3843a.this.f13242a;
                if (bVar != null) {
                    bVar.mo18682a(byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                }
                C3843a.this.getClass();
            } else if (bufferInfo.size > 0) {
                if (C3843a.this.f13237G == null || C3843a.this.f13237G.capacity() < bufferInfo.size) {
                    C3843a.this.f13237G = ByteBuffer.allocate(bufferInfo.size);
                }
                byteBuffer.position(0);
                byteBuffer.get(C3843a.this.f13237G.array(), 0, bufferInfo.size);
                int i2 = bufferInfo.size * 8;
                C3843a c3843a = C3843a.this;
                ByteBuffer byteBufferResamplePcmData = c3843a.f13234D.resamplePcmData(C3843a.this.f13237G.array(), (i2 / c3843a.f13246e) / c3843a.f13247f);
                if (byteBufferResamplePcmData == null) {
                    return;
                }
                byteBufferResamplePcmData.position(0);
                C3843a.this.f13261t.offer(byteBufferResamplePcmData);
                C3843a.this.getClass();
            }
            C3843a c3843a2 = C3843a.this;
            long j = c3843a2.f13256o;
            if (j == 0 || bufferInfo.presentationTimeUs < j || !c3843a2.f13252k) {
                return;
            }
            c3843a2.f13259r = true;
            if (c3843a2.f13242a != null) {
                MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "mOnDataListener.onFinished");
                C3843a.this.f13242a.onFinished();
            }
            C3843a.this.getClass();
            new Thread(new a(), "AudioDecoderRelease" + zzf0.m221018b()).start();
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            C3843a c3843a = C3843a.this;
            c3843a.f13259r = true;
            kmw kmwVar = c3843a.f13244c;
            if (kmwVar != null) {
                kmwVar.mo130269a(i, i2, str);
            }
            MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder error !!!" + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if ((C3843a.this.f13232B != null ? C3843a.this.f13232B.mo18758d(byteBuffer, bufferInfo) : 0) >= 0) {
                return true;
            }
            bufferInfo.set(0, -1, 0L, 0);
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            C3843a c3843a = C3843a.this;
            if (c3843a.f13252k) {
                c3843a.f13259r = true;
            }
            AbstractC3844b.b bVar = c3843a.f13242a;
            if (bVar != null) {
                bVar.onFinished();
            }
            C3843a.this.getClass();
            MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder finished !!!");
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            C3843a c3843a;
            if (mediaFormat != null) {
                if (mediaFormat.containsKey("channel-count")) {
                    C3843a.this.f13247f = mediaFormat.getInteger("channel-count");
                }
                if (mediaFormat.containsKey("sample-rate")) {
                    C3843a.this.f13245d = mediaFormat.getInteger("sample-rate");
                }
                if (mediaFormat.containsKey("bit-width")) {
                    C3843a.this.f13246e = mediaFormat.getInteger("bit-width");
                }
            }
            C3843a c3843a2 = C3843a.this;
            AbstractC3844b.a aVar = c3843a2.f13243b;
            if (aVar != null) {
                aVar.mo18681a(c3843a2.f13245d, c3843a2.f13250i, c3843a2.f13249h);
                if (!C3843a.this.f13260s) {
                    MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "Demuxer Get Wrong Audio Info!");
                    C3843a c3843a3 = C3843a.this;
                    int i = c3843a3.f13245d;
                    c3843a3.f13248g = i;
                    c3843a3.f13250i = c3843a3.f13247f;
                    c3843a3.f13248g = i;
                }
            }
            if (C3843a.this.f13234D == null) {
                C3843a c3843a4 = C3843a.this;
                if (c3843a4.f13245d == c3843a4.f13248g) {
                    c3843a = C3843a.this;
                    if (c3843a.f13247f == c3843a.f13250i && c3843a.f13246e == c3843a.f13249h) {
                        return;
                    }
                }
            } else {
                c3843a = C3843a.this;
                if (c3843a.f13247f == c3843a.f13250i) {
                    return;
                }
            }
            C3843a.this.f13234D = new AudioResampleUtils();
            AudioResampleUtils audioResampleUtils = C3843a.this.f13234D;
            C3843a c3843a5 = C3843a.this;
            if (audioResampleUtils.initResampleInfo(c3843a5.f13245d, c3843a5.f13247f, c3843a5.f13246e, c3843a5.f13248g, c3843a5.f13250i, c3843a5.f13249h) < 0) {
                MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "Init audio resampler failed !");
                C3843a.this.f13234D = null;
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
        if (!this.f13236F) {
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
                            kmwVar.mo130269a(-102, -102, "readSampleData exception:" + zzf0.m221017a(e));
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

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: c */
    public synchronized void mo18692c() {
        try {
            MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder release !!!");
            synchronized (this.f13253l) {
                try {
                    C3851h c3851h = this.f13233C;
                    if (c3851h != null) {
                        c3851h.m18820C();
                        this.f13233C = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3853j c3853j = this.f13232B;
            if (c3853j != null) {
                c3853j.mo18759e();
                this.f13232B = null;
            }
            AudioResampleUtils audioResampleUtils = this.f13234D;
            if (audioResampleUtils != null) {
                audioResampleUtils.release();
                this.f13234D = null;
            }
            if (this.f13261t.size() > 0) {
                this.f13261t.clear();
            }
            if (this.f13262u.size() > 0) {
                this.f13262u.clear();
            }
            this.f13235E = Boolean.FALSE;
            this.f13236F = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0017, B:8:0x001b, B:10:0x0034, B:12:0x003c, B:20:0x004d, B:23:0x0053, B:24:0x0056, B:25:0x005e), top: B:33:0x0017, outer: #1 }] */
    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: d */
    public synchronized void mo18693d(long j) {
        MDLog.m7389d(MDLogTag.AUDIO_DECODE_TAG, "seek:" + j);
        synchronized (this.f13253l) {
            try {
                C3851h c3851h = this.f13233C;
                if (c3851h != null) {
                    c3851h.m18818A();
                    this.f13233C.m18831w();
                    this.f13262u.clear();
                    this.f13261t.clear();
                    this.f13254m = null;
                    C3853j c3853j = this.f13232B;
                    if (c3853j != null) {
                        long j2 = this.f13255n;
                        if (j2 != 0) {
                            long j3 = this.f13256o;
                            if (j3 != 0) {
                                if (j < j2 || j >= j3) {
                                    j = j2;
                                }
                                c3853j.mo18760f(j);
                            } else {
                                c3853j.mo18760f(j);
                            }
                        } else {
                            c3853j.mo18760f(j);
                        }
                    }
                    this.f13233C.m18822E();
                    this.f13258q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo18694e(String str) {
        MDLog.m7395i(this.f13231A, "setDataSource path = " + str);
        if (this.f13235E.booleanValue()) {
            return true;
        }
        if (str == null) {
            kmw kmwVar = this.f13244c;
            if (kmwVar != null) {
                kmwVar.mo130269a(-103, -103, "Init audio demuxer error! File:" + str);
            }
            return false;
        }
        C3853j c3853j = new C3853j();
        this.f13232B = c3853j;
        c3853j.m18762h(new a());
        MediaFormat mediaFormat = null;
        if (!this.f13232B.mo18757c(str)) {
            MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "Init audio demuxer error ! File:".concat(str));
            this.f13232B.mo18759e();
            this.f13232B = null;
            return false;
        }
        for (MediaFormat mediaFormat2 : this.f13232B.mo18756b()) {
            if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                mediaFormat = mediaFormat2;
                break;
            }
        }
        if (mediaFormat != null) {
            this.f13232B.mo18761g(mediaFormat);
            if (mediaFormat.containsKey("channel-count")) {
                int integer = mediaFormat.getInteger("channel-count");
                this.f13247f = integer;
                if (this.f13250i <= 0) {
                    this.f13250i = integer;
                }
            }
            if (mediaFormat.containsKey("sample-rate")) {
                int integer2 = mediaFormat.getInteger("sample-rate");
                this.f13245d = integer2;
                if (this.f13248g <= 0) {
                    this.f13248g = integer2;
                }
            }
            if (mediaFormat.containsKey("bit-width")) {
                int integer3 = mediaFormat.getInteger("bit-width");
                this.f13246e = integer3;
                if (this.f13249h <= 0) {
                    this.f13249h = integer3;
                }
            }
            if (mediaFormat.containsKey("durationUs")) {
                long j = mediaFormat.getLong("durationUs");
                long j2 = this.f13255n;
                if (j < j2) {
                    this.f13255n = 0L;
                } else {
                    this.f13232B.mo18760f(j2);
                }
                this.f13251j = j - this.f13255n;
            }
            synchronized (this.f13253l) {
                try {
                    C3851h c3851h = new C3851h();
                    this.f13233C = c3851h;
                    if (!c3851h.m18830u(mediaFormat, 1)) {
                        MDLog.m7391e(MDLogTag.AUDIO_DECODE_TAG, "Create media codec error !");
                        kmw kmwVar2 = this.f13244c;
                        if (kmwVar2 != null) {
                            kmwVar2.mo130269a(-101, -101, "Create media codec error! File:" + str);
                        }
                        return false;
                    }
                    this.f13233C.m18827J(new b());
                    this.f13233C.m18826I(new c());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13235E = Boolean.TRUE;
        return true;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: f */
    public synchronized void mo18695f(boolean z) {
        MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder setDecoderCycleMode is " + z);
        this.f13257p = z;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: g */
    public synchronized void mo18696g(long j, long j2) {
        try {
            MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder startPtsMs = " + j + " durationMs = " + j2);
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
            MDLog.m7395i(this.f13231A, "mStartPosUs = " + this.f13255n + " mEndPos = " + this.f13256o);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: k */
    public synchronized void mo18697k(int i, int i2, int i3) {
        MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder sampleRate = " + i + " channels = " + i2 + " bits = " + i3);
        this.f13260s = true;
        this.f13249h = i3;
        this.f13250i = i2;
        this.f13248g = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3844b
    /* JADX INFO: renamed from: m */
    public synchronized void mo18698m() {
        MDLog.m7395i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder startDecoding !!!");
        if (this.f13236F) {
            return;
        }
        synchronized (this.f13253l) {
            try {
                C3851h c3851h = this.f13233C;
                if (c3851h != null) {
                    c3851h.m18829L(true);
                    this.f13236F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
