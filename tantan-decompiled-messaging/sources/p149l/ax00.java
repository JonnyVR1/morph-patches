package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mmutil.task.C3804c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ax00 {

    /* JADX INFO: renamed from: a */
    private static final Map<Object, List<AbstractRunnableC15743b>> f72090a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ yol m99333b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m99334c(Object obj, AbstractRunnableC15743b abstractRunnableC15743b) {
        m99335d(1, obj, abstractRunnableC15743b);
    }

    /* JADX INFO: renamed from: d */
    public static void m99335d(int i, Object obj, AbstractRunnableC15743b abstractRunnableC15743b) {
        if (obj == null) {
            ig3.m135964a("tag is null");
            return;
        }
        if (abstractRunnableC15743b == null) {
            ig3.m135964a("task is null");
            return;
        }
        abstractRunnableC15743b.m99347l();
        abstractRunnableC15743b.f72096e = obj;
        if (ev0.f93301b) {
            Log4Android.m18417f().m18423g("task[" + abstractRunnableC15743b.getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : execute");
        }
        C3804c.m18444d(i, abstractRunnableC15743b);
        Map<Object, List<AbstractRunnableC15743b>> map = f72090a;
        List<AbstractRunnableC15743b> copyOnWriteArrayList = map.get(obj);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(abstractRunnableC15743b);
        map.put(obj, copyOnWriteArrayList);
    }

    /* JADX INFO: renamed from: e */
    public static void m99336e(Object obj, AbstractRunnableC15743b abstractRunnableC15743b) {
        m99335d(2, obj, abstractRunnableC15743b);
    }

    /* JADX INFO: renamed from: l.ax00$b */
    public static abstract class AbstractRunnableC15743b<Params, Progress, Result> implements Runnable {

        /* JADX INFO: renamed from: f */
        private static b f72091f;

        /* JADX INFO: renamed from: a */
        private Params[] f72092a;

        /* JADX INFO: renamed from: d */
        private volatile long f72095d;

        /* JADX INFO: renamed from: e */
        private Object f72096e;

        /* JADX INFO: renamed from: c */
        private volatile boolean f72094c = false;

        /* JADX INFO: renamed from: b */
        private volatile boolean f72093b = false;

        /* JADX INFO: renamed from: l.ax00$b$a */
        public static class a<Params, Progress> {

            /* JADX INFO: renamed from: a */
            AbstractRunnableC15743b f72097a;

            /* JADX INFO: renamed from: b */
            Params f72098b;

            /* JADX INFO: renamed from: c */
            Progress[] f72099c;

            /* JADX INFO: renamed from: d */
            Throwable f72100d;

            private a() {
            }
        }

        /* JADX INFO: renamed from: l.ax00$b$b */
        public static class b extends Handler {
            public b() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AbstractRunnableC15743b abstractRunnableC15743b;
                a aVar = (a) message.obj;
                if (aVar == null || (abstractRunnableC15743b = aVar.f72097a) == null) {
                    Log4Android.m18417f().m18423g("task[null] / thread[" + Thread.currentThread().getName() + "] : handleMessage return");
                    return;
                }
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        if (abstractRunnableC15743b.f72093b) {
                            return;
                        }
                        abstractRunnableC15743b.m99348m(aVar.f72099c);
                        return;
                    } else {
                        if (i == 3) {
                            abstractRunnableC15743b.m99346j();
                            return;
                        }
                        return;
                    }
                }
                if (abstractRunnableC15743b.f72093b) {
                    Log4Android.m18417f().m18423g("task[" + aVar.f72097a.getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : handleMessage isInterrupted, finish");
                    aVar.f72097a.m99342g();
                    return;
                }
                Log4Android.m18417f().m18423g("task[" + aVar.f72097a.getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : handleMessage onPostExecute");
                abstractRunnableC15743b.m99344k(aVar);
            }
        }

        /* JADX INFO: renamed from: e */
        private final a<Result, Progress> m99341e(Params... paramsArr) {
            a<Result, Progress> aVar = new a<>();
            try {
                if (m99345i()) {
                    aVar.f72100d = new Exception("task already canceled");
                } else {
                    this.f72095d = Thread.currentThread().getId();
                    aVar.f72098b = mo87095f(paramsArr);
                }
            } catch (Throwable th) {
                aVar.f72100d = th;
            }
            aVar.f72097a = this;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m99342g() {
            if (this.f72096e == null) {
                return;
            }
            if (m99345i()) {
                a aVar = new a();
                aVar.f72097a = this;
                Message messageObtain = Message.obtain();
                messageObtain.what = 3;
                messageObtain.obj = aVar;
                m99343h().sendMessage(messageObtain);
            }
            List list = (List) ax00.f72090a.get(this.f72096e);
            if (list != null) {
                try {
                    list.remove(this);
                } catch (UnsupportedOperationException e) {
                    Log4Android.m18417f().m18422e(e);
                }
                if (list.isEmpty()) {
                    ax00.f72090a.remove(this.f72096e);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static Handler m99343h() {
            if (f72091f == null) {
                synchronized (ax00.class) {
                    try {
                        if (f72091f == null) {
                            f72091f = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f72091f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public final void m99344k(a<Result, Progress> aVar) {
            m99342g();
            mo99349o();
            Throwable th = aVar.f72100d;
            if (th == null) {
                mo87097p(aVar.f72098b);
            } else if (th instanceof Exception) {
                mo87096n((Exception) th);
            } else {
                mo87096n(new Exception(aVar.f72100d));
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract Result mo87095f(Params... paramsArr) throws Exception;

        /* JADX INFO: renamed from: i */
        public final boolean m99345i() {
            return this.f72094c;
        }

        /* JADX INFO: renamed from: n */
        public void mo87096n(Exception exc) {
            ax00.m99333b();
        }

        @Override // java.lang.Runnable
        public void run() {
            Log4Android.m18417f().m18423g("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : run");
            if (this.f72093b) {
                m99342g();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            a<Result, Progress> aVarM99341e = m99341e(this.f72092a);
            if (ev0.f93301b) {
                Log4Android.m18417f().m18423g("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : doInBackground costs " + (System.currentTimeMillis() - jCurrentTimeMillis));
            }
            if (!this.f72093b) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = aVarM99341e;
                m99343h().sendMessage(messageObtain);
                return;
            }
            if (ev0.f93301b) {
                Log4Android.m18417f().m18423g("task[" + getClass().getName() + "] / thread[" + Thread.currentThread().getName() + "] : isInterrupted, finish");
            }
            m99342g();
        }

        /* JADX INFO: renamed from: j */
        public void m99346j() {
        }

        /* JADX INFO: renamed from: l */
        public void m99347l() {
        }

        /* JADX INFO: renamed from: o */
        public void mo99349o() {
        }

        /* JADX INFO: renamed from: m */
        public void m99348m(Progress... progressArr) {
        }

        /* JADX INFO: renamed from: p */
        public void mo87097p(Result result) {
        }
    }
}
