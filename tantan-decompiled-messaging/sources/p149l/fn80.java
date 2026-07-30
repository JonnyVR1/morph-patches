package p149l;

import android.os.Process;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m87232d2 = {"Ll/fn80;", "Ljava/util/concurrent/ThreadFactory;", "", "threadPriority", "", RequestParameters.PREFIX, "", "addThreadNumber", "<init>", "(ILjava/lang/String;Z)V", "Ljava/lang/Runnable;", "runnable", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "a", "I", "b", "Ljava/lang/String;", "c", "Z", "Ljava/util/concurrent/atomic/AtomicInteger;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/atomic/AtomicInteger;", "threadNumber", "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class fn80 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int threadPriority;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String prefix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean addThreadNumber;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger threadNumber;

    @JvmOverloads
    public fn80(int i, @NotNull String str, boolean z) {
        str.getClass();
        this.threadPriority = i;
        this.prefix = str;
        this.addThreadNumber = z;
        this.threadNumber = new AtomicInteger(1);
    }

    /* JADX INFO: renamed from: a */
    public static void m122290a(fn80 fn80Var, Runnable runnable) {
        fn80Var.getClass();
        runnable.getClass();
        try {
            Process.setThreadPriority(fn80Var.threadPriority);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    @NotNull
    public Thread newThread(@NotNull final Runnable runnable) {
        runnable.getClass();
        Runnable runnable2 = new Runnable() { // from class: l.en80
            @Override // java.lang.Runnable
            public final void run() {
                fn80.m122290a(this.f92284a, runnable);
            }
        };
        boolean z = this.addThreadNumber;
        String str = this.prefix;
        if (z) {
            str = str + "-" + this.threadNumber.getAndIncrement();
        }
        return new Thread(runnable2, str);
    }
}
