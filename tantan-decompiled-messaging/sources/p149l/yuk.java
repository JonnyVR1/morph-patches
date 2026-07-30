package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/yuk;", "", "Landroid/os/HandlerThread;", "thread", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/HandlerThread;Landroid/os/Handler;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/os/HandlerThread;", "b", "()Landroid/os/HandlerThread;", Constants.INAPP_DATA_TAG, "(Landroid/os/HandlerThread;)V", "Landroid/os/Handler;", "()Landroid/os/Handler;", "c", "(Landroid/os/Handler;)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class yuk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public HandlerThread thread;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    public yuk(@Nullable HandlerThread handlerThread, @Nullable Handler handler) {
        this.thread = handlerThread;
        this.handler = handler;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HandlerThread getThread() {
        return this.thread;
    }

    /* JADX INFO: renamed from: c */
    public final void m216116c(@Nullable Handler handler) {
        this.handler = handler;
    }

    /* JADX INFO: renamed from: d */
    public final void m216117d(@Nullable HandlerThread handlerThread) {
        this.thread = handlerThread;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yuk)) {
            return false;
        }
        yuk yukVar = (yuk) other;
        return Intrinsics.m87488d(this.thread, yukVar.thread) && Intrinsics.m87488d(this.handler, yukVar.handler);
    }

    public int hashCode() {
        HandlerThread handlerThread = this.thread;
        int iHashCode = (handlerThread == null ? 0 : handlerThread.hashCode()) * 31;
        Handler handler = this.handler;
        return iHashCode + (handler != null ? handler.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HandlerHolder(thread=" + this.thread + ", handler=" + this.handler + ")";
    }
}
