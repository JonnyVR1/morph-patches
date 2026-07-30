package p149l;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa5<T> implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f */
    public static int f96562f;

    /* JADX INFO: renamed from: a */
    public boolean f96565a = false;

    /* JADX INFO: renamed from: b */
    public final SharedReference<T> f96566b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16786c f96567c;

    /* JADX INFO: renamed from: d */
    public final Throwable f96568d;

    /* JADX INFO: renamed from: e */
    public static Class<fa5> f96561e = fa5.class;

    /* JADX INFO: renamed from: g */
    public static final twc0<Closeable> f96563g = new C16784a();

    /* JADX INFO: renamed from: h */
    public static final InterfaceC16786c f96564h = new C16785b();

    /* JADX INFO: renamed from: l.fa5$a */
    public class C16784a implements twc0<Closeable> {
        @Override // p149l.twc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                la5.m149127a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fa5$b */
    public class C16785b implements InterfaceC16786c {
        @Override // p149l.fa5.InterfaceC16786c
        /* JADX INFO: renamed from: a */
        public boolean mo120160a() {
            return false;
        }

        @Override // p149l.fa5.InterfaceC16786c
        /* JADX INFO: renamed from: b */
        public void mo120161b(SharedReference<Object> sharedReference, Throwable th) {
            Object objM8165f = sharedReference.m8165f();
            tsf.m190557w(fa5.f96561e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objM8165f == null ? null : objM8165f.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: l.fa5$c */
    public interface InterfaceC16786c {
        /* JADX INFO: renamed from: a */
        boolean mo120160a();

        /* JADX INFO: renamed from: b */
        void mo120161b(SharedReference<Object> sharedReference, Throwable th);
    }

    public fa5(SharedReference<T> sharedReference, InterfaceC16786c interfaceC16786c, Throwable th) {
        this.f96566b = (SharedReference) rf80.m179116g(sharedReference);
        sharedReference.m8161b();
        this.f96567c = interfaceC16786c;
        this.f96568d = th;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m120144Q(fa5<?> fa5Var) {
        return fa5Var != null && fa5Var.mo120157N();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Ll/fa5<TT;>; */
    /* JADX INFO: renamed from: S */
    public static fa5 m120145S(Closeable closeable) {
        return m120147Y(closeable, f96563g);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Ll/fa5$c;)Ll/fa5<TT;>; */
    /* JADX INFO: renamed from: T */
    public static fa5 m120146T(Closeable closeable, InterfaceC16786c interfaceC16786c) {
        if (closeable == null) {
            return null;
        }
        return m120149c0(closeable, f96563g, interfaceC16786c, interfaceC16786c.mo120160a() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: Y */
    public static <T> fa5<T> m120147Y(T t, twc0<T> twc0Var) {
        return m120148Z(t, twc0Var, f96564h);
    }

    /* JADX INFO: renamed from: Z */
    public static <T> fa5<T> m120148Z(T t, twc0<T> twc0Var, InterfaceC16786c interfaceC16786c) {
        if (t == null) {
            return null;
        }
        return m120149c0(t, twc0Var, interfaceC16786c, interfaceC16786c.mo120160a() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: c0 */
    public static <T> fa5<T> m120149c0(T t, twc0<T> twc0Var, InterfaceC16786c interfaceC16786c, Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof uvk)) {
            int i = f96562f;
            if (i == 1) {
                return new jli(t, twc0Var, interfaceC16786c, th);
            }
            if (i == 2) {
                return new amc0(t, twc0Var, interfaceC16786c, th);
            }
            if (i == 3) {
                return new lk40(t);
            }
        }
        return new kmd(t, twc0Var, interfaceC16786c, th);
    }

    /* JADX INFO: renamed from: n */
    public static <T> List<fa5<T>> m120151n(Collection<fa5<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<fa5<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m120152t(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static <T> fa5<T> m120152t(fa5<T> fa5Var) {
        if (fa5Var != null) {
            return fa5Var.mo120158q();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m120153u(Iterable<? extends fa5<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends fa5<?>> it = iterable.iterator();
            while (it.hasNext()) {
                m120154v(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m120154v(fa5<?> fa5Var) {
        if (fa5Var != null) {
            fa5Var.close();
        }
    }

    /* JADX INFO: renamed from: B */
    public synchronized T m120155B() {
        rf80.m179118i(!this.f96565a);
        return (T) rf80.m179116g(this.f96566b.m8165f());
    }

    /* JADX INFO: renamed from: M */
    public int m120156M() {
        if (mo120157N()) {
            return System.identityHashCode(this.f96566b.m8165f());
        }
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public synchronized boolean mo120157N() {
        return !this.f96565a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f96565a) {
                    return;
                }
                this.f96565a = true;
                this.f96566b.m8163d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract fa5<T> clone();

    /* JADX INFO: renamed from: q */
    public synchronized fa5<T> mo120158q() {
        if (!mo120157N()) {
            return null;
        }
        return clone();
    }

    public fa5(T t, twc0<T> twc0Var, InterfaceC16786c interfaceC16786c, Throwable th, boolean z) {
        this.f96566b = new SharedReference<>(t, twc0Var, z);
        this.f96567c = interfaceC16786c;
        this.f96568d = th;
    }
}
