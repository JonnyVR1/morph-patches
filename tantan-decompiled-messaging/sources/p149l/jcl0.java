package p149l;

import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/jcl0;", "", "<init>", "()V", "Ll/ppb;", "viewModelScope", "(Ll/ppb;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ll/ppb;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", BLiveResOperation.clear, "", Constants.KEY_KEY, "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", j6f.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ll/kcl0;", "impl", "Ll/kcl0;", "lifecycle-viewmodel_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public abstract class jcl0 {

    @Nullable
    private final kcl0 impl;

    public jcl0(@NotNull ppb ppbVar, @NotNull AutoCloseable... autoCloseableArr) {
        ppbVar.getClass();
        autoCloseableArr.getClass();
        this.impl = new kcl0(ppbVar, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        key.getClass();
        closeable.getClass();
        kcl0 kcl0Var = this.impl;
        if (kcl0Var != null) {
            kcl0Var.m145448e(key, closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        kcl0 kcl0Var = this.impl;
        if (kcl0Var != null) {
            kcl0Var.m145449f();
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        key.getClass();
        kcl0 kcl0Var = this.impl;
        if (kcl0Var != null) {
            return (T) kcl0Var.m145451h(key);
        }
        return null;
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        closeable.getClass();
        kcl0 kcl0Var = this.impl;
        if (kcl0Var != null) {
            kcl0Var.m145447d(closeable);
        }
    }

    @Deprecated
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        kcl0 kcl0Var = this.impl;
        if (kcl0Var != null) {
            kcl0Var.m145447d(closeable);
        }
    }

    public void onCleared() {
    }

    public jcl0(@NotNull ppb ppbVar) {
        ppbVar.getClass();
        this.impl = new kcl0(ppbVar);
    }

    public jcl0(@NotNull AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.impl = new kcl0((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public jcl0() {
        this.impl = new kcl0();
    }

    @Deprecated
    public /* synthetic */ jcl0(Closeable... closeableArr) {
        closeableArr.getClass();
        this.impl = new kcl0((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
