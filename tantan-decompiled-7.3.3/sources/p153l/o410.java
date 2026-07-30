package p153l;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.core.glcore.util.Log4Cam;
import com.momo.pipline.MomoInterface.MomoCodec;
import com.momo.pipline.meidautil.PipelineConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes8.dex */
public class o410 implements g510.InterfaceC17153a, q210.InterfaceC19500a, dpl.InterfaceC16599a {

    /* JADX INFO: renamed from: B */
    private static boolean f144878B = false;

    /* JADX INFO: renamed from: A */
    private InterfaceC19026f f144879A;

    /* JADX INFO: renamed from: b */
    private wej f144881b;

    /* JADX INFO: renamed from: e */
    protected PipelineConcurrentHashMap<String, wje> f144884e;

    /* JADX INFO: renamed from: k */
    protected g510 f144890k;

    /* JADX INFO: renamed from: l */
    private HandlerThread f144891l;

    /* JADX INFO: renamed from: m */
    private HandlerC19023c f144892m;

    /* JADX INFO: renamed from: n */
    private HandlerThread f144893n;

    /* JADX INFO: renamed from: o */
    private a410 f144894o;

    /* JADX INFO: renamed from: p */
    private InterfaceC19027g f144895p;

    /* JADX INFO: renamed from: q */
    private InterfaceC19024d f144896q;

    /* JADX INFO: renamed from: r */
    private InterfaceC19025e f144897r;

    /* JADX INFO: renamed from: u */
    private Object f144900u;

    /* JADX INFO: renamed from: v */
    fb1 f144901v;

    /* JADX INFO: renamed from: y */
    public suf f144904y;

    /* JADX INFO: renamed from: z */
    public suf f144905z;

    /* JADX INFO: renamed from: c */
    private boolean f144882c = false;

    /* JADX INFO: renamed from: s */
    private wje f144898s = null;

    /* JADX INFO: renamed from: t */
    private Object f144899t = new Object();

    /* JADX INFO: renamed from: w */
    private Object f144902w = new Object();

    /* JADX INFO: renamed from: x */
    private Object f144903x = new Object();

    /* JADX INFO: renamed from: a */
    private boolean f144880a = false;

    /* JADX INFO: renamed from: d */
    private List<MomoCodec> f144883d = new ArrayList();

    /* JADX INFO: renamed from: f */
    protected PipelineConcurrentHashMap<String, g510> f144885f = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    protected PipelineConcurrentHashMap<String, wej> f144886g = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    protected PipelineConcurrentHashMap<String, Queue<Runnable>> f144887h = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: i */
    protected PipelineConcurrentHashMap<String, Queue<Runnable>> f144888i = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    protected PipelineConcurrentHashMap<String, List<wej>> f144889j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.o410$a */
    public class RunnableC19021a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f144906a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ wej f144907b;

