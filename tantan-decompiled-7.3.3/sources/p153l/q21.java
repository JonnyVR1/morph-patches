package p153l;

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
public final class q21 {

    /* JADX INFO: renamed from: a */
    public LayoutInflater f155243a;

    /* JADX INFO: renamed from: d */
    public Handler.Callback f155246d = new C19495a();

    /* JADX INFO: renamed from: b */
    public Handler f155244b = new Handler(this.f155246d);

    /* JADX INFO: renamed from: c */
    public C19498d f155245c = C19498d.m174962b();

    /* JADX INFO: renamed from: l.q21$a */
    public class C19495a implements Handler.Callback {
        public C19495a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            C19497c c19497c = (C19497c) message.obj;
            if (c19497c.f155252d == null) {
                c19497c.f155252d = q21.this.f155243a.inflate(c19497c.f155251c, c19497c.f155250b, false);
            }
            c19497c.f155253e.mo174967a(c19497c.f155252d, c19497c.f155251c, c19497c.f155250b);
            q21.this.f155245c.m174965d(c19497c);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.q21$b */
    public static class C19496b extends LayoutInflater {

        /* JADX INFO: renamed from: a */
        public static final String[] f155248a = {"android.widget.", "android.webkit.", "android.app."};

        public C19496b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new C19496b(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            for (String str2 : f155248a) {
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

    /* JADX INFO: renamed from: l.q21$c */
    public static class C19497c {

        /* JADX INFO: renamed from: a */
        public q21 f155249a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f155250b;

        /* JADX INFO: renamed from: c */
        public int f155251c;

        /* JADX INFO: renamed from: d */
        public View f155252d;

        /* JADX INFO: renamed from: e */
        public InterfaceC19499e f155253e;
    }

    /* JADX INFO: renamed from: l.q21$d */
    public static class C19498d extends Thread {

        /* JADX INFO: renamed from: c */
        public static final C19498d f155254c;

        /* JADX INFO: renamed from: a */
        public ArrayBlockingQueue<C19497c> f155255a = new ArrayBlockingQueue<>(10);

        /* JADX INFO: renamed from: b */
        public rj80<C19497c> f155256b = new rj80<>(10);

        static {
            C19498d c19498d = new C19498d();
            f155254c = c19498d;
            c19498d.start();
        }

        /* JADX INFO: renamed from: b */
        public static C19498d m174962b() {
            return f155254c;
        }

        /* JADX INFO: renamed from: a */
        public void m174963a(C19497c c19497c) {
            try {
                this.f155255a.put(c19497c);
            } catch (InterruptedException e) {
                vtq0.m202761a("Failed to enqueue async inflate request", e);
            }
        }

        /* JADX INFO: renamed from: c */
        public C19497c m174964c() {
            C19497c c19497cAcquire = this.f155256b.acquire();
            return c19497cAcquire == null ? new C19497c() : c19497cAcquire;
        }

        /* JADX INFO: renamed from: d */
        public void m174965d(C19497c c19497c) {
            c19497c.f155253e = null;
            c19497c.f155249a = null;
            c19497c.f155250b = null;
            c19497c.f155251c = 0;
            c19497c.f155252d = null;
            this.f155256b.release(c19497c);
        }

        /* JADX INFO: renamed from: e */
        public void m174966e() {
            try {
                C19497c c19497cTake = this.f155255a.take();
                try {
                    c19497cTake.f155252d = c19497cTake.f155249a.f155243a.inflate(c19497cTake.f155251c, c19497cTake.f155250b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(c19497cTake.f155249a.f155244b, 0, c19497cTake).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                m174966e();
            }
        }
    }

    /* JADX INFO: renamed from: l.q21$e */
    public interface InterfaceC19499e {
        /* JADX INFO: renamed from: a */
        void mo174967a(@NonNull View view, @LayoutRes int i, @Nullable ViewGroup viewGroup);
    }

    public q21(@NonNull Context context) {
        this.f155243a = new C19496b(context);
    }

    @UiThread
    /* JADX INFO: renamed from: a */
    public void m174961a(@LayoutRes int i, @Nullable ViewGroup viewGroup, @NonNull InterfaceC19499e interfaceC19499e) {
        if (interfaceC19499e == null) {
            mnd0.m159157a("callback argument may not be null!");
            return;
        }
        C19497c c19497cM174964c = this.f155245c.m174964c();
        c19497cM174964c.f155249a = this;
        c19497cM174964c.f155251c = i;
        c19497cM174964c.f155250b = viewGroup;
        c19497cM174964c.f155253e = interfaceC19499e;
        this.f155245c.m174963a(c19497cM174964c);
    }
}
