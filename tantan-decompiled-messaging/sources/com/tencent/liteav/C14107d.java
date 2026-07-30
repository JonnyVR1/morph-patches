package com.tencent.liteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.C14036g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14040a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p086a.EnumC14005c;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.p088c.C14012e;
import com.tencent.liteav.basic.p088c.C14013f;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.InterfaceC14020m;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.p089d.C14025c;
import com.tencent.liteav.basic.structs.C14042b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.HandlerC14051e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.C14061b;
import com.tencent.liteav.beauty.C14100d;
import com.tencent.liteav.beauty.InterfaceC14102f;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.p093b.C14083k;
import com.tencent.liteav.beauty.p093b.C14088p;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.screencapture.C14189a;
import com.tencent.liteav.videoencoder.C14325b;
import com.tencent.liteav.videoencoder.InterfaceC14327d;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14107d extends C14040a implements C14001b.b, InterfaceC14007b, InterfaceC14102f, InterfaceC14115l, InterfaceC14327d {

    /* JADX INFO: renamed from: D */
    private C14042b f59105D;

    /* JADX INFO: renamed from: K */
    private WeakReference<InterfaceC14155o> f59112K;

    /* JADX INFO: renamed from: O */
    private C14015h f59116O;

    /* JADX INFO: renamed from: P */
    private C14015h f59117P;

    /* JADX INFO: renamed from: Q */
    private C14083k f59118Q;

    /* JADX INFO: renamed from: R */
    private byte[] f59119R;

    /* JADX INFO: renamed from: V */
    private final C14061b f59123V;

    /* JADX INFO: renamed from: W */
    private WeakReference<InterfaceC14007b> f59124W;

    /* JADX INFO: renamed from: X */
    private WeakReference<InterfaceC14116m> f59125X;

    /* JADX INFO: renamed from: a */
    C14001b f59128a;

    /* JADX INFO: renamed from: b */
    C14001b f59129b;

    /* JADX INFO: renamed from: e */
    private C14100d f59132e;

    /* JADX INFO: renamed from: h */
    private TXSVideoEncoderParam f59135h;

    /* JADX INFO: renamed from: i */
    private C14325b f59136i;

    /* JADX INFO: renamed from: l */
    private TXSVideoEncoderParam f59139l;

    /* JADX INFO: renamed from: o */
    private Context f59142o;

    /* JADX INFO: renamed from: p */
    private C14110g f59143p;

    /* JADX INFO: renamed from: c */
    private final HandlerC14051e f59130c = new HandlerC14051e(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    private InterfaceC14114k f59131d = null;

    /* JADX INFO: renamed from: f */
    private boolean f59133f = false;

    /* JADX INFO: renamed from: g */
    private boolean f59134g = false;

    /* JADX INFO: renamed from: j */
    private int f59137j = 15;

    /* JADX INFO: renamed from: k */
    private boolean f59138k = false;

    /* JADX INFO: renamed from: m */
    private C14325b f59140m = null;

    /* JADX INFO: renamed from: n */
    private final Object f59141n = new Object();

    /* JADX INFO: renamed from: q */
    private int f59144q = 0;

    /* JADX INFO: renamed from: r */
    private int f59145r = 0;

    /* JADX INFO: renamed from: s */
    private int f59146s = 0;

    /* JADX INFO: renamed from: t */
    private boolean f59147t = false;

    /* JADX INFO: renamed from: u */
    private int f59148u = 0;

    /* JADX INFO: renamed from: v */
    private int f59149v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f59150w = false;

    /* JADX INFO: renamed from: x */
    private TXCloudVideoView f59151x = null;

    /* JADX INFO: renamed from: y */
    private final Object f59152y = new Object();

    /* JADX INFO: renamed from: z */
    private Surface f59153z = null;

    /* JADX INFO: renamed from: A */
    private int f59102A = 0;

    /* JADX INFO: renamed from: B */
    private int f59103B = 0;

    /* JADX INFO: renamed from: C */
    private C14012e f59104C = null;

    /* JADX INFO: renamed from: E */
    private int f59106E = 0;

    /* JADX INFO: renamed from: F */
    private boolean f59107F = false;

    /* JADX INFO: renamed from: G */
    private boolean f59108G = false;

    /* JADX INFO: renamed from: H */
    private long f59109H = 0;

    /* JADX INFO: renamed from: I */
    private long f59110I = 0;

    /* JADX INFO: renamed from: J */
    private int f59111J = 2;

    /* JADX INFO: renamed from: L */
    private boolean f59113L = false;

    /* JADX INFO: renamed from: M */
    private WeakReference<a> f59114M = null;

    /* JADX INFO: renamed from: N */
    private C14015h f59115N = null;

    /* JADX INFO: renamed from: S */
    private boolean f59120S = false;

    /* JADX INFO: renamed from: T */
    private boolean f59121T = false;

    /* JADX INFO: renamed from: U */
    private boolean f59122U = false;

    /* JADX INFO: renamed from: Y */
    private int f59126Y = 0;

    /* JADX INFO: renamed from: Z */
    private int f59127Z = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.d$a */
    public interface a {
        void onBackgroudPushStop();

        void onEncVideo(TXSNALPacket tXSNALPacket);

        void onEncVideoFormat(MediaFormat mediaFormat);
    }

    public C14107d(Context context) {
        this.f59132e = null;
        this.f59135h = null;
        this.f59136i = null;
        this.f59139l = null;
        this.f59142o = null;
        this.f59143p = null;
        this.f59142o = context.getApplicationContext();
        this.f59143p = new C14110g();
        C14100d c14100d = new C14100d(this.f59142o, true);
        this.f59132e = c14100d;
        c14100d.m83285a((InterfaceC14102f) this);
        this.f59132e.m83282a((InterfaceC14007b) this);
        C14110g c14110g = this.f59143p;
        if (c14110g.f59300U) {
            this.f59132e.m83284a(C14100d.d.MODE_SAME_AS_OUTPUT);
        } else {
            boolean z = c14110g.f59299T;
            C14100d c14100d2 = this.f59132e;
            if (z) {
                c14100d2.m83284a(C14100d.d.MODE_SAME_AS_INPUT);
            } else {
                c14100d2.m83284a(C14100d.d.MODE_THRESHOLD);
            }
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        this.f59135h = tXSVideoEncoderParam;
        tXSVideoEncoderParam.encoderMode = 1;
        this.f59136i = null;
        TXSVideoEncoderParam tXSVideoEncoderParam2 = new TXSVideoEncoderParam();
        this.f59139l = tXSVideoEncoderParam2;
        tXSVideoEncoderParam2.encoderMode = 1;
        this.f59128a = new C14001b(this);
        C14061b c14061b = new C14061b(new C14036g(this.f59142o));
        this.f59123V = c14061b;
        c14061b.setPreprocessor(this.f59132e);
        C14025c.m82853a().m82879a(this.f59142o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83421a(int i, int i2, int i3, Object obj, int i4, boolean z) {
        TXCLog.m82969i("TXCCaptureAndEnc", "New encode size width = " + i + " height = " + i2 + " encType = " + i3 + " eglContext: " + obj);
        m83462x();
        C14325b c14325b = new C14325b(i3);
        TXCStatus.m82994a(getID(), 4005, this.f59106E, Integer.valueOf(i3));
        if (i3 == 1) {
            TXCEventRecorderProxy.m82980a(getID(), 4004, 1L, -1L, "", this.f59106E);
        } else {
            TXCEventRecorderProxy.m82980a(getID(), 4004, 0L, -1L, "", this.f59106E);
        }
        this.f59121T = false;
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
        tXSVideoEncoderParam.encodeType = i3;
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        tXSVideoEncoderParam.fps = i4;
        C14110g c14110g = this.f59143p;
        tXSVideoEncoderParam.gop = c14110g.f59313i;
        tXSVideoEncoderParam.encoderProfile = c14110g.f59318n;
        tXSVideoEncoderParam.glContext = obj != null ? obj : c14325b.m84129a(i, i2);
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59135h;
        tXSVideoEncoderParam2.realTime = z;
        tXSVideoEncoderParam2.streamType = this.f59106E;
        tXSVideoEncoderParam2.annexb = this.f59108G;
        tXSVideoEncoderParam2.bMultiRef = this.f59107F;
        tXSVideoEncoderParam2.baseFrameIndex = this.f59109H + 20;
        tXSVideoEncoderParam2.baseGopIndex = ((this.f59110I + 1) % 255) + 1;
        tXSVideoEncoderParam2.bLimitFps = this.f59134g;
        tXSVideoEncoderParam2.record = this.f59122U;
        tXSVideoEncoderParam2.encFmt = this.f59143p.f59304Y;
        c14325b.m84133a((InterfaceC14327d) this);
        c14325b.m84132a((InterfaceC14007b) this);
        c14325b.m84126a(this.f59135h);
        c14325b.m84140c(this.f59143p.f59307c);
        c14325b.m84142d(this.f59137j);
        c14325b.setID(getID());
        c14325b.m84131a(this.f59126Y);
        this.f59136i = c14325b;
        String id = getID();
        int i5 = this.f59106E;
        TXSVideoEncoderParam tXSVideoEncoderParam3 = this.f59135h;
        TXCStatus.m82994a(id, 4003, i5, Integer.valueOf(tXSVideoEncoderParam3.height | (tXSVideoEncoderParam3.width << 16)));
        TXCStatus.m82994a(getID(), TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, this.f59106E, Integer.valueOf(this.f59135h.gop * 1000));
        String id2 = getID();
        TXSVideoEncoderParam tXSVideoEncoderParam4 = this.f59135h;
        TXCEventRecorderProxy.m82980a(id2, 4003, tXSVideoEncoderParam4.width, tXSVideoEncoderParam4.height, "", this.f59106E);
        TXCKeyPointReportProxy.m82984a(TantanException.Client.AccountService.INVALID_THIRD_PARTY_INFO, this.f59135h.encodeType, this.f59106E);
        TXSVideoEncoderParam tXSVideoEncoderParam5 = this.f59135h;
        TXCKeyPointReportProxy.m82984a(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, tXSVideoEncoderParam5.height | (tXSVideoEncoderParam5.width << 16), this.f59106E);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003b  */
    /* JADX INFO: renamed from: b */
    private void m83434b(int i, int i2, Object obj) {
        C14107d c14107d;
        Object obj2;
        C14110g c14110g = this.f59143p;
        int i3 = c14110g.f59314j;
        int i4 = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 1;
            } else if (i3 == 2) {
                i4 = 3;
            }
        }
        int i5 = (this.f59144q == 1 && this.f59145r == 0) ? 1 : i4;
        int i6 = c14110g.f59313i;
        if (this.f59136i == null || this.f59121T) {
            c14107d = this;
            obj2 = obj;
            c14107d.m83421a(i, i2, i5, obj2, c14110g.f59312h, c14110g.f59295P);
        } else {
            TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
            if (tXSVideoEncoderParam.width == i && tXSVideoEncoderParam.height == i2 && tXSVideoEncoderParam.encodeType == i5 && tXSVideoEncoderParam.gop == i6) {
                c14107d = this;
                obj2 = obj;
            } else {
                c14107d = this;
                obj2 = obj;
                c14107d.m83421a(i, i2, i5, obj2, c14110g.f59312h, c14110g.f59295P);
            }
        }
        if ((c14107d.f59140m == null || c14107d.f59139l.encodeType != i5) && c14107d.f59138k) {
            c14107d.m83429a(obj2, i5, c14107d.f59143p.f59295P);
        }
    }

    /* JADX INFO: renamed from: c */
    private int m83435c(C14042b c14042b) {
        if (this.f59113L) {
            return c14042b.f58462a;
        }
        int iMo82798b = c14042b.f58462a;
        if ((this.f59127Z == 1) != c14042b.f58470i) {
            if (this.f59116O == null) {
                C14015h c14015h = new C14015h();
                c14015h.mo82796a();
                c14015h.m82793a(true);
                c14015h.mo82786a(c14042b.f58466e, c14042b.f58467f);
                if (c14042b.f58466e > c14042b.f58467f) {
                    c14015h.m82810h();
                } else {
                    c14015h.m82809g();
                }
                this.f59116O = c14015h;
            }
            C14015h c14015h2 = this.f59116O;
            if (c14015h2 != null) {
                c14015h2.mo82786a(c14042b.f58466e, c14042b.f58467f);
                iMo82798b = c14015h2.mo82798b(c14042b.f58462a);
            }
        }
        if (this.f59148u != 0) {
            if (this.f59117P == null) {
                C14015h c14015h3 = new C14015h();
                c14015h3.mo82796a();
                c14015h3.m82793a(true);
                c14015h3.mo82786a(c14042b.f58466e, c14042b.f58467f);
                this.f59117P = c14015h3;
            }
            C14015h c14015h4 = this.f59117P;
            if (c14015h4 != null) {
                GLES20.glViewport(0, 0, c14042b.f58466e, c14042b.f58467f);
                int i = c14042b.f58466e;
                int i2 = c14042b.f58467f;
                float[] fArrM82797a = c14015h4.m82797a(i, i2, null, C14052f.m83034a(i, i2, i, i2), 0);
                int i3 = (720 - this.f59148u) % 360;
                c14015h4.m82787a(i, i2, i3, fArrM82797a, ((i3 == 90 || i3 == 270) ? c14042b.f58467f : c14042b.f58466e) / ((i3 == 90 || i3 == 270) ? c14042b.f58466e : c14042b.f58467f), false, false);
                c14015h4.mo82798b(iMo82798b);
                return c14015h4.m82814l();
            }
        }
        return iMo82798b;
    }

    /* JADX INFO: renamed from: d */
    private void m83441d(C14042b c14042b) {
        TXCloudVideoView tXCloudVideoView;
        TXCGLSurfaceView gLSurfaceView;
        final WeakReference<InterfaceC14155o> weakReference = this.f59112K;
        if (weakReference == null) {
            return;
        }
        int iM83435c = m83435c(c14042b);
        int i = this.f59111J;
        if (i == 2) {
            InterfaceC14155o interfaceC14155o = weakReference.get();
            if (interfaceC14155o != null) {
                TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
                tXSVideoFrame.width = c14042b.f58466e;
                tXSVideoFrame.height = c14042b.f58467f;
                tXSVideoFrame.textureId = iM83435c;
                tXSVideoFrame.eglContext = this.f59132e.m83275a();
                tXSVideoFrame.pts = TXCTimeUtil.generatePtsMS();
                interfaceC14155o.onRenderVideoFrame(getID(), this.f59106E, tXSVideoFrame);
                if (this.f59113L) {
                    c14042b.f58462a = tXSVideoFrame.textureId;
                }
            }
        } else if (i == 1 || i == 4) {
            if (this.f59115N == null) {
                C14088p c14088p = i == 1 ? new C14088p(1) : new C14088p(3);
                c14088p.m82793a(true);
                if (c14088p.mo82796a()) {
                    c14088p.mo82786a(c14042b.f58466e, c14042b.f58467f);
                    c14088p.m82791a(new C14015h.a() { // from class: com.tencent.liteav.d.16
                        @Override // com.tencent.liteav.basic.p088c.C14015h.a
                        /* JADX INFO: renamed from: a */
                        public void mo82642a(int i2) {
                            C14015h c14015h = C14107d.this.f59115N;
                            InterfaceC14155o interfaceC14155o2 = (InterfaceC14155o) weakReference.get();
                            if (c14015h == null || interfaceC14155o2 == null) {
                                return;
                            }
                            TXSVideoFrame tXSVideoFrame2 = new TXSVideoFrame();
                            tXSVideoFrame2.width = c14015h.m82816n();
                            tXSVideoFrame2.height = c14015h.m82817o();
                            tXSVideoFrame2.pts = TXCTimeUtil.generatePtsMS();
                            interfaceC14155o2.onRenderVideoFrame(C14107d.this.getID(), C14107d.this.f59106E, tXSVideoFrame2);
                            C14107d.this.f59119R = tXSVideoFrame2.data;
                        }
                    });
                    this.f59115N = c14088p;
                } else {
                    TXCLog.m82969i("TXCCaptureAndEnc", "init filter error ");
                    this.f59115N = null;
                }
            }
            C14015h c14015h = this.f59115N;
            if (c14015h != null) {
                GLES20.glViewport(0, 0, c14042b.f58466e, c14042b.f58467f);
                c14015h.mo82786a(c14042b.f58466e, c14042b.f58467f);
                c14015h.mo82798b(iM83435c);
            }
            if (this.f59113L && this.f59119R != null) {
                int i2 = this.f59111J;
                int i3 = (i2 == 1 || i2 != 4) ? 1 : 3;
                if (this.f59118Q == null) {
                    C14083k c14083k = new C14083k(i3);
                    c14083k.m82793a(true);
                    if (!c14083k.mo82796a()) {
                        TXCLog.m82973w("TXCCaptureAndEnc", " init i420ToRGBA filter failed");
                    }
                    c14083k.mo82786a(c14042b.f58466e, c14042b.f58467f);
                    this.f59118Q = c14083k;
                }
                C14083k c14083k2 = this.f59118Q;
                if (c14083k2 != null) {
                    GLES20.glViewport(0, 0, c14042b.f58466e, c14042b.f58467f);
                    c14083k2.mo82786a(c14042b.f58466e, c14042b.f58467f);
                    c14083k2.m83137a(this.f59119R);
                    c14042b.f58462a = c14083k2.m83138q();
                }
                this.f59119R = null;
            }
        }
        if (!this.f59113L || (tXCloudVideoView = this.f59151x) == null || (gLSurfaceView = tXCloudVideoView.getGLSurfaceView()) == null) {
            return;
        }
        gLSurfaceView.m83798d();
    }

    /* JADX INFO: renamed from: e */
    private void m83443e(int i, int i2) {
        if (this.f59150w) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", 2003);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Renders the first video frame");
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        C14052f.m83035a(this.f59124W, 2003, bundle);
        TXCLog.m82969i("TXCCaptureAndEnc", "trtc_render render first frame " + getID() + ", " + this.f59106E);
        this.f59150w = true;
    }

    /* JADX INFO: renamed from: i */
    private void m83448i(final boolean z) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.7
            @Override // java.lang.Runnable
            public void run() {
                if (C14107d.this.f59132e != null) {
                    C14107d.this.f59132e.m83292b();
                }
            }
        });
        m83518r();
        this.f59131d.mo83343a(z);
        this.f59131d = null;
        TXCLog.m82969i("TXCCaptureAndEnc", "stopped CaptureSource");
        final TXCloudVideoView tXCloudVideoView = this.f59151x;
        this.f59130c.post(new Runnable() { // from class: com.tencent.liteav.d.8
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.stop(z);
                }
            }
        });
        this.f59151x = null;
        synchronized (this.f59152y) {
            try {
                this.f59153z = null;
                C14012e c14012e = this.f59104C;
                if (c14012e != null) {
                    c14012e.m82743a();
                    this.f59104C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f59128a.m82710a()) {
            this.f59128a.m82711b();
        }
        if (this.f59147t) {
            m83459u();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m83459u() {
        TXCLog.m82969i("TXCCaptureAndEnc", " startBlackStream");
        if (this.f59129b == null) {
            this.f59129b = new C14001b(this);
        }
        this.f59129b.m82709a(10, -1, null, 64, 64);
    }

    /* JADX INFO: renamed from: v */
    private void m83460v() {
        TXCLog.m82969i("TXCCaptureAndEnc", " stopBlackStream when enableBlackStream " + this.f59147t);
        C14001b c14001b = this.f59129b;
        if (c14001b != null) {
            c14001b.m82711b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m83461w() {
        try {
            C14325b c14325b = this.f59140m;
            this.f59140m = null;
            if (c14325b != null) {
                c14325b.m84130a();
                c14325b.m84133a((InterfaceC14327d) null);
            }
        } catch (Exception e) {
            TXCLog.m82967e("TXCCaptureAndEnc", "stop video encoder failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m83462x() {
        try {
            TXCLog.m82969i("TXCCaptureAndEnc", "stopBigVideoEncoderInGLThread");
            C14325b c14325b = this.f59136i;
            this.f59136i = null;
            if (c14325b != null) {
                c14325b.m84130a();
                c14325b.m84133a((InterfaceC14327d) null);
            }
            this.f59121T = true;
        } catch (Exception e) {
            TXCLog.m82967e("TXCCaptureAndEnc", "stopBigVideoEncoder failed.", e);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m83463y() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.15
                @Override // java.lang.Runnable
                public void run() {
                    C14107d c14107d = C14107d.this;
                    c14107d.m83438c(c14107d.f59135h.width, C14107d.this.f59135h.height);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    private void m83464z() {
        C14100d c14100d = this.f59132e;
        if (c14100d != null) {
            C14110g c14110g = this.f59143p;
            if (c14110g.f59300U) {
                c14100d.m83284a(C14100d.d.MODE_SAME_AS_OUTPUT);
            } else if (c14110g.f59299T) {
                c14100d.m83284a(C14100d.d.MODE_SAME_AS_INPUT);
            } else {
                c14100d.m83284a(C14100d.d.MODE_THRESHOLD);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m83497f() {
        if (this.f59146s != 1) {
            TXCLog.m82973w("TXCCaptureAndEnc", "ignore pause push when is not pushing, status:" + this.f59146s);
            return;
        }
        this.f59146s = 2;
        TXCLog.m82969i("TXCCaptureAndEnc", "pausePusher");
        if ((this.f59143p.f59283D & 1) == 1) {
            m83518r();
            C14001b c14001b = this.f59128a;
            if (c14001b != null) {
                C14110g c14110g = this.f59143p;
                if (!c14110g.f59292M) {
                    int i = c14110g.f59282C;
                    int i2 = c14110g.f59281B;
                    Bitmap bitmap = c14110g.f59280A;
                    TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
                    c14001b.m82709a(i, i2, bitmap, tXSVideoEncoderParam.width, tXSVideoEncoderParam.height);
                }
            }
            InterfaceC14114k interfaceC14114k = this.f59131d;
            if (interfaceC14114k != null) {
                interfaceC14114k.mo83350c();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m83500g() {
        if (this.f59146s != 2) {
            TXCLog.m82973w("TXCCaptureAndEnc", "ignore resume push when is not pause, status:" + this.f59146s);
            return;
        }
        this.f59146s = 1;
        TXCLog.m82969i("TXCCaptureAndEnc", "resumePusher");
        C14110g c14110g = this.f59143p;
        if ((c14110g.f59283D & 1) == 1) {
            C14001b c14001b = this.f59128a;
            if (c14001b != null && !c14110g.f59292M) {
                c14001b.m82711b();
            }
            m83518r();
            InterfaceC14114k interfaceC14114k = this.f59131d;
            if (interfaceC14114k != null) {
                interfaceC14114k.mo83346b();
            }
            m83463y();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m83505h(int i) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return false;
        }
        return interfaceC14114k.mo83345a(i);
    }

    /* JADX INFO: renamed from: j */
    public void m83509j(int i) {
        C14325b c14325b;
        if (i == 2) {
            c14325b = this.f59136i;
        } else {
            c14325b = i == 3 ? this.f59140m : null;
        }
        if (c14325b != null) {
            c14325b.m84136b();
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: k */
    public void mo82658k(int i) {
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
        int i2 = tXSVideoEncoderParam.width;
        int i3 = tXSVideoEncoderParam.height;
        if (i2 * i3 < 518400) {
            this.f59143p.f59314j = 0;
        } else if (i2 * i3 < 921600 && this.f59133f) {
            this.f59143p.f59314j = 0;
        }
        if (i == 3) {
            m83520t();
        } else {
            this.f59133f = true;
            m83519s();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m83511l() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            return interfaceC14114k.mo83363h();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m83512m(final int i) {
        if (i < 1) {
            i = 1;
        }
        if (i > 2) {
            i = 2;
        }
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.17
            @Override // java.lang.Runnable
            public void run() {
                if (C14107d.this.f59135h.encoderMode == i) {
                    return;
                }
                C14107d.this.f59135h.encoderMode = i;
                C14107d.this.f59139l.encoderMode = i;
                C14107d.this.m83462x();
                C14107d.this.m83461w();
            }
        };
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            runnable.run();
        } else {
            interfaceC14114k.mo83341a(runnable);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m83514n() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            return interfaceC14114k.mo83365j();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m83515o() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            return interfaceC14114k.mo83366k();
        }
        return false;
    }

    @Override // com.tencent.liteav.basic.p087b.InterfaceC14007b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.putString("EVT_USERID", getID());
        }
        C14052f.m83035a(this.f59124W, i, bundle);
        if (i == -1317) {
            TXCEventRecorderProxy.m82980a(getID(), 2002, 4L, -1L, "", this.f59106E);
        } else if (i == -1314) {
            TXCEventRecorderProxy.m82980a(getID(), 2002, 5L, -1L, "", this.f59106E);
        } else if (i == 1003) {
            if (this.f59131d != null) {
                TXCEventRecorderProxy.m82980a(getID(), 4001, this.f59131d.mo83367l() ? 0L : 1L, -1L, "", this.f59106E);
            }
        } else if (i == -1308) {
            m83510k();
        }
        if (i == -1302 || i == -1317 || i == -1318 || i == -1319) {
            TXCKeyPointReportProxy.m82989b(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, i);
            return;
        }
        if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
            TXCKeyPointReportProxy.m82989b(30003, i);
            if (this.f59131d != null) {
                TXCEventRecorderProxy.m82980a(getID(), 4002, this.f59131d.mo83367l() ? 0L : 1L, i, "", this.f59106E);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m83516p() {
        try {
            C14100d c14100d = this.f59132e;
            if (c14100d != null) {
                c14100d.m83292b();
            }
            C14015h c14015h = this.f59115N;
            if (c14015h != null) {
                c14015h.mo82806d();
                this.f59115N = null;
            }
            C14015h c14015h2 = this.f59117P;
            if (c14015h2 != null) {
                c14015h2.mo82806d();
                this.f59117P = null;
            }
            C14015h c14015h3 = this.f59116O;
            if (c14015h3 != null) {
                c14015h3.mo82806d();
                this.f59116O = null;
            }
            m83462x();
            m83461w();
        } catch (Exception e) {
            TXCLog.m82967e("TXCCaptureAndEnc", "stop preprocessor and encoder failed.", e);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14115l
    /* JADX INFO: renamed from: q */
    public void mo83517q() {
        InterfaceC14116m interfaceC14116m;
        TXCLog.m82969i("TXCCaptureAndEnc", "onCaptureDestroy->enter ");
        C14100d c14100d = this.f59132e;
        if (c14100d != null) {
            c14100d.m83292b();
        }
        C14015h c14015h = this.f59115N;
        if (c14015h != null) {
            c14015h.mo82806d();
            this.f59115N = null;
        }
        C14015h c14015h2 = this.f59117P;
        if (c14015h2 != null) {
            c14015h2.mo82806d();
            this.f59117P = null;
        }
        C14015h c14015h3 = this.f59116O;
        if (c14015h3 != null) {
            c14015h3.mo82806d();
            this.f59116O = null;
        }
        C14083k c14083k = this.f59118Q;
        if (c14083k != null) {
            c14083k.mo82806d();
            this.f59118Q = null;
        }
        m83462x();
        m83461w();
        WeakReference<InterfaceC14116m> weakReference = this.f59125X;
        if (weakReference == null || (interfaceC14116m = weakReference.get()) == null) {
            return;
        }
        interfaceC14116m.m83621a();
    }

    /* JADX INFO: renamed from: r */
    public void m83518r() {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.10
            @Override // java.lang.Runnable
            public void run() {
                C14107d.this.m83462x();
                C14107d.this.m83461w();
            }
        };
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(runnable);
            return;
        }
        synchronized (this.f59141n) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m83519s() {
        if (this.f59136i == null) {
            return;
        }
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.11
                @Override // java.lang.Runnable
                public void run() {
                    C14107d.this.m83462x();
                }
            });
        } else {
            m83462x();
        }
    }

    @Override // com.tencent.liteav.basic.module.C14040a
    public void setID(String str) {
        super.setID(str);
        C14325b c14325b = this.f59136i;
        if (c14325b != null) {
            c14325b.setID(str);
        }
        C14325b c14325b2 = this.f59140m;
        if (c14325b2 != null) {
            c14325b2.setID(str);
        }
        C14100d c14100d = this.f59132e;
        if (c14100d != null) {
            c14100d.setID(str);
        }
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83342a(getID());
        }
        TXCLog.m82973w("TXCCaptureAndEnc", "setID:" + str);
    }

    /* JADX INFO: renamed from: t */
    public void m83520t() {
        if (this.f59140m == null) {
            return;
        }
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.13
                @Override // java.lang.Runnable
                public void run() {
                    C14107d.this.m83461w();
                }
            });
        } else {
            m83461w();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m83504h() {
        return this.f59147t;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: l */
    public void mo82659l(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void m83503h(boolean z) {
        this.f59108G = z;
    }

    /* JADX INFO: renamed from: j */
    public void m83508j() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.21
            @Override // java.lang.Runnable
            public void run() {
                if (C14107d.this.f59131d != null) {
                    C14107d.this.f59131d.mo83349b(true);
                }
                C14107d c14107d = C14107d.this;
                c14107d.m83438c(c14107d.f59135h.width, C14107d.this.f59135h.height);
                C14107d c14107d2 = C14107d.this;
                c14107d2.m83469a(c14107d2.f59126Y);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private void m83450j(final boolean z) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.14
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC14114k interfaceC14114k2 = C14107d.this.f59131d;
                    if (interfaceC14114k2 == null) {
                        return;
                    }
                    interfaceC14114k2.mo83360f(C14107d.this.f59143p.f59312h);
                    interfaceC14114k2.mo83357e(C14107d.this.f59143p.f59316l);
                    interfaceC14114k2.mo83337a(C14107d.this.f59143p.f59315k);
                    interfaceC14114k2.mo83348b(C14107d.this.f59143p.f59305a, C14107d.this.f59143p.f59306b);
                    interfaceC14114k2.mo83358e(C14107d.this.f59143p.f59300U);
                    if (z && interfaceC14114k2.mo83354d()) {
                        interfaceC14114k2.mo83349b(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m83513m() {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            return interfaceC14114k.mo83364i();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m83510k() {
        if (this.f59131d == null) {
            return;
        }
        this.f59123V.m83087a(true);
        m83448i(true);
    }

    /* JADX INFO: renamed from: g */
    public void m83501g(int i) {
        if (this.f59148u != i) {
            TXCLog.m82969i("TXCCaptureAndEnc", "vrotation setRenderRotation " + i);
        }
        this.f59148u = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83347b(i);
    }

    /* JADX INFO: renamed from: g */
    public void m83502g(boolean z) {
        this.f59134g = z;
    }

    /* JADX INFO: renamed from: f */
    public void m83498f(int i) {
        TXCLog.m82969i("TXCCaptureAndEnc", "setRenderMode " + i);
        this.f59149v = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83351c(i);
        }
        C14012e c14012e = this.f59104C;
        if (c14012e != null) {
            c14012e.m82744a(this.f59149v);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m83499f(boolean z) {
        if (this.f59107F == z) {
            return;
        }
        this.f59107F = z;
        TXCLog.m82969i("TXCCaptureAndEnc", "trtc_api onVideoConfigChanged enableRps " + this.f59107F);
        if (this.f59107F) {
            this.f59143p.f59314j = 0;
        }
        m83518r();
    }

    /* JADX INFO: renamed from: i */
    public boolean m83507i() {
        return this.f59146s != 0;
    }

    /* JADX INFO: renamed from: i */
    public void m83506i(int i) {
        this.f59106E = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83362g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public TXBeautyManager m83483b() {
        return this.f59123V;
    }

    /* JADX INFO: renamed from: e */
    public void m83494e() {
        if (!m83507i()) {
            TXCLog.m82973w("TXCCaptureAndEnc", "ignore stopPush when not pushing, status:" + this.f59146s);
            return;
        }
        TXCLog.m82969i("TXCCaptureAndEnc", "stop");
        this.f59146s = 0;
        m83518r();
        this.f59143p.f59295P = false;
        C14001b c14001b = this.f59128a;
        if (c14001b != null) {
            c14001b.m82711b();
        }
        m83487b(false);
        this.f59105D = null;
    }

    /* JADX INFO: renamed from: b */
    public void m83484b(int i) {
        TXCLog.m82969i("TXCCaptureAndEnc", "setLocalViewMirror " + i);
        this.f59127Z = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83353d(i);
        }
        C14012e c14012e = this.f59104C;
        if (c14012e != null) {
            c14012e.m82750b(this.f59127Z);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83487b(boolean z) {
        TXCLog.m82969i("TXCCaptureAndEnc", "enableBlackStream " + z);
        this.f59147t = z;
        if (z) {
            if (this.f59131d == null) {
                m83459u();
                return;
            }
            return;
        }
        m83460v();
    }

    /* JADX INFO: renamed from: e */
    public void m83495e(int i) {
        C14110g c14110g = this.f59143p;
        if (c14110g.f59312h == i) {
            return;
        }
        c14110g.f59312h = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null || interfaceC14114k.mo83361g() >= i) {
            return;
        }
        int i2 = this.f59144q;
        if (i2 == 0) {
            m83450j(true);
            m83518r();
        } else {
            if (i2 != 1) {
                return;
            }
            this.f59131d.mo83360f(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83485b(int i, int i2) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83336a(i, i2);
    }

    @Override // com.tencent.liteav.InterfaceC14115l
    /* JADX INFO: renamed from: b */
    public void mo83486b(C14042b c14042b) throws Throwable {
        if (!this.f59120S) {
            this.f59120S = true;
            TXCKeyPointReportProxy.m82989b(30003, 0);
        }
        if (this.f59146s == 2) {
            return;
        }
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (this.f59132e == null || this.f59143p.f59292M || interfaceC14114k == null) {
            return;
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
        int i = tXSVideoEncoderParam.height;
        int i2 = c14042b.f58469h;
        if (i != i2 || tXSVideoEncoderParam.width != c14042b.f58468g) {
            m83440d(c14042b.f58468g, i2);
        }
        this.f59132e.m83286a(interfaceC14114k.mo83359f());
        this.f59132e.m83277a(this.f59143p.f59316l);
        this.f59132e.m83273a(c14042b, c14042b.f58463b, 0, 0L);
    }

    /* JADX INFO: renamed from: e */
    public boolean m83496e(boolean z) {
        this.f59143p.f59298S = z;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return false;
        }
        interfaceC14114k.mo83352c(z);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C14110g m83488c() {
        return this.f59143p;
    }

    /* JADX INFO: renamed from: c */
    public void m83489c(final int i) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.19
            @Override // java.lang.Runnable
            public void run() {
                if (C14107d.this.f59136i != null) {
                    C14107d.this.f59136i.m84142d(i);
                }
                C14107d.this.f59137j = i;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m83490c(boolean z) {
        m83448i(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m83438c(int i, int i2) {
        C14110g c14110g = this.f59143p;
        float f = c14110g.f59289J;
        C14100d c14100d = this.f59132e;
        if (f != -1.0f) {
            if (c14100d != null) {
                c14100d.m83281a(c14110g.f59284E, c14110g.f59287H, c14110g.f59288I, f);
            }
        } else {
            if (c14100d == null || i == 0 || i2 == 0) {
                return;
            }
            Bitmap bitmap = c14110g.f59284E;
            float f2 = i;
            c14100d.m83281a(bitmap, c14110g.f59285F / f2, c14110g.f59286G / i2, bitmap == null ? 0.0f : bitmap.getWidth() / f2);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m83491d() {
        if (m83507i()) {
            TXCLog.m82973w("TXCCaptureAndEnc", "ignore startPush when pushing, status:" + this.f59146s);
            return -2;
        }
        TXCDRApi.initCrashReport(this.f59142o);
        this.f59146s = 1;
        TXCLog.m82969i("TXCCaptureAndEnc", "startWithoutAudio");
        m83464z();
        TXCDRApi.txReportDAU(this.f59142o, C14026a.f58376bu);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m83492d(final int i) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return;
        }
        interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.20
            @Override // java.lang.Runnable
            public void run() {
                if (C14107d.this.f59136i != null) {
                    C14107d.this.f59136i.m84144e(i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m83493d(boolean z) {
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k == null) {
            return false;
        }
        return interfaceC14114k.mo83355d(z);
    }

    /* JADX INFO: renamed from: d */
    private void m83440d(int i, int i2) {
        m83438c(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m83477a(a aVar) {
        this.f59114M = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m83479a(InterfaceC14155o interfaceC14155o, int i) {
        this.f59111J = i;
        if (interfaceC14155o != null) {
            this.f59112K = new WeakReference<>(interfaceC14155o);
        } else {
            this.f59112K = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83482a(boolean z) {
        this.f59113L = z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX INFO: renamed from: a */
    public void m83478a(C14110g c14110g) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c14110g != null) {
            C14110g c14110g2 = this.f59143p;
            if (c14110g2.f59284E == c14110g.f59284E && c14110g2.f59285F == c14110g.f59285F && c14110g2.f59286G == c14110g.f59286G && c14110g2.f59289J == c14110g.f59289J && c14110g2.f59287H == c14110g.f59287H && c14110g2.f59288I == c14110g.f59288I) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (c14110g != null) {
            C14110g c14110g3 = this.f59143p;
            if (c14110g3.f59305a == c14110g.f59305a && c14110g3.f59306b == c14110g.f59306b) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (c14110g != null) {
            try {
                this.f59143p = (C14110g) c14110g.clone();
            } catch (CloneNotSupportedException e) {
                this.f59143p = new C14110g();
                e.printStackTrace();
            }
        } else {
            this.f59143p = new C14110g();
        }
        TXCLog.m82969i("TXCCaptureAndEnc", String.format("vsize setConfig w*h:%d*%d orientation:%d", Integer.valueOf(this.f59143p.f59305a), Integer.valueOf(this.f59143p.f59306b), Integer.valueOf(this.f59143p.f59316l)));
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83357e(this.f59143p.f59316l);
        }
        m83464z();
        if (z2 && !this.f59143p.f59299T) {
            z3 = true;
        }
        m83450j(z3);
        if (m83507i() && z) {
            m83463y();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83475a(InterfaceC14007b interfaceC14007b) {
        this.f59124W = new WeakReference<>(interfaceC14007b);
    }

    /* JADX INFO: renamed from: a */
    public void m83469a(final int i) {
        TXCLog.m82969i("TXCCaptureAndEnc", "vrotation setVideoEncRotation " + i);
        this.f59126Y = i;
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C14107d.this.f59136i != null) {
                        C14107d.this.f59136i.m84131a(i);
                    }
                    if (C14107d.this.f59140m != null) {
                        C14107d.this.f59140m.m84131a(i);
                    }
                }
            });
            return;
        }
        C14325b c14325b = this.f59136i;
        if (c14325b != null) {
            c14325b.m84131a(i);
        }
        C14325b c14325b2 = this.f59140m;
        if (c14325b2 != null) {
            c14325b2.m84131a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83471a(int i, final int i2, final int i3, final int i4, final int i5, int i6, int i7) {
        InterfaceC14114k interfaceC14114k;
        C14107d c14107d;
        int i8;
        if (i == 2) {
            TXSVideoEncoderParam tXSVideoEncoderParam = this.f59135h;
            int i9 = tXSVideoEncoderParam.width;
            if (i9 != 0 && (i8 = tXSVideoEncoderParam.height) != 0 && (i2 != i9 || i3 != i8 || i4 > tXSVideoEncoderParam.fps)) {
                InterfaceC14114k interfaceC14114k2 = this.f59131d;
                if (interfaceC14114k2 != null) {
                    c14107d = this;
                    interfaceC14114k2.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.12
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i2 == C14107d.this.f59135h.width && i3 == C14107d.this.f59135h.height && i4 <= C14107d.this.f59135h.fps) {
                                return;
                            }
                            int i10 = i2;
                            int i11 = i3;
                            if (i10 > i11) {
                                C14107d.this.f59143p.f59316l = 0;
                            } else if (i10 < i11) {
                                C14107d.this.f59143p.f59316l = 1;
                            }
                            C14110g c14110g = C14107d.this.f59143p;
                            int i12 = i2;
                            int i13 = i3;
                            if (i12 > i13) {
                                i12 = i13;
                            }
                            c14110g.f59305a = i12;
                            C14110g c14110g2 = C14107d.this.f59143p;
                            int i14 = i2;
                            int i15 = i3;
                            if (i14 <= i15) {
                                i14 = i15;
                            }
                            c14110g2.f59306b = i14;
                            InterfaceC14114k interfaceC14114k3 = C14107d.this.f59131d;
                            if (interfaceC14114k3 != null) {
                                interfaceC14114k3.mo83337a(EnumC14005c.RESOLUTION_TYPE_INVALID);
                                interfaceC14114k3.mo83348b(C14107d.this.f59143p.f59305a, C14107d.this.f59143p.f59306b);
                                interfaceC14114k3.mo83357e(C14107d.this.f59143p.f59316l);
                            }
                            C14107d.this.f59143p.f59307c = i5;
                            C14107d.this.f59143p.f59312h = i4;
                            C14107d.this.m83462x();
                            TXCLog.m82966e("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(C14107d.this.f59135h.width), Integer.valueOf(C14107d.this.f59135h.height), Integer.valueOf(C14107d.this.f59135h.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                        }
                    });
                } else {
                    c14107d = this;
                }
            } else {
                c14107d = this;
                C14325b c14325b = c14107d.f59136i;
                if (c14325b != null) {
                    c14325b.m84138b(i5, i6);
                    c14325b.m84137b(i4);
                }
            }
            c14107d.m83492d(i7);
            return;
        }
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59139l;
        if (tXSVideoEncoderParam2 != null && ((i2 != tXSVideoEncoderParam2.width || i3 != tXSVideoEncoderParam2.height) && (interfaceC14114k = this.f59131d) != null)) {
            interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.18
                @Override // java.lang.Runnable
                public void run() {
                    TXCLog.m82973w("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(C14107d.this.f59139l.width), Integer.valueOf(C14107d.this.f59139l.height), Integer.valueOf(C14107d.this.f59139l.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                    C14107d.this.f59139l.width = i2;
                    C14107d.this.f59139l.height = i3;
                    C14107d.this.m83461w();
                }
            });
        }
        C14325b c14325b2 = this.f59140m;
        if (c14325b2 != null) {
            c14325b2.m84138b(i5, i6);
            c14325b2.m84137b(i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83481a(final TXCloudVideoView tXCloudVideoView) {
        InterfaceC14020m interfaceC14020m;
        if (this.f59143p.f59292M) {
            TXCLog.m82966e("TXCCaptureAndEnc", "enable pure audio push , so can not start preview!");
            return;
        }
        C14001b c14001b = this.f59128a;
        if (c14001b != null) {
            c14001b.m82711b();
        }
        this.f59150w = false;
        boolean z = this.f59143p.f59302W;
        if (tXCloudVideoView != null) {
            final TXCGLSurfaceView[] tXCGLSurfaceViewArr = new TXCGLSurfaceView[1];
            m83430a(new Runnable() { // from class: com.tencent.liteav.d.22
                @Override // java.lang.Runnable
                public void run() {
                    tXCGLSurfaceViewArr[0] = new TXCGLSurfaceView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(tXCGLSurfaceViewArr[0]);
                }
            });
            TXCGLSurfaceView tXCGLSurfaceView = tXCGLSurfaceViewArr[0];
            tXCGLSurfaceView.setNotifyListener(this);
            TXCLog.m82969i("TXCCaptureAndEnc", "start camera preview with GLSurfaceView");
            interfaceC14020m = tXCGLSurfaceView;
        } else {
            C14013f c14013f = new C14013f();
            TXCLog.m82969i("TXCCaptureAndEnc", "start camera preview with SurfaceTexture");
            z = false;
            interfaceC14020m = c14013f;
        }
        this.f59144q = 0;
        this.f59131d = new C14103c(this.f59142o, this.f59143p, interfaceC14020m, z);
        m83460v();
        m83506i(this.f59106E);
        this.f59131d.mo83342a(getID());
        this.f59131d.mo83340a((InterfaceC14115l) this);
        this.f59131d.mo83338a((InterfaceC14007b) this);
        this.f59131d.mo83334a();
        this.f59131d.mo83347b(this.f59148u);
        this.f59131d.mo83351c(this.f59149v);
        this.f59131d.mo83353d(this.f59127Z);
        this.f59151x = tXCloudVideoView;
        this.f59130c.post(new Runnable() { // from class: com.tencent.liteav.d.2
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.start(C14107d.this.f59143p.f59290K, C14107d.this.f59143p.f59291L, C14107d.this.f59131d);
                }
            }
        });
        this.f59150w = false;
        TXCKeyPointReportProxy.m82982a(30003);
    }

    /* JADX INFO: renamed from: a */
    public int m83467a(boolean z, int i, int i2, int i3, int i4, int i5) {
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59139l;
        boolean z2 = (tXSVideoEncoderParam.width == i && tXSVideoEncoderParam.height == i2) ? false : true;
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        tXSVideoEncoderParam.fps = i3;
        tXSVideoEncoderParam.gop = i5;
        tXSVideoEncoderParam.encoderProfile = 1;
        tXSVideoEncoderParam.realTime = this.f59143p.f59295P;
        tXSVideoEncoderParam.streamType = 3;
        tXSVideoEncoderParam.bitrate = i4;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.bMultiRef = false;
        if (this.f59140m != null && (z2 || (this.f59138k && !z))) {
            InterfaceC14114k interfaceC14114k = this.f59131d;
            if (interfaceC14114k != null) {
                interfaceC14114k.mo83341a(new Runnable() { // from class: com.tencent.liteav.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14107d.this.m83461w();
                    }
                });
            } else {
                m83461w();
            }
        }
        this.f59138k = z;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m83474a(Surface surface) {
        if (this.f59151x != null) {
            TXCLog.m82973w("TXCCaptureAndEnc", "camera preview view is not null, can't set surface");
            return;
        }
        synchronized (this.f59152y) {
            try {
                if (this.f59153z == surface) {
                    TXCLog.m82969i("TXCCaptureAndEnc", "surface-render: set surface the same" + surface);
                } else {
                    TXCLog.m82969i("TXCCaptureAndEnc", "surface-render: set surface " + surface);
                    this.f59153z = surface;
                    C14012e c14012e = this.f59104C;
                    if (c14012e != null) {
                        c14012e.m82743a();
                        this.f59104C = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83470a(final int i, final int i2) {
        synchronized (this.f59152y) {
            try {
                C14012e c14012e = this.f59104C;
                if (c14012e != null) {
                    c14012e.m82748a(new Runnable() { // from class: com.tencent.liteav.d.4
                        @Override // java.lang.Runnable
                        public void run() {
                            C14107d.this.f59102A = i;
                            C14107d.this.f59103B = i2;
                            if (C14107d.this.f59105D == null || C14107d.this.f59104C == null) {
                                return;
                            }
                            C14107d c14107d = C14107d.this;
                            c14107d.m83424a(c14107d.f59105D, true);
                        }
                    });
                } else {
                    this.f59102A = i;
                    this.f59103B = i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83476a(final InterfaceC14022o interfaceC14022o) {
        TXCloudVideoView tXCloudVideoView = this.f59151x;
        if (tXCloudVideoView != null) {
            TXCGLSurfaceView gLSurfaceView = tXCloudVideoView.getGLSurfaceView();
            if (gLSurfaceView != null) {
                gLSurfaceView.m83781a(new InterfaceC14022o() { // from class: com.tencent.liteav.d.5
                    @Override // com.tencent.liteav.basic.p088c.InterfaceC14022o
                    public void onTakePhotoComplete(Bitmap bitmap) {
                        InterfaceC14022o interfaceC14022o2 = interfaceC14022o;
                        if (interfaceC14022o2 != null) {
                            interfaceC14022o2.onTakePhotoComplete(bitmap);
                        }
                    }
                });
                return;
            } else {
                if (interfaceC14022o != null) {
                    interfaceC14022o.onTakePhotoComplete(null);
                    return;
                }
                return;
            }
        }
        C14012e c14012e = this.f59104C;
        if (c14012e != null) {
            c14012e.m82746a(new InterfaceC14022o() { // from class: com.tencent.liteav.d.6
                @Override // com.tencent.liteav.basic.p088c.InterfaceC14022o
                public void onTakePhotoComplete(Bitmap bitmap) {
                    InterfaceC14022o interfaceC14022o2 = interfaceC14022o;
                    if (interfaceC14022o2 != null) {
                        interfaceC14022o2.onTakePhotoComplete(bitmap);
                    }
                }
            });
        } else if (interfaceC14022o != null) {
            interfaceC14022o.onTakePhotoComplete(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83480a(C14189a.a aVar) {
        this.f59144q = 1;
        if (this.f59131d == null) {
            this.f59131d = new C14112i(this.f59142o, this.f59143p, aVar);
            TXCLog.m82969i("TXCCaptureAndEnc", "create TXCScreenCaptureSource");
        }
        this.f59123V.m83087a(false);
        m83506i(this.f59106E);
        this.f59131d.mo83338a((InterfaceC14007b) this);
        this.f59131d.mo83340a((InterfaceC14115l) this);
        this.f59131d.mo83334a();
        this.f59131d.mo83342a(getID());
        TXCDRApi.txReportDAU(this.f59142o, C14026a.f58300aG);
    }

    /* JADX INFO: renamed from: a */
    public void m83472a(Bitmap bitmap, float f, float f2, float f3) {
        C14110g c14110g = this.f59143p;
        c14110g.f59284E = bitmap;
        c14110g.f59287H = f;
        c14110g.f59288I = f2;
        c14110g.f59289J = f3;
        m83463y();
    }

    /* JADX INFO: renamed from: a */
    private void m83422a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        C14052f.m83035a(this.f59124W, i, bundle);
        if (i == -1317) {
            TXCEventRecorderProxy.m82980a(getID(), 2002, 4L, -1L, "", this.f59106E);
        } else if (i == -1314) {
            TXCEventRecorderProxy.m82980a(getID(), 2002, 5L, -1L, "", this.f59106E);
        } else if (i == 1003 && this.f59131d != null) {
            TXCEventRecorderProxy.m82980a(getID(), 4001, this.f59131d.mo83367l() ? 0L : 1L, -1L, "", this.f59106E);
        }
        if (i == -1302 || i == -1317 || i == -1318 || i == -1319) {
            TXCKeyPointReportProxy.m82989b(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, i);
            return;
        }
        if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
            TXCKeyPointReportProxy.m82989b(30003, i);
            if (this.f59131d != null) {
                TXCEventRecorderProxy.m82980a(getID(), 4002, this.f59131d.mo83367l() ? 0L : 1L, i, "", this.f59106E);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m83468a(byte[] bArr, int i, int i2, int i3, Object obj, long j, int i4) {
        C14042b c14042b = new C14042b();
        c14042b.f58474m = bArr;
        c14042b.f58463b = i;
        c14042b.f58465d = true;
        m83423a(c14042b, i2, i3, obj, j);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m83465a(int i, int i2, int i3, Object obj, long j) {
        synchronized (this.f59141n) {
            try {
                if (this.f59146s == 2) {
                    return 0;
                }
                int iM83417a = m83417a(i2, i3, obj);
                if (iM83417a != 0) {
                    return iM83417a;
                }
                if (j == 0) {
                    j = TXCTimeUtil.generatePtsMS();
                }
                C14325b c14325b = this.f59136i;
                if (c14325b != null) {
                    c14325b.m84135a(this.f59143p.f59298S);
                    c14325b.m84127a(i, i2, i3, j);
                }
                C14325b c14325b2 = this.f59140m;
                if (c14325b2 != null) {
                    c14325b2.m84135a(this.f59143p.f59298S);
                    c14325b2.m84127a(i, i2, i3, j);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m83466a(int i, int i2, int i3, Object obj, long j, int i4) {
        C14042b c14042b = new C14042b();
        c14042b.f58462a = i;
        c14042b.f58463b = 0;
        m83423a(c14042b, i2, i3, obj, j);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m83423a(C14042b c14042b, int i, int i2, Object obj, long j) {
        synchronized (this.f59141n) {
            try {
                if (this.f59146s == 2) {
                    return;
                }
                c14042b.f58466e = i;
                c14042b.f58467f = i2;
                C14110g c14110g = this.f59143p;
                c14042b.f58470i = c14110g.f59298S;
                if (c14110g.f59316l == 0) {
                    c14042b.f58468g = c14110g.f59306b;
                    c14042b.f58469h = c14110g.f59305a;
                } else {
                    c14042b.f58468g = c14110g.f59305a;
                    c14042b.f58469h = c14110g.f59306b;
                }
                c14042b.f58473l = C14052f.m83034a(i, i2, c14042b.f58468g, c14042b.f58469h);
                try {
                    this.f59132e.m83277a(this.f59143p.f59316l);
                    this.f59132e.m83286a(obj);
                    this.f59132e.m83273a(c14042b, c14042b.f58463b, 0, j);
                } catch (Exception e) {
                    TXCLog.m82966e("TXCCaptureAndEnc", "send custom video frame failed." + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14102f
    /* JADX INFO: renamed from: a */
    public int mo83321a(C14042b c14042b) {
        InterfaceC14116m interfaceC14116m;
        WeakReference<InterfaceC14116m> weakReference = this.f59125X;
        if (weakReference != null && (interfaceC14116m = weakReference.get()) != null) {
            c14042b.f58462a = interfaceC14116m.m83620a(c14042b.f58462a, c14042b.f58466e, c14042b.f58467f);
        }
        m83441d(c14042b);
        m83424a(c14042b, false);
        return c14042b.f58462a;
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14102f
    /* JADX INFO: renamed from: a */
    public void mo83322a(C14042b c14042b, long j) {
        m83420a(c14042b.f58462a, c14042b.f58466e, c14042b.f58467f, j);
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82656a(TXSNALPacket tXSNALPacket, int i) {
        a aVar;
        if (i == 0) {
            if (tXSNALPacket.streamType == 2) {
                this.f59110I = tXSNALPacket.gopIndex;
                this.f59109H = tXSNALPacket.frameIndex;
            }
            WeakReference<a> weakReference = this.f59114M;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.onEncVideo(tXSNALPacket);
            return;
        }
        if ((i == 10000004 || i == 10000005) && this.f59135h.encodeType == 1) {
            Monitor.m82978a(2, String.format("VideoEncoder: hardware encoder error %d, switch to software encoder", Integer.valueOf(i)), "", 0);
            m83518r();
            this.f59145r++;
            this.f59143p.f59314j = 0;
            m83422a(1103, "Failed to enable hardware encoder, use software encoder");
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82653a(MediaFormat mediaFormat) {
        a aVar;
        WeakReference<a> weakReference = this.f59114M;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onEncVideoFormat(mediaFormat);
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14327d
    /* JADX INFO: renamed from: a */
    public void mo82652a(int i, long j, long j2) {
        if (i == 2) {
            this.f59110I = j;
            this.f59109H = j2;
        }
    }

    @Override // com.tencent.liteav.C14001b.b
    /* JADX INFO: renamed from: a */
    public void mo82713a(final Bitmap bitmap, final ByteBuffer byteBuffer, final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if ((C14107d.this.f59146s == 2 || C14107d.this.f59147t) && bitmap != null && byteBuffer != null) {
                        if (C14107d.this.f59136i == null || C14107d.this.f59121T || C14107d.this.f59135h.width != i || C14107d.this.f59135h.height != i2 || C14107d.this.f59135h.encodeType != 2 || C14107d.this.f59135h.gop != C14107d.this.f59143p.f59313i) {
                            C14107d c14107d = C14107d.this;
                            c14107d.m83421a(i, i2, 2, (Object) null, c14107d.f59143p.f59282C, true);
                        }
                        if ((C14107d.this.f59140m == null || C14107d.this.f59139l.encodeType != 2) && C14107d.this.f59138k) {
                            C14107d.this.m83429a((Object) null, 2, true);
                        }
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        C14325b c14325b = C14107d.this.f59136i;
                        if (c14325b != null) {
                            c14325b.m84128a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                        C14325b c14325b2 = C14107d.this.f59140m;
                        if (c14325b2 != null) {
                            c14325b2.m84128a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                    }
                } catch (Exception e) {
                    TXCLog.m82966e("TXCCaptureAndEnc", "onPushBitmap failed." + e.getMessage());
                }
            }
        };
        InterfaceC14114k interfaceC14114k = this.f59131d;
        if (interfaceC14114k != null) {
            interfaceC14114k.mo83341a(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.tencent.liteav.C14001b.b
    /* JADX INFO: renamed from: a */
    public void mo82712a() {
        a aVar;
        TXCLog.m82969i("TXCCaptureAndEnc", "onPushEnd");
        WeakReference<a> weakReference = this.f59114M;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onBackgroudPushStop();
    }

    @Override // com.tencent.liteav.InterfaceC14115l
    /* JADX INFO: renamed from: a */
    public void mo83473a(SurfaceTexture surfaceTexture) {
        C14100d c14100d = this.f59132e;
        if (c14100d != null) {
            c14100d.m83292b();
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14102f
    /* JADX INFO: renamed from: a */
    public void mo83323a(byte[] bArr, int i, int i2, int i3, long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83429a(Object obj, int i, boolean z) {
        m83461w();
        C14325b c14325b = new C14325b(i);
        TXCStatus.m82994a(getID(), 4005, 3, Integer.valueOf(i));
        if (i == 1) {
            TXCEventRecorderProxy.m82980a(getID(), 4004, 1L, -1L, "", 3);
        } else {
            TXCEventRecorderProxy.m82980a(getID(), 4004, 0L, -1L, "", 3);
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59139l;
        tXSVideoEncoderParam.glContext = obj != null ? obj : c14325b.m84129a(tXSVideoEncoderParam.width, tXSVideoEncoderParam.height);
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59139l;
        tXSVideoEncoderParam2.encodeType = i;
        tXSVideoEncoderParam2.realTime = z;
        TXCLog.m82969i("TXCCaptureAndEnc", "start small video encoder");
        c14325b.m84133a((InterfaceC14327d) this);
        c14325b.m84132a((InterfaceC14007b) this);
        c14325b.m84126a(this.f59139l);
        c14325b.m84140c(this.f59139l.bitrate);
        c14325b.setID(getID());
        c14325b.m84131a(this.f59126Y);
        this.f59140m = c14325b;
        String id = getID();
        TXSVideoEncoderParam tXSVideoEncoderParam3 = this.f59139l;
        TXCStatus.m82994a(id, 4003, 3, Integer.valueOf(tXSVideoEncoderParam3.height | (tXSVideoEncoderParam3.width << 16)));
        TXCStatus.m82994a(getID(), TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, 3, Integer.valueOf(this.f59139l.gop * 1000));
    }

    /* JADX INFO: renamed from: a */
    private void m83420a(int i, int i2, int i3, long j) {
        if (j == 0) {
            j = TXCTimeUtil.generatePtsMS();
        }
        long j2 = j;
        m83434b(i2, i3, this.f59132e.m83275a());
        C14325b c14325b = this.f59136i;
        if (c14325b != null) {
            c14325b.m84127a(i, i2, i3, j2);
        }
        C14325b c14325b2 = this.f59140m;
        if (c14325b2 != null) {
            c14325b2.m84127a(i, i2, i3, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m83417a(int i, int i2, Object obj) {
        C14110g c14110g = this.f59143p;
        int i3 = c14110g.f59305a;
        int i4 = c14110g.f59306b;
        int i5 = c14110g.f59316l;
        if (i5 == 0 || i5 == 2) {
            i4 = i3;
            i3 = i4;
        }
        if (i3 > 0 && i4 > 0) {
            if (c14110g.f59292M) {
                m83462x();
                return -1000;
            }
            m83434b(i3, i4, obj);
            return 0;
        }
        TXCLog.m82966e("TXCCaptureAndEnc", "sendCustomYUVData: invalid video encode resolution");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m83424a(C14042b c14042b, boolean z) {
        InterfaceC14114k interfaceC14114k;
        InterfaceC14114k interfaceC14114k2;
        m83443e(c14042b.f58466e, c14042b.f58467f);
        this.f59105D = c14042b;
        if (this.f59151x != null) {
            InterfaceC14114k interfaceC14114k3 = this.f59131d;
            if (interfaceC14114k3 != null) {
                interfaceC14114k3.mo83339a(c14042b);
                return;
            }
            return;
        }
        synchronized (this.f59152y) {
            try {
                if (this.f59153z != null && this.f59104C == null && (interfaceC14114k2 = this.f59131d) != null && interfaceC14114k2.mo83359f() != null) {
                    C14012e c14012e = new C14012e();
                    this.f59104C = c14012e;
                    c14012e.m82747a(this.f59131d.mo83359f(), this.f59153z);
                    this.f59104C.m82744a(this.f59149v);
                    this.f59104C.m82750b(this.f59127Z);
                }
                C14012e c14012e2 = this.f59104C;
                if (c14012e2 != null && (interfaceC14114k = this.f59131d) != null) {
                    c14012e2.m82745a(c14042b.f58462a, c14042b.f58470i, this.f59148u, this.f59102A, this.f59103B, c14042b.f58466e, c14042b.f58467f, z, interfaceC14114k.mo83367l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m83430a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f59130c.m83029a(runnable);
        } else {
            runnable.run();
        }
    }
}
