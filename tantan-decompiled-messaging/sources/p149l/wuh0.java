package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public class wuh0 {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f188119a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f188122d = new C20959a();

    /* JADX INFO: renamed from: b */
    public Handler f188120b = new Handler(this.f188122d);

    /* JADX INFO: renamed from: c */
    public C20962d f188121c = C20962d.m205641f();

    /* JADX INFO: renamed from: l.wuh0$a */
    public class C20959a implements Handler.Callback {
        public C20959a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C20961c c20961c = (C20961c) message.obj;
            View view = c20961c.f188128d;
            if (view != null) {
                c20961c.f188130f.mo102516a(view, c20961c.f188127c, c20961c.f188126b);
            }
            wuh0.this.f188121c.m205648i(c20961c);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.wuh0$b */
    public static class C20960b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f188124a = {"android.widget.", "android.webkit.", "android.app."};

        public C20960b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C20960b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f188124a) {
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
    public static class C20961c {

        /* JADX INFO: renamed from: a */
        public wuh0 f188125a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f188126b;

        /* JADX INFO: renamed from: c */
        public int f188127c;

        /* JADX INFO: renamed from: d */
        public View f188128d;

        /* JADX INFO: renamed from: e */
        public boolean f188129e;

        /* JADX INFO: renamed from: f */
        public InterfaceC20963e f188130f;
    }

    /* JADX INFO: renamed from: l.wuh0$d */
    public static class C20962d extends Thread {

        /* JADX INFO: renamed from: d */
        public static final C20962d f188131d;

        /* JADX INFO: renamed from: a */
        public boolean f188132a;

        /* JADX INFO: renamed from: b */
        public ArrayBlockingQueue<C20961c> f188133b = new ArrayBlockingQueue<>(45);

        /* JADX INFO: renamed from: c */
        public lb80<C20961c> f188134c = new lb80<>(45);

        static {
            C20962d c20962d = new C20962d();
            f188131d = c20962d;
            c20962d.setPriority(10);
            c20962d.start();
        }

        /* JADX INFO: renamed from: f */
        public static C20962d m205641f() {
            return f188131d;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m205642b() {
            C20961c c20961cPeek = this.f188133b.peek();
            return c20961cPeek == null || c20961cPeek.f188129e || yni.f199172m;
        }

        /* JADX INFO: renamed from: c */
        public void m205643c() {
            this.f188133b.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m205644d(final C20961c c20961c) {
            try {
                if (!e51.m114739D() || this.f188133b.size() < 45) {
                    m205646g(c20961c);
                } else {
                    e51.m114768s(new Runnable() { // from class: l.xuh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f194499a.m205646g(c20961c);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new RuntimeException("异步初始化布局检查线程异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m205646g(C20961c c20961c) {
            try {
                this.f188133b.put(c20961c);
            } catch (InterruptedException e) {
                CrashHelper.m81296c(new RuntimeException("异步初始化布局入队异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: h */
        public C20961c m205647h() {
            C20961c c20961cAcquire = this.f188134c.acquire();
            return c20961cAcquire == null ? new C20961c() : c20961cAcquire;
        }

        /* JADX INFO: renamed from: i */
        public void m205648i(C20961c c20961c) {
            c20961c.f188130f = null;
            c20961c.f188125a = null;
            c20961c.f188126b = null;
            c20961c.f188127c = 0;
            c20961c.f188128d = null;
            this.f188134c.release(c20961c);
        }

        /* JADX INFO: renamed from: j */
        public void m205649j() {
            if (this.f188132a && !m205642b()) {
                try {
                    Thread.sleep(1000L);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            try {
                C20961c c20961cTake = this.f188133b.take();
                try {
                    if (this.f188132a && !c20961cTake.f188129e) {
                        Process.setThreadPriority(0);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    y8i0.m213379a("AsyncLayout inflate: " + wuh0.m205636c(c20961cTake.f188127c));
                    c20961cTake.f188128d = c20961cTake.f188125a.f188119a.inflate(c20961cTake.f188127c, c20961cTake.f188126b, false);
                    y8i0.m213380b();
                    if (ddq0.m111055a().m111056b()) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 > ddq0.m111055a().m111057c()) {
                            zvf0.m220369B("e_xml_inflate", "", vwb.m200311Y("xml_name", wuh0.m205636c(c20961cTake.f188127c)), vwb.m200311Y("time_consume", Long.valueOf(jCurrentTimeMillis2)));
                        }
                    }
                } catch (RuntimeException e) {
                    CrashHelper.m81296c(new RuntimeException("异步初始化布局inflate异常 layout:" + wuh0.m205636c(c20961cTake.f188127c) + " , detail: " + e.toString()));
                }
                Message messageObtain = Message.obtain(c20961cTake.f188125a.f188120b, 0, c20961cTake);
                if (c20961cTake.f188129e) {
                    messageObtain.getTarget().sendMessageAtFrontOfQueue(messageObtain);
                } else {
                    messageObtain.getTarget().sendMessage(messageObtain);
                }
            } catch (InterruptedException e2) {
                CrashHelper.m81296c(new RuntimeException("TanTanAsyncLayoutInflate：异步加载，获取任务异常：" + e2.toString()));
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zM194664L2 = upa.m194664L2();
            this.f188132a = zM194664L2;
            if (zM194664L2) {
                Process.setThreadPriority(-19);
            }
            while (true) {
                m205649j();
            }
        }
    }

    /* JADX INFO: renamed from: l.wuh0$e */
    public interface InterfaceC20963e {
        /* JADX INFO: renamed from: a */
        void mo102516a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public wuh0(@NonNull Context context) {
        this.f188119a = new C20960b(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m205636c(int i) {
        try {
            return CoreModule.f17544b.getResources().getResourceName(i);
        } catch (Exception unused) {
            return "get error";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m205637b() {
        if (NullChecker.m81303a(this.f188121c)) {
            this.f188121c.m205643c();
        }
    }

    @UiThread
    /* JADX INFO: renamed from: d */
    public void m205638d(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC20963e interfaceC20963e) {
        m205639e(i, viewGroup, interfaceC20963e, true);
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public void m205639e(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC20963e interfaceC20963e, boolean z) {
        if (interfaceC20963e == null) {
            jfd0.m141176a("callback argument may not be null!");
            return;
        }
        C20961c c20961cM205647h = this.f188121c.m205647h();
        c20961cM205647h.f188125a = this;
        c20961cM205647h.f188127c = i;
        c20961cM205647h.f188126b = viewGroup;
        c20961cM205647h.f188130f = interfaceC20963e;
        c20961cM205647h.f188129e = z;
        this.f188121c.m205644d(c20961cM205647h);
    }
}
