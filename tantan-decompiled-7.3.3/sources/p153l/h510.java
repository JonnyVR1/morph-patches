package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.hellogroup.common.thread.C3486c;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class h510 {

    /* JADX INFO: renamed from: a */
    private static final Map<Object, List<AbstractRunnableC17399b>> f107883a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ krl m133606b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static void m133607c(int i, Object obj, AbstractRunnableC17399b abstractRunnableC17399b) {
        if (obj == null) {
            wg3.m206174a("tag is null");
            return;
        }
        if (abstractRunnableC17399b == null) {
            wg3.m206174a("task is null");
            return;
        }
        abstractRunnableC17399b.m133619l();
        abstractRunnableC17399b.f107889e = obj;
        if (lv0.f133671b) {
            obj.toString();
            abstractRunnableC17399b.toString();
        }
        C3486c.m17566d(i, abstractRunnableC17399b);
        Map<Object, List<AbstractRunnableC17399b>> map = f107883a;
        List<AbstractRunnableC17399b> copyOnWriteArrayList = map.get(obj);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(abstractRunnableC17399b);
        map.put(obj, copyOnWriteArrayList);
    }

    /* JADX INFO: renamed from: d */
    public static void m133608d(Object obj, AbstractRunnableC17399b abstractRunnableC17399b) {
        m133607c(2, obj, abstractRunnableC17399b);
    }

    /* JADX INFO: renamed from: l.h510$b */
    public static abstract class AbstractRunnableC17399b<Params, Progress, Result> implements Runnable {

        /* JADX INFO: renamed from: f */
        private static b f107884f;

        /* JADX INFO: renamed from: a */
        private Params[] f107885a;

        /* JADX INFO: renamed from: d */
        private volatile long f107888d;

        /* JADX INFO: renamed from: e */
        private Object f107889e;

        /* JADX INFO: renamed from: c */
        private volatile boolean f107887c = false;

        /* JADX INFO: renamed from: b */
        private volatile boolean f107886b = false;

        /* JADX INFO: renamed from: l.h510$b$a */
        public static class a<Params, Progress> {

            /* JADX INFO: renamed from: a */
            AbstractRunnableC17399b f107890a;

            /* JADX INFO: renamed from: b */
            Params f107891b;

            /* JADX INFO: renamed from: c */
            Progress[] f107892c;

            /* JADX INFO: renamed from: d */
            Throwable f107893d;

            private a() {
            }
        }

        /* JADX INFO: renamed from: l.h510$b$b */
        public static class b extends Handler {
            public b() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AbstractRunnableC17399b abstractRunnableC17399b;
                a aVar = (a) message.obj;
                if (aVar == null || (abstractRunnableC17399b = aVar.f107890a) == null) {
                    Thread.currentThread().getName();
                    return;
                }
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        if (abstractRunnableC17399b.f107886b) {
                            return;
                        }
                        abstractRunnableC17399b.m133620m(aVar.f107892c);
                        return;
                    } else {
                        if (i == 3) {
                            abstractRunnableC17399b.m133618j();
                            return;
                        }
                        return;
                    }
                }
                boolean z = abstractRunnableC17399b.f107886b;
                AbstractRunnableC17399b abstractRunnableC17399b2 = aVar.f107890a;
                if (z) {
                    abstractRunnableC17399b2.getClass();
                    Thread.currentThread().getName();
                    aVar.f107890a.m133614g();
                } else {
                    abstractRunnableC17399b2.getClass();
                    Thread.currentThread().getName();
                    abstractRunnableC17399b.m133616k(aVar);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        private final a<Result, Progress> m133613e(Params... paramsArr) {
            a<Result, Progress> aVar = new a<>();
            try {
                if (m133617i()) {
                    aVar.f107893d = new Exception("task already canceled");
                } else {
                    this.f107888d = Thread.currentThread().getId();
                    aVar.f107891b = mo17943f(paramsArr);
                }
            } catch (Throwable th) {
                aVar.f107893d = th;
            }
            aVar.f107890a = this;
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m133614g() {
            if (this.f107889e == null) {
                return;
            }
            if (m133617i()) {
                a aVar = new a();
                aVar.f107890a = this;
                Message messageObtain = Message.obtain();
                messageObtain.what = 3;
                messageObtain.obj = aVar;
                m133615h().sendMessage(messageObtain);
            }
            List list = (List) h510.f107883a.get(this.f107889e);
            if (list != null) {
                try {
                    list.remove(this);
                } catch (UnsupportedOperationException e) {
                    Log.e("MomoTaskExecutor", "finish: ", e);
                }
                if (list.isEmpty()) {
                    h510.f107883a.remove(this.f107889e);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static Handler m133615h() {
            if (f107884f == null) {
                synchronized (h510.class) {
                    try {
                        if (f107884f == null) {
                            f107884f = new b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return f107884f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public final void m133616k(a<Result, Progress> aVar) {
            m133614g();
            m133621o();
            Throwable th = aVar.f107893d;
            if (th == null) {
                mo17945p(aVar.f107891b);
            } else if (th instanceof Exception) {
                mo17944n((Exception) th);
            } else {
                mo17944n(new Exception(aVar.f107893d));
            }
        }

        /* JADX INFO: renamed from: f */
        public abstract Result mo17943f(Params... paramsArr) throws Exception;

        /* JADX INFO: renamed from: i */
        public final boolean m133617i() {
            return this.f107887c;
        }

        /* JADX INFO: renamed from: n */
        public void mo17944n(Exception exc) {
            h510.m133606b();
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().getName();
            if (this.f107886b) {
                m133614g();
                return;
            }
            System.currentTimeMillis();
            a<Result, Progress> aVarM133613e = m133613e(this.f107885a);
            if (lv0.f133671b) {
                Thread.currentThread().getName();
                Objects.toString(aVarM133613e);
            }
            if (this.f107886b) {
                if (lv0.f133671b) {
                    Thread.currentThread().getName();
                }
                m133614g();
            } else {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = aVarM133613e;
                m133615h().sendMessage(messageObtain);
            }
        }

        /* JADX INFO: renamed from: j */
        public void m133618j() {
        }

        /* JADX INFO: renamed from: l */
        public void m133619l() {
        }

        /* JADX INFO: renamed from: o */
        public void m133621o() {
        }

        /* JADX INFO: renamed from: m */
        public void m133620m(Progress... progressArr) {
        }

        /* JADX INFO: renamed from: p */
        public void mo17945p(Result result) {
        }
    }
}
