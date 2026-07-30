package p149l;

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

/* JADX INFO: loaded from: classes7.dex */
public class yw00 {

    /* JADX INFO: renamed from: F */
    protected long f200310F;

    /* JADX INFO: renamed from: G */
    protected long f200311G;

    /* JADX INFO: renamed from: K */
    protected int f200315K;

    /* JADX INFO: renamed from: M */
    long f200317M;

    /* JADX INFO: renamed from: N */
    long f200318N;

    /* JADX INFO: renamed from: S */
    protected int f200323S;

    /* JADX INFO: renamed from: T */
    protected int f200324T;

    /* JADX INFO: renamed from: U */
    private SurfaceTexture f200325U;

    /* JADX INFO: renamed from: V */
    private int f200326V;

    /* JADX INFO: renamed from: a */
    protected C21549b f200328a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC21548a f200329b;

    /* JADX INFO: renamed from: c */
    protected List<MomoCodec> f200330c;

    /* JADX INFO: renamed from: g */
    protected Object f200334g;

    /* JADX INFO: renamed from: j */
    private boolean f200337j;

    /* JADX INFO: renamed from: n */
    protected pjw f200341n;

    /* JADX INFO: renamed from: q */
    protected String f200344q;

    /* JADX INFO: renamed from: r */
    protected Runnable f200345r;

    /* JADX INFO: renamed from: d */
    protected sie f200331d = null;

    /* JADX INFO: renamed from: e */
    protected sie f200332e = null;

    /* JADX INFO: renamed from: f */
    protected int f200333f = 0;

    /* JADX INFO: renamed from: h */
    private final Object f200335h = new Object();

    /* JADX INFO: renamed from: i */
    protected final Object f200336i = new Object();

    /* JADX INFO: renamed from: k */
    protected Boolean f200338k = Boolean.FALSE;

    /* JADX INFO: renamed from: l */
    private boolean f200339l = false;

    /* JADX INFO: renamed from: m */
    protected boolean f200340m = false;

    /* JADX INFO: renamed from: o */
    protected int f200342o = 0;

    /* JADX INFO: renamed from: p */
    private int f200343p = 0;

    /* JADX INFO: renamed from: s */
    private boolean f200346s = false;

    /* JADX INFO: renamed from: t */
    private boolean f200347t = false;

    /* JADX INFO: renamed from: u */
    private boolean f200348u = false;

    /* JADX INFO: renamed from: v */
    protected long f200349v = 0;

    /* JADX INFO: renamed from: w */
    protected boolean f200350w = false;

    /* JADX INFO: renamed from: x */
    protected int f200351x = 20;

    /* JADX INFO: renamed from: y */
    private boolean f200352y = false;

    /* JADX INFO: renamed from: z */
    private mw00 f200353z = null;

    /* JADX INFO: renamed from: A */
    private int f200305A = 0;

    /* JADX INFO: renamed from: B */
    private int f200306B = 0;

    /* JADX INFO: renamed from: C */
    private int f200307C = 0;

    /* JADX INFO: renamed from: D */
    private int f200308D = 0;

    /* JADX INFO: renamed from: E */
    protected boolean f200309E = false;

    /* JADX INFO: renamed from: H */
    protected long f200312H = 0;

    /* JADX INFO: renamed from: I */
    protected int f200313I = 0;

    /* JADX INFO: renamed from: J */
    protected int f200314J = 0;

    /* JADX INFO: renamed from: L */
    public int f200316L = 30;

    /* JADX INFO: renamed from: O */
    long f200319O = 0;

    /* JADX INFO: renamed from: P */
    int f200320P = 0;

    /* JADX INFO: renamed from: Q */
    int f200321Q = 0;

    /* JADX INFO: renamed from: R */
    public int f200322R = 0;

    /* JADX INFO: renamed from: W */
    Object f200327W = new Object();

    /* JADX INFO: renamed from: l.yw00$a */
    public interface InterfaceC21548a {
        /* JADX INFO: renamed from: a */
        sie mo128338a();