        public RunnableC19021a(String str, wej wejVar) {
            this.f144906a = str;
            this.f144907b = wejVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = (ArrayList) o410.this.f144889j.get(this.f144906a);
            if (arrayList != null) {
                arrayList.add(this.f144907b);
            }
        }
    }

    /* JADX INFO: renamed from: l.o410$b */
    public class RunnableC19022b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ g510 f144909a;

        public RunnableC19022b(g510 g510Var) {
            this.f144909a = g510Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o410.this.f144896q != null) {
                g510 g510Var = this.f144909a;
                o410 o410Var = o410.this;
                if (g510Var == o410Var.f144890k) {
                    o410Var.f144896q.mo128848a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.o410$c */
    public class HandlerC19023c extends Handler {

        /* JADX INFO: renamed from: a */
        private o410 f144911a;

        public HandlerC19023c(o410 o410Var, Looper looper) {
            super(looper);
            this.f144911a = o410Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "CmdHandler handleMessage what:" + message.what + ";msg.arg1:" + message.arg1 + ";;msg.arg2:" + message.arg2);
            int i = message.what;
            if (i == 100) {
                o410.this.m165912g0((uow) message.obj);
                return;
            }
            if (i == 101) {
                o410.this.m165914o0();
                return;
            }
            if (i == 700) {
                o410.this.m165912g0((uow) message.obj);
                return;
            }
            if (i == 800) {
                o410.this.m165952i0((MomoCodec) message.obj);
                return;
            }
            switch (i) {
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    o410.this.m165911f0((uow) message.obj);
                    break;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    o410.this.m165956n0();
                    break;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    o410.this.m165958r((String) message.obj, message.arg2);
                    break;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    o410.this.m165915t();
                    break;
                default:
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Unknown message type " + message.what);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: l.o410$d */
    public interface InterfaceC19024d {
        /* JADX INFO: renamed from: a */
        void mo128848a();

        /* JADX INFO: renamed from: b */
        void mo128849b();

        /* JADX INFO: renamed from: c */
        void mo128850c();

        /* JADX INFO: renamed from: d */
        void mo128851d(int i, int i2);
    }

    /* JADX INFO: renamed from: l.o410$e */
    public interface InterfaceC19025e {
        /* JADX INFO: renamed from: a */
        void mo128847a();
    }

    /* JADX INFO: renamed from: l.o410$f */
    public interface InterfaceC19026f {
        /* JADX INFO: renamed from: P0 */
        void mo20958P0(g510 g510Var, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: l.o410$g */
    public interface InterfaceC19027g {
        /* JADX INFO: renamed from: a */
        void mo128846a();
    }

    static {
        try {
            if (m165910K() < 23) {
                f144878B = true;
            }
            ylc0.m216566a(l26.f129743a, "mmcrypto");
            ylc0.m216566a(l26.f129743a, "mmssl");
            ylc0.m216566a(l26.f129743a, "cosmosffmpeg");
            ylc0.m216566a(l26.f129743a, "ijklivesdl");
            ylc0.m216566a(l26.f129743a, "ijkstreamer");
            ylc0.m216566a(l26.f129743a, "congressUtil");
            ylc0.m216566a(l26.f129743a, "apm-congressRender");
        } catch (Error e) {
            Log4Cam.printStackTrace(e);
        } catch (Exception e2) {
            Log4Cam.printStackTrace(e2);
        }
    }

    public o410() {
        HandlerThread handlerThread = new HandlerThread("RecordingEventHandle", 19);
        this.f144893n = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("RecordingCmdHandle", 19);
        this.f144891l = handlerThread2;
        handlerThread2.start();
        this.f144892m = new HandlerC19023c(this, this.f144891l.getLooper());
        a410 a410Var = new a410(this.f144893n.getLooper());
        this.f144894o = a410Var;
        b410.m102398b(a410Var);
    }

    /* JADX INFO: renamed from: K */
    public static int m165910K() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public void m165911f0(uow uowVar) {
        synchronized (this.f144902w) {
            try {
                if (this.f144883d.size() > 0) {
                    Iterator<MomoCodec> it = this.f144883d.iterator();
                    while (it.hasNext()) {
                        it.next().mo20663l0(uowVar, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g510 g510Var = this.f144890k;
        if (g510Var != null) {
            g510Var.m128984L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m165912g0(uow uowVar) {
        synchronized (this.f144902w) {
            try {
                if (this.f144883d.size() > 0) {
                    b7y.m102882c().m102888g(getClass() + " startRecord_l momoCodecList.size()" + this.f144883d.size());
                    Iterator<MomoCodec> it = this.f144883d.iterator();
                    while (it.hasNext()) {
                        it.next().mo20654R0(uowVar, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g510 g510Var = this.f144890k;
        if (g510Var != null) {
            g510Var.m128984L();
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m165913j0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo20646C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m165914o0() {
        g510 g510Var = this.f144890k;
        if (g510Var != null) {
            g510Var.m128987O();
        }
        synchronized (this.f144902w) {
            try {
                List<MomoCodec> list = this.f144883d;
                if (list == null || list.size() <= 0) {
                    mo165950g(16385, 0, 0, this);
                } else {
                    Iterator<MomoCodec> it = this.f144883d.iterator();
                    while (it.hasNext()) {
                        it.next().mo20661f();
                    }
                }
                this.f144883d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m165915t() {
        if (this.f144883d.size() > 0) {
            Iterator<MomoCodec> it = this.f144883d.iterator();
            while (it.hasNext()) {
                it.next().mo20665o();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m165921A(wej wejVar, String str) {
        m165941W(new RunnableC19021a(str, wejVar), str);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m165922B(wej wejVar) {
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            g510 g510VarM165928I = m165928I(wejVar);
            if (this.f144881b == null) {
                this.f144890k = g510VarM165928I;
                this.f144881b = wejVar;
                this.f144885f.put(wejVar.toString(), this.f144890k);
            } else {
                this.f144885f.put(wejVar.toString(), g510VarM165928I);
            }
            g510VarM165928I.m128982J(this);
            g510VarM165928I.m128983K(wejVar.toString());
            synchronized (this.f144886g) {
                this.f144886g.put(wejVar.toString(), wejVar);
            }
            this.f144888i.put(wejVar.toString(), linkedList2);
            this.f144887h.put(wejVar.toString(), linkedList);
            this.f144889j.put(wejVar.toString(), new ArrayList());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.dpl.InterfaceC16599a
    /* JADX INFO: renamed from: C */
    public oxd0 mo109339C(oxd0 oxd0Var) {
        fb1 fb1Var;
        if (this.f144883d.isEmpty() && (fb1Var = this.f144901v) != null) {
            fb1Var.mo19373C(oxd0Var);
            return oxd0Var;
        }
        for (MomoCodec momoCodec : new ArrayList(this.f144883d)) {
            if (this.f144880a && momoCodec != null) {
                momoCodec.mo20651K1(oxd0Var);
            }
        }
        return oxd0Var;
    }

    /* JADX INFO: renamed from: D */
    public void m165923D(g510 g510Var, MomoCodec momoCodec, uow uowVar) {
        synchronized (this.f144902w) {
            g510Var.m128989h(momoCodec);
            this.f144883d.add(momoCodec);
        }
        m165948d0(uowVar);
    }

    /* JADX INFO: renamed from: E */
    public synchronized void m165924E(wej wejVar) {
        g510 g510VarM165928I = m165928I(wejVar);
        g510VarM165928I.m128982J(this);
        this.f144881b = wejVar;
        this.f144890k = g510VarM165928I;
        this.f144885f.put(wejVar.toString(), this.f144890k);
        g510VarM165928I.m128983K(wejVar.toString());
        if (this.f144886g.get(wejVar.toString()) == null) {
            this.f144886g.put(wejVar.toString(), wejVar);
            LinkedList linkedList = new LinkedList();
            this.f144888i.put(wejVar.toString(), new LinkedList());
            this.f144887h.put(wejVar.toString(), linkedList);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m165925F(String str) {
        Queue<Runnable> queue = this.f144887h.get(str);
        if (queue != null) {
            synchronized (queue) {
                queue.clear();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m165926G() {
        Iterator<g510> it = this.f144885f.values().iterator();
        while (it.hasNext()) {
            it.next().m128991j();
        }
        synchronized (this.f144902w) {
            try {
                List<MomoCodec> list = this.f144883d;
                if (list != null && list.size() > 0) {
                    Iterator<MomoCodec> it2 = this.f144883d.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo20661f();
                    }
                }
                this.f144883d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        b410.m102398b(null);
        if (this.f144893n != null) {
            a410 a410Var = this.f144894o;
            if (a410Var != null) {
                a410Var.removeCallbacksAndMessages(null);
            }
            this.f144893n.quitSafely();
        }
        if (this.f144891l != null) {
            HandlerC19023c handlerC19023c = this.f144892m;
            if (handlerC19023c != null) {
                handlerC19023c.removeCallbacksAndMessages(null);
            }
            this.f144891l.quitSafely();
        }
        this.f144885f.clear();
    }

    /* JADX INFO: renamed from: H */
    public a410 m165927H() {
        return this.f144894o;
    }

    /* JADX INFO: renamed from: I */
    public g510 m165928I(wej wejVar) {
        g510 g510Var = this.f144885f.get(wejVar.toString());
        if (g510Var != null) {
            return g510Var;
        }
        g510 g510Var2 = new g510();
        g510Var2.m128982J(this);
        g510Var2.m128983K(g510Var2.toString());
        this.f144885f.put(wejVar.toString(), g510Var2);
        return g510Var2;
    }

    /* JADX INFO: renamed from: J */
    public g510 m165929J() {
        return this.f144890k;
    }

    /* JADX INFO: renamed from: L */
    public boolean m165930L() {
        return this.f144880a;
    }

    /* JADX INFO: renamed from: M */
    public synchronized void m165931M() {
        this.f144880a = false;
        this.f144900u = null;
        Iterator<g510> it = this.f144885f.values().iterator();
        while (it.hasNext()) {
            it.next().m129001t();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m165932N() {
        synchronized (this.f144886g) {
            try {
                g510 g510Var = this.f144890k;
                if (g510Var != null) {
                    g510Var.m128985M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m165933O(g510 g510Var) {
        if (g510Var == this.f144890k) {
            synchronized (this.f144902w) {
                try {
                    Iterator<wje> it = mo129016m().values().iterator();
                    while (it.hasNext()) {
                        it.next().m206638j();
                    }
                    mo129016m().clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m165934P(MomoCodec momoCodec) {
        synchronized (this.f144902w) {
            try {
                this.f144883d.remove(momoCodec);
                g510 g510Var = this.f144890k;
                if (g510Var != null) {
                    g510Var.m129003y(momoCodec);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m165935Q(Object obj) {
        try {
            this.f144880a = true;
            this.f144900u = obj;
            for (g510 g510Var : this.f144885f.values()) {
                if (g510Var == this.f144890k) {
                    g510Var.m128978F(this.f144900u);
                } else if (g510Var.m128995n() == 0) {
                    g510Var.m128978F(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m165936R(Object obj) {
        try {
            this.f144880a = true;
            this.f144900u = obj;
            for (g510 g510Var : this.f144885f.values()) {
                if (g510Var == this.f144890k) {
                    g510Var.m128979G(this.f144900u);
                } else if (g510Var.m128995n() == 0) {
                    g510Var.m128979G(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m165937S(Object obj) {
        try {
            this.f144880a = true;
            this.f144900u = obj;
            for (g510 g510Var : this.f144885f.values()) {
                if (g510Var == this.f144890k) {
                    g510Var.m128980H(this.f144900u);
                } else if (g510Var.m128995n() == 0) {
                    g510Var.m128980H(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m165938T(String str) {
        Queue<Runnable> queue = this.f144887h.get(str);
        if (queue != null) {
            try {
                synchronized (queue) {
                    while (!queue.isEmpty()) {
                        try {
                            Runnable runnablePoll = queue.poll();
                            if (runnablePoll != null) {
                                runnablePoll.run();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Exception unused) {
                Log.e("lqdebug", "runAll: " + str);
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public void m165939U(String str) {
        Queue<Runnable> queue = this.f144888i.get(str);
        if (queue != null) {
            try {
                synchronized (queue) {
                    while (!queue.isEmpty()) {
                        try {
                            Runnable runnablePoll = queue.poll();
                            if (runnablePoll != null) {
                                runnablePoll.run();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Exception unused) {
                Log.e("MomoProcessingPipeline", "runAllEnd: " + str);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void m165940V(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f144887h.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m165941W(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f144888i.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m165942X(fb1 fb1Var) {
        this.f144901v = fb1Var;
    }

    /* JADX INFO: renamed from: Y */
    public void m165943Y(InterfaceC19024d interfaceC19024d) {
        this.f144896q = interfaceC19024d;
    }

    /* JADX INFO: renamed from: Z */
    public void m165944Z(InterfaceC19025e interfaceC19025e) {
        this.f144897r = interfaceC19025e;
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: a */
    public wje mo129005a() {
        synchronized (this.f144899t) {
            try {
                if (this.f144898s == null) {
                    this.f144898s = new wje(this.f144882c);
                    this.f144898s.m206632c(wje.m206628f());
                }
            } catch (Exception e) {
                b7y.m102882c().m102888g("getDummyScreen:" + e.toString());
            }
        }
        return this.f144898s;
    }

    /* JADX INFO: renamed from: a0 */
    public void m165945a0(suf sufVar) {
        this.f144904y = sufVar;
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: b */
    public boolean mo129006b() {
        return this.f144882c;
    }

    /* JADX INFO: renamed from: b0 */
    public void m165946b0(InterfaceC19026f interfaceC19026f) {
        this.f144879A = interfaceC19026f;
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: c */
    public void mo129007c() {
        InterfaceC19027g interfaceC19027g = this.f144895p;
        if (interfaceC19027g != null) {
            interfaceC19027g.mo128846a();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m165947c0(InterfaceC19027g interfaceC19027g) {
        this.f144895p = interfaceC19027g;
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: d */
    public void mo129008d() {
        InterfaceC19024d interfaceC19024d = this.f144896q;
        if (interfaceC19024d != null) {
            interfaceC19024d.mo128849b();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m165948d0(uow uowVar) {
        this.f144892m.removeMessages(100);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(100, 0, 0, uowVar));
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: e */
    public void mo129009e(int i, int i2) {
        if (this.f144896q != null) {
            oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "elgRenderSizewidth" + i + "height" + i2);
            this.f144896q.mo128851d(i, i2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m165949e0(uow uowVar) {
        this.f144892m.removeMessages(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 0, 0, uowVar));
    }

    @Override // p153l.g510.InterfaceC17153a
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: f */
    public void mo129010f(g510 g510Var, omw omwVar) {
        if (this.f144890k == g510Var) {
            synchronized (this.f144902w) {
                try {
                    for (MomoCodec momoCodec : this.f144883d) {
                        wje wjeVar = mo129016m().get(momoCodec.toString());
                        if (wjeVar != null && wjeVar.m206637i()) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            momoCodec.mo20652M1();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            oq70 oq70VarM168791d = oq70.m168791d();
                            StringBuilder sb = new StringBuilder();
                            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                            sb.append(j);
                            sb.append(" 111111111111 ");
                            sb.append(momoCodec.getClass().getSimpleName());
                            sb.append(" index ");
                            sb.append(0);
                            oq70VarM168791d.m168796f("Pipeline_Normal_pip->PIPLINE", sb.toString());
                            wjeVar.m206639l();
                            oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", j + " 222222222222 " + momoCodec.getClass().getSimpleName() + " index 0");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m165939U(g510Var.m128994m());
    }

    @Override // p153l.q210.InterfaceC19500a
    /* JADX INFO: renamed from: g */
    public void mo165950g(int i, int i2, int i3, Object obj) {
        a410 a410Var = this.f144894o;
        if (a410Var != null) {
            this.f144894o.sendMessage(a410Var.obtainMessage(i, i2, i3, obj));
        }
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: h */
    public void mo129011h(g510 g510Var) {
        if (g510Var == this.f144890k) {
            m165940V(new RunnableC19022b(g510Var), g510Var.m128994m());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public synchronized void m165951h0(Object obj) {
        if (this.f144881b != null) {
            this.f144880a = true;
            this.f144900u = obj;
            this.f144890k.m128986N(obj);
            this.f144890k.m129002u();
        }
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: i */
    public Object mo129012i() {
        return this.f144902w;
    }

    /* JADX INFO: renamed from: i0 */
    public void m165952i0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo20657b0();
        }
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: j */
    public void mo129013j(g510 g510Var) {
        InterfaceC19025e interfaceC19025e;
        if (g510Var != this.f144890k || (interfaceC19025e = this.f144897r) == null) {
            return;
        }
        interfaceC19025e.mo128847a();
        sej.m185545d().m185546a();
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: k */
    public void mo129014k(g510 g510Var) {
        synchronized (this.f144886g) {
            try {
                g510 g510VarRemove = this.f144885f.remove(g510Var.m128994m());
                if (g510VarRemove == null) {
                    oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "onDestory" + g510VarRemove + "bugs");
                }
                wej wejVarRemove = this.f144886g.remove(g510Var.m128994m());
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "Render to destory" + wejVarRemove);
                if (wejVarRemove != null) {
                    wejVarRemove.destroy();
                }
                m165939U(g510Var.m128994m());
                m165925F(g510Var.m128994m());
                this.f144888i.remove(g510Var.m128994m());
                this.f144887h.remove(g510Var.m128994m());
                oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "mRootInputMap size" + this.f144886g.size());
                if (this.f144886g.size() == 0) {
                    InterfaceC19024d interfaceC19024d = this.f144896q;
                    if (interfaceC19024d != null) {
                        interfaceC19024d.mo128850c();
                    }
                    synchronized (this.f144902w) {
                        try {
                            if (mo129016m() != null) {
                                for (wje wjeVar : mo129016m().values()) {
                                    wjeVar.m206638j();
                                    wjeVar.f189439c = null;
                                }
                            }
                            this.f144884e.clear();
                            this.f144884e = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f144890k = null;
                    this.f144881b = null;
                    synchronized (this.f144899t) {
                        try {
                            wje wjeVar2 = this.f144898s;
                            if (wjeVar2 != null) {
                                wjeVar2.m206638j();
                                this.f144898s = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f144889j) {
            try {
                Iterator<List<wej>> it = this.f144889j.values().iterator();
                while (it.hasNext()) {
                    for (wej wejVar : it.next()) {
                        if (wejVar != null) {
                            wejVar.destroy();
                        }
                    }
                }
                this.f144889j.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m165953k0() {
        this.f144892m.removeMessages(101);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(101, 0, 0, null));
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: l */
    public void mo129015l(wje wjeVar, g510 g510Var, omw omwVar) {
        wej wejVar;
        m165938T(g510Var.m128994m());
        if (sej.m185545d().m185549e()) {
            sej.m185545d().m185546a();
            sej.m185545d().m185550f(false);
        }
        if (m165930L()) {
            suf sufVar = this.f144904y;
            if (sufVar != null && omwVar != null) {
                sufVar.setMMCVInfo(omwVar);
            }
            suf sufVar2 = this.f144905z;
            if (sufVar2 != null && omwVar != null) {
                sufVar2.setMMCVInfo(omwVar);
            }
            synchronized (this.f144886g) {
                wejVar = this.f144886g.get(g510Var.m128994m());
            }
            if (f144878B) {
                synchronized (this.f144903x) {
                    if (wejVar != null) {
                        try {
                            wejVar.onDrawFrame();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else if (wejVar != null) {
                wejVar.onDrawFrame();
            }
        }
        List<MomoCodec> list = this.f144883d;
        if (list == null || list.size() == 0 || this.f144890k != g510Var) {
            m165939U(g510Var.m128994m());
        }
        ArrayList<wej> arrayList = (ArrayList) this.f144889j.get(g510Var.m128994m());
        if (arrayList != null) {
            for (wej wejVar2 : arrayList) {
                if (wejVar2 != null) {
                    wejVar2.destroy();
                }
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m165954l0(MomoCodec momoCodec) {
        m165913j0(momoCodec);
        this.f144892m.removeMessages(800);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(800, 0, 0, momoCodec));
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: m */
    public PipelineConcurrentHashMap<String, wje> mo129016m() {
        synchronized (this.f144902w) {
            try {
                if (this.f144884e == null) {
                    this.f144884e = new PipelineConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f144884e;
    }

    /* JADX INFO: renamed from: m0 */
    public void m165955m0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo20645A();
        }
        this.f144892m.removeMessages(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 0, 0, null));
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: n */
    public void mo129017n(g510 g510Var) {
        PipelineConcurrentHashMap<String, g510> pipelineConcurrentHashMap = this.f144885f;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.remove(g510Var.m128994m());
            this.f144886g.remove(g510Var.m128994m());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m165956n0() {
        g510 g510Var = this.f144890k;
        if (g510Var != null) {
            g510Var.m128987O();
        }
        synchronized (this.f144902w) {
            try {
                List<MomoCodec> list = this.f144883d;
                if (list == null || list.size() <= 0) {
                    mo165950g(16385, 0, 0, this);
                } else {
                    Iterator<MomoCodec> it = this.f144883d.iterator();
                    while (it.hasNext()) {
                        it.next().mo20645A();
                    }
                }
                this.f144883d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: o */
    public void mo129018o(g510 g510Var, int i, int i2, int i3, int i4) {
        oq70.m168791d().m168796f("Pipeline_Normal_pip->PIPLINE", "FPS:" + i + "renderUse" + i2 + "codecUse" + i3 + "renderKey" + g510Var.toString() + "codecFps:" + i4);
        InterfaceC19026f interfaceC19026f = this.f144879A;
        if (interfaceC19026f != null) {
            interfaceC19026f.mo20958P0(g510Var, i, i2, i3, i4);
        }
    }

    @Override // p153l.g510.InterfaceC17153a
    /* JADX INFO: renamed from: p */
    public boolean mo129019p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m165957q(String str, int i) {
        this.f144892m.removeMessages(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 0, i, str));
    }

    /* JADX INFO: renamed from: r */
    public void m165958r(String str, int i) {
        synchronized (this.f144902w) {
            try {
                if (this.f144883d.size() > 0) {
                    Iterator<MomoCodec> it = this.f144883d.iterator();
                    while (it.hasNext()) {
                        it.next().mo20667p(str, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m165959s() {
        this.f144892m.removeMessages(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        this.f144892m.sendMessage(this.f144892m.obtainMessage(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 0, 0, null));
    }

    /* JADX INFO: renamed from: z */
    public void m165960z(g510 g510Var, MomoCodec momoCodec) {
        synchronized (this.f144902w) {
            if (g510Var != null) {
                try {
                    g510Var.m128989h(momoCodec);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f144883d.add(momoCodec);
        }
    }
}
