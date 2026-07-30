package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class f8u0 {

    /* JADX INFO: renamed from: a */
    public final q9u0 f96409a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final q9t0 f96410b;

    public f8u0(q9u0 q9u0Var, @Nullable q9t0 q9t0Var) {
        this.f96409a = q9u0Var;
        this.f96410b = q9t0Var;
    }

    /* JADX INFO: renamed from: h */
    public static final s6u0 m120041h(i4w0 i4w0Var) {
        return new s6u0(i4w0Var, i3t0.f111377f);
    }

    /* JADX INFO: renamed from: i */
    public static final s6u0 m120042i(bau0 bau0Var) {
        return new s6u0(bau0Var, i3t0.f111377f);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final View m120043a() {
        q9t0 q9t0Var = this.f96410b;
        if (q9t0Var == null) {
            return null;
        }
        return q9t0Var.mo13661L();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final View m120044b() {
        q9t0 q9t0Var = this.f96410b;
        if (q9t0Var != null) {
            return q9t0Var.mo13661L();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final q9t0 m120045c() {
        return this.f96410b;
    }

    /* JADX INFO: renamed from: d */
    public final s6u0 m120046d(Executor executor) {
        final q9t0 q9t0Var = this.f96410b;
        return new s6u0(new w2u0() { // from class: l.e8u0
            @Override // p149l.w2u0
            public final void zza() {
                BinderC2073b binderC2073bZzL;
                q9t0 q9t0Var2 = q9t0Var;
                if (q9t0Var2 == null || (binderC2073bZzL = q9t0Var2.zzL()) == null) {
                    return;
                }
                binderC2073bZzL.zzb();
            }
        }, executor);
    }

    /* JADX INFO: renamed from: e */
    public final q9u0 m120047e() {
        return this.f96409a;
    }

    /* JADX INFO: renamed from: f */
    public Set mo120048f(out0 out0Var) {
        return Collections.singleton(new s6u0(out0Var, i3t0.f111377f));
    }

    /* JADX INFO: renamed from: g */
    public Set mo120049g(out0 out0Var) {
        return Collections.singleton(new s6u0(out0Var, i3t0.f111377f));
    }
}