        /* JADX INFO: renamed from: b */
        boolean mo128340b();

        /* JADX INFO: renamed from: c */
        void mo128342c();

        /* JADX INFO: renamed from: d */
        void mo128344d();

        /* JADX INFO: renamed from: e */
        void mo128346e(int i, int i2);

        /* JADX INFO: renamed from: f */
        void mo128348f(yw00 yw00Var, pjw pjwVar);

        /* JADX INFO: renamed from: h */
        void mo128350h(yw00 yw00Var);

        /* JADX INFO: renamed from: i */
        Object mo128352i();

        /* JADX INFO: renamed from: j */
        void mo128354j(yw00 yw00Var);

        /* JADX INFO: renamed from: k */
        void mo128355k(yw00 yw00Var);

        /* JADX INFO: renamed from: l */
        void mo128357l(sie sieVar, yw00 yw00Var, pjw pjwVar);

        /* JADX INFO: renamed from: m */
        PipelineConcurrentHashMap<String, sie> mo128359m();

        /* JADX INFO: renamed from: n */
        void mo128361n(yw00 yw00Var);

        /* JADX INFO: renamed from: o */
        void mo128363o(yw00 yw00Var, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: p */
        boolean mo128364p();
    }

    /* JADX INFO: renamed from: l.yw00$b */
    public class C21549b extends Thread {

        /* JADX INFO: renamed from: a */
        protected final int f200354a;

        /* JADX INFO: renamed from: b */
        public boolean f200355b;

