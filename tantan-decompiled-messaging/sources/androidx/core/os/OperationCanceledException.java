package androidx.core.os;

import androidx.annotation.Nullable;
import p149l.w050;

/* JADX INFO: loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(@Nullable String str) {
        super(w050.m200832e(str, "The operation has been canceled."));
    }

    public OperationCanceledException() {
        this(null);
    }
}
