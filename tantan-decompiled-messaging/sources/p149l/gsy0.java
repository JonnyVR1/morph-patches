package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class gsy0<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f104230a = new Object();

    /* JADX INFO: renamed from: b */
    public final pjy0 f104231b = new pjy0();

    /* JADX INFO: renamed from: c */
    public boolean f104232c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f104233d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Object f104234e;

    /* JADX INFO: renamed from: f */
    public Exception f104235f;

    /* JADX INFO: renamed from: A */
    public final void m127858A() {
        synchronized (this.f104230a) {
            try {
                if (this.f104232c) {
                    this.f104231b.m169966b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Task<TResult> mo15362a(@NonNull Executor executor, @NonNull hd50 hd50Var) {
        this.f104231b.m169965a(new g9x0(executor, hd50Var));
        m127858A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f104231b.m169965a(new epx0(bfi0.f75320a, onCompleteListener));
        m127858A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: b */
    public final Task<TResult> mo15363b(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f104231b.m169965a(new epx0(executor, onCompleteListener));
        m127858A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: c */
    public final Task<TResult> mo15364c(@NonNull Executor executor, @NonNull yd50 yd50Var) {
        this.f104231b.m169965a(new mzx0(executor, yd50Var));
        m127858A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: d */
    public final Task<TResult> mo15365d(@NonNull yd50 yd50Var) {
        mo15364c(bfi0.f75320a, yd50Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: e */
    public final Task<TResult> mo15366e(@NonNull Executor executor, @NonNull ng50<? super TResult> ng50Var) {
        this.f104231b.m169965a(new x7y0(executor, ng50Var));
        m127858A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: f */
    public final Task<TResult> mo15367f(@NonNull ng50<? super TResult> ng50Var) {
        mo15366e(bfi0.f75320a, ng50Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: g */
    public final <TContinuationResult> Task<TContinuationResult> mo15368g(@NonNull Executor executor, @NonNull n16<TResult, TContinuationResult> n16Var) {
        gsy0 gsy0Var = new gsy0();
        this.f104231b.m169965a(new lvt0(executor, n16Var, gsy0Var));
        m127858A();
        return gsy0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo15369h(@NonNull n16<TResult, TContinuationResult> n16Var) {
        return mo15368g(bfi0.f75320a, n16Var);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo15370i(@NonNull Executor executor, @NonNull n16<TResult, Task<TContinuationResult>> n16Var) {
        gsy0 gsy0Var = new gsy0();
        this.f104231b.m169965a(new cpv0(executor, n16Var, gsy0Var));
        m127858A();
        return gsy0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> Task<TContinuationResult> mo15371j(@NonNull n16<TResult, Task<TContinuationResult>> n16Var) {
        return mo15370i(bfi0.f75320a, n16Var);
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Exception mo15372k() {
        Exception exc;
        synchronized (this.f104230a) {
            exc = this.f104235f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: l */
    public final TResult mo15373l() {
        TResult tresult;
        synchronized (this.f104230a) {
            try {
                m127864x();
                m127865y();
                Exception exc = this.f104235f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f104234e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: m */
    public final <X extends Throwable> TResult mo15374m(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f104230a) {
            try {
                m127864x();
                m127865y();
                boolean zIsInstance = cls.isInstance(this.f104235f);
                Exception exc = this.f104235f;
                if (zIsInstance) {
                    throw cls.cast(exc);
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f104234e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: n */
    public final boolean mo15375n() {
        return this.f104233d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: o */
    public final boolean mo15376o() {
        boolean z;
        synchronized (this.f104230a) {
            z = this.f104232c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: p */
    public final boolean mo15377p() {
        boolean z;
        synchronized (this.f104230a) {
            try {
                z = false;
                if (this.f104232c && !this.f104233d && this.f104235f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: q */
    public final <TContinuationResult> Task<TContinuationResult> mo15378q(Executor executor, r5g0<TResult, TContinuationResult> r5g0Var) {
        gsy0 gsy0Var = new gsy0();
        this.f104231b.m169965a(new bfy0(executor, r5g0Var, gsy0Var));
        m127858A();
        return gsy0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: r */
    public final <TContinuationResult> Task<TContinuationResult> mo15379r(@NonNull r5g0<TResult, TContinuationResult> r5g0Var) {
        Executor executor = bfi0.f75320a;
        gsy0 gsy0Var = new gsy0();
        this.f104231b.m169965a(new bfy0(executor, r5g0Var, gsy0Var));
        m127858A();
        return gsy0Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m127859s(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f104230a) {
            m127866z();
            this.f104232c = true;
            this.f104235f = exc;
        }
        this.f104231b.m169966b(this);
    }

    /* JADX INFO: renamed from: t */
    public final void m127860t(@Nullable Object obj) {
        synchronized (this.f104230a) {
            m127866z();
            this.f104232c = true;
            this.f104234e = obj;
        }
        this.f104231b.m169966b(this);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m127861u() {
        synchronized (this.f104230a) {
            try {
                if (this.f104232c) {
                    return false;
                }
                this.f104232c = true;
                this.f104233d = true;
                this.f104231b.m169966b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m127862v(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f104230a) {
            try {
                if (this.f104232c) {
                    return false;
                }
                this.f104232c = true;
                this.f104235f = exc;
                this.f104231b.m169966b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m127863w(@Nullable Object obj) {
        synchronized (this.f104230a) {
            try {
                if (this.f104232c) {
                    return false;
                }
                this.f104232c = true;
                this.f104234e = obj;
                this.f104231b.m169966b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m127864x() {
        Preconditions.checkState(this.f104232c, "Task is not yet complete");
    }

    /* JADX INFO: renamed from: y */
    public final void m127865y() {
        if (this.f104233d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m127866z() {
        if (this.f104232c) {
            throw DuplicateTaskCompletionException.m15361of(this);
        }
    }
}