        public C21549b(String str) {
            super(str);
            this.f200354a = 100;
            this.f200355b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m216290a() {
            this.f200355b = true;
            try {
                join(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m216291b() {
            this.f200355b = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @RequiresApi(api = 17)
        public void run() {
            ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "RenderThread start ######################" + Thread.currentThread().getName());
            boolean zMo128364p = yw00.this.f200329b.mo128364p();
            yw00 yw00Var = yw00.this;
            if (!zMo128364p) {
                synchronized (yw00Var.f200335h) {
                    yw00.this.f200337j = true;
                    yw00.this.f200335h.notifyAll();
                }
                return;
            }
            synchronized (yw00Var.f200335h) {
                yw00.this.f200337j = true;
                yw00.this.f200335h.notifyAll();
            }
            do {
                if (yw00.this.f200346s) {
                    yw00.this.m216248E();
                }
                if (yw00.this.f200339l) {
                    yw00.this.m216284r();
                }
                yw00 yw00Var2 = yw00.this;
                if (yw00Var2.f200340m) {
                    yw00Var2.m216282p();
                }
                xxx.m211572F().m211588Q();
                synchronized (yw00.this.f200336i) {
                    if (!yw00.this.f200338k.booleanValue()) {
                        try {
                            yw00.this.f200336i.wait(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (be80.f75125a && yw00.this.f200344q.contains("TextureInput")) {
                        ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>>" + yw00.this.f200338k);
                    }
                    if (yw00.this.f200338k.booleanValue()) {
                        yw00 yw00Var3 = yw00.this;
                        if (yw00Var3.f200331d == null) {
                            yw00Var3.f200338k = Boolean.TRUE;
                        } else {
                            yw00Var3.f200338k = Boolean.FALSE;
                        }
                        yw00Var3.m216285s();
                    } else {
                        xxx.m211572F().m211589R();
                    }
                }
            } while (!this.f200355b);
            yw00.this.m216256v();
            yw00.this.m216258x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public void m216248E() {
        Object obj;
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "resumeRender");
        if (this.f200347t) {
            m216257w();
        } else {
            sie sieVar = this.f200331d;
            if (sieVar != null && (obj = this.f200334g) != null && sieVar.m184326a(obj) < 0) {
                Log.e("MomoSurfaceRender", "zhangjl creatEglSurface error");
            }
        }
        this.f200346s = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: v */
    public void m216256v() {
        ii70.m136344d().m136348c("render", "releaseEgl ######################");
        try {
            sie sieVar = this.f200331d;
            if (sieVar != null) {
                sieVar.m184333i();
            }
        } catch (Exception unused) {
        }
        SurfaceTexture surfaceTexture = this.f200325U;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        sie.m184325k(this.f200326V);
        List<MomoCodec> list = this.f200330c;
        if (list != null) {
            Iterator<MomoCodec> it = list.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        }
        InterfaceC21548a interfaceC21548a = this.f200329b;
        if (interfaceC21548a != null) {
            interfaceC21548a.mo128354j(this);
            this.f200329b.mo128355k(this);
        }
        sie sieVar2 = this.f200331d;
        if (sieVar2 != null) {
            sieVar2.m184334j();
            this.f200331d = null;
        }
        this.f200353z = null;
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "releaseEgl ######################" + Thread.currentThread().getName());
    }

    /* JADX INFO: renamed from: w */
    private void m216257w() {
        if (this.f200331d != null) {
            InterfaceC21548a interfaceC21548a = this.f200329b;
            if (interfaceC21548a != null) {
                interfaceC21548a.mo128354j(this);
            }
            this.f200331d.m184334j();
            this.f200331d = null;
            this.f200347t = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public void m216258x() {
        XEEngineHelper.destroy();
    }

    /* JADX INFO: renamed from: A */
    public void m216259A(pjw pjwVar, Runnable runnable, Runnable runnable2) {
        if (this.f200309E || this.f200338k.booleanValue()) {
            return;
        }
        synchronized (this.f200336i) {
            runnable2.run();
            this.f200345r = runnable;
            this.f200341n = pjwVar;
            this.f200338k = Boolean.TRUE;
            this.f200336i.notifyAll();
        }
    }

    /* JADX INFO: renamed from: B */
    public void m216260B(MomoCodec momoCodec) {
        synchronized (this.f200329b.mo128352i()) {
            try {
                if (this.f200329b != null && momoCodec != null) {
                    if (momoCodec.getFilter() != null) {
                        momoCodec.getFilter().releaseFrameBuffer();
                    }
                    sie sieVar = this.f200329b.mo128359m().get(momoCodec.toString());
                    if (sieVar != null) {
                        sieVar.m184334j();
                    }
                    this.f200329b.mo128359m().remove(momoCodec.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m216261C(MomoCodec momoCodec) {
        synchronized (this.f200329b.mo128352i()) {
            try {
                InterfaceC21548a interfaceC21548a = this.f200329b;
                if (interfaceC21548a != null && momoCodec != null) {
                    sie sieVar = interfaceC21548a.mo128359m().get(momoCodec.toString());
                    if (sieVar != null) {
                        sieVar.m184334j();
                    }
                    this.f200329b.mo128359m().remove(momoCodec.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m216262D() {
        this.f200352y = false;
    }

    /* JADX INFO: renamed from: F */
    public void m216263F(Object obj) {
        this.f200334g = obj;
        this.f200339l = true;
        this.f200346s = true;
        this.f200347t = false;
        this.f200309E = false;
        eyx.m118802c().m118808g("MomosurfaceRender resumeRender");
    }

    /* JADX INFO: renamed from: G */
    public void m216264G(Object obj) {
        this.f200334g = obj;
        this.f200339l = true;
        this.f200347t = true;
        this.f200346s = true;
        this.f200309E = false;
        eyx.m118802c().m118808g("MomosurfaceRender resumeRenderEx");
    }

    /* JADX INFO: renamed from: H */
    public void m216265H(Object obj) {
        this.f200334g = obj;
        this.f200339l = true;
        this.f200347t = false;
        this.f200346s = true;
        this.f200309E = false;
        Runnable runnable = this.f200345r;
        if (runnable != null) {
            runnable.run();
            this.f200345r = null;
        }
        eyx.m118802c().m118808g("MomosurfaceRender resumeRenderrepairBlack screenTexture" + obj);
    }

    /* JADX INFO: renamed from: I */
    public void m216266I(int i) {
        this.f200351x = i;
    }

    /* JADX INFO: renamed from: J */
    public void m216267J(InterfaceC21548a interfaceC21548a) {
        this.f200329b = interfaceC21548a;
    }

    /* JADX INFO: renamed from: K */
    public void m216268K(String str) {
        this.f200344q = str;
    }

    /* JADX INFO: renamed from: L */
    public void m216269L() {
        List<MomoCodec> list = this.f200330c;
        if (list == null || list.size() == 0) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "start fail");
        } else {
            if (this.f200340m) {
                return;
            }
            this.f200340m = true;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m216270M() {
        List<MomoCodec> list = this.f200330c;
        if (list == null || list.size() == 0) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "start fail");
        } else {
            if (this.f200340m) {
                return;
            }
            this.f200340m = true;
        }
    }

    /* JADX INFO: renamed from: N */
    public void m216271N(Object obj) {
        synchronized (this.f200335h) {
            this.f200339l = true;
            this.f200334g = obj;
        }
    }

    /* JADX INFO: renamed from: O */
    public void m216272O() {
        this.f200340m = false;
    }

    /* JADX INFO: renamed from: P */
    public void m216273P(int i, int i2) {
        int i3 = this.f200305A;
        if ((i3 != i2 || this.f200306B != i) && i3 != 0 && this.f200306B != 0 && this.f200307C <= 0) {
            this.f200307C = 5;
        }
        this.f200305A = i2;
        this.f200306B = i;
    }

    /* JADX INFO: renamed from: h */
    public void m216274h(MomoCodec momoCodec) {
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "addMomoCodec");
        if (this.f200330c != null) {
            synchronized (this.f200329b.mo128352i()) {
                this.f200330c.add(momoCodec);
            }
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "addMomoCodecs" + this.f200330c.size());
        }
    }

    /* JADX INFO: renamed from: i */
    public void m216275i(mw00 mw00Var) {
        this.f200353z = mw00Var;
    }

    /* JADX INFO: renamed from: j */
    public void m216276j() {
        C21549b c21549b = this.f200328a;
        if (c21549b != null) {
            this.f200338k = Boolean.FALSE;
            this.f200346s = false;
            this.f200339l = false;
            this.f200340m = false;
            c21549b.m216290a();
            this.f200328a = null;
            this.f200334g = null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m216277k() {
        if (this.f200328a != null) {
            this.f200338k = Boolean.FALSE;
            this.f200346s = false;
            this.f200339l = false;
            this.f200340m = false;
            this.f200330c.clear();
            InterfaceC21548a interfaceC21548a = this.f200329b;
            if (interfaceC21548a != null) {
                interfaceC21548a.mo128361n(this);
            }
            this.f200328a.m216291b();
            this.f200328a = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public EGLContext m216278l() {
        sie sieVar = this.f200332e;
        if (sieVar != null) {
            return sieVar.f164706c;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public String m216279m() {
        return this.f200344q;
    }

    /* JADX INFO: renamed from: n */
    public int m216280n() {
        return this.f200308D;
    }

    /* JADX INFO: renamed from: o */
    public SurfaceTexture m216281o() {
        if (this.f200325U == null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.f200326V = iArr[0];
            this.f200325U = new SurfaceTexture(this.f200326V);
        }
        return this.f200325U;
    }

    @RequiresApi(api = 17)
    /* JADX INFO: renamed from: p */
    public void m216282p() {
        synchronized (this.f200329b.mo128352i()) {
            if (this.f200332e != null && this.f200329b != null && this.f200330c.size() > this.f200329b.mo128359m().size()) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "initCodecRender" + this.f200330c.size() + "size map" + this.f200329b.mo128359m().size());
                for (MomoCodec momoCodec : this.f200330c) {
                    if (!(momoCodec instanceof qye) && this.f200329b.mo128359m().get(momoCodec.toString()) == null) {
                        try {
                            if (momoCodec.mo19660e0() != null && this.f200332e.f164706c != null) {
                                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "initCodecRender" + Thread.currentThread().getName() + momoCodec.mo19660e0().toString());
                                sie sieVar = new sie(this.f200329b.mo128340b());
                                sieVar.m184329d(this.f200332e.f164706c, momoCodec.mo19660e0());
                                this.f200329b.mo128359m().put(momoCodec.toString(), sieVar);
                            }
                        } catch (Exception e) {
                            eyx.m118802c().m118808g("initCodecRender:" + e.toString());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m216283q() {
        InterfaceC21548a interfaceC21548a = this.f200329b;
        if (interfaceC21548a != null) {
            if (this.f200331d == null) {
                this.f200332e = interfaceC21548a.mo128338a();
            }
            if (this.f200331d != null || this.f200332e == null) {
                return;
            }
            try {
                sie sieVar = new sie(this.f200329b.mo128340b());
                this.f200331d = sieVar;
                EGLContext eGLContext = this.f200329b.mo128338a().f164706c;
                Object objM216281o = this.f200334g;
                if (objM216281o == null) {
                    objM216281o = m216281o();
                }
                sieVar.m184330e(eGLContext, objM216281o);
            } catch (Exception e) {
                eyx.m118802c().m118808g("initGloableRender" + e.toString());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m216284r() {
        m216283q();
        InterfaceC21548a interfaceC21548a = this.f200329b;
        if (interfaceC21548a != null) {
            interfaceC21548a.mo128350h(this);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m216285s() {
        pjw pjwVar;
        long j;
        long j2;
        int i;
        boolean z;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = this.f200345r;
            if (runnable != null) {
                try {
                    runnable.run();
                    this.f200345r = null;
                } catch (Throwable th) {
                    th = th;
                    pjwVar = null;
                }
            }
            long j3 = 1000 / ((long) this.f200351x);
            long j4 = this.f200349v;
            long j5 = jCurrentTimeMillis - j4;
            if (j5 < j3) {
                this.f200350w = true;
            } else {
                if (j4 == 0 || j5 > 5 * j3) {
                    this.f200349v = System.currentTimeMillis();
                } else {
                    this.f200349v = j4 + j3;
                }
                this.f200342o++;
                this.f200350w = false;
            }
            if (!this.f200352y) {
                this.f200352y = true;
                mw00 mw00Var = this.f200353z;
                if (mw00Var != null) {
                    mw00Var.mo140677a();
                }
            }
            if (be80.f75125a && this.f200344q.contains("TextureInput")) {
                ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>> onDrawFrame1111111" + this.f200331d + " 11" + this.f200334g);
            }
            sie sieVar = this.f200331d;
            if (sieVar != null) {
                int iM184332h = sieVar.m184332h();
                int iM184331g = this.f200331d.m184331g();
                int i2 = this.f200323S;
                if (!(iM184331g == i2 && iM184332h == this.f200324T) && i2 > 0) {
                    this.f200329b.mo128346e(iM184331g, iM184332h);
                    z = true;
                } else {
                    z = false;
                }
                this.f200323S = iM184331g;
                this.f200324T = iM184332h;
                if (((iM184331g >> 2) << 2) == ((this.f200306B >> 2) << 2) && ((iM184332h >> 2) << 2) == ((this.f200305A >> 2) << 2)) {
                    this.f200307C = 0;
                }
                if (be80.f75125a && this.f200344q.contains("TextureInput")) {
                    ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", ">>>>>>>>>> " + this.f200329b);
                }
                if (this.f200329b != null) {
                    int i3 = this.f200307C;
                    this.f200307C = i3 - 1;
                    if (i3 > 0) {
                        return;
                    }
                    this.f200307C = 0;
                    if (this.f200331d.m184333i()) {
                        this.f200329b.mo128357l(this.f200331d, this, this.f200341n);
                        try {
                            this.f200331d.m184335l();
                        } catch (Exception unused) {
                        }
                    }
                }
                if (z) {
                    this.f200329b.mo128344d();
                }
                ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", "SwapBuffer Now" + Thread.currentThread().getName());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            InterfaceC21548a interfaceC21548a = this.f200329b;
            if (interfaceC21548a == null || !this.f200340m || this.f200350w) {
                j = 1000000;
                j2 = 1;
            } else {
                interfaceC21548a.mo128348f(this, this.f200341n);
                this.f200320P++;
                long jNanoTime = System.nanoTime() / 1000;
                this.f200317M = jNanoTime;
                int i4 = this.f200320P;
                if (i4 > 3) {
                    j = 1000000;
                    j2 = 1;
                    this.f200321Q = (int) (((long) this.f200321Q) + (jNanoTime - this.f200318N));
                    this.f200319O++;
                } else {
                    j = 1000000;
                    j2 = 1;
                }
                if (i4 > 20) {
                    long j6 = ((long) this.f200321Q) / this.f200319O;
                    if (j6 > 0) {
                        this.f200322R = (int) ((j / j6) + j2);
                    }
                    this.f200319O = 0L;
                    this.f200318N = 0L;
                    this.f200317M = 0L;
                    this.f200321Q = 0;
                    this.f200320P = 0;
                }
                this.f200318N = this.f200317M;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (this.f200342o == 1) {
                this.f200329b.mo128342c();
            }
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            this.f200313I++;
            long jNanoTime2 = System.nanoTime() / 1000;
            this.f200310F = jNanoTime2;
            int i5 = this.f200313I;
            if (i5 > 3) {
                this.f200314J = (int) (((long) this.f200314J) + (jNanoTime2 - this.f200311G));
                this.f200312H += j2;
            }
            if (i5 > 20) {
                long j7 = ((long) this.f200314J) / this.f200312H;
                if (j7 > 0) {
                    this.f200315K = (int) ((j / j7) + j2);
                }
                int i6 = this.f200315K;
                if (i6 > 0) {
                    this.f200316L = 1000 / i6;
                }
                this.f200312H = 0L;
                this.f200311G = 0L;
                this.f200310F = 0L;
                i = 0;
                this.f200314J = 0;
                this.f200313I = 0;
            } else {
                i = 0;
            }
            this.f200311G = this.f200310F;
            InterfaceC21548a interfaceC21548a2 = this.f200329b;
            if (interfaceC21548a2 != null) {
                int i7 = (int) (jCurrentTimeMillis4 - jCurrentTimeMillis);
                int i8 = (int) (jCurrentTimeMillis3 - jCurrentTimeMillis2);
                int i9 = this.f200315K;
                if (i7 < 0) {
                    i7 = i;
                }
                interfaceC21548a2.mo128363o(this, i9, i7, i8 < 0 ? i : i8, this.f200322R);
                return;
            }
            return;
        } catch (Throwable th2) {
            th = th2;
            pjwVar = null;
        }
        m216289z(pjwVar);
        th.printStackTrace();
    }

    /* JADX INFO: renamed from: t */
    public void m216286t() {
        this.f200346s = false;
        this.f200309E = true;
        this.f200339l = false;
        this.f200338k = Boolean.FALSE;
        eyx.m118802c().m118808g("MomosurfaceRender pauseRender");
    }

    /* JADX INFO: renamed from: u */
    public void m216287u() {
        if (this.f200328a == null) {
            this.f200330c = new CopyOnWriteArrayList();
            C21549b c21549b = new C21549b("live-media-MRender");
            this.f200328a = c21549b;
            c21549b.setPriority(10);
            this.f200328a.start();
        }
        synchronized (this.f200335h) {
            try {
                this.f200335h.wait(3000L);
            } catch (InterruptedException e) {
                Log4Cam.m7322e(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m216288y(MomoCodec momoCodec) {
        if (this.f200330c != null) {
            synchronized (this.f200329b.mo128352i()) {
                this.f200330c.remove(momoCodec);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m216289z(pjw pjwVar) {
        if (this.f200309E || this.f200338k.booleanValue()) {
            return;
        }
        synchronized (this.f200336i) {
            this.f200341n = pjwVar;
            this.f200338k = Boolean.TRUE;
            this.f200336i.notifyAll();
        }
    }
}
