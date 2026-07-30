package p153l;

import android.util.Log;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class xpy {

    /* JADX INFO: renamed from: b */
    private RunnableC21412a f195754b;

    /* JADX INFO: renamed from: c */
    private String f195755c;

    /* JADX INFO: renamed from: a */
    private boolean f195753a = false;

    /* JADX INFO: renamed from: d */
    private long f195756d = 10000;

    /* JADX INFO: renamed from: e */
    private Object f195757e = null;

    /* JADX INFO: renamed from: l.xpy$a */
    public class RunnableC21412a<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        InterfaceC21413b<T> f195758a;

        public RunnableC21412a(InterfaceC21413b<T> interfaceC21413b) {
            this.f195758a = interfaceC21413b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f195758a == null || xpy.this.f195753a) {
                Objects.toString(this.f195758a);
                boolean unused = xpy.this.f195753a;
                return;
            }
            xpy.this.m212693e(this.f195758a.mo111495a(), this.f195758a.mo120414b());
            long j = xpy.this.f195756d;
            if (xpy.this.f195757e != null) {
                j = xpy.this.f195756d >> 1;
                Log.e("MemoryLeakChecker", "object: " + xpy.this.f195757e + " may be leaked, MemoryLeakChecker will check after " + j + " ms.");
            }
            xpy.this.m212692g(this, j);
        }

        public String toString() {
            return "CheckAction " + this.f195758a;
        }
    }

    /* JADX INFO: renamed from: l.xpy$b */
    public interface InterfaceC21413b<T> {
        /* JADX INFO: renamed from: a */
        Iterator<T> mo111495a();

        /* JADX INFO: renamed from: b */
        InterfaceC21414c<T> mo120414b();
    }

    /* JADX INFO: renamed from: l.xpy$c */
    public interface InterfaceC21414c<T> {
        /* JADX INFO: renamed from: a */
        boolean mo120415a(T t);
    }

    public <T> xpy(InterfaceC21413b<T> interfaceC21413b) {
        this.f195754b = new RunnableC21412a(interfaceC21413b);
    }

    /* JADX INFO: renamed from: f */
    private Object m212691f() {
        return "MemoryLeakChecker" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final synchronized void m212692g(Runnable runnable, long j) {
        x310.m209187e(m212691f(), runnable, j);
    }

    /* JADX INFO: renamed from: e */
    public synchronized <T> void m212693e(Iterator<T> it, InterfaceC21414c<T> interfaceC21414c) {
        try {
            Objects.toString(it);
            Objects.toString(interfaceC21414c);
            boolean z = this.f195753a;
            if (it != null && interfaceC21414c != null && !z) {
                while (it.hasNext() && !this.f195753a) {
                    T next = it.next();
                    if (interfaceC21414c.mo120415a(next)) {
                        if (this.f195757e != next) {
                            this.f195757e = next;
                        }
                        throw new IllegalStateException("此异常只会在debug中或在白名单列表中出现\nobject : " + next + " is leaked! " + this.f195755c);
                    }
                }
                this.f195757e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m212694h(String str) {
        this.f195755c = str;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m212695i() {
        Objects.toString(this.f195754b);
        this.f195753a = false;
        this.f195754b.run();
    }
}
