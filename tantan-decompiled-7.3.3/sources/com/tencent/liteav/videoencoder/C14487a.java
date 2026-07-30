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
import com.tencent.liteav.basic.p093c.C14172b;
import com.tencent.liteav.basic.p093c.C14173c;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14182l;
import com.tencent.liteav.basic.p093c.EnumC14181k;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.util.C14216g;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videoencoder.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14487a extends C14489c {

    /* JADX INFO: renamed from: G */
    private int f60820G;

    /* JADX INFO: renamed from: H */
    private int f60821H;

    /* JADX INFO: renamed from: I */
    private int f60822I;

    /* JADX INFO: renamed from: J */
    private int f60823J;

    /* JADX INFO: renamed from: K */
    private int f60824K;

    /* JADX INFO: renamed from: L */
    private boolean f60825L;

    /* JADX INFO: renamed from: V */
    private C14178h f60835V;

    /* JADX INFO: renamed from: Y */
    private ArrayList<Long> f60838Y;

    /* JADX INFO: renamed from: n */
    private boolean f60860n;

    /* JADX INFO: renamed from: r */
    private C14216g f60864r;

    /* JADX INFO: renamed from: w */
    private Object f60869w;

    /* JADX INFO: renamed from: a */
    private int f60840a = 0;

    /* JADX INFO: renamed from: b */
    private long f60848b = 0;

    /* JADX INFO: renamed from: c */
    private double f60849c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: d */
    private long f60850d = 0;

    /* JADX INFO: renamed from: e */
    private long f60851e = 0;

    /* JADX INFO: renamed from: f */
    private int f60852f = 0;

    /* JADX INFO: renamed from: g */
    private boolean f60853g = false;

    /* JADX INFO: renamed from: h */
    private boolean f60854h = true;

    /* JADX INFO: renamed from: i */
    private long f60855i = 0;

    /* JADX INFO: renamed from: j */
    private long f60856j = 0;

    /* JADX INFO: renamed from: k */
    private long f60857k = 0;

    /* JADX INFO: renamed from: l */
    private long f60858l = 0;

    /* JADX INFO: renamed from: m */
    private long f60859m = 0;

    /* JADX INFO: renamed from: o */
    private long f60861o = 0;

    /* JADX INFO: renamed from: p */
    private long f60862p = 0;

    /* JADX INFO: renamed from: q */
    private MediaCodec f60863q = null;

    /* JADX INFO: renamed from: s */
    private Runnable f60865s = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.10
        @Override // java.lang.Runnable
        public void run() {
            C14487a.this.m85272e();
        }
    };

    /* JADX INFO: renamed from: t */
    private Runnable f60866t = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.11
        @Override // java.lang.Runnable
        public void run() {
            C14487a.this.m85260b(10);
        }
    };

    /* JADX INFO: renamed from: u */
    private Runnable f60867u = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.2
        @Override // java.lang.Runnable
        public void run() {
            C14487a.this.m85260b(1);
        }
    };

    /* JADX INFO: renamed from: v */
    private ArrayDeque<Long> f60868v = new ArrayDeque<>(10);

    /* JADX INFO: renamed from: x */
    private Surface f60870x = null;

    /* JADX INFO: renamed from: y */
    private boolean f60871y = true;

    /* JADX INFO: renamed from: z */
    private boolean f60872z = true;

    /* JADX INFO: renamed from: A */
    private boolean f60814A = false;

    /* JADX INFO: renamed from: B */
    private ByteBuffer[] f60815B = null;

    /* JADX INFO: renamed from: C */
    private byte[] f60816C = null;

    /* JADX INFO: renamed from: D */
    private volatile long f60817D = 0;

    /* JADX INFO: renamed from: E */
    private long f60818E = 0;

    /* JADX INFO: renamed from: F */
    private long f60819F = 0;

    /* JADX INFO: renamed from: M */
    private boolean f60826M = true;

    /* JADX INFO: renamed from: N */
    private boolean f60827N = false;

    /* JADX INFO: renamed from: O */
    private int f60828O = 0;

    /* JADX INFO: renamed from: P */
    private int f60829P = 0;

    /* JADX INFO: renamed from: Q */
    private int f60830Q = 0;

    /* JADX INFO: renamed from: R */
    private long f60831R = 0;

    /* JADX INFO: renamed from: S */
    private int f60832S = 0;

    /* JADX INFO: renamed from: T */
    private int f60833T = 0;

    /* JADX INFO: renamed from: U */
    private int f60834U = -1;

    /* JADX INFO: renamed from: W */
    private final Object f60836W = new Object();

    /* JADX INFO: renamed from: X */
    private boolean f60837X = false;

    /* JADX INFO: renamed from: Z */
    private int f60839Z = 0;

    /* JADX INFO: renamed from: aa */
    private long f60841aa = 0;

    /* JADX INFO: renamed from: ab */
    private int f60842ab = 3;

    /* JADX INFO: renamed from: ac */
    private int f60843ac = 0;

    /* JADX INFO: renamed from: ad */
    private boolean f60844ad = false;

    /* JADX INFO: renamed from: ae */
    private boolean f60845ae = true;

    /* JADX INFO: renamed from: af */
    private long f60846af = 0;

    /* JADX INFO: renamed from: ag */
    private Runnable f60847ag = new Runnable() { // from class: com.tencent.liteav.videoencoder.a.3
        @Override // java.lang.Runnable
        public void run() {
            C14487a.this.f60846af = System.currentTimeMillis();
            C14487a.this.m85259b();
            C14487a.this.m85268d();
            C14487a.this.m85266c();
        }
    };

    public C14487a() {
        this.f60864r = null;
        this.f60864r = new C14216g("HWVideoEncoder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX INFO: renamed from: a */
    public int m85242a(int i) {
        byte[] bArrM85257a;
        int i2;
        String str;
        int i3;
        int i4;
        long j;
        int i5 = -1;
        if (this.f60863q == null) {
            return -1;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            int iDequeueOutputBuffer = this.f60863q.dequeueOutputBuffer(bufferInfo, i * 1000);
            boolean z = false;
            if (iDequeueOutputBuffer == -1) {
                return 0;
            }
            if (iDequeueOutputBuffer == -3) {
                this.f60815B = this.f60863q.getOutputBuffers();
                return 1;
            }
            if (iDequeueOutputBuffer == -2) {
                try {
                    callDelegate(this.f60863q.getOutputFormat());
                    return 1;
                } catch (IllegalStateException e) {
                    TXCLog.m84149e("TXCHWVideoEncoder", "mediacodec getOutputFormat failed." + e);
                    return -1;
                }
            }
            if (iDequeueOutputBuffer < 0) {
                return -1;
            }
            long timeTick = TXCTimeUtil.getTimeTick();
            ByteBuffer byteBuffer = this.f60815B[iDequeueOutputBuffer];
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
                        bArrM85257a = new byte[i6];
                        System.arraycopy(bArr, i7, bArrM85257a, 0, i6);
                    } else {
                        bArrM85257a = bArr;
                    }
                } else {
                    bArrM85257a = bArr;
                }
                int i8 = bufferInfo.size;
                int i9 = bufferInfo.flags;
                if (i8 == 0) {
                    if ((i9 & 4) != 0) {
                        InterfaceC14490d interfaceC14490d = this.mListener;
                        if (interfaceC14490d != null) {
                            interfaceC14490d.mo83839a(null, 0);
                        }
                        i5 = -2;
                    }
                } else if ((i9 & 2) == 2) {
                    if (this.f60853g) {
                        this.f60816C = (byte[]) bArrM85257a.clone();
                    } else {
                        this.f60816C = m85257a((byte[]) bArrM85257a.clone());
                    }
                    i5 = 1;
                } else {
                    if ((i9 & 1) == 1) {
                        this.f60820G = -1;
                        if (this.f60853g) {
                            byte[] bArr2 = this.f60816C;
                            byte[] bArr3 = new byte[bArr2.length + bArrM85257a.length];
                            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                            System.arraycopy(bArrM85257a, 0, bArr3, this.f60816C.length, bArrM85257a.length);
                            i2 = 0;
                            bArrM85257a = bArr3;
                        } else {
                            byte[] bArrM85257a2 = m85257a(bArrM85257a);
                            byte[] bArr4 = this.f60816C;
                            bArrM85257a = new byte[bArr4.length + bArrM85257a2.length];
                            System.arraycopy(bArr4, 0, bArrM85257a, 0, bArr4.length);
                            System.arraycopy(bArrM85257a2, 0, bArrM85257a, this.f60816C.length, bArrM85257a2.length);
                            i2 = 0;
                        }
                    } else {
                        if (!this.f60853g) {
                            bArrM85257a = m85257a(bArrM85257a);
                        }
                        i2 = 1;
                    }
                    if (!this.f60825L) {
                        int i10 = this.f60820G + 1;
                        this.f60820G = i10;
                        if (i10 == this.f60852f * this.f60821H) {
                            m85273f();
                        }
                    }
                    long jM85244a = m85244a();
                    long j2 = bufferInfo.presentationTimeUs / 1000;
                    if (this.f60819F == 0) {
                        this.f60819F = jM85244a;
                    }
                    if (this.f60818E == 0) {
                        this.f60818E = j2;
                    }
                    long j3 = j2 + (this.f60819F - this.f60818E);
                    long j4 = this.f60859m;
                    if (jM85244a <= j4) {
                        jM85244a = j4 + 1;
                    }
                    if (jM85244a > j3) {
                        jM85244a = j3;
                    }
                    this.f60859m = jM85244a;
                    long timeTick2 = TXCTimeUtil.getTimeTick();
                    if (i2 == 0) {
                        long j5 = this.f60850d;
                        if (timeTick2 > 1000 + j5) {
                            this.f60848b = (long) (((this.f60861o * 8000.0d) / (timeTick2 - j5)) / 1024.0d);
                            j = 0;
                            this.f60861o = 0L;
                            this.f60850d = timeTick2;
                            m85275g();
                        } else {
                            j = 0;
                        }
                        long j6 = this.f60856j;
                        long j7 = j;
                        long j8 = j6 + 1;
                        this.f60856j = j8;
                        if (j8 % 256 == j7) {
                            this.f60856j = j6 + 2;
                        }
                        this.f60857k = j7;
                    } else {
                        this.f60857k++;
                    }
                    this.f60861o += (long) bArrM85257a.length;
                    long j9 = this.f60851e;
                    if (timeTick2 > 2000 + j9) {
                        this.f60849c = (this.f60862p * 1000.0d) / (timeTick2 - j9);
                        long jLongValue = 0;
                        this.f60862p = 0L;
                        this.f60851e = timeTick2;
                        for (Long l2 : this.f60838Y) {
                            if (l2.longValue() > jLongValue) {
                                jLongValue = l2.longValue();
                            }
                        }
                        this.f60838Y.clear();
                        this.f60839Z = (int) (jLongValue * 3);
                    }
                    this.f60862p++;
                    byteBuffer.position(bufferInfo.offset);
                    this.f60858l++;
                    InterfaceC14490d interfaceC14490d2 = this.mListener;
                    if (interfaceC14490d2 != null) {
                        interfaceC14490d2.mo83835a(2, this.f60856j, this.f60857k);
                    }
                    boolean z2 = this.f60854h;
                    int i11 = i2;
                    long j10 = this.f60856j;
                    if (z2) {
                        long j11 = this.f60857k;
                        str = "TXCHWVideoEncoder";
                        iDequeueOutputBuffer = iDequeueOutputBuffer;
                        i3 = -2;
                        i4 = 1;
                        callDelegate(bArrM85257a, i11, j10, j11, this.f60858l, i11 == 0 ? j11 : j11 - 1, j3, j3, 0, byteBuffer, bufferInfo);
                    } else {
                        iDequeueOutputBuffer = iDequeueOutputBuffer;
                        str = "TXCHWVideoEncoder";
                        i3 = -2;
                        i4 = 1;
                        long j12 = this.f60857k;
                        callDelegate(bArr, i11, j10, j12, this.f60858l, i11 == 0 ? j12 : j12 - 1, j3, j3, 0, byteBuffer, bufferInfo);
                    }
                    this.f60829P++;
                    if ((bufferInfo.flags & 4) != 0) {
                        InterfaceC14490d interfaceC14490d3 = this.mListener;
                        z = false;
                        if (interfaceC14490d3 != null) {
                            interfaceC14490d3.mo83839a(null, 0);
                        }
                        i5 = i3;
                    } else {
                        z = false;
                        i5 = i4;
                    }
                    this.f60838Y.add(Long.valueOf(TXCTimeUtil.getTimeTick() - timeTick));
                }
                str = "TXCHWVideoEncoder";
            }
            try {
                MediaCodec mediaCodec = this.f60863q;
                if (mediaCodec == null) {
                    return i5;
                }
                mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, z);
                return i5;
            } catch (IllegalStateException e2) {
                TXCLog.m84149e(str, "releaseOutputBuffer failed." + e2.getMessage());
                return i5;
            }
        } catch (IllegalStateException e3) {
            TXCLog.m84149e("TXCHWVideoEncoder", "dequeueOutputBuffer failed." + e3.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* JADX INFO: renamed from: b */
    public void m85260b(int i) {
        int iM85242a;
        if (this.f60871y || this.f60869w == null) {
            return;
        }
        synchronized (this.f60836W) {
            try {
                int i2 = this.f60834U;
                if (this.f60826M) {
                    this.f60834U = -1;
                    if (i2 == -1) {
                        this.f60837X = true;
                        return;
                    } else {
                        this.f60833T++;
                        this.f60864r.m84245a(this.f60866t, 1000 / this.f60822I);
                    }
                }
                if (i2 == -1) {
                    return;
                }
                m85249a(this.f60817D);
                int i3 = (720 - this.mRotation) % 360;
                this.mEncodeFilter.m83970a(this.mInputWidth, this.mInputHeight, i3, null, ((i3 == 90 || i3 == 270) ? this.mOutputHeight : this.mOutputWidth) / ((i3 == 90 || i3 == 270) ? this.mOutputWidth : this.mOutputHeight), this.mEnableXMirror, true);
                this.mEncodeFilter.m83966a(i2);
                Object obj = this.f60869w;
                if (obj instanceof C14173c) {
                    ((C14173c) obj).m83912a(this.f60817D * 1000000);
                    ((C14173c) this.f60869w).m83915d();
                }
                Object obj2 = this.f60869w;
                if (obj2 instanceof C14172b) {
                    ((C14172b) obj2).m83902a();
                }
                do {
                    iM85242a = m85242a(i);
                } while (iM85242a > 0);
                if (iM85242a != -1 && iM85242a != -2) {
                    this.f60828O++;
                    return;
                }
                if (iM85242a == -1) {
                    callDelegate(10000005);
                }
                this.f60871y = true;
                m85272e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m85266c() {
        char c;
        Surface surface;
        this.f60845ae = C14188c.m84036a().m84061a("Video", "CheckVideoEncDownBps") > 0;
        this.f60828O = 0;
        this.f60829P = 0;
        this.f60831R = 0L;
        this.f60832S = 0;
        this.f60830Q = 0;
        this.f60833T = 0;
        try {
            MediaFormat mediaFormatM85247a = m85247a(this.mOutputWidth, this.mOutputHeight, this.f60840a, this.f60822I, this.f60821H, this.f60823J, this.f60824K, this.f60827N);
            if (mediaFormatM85247a == null) {
                this.f60871y = true;
                return false;
            }
            this.f60863q = MediaCodec.createEncoderByType(YtVideoEncoder.MIME_TYPE);
            c = 2;
            try {
                if (this.mEncFmt != null) {
                    for (int i = 0; i < this.mEncFmt.length(); i++) {
                        try {
                            JSONObject jSONObject = this.mEncFmt.getJSONObject(i);
                            mediaFormatM85247a.setInteger(jSONObject.optString(Constants.KEY_KEY), jSONObject.optInt("value"));
                        } catch (Exception e) {
                            TXCLog.m84156w("TXCHWVideoEncoder", "config custom format error " + e.toString());
                        }
                    }
                }
                try {
                    this.f60863q.configure(mediaFormatM85247a, (Surface) null, (MediaCrypto) null, 1);
                    TXCLog.m84152i("TXCHWVideoEncoder", "configure format =  " + mediaFormatM85247a.toString());
                } catch (Exception e2) {
                    e2.printStackTrace();
                    if (this.f60827N) {
                        try {
                            this.f60863q.configure(m85247a(this.mOutputWidth, this.mOutputHeight, this.f60840a, this.f60822I, this.f60821H, this.f60823J, this.f60824K, false), (Surface) null, (MediaCrypto) null, 1);
                        } catch (Exception e3) {
                            if ((e3 instanceof IllegalArgumentException) || (e3 instanceof MediaCodec.CodecException)) {
                                this.f60863q.configure(m85246a(this.mOutputWidth, this.mOutputHeight, this.f60840a, this.f60822I, this.f60821H), (Surface) null, (MediaCrypto) null, 1);
                            }
                            e2.printStackTrace();
                        }
                    } else {
                        if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof MediaCodec.CodecException)) {
                            throw e2;
                        }
                        this.f60863q.configure(m85246a(this.mOutputWidth, this.mOutputHeight, this.f60840a, this.f60822I, this.f60821H), (Surface) null, (MediaCrypto) null, 1);
                    }
                }
                this.f60870x = this.f60863q.createInputSurface();
                this.f60863q.start();
                try {
                    this.f60815B = this.f60863q.getOutputBuffers();
                } catch (Exception e4) {
                    e = e4;
                    c = 5;
                    TXCLog.m84150e("TXCHWVideoEncoder", "create encode format failed.", e);
                    if (c >= 5) {
                        try {
                            MediaCodec mediaCodec = this.f60863q;
                            if (mediaCodec != null) {
                                mediaCodec.stop();
                            }
                        } catch (Exception unused) {
                        }
                    }
                    this.f60863q = null;
                    Surface surface2 = this.f60870x;
                    if (surface2 != null) {
                        surface2.release();
                    }
                    this.f60870x = null;
                }
            } catch (Exception e5) {
                e = e5;
            }
            if (this.f60863q == null || this.f60815B == null || (surface = this.f60870x) == null) {
                this.f60871y = true;
                return false;
            }
            if (m85253a(surface, this.mOutputWidth, this.mOutputHeight)) {
                return true;
            }
            this.f60871y = true;
            return false;
        } catch (Exception e6) {
            e = e6;
            c = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m85268d() {
        MediaCodec mediaCodec = this.f60863q;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                try {
                    mediaCodec.stop();
                    this.f60863q.release();
                    Surface surface = this.f60870x;
                    if (surface != null) {
                        surface.release();
                    }
                } catch (Throwable th) {
                    try {
                        this.f60863q.release();
                        Surface surface2 = this.f60870x;
                        if (surface2 != null) {
                            surface2.release();
                        }
                        this.f60870x = null;
                    } catch (Exception e) {
                        TXCLog.m84150e("TXCHWVideoEncoder", "release encoder failed.", e);
                    }
                    throw th;
                }
            } catch (IllegalStateException e2) {
                TXCLog.m84150e("TXCHWVideoEncoder", "stop encoder failed.", e2);
                this.f60863q.release();
                Surface surface3 = this.f60870x;
                if (surface3 != null) {
                    surface3.release();
                }
            }
            this.f60870x = null;
        } catch (Exception e3) {
            TXCLog.m84150e("TXCHWVideoEncoder", "release encoder failed.", e3);
        }
        this.f60863q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m85272e() {
        if (this.mInit) {
            this.f60871y = true;
            this.f60872z = true;
            m85259b();
            m85268d();
            this.f60834U = -1;
            this.f60848b = 0L;
            this.f60849c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            this.f60850d = 0L;
            this.f60851e = 0L;
            this.f60852f = 0;
            this.f60855i = 0L;
            this.f60856j = 0L;
            this.f60857k = 0L;
            this.f60858l = 0L;
            this.f60859m = 0L;
            this.f60861o = 0L;
            this.f60862p = 0L;
            this.mGLContextExternal = null;
            this.f60815B = null;
            this.f60816C = null;
            this.f60817D = 0L;
            this.mOutputWidth = 0;
            this.mOutputHeight = 0;
            this.mInit = false;
            this.mListener = null;
            this.f60868v.clear();
            this.f60838Y.clear();
            this.f60839Z = 0;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m85273f() {
        if (this.f60863q != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.f60863q.setParameters(bundle);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m85275g() {
        if (this.f60841aa > 0) {
            int i = this.f60822I;
            int i2 = i - ((int) this.f60849c);
            int i3 = i / 2;
            if (i3 < 5) {
                i3 = 5;
            }
            if (i2 <= i3) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f60841aa;
                int i4 = this.f60842ab;
                if (jCurrentTimeMillis > (4 - i4) * 2000) {
                    long j = ((long) this.f60843ac) - this.f60848b;
                    long j2 = this.f60855i / 2;
                    if (j2 < 100) {
                        j2 = 100;
                    }
                    if (j <= j2) {
                        int i5 = i4 - 1;
                        this.f60842ab = i5;
                        if (i5 <= 0) {
                            this.f60841aa = 0L;
                            return;
                        }
                        return;
                    }
                    this.f60844ad = true;
                    String str = "real bitrate is too much lower than target bitrate![targetBr:" + this.f60843ac + "] [realBr:" + this.f60848b + "]. restart encoder. [module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + Constants.AES_SUFFIX;
                    TXCLog.m84149e("TXCHWVideoEncoder", str);
                    Monitor.m84161a(3, str, "", 0);
                    C14216g c14216g = this.f60864r;
                    if (c14216g != null) {
                        c14216g.m84246b(this.f60847ag);
                    }
                    this.f60841aa = 0L;
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m85277h() {
        TXCLog.m84152i("TXCHWVideoEncoder", "destroyCopyTexture");
        synchronized (this.f60836W) {
            try {
                C14178h c14178h = this.f60835V;
                if (c14178h != null) {
                    c14178h.mo83989d();
                    this.f60835V = null;
                }
                this.f60834U = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public int getEncodeCost() {
        return this.f60839Z;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long getRealBitrate() {
        return this.f60848b;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public double getRealFPS() {
        return this.f60849c;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrame(int i, int i2, int i3, long j) {
        int iMo83981b;
        if (this.f60872z) {
            return 10000004L;
        }
        synchronized (this.f60836W) {
            try {
                if (this.f60835V == null) {
                    m85248a(i2, i3);
                }
                this.f60835V.mo83969a(i2, i3);
                GLES20.glViewport(0, 0, i2, i3);
                iMo83981b = this.f60835V.mo83981b(i);
                GLES20.glFinish();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f60830Q++;
        this.f60817D = j;
        this.f60834U = iMo83981b;
        this.mInputWidth = i2;
        this.mInputHeight = i3;
        if (this.f60825L) {
            m85273f();
        }
        if (!this.f60826M || this.f60837X) {
            this.f60833T++;
            this.f60864r.m84246b(this.f60866t);
            this.f60837X = false;
        }
        int i4 = this.f60828O;
        if (i4 > this.f60829P + 30) {
            TXCLog.m84149e("TXCHWVideoEncoder", String.format("hw encoder error when render[%d] pop[%d]", Integer.valueOf(i4), Integer.valueOf(this.f60829P)));
            InterfaceC14490d interfaceC14490d = this.mListener;
            if (interfaceC14490d != null) {
                interfaceC14490d.mo83841k(this.mStreamType);
            }
        }
        if (this.f60831R + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS >= System.currentTimeMillis()) {
            return 0L;
        }
        this.f60831R = System.currentTimeMillis();
        int i5 = this.f60832S;
        if (i5 != 0 && i5 == this.f60828O) {
            TXCLog.m84152i("TXCHWVideoEncoder", String.format("hw encoder error when push[%d] render task[%d] render[%d] pop[%d]", Integer.valueOf(this.f60830Q), Integer.valueOf(this.f60833T), Integer.valueOf(this.f60828O), Integer.valueOf(this.f60829P)));
            InterfaceC14490d interfaceC14490d2 = this.mListener;
            if (interfaceC14490d2 != null) {
                interfaceC14490d2.mo83841k(this.mStreamType);
            }
        }
        this.f60832S = this.f60828O;
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrameAsync(final int i, int i2, int i3, final long j) {
        if (this.f60872z) {
            return 10000004L;
        }
        GLES20.glFinish();
        if (this.f60825L) {
            m85273f();
        }
        this.f60864r.m84243a().post(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.8
            @Override // java.lang.Runnable
            public void run() {
                int iM85242a;
                if (C14487a.this.f60871y || C14487a.this.f60869w == null) {
                    return;
                }
                int i4 = i;
                long j2 = j;
                C14487a.this.m85249a(j2);
                C14487a c14487a = C14487a.this;
                int i5 = (720 - c14487a.mRotation) % 360;
                c14487a.mEncodeFilter.m83970a(c14487a.mInputWidth, c14487a.mInputHeight, i5, null, ((i5 == 90 || i5 == 270) ? c14487a.mOutputHeight : c14487a.mOutputWidth) / ((i5 == 90 || i5 == 270) ? c14487a.mOutputWidth : c14487a.mOutputHeight), c14487a.mEnableXMirror, true);
                C14487a.this.mEncodeFilter.m83966a(i4);
                if (C14487a.this.f60869w instanceof C14173c) {
                    ((C14173c) C14487a.this.f60869w).m83912a(j2 * 1000000);
                    ((C14173c) C14487a.this.f60869w).m83915d();
                }
                if (C14487a.this.f60869w instanceof C14172b) {
                    ((C14172b) C14487a.this.f60869w).m83902a();
                }
                C14487a c14487a2 = C14487a.this;
                InterfaceC14490d interfaceC14490d = c14487a2.mListener;
                if (interfaceC14490d != null) {
                    interfaceC14490d.mo83842l(c14487a2.mStreamType);
                }
                do {
                    iM85242a = C14487a.this.m85242a(1);
                } while (iM85242a > 0);
                if (iM85242a != -1 && iM85242a != -2) {
                    C14487a.m85267d(C14487a.this);
                    return;
                }
                if (iM85242a == -1) {
                    C14487a.this.callDelegate(10000005);
                }
                C14487a.this.f60871y = true;
                C14487a.this.m85272e();
            }
        });
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public long pushVideoFrameSync(int i, int i2, int i3, long j) {
        if (this.f60872z) {
            return 10000004L;
        }
        GLES20.glFinish();
        this.f60817D = j;
        this.f60834U = i;
        if (this.f60825L) {
            m85273f();
        }
        this.f60864r.m84244a(this.f60867u);
        return 0L;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setBitrate(final int i) {
        this.f60840a = i;
        this.f60864r.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.6
            @Override // java.lang.Runnable
            public void run() {
                C14487a.this.m85265c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setBitrateFromQos(final int i, int i2) {
        this.f60840a = i;
        this.f60864r.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.7
            @Override // java.lang.Runnable
            public void run() {
                C14487a.this.m85265c(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setEncodeIdrFpsFromQos(int i) {
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void setFPS(final int i) {
        this.f60864r.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.5
            @Override // java.lang.Runnable
            public void run() {
                C14487a.this.m85269d(i);
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void signalEOSAndFlush() {
        if (this.f60872z) {
            return;
        }
        this.f60864r.m84244a(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.9
            @Override // java.lang.Runnable
            public void run() {
                if (C14487a.this.f60863q == null) {
                    return;
                }
                try {
                    C14487a.this.f60863q.signalEndOfInputStream();
                } catch (Exception e) {
                    TXCLog.m84150e("TXCHWVideoEncoder", "signalEndOfInputStream failed.", e);
                }
                while (C14487a.this.m85242a(10) >= 0) {
                }
                C14487a.this.m85272e();
            }
        });
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public int start(final TXSVideoEncoderParam tXSVideoEncoderParam) {
        super.start(tXSVideoEncoderParam);
        this.f60864r.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.1
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
                C14487a c14487a;
                boolean zM85254a;
                C14487a c14487a2;
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
                        Integer numValueOf = Integer.valueOf(C14487a.this.hashCode());
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
                        Monitor.m84161a(2, str6, "", 0);
                        TXCLog.m84152i("TXCHWVideoEncoder", "start:".concat(str6));
                        c14487a = C14487a.this;
                        if (c14487a.mInit) {
                            c14487a.m85272e();
                        }
                        zM85254a = C14487a.this.m85254a(tXSVideoEncoderParam);
                        c14487a2 = C14487a.this;
                        if (zM85254a) {
                            Monitor.m84161a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(c14487a2.hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                        } else {
                            c14487a2.callDelegate(10000004);
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
                Integer numValueOf7 = Integer.valueOf(C14487a.this.hashCode());
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
                Monitor.m84161a(2, str8, "", 0);
                TXCLog.m84152i("TXCHWVideoEncoder", "start:".concat(str8));
                c14487a = C14487a.this;
                if (c14487a.mInit) {
                    c14487a.m85272e();
                }
                zM85254a = C14487a.this.m85254a(tXSVideoEncoderParam);
                c14487a2 = C14487a.this;
                if (zM85254a) {
                    Monitor.m84161a(2, String.format("VideoEncoder[%d]: Start successfully, streamType:%d", Integer.valueOf(c14487a2.hashCode()), Integer.valueOf(tXSVideoEncoderParam.streamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                } else {
                    c14487a2.callDelegate(10000004);
                }
            }
        });
        return 0;
    }

    @Override // com.tencent.liteav.videoencoder.C14489c
    public void stop() {
        this.f60872z = true;
        this.f60864r.m84246b(new Runnable() { // from class: com.tencent.liteav.videoencoder.a.4
            @Override // java.lang.Runnable
            public void run() {
                C14487a c14487a = C14487a.this;
                if (c14487a.mInit) {
                    Monitor.m84161a(2, String.format("VideoEncoder[%d]: Stop, streamType:%d", Integer.valueOf(c14487a.hashCode()), Integer.valueOf(C14487a.this.mStreamType)), "streamType: 2-big, 3-small, 7-sub", 0);
                    C14487a.this.m85272e();
                }
            }
        });
        m85277h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m85267d(C14487a c14487a) {
        int i = c14487a.f60828O;
        c14487a.f60828O = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m85269d(int i) {
        if (!this.mInit || i == 0 || this.f60822I == i) {
            return;
        }
        TXCLog.m84152i("TXCHWVideoEncoder", "set fps " + i + ", restart encoder.");
        m85259b();
        m85268d();
        this.f60822I = i;
        m85266c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m85259b() {
        TXCLog.m84152i("TXCHWVideoEncoder", "HWVideoEncode destroyGL");
        C14178h c14178h = this.mEncodeFilter;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.mEncodeFilter = null;
        }
        Object obj = this.f60869w;
        if (obj instanceof C14172b) {
            ((C14172b) obj).m83904c();
            this.f60869w = null;
        }
        Object obj2 = this.f60869w;
        if (obj2 instanceof C14173c) {
            ((C14173c) obj2).m83914c();
            this.f60869w = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m85265c(int i) {
        if (this.mInit) {
            long j = this.f60855i;
            int i2 = this.f60840a;
            if (j == i2) {
                return;
            }
            boolean z = false;
            if (i2 < j && this.f60845ae) {
                if (this.f60844ad) {
                    String str = "restart video hw encoder when down bps。[module:" + Build.MODEL + "] [Hardware:" + Build.HARDWARE + "] [osVersion:" + Build.VERSION.RELEASE + Constants.AES_SUFFIX;
                    TXCLog.m84156w("TXCHWVideoEncoder", str);
                    Monitor.m84161a(2, str, "", 0);
                    z = true;
                } else {
                    this.f60842ab = 3;
                    this.f60841aa = System.currentTimeMillis();
                    this.f60843ac = this.f60840a;
                }
            }
            this.f60855i = this.f60840a;
            if (this.f60863q != null) {
                if (z) {
                    this.f60864r.m84243a().removeCallbacks(this.f60847ag);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = this.f60846af;
                    if (jCurrentTimeMillis - j2 >= 2000) {
                        this.f60847ag.run();
                        return;
                    } else {
                        this.f60864r.m84245a(this.f60847ag, 2000 - (jCurrentTimeMillis - j2));
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.f60840a * 1024);
                this.f60863q.setParameters(bundle);
            }
        }
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private MediaFormat m85246a(int i, int i2, int i3, int i4, int i5) {
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
    private MediaFormat m85247a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        MediaFormat mediaFormatM85246a = m85246a(i, i2, i3, i4, i5);
        if (mediaFormatM85246a == null) {
            return null;
        }
        MediaCodecInfo mediaCodecInfoM85245a = m85245a(YtVideoEncoder.MIME_TYPE);
        if (mediaCodecInfoM85245a != null) {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoM85245a.getCapabilitiesForType(YtVideoEncoder.MIME_TYPE);
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
            if (z || encoderCapabilities.isBitrateModeSupported(i6)) {
                mediaFormatM85246a.setInteger("bitrate-mode", i6);
            } else if (this.f60825L) {
                if (encoderCapabilities.isBitrateModeSupported(1)) {
                    mediaFormatM85246a.setInteger("bitrate-mode", 1);
                } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                    mediaFormatM85246a.setInteger("bitrate-mode", 2);
                }
            } else if (encoderCapabilities.isBitrateModeSupported(2)) {
                mediaFormatM85246a.setInteger("bitrate-mode", 2);
            }
            mediaFormatM85246a.setInteger("complexity", ((Integer) encoderCapabilities.getComplexityRange().clamp(5)).intValue());
            int i8 = 0;
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                int i9 = codecProfileLevel.profile;
                if (i9 <= i7 && i9 > i8) {
                    mediaFormatM85246a.setInteger("profile", i9);
                    mediaFormatM85246a.setInteger(FirebaseAnalytics.Param.LEVEL, codecProfileLevel.level);
                    i8 = i9;
                }
            }
        }
        return mediaFormatM85246a;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private static MediaCodecInfo m85245a(String str) {
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
    public void m85249a(long j) {
        this.f60868v.add(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: a */
    private long m85244a() {
        Long lPoll = this.f60868v.poll();
        if (lPoll == null) {
            return 0L;
        }
        return lPoll.longValue();
    }

    /* JADX INFO: renamed from: a */
    private boolean m85253a(Surface surface, int i, int i2) {
        if (surface == null) {
            return false;
        }
        TXCLog.m84152i("TXCHWVideoEncoder", "HWVideoEncode createGL: " + this.mGLContextExternal);
        Object obj = this.mGLContextExternal;
        if (obj != null && (obj instanceof EGLContext)) {
            this.f60869w = C14173c.m83908a(null, (EGLContext) obj, surface, i, i2);
        } else {
            this.f60869w = C14172b.m83898a(null, (javax.microedition.khronos.egl.EGLContext) obj, surface, i, i2);
        }
        if (this.f60869w == null) {
            return false;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        C14178h c14178h = new C14178h();
        this.mEncodeFilter = c14178h;
        c14178h.m83978a(C14182l.f59081e, C14182l.m84020a(EnumC14181k.NORMAL, false, false));
        if (!this.mEncodeFilter.mo83979a()) {
            this.mEncodeFilter = null;
            return false;
        }
        GLES20.glViewport(0, 0, i, i2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* JADX INFO: renamed from: a */
    public boolean m85254a(TXSVideoEncoderParam tXSVideoEncoderParam) {
        int i;
        this.f60872z = false;
        this.f60871y = false;
        this.f60848b = 0L;
        this.f60849c = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        this.f60850d = 0L;
        this.f60851e = 0L;
        this.f60852f = 0;
        this.f60855i = 0L;
        this.f60856j = tXSVideoEncoderParam.baseGopIndex;
        this.f60857k = 0L;
        this.f60858l = tXSVideoEncoderParam.baseFrameIndex;
        this.f60859m = 0L;
        this.f60861o = 0L;
        this.f60862p = 0L;
        this.f60815B = null;
        this.f60816C = null;
        this.f60817D = 0L;
        this.f60820G = -1;
        this.mOutputWidth = tXSVideoEncoderParam.width;
        this.mOutputHeight = tXSVideoEncoderParam.height;
        this.f60821H = tXSVideoEncoderParam.gop;
        this.f60822I = tXSVideoEncoderParam.fps;
        TXCLog.m84152i("TXCHWVideoEncoder", "init with fps " + this.f60822I);
        this.f60825L = tXSVideoEncoderParam.fullIFrame;
        this.f60860n = tXSVideoEncoderParam.syncOutput;
        this.f60814A = tXSVideoEncoderParam.enableEGL14;
        this.f60827N = tXSVideoEncoderParam.forceSetBitrateMode;
        this.f60868v.clear();
        this.f60826M = tXSVideoEncoderParam.bLimitFps;
        int i2 = tXSVideoEncoderParam.width;
        if (i2 != 0 && (i = tXSVideoEncoderParam.height) != 0 && tXSVideoEncoderParam.fps != 0 && tXSVideoEncoderParam.gop != 0) {
            this.f60853g = tXSVideoEncoderParam.annexb;
            this.f60854h = tXSVideoEncoderParam.appendSpsPps;
            if (this.f60840a == 0) {
                this.f60840a = (int) (Math.sqrt((((double) (i2 * i2)) * 1.0d) + ((double) (i * i))) * 1.2d);
            }
            this.f60855i = this.f60840a;
            this.f60852f = tXSVideoEncoderParam.fps;
            int i3 = tXSVideoEncoderParam.encoderMode;
            int i4 = 2;
            if (i3 != 1) {
                if (i3 == 2) {
                    i4 = 1;
                } else if (i3 == 3) {
                    i4 = 0;
                }
            }
            if (C14188c.m84036a().m84066c() == 1) {
                tXSVideoEncoderParam.encoderProfile = 1;
            }
            this.f60823J = i4;
            this.f60824K = 1;
            if (!m85266c()) {
                return false;
            }
            this.mInit = true;
            if (this.f60826M) {
                this.f60834U = -1;
                this.f60864r.m84246b(this.f60866t);
            }
            this.f60838Y = new ArrayList<>();
            this.f60839Z = 0;
            return true;
        }
        this.f60871y = true;
        return false;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m85257a(byte[] bArr) {
        C14487a c14487a;
        byte[] bArr2;
        int length = bArr.length;
        byte[] bArr3 = new byte[length + 20];
        int i = 0;
        int i2 = 0;
        int iM85243a = 0;
        while (i < length) {
            byte b = bArr[i];
            if (b == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1) {
                c14487a = this;
                bArr2 = bArr;
                iM85243a = c14487a.m85243a(i, i2, bArr3, bArr2, iM85243a);
                i += 3;
            } else {
                c14487a = this;
                bArr2 = bArr;
                if (b == 0 && bArr2[i + 1] == 0 && bArr2[i + 2] == 0 && bArr2[i + 3] == 1) {
                    iM85243a = c14487a.m85243a(i, i2, bArr3, bArr2, iM85243a);
                    i += 4;
                }
                if (i != length - 4 && (bArr2[i + 1] != 0 || bArr2[i + 2] != 0 || bArr2[i + 3] != 1)) {
                    i = length;
                    int iM85243a2 = c14487a.m85243a(i, i2, bArr3, bArr2, iM85243a);
                    byte[] bArr4 = new byte[iM85243a2];
                    System.arraycopy(bArr3, 0, bArr4, 0, iM85243a2);
                    return bArr4;
                }
                i++;
                this = c14487a;
                bArr = bArr2;
            }
            i2 = i;
            if (i != length - 4) {
            }
            i++;
            this = c14487a;
            bArr = bArr2;
        }
        c14487a = this;
        bArr2 = bArr;
        int iM85243a3 = c14487a.m85243a(i, i2, bArr3, bArr2, iM85243a);
        byte[] bArr5 = new byte[iM85243a3];
        System.arraycopy(bArr3, 0, bArr5, 0, iM85243a3);
        return bArr5;
    }

    /* JADX INFO: renamed from: a */
    private int m85243a(int i, int i2, byte[] bArr, byte[] bArr2, int i3) {
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
                TXCLog.m84149e("TXCHWVideoEncoder", "setNalData exception");
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: a */
    private void m85248a(int i, int i2) {
        TXCLog.m84152i("TXCHWVideoEncoder", "createCopyTexture");
        synchronized (this.f60836W) {
            C14178h c14178h = new C14178h();
            this.f60835V = c14178h;
            c14178h.m83976a(true);
            this.f60835V.mo83979a();
            this.f60835V.mo83969a(i, i2);
        }
    }
}
