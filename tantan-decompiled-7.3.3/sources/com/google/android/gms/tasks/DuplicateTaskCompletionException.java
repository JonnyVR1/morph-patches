package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    /* JADX INFO: renamed from: of */
    public static IllegalStateException m15415of(@NonNull Task<?> task) {
        String strConcat;
        if (!task.mo15430o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excMo15426k = task.mo15426k();
        if (excMo15426k != null) {
            strConcat = "failure";
        } else if (task.mo15431p()) {
            strConcat = "result ".concat(String.valueOf(task.mo15427l()));
        } else {
            strConcat = task.mo15429n() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excMo15426k);
    }
}
