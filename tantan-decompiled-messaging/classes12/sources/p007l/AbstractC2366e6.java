package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.j760;
import l.jo0;
import l.mkd0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: renamed from: l.e6 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class AbstractC2366e6<T> {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, o6e0<T>> f7222a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, n6e0> f7223b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f7224c;

    /* JADX INFO: renamed from: d */
    public int f7225d;

    /* JADX INFO: renamed from: e */
    public b<String> f7226e;

    public AbstractC2366e6() {
        b<String> bVarB = b.b();
        this.f7226e = bVarB;
        bVarB.debounce(200L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.b6
            public final void call(Object obj) {
                this.f6113a.m9631f((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public void m9629d() {
        Iterator<Map.Entry<String, n6e0>> it = this.f7223b.entrySet().iterator();
        if (it == null || !it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            it.next().getValue().m12096a();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract c<j760<Links, List<T>>> mo9630e(String str);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m9632g(String str, j760 j760Var) {
        n6e0 n6e0VarRemove = this.f7223b.remove(str);
        if (n6e0VarRemove == null) {
            return;
        }
        m9635j(n6e0VarRemove.f10681c, n6e0VarRemove.f10679a, j760Var);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m9633h(String str, Throwable th) {
        this.f7223b.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m9634i(String str) {
        this.f7226e.onNext(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m9635j(String str, int i, j760<Links, List<T>> j760Var) {
        o6e0<T> o6e0Var = new o6e0<>(str, i, j760Var);
        this.f7222a.put(str, o6e0Var);
        if (i > this.f7225d) {
            this.f7225d = i;
            mo9636k(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo9636k(o6e0<T> o6e0Var);

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m9631f(final String str) {
        this.f7224c++;
        o6e0<T> o6e0Var = this.f7222a.get(str);
        if (NullChecker.a(o6e0Var)) {
            o6e0Var.m12447b(this.f7224c);
            mo9636k(o6e0Var);
            return;
        }
        n6e0 n6e0Var = this.f7223b.get(str);
        if (NullChecker.a(n6e0Var)) {
            n6e0Var.m12097b(this.f7224c);
        } else {
            this.f7223b.put(str, new n6e0(str, this.f7224c, mo9630e(str).subscribe(mkd0.H(new e30() { // from class: l.c6
                public final void call(Object obj) {
                    this.f6543a.m9632g(str, (j760) obj);
                }
            }, new e30() { // from class: l.d6
                public final void call(Object obj) {
                    this.f6836a.m9633h(str, (Throwable) obj);
                }
            }))));
        }
    }
}
