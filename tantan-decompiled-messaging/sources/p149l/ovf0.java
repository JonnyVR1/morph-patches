package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class ovf0 {

    /* JADX INFO: renamed from: l.ovf0$b */
    public static class C19052b extends ovf0 {

        /* JADX INFO: renamed from: a */
        private volatile boolean f145810a;

        public C19052b() {
            super();
        }

        @Override // p149l.ovf0
        /* JADX INFO: renamed from: b */
        public void mo166182b(boolean z) {
            this.f145810a = z;
        }

        @Override // p149l.ovf0
        /* JADX INFO: renamed from: c */
        public void mo166183c() {
            if (this.f145810a) {
                qkq0.m175383a("Already released");
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ovf0 m166181a() {
        return new C19052b();
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo166182b(boolean z);

    /* JADX INFO: renamed from: c */
    public abstract void mo166183c();

    private ovf0() {
    }
}
