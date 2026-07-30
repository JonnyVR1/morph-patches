package com.p051p1.mobile.putong.live.external.square.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\u0000J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/square/api/ModelData;", "", "<init>", "()V", "state", "", "message", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "throwable", "", "getThrowable", "()Ljava/lang/Throwable;", "setThrowable", "(Ljava/lang/Throwable;)V", "loading", "success", "error", "getDataError", "complete", "isLoading", "", "isComplete", "isError", "isSuccess", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ModelData {

    @Nullable
    private String message;

    @NotNull
    private String state = "LOADING";

    @Nullable
    private Throwable throwable;

    @NotNull
    public final ModelData complete() {
        this.state = "COMPLETE";
        return this;
    }

    @NotNull
    public final ModelData error(@NotNull Throwable throwable) {
        throwable.getClass();
        this.state = "ERROR";
        this.throwable = throwable;
        return this;
    }

    @NotNull
    public final ModelData getDataError(@NotNull String message) {
        message.getClass();
        this.state = "GET_DATA_ERROR";
        this.message = message;
        return this;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isComplete() {
        return Intrinsics.m88377d(this.state, "COMPLETE");
    }

    public final boolean isError() {
        return Intrinsics.m88377d(this.state, "ERROR");
    }

    public final boolean isLoading() {
        return Intrinsics.m88377d(this.state, "LOADING");
    }

    public final boolean isSuccess() {
        return Intrinsics.m88377d(this.state, "SUCCESS");
    }

    @NotNull
    public final ModelData loading() {
        this.state = "LOADING";
        return this;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setThrowable(@Nullable Throwable th) {
        this.throwable = th;
    }

    @NotNull
    public final ModelData success(@NotNull String message) {
        message.getClass();
        this.state = "SUCCESS";
        this.message = message;
        return this;
    }

    @NotNull
    public final ModelData success() {
        this.state = "SUCCESS";
        return this;
    }
}
