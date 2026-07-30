package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class nsi0 {

    /* JADX INFO: renamed from: e */
    public static nsi0 f140268e;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Object f140269a = new Object();

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Handler f140270b = new Handler(Looper.getMainLooper(), new C18760a());

    /* JADX INFO: renamed from: c */
    @Nullable
    public C18762c f140271c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public C18762c f140272d;

    /* JADX INFO: renamed from: l.nsi0$a */
    public class C18760a implements Handler.Callback {
        public C18760a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            nsi0.this.m160772c((C18762c) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.nsi0$b */
    public interface InterfaceC18761b {
        void dismiss(int i);

        void show();
    }

    /* JADX INFO: renamed from: l.nsi0$c */
    public static class C18762c {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final InterfaceC18761b f140274a;

        /* JADX INFO: renamed from: b */
        public int f140275b;

        public C18762c(int i, @NotNull InterfaceC18761b interfaceC18761b) {
            this.f140274a = interfaceC18761b;
            this.f140275b = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m160780a(@Nullable InterfaceC18761b interfaceC18761b) {
            return this.f140274a == interfaceC18761b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static nsi0 m160770b() {
        if (f140268e == null) {
            f140268e = new nsi0();
        }
        return f140268e;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m160771a(@NonNull C18762c c18762c, int i) {
        InterfaceC18761b interfaceC18761b = c18762c.f140274a;
        this.f140270b.removeCallbacksAndMessages(c18762c);
        interfaceC18761b.dismiss(i);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m160772c(@NonNull C18762c c18762c) {
        synchronized (this.f140269a) {
            try {
                if (this.f140271c == c18762c || this.f140272d == c18762c) {
                    m160771a(c18762c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m160773d(InterfaceC18761b interfaceC18761b) {
        C18762c c18762c = this.f140271c;
        return c18762c != null && c18762c.m160780a(interfaceC18761b);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m160774e(InterfaceC18761b interfaceC18761b) {
        C18762c c18762c = this.f140272d;
        return c18762c != null && c18762c.m160780a(interfaceC18761b);
    }

    /* JADX INFO: renamed from: f */
    public void m160775f(InterfaceC18761b interfaceC18761b) {
        synchronized (this.f140269a) {
            try {
                if (m160773d(interfaceC18761b)) {
                    this.f140271c = null;
                    if (this.f140272d != null) {
                        m160779j();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m160776g(InterfaceC18761b interfaceC18761b) {
        synchronized (this.f140269a) {
            try {
                if (m160773d(interfaceC18761b)) {
                    m160777h(this.f140271c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m160777h(@NonNull C18762c c18762c) {
        int i = c18762c.f140275b;
        if (i <= 0) {
            i = i == -1 ? 2000 : 3500;
        }
        this.f140270b.removeCallbacksAndMessages(c18762c);
        Handler handler = this.f140270b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c18762c), i);
    }

    /* JADX INFO: renamed from: i */
    public void m160778i(int i, InterfaceC18761b interfaceC18761b) {
        synchronized (this.f140269a) {
            try {
                if (m160773d(interfaceC18761b)) {
                    C18762c c18762c = this.f140271c;
                    c18762c.f140275b = i;
                    this.f140270b.removeCallbacksAndMessages(c18762c);
                    m160777h(this.f140271c);
                    return;
                }
                if (m160774e(interfaceC18761b)) {
                    this.f140272d.f140275b = i;
                } else {
                    this.f140272d = new C18762c(i, interfaceC18761b);
                }
                C18762c c18762c2 = this.f140271c;
                if (c18762c2 == null || !m160771a(c18762c2, 4)) {
                    this.f140271c = null;
                    m160779j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m160779j() {
        C18762c c18762c = this.f140272d;
        if (c18762c != null) {
            this.f140271c = c18762c;
            this.f140272d = null;
            c18762c.f140274a.show();
        }
    }
}
