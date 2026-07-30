package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class j21 {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f115855a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f115858d = new C17667a();

    /* JADX INFO: renamed from: b */
    public Handler f115856b = new Handler(this.f115858d);

    /* JADX INFO: renamed from: c */
    public C17670d f115857c = C17670d.m139398b();

    /* JADX INFO: renamed from: l.j21$a */
    public class C17667a implements Handler.Callback {
        public C17667a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C17669c c17669c = (C17669c) message.obj;
            if (c17669c.f115864d == null) {
                c17669c.f115864d = j21.this.f115855a.inflate(c17669c.f115863c, c17669c.f115862b, false);
            }
            c17669c.f115865e.mo132341a(c17669c.f115864d, c17669c.f115863c, c17669c.f115862b);
            j21.this.f115857c.m139401d(c17669c);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.j21$b */
    public static class C17668b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f115860a = {"android.widget.", "android.webkit.", "android.app."};

        public C17668b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C17668b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f115860a) {
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

    /* JADX INFO: renamed from: l.j21$c */
    public static class C17669c {

        /* JADX INFO: renamed from: a */
        public j21 f115861a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f115862b;

        /* JADX INFO: renamed from: c */
        public int f115863c;

        /* JADX INFO: renamed from: d */
        public View f115864d;

        /* JADX INFO: renamed from: e */
        public InterfaceC17671e f115865e;
    }

    /* JADX INFO: renamed from: l.j21$d */
    public static class C17670d extends Thread {

        /* JADX INFO: renamed from: c */
        public static final C17670d f115866c;

        /* JADX INFO: renamed from: a */
        public ArrayBlockingQueue<C17669c> f115867a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b */
        public lb80<C17669c> f115868b = new lb80<>(10);

        static {
            C17670d c17670d = new C17670d();
            f115866c = c17670d;
            c17670d.start();
        }

        /* JADX INFO: renamed from: b */
        public static C17670d m139398b() {
            return f115866c;
        }

        /* JADX INFO: renamed from: a */
        public void m139399a(C17669c c17669c) {
            try {
                this.f115867a.put(c17669c);
            } catch (InterruptedException e) {
                pkq0.m170054a("Failed to enqueue async inflate request", e);
            }
        }

        /* JADX INFO: renamed from: c */
        public C17669c m139400c() {
            C17669c c17669cAcquire = this.f115868b.acquire();
            return c17669cAcquire == null ? new C17669c() : c17669cAcquire;
        }

        /* JADX INFO: renamed from: d */
        public void m139401d(C17669c c17669c) {
            c17669c.f115865e = null;
            c17669c.f115861a = null;
            c17669c.f115862b = null;
            c17669c.f115863c = 0;
            c17669c.f115864d = null;
            this.f115868b.release(c17669c);
        }

        /* JADX INFO: renamed from: e */
        public void m139402e() {
            try {
                C17669c c17669cTake = this.f115867a.take();
                try {
                    c17669cTake.f115864d = c17669cTake.f115861a.f115855a.inflate(c17669cTake.f115863c, c17669cTake.f115862b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(c17669cTake.f115861a.f115856b, 0, c17669cTake).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m139402e();
            }
        }
    }

    /* JADX INFO: renamed from: l.j21$e */
    public interface InterfaceC17671e {
        /* JADX INFO: renamed from: a */
        void mo132341a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public j21(@NonNull Context context) {
        this.f115855a = new C17668b(context);
    }

    @UiThread
    /* JADX INFO: renamed from: a */
    public void m139397a(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC17671e interfaceC17671e) {
        if (interfaceC17671e == null) {
            jfd0.m141176a("callback argument may not be null!");
            return;
        }
        C17669c c17669cM139400c = this.f115857c.m139400c();
        c17669cM139400c.f115861a = this;
        c17669cM139400c.f115863c = i;
        c17669cM139400c.f115862b = viewGroup;
        c17669cM139400c.f115865e = interfaceC17671e;
        this.f115857c.m139399a(c17669cM139400c);
    }
}
