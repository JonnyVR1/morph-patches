package p153l;

import android.graphics.Bitmap;
import com.facebook.common.references.SharedReference;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class fb5<T> implements Cloneable, Closeable {

    /* JADX INFO: renamed from: f */
    public static int f98042f;

    /* JADX INFO: renamed from: a */
    public boolean f98045a = false;

    /* JADX INFO: renamed from: b */
    public final SharedReference<T> f98046b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16935c f98047c;

    /* JADX INFO: renamed from: d */
    public final Throwable f98048d;

    /* JADX INFO: renamed from: e */
    public static Class<fb5> f98041e = fb5.class;

    /* JADX INFO: renamed from: g */
    public static final w4d0<Closeable> f98043g = new C16933a();

    /* JADX INFO: renamed from: h */
    public static final InterfaceC16935c f98044h = new C16934b();

    /* JADX INFO: renamed from: l.fb5$a */
    public class C16933a implements w4d0<Closeable> {
        @Override // p153l.w4d0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(Closeable closeable) {
            try {
                lb5.m153574a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: l.fb5$b */
    public class C16934b implements InterfaceC16935c {
        @Override // p153l.fb5.InterfaceC16935c
        /* JADX INFO: renamed from: a */
        public boolean mo124881a() {
            return false;
        }

        @Override // p153l.fb5.InterfaceC16935c
        /* JADX INFO: renamed from: b */
        public void mo124882b(SharedReference<Object> sharedReference, Throwable th) {
            Object objM8219f = sharedReference.m8219f();
            huf.m137195w(fb5.f98041e, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), objM8219f == null ? null : objM8219f.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: l.fb5$c */
    public interface InterfaceC16935c {
        /* JADX INFO: renamed from: a */
        boolean mo124881a();

        /* JADX INFO: renamed from: b */
        void mo124882b(SharedReference<Object> sharedReference, Throwable th);
    }

    public fb5(SharedReference<T> sharedReference, InterfaceC16935c interfaceC16935c, Throwable th) {
        this.f98046b = (SharedReference) wn80.m207182g(sharedReference);
        sharedReference.m8215b();
        this.f98047c = interfaceC16935c;
        this.f98048d = th;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m124864Q(fb5<?> fb5Var) {
        return fb5Var != null && fb5Var.mo124877N();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Ll/fb5<TT;>; */
    /* JADX INFO: renamed from: S */
    public static fb5 m124865S(Closeable closeable) {
        return m124867Z(closeable, f98043g);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Ll/fb5$c;)Ll/fb5<TT;>; */
    /* JADX INFO: renamed from: U */
    public static fb5 m124866U(Closeable closeable, InterfaceC16935c interfaceC16935c) {
        if (closeable == null) {
            return null;
        }
        return m124869d0(closeable, f98043g, interfaceC16935c, interfaceC16935c.mo124881a() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: Z */
    public static <T> fb5<T> m124867Z(T t, w4d0<T> w4d0Var) {
        return m124868a0(t, w4d0Var, f98044h);
    }

    /* JADX INFO: renamed from: a0 */
    public static <T> fb5<T> m124868a0(T t, w4d0<T> w4d0Var, InterfaceC16935c interfaceC16935c) {
        if (t == null) {
            return null;
        }
        return m124869d0(t, w4d0Var, interfaceC16935c, interfaceC16935c.mo124881a() ? new Throwable() : null);
    }

    /* JADX INFO: renamed from: d0 */
    public static <T> fb5<T> m124869d0(T t, w4d0<T> w4d0Var, InterfaceC16935c interfaceC16935c, Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof kyk)) {
            int i = f98042f;
            if (i == 1) {
                return new foi(t, w4d0Var, interfaceC16935c, th);
            }
            if (i == 2) {
                return new huc0(t, w4d0Var, interfaceC16935c, th);
            }
            if (i == 3) {
                return new zs40(t);
            }
        }
        return new qnd(t, w4d0Var, interfaceC16935c, th);
    }

    /* JADX INFO: renamed from: n */
    public static <T> List<fb5<T>> m124871n(Collection<fb5<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<fb5<T>> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m124872t(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static <T> fb5<T> m124872t(fb5<T> fb5Var) {
        if (fb5Var != null) {
            return fb5Var.mo124879q();
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static void m124873u(Iterable<? extends fb5<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends fb5<?>> it = iterable.iterator();
            while (it.hasNext()) {
                m124874v(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m124874v(fb5<?> fb5Var) {
        if (fb5Var != null) {
            fb5Var.close();
        }
    }

    /* JADX INFO: renamed from: B */
    public synchronized T m124875B() {
        wn80.m207184i(!this.f98045a);
        return (T) wn80.m207182g(this.f98046b.m8219f());
    }

    /* JADX INFO: renamed from: M */
    public int m124876M() {
        if (mo124877N()) {
            return System.identityHashCode(this.f98046b.m8219f());
        }
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public synchronized boolean mo124877N() {
        return !this.f98045a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.f98045a) {
                    return;
                }
                this.f98045a = true;
                this.f98046b.m8217d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract fb5<T> clone();

    /* JADX INFO: renamed from: q */
    public synchronized fb5<T> mo124879q() {
        if (!mo124877N()) {
            return null;
        }
        return clone();
    }

    public fb5(T t, w4d0<T> w4d0Var, InterfaceC16935c interfaceC16935c, Throwable th, boolean z) {
        this.f98046b = new SharedReference<>(t, w4d0Var, z);
        this.f98047c = interfaceC16935c;
        this.f98048d = th;
    }
}
