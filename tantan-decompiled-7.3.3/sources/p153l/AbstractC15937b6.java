package p153l;

import com.p051p1.mobile.putong.data.Links;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: renamed from: l.b6 */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC15937b6<T> {

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, tee0<T>> f75118a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, see0> f75119b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f75120c;

    /* JADX INFO: renamed from: d */
    public int f75121d;

    /* JADX INFO: renamed from: e */
    public C22508b<String> f75122e;

    public AbstractC15937b6() {
        C22508b<String> c22508bM222767b = C22508b.m222767b();
        this.f75122e = c22508bM222767b;
        c22508bM222767b.debounce(200L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.y5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197523a.m102682f((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: d */
    public void m102680d() {
        Iterator<Map.Entry<String, see0>> it = this.f75119b.entrySet().iterator();
        if (it == null || !it.hasNext()) {
            return;
        }
        while (it.hasNext()) {
            it.next().getValue().m185531a();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract C22421c<pf60<Links, List<T>>> mo102681e(String str);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m102683g(String str, pf60 pf60Var) {
        see0 see0VarRemove = this.f75119b.remove(str);
        if (see0VarRemove == null) {
            return;
        }
        m102686j(see0VarRemove.f167610c, see0VarRemove.f167608a, pf60Var);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m102684h(String str, Throwable th) {
        this.f75119b.remove(str);
    }

    /* JADX INFO: renamed from: i */
    public void m102685i(String str) {
        this.f75122e.onNext(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m102686j(String str, int i, pf60<Links, List<T>> pf60Var) {
        tee0<T> tee0Var = new tee0<>(str, i, pf60Var);
        this.f75118a.put(str, tee0Var);
        if (i > this.f75121d) {
            this.f75121d = i;
            mo102687k(tee0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo102687k(tee0<T> tee0Var);

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m102682f(final String str) {
        this.f75120c++;
        tee0<T> tee0Var = this.f75118a.get(str);
        if (NullChecker.m82486a(tee0Var)) {
            tee0Var.m190693b(this.f75120c);
            mo102687k(tee0Var);
            return;
        }
        see0 see0Var = this.f75119b.get(str);
        if (NullChecker.m82486a(see0Var)) {
            see0Var.m185532b(this.f75120c);
        } else {
            this.f75119b.put(str, new see0(str, this.f75120c, mo102681e(str).subscribe(psd0.m173597H(new y20() { // from class: l.z5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202995a.m102683g(str, (pf60) obj);
                }
            }, new y20() { // from class: l.a6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68656a.m102684h(str, (Throwable) obj);
                }
            }))));
        }
    }
}
