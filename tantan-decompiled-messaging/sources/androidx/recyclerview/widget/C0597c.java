package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0597c<T> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Executor f2691a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Executor f2692b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C0601g.f<T> f2693c;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: d */
        public static final Object f2694d = new Object();

        /* JADX INFO: renamed from: e */
        public static Executor f2695e;

        /* JADX INFO: renamed from: a */
        @Nullable
        public Executor f2696a;

        /* JADX INFO: renamed from: b */
        public Executor f2697b;

        /* JADX INFO: renamed from: c */
        public final C0601g.f<T> f2698c;

        public a(@NonNull C0601g.f<T> fVar) {
            this.f2698c = fVar;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0597c<T> m3638a() {
            if (this.f2697b == null) {
                synchronized (f2694d) {
                    try {
                        if (f2695e == null) {
                            f2695e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2697b = f2695e;
            }
            return new C0597c<>(this.f2696a, this.f2697b, this.f2698c);
        }
    }

    public C0597c(@Nullable Executor executor, @NonNull Executor executor2, @NonNull C0601g.f<T> fVar) {
        this.f2691a = executor;
        this.f2692b = executor2;
        this.f2693c = fVar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Executor m3635a() {
        return this.f2692b;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public C0601g.f<T> m3636b() {
        return this.f2693c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public Executor m3637c() {
        return this.f2691a;
    }
}
