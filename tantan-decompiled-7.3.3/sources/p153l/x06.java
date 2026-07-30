package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class x06 {

    /* JADX INFO: renamed from: a */
    private String f191868a;

    /* JADX INFO: renamed from: l.x06$a */
    public static final class C21221a {

        /* JADX INFO: renamed from: a */
        private String f191869a;

        public /* synthetic */ C21221a(vjt0 vjt0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public x06 m208816a() {
            String str = this.f191869a;
            vjt0 vjt0Var = null;
            if (str == null) {
                wg3.m206174a("Purchase token must be set");
                return null;
            }
            x06 x06Var = new x06(vjt0Var);
            x06Var.f191868a = str;
            return x06Var;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C21221a m208817b(@NonNull String str) {
            this.f191869a = str;
            return this;
        }
    }

    public /* synthetic */ x06(vjt0 vjt0Var) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C21221a m208813b() {
        return new C21221a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m208815a() {
        return this.f191868a;
    }
}
