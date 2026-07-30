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
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.license.C14199g;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.C14203a;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.module.TXCKeyPointReportProxy;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.liteav.basic.p091a.EnumC14168c;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.p093c.C14175e;
import com.tencent.liteav.basic.p093c.C14176f;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.InterfaceC14183m;
import com.tencent.liteav.basic.p093c.InterfaceC14185o;
import com.tencent.liteav.basic.p094d.C14188c;
import com.tencent.liteav.basic.structs.C14205b;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.HandlerC14214e;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.liteav.beauty.C14224b;
import com.tencent.liteav.beauty.C14263d;
import com.tencent.liteav.beauty.InterfaceC14265f;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.p098b.C14246k;
import com.tencent.liteav.beauty.p098b.C14251p;
import com.tencent.liteav.renderer.TXCGLSurfaceView;
import com.tencent.liteav.screencapture.C14352a;
import com.tencent.liteav.videoencoder.C14488b;
import com.tencent.liteav.videoencoder.InterfaceC14490d;
import com.tencent.liteav.videoencoder.TXSVideoEncoderParam;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14270d extends C14203a implements C14164b.b, InterfaceC14170b, InterfaceC14265f, InterfaceC14278l, InterfaceC14490d {

    /* JADX INFO: renamed from: D */
    private C14205b f59953D;

    /* JADX INFO: renamed from: K */
    private WeakReference<InterfaceC14318o> f59960K;

    /* JADX INFO: renamed from: O */
    private C14178h f59964O;

    /* JADX INFO: renamed from: P */
    private C14178h f59965P;

    /* JADX INFO: renamed from: Q */
    private C14246k f59966Q;

    /* JADX INFO: renamed from: R */
    private byte[] f59967R;

    /* JADX INFO: renamed from: V */
    private final C14224b f59971V;

    /* JADX INFO: renamed from: W */
    private WeakReference<InterfaceC14170b> f59972W;

    /* JADX INFO: renamed from: X */
    private WeakReference<InterfaceC14279m> f59973X;

    /* JADX INFO: renamed from: a */
    C14164b f59976a;

    /* JADX INFO: renamed from: b */
    C14164b f59977b;

    /* JADX INFO: renamed from: e */
    private C14263d f59980e;

    /* JADX INFO: renamed from: h */
    private TXSVideoEncoderParam f59983h;

    /* JADX INFO: renamed from: i */
    private C14488b f59984i;

    /* JADX INFO: renamed from: l */
    private TXSVideoEncoderParam f59987l;

    /* JADX INFO: renamed from: o */
    private Context f59990o;

    /* JADX INFO: renamed from: p */
    private C14273g f59991p;

    /* JADX INFO: renamed from: c */
    private final HandlerC14214e f59978c = new HandlerC14214e(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    private InterfaceC14277k f59979d = null;

    /* JADX INFO: renamed from: f */
    private boolean f59981f = false;

    /* JADX INFO: renamed from: g */
    private boolean f59982g = false;

    /* JADX INFO: renamed from: j */
    private int f59985j = 15;

    /* JADX INFO: renamed from: k */
    private boolean f59986k = false;

    /* JADX INFO: renamed from: m */
    private C14488b f59988m = null;

    /* JADX INFO: renamed from: n */
    private final Object f59989n = new Object();

    /* JADX INFO: renamed from: q */
    private int f59992q = 0;

    /* JADX INFO: renamed from: r */
    private int f59993r = 0;

    /* JADX INFO: renamed from: s */
    private int f59994s = 0;

    /* JADX INFO: renamed from: t */
    private boolean f59995t = false;

    /* JADX INFO: renamed from: u */
    private int f59996u = 0;

    /* JADX INFO: renamed from: v */
    private int f59997v = 0;

    /* JADX INFO: renamed from: w */
    private boolean f59998w = false;

    /* JADX INFO: renamed from: x */
    private TXCloudVideoView f59999x = null;

    /* JADX INFO: renamed from: y */
    private final Object f60000y = new Object();

    /* JADX INFO: renamed from: z */
    private Surface f60001z = null;

    /* JADX INFO: renamed from: A */
    private int f59950A = 0;

    /* JADX INFO: renamed from: B */
    private int f59951B = 0;

    /* JADX INFO: renamed from: C */
    private C14175e f59952C = null;

    /* JADX INFO: renamed from: E */
    private int f59954E = 0;

    /* JADX INFO: renamed from: F */
    private boolean f59955F = false;

    /* JADX INFO: renamed from: G */
    private boolean f59956G = false;

    /* JADX INFO: renamed from: H */
    private long f59957H = 0;

    /* JADX INFO: renamed from: I */
    private long f59958I = 0;

    /* JADX INFO: renamed from: J */
    private int f59959J = 2;

    /* JADX INFO: renamed from: L */
    private boolean f59961L = false;

    /* JADX INFO: renamed from: M */
    private WeakReference<a> f59962M = null;

    /* JADX INFO: renamed from: N */
    private C14178h f59963N = null;

    /* JADX INFO: renamed from: S */
    private boolean f59968S = false;

    /* JADX INFO: renamed from: T */
    private boolean f59969T = false;

    /* JADX INFO: renamed from: U */
    private boolean f59970U = false;

    /* JADX INFO: renamed from: Y */
    private int f59974Y = 0;

    /* JADX INFO: renamed from: Z */
    private int f59975Z = 0;

    /* JADX INFO: renamed from: com.tencent.liteav.d$a */
    public interface a {
        void onBackgroudPushStop();

        void onEncVideo(TXSNALPacket tXSNALPacket);

        void onEncVideoFormat(MediaFormat mediaFormat);
    }

    public C14270d(Context context) {
        this.f59980e = null;
        this.f59983h = null;
        this.f59984i = null;
        this.f59987l = null;
        this.f59990o = null;
        this.f59991p = null;
        this.f59990o = context.getApplicationContext();
        this.f59991p = new C14273g();
        C14263d c14263d = new C14263d(this.f59990o, true);
        this.f59980e = c14263d;
        c14263d.m84468a((InterfaceC14265f) this);
        this.f59980e.m84465a((InterfaceC14170b) this);
        C14273g c14273g = this.f59991p;
        if (c14273g.f60148U) {
            this.f59980e.m84467a(C14263d.d.MODE_SAME_AS_OUTPUT);
        } else {
            boolean z = c14273g.f60147T;
            C14263d c14263d2 = this.f59980e;
            if (z) {
                c14263d2.m84467a(C14263d.d.MODE_SAME_AS_INPUT);
            } else {
                c14263d2.m84467a(C14263d.d.MODE_THRESHOLD);
            }
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = new TXSVideoEncoderParam();
        this.f59983h = tXSVideoEncoderParam;
        tXSVideoEncoderParam.encoderMode = 1;
        this.f59984i = null;
        TXSVideoEncoderParam tXSVideoEncoderParam2 = new TXSVideoEncoderParam();
        this.f59987l = tXSVideoEncoderParam2;
        tXSVideoEncoderParam2.encoderMode = 1;
        this.f59976a = new C14164b(this);
        C14224b c14224b = new C14224b(new C14199g(this.f59990o));
        this.f59971V = c14224b;
        c14224b.setPreprocessor(this.f59980e);
        C14188c.m84036a().m84062a(this.f59990o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84604a(int i, int i2, int i3, Object obj, int i4, boolean z) {
        TXCLog.m84152i("TXCCaptureAndEnc", "New encode size width = " + i + " height = " + i2 + " encType = " + i3 + " eglContext: " + obj);
        m84645x();
        C14488b c14488b = new C14488b(i3);
        TXCStatus.m84177a(getID(), 4005, this.f59954E, Integer.valueOf(i3));
        if (i3 == 1) {
            TXCEventRecorderProxy.m84163a(getID(), 4004, 1L, -1L, "", this.f59954E);
        } else {
            TXCEventRecorderProxy.m84163a(getID(), 4004, 0L, -1L, "", this.f59954E);
        }
        this.f59969T = false;
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
        tXSVideoEncoderParam.encodeType = i3;
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        tXSVideoEncoderParam.fps = i4;
        C14273g c14273g = this.f59991p;
        tXSVideoEncoderParam.gop = c14273g.f60161i;
        tXSVideoEncoderParam.encoderProfile = c14273g.f60166n;
        tXSVideoEncoderParam.glContext = obj != null ? obj : c14488b.m85312a(i, i2);
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59983h;
        tXSVideoEncoderParam2.realTime = z;
        tXSVideoEncoderParam2.streamType = this.f59954E;
        tXSVideoEncoderParam2.annexb = this.f59956G;
        tXSVideoEncoderParam2.bMultiRef = this.f59955F;
        tXSVideoEncoderParam2.baseFrameIndex = this.f59957H + 20;
        tXSVideoEncoderParam2.baseGopIndex = ((this.f59958I + 1) % 255) + 1;
        tXSVideoEncoderParam2.bLimitFps = this.f59982g;
        tXSVideoEncoderParam2.record = this.f59970U;
        tXSVideoEncoderParam2.encFmt = this.f59991p.f60152Y;
        c14488b.m85316a((InterfaceC14490d) this);
        c14488b.m85315a((InterfaceC14170b) this);
        c14488b.m85309a(this.f59983h);
        c14488b.m85323c(this.f59991p.f60155c);
        c14488b.m85325d(this.f59985j);
        c14488b.setID(getID());
        c14488b.m85314a(this.f59974Y);
        this.f59984i = c14488b;
        String id = getID();
        int i5 = this.f59954E;
        TXSVideoEncoderParam tXSVideoEncoderParam3 = this.f59983h;
        TXCStatus.m84177a(id, 4003, i5, Integer.valueOf(tXSVideoEncoderParam3.height | (tXSVideoEncoderParam3.width << 16)));
        TXCStatus.m84177a(getID(), TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, this.f59954E, Integer.valueOf(this.f59983h.gop * 1000));
        String id2 = getID();
        TXSVideoEncoderParam tXSVideoEncoderParam4 = this.f59983h;
        TXCEventRecorderProxy.m84163a(id2, 4003, tXSVideoEncoderParam4.width, tXSVideoEncoderParam4.height, "", this.f59954E);
        TXCKeyPointReportProxy.m84167a(TantanException.Client.AccountService.INVALID_THIRD_PARTY_INFO, this.f59983h.encodeType, this.f59954E);
        TXSVideoEncoderParam tXSVideoEncoderParam5 = this.f59983h;
        TXCKeyPointReportProxy.m84167a(TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, tXSVideoEncoderParam5.height | (tXSVideoEncoderParam5.width << 16), this.f59954E);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003b  */
    /* JADX INFO: renamed from: b */
    private void m84617b(int i, int i2, Object obj) {
        C14270d c14270d;
        Object obj2;
        C14273g c14273g = this.f59991p;
        int i3 = c14273g.f60162j;
        int i4 = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                i4 = 1;
            } else if (i3 == 2) {
                i4 = 3;
            }
        }
        int i5 = (this.f59992q == 1 && this.f59993r == 0) ? 1 : i4;
        int i6 = c14273g.f60161i;
        if (this.f59984i == null || this.f59969T) {
            c14270d = this;
            obj2 = obj;
            c14270d.m84604a(i, i2, i5, obj2, c14273g.f60160h, c14273g.f60143P);
        } else {
            TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
            if (tXSVideoEncoderParam.width == i && tXSVideoEncoderParam.height == i2 && tXSVideoEncoderParam.encodeType == i5 && tXSVideoEncoderParam.gop == i6) {
                c14270d = this;
                obj2 = obj;
            } else {
                c14270d = this;
                obj2 = obj;
                c14270d.m84604a(i, i2, i5, obj2, c14273g.f60160h, c14273g.f60143P);
            }
        }
        if ((c14270d.f59988m == null || c14270d.f59987l.encodeType != i5) && c14270d.f59986k) {
            c14270d.m84612a(obj2, i5, c14270d.f59991p.f60143P);
        }
    }

    /* JADX INFO: renamed from: c */
    private int m84618c(C14205b c14205b) {
        if (this.f59961L) {
            return c14205b.f59310a;
        }
        int iMo83981b = c14205b.f59310a;
        if ((this.f59975Z == 1) != c14205b.f59318i) {
            if (this.f59964O == null) {
                C14178h c14178h = new C14178h();
                c14178h.mo83979a();
                c14178h.m83976a(true);
                c14178h.mo83969a(c14205b.f59314e, c14205b.f59315f);
                if (c14205b.f59314e > c14205b.f59315f) {
                    c14178h.m83993h();
                } else {
                    c14178h.m83992g();
                }
                this.f59964O = c14178h;
            }
            C14178h c14178h2 = this.f59964O;
            if (c14178h2 != null) {
                c14178h2.mo83969a(c14205b.f59314e, c14205b.f59315f);
                iMo83981b = c14178h2.mo83981b(c14205b.f59310a);
            }
        }
        if (this.f59996u != 0) {
            if (this.f59965P == null) {
                C14178h c14178h3 = new C14178h();
                c14178h3.mo83979a();
                c14178h3.m83976a(true);
                c14178h3.mo83969a(c14205b.f59314e, c14205b.f59315f);
                this.f59965P = c14178h3;
            }
            C14178h c14178h4 = this.f59965P;
            if (c14178h4 != null) {
                GLES20.glViewport(0, 0, c14205b.f59314e, c14205b.f59315f);
                int i = c14205b.f59314e;
                int i2 = c14205b.f59315f;
                float[] fArrM83980a = c14178h4.m83980a(i, i2, null, C14215f.m84217a(i, i2, i, i2), 0);
                int i3 = (720 - this.f59996u) % 360;
                c14178h4.m83970a(i, i2, i3, fArrM83980a, ((i3 == 90 || i3 == 270) ? c14205b.f59315f : c14205b.f59314e) / ((i3 == 90 || i3 == 270) ? c14205b.f59314e : c14205b.f59315f), false, false);
                c14178h4.mo83981b(iMo83981b);
                return c14178h4.m83997l();
            }
        }
        return iMo83981b;
    }

    /* JADX INFO: renamed from: d */
    private void m84624d(C14205b c14205b) {
        TXCloudVideoView tXCloudVideoView;
        TXCGLSurfaceView gLSurfaceView;
        final WeakReference<InterfaceC14318o> weakReference = this.f59960K;
        if (weakReference == null) {
            return;
        }
        int iM84618c = m84618c(c14205b);
        int i = this.f59959J;
        if (i == 2) {
            InterfaceC14318o interfaceC14318o = weakReference.get();
            if (interfaceC14318o != null) {
                TXSVideoFrame tXSVideoFrame = new TXSVideoFrame();
                tXSVideoFrame.width = c14205b.f59314e;
                tXSVideoFrame.height = c14205b.f59315f;
                tXSVideoFrame.textureId = iM84618c;
                tXSVideoFrame.eglContext = this.f59980e.m84458a();
                tXSVideoFrame.pts = TXCTimeUtil.generatePtsMS();
                interfaceC14318o.onRenderVideoFrame(getID(), this.f59954E, tXSVideoFrame);
                if (this.f59961L) {
                    c14205b.f59310a = tXSVideoFrame.textureId;
                }
            }
        } else if (i == 1 || i == 4) {
            if (this.f59963N == null) {
                C14251p c14251p = i == 1 ? new C14251p(1) : new C14251p(3);
                c14251p.m83976a(true);
                if (c14251p.mo83979a()) {
                    c14251p.mo83969a(c14205b.f59314e, c14205b.f59315f);
                    c14251p.m83974a(new C14178h.a() { // from class: com.tencent.liteav.d.16
                        @Override // com.tencent.liteav.basic.p093c.C14178h.a
                        /* JADX INFO: renamed from: a */
                        public void mo83825a(int i2) {
                            C14178h c14178h = C14270d.this.f59963N;
                            InterfaceC14318o interfaceC14318o2 = (InterfaceC14318o) weakReference.get();
                            if (c14178h == null || interfaceC14318o2 == null) {
                                return;
                            }
                            TXSVideoFrame tXSVideoFrame2 = new TXSVideoFrame();
                            tXSVideoFrame2.width = c14178h.m83999n();
                            tXSVideoFrame2.height = c14178h.m84000o();
                            tXSVideoFrame2.pts = TXCTimeUtil.generatePtsMS();
                            interfaceC14318o2.onRenderVideoFrame(C14270d.this.getID(), C14270d.this.f59954E, tXSVideoFrame2);
                            C14270d.this.f59967R = tXSVideoFrame2.data;
                        }
                    });
                    this.f59963N = c14251p;
                } else {
                    TXCLog.m84152i("TXCCaptureAndEnc", "init filter error ");
                    this.f59963N = null;
                }
            }
            C14178h c14178h = this.f59963N;
            if (c14178h != null) {
                GLES20.glViewport(0, 0, c14205b.f59314e, c14205b.f59315f);
                c14178h.mo83969a(c14205b.f59314e, c14205b.f59315f);
                c14178h.mo83981b(iM84618c);
            }
            if (this.f59961L && this.f59967R != null) {
                int i2 = this.f59959J;
                int i3 = (i2 == 1 || i2 != 4) ? 1 : 3;
                if (this.f59966Q == null) {
                    C14246k c14246k = new C14246k(i3);
                    c14246k.m83976a(true);
                    if (!c14246k.mo83979a()) {
                        TXCLog.m84156w("TXCCaptureAndEnc", " init i420ToRGBA filter failed");
                    }
                    c14246k.mo83969a(c14205b.f59314e, c14205b.f59315f);
                    this.f59966Q = c14246k;
                }
                C14246k c14246k2 = this.f59966Q;
                if (c14246k2 != null) {
                    GLES20.glViewport(0, 0, c14205b.f59314e, c14205b.f59315f);
                    c14246k2.mo83969a(c14205b.f59314e, c14205b.f59315f);
                    c14246k2.m84320a(this.f59967R);
                    c14205b.f59310a = c14246k2.m84321q();
                }
                this.f59967R = null;
            }
        }
        if (!this.f59961L || (tXCloudVideoView = this.f59999x) == null || (gLSurfaceView = tXCloudVideoView.getGLSurfaceView()) == null) {
            return;
        }
        gLSurfaceView.m84981d();
    }

    /* JADX INFO: renamed from: e */
    private void m84626e(int i, int i2) {
        if (this.f59998w) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", 2003);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, "Renders the first video frame");
        bundle.putInt("EVT_PARAM1", i);
        bundle.putInt("EVT_PARAM2", i2);
        C14215f.m84218a(this.f59972W, 2003, bundle);
        TXCLog.m84152i("TXCCaptureAndEnc", "trtc_render render first frame " + getID() + ", " + this.f59954E);
        this.f59998w = true;
    }

    /* JADX INFO: renamed from: i */
    private void m84631i(final boolean z) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.7
            @Override // java.lang.Runnable
            public void run() {
                if (C14270d.this.f59980e != null) {
                    C14270d.this.f59980e.m84475b();
                }
            }
        });
        m84701r();
        this.f59979d.mo84526a(z);
        this.f59979d = null;
        TXCLog.m84152i("TXCCaptureAndEnc", "stopped CaptureSource");
        final TXCloudVideoView tXCloudVideoView = this.f59999x;
        this.f59978c.post(new Runnable() { // from class: com.tencent.liteav.d.8
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.stop(z);
                }
            }
        });
        this.f59999x = null;
        synchronized (this.f60000y) {
            try {
                this.f60001z = null;
                C14175e c14175e = this.f59952C;
                if (c14175e != null) {
                    c14175e.m83926a();
                    this.f59952C = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f59976a.m83893a()) {
            this.f59976a.m83894b();
        }
        if (this.f59995t) {
            m84642u();
        }
    }

    /* JADX INFO: renamed from: u */
    private void m84642u() {
        TXCLog.m84152i("TXCCaptureAndEnc", " startBlackStream");
        if (this.f59977b == null) {
            this.f59977b = new C14164b(this);
        }
        this.f59977b.m83892a(10, -1, null, 64, 64);
    }

    /* JADX INFO: renamed from: v */
    private void m84643v() {
        TXCLog.m84152i("TXCCaptureAndEnc", " stopBlackStream when enableBlackStream " + this.f59995t);
        C14164b c14164b = this.f59977b;
        if (c14164b != null) {
            c14164b.m83894b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m84644w() {
        try {
            C14488b c14488b = this.f59988m;
            this.f59988m = null;
            if (c14488b != null) {
                c14488b.m85313a();
                c14488b.m85316a((InterfaceC14490d) null);
            }
        } catch (Exception e) {
            TXCLog.m84150e("TXCCaptureAndEnc", "stop video encoder failed.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m84645x() {
        try {
            TXCLog.m84152i("TXCCaptureAndEnc", "stopBigVideoEncoderInGLThread");
            C14488b c14488b = this.f59984i;
            this.f59984i = null;
            if (c14488b != null) {
                c14488b.m85313a();
                c14488b.m85316a((InterfaceC14490d) null);
            }
            this.f59969T = true;
        } catch (Exception e) {
            TXCLog.m84150e("TXCCaptureAndEnc", "stopBigVideoEncoder failed.", e);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m84646y() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.15
                @Override // java.lang.Runnable
                public void run() {
                    C14270d c14270d = C14270d.this;
                    c14270d.m84621c(c14270d.f59983h.width, C14270d.this.f59983h.height);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    private void m84647z() {
        C14263d c14263d = this.f59980e;
        if (c14263d != null) {
            C14273g c14273g = this.f59991p;
            if (c14273g.f60148U) {
                c14263d.m84467a(C14263d.d.MODE_SAME_AS_OUTPUT);
            } else if (c14273g.f60147T) {
                c14263d.m84467a(C14263d.d.MODE_SAME_AS_INPUT);
            } else {
                c14263d.m84467a(C14263d.d.MODE_THRESHOLD);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m84680f() {
        if (this.f59994s != 1) {
            TXCLog.m84156w("TXCCaptureAndEnc", "ignore pause push when is not pushing, status:" + this.f59994s);
            return;
        }
        this.f59994s = 2;
        TXCLog.m84152i("TXCCaptureAndEnc", "pausePusher");
        if ((this.f59991p.f60131D & 1) == 1) {
            m84701r();
            C14164b c14164b = this.f59976a;
            if (c14164b != null) {
                C14273g c14273g = this.f59991p;
                if (!c14273g.f60140M) {
                    int i = c14273g.f60130C;
                    int i2 = c14273g.f60129B;
                    Bitmap bitmap = c14273g.f60128A;
                    TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
                    c14164b.m83892a(i, i2, bitmap, tXSVideoEncoderParam.width, tXSVideoEncoderParam.height);
                }
            }
            InterfaceC14277k interfaceC14277k = this.f59979d;
            if (interfaceC14277k != null) {
                interfaceC14277k.mo84533c();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m84683g() {
        if (this.f59994s != 2) {
            TXCLog.m84156w("TXCCaptureAndEnc", "ignore resume push when is not pause, status:" + this.f59994s);
            return;
        }
        this.f59994s = 1;
        TXCLog.m84152i("TXCCaptureAndEnc", "resumePusher");
        C14273g c14273g = this.f59991p;
        if ((c14273g.f60131D & 1) == 1) {
            C14164b c14164b = this.f59976a;
            if (c14164b != null && !c14273g.f60140M) {
                c14164b.m83894b();
            }
            m84701r();
            InterfaceC14277k interfaceC14277k = this.f59979d;
            if (interfaceC14277k != null) {
                interfaceC14277k.mo84529b();
            }
            m84646y();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m84688h(int i) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return false;
        }
        return interfaceC14277k.mo84528a(i);
    }

    /* JADX INFO: renamed from: j */
    public void m84692j(int i) {
        C14488b c14488b;
        if (i == 2) {
            c14488b = this.f59984i;
        } else {
            c14488b = i == 3 ? this.f59988m : null;
        }
        if (c14488b != null) {
            c14488b.m85319b();
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: k */
    public void mo83841k(int i) {
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
        int i2 = tXSVideoEncoderParam.width;
        int i3 = tXSVideoEncoderParam.height;
        if (i2 * i3 < 518400) {
            this.f59991p.f60162j = 0;
        } else if (i2 * i3 < 921600 && this.f59981f) {
            this.f59991p.f60162j = 0;
        }
        if (i == 3) {
            m84703t();
        } else {
            this.f59981f = true;
            m84702s();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m84694l() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            return interfaceC14277k.mo84546h();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m84695m(final int i) {
        if (i < 1) {
            i = 1;
        }
        if (i > 2) {
            i = 2;
        }
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.17
            @Override // java.lang.Runnable
            public void run() {
                if (C14270d.this.f59983h.encoderMode == i) {
                    return;
                }
                C14270d.this.f59983h.encoderMode = i;
                C14270d.this.f59987l.encoderMode = i;
                C14270d.this.m84645x();
                C14270d.this.m84644w();
            }
        };
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            runnable.run();
        } else {
            interfaceC14277k.mo84524a(runnable);
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m84697n() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            return interfaceC14277k.mo84548j();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public boolean m84698o() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            return interfaceC14277k.mo84549k();
        }
        return false;
    }

    @Override // com.tencent.liteav.basic.p092b.InterfaceC14170b
    public void onNotifyEvent(int i, Bundle bundle) {
        if (bundle != null) {
            bundle.putString("EVT_USERID", getID());
        }
        C14215f.m84218a(this.f59972W, i, bundle);
        if (i == -1317) {
            TXCEventRecorderProxy.m84163a(getID(), 2002, 4L, -1L, "", this.f59954E);
        } else if (i == -1314) {
            TXCEventRecorderProxy.m84163a(getID(), 2002, 5L, -1L, "", this.f59954E);
        } else if (i == 1003) {
            if (this.f59979d != null) {
                TXCEventRecorderProxy.m84163a(getID(), 4001, this.f59979d.mo84550l() ? 0L : 1L, -1L, "", this.f59954E);
            }
        } else if (i == -1308) {
            m84693k();
        }
        if (i == -1302 || i == -1317 || i == -1318 || i == -1319) {
            TXCKeyPointReportProxy.m84172b(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, i);
            return;
        }
        if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
            TXCKeyPointReportProxy.m84172b(30003, i);
            if (this.f59979d != null) {
                TXCEventRecorderProxy.m84163a(getID(), 4002, this.f59979d.mo84550l() ? 0L : 1L, i, "", this.f59954E);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m84699p() {
        try {
            C14263d c14263d = this.f59980e;
            if (c14263d != null) {
                c14263d.m84475b();
            }
            C14178h c14178h = this.f59963N;
            if (c14178h != null) {
                c14178h.mo83989d();
                this.f59963N = null;
            }
            C14178h c14178h2 = this.f59965P;
            if (c14178h2 != null) {
                c14178h2.mo83989d();
                this.f59965P = null;
            }
            C14178h c14178h3 = this.f59964O;
            if (c14178h3 != null) {
                c14178h3.mo83989d();
                this.f59964O = null;
            }
            m84645x();
            m84644w();
        } catch (Exception e) {
            TXCLog.m84150e("TXCCaptureAndEnc", "stop preprocessor and encoder failed.", e);
        }
    }

    @Override // com.tencent.liteav.InterfaceC14278l
    /* JADX INFO: renamed from: q */
    public void mo84700q() {
        InterfaceC14279m interfaceC14279m;
        TXCLog.m84152i("TXCCaptureAndEnc", "onCaptureDestroy->enter ");
        C14263d c14263d = this.f59980e;
        if (c14263d != null) {
            c14263d.m84475b();
        }
        C14178h c14178h = this.f59963N;
        if (c14178h != null) {
            c14178h.mo83989d();
            this.f59963N = null;
        }
        C14178h c14178h2 = this.f59965P;
        if (c14178h2 != null) {
            c14178h2.mo83989d();
            this.f59965P = null;
        }
        C14178h c14178h3 = this.f59964O;
        if (c14178h3 != null) {
            c14178h3.mo83989d();
            this.f59964O = null;
        }
        C14246k c14246k = this.f59966Q;
        if (c14246k != null) {
            c14246k.mo83989d();
            this.f59966Q = null;
        }
        m84645x();
        m84644w();
        WeakReference<InterfaceC14279m> weakReference = this.f59973X;
        if (weakReference == null || (interfaceC14279m = weakReference.get()) == null) {
            return;
        }
        interfaceC14279m.m84804a();
    }

    /* JADX INFO: renamed from: r */
    public void m84701r() {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.10
            @Override // java.lang.Runnable
            public void run() {
                C14270d.this.m84645x();
                C14270d.this.m84644w();
            }
        };
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(runnable);
            return;
        }
        synchronized (this.f59989n) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m84702s() {
        if (this.f59984i == null) {
            return;
        }
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.11
                @Override // java.lang.Runnable
                public void run() {
                    C14270d.this.m84645x();
                }
            });
        } else {
            m84645x();
        }
    }

    @Override // com.tencent.liteav.basic.module.C14203a
    public void setID(String str) {
        super.setID(str);
        C14488b c14488b = this.f59984i;
        if (c14488b != null) {
            c14488b.setID(str);
        }
        C14488b c14488b2 = this.f59988m;
        if (c14488b2 != null) {
            c14488b2.setID(str);
        }
        C14263d c14263d = this.f59980e;
        if (c14263d != null) {
            c14263d.setID(str);
        }
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84525a(getID());
        }
        TXCLog.m84156w("TXCCaptureAndEnc", "setID:" + str);
    }

    /* JADX INFO: renamed from: t */
    public void m84703t() {
        if (this.f59988m == null) {
            return;
        }
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.13
                @Override // java.lang.Runnable
                public void run() {
                    C14270d.this.m84644w();
                }
            });
        } else {
            m84644w();
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m84687h() {
        return this.f59995t;
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: l */
    public void mo83842l(int i) {
    }

    /* JADX INFO: renamed from: h */
    public void m84686h(boolean z) {
        this.f59956G = z;
    }

    /* JADX INFO: renamed from: j */
    public void m84691j() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.21
            @Override // java.lang.Runnable
            public void run() {
                if (C14270d.this.f59979d != null) {
                    C14270d.this.f59979d.mo84532b(true);
                }
                C14270d c14270d = C14270d.this;
                c14270d.m84621c(c14270d.f59983h.width, C14270d.this.f59983h.height);
                C14270d c14270d2 = C14270d.this;
                c14270d2.m84652a(c14270d2.f59974Y);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private void m84633j(final boolean z) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.14
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC14277k interfaceC14277k2 = C14270d.this.f59979d;
                    if (interfaceC14277k2 == null) {
                        return;
                    }
                    interfaceC14277k2.mo84543f(C14270d.this.f59991p.f60160h);
                    interfaceC14277k2.mo84540e(C14270d.this.f59991p.f60164l);
                    interfaceC14277k2.mo84520a(C14270d.this.f59991p.f60163k);
                    interfaceC14277k2.mo84531b(C14270d.this.f59991p.f60153a, C14270d.this.f59991p.f60154b);
                    interfaceC14277k2.mo84541e(C14270d.this.f59991p.f60148U);
                    if (z && interfaceC14277k2.mo84537d()) {
                        interfaceC14277k2.mo84532b(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m84696m() {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            return interfaceC14277k.mo84547i();
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public void m84693k() {
        if (this.f59979d == null) {
            return;
        }
        this.f59971V.m84270a(true);
        m84631i(true);
    }

    /* JADX INFO: renamed from: g */
    public void m84684g(int i) {
        if (this.f59996u != i) {
            TXCLog.m84152i("TXCCaptureAndEnc", "vrotation setRenderRotation " + i);
        }
        this.f59996u = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84530b(i);
    }

    /* JADX INFO: renamed from: g */
    public void m84685g(boolean z) {
        this.f59982g = z;
    }

    /* JADX INFO: renamed from: f */
    public void m84681f(int i) {
        TXCLog.m84152i("TXCCaptureAndEnc", "setRenderMode " + i);
        this.f59997v = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84534c(i);
        }
        C14175e c14175e = this.f59952C;
        if (c14175e != null) {
            c14175e.m83927a(this.f59997v);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m84682f(boolean z) {
        if (this.f59955F == z) {
            return;
        }
        this.f59955F = z;
        TXCLog.m84152i("TXCCaptureAndEnc", "trtc_api onVideoConfigChanged enableRps " + this.f59955F);
        if (this.f59955F) {
            this.f59991p.f60162j = 0;
        }
        m84701r();
    }

    /* JADX INFO: renamed from: i */
    public boolean m84690i() {
        return this.f59994s != 0;
    }

    /* JADX INFO: renamed from: i */
    public void m84689i(int i) {
        this.f59954E = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84545g(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public TXBeautyManager m84666b() {
        return this.f59971V;
    }

    /* JADX INFO: renamed from: e */
    public void m84677e() {
        if (!m84690i()) {
            TXCLog.m84156w("TXCCaptureAndEnc", "ignore stopPush when not pushing, status:" + this.f59994s);
            return;
        }
        TXCLog.m84152i("TXCCaptureAndEnc", "stop");
        this.f59994s = 0;
        m84701r();
        this.f59991p.f60143P = false;
        C14164b c14164b = this.f59976a;
        if (c14164b != null) {
            c14164b.m83894b();
        }
        m84670b(false);
        this.f59953D = null;
    }

    /* JADX INFO: renamed from: b */
    public void m84667b(int i) {
        TXCLog.m84152i("TXCCaptureAndEnc", "setLocalViewMirror " + i);
        this.f59975Z = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84536d(i);
        }
        C14175e c14175e = this.f59952C;
        if (c14175e != null) {
            c14175e.m83933b(this.f59975Z);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84670b(boolean z) {
        TXCLog.m84152i("TXCCaptureAndEnc", "enableBlackStream " + z);
        this.f59995t = z;
        if (z) {
            if (this.f59979d == null) {
                m84642u();
                return;
            }
            return;
        }
        m84643v();
    }

    /* JADX INFO: renamed from: e */
    public void m84678e(int i) {
        C14273g c14273g = this.f59991p;
        if (c14273g.f60160h == i) {
            return;
        }
        c14273g.f60160h = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null || interfaceC14277k.mo84544g() >= i) {
            return;
        }
        int i2 = this.f59992q;
        if (i2 == 0) {
            m84633j(true);
            m84701r();
        } else {
            if (i2 != 1) {
                return;
            }
            this.f59979d.mo84543f(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84668b(int i, int i2) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84519a(i, i2);
    }

    @Override // com.tencent.liteav.InterfaceC14278l
    /* JADX INFO: renamed from: b */
    public void mo84669b(C14205b c14205b) throws Throwable {
        if (!this.f59968S) {
            this.f59968S = true;
            TXCKeyPointReportProxy.m84172b(30003, 0);
        }
        if (this.f59994s == 2) {
            return;
        }
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (this.f59980e == null || this.f59991p.f60140M || interfaceC14277k == null) {
            return;
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
        int i = tXSVideoEncoderParam.height;
        int i2 = c14205b.f59317h;
        if (i != i2 || tXSVideoEncoderParam.width != c14205b.f59316g) {
            m84623d(c14205b.f59316g, i2);
        }
        this.f59980e.m84469a(interfaceC14277k.mo84542f());
        this.f59980e.m84460a(this.f59991p.f60164l);
        this.f59980e.m84456a(c14205b, c14205b.f59311b, 0, 0L);
    }

    /* JADX INFO: renamed from: e */
    public boolean m84679e(boolean z) {
        this.f59991p.f60146S = z;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return false;
        }
        interfaceC14277k.mo84535c(z);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public C14273g m84671c() {
        return this.f59991p;
    }

    /* JADX INFO: renamed from: c */
    public void m84672c(final int i) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.19
            @Override // java.lang.Runnable
            public void run() {
                if (C14270d.this.f59984i != null) {
                    C14270d.this.f59984i.m85325d(i);
                }
                C14270d.this.f59985j = i;
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public void m84673c(boolean z) {
        m84631i(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m84621c(int i, int i2) {
        C14273g c14273g = this.f59991p;
        float f = c14273g.f60137J;
        C14263d c14263d = this.f59980e;
        if (f != -1.0f) {
            if (c14263d != null) {
                c14263d.m84464a(c14273g.f60132E, c14273g.f60135H, c14273g.f60136I, f);
            }
        } else {
            if (c14263d == null || i == 0 || i2 == 0) {
                return;
            }
            Bitmap bitmap = c14273g.f60132E;
            float f2 = i;
            c14263d.m84464a(bitmap, c14273g.f60133F / f2, c14273g.f60134G / i2, bitmap == null ? 0.0f : bitmap.getWidth() / f2);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m84674d() {
        if (m84690i()) {
            TXCLog.m84156w("TXCCaptureAndEnc", "ignore startPush when pushing, status:" + this.f59994s);
            return -2;
        }
        TXCDRApi.initCrashReport(this.f59990o);
        this.f59994s = 1;
        TXCLog.m84152i("TXCCaptureAndEnc", "startWithoutAudio");
        m84647z();
        TXCDRApi.txReportDAU(this.f59990o, C14189a.f59224bu);
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public void m84675d(final int i) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return;
        }
        interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.20
            @Override // java.lang.Runnable
            public void run() {
                if (C14270d.this.f59984i != null) {
                    C14270d.this.f59984i.m85327e(i);
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public boolean m84676d(boolean z) {
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k == null) {
            return false;
        }
        return interfaceC14277k.mo84538d(z);
    }

    /* JADX INFO: renamed from: d */
    private void m84623d(int i, int i2) {
        m84621c(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public void m84660a(a aVar) {
        this.f59962M = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m84662a(InterfaceC14318o interfaceC14318o, int i) {
        this.f59959J = i;
        if (interfaceC14318o != null) {
            this.f59960K = new WeakReference<>(interfaceC14318o);
        } else {
            this.f59960K = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84665a(boolean z) {
        this.f59961L = z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX INFO: renamed from: a */
    public void m84661a(C14273g c14273g) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c14273g != null) {
            C14273g c14273g2 = this.f59991p;
            if (c14273g2.f60132E == c14273g.f60132E && c14273g2.f60133F == c14273g.f60133F && c14273g2.f60134G == c14273g.f60134G && c14273g2.f60137J == c14273g.f60137J && c14273g2.f60135H == c14273g.f60135H && c14273g2.f60136I == c14273g.f60136I) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (c14273g != null) {
            C14273g c14273g3 = this.f59991p;
            if (c14273g3.f60153a == c14273g.f60153a && c14273g3.f60154b == c14273g.f60154b) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (c14273g != null) {
            try {
                this.f59991p = (C14273g) c14273g.clone();
            } catch (CloneNotSupportedException e) {
                this.f59991p = new C14273g();
                e.printStackTrace();
            }
        } else {
            this.f59991p = new C14273g();
        }
        TXCLog.m84152i("TXCCaptureAndEnc", String.format("vsize setConfig w*h:%d*%d orientation:%d", Integer.valueOf(this.f59991p.f60153a), Integer.valueOf(this.f59991p.f60154b), Integer.valueOf(this.f59991p.f60164l)));
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84540e(this.f59991p.f60164l);
        }
        m84647z();
        if (z2 && !this.f59991p.f60147T) {
            z3 = true;
        }
        m84633j(z3);
        if (m84690i() && z) {
            m84646y();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84658a(InterfaceC14170b interfaceC14170b) {
        this.f59972W = new WeakReference<>(interfaceC14170b);
    }

    /* JADX INFO: renamed from: a */
    public void m84652a(final int i) {
        TXCLog.m84152i("TXCCaptureAndEnc", "vrotation setVideoEncRotation " + i);
        this.f59974Y = i;
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C14270d.this.f59984i != null) {
                        C14270d.this.f59984i.m85314a(i);
                    }
                    if (C14270d.this.f59988m != null) {
                        C14270d.this.f59988m.m85314a(i);
                    }
                }
            });
            return;
        }
        C14488b c14488b = this.f59984i;
        if (c14488b != null) {
            c14488b.m85314a(i);
        }
        C14488b c14488b2 = this.f59988m;
        if (c14488b2 != null) {
            c14488b2.m85314a(i);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84654a(int i, final int i2, final int i3, final int i4, final int i5, int i6, int i7) {
        InterfaceC14277k interfaceC14277k;
        C14270d c14270d;
        int i8;
        if (i == 2) {
            TXSVideoEncoderParam tXSVideoEncoderParam = this.f59983h;
            int i9 = tXSVideoEncoderParam.width;
            if (i9 != 0 && (i8 = tXSVideoEncoderParam.height) != 0 && (i2 != i9 || i3 != i8 || i4 > tXSVideoEncoderParam.fps)) {
                InterfaceC14277k interfaceC14277k2 = this.f59979d;
                if (interfaceC14277k2 != null) {
                    c14270d = this;
                    interfaceC14277k2.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.12
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i2 == C14270d.this.f59983h.width && i3 == C14270d.this.f59983h.height && i4 <= C14270d.this.f59983h.fps) {
                                return;
                            }
                            int i10 = i2;
                            int i11 = i3;
                            if (i10 > i11) {
                                C14270d.this.f59991p.f60164l = 0;
                            } else if (i10 < i11) {
                                C14270d.this.f59991p.f60164l = 1;
                            }
                            C14273g c14273g = C14270d.this.f59991p;
                            int i12 = i2;
                            int i13 = i3;
                            if (i12 > i13) {
                                i12 = i13;
                            }
                            c14273g.f60153a = i12;
                            C14273g c14273g2 = C14270d.this.f59991p;
                            int i14 = i2;
                            int i15 = i3;
                            if (i14 <= i15) {
                                i14 = i15;
                            }
                            c14273g2.f60154b = i14;
                            InterfaceC14277k interfaceC14277k3 = C14270d.this.f59979d;
                            if (interfaceC14277k3 != null) {
                                interfaceC14277k3.mo84520a(EnumC14168c.RESOLUTION_TYPE_INVALID);
                                interfaceC14277k3.mo84531b(C14270d.this.f59991p.f60153a, C14270d.this.f59991p.f60154b);
                                interfaceC14277k3.mo84540e(C14270d.this.f59991p.f60164l);
                            }
                            C14270d.this.f59991p.f60155c = i5;
                            C14270d.this.f59991p.f60160h = i4;
                            C14270d.this.m84645x();
                            TXCLog.m84149e("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(C14270d.this.f59983h.width), Integer.valueOf(C14270d.this.f59983h.height), Integer.valueOf(C14270d.this.f59983h.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                        }
                    });
                } else {
                    c14270d = this;
                }
            } else {
                c14270d = this;
                C14488b c14488b = c14270d.f59984i;
                if (c14488b != null) {
                    c14488b.m85321b(i5, i6);
                    c14488b.m85320b(i4);
                }
            }
            c14270d.m84675d(i7);
            return;
        }
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59987l;
        if (tXSVideoEncoderParam2 != null && ((i2 != tXSVideoEncoderParam2.width || i3 != tXSVideoEncoderParam2.height) && (interfaceC14277k = this.f59979d) != null)) {
            interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.18
                @Override // java.lang.Runnable
                public void run() {
                    TXCLog.m84156w("TXCCaptureAndEnc", String.format("QOS restart big encoder old resolution %dx%d fps %d, new resolution %dx%d fps %d", Integer.valueOf(C14270d.this.f59987l.width), Integer.valueOf(C14270d.this.f59987l.height), Integer.valueOf(C14270d.this.f59987l.fps), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                    C14270d.this.f59987l.width = i2;
                    C14270d.this.f59987l.height = i3;
                    C14270d.this.m84644w();
                }
            });
        }
        C14488b c14488b2 = this.f59988m;
        if (c14488b2 != null) {
            c14488b2.m85321b(i5, i6);
            c14488b2.m85320b(i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84664a(final TXCloudVideoView tXCloudVideoView) {
        InterfaceC14183m interfaceC14183m;
        if (this.f59991p.f60140M) {
            TXCLog.m84149e("TXCCaptureAndEnc", "enable pure audio push , so can not start preview!");
            return;
        }
        C14164b c14164b = this.f59976a;
        if (c14164b != null) {
            c14164b.m83894b();
        }
        this.f59998w = false;
        boolean z = this.f59991p.f60150W;
        if (tXCloudVideoView != null) {
            final TXCGLSurfaceView[] tXCGLSurfaceViewArr = new TXCGLSurfaceView[1];
            m84613a(new Runnable() { // from class: com.tencent.liteav.d.22
                @Override // java.lang.Runnable
                public void run() {
                    tXCGLSurfaceViewArr[0] = new TXCGLSurfaceView(tXCloudVideoView.getContext());
                    tXCloudVideoView.addVideoView(tXCGLSurfaceViewArr[0]);
                }
            });
            TXCGLSurfaceView tXCGLSurfaceView = tXCGLSurfaceViewArr[0];
            tXCGLSurfaceView.setNotifyListener(this);
            TXCLog.m84152i("TXCCaptureAndEnc", "start camera preview with GLSurfaceView");
            interfaceC14183m = tXCGLSurfaceView;
        } else {
            C14176f c14176f = new C14176f();
            TXCLog.m84152i("TXCCaptureAndEnc", "start camera preview with SurfaceTexture");
            z = false;
            interfaceC14183m = c14176f;
        }
        this.f59992q = 0;
        this.f59979d = new C14266c(this.f59990o, this.f59991p, interfaceC14183m, z);
        m84643v();
        m84689i(this.f59954E);
        this.f59979d.mo84525a(getID());
        this.f59979d.mo84523a((InterfaceC14278l) this);
        this.f59979d.mo84521a((InterfaceC14170b) this);
        this.f59979d.mo84517a();
        this.f59979d.mo84530b(this.f59996u);
        this.f59979d.mo84534c(this.f59997v);
        this.f59979d.mo84536d(this.f59975Z);
        this.f59999x = tXCloudVideoView;
        this.f59978c.post(new Runnable() { // from class: com.tencent.liteav.d.2
            @Override // java.lang.Runnable
            public void run() {
                TXCloudVideoView tXCloudVideoView2 = tXCloudVideoView;
                if (tXCloudVideoView2 != null) {
                    tXCloudVideoView2.start(C14270d.this.f59991p.f60138K, C14270d.this.f59991p.f60139L, C14270d.this.f59979d);
                }
            }
        });
        this.f59998w = false;
        TXCKeyPointReportProxy.m84165a(30003);
    }

    /* JADX INFO: renamed from: a */
    public int m84650a(boolean z, int i, int i2, int i3, int i4, int i5) {
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59987l;
        boolean z2 = (tXSVideoEncoderParam.width == i && tXSVideoEncoderParam.height == i2) ? false : true;
        tXSVideoEncoderParam.width = i;
        tXSVideoEncoderParam.height = i2;
        tXSVideoEncoderParam.fps = i3;
        tXSVideoEncoderParam.gop = i5;
        tXSVideoEncoderParam.encoderProfile = 1;
        tXSVideoEncoderParam.realTime = this.f59991p.f60143P;
        tXSVideoEncoderParam.streamType = 3;
        tXSVideoEncoderParam.bitrate = i4;
        tXSVideoEncoderParam.annexb = true;
        tXSVideoEncoderParam.bMultiRef = false;
        if (this.f59988m != null && (z2 || (this.f59986k && !z))) {
            InterfaceC14277k interfaceC14277k = this.f59979d;
            if (interfaceC14277k != null) {
                interfaceC14277k.mo84524a(new Runnable() { // from class: com.tencent.liteav.d.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C14270d.this.m84644w();
                    }
                });
            } else {
                m84644w();
            }
        }
        this.f59986k = z;
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m84657a(Surface surface) {
        if (this.f59999x != null) {
            TXCLog.m84156w("TXCCaptureAndEnc", "camera preview view is not null, can't set surface");
            return;
        }
        synchronized (this.f60000y) {
            try {
                if (this.f60001z == surface) {
                    TXCLog.m84152i("TXCCaptureAndEnc", "surface-render: set surface the same" + surface);
                } else {
                    TXCLog.m84152i("TXCCaptureAndEnc", "surface-render: set surface " + surface);
                    this.f60001z = surface;
                    C14175e c14175e = this.f59952C;
                    if (c14175e != null) {
                        c14175e.m83926a();
                        this.f59952C = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84653a(final int i, final int i2) {
        synchronized (this.f60000y) {
            try {
                C14175e c14175e = this.f59952C;
                if (c14175e != null) {
                    c14175e.m83931a(new Runnable() { // from class: com.tencent.liteav.d.4
                        @Override // java.lang.Runnable
                        public void run() {
                            C14270d.this.f59950A = i;
                            C14270d.this.f59951B = i2;
                            if (C14270d.this.f59953D == null || C14270d.this.f59952C == null) {
                                return;
                            }
                            C14270d c14270d = C14270d.this;
                            c14270d.m84607a(c14270d.f59953D, true);
                        }
                    });
                } else {
                    this.f59950A = i;
                    this.f59951B = i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84659a(final InterfaceC14185o interfaceC14185o) {
        TXCloudVideoView tXCloudVideoView = this.f59999x;
        if (tXCloudVideoView != null) {
            TXCGLSurfaceView gLSurfaceView = tXCloudVideoView.getGLSurfaceView();
            if (gLSurfaceView != null) {
                gLSurfaceView.m84964a(new InterfaceC14185o() { // from class: com.tencent.liteav.d.5
                    @Override // com.tencent.liteav.basic.p093c.InterfaceC14185o
                    public void onTakePhotoComplete(Bitmap bitmap) {
                        InterfaceC14185o interfaceC14185o2 = interfaceC14185o;
                        if (interfaceC14185o2 != null) {
                            interfaceC14185o2.onTakePhotoComplete(bitmap);
                        }
                    }
                });
                return;
            } else {
                if (interfaceC14185o != null) {
                    interfaceC14185o.onTakePhotoComplete(null);
                    return;
                }
                return;
            }
        }
        C14175e c14175e = this.f59952C;
        if (c14175e != null) {
            c14175e.m83929a(new InterfaceC14185o() { // from class: com.tencent.liteav.d.6
                @Override // com.tencent.liteav.basic.p093c.InterfaceC14185o
                public void onTakePhotoComplete(Bitmap bitmap) {
                    InterfaceC14185o interfaceC14185o2 = interfaceC14185o;
                    if (interfaceC14185o2 != null) {
                        interfaceC14185o2.onTakePhotoComplete(bitmap);
                    }
                }
            });
        } else if (interfaceC14185o != null) {
            interfaceC14185o.onTakePhotoComplete(null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84663a(C14352a.a aVar) {
        this.f59992q = 1;
        if (this.f59979d == null) {
            this.f59979d = new C14275i(this.f59990o, this.f59991p, aVar);
            TXCLog.m84152i("TXCCaptureAndEnc", "create TXCScreenCaptureSource");
        }
        this.f59971V.m84270a(false);
        m84689i(this.f59954E);
        this.f59979d.mo84521a((InterfaceC14170b) this);
        this.f59979d.mo84523a((InterfaceC14278l) this);
        this.f59979d.mo84517a();
        this.f59979d.mo84525a(getID());
        TXCDRApi.txReportDAU(this.f59990o, C14189a.f59148aG);
    }

    /* JADX INFO: renamed from: a */
    public void m84655a(Bitmap bitmap, float f, float f2, float f3) {
        C14273g c14273g = this.f59991p;
        c14273g.f60132E = bitmap;
        c14273g.f60135H = f;
        c14273g.f60136I = f2;
        c14273g.f60137J = f3;
        m84646y();
    }

    /* JADX INFO: renamed from: a */
    private void m84605a(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("EVT_USERID", getID());
        bundle.putInt("EVT_ID", i);
        bundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (str != null) {
            bundle.putCharSequence(TXLiveConstants.EVT_DESCRIPTION, str);
        }
        C14215f.m84218a(this.f59972W, i, bundle);
        if (i == -1317) {
            TXCEventRecorderProxy.m84163a(getID(), 2002, 4L, -1L, "", this.f59954E);
        } else if (i == -1314) {
            TXCEventRecorderProxy.m84163a(getID(), 2002, 5L, -1L, "", this.f59954E);
        } else if (i == 1003 && this.f59979d != null) {
            TXCEventRecorderProxy.m84163a(getID(), 4001, this.f59979d.mo84550l() ? 0L : 1L, -1L, "", this.f59954E);
        }
        if (i == -1302 || i == -1317 || i == -1318 || i == -1319) {
            TXCKeyPointReportProxy.m84172b(ijkStreamerUtil.FFS_PROP_INT64_AACPROFILE, i);
            return;
        }
        if (i == -1301 || i == -1314 || i == -1315 || i == -1316) {
            TXCKeyPointReportProxy.m84172b(30003, i);
            if (this.f59979d != null) {
                TXCEventRecorderProxy.m84163a(getID(), 4002, this.f59979d.mo84550l() ? 0L : 1L, i, "", this.f59954E);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m84651a(byte[] bArr, int i, int i2, int i3, Object obj, long j, int i4) {
        C14205b c14205b = new C14205b();
        c14205b.f59322m = bArr;
        c14205b.f59311b = i;
        c14205b.f59313d = true;
        m84606a(c14205b, i2, i3, obj, j);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public int m84648a(int i, int i2, int i3, Object obj, long j) {
        synchronized (this.f59989n) {
            try {
                if (this.f59994s == 2) {
                    return 0;
                }
                int iM84600a = m84600a(i2, i3, obj);
                if (iM84600a != 0) {
                    return iM84600a;
                }
                if (j == 0) {
                    j = TXCTimeUtil.generatePtsMS();
                }
                C14488b c14488b = this.f59984i;
                if (c14488b != null) {
                    c14488b.m85318a(this.f59991p.f60146S);
                    c14488b.m85310a(i, i2, i3, j);
                }
                C14488b c14488b2 = this.f59988m;
                if (c14488b2 != null) {
                    c14488b2.m85318a(this.f59991p.f60146S);
                    c14488b2.m85310a(i, i2, i3, j);
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m84649a(int i, int i2, int i3, Object obj, long j, int i4) {
        C14205b c14205b = new C14205b();
        c14205b.f59310a = i;
        c14205b.f59311b = 0;
        m84606a(c14205b, i2, i3, obj, j);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    private void m84606a(C14205b c14205b, int i, int i2, Object obj, long j) {
        synchronized (this.f59989n) {
            try {
                if (this.f59994s == 2) {
                    return;
                }
                c14205b.f59314e = i;
                c14205b.f59315f = i2;
                C14273g c14273g = this.f59991p;
                c14205b.f59318i = c14273g.f60146S;
                if (c14273g.f60164l == 0) {
                    c14205b.f59316g = c14273g.f60154b;
                    c14205b.f59317h = c14273g.f60153a;
                } else {
                    c14205b.f59316g = c14273g.f60153a;
                    c14205b.f59317h = c14273g.f60154b;
                }
                c14205b.f59321l = C14215f.m84217a(i, i2, c14205b.f59316g, c14205b.f59317h);
                try {
                    this.f59980e.m84460a(this.f59991p.f60164l);
                    this.f59980e.m84469a(obj);
                    this.f59980e.m84456a(c14205b, c14205b.f59311b, 0, j);
                } catch (Exception e) {
                    TXCLog.m84149e("TXCCaptureAndEnc", "send custom video frame failed." + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14265f
    /* JADX INFO: renamed from: a */
    public int mo84504a(C14205b c14205b) {
        InterfaceC14279m interfaceC14279m;
        WeakReference<InterfaceC14279m> weakReference = this.f59973X;
        if (weakReference != null && (interfaceC14279m = weakReference.get()) != null) {
            c14205b.f59310a = interfaceC14279m.m84803a(c14205b.f59310a, c14205b.f59314e, c14205b.f59315f);
        }
        m84624d(c14205b);
        m84607a(c14205b, false);
        return c14205b.f59310a;
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14265f
    /* JADX INFO: renamed from: a */
    public void mo84505a(C14205b c14205b, long j) {
        m84603a(c14205b.f59310a, c14205b.f59314e, c14205b.f59315f, j);
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83839a(TXSNALPacket tXSNALPacket, int i) {
        a aVar;
        if (i == 0) {
            if (tXSNALPacket.streamType == 2) {
                this.f59958I = tXSNALPacket.gopIndex;
                this.f59957H = tXSNALPacket.frameIndex;
            }
            WeakReference<a> weakReference = this.f59962M;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.onEncVideo(tXSNALPacket);
            return;
        }
        if ((i == 10000004 || i == 10000005) && this.f59983h.encodeType == 1) {
            Monitor.m84161a(2, String.format("VideoEncoder: hardware encoder error %d, switch to software encoder", Integer.valueOf(i)), "", 0);
            m84701r();
            this.f59993r++;
            this.f59991p.f60162j = 0;
            m84605a(1103, "Failed to enable hardware encoder, use software encoder");
        }
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83836a(MediaFormat mediaFormat) {
        a aVar;
        WeakReference<a> weakReference = this.f59962M;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onEncVideoFormat(mediaFormat);
    }

    @Override // com.tencent.liteav.videoencoder.InterfaceC14490d
    /* JADX INFO: renamed from: a */
    public void mo83835a(int i, long j, long j2) {
        if (i == 2) {
            this.f59958I = j;
            this.f59957H = j2;
        }
    }

    @Override // com.tencent.liteav.C14164b.b
    /* JADX INFO: renamed from: a */
    public void mo83896a(final Bitmap bitmap, final ByteBuffer byteBuffer, final int i, final int i2) {
        Runnable runnable = new Runnable() { // from class: com.tencent.liteav.d.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if ((C14270d.this.f59994s == 2 || C14270d.this.f59995t) && bitmap != null && byteBuffer != null) {
                        if (C14270d.this.f59984i == null || C14270d.this.f59969T || C14270d.this.f59983h.width != i || C14270d.this.f59983h.height != i2 || C14270d.this.f59983h.encodeType != 2 || C14270d.this.f59983h.gop != C14270d.this.f59991p.f60161i) {
                            C14270d c14270d = C14270d.this;
                            c14270d.m84604a(i, i2, 2, (Object) null, c14270d.f59991p.f60130C, true);
                        }
                        if ((C14270d.this.f59988m == null || C14270d.this.f59987l.encodeType != 2) && C14270d.this.f59986k) {
                            C14270d.this.m84612a((Object) null, 2, true);
                        }
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        C14488b c14488b = C14270d.this.f59984i;
                        if (c14488b != null) {
                            c14488b.m85311a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                        C14488b c14488b2 = C14270d.this.f59988m;
                        if (c14488b2 != null) {
                            c14488b2.m85311a(byteBuffer.array(), 2, width, height, TXCTimeUtil.generatePtsMS());
                        }
                    }
                } catch (Exception e) {
                    TXCLog.m84149e("TXCCaptureAndEnc", "onPushBitmap failed." + e.getMessage());
                }
            }
        };
        InterfaceC14277k interfaceC14277k = this.f59979d;
        if (interfaceC14277k != null) {
            interfaceC14277k.mo84524a(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.tencent.liteav.C14164b.b
    /* JADX INFO: renamed from: a */
    public void mo83895a() {
        a aVar;
        TXCLog.m84152i("TXCCaptureAndEnc", "onPushEnd");
        WeakReference<a> weakReference = this.f59962M;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onBackgroudPushStop();
    }

    @Override // com.tencent.liteav.InterfaceC14278l
    /* JADX INFO: renamed from: a */
    public void mo84656a(SurfaceTexture surfaceTexture) {
        C14263d c14263d = this.f59980e;
        if (c14263d != null) {
            c14263d.m84475b();
        }
    }

    @Override // com.tencent.liteav.beauty.InterfaceC14265f
    /* JADX INFO: renamed from: a */
    public void mo84506a(byte[] bArr, int i, int i2, int i3, long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84612a(Object obj, int i, boolean z) {
        m84644w();
        C14488b c14488b = new C14488b(i);
        TXCStatus.m84177a(getID(), 4005, 3, Integer.valueOf(i));
        if (i == 1) {
            TXCEventRecorderProxy.m84163a(getID(), 4004, 1L, -1L, "", 3);
        } else {
            TXCEventRecorderProxy.m84163a(getID(), 4004, 0L, -1L, "", 3);
        }
        TXSVideoEncoderParam tXSVideoEncoderParam = this.f59987l;
        tXSVideoEncoderParam.glContext = obj != null ? obj : c14488b.m85312a(tXSVideoEncoderParam.width, tXSVideoEncoderParam.height);
        TXSVideoEncoderParam tXSVideoEncoderParam2 = this.f59987l;
        tXSVideoEncoderParam2.encodeType = i;
        tXSVideoEncoderParam2.realTime = z;
        TXCLog.m84152i("TXCCaptureAndEnc", "start small video encoder");
        c14488b.m85316a((InterfaceC14490d) this);
        c14488b.m85315a((InterfaceC14170b) this);
        c14488b.m85309a(this.f59987l);
        c14488b.m85323c(this.f59987l.bitrate);
        c14488b.setID(getID());
        c14488b.m85314a(this.f59974Y);
        this.f59988m = c14488b;
        String id = getID();
        TXSVideoEncoderParam tXSVideoEncoderParam3 = this.f59987l;
        TXCStatus.m84177a(id, 4003, 3, Integer.valueOf(tXSVideoEncoderParam3.height | (tXSVideoEncoderParam3.width << 16)));
        TXCStatus.m84177a(getID(), TXILiveRoomDefine.TXILiveRoomEventStartVideoHardWareEncoder, 3, Integer.valueOf(this.f59987l.gop * 1000));
    }

    /* JADX INFO: renamed from: a */
    private void m84603a(int i, int i2, int i3, long j) {
        if (j == 0) {
            j = TXCTimeUtil.generatePtsMS();
        }
        long j2 = j;
        m84617b(i2, i3, this.f59980e.m84458a());
        C14488b c14488b = this.f59984i;
        if (c14488b != null) {
            c14488b.m85310a(i, i2, i3, j2);
        }
        C14488b c14488b2 = this.f59988m;
        if (c14488b2 != null) {
            c14488b2.m85310a(i, i2, i3, j2);
        }
    }

    /* JADX INFO: renamed from: a */
    private int m84600a(int i, int i2, Object obj) {
        C14273g c14273g = this.f59991p;
        int i3 = c14273g.f60153a;
        int i4 = c14273g.f60154b;
        int i5 = c14273g.f60164l;
        if (i5 == 0 || i5 == 2) {
            i4 = i3;
            i3 = i4;
        }
        if (i3 > 0 && i4 > 0) {
            if (c14273g.f60140M) {
                m84645x();
                return -1000;
            }
            m84617b(i3, i4, obj);
            return 0;
        }
        TXCLog.m84149e("TXCCaptureAndEnc", "sendCustomYUVData: invalid video encode resolution");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m84607a(C14205b c14205b, boolean z) {
        InterfaceC14277k interfaceC14277k;
        InterfaceC14277k interfaceC14277k2;
        m84626e(c14205b.f59314e, c14205b.f59315f);
        this.f59953D = c14205b;
        if (this.f59999x != null) {
            InterfaceC14277k interfaceC14277k3 = this.f59979d;
            if (interfaceC14277k3 != null) {
                interfaceC14277k3.mo84522a(c14205b);
                return;
            }
            return;
        }
        synchronized (this.f60000y) {
            try {
                if (this.f60001z != null && this.f59952C == null && (interfaceC14277k2 = this.f59979d) != null && interfaceC14277k2.mo84542f() != null) {
                    C14175e c14175e = new C14175e();
                    this.f59952C = c14175e;
                    c14175e.m83930a(this.f59979d.mo84542f(), this.f60001z);
                    this.f59952C.m83927a(this.f59997v);
                    this.f59952C.m83933b(this.f59975Z);
                }
                C14175e c14175e2 = this.f59952C;
                if (c14175e2 != null && (interfaceC14277k = this.f59979d) != null) {
                    c14175e2.m83928a(c14205b.f59310a, c14205b.f59318i, this.f59996u, this.f59950A, this.f59951B, c14205b.f59314e, c14205b.f59315f, z, interfaceC14277k.mo84550l());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m84613a(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f59978c.m84212a(runnable);
        } else {
            runnable.run();
        }
    }
}
