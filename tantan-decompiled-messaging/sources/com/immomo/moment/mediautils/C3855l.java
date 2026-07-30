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
import p149l.tmw;
import p149l.ty00;
import p149l.u460;
import p149l.xt10;
import p149l.yix;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.l */
/* JADX INFO: loaded from: classes7.dex */
public class C3855l extends AbstractC3848e {

    /* JADX INFO: renamed from: U */
    public static int f13477U = 0;

    /* JADX INFO: renamed from: V */
    public static int f13478V = 1;

    /* JADX INFO: renamed from: Q */
    private f f13495Q;

    /* JADX INFO: renamed from: o */
    private final String f13499o = "MediaEncoderWrapper";

    /* JADX INFO: renamed from: p */
    private final String f13500p = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: q */
    private final String f13501q = "audio/mp4a-latm";

    /* JADX INFO: renamed from: r */
    private C3851h f13502r = null;

    /* JADX INFO: renamed from: s */
    private C3851h f13503s = null;

    /* JADX INFO: renamed from: t */
    private xt10 f13504t = null;

    /* JADX INFO: renamed from: u */
    private MediaFormat f13505u = null;

    /* JADX INFO: renamed from: v */
    private MediaFormat f13506v = null;

    /* JADX INFO: renamed from: w */
    private Object f13507w = new Object();

    /* JADX INFO: renamed from: x */
    private int f13508x = 0;

    /* JADX INFO: renamed from: y */
    private int f13509y = 0;

    /* JADX INFO: renamed from: z */
    private LinkedList<u460> f13510z = new LinkedList<>();

    /* JADX INFO: renamed from: A */
    private LinkedList<u460> f13479A = new LinkedList<>();

    /* JADX INFO: renamed from: B */
    private LinkedBlockingQueue<u460> f13480B = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: C */
    private int f13481C = 0;

    /* JADX INFO: renamed from: D */
    private int f13482D = 0;

    /* JADX INFO: renamed from: E */
    private u460 f13483E = null;

    /* JADX INFO: renamed from: F */
    private e f13484F = null;

    /* JADX INFO: renamed from: G */
    private long f13485G = -1;

    /* JADX INFO: renamed from: H */
    private long f13486H = -1;

    /* JADX INFO: renamed from: I */
    private long f13487I = -1;

    /* JADX INFO: renamed from: J */
    private long f13488J = -1;

    /* JADX INFO: renamed from: K */
    private long f13489K = -1;

    /* JADX INFO: renamed from: L */
    private long f13490L = -1;

    /* JADX INFO: renamed from: M */
    private boolean f13491M = false;

    /* JADX INFO: renamed from: N */
    int f13492N = 0;

    /* JADX INFO: renamed from: O */
    float f13493O = 0.0f;

    /* JADX INFO: renamed from: P */
    private float f13494P = 1.0f;

    /* JADX INFO: renamed from: R */
    private tmw f13496R = null;

    /* JADX INFO: renamed from: S */
    private int f13497S = 0;

