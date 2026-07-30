package com.tantanapp.sharelib.workmanager;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Result;", "", "<init>", "()V", "Lcom/tantanapp/sharelib/workmanager/Data;", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "Companion", "Failure", "Retry", "Success", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class Result {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Result$Companion;", "", "<init>", "()V", "", "msg", "Lcom/tantanapp/sharelib/workmanager/Result$Failure;", "a", "(Ljava/lang/String;)Lcom/tantanapp/sharelib/workmanager/Result$Failure;", "", NotificationCompat.CATEGORY_ERROR, "b", "(Ljava/lang/Throwable;)Lcom/tantanapp/sharelib/workmanager/Result$Failure;", "Lcom/tantanapp/sharelib/workmanager/Result$Success;", Constants.INAPP_DATA_TAG, "()Lcom/tantanapp/sharelib/workmanager/Result$Success;", "Lcom/tantanapp/sharelib/workmanager/Result$Retry;", "c", "()Lcom/tantanapp/sharelib/workmanager/Result$Retry;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Failure m81545a(@NotNull String msg) {
            msg.getClass();
            return new Failure(new Exception(msg));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Failure m81546b(@NotNull Throwable err) {
            err.getClass();
            return new Failure(err);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Retry m81547c() {
            return new Retry();
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final Success m81548d() {
            return new Success();
        }

        private Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract Data getOutput();

    @Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Result$Failure;", "Lcom/tantanapp/sharelib/workmanager/Result;", "<init>", "()V", "", Constants.KEY_T, "(Ljava/lang/Throwable;)V", "Lcom/tantanapp/sharelib/workmanager/Data;", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "b", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "throwable", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Failure extends Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Throwable throwable;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Throwable th) {
            this();
            th.getClass();
            this.throwable = th;
        }

        @Override // com.tantanapp.sharelib.workmanager.Result
        @NotNull
        /* JADX INFO: renamed from: a */
        public Data getOutput() {
            return Data.INSTANCE.m81543a();
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Failure { Exception: ");
            Throwable th = this.throwable;
            sb.append(th != null ? th.getMessage() : null);
            sb.append(" }");
            return sb.toString();
        }

        public Failure() {
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Result$Retry;", "Lcom/tantanapp/sharelib/workmanager/Result;", "Lcom/tantanapp/sharelib/workmanager/Data;", "output", "<init>", "(Lcom/tantanapp/sharelib/workmanager/Data;)V", "()V", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "", "toString", "()Ljava/lang/String;", "Lcom/tantanapp/sharelib/workmanager/Data;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Retry extends Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Data output;

        public Retry() {
            this(Data.INSTANCE.m81543a());
        }

        @Override // com.tantanapp.sharelib.workmanager.Result
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public Data getOutput() {
            return this.output;
        }

        @NotNull
        public String toString() {
            return "Retry { output = " + this.output + " }";
        }

        public Retry(@NotNull Data data) {
            data.getClass();
            this.output = data;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Result$Success;", "Lcom/tantanapp/sharelib/workmanager/Result;", "Lcom/tantanapp/sharelib/workmanager/Data;", "output", "<init>", "(Lcom/tantanapp/sharelib/workmanager/Data;)V", "()V", "a", "()Lcom/tantanapp/sharelib/workmanager/Data;", "", "toString", "()Ljava/lang/String;", "Lcom/tantanapp/sharelib/workmanager/Data;", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Success extends Result {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Data output;

        public Success() {
            this(Data.INSTANCE.m81543a());
        }

        @Override // com.tantanapp.sharelib.workmanager.Result
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public Data getOutput() {
            return this.output;
        }

        @NotNull
        public String toString() {
            return "Success { output = " + this.output + " }";
        }

        public Success(@NotNull Data data) {
            data.getClass();
            this.output = data;
        }
    }
}
