package com.tantanapp.sharedlibrary.loader.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/internal/NoReportException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public class NoReportException extends RuntimeException {
    public NoReportException() {
    }

    public NoReportException(@Nullable String str) {
        super(str);
    }

    public NoReportException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public NoReportException(@Nullable Throwable th) {
        super(th);
    }
}
