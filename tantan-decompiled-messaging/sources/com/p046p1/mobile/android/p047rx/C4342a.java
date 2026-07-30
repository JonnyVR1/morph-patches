package com.p046p1.mobile.android.p047rx;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.p047rx.C4342a;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.exceptions.MissingBackpressureException;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.m250;

/* JADX INFO: renamed from: com.p1.mobile.android.rx.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4342a<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public String f15622a;

    /* JADX INFO: renamed from: b */
    public StackTraceElement[] f15623b;

    /* JADX INFO: renamed from: c */
    public e30<T> f15624c;

    /* JADX INFO: renamed from: d */
    public d30 f15625d;

    /* JADX INFO: renamed from: e */
    public e30<Throwable> f15626e;

    /* JADX INFO: renamed from: f */
    public boolean f15627f;

    /* JADX INFO: renamed from: g */
    public m250<T> f15628g;

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        this.f15622a = getClass().getSimpleName();
        this.f15623b = stackTraceElementArr;
        this.f15624c = e30Var;
        this.f15625d = d30Var;
        this.f15626e = e30Var2;
        this.f15627f = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20792a(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public static <T> C4342a<T> m20794c(StackTraceElement[] stackTraceElementArr) {
        return new C4342a<>(stackTraceElementArr);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C4342a<T> m20795d(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var) {
        return new C4342a<>(stackTraceElementArr, e30Var);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C4342a<T> m20796e(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        return new C4342a<>(stackTraceElementArr, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C4342a<T> m20797f(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        return new C4342a<>(stackTraceElementArr, e30Var, e30Var2, d30Var, z);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C4342a<T> m20798g(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        return new C4342a<>(stackTraceElementArr, e30Var, e30Var2, z);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C4342a<T> m20799h(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull m250<T> m250Var) {
        return new C4342a<>(stackTraceElementArr, m250Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m20800i(Throwable th) {
        CrashHelper.m81296c(new RxException(th));
    }

    @Override // p149l.m250
    public void onCompleted() {
        m250<T> m250Var = this.f15628g;
        if (m250Var != null) {
            m250Var.onCompleted();
            return;
        }
        d30 d30Var = this.f15625d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        final Throwable th2;
        if (th instanceof MissingBackpressureException) {
            StackTraceElement[] stackTraceElementArr = this.f15623b;
            if (stackTraceElementArr != null) {
                stackTraceElementArr[0].toString();
            }
            MissingBackpressureThrowable missingBackpressureThrowable = new MissingBackpressureThrowable("");
            missingBackpressureThrowable.setStackTrace(this.f15623b);
            th2 = new MissingBackpressureThrowable("");
            th2.initCause(missingBackpressureThrowable);
            th2.setStackTrace(th.getStackTrace());
        } else {
            th2 = new Throwable(th);
            th2.setStackTrace(this.f15623b);
        }
        m250<T> m250Var = this.f15628g;
        if (m250Var != null) {
            m250Var.onError(th);
            if (this.f15627f) {
                m20800i(th2);
                return;
            }
            return;
        }
        e30<Throwable> e30Var = this.f15626e;
        if (e30Var == null) {
            e51.m114742G(new Runnable() { // from class: l.ctc0
                @Override // java.lang.Runnable
                public final void run() {
                    CrashHelper.m81296c(th2);
                }
            });
            return;
        }
        e30Var.call(th);
        if (this.f15627f) {
            m20800i(th2);
        }
    }

    @Override // p149l.m250
    public void onNext(T t) {
        m250<T> m250Var = this.f15628g;
        if (m250Var != null) {
            m250Var.onNext(t);
            return;
        }
        e30<T> e30Var = this.f15624c;
        if (e30Var != null) {
            e30Var.call(t);
        }
    }

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr, m250<T> m250Var) {
        this.f15622a = getClass().getSimpleName();
        this.f15623b = stackTraceElementArr;
        this.f15628g = m250Var;
        this.f15627f = true;
    }

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var) {
        this(stackTraceElementArr, e30Var, null);
    }

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        this(stackTraceElementArr, e30Var, e30Var2, null, true);
    }

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        this(stackTraceElementArr, e30Var, e30Var2, null, z);
    }

    public C4342a(@NonNull StackTraceElement[] stackTraceElementArr) {
        this(stackTraceElementArr, new e30() { // from class: l.dtc0
            @Override // p149l.e30
            public final void call(Object obj) {
                C4342a.m20792a(obj);
            }
        });
    }
}
