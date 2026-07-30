package p149l;

import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class fqe implements iqe.InterfaceC17608a {

    /* JADX INFO: renamed from: p */
    private static boolean f98785p = false;

    /* JADX INFO: renamed from: b */
    private bcj f98787b;

    /* JADX INFO: renamed from: i */
    protected iqe f98794i;

    /* JADX INFO: renamed from: j */
    private HandlerThread f98795j;

    /* JADX INFO: renamed from: m */
    private Object f98798m;

    /* JADX INFO: renamed from: c */
    private boolean f98788c = false;

    /* JADX INFO: renamed from: k */
    private rie f98796k = null;

    /* JADX INFO: renamed from: l */
    private Object f98797l = new Object();

    /* JADX INFO: renamed from: n */
    private Object f98799n = new Object();

    /* JADX INFO: renamed from: o */
    private Object f98800o = new Object();

    /* JADX INFO: renamed from: a */
    private boolean f98786a = false;

    /* JADX INFO: renamed from: d */
    protected ConcurrentHashMap<String, iqe> f98789d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    protected ConcurrentHashMap<String, bcj> f98790e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    protected ConcurrentHashMap<String, Queue<Runnable>> f98791f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    protected ConcurrentHashMap<String, Queue<Runnable>> f98792g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    protected ConcurrentHashMap<String, List<bcj>> f98793h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.fqe$a */
    public class RunnableC16908a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f98801a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ bcj f98802b;

        public RunnableC16908a(String str, bcj bcjVar) {
            this.f98801a = str;
            this.f98802b = bcjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = (ArrayList) fqe.this.f98793h.get(this.f98801a);
            if (arrayList != null) {
                arrayList.add(this.f98802b);
            }
        }
    }

    /* JADX INFO: renamed from: l.fqe$b */
    public class RunnableC16909b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ iqe f98804a;

        public RunnableC16909b(iqe iqeVar) {
            this.f98804a = iqeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            fqe.m122703j(fqe.this);
        }
    }

    /* JADX INFO: renamed from: l.fqe$c */
    public interface InterfaceC16910c {
    }

    public fqe() {
        HandlerThread handlerThread = new HandlerThread("RecordingCmdHandle", 19);
        this.f98795j = handlerThread;
        handlerThread.start();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC16910c m122703j(fqe fqeVar) {
        fqeVar.getClass();
        return null;
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: a */
    public rie mo122704a() {
        synchronized (this.f98797l) {
            try {
                if (this.f98796k == null) {
                    rie rieVar = new rie(this.f98788c);
                    this.f98796k = rieVar;
                    rieVar.m179496a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f98796k;
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: b */
    public boolean mo122705b() {
        return this.f98788c;
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: f */
    public synchronized void mo122709f(iqe iqeVar) {
        synchronized (this.f98790e) {
            try {
                iqe iqeVarRemove = this.f98789d.remove(iqeVar.m137747g());
                if (iqeVarRemove == null) {
                    vpe.m199230a("Effect", "onDestory" + iqeVarRemove + "bugs");
                }
                bcj bcjVarRemove = this.f98790e.remove(iqeVar.m137747g());
                vpe.m199230a("Effect", "Render to destory" + bcjVarRemove);
                if (bcjVarRemove != null) {
                    bcjVarRemove.mo95685i();
                }
                m122719q(iqeVar.m137747g());
                this.f98792g.remove(iqeVar.m137747g());
                this.f98791f.remove(iqeVar.m137747g());
                if (this.f98790e.size() == 0) {
                    this.f98794i = null;
                    this.f98787b = null;
                    synchronized (this.f98797l) {
                        try {
                            rie rieVar = this.f98796k;
                            if (rieVar != null) {
                                rieVar.m179501f();
                                this.f98796k = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
            throw th;
        }
        synchronized (this.f98793h) {
            try {
                Iterator<List<bcj>> it = this.f98793h.values().iterator();
                while (it.hasNext()) {
                    for (bcj bcjVar : it.next()) {
                        if (bcjVar != null) {
                            bcjVar.mo95685i();
                        }
                    }
                }
                this.f98793h.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: g */
    public void mo122710g(iqe iqeVar) {
        m122720r(new RunnableC16909b(iqeVar), iqeVar.m137747g());
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: i */
    public void mo122712i(rie rieVar, iqe iqeVar) {
        bcj bcjVar;
        m122718p(iqeVar.m137747g());
        if (m122717o()) {
            synchronized (this.f98790e) {
                bcjVar = this.f98790e.get(iqeVar.m137747g());
            }
            if (f98785p) {
                synchronized (this.f98800o) {
                    if (bcjVar != null) {
                        try {
                            bcjVar.mo101088w();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else if (bcjVar != null) {
                bcjVar.mo101088w();
            }
        }
        ArrayList arrayList = (ArrayList) this.f98793h.get(iqeVar.m137747g());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((bcj) it.next()).mo95685i();
            }
            arrayList.clear();
        }
        m122719q(iqeVar.m137747g());
    }

    /* JADX INFO: renamed from: k */
    public void m122713k(bcj bcjVar, String str) {
        m122721s(new RunnableC16908a(str, bcjVar), str);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m122714l(bcj bcjVar) {
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            iqe iqeVarM122716n = m122716n(bcjVar);
            if (this.f98787b == null) {
                this.f98794i = iqeVarM122716n;
                this.f98787b = bcjVar;
                this.f98789d.put(bcjVar.toString(), this.f98794i);
            } else {
                this.f98789d.put(bcjVar.toString(), iqeVarM122716n);
            }
            iqeVarM122716n.m137753n(this);
            iqeVarM122716n.m137754o(bcjVar.toString());
            this.f98790e.put(bcjVar.toString(), bcjVar);
            this.f98792g.put(bcjVar.toString(), linkedList2);
            this.f98791f.put(bcjVar.toString(), linkedList);
            this.f98793h.put(bcjVar.toString(), new ArrayList());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m122715m() {
        Iterator<iqe> it = this.f98789d.values().iterator();
        while (it.hasNext()) {
            it.next().m137746f();
        }
        HandlerThread handlerThread = this.f98795j;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f98789d.clear();
    }

    /* JADX INFO: renamed from: n */
    public iqe m122716n(bcj bcjVar) {
        iqe iqeVar = this.f98789d.get(bcjVar.toString());
        if (iqeVar != null) {
            return iqeVar;
        }
        iqe iqeVar2 = new iqe();
        iqeVar2.m137754o(iqeVar2.toString());
        this.f98789d.put(bcjVar.toString(), iqeVar2);
        return iqeVar2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m122717o() {
        return this.f98786a;
    }

    /* JADX INFO: renamed from: p */
    public void m122718p(String str) {
        Queue<Runnable> queue = this.f98791f.get(str);
        if (queue != null) {
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
        }
    }

    /* JADX INFO: renamed from: q */
    public void m122719q(String str) {
        Queue<Runnable> queue = this.f98792g.get(str);
        if (queue != null) {
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
        }
    }

    /* JADX INFO: renamed from: r */
    public void m122720r(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f98791f.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m122721s(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f98792g.get(str);
        if (queue != null) {
            synchronized (queue) {
                queue.add(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m122722t(boolean z) {
        this.f98788c = z;
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m122723u(Object obj) {
        if (this.f98787b != null) {
            this.f98786a = true;
            this.f98798m = obj;
            this.f98794i.m137751k();
            this.f98794i.m137755p(obj);
        }
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: c */
    public void mo122706c() {
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: d */
    public void mo122707d() {
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: e */
    public void mo122708e(int i, int i2) {
    }

    @Override // p149l.iqe.InterfaceC17608a
    /* JADX INFO: renamed from: h */
    public void mo122711h(iqe iqeVar, int i, int i2, int i3, int i4) {
    }
}
