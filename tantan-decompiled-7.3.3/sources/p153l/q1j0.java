package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class q1j0 {

    /* JADX INFO: renamed from: e */
    public static q1j0 f155196e;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Object f155197a = new Object();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f155198b = new Handler(Looper.getMainLooper(), new C19489a());

    /* JADX INFO: renamed from: c */
    @Nullable
    public C19491c f155199c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C19491c f155200d;

    /* JADX INFO: renamed from: l.q1j0$a */
    public class C19489a implements Handler.Callback {
        public C19489a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            q1j0.this.m174894c((C19491c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.q1j0$b */
    public interface InterfaceC19490b {
        void dismiss(int i);

        void show();
    }

    /* JADX INFO: renamed from: l.q1j0$c */
    public static class C19491c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final InterfaceC19490b f155202a;

        /* JADX INFO: renamed from: b */
        public int f155203b;

        public C19491c(int i, @NotNull InterfaceC19490b interfaceC19490b) {
            this.f155202a = interfaceC19490b;
            this.f155203b = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m174902a(@Nullable InterfaceC19490b interfaceC19490b) {
            return this.f155202a == interfaceC19490b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static q1j0 m174892b() {
        if (f155196e == null) {
            f155196e = new q1j0();
        }
        return f155196e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m174893a(@NonNull C19491c c19491c, int i) {
        InterfaceC19490b interfaceC19490b = c19491c.f155202a;
        this.f155198b.removeCallbacksAndMessages(c19491c);
        interfaceC19490b.dismiss(i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m174894c(@NonNull C19491c c19491c) {
        synchronized (this.f155197a) {
            try {
                if (this.f155199c == c19491c || this.f155200d == c19491c) {
                    m174893a(c19491c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m174895d(InterfaceC19490b interfaceC19490b) {
        C19491c c19491c = this.f155199c;
        return c19491c != null && c19491c.m174902a(interfaceC19490b);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m174896e(InterfaceC19490b interfaceC19490b) {
        C19491c c19491c = this.f155200d;
        return c19491c != null && c19491c.m174902a(interfaceC19490b);
    }

    /* JADX INFO: renamed from: f */
    public void m174897f(InterfaceC19490b interfaceC19490b) {
        synchronized (this.f155197a) {
            try {
                if (m174895d(interfaceC19490b)) {
                    this.f155199c = null;
                    if (this.f155200d != null) {
                        m174901j();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m174898g(InterfaceC19490b interfaceC19490b) {
        synchronized (this.f155197a) {
            try {
                if (m174895d(interfaceC19490b)) {
                    m174899h(this.f155199c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m174899h(@NonNull C19491c c19491c) {
        int i = c19491c.f155203b;
        if (i <= 0) {
            i = i == -1 ? 2000 : 3500;
        }
        this.f155198b.removeCallbacksAndMessages(c19491c);
        Handler handler = this.f155198b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c19491c), i);
    }

    /* JADX INFO: renamed from: i */
    public void m174900i(int i, InterfaceC19490b interfaceC19490b) {
        synchronized (this.f155197a) {
            try {
                if (m174895d(interfaceC19490b)) {
                    C19491c c19491c = this.f155199c;
                    c19491c.f155203b = i;
                    this.f155198b.removeCallbacksAndMessages(c19491c);
                    m174899h(this.f155199c);
                    return;
                }
                if (m174896e(interfaceC19490b)) {
                    this.f155200d.f155203b = i;
                } else {
                    this.f155200d = new C19491c(i, interfaceC19490b);
                }
                C19491c c19491c2 = this.f155199c;
                if (c19491c2 == null || !m174893a(c19491c2, 4)) {
                    this.f155199c = null;
                    m174901j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m174901j() {
        C19491c c19491c = this.f155200d;
        if (c19491c != null) {
            this.f155199c = c19491c;
            this.f155200d = null;
            c19491c.f155202a.show();
        }
    }
}
