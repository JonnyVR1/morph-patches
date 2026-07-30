package p153l;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mxf {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC18739g<Object> f139228a = new C18733a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.mxf$b */
    public class C18734b<T> implements InterfaceC18736d<List<T>> {
        @Override // p153l.mxf.InterfaceC18736d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.mxf$c */
    public class C18735c<T> implements InterfaceC18739g<List<T>> {
        @Override // p153l.mxf.InterfaceC18739g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo160656a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: l.mxf$d */
    public interface InterfaceC18736d<T> {
        T create();
    }

    /* JADX INFO: renamed from: l.mxf$e */
    public static final class C18737e<T> implements nj80<T> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC18736d<T> f139229a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC18739g<T> f139230b;

        /* JADX INFO: renamed from: c */
        private final nj80<T> f139231c;

        public C18737e(@NonNull nj80<T> nj80Var, @NonNull InterfaceC18736d<T> interfaceC18736d, @NonNull InterfaceC18739g<T> interfaceC18739g) {
            this.f139231c = nj80Var;
            this.f139229a = interfaceC18736d;
            this.f139230b = interfaceC18739g;
        }

        @Override // p153l.nj80
        public T acquire() {
            T tAcquire = this.f139231c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f139229a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tAcquire.getClass().toString();
                }
            }
            if (tAcquire instanceof InterfaceC18738f) {
                ((InterfaceC18738f) tAcquire).mo5402b().mo209210b(false);
            }
            return tAcquire;
        }

        @Override // p153l.nj80
        public boolean release(@NonNull T t) {
            if (t instanceof InterfaceC18738f) {
                ((InterfaceC18738f) t).mo5402b().mo209210b(true);
            }
            this.f139230b.mo160656a(t);
            return this.f139231c.release(t);
        }
    }

    /* JADX INFO: renamed from: l.mxf$f */
    public interface InterfaceC18738f {
        @NonNull
        /* JADX INFO: renamed from: b */
        x3g0 mo5402b();
    }

    /* JADX INFO: renamed from: l.mxf$g */
    public interface InterfaceC18739g<T> {
        /* JADX INFO: renamed from: a */
        void mo160656a(@NonNull T t);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    private static <T extends InterfaceC18738f> nj80<T> m160650a(@NonNull nj80<T> nj80Var, @NonNull InterfaceC18736d<T> interfaceC18736d) {
        return m160651b(nj80Var, interfaceC18736d, m160652c());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <T> nj80<T> m160651b(@NonNull nj80<T> nj80Var, @NonNull InterfaceC18736d<T> interfaceC18736d, @NonNull InterfaceC18739g<T> interfaceC18739g) {
        return new C18737e(nj80Var, interfaceC18736d, interfaceC18739g);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private static <T> InterfaceC18739g<T> m160652c() {
        return (InterfaceC18739g<T>) f139228a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC18738f> nj80<T> m160653d(int i, @NonNull InterfaceC18736d<T> interfaceC18736d) {
        return m160650a(new rj80(i), interfaceC18736d);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> nj80<List<T>> m160654e() {
        return m160655f(20);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> nj80<List<T>> m160655f(int i) {
        return m160651b(new rj80(i), new C18734b(), new C18735c());
    }

    /* JADX INFO: renamed from: l.mxf$a */
    public class C18733a implements InterfaceC18739g<Object> {
        @Override // p153l.mxf.InterfaceC18739g
        /* JADX INFO: renamed from: a */
        public void mo160656a(@NonNull Object obj) {
        }
    }
}
