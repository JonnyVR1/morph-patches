package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public interface r5g0<TResult, TContinuationResult> {
    @NonNull
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
