package p149l;

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

/* JADX INFO: loaded from: classes7.dex */
public class gw00 implements yw00.InterfaceC21548a, hu00.InterfaceC17392a, sml.InterfaceC19992a {

    /* JADX INFO: renamed from: B */
    private static boolean f104617B = false;

    /* JADX INFO: renamed from: A */
    private InterfaceC17174f f104618A;

    /* JADX INFO: renamed from: b */
    private ccj f104620b;

    /* JADX INFO: renamed from: e */
    protected PipelineConcurrentHashMap<String, sie> f104623e;

    /* JADX INFO: renamed from: k */
    protected yw00 f104629k;

    /* JADX INFO: renamed from: l */
    private HandlerThread f104630l;

    /* JADX INFO: renamed from: m */
    private HandlerC17171c f104631m;

    /* JADX INFO: renamed from: n */
    private HandlerThread f104632n;

    /* JADX INFO: renamed from: o */
    private sv00 f104633o;

    /* JADX INFO: renamed from: p */
    private InterfaceC17175g f104634p;

    /* JADX INFO: renamed from: q */
    private InterfaceC17172d f104635q;

    /* JADX INFO: renamed from: r */
    private InterfaceC17173e f104636r;

    /* JADX INFO: renamed from: u */
    private Object f104639u;

    /* JADX INFO: renamed from: v */
    ya1 f104640v;

    /* JADX INFO: renamed from: y */
    public etf f104643y;

    /* JADX INFO: renamed from: z */
    public etf f104644z;

    /* JADX INFO: renamed from: c */
    private boolean f104621c = false;

    /* JADX INFO: renamed from: s */
    private sie f104637s = null;

    /* JADX INFO: renamed from: t */
    private Object f104638t = new Object();

    /* JADX INFO: renamed from: w */
    private Object f104641w = new Object();

    /* JADX INFO: renamed from: x */
    private Object f104642x = new Object();

    /* JADX INFO: renamed from: a */
    private boolean f104619a = false;

    /* JADX INFO: renamed from: d */
    private List<MomoCodec> f104622d = new ArrayList();

    /* JADX INFO: renamed from: f */
    protected PipelineConcurrentHashMap<String, yw00> f104624f = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    protected PipelineConcurrentHashMap<String, ccj> f104625g = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    protected PipelineConcurrentHashMap<String, Queue<Runnable>> f104626h = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: i */
    protected PipelineConcurrentHashMap<String, Queue<Runnable>> f104627i = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: j */
    protected PipelineConcurrentHashMap<String, List<ccj>> f104628j = new PipelineConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.gw00$a */
    public class RunnableC17169a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f104645a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ccj f104646b;

