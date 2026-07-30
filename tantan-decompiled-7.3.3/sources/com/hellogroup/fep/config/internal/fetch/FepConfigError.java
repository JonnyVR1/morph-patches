package com.hellogroup.fep.config.internal.fetch;

import com.clevertap.android.sdk.Constants;
import com.heytap.mcssdk.mode.CommandMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m88121d2 = {"Lcom/hellogroup/fep/config/internal/fetch/FepConfigError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "message", "", "throwable", "", CommandMessage.PARAMS, "", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "FEP_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final /* data */ class FepConfigError extends Exception {
    private final int code;

    @NotNull
    private final String message;

    @Nullable
    private final Map<String, String> params;

    @Nullable
    private final Throwable throwable;

    public /* synthetic */ FepConfigError(int i, String str, Throwable th, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FepConfigError copy$default(FepConfigError fepConfigError, int i, String str, Throwable th, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fepConfigError.code;
        }
        if ((i2 & 2) != 0) {
            str = fepConfigError.getMessage();
        }
        if ((i2 & 4) != 0) {
            th = fepConfigError.throwable;
        }
        if ((i2 & 8) != 0) {
            map = fepConfigError.params;
        }
        return fepConfigError.copy(i, str, th, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return getMessage();
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.params;
    }

    @NotNull
    public final FepConfigError copy(int code, @NotNull String message, @Nullable Throwable throwable, @Nullable Map<String, String> params) {
        message.getClass();
        return new FepConfigError(code, message, throwable, params);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FepConfigError)) {
            return false;
        }
        FepConfigError fepConfigError = (FepConfigError) other;
        return this.code == fepConfigError.code && Intrinsics.m88377d(getMessage(), fepConfigError.getMessage()) && Intrinsics.m88377d(this.throwable, fepConfigError.throwable) && Intrinsics.m88377d(this.params, fepConfigError.params);
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    @Nullable
    public final Map<String, String> getParams() {
        return this.params;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String message = getMessage();
        int iHashCode2 = (iHashCode + (message != null ? message.hashCode() : 0)) * 31;
        Throwable th = this.throwable;
        int iHashCode3 = (iHashCode2 + (th != null ? th.hashCode() : 0)) * 31;
        Map<String, String> map = this.params;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "FepConfigError(code=" + this.code + ", message=" + getMessage() + ", throwable=" + this.throwable + ", params=" + this.params + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FepConfigError(int i, @NotNull String str, @Nullable Throwable th, @Nullable Map<String, String> map) {
        super(str, th);
        str.getClass();
        this.code = i;
        this.message = str;
        this.throwable = th;
        this.params = map;
    }
}
