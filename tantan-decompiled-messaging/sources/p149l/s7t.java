package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import p133rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes13.dex */
public class s7t<T> implements m250<T> {

    /* JADX INFO: renamed from: a */
    public String f162936a;

    /* JADX INFO: renamed from: b */
    public StackTraceElement[] f162937b;

    /* JADX INFO: renamed from: c */
    public e30<T> f162938c;

    /* JADX INFO: renamed from: d */
    public d30 f162939d;

    /* JADX INFO: renamed from: e */
    public e30<Throwable> f162940e;

    /* JADX INFO: renamed from: f */
    public m250<T> f162941f;

    public s7t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        this.f162936a = getClass().getSimpleName();
        this.f162937b = stackTraceElementArr;
        this.f162938c = e30Var;
        this.f162939d = d30Var;
        this.f162940e = e30Var2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m182522a(Object obj) {
    }

    /* JADX INFO: renamed from: b */
    public static <N> s7t<N> m182523b(StackTraceElement[] stackTraceElementArr) {
        return new s7t<>(stackTraceElementArr);
    }

    /* JADX INFO: renamed from: c */
    public static <N> s7t<N> m182524c(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<N> e30Var) {
        return new s7t<>(stackTraceElementArr, e30Var);
    }

    /* JADX INFO: renamed from: d */
    public static <N> s7t<N> m182525d(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<N> e30Var, e30<Throwable> e30Var2) {
        return new s7t<>(stackTraceElementArr, e30Var, e30Var2);
    }

    /* JADX INFO: renamed from: e */
    public static <N> s7t<N> m182526e(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<N> e30Var, e30<Throwable> e30Var2, d30 d30Var) {
        return new s7t<>(stackTraceElementArr, e30Var, e30Var2, d30Var);
    }

    /* JADX INFO: renamed from: f */
    public static <T> s7t<T> m182527f(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull m250<T> m250Var) {
        return new s7t<>(stackTraceElementArr, m250Var);
    }

    /* JADX INFO: renamed from: g */
    private void m182528g(Throwable th) {
        if (th instanceof MissingBackpressureException) {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("find a missing back pressure exception from observer id");
            missingBackpressureException.setStackTrace(this.f162937b);
            CrashHelper.m81296c(missingBackpressureException);
        } else if (this.f162940e == null) {
            CrashHelper.m81296c(th);
        }
    }

    @Override // p149l.m250
    public void onCompleted() {
        m250<T> m250Var = this.f162941f;
        if (m250Var != null) {
            m250Var.onCompleted();
            return;
        }
        d30 d30Var = this.f162939d;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // p149l.m250
    public void onError(Throwable th) {
        m182528g(th);
        m250<T> m250Var = this.f162941f;
        if (m250Var != null) {
            m250Var.onError(th);
            return;
        }
        e30<Throwable> e30Var = this.f162940e;
        if (e30Var != null) {
            e30Var.call(th);
        }
    }

    @Override // p149l.m250
    public void onNext(T t) {
        m250<T> m250Var = this.f162941f;
        if (m250Var != null) {
            m250Var.onNext(t);
            return;
        }
        e30<T> e30Var = this.f162938c;
        if (e30Var != null) {
            e30Var.call(t);
        }
    }

    public s7t(@NonNull StackTraceElement[] stackTraceElementArr) {
        this(stackTraceElementArr, new e30() { // from class: l.r7t
            @Override // p149l.e30
            public final void call(Object obj) {
                s7t.m182522a(obj);
            }
        });
    }

    public s7t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var) {
        this(stackTraceElementArr, e30Var, null);
    }

    public s7t(@NonNull StackTraceElement[] stackTraceElementArr, @NonNull e30<T> e30Var, e30<Throwable> e30Var2) {
        this(stackTraceElementArr, e30Var, e30Var2, null);
    }

    public s7t(@NonNull StackTraceElement[] stackTraceElementArr, m250<T> m250Var) {
        this.f162936a = getClass().getSimpleName();
        this.f162937b = stackTraceElementArr;
        this.f162941f = m250Var;
    }
}
