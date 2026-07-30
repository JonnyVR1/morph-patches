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
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.ad60;
import p153l.jpw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.k */
/* JADX INFO: loaded from: classes7.dex */
public class C3997k extends AbstractC3991e {

    /* JADX INFO: renamed from: B */
    private int f14134B;

    /* JADX INFO: renamed from: o */
    private int f14158o = 0;

    /* JADX INFO: renamed from: p */
    private int f14159p = 0;

    /* JADX INFO: renamed from: q */
    private final int f14160q = 7;

    /* JADX INFO: renamed from: r */
    private final int f14161r = 8;

    /* JADX INFO: renamed from: s */
    private final int f14162s = 6;

    /* JADX INFO: renamed from: t */
    private int f14163t = 0;

    /* JADX INFO: renamed from: u */
    private int f14164u = 0;

    /* JADX INFO: renamed from: v */
    private long f14165v = 0;

    /* JADX INFO: renamed from: w */
    private MediaEncoder f14166w = null;

    /* JADX INFO: renamed from: x */
    private C3994h f14167x = null;

    /* JADX INFO: renamed from: y */
    private MediaFormat f14168y = null;

    /* JADX INFO: renamed from: z */
    private int f14169z = 0;

    /* JADX INFO: renamed from: A */
    private final String f14133A = "audio/mp4a-latm";

    /* JADX INFO: renamed from: C */
    private int f14135C = 0;

    /* JADX INFO: renamed from: D */
    private float f14136D = 0.0f;

    /* JADX INFO: renamed from: E */
    private Object f14137E = new Object();

    /* JADX INFO: renamed from: F */
    private LinkedList<ad60> f14138F = new LinkedList<>();

    /* JADX INFO: renamed from: G */
    private long f14139G = -1;

    /* JADX INFO: renamed from: H */
    private long f14140H = -1;

    /* JADX INFO: renamed from: I */
    private long f14141I = -1;

    /* JADX INFO: renamed from: J */
    int f14142J = 23;

    /* JADX INFO: renamed from: K */
    int f14143K = 1;

    /* JADX INFO: renamed from: L */
    private boolean f14144L = false;

    /* JADX INFO: renamed from: M */
    private MediaMuxer f14145M = null;

    /* JADX INFO: renamed from: N */
    private byte[] f14146N = null;

    /* JADX INFO: renamed from: O */
    private byte[] f14147O = null;

    /* JADX INFO: renamed from: P */
    private byte[] f14148P = null;

    /* JADX INFO: renamed from: Q */
    private int f14149Q = 0;

    /* JADX INFO: renamed from: R */
    private int f14150R = 0;

    /* JADX INFO: renamed from: S */
    private byte[] f14151S = new byte[3686400];

    /* JADX INFO: renamed from: T */
    private EncodeParam f14152T = null;

    /* JADX INFO: renamed from: U */
    private ad60 f14153U = null;

    /* JADX INFO: renamed from: V */
    private jpw f14154V = null;

    /* JADX INFO: renamed from: W */
    private LinkedBlockingQueue<ad60> f14155W = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: X */
    private int f14156X = 0;

