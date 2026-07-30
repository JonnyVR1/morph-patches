package p153l;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zty0 {

    /* JADX INFO: renamed from: a */
    public final int f206070a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final kzy0 f206071b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f206072c;

    public zty0(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable kzy0 kzy0Var) {
        this.f206072c = copyOnWriteArrayList;
        this.f206070a = 0;
        this.f206071b = kzy0Var;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final zty0 m221578a(int i, @Nullable kzy0 kzy0Var) {
        return new zty0(this.f206072c, 0, kzy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m221579b(Handler handler, buy0 buy0Var) {
        this.f206072c.add(new xty0(handler, buy0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m221580c(buy0 buy0Var) {
        for (xty0 xty0Var : this.f206072c) {
            if (xty0Var.f196256b == buy0Var) {
                this.f206072c.remove(xty0Var);
            }
        }
    }

    public zty0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
