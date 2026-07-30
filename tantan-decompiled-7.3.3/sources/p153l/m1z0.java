package p153l;

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
public final class m1z0<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: a */
    public final Object f134487a = new Object();

    /* JADX INFO: renamed from: b */
    public final vsy0 f134488b = new vsy0();

    /* JADX INFO: renamed from: c */
    public boolean f134489c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f134490d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Object f134491e;

    /* JADX INFO: renamed from: f */
    public Exception f134492f;

    /* JADX INFO: renamed from: A */
    public final void m156728A() {
        synchronized (this.f134487a) {
            try {
                if (this.f134489c) {
                    this.f134488b.m202666b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: a */
    public final Task<TResult> mo15416a(@NonNull Executor executor, @NonNull ol50 ol50Var) {
        this.f134488b.m202665a(new mix0(executor, ol50Var));
        m156728A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f134488b.m202665a(new kyx0(boi0.f77686a, onCompleteListener));
        m156728A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: b */
    public final Task<TResult> mo15417b(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f134488b.m202665a(new kyx0(executor, onCompleteListener));
        m156728A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: c */
    public final Task<TResult> mo15418c(@NonNull Executor executor, @NonNull fm50 fm50Var) {
        this.f134488b.m202665a(new s8y0(executor, fm50Var));
        m156728A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: d */
    public final Task<TResult> mo15419d(@NonNull fm50 fm50Var) {
        mo15418c(boi0.f77686a, fm50Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: e */
    public final Task<TResult> mo15420e(@NonNull Executor executor, @NonNull to50<? super TResult> to50Var) {
        this.f134488b.m202665a(new dhy0(executor, to50Var));
        m156728A();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: f */
    public final Task<TResult> mo15421f(@NonNull to50<? super TResult> to50Var) {
        mo15420e(boi0.f77686a, to50Var);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: g */
    public final <TContinuationResult> Task<TContinuationResult> mo15422g(@NonNull Executor executor, @NonNull s26<TResult, TContinuationResult> s26Var) {
        m1z0 m1z0Var = new m1z0();
        this.f134488b.m202665a(new r4u0(executor, s26Var, m1z0Var));
        m156728A();
        return m1z0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: h */
    public final <TContinuationResult> Task<TContinuationResult> mo15423h(@NonNull s26<TResult, TContinuationResult> s26Var) {
        return mo15422g(boi0.f77686a, s26Var);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: i */
    public final <TContinuationResult> Task<TContinuationResult> mo15424i(@NonNull Executor executor, @NonNull s26<TResult, Task<TContinuationResult>> s26Var) {
        m1z0 m1z0Var = new m1z0();
        this.f134488b.m202665a(new iyv0(executor, s26Var, m1z0Var));
        m156728A();
        return m1z0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: j */
    public final <TContinuationResult> Task<TContinuationResult> mo15425j(@NonNull s26<TResult, Task<TContinuationResult>> s26Var) {
        return mo15424i(boi0.f77686a, s26Var);
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Exception mo15426k() {
        Exception exc;
        synchronized (this.f134487a) {
            exc = this.f134492f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: l */
    public final TResult mo15427l() {
        TResult tresult;
        synchronized (this.f134487a) {
            try {
                m156734x();
                m156735y();
                Exception exc = this.f134492f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f134491e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: m */
    public final <X extends Throwable> TResult mo15428m(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f134487a) {
            try {
                m156734x();
                m156735y();
                boolean zIsInstance = cls.isInstance(this.f134492f);
                Exception exc = this.f134492f;
                if (zIsInstance) {
                    throw cls.cast(exc);
                }
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                tresult = (TResult) this.f134491e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: n */
    public final boolean mo15429n() {
        return this.f134490d;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: o */
    public final boolean mo15430o() {
        boolean z;
        synchronized (this.f134487a) {
            z = this.f134489c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: p */
    public final boolean mo15431p() {
        boolean z;
        synchronized (this.f134487a) {
            try {
                z = false;
                if (this.f134489c && !this.f134490d && this.f134492f == null) {
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
    public final <TContinuationResult> Task<TContinuationResult> mo15432q(Executor executor, zdg0<TResult, TContinuationResult> zdg0Var) {
        m1z0 m1z0Var = new m1z0();
        this.f134488b.m202665a(new hoy0(executor, zdg0Var, m1z0Var));
        m156728A();
        return m1z0Var;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    /* JADX INFO: renamed from: r */
    public final <TContinuationResult> Task<TContinuationResult> mo15433r(@NonNull zdg0<TResult, TContinuationResult> zdg0Var) {
        Executor executor = boi0.f77686a;
        m1z0 m1z0Var = new m1z0();
        this.f134488b.m202665a(new hoy0(executor, zdg0Var, m1z0Var));
        m156728A();
        return m1z0Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m156729s(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f134487a) {
            m156736z();
            this.f134489c = true;
            this.f134492f = exc;
        }
        this.f134488b.m202666b(this);
    }

    /* JADX INFO: renamed from: t */
    public final void m156730t(@Nullable Object obj) {
        synchronized (this.f134487a) {
            m156736z();
            this.f134489c = true;
            this.f134491e = obj;
        }
        this.f134488b.m202666b(this);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m156731u() {
        synchronized (this.f134487a) {
            try {
                if (this.f134489c) {
                    return false;
                }
                this.f134489c = true;
                this.f134490d = true;
                this.f134488b.m202666b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m156732v(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f134487a) {
            try {
                if (this.f134489c) {
                    return false;
                }
                this.f134489c = true;
                this.f134492f = exc;
                this.f134488b.m202666b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m156733w(@Nullable Object obj) {
        synchronized (this.f134487a) {
            try {
                if (this.f134489c) {
                    return false;
                }
                this.f134489c = true;
                this.f134491e = obj;
                this.f134488b.m202666b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m156734x() {
        Preconditions.checkState(this.f134489c, "Task is not yet complete");
    }

    /* JADX INFO: renamed from: y */
    public final void m156735y() {
        if (this.f134490d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m156736z() {
        if (this.f134489c) {
            throw DuplicateTaskCompletionException.m15415of(this);
        }
    }
}