        public RunnableC17169a(String str, ccj ccjVar) {
            this.f104645a = str;
            this.f104646b = ccjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = (ArrayList) gw00.this.f104628j.get(this.f104645a);
            if (arrayList != null) {
                arrayList.add(this.f104646b);
            }
        }
    }

    /* JADX INFO: renamed from: l.gw00$b */
    public class RunnableC17170b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ yw00 f104648a;

        public RunnableC17170b(yw00 yw00Var) {
            this.f104648a = yw00Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (gw00.this.f104635q != null) {
                yw00 yw00Var = this.f104648a;
                gw00 gw00Var = gw00.this;
                if (yw00Var == gw00Var.f104629k) {
                    gw00Var.f104635q.mo128369a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.gw00$c */
    public class HandlerC17171c extends Handler {

        /* JADX INFO: renamed from: a */
        private gw00 f104650a;

        public HandlerC17171c(gw00 gw00Var, Looper looper) {
            super(looper);
            this.f104650a = gw00Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "CmdHandler handleMessage what:" + message.what + ";msg.arg1:" + message.arg1 + ";;msg.arg2:" + message.arg2);
            int i = message.what;
            if (i == 100) {
                gw00.this.m128304g0((vlw) message.obj);
                return;
            }
            if (i == 101) {
                gw00.this.m128306o0();
                return;
            }
            if (i == 700) {
                gw00.this.m128304g0((vlw) message.obj);
                return;
            }
            if (i == 800) {
                gw00.this.m128353i0((MomoCodec) message.obj);
                return;
            }
            switch (i) {
                case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                    gw00.this.m128303f0((vlw) message.obj);
                    break;
                case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                    gw00.this.m128362n0();
                    break;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                    gw00.this.m128366r((String) message.obj, message.arg2);
                    break;
                case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                    gw00.this.m128307t();
                    break;
                default:
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Unknown message type " + message.what);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: l.gw00$d */
    public interface InterfaceC17172d {
        /* JADX INFO: renamed from: a */
        void mo128369a();

        /* JADX INFO: renamed from: b */
        void mo128370b();

        /* JADX INFO: renamed from: c */
        void mo128371c();

        /* JADX INFO: renamed from: d */
        void mo128372d(int i, int i2);
    }

    /* JADX INFO: renamed from: l.gw00$e */
    public interface InterfaceC17173e {
        /* JADX INFO: renamed from: a */
        void mo128373a();
    }

    /* JADX INFO: renamed from: l.gw00$f */
    public interface InterfaceC17174f {
        /* JADX INFO: renamed from: P0 */
        void mo19959P0(yw00 yw00Var, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: l.gw00$g */
    public interface InterfaceC17175g {
        /* JADX INFO: renamed from: a */
        void mo128374a();
    }

    static {
        try {
            if (m128302K() < 23) {
                f104617B = true;
            }
            rdc0.m178959a(g16.f100119a, "mmcrypto");
            rdc0.m178959a(g16.f100119a, "mmssl");
            rdc0.m178959a(g16.f100119a, "cosmosffmpeg");
            rdc0.m178959a(g16.f100119a, "ijklivesdl");
            rdc0.m178959a(g16.f100119a, "ijkstreamer");
            rdc0.m178959a(g16.f100119a, "congressUtil");
            rdc0.m178959a(g16.f100119a, "apm-congressRender");
        } catch (Error e) {
            Log4Cam.printStackTrace(e);
        } catch (Exception e2) {
            Log4Cam.printStackTrace(e2);
        }
    }

    public gw00() {
        HandlerThread handlerThread = new HandlerThread("RecordingEventHandle", 19);
        this.f104632n = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("RecordingCmdHandle", 19);
        this.f104630l = handlerThread2;
        handlerThread2.start();
        this.f104631m = new HandlerC17171c(this, this.f104630l.getLooper());
        sv00 sv00Var = new sv00(this.f104632n.getLooper());
        this.f104633o = sv00Var;
        tv00.m190719b(sv00Var);
    }

    /* JADX INFO: renamed from: K */
    public static int m128302K() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public void m128303f0(vlw vlwVar) {
        synchronized (this.f104641w) {
            try {
                if (this.f104622d.size() > 0) {
                    Iterator<MomoCodec> it = this.f104622d.iterator();
                    while (it.hasNext()) {
                        it.next().mo19664l0(vlwVar, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yw00 yw00Var = this.f104629k;
        if (yw00Var != null) {
            yw00Var.m216269L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public void m128304g0(vlw vlwVar) {
        synchronized (this.f104641w) {
            try {
                if (this.f104622d.size() > 0) {
                    eyx.m118802c().m118808g(getClass() + " startRecord_l momoCodecList.size()" + this.f104622d.size());
                    Iterator<MomoCodec> it = this.f104622d.iterator();
                    while (it.hasNext()) {
                        it.next().mo19655R0(vlwVar, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yw00 yw00Var = this.f104629k;
        if (yw00Var != null) {
            yw00Var.m216269L();
        }
    }

    /* JADX INFO: renamed from: j0 */
    private void m128305j0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo19647C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public void m128306o0() {
        yw00 yw00Var = this.f104629k;
        if (yw00Var != null) {
            yw00Var.m216272O();
        }
        synchronized (this.f104641w) {
            try {
                List<MomoCodec> list = this.f104622d;
                if (list == null || list.size() <= 0) {
                    mo128349g(16385, 0, 0, this);
                } else {
                    Iterator<MomoCodec> it = this.f104622d.iterator();
                    while (it.hasNext()) {
                        it.next().mo19662f();
                    }
                }
                this.f104622d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m128307t() {
        if (this.f104622d.size() > 0) {
            Iterator<MomoCodec> it = this.f104622d.iterator();
            while (it.hasNext()) {
                it.next().mo19666o();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m128313A(ccj ccjVar, String str) {
        m128334W(new RunnableC17169a(str, ccjVar), str);
    }

    /* JADX INFO: renamed from: B */
    public synchronized void m128314B(ccj ccjVar) {
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            yw00 yw00VarM128321I = m128321I(ccjVar);
            if (this.f104620b == null) {
                this.f104629k = yw00VarM128321I;
                this.f104620b = ccjVar;
                this.f104624f.put(ccjVar.toString(), this.f104629k);
            } else {
                this.f104624f.put(ccjVar.toString(), yw00VarM128321I);
            }
            yw00VarM128321I.m216267J(this);
            yw00VarM128321I.m216268K(ccjVar.toString());
            synchronized (this.f104625g) {
                this.f104625g.put(ccjVar.toString(), ccjVar);
            }
            this.f104627i.put(ccjVar.toString(), linkedList2);
            this.f104626h.put(ccjVar.toString(), linkedList);
            this.f104628j.put(ccjVar.toString(), new ArrayList());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.sml.InterfaceC19992a
    /* JADX INFO: renamed from: C */
    public mpd0 mo128315C(mpd0 mpd0Var) {
        ya1 ya1Var;
        if (this.f104622d.isEmpty() && (ya1Var = this.f104640v) != null) {
            ya1Var.mo18364C(mpd0Var);
            return mpd0Var;
        }
        for (MomoCodec momoCodec : new ArrayList(this.f104622d)) {
            if (this.f104619a && momoCodec != null) {
                momoCodec.mo19652K1(mpd0Var);
            }
        }
        return mpd0Var;
    }

    /* JADX INFO: renamed from: D */
    public void m128316D(yw00 yw00Var, MomoCodec momoCodec, vlw vlwVar) {
        synchronized (this.f104641w) {
            yw00Var.m216274h(momoCodec);
            this.f104622d.add(momoCodec);
        }
        m128345d0(vlwVar);
    }

    /* JADX INFO: renamed from: E */
    public synchronized void m128317E(ccj ccjVar) {
        yw00 yw00VarM128321I = m128321I(ccjVar);
        yw00VarM128321I.m216267J(this);
        this.f104620b = ccjVar;
        this.f104629k = yw00VarM128321I;
        this.f104624f.put(ccjVar.toString(), this.f104629k);
        yw00VarM128321I.m216268K(ccjVar.toString());
        if (this.f104625g.get(ccjVar.toString()) == null) {
            this.f104625g.put(ccjVar.toString(), ccjVar);
            LinkedList linkedList = new LinkedList();
            this.f104627i.put(ccjVar.toString(), new LinkedList());
            this.f104626h.put(ccjVar.toString(), linkedList);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m128318F(String str) {
        Queue<Runnable> queue = this.f104626h.get(str);
        if (queue != null) {
            synchronized (queue) {
                queue.clear();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m128319G() {
        Iterator<yw00> it = this.f104624f.values().iterator();
        while (it.hasNext()) {
            it.next().m216276j();
        }
        synchronized (this.f104641w) {
            try {
                List<MomoCodec> list = this.f104622d;
                if (list != null && list.size() > 0) {
                    Iterator<MomoCodec> it2 = this.f104622d.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo19662f();
                    }
                }
                this.f104622d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        tv00.m190719b(null);
        if (this.f104632n != null) {
            sv00 sv00Var = this.f104633o;
            if (sv00Var != null) {
                sv00Var.removeCallbacksAndMessages(null);
            }
            this.f104632n.quitSafely();
        }
        if (this.f104630l != null) {
            HandlerC17171c handlerC17171c = this.f104631m;
            if (handlerC17171c != null) {
                handlerC17171c.removeCallbacksAndMessages(null);
            }
            this.f104630l.quitSafely();
        }
        this.f104624f.clear();
    }

    /* JADX INFO: renamed from: H */
    public sv00 m128320H() {
        return this.f104633o;
    }

    /* JADX INFO: renamed from: I */
    public yw00 m128321I(ccj ccjVar) {
        yw00 yw00Var = this.f104624f.get(ccjVar.toString());
        if (yw00Var != null) {
            return yw00Var;
        }
        yw00 yw00Var2 = new yw00();
        yw00Var2.m216267J(this);
        yw00Var2.m216268K(yw00Var2.toString());
        this.f104624f.put(ccjVar.toString(), yw00Var2);
        return yw00Var2;
    }

    /* JADX INFO: renamed from: J */
    public yw00 m128322J() {
        return this.f104629k;
    }

    /* JADX INFO: renamed from: L */
    public boolean m128323L() {
        return this.f104619a;
    }

    /* JADX INFO: renamed from: M */
    public synchronized void m128324M() {
        this.f104619a = false;
        this.f104639u = null;
        Iterator<yw00> it = this.f104624f.values().iterator();
        while (it.hasNext()) {
            it.next().m216286t();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m128325N() {
        synchronized (this.f104625g) {
            try {
                yw00 yw00Var = this.f104629k;
                if (yw00Var != null) {
                    yw00Var.m216270M();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m128326O(yw00 yw00Var) {
        if (yw00Var == this.f104629k) {
            synchronized (this.f104641w) {
                try {
                    Iterator<sie> it = mo128359m().values().iterator();
                    while (it.hasNext()) {
                        it.next().m184334j();
                    }
                    mo128359m().clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void m128327P(MomoCodec momoCodec) {
        synchronized (this.f104641w) {
            try {
                this.f104622d.remove(momoCodec);
                yw00 yw00Var = this.f104629k;
                if (yw00Var != null) {
                    yw00Var.m216288y(momoCodec);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public synchronized void m128328Q(Object obj) {
        try {
            this.f104619a = true;
            this.f104639u = obj;
            for (yw00 yw00Var : this.f104624f.values()) {
                if (yw00Var == this.f104629k) {
                    yw00Var.m216263F(this.f104639u);
                } else if (yw00Var.m216280n() == 0) {
                    yw00Var.m216263F(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m128329R(Object obj) {
        try {
            this.f104619a = true;
            this.f104639u = obj;
            for (yw00 yw00Var : this.f104624f.values()) {
                if (yw00Var == this.f104629k) {
                    yw00Var.m216264G(this.f104639u);
                } else if (yw00Var.m216280n() == 0) {
                    yw00Var.m216264G(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m128330S(Object obj) {
        try {
            this.f104619a = true;
            this.f104639u = obj;
            for (yw00 yw00Var : this.f104624f.values()) {
                if (yw00Var == this.f104629k) {
                    yw00Var.m216265H(this.f104639u);
                } else if (yw00Var.m216280n() == 0) {
                    yw00Var.m216265H(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m128331T(String str) {
        Queue<Runnable> queue = this.f104626h.get(str);
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
    public void m128332U(String str) {
        Queue<Runnable> queue = this.f104627i.get(str);
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
    public void m128333V(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f104626h.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: W */
    public void m128334W(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f104627i.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m128335X(ya1 ya1Var) {
        this.f104640v = ya1Var;
    }

    /* JADX INFO: renamed from: Y */
    public void m128336Y(InterfaceC17172d interfaceC17172d) {
        this.f104635q = interfaceC17172d;
    }

    /* JADX INFO: renamed from: Z */
    public void m128337Z(InterfaceC17173e interfaceC17173e) {
        this.f104636r = interfaceC17173e;
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: a */
    public sie mo128338a() {
        synchronized (this.f104638t) {
            try {
                if (this.f104637s == null) {
                    this.f104637s = new sie(this.f104621c);
                    this.f104637s.m184328c(sie.m184324f());
                }
            } catch (Exception e) {
                eyx.m118802c().m118808g("getDummyScreen:" + e.toString());
            }
        }
        return this.f104637s;
    }

    /* JADX INFO: renamed from: a0 */
    public void m128339a0(etf etfVar) {
        this.f104643y = etfVar;
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: b */
    public boolean mo128340b() {
        return this.f104621c;
    }

    /* JADX INFO: renamed from: b0 */
    public void m128341b0(InterfaceC17174f interfaceC17174f) {
        this.f104618A = interfaceC17174f;
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: c */
    public void mo128342c() {
        InterfaceC17175g interfaceC17175g = this.f104634p;
        if (interfaceC17175g != null) {
            interfaceC17175g.mo128374a();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m128343c0(InterfaceC17175g interfaceC17175g) {
        this.f104634p = interfaceC17175g;
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: d */
    public void mo128344d() {
        InterfaceC17172d interfaceC17172d = this.f104635q;
        if (interfaceC17172d != null) {
            interfaceC17172d.mo128370b();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m128345d0(vlw vlwVar) {
        this.f104631m.removeMessages(100);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(100, 0, 0, vlwVar));
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: e */
    public void mo128346e(int i, int i2) {
        if (this.f104635q != null) {
            ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "elgRenderSizewidth" + i + "height" + i2);
            this.f104635q.mo128372d(i, i2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m128347e0(vlw vlwVar) {
        this.f104631m.removeMessages(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 0, 0, vlwVar));
    }

    @Override // p149l.yw00.InterfaceC21548a
    @RequiresApi(api = 18)
    /* JADX INFO: renamed from: f */
    public void mo128348f(yw00 yw00Var, pjw pjwVar) {
        if (this.f104629k == yw00Var) {
            synchronized (this.f104641w) {
                try {
                    for (MomoCodec momoCodec : this.f104622d) {
                        sie sieVar = mo128359m().get(momoCodec.toString());
                        if (sieVar != null && sieVar.m184333i()) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            momoCodec.mo19653M1();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            ii70 ii70VarM136344d = ii70.m136344d();
                            StringBuilder sb = new StringBuilder();
                            long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                            sb.append(j);
                            sb.append(" 111111111111 ");
                            sb.append(momoCodec.getClass().getSimpleName());
                            sb.append(" index ");
                            sb.append(0);
                            ii70VarM136344d.m136349f("Pipeline_Normal_pip->PIPLINE", sb.toString());
                            sieVar.m184335l();
                            ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", j + " 222222222222 " + momoCodec.getClass().getSimpleName() + " index 0");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        m128332U(yw00Var.m216279m());
    }

    @Override // p149l.hu00.InterfaceC17392a
    /* JADX INFO: renamed from: g */
    public void mo128349g(int i, int i2, int i3, Object obj) {
        sv00 sv00Var = this.f104633o;
        if (sv00Var != null) {
            this.f104633o.sendMessage(sv00Var.obtainMessage(i, i2, i3, obj));
        }
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: h */
    public void mo128350h(yw00 yw00Var) {
        if (yw00Var == this.f104629k) {
            m128333V(new RunnableC17170b(yw00Var), yw00Var.m216279m());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public synchronized void m128351h0(Object obj) {
        if (this.f104620b != null) {
            this.f104619a = true;
            this.f104639u = obj;
            this.f104629k.m216271N(obj);
            this.f104629k.m216287u();
        }
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: i */
    public Object mo128352i() {
        return this.f104641w;
    }

    /* JADX INFO: renamed from: i0 */
    public void m128353i0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo19658b0();
        }
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: j */
    public void mo128354j(yw00 yw00Var) {
        InterfaceC17173e interfaceC17173e;
        if (yw00Var != this.f104629k || (interfaceC17173e = this.f104636r) == null) {
            return;
        }
        interfaceC17173e.mo128373a();
        ybj.m213953d().m213954a();
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: k */
    public void mo128355k(yw00 yw00Var) {
        synchronized (this.f104625g) {
            try {
                yw00 yw00VarRemove = this.f104624f.remove(yw00Var.m216279m());
                if (yw00VarRemove == null) {
                    ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "onDestory" + yw00VarRemove + "bugs");
                }
                ccj ccjVarRemove = this.f104625g.remove(yw00Var.m216279m());
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "Render to destory" + ccjVarRemove);
                if (ccjVarRemove != null) {
                    ccjVarRemove.destroy();
                }
                m128332U(yw00Var.m216279m());
                m128318F(yw00Var.m216279m());
                this.f104627i.remove(yw00Var.m216279m());
                this.f104626h.remove(yw00Var.m216279m());
                ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "mRootInputMap size" + this.f104625g.size());
                if (this.f104625g.size() == 0) {
                    InterfaceC17172d interfaceC17172d = this.f104635q;
                    if (interfaceC17172d != null) {
                        interfaceC17172d.mo128371c();
                    }
                    synchronized (this.f104641w) {
                        try {
                            if (mo128359m() != null) {
                                for (sie sieVar : mo128359m().values()) {
                                    sieVar.m184334j();
                                    sieVar.f164706c = null;
                                }
                            }
                            this.f104623e.clear();
                            this.f104623e = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    this.f104629k = null;
                    this.f104620b = null;
                    synchronized (this.f104638t) {
                        try {
                            sie sieVar2 = this.f104637s;
                            if (sieVar2 != null) {
                                sieVar2.m184334j();
                                this.f104637s = null;
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
        synchronized (this.f104628j) {
            try {
                Iterator<List<ccj>> it = this.f104628j.values().iterator();
                while (it.hasNext()) {
                    for (ccj ccjVar : it.next()) {
                        if (ccjVar != null) {
                            ccjVar.destroy();
                        }
                    }
                }
                this.f104628j.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m128356k0() {
        this.f104631m.removeMessages(101);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(101, 0, 0, null));
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: l */
    public void mo128357l(sie sieVar, yw00 yw00Var, pjw pjwVar) {
        ccj ccjVar;
        m128331T(yw00Var.m216279m());
        if (ybj.m213953d().m213957e()) {
            ybj.m213953d().m213954a();
            ybj.m213953d().m213958f(false);
        }
        if (m128323L()) {
            etf etfVar = this.f104643y;
            if (etfVar != null && pjwVar != null) {
                etfVar.setMMCVInfo(pjwVar);
            }
            etf etfVar2 = this.f104644z;
            if (etfVar2 != null && pjwVar != null) {
                etfVar2.setMMCVInfo(pjwVar);
            }
            synchronized (this.f104625g) {
                ccjVar = this.f104625g.get(yw00Var.m216279m());
            }
            if (f104617B) {
                synchronized (this.f104642x) {
                    if (ccjVar != null) {
                        try {
                            ccjVar.onDrawFrame();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else if (ccjVar != null) {
                ccjVar.onDrawFrame();
            }
        }
        List<MomoCodec> list = this.f104622d;
        if (list == null || list.size() == 0 || this.f104629k != yw00Var) {
            m128332U(yw00Var.m216279m());
        }
        ArrayList<ccj> arrayList = (ArrayList) this.f104628j.get(yw00Var.m216279m());
        if (arrayList != null) {
            for (ccj ccjVar2 : arrayList) {
                if (ccjVar2 != null) {
                    ccjVar2.destroy();
                }
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m128358l0(MomoCodec momoCodec) {
        m128305j0(momoCodec);
        this.f104631m.removeMessages(800);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(800, 0, 0, momoCodec));
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: m */
    public PipelineConcurrentHashMap<String, sie> mo128359m() {
        synchronized (this.f104641w) {
            try {
                if (this.f104623e == null) {
                    this.f104623e = new PipelineConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f104623e;
    }

    /* JADX INFO: renamed from: m0 */
    public void m128360m0(MomoCodec momoCodec) {
        if (momoCodec != null) {
            momoCodec.mo19646A();
        }
        this.f104631m.removeMessages(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 0, 0, null));
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: n */
    public void mo128361n(yw00 yw00Var) {
        PipelineConcurrentHashMap<String, yw00> pipelineConcurrentHashMap = this.f104624f;
        if (pipelineConcurrentHashMap != null) {
            pipelineConcurrentHashMap.remove(yw00Var.m216279m());
            this.f104625g.remove(yw00Var.m216279m());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m128362n0() {
        yw00 yw00Var = this.f104629k;
        if (yw00Var != null) {
            yw00Var.m216272O();
        }
        synchronized (this.f104641w) {
            try {
                List<MomoCodec> list = this.f104622d;
                if (list == null || list.size() <= 0) {
                    mo128349g(16385, 0, 0, this);
                } else {
                    Iterator<MomoCodec> it = this.f104622d.iterator();
                    while (it.hasNext()) {
                        it.next().mo19646A();
                    }
                }
                this.f104622d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: o */
    public void mo128363o(yw00 yw00Var, int i, int i2, int i3, int i4) {
        ii70.m136344d().m136349f("Pipeline_Normal_pip->PIPLINE", "FPS:" + i + "renderUse" + i2 + "codecUse" + i3 + "renderKey" + yw00Var.toString() + "codecFps:" + i4);
        InterfaceC17174f interfaceC17174f = this.f104618A;
        if (interfaceC17174f != null) {
            interfaceC17174f.mo19959P0(yw00Var, i, i2, i3, i4);
        }
    }

    @Override // p149l.yw00.InterfaceC21548a
    /* JADX INFO: renamed from: p */
    public boolean mo128364p() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m128365q(String str, int i) {
        this.f104631m.removeMessages(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 0, i, str));
    }

    /* JADX INFO: renamed from: r */
    public void m128366r(String str, int i) {
        synchronized (this.f104641w) {
            try {
                if (this.f104622d.size() > 0) {
                    Iterator<MomoCodec> it = this.f104622d.iterator();
                    while (it.hasNext()) {
                        it.next().mo19668p(str, i);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m128367s() {
        this.f104631m.removeMessages(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        this.f104631m.sendMessage(this.f104631m.obtainMessage(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 0, 0, null));
    }

    /* JADX INFO: renamed from: z */
    public void m128368z(yw00 yw00Var, MomoCodec momoCodec) {
        synchronized (this.f104641w) {
            if (yw00Var != null) {
                try {
                    yw00Var.m216274h(momoCodec);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f104622d.add(momoCodec);
        }
    }
}
