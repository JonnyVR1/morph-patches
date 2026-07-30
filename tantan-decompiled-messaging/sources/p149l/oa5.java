package p149l;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class oa5 implements Closeable {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC18881c f142773d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC18881c f142774a;

    /* JADX INFO: renamed from: b */
    public final Deque<Closeable> f142775b = new ArrayDeque(4);

    /* JADX INFO: renamed from: c */
    public Throwable f142776c;

    /* JADX INFO: renamed from: l.oa5$a */
    public static final class C18879a implements InterfaceC18881c {
        static final C18879a INSTANCE = new C18879a();

        @Override // p149l.oa5.InterfaceC18881c
        /* JADX INFO: renamed from: a */
        public void mo163285a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = ka5.f122095a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(closeable);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 42);
            sb.append("Suppressing exception thrown when closing ");
            sb.append(strValueOf);
            logger.log(level, sb.toString(), th2);
        }
    }

    /* JADX INFO: renamed from: l.oa5$b */
    public static final class C18880b implements InterfaceC18881c {

        /* JADX INFO: renamed from: a */
        public final Method f142777a;

        public C18880b(Method method) {
            this.f142777a = method;
        }

        /* JADX INFO: renamed from: b */
        public static C18880b m163286b() {
            try {
                return new C18880b(Throwable.class.getMethod("addSuppressed", Throwable.class));
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // p149l.oa5.InterfaceC18881c
        /* JADX INFO: renamed from: a */
        public void mo163285a(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                this.f142777a.invoke(th, th2);
            } catch (Throwable unused) {
                C18879a.INSTANCE.mo163285a(closeable, th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: l.oa5$c */
    public interface InterfaceC18881c {
        /* JADX INFO: renamed from: a */
        void mo163285a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        InterfaceC18881c interfaceC18881cM163286b = C18880b.m163286b();
        if (interfaceC18881cM163286b == null) {
            interfaceC18881cM163286b = C18879a.INSTANCE;
        }
        f142773d = interfaceC18881cM163286b;
    }

    public oa5(InterfaceC18881c interfaceC18881c) {
        this.f142774a = (InterfaceC18881c) sf80.m183894p(interfaceC18881c);
    }

    /* JADX INFO: renamed from: k */
    public static oa5 m163282k() {
        return new oa5(f142773d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.f142776c;
        while (!this.f142775b.isEmpty()) {
            Closeable closeableRemoveFirst = this.f142775b.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f142774a.mo163285a(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f142776c != null || th == null) {
            return;
        }
        rpi0.m180336g(th, IOException.class);
        y9g0.m213537a(th);
    }

    /* JADX INFO: renamed from: m */
    public <C extends Closeable> C m163283m(C c) {
        if (c != null) {
            this.f142775b.addFirst(c);
        }
        return c;
    }

    /* JADX INFO: renamed from: n */
    public RuntimeException m163284n(Throwable th) throws Throwable {
        sf80.m183894p(th);
        this.f142776c = th;
        rpi0.m180336g(th, IOException.class);
        throw new RuntimeException(th);
    }
}
