package com.immomo.moment.mediautils;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.google.android.exoplayer2.PlaybackException;
import com.momo.mcamera.util.MDLogTag;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import p153l.ad60;
import p153l.d710;
import p153l.f220;
import p153l.g8g0;
import p153l.spw;
import p153l.vrx;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.l */
/* JADX INFO: loaded from: classes7.dex */
public class C3998l extends AbstractC3991e {

    /* JADX INFO: renamed from: U */
    public static int f14171U = 0;

    /* JADX INFO: renamed from: V */
    public static int f14172V = 1;

    /* JADX INFO: renamed from: Q */
    private f f14189Q;

    /* JADX INFO: renamed from: o */
    private final String f14193o = "MediaEncoderWrapper";

    /* JADX INFO: renamed from: p */
    private final String f14194p = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: q */
    private final String f14195q = "audio/mp4a-latm";

    /* JADX INFO: renamed from: r */
    private C3994h f14196r = null;

    /* JADX INFO: renamed from: s */
    private C3994h f14197s = null;

    /* JADX INFO: renamed from: t */
    private f220 f14198t = null;

    /* JADX INFO: renamed from: u */
    private MediaFormat f14199u = null;

    /* JADX INFO: renamed from: v */
    private MediaFormat f14200v = null;

    /* JADX INFO: renamed from: w */
    private Object f14201w = new Object();

    /* JADX INFO: renamed from: x */
    private int f14202x = 0;

    /* JADX INFO: renamed from: y */
    private int f14203y = 0;

    /* JADX INFO: renamed from: z */
    private LinkedList<ad60> f14204z = new LinkedList<>();

    /* JADX INFO: renamed from: A */
    private LinkedList<ad60> f14173A = new LinkedList<>();

    /* JADX INFO: renamed from: B */
    private LinkedBlockingQueue<ad60> f14174B = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: C */
    private int f14175C = 0;

    /* JADX INFO: renamed from: D */
    private int f14176D = 0;

    /* JADX INFO: renamed from: E */
    private ad60 f14177E = null;

    /* JADX INFO: renamed from: F */
    private e f14178F = null;

    /* JADX INFO: renamed from: G */
    private long f14179G = -1;

    /* JADX INFO: renamed from: H */
    private long f14180H = -1;

    /* JADX INFO: renamed from: I */
    private long f14181I = -1;

    /* JADX INFO: renamed from: J */
    private long f14182J = -1;

    /* JADX INFO: renamed from: K */
    private long f14183K = -1;

    /* JADX INFO: renamed from: L */
    private long f14184L = -1;

    /* JADX INFO: renamed from: M */
    private boolean f14185M = false;

    /* JADX INFO: renamed from: N */
    int f14186N = 0;

    /* JADX INFO: renamed from: O */
    float f14187O = 0.0f;

    /* JADX INFO: renamed from: P */
    private float f14188P = 1.0f;

    /* JADX INFO: renamed from: R */
    private spw f14190R = null;

    /* JADX INFO: renamed from: S */
    private int f14191S = 0;

