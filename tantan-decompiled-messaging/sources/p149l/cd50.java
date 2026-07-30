package p149l;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd50 {
    private CopyOnWriteArrayList<af4> mCancellables = new CopyOnWriteArrayList<>();
    private boolean mEnabled;

    public cd50(boolean z) {
        this.mEnabled = z;
    }

    public void addCancellable(@NonNull af4 af4Var) {
        this.mCancellables.add(af4Var);
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public final boolean isEnabled() {
        return this.mEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<af4> it = this.mCancellables.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void removeCancellable(@NonNull af4 af4Var) {
        this.mCancellables.remove(af4Var);
    }

    @MainThread
    public final void setEnabled(boolean z) {
        this.mEnabled = z;
    }
}
