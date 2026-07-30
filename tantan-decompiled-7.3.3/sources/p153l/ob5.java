package p153l;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class ob5 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC19094c f145934d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC19094c f145935a;

    /* JADX INFO: renamed from: b */
    public final Deque<Closeable> f145936b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c */
    public Throwable f145937c;

    /* JADX INFO: renamed from: l.ob5$a */
    public static final class C19092a implements InterfaceC19094c {
        static final C19092a INSTANCE = new C19092a();

        @Override // p153l.ob5.InterfaceC19094c
        /* JADX INFO: renamed from: a */
        public void mo167024a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = kb5.f124753a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(closeable);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
            sb.append("Suppressing exception thrown when closing ");
            sb.append(strValueOf);
            logger.log(level, sb.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: l.ob5$b */
    public static final class C19093b implements InterfaceC19094c {

        /* JADX INFO: renamed from: a */
        public final Method f145938a;

        public C19093b(Method method) {
            this.f145938a = method;
        }

        /* JADX INFO: renamed from: b */
        public static C19093b m167025b() {
            try {
                return new C19093b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // p153l.ob5.InterfaceC19094c
        /* JADX INFO: renamed from: a */
        public void mo167024a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f145938a.invoke(th, th2);
            } catch (Throwable unused) {
                C19092a.INSTANCE.mo167024a(closeable, th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: l.ob5$c */
    public interface InterfaceC19094c {
        /* JADX INFO: renamed from: a */
        void mo167024a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        InterfaceC19094c interfaceC19094cM167025b = C19093b.m167025b();
        if (interfaceC19094cM167025b == null) {
            interfaceC19094cM167025b = C19092a.INSTANCE;
        }
        f145934d = interfaceC19094cM167025b;
    }

    public ob5(InterfaceC19094c interfaceC19094c) {
        this.f145935a = (InterfaceC19094c) xn80.m212111p(interfaceC19094c);
    }

    /* JADX INFO: renamed from: k */
    public static ob5 m167021k() {
        return new ob5(f145934d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.f145937c;
        while (!this.f145936b.isEmpty()) {
            Closeable closeableRemoveFirst = this.f145936b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f145935a.mo167024a(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f145937c != null || th == null) {
            return;
        }
        uyi0.m198659g(th, IOException.class);
        gig0.m130323a(th);
    }

    /* JADX INFO: renamed from: m */
    public <C extends Closeable> C m167022m(C c) {
        if (c != null) {
            this.f145936b.addFirst(c);
        }
        return c;
    }

    /* JADX INFO: renamed from: n */
    public RuntimeException m167023n(Throwable th) throws Throwable {
        xn80.m212111p(th);
        this.f145937c = th;
        uyi0.m198659g(th, IOException.class);
        throw new RuntimeException(th);
    }
}
