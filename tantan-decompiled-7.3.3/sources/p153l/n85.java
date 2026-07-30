package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class n85 {

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f140650a = new ReferenceQueue();

    /* JADX INFO: renamed from: b */
    public final Set f140651b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: l.n85$a */
    public interface InterfaceC18818a {
        @KeepForSdk
        /* JADX INFO: renamed from: a */
        void mo161894a();
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public static n85 m161892a() {
        n85 n85Var = new n85();
        n85Var.m161893b(n85Var, new Runnable() { // from class: l.dar0
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = n85Var.f140650a;
        final Set set = n85Var.f140651b;
        Thread thread = new Thread(new Runnable() { // from class: l.s9s0
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((t4u0) referenceQueue2.remove()).mo161894a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return n85Var;
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public InterfaceC18818a m161893b(@NonNull Object obj, @NonNull Runnable runnable) {
        t4u0 t4u0Var = new t4u0(obj, this.f140650a, this.f140651b, runnable, null);
        this.f140651b.add(t4u0Var);
        return t4u0Var;
    }
}
