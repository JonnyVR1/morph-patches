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
    public static IllegalStateException m15361of(@NonNull Task<?> task) {
        String strConcat;
        if (!task.mo15376o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excMo15372k = task.mo15372k();
        if (excMo15372k != null) {
            strConcat = "failure";
        } else if (task.mo15377p()) {
            strConcat = "result ".concat(String.valueOf(task.mo15373l()));
        } else {
            strConcat = task.mo15375n() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), excMo15372k);
    }
}
