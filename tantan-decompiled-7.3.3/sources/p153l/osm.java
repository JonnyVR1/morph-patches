package p153l;

import androidx.annotation.MainThread;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/osm;", "", "<init>", "()V", "Ll/psm;", "handle", "", "isFullscreen", "", Constants.INAPP_DATA_TAG, "(Ll/psm;Z)V", "a", "()Ll/psm;", "b", "()Z", "c", "Ll/psm;", "Z", "cachedIsFullscreen", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class osm {

    @NotNull
    public static final osm INSTANCE = new osm();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static psm handle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static boolean cachedIsFullscreen;

    private osm() {
    }

    @MainThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public final psm m169054a() {
        psm psmVar = handle;
        handle = null;
        return psmVar;
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public final boolean m169055b() {
        boolean z = cachedIsFullscreen;
        cachedIsFullscreen = false;
        return z;
    }

    @MainThread
    /* JADX INFO: renamed from: c */
    public final void m169056c() {
        psm psmVar = handle;
        if (psmVar != null) {
            psmVar.pause();
        }
        handle = null;
        cachedIsFullscreen = false;
    }

    @MainThread
    /* JADX INFO: renamed from: d */
    public final void m169057d(@NotNull psm handle2, boolean isFullscreen) {
        handle2.getClass();
        handle = handle2;
        cachedIsFullscreen = isFullscreen;
    }
}
