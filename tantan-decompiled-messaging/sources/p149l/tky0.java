package p149l;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class tky0 {

    /* JADX INFO: renamed from: a */
    public final int f170928a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final eqy0 f170929b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f170930c;

    public tky0(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable eqy0 eqy0Var) {
        this.f170930c = copyOnWriteArrayList;
        this.f170928a = 0;
        this.f170929b = eqy0Var;
    }

    @CheckResult
    /* JADX INFO: renamed from: a */
    public final tky0 m189541a(int i, @Nullable eqy0 eqy0Var) {
        return new tky0(this.f170930c, 0, eqy0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m189542b(Handler handler, vky0 vky0Var) {
        this.f170930c.add(new rky0(handler, vky0Var));
    }

    /* JADX INFO: renamed from: c */
    public final void m189543c(vky0 vky0Var) {
        for (rky0 rky0Var : this.f170930c) {
            if (rky0Var.f159914b == vky0Var) {
                this.f170930c.remove(rky0Var);
            }
        }
    }

    public tky0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
