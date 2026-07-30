package p003l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ArrayBlockingQueue;
import l.ddq0;
import l.e51;
import l.j760;
import l.jfd0;
import l.lb80;
import l.upa;
import l.vwb;
import l.y8i0;
import l.yni;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wuh0 {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f8238a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f8241d = new C3463a();

    /* JADX INFO: renamed from: b */
    public Handler f8239b = new Handler(this.f8241d);

    /* JADX INFO: renamed from: c */
    public C3466d f8240c = C3466d.m10555f();

    /* JADX INFO: renamed from: l.wuh0$a */
    public class C3463a implements Handler.Callback {
        public C3463a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C3465c c3465c = (C3465c) message.obj;
            View view = c3465c.f8247d;
            if (view != null) {
                c3465c.f8249f.m10564a(view, c3465c.f8246c, c3465c.f8245b);
            }
            wuh0.this.f8240c.m10562i(c3465c);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.wuh0$b */
    public static class C3464b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f8243a = {"android.widget.", "android.webkit.", "android.app."};

        public C3464b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C3464b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f8243a) {
                try {
                    View viewCreateView = createView(str, str2, attributeSet);
                    if (viewCreateView != null) {
                        return viewCreateView;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: renamed from: l.wuh0$c */
    public static class C3465c {

        /* JADX INFO: renamed from: a */
        public wuh0 f8244a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f8245b;

        /* JADX INFO: renamed from: c */
        public int f8246c;

        /* JADX INFO: renamed from: d */
        public View f8247d;

        /* JADX INFO: renamed from: e */
        public boolean f8248e;

        /* JADX INFO: renamed from: f */
        public InterfaceC3467e f8249f;
    }

    /* JADX INFO: renamed from: l.wuh0$d */
    public static class C3466d extends Thread {

        /* JADX INFO: renamed from: d */
        public static final C3466d f8250d;

        /* JADX INFO: renamed from: a */
        public boolean f8251a;

        /* JADX INFO: renamed from: b */
        public ArrayBlockingQueue<C3465c> f8252b = new ArrayBlockingQueue<>(45);

        /* JADX INFO: renamed from: c */
        public lb80<C3465c> f8253c = new lb80<>(45);

        static {
            C3466d c3466d = new C3466d();
            f8250d = c3466d;
            c3466d.setPriority(10);
            c3466d.start();
        }

        /* JADX INFO: renamed from: f */
        public static C3466d m10555f() {
            return f8250d;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m10556b() {
            C3465c c3465cPeek = this.f8252b.peek();
            return c3465cPeek == null || c3465cPeek.f8248e || yni.m;
        }

        /* JADX INFO: renamed from: c */
        public void m10557c() {
            this.f8252b.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m10558d(final C3465c c3465c) {
            try {
                if (!e51.D() || this.f8252b.size() < 45) {
                    m10560g(c3465c);
                } else {
                    e51.s(new Runnable() { // from class: l.xuh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8573a.m10560g(c3465c);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.c(new RuntimeException("异步初始化布局检查线程异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m10560g(C3465c c3465c) {
            try {
                this.f8252b.put(c3465c);
            } catch (InterruptedException e) {
                CrashHelper.c(new RuntimeException("异步初始化布局入队异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: h */
        public C3465c m10561h() {
            C3465c c3465c = (C3465c) this.f8253c.acquire();
            return c3465c == null ? new C3465c() : c3465c;
        }

        /* JADX INFO: renamed from: i */
        public void m10562i(C3465c c3465c) {
            c3465c.f8249f = null;
            c3465c.f8244a = null;
            c3465c.f8245b = null;
            c3465c.f8246c = 0;
            c3465c.f8247d = null;
            this.f8253c.release(c3465c);
        }

        /* JADX INFO: renamed from: j */
        public void m10563j() {
            if (this.f8251a && !m10556b()) {
                try {
                    Thread.sleep(1000L);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            try {
                C3465c c3465cTake = this.f8252b.take();
                try {
                    if (this.f8251a && !c3465cTake.f8248e) {
                        Process.setThreadPriority(0);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    y8i0.a("AsyncLayout inflate: " + wuh0.m10550c(c3465cTake.f8246c));
                    c3465cTake.f8247d = c3465cTake.f8244a.f8238a.inflate(c3465cTake.f8246c, c3465cTake.f8245b, false);
                    y8i0.b();
                    if (ddq0.a().b()) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 > ddq0.a().c()) {
                            zvf0.B("e_xml_inflate", "", new j760[]{vwb.Y("xml_name", wuh0.m10550c(c3465cTake.f8246c)), vwb.Y("time_consume", Long.valueOf(jCurrentTimeMillis2))});
                        }
                    }
                } catch (RuntimeException e) {
                    CrashHelper.c(new RuntimeException("异步初始化布局inflate异常 layout:" + wuh0.m10550c(c3465cTake.f8246c) + " , detail: " + e.toString()));
                }
                Message messageObtain = Message.obtain(c3465cTake.f8244a.f8239b, 0, c3465cTake);
                if (c3465cTake.f8248e) {
                    messageObtain.getTarget().sendMessageAtFrontOfQueue(messageObtain);
                } else {
                    messageObtain.getTarget().sendMessage(messageObtain);
                }
            } catch (InterruptedException e2) {
                CrashHelper.c(new RuntimeException("TanTanAsyncLayoutInflate：异步加载，获取任务异常：" + e2.toString()));
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zL2 = upa.L2();
            this.f8251a = zL2;
            if (zL2) {
                Process.setThreadPriority(-19);
            }
            while (true) {
                m10563j();
            }
        }
    }

    /* JADX INFO: renamed from: l.wuh0$e */
    public interface InterfaceC3467e {
        /* JADX INFO: renamed from: a */
        void m10564a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public wuh0(@NonNull Context context) {
        this.f8238a = new C3464b(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m10550c(int i) {
        try {
            return CoreModule.b.getResources().getResourceName(i);
        } catch (Exception unused) {
            return "get error";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10551b() {
        if (NullChecker.a(this.f8240c)) {
            this.f8240c.m10557c();
        }
    }

    @UiThread
    /* JADX INFO: renamed from: d */
    public void m10552d(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC3467e interfaceC3467e) {
        m10553e(i, viewGroup, interfaceC3467e, true);
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public void m10553e(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC3467e interfaceC3467e, boolean z) {
        if (interfaceC3467e == null) {
            jfd0.a("callback argument may not be null!");
            return;
        }
        C3465c c3465cM10561h = this.f8240c.m10561h();
        c3465cM10561h.f8244a = this;
        c3465cM10561h.f8246c = i;
        c3465cM10561h.f8245b = viewGroup;
        c3465cM10561h.f8249f = interfaceC3467e;
        c3465cM10561h.f8248e = z;
        this.f8240c.m10558d(c3465cM10561h);
    }
}
