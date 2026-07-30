package com.facebook;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\tB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\n¨\u0006\r"}, m87232d2 = {"Lcom/facebook/FacebookSdkNotInitializedException;", "Lcom/facebook/FacebookException;", "<init>", "()V", "", "message", "(Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Companion", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class FacebookSdkNotInitializedException extends FacebookException {
    public static final long serialVersionUID = 1;

    public FacebookSdkNotInitializedException() {
    }

    public FacebookSdkNotInitializedException(@Nullable String str) {
        super(str);
    }

    public FacebookSdkNotInitializedException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookSdkNotInitializedException(@Nullable Throwable th) {
        super(th);
    }
}
