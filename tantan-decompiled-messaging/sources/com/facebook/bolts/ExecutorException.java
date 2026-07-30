package com.facebook.bolts;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/bolts/ExecutorException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "facebook-bolts_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ExecutorException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecutorException(@NotNull Exception exc) {
        super("An exception was thrown by an Executor", exc);
        exc.getClass();
    }
}
