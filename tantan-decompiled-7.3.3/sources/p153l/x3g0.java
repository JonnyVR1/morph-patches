package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class x3g0 {

    /* JADX INFO: renamed from: l.x3g0$b */
    public static class C21243b extends x3g0 {

        /* JADX INFO: renamed from: a */
        private volatile boolean f192255a;

        public C21243b() {
            super();
        }

        @Override // p153l.x3g0
        /* JADX INFO: renamed from: b */
        public void mo209210b(boolean z) {
            this.f192255a = z;
        }

        @Override // p153l.x3g0
        /* JADX INFO: renamed from: c */
        public void mo209211c() {
            if (this.f192255a) {
                wtq0.m207906a("Already released");
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static x3g0 m209209a() {
        return new C21243b();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo209210b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo209211c();

    private x3g0() {
    }
}
