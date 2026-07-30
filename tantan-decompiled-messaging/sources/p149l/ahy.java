package p149l;

import com.cosmos.mdlog.MDLog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class ahy {

    /* JADX INFO: renamed from: b */
    private RunnableC15626a f69938b;

    /* JADX INFO: renamed from: c */
    private String f69939c;

    /* JADX INFO: renamed from: a */
    private boolean f69937a = false;

    /* JADX INFO: renamed from: d */
    private long f69940d = 10000;

    /* JADX INFO: renamed from: e */
    private Object f69941e = null;

    /* JADX INFO: renamed from: l.ahy$a */
    public class RunnableC15626a<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        InterfaceC15627b<T> f69942a;

        public RunnableC15626a(InterfaceC15627b<T> interfaceC15627b) {
            this.f69942a = interfaceC15627b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f69942a == null || ahy.this.f69937a) {
                MDLog.m7389d("MemoryLeakChecker", "run checkable " + this.f69942a + " stoped " + ahy.this.f69937a);
                return;
            }
            ahy.this.m96755e(this.f69942a.mo96758a(), this.f69942a.mo96759b());
            long j = ahy.this.f69940d;
            if (ahy.this.f69941e != null) {
                j = ahy.this.f69940d >> 1;
                MDLog.m7391e("MemoryLeakChecker", "object: " + ahy.this.f69941e + " may be leaked, MemoryLeakChecker will check after " + j + " ms.");
            }
            ahy.this.m96754g(this, j);
        }

        public String toString() {
            return "CheckAction " + this.f69942a;
        }
    }

    /* JADX INFO: renamed from: l.ahy$b */
    public interface InterfaceC15627b<T> {
        /* JADX INFO: renamed from: a */
        Iterator<T> mo96758a();

        /* JADX INFO: renamed from: b */
        InterfaceC15628c<T> mo96759b();
    }

    /* JADX INFO: renamed from: l.ahy$c */
    public interface InterfaceC15628c<T> {
        /* JADX INFO: renamed from: a */
        boolean mo96760a(T t);
    }

    public <T> ahy(InterfaceC15627b<T> interfaceC15627b) {
        this.f69938b = new RunnableC15626a(interfaceC15627b);
    }

    /* JADX INFO: renamed from: f */
    private Object m96753f() {
        return "MemoryLeakChecker" + hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final synchronized void m96754g(Runnable runnable, long j) {
        pv00.m171495c(m96753f(), runnable, j);
    }

    /* JADX INFO: renamed from: e */
    public synchronized <T> void m96755e(Iterator<T> it, InterfaceC15628c<T> interfaceC15628c) {
        try {
            MDLog.m7389d("MemoryLeakChecker", "check pool " + it + " releaseable " + interfaceC15628c + " stoped " + this.f69937a);
            if (it != null && interfaceC15628c != null && !this.f69937a) {
                while (it.hasNext() && !this.f69937a) {
                    T next = it.next();
                    if (interfaceC15628c.mo96760a(next)) {
                        if (this.f69941e != next) {
                            this.f69941e = next;
                        }
                        throw new IllegalStateException("此异常只会在debug中或在白名单列表中出现\nobject : " + next + " is leaked! " + this.f69939c);
                    }
                }
                this.f69941e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m96756h(String str) {
        this.f69939c = str;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m96757i() {
        MDLog.m7389d("MemoryLeakChecker", "start check " + this.f69938b);
        this.f69937a = false;
        this.f69938b.run();
    }
}
