package p149l;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yvf {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC21546g<Object> f200250a = new C21540a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.yvf$b */
    public class C21541b<T> implements InterfaceC21543d<List<T>> {
        @Override // p149l.yvf.InterfaceC21543d
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: l.yvf$c */
    public class C21542c<T> implements InterfaceC21546g<List<T>> {
        @Override // p149l.yvf.InterfaceC21546g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo216212a(@NonNull List<T> list) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: l.yvf$d */
    public interface InterfaceC21543d<T> {
        T create();
    }

    /* JADX INFO: renamed from: l.yvf$e */
    public static final class C21544e<T> implements hb80<T> {

        /* JADX INFO: renamed from: a */
        private final InterfaceC21543d<T> f200251a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC21546g<T> f200252b;

        /* JADX INFO: renamed from: c */
        private final hb80<T> f200253c;

        public C21544e(@NonNull hb80<T> hb80Var, @NonNull InterfaceC21543d<T> interfaceC21543d, @NonNull InterfaceC21546g<T> interfaceC21546g) {
            this.f200253c = hb80Var;
            this.f200251a = interfaceC21543d;
            this.f200252b = interfaceC21546g;
        }

        @Override // p149l.hb80
        public T acquire() {
            T tAcquire = this.f200253c.acquire();
            if (tAcquire == null) {
                tAcquire = this.f200251a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    tAcquire.getClass().toString();
                }
            }
            if (tAcquire instanceof InterfaceC21545f) {
                ((InterfaceC21545f) tAcquire).mo5376a().mo166182b(false);
            }
            return tAcquire;
        }

        @Override // p149l.hb80
        public boolean release(@NonNull T t) {
            if (t instanceof InterfaceC21545f) {
                ((InterfaceC21545f) t).mo5376a().mo166182b(true);
            }
            this.f200252b.mo216212a(t);
            return this.f200253c.release(t);
        }
    }

    /* JADX INFO: renamed from: l.yvf$f */
    public interface InterfaceC21545f {
        @NonNull
        /* JADX INFO: renamed from: a */
        ovf0 mo5376a();
    }

    /* JADX INFO: renamed from: l.yvf$g */
    public interface InterfaceC21546g<T> {
        /* JADX INFO: renamed from: a */
        void mo216212a(@NonNull T t);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    private static <T extends InterfaceC21545f> hb80<T> m216206a(@NonNull hb80<T> hb80Var, @NonNull InterfaceC21543d<T> interfaceC21543d) {
        return m216207b(hb80Var, interfaceC21543d, m216208c());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    private static <T> hb80<T> m216207b(@NonNull hb80<T> hb80Var, @NonNull InterfaceC21543d<T> interfaceC21543d, @NonNull InterfaceC21546g<T> interfaceC21546g) {
        return new C21544e(hb80Var, interfaceC21543d, interfaceC21546g);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    private static <T> InterfaceC21546g<T> m216208c() {
        return (InterfaceC21546g<T>) f200250a;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC21545f> hb80<T> m216209d(int i, @NonNull InterfaceC21543d<T> interfaceC21543d) {
        return m216206a(new lb80(i), interfaceC21543d);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> hb80<List<T>> m216210e() {
        return m216211f(20);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static <T> hb80<List<T>> m216211f(int i) {
        return m216207b(new lb80(i), new C21541b(), new C21542c());
    }

    /* JADX INFO: renamed from: l.yvf$a */
    public class C21540a implements InterfaceC21546g<Object> {
        @Override // p149l.yvf.InterfaceC21546g
        /* JADX INFO: renamed from: a */
        public void mo216212a(@NonNull Object obj) {
        }
    }
}
