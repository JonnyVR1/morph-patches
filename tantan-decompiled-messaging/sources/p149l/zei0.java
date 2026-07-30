package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface zei0 {
    @NonNull
    /* JADX INFO: renamed from: a */
    default CoroutineDispatcher mo187636a() {
        return z5f.m217297b(mo187638d());
    }

    /* JADX INFO: renamed from: b */
    default void m218342b(@NonNull Runnable runnable) {
        mo187638d().execute(runnable);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    Executor mo187637c();

    @NonNull
    /* JADX INFO: renamed from: d */
    oie0 mo187638d();
}
