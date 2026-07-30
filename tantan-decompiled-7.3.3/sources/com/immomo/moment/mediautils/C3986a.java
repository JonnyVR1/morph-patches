package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import p153l.g8g0;
import p153l.jpw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3986a extends AbstractC3987b {

    /* JADX INFO: renamed from: B */
    private C3996j f13926B;

    /* JADX INFO: renamed from: C */
    private C3994h f13927C;

    /* JADX INFO: renamed from: D */
    private AudioResampleUtils f13928D;

    /* JADX INFO: renamed from: A */
    private String f13925A = MDLogTag.AUDIO_DECODE_TAG;

    /* JADX INFO: renamed from: E */
    private Boolean f13929E = Boolean.FALSE;

    /* JADX INFO: renamed from: F */
    private boolean f13930F = false;

    /* JADX INFO: renamed from: G */
    private ByteBuffer f13931G = null;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$a */
    public class a implements AbstractC3992f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3992f.a
        /* JADX INFO: renamed from: a */
        public void mo19679a(String str) {
            jpw jpwVar = C3986a.this.f13938c;
            if (jpwVar != null) {
                jpwVar.mo115360a(-100, -100, "Init audio demuxer error! Exception:" + str);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$b */
    public class b implements C3994h.d {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.d
        public void onComplete() {
            AbstractC3987b.b bVar;
            C3986a c3986a = C3986a.this;
            c3986a.f13953r = true;
            if (!c3986a.f13946k && (bVar = c3986a.f13936a) != null) {
                bVar.onFinished();
            }
            C3986a.this.getClass();
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$c */
    public class c implements C3994h.b {

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.a$c$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3986a.this.f13947l) {
                    try {
                        if (C3986a.this.f13927C != null) {
                            C3986a.this.f13927C.m19800C();
                            C3986a.this.f13927C = null;
                        }
                        if (C3986a.this.f13926B != null) {
                            C3986a.this.f13926B.mo19739e();
                            C3986a.this.f13926B = null;
                        }
                        if (C3986a.this.f13928D != null) {
                            C3986a.this.f13928D.release();
                            C3986a.this.f13928D = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            int i;
            if (C3986a.this.f13928D == null) {
                if (C3986a.this.f13946k && (i = bufferInfo.size) > 0) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                    byteBuffer.get(byteBufferAllocate.array());
                    byteBufferAllocate.position(0);
                    C3986a.this.f13955t.offer(byteBufferAllocate);
                }
                AbstractC3987b.b bVar = C3986a.this.f13936a;
                if (bVar != null) {
                    bVar.mo19662a(byteBuffer, bufferInfo.size, bufferInfo.presentationTimeUs);
                }
                C3986a.this.getClass();
            } else if (bufferInfo.size > 0) {
                if (C3986a.this.f13931G == null || C3986a.this.f13931G.capacity() < bufferInfo.size) {
                    C3986a.this.f13931G = ByteBuffer.allocate(bufferInfo.size);
                }
                byteBuffer.position(0);
                byteBuffer.get(C3986a.this.f13931G.array(), 0, bufferInfo.size);
                int i2 = bufferInfo.size * 8;
                C3986a c3986a = C3986a.this;
                ByteBuffer byteBufferResamplePcmData = c3986a.f13928D.resamplePcmData(C3986a.this.f13931G.array(), (i2 / c3986a.f13940e) / c3986a.f13941f);
                if (byteBufferResamplePcmData == null) {
                    return;
                }
                byteBufferResamplePcmData.position(0);
                C3986a.this.f13955t.offer(byteBufferResamplePcmData);
                C3986a.this.getClass();
            }
            C3986a c3986a2 = C3986a.this;
            long j = c3986a2.f13950o;
            if (j == 0 || bufferInfo.presentationTimeUs < j || !c3986a2.f13946k) {
                return;
            }
            c3986a2.f13953r = true;
            if (c3986a2.f13936a != null) {
                MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "mOnDataListener.onFinished");
                C3986a.this.f13936a.onFinished();
            }
            C3986a.this.getClass();
            new Thread(new a(), "AudioDecoderRelease" + g8g0.m129407b()).start();
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            C3986a c3986a = C3986a.this;
            c3986a.f13953r = true;
            jpw jpwVar = c3986a.f13938c;
            if (jpwVar != null) {
                jpwVar.mo115360a(i, i2, str);
            }
            MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder error !!!" + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if ((C3986a.this.f13926B != null ? C3986a.this.f13926B.mo19738d(byteBuffer, bufferInfo) : 0) >= 0) {
                return true;
            }
            bufferInfo.set(0, -1, 0L, 0);
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            C3986a c3986a = C3986a.this;
            if (c3986a.f13946k) {
                c3986a.f13953r = true;
            }
            AbstractC3987b.b bVar = c3986a.f13936a;
            if (bVar != null) {
                bVar.onFinished();
            }
            C3986a.this.getClass();
            MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder finished !!!");
        }

        /* JADX WARN: Code duplicated, block: B:21:0x006a  */
        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            C3986a c3986a;
            if (mediaFormat != null) {
                if (mediaFormat.containsKey("channel-count")) {
                    C3986a.this.f13941f = mediaFormat.getInteger("channel-count");
                }
                if (mediaFormat.containsKey("sample-rate")) {
                    C3986a.this.f13939d = mediaFormat.getInteger("sample-rate");
                }
                if (mediaFormat.containsKey("bit-width")) {
                    C3986a.this.f13940e = mediaFormat.getInteger("bit-width");
                }
            }
            C3986a c3986a2 = C3986a.this;
            AbstractC3987b.a aVar = c3986a2.f13937b;
            if (aVar != null) {
                aVar.mo19661a(c3986a2.f13939d, c3986a2.f13944i, c3986a2.f13943h);
                if (!C3986a.this.f13954s) {
                    MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "Demuxer Get Wrong Audio Info!");
                    C3986a c3986a3 = C3986a.this;
                    int i = c3986a3.f13939d;
                    c3986a3.f13942g = i;
                    c3986a3.f13944i = c3986a3.f13941f;
                    c3986a3.f13942g = i;
                }
            }
            if (C3986a.this.f13928D == null) {
                C3986a c3986a4 = C3986a.this;
                if (c3986a4.f13939d == c3986a4.f13942g) {
                    c3986a = C3986a.this;
                    if (c3986a.f13941f == c3986a.f13944i && c3986a.f13940e == c3986a.f13943h) {
                        return;
                    }
                }
            } else {
                c3986a = C3986a.this;
                if (c3986a.f13941f == c3986a.f13944i) {
                    return;
                }
            }
            C3986a.this.f13928D = new AudioResampleUtils();
            AudioResampleUtils audioResampleUtils = C3986a.this.f13928D;
            C3986a c3986a5 = C3986a.this;
            if (audioResampleUtils.initResampleInfo(c3986a5.f13939d, c3986a5.f13941f, c3986a5.f13940e, c3986a5.f13942g, c3986a5.f13944i, c3986a5.f13943h) < 0) {
                MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "Init audio resampler failed !");
                C3986a.this.f13928D = null;
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
        if (!this.f13930F) {
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
                            jpwVar.mo115360a(-102, -102, "readSampleData exception:" + g8g0.m129406a(e));
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

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: c */
    public synchronized void mo19672c() {
        try {
            MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder release !!!");
            synchronized (this.f13947l) {
                try {
                    C3994h c3994h = this.f13927C;
                    if (c3994h != null) {
                        c3994h.m19800C();
                        this.f13927C = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C3996j c3996j = this.f13926B;
            if (c3996j != null) {
                c3996j.mo19739e();
                this.f13926B = null;
            }
            AudioResampleUtils audioResampleUtils = this.f13928D;
            if (audioResampleUtils != null) {
                audioResampleUtils.release();
                this.f13928D = null;
            }
            if (this.f13955t.size() > 0) {
                this.f13955t.clear();
            }
            if (this.f13956u.size() > 0) {
                this.f13956u.clear();
            }
            this.f13929E = Boolean.FALSE;
            this.f13930F = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:6:0x0017, B:8:0x001b, B:10:0x0034, B:12:0x003c, B:20:0x004d, B:23:0x0053, B:24:0x0056, B:25:0x005e), top: B:33:0x0017, outer: #1 }] */
    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: d */
    public synchronized void mo19673d(long j) {
        MDLog.m7443d(MDLogTag.AUDIO_DECODE_TAG, "seek:" + j);
        synchronized (this.f13947l) {
            try {
                C3994h c3994h = this.f13927C;
                if (c3994h != null) {
                    c3994h.m19798A();
                    this.f13927C.m19811w();
                    this.f13956u.clear();
                    this.f13955t.clear();
                    this.f13948m = null;
                    C3996j c3996j = this.f13926B;
                    if (c3996j != null) {
                        long j2 = this.f13949n;
                        if (j2 != 0) {
                            long j3 = this.f13950o;
                            if (j3 != 0) {
                                if (j < j2 || j >= j3) {
                                    j = j2;
                                }
                                c3996j.mo19740f(j);
                            } else {
                                c3996j.mo19740f(j);
                            }
                        } else {
                            c3996j.mo19740f(j);
                        }
                    }
                    this.f13927C.m19802E();
                    this.f13952q = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: e */
    public synchronized boolean mo19674e(String str) {
        MDLog.m7449i(this.f13925A, "setDataSource path = " + str);
        if (this.f13929E.booleanValue()) {
            return true;
        }
        if (str == null) {
            jpw jpwVar = this.f13938c;
            if (jpwVar != null) {
                jpwVar.mo115360a(-103, -103, "Init audio demuxer error! File:" + str);
            }
            return false;
        }
        C3996j c3996j = new C3996j();
        this.f13926B = c3996j;
        c3996j.m19742h(new a());
        MediaFormat mediaFormat = null;
        if (!this.f13926B.mo19737c(str)) {
            MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "Init audio demuxer error ! File:".concat(str));
            this.f13926B.mo19739e();
            this.f13926B = null;
            return false;
        }
        for (MediaFormat mediaFormat2 : this.f13926B.mo19736b()) {
            if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                mediaFormat = mediaFormat2;
                break;
            }
        }
        if (mediaFormat != null) {
            this.f13926B.mo19741g(mediaFormat);
            if (mediaFormat.containsKey("channel-count")) {
                int integer = mediaFormat.getInteger("channel-count");
                this.f13941f = integer;
                if (this.f13944i <= 0) {
                    this.f13944i = integer;
                }
            }
            if (mediaFormat.containsKey("sample-rate")) {
                int integer2 = mediaFormat.getInteger("sample-rate");
                this.f13939d = integer2;
                if (this.f13942g <= 0) {
                    this.f13942g = integer2;
                }
            }
            if (mediaFormat.containsKey("bit-width")) {
                int integer3 = mediaFormat.getInteger("bit-width");
                this.f13940e = integer3;
                if (this.f13943h <= 0) {
                    this.f13943h = integer3;
                }
            }
            if (mediaFormat.containsKey("durationUs")) {
                long j = mediaFormat.getLong("durationUs");
                long j2 = this.f13949n;
                if (j < j2) {
                    this.f13949n = 0L;
                } else {
                    this.f13926B.mo19740f(j2);
                }
                this.f13945j = j - this.f13949n;
            }
            synchronized (this.f13947l) {
                try {
                    C3994h c3994h = new C3994h();
                    this.f13927C = c3994h;
                    if (!c3994h.m19810u(mediaFormat, 1)) {
                        MDLog.m7445e(MDLogTag.AUDIO_DECODE_TAG, "Create media codec error !");
                        jpw jpwVar2 = this.f13938c;
                        if (jpwVar2 != null) {
                            jpwVar2.mo115360a(-101, -101, "Create media codec error! File:" + str);
                        }
                        return false;
                    }
                    this.f13927C.m19807J(new b());
                    this.f13927C.m19806I(new c());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f13929E = Boolean.TRUE;
        return true;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: f */
    public synchronized void mo19675f(boolean z) {
        MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder setDecoderCycleMode is " + z);
        this.f13951p = z;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: g */
    public synchronized void mo19676g(long j, long j2) {
        try {
            MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder startPtsMs = " + j + " durationMs = " + j2);
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
            MDLog.m7449i(this.f13925A, "mStartPosUs = " + this.f13949n + " mEndPos = " + this.f13950o);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: k */
    public synchronized void mo19677k(int i, int i2, int i3) {
        MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder sampleRate = " + i + " channels = " + i2 + " bits = " + i3);
        this.f13954s = true;
        this.f13943h = i3;
        this.f13944i = i2;
        this.f13942g = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3987b
    /* JADX INFO: renamed from: m */
    public synchronized void mo19678m() {
        MDLog.m7449i(MDLogTag.AUDIO_DECODE_TAG, "AudioDecoder startDecoding !!!");
        if (this.f13930F) {
            return;
        }
        synchronized (this.f13947l) {
            try {
                C3994h c3994h = this.f13927C;
                if (c3994h != null) {
                    c3994h.m19809L(true);
                    this.f13930F = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
