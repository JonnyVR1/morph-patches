package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class s5w0 {

    /* JADX INFO: renamed from: a */
    public final Context f162597a;

    /* JADX INFO: renamed from: b */
    public final Executor f162598b;

    /* JADX INFO: renamed from: c */
    public final b3t0 f162599c;

    /* JADX INFO: renamed from: d */
    public final b5w0 f162600d;

    public s5w0(Context context, Executor executor, b3t0 b3t0Var, b5w0 b5w0Var) {
        this.f162597a = context;
        this.f162598b = executor;
        this.f162599c = b3t0Var;
        this.f162600d = b5w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m182380a(String str) {
        this.f162599c.zza(str);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m182381b(String str, w4w0 w4w0Var) {
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f162597a, 14);
        l4w0VarM144514a.zzh();
        l4w0VarM144514a.mo129461S(this.f162599c.zza(str));
        if (w4w0Var == null) {
            this.f162600d.m100344b(l4w0VarM144514a.zzl());
        } else {
            w4w0Var.m201583a(l4w0VarM144514a);
            w4w0Var.m201589g();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m182382c(final String str, @Nullable final w4w0 w4w0Var) {
        if (b5w0.m100343a() && ((Boolean) l9s0.f127143d.m115379e()).booleanValue()) {
            this.f162598b.execute(new Runnable() { // from class: l.r5w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f157874a.m182381b(str, w4w0Var);
                }
            });
        } else {
            this.f162598b.execute(new Runnable() { // from class: l.q5w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152829a.m182380a(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m182383d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m182382c((String) it.next(), null);
        }
    }
}
