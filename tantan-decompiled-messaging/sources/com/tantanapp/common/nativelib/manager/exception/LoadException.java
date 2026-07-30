package com.tantanapp.common.nativelib.manager.exception;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m87232d2 = {"Lcom/tantanapp/common/nativelib/manager/exception/LoadException;", "", "", "msg", "cause", "", FirebaseAnalytics.Param.LEVEL, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;I)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getMsg", "setMsg", "(Ljava/lang/String;)V", "I", "getLevel", "()I", "Level", "a", "sharedlibrarymanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class LoadException extends Throwable {
    public static final int ERROR = 2;
    public static final int WARNING = 1;
    private final int level;

    @NotNull
    private String msg;

    public /* synthetic */ LoadException(String str, Throwable th, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? 1 : i);
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final void setMsg(@NotNull String str) {
        str.getClass();
        this.msg = str;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Exception: ");
        sb.append(this.msg);
        sb.append(", Cause: ");
        Throwable cause = getCause();
        sb.append(cause != null ? cause.getMessage() : null);
        sb.append(", Level: ");
        sb.append(this.level);
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(@NotNull String str, @Nullable Throwable th, int i) {
        super(str, th);
        str.getClass();
        this.msg = str;
        this.level = i;
    }
}
