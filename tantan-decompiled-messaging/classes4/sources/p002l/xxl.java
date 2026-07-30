package p002l;

import android.util.Pair;
import l.mkd0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class xxl {

    /* JADX INFO: renamed from: a */
    public c<Pair<Boolean, Boolean>> f22501a;

    /* JADX INFO: renamed from: b */
    public f6t f22502b;

    public xxl(c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        this.f22501a = cVar;
        this.f22502b = f6tVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c m26171a(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10923b();

    /* JADX INFO: renamed from: c */
    public <T> c<T> m26172c(final c<T> cVar) {
        return mkd0.D(new v9j() { // from class: l.wxl
            public final Object call() {
                return xxl.m26171a(cVar);
            }
        }, this.f22501a, true);
    }

    /* JADX INFO: renamed from: d */
    public boolean m26173d() {
        return this.f22502b.m12966a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m26174e() {
        return this.f22502b.m12967b();
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo10924f();
}
