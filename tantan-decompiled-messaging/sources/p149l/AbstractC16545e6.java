package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: renamed from: l.e6 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC16545e6<T> {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, o6e0<T>> f89481a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, n6e0> f89482b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f89483c;

    /* JADX INFO: renamed from: d */
    public int f89484d;

    /* JADX INFO: renamed from: e */
    public C22393b<String> f89485e;

    public AbstractC16545e6() {
        C22393b<String> c22393bM221521b = C22393b.m221521b();
        this.f89485e = c22393bM221521b;
        c22393bM221521b.debounce(200L, TimeUnit.MILLISECONDS).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.b6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73724a.m114930f((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public void m114928d() {
        Iterator<Map.Entry<String, n6e0>> it = this.f89482b.entrySet().iterator();
        if (it == null || !it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            it.next().getValue().m158037a();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract C22306c<j760<Links, List<T>>> mo114929e(String str);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m114931g(String str, j760 j760Var) {
        n6e0 n6e0VarRemove = this.f89482b.remove(str);
        if (n6e0VarRemove == null) {
            return;
        }
        m114934j(n6e0VarRemove.f137396c, n6e0VarRemove.f137394a, j760Var);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m114932h(String str, Throwable th) {
        this.f89482b.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m114933i(String str) {
        this.f89485e.onNext(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m114934j(String str, int i, j760<Links, List<T>> j760Var) {
        o6e0<T> o6e0Var = new o6e0<>(str, i, j760Var);
        this.f89481a.put(str, o6e0Var);
        if (i > this.f89484d) {
            this.f89484d = i;
            mo114935k(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo114935k(o6e0<T> o6e0Var);

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m114930f(final String str) {
        this.f89483c++;
        o6e0<T> o6e0Var = this.f89481a.get(str);
        if (NullChecker.m81303a(o6e0Var)) {
            o6e0Var.m162848b(this.f89483c);
            mo114935k(o6e0Var);
            return;
        }
        n6e0 n6e0Var = this.f89482b.get(str);
        if (NullChecker.m81303a(n6e0Var)) {
            n6e0Var.m158038b(this.f89483c);
        } else {
            this.f89482b.put(str, new n6e0(str, this.f89483c, mo114929e(str).subscribe(mkd0.m154956H(new e30() { // from class: l.c6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79432a.m114931g(str, (j760) obj);
                }
            }, new e30() { // from class: l.d6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84575a.m114932h(str, (Throwable) obj);
                }
            }))));
        }
    }
}
