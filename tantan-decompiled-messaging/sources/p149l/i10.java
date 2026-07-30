package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class i10 {

    /* JADX INFO: renamed from: a */
    private String f110404a;

    /* JADX INFO: renamed from: l.i10$a */
    public static final class C17459a {

        /* JADX INFO: renamed from: a */
        private String f110405a;

        public /* synthetic */ C17459a(h1r0 h1r0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public i10 m133941a() {
            String str = this.f110405a;
            h1r0 h1r0Var = null;
            if (str == null) {
                ig3.m135964a("Purchase token must be set");
                return null;
            }
            i10 i10Var = new i10(h1r0Var);
            i10Var.f110404a = str;
            return i10Var;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C17459a m133942b(@NonNull String str) {
            this.f110405a = str;
            return this;
        }
    }

    public /* synthetic */ i10(h1r0 h1r0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C17459a m133938b() {
        return new C17459a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m133940a() {
        return this.f110404a;
    }
}
