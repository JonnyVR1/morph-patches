package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c10 {

    /* JADX INFO: renamed from: a */
    private String f79312a;

    /* JADX INFO: renamed from: l.c10$a */
    public static final class C16159a {

        /* JADX INFO: renamed from: a */
        private String f79313a;

        public /* synthetic */ C16159a(nar0 nar0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public c10 m107483a() {
            String str = this.f79313a;
            nar0 nar0Var = null;
            if (str == null) {
                wg3.m206174a("Purchase token must be set");
                return null;
            }
            c10 c10Var = new c10(nar0Var);
            c10Var.f79312a = str;
            return c10Var;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C16159a m107484b(@NonNull String str) {
            this.f79313a = str;
            return this;
        }
    }

    public /* synthetic */ c10(nar0 nar0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C16159a m107480b() {
        return new C16159a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m107482a() {
        return this.f79312a;
    }
}