    /* JADX INFO: renamed from: Y */
    private int f14157Y = 0;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.k$a */
    public class a implements C3994h.b {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
            if (!C3997k.this.f14144L || C3997k.this.f14138F.size() <= 0) {
                return;
            }
            Object[] objArrM19857w = C3997k.this.m19857w(null, null);
            ByteBuffer byteBuffer = (ByteBuffer) objArrM19857w[0];
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) objArrM19857w[1];
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr, 0, iRemaining);
            if (C3997k.this.f14145M != null) {
                C3997k.this.f14145M.writeAudioFrame(bArr, iRemaining, bufferInfo.presentationTimeUs);
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size <= 0) {
                return;
            }
            boolean z = C3997k.this.f14144L;
            C3997k c3997k = C3997k.this;
            if (!z) {
                c3997k.f14138F.offer(new ad60(byteBuffer, bufferInfo));
                return;
            }
            Object[] objArrM19857w = c3997k.m19857w(byteBuffer, bufferInfo);
            ByteBuffer byteBuffer2 = (ByteBuffer) objArrM19857w[0];
            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) objArrM19857w[1];
            int iRemaining = byteBuffer2.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer2.get(bArr, 0, iRemaining);
            if (C3997k.this.f14145M != null) {
                C3997k.this.f14145M.writeAudioFrame(bArr, iRemaining, bufferInfo2.presentationTimeUs);
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            if (C3997k.this.f14154V != null) {
                C3997k.this.f14154V.mo115360a(i, i2, str);
            }
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode failed!!!" + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return C3997k.this.m19858x(byteBuffer, bufferInfo);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            while (true) {
                int size = C3997k.this.f14138F.size();
                C3997k c3997k = C3997k.this;
                if (size <= 0) {
                    C3997k.m19853s(c3997k);
                    C3997k.this.f14155W.clear();
                    MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode finished!!!");
                    return;
                } else {
                    ad60 ad60Var = (ad60) c3997k.f14138F.pollFirst();
                    if (C3997k.this.f14145M != null && C3997k.this.f14144L) {
                        C3997k.this.f14145M.writeAudioFrame(ad60Var.m97015a().array(), ad60Var.m97016b().size, ad60Var.m97016b().presentationTimeUs);
                    }
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Audio encode format changed !!!");
        }
    }

    /* JADX INFO: renamed from: A */
    private int m19847A(byte[] bArr, long j) {
        int i;
        MediaEncoder mediaEncoder = this.f14166w;
        if (mediaEncoder == null || !mediaEncoder.queueInBuffer(bArr, j, 200L)) {
            return -1;
        }
        this.f14158o++;
        EncodedDataInfo encodedDataInfo = new EncodedDataInfo();
        while (this.f14166w.dequeueOutputBuffer(this.f14151S, 50L, encodedDataInfo)) {
            int i2 = encodedDataInfo.frameType;
            if (i2 == 7) {
                int i3 = (int) encodedDataInfo.dataLength;
                this.f14149Q = i3;
                if (i3 != 0) {
                    byte[] bArr2 = new byte[i3];
                    this.f14146N = bArr2;
                    System.arraycopy(this.f14151S, 0, bArr2, 0, i3);
                } else {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "get sps error");
                }
            } else if (i2 == 8) {
                int i4 = (int) encodedDataInfo.dataLength;
                this.f14150R = i4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    this.f14147O = bArr3;
                    System.arraycopy(this.f14151S, 0, bArr3, 0, i4);
                } else {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "get pps error");
                }
            } else if (i2 != 6) {
                int i5 = this.f14149Q;
                if (i5 != 0 && (i = this.f14150R) != 0 && this.f14145M != null && !this.f14144L) {
                    int i6 = i5 + i;
                    byte[] bArr4 = new byte[i6];
                    this.f14148P = bArr4;
                    System.arraycopy(this.f14146N, 0, bArr4, 0, i5);
                    System.arraycopy(this.f14147O, 0, this.f14148P, this.f14149Q, this.f14150R);
                    this.f14145M.addVideoStream(this.f13998c, this.f13999d, this.f14148P, i6, this.f14152T.frameRate);
                    this.f14145M.addAudioStream(this.f14005j, this.f14006k, this.f14007l);
                    this.f14145M.writeHeader();
                    this.f14144L = true;
                }
                this.f14159p++;
                int i7 = encodedDataInfo.frameType == 1 ? 1 : 0;
                MediaMuxer mediaMuxer = this.f14145M;
                if (mediaMuxer != null && this.f14144L) {
                    byte[] bArr5 = this.f14151S;
                    int i8 = (int) encodedDataInfo.dataLength;
                    long j2 = encodedDataInfo.pts;
                    mediaMuxer.writeVideoFrame(bArr5, i8, j2, j2, i7);
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    private void m19848E(boolean z) {
        try {
            EncodedDataInfo encodedDataInfo = new EncodedDataInfo();
            MediaEncoder mediaEncoder = this.f14166w;
            if (mediaEncoder != null) {
                mediaEncoder.flush();
                do {
                    if (this.f14166w.dequeueOutputBuffer(this.f14151S, 50L, encodedDataInfo)) {
                        int i = encodedDataInfo.frameType == 1 ? 1 : 0;
                        this.f14159p++;
                        MediaMuxer mediaMuxer = this.f14145M;
                        if (mediaMuxer != null && this.f14144L) {
                            byte[] bArr = this.f14151S;
                            int i2 = (int) encodedDataInfo.dataLength;
                            long j = encodedDataInfo.pts;
                            mediaMuxer.writeVideoFrame(bArr, i2, j, j, i);
                        }
                    }
                    if (this.f14159p >= this.f14158o) {
                        break;
                    }
                } while (!z);
            }
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding inputframe = " + this.f14158o + " outputframes = " + this.f14159p);
            MediaEncoder mediaEncoder2 = this.f14166w;
            if (mediaEncoder2 != null) {
                mediaEncoder2.stopEncoding();
                this.f14166w.release();
                this.f14166w = null;
            }
            if (this.f14167x != null) {
                if (this.f14155W.size() > 0) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "May be lost audio frame , frame queue have data packet cnt is " + this.f14155W.size());
                }
                this.f14167x.m19800C();
                this.f14167x = null;
            }
            MediaMuxer mediaMuxer2 = this.f14145M;
            if (mediaMuxer2 != null) {
                mediaMuxer2.writeTrailer();
                this.f14145M.release();
                this.f14145M = null;
                this.f14144L = false;
            }
        } catch (Exception e) {
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding failed !!!" + e.toString());
            jpw jpwVar = this.f14154V;
            if (jpwVar != null) {
                jpwVar.mo115360a(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_CREATE_FAIL, 0, null);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C3998l.d m19853s(C3997k c3997k) {
        c3997k.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public Object[] m19857w(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f14138F.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f14138F.offerLast(new ad60(byteBuffer, bufferInfo));
            }
            ad60 ad60VarPollFirst = this.f14138F.pollFirst();
            ByteBuffer byteBufferM97015a = ad60VarPollFirst.m97015a();
            bufferInfo = ad60VarPollFirst.m97016b();
            byteBuffer = byteBufferM97015a;
        }
        if (this.f14139G < 0) {
            this.f14139G = bufferInfo.presentationTimeUs;
        }
        long j = this.f14140H;
        long j2 = bufferInfo.presentationTimeUs;
        if (j < j2) {
            this.f14140H = j2;
            long j3 = j2 - this.f14139G;
            bufferInfo.presentationTimeUs = j3;
            this.f14141I = j3;
        } else {
            bufferInfo.presentationTimeUs = this.f14141I;
        }
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: x */
    public boolean m19858x(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14137E) {
            if (this.f14155W.size() <= 0) {
                return false;
            }
            try {
                if (this.f14156X == 0) {
                    ad60 ad60VarTake = this.f14155W.take();
                    this.f14153U = ad60VarTake;
                    this.f14156X = ad60VarTake.m97016b().size;
                    this.f14157Y = 0;
                }
                MediaCodec.BufferInfo bufferInfoM97016b = this.f14153U.m97016b();
                if (this.f14156X > 0) {
                    byteBuffer.position(0);
                    if (byteBuffer.capacity() >= this.f14156X) {
                        byteBuffer.put(this.f14153U.m97015a().array(), this.f14157Y, this.f14156X);
                        float f = this.f14136D;
                        bufferInfo.set(bufferInfoM97016b.offset, this.f14156X, bufferInfoM97016b.presentationTimeUs + (f > 0.0f ? (long) (this.f14157Y * f) : 0L), bufferInfoM97016b.flags);
                        this.f14156X = 0;
                        this.f14157Y = this.f14157Y;
                    } else {
                        float f2 = this.f14136D;
                        long j = f2 > 0.0f ? (long) (this.f14157Y * f2) : 0L;
                        byteBuffer.put(this.f14153U.m97015a().array(), this.f14157Y, byteBuffer.capacity());
                        bufferInfo.set(bufferInfoM97016b.offset, byteBuffer.capacity(), bufferInfoM97016b.presentationTimeUs + j, bufferInfoM97016b.flags);
                        this.f14156X -= byteBuffer.capacity();
                        this.f14157Y += byteBuffer.capacity();
                    }
                }
            } catch (InterruptedException e) {
                MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, e.toString());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: y */
    private void m19859y() {
        if (this.f14168y == null) {
            MediaFormat mediaFormat = new MediaFormat();
            this.f14168y = mediaFormat;
            mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
            this.f14168y.setInteger("bitrate", this.f14007l);
            this.f14168y.setInteger("channel-count", this.f14006k);
            this.f14168y.setInteger("sample-rate", this.f14005j);
            this.f14168y.setInteger("aac-profile", 2);
            this.f14168y.setInteger("max-input-size", this.f14134B);
            this.f14169z |= 1;
            int i = (this.f14006k * 16) / 8;
            this.f14135C = i;
            this.f14136D = PlaybackException.CUSTOM_ERROR_CODE_BASE / (this.f14005j * i);
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "mediaAudioBitrate = " + this.f14007l + " mediaAudioSampleChannels = " + this.f14006k + " mediaAudioSampleRate = " + this.f14005j + " maxInputBufsize = " + this.f14134B + " mSampleSize = " + this.f14135C + " mSampleDuration = " + this.f14136D);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m19860z() {
        if (this.f14152T != null || this.f14163t == 0 || this.f14164u == 0) {
            return;
        }
        EncodeParam encodeParam = new EncodeParam();
        this.f14152T = encodeParam;
        encodeParam.inputWidth = this.f14163t;
        encodeParam.inputHeight = this.f14164u;
        encodeParam.frameRate = this.f14000e;
        encodeParam.bitsRate = this.f14001f;
        encodeParam.rfConstant = this.f14142J;
        encodeParam.rcMethod = this.f14143K;
        encodeParam.enableCabac = 0;
        MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "encodeParam.inputWidth = " + this.f14152T.inputWidth + " encodeParam.inputHeight = " + this.f14152T.inputHeight + " encodeParam.frameRate = " + this.f14152T.frameRate + " encodeParam.bitsRate  = " + this.f14152T.bitsRate + " encodeParam.rfConstant = " + this.f14152T.rfConstant + " encodeParam.rcMethod = " + this.f14152T.rcMethod + " encodeParam.enableCabac = " + this.f14152T.enableCabac);
    }

    /* JADX INFO: renamed from: B */
    public void m19861B(long j) {
        this.f14165v = j;
    }

    /* JADX INFO: renamed from: C */
    public void m19862C(int i) {
        this.f14142J = i;
    }

    /* JADX INFO: renamed from: D */
    public void m19863D(int i) {
        this.f14143K = i;
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: a */
    public void mo19721a() {
        m19848E(true);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: b */
    public void mo19722b(ad60 ad60Var) {
        synchronized (this.f14137E) {
            if (ad60Var != null) {
                try {
                    this.f14155W.offer(ad60Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: c */
    public void mo19723c(ad60 ad60Var) {
        int iM19847A;
        do {
            iM19847A = m19847A(ad60Var.m97015a().array(), ad60Var.m97016b().presentationTimeUs);
            if (iM19847A == -1) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (iM19847A != -1) {
                break;
            }
        } while (!this.f14008m);
        if (iM19847A < 0) {
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Put image to buffer queue error !!");
        } else if (iM19847A == -1) {
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Image queue is full! push failed !");
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: l */
    public void mo19732l(int i, int i2, int i3, int i4) {
        super.mo19732l(i, i2, i3, i4);
        this.f14163t = i;
        this.f14164u = i2;
        this.f14165v = 1000L;
        MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "mediaSrcWidth = " + this.f14163t + " mediaSrcHeight = " + this.f14164u + " mediaDuration = " + this.f14165v + " fps = " + i3);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: m */
    public boolean mo19733m() {
        m19859y();
        m19860z();
        synchronized (this.f14137E) {
            if (this.f14152T != null) {
                MediaEncoder mediaEncoder = new MediaEncoder();
                this.f14166w = mediaEncoder;
                mediaEncoder.initEncoder(1);
                if (this.f14145M == null && this.f14169z != 0 && this.f14009n != null) {
                    try {
                        MediaMuxer mediaMuxer = new MediaMuxer();
                        this.f14145M = mediaMuxer;
                        mediaMuxer.initMuxer(1);
                        this.f14145M.setFileName(this.f14009n);
                    } catch (Exception e) {
                        this.f14145M = null;
                        MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "soft Encoder muxer init failed !!!" + e.toString());
                    }
                    if (this.f14166w.setParam(this.f14152T)) {
                        this.f14166w.startEncoding();
                    }
                }
            }
            if (this.f14168y != null) {
                C3994h c3994h = new C3994h();
                this.f14167x = c3994h;
                if (!c3994h.m19810u(this.f14168y, 0)) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Create audio mediacodec erorr !");
                    return false;
                }
                this.f14167x.m19806I(new a());
                this.f14156X = 0;
                this.f14157Y = 0;
                this.f14167x.m19809L(true);
            }
            return true;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: n */
    public void mo19734n() {
        m19848E(false);
    }
}