    /* JADX INFO: renamed from: T */
    private int f13498T = 0;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$a */
    public class a implements C3851h.b {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
            if (C3855l.this.f13504t == null || !C3855l.this.f13504t.mo190996b() || C3855l.this.f13510z.size() <= 0) {
                return;
            }
            Object[] objArrM18889G = C3855l.this.m18889G(null, null);
            C3855l.this.f13504t.mo191000f(C3855l.this.f13482D, (ByteBuffer) objArrM18889G[0], (MediaCodec.BufferInfo) objArrM18889G[1]);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size < 0) {
                return;
            }
            boolean zMo190996b = C3855l.this.f13504t.mo190996b();
            C3855l c3855l = C3855l.this;
            if (zMo190996b) {
                Object[] objArrM18889G = c3855l.m18889G(byteBuffer, bufferInfo);
                C3855l.this.f13504t.mo191000f(C3855l.this.f13482D, (ByteBuffer) objArrM18889G[0], (MediaCodec.BufferInfo) objArrM18889G[1]);
            } else {
                c3855l.f13510z.offer(new u460(byteBuffer, bufferInfo));
            }
            if (C3855l.this.f13495Q != null) {
                C3855l.this.f13495Q.mo18918a();
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            if (C3855l.this.f13496R != null) {
                C3855l.this.f13496R.onFail(3005, "[" + i2 + Constants.AES_SUFFIX + str + " mOutputFilePath:" + C3855l.this.f13315n);
            }
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Video Media encode failed " + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return true;
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            while (true) {
                int size = C3855l.this.f13510z.size();
                C3855l c3855l = C3855l.this;
                if (size <= 0) {
                    C3855l.m18904y(c3855l);
                    MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Video Media Encode finished !!!");
                    return;
                } else {
                    u460 u460Var = (u460) c3855l.f13510z.pollFirst();
                    C3855l.this.f13504t.mo191000f(C3855l.this.f13482D, u460Var.m191672a(), u460Var.m191673b());
                }
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            if (mediaFormat != null && C3855l.this.f13504t != null) {
                C3855l c3855l = C3855l.this;
                c3855l.f13482D = c3855l.f13504t.mo190995a(mediaFormat, 2);
                C3855l.this.f13504t.mo190998d();
            }
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Video Media Format Changed !!!");
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$b */
    public class b implements C3851h.b {
        public b() {
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onCodecIdle() {
            if (!C3855l.this.f13504t.mo190996b() || C3855l.this.f13479A.size() <= 0) {
                return;
            }
            Object[] objArrM18888F = C3855l.this.m18888F(null, null);
            C3855l.this.f13504t.mo191000f(C3855l.this.f13481C, (ByteBuffer) objArrM18888F[0], (MediaCodec.BufferInfo) objArrM18888F[1]);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onDataOutput(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            if (bufferInfo.size <= 0) {
                return;
            }
            C3855l.m18886C(C3855l.this);
            boolean zMo190996b = C3855l.this.f13504t.mo190996b();
            C3855l c3855l = C3855l.this;
            if (!zMo190996b) {
                c3855l.f13479A.offer(new u460(byteBuffer, bufferInfo));
                return;
            }
            Object[] objArrM18888F = c3855l.m18888F(byteBuffer, bufferInfo);
            C3855l.this.f13504t.mo191000f(C3855l.this.f13481C, (ByteBuffer) objArrM18888F[0], (MediaCodec.BufferInfo) objArrM18888F[1]);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onError(int i, int i2, String str) {
            if (C3855l.this.f13496R != null) {
                C3855l.this.f13496R.onFail(3006, "[" + i2 + Constants.AES_SUFFIX + str + " mOutputFilePath:" + C3855l.this.f13315n);
            }
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Audio mediaEncode failed !!!" + i2 + str);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public boolean onFeedingData(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
            return C3855l.this.m18890I(byteBuffer, bufferInfo);
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFinished() {
            while (true) {
                int size = C3855l.this.f13479A.size();
                C3855l c3855l = C3855l.this;
                if (size <= 0) {
                    C3855l.m18898s(c3855l);
                    C3855l.this.f13480B.clear();
                    MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Audio media Encode finished !!!");
                    return;
                }
                u460 u460Var = (u460) c3855l.f13479A.pollFirst();
                C3855l.this.f13504t.mo191000f(C3855l.this.f13481C, u460Var.m191672a(), u460Var.m191673b());
            }
        }

        @Override // com.immomo.moment.mediautils.C3851h.b
        public void onFormatChanged(MediaFormat mediaFormat) {
            if (mediaFormat != null && C3855l.this.f13504t != null) {
                C3855l c3855l = C3855l.this;
                c3855l.f13481C = c3855l.f13504t.mo190995a(mediaFormat, 1);
                C3855l.this.f13504t.mo190998d();
            }
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "Audio media format failed !!!");
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
        long mo18917a();
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.l$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo18918a();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ c m18886C(C3855l c3855l) {
        c3855l.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public Object[] m18888F(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f13479A.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f13479A.offerLast(new u460(byteBuffer, bufferInfo));
            }
            u460 u460VarPollFirst = this.f13479A.pollFirst();
            ByteBuffer byteBufferM191672a = u460VarPollFirst.m191672a();
            bufferInfo = u460VarPollFirst.m191673b();
            byteBuffer = byteBufferM191672a;
        }
        if (this.f13485G < 0) {
            this.f13485G = bufferInfo.presentationTimeUs;
        }
        long j = this.f13487I;
        long j2 = bufferInfo.presentationTimeUs;
        if (j < j2) {
            this.f13487I = j2;
            long j3 = j2 - this.f13485G;
            bufferInfo.presentationTimeUs = j3;
            this.f13490L = j3;
        } else {
            bufferInfo.presentationTimeUs = this.f13490L;
        }
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public Object[] m18889G(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.f13510z.size() > 0) {
            if (byteBuffer != null && bufferInfo != null) {
                this.f13510z.offerLast(new u460(byteBuffer, bufferInfo));
            }
            u460 u460VarPollFirst = this.f13510z.pollFirst();
            ByteBuffer byteBufferM191672a = u460VarPollFirst.m191672a();
            bufferInfo = u460VarPollFirst.m191673b();
            byteBuffer = byteBufferM191672a;
        }
        if (this.f13486H >= 0) {
            e eVar = this.f13484F;
            if (eVar != null) {
                long jMo18917a = eVar.mo18917a();
                if (jMo18917a >= 0) {
                    bufferInfo.presentationTimeUs = jMo18917a;
                } else {
                    bufferInfo.presentationTimeUs = this.f13488J + HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
                }
            }
        } else if ((bufferInfo.flags & 1) != 0) {
            e eVar2 = this.f13484F;
            if (eVar2 != null) {
                long jMo18917a2 = eVar2.mo18917a();
                if (jMo18917a2 >= 0) {
                    bufferInfo.presentationTimeUs = jMo18917a2;
                }
            }
            boolean z = this.f13491M;
            long j = bufferInfo.presentationTimeUs;
            if (z) {
                this.f13486H = j - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            } else {
                this.f13486H = j;
            }
        } else if (this.f13491M) {
            e eVar3 = this.f13484F;
            if (eVar3 != null) {
                long jMo18917a3 = eVar3.mo18917a();
                if (jMo18917a3 >= 0) {
                    bufferInfo.presentationTimeUs = jMo18917a3;
                }
            }
            long j2 = bufferInfo.presentationTimeUs;
            if (j2 > 0) {
                this.f13486H = j2 - HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT;
            } else {
                MDLog.m7399w(MDLogTag.MEDIA_ENCODER_TAG, "MeidaEncoder pts not incresing !!");
            }
        } else {
            this.f13491M = true;
            long j3 = bufferInfo.presentationTimeUs;
            if (j3 > 0) {
                this.f13486H = j3;
            }
        }
        long j4 = this.f13486H;
        if (j4 >= 0) {
            long j5 = this.f13488J;
            long j6 = bufferInfo.presentationTimeUs;
            if (j5 < j6) {
                this.f13488J = j6;
                long j7 = j6 - j4;
                long j8 = this.f13489K;
                if (j7 - j8 < 0 || (j7 - j8 < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS && j7 != 0)) {
                    j7 = j8 + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
                }
                bufferInfo.presentationTimeUs = j7;
                this.f13489K = j7;
            } else if (j5 == j6) {
                long j9 = this.f13489K + 20000;
                bufferInfo.presentationTimeUs = j9;
                this.f13489K = j9;
                this.f13488J = j5 + 20000;
            } else {
                this.f13488J = j5 + 20000;
                long j10 = this.f13489K + 20000;
                bufferInfo.presentationTimeUs = j10;
                this.f13489K = j10;
            }
        }
        bufferInfo.presentationTimeUs = (long) (bufferInfo.presentationTimeUs * this.f13494P);
        return new Object[]{byteBuffer, bufferInfo};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: I */
    public boolean m18890I(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13507w) {
            if (this.f13480B.size() <= 0) {
                return false;
            }
            try {
                if (this.f13497S == 0) {
                    u460 u460VarTake = this.f13480B.take();
                    this.f13483E = u460VarTake;
                    this.f13497S = u460VarTake.m191673b().size;
                    this.f13498T = 0;
                }
                MediaCodec.BufferInfo bufferInfoM191673b = this.f13483E.m191673b();
                if (this.f13497S > 0) {
                    byteBuffer.position(0);
                    if (byteBuffer.capacity() >= this.f13497S) {
                        byteBuffer.put(this.f13483E.m191672a().array(), this.f13498T, this.f13497S);
                        float f2 = this.f13493O;
                        bufferInfo.set(bufferInfoM191673b.offset, this.f13497S, bufferInfoM191673b.presentationTimeUs + (f2 > 0.0f ? (long) (this.f13498T * f2) : 0L), bufferInfoM191673b.flags);
                        this.f13497S = 0;
                        this.f13498T = this.f13498T;
                    } else {
                        float f3 = this.f13493O;
                        long j = f3 > 0.0f ? (long) (this.f13498T * f3) : 0L;
                        byteBuffer.put(this.f13483E.m191672a().array(), this.f13498T, byteBuffer.capacity());
                        bufferInfo.set(bufferInfoM191673b.offset, byteBuffer.capacity(), bufferInfoM191673b.presentationTimeUs + j, bufferInfoM191673b.flags);
                        this.f13497S -= byteBuffer.capacity();
                        this.f13498T += byteBuffer.capacity();
                    }
                }
            } catch (InterruptedException e2) {
                MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Get mediaCodec buffer error !!! " + e2.toString());
                tmw tmwVar = this.f13496R;
                if (tmwVar != null) {
                    tmwVar.onFail(3008, "Get mediaCodec buffer error !!! " + zzf0.m221017a(e2) + " mOutputFilePath:" + this.f13315n);
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: J */
    private boolean m18891J() {
        xt10 xt10Var;
        StringBuilder sb = new StringBuilder("raw frame queue size:");
        sb.append(this.f13480B.size());
        sb.append(" audio packet queue size:");
        sb.append(this.f13479A.size());
        sb.append(" video packet queue size:");
        sb.append(this.f13479A.size());
        sb.append(" muxer status : ");
        xt10 xt10Var2 = this.f13504t;
        sb.append((xt10Var2 == null || !xt10Var2.mo190996b()) ? "not start" : "starting");
        MDLog.m7389d("MediaEncoderWrapper", sb.toString());
        return (this.f13480B.isEmpty() && this.f13510z.isEmpty() && this.f13479A.isEmpty()) || (xt10Var = this.f13504t) == null || !xt10Var.mo190996b();
    }

    /* JADX INFO: renamed from: T */
    private void m18892T(boolean z) {
        MDLog.m7391e("MediaEncoderWrapper", "IsCancel " + z);
        if (!z && !m18893U()) {
            MDLog.m7391e("MediaEncoderWrapper", "May be lost frame , raw frame queue size:" + this.f13480B.size() + " audio packet queue size:" + this.f13479A.size() + " video packet queue size:" + this.f13479A.size());
        }
        try {
            MDLog.m7395i(MDLogTag.MEDIA_ENCODER_TAG, "MediaEncoderWrapper stopEncoding !!!");
            C3851h c3851h = this.f13502r;
            if (c3851h != null) {
                c3851h.m18820C();
                this.f13502r = null;
            }
            if (this.f13503s != null) {
                if (this.f13480B.size() > 0) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "May be lost audio frame , frame queue have data packet cnt is " + this.f13480B.size());
                }
                this.f13503s.m18820C();
                this.f13503s = null;
            }
            xt10 xt10Var = this.f13504t;
            if (xt10Var != null) {
                xt10Var.mo190999e();
                this.f13504t = null;
            }
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "StopEncoding failed !!!");
            tmw tmwVar = this.f13496R;
            if (tmwVar != null) {
                tmwVar.onFail(3007, "Stop encoding Exception !!! " + zzf0.m221017a(e2) + " mOutputFilePath:" + this.f13315n);
            }
        }
        this.f13506v = null;
        this.f13505u = null;
        this.f13315n = null;
        this.f13484F = null;
    }

    /* JADX INFO: renamed from: U */
    private boolean m18893U() {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!m18891J()) {
            if (System.currentTimeMillis() - jCurrentTimeMillis > 10000) {
                z = false;
                MDLog.m7391e("MediaEncoderWrapper", "wait encoder time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                return z;
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e2) {
                MDLog.printErrStackTrace("MediaEncoderWrapper", e2);
            }
        }
        z = true;
        MDLog.m7391e("MediaEncoderWrapper", "wait encoder time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
        return z;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ d m18898s(C3855l c3855l) {
        c3855l.getClass();
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ d m18904y(C3855l c3855l) {
        c3855l.getClass();
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m18906E(u460 u460Var) {
        synchronized (this.f13507w) {
            if (u460Var != null) {
                try {
                    this.f13480B.offer(u460Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public Surface m18907H() {
        synchronized (this.f13507w) {
            try {
                C3851h c3851h = this.f13502r;
                if (c3851h == null) {
                    return null;
                }
                return c3851h.m18832x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: K */
    public void m18908K(int i, int i2, int i3, int i4, int i5) {
        synchronized (this.f13507w) {
            try {
                if (i == 0 || i3 == 0 || i4 == 0 || i5 == 0) {
                    tmw tmwVar = this.f13496R;
                    if (tmwVar != null) {
                        tmwVar.onFail(3000, "the Audio encoder parameter is exception !!!");
                    }
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Audio Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                    throw new InvalidParameterException("Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                }
                if (this.f13506v == null) {
                    MediaFormat mediaFormat = new MediaFormat();
                    this.f13506v = mediaFormat;
                    mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
                    this.f13506v.setInteger("bitrate", i4);
                    this.f13506v.setInteger("channel-count", i3);
                    this.f13506v.setInteger("sample-rate", i);
                    this.f13506v.setInteger("aac-profile", 2);
                    this.f13506v.setInteger("max-input-size", i5);
                    this.f13508x |= 1;
                    int i6 = (i3 * 16) / 8;
                    this.f13492N = i6;
                    this.f13493O = PlaybackException.CUSTOM_ERROR_CODE_BASE / (i * i6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: L */
    public void m18909L() {
        if (Build.VERSION.SDK_INT < 28) {
            this.f13505u.setInteger("bitrate-mode", 0);
        } else if (C3851h.m18817z(YtVideoEncoder.MIME_TYPE, 0) || yix.m215025a()) {
            this.f13505u.setInteger("bitrate-mode", 0);
            this.f13505u.setInteger("quality", C3851h.m18816y(YtVideoEncoder.MIME_TYPE));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m18910M(tmw tmwVar) {
        this.f13496R = tmwVar;
    }

    /* JADX INFO: renamed from: N */
    public void m18911N(String str) {
        synchronized (this.f13507w) {
            try {
                if (str == null) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Invalid parameter! outPath=" + str);
                    throw new InvalidParameterException("Invalid parameter! outPath=" + str);
                }
                this.f13315n = str;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m18912O(Bundle bundle) {
        try {
            C3851h c3851h = this.f13502r;
            if (c3851h != null) {
                c3851h.m18828K(bundle);
            }
        } catch (Exception e2) {
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "set encoder params error !!! " + e2.toString());
            tmw tmwVar = this.f13496R;
            if (tmwVar != null) {
                tmwVar.onFail(3009, "set encoder params error !!! " + zzf0.m221017a(e2) + " mOutputFilePath:" + this.f13315n);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m18913P(float f2) {
        this.f13494P = f2;
    }

    /* JADX INFO: renamed from: Q */
    public void m18914Q(f fVar) {
        this.f13495Q = fVar;
    }

    /* JADX INFO: renamed from: R */
    public void m18915R(e eVar) {
        synchronized (this.f13507w) {
            this.f13484F = eVar;
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: S */
    public void m18916S(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        synchronized (this.f13507w) {
            if (i != 0 && i2 != 0 && i3 != 0 && i4 != 0) {
                try {
                    if (i7 >= f13477U && i7 <= f13478V) {
                        if (this.f13505u == null) {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
                            this.f13505u = mediaFormatCreateVideoFormat;
                            mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
                            this.f13505u.setInteger("frame-rate", i3);
                            if (i7 == f13477U) {
                                this.f13505u.setInteger("color-format", 2130708361);
                            } else if (i7 == f13478V) {
                                this.f13505u.setInteger("color-format", 19);
                            }
                            this.f13505u.setInteger("i-frame-interval", i5);
                            if (i6 != 0 && z) {
                                this.f13509y = i6;
                            }
                            this.f13508x |= 2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            tmw tmwVar = this.f13496R;
            if (tmwVar != null) {
                tmwVar.onFail(3001, "the Video encoder parameter is exception !!!");
            }
            MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Video Parameter is invalid ! width=" + i + " height=" + i2 + " fps=" + i3 + " bitrate=" + i4 + " gopSize=" + i5 + " srcType=" + i7);
            throw new InvalidParameterException("Parameter is invalid ! width=" + i + " height=" + i2 + " fps=" + i3 + " bitrate=" + i4 + " gopSize=" + i5 + " srcType=" + i7);
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: a */
    public void mo18741a() {
        m18892T(true);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: b */
    public void mo18742b(u460 u460Var) {
        synchronized (this.f13507w) {
            if (u460Var != null) {
                try {
                    this.f13480B.offer(u460Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: m */
    public boolean mo18753m() {
        int i;
        String str;
        synchronized (this.f13507w) {
            if (this.f13504t == null && (i = this.f13508x) != 0 && (str = this.f13315n) != null) {
                try {
                    this.f13504t = new ty00(str, i);
                } catch (IOException e2) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "The Mp4MuxerWrapper create failed" + e2.toString());
                    tmw tmwVar = this.f13496R;
                    if (tmwVar != null) {
                        tmwVar.onFail(3002, "The Mp4MuxerWrapper create failed mOutputFilePath:" + this.f13315n);
                    }
                    this.f13504t = null;
                    return false;
                }
            }
            if (this.f13505u != null) {
                C3851h c3851h = new C3851h();
                this.f13502r = c3851h;
                if (!c3851h.m18830u(this.f13505u, 0)) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Create video mediacodec error !" + toString());
                    tmw tmwVar2 = this.f13496R;
                    if (tmwVar2 != null) {
                        tmwVar2.onFail(3003, "Create video mediacodec error ! mOutputFilePath:" + this.f13315n);
                    }
                    return false;
                }
                int i2 = this.f13509y;
                if (i2 != 0) {
                    this.f13504t.mo190997c(i2);
                }
                this.f13502r.m18826I(new a());
                int integer = this.f13505u.getInteger("color-format");
                C3851h c3851h2 = this.f13502r;
                if (integer == 19) {
                    c3851h2.m18829L(true);
                } else {
                    c3851h2.m18829L(false);
                }
            }
            if (this.f13506v != null) {
                C3851h c3851h3 = new C3851h();
                this.f13503s = c3851h3;
                if (!c3851h3.m18830u(this.f13506v, 0)) {
                    MDLog.m7391e(MDLogTag.MEDIA_ENCODER_TAG, "Create audio mediacodec erorr !");
                    tmw tmwVar3 = this.f13496R;
                    if (tmwVar3 != null) {
                        tmwVar3.onFail(3004, "Create audio mediacodec erorr ! mOutputFilePath:" + this.f13315n);
                    }
                    return false;
                }
                this.f13503s.m18826I(new b());
                this.f13497S = 0;
                this.f13498T = 0;
                this.f13503s.m18829L(true);
            }
            return true;
        }
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: n */
    public void mo18754n() {
        m18892T(false);
    }

    @Override // com.immomo.moment.mediautils.AbstractC3848e
    /* JADX INFO: renamed from: c */
    public void mo18743c(u460 u460Var) {
    }
}
