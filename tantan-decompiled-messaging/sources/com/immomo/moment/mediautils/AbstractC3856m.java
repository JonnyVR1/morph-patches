package com.immomo.moment.mediautils;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import p149l.qie;
import p149l.tmw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.m */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3856m {

    /* JADX INFO: renamed from: C */
    private qie f13515C;

    /* JADX INFO: renamed from: u */
    protected SurfaceTexture f13543u;

    /* JADX INFO: renamed from: v */
    protected Surface f13544v;

    /* JADX INFO: renamed from: a */
    protected int f13523a = 0;

    /* JADX INFO: renamed from: b */
    protected int f13524b = 0;

    /* JADX INFO: renamed from: c */
    protected int f13525c = 44100;

    /* JADX INFO: renamed from: d */
    protected int f13526d = 16;

    /* JADX INFO: renamed from: e */
    protected int f13527e = 1;

    /* JADX INFO: renamed from: f */
    protected int f13528f = 0;

    /* JADX INFO: renamed from: g */
    protected int f13529g = 16;

    /* JADX INFO: renamed from: h */
    protected int f13530h = 0;

    /* JADX INFO: renamed from: i */
    protected int f13531i = 0;

    /* JADX INFO: renamed from: j */
    protected int f13532j = 0;

    /* JADX INFO: renamed from: k */
    protected int f13533k = 0;

    /* JADX INFO: renamed from: l */
    protected int f13534l = 0;

    /* JADX INFO: renamed from: m */
    protected long f13535m = 0;

    /* JADX INFO: renamed from: n */
    protected int f13536n = 16;

    /* JADX INFO: renamed from: o */
    protected long f13537o = -1;

    /* JADX INFO: renamed from: p */
    protected long f13538p = 0;

    /* JADX INFO: renamed from: q */
    protected long f13539q = -1;

    /* JADX INFO: renamed from: r */
    protected int f13540r = 17;

    /* JADX INFO: renamed from: s */
    protected boolean f13541s = true;

    /* JADX INFO: renamed from: t */
    protected int f13542t = -1;

    /* JADX INFO: renamed from: w */
    private boolean f13545w = false;

    /* JADX INFO: renamed from: x */
    protected c f13546x = null;

    /* JADX INFO: renamed from: y */
    protected e f13547y = null;

    /* JADX INFO: renamed from: z */
    protected tmw f13548z = null;

    /* JADX INFO: renamed from: A */
    protected MediaFormat f13513A = null;

    /* JADX INFO: renamed from: B */
    protected MediaFormat f13514B = null;

    /* JADX INFO: renamed from: D */
    protected HandlerThread f13516D = null;

    /* JADX INFO: renamed from: E */
    protected d f13517E = null;

    /* JADX INFO: renamed from: F */
    private boolean f13518F = false;

    /* JADX INFO: renamed from: G */
    private Object f13519G = new Object();

    /* JADX INFO: renamed from: H */
    private boolean f13520H = true;

    /* JADX INFO: renamed from: I */
    protected boolean f13521I = false;

    /* JADX INFO: renamed from: J */
    protected long f13522J = -1;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$a */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        public a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            e eVar = AbstractC3856m.this.f13547y;
            if (eVar != null) {
                eVar.mo18949f(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$b */
    public class b implements SurfaceTexture.OnFrameAvailableListener {
        public b() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            e eVar = AbstractC3856m.this.f13547y;
            if (eVar != null) {
                eVar.mo18949f(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo18940a();

        /* JADX INFO: renamed from: c */
        void mo18941c();

        /* JADX INFO: renamed from: d */
        void mo18942d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo18943e(ByteBuffer byteBuffer, int i, long j);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$d */
    public class d extends Handler {

        /* JADX INFO: renamed from: a */
        qie f13551a;

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$d$a */
        public class a implements SurfaceTexture.OnFrameAvailableListener {
            public a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                e eVar = AbstractC3856m.this.f13547y;
                if (eVar != null) {
                    eVar.mo18949f(surfaceTexture);
                }
            }
        }

        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                synchronized (AbstractC3856m.this.f13519G) {
                    try {
                        Surface surface = AbstractC3856m.this.f13544v;
                        if (surface != null) {
                            surface.release();
                            AbstractC3856m.this.f13544v = null;
                        }
                        SurfaceTexture surfaceTexture = AbstractC3856m.this.f13543u;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                            AbstractC3856m.this.f13543u = null;
                        }
                        AbstractC3856m.this.f13518F = false;
                        AbstractC3856m.this.f13519G.notifyAll();
                        qie qieVar = this.f13551a;
                        if (qieVar != null) {
                            qieVar.m174873g();
                            this.f13551a = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            synchronized (AbstractC3856m.this.f13519G) {
                try {
                    if (this.f13551a == null && AbstractC3856m.this.f13515C != null) {
                        qie qieVar2 = new qie();
                        this.f13551a = qieVar2;
                        qieVar2.m174869b(AbstractC3856m.this.f13515C.f154758c);
                    }
                    if (AbstractC3856m.this.f13544v == null) {
                        this.f13551a.m174872f();
                        AbstractC3856m.this.f13542t = qie.m174866d();
                        AbstractC3856m.this.f13543u = new SurfaceTexture(AbstractC3856m.this.f13542t);
                        AbstractC3856m.this.f13544v = new Surface(AbstractC3856m.this.f13543u);
                        AbstractC3856m.this.f13543u.setOnFrameAvailableListener(new a());
                    }
                    AbstractC3856m.this.f13518F = true;
                    AbstractC3856m.this.f13519G.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo18944a();

        /* JADX INFO: renamed from: b */
        void mo18945b(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: c */
        void mo18946c();

        /* JADX INFO: renamed from: d */
        void mo18947d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo18948e(MediaCodec.BufferInfo bufferInfo);

        /* JADX INFO: renamed from: f */
        void mo18949f(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: A */
    public void m18922A(qie qieVar) {
        this.f13515C = qieVar;
    }

    /* JADX INFO: renamed from: B */
    public abstract boolean mo18786B();

    /* JADX INFO: renamed from: C */
    public boolean mo18787C(long j) {
        return mo18786B();
    }

    /* JADX INFO: renamed from: d */
    public boolean m18923d() {
        if (this.f13516D == null) {
            HandlerThread handlerThread = new HandlerThread("Texturhandler");
            this.f13516D = handlerThread;
            handlerThread.start();
        }
        if (this.f13517E == null) {
            this.f13517E = new d(this.f13516D.getLooper());
        }
        d dVar = this.f13517E;
        if (dVar == null || this.f13516D == null) {
            this.f13542t = qie.m174866d();
            this.f13543u = new SurfaceTexture(this.f13542t);
            this.f13544v = new Surface(this.f13543u);
            this.f13543u.setOnFrameAvailableListener(new b());
        } else {
            dVar.sendMessage(dVar.obtainMessage(1));
            synchronized (this.f13519G) {
                while (!this.f13518F && this.f13520H) {
                    try {
                        this.f13519G.wait(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public MediaFormat m18924e() {
        MediaFormat mediaFormat = this.f13513A;
        if (mediaFormat != null) {
            int i = this.f13530h;
            if (i > 0) {
                mediaFormat.setInteger("channel-count", i);
            }
            int i2 = this.f13528f;
            if (i2 > 0) {
                this.f13513A.setInteger("sample-rate", i2);
            }
        }
        return this.f13513A;
    }

    /* JADX INFO: renamed from: f */
    public int m18925f() {
        return this.f13530h;
    }

    /* JADX INFO: renamed from: g */
    public int m18926g() {
        return this.f13528f;
    }

    /* JADX INFO: renamed from: h */
    public long m18927h() {
        return this.f13535m;
    }

    /* JADX INFO: renamed from: i */
    public int m18928i() {
        return this.f13524b;
    }

    /* JADX INFO: renamed from: j */
    public int m18929j() {
        return this.f13542t;
    }

    /* JADX INFO: renamed from: k */
    public int m18930k() {
        int i = this.f13533k;
        return i == 0 ? this.f13534l : i;
    }

    /* JADX INFO: renamed from: l */
    public int m18931l() {
        return this.f13540r;
    }

    /* JADX INFO: renamed from: m */
    public MediaFormat m18932m() {
        return this.f13514B;
    }

    /* JADX INFO: renamed from: n */
    public int m18933n() {
        return this.f13523a;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo18789o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo18790p(String str, int i);

    /* JADX INFO: renamed from: q */
    public void mo18791q() {
        d dVar;
        this.f13520H = false;
        this.f13523a = 0;
        this.f13524b = 0;
        this.f13525c = 0;
        this.f13526d = 0;
        this.f13527e = 0;
        this.f13537o = -1L;
        this.f13539q = -1L;
        this.f13540r = 17;
        this.f13541s = false;
        this.f13546x = null;
        this.f13547y = null;
        Surface surface = this.f13544v;
        if (surface != null && !this.f13545w) {
            surface.release();
            this.f13544v = null;
        }
        SurfaceTexture surfaceTexture = this.f13543u;
        if (surfaceTexture != null && !this.f13545w) {
            surfaceTexture.release();
            this.f13543u = null;
        }
        if (this.f13516D != null && (dVar = this.f13517E) != null) {
            dVar.sendMessage(dVar.obtainMessage(2));
            synchronized (this.f13519G) {
                while (this.f13518F) {
                    try {
                        this.f13519G.wait(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f13516D.quit();
            this.f13517E = null;
            this.f13516D = null;
        }
        if (this.f13545w) {
            return;
        }
        this.f13542t = 0;
    }

    /* JADX INFO: renamed from: r */
    public void mo18792r(Boolean bool) {
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo18793s();

    /* JADX INFO: renamed from: t */
    public void mo18794t(long j, long j2, boolean z) {
        if (j >= 0) {
            this.f13537o = j;
        }
        if (j >= 0 && j < j2) {
            this.f13539q = j2;
        }
        if (j2 == -1) {
            this.f13539q = -1L;
        }
        this.f13521I = z;
        this.f13522J = -1L;
    }

    /* JADX INFO: renamed from: u */
    public void m18934u(c cVar) {
        this.f13546x = cVar;
    }

    /* JADX INFO: renamed from: v */
    public void m18935v(int i, int i2, int i3) {
        if (i > 0) {
            this.f13528f = i;
        }
        if (i2 > 0) {
            this.f13529g = i2;
        }
        if (i3 > 0) {
            this.f13530h = i3;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m18936w(tmw tmwVar) {
        this.f13548z = tmwVar;
    }

    /* JADX INFO: renamed from: x */
    public void m18937x(boolean z) {
        this.f13541s = z;
    }

    /* JADX INFO: renamed from: y */
    public void m18938y(SurfaceTexture surfaceTexture, int i, Surface surface) {
        this.f13543u = surfaceTexture;
        this.f13542t = i;
        this.f13544v = surface;
        surfaceTexture.setOnFrameAvailableListener(new a());
        this.f13545w = true;
    }

    /* JADX INFO: renamed from: z */
    public void m18939z(e eVar) {
        this.f13547y = eVar;
    }
}
