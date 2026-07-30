package com.immomo.moment.mediautils;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.annotation.RequiresApi;
import com.cosmos.mdlog.MDLog;
import com.google.android.exoplayer2.PlaybackException;
import com.imomo.momo.mediaencoder.EncodeParam;
import com.imomo.momo.mediaencoder.EncodedDataInfo;
import com.imomo.momo.mediaencoder.MediaEncoder;
import com.imomo.momo.mediamuxer.MediaMuxer;
import com.momo.mcamera.util.MDLogTag;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import p149l.kmw;
import p149l.u460;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.k */
/* JADX INFO: loaded from: classes7.dex */
public class C3854k extends AbstractC3848e {

    /* JADX INFO: renamed from: B */
    private int f13440B;

    /* JADX INFO: renamed from: o */
    private int f13464o = 0;

    /* JADX INFO: renamed from: p */
    private int f13465p = 0;

    /* JADX INFO: renamed from: q */
    private final int f13466q = 7;

    /* JADX INFO: renamed from: r */
    private final int f13467r = 8;

    /* JADX INFO: renamed from: s */
    private final int f13468s = 6;

    /* JADX INFO: renamed from: t */
    private int f13469t = 0;

    /* JADX INFO: renamed from: u */
    private int f13470u = 0;

    /* JADX INFO: renamed from: v */
    private long f13471v = 0;

    /* JADX INFO: renamed from: w */
    private MediaEncoder f13472w = null;

    /* JADX INFO: renamed from: x */
    private C3851h f13473x = null;

    /* JADX INFO: renamed from: y */
    private MediaFormat f13474y = null;

    /* JADX INFO: renamed from: z */
    private int f13475z = 0;

    /* JADX INFO: renamed from: A */
    private final String f13439A = "audio/mp4a-latm";

    /* JADX INFO: renamed from: C */
    private int f13441C = 0;

    /* JADX INFO: renamed from: D */
    private float f13442D = 0.0f;

    /* JADX INFO: renamed from: E */
    private Object f13443E = new Object();

    /* JADX INFO: renamed from: F */
    private LinkedList<u460> f13444F = new LinkedList<>();

    /* JADX INFO: renamed from: G */
    private long f13445G = -1;

    /* JADX INFO: renamed from: H */
    private long f13446H = -1;

    /* JADX INFO: renamed from: I */
    private long f13447I = -1;

    /* JADX INFO: renamed from: J */
    int f13448J = 23;

    /* JADX INFO: renamed from: K */
    int f13449K = 1;

    /* JADX INFO: renamed from: L */
    private boolean f13450L = false;

    /* JADX INFO: renamed from: M */
    private MediaMuxer f13451M = null;

    /* JADX INFO: renamed from: N */
    private byte[] f13452N = null;

    /* JADX INFO: renamed from: O */
    private byte[] f13453O = null;

    /* JADX INFO: renamed from: P */
    private byte[] f13454P = null;

    /* JADX INFO: renamed from: Q */
    private int f13455Q = 0;

    /* JADX INFO: renamed from: R */
    private int f13456R = 0;

    /* JADX INFO: renamed from: S */
    private byte[] f13457S = new byte[3686400];

    /* JADX INFO: renamed from: T */
    private EncodeParam f13458T = null;

    /* JADX INFO: renamed from: U */
    private u460 f13459U = null;

    /* JADX INFO: renamed from: V */
    private kmw f13460V = null;

    /* JADX INFO: renamed from: W */
    private LinkedBlockingQueue<u460> f13461W = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: X */
    private int f13462X = 0;

