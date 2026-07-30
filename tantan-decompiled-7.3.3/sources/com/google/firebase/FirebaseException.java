package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
