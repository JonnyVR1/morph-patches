package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class vsq0 {

    /* JADX INFO: renamed from: a */
    private C20929c f185646a;

    /* JADX INFO: renamed from: b */
    private Handler f185647b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f185648c;

    /* JADX INFO: renamed from: d */
    private final boolean f185649d;

    /* JADX INFO: renamed from: e */
    private int f185650e;

    /* JADX INFO: renamed from: f */
    private volatile AbstractC20930d f185651f;

    /* JADX INFO: renamed from: l.vsq0$a */
    public class HandlerC20927a extends Handler {
        public HandlerC20927a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC20930d abstractC20930d = (AbstractC20930d) message.obj;
            int i = message.what;
            if (i == 0) {
                abstractC20930d.m202652a();
            } else if (i == 1) {
                abstractC20930d.mo87759c();
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: l.vsq0$b */
    public class RunnableC20928b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC20930d f185653a;

        public RunnableC20928b(AbstractC20930d abstractC20930d) {
            this.f185653a = abstractC20930d;
        }

        @Override // java.lang.Runnable
        public void run() {
            vsq0.this.m202648e(this.f185653a);
        }
    }

    /* JADX INFO: renamed from: l.vsq0$c */
    public class C20929c extends Thread {

        /* JADX INFO: renamed from: a */
        private final LinkedBlockingQueue<AbstractC20930d> f185655a;

        public C20929c() {
            super("PackageProcessor");
            this.f185655a = new LinkedBlockingQueue<>();
        }

        /* JADX INFO: renamed from: a */
        private void m202650a(int i, AbstractC20930d abstractC20930d) {
            try {
                vsq0.this.f185647b.sendMessage(vsq0.this.f185647b.obtainMessage(i, abstractC20930d));
            } catch (Exception e) {
                ouq0.m169397q(e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m202651b(AbstractC20930d abstractC20930d) {
            try {
                this.f185655a.add(abstractC20930d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = vsq0.this.f185650e > 0 ? vsq0.this.f185650e : Long.MAX_VALUE;
            while (!vsq0.this.f185648c) {
                try {
                    AbstractC20930d abstractC20930dPoll = this.f185655a.poll(j, TimeUnit.SECONDS);
                    vsq0.this.f185651f = abstractC20930dPoll;
                    if (abstractC20930dPoll != null) {
                        m202650a(0, abstractC20930dPoll);
                        abstractC20930dPoll.mo87758b();
                        m202650a(1, abstractC20930dPoll);
                    } else if (vsq0.this.f185650e > 0) {
                        vsq0.this.m202645d();
                    }
                } catch (InterruptedException e) {
                    ouq0.m169397q(e);
                }
            }
        }
    }

    public vsq0(boolean z, int i) {
        this.f185647b = null;
        this.f185648c = false;
        this.f185650e = 0;
        this.f185647b = new HandlerC20927a(Looper.getMainLooper());
        this.f185649d = z;
        this.f185650e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized void m202645d() {
        this.f185646a = null;
        this.f185648c = true;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m202648e(AbstractC20930d abstractC20930d) {
        try {
            if (this.f185646a == null) {
                C20929c c20929c = new C20929c();
                this.f185646a = c20929c;
                c20929c.setDaemon(this.f185649d);
                this.f185648c = false;
                this.f185646a.start();
            }
            this.f185646a.m202651b(abstractC20930d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m202649f(AbstractC20930d abstractC20930d, long j) {
        this.f185647b.postDelayed(new RunnableC20928b(abstractC20930d), j);
    }

    /* JADX INFO: renamed from: l.vsq0$d */
    public static abstract class AbstractC20930d {
        /* JADX INFO: renamed from: b */
        public abstract void mo87758b();

        /* JADX INFO: renamed from: a */
        public void m202652a() {
        }

        /* JADX INFO: renamed from: c */
        public void mo87759c() {
        }
    }

    public vsq0(boolean z) {
        this(z, 0);
    }

    public vsq0() {
        this(false);
    }
}
