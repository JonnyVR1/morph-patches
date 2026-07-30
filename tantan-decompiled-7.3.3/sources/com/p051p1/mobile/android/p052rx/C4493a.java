package com.p051p1.mobile.android.p052rx;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.p052rx.C4493a;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.exceptions.MissingBackpressureException;
import p153l.bb50;
import p153l.l51;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.android.rx.a */
/* JADX INFO: loaded from: classes8.dex */
public class C4493a<T> implements bb50<T> {

    /* JADX INFO: renamed from: a */
    public String f16341a;

    /* JADX INFO: renamed from: b */
    public StackTraceElement[] f16342b;

    /* JADX INFO: renamed from: c */
    public y20<T> f16343c;

    /* JADX INFO: renamed from: d */
    public x20 f16344d;

    /* JADX INFO: renamed from: e */
    public y20<Throwable> f16345e;

    /* JADX INFO: renamed from: f */
    public boolean f16346f;

    /* JADX INFO: renamed from: g */
    public bb50<T> f16347g;

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2, x20 x20Var, boolean z) {
        this.f16341a = getClass().getSimpleName();
        this.f16342b = stackTraceElementArr;
        this.f16343c = y20Var;
        this.f16344d = x20Var;
        this.f16345e = y20Var2;
        this.f16346f = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21791a(Object obj) {
    }

    /* JADX INFO: renamed from: c */
    public static <T> C4493a<T> m21793c(StackTraceElement[] stackTraceElementArr) {
        return new C4493a<>(stackTraceElementArr);
    }

    /* JADX INFO: renamed from: d */
    public static <T> C4493a<T> m21794d(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var) {
        return new C4493a<>(stackTraceElementArr, y20Var);
    }

    /* JADX INFO: renamed from: e */
    public static <T> C4493a<T> m21795e(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2) {
        return new C4493a<>(stackTraceElementArr, y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: f */
    public static <T> C4493a<T> m21796f(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2, x20 x20Var, boolean z) {
        return new C4493a<>(stackTraceElementArr, y20Var, y20Var2, x20Var, z);
    }

    /* JADX INFO: renamed from: g */
    public static <T> C4493a<T> m21797g(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2, boolean z) {
        return new C4493a<>(stackTraceElementArr, y20Var, y20Var2, z);
    }

    /* JADX INFO: renamed from: h */
    public static <T> C4493a<T> m21798h(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull bb50<T> bb50Var) {
        return new C4493a<>(stackTraceElementArr, bb50Var);
    }

    /* JADX INFO: renamed from: i */
    public final void m21799i(Throwable th) {
        CrashHelper.m82479c(new RxException(th));
    }

    @Override // p153l.bb50
    public void onCompleted() {
        bb50<T> bb50Var = this.f16347g;
        if (bb50Var != null) {
            bb50Var.onCompleted();
            return;
        }
        x20 x20Var = this.f16344d;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        final Throwable th2;
        if (th instanceof MissingBackpressureException) {
            StackTraceElement[] stackTraceElementArr = this.f16342b;
            if (stackTraceElementArr != null) {
                stackTraceElementArr[0].toString();
            }
            MissingBackpressureThrowable missingBackpressureThrowable = new MissingBackpressureThrowable("");
            missingBackpressureThrowable.setStackTrace(this.f16342b);
            th2 = new MissingBackpressureThrowable("");
            th2.initCause(missingBackpressureThrowable);
            th2.setStackTrace(th.getStackTrace());
        } else {
            th2 = new Throwable(th);
            th2.setStackTrace(this.f16342b);
        }
        bb50<T> bb50Var = this.f16347g;
        if (bb50Var != null) {
            bb50Var.onError(th);
            if (this.f16346f) {
                m21799i(th2);
                return;
            }
            return;
        }
        y20<Throwable> y20Var = this.f16345e;
        if (y20Var == null) {
            l51.m152887G(new Runnable() { // from class: l.h1d0
                @Override // java.lang.Runnable
                public final void run() {
                    CrashHelper.m82479c(th2);
                }
            });
            return;
        }
        y20Var.call(th);
        if (this.f16346f) {
            m21799i(th2);
        }
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        bb50<T> bb50Var = this.f16347g;
        if (bb50Var != null) {
            bb50Var.onNext(t);
            return;
        }
        y20<T> y20Var = this.f16343c;
        if (y20Var != null) {
            y20Var.call(t);
        }
    }

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr, bb50<T> bb50Var) {
        this.f16341a = getClass().getSimpleName();
        this.f16342b = stackTraceElementArr;
        this.f16347g = bb50Var;
        this.f16346f = true;
    }

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var) {
        this(stackTraceElementArr, y20Var, null);
    }

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2) {
        this(stackTraceElementArr, y20Var, y20Var2, null, true);
    }

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2, boolean z) {
        this(stackTraceElementArr, y20Var, y20Var2, null, z);
    }

    public C4493a(@NonNull StackTraceElement[] stackTraceElementArr) {
        this(stackTraceElementArr, new y20() { // from class: l.i1d0
            @Override // p153l.y20
            public final void call(Object obj) {
                C4493a.m21791a(obj);
            }
        });
    }
}
