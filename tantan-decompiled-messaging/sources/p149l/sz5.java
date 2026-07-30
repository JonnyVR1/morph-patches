package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class sz5 {

    /* JADX INFO: renamed from: a */
    private String f167016a;

    /* JADX INFO: renamed from: l.sz5$a */
    public static final class C20084a {

        /* JADX INFO: renamed from: a */
        private String f167017a;

        public /* synthetic */ C20084a(pat0 pat0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public sz5 m186745a() {
            String str = this.f167017a;
            pat0 pat0Var = null;
            if (str == null) {
                ig3.m135964a("Purchase token must be set");
                return null;
            }
            sz5 sz5Var = new sz5(pat0Var);
            sz5Var.f167016a = str;
            return sz5Var;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C20084a m186746b(@NonNull String str) {
            this.f167017a = str;
            return this;
        }
    }

    public /* synthetic */ sz5(pat0 pat0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C20084a m186742b() {
        return new C20084a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m186744a() {
        return this.f167016a;
    }
}
