package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Landroidx/lifecycle/LifecycleDestroyedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "lifecycle-runtime_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class LifecycleDestroyedException extends CancellationException {
    public LifecycleDestroyedException() {
        super(null);
    }
}
