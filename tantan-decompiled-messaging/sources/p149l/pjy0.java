package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public final class pjy0 {

    /* JADX INFO: renamed from: a */
    public final Object f149920a = new Object();

    /* JADX INFO: renamed from: b */
    public Queue f149921b;

    /* JADX INFO: renamed from: c */
    public boolean f149922c;

    /* JADX INFO: renamed from: a */
    public final void m169965a(@NonNull rhy0 rhy0Var) {
        synchronized (this.f149920a) {
            try {
                if (this.f149921b == null) {
                    this.f149921b = new ArrayDeque();
                }
                this.f149921b.add(rhy0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m169966b(@NonNull Task task) {
        rhy0 rhy0Var;
        synchronized (this.f149920a) {
            if (this.f149921b != null && !this.f149922c) {
                this.f149922c = true;
                while (true) {
                    synchronized (this.f149920a) {
                        try {
                            rhy0Var = (rhy0) this.f149921b.poll();
                            if (rhy0Var == null) {
                                this.f149922c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rhy0Var.mo101617a(task);
                }
            }
        }
    }
}
