package com.tantanapp.sharelib.workmanager.utils;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.sharelib.workmanager.Data;
import com.tantanapp.sharelib.workmanager.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "", "<init>", "()V", "", Constants.KEY_T, "c", "(Ljava/lang/Throwable;)Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "Lcom/tantanapp/sharelib/workmanager/Result;", LovePlanetStage.result, Constants.INAPP_DATA_TAG, "(Lcom/tantanapp/sharelib/workmanager/Result;)Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "Lcom/tantanapp/sharelib/workmanager/Data;", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "setException", "(Ljava/lang/Throwable;)V", "exception", "b", "Lcom/tantanapp/sharelib/workmanager/Result;", "()Lcom/tantanapp/sharelib/workmanager/Result;", "setResult", "(Lcom/tantanapp/sharelib/workmanager/Result;)V", "Companion", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SettableResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Throwable exception;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Result result;

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/utils/SettableResult$Companion;", "", "<init>", "()V", "Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "a", "()Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final SettableResult m81577a() {
            return new SettableResult(null);
        }

        private Companion() {
        }
    }

    private SettableResult() {
        this.result = new Result.Success();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Data m81573a() {
        return this.result.getOutput();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Result getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final SettableResult m81575c(@Nullable Throwable t) {
        this.exception = t;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final SettableResult m81576d(@NotNull Result result) {
        result.getClass();
        this.result = result;
        return this;
    }

    public /* synthetic */ SettableResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
