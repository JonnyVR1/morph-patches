package p153l;

import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class jre implements mre.InterfaceC18687a {

    /* JADX INFO: renamed from: p */
    private static boolean f122324p = false;

    /* JADX INFO: renamed from: b */
    private vej f122326b;

    /* JADX INFO: renamed from: i */
    protected mre f122333i;

    /* JADX INFO: renamed from: j */
    private HandlerThread f122334j;

    /* JADX INFO: renamed from: m */
    private Object f122337m;

    /* JADX INFO: renamed from: c */
    private boolean f122327c = false;

    /* JADX INFO: renamed from: k */
    private vje f122335k = null;

    /* JADX INFO: renamed from: l */
    private Object f122336l = new Object();

    /* JADX INFO: renamed from: n */
    private Object f122338n = new Object();

    /* JADX INFO: renamed from: o */
    private Object f122339o = new Object();

    /* JADX INFO: renamed from: a */
    private boolean f122325a = false;

    /* JADX INFO: renamed from: d */
    protected ConcurrentHashMap<String, mre> f122328d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    protected ConcurrentHashMap<String, vej> f122329e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f */
    protected ConcurrentHashMap<String, Queue<Runnable>> f122330f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g */
    protected ConcurrentHashMap<String, Queue<Runnable>> f122331g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    protected ConcurrentHashMap<String, List<vej>> f122332h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.jre$a */
    public class RunnableC18016a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f122340a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ vej f122341b;

        public RunnableC18016a(String str, vej vejVar) {
            this.f122340a = str;
            this.f122341b = vejVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = (ArrayList) jre.this.f122332h.get(this.f122340a);
            if (arrayList != null) {
                arrayList.add(this.f122341b);
            }
        }
    }

    /* JADX INFO: renamed from: l.jre$b */
    public class RunnableC18017b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ mre f122343a;

        public RunnableC18017b(mre mreVar) {
            this.f122343a = mreVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            jre.m146711j(jre.this);
        }
    }

    /* JADX INFO: renamed from: l.jre$c */
    public interface InterfaceC18018c {
    }

    public jre() {
        HandlerThread handlerThread = new HandlerThread("RecordingCmdHandle", 19);
        this.f122334j = handlerThread;
        handlerThread.start();
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC18018c m146711j(jre jreVar) {
        jreVar.getClass();
        return null;
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: a */
    public vje mo146712a() {
        synchronized (this.f122336l) {
            try {
                if (this.f122335k == null) {
                    vje vjeVar = new vje(this.f122327c);
                    this.f122335k = vjeVar;
                    vjeVar.m201497a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f122335k;
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: b */
    public boolean mo146713b() {
        return this.f122327c;
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: f */
    public synchronized void mo146717f(mre mreVar) {
        synchronized (this.f122329e) {
            try {
                mre mreVarRemove = this.f122328d.remove(mreVar.m159688g());
                if (mreVarRemove == null) {
                    zqe.m221010a("Effect", "onDestory" + mreVarRemove + "bugs");
                }
                vej vejVarRemove = this.f122329e.remove(mreVar.m159688g());
                zqe.m221010a("Effect", "Render to destory" + vejVarRemove);
                if (vejVarRemove != null) {
                    vejVarRemove.mo97355i();
                }
                m146727q(mreVar.m159688g());
                this.f122331g.remove(mreVar.m159688g());
                this.f122330f.remove(mreVar.m159688g());
                if (this.f122329e.size() == 0) {
                    this.f122333i = null;
                    this.f122326b = null;
                    synchronized (this.f122336l) {
                        try {
                            vje vjeVar = this.f122335k;
                            if (vjeVar != null) {
                                vjeVar.m201502f();
                                this.f122335k = null;
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
        synchronized (this.f122332h) {
            try {
                Iterator<List<vej>> it = this.f122332h.values().iterator();
                while (it.hasNext()) {
                    for (vej vejVar : it.next()) {
                        if (vejVar != null) {
                            vejVar.mo97355i();
                        }
                    }
                }
                this.f122332h.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: g */
    public void mo146718g(mre mreVar) {
        m146728r(new RunnableC18017b(mreVar), mreVar.m159688g());
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: i */
    public void mo146720i(vje vjeVar, mre mreVar) {
        vej vejVar;
        m146726p(mreVar.m159688g());
        if (m146725o()) {
            synchronized (this.f122329e) {
                vejVar = this.f122329e.get(mreVar.m159688g());
            }
            if (f122324p) {
                synchronized (this.f122339o) {
                    if (vejVar != null) {
                        try {
                            vejVar.mo141810w();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else if (vejVar != null) {
                vejVar.mo141810w();
            }
        }
        ArrayList arrayList = (ArrayList) this.f122332h.get(mreVar.m159688g());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((vej) it.next()).mo97355i();
            }
            arrayList.clear();
        }
        m146727q(mreVar.m159688g());
    }

    /* JADX INFO: renamed from: k */
    public void m146721k(vej vejVar, String str) {
        m146729s(new RunnableC18016a(str, vejVar), str);
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m146722l(vej vejVar) {
        try {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            mre mreVarM146724n = m146724n(vejVar);
            if (this.f122326b == null) {
                this.f122333i = mreVarM146724n;
                this.f122326b = vejVar;
                this.f122328d.put(vejVar.toString(), this.f122333i);
            } else {
                this.f122328d.put(vejVar.toString(), mreVarM146724n);
            }
            mreVarM146724n.m159694n(this);
            mreVarM146724n.m159695o(vejVar.toString());
            this.f122329e.put(vejVar.toString(), vejVar);
            this.f122331g.put(vejVar.toString(), linkedList2);
            this.f122330f.put(vejVar.toString(), linkedList);
            this.f122332h.put(vejVar.toString(), new ArrayList());
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m146723m() {
        Iterator<mre> it = this.f122328d.values().iterator();
        while (it.hasNext()) {
            it.next().m159687f();
        }
        HandlerThread handlerThread = this.f122334j;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f122328d.clear();
    }

    /* JADX INFO: renamed from: n */
    public mre m146724n(vej vejVar) {
        mre mreVar = this.f122328d.get(vejVar.toString());
        if (mreVar != null) {
            return mreVar;
        }
        mre mreVar2 = new mre();
        mreVar2.m159695o(mreVar2.toString());
        this.f122328d.put(vejVar.toString(), mreVar2);
        return mreVar2;
    }

    /* JADX INFO: renamed from: o */
    public boolean m146725o() {
        return this.f122325a;
    }

    /* JADX INFO: renamed from: p */
    public void m146726p(String str) {
        Queue<Runnable> queue = this.f122330f.get(str);
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
    public void m146727q(String str) {
        Queue<Runnable> queue = this.f122331g.get(str);
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
    public void m146728r(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f122330f.get(str);
        if (queue != null) {
            queue.add(runnable);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m146729s(Runnable runnable, String str) {
        Queue<Runnable> queue = this.f122331g.get(str);
        if (queue != null) {
            synchronized (queue) {
                queue.add(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m146730t(boolean z) {
        this.f122327c = z;
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m146731u(Object obj) {
        if (this.f122326b != null) {
            this.f122325a = true;
            this.f122337m = obj;
            this.f122333i.m159692k();
            this.f122333i.m159696p(obj);
        }
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: c */
    public void mo146714c() {
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: d */
    public void mo146715d() {
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: e */
    public void mo146716e(int i, int i2) {
    }

    @Override // p153l.mre.InterfaceC18687a
    /* JADX INFO: renamed from: h */
    public void mo146719h(mre mreVar, int i, int i2, int i3, int i4) {
    }
}
