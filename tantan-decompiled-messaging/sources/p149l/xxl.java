package p149l;

import android.util.Pair;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xxl {

    /* JADX INFO: renamed from: a */
    public C22306c<Pair<Boolean, Boolean>> f194878a;

    /* JADX INFO: renamed from: b */
    public f6t f194879b;

    public xxl(C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        this.f194878a = c22306c;
        this.f194879b = f6tVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22306c m211507a(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo105960b();

    /* JADX INFO: renamed from: c */
    public <T> C22306c<T> m211508c(final C22306c<T> c22306c) {
        return mkd0.m154952D(new v9j() { // from class: l.wxl
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return xxl.m211507a(c22306c);
            }
        }, this.f194878a, true);
    }

    /* JADX INFO: renamed from: d */
    public boolean m211509d() {
        return this.f194879b.m119636a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m211510e() {
        return this.f194879b.m119637b();
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo105961f();
}