    /* JADX INFO: renamed from: T */
    private int f14192T = 0;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$a */
    public class a implements C3994h.b {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
            if (C3998l.this.f14198t == null || !C3998l.this.f14198t.mo114579b() || C3998l.this.f14204z.size() <= 0) {
                return;
            }
            Object[] objArrM19869G = C3998l.this.m19869G(null, null);
            C3998l.this.f14198t.mo114583f(C3998l.this.f14176D, (ByteBuffer) objArrM19869G[0], (MediaCodec.BufferInfo) objArrM19869G[1]);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size < 0) {
                return;
            }
            boolean zMo114579b = C3998l.this.f14198t.mo114579b();
            C3998l c3998l = C3998l.this;
            if (zMo114579b) {
                Object[] objArrM19869G = c3998l.m19869G(byteBuffer, bufferInfo);
                C3998l.this.f14198t.mo114583f(C3998l.this.f14176D, (ByteBuffer) objArrM19869G[0], (MediaCodec.BufferInfo) objArrM19869G[1]);
            } else {
                c3998l.f14204z.offer(new ad60(byteBuffer, bufferInfo));
            }
            if (C3998l.this.f14189Q != null) {
                C3998l.this.f14189Q.mo19898a();
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            if (C3998l.this.f14190R != null) {
                C3998l.this.f14190R.onFail(3005, "[" + i2 + Constants.AES_SUFFIX + str + " mOutputFilePath:" + C3998l.this.f14009n);
            }
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Video Media encode failed " + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            while (true) {
                int size = C3998l.this.f14204z.size();
                C3998l c3998l = C3998l.this;
                if (size <= 0) {
                    C3998l.m19884y(c3998l);
                    MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Video Media Encode finished !!!");
                    return;
                } else {
                    ad60 ad60Var = (ad60) c3998l.f14204z.pollFirst();
                    C3998l.this.f14198t.mo114583f(C3998l.this.f14176D, ad60Var.m97015a(), ad60Var.m97016b());
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            if (mediaFormat != null && C3998l.this.f14198t != null) {
                C3998l c3998l = C3998l.this;
                c3998l.f14176D = c3998l.f14198t.mo114578a(mediaFormat, 2);
                C3998l.this.f14198t.mo114581d();
            }
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Video Media Format Changed !!!");
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$b */
    public class b implements C3994h.b {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onCodecIdle() {
            if (!C3998l.this.f14198t.mo114579b() || C3998l.this.f14173A.size() <= 0) {
                return;
            }
            Object[] objArrM19868F = C3998l.this.m19868F(null, null);
            C3998l.this.f14198t.mo114583f(C3998l.this.f14175C, (ByteBuffer) objArrM19868F[0], (MediaCodec.BufferInfo) objArrM19868F[1]);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size <= 0) {
                return;
            }
            C3998l.m19866C(C3998l.this);
            boolean zMo114579b = C3998l.this.f14198t.mo114579b();
            C3998l c3998l = C3998l.this;
            if (!zMo114579b) {
                c3998l.f14173A.offer(new ad60(byteBuffer, bufferInfo));
                return;
            }
            Object[] objArrM19868F = c3998l.m19868F(byteBuffer, bufferInfo);
            C3998l.this.f14198t.mo114583f(C3998l.this.f14175C, (ByteBuffer) objArrM19868F[0], (MediaCodec.BufferInfo) objArrM19868F[1]);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onError(int i, int i2, String str) {
            if (C3998l.this.f14190R != null) {
                C3998l.this.f14190R.onFail(3006, "[" + i2 + Constants.AES_SUFFIX + str + " mOutputFilePath:" + C3998l.this.f14009n);
            }
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Audio mediaEncode failed !!!" + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return C3998l.this.m19870I(byteBuffer, bufferInfo);
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFinished() {
            while (true) {
                int size = C3998l.this.f14173A.size();
                C3998l c3998l = C3998l.this;
                if (size <= 0) {
                    C3998l.m19878s(c3998l);
                    C3998l.this.f14174B.clear();
                    MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Audio media Encode finished !!!");
                    return;
                }
                ad60 ad60Var = (ad60) c3998l.f14173A.pollFirst();
                C3998l.this.f14198t.mo114583f(C3998l.this.f14175C, ad60Var.m97015a(), ad60Var.m97016b());
            }
        }

        @Override // com.immomo.moment.mediautils.C3994h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            if (mediaFormat != null && C3998l.this.f14198t != null) {
                C3998l c3998l = C3998l.this;
                c3998l.f14175C = c3998l.f14198t.mo114578a(mediaFormat, 1);
                C3998l.this.f14198t.mo114581d();
            }
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "Audio media format failed !!!");
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$c */
    public interface c {
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$d */
    public interface d {
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        long mo19897a();
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo19898a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ c m19866C(C3998l c3998l) {
        c3998l.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public Object[] m19868F(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f14173A.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f14173A.offerLast(new ad60(byteBuffer, bufferInfo));
            }
            ad60 ad60VarPollFirst = this.f14173A.pollFirst();
            ByteBuffer byteBufferM97015a = ad60VarPollFirst.m97015a();
            bufferInfo = ad60VarPollFirst.m97016b();
            byteBuffer = byteBufferM97015a;
        }
        if (this.f14179G < 0) {
            this.f14179G = bufferInfo.presentationTimeUs;
        }
        long j = this.f14181I;
        long j2 = bufferInfo.presentationTimeUs;
        if (j < j2) {
            this.f14181I = j2;
            long j3 = j2 - this.f14179G;
            bufferInfo.presentationTimeUs = j3;
            this.f14184L = j3;
        } else {
            bufferInfo.presentationTimeUs = this.f14184L;
        }
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public Object[] m19869G(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f14204z.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f14204z.offerLast(new ad60(byteBuffer, bufferInfo));
            }
            ad60 ad60VarPollFirst = this.f14204z.pollFirst();
            ByteBuffer byteBufferM97015a = ad60VarPollFirst.m97015a();
            bufferInfo = ad60VarPollFirst.m97016b();
            byteBuffer = byteBufferM97015a;
        }
        if (this.f14180H >= 0) {
            e eVar = this.f14178F;
            if (eVar != null) {
                long jMo19897a = eVar.mo19897a();
                if (jMo19897a >= 0) {
                    bufferInfo.presentationTimeUs = jMo19897a;
                } else {
                    bufferInfo.presentationTimeUs = this.f14182J + HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
                }
            }
        } else if ((bufferInfo.flags & 1) != 0) {
            e eVar2 = this.f14178F;
            if (eVar2 != null) {
                long jMo19897a2 = eVar2.mo19897a();
                if (jMo19897a2 >= 0) {
                    bufferInfo.presentationTimeUs = jMo19897a2;
                }
            }
            boolean z = this.f14185M;
            long j = bufferInfo.presentationTimeUs;
            if (z) {
                this.f14180H = j - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            } else {
                this.f14180H = j;
            }
        } else if (this.f14185M) {
            e eVar3 = this.f14178F;
            if (eVar3 != null) {
                long jMo19897a3 = eVar3.mo19897a();
                if (jMo19897a3 >= 0) {
                    bufferInfo.presentationTimeUs = jMo19897a3;
                }
            }
            long j2 = bufferInfo.presentationTimeUs;
            if (j2 > 0) {
                this.f14180H = j2 - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            } else {
                MDLog.m7453w(MDLogTag.MEDIA_ENCODER_TAG, "MeidaEncoder pts not incresing !!");
            }
        } else {
            this.f14185M = true;
            long j3 = bufferInfo.presentationTimeUs;
            if (j3 > 0) {
                this.f14180H = j3;
            }
        }
        long j4 = this.f14180H;
        if (j4 >= 0) {
            long j5 = this.f14182J;
            long j6 = bufferInfo.presentationTimeUs;
            if (j5 < j6) {
                this.f14182J = j6;
                long j7 = j6 - j4;
                long j8 = this.f14183K;
                if (j7 - j8 < 0 || (j7 - j8 < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && j7 != 0)) {
                    j7 = j8 + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                }
                bufferInfo.presentationTimeUs = j7;
                this.f14183K = j7;
            } else if (j5 == j6) {
                long j9 = this.f14183K + 20000;
                bufferInfo.presentationTimeUs = j9;
                this.f14183K = j9;
                this.f14182J = j5 + 20000;
            } else {
                this.f14182J = j5 + 20000;
                long j10 = this.f14183K + 20000;
                bufferInfo.presentationTimeUs = j10;
                this.f14183K = j10;
            }
        }
        bufferInfo.presentationTimeUs = (long) (bufferInfo.presentationTimeUs * this.f14188P);
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: I */
    public boolean m19870I(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14201w) {
            if (this.f14174B.size() <= 0) {
                return false;
            }
            try {
                if (this.f14191S == 0) {
                    ad60 ad60VarTake = this.f14174B.take();
                    this.f14177E = ad60VarTake;
                    this.f14191S = ad60VarTake.m97016b().size;
                    this.f14192T = 0;
                }
                MediaCodec.BufferInfo bufferInfoM97016b = this.f14177E.m97016b();
                if (this.f14191S > 0) {
                    byteBuffer.position(0);
                    if (byteBuffer.capacity() >= this.f14191S) {
                        byteBuffer.put(this.f14177E.m97015a().array(), this.f14192T, this.f14191S);
                        float f2 = this.f14187O;
                        bufferInfo.set(bufferInfoM97016b.offset, this.f14191S, bufferInfoM97016b.presentationTimeUs + (f2 > 0.0f ? (long) (this.f14192T * f2) : 0L), bufferInfoM97016b.flags);
                        this.f14191S = 0;
                        this.f14192T = this.f14192T;
                    } else {
                        float f3 = this.f14187O;
                        long j = f3 > 0.0f ? (long) (this.f14192T * f3) : 0L;
                        byteBuffer.put(this.f14177E.m97015a().array(), this.f14192T, byteBuffer.capacity());
                        bufferInfo.set(bufferInfoM97016b.offset, byteBuffer.capacity(), bufferInfoM97016b.presentationTimeUs + j, bufferInfoM97016b.flags);
                        this.f14191S -= byteBuffer.capacity();
                        this.f14192T += byteBuffer.capacity();
                    }
                }
            } catch (InterruptedException e2) {
                MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Get mediaCodec buffer error !!! " + e2.toString());
                spw spwVar = this.f14190R;
                if (spwVar != null) {
                    spwVar.onFail(3008, "Get mediaCodec buffer error !!! " + g8g0.m129406a(e2) + " mOutputFilePath:" + this.f14009n);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: J */
    private boolean m19871J() {
        f220 f220Var;
        StringBuilder sb = new StringBuilder("raw frame queue size:");
        sb.append(this.f14174B.size());
        sb.append(" audio packet queue size:");
        sb.append(this.f14173A.size());
        sb.append(" video packet queue size:");
        sb.append(this.f14173A.size());
        sb.append(" muxer status : ");
        f220 f220Var2 = this.f14198t;
        sb.append((f220Var2 == null || !f220Var2.mo114579b()) ? "not start" : "starting");
        MDLog.m7443d("MediaEncoderWrapper", sb.toString());
        return (this.f14174B.isEmpty() && this.f14204z.isEmpty() && this.f14173A.isEmpty()) || (f220Var = this.f14198t) == null || !f220Var.mo114579b();
    }

    /* JADX INFO: renamed from: T */
    private void m19872T(boolean z) {
        MDLog.m7445e("MediaEncoderWrapper", "IsCancel " + z);
        if (!z && !m19873U()) {
            MDLog.m7445e("MediaEncoderWrapper", "May be lost frame , raw frame queue size:" + this.f14174B.size() + " audio packet queue size:" + this.f14173A.size() + " video packet queue size:" + this.f14173A.size());
        }
        try {
            MDLog.m7449i(MDLogTag.MEDIA_ENCODER_TAG, "MediaEncoderWrapper stopEncoding !!!");
            C3994h c3994h = this.f14196r;
            if (c3994h != null) {
                c3994h.m19800C();
                this.f14196r = null;
            }
            if (this.f14197s != null) {
                if (this.f14174B.size() > 0) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "May be lost audio frame , frame queue have data packet cnt is " + this.f14174B.size());
                }
                this.f14197s.m19800C();
                this.f14197s = null;
            }
            f220 f220Var = this.f14198t;
            if (f220Var != null) {
                f220Var.mo114582e();
                this.f14198t = null;
            }
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding failed !!!");
            spw spwVar = this.f14190R;
            if (spwVar != null) {
                spwVar.onFail(3007, "Stop encoding Exception !!! " + g8g0.m129406a(e2) + " mOutputFilePath:" + this.f14009n);
            }
        }
        this.f14200v = null;
        this.f14199u = null;
        this.f14009n = null;
        this.f14178F = null;
    }

    /* JADX INFO: renamed from: U */
    private boolean m19873U() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!m19871J()) {
            if (System.currentTimeMillis() - jCurrentTimeMillis > 10000) {
                z = false;
                MDLog.m7445e("MediaEncoderWrapper", "wait encoder time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                return z;
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e2) {
                MDLog.printErrStackTrace("MediaEncoderWrapper", e2);
            }
        }
        z = true;
        MDLog.m7445e("MediaEncoderWrapper", "wait encoder time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return z;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ d m19878s(C3998l c3998l) {
        c3998l.getClass();
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ d m19884y(C3998l c3998l) {
        c3998l.getClass();
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m19886E(ad60 ad60Var) {
        synchronized (this.f14201w) {
            if (ad60Var != null) {
                try {
                    this.f14174B.offer(ad60Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public Surface m19887H() {
        synchronized (this.f14201w) {
            try {
                C3994h c3994h = this.f14196r;
                if (c3994h == null) {
                    return null;
                }
                return c3994h.m19812x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: K */
    public void m19888K(int i, int i2, int i3, int i4, int i5) {
        synchronized (this.f14201w) {
            try {
                if (i == 0 || i3 == 0 || i4 == 0 || i5 == 0) {
                    spw spwVar = this.f14190R;
                    if (spwVar != null) {
                        spwVar.onFail(3000, "the Audio encoder parameter is exception !!!");
                    }
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Audio Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                    throw new InvalidParameterException("Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                }
                if (this.f14200v == null) {
                    MediaFormat mediaFormat = new MediaFormat();
                    this.f14200v = mediaFormat;
                    mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
                    this.f14200v.setInteger("bitrate", i4);
                    this.f14200v.setInteger("channel-count", i3);
                    this.f14200v.setInteger("sample-rate", i);
                    this.f14200v.setInteger("aac-profile", 2);
                    this.f14200v.setInteger("max-input-size", i5);
                    this.f14202x |= 1;
                    int i6 = (i3 * 16) / 8;
                    this.f14186N = i6;
                    this.f14187O = PlaybackException.CUSTOM_ERROR_CODE_BASE / (i * i6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public void m19889L() {
        if (Build.VERSION.SDK_INT < 28) {
            this.f14199u.setInteger("bitrate-mode", 0);
        } else if (C3994h.m19797z(YtVideoEncoder.MIME_TYPE, 0) || vrx.m202566a()) {
            this.f14199u.setInteger("bitrate-mode", 0);
            this.f14199u.setInteger("quality", C3994h.m19796y(YtVideoEncoder.MIME_TYPE));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m19890M(spw spwVar) {
        this.f14190R = spwVar;
    }

    /* JADX INFO: renamed from: N */
    public void m19891N(String str) {
        synchronized (this.f14201w) {
            try {
                if (str == null) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Invalid parameter! outPath=" + str);
                    throw new InvalidParameterException("Invalid parameter! outPath=" + str);
                }
                this.f14009n = str;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m19892O(Bundle bundle) {
        try {
            C3994h c3994h = this.f14196r;
            if (c3994h != null) {
                c3994h.m19808K(bundle);
            }
        } catch (Exception e2) {
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "set encoder params error !!! " + e2.toString());
            spw spwVar = this.f14190R;
            if (spwVar != null) {
                spwVar.onFail(3009, "set encoder params error !!! " + g8g0.m129406a(e2) + " mOutputFilePath:" + this.f14009n);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m19893P(float f2) {
        this.f14188P = f2;
    }

    /* JADX INFO: renamed from: Q */
    public void m19894Q(f fVar) {
        this.f14189Q = fVar;
    }

    /* JADX INFO: renamed from: R */
    public void m19895R(e eVar) {
        synchronized (this.f14201w) {
            this.f14178F = eVar;
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: S */
    public void m19896S(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        synchronized (this.f14201w) {
            if (i != 0 && i2 != 0 && i3 != 0 && i4 != 0) {
                try {
                    if (i7 >= f14171U && i7 <= f14172V) {
                        if (this.f14199u == null) {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
                            this.f14199u = mediaFormatCreateVideoFormat;
                            mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
                            this.f14199u.setInteger("frame-rate", i3);
                            if (i7 == f14171U) {
                                this.f14199u.setInteger("color-format", 2130708361);
                            } else if (i7 == f14172V) {
                                this.f14199u.setInteger("color-format", 19);
                            }
                            this.f14199u.setInteger("i-frame-interval", i5);
                            if (i6 != 0 && z) {
                                this.f14203y = i6;
                            }
                            this.f14202x |= 2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            spw spwVar = this.f14190R;
            if (spwVar != null) {
                spwVar.onFail(3001, "the Video encoder parameter is exception !!!");
            }
            MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Video Parameter is invalid ! width=" + i + " height=" + i2 + " fps=" + i3 + " bitrate=" + i4 + " gopSize=" + i5 + " srcType=" + i7);
            throw new InvalidParameterException("Parameter is invalid ! width=" + i + " height=" + i2 + " fps=" + i3 + " bitrate=" + i4 + " gopSize=" + i5 + " srcType=" + i7);
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: a */
    public void mo19721a() {
        m19872T(true);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: b */
    public void mo19722b(ad60 ad60Var) {
        synchronized (this.f14201w) {
            if (ad60Var != null) {
                try {
                    this.f14174B.offer(ad60Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: m */
    public boolean mo19733m() {
        int i;
        String str;
        synchronized (this.f14201w) {
            if (this.f14198t == null && (i = this.f14202x) != 0 && (str = this.f14009n) != null) {
                try {
                    this.f14198t = new d710(str, i);
                } catch (IOException e2) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "The Mp4MuxerWrapper create failed" + e2.toString());
                    spw spwVar = this.f14190R;
                    if (spwVar != null) {
                        spwVar.onFail(3002, "The Mp4MuxerWrapper create failed mOutputFilePath:" + this.f14009n);
                    }
                    this.f14198t = null;
                    return false;
                }
            }
            if (this.f14199u != null) {
                C3994h c3994h = new C3994h();
                this.f14196r = c3994h;
                if (!c3994h.m19810u(this.f14199u, 0)) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Create video mediacodec error !" + toString());
                    spw spwVar2 = this.f14190R;
                    if (spwVar2 != null) {
                        spwVar2.onFail(3003, "Create video mediacodec error ! mOutputFilePath:" + this.f14009n);
                    }
                    return false;
                }
                int i2 = this.f14203y;
                if (i2 != 0) {
                    this.f14198t.mo114580c(i2);
                }
                this.f14196r.m19806I(new a());
                int integer = this.f14199u.getInteger("color-format");
                C3994h c3994h2 = this.f14196r;
                if (integer == 19) {
                    c3994h2.m19809L(true);
                } else {
                    c3994h2.m19809L(false);
                }
            }
            if (this.f14200v != null) {
                C3994h c3994h3 = new C3994h();
                this.f14197s = c3994h3;
                if (!c3994h3.m19810u(this.f14200v, 0)) {
                    MDLog.m7445e(MDLogTag.MEDIA_ENCODER_TAG, "Create audio mediacodec erorr !");
                    spw spwVar3 = this.f14190R;
                    if (spwVar3 != null) {
                        spwVar3.onFail(3004, "Create audio mediacodec erorr ! mOutputFilePath:" + this.f14009n);
                    }
                    return false;
                }
                this.f14197s.m19806I(new b());
                this.f14191S = 0;
                this.f14192T = 0;
                this.f14197s.m19809L(true);
            }
            return true;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: n */
    public void mo19734n() {
        m19872T(false);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3991e
    /* JADX INFO: renamed from: c */
    public void mo19723c(ad60 ad60Var) {
    }
}
