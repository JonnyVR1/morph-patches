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
import p153l.spw;
import p153l.uje;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.m */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3999m {

    /* JADX INFO: renamed from: C */
    private uje f14209C;

    /* JADX INFO: renamed from: u */
    protected SurfaceTexture f14237u;

    /* JADX INFO: renamed from: v */
    protected Surface f14238v;

    /* JADX INFO: renamed from: a */
    protected int f14217a = 0;

    /* JADX INFO: renamed from: b */
    protected int f14218b = 0;

    /* JADX INFO: renamed from: c */
    protected int f14219c = 44100;

    /* JADX INFO: renamed from: d */
    protected int f14220d = 16;

    /* JADX INFO: renamed from: e */
    protected int f14221e = 1;

    /* JADX INFO: renamed from: f */
    protected int f14222f = 0;

    /* JADX INFO: renamed from: g */
    protected int f14223g = 16;

    /* JADX INFO: renamed from: h */
    protected int f14224h = 0;

    /* JADX INFO: renamed from: i */
    protected int f14225i = 0;

    /* JADX INFO: renamed from: j */
    protected int f14226j = 0;

    /* JADX INFO: renamed from: k */
    protected int f14227k = 0;

    /* JADX INFO: renamed from: l */
    protected int f14228l = 0;

    /* JADX INFO: renamed from: m */
    protected long f14229m = 0;

    /* JADX INFO: renamed from: n */
    protected int f14230n = 16;

    /* JADX INFO: renamed from: o */
    protected long f14231o = -1;

    /* JADX INFO: renamed from: p */
    protected long f14232p = 0;

    /* JADX INFO: renamed from: q */
    protected long f14233q = -1;

    /* JADX INFO: renamed from: r */
    protected int f14234r = 17;

    /* JADX INFO: renamed from: s */
    protected boolean f14235s = true;

    /* JADX INFO: renamed from: t */
    protected int f14236t = -1;

    /* JADX INFO: renamed from: w */
    private boolean f14239w = false;

    /* JADX INFO: renamed from: x */
    protected c f14240x = null;

    /* JADX INFO: renamed from: y */
    protected e f14241y = null;

    /* JADX INFO: renamed from: z */
    protected spw f14242z = null;

    /* JADX INFO: renamed from: A */
    protected MediaFormat f14207A = null;

    /* JADX INFO: renamed from: B */
    protected MediaFormat f14208B = null;

    /* JADX INFO: renamed from: D */
    protected HandlerThread f14210D = null;

    /* JADX INFO: renamed from: E */
    protected d f14211E = null;

    /* JADX INFO: renamed from: F */
    private boolean f14212F = false;

    /* JADX INFO: renamed from: G */
    private Object f14213G = new Object();

    /* JADX INFO: renamed from: H */
    private boolean f14214H = true;

    /* JADX INFO: renamed from: I */
    protected boolean f14215I = false;

    /* JADX INFO: renamed from: J */
    protected long f14216J = -1;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$a */
    public class a implements SurfaceTexture.OnFrameAvailableListener {
        public a() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            e eVar = AbstractC3999m.this.f14241y;
            if (eVar != null) {
                eVar.mo19929f(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$b */
    public class b implements SurfaceTexture.OnFrameAvailableListener {
        public b() {
        }

        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            e eVar = AbstractC3999m.this.f14241y;
            if (eVar != null) {
                eVar.mo19929f(surfaceTexture);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo19920a();

        /* JADX INFO: renamed from: c */
        void mo19921c();

        /* JADX INFO: renamed from: d */
        void mo19922d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo19923e(ByteBuffer byteBuffer, int i, long j);
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$d */
    public class d extends Handler {

        /* JADX INFO: renamed from: a */
        uje f14245a;

        /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$d$a */
        public class a implements SurfaceTexture.OnFrameAvailableListener {
            public a() {
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                e eVar = AbstractC3999m.this.f14241y;
                if (eVar != null) {
                    eVar.mo19929f(surfaceTexture);
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
                synchronized (AbstractC3999m.this.f14213G) {
                    try {
                        Surface surface = AbstractC3999m.this.f14238v;
                        if (surface != null) {
                            surface.release();
                            AbstractC3999m.this.f14238v = null;
                        }
                        SurfaceTexture surfaceTexture = AbstractC3999m.this.f14237u;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                            AbstractC3999m.this.f14237u = null;
                        }
                        AbstractC3999m.this.f14212F = false;
                        AbstractC3999m.this.f14213G.notifyAll();
                        uje ujeVar = this.f14245a;
                        if (ujeVar != null) {
                            ujeVar.m196328g();
                            this.f14245a = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            synchronized (AbstractC3999m.this.f14213G) {
                try {
                    if (this.f14245a == null && AbstractC3999m.this.f14209C != null) {
                        uje ujeVar2 = new uje();
                        this.f14245a = ujeVar2;
                        ujeVar2.m196324b(AbstractC3999m.this.f14209C.f179207c);
                    }
                    if (AbstractC3999m.this.f14238v == null) {
                        this.f14245a.m196327f();
                        AbstractC3999m.this.f14236t = uje.m196321d();
                        AbstractC3999m.this.f14237u = new SurfaceTexture(AbstractC3999m.this.f14236t);
                        AbstractC3999m.this.f14238v = new Surface(AbstractC3999m.this.f14237u);
                        AbstractC3999m.this.f14237u.setOnFrameAvailableListener(new a());
                    }
                    AbstractC3999m.this.f14212F = true;
                    AbstractC3999m.this.f14213G.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.m$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo19924a();

        /* JADX INFO: renamed from: b */
        void mo19925b(ByteBuffer byteBuffer);

        /* JADX INFO: renamed from: c */
        void mo19926c();

        /* JADX INFO: renamed from: d */
        void mo19927d(MediaFormat mediaFormat);

        /* JADX INFO: renamed from: e */
        void mo19928e(MediaCodec.BufferInfo bufferInfo);

        /* JADX INFO: renamed from: f */
        void mo19929f(SurfaceTexture surfaceTexture);
    }

    /* JADX INFO: renamed from: A */
    public void m19902A(uje ujeVar) {
        this.f14209C = ujeVar;
    }

    /* JADX INFO: renamed from: B */
    public abstract boolean mo19766B();

    /* JADX INFO: renamed from: C */
    public boolean mo19767C(long j) {
        return mo19766B();
    }

    /* JADX INFO: renamed from: d */
    public boolean m19903d() {
        if (this.f14210D == null) {
            HandlerThread handlerThread = new HandlerThread("Texturhandler");
            this.f14210D = handlerThread;
            handlerThread.start();
        }
        if (this.f14211E == null) {
            this.f14211E = new d(this.f14210D.getLooper());
        }
        d dVar = this.f14211E;
        if (dVar == null || this.f14210D == null) {
            this.f14236t = uje.m196321d();
            this.f14237u = new SurfaceTexture(this.f14236t);
            this.f14238v = new Surface(this.f14237u);
            this.f14237u.setOnFrameAvailableListener(new b());
        } else {
            dVar.sendMessage(dVar.obtainMessage(1));
            synchronized (this.f14213G) {
                while (!this.f14212F && this.f14214H) {
                    try {
                        this.f14213G.wait(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public MediaFormat m19904e() {
        MediaFormat mediaFormat = this.f14207A;
        if (mediaFormat != null) {
            int i = this.f14224h;
            if (i > 0) {
                mediaFormat.setInteger("channel-count", i);
            }
            int i2 = this.f14222f;
            if (i2 > 0) {
                this.f14207A.setInteger("sample-rate", i2);
            }
        }
        return this.f14207A;
    }

    /* JADX INFO: renamed from: f */
    public int m19905f() {
        return this.f14224h;
    }

    /* JADX INFO: renamed from: g */
    public int m19906g() {
        return this.f14222f;
    }

    /* JADX INFO: renamed from: h */
    public long m19907h() {
        return this.f14229m;
    }

    /* JADX INFO: renamed from: i */
    public int m19908i() {
        return this.f14218b;
    }

    /* JADX INFO: renamed from: j */
    public int m19909j() {
        return this.f14236t;
    }

    /* JADX INFO: renamed from: k */
    public int m19910k() {
        int i = this.f14227k;
        return i == 0 ? this.f14228l : i;
    }

    /* JADX INFO: renamed from: l */
    public int m19911l() {
        return this.f14234r;
    }

    /* JADX INFO: renamed from: m */
    public MediaFormat m19912m() {
        return this.f14208B;
    }

    /* JADX INFO: renamed from: n */
    public int m19913n() {
        return this.f14217a;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo19769o();

    /* JADX INFO: renamed from: p */
    public abstract boolean mo19770p(String str, int i);

    /* JADX INFO: renamed from: q */
    public void mo19771q() {
        d dVar;
        this.f14214H = false;
        this.f14217a = 0;
        this.f14218b = 0;
        this.f14219c = 0;
        this.f14220d = 0;
        this.f14221e = 0;
        this.f14231o = -1L;
        this.f14233q = -1L;
        this.f14234r = 17;
        this.f14235s = false;
        this.f14240x = null;
        this.f14241y = null;
        Surface surface = this.f14238v;
        if (surface != null && !this.f14239w) {
            surface.release();
            this.f14238v = null;
        }
        SurfaceTexture surfaceTexture = this.f14237u;
        if (surfaceTexture != null && !this.f14239w) {
            surfaceTexture.release();
            this.f14237u = null;
        }
        if (this.f14210D != null && (dVar = this.f14211E) != null) {
            dVar.sendMessage(dVar.obtainMessage(2));
            synchronized (this.f14213G) {
                while (this.f14212F) {
                    try {
                        this.f14213G.wait(10L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            this.f14210D.quit();
            this.f14211E = null;
            this.f14210D = null;
        }
        if (this.f14239w) {
            return;
        }
        this.f14236t = 0;
    }

    /* JADX INFO: renamed from: r */
    public void mo19772r(Boolean bool) {
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo19773s();

    /* JADX INFO: renamed from: t */
    public void mo19774t(long j, long j2, boolean z) {
        if (j >= 0) {
            this.f14231o = j;
        }
        if (j >= 0 && j < j2) {
            this.f14233q = j2;
        }
        if (j2 == -1) {
            this.f14233q = -1L;
        }
        this.f14215I = z;
        this.f14216J = -1L;
    }

    /* JADX INFO: renamed from: u */
    public void m19914u(c cVar) {
        this.f14240x = cVar;
    }

    /* JADX INFO: renamed from: v */
    public void m19915v(int i, int i2, int i3) {
        if (i > 0) {
            this.f14222f = i;
        }
        if (i2 > 0) {
            this.f14223g = i2;
        }
        if (i3 > 0) {
            this.f14224h = i3;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m19916w(spw spwVar) {
        this.f14242z = spwVar;
    }

    /* JADX INFO: renamed from: x */
    public void m19917x(boolean z) {
        this.f14235s = z;
    }

    /* JADX INFO: renamed from: y */
    public void m19918y(SurfaceTexture surfaceTexture, int i, Surface surface) {
        this.f14237u = surfaceTexture;
        this.f14236t = i;
        this.f14238v = surface;
        surfaceTexture.setOnFrameAvailableListener(new a());
        this.f14239w = true;
    }

    /* JADX INFO: renamed from: z */
    public void m19919z(e eVar) {
        this.f14241y = eVar;
    }
}
