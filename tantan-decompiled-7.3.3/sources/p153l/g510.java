package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.core.glcore.util.Log4Cam;
import com.core.glcore.util.XEEngineHelper;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class g510 {

    /* JADX INFO: renamed from: F */
    protected long f102229F;

    /* JADX INFO: renamed from: G */
    protected long f102230G;

    /* JADX INFO: renamed from: K */
    protected int f102234K;

    /* JADX INFO: renamed from: M */
    long f102236M;

    /* JADX INFO: renamed from: N */
    long f102237N;

    /* JADX INFO: renamed from: S */
    protected int f102242S;

    /* JADX INFO: renamed from: T */
    protected int f102243T;

    /* JADX INFO: renamed from: U */
    private SurfaceTexture f102244U;

    /* JADX INFO: renamed from: V */
    private int f102245V;

    /* JADX INFO: renamed from: a */
    protected C17154b f102247a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC17153a f102248b;

    /* JADX INFO: renamed from: c */
    protected List<MomoCodec> f102249c;

    /* JADX INFO: renamed from: g */
    protected Object f102253g;

    /* JADX INFO: renamed from: j */
    private boolean f102256j;

    /* JADX INFO: renamed from: n */
    protected omw f102260n;

    /* JADX INFO: renamed from: q */
    protected String f102263q;

    /* JADX INFO: renamed from: r */
    protected Runnable f102264r;

    /* JADX INFO: renamed from: d */
    protected wje f102250d = null;

    /* JADX INFO: renamed from: e */
    protected wje f102251e = null;

    /* JADX INFO: renamed from: f */
    protected int f102252f = 0;

    /* JADX INFO: renamed from: h */
    private final Object f102254h = new Object();

    /* JADX INFO: renamed from: i */
    protected final Object f102255i = new Object();

    /* JADX INFO: renamed from: k */
    protected Boolean f102257k = Boolean.FALSE;

    /* JADX INFO: renamed from: l */
    private boolean f102258l = false;

    /* JADX INFO: renamed from: m */
    protected boolean f102259m = false;

    /* JADX INFO: renamed from: o */
    protected int f102261o = 0;

    /* JADX INFO: renamed from: p */
    private int f102262p = 0;

    /* JADX INFO: renamed from: s */
    private boolean f102265s = false;

    /* JADX INFO: renamed from: t */
    private boolean f102266t = false;

    /* JADX INFO: renamed from: u */
    private boolean f102267u = false;

    /* JADX INFO: renamed from: v */
    protected long f102268v = 0;

    /* JADX INFO: renamed from: w */
    protected boolean f102269w = false;

    /* JADX INFO: renamed from: x */
    protected int f102270x = 20;

    /* JADX INFO: renamed from: y */
    private boolean f102271y = false;

    /* JADX INFO: renamed from: z */
    private u410 f102272z = null;

    /* JADX INFO: renamed from: A */
    private int f102224A = 0;

    /* JADX INFO: renamed from: B */
    private int f102225B = 0;

    /* JADX INFO: renamed from: C */
    private int f102226C = 0;

    /* JADX INFO: renamed from: D */
    private int f102227D = 0;

    /* JADX INFO: renamed from: E */
    protected boolean f102228E = false;

    /* JADX INFO: renamed from: H */
    protected long f102231H = 0;

    /* JADX INFO: renamed from: I */
    protected int f102232I = 0;

    /* JADX INFO: renamed from: J */
    protected int f102233J = 0;

    /* JADX INFO: renamed from: L */
    public int f102235L = 30;

    /* JADX INFO: renamed from: O */
    long f102238O = 0;

    /* JADX INFO: renamed from: P */
    int f102239P = 0;

    /* JADX INFO: renamed from: Q */
    int f102240Q = 0;

    /* JADX INFO: renamed from: R */
    public int f102241R = 0;

    /* JADX INFO: renamed from: W */
    Object f102246W = new Object();

    /* JADX INFO: renamed from: l.g510$a */
    public interface InterfaceC17153a {
        /* JADX INFO: renamed from: a */
        wje mo129005a();

        /* JADX INFO: renamed from: b */
        boolean mo129006b();

        /* JADX INFO: renamed from: c */
        void mo129007c();

        /* JADX INFO: renamed from: d */
        void mo129008d();

        /* JADX INFO: renamed from: e */
        void mo129009e(int i, int i2);

        /* JADX INFO: renamed from: f */
        void mo129010f(g510 g510Var, omw omwVar);

        /* JADX INFO: renamed from: h */
        void mo129011h(g510 g510Var);

        /* JADX INFO: renamed from: i */
        Object mo129012i();

        /* JADX INFO: renamed from: j */
        void mo129013j(g510 g510Var);

        /* JADX INFO: renamed from: k */
        void mo129014k(g510 g510Var);

        /* JADX INFO: renamed from: l */
        void mo129015l(wje wjeVar, g510 g510Var, omw omwVar);

        /* JADX INFO: renamed from: m */
        PipelineConcurrentHashMap<String, wje> mo129016m();

        /* JADX INFO: renamed from: n */
        void mo129017n(g510 g510Var);

        /* JADX INFO: renamed from: o */
        void mo129018o(g510 g510Var, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: p */
        boolean mo129019p();
    }

    /* JADX INFO: renamed from: l.g510$b */
    public class C17154b extends Thread {

        /* JADX INFO: renamed from: a */
        protected final int f102273a;

        /* JADX INFO: renamed from: b */
        public boolean f102274b;

        public C17154b(String str) {
            super(str);
            this.f102273a = 100;
            this.f102274b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m129020a() {
            this.f102274b = true;
            try {
                join(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m129021b() {
            this.f102274b = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @RequiresApi(api = 17)
        public void run() {
            oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "RenderThread start ######################" + Thread.currentThread().getName());
            boolean zMo129019p = g510.this.f102248b.mo129019p();
            g510 g510Var = g510.this;
            if (!zMo129019p) {
                synchronized (g510Var.f102254h) {
                    g510.this.f102256j = true;
                    g510.this.f102254h.notifyAll();
                }
                return;
            }
            synchronized (g510Var.f102254h) {
                g510.this.f102256j = true;
                g510.this.f102254h.notifyAll();
            }
            do {
                if (g510.this.f102265s) {
                    g510.this.m128963E();
                }
                if (g510.this.f102258l) {
                    g510.this.m128999r();
                }
                g510 g510Var2 = g510.this;
                if (g510Var2.f102259m) {
                    g510Var2.m128997p();
                }
                u6y.m194722F().m194738Q();
                synchronized (g510.this.f102255i) {
                    if (!g510.this.f102257k.booleanValue()) {
                        try {
                            g510.this.f102255i.wait(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (im80.f115710a && g510.this.f102263q.contains("TextureInput")) {
                        oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>" + g510.this.f102257k);
                    }
                    if (g510.this.f102257k.booleanValue()) {
                        g510 g510Var3 = g510.this;
                        if (g510Var3.f102250d == null) {
                            g510Var3.f102257k = Boolean.TRUE;
                        } else {
                            g510Var3.f102257k = Boolean.FALSE;
                        }
                        g510Var3.m129000s();
                    } else {
                        u6y.m194722F().m194739R();
                    }
                }
            } while (!this.f102274b);
            g510.this.m128971v();
            g510.this.m128973x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m128963E() {
        Object obj;
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "resumeRender");
        if (this.f102266t) {
            m128972w();
        } else {
            wje wjeVar = this.f102250d;
            if (wjeVar != null && (obj = this.f102253g) != null && wjeVar.m206630a(obj) < 0) {
                Log.e("MomoSurfaceRender", "zhangjl creatEglSurface error");
            }
        }
        this.f102265s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: v */
    public void m128971v() {
        oq70.m168791d().m168795c("render", "releaseEgl ######################");
        try {
            wje wjeVar = this.f102250d;
            if (wjeVar != null) {
                wjeVar.m206637i();
            }
        } catch (Exception unused) {
        }
        SurfaceTexture surfaceTexture = this.f102244U;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        wje.m206629k(this.f102245V);
        List<MomoCodec> list = this.f102249c;
        if (list != null) {
            Iterator<MomoCodec> it = list.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        }
        InterfaceC17153a interfaceC17153a = this.f102248b;
        if (interfaceC17153a != null) {
            interfaceC17153a.mo129013j(this);
            this.f102248b.mo129014k(this);
        }
        wje wjeVar2 = this.f102250d;
        if (wjeVar2 != null) {
            wjeVar2.m206638j();
            this.f102250d = null;
        }
        this.f102272z = null;
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "releaseEgl ######################" + Thread.currentThread().getName());
    }

    /* JADX INFO: renamed from: w */
    private void m128972w() {
        if (this.f102250d != null) {
            InterfaceC17153a interfaceC17153a = this.f102248b;
            if (interfaceC17153a != null) {
                interfaceC17153a.mo129013j(this);
            }
            this.f102250d.m206638j();
            this.f102250d = null;
            this.f102266t = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m128973x() {
        XEEngineHelper.destroy();
    }

    /* JADX INFO: renamed from: A */
    public void m128974A(omw omwVar, Runnable runnable, Runnable runnable2) {
        if (this.f102228E || this.f102257k.booleanValue()) {
            return;
        }
        synchronized (this.f102255i) {
            runnable2.run();
            this.f102264r = runnable;
            this.f102260n = omwVar;
            this.f102257k = Boolean.TRUE;
            this.f102255i.notifyAll();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m128975B(MomoCodec momoCodec) {
        synchronized (this.f102248b.mo129012i()) {
            try {
                if (this.f102248b != null && momoCodec != null) {
                    if (momoCodec.getFilter() != null) {
                        momoCodec.getFilter().releaseFrameBuffer();
                    }
                    wje wjeVar = this.f102248b.mo129016m().get(momoCodec.toString());
                    if (wjeVar != null) {
                        wjeVar.m206638j();
                    }
                    this.f102248b.mo129016m().remove(momoCodec.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m128976C(MomoCodec momoCodec) {
        synchronized (this.f102248b.mo129012i()) {
            try {
                InterfaceC17153a interfaceC17153a = this.f102248b;
                if (interfaceC17153a != null && momoCodec != null) {
                    wje wjeVar = interfaceC17153a.mo129016m().get(momoCodec.toString());
                    if (wjeVar != null) {
                        wjeVar.m206638j();
                    }
                    this.f102248b.mo129016m().remove(momoCodec.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m128977D() {
        this.f102271y = false;
    }

    /* JADX INFO: renamed from: F */
    public void m128978F(Object obj) {
        this.f102253g = obj;
        this.f102258l = true;
        this.f102265s = true;
        this.f102266t = false;
        this.f102228E = false;
        b7y.m102882c().m102888g("MomosurfaceRender resumeRender");
    }

    /* JADX INFO: renamed from: G */
    public void m128979G(Object obj) {
        this.f102253g = obj;
        this.f102258l = true;
        this.f102266t = true;
        this.f102265s = true;
        this.f102228E = false;
        b7y.m102882c().m102888g("MomosurfaceRender resumeRenderEx");
    }

    /* JADX INFO: renamed from: H */
    public void m128980H(Object obj) {
        this.f102253g = obj;
        this.f102258l = true;
        this.f102266t = false;
        this.f102265s = true;
        this.f102228E = false;
        Runnable runnable = this.f102264r;
        if (runnable != null) {
            runnable.run();
            this.f102264r = null;
        }
        b7y.m102882c().m102888g("MomosurfaceRender resumeRenderrepairBlack screenTexture" + obj);
    }

    /* JADX INFO: renamed from: I */
    public void m128981I(int i) {
        this.f102270x = i;
    }

    /* JADX INFO: renamed from: J */
    public void m128982J(InterfaceC17153a interfaceC17153a) {
        this.f102248b = interfaceC17153a;
    }

    /* JADX INFO: renamed from: K */
    public void m128983K(String str) {
        this.f102263q = str;
    }

    /* JADX INFO: renamed from: L */
    public void m128984L() {
        List<MomoCodec> list = this.f102249c;
        if (list == null || list.size() == 0) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "start fail");
        } else {
            if (this.f102259m) {
                return;
            }
            this.f102259m = true;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m128985M() {
        List<MomoCodec> list = this.f102249c;
        if (list == null || list.size() == 0) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "start fail");
        } else {
            if (this.f102259m) {
                return;
            }
            this.f102259m = true;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m128986N(Object obj) {
        synchronized (this.f102254h) {
            this.f102258l = true;
            this.f102253g = obj;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m128987O() {
        this.f102259m = false;
    }

    /* JADX INFO: renamed from: P */
    public void m128988P(int i, int i2) {
        int i3 = this.f102224A;
        if ((i3 != i2 || this.f102225B != i) && i3 != 0 && this.f102225B != 0 && this.f102226C <= 0) {
            this.f102226C = 5;
        }
        this.f102224A = i2;
        this.f102225B = i;
    }

    /* JADX INFO: renamed from: h */
    public void m128989h(MomoCodec momoCodec) {
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "addMomoCodec");
        if (this.f102249c != null) {
            synchronized (this.f102248b.mo129012i()) {
                this.f102249c.add(momoCodec);
            }
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "addMomoCodecs" + this.f102249c.size());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m128990i(u410 u410Var) {
        this.f102272z = u410Var;
    }

    /* JADX INFO: renamed from: j */
    public void m128991j() {
        C17154b c17154b = this.f102247a;
        if (c17154b != null) {
            this.f102257k = Boolean.FALSE;
            this.f102265s = false;
            this.f102258l = false;
            this.f102259m = false;
            c17154b.m129020a();
            this.f102247a = null;
            this.f102253g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m128992k() {
        if (this.f102247a != null) {
            this.f102257k = Boolean.FALSE;
            this.f102265s = false;
            this.f102258l = false;
            this.f102259m = false;
            this.f102249c.clear();
            InterfaceC17153a interfaceC17153a = this.f102248b;
            if (interfaceC17153a != null) {
                interfaceC17153a.mo129017n(this);
            }
            this.f102247a.m129021b();
            this.f102247a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public EGLContext m128993l() {
        wje wjeVar = this.f102251e;
        if (wjeVar != null) {
            return wjeVar.f189439c;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public String m128994m() {
        return this.f102263q;
    }

    /* JADX INFO: renamed from: n */
    public int m128995n() {
        return this.f102227D;
    }

    /* JADX INFO: renamed from: o */
    public SurfaceTexture m128996o() {
        if (this.f102244U == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.f102245V = iArr[0];
            this.f102244U = new SurfaceTexture(this.f102245V);
        }
        return this.f102244U;
    }

    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: p */
    public void m128997p() {
        synchronized (this.f102248b.mo129012i()) {
            if (this.f102251e != null && this.f102248b != null && this.f102249c.size() > this.f102248b.mo129016m().size()) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "initCodecRender" + this.f102249c.size() + "size map" + this.f102248b.mo129016m().size());
                for (MomoCodec momoCodec : this.f102249c) {
                    if (!(momoCodec instanceof uze) && this.f102248b.mo129016m().get(momoCodec.toString()) == null) {
                        try {
                            if (momoCodec.mo20659e0() != null && this.f102251e.f189439c != null) {
                                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "initCodecRender" + Thread.currentThread().getName() + momoCodec.mo20659e0().toString());
                                wje wjeVar = new wje(this.f102248b.mo129006b());
                                wjeVar.m206633d(this.f102251e.f189439c, momoCodec.mo20659e0());
                                this.f102248b.mo129016m().put(momoCodec.toString(), wjeVar);
                            }
                        } catch (Exception e) {
                            b7y.m102882c().m102888g("initCodecRender:" + e.toString());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m128998q() {
        InterfaceC17153a interfaceC17153a = this.f102248b;
        if (interfaceC17153a != null) {
            if (this.f102250d == null) {
                this.f102251e = interfaceC17153a.mo129005a();
            }
            if (this.f102250d != null || this.f102251e == null) {
                return;
            }
            try {
                wje wjeVar = new wje(this.f102248b.mo129006b());
                this.f102250d = wjeVar;
                EGLContext eGLContext = this.f102248b.mo129005a().f189439c;
                Object objM128996o = this.f102253g;
                if (objM128996o == null) {
                    objM128996o = m128996o();
                }
                wjeVar.m206634e(eGLContext, objM128996o);
            } catch (Exception e) {
                b7y.m102882c().m102888g("initGloableRender" + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m128999r() {
        m128998q();
        InterfaceC17153a interfaceC17153a = this.f102248b;
        if (interfaceC17153a != null) {
            interfaceC17153a.mo129011h(this);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m129000s() {
        omw omwVar;
        long j;
        long j2;
        int i;
        boolean z;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = this.f102264r;
            if (runnable != null) {
                try {
                    runnable.run();
                    this.f102264r = null;
                } catch (Throwable th) {
                    th = th;
                    omwVar = null;
                }
            }
            long j3 = 1000 / ((long) this.f102270x);
            long j4 = this.f102268v;
            long j5 = jCurrentTimeMillis - j4;
            if (j5 < j3) {
                this.f102269w = true;
            } else {
                if (j4 == 0 || j5 > 5 * j3) {
                    this.f102268v = System.currentTimeMillis();
                } else {
                    this.f102268v = j4 + j3;
                }
                this.f102261o++;
                this.f102269w = false;
            }
            if (!this.f102271y) {
                this.f102271y = true;
                u410 u410Var = this.f102272z;
                if (u410Var != null) {
                    u410Var.mo139271a();
                }
            }
            if (im80.f115710a && this.f102263q.contains("TextureInput")) {
                oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>> onDrawFrame1111111" + this.f102250d + " 11" + this.f102253g);
            }
            wje wjeVar = this.f102250d;
            if (wjeVar != null) {
                int iM206636h = wjeVar.m206636h();
                int iM206635g = this.f102250d.m206635g();
                int i2 = this.f102242S;
                if (!(iM206635g == i2 && iM206636h == this.f102243T) && i2 > 0) {
                    this.f102248b.mo129009e(iM206635g, iM206636h);
                    z = true;
                } else {
                    z = false;
                }
                this.f102242S = iM206635g;
                this.f102243T = iM206636h;
                if (((iM206635g >> 2) << 2) == ((this.f102225B >> 2) << 2) && ((iM206636h >> 2) << 2) == ((this.f102224A >> 2) << 2)) {
                    this.f102226C = 0;
                }
                if (im80.f115710a && this.f102263q.contains("TextureInput")) {
                    oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>> " + this.f102248b);
                }
                if (this.f102248b != null) {
                    int i3 = this.f102226C;
                    this.f102226C = i3 - 1;
                    if (i3 > 0) {
                        return;
                    }
                    this.f102226C = 0;
                    if (this.f102250d.m206637i()) {
                        this.f102248b.mo129015l(this.f102250d, this, this.f102260n);
                        try {
                            this.f102250d.m206639l();
                        } catch (Exception unused) {
                        }
                    }
                }
                if (z) {
                    this.f102248b.mo129008d();
                }
                oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", "SwapBuffer Now" + Thread.currentThread().getName());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            InterfaceC17153a interfaceC17153a = this.f102248b;
            if (interfaceC17153a == null || !this.f102259m || this.f102269w) {
                j = 1000000;
                j2 = 1;
            } else {
                interfaceC17153a.mo129010f(this, this.f102260n);
                this.f102239P++;
                long jNanoTime = System.nanoTime() / 1000;
                this.f102236M = jNanoTime;
                int i4 = this.f102239P;
                if (i4 > 3) {
                    j = 1000000;
                    j2 = 1;
                    this.f102240Q = (int) (((long) this.f102240Q) + (jNanoTime - this.f102237N));
                    this.f102238O++;
                } else {
                    j = 1000000;
                    j2 = 1;
                }
                if (i4 > 20) {
                    long j6 = ((long) this.f102240Q) / this.f102238O;
                    if (j6 > 0) {
                        this.f102241R = (int) ((j / j6) + j2);
                    }
                    this.f102238O = 0L;
                    this.f102237N = 0L;
                    this.f102236M = 0L;
                    this.f102240Q = 0;
                    this.f102239P = 0;
                }
                this.f102237N = this.f102236M;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (this.f102261o == 1) {
                this.f102248b.mo129007c();
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            this.f102232I++;
            long jNanoTime2 = System.nanoTime() / 1000;
            this.f102229F = jNanoTime2;
            int i5 = this.f102232I;
            if (i5 > 3) {
                this.f102233J = (int) (((long) this.f102233J) + (jNanoTime2 - this.f102230G));
                this.f102231H += j2;
            }
            if (i5 > 20) {
                long j7 = ((long) this.f102233J) / this.f102231H;
                if (j7 > 0) {
                    this.f102234K = (int) ((j / j7) + j2);
                }
                int i6 = this.f102234K;
                if (i6 > 0) {
                    this.f102235L = 1000 / i6;
                }
                this.f102231H = 0L;
                this.f102230G = 0L;
                this.f102229F = 0L;
                i = 0;
                this.f102233J = 0;
                this.f102232I = 0;
            } else {
                i = 0;
            }
            this.f102230G = this.f102229F;
            InterfaceC17153a interfaceC17153a2 = this.f102248b;
            if (interfaceC17153a2 != null) {
                int i7 = (int) (jCurrentTimeMillis4 - jCurrentTimeMillis);
                int i8 = (int) (jCurrentTimeMillis3 - jCurrentTimeMillis2);
                int i9 = this.f102234K;
                if (i7 < 0) {
                    i7 = i;
                }
                interfaceC17153a2.mo129018o(this, i9, i7, i8 < 0 ? i : i8, this.f102241R);
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            omwVar = null;
        }
        m129004z(omwVar);
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: t */
    public void m129001t() {
        this.f102265s = false;
        this.f102228E = true;
        this.f102258l = false;
        this.f102257k = Boolean.FALSE;
        b7y.m102882c().m102888g("MomosurfaceRender pauseRender");
    }

    /* JADX INFO: renamed from: u */
    public void m129002u() {
        if (this.f102247a == null) {
            this.f102249c = new CopyOnWriteArrayList();
            C17154b c17154b = new C17154b("live-media-MRender");
            this.f102247a = c17154b;
            c17154b.setPriority(10);
            this.f102247a.start();
        }
        synchronized (this.f102254h) {
            try {
                this.f102254h.wait(3000L);
            } catch (InterruptedException e) {
                Log4Cam.m7376e(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m129003y(MomoCodec momoCodec) {
        if (this.f102249c != null) {
            synchronized (this.f102248b.mo129012i()) {
                this.f102249c.remove(momoCodec);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m129004z(omw omwVar) {
        if (this.f102228E || this.f102257k.booleanValue()) {
            return;
        }
        synchronized (this.f102255i) {
            this.f102260n = omwVar;
            this.f102257k = Boolean.TRUE;
            this.f102255i.notifyAll();
        }
    }
}
