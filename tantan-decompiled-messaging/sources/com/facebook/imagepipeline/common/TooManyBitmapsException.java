package com.facebook.imagepipeline.common;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Lcom/facebook/imagepipeline/common/TooManyBitmapsException;", "Ljava/lang/RuntimeException;", "detailMessage", "", "<init>", "(Ljava/lang/String;)V", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class TooManyBitmapsException extends RuntimeException {
    public TooManyBitmapsException(@Nullable String str) {
        super(str);
    }
}