    /* JADX INFO: renamed from: Y */
    private int f13463Y = 0;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.k$a */
    public class a implements C3851h.b {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
            if (!C3854k.this.f13450L || C3854k.this.f13444F.size() <= 0) {
                return;
            }
            Object[] objArrM18877w = C3854k.this.m18877w(null, null);
            ByteBuffer byteBuffer = (ByteBuffer) objArrM18877w[0];
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) objArrM18877w[1];
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr, 0, iRemaining);
            if (C3854k.this.f13451M != null) {
                C3854k.this.f13451M.writeAudioFrame(bArr, iRemaining, bufferInfo.presentationTimeUs);
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size <= 0) {
                return;
            }
            boolean z = C3854k.this.f13450L;
            C3854k c3854k = C3854k.this;
            if (!z) {
                c3854k.f13444F.offer(new u460(byteBuffer, bufferInfo));
                return;
            }
            Object[] objArrM18877w = c3854k.m18877w(byteBuffer, bufferInfo);
            ByteBuffer byteBuffer2 = (ByteBuffer) objArrM18877w[0];
            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) objArrM18877w[1];
            int iRemaining = byteBuffer2.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer2.get(bArr, 0, iRemaining);
            if (C3854k.this.f13451M != null) {
                C3854k.this.f13451M.writeAudioFrame(bArr, iRemaining, bufferInfo2.presentationTimeUs);
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            if (C3854k.this.f13460V != null) {
                C3854k.this.f13460V.mo130269a(i, i2, str);
            }
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode failed!!!" + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return C3854k.this.m18878x(byteBuffer, bufferInfo);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            while (true) {
                int size = C3854k.this.f13444F.size();
                C3854k c3854k = C3854k.this;
                if (size <= 0) {
                    C3854k.m18873s(c3854k);
                    C3854k.this.f13461W.clear();
                    MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode finished!!!");
                    return;
                } else {
                    u460 u460Var = (u460) c3854k.f13444F.pollFirst();
                    if (C3854k.this.f13451M != null && C3854k.this.f13450L) {
                        C3854k.this.f13451M.writeAudioFrame(u460Var.m191672a().array(), u460Var.m191673b().size, u460Var.m191673b().presentationTimeUs);
                    }
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode format changed !!!");
        }
    }

    /* JADX INFO: renamed from: A */
    private int m18867A(byte[] bArr, long j) {
        int i;
        MediaEncoder mediaEncoder = this.f13472w;
        if (mediaEncoder == null || !mediaEncoder.queueInBuffer(bArr, j, 200L)) {
            return -1;
        }
        this.f13464o++;
        EncodedDataInfo encodedDataInfo = new EncodedDataInfo();
        while (this.f13472w.dequeueOutputBuffer(this.f13457S, 50L, encodedDataInfo)) {
            int i2 = encodedDataInfo.frameType;
            if (i2 == 7) {
                int i3 = (int) encodedDataInfo.dataLength;
                this.f13455Q = i3;
                if (i3 != 0) {
                    byte[] bArr2 = new byte[i3];
                    this.f13452N = bArr2;
                    System.arraycopy(this.f13457S, 0, bArr2, 0, i3);
                } else {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "get sps error");
                }
            } else if (i2 == 8) {
                int i4 = (int) encodedDataInfo.dataLength;
                this.f13456R = i4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    this.f13453O = bArr3;
                    System.arraycopy(this.f13457S, 0, bArr3, 0, i4);
                } else {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "get pps error");
                }
            } else if (i2 != 6) {
                int i5 = this.f13455Q;
                if (i5 != 0 && (i = this.f13456R) != 0 && this.f13451M != null && !this.f13450L) {
                    int i6 = i5 + i;
                    byte[] bArr4 = new byte[i6];
                    this.f13454P = bArr4;
                    System.arraycopy(this.f13452N, 0, bArr4, 0, i5);
                    System.arraycopy(this.f13453O, 0, this.f13454P, this.f13455Q, this.f13456R);
                    this.f13451M.addVideoStream(this.f13304c, this.f13305d, this.f13454P, i6, this.f13458T.frameRate);
                    this.f13451M.addAudioStream(this.f13311j, this.f13312k, this.f13313l);
                    this.f13451M.writeHeader();
                    this.f13450L = true;
                }
                this.f13465p++;
                int i7 = encodedDataInfo.frameType == 1 ? 1 : 0;
                MediaMuxer mediaMuxer = this.f13451M;
                if (mediaMuxer != null && this.f13450L) {
                    byte[] bArr5 = this.f13457S;
                    int i8 = (int) encodedDataInfo.dataLength;
                    long j2 = encodedDataInfo.pts;
                    mediaMuxer.writeVideoFrame(bArr5, i8, j2, j2, i7);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    private void m18868E(boolean z) {
        try {
            EncodedDataInfo encodedDataInfo = new EncodedDataInfo();
            MediaEncoder mediaEncoder = this.f13472w;
            if (mediaEncoder != null) {
                mediaEncoder.flush();
                do {
                    if (this.f13472w.dequeueOutputBuffer(this.f13457S, 50L, encodedDataInfo)) {
                        int i = encodedDataInfo.frameType == 1 ? 1 : 0;
                        this.f13465p++;
                        MediaMuxer mediaMuxer = this.f13451M;
                        if (mediaMuxer != null && this.f13450L) {
                            byte[] bArr = this.f13457S;
                            int i2 = (int) encodedDataInfo.dataLength;
                            long j = encodedDataInfo.pts;
                            mediaMuxer.writeVideoFrame(bArr, i2, j, j, i);
                        }
                    }
                    if (this.f13465p >= this.f13464o) {
                        break;
                    }
                } while (!z);
            }
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding inputframe = " + this.f13464o + " outputframes = " + this.f13465p);
            MediaEncoder mediaEncoder2 = this.f13472w;
            if (mediaEncoder2 != null) {
                mediaEncoder2.stopEncoding();
                this.f13472w.release();
                this.f13472w = null;
            }
            if (this.f13473x != null) {
                if (this.f13461W.size() > 0) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "May be lost audio frame , frame queue have data packet cnt is " + this.f13461W.size());
                }
                this.f13473x.m18820C();
                this.f13473x = null;
            }
            MediaMuxer mediaMuxer2 = this.f13451M;
            if (mediaMuxer2 != null) {
                mediaMuxer2.writeTrailer();
                this.f13451M.release();
                this.f13451M = null;
                this.f13450L = false;
            }
        } catch (Exception e) {
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding failed !!!" + e.toString());
            kmw kmwVar = this.f13460V;
            if (kmwVar != null) {
                kmwVar.mo130269a(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C3855l.d m18873s(C3854k c3854k) {
        c3854k.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public Object[] m18877w(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f13444F.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f13444F.offerLast(new u460(byteBuffer, bufferInfo));
            }
            u460 u460VarPollFirst = this.f13444F.pollFirst();
            ByteBuffer byteBufferM191672a = u460VarPollFirst.m191672a();
            bufferInfo = u460VarPollFirst.m191673b();
            byteBuffer = byteBufferM191672a;
        }
        if (this.f13445G < 0) {
            this.f13445G = bufferInfo.presentationTimeUs;
        }
        long j = this.f13446H;
        long j2 = bufferInfo.presentationTimeUs;
        if (j < j2) {
            this.f13446H = j2;
            long j3 = j2 - this.f13445G;
            bufferInfo.presentationTimeUs = j3;
            this.f13447I = j3;
        } else {
            bufferInfo.presentationTimeUs = this.f13447I;
        }
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: x */
    public boolean m18878x(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13443E) {
            if (this.f13461W.size() <= 0) {
                return false;
            }
            try {
                if (this.f13462X == 0) {
                    u460 u460VarTake = this.f13461W.take();
                    this.f13459U = u460VarTake;
                    this.f13462X = u460VarTake.m191673b().size;
                    this.f13463Y = 0;
                }
                MediaCodec.BufferInfo bufferInfoM191673b = this.f13459U.m191673b();
                if (this.f13462X > 0) {
                    byteBuffer.position(0);
                    if (byteBuffer.capacity() >= this.f13462X) {
                        byteBuffer.put(this.f13459U.m191672a().array(), this.f13463Y, this.f13462X);
                        float f = this.f13442D;
                        bufferInfo.set(bufferInfoM191673b.offset, this.f13462X, bufferInfoM191673b.presentationTimeUs + (f > 0.0f ? (long) (this.f13463Y * f) : 0L), bufferInfoM191673b.flags);
                        this.f13462X = 0;
                        this.f13463Y = this.f13463Y;
                    } else {
                        float f2 = this.f13442D;
                        long j = f2 > 0.0f ? (long) (this.f13463Y * f2) : 0L;
                        byteBuffer.put(this.f13459U.m191672a().array(), this.f13463Y, byteBuffer.capacity());
                        bufferInfo.set(bufferInfoM191673b.offset, byteBuffer.capacity(), bufferInfoM191673b.presentationTimeUs + j, bufferInfoM191673b.flags);
                        this.f13462X -= byteBuffer.capacity();
                        this.f13463Y += byteBuffer.capacity();
                    }
                }
            } catch (InterruptedException e) {
                MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, e.toString());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m18879y() {
        if (this.f13474y == null) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f13474y = mediaFormat;
            mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            this.f13474y.setInteger("bitrate", this.f13313l);
            this.f13474y.setInteger("channel-count", this.f13312k);
            this.f13474y.setInteger("sample-rate", this.f13311j);
            this.f13474y.setInteger("aac-profile", 2);
            this.f13474y.setInteger("max-input-size", this.f13440B);
            this.f13475z |= 1;
            int i = (this.f13312k * 16) / 8;
            this.f13441C = i;
            this.f13442D = PlaybackException.CUSTOM_ERROR_CODE_BASE / (this.f13311j * i);
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "mediaAudioBitrate = " + this.f13313l + " mediaAudioSampleChannels = " + this.f13312k + " mediaAudioSampleRate = " + this.f13311j + " maxInputBufsize = " + this.f13440B + " mSampleSize = " + this.f13441C + " mSampleDuration = " + this.f13442D);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m18880z() {
        if (this.f13458T != null || this.f13469t == 0 || this.f13470u == 0) {
            return;
        }
        EncodeParam encodeParam = new EncodeParam();
        this.f13458T = encodeParam;
        encodeParam.inputWidth = this.f13469t;
        encodeParam.inputHeight = this.f13470u;
        encodeParam.frameRate = this.f13306e;
        encodeParam.bitsRate = this.f13307f;
        encodeParam.rfConstant = this.f13448J;
        encodeParam.rcMethod = this.f13449K;
        encodeParam.enableCabac = 0;
        MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "encodeParam.inputWidth = " + this.f13458T.inputWidth + " encodeParam.inputHeight = " + this.f13458T.inputHeight + " encodeParam.frameRate = " + this.f13458T.frameRate + " encodeParam.bitsRate  = " + this.f13458T.bitsRate + " encodeParam.rfConstant = " + this.f13458T.rfConstant + " encodeParam.rcMethod = " + this.f13458T.rcMethod + " encodeParam.enableCabac = " + this.f13458T.enableCabac);
    }

    /* JADX INFO: renamed from: B */
    public void m18881B(long j) {
        this.f13471v = j;
    }

    /* JADX INFO: renamed from: C */
    public void m18882C(int i) {
        this.f13448J = i;
    }

    /* JADX INFO: renamed from: D */
    public void m18883D(int i) {
        this.f13449K = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: a */
    public void mo18741a() {
        m18868E(true);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: b */
    public void mo18742b(u460 u460Var) {
        synchronized (this.f13443E) {
            if (u460Var != null) {
                try {
                    this.f13461W.offer(u460Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: c */
    public void mo18743c(u460 u460Var) {
        int iM18867A;
        do {
            iM18867A = m18867A(u460Var.m191672a().array(), u460Var.m191673b().presentationTimeUs);
            if (iM18867A == -1) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (iM18867A != -1) {
                break;
            }
        } while (!this.f13314m);
        if (iM18867A < 0) {
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Put image to buffer queue error !!");
        } else if (iM18867A == -1) {
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Image queue is full! push failed !");
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: l */
    public void mo18752l(int i, int i2, int i3, int i4) {
        super.mo18752l(i, i2, i3, i4);
        this.f13469t = i;
        this.f13470u = i2;
        this.f13471v = 1000L;
        MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "mediaSrcWidth = " + this.f13469t + " mediaSrcHeight = " + this.f13470u + " mediaDuration = " + this.f13471v + " fps = " + i3);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: m */
    public boolean mo18753m() {
        m18879y();
        m18880z();
        synchronized (this.f13443E) {
            if (this.f13458T != null) {
                MediaEncoder mediaEncoder = new MediaEncoder();
                this.f13472w = mediaEncoder;
                mediaEncoder.initEncoder(1);
                if (this.f13451M == null && this.f13475z != 0 && this.f13315n != null) {
                    try {
                        MediaMuxer mediaMuxer = new MediaMuxer();
                        this.f13451M = mediaMuxer;
                        mediaMuxer.initMuxer(1);
                        this.f13451M.setFileName(this.f13315n);
                    } catch (Exception e) {
                        this.f13451M = null;
                        MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "soft Encoder muxer init failed !!!" + e.toString());
                    }
                    if (this.f13472w.setParam(this.f13458T)) {
                        this.f13472w.startEncoding();
                    }
                }
            }
            if (this.f13474y != null) {
                C3851h c3851h = new C3851h();
                this.f13473x = c3851h;
                if (!c3851h.m18830u(this.f13474y, 0)) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Create audio mediacodec erorr !");
                    return false;
                }
                this.f13473x.m18826I(new a());
                this.f13462X = 0;
                this.f13463Y = 0;
                this.f13473x.m18829L(true);
            }
            return true;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: n */
    public void mo18754n() {
        m18868E(false);
    }
}
