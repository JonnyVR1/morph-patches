package p007l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class nsi0 {

    /* JADX INFO: renamed from: e */
    public static nsi0 f3435e;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Object f3436a = new Object();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f3437b = new Handler(Looper.getMainLooper(), new C0626a());

    /* JADX INFO: renamed from: c */
    @Nullable
    public C0628c f3438c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C0628c f3439d;

    /* JADX INFO: renamed from: l.nsi0$a */
    public class C0626a implements Handler.Callback {
        public C0626a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            nsi0.this.m10082c((C0628c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.nsi0$b */
    public interface InterfaceC0627b {
        void dismiss(int i);

        void show();
    }

    /* JADX INFO: renamed from: l.nsi0$c */
    public static class C0628c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final InterfaceC0627b f3441a;

        /* JADX INFO: renamed from: b */
        public int f3442b;

        public C0628c(int i, @NotNull InterfaceC0627b interfaceC0627b) {
            this.f3441a = interfaceC0627b;
            this.f3442b = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m10090a(@Nullable InterfaceC0627b interfaceC0627b) {
            return this.f3441a == interfaceC0627b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static nsi0 m10080b() {
        if (f3435e == null) {
            f3435e = new nsi0();
        }
        return f3435e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10081a(@NonNull C0628c c0628c, int i) {
        InterfaceC0627b interfaceC0627b = c0628c.f3441a;
        this.f3437b.removeCallbacksAndMessages(c0628c);
        interfaceC0627b.dismiss(i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m10082c(@NonNull C0628c c0628c) {
        synchronized (this.f3436a) {
            try {
                if (this.f3438c == c0628c || this.f3439d == c0628c) {
                    m10081a(c0628c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10083d(InterfaceC0627b interfaceC0627b) {
        C0628c c0628c = this.f3438c;
        return c0628c != null && c0628c.m10090a(interfaceC0627b);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m10084e(InterfaceC0627b interfaceC0627b) {
        C0628c c0628c = this.f3439d;
        return c0628c != null && c0628c.m10090a(interfaceC0627b);
    }

    /* JADX INFO: renamed from: f */
    public void m10085f(InterfaceC0627b interfaceC0627b) {
        synchronized (this.f3436a) {
            try {
                if (m10083d(interfaceC0627b)) {
                    this.f3438c = null;
                    if (this.f3439d != null) {
                        m10089j();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10086g(InterfaceC0627b interfaceC0627b) {
        synchronized (this.f3436a) {
            try {
                if (m10083d(interfaceC0627b)) {
                    m10087h(this.f3438c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10087h(@NonNull C0628c c0628c) {
        int i = c0628c.f3442b;
        if (i <= 0) {
            i = i == -1 ? 2000 : 3500;
        }
        this.f3437b.removeCallbacksAndMessages(c0628c);
        Handler handler = this.f3437b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0628c), i);
    }

    /* JADX INFO: renamed from: i */
    public void m10088i(int i, InterfaceC0627b interfaceC0627b) {
        synchronized (this.f3436a) {
            try {
                if (m10083d(interfaceC0627b)) {
                    C0628c c0628c = this.f3438c;
                    c0628c.f3442b = i;
                    this.f3437b.removeCallbacksAndMessages(c0628c);
                    m10087h(this.f3438c);
                    return;
                }
                if (m10084e(interfaceC0627b)) {
                    this.f3439d.f3442b = i;
                } else {
                    this.f3439d = new C0628c(i, interfaceC0627b);
                }
                C0628c c0628c2 = this.f3438c;
                if (c0628c2 == null || !m10081a(c0628c2, 4)) {
                    this.f3438c = null;
                    m10089j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10089j() {
        C0628c c0628c = this.f3439d;
        if (c0628c != null) {
            this.f3438c = c0628c;
            this.f3439d = null;
            c0628c.f3441a.show();
        }
    }
}
