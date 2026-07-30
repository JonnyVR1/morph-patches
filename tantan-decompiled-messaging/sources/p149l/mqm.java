package p149l;

import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m87232d2 = {"Ll/mqm;", "", "<init>", "()V", "Ll/nqm;", "handle", "", "isFullscreen", "", Constants.INAPP_DATA_TAG, "(Ll/nqm;Z)V", "a", "()Ll/nqm;", "b", "()Z", "c", "Ll/nqm;", "Z", "cachedIsFullscreen", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class mqm {

    @NotNull
    public static final mqm INSTANCE = new mqm();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static nqm handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean cachedIsFullscreen;

    private mqm() {
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final nqm m155958a() {
        nqm nqmVar = handle;
        handle = null;
        return nqmVar;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m155959b() {
        boolean z = cachedIsFullscreen;
        cachedIsFullscreen = false;
        return z;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m155960c() {
        nqm nqmVar = handle;
        if (nqmVar != null) {
            nqmVar.pause();
        }
        handle = null;
        cachedIsFullscreen = false;
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m155961d(@NotNull nqm handle2, boolean isFullscreen) {
        handle2.getClass();
        handle = handle2;
        cachedIsFullscreen = isFullscreen;
    }
}
