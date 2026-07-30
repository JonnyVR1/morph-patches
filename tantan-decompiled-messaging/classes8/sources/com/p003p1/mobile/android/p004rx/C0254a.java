package com.p003p1.mobile.android.p004rx;

import androidx.annotation.NonNull;
import com.p003p1.mobile.android.p004rx.C0254a;
import com.tantanapp.common.utils.CrashHelper;
import l.d30;
import l.e30;
import l.m250;
import p007l.e51;
import rx.exceptions.MissingBackpressureException;

/* JADX INFO: renamed from: com.p1.mobile.android.rx.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0254a<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public String f1321a;

    /* JADX INFO: renamed from: b */
    public StackTraceElement[] f1322b;

    /* JADX INFO: renamed from: c */
    public e30<T> f1323c;

    /* JADX INFO: renamed from: d */
    public d30 f1324d;

    /* JADX INFO: renamed from: e */
    public e30<Throwable> f1325e;

    /* JADX INFO: renamed from: f */
    public boolean f1326f;

    /* JADX INFO: renamed from: g */
    public m250<T> f1327g;

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        this.f1321a = getClass().getSimpleName();
        this.f1322b = stackTraceElementArr;
        this.f1323c = e30Var;
        this.f1324d = d30Var;
        this.f1325e = e30Var2;
        this.f1326f = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1063a(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public static <T> C0254a<T> m1065c(StackTraceElement[] stackTraceElementArr) {
        return new C0254a<>(stackTraceElementArr);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C0254a<T> m1066d(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var) {
        return new C0254a<>(stackTraceElementArr, e30Var);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C0254a<T> m1067e(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        return new C0254a<>(stackTraceElementArr, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C0254a<T> m1068f(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var, boolean z) {
        return new C0254a<>(stackTraceElementArr, e30Var, e30Var2, d30Var, z);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C0254a<T> m1069g(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        return new C0254a<>(stackTraceElementArr, e30Var, e30Var2, z);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C0254a<T> m1070h(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull m250<T> m250Var) {
        return new C0254a<>(stackTraceElementArr, m250Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m1071i(Throwable th) {
        CrashHelper.c(new RxException(th));
    }

    public void onCompleted() {
        m250<T> m250Var = this.f1327g;
        if (m250Var != null) {
            m250Var.onCompleted();
            return;
        }
        d30 d30Var = this.f1324d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    public void onError(Throwable th) {
        final Throwable th2;
        if (th instanceof MissingBackpressureException) {
            StackTraceElement[] stackTraceElementArr = this.f1322b;
            if (stackTraceElementArr != null) {
                stackTraceElementArr[0].toString();
            }
            MissingBackpressureThrowable missingBackpressureThrowable = new MissingBackpressureThrowable("");
            missingBackpressureThrowable.setStackTrace(this.f1322b);
            th2 = new MissingBackpressureThrowable("");
            th2.initCause(missingBackpressureThrowable);
            th2.setStackTrace(th.getStackTrace());
        } else {
            th2 = new Throwable(th);
            th2.setStackTrace(this.f1322b);
        }
        m250<T> m250Var = this.f1327g;
        if (m250Var != null) {
            m250Var.onError(th);
            if (this.f1326f) {
                m1071i(th2);
                return;
            }
            return;
        }
        e30<Throwable> e30Var = this.f1325e;
        if (e30Var == null) {
            e51.m9024G(new Runnable() { // from class: l.ctc0
                @Override // java.lang.Runnable
                public final void run() {
                    CrashHelper.c(th2);
                }
            });
            return;
        }
        e30Var.call(th);
        if (this.f1326f) {
            m1071i(th2);
        }
    }

    public void onNext(T t) {
        m250<T> m250Var = this.f1327g;
        if (m250Var != null) {
            m250Var.onNext(t);
            return;
        }
        e30<T> e30Var = this.f1323c;
        if (e30Var != null) {
            e30Var.call(t);
        }
    }

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr, m250<T> m250Var) {
        this.f1321a = getClass().getSimpleName();
        this.f1322b = stackTraceElementArr;
        this.f1327g = m250Var;
        this.f1326f = true;
    }

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var) {
        this(stackTraceElementArr, e30Var, null);
    }

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        this(stackTraceElementArr, e30Var, e30Var2, null, true);
    }

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, boolean z) {
        this(stackTraceElementArr, e30Var, e30Var2, null, z);
    }

    public C0254a(@NonNull StackTraceElement[] stackTraceElementArr) {
        this(stackTraceElementArr, new e30() { // from class: l.dtc0
            public final void call(Object obj) {
                C0254a.m1063a(obj);
            }
        });
    }
}
