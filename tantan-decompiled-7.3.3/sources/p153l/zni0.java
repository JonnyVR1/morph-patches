package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface zni0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    default CoroutineDispatcher mo216344a() {
        return f7f.m124439b(mo216346d());
    }

    /* JADX INFO: renamed from: b */
    default void m220600b(@NonNull Runnable runnable) {
        mo216346d().execute(runnable);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    Executor mo216345c();

    @NonNull
    /* JADX INFO: renamed from: d */
    tqe0 mo216346d();
}
