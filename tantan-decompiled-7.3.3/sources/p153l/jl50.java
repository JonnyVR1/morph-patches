package p153l;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl50 {
    private CopyOnWriteArrayList<zf4> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public jl50(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(@NonNull zf4 zf4Var) {
        this.mCancellables.add(zf4Var);
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public final boolean isEnabled() {
        return this.mEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<zf4> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void removeCancellable(@NonNull zf4 zf4Var) {
        this.mCancellables.remove(zf4Var);
    }

    @MainThread
    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
