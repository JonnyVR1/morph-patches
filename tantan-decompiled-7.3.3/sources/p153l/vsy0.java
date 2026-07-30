package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public final class vsy0 {

    /* JADX INFO: renamed from: a */
    public final Object f185672a = new Object();

    /* JADX INFO: renamed from: b */
    public Queue f185673b;

    /* JADX INFO: renamed from: c */
    public boolean f185674c;

    /* JADX INFO: renamed from: a */
    public final void m202665a(@NonNull xqy0 xqy0Var) {
        synchronized (this.f185672a) {
            try {
                if (this.f185673b == null) {
                    this.f185673b = new ArrayDeque();
                }
                this.f185673b.add(xqy0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m202666b(@NonNull Task task) {
        xqy0 xqy0Var;
        synchronized (this.f185672a) {
            if (this.f185673b != null && !this.f185674c) {
                this.f185674c = true;
                while (true) {
                    synchronized (this.f185672a) {
                        try {
                            xqy0Var = (xqy0) this.f185673b.poll();
                            if (xqy0Var == null) {
                                this.f185674c = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    xqy0Var.mo115836a(task);
                }
            }
        }
    }
}
