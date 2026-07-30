package com.tencent.liteav.videoencoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.p088c.C14009b;
import com.tencent.liteav.basic.p088c.C14010c;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14019l;
import com.tencent.liteav.basic.p088c.EnumC14018k;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.util.C14053g;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14324a extends C14326c {

    /* JADX INFO: renamed from: G */
    private int f59972G;

    /* JADX INFO: renamed from: H */
    private int f59973H;

    /* JADX INFO: renamed from: I */
    private int f59974I;

    /* JADX INFO: renamed from: J */
    private int f59975J;

    /* JADX INFO: renamed from: K */
    private int f59976K;

    /* JADX INFO: renamed from: L */
    private boolean f59977L;

    /* JADX INFO: renamed from: V */
    private C14015h f59987V;

    /* JADX INFO: renamed from: Y */
    private ArrayList<Long> f59990Y;

    /* JADX INFO: renamed from: n */
    private boolean f60012n;

    /* JADX INFO: renamed from: r */
    private C14053g f60016r;

    /* JADX INFO: renamed from: w */
    private Object f60021w;

    /* JADX INFO: renamed from: a */
    private int f59992a = 0;

    /* JADX INFO: renamed from: b */
    private long f60000b = 0;

    /* JADX INFO: renamed from: c */
    private double f60001c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: d */
    private long f60002d = 0;

    /* JADX INFO: renamed from: e */
    private long f60003e = 0;

    /* JADX INFO: renamed from: f */
    private int f60004f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f60005g = false;

    /* JADX INFO: renamed from: h */
    private boolean f60006h = true;

    /* JADX INFO: renamed from: i */
    private long f60007i = 0;

    /* JADX INFO: renamed from: j */
    private long f60008j = 0;

    /* JADX INFO: renamed from: k */
    private long f60009k = 0;

    /* JADX INFO: renamed from: l */
    private long f60010l = 0;

    /* JADX INFO: renamed from: m */
    private long f60011m = 0;

    /* JADX INFO: renamed from: o */
    private long f60013o = 0;

    /* JADX INFO: renamed from: p */
    private long f60014p = 0;

    /* JADX INFO: renamed from: q */
    private MediaCodec f60015q = null;

    /* JADX INFO: renamed from: s */
    private Runnable f60017s = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.10
        @Override // java.lang.Runnable
        public void run() {
            C14324a.this.m84089e();
        }
    };

    /* JADX INFO: renamed from: t */
    private Runnable f60018t = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.11
        @Override // java.lang.Runnable
        public void run() {
            C14324a.this.m84077b(10);
        }
    };

    /* JADX INFO: renamed from: u */
    private Runnable f60019u = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.2
        @Override // java.lang.Runnable
        public void run() {
            C14324a.this.m84077b(1);
        }
    };

    /* JADX INFO: renamed from: v */
    private ArrayDeque<Long> f60020v = new ArrayDeque<>(10);

    /* JADX INFO: renamed from: x */
    private Surface f60022x = null;

    /* JADX INFO: renamed from: y */
    private boolean f60023y = true;

    /* JADX INFO: renamed from: z */
    private boolean f60024z = true;

    /* JADX INFO: renamed from: A */
    private boolean f59966A = false;

    /* JADX INFO: renamed from: B */
    private ByteBuffer[] f59967B = null;

    /* JADX INFO: renamed from: C */
    private byte[] f59968C = null;

    /* JADX INFO: renamed from: D */
    private volatile long f59969D = 0;

    /* JADX INFO: renamed from: E */
    private long f59970E = 0;

    /* JADX INFO: renamed from: F */
    private long f59971F = 0;

    /* JADX INFO: renamed from: M */
    private boolean f59978M = true;

    /* JADX INFO: renamed from: N */
    private boolean f59979N = false;

    /* JADX INFO: renamed from: O */
    private int f59980O = 0;

    /* JADX INFO: renamed from: P */
    private int f59981P = 0;

    /* JADX INFO: renamed from: Q */
    private int f59982Q = 0;

    /* JADX INFO: renamed from: R */
    private long f59983R = 0;

    /* JADX INFO: renamed from: S */
    private int f59984S = 0;

    /* JADX INFO: renamed from: T */
    private int f59985T = 0;

    /* JADX INFO: renamed from: U */
    private int f59986U = -1;

    /* JADX INFO: renamed from: W */
    private final Object f59988W = new Object();

    /* JADX INFO: renamed from: X */
    private boolean f59989X = false;

    /* JADX INFO: renamed from: Z */
    private int f59991Z = 0;

    /* JADX INFO: renamed from: aa */
    private long f59993aa = 0;

    /* JADX INFO: renamed from: ab */
    private int f59994ab = 3;

    /* JADX INFO: renamed from: ac */
    private int f59995ac = 0;

    /* JADX INFO: renamed from: ad */
    private boolean f59996ad = false;

    /* JADX INFO: renamed from: ae */
    private boolean f59997ae = true;

    /* JADX INFO: renamed from: af */
    private long f59998af = 0;

    /* JADX INFO: renamed from: ag */
    private Runnable f59999ag = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.3
        @Override // java.lang.Runnable
        public void run() {
            C14324a.this.f59998af = System.currentTimeMillis();
            C14324a.this.m84076b();
            C14324a.this.m84085d();
            C14324a.this.m84083c();
        }
    };

    public C14324a() {
        this.f60016r = null;
        this.f60016r = new C14053g("HWVideoEncoder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX INFO: renamed from: a */
    public int m84059a(int i) {
        byte[] bArrM84074a;
        int i2;
        String str;
        int i3;
        int i4;
        long j;
        int i5 = -1;
        if (this.f60015q == null) {
            return -1;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int iDequeueOutputBuffer = this.f60015q.dequeueOutputBuffer(bufferInfo, i * 1000);
            boolean z = false;
            if (iDequeueOutputBuffer == -1) {
                return 0;
            }
            if (iDequeueOutputBuffer == -3) {
                this.f59967B = this.f60015q.getOutputBuffers();
                return 1;
            }
            if (iDequeueOutputBuffer == -2) {
                try {
                    callDelegate(this.f60015q.getOutputFormat());
                    return 1;
                } catch (IllegalStateException e) {
                    TXCLog.m82966e("TXCHWVideoEncoder", "mediacodec getOutputFormat failed." + e);
                    return -1;
                }
            }
            if (iDequeueOutputBuffer < 0) {
                return -1;
            }
            long timeTick = TXCTimeUtil.getTimeTick();
            ByteBuffer byteBuffer = this.f59967B[iDequeueOutputBuffer];
            if (byteBuffer == null) {
                str = "TXCHWVideoEncoder";
                iDequeueOutputBuffer = iDequeueOutputBuffer;
                z = false;
            } else {
                int i6 = bufferInfo.size;
                byte[] bArr = new byte[i6];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                byteBuffer.get(bArr, 0, bufferInfo.size);
                if (bufferInfo.size > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0) {
                    int i7 = 3;
                    if (bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
                        while (true) {
                            if (i7 >= i6 - 4) {
                                i7 = 0;
                                break;
                            }
                            if (bArr[i7] == 0 && bArr[i7 + 1] == 0 && bArr[i7 + 2] == 0 && bArr[i7 + 3] == 1) {
                                i6 -= i7;
                                break;
                            }
                            i7++;
                        }
                        bArrM84074a = new byte[i6];
                        System.arraycopy(bArr, i7, bArrM84074a, 0, i6);
                    } else {
                        bArrM84074a = bArr;
                    }
                } else {
                    bArrM84074a = bArr;
                }
                int i8 = bufferInfo.size;
                int i9 = bufferInfo.flags;
                if (i8 == 0) {
                    if ((i9 & 4) != 0) {
                        InterfaceC14327d interfaceC14327d = this.mListener;
                        if (interfaceC14327d != null) {
                            interfaceC14327d.mo82656a(null, 0);
                        }
                        i5 = -2;
                    }
                } else if ((i9 & 2) == 2) {
                    if (this.f60005g) {
                        this.f59968C = (byte[]) bArrM84074a.clone();
                    } else {
                        this.f59968C = m84074a((byte[]) bArrM84074a.clone());
                    }
                    i5 = 1;
                } else {
                    if ((i9 & 1) == 1) {
                        this.f59972G = -1;
                        if (this.f60005g) {
                            byte[] bArr2 = this.f59968C;
                            byte[] bArr3 = new byte[bArr2.length + bArrM84074a.length];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            System.arraycopy(bArrM84074a, 0, bArr3, this.f59968C.length, bArrM84074a.length);
                            i2 = 0;
                            bArrM84074a = bArr3;
                        } else {
                            byte[] bArrM84074a2 = m84074a(bArrM84074a);
                            byte[] bArr4 = this.f59968C;
                            bArrM84074a = new byte[bArr4.length + bArrM84074a2.length];
                            System.arraycopy(bArr4, 0, bArrM84074a, 0, bArr4.length);
                            System.arraycopy(bArrM84074a2, 0, bArrM84074a, this.f59968C.length, bArrM84074a2.length);
                            i2 = 0;
                        }
                    } else {
                        if (!this.f60005g) {
                            bArrM84074a = m84074a(bArrM84074a);
                        }
                        i2 = 1;
                    }
                    if (!this.f59977L) {
                        int i10 = this.f59972G + 1;
                        this.f59972G = i10;
                        if (i10 == this.f60004f * this.f59973H) {
                            m84090f();
                        }
                    }
                    long jM84061a = m84061a();
                    long j2 = bufferInfo.presentationTimeUs / 1000;
                    if (this.f59971F == 0) {
                        this.f59971F = jM84061a;
                    }
                    if (this.f59970E == 0) {
                        this.f59970E = j2;
                    }
                    long j3 = j2 + (this.f59971F - this.f59970E);
                    long j4 = this.f60011m;
                    if (jM84061a <= j4) {
                        jM84061a = j4 + 1;
                    }
                    if (jM84061a > j3) {
                        jM84061a = j3;
                    }
                    this.f60011m = jM84061a;
                    long timeTick2 = TXCTimeUtil.getTimeTick();
                    if (i2 == 0) {
                        long j5 = this.f60002d;
                        if (timeTick2 > 1000 + j5) {
                            this.f60000b = (long) (((this.f60013o * 8000.0d) / (timeTick2 - j5)) / 1024.0d);
                            j = 0;
                            this.f60013o = 0L;
                            this.f60002d = timeTick2;
                            m84092g();
                        } else {
                            j = 0;
                        }
                        long j6 = this.f60008j;
                        long j7 = j;
                        long j8 = j6 + 1;
                        this.f60008j = j8;
                        if (j8 % 256 == j7) {
                            this.f60008j = j6 + 2;
                        }
                        this.f60009k = j7;
                    } else {
                        this.f60009k++;
                    }
                    this.f60013o += (long) bArrM84074a.length;
                    long j9 = this.f60003e;
                    if (timeTick2 > 2000 + j9) {
                        this.f60001c = (this.f60014p * 1000.0d) / (timeTick2 - j9);
                        long jLongValue = 0;
                        this.f60014p = 0L;
                        this.f60003e = timeTick2;
                        for (Long l2 : this.f59990Y) {
                            if (l2.longValue() > jLongValue) {
                                jLongValue = l2.longValue();
                            }
                        }
                        this.f59990Y.clear();
                        this.f59991Z = (int) (jLongValue * 3);
                    }
                    this.f60014p++;
                    byteBuffer.position(bufferInfo.offset);
                    this.f60010l++;
                    InterfaceC14327d interfaceC14327d2 = this.mListener;
                    if (interfaceC14327d2 != null) {
                        interfaceC14327d2.mo82652a(2, this.f60008j, this.f60009k);
                    }
                    boolean z2 = this.f60006h;
                    int i11 = i2;
                    long j10 = this.f60008j;
                    if (z2) {
                        long j11 = this.f60009k;
                        str = "TXCHWVideoEncoder";
                        iDequeueOutputBuffer = iDequeueOutputBuffer;
                        i3 = -2;
                        i4 = 1;
                        callDelegate(bArrM84074a, i11, j10, j11, this.f60010l, i11 == 0 ? j11 : j11 - 1, j3, j3, 0, byteBuffer, bufferInfo);
                    } else {
                        iDequeueOutputBuffer = iDequeueOutputBuffer;
                        str = "TXCHWVideoEncoder";
                        i3 = -2;
                        i4 = 1;
                        long j12 = this.f60009k;
                        callDelegate(bArr, i11, j10, j12, this.f60010l, i11 == 0 ? j12 : j12 - 1, j3, j3, 0, byteBuffer, bufferInfo);
                    }
                    this.f59981P++;
                    if ((bufferInfo.flags & 4) != 0) {
                        InterfaceC14327d interfaceC14327d3 = this.mListener;
                        z = false;
                        if (interfaceC14327d3 != null) {
                            interfaceC14327d3.mo82656a(null, 0);
                        }
                        i5 = i3;
                    } else {
                        z = false;
                        i5 = i4;
                    }
                    this.f59990Y.add(Long.valueOf(TXCTimeUtil.getTimeTick() - timeTick));
                }
                str = "TXCHWVideoEncoder";
            }
            try {
                MediaCodec mediaCodec = this.f60015q;
                if (mediaCodec == null) {
                    return i5;
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z);
                return i5;
            } catch (IllegalStateException e2) {
                TXCLog.m82966e(str, "releaseOutputBuffer failed." + e2.getMessage());
                return i5;
            }
        } catch (IllegalStateException e3) {
            TXCLog.m82966e("TXCHWVideoEncoder", "dequeueOutputBuffer failed." + e3.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* JADX INFO: renamed from: b */
    public void m84077b(int i) {
        int iM84059a;
        if (this.f60023y || this.f60021w == null) {
            return;
        }
        synchronized (this.f59988W) {
            try {
                int i2 = this.f59986U;
                if (this.f59978M) {
                    this.f59986U = -1;
                    if (i2 == -1) {
                        this.f59989X = true;
                        return;
                    } else {
                        this.f59985T++;
                        this.f60016r.m83062a(this.f60018t, 1000 / this.f59974I);
                    }
                }
                if (i2 == -1) {
                    return;
                }
                m84066a(this.f59969D);
                int i3 = (720 - this.mRotation) % 360;
                this.mEncodeFilter.m82787a(this.mInputWidth, this.mInputHeight, i3, null, ((i3 == 90 || i3 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i3 == 90 || i3 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, true);
                this.mEncodeFilter.m82783a(i2);
                Object obj = this.f60021w;
                if (obj instanceof C14010c) {
                    ((C14010c) obj).m82729a(this.f59969D * 1000000);
                    ((C14010c) this.f60021w).m82732d();
                }
                Object obj2 = this.f60021w;
                if (obj2 instanceof C14009b) {
                    ((C14009b) obj2).m82719a();
                }
                do {
                    iM84059a = m84059a(i);
                } while (iM84059a > 0);
                if (iM84059a != -1 && iM84059a != -2) {
                    this.f59980O++;
                    return;
                }
                if (iM84059a == -1) {
                    callDelegate(10000005);
                }
                this.f60023y = true;
                m84089e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m84083c() {
        char c;
        Surface surface;
        this.f59997ae = C14025c.m82853a().m82878a("Video", "CheckVideoEncDownBps") > 0;
        this.f59980O = 0;
        this.f59981P = 0;
        this.f59983R = 0L;
        this.f59984S = 0;
        this.f59982Q = 0;
        this.f59985T = 0;
        try {
            MediaFormat mediaFormatM84064a = m84064a(this.mOutputWidth, this.mOutputHeight, this.f59992a, this.f59974I, this.f59973H, this.f59975J, this.f59976K, this.f59979N);
            if (mediaFormatM84064a == null) {
                this.f60023y = true;
                return false;
            }
            this.f60015q = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
            c = 2;
            try {
                if (this.mEncFmt != null) {
                    for (int i = 0; i < this.mEncFmt.length(); i++) {
                        try {
                            JSONObject jSONObject = this.mEncFmt.getJSONObject(i);
                            mediaFormatM84064a.setInteger(jSONObject.optString(Constants.KEY_KEY), jSONObject.optInt("value"));
                        } catch (Exception e) {
                            TXCLog.m82973w("TXCHWVideoEncoder", "config custom format error " + e.toString());
                        }
                    }
                }
                try {
                    this.f60015q.configure(mediaFormatM84064a, (Surface) null, (MediaCrypto) null, 1);
                    TXCLog.m82969i("TXCHWVideoEncoder", "configure format =  " + mediaFormatM84064a.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (this.f59979N) {
                        try {
                            this.f60015q.configure(m84064a(this.mOutputWidth, this.mOutputHeight, this.f59992a, this.f59974I, this.f59973H, this.f59975J, this.f59976K, false), (Surface) null, (MediaCrypto) null, 1);
                        } catch (Exception e3) {
                            if ((e3 instanceof IllegalArgumentException) || (e3 instanceof MediaCodec.CodecException)) {
                                this.f60015q.configure(m84063a(this.mOutputWidth, this.mOutputHeight, this.f59992a, this.f59974I, this.f59973H), (Surface) null, (MediaCrypto) null, 1);
                            }
                            e2.printStackTrace();
                        }
                    } else {
                        if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof MediaCodec.CodecException)) {
                            throw e2;
                        }
                        this.f60015q.configure(m84063a(this.mOutputWidth, this.mOutputHeight, this.f59992a, this.f59974I, this.f59973H), (Surface) null, (MediaCrypto) null, 1);
                    }
                }
                this.f60022x = this.f60015q.createInputSurface();
                this.f60015q.start();
                try {
                    this.f59967B = this.f60015q.getOutputBuffers();
                } catch (Exception e4) {
                    e = e4;
                    c = 5;
                    TXCLog.m82967e("TXCHWVideoEncoder", "create encode format failed.", e);
                    if (c >= 5) {
                        try {
                            MediaCodec mediaCodec = this.f60015q;
                            if (mediaCodec != null) {
                                mediaCodec.stop();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.f60015q = null;
                    Surface surface2 = this.f60022x;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    this.f60022x = null;
                }
            } catch (Exception e5) {
                e = e5;
            }
            if (this.f60015q == null || this.f59967B == null || (surface = this.f60022x) == null) {
                this.f60023y = true;
                return false;
            }
            if (m84070a(surface, this.mOutputWidth, this.mOutputHeight)) {
                return true;
            }
            this.f60023y = true;
            return false;
        } catch (Exception e6) {
            e = e6;
            c = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m84085d() {
        MediaCodec mediaCodec = this.f60015q;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                try {
                    mediaCodec.stop();
                    this.f60015q.release();
                    Surface surface = this.f60022x;
                    if (surface != null) {
                        surface.release();
                    }
                } catch (Throwable th) {
                    try {
                        this.f60015q.release();
                        Surface surface2 = this.f60022x;
                        if (surface2 != null) {
                            surface2.release();
                        }
                        this.f60022x = null;
                    } catch (Exception e) {
                        TXCLog.m82967e("TXCHWVideoEncoder", "release encoder failed.", e);
                    }
                    throw th;
                }
            } catch (IllegalStateException e2) {
                TXCLog.m82967e("TXCHWVideoEncoder", "stop encoder failed.", e2);
                this.f60015q.release();
                Surface surface3 = this.f60022x;
                if (surface3 != null) {
                    surface3.release();
                }
            }
            this.f60022x = null;
        } catch (Exception e3) {
            TXCLog.m82967e("TXCHWVideoEncoder", "release encoder failed.", e3);
        }
        this.f60015q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m84089e() {
        if (this.mInit) {
            this.f60023y = true;
            this.f60024z = true;
            m84076b();
            m84085d();
            this.f59986U = -1;
            this.f60000b = 0L;
            this.f60001c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.f60002d = 0L;
            this.f60003e = 0L;
            this.f60004f = 0;
            this.f60007i = 0L;
            this.f60008j = 0L;
            this.f60009k = 0L;
            this.f60010l = 0L;
            this.f60011m = 0L;
            this.f60013o = 0L;
            this.f60014p = 0L;
            this.mGLContextExternal = null;
            this.f59967B = null;
            this.f59968C = null;
            this.f59969D = 0L;
            this.mOutputWidth = 0;
            this.mOutputHeight = 0;
            this.mInit = false;
            this.mListener = null;
            this.f60020v.clear();
            this.f59990Y.clear();
            this.f59991Z = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m84090f() {
        if (this.f60015q != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f60015q.setParameters(bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m84092g() {
        if (this.f59993aa > 0) {
            int i = this.f59974I;
            int i2 = i - ((int) this.f60001c);
            int i3 = i / 2;
            if (i3 < 5) {
                i3 = 5;
            }
            if (i2 <= i3) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f59993aa;
                int i4 = this.f59994ab;
                if (jCurrentTimeMillis > (4 - i4) * 2000) {
                    long j = ((long) this.f59995ac) - this.f60000b;
                    long j2 = this.f60007i / 2;
                    if (j2 < 100) {
                        j2 = 100;
                    }
                    if (j <= j2) {
                        int i5 = i4 - 1;
                        this.f59994ab = i5;
                        if (i5 <= 0) {
                            this.f59993aa = 0L;
                            return;
                        }
                        return;
                    }
                    this.f59996ad = true;
                    String str = "real bitrate is too much lower than target bitrate![targetBr:" + this.f59995ac + "] [realBr:" + this.f60000b + "]. restart encoder. [module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + Constants.AES_SUFFIX;
                    TXCLog.m82966e("TXCHWVideoEncoder", str);
                    Monitor.m82978a(3, str, "", 0);
                    C14053g c14053g = this.f60016r;
                    if (c14053g != null) {
                        c14053g.m83063b(this.f59999ag);
                    }
                    this.f59993aa = 0L;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m84094h() {
        TXCLog.m82969i("TXCHWVideoEncoder", "destroyCopyTexture");
        synchronized (this.f59988W) {
            try {
                C14015h c14015h = this.f59987V;
                if (c14015h != null) {
                    c14015h.mo82806d();
                    this.f59987V = null;
                }
                this.f59986U = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public int getEncodeCost() {
        return this.f59991Z;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public long getRealBitrate() {
        return this.f60000b;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public double getRealFPS() {
        return this.f60001c;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public long pushVideoFrame(int i, int i2, int i3, long j) {
        int iMo82798b;
        if (this.f60024z) {
            return 10000004L;
        }
        synchronized (this.f59988W) {
            try {
                if (this.f59987V == null) {
                    m84065a(i2, i3);
                }
                this.f59987V.mo82786a(i2, i3);
                GLES20.glViewport(0, 0, i2, i3);
                iMo82798b = this.f59987V.mo82798b(i);
                GLES20.glFinish();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f59982Q++;
        this.f59969D = j;
        this.f59986U = iMo82798b;
        this.mInputWidth = i2;
        this.mInputHeight = i3;
        if (this.f59977L) {
            m84090f();
        }
        if (!this.f59978M || this.f59989X) {
            this.f59985T++;
            this.f60016r.m83063b(this.f60018t);
            this.f59989X = false;
        }
        int i4 = this.f59980O;
        if (i4 > this.f59981P + 30) {
            TXCLog.m82966e("TXCHWVideoEncoder", String.format("hw encoder error when render[%d] pop[%d]", Integer.valueOf(i4), Integer.valueOf(this.f59981P)));
            InterfaceC14327d interfaceC14327d = this.mListener;
            if (interfaceC14327d != null) {
                interfaceC14327d.mo82658k(this.mStreamType);
            }
        }
        if (this.f59983R + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS >= System.currentTimeMillis()) {
            return 0L;
        }
        this.f59983R = System.currentTimeMillis();
        int i5 = this.f59984S;
        if (i5 != 0 && i5 == this.f59980O) {
            TXCLog.m82969i("TXCHWVideoEncoder", String.format("hw encoder error when push[%d] render task[%d] render[%d] pop[%d]", Integer.valueOf(this.f59982Q), Integer.valueOf(this.f59985T), Integer.valueOf(this.f59980O), Integer.valueOf(this.f59981P)));
            InterfaceC14327d interfaceC14327d2 = this.mListener;
            if (interfaceC14327d2 != null) {
                interfaceC14327d2.mo82658k(this.mStreamType);
            }
        }
        this.f59984S = this.f59980O;
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public long pushVideoFrameAsync(final int i, int i2, int i3, final long j) {
        if (this.f60024z) {
            return 10000004L;
        }
        GLES20.glFinish();
        if (this.f59977L) {
            m84090f();
        }
        this.f60016r.m83060a().post(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.8
            @Override // java.lang.Runnable
            public void run() {
                int iM84059a;
                if (C14324a.this.f60023y || C14324a.this.f60021w == null) {
                    return;
                }
                int i4 = i;
                long j2 = j;
                C14324a.this.m84066a(j2);
                C14324a c14324a = C14324a.this;
                int i5 = (720 - c14324a.mRotation) % 360;
                c14324a.mEncodeFilter.m82787a(c14324a.mInputWidth, c14324a.mInputHeight, i5, null, ((i5 == 90 || i5 == 270) ? c14324a.mOutputHeight : c14324a.mOutputWidth) / ((i5 == 90 || i5 == 270) ? c14324a.mOutputWidth : c14324a.mOutputHeight), c14324a.mEnableXMirror, true);
                C14324a.this.mEncodeFilter.m82783a(i4);
                if (C14324a.this.f60021w instanceof C14010c) {
                    ((C14010c) C14324a.this.f60021w).m82729a(j2 * 1000000);
                    ((C14010c) C14324a.this.f60021w).m82732d();
                }
                if (C14324a.this.f60021w instanceof C14009b) {
                    ((C14009b) C14324a.this.f60021w).m82719a();
                }
                C14324a c14324a2 = C14324a.this;
                InterfaceC14327d interfaceC14327d = c14324a2.mListener;
                if (interfaceC14327d != null) {
                    interfaceC14327d.mo82659l(c14324a2.mStreamType);
                }
                do {
                    iM84059a = C14324a.this.m84059a(1);
                } while (iM84059a > 0);
                if (iM84059a != -1 && iM84059a != -2) {
                    C14324a.m84084d(C14324a.this);
                    return;
                }
                if (iM84059a == -1) {
                    C14324a.this.callDelegate(10000005);
                }
                C14324a.this.f60023y = true;
                C14324a.this.m84089e();
            }
        });
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        if (this.f60024z) {
            return 10000004L;
        }
        GLES20.glFinish();
        this.f59969D = j;
        this.f59986U = i;
        if (this.f59977L) {
            m84090f();
        }
        this.f60016r.m83061a(this.f60019u);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void setBitrate(final int i) {
        this.f59992a = i;
        this.f60016r.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.6
            @Override // java.lang.Runnable
            public void run() {
                C14324a.this.m84082c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void setBitrateFromQos(final int i, int i2) {
        this.f59992a = i;
        this.f60016r.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.7
            @Override // java.lang.Runnable
            public void run() {
                C14324a.this.m84082c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void setEncodeIdrFpsFromQos(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void setFPS(final int i) {
        this.f60016r.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.5
            @Override // java.lang.Runnable
            public void run() {
                C14324a.this.m84086d(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void signalEOSAndFlush() {
        if (this.f60024z) {
            return;
        }
        this.f60016r.m83061a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (C14324a.this.f60015q == null) {
                    return;
                }
                try {
                    C14324a.this.f60015q.signalEndOfInputStream();
                } catch (Exception e) {
                    TXCLog.m82967e("TXCHWVideoEncoder", "signalEndOfInputStream failed.", e);
                }
                while (C14324a.this.m84059a(10) >= 0) {
                }
                C14324a.this.m84089e();
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public int start(final TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        this.f60016r.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.1
            /* JADX WARN: Code duplicated, block: B:13:0x0021 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:14:0x0023 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:16:0x0027  */
            /* JADX WARN: Code duplicated, block: B:17:0x002a  */
            /* JADX WARN: Code duplicated, block: B:18:0x002d  */
            /* JADX WARN: Code duplicated, block: B:21:0x0068  */
            /* JADX WARN: Code duplicated, block: B:23:0x006c  */
            /* JADX WARN: Code duplicated, block: B:26:0x0096  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                int i;
                TXSVideoEncoderParam tXSVideoEncoderParam2;
                String str3;
                C14324a c14324a;
                boolean zM84071a;
                C14324a c14324a2;
                TXSVideoEncoderParam tXSVideoEncoderParam3 = tXSVideoEncoderParam;
                int i2 = tXSVideoEncoderParam3.encoderMode;
                String str4 = "unknown";
                if (i2 == 1) {
                    str = "CBR";
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            str2 = "unknown";
                        } else {
                            str = "CQ";
                        }
                        i = tXSVideoEncoderParam3.encoderProfile;
                        if (i != 1) {
                            str4 = "Baseline";
                        } else if (i != 2) {
                            str4 = "Main";
                        } else if (i == 3) {
                            str4 = "High";
                        }
                        String str5 = str4;
                        Integer numValueOf = Integer.valueOf(C14324a.this.hashCode());
                        Integer numValueOf2 = Integer.valueOf(tXSVideoEncoderParam.width);
                        Integer numValueOf3 = Integer.valueOf(tXSVideoEncoderParam.height);
                        Integer numValueOf4 = Integer.valueOf(tXSVideoEncoderParam.fps);
                        Integer numValueOf5 = Integer.valueOf(tXSVideoEncoderParam.bitrate);
                        Integer numValueOf6 = Integer.valueOf(tXSVideoEncoderParam.gop);
                        tXSVideoEncoderParam2 = tXSVideoEncoderParam;
                        if (tXSVideoEncoderParam2.bMultiRef) {
                            str3 = "true";
                        } else {
                            str3 = "false";
                        }
                        String str6 = String.format("VideoEncoder[%d]: Start [type:hardware][resolution:%d*%d][fps:%d][bitrate:%dkbps][gop:%d][rateControl:%s][profile:%s][rps:%s][streamType:%d]", numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, str2, str5, str3, Integer.valueOf(tXSVideoEncoderParam2.streamType));
                        Monitor.m82978a(2, str6, "", 0);
                        TXCLog.m82969i("TXCHWVideoEncoder", "start:".concat(str6));
                        c14324a = C14324a.this;
                        if (c14324a.mInit) {
                            c14324a.m84089e();
                        }
                        zM84071a = C14324a.this.m84071a(tXSVideoEncoderParam);
                        c14324a2 = C14324a.this;
                        if (zM84071a) {
                            Monitor.m82978a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(c14324a2.hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                        } else {
                            c14324a2.callDelegate(10000004);
                        }
                    }
                    str = "VBR";
                }
                str2 = str;
                i = tXSVideoEncoderParam3.encoderProfile;
                if (i != 1) {
                    str4 = "Baseline";
                } else if (i != 2) {
                    str4 = "Main";
                } else if (i == 3) {
                    str4 = "High";
                }
                String str7 = str4;
                Integer numValueOf7 = Integer.valueOf(C14324a.this.hashCode());
                Integer numValueOf8 = Integer.valueOf(tXSVideoEncoderParam.width);
                Integer numValueOf9 = Integer.valueOf(tXSVideoEncoderParam.height);
                Integer numValueOf10 = Integer.valueOf(tXSVideoEncoderParam.fps);
                Integer numValueOf11 = Integer.valueOf(tXSVideoEncoderParam.bitrate);
                Integer numValueOf12 = Integer.valueOf(tXSVideoEncoderParam.gop);
                tXSVideoEncoderParam2 = tXSVideoEncoderParam;
                if (tXSVideoEncoderParam2.bMultiRef) {
                    str3 = "true";
                } else {
                    str3 = "false";
                }
                String str8 = String.format("VideoEncoder[%d]: Start [type:hardware][resolution:%d*%d][fps:%d][bitrate:%dkbps][gop:%d][rateControl:%s][profile:%s][rps:%s][streamType:%d]", numValueOf7, numValueOf8, numValueOf9, numValueOf10, numValueOf11, numValueOf12, str2, str7, str3, Integer.valueOf(tXSVideoEncoderParam2.streamType));
                Monitor.m82978a(2, str8, "", 0);
                TXCLog.m82969i("TXCHWVideoEncoder", "start:".concat(str8));
                c14324a = C14324a.this;
                if (c14324a.mInit) {
                    c14324a.m84089e();
                }
                zM84071a = C14324a.this.m84071a(tXSVideoEncoderParam);
                c14324a2 = C14324a.this;
                if (zM84071a) {
                    Monitor.m82978a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(c14324a2.hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                } else {
                    c14324a2.callDelegate(10000004);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.C14326c
    public void stop() {
        this.f60024z = true;
        this.f60016r.m83063b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.4
            @Override // java.lang.Runnable
            public void run() {
                C14324a c14324a = C14324a.this;
                if (c14324a.mInit) {
                    Monitor.m82978a(2, String.format("VideoEncoder[%d]: Stop, streamType:%d", Integer.valueOf(c14324a.hashCode()), Integer.valueOf(C14324a.this.mStreamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                    C14324a.this.m84089e();
                }
            }
        });
        m84094h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m84084d(C14324a c14324a) {
        int i = c14324a.f59980O;
        c14324a.f59980O = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m84086d(int i) {
        if (!this.mInit || i == 0 || this.f59974I == i) {
            return;
        }
        TXCLog.m82969i("TXCHWVideoEncoder", "set fps " + i + ", restart encoder.");
        m84076b();
        m84085d();
        this.f59974I = i;
        m84083c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m84076b() {
        TXCLog.m82969i("TXCHWVideoEncoder", "HWVideoEncode destroyGL");
        C14015h c14015h = this.mEncodeFilter;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.mEncodeFilter = null;
        }
        Object obj = this.f60021w;
        if (obj instanceof C14009b) {
            ((C14009b) obj).m82721c();
            this.f60021w = null;
        }
        Object obj2 = this.f60021w;
        if (obj2 instanceof C14010c) {
            ((C14010c) obj2).m82731c();
            this.f60021w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m84082c(int i) {
        if (this.mInit) {
            long j = this.f60007i;
            int i2 = this.f59992a;
            if (j == i2) {
                return;
            }
            boolean z = false;
            if (i2 < j && this.f59997ae) {
                if (this.f59996ad) {
                    String str = "restart video hw encoder when down bps。[module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + Constants.AES_SUFFIX;
                    TXCLog.m82973w("TXCHWVideoEncoder", str);
                    Monitor.m82978a(2, str, "", 0);
                    z = true;
                } else {
                    this.f59994ab = 3;
                    this.f59993aa = System.currentTimeMillis();
                    this.f59995ac = this.f59992a;
                }
            }
            this.f60007i = this.f59992a;
            if (this.f60015q != null) {
                if (z) {
                    this.f60016r.m83060a().removeCallbacks(this.f59999ag);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = this.f59998af;
                    if (jCurrentTimeMillis - j2 >= 2000) {
                        this.f59999ag.run();
                        return;
                    } else {
                        this.f60016r.m83062a(this.f59999ag, 2000 - (jCurrentTimeMillis - j2));
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.f59992a * 1024);
                this.f60015q.setParameters(bundle);
            }
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private MediaFormat m84063a(int i, int i2, int i3, int i4, int i5) {
        if (i == 0 || i2 == 0 || i3 == 0 || i4 == 0) {
            return null;
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(YtVideoEncoder.MIME_TYPE, i, i2);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i3 * 1024);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i4);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i5);
        return mediaFormatCreateVideoFormat;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private MediaFormat m84064a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        MediaFormat mediaFormatM84063a = m84063a(i, i2, i3, i4, i5);
        if (mediaFormatM84063a == null) {
            return null;
        }
        MediaCodecInfo mediaCodecInfoM84062a = m84062a(YtVideoEncoder.MIME_TYPE);
        if (mediaCodecInfoM84062a != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoM84062a.getCapabilitiesForType(YtVideoEncoder.MIME_TYPE);
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
            if (z || encoderCapabilities.isBitrateModeSupported(i6)) {
                mediaFormatM84063a.setInteger("bitrate-mode", i6);
            } else if (this.f59977L) {
                if (encoderCapabilities.isBitrateModeSupported(1)) {
                    mediaFormatM84063a.setInteger("bitrate-mode", 1);
                } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                    mediaFormatM84063a.setInteger("bitrate-mode", 2);
                }
            } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                mediaFormatM84063a.setInteger("bitrate-mode", 2);
            }
            mediaFormatM84063a.setInteger("complexity", ((Integer) encoderCapabilities.getComplexityRange().clamp(5)).intValue());
            int i8 = 0;
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                int i9 = codecProfileLevel.profile;
                if (i9 <= i7 && i9 > i8) {
                    mediaFormatM84063a.setInteger("profile", i9);
                    mediaFormatM84063a.setInteger(FirebaseAnalytics.Param.LEVEL, codecProfileLevel.level);
                    i8 = i9;
                }
            }
        }
        return mediaFormatM84063a;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static MediaCodecInfo m84062a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84066a(long j) {
        this.f60020v.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    private long m84061a() {
        Long lPoll = this.f60020v.poll();
        if (lPoll == null) {
            return 0L;
        }
        return lPoll.longValue();
    }

    /* JADX INFO: renamed from: a */
    private boolean m84070a(Surface surface, int i, int i2) {
        if (surface == null) {
            return false;
        }
        TXCLog.m82969i("TXCHWVideoEncoder", "HWVideoEncode createGL: " + this.mGLContextExternal);
        Object obj = this.mGLContextExternal;
        if (obj != null && (obj instanceof EGLContext)) {
            this.f60021w = C14010c.m82725a(null, (EGLContext) obj, surface, i, i2);
        } else {
            this.f60021w = C14009b.m82715a(null, (javax.microedition.khronos.egl.EGLContext) obj, surface, i, i2);
        }
        if (this.f60021w == null) {
            return false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C14015h c14015h = new C14015h();
        this.mEncodeFilter = c14015h;
        c14015h.m82795a(C14019l.f58233e, C14019l.m82837a(EnumC14018k.NORMAL, false, false));
        if (!this.mEncodeFilter.mo82796a()) {
            this.mEncodeFilter = null;
            return false;
        }
        GLES20.glViewport(0, 0, i, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public boolean m84071a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int i;
        this.f60024z = false;
        this.f60023y = false;
        this.f60000b = 0L;
        this.f60001c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f60002d = 0L;
        this.f60003e = 0L;
        this.f60004f = 0;
        this.f60007i = 0L;
        this.f60008j = tXSVideoEncoderParam.baseGopIndex;
        this.f60009k = 0L;
        this.f60010l = tXSVideoEncoderParam.baseFrameIndex;
        this.f60011m = 0L;
        this.f60013o = 0L;
        this.f60014p = 0L;
        this.f59967B = null;
        this.f59968C = null;
        this.f59969D = 0L;
        this.f59972G = -1;
        this.mOutputWidth = tXSVideoEncoderParam.width;
        this.mOutputHeight = tXSVideoEncoderParam.height;
        this.f59973H = tXSVideoEncoderParam.gop;
        this.f59974I = tXSVideoEncoderParam.fps;
        TXCLog.m82969i("TXCHWVideoEncoder", "init with fps " + this.f59974I);
        this.f59977L = tXSVideoEncoderParam.fullIFrame;
        this.f60012n = tXSVideoEncoderParam.syncOutput;
        this.f59966A = tXSVideoEncoderParam.enableEGL14;
        this.f59979N = tXSVideoEncoderParam.forceSetBitrateMode;
        this.f60020v.clear();
        this.f59978M = tXSVideoEncoderParam.bLimitFps;
        int i2 = tXSVideoEncoderParam.width;
        if (i2 != 0 && (i = tXSVideoEncoderParam.height) != 0 && tXSVideoEncoderParam.fps != 0 && tXSVideoEncoderParam.gop != 0) {
            this.f60005g = tXSVideoEncoderParam.annexb;
            this.f60006h = tXSVideoEncoderParam.appendSpsPps;
            if (this.f59992a == 0) {
                this.f59992a = (int) (Math.sqrt((((double) (i2 * i2)) * 1.0d) + ((double) (i * i))) * 1.2d);
            }
            this.f60007i = this.f59992a;
            this.f60004f = tXSVideoEncoderParam.fps;
            int i3 = tXSVideoEncoderParam.encoderMode;
            int i4 = 2;
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = 1;
                } else if (i3 == 3) {
                    i4 = 0;
                }
            }
            if (C14025c.m82853a().m82883c() == 1) {
                tXSVideoEncoderParam.encoderProfile = 1;
            }
            this.f59975J = i4;
            this.f59976K = 1;
            if (!m84083c()) {
                return false;
            }
            this.mInit = true;
            if (this.f59978M) {
                this.f59986U = -1;
                this.f60016r.m83063b(this.f60018t);
            }
            this.f59990Y = new ArrayList<>();
            this.f59991Z = 0;
            return true;
        }
        this.f60023y = true;
        return false;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m84074a(byte[] bArr) {
        C14324a c14324a;
        byte[] bArr2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 20];
        int i = 0;
        int i2 = 0;
        int iM84060a = 0;
        while (i < length) {
            byte b = bArr[i];
            if (b == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1) {
                c14324a = this;
                bArr2 = bArr;
                iM84060a = c14324a.m84060a(i, i2, bArr3, bArr2, iM84060a);
                i += 3;
            } else {
                c14324a = this;
                bArr2 = bArr;
                if (b == 0 && bArr2[i + 1] == 0 && bArr2[i + 2] == 0 && bArr2[i + 3] == 1) {
                    iM84060a = c14324a.m84060a(i, i2, bArr3, bArr2, iM84060a);
                    i += 4;
                }
                if (i != length - 4 && (bArr2[i + 1] != 0 || bArr2[i + 2] != 0 || bArr2[i + 3] != 1)) {
                    i = length;
                    int iM84060a2 = c14324a.m84060a(i, i2, bArr3, bArr2, iM84060a);
                    byte[] bArr4 = new byte[iM84060a2];
                    System.arraycopy(bArr3, 0, bArr4, 0, iM84060a2);
                    return bArr4;
                }
                i++;
                this = c14324a;
                bArr = bArr2;
            }
            i2 = i;
            if (i != length - 4) {
            }
            i++;
            this = c14324a;
            bArr = bArr2;
        }
        c14324a = this;
        bArr2 = bArr;
        int iM84060a3 = c14324a.m84060a(i, i2, bArr3, bArr2, iM84060a);
        byte[] bArr5 = new byte[iM84060a3];
        System.arraycopy(bArr3, 0, bArr5, 0, iM84060a3);
        return bArr5;
    }

    /* JADX INFO: renamed from: a */
    private int m84060a(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
        if (i2 > 0 && i > i2) {
            int i4 = i - i2;
            try {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[4]);
                byteBufferWrap.asIntBuffer().put(i4);
                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                System.arraycopy(byteBufferWrap.array(), 0, bArr, i3, 4);
                System.arraycopy(bArr2, i2, bArr, i3 + 4, i4);
                return i3 + i4 + 4;
            } catch (Exception unused) {
                TXCLog.m82966e("TXCHWVideoEncoder", "setNalData exception");
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private void m84065a(int i, int i2) {
        TXCLog.m82969i("TXCHWVideoEncoder", "createCopyTexture");
        synchronized (this.f59988W) {
            C14015h c14015h = new C14015h();
            this.f59987V = c14015h;
            c14015h.m82793a(true);
            this.f59987V.mo82796a();
            this.f59987V.mo82786a(i, i2);
        }
    }
}
