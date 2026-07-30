package p149l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/t5l0;", "", "<init>", "()V", "", "c", "()Z", "a", "b", "Z", "hasExoplayer", "hasMedia3", "haveVideoPlayerSupport", "Lcom/clevertap/android/sdk/video/VideoLibraryIntegrated;", Constants.INAPP_DATA_TAG, "Lcom/clevertap/android/sdk/video/VideoLibraryIntegrated;", "mediaLibType", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t5l0 {

    @NotNull
    public static final t5l0 INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final boolean hasExoplayer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final boolean hasMedia3;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public static final boolean haveVideoPlayerSupport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final VideoLibraryIntegrated mediaLibType;

    static {
        VideoLibraryIntegrated videoLibraryIntegrated;
        t5l0 t5l0Var = new t5l0();
        INSTANCE = t5l0Var;
        boolean zM187335a = t5l0Var.m187335a();
        hasExoplayer = zM187335a;
        boolean zM187336b = t5l0Var.m187336b();
        hasMedia3 = zM187336b;
        haveVideoPlayerSupport = t5l0Var.m187337c();
        if (zM187336b) {
            videoLibraryIntegrated = VideoLibraryIntegrated.MEDIA3;
        } else if (zM187335a) {
            Logger.m5869i("ExoPlayer (com.google.android.exoplayer2) support in CleverTap is deprecated and will be removed in v9.0.0. Please migrate to Media3 (androidx.media3).");
            videoLibraryIntegrated = VideoLibraryIntegrated.EXOPLAYER;
        } else {
            videoLibraryIntegrated = VideoLibraryIntegrated.NONE;
        }
        mediaLibType = videoLibraryIntegrated;
    }

    private t5l0() {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m187335a() {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.exoplayer2.ExoPlayer", "com.google.android.exoplayer2.source.hls.HlsMediaSource", "com.google.android.exoplayer2.ui.StyledPlayerView"})) {
            try {
                Class.forName(str);
            } catch (Throwable unused) {
                Logger.m5865d(str + " is missing!!!");
                Logger.m5865d("One or more ExoPlayer library files are missing!!!");
                return false;
            }
        }
        Logger.m5865d("ExoPlayer is present");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m187336b() {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"androidx.media3.exoplayer.ExoPlayer", "androidx.media3.exoplayer.hls.HlsMediaSource", "androidx.media3.ui.PlayerView"})) {
            try {
                Class.forName(str);
            } catch (Throwable unused) {
                Logger.m5865d(str + " is missing!!!");
                Logger.m5865d("One or more Media3 library files are missing!!!");
                return false;
            }
        }
        Logger.m5865d("Media3 is present");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m187337c() {
        boolean z = hasMedia3;
        if (!z && !hasExoplayer) {
            Logger.m5865d("Please add ExoPlayer/Media3 dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation.");
        }
        return hasExoplayer || z;
    }
}
