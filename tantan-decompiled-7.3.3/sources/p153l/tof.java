package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/tof;", "Ll/oxi0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Ljava/lang/Runnable;", "runnable", "", "c", "(Ljava/lang/Runnable;)V", "b", "()V", Constants.INAPP_DATA_TAG, "a", "Ljava/util/concurrent/Executor;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class tof implements oxi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    public tof(@Nullable Executor executor) {
        if (executor != null) {
            this.executor = executor;
        } else {
            wtq0.m207906a("Required value was null.");
            throw null;
        }
    }

    @Override // p153l.oxi0
    /* JADX INFO: renamed from: a */
    public void mo169711a(@NotNull Runnable runnable) {
        runnable.getClass();
    }

    @Override // p153l.oxi0
    /* JADX INFO: renamed from: b */
    public void mo169712b() {
        throw new UnsupportedOperationException();
    }

    @Override // p153l.oxi0
    /* JADX INFO: renamed from: c */
    public void mo169713c(@NotNull Runnable runnable) {
        runnable.getClass();
        this.executor.execute(runnable);
    }

    @Override // p153l.oxi0
    /* JADX INFO: renamed from: d */
    public void mo169714d() {
        throw new UnsupportedOperationException();
    }
}
