package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.immomo.mmutil.log.Log4Android;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class i510 {

    /* JADX INFO: renamed from: a */
    private static final Map<Object, List<AbstractRunnableC17649b>> f112984a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ jrl m138621b() {
        return null;
    }

    /* JADX INFO: renamed from: l.i510$b */
    public static abstract class AbstractRunnableC17649b<Params, Progress, Result> implements Runnable {

        /* JADX INFO: renamed from: f */
        private static b f112985f;

        /* JADX INFO: renamed from: a */
        private Params[] f112986a;

        /* JADX INFO: renamed from: d */
        private volatile long f112989d;

        /* JADX INFO: renamed from: e */
        private Object f112990e;

        /* JADX INFO: renamed from: c */
        private volatile boolean f112988c = false;

        /* JADX INFO: renamed from: b */
        private volatile boolean f112987b = false;

        /* JADX INFO: renamed from: l.i510$b$a */
        public static class a<Params, Progress> {

            /* JADX INFO: renamed from: a */
            AbstractRunnableC17649b f112991a;

            /* JADX INFO: renamed from: b */
            Params f112992b;

            /* JADX INFO: renamed from: c */
            Progress[] f112993c;

            /* JADX INFO: renamed from: d */
            Throwable f112994d;

            private a() {
            }
        }

        /* JADX INFO: renamed from: l.i510$b$b */
        public static class b extends Handler {
            public b() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AbstractRunnableC17649b abstractRunnableC17649b;
                a aVar = (a) message.obj;
                if (aVar == null || (abstractRunnableC17649b = aVar.f112991a) == null) {
                    Log4Android.m19406d().m19410e("task[null] / thread[" + Thread.currentThread().getName() + "] : handleMessage return");
                    return;
                }
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        if (abstractRunnableC17649b.f112987b) {
                            return;
                        }
                        abstractRunnableC17649b.m138632k(aVar.f112993c);
                        return;
                    } else {
                        if (i == 3) {
                            abstractRunnableC17649b.m138631i();
                            return;
                        }
                        return;
                    }
                }
                if (abstractRunnableC17649b.f112987b) {
                    Log4Android.m19406d().m19410e("task[" + aVar.f112991a.getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : handleMessage isInterrupted, finish");
                    aVar.f112991a.m138626f();
                    return;
                }
                Log4Android.m19406d().m19410e("task[" + aVar.f112991a.getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : handleMessage onPostExecute");
                abstractRunnableC17649b.m138628j(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        private final a<Result, Progress> m138625d(Params... paramsArr) {
            a<Result, Progress> aVar = new a<>();
            try {
                if (m138630h()) {
                    aVar.f112994d = new Exception("task already canceled");
                } else {
                    this.f112989d = Thread.currentThread().getId();
                    aVar.f112992b = mo138629e(paramsArr);
                }
            } catch (Throwable th) {
                aVar.f112994d = th;
            }
            aVar.f112991a = this;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m138626f() {
            if (this.f112990e == null) {
                return;
            }
            if (m138630h()) {
                a aVar = new a();
                aVar.f112991a = this;
                Message messageObtain = Message.obtain();
                messageObtain.what = 3;
                messageObtain.obj = aVar;
                m138627g().sendMessage(messageObtain);
            }
            List list = (List) i510.f112984a.get(this.f112990e);
            if (list != null) {
                try {
                    list.remove(this);
                } catch (UnsupportedOperationException e) {
                    Log4Android.m19406d().m19409c(e);
                }
                if (list.isEmpty()) {
                    i510.f112984a.remove(this.f112990e);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static Handler m138627g() {
            if (f112985f == null) {
                synchronized (i510.class) {
                    try {
                        if (f112985f == null) {
                            f112985f = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f112985f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public final void m138628j(a<Result, Progress> aVar) {
            m138626f();
            m138634m();
            Throwable th = aVar.f112994d;
            if (th == null) {
                mo138635n(aVar.f112992b);
            } else if (th instanceof Exception) {
                mo138633l((Exception) th);
            } else {
                mo138633l(new Exception(aVar.f112994d));
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract Result mo138629e(Params... paramsArr) throws Exception;

        /* JADX INFO: renamed from: h */
        public final boolean m138630h() {
            return this.f112988c;
        }

        /* JADX INFO: renamed from: l */
        public void mo138633l(Exception exc) {
            i510.m138621b();
        }

        @Override // java.lang.Runnable
        public void run() {
            Log4Android.m19406d().m19410e("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : run");
            if (this.f112987b) {
                m138626f();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            a<Result, Progress> aVarM138625d = m138625d(this.f112986a);
            if (jv0.f122756b) {
                Log4Android.m19406d().m19410e("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : doInBackground costs " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            if (!this.f112987b) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = aVarM138625d;
                m138627g().sendMessage(messageObtain);
                return;
            }
            if (jv0.f122756b) {
                Log4Android.m19406d().m19410e("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : isInterrupted, finish");
            }
            m138626f();
        }

        /* JADX INFO: renamed from: i */
        public void m138631i() {
        }

        /* JADX INFO: renamed from: m */
        public void m138634m() {
        }

        /* JADX INFO: renamed from: k */
        public void m138632k(Progress... progressArr) {
        }

        /* JADX INFO: renamed from: n */
        public void mo138635n(Result result) {
        }
    }
}
