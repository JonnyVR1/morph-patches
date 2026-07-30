package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import p137rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes13.dex */
public class t9t<T> implements bb50<T> {

    /* JADX INFO: renamed from: a */
    public String f172662a;

    /* JADX INFO: renamed from: b */
    public StackTraceElement[] f172663b;

    /* JADX INFO: renamed from: c */
    public y20<T> f172664c;

    /* JADX INFO: renamed from: d */
    public x20 f172665d;

    /* JADX INFO: renamed from: e */
    public y20<Throwable> f172666e;

    /* JADX INFO: renamed from: f */
    public bb50<T> f172667f;

    public t9t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        this.f172662a = getClass().getSimpleName();
        this.f172663b = stackTraceElementArr;
        this.f172664c = y20Var;
        this.f172665d = x20Var;
        this.f172666e = y20Var2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m189760a(Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public static <N> t9t<N> m189761b(StackTraceElement[] stackTraceElementArr) {
        return new t9t<>(stackTraceElementArr);
    }

    /* JADX INFO: renamed from: c */
    public static <N> t9t<N> m189762c(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<N> y20Var) {
        return new t9t<>(stackTraceElementArr, y20Var);
    }

    /* JADX INFO: renamed from: d */
    public static <N> t9t<N> m189763d(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<N> y20Var, y20<Throwable> y20Var2) {
        return new t9t<>(stackTraceElementArr, y20Var, y20Var2);
    }

    /* JADX INFO: renamed from: e */
    public static <N> t9t<N> m189764e(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<N> y20Var, y20<Throwable> y20Var2, x20 x20Var) {
        return new t9t<>(stackTraceElementArr, y20Var, y20Var2, x20Var);
    }

    /* JADX INFO: renamed from: f */
    public static <T> t9t<T> m189765f(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull bb50<T> bb50Var) {
        return new t9t<>(stackTraceElementArr, bb50Var);
    }

    /* JADX INFO: renamed from: g */
    private void m189766g(Throwable th) {
        if (th instanceof MissingBackpressureException) {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("find a missing back pressure exception from observer id");
            missingBackpressureException.setStackTrace(this.f172663b);
            CrashHelper.m82479c(missingBackpressureException);
        } else if (this.f172666e == null) {
            CrashHelper.m82479c(th);
        }
    }

    @Override // p153l.bb50
    public void onCompleted() {
        bb50<T> bb50Var = this.f172667f;
        if (bb50Var != null) {
            bb50Var.onCompleted();
            return;
        }
        x20 x20Var = this.f172665d;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Override // p153l.bb50
    public void onError(Throwable th) {
        m189766g(th);
        bb50<T> bb50Var = this.f172667f;
        if (bb50Var != null) {
            bb50Var.onError(th);
            return;
        }
        y20<Throwable> y20Var = this.f172666e;
        if (y20Var != null) {
            y20Var.call(th);
        }
    }

    @Override // p153l.bb50
    public void onNext(T t) {
        bb50<T> bb50Var = this.f172667f;
        if (bb50Var != null) {
            bb50Var.onNext(t);
            return;
        }
        y20<T> y20Var = this.f172664c;
        if (y20Var != null) {
            y20Var.call(t);
        }
    }

    public t9t(@NonNull StackTraceElement[] stackTraceElementArr) {
        this(stackTraceElementArr, new y20() { // from class: l.s9t
            @Override // p153l.y20
            public final void call(Object obj) {
                t9t.m189760a(obj);
            }
        });
    }

    public t9t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var) {
        this(stackTraceElementArr, y20Var, null);
    }

    public t9t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull y20<T> y20Var, y20<Throwable> y20Var2) {
        this(stackTraceElementArr, y20Var, y20Var2, null);
    }

    public t9t(@NonNull StackTraceElement[] stackTraceElementArr, bb50<T> bb50Var) {
        this.f172662a = getClass().getSimpleName();
        this.f172663b = stackTraceElementArr;
        this.f172667f = bb50Var;
    }
}
