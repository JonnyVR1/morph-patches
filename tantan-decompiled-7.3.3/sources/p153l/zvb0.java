package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zvb0 {

    /* JADX INFO: renamed from: a */
    private final String f206207a;

    /* JADX INFO: renamed from: l.zvb0$a */
    public static class C21904a {

        /* JADX INFO: renamed from: a */
        private String f206208a;

        public /* synthetic */ C21904a(r6u0 r6u0Var) {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public zvb0 m221753a() {
            if (this.f206208a != null) {
                return new zvb0(this, null);
            }
            wg3.m206174a("Product type must be set");
            return null;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C21904a m221754b(@NonNull String str) {
            this.f206208a = str;
            return this;
        }
    }

    public /* synthetic */ zvb0(C21904a c21904a, r6u0 r6u0Var) {
        this.f206207a = c21904a.f206208a;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C21904a m221750a() {
        return new C21904a(null);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final String m221751b() {
        return this.f206207a;
    }
}
