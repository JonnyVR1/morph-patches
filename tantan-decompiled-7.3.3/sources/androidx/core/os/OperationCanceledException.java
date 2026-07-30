package androidx.core.os;

import androidx.annotation.Nullable;
import p153l.l950;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(@Nullable String str) {
        super(l950.m153331e(str, "The operation has been canceled."));
    }

    public OperationCanceledException() {
        this(null);
    }
}
