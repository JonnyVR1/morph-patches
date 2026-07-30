package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p149l.gnr;

/* JADX INFO: renamed from: androidx.work.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0764d {

    /* JADX INFO: renamed from: a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.c f3469a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final b.C22658b f3470b;

    static {
        f3469a = new b.c();
        f3470b = new b.C22658b();
    }

    @NonNull
    gnr<b.c> getResult();

    /* JADX INFO: renamed from: androidx.work.d$b */
    public static abstract class b {

        /* JADX INFO: renamed from: androidx.work.d$b$a */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public final Throwable f3471a;

            public a(@NonNull Throwable th) {
                this.f3471a = th;
            }

            @NonNull
            public String toString() {
                return "FAILURE (" + this.f3471a.getMessage() + ")";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public b() {
        }

        /* JADX INFO: renamed from: androidx.work.d$b$b, reason: collision with other inner class name */
        public static final class C22658b extends b {
            @NonNull
            public String toString() {
                return "IN_PROGRESS";
            }

            public C22658b() {
            }
        }

        /* JADX INFO: renamed from: androidx.work.d$b$c */
        public static final class c extends b {
            @NonNull
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }
}
