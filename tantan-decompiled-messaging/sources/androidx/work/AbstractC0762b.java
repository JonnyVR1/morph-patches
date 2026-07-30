package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.AbstractC0762b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.gnr;
import p149l.ig3;
import p149l.nyi;
import p149l.xaq0;
import p149l.zei0;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0762b {

    /* JADX INFO: renamed from: a */
    @NonNull
    private Context f3463a;

    /* JADX INFO: renamed from: b */
    @NonNull
    private WorkerParameters f3464b;

    /* JADX INFO: renamed from: c */
    private final AtomicInteger f3465c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d */
    private boolean f3466d;

    public AbstractC0762b(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            ig3.m135964a("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            ig3.m135964a("WorkerParameters is null");
            throw null;
        }
        this.f3463a = context;
        this.f3464b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m4412a(CallbackToFutureAdapter.C0201a c0201a) {
        c0201a.m870f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.f3463a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.f3464b.m4359a();
    }

    @NonNull
    public gnr<nyi> getForegroundInfoAsync() {
        return CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.nnr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return AbstractC0762b.m4412a(c0201a);
            }
        });
    }

    @NonNull
    public final UUID getId() {
        return this.f3464b.m4361c();
    }

    @NonNull
    public final Data getInputData() {
        return this.f3464b.m4362d();
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return this.f3464b.m4363e();
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.f3464b.m4365g();
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.f3465c.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.f3464b.m4366h();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public zei0 getTaskExecutor() {
        return this.f3464b.m4367i();
    }

    @NonNull
    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.f3464b.m4368j();
    }

    @NonNull
    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.f3464b.m4369k();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public xaq0 getWorkerFactory() {
        return this.f3464b.m4371m();
    }

    public final boolean isStopped() {
        return this.f3465c.get() != -256;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.f3466d;
    }

    public void onStopped() {
    }

    @NonNull
    public final gnr<Void> setForegroundAsync(@NonNull nyi nyiVar) {
        return this.f3464b.m4360b().mo140585a(getApplicationContext(), getId(), nyiVar);
    }

    @NonNull
    public gnr<Void> setProgressAsync(@NonNull Data data) {
        return this.f3464b.m4364f().mo105931a(getApplicationContext(), getId(), data);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.f3466d = true;
    }

    @NonNull
    @MainThread
    public abstract gnr<a> startWork();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void stop(int i) {
        if (this.f3465c.compareAndSet(-256, i)) {
            onStopped();
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$a */
    public static abstract class a {

        /* JADX INFO: renamed from: androidx.work.b$a$b */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            @NonNull
            public String toString() {
                return "Retry";
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a() {
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public static a m4413a() {
            return new C22657a();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static a m4414b() {
            return new b();
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public static a m4415c() {
            return new c();
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public static a m4416d(@NonNull Data data) {
            return new c(data);
        }

        /* JADX INFO: renamed from: androidx.work.b$a$a, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C22657a extends a {

            /* JADX INFO: renamed from: a */
            public final Data f3467a;

            public C22657a() {
                this(Data.f3391b);
            }

            @NonNull
            /* JADX INFO: renamed from: e */
            public Data m4417e() {
                return this.f3467a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C22657a.class != obj.getClass()) {
                    return false;
                }
                return this.f3467a.equals(((C22657a) obj).f3467a);
            }

            public int hashCode() {
                return (C22657a.class.getName().hashCode() * 31) + this.f3467a.hashCode();
            }

            @NonNull
            public String toString() {
                return "Failure {mOutputData=" + this.f3467a + '}';
            }

            public C22657a(@NonNull Data data) {
                this.f3467a = data;
            }
        }

        /* JADX INFO: renamed from: androidx.work.b$a$c */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public final Data f3468a;

            public c() {
                this(Data.f3391b);
            }

            @NonNull
            /* JADX INFO: renamed from: e */
            public Data m4418e() {
                return this.f3468a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3468a.equals(((c) obj).f3468a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f3468a.hashCode();
            }

            @NonNull
            public String toString() {
                return "Success {mOutputData=" + this.f3468a + '}';
            }

            public c(@NonNull Data data) {
                this.f3468a = data;
            }
        }
    }
}
