package p149l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class vnb0 {

    /* JADX INFO: renamed from: a */
    private final String f182222a;

    /* JADX INFO: renamed from: l.vnb0$a */
    public static class C20667a {

        /* JADX INFO: renamed from: a */
        private String f182223a;

        public /* synthetic */ C20667a(lxt0 lxt0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public vnb0 m199002a() {
            if (this.f182223a != null) {
                return new vnb0(this, null);
            }
            ig3.m135964a("Product type must be set");
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C20667a m199003b(@NonNull String str) {
            this.f182223a = str;
            return this;
        }
    }

    public /* synthetic */ vnb0(C20667a c20667a, lxt0 lxt0Var) {
        this.f182222a = c20667a.f182223a;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C20667a m198999a() {
        return new C20667a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final String m199000b() {
        return this.f182222a;
    }
}
