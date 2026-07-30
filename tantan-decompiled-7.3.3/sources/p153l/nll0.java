package p153l;

import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B%\b\u0016\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\u000bB-\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u00060\bj\u0002`\t0\u0007\"\u00060\bj\u0002`\t¢\u0006\u0004\b\u0002\u0010\fB\u001d\b\u0017\u0012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0007\"\u00020\r¢\u0006\u0004\b\u0002\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0018J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u001a*\u00060\bj\u0002`\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/nll0;", "", "<init>", "()V", "Ll/drb;", "viewModelScope", "(Ll/drb;)V", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Ll/drb;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "", "onCleared", "clear$lifecycle_viewmodel_release", BLiveResOperation.clear, "", Constants.KEY_KEY, "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", p7f.GPS_DIRECTION_TRUE, "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Ll/oll0;", "impl", "Ll/oll0;", "lifecycle-viewmodel_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class nll0 {

    @Nullable
    private final oll0 impl;

    public nll0(@NotNull drb drbVar, @NotNull AutoCloseable... autoCloseableArr) {
        drbVar.getClass();
        autoCloseableArr.getClass();
        this.impl = new oll0(drbVar, (AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        key.getClass();
        closeable.getClass();
        oll0 oll0Var = this.impl;
        if (oll0Var != null) {
            oll0Var.m168137e(key, closeable);
        }
    }

    @MainThread
    public final void clear$lifecycle_viewmodel_release() {
        oll0 oll0Var = this.impl;
        if (oll0Var != null) {
            oll0Var.m168138f();
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        key.getClass();
        oll0 oll0Var = this.impl;
        if (oll0Var != null) {
            return (T) oll0Var.m168140h(key);
        }
        return null;
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        closeable.getClass();
        oll0 oll0Var = this.impl;
        if (oll0Var != null) {
            oll0Var.m168136d(closeable);
        }
    }

    @Deprecated
    public /* synthetic */ void addCloseable(Closeable closeable) {
        closeable.getClass();
        oll0 oll0Var = this.impl;
        if (oll0Var != null) {
            oll0Var.m168136d(closeable);
        }
    }

    public void onCleared() {
    }

    public nll0(@NotNull drb drbVar) {
        drbVar.getClass();
        this.impl = new oll0(drbVar);
    }

    public nll0(@NotNull AutoCloseable... autoCloseableArr) {
        autoCloseableArr.getClass();
        this.impl = new oll0((AutoCloseable[]) Arrays.copyOf(autoCloseableArr, autoCloseableArr.length));
    }

    public nll0() {
        this.impl = new oll0();
    }

    @Deprecated
    public /* synthetic */ nll0(Closeable... closeableArr) {
        closeableArr.getClass();
        this.impl = new oll0((AutoCloseable[]) Arrays.copyOf(closeableArr, closeableArr.length));
    }
}
