package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class pjq0 {

    /* JADX INFO: renamed from: a */
    private C19253c f149859a;

    /* JADX INFO: renamed from: b */
    private Handler f149860b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f149861c;

    /* JADX INFO: renamed from: d */
    private final boolean f149862d;

    /* JADX INFO: renamed from: e */
    private int f149863e;

    /* JADX INFO: renamed from: f */
    private volatile AbstractC19254d f149864f;

    /* JADX INFO: renamed from: l.pjq0$a */
    public class HandlerC19251a extends Handler {
        public HandlerC19251a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19254d abstractC19254d = (AbstractC19254d) message.obj;
            int i = message.what;
            if (i == 0) {
                abstractC19254d.m169930a();
            } else if (i == 1) {
                abstractC19254d.mo86588c();
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: l.pjq0$b */
    public class RunnableC19252b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC19254d f149866a;

        public RunnableC19252b(AbstractC19254d abstractC19254d) {
            this.f149866a = abstractC19254d;
        }

        @Override // java.lang.Runnable
        public void run() {
            pjq0.this.m169926e(this.f149866a);
        }
    }

    /* JADX INFO: renamed from: l.pjq0$c */
    public class C19253c extends Thread {

        /* JADX INFO: renamed from: a */
        private final LinkedBlockingQueue<AbstractC19254d> f149868a;

        public C19253c() {
            super("PackageProcessor");
            this.f149868a = new LinkedBlockingQueue<>();
        }

        /* JADX INFO: renamed from: a */
        private void m169928a(int i, AbstractC19254d abstractC19254d) {
            try {
                pjq0.this.f149860b.sendMessage(pjq0.this.f149860b.obtainMessage(i, abstractC19254d));
            } catch (Exception e) {
                ilq0.m137044q(e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m169929b(AbstractC19254d abstractC19254d) {
            try {
                this.f149868a.add(abstractC19254d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = pjq0.this.f149863e > 0 ? pjq0.this.f149863e : Long.MAX_VALUE;
            while (!pjq0.this.f149861c) {
                try {
                    AbstractC19254d abstractC19254dPoll = this.f149868a.poll(j, TimeUnit.SECONDS);
                    pjq0.this.f149864f = abstractC19254dPoll;
                    if (abstractC19254dPoll != null) {
                        m169928a(0, abstractC19254dPoll);
                        abstractC19254dPoll.mo86587b();
                        m169928a(1, abstractC19254dPoll);
                    } else if (pjq0.this.f149863e > 0) {
                        pjq0.this.m169923d();
                    }
                } catch (InterruptedException e) {
                    ilq0.m137044q(e);
                }
            }
        }
    }

    public pjq0(boolean z, int i) {
        this.f149860b = null;
        this.f149861c = false;
        this.f149863e = 0;
        this.f149860b = new HandlerC19251a(Looper.getMainLooper());
        this.f149862d = z;
        this.f149863e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public synchronized void m169923d() {
        this.f149859a = null;
        this.f149861c = true;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m169926e(AbstractC19254d abstractC19254d) {
        try {
            if (this.f149859a == null) {
                C19253c c19253c = new C19253c();
                this.f149859a = c19253c;
                c19253c.setDaemon(this.f149862d);
                this.f149861c = false;
                this.f149859a.start();
            }
            this.f149859a.m169929b(abstractC19254d);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m169927f(AbstractC19254d abstractC19254d, long j) {
        this.f149860b.postDelayed(new RunnableC19252b(abstractC19254d), j);
    }

    /* JADX INFO: renamed from: l.pjq0$d */
    public static abstract class AbstractC19254d {
        /* JADX INFO: renamed from: b */
        public abstract void mo86587b();

        /* JADX INFO: renamed from: a */
        public void m169930a() {
        }

        /* JADX INFO: renamed from: c */
        public void mo86588c() {
        }
    }

    public pjq0(boolean z) {
        this(z, 0);
    }

    public pjq0() {
        this(false);
    }
}
