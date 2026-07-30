package p149l;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public interface n16<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task) throws Exception;
}
