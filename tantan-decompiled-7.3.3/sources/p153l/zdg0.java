package p153l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public interface zdg0<TResult, TContinuationResult> {
    @NonNull
    Task<TContinuationResult> then(TResult tresult) throws Exception;
}
