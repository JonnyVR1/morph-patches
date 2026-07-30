package p153l;

import android.util.Pair;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class q0m {

    /* JADX INFO: renamed from: a */
    public C22421c<Pair<Boolean, Boolean>> f155068a;

    /* JADX INFO: renamed from: b */
    public g8t f155069b;

    public q0m(C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        this.f155068a = c22421c;
        this.f155069b = g8tVar;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C22421c m174726a(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo108622b();

    /* JADX INFO: renamed from: c */
    public <T> C22421c<T> m174727c(final C22421c<T> c22421c) {
        return psd0.m173593D(new pcj() { // from class: l.p0m
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return q0m.m174726a(c22421c);
            }
        }, this.f155068a, true);
    }

    /* JADX INFO: renamed from: d */
    public boolean m174728d() {
        return this.f155069b.m129460a();
    }

    /* JADX INFO: renamed from: e */
    public boolean m174729e() {
        return this.f155069b.m129461b();
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo108623f();
}
