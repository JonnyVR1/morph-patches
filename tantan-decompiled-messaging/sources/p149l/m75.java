package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class m75 {

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f131790a = new ReferenceQueue();

    /* JADX INFO: renamed from: b */
    public final Set f131791b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: l.m75$a */
    public interface InterfaceC18411a {
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        void mo153349a();
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static m75 m153347a() {
        m75 m75Var = new m75();
        m75Var.m153348b(m75Var, new Runnable() { // from class: l.x0r0
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = m75Var.f131790a;
        final Set set = m75Var.f131791b;
        Thread thread = new Thread(new Runnable() { // from class: l.m0s0
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((nvt0) referenceQueue2.remove()).mo153349a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return m75Var;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public InterfaceC18411a m153348b(@NonNull Object obj, @NonNull Runnable runnable) {
        nvt0 nvt0Var = new nvt0(obj, this.f131790a, this.f131791b, runnable, null);
        this.f131791b.add(nvt0Var);
        return nvt0Var;
    }
}
