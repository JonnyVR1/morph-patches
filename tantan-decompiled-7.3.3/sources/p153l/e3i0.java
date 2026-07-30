package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes12.dex */
public class e3i0 {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f91961a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f91964d = new C16693a();

    /* JADX INFO: renamed from: b */
    public Handler f91962b = new Handler(this.f91964d);

    /* JADX INFO: renamed from: c */
    public C16696d f91963c = C16696d.m119302f();

    /* JADX INFO: renamed from: l.e3i0$a */
    public class C16693a implements Handler.Callback {
        public C16693a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C16695c c16695c = (C16695c) message.obj;
            View view = c16695c.f91970d;
            if (view != null) {
                c16695c.f91972f.mo111496a(view, c16695c.f91969c, c16695c.f91968b);
            }
            e3i0.this.f91963c.m119309i(c16695c);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.e3i0$b */
    public static class C16694b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f91966a = {"android.widget.", "android.webkit.", "android.app."};

        public C16694b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C16694b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f91966a) {
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

    /* JADX INFO: renamed from: l.e3i0$c */
    public static class C16695c {

        /* JADX INFO: renamed from: a */
        public e3i0 f91967a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f91968b;

        /* JADX INFO: renamed from: c */
        public int f91969c;

        /* JADX INFO: renamed from: d */
        public View f91970d;

        /* JADX INFO: renamed from: e */
        public boolean f91971e;

        /* JADX INFO: renamed from: f */
        public InterfaceC16697e f91972f;
    }

    /* JADX INFO: renamed from: l.e3i0$d */
    public static class C16696d extends Thread {

        /* JADX INFO: renamed from: d */
        public static final C16696d f91973d;

        /* JADX INFO: renamed from: a */
        public boolean f91974a;

        /* JADX INFO: renamed from: b */
        public ArrayBlockingQueue<C16695c> f91975b = new ArrayBlockingQueue<>(45);

        /* JADX INFO: renamed from: c */
        public rj80<C16695c> f91976c = new rj80<>(45);

        static {
            C16696d c16696d = new C16696d();
            f91973d = c16696d;
            c16696d.setPriority(10);
            c16696d.start();
        }

        /* JADX INFO: renamed from: f */
        public static C16696d m119302f() {
            return f91973d;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m119303b() {
            C16695c c16695cPeek = this.f91975b.peek();
            return c16695cPeek == null || c16695cPeek.f91971e || uqi.f180470m;
        }

        /* JADX INFO: renamed from: c */
        public void m119304c() {
            this.f91975b.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m119305d(final C16695c c16695c) {
            try {
                if (!l51.m152884D() || this.f91975b.size() < 45) {
                    m119307g(c16695c);
                } else {
                    l51.m152913s(new Runnable() { // from class: l.f3i0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f96993a.m119307g(c16695c);
                        }
                    });
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new RuntimeException("异步初始化布局检查线程异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m119307g(C16695c c16695c) {
            try {
                this.f91975b.put(c16695c);
            } catch (InterruptedException e) {
                CrashHelper.m82479c(new RuntimeException("异步初始化布局入队异常：" + e.toString()));
            }
        }

        /* JADX INFO: renamed from: h */
        public C16695c m119308h() {
            C16695c c16695cAcquire = this.f91976c.acquire();
            return c16695cAcquire == null ? new C16695c() : c16695cAcquire;
        }

        /* JADX INFO: renamed from: i */
        public void m119309i(C16695c c16695c) {
            c16695c.f91972f = null;
            c16695c.f91967a = null;
            c16695c.f91968b = null;
            c16695c.f91969c = 0;
            c16695c.f91970d = null;
            this.f91976c.release(c16695c);
        }

        /* JADX INFO: renamed from: j */
        public void m119310j() {
            if (this.f91974a && !m119303b()) {
                try {
                    Thread.sleep(1000L);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            try {
                C16695c c16695cTake = this.f91975b.take();
                try {
                    if (this.f91974a && !c16695cTake.f91971e) {
                        Process.setThreadPriority(0);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    yhi0.m215967a("AsyncLayout inflate: " + e3i0.m119297c(c16695cTake.f91969c));
                    c16695cTake.f91970d = c16695cTake.f91967a.f91961a.inflate(c16695cTake.f91969c, c16695cTake.f91968b, false);
                    yhi0.m215968b();
                    if (imq0.m140986a().m140987b()) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (jCurrentTimeMillis2 > imq0.m140986a().m140988c()) {
                            i4g0.m138493B("e_xml_inflate", "", jyb.m147494Y("xml_name", e3i0.m119297c(c16695cTake.f91969c)), jyb.m147494Y("time_consume", Long.valueOf(jCurrentTimeMillis2)));
                        }
                    }
                } catch (RuntimeException e) {
                    CrashHelper.m82479c(new RuntimeException("异步初始化布局inflate异常 layout:" + e3i0.m119297c(c16695cTake.f91969c) + " , detail: " + e.toString()));
                }
                Message messageObtain = Message.obtain(c16695cTake.f91967a.f91962b, 0, c16695cTake);
                if (c16695cTake.f91971e) {
                    messageObtain.getTarget().sendMessageAtFrontOfQueue(messageObtain);
                } else {
                    messageObtain.getTarget().sendMessage(messageObtain);
                }
            } catch (InterruptedException e2) {
                CrashHelper.m82479c(new RuntimeException("TanTanAsyncLayoutInflate：异步加载，获取任务异常：" + e2.toString()));
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zM131595L2 = gra.m131595L2();
            this.f91974a = zM131595L2;
            if (zM131595L2) {
                Process.setThreadPriority(-19);
            }
            while (true) {
                m119310j();
            }
        }
    }

    /* JADX INFO: renamed from: l.e3i0$e */
    public interface InterfaceC16697e {
        /* JADX INFO: renamed from: a */
        void mo111496a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public e3i0(@NonNull Context context) {
        this.f91961a = new C16694b(context);
    }

    /* JADX INFO: renamed from: c */
    public static String m119297c(int i) {
        try {
            return CoreModule.f18263b.getResources().getResourceName(i);
        } catch (Exception unused) {
            return "get error";
        }
    }

    /* JADX INFO: renamed from: b */
    public void m119298b() {
        if (NullChecker.m82486a(this.f91963c)) {
            this.f91963c.m119304c();
        }
    }

    @UiThread
    /* JADX INFO: renamed from: d */
    public void m119299d(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC16697e interfaceC16697e) {
        m119300e(i, viewGroup, interfaceC16697e, true);
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public void m119300e(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC16697e interfaceC16697e, boolean z) {
        if (interfaceC16697e == null) {
            mnd0.m159157a("callback argument may not be null!");
            return;
        }
        C16695c c16695cM119308h = this.f91963c.m119308h();
        c16695cM119308h.f91967a = this;
        c16695cM119308h.f91969c = i;
        c16695cM119308h.f91968b = viewGroup;
        c16695cM119308h.f91972f = interfaceC16697e;
        c16695cM119308h.f91971e = z;
        this.f91963c.m119305d(c16695cM119308h);
    }
}
