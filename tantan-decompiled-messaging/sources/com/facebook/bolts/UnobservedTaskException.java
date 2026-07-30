package com.facebook.bolts;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"Lcom/facebook/bolts/UnobservedTaskException;", "Ljava/lang/RuntimeException;", "cause", "", "(Ljava/lang/Throwable;)V", "facebook-bolts_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class UnobservedTaskException extends RuntimeException {
    public UnobservedTaskException(@Nullable Throwable th) {
        super(th);
    }
}
