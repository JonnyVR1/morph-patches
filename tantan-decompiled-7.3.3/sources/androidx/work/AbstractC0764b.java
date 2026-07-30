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
import androidx.work.AbstractC0764b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.ckq0;
import p153l.hpr;
import p153l.i1j;
import p153l.wg3;
import p153l.zni0;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0764b {

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

    public AbstractC0764b(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            wg3.m206174a("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            wg3.m206174a("WorkerParameters is null");
            throw null;
        }
        this.f3463a = context;
        this.f3464b = workerParameters;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m4414a(CallbackToFutureAdapter.C0202a c0202a) {
        c0202a.m871f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.f3463a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.f3464b.m4361a();
    }

    @NonNull
    public hpr<i1j> getForegroundInfoAsync() {
        return CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.opr
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return AbstractC0764b.m4414a(c0202a);
            }
        });
    }

    @NonNull
    public final UUID getId() {
        return this.f3464b.m4363c();
    }

    @NonNull
    public final Data getInputData() {
        return this.f3464b.m4364d();
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return this.f3464b.m4365e();
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.f3464b.m4367g();
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.f3465c.get();
    }

    @NonNull
    public final Set<String> getTags() {
        return this.f3464b.m4368h();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public zni0 getTaskExecutor() {
        return this.f3464b.m4369i();
    }

    @NonNull
    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.f3464b.m4370j();
    }

    @NonNull
    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.f3464b.m4371k();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ckq0 getWorkerFactory() {
        return this.f3464b.m4373m();
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
    public final hpr<Void> setForegroundAsync(@NonNull i1j i1jVar) {
        return this.f3464b.m4362b().mo147863a(getApplicationContext(), getId(), i1jVar);
    }

    @NonNull
    public hpr<Void> setProgressAsync(@NonNull Data data) {
        return this.f3464b.m4366f().mo135502a(getApplicationContext(), getId(), data);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.f3466d = true;
    }

    @NonNull
    @MainThread
    public abstract hpr<a> startWork();

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
        public static a m4415a() {
            return new C22772a();
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public static a m4416b() {
            return new b();
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public static a m4417c() {
            return new c();
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public static a m4418d(@NonNull Data data) {
            return new c(data);
        }

        /* JADX INFO: renamed from: androidx.work.b$a$a, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C22772a extends a {

            /* JADX INFO: renamed from: a */
            public final Data f3467a;

            public C22772a() {
                this(Data.f3391b);
            }

            @NonNull
            /* JADX INFO: renamed from: e */
            public Data m4419e() {
                return this.f3467a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C22772a.class != obj.getClass()) {
                    return false;
                }
                return this.f3467a.equals(((C22772a) obj).f3467a);
            }

            public int hashCode() {
                return (C22772a.class.getName().hashCode() * 31) + this.f3467a.hashCode();
            }

            @NonNull
            public String toString() {
                return "Failure {mOutputData=" + this.f3467a + '}';
            }

            public C22772a(@NonNull Data data) {
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
            public Data m4420e() {
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
