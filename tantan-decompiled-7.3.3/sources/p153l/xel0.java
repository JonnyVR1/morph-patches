package p153l;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.video.VideoLibraryIntegrated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/xel0;", "", "<init>", "()V", "", "c", "()Z", "a", "b", "Z", "hasExoplayer", "hasMedia3", "haveVideoPlayerSupport", "Lcom/clevertap/android/sdk/video/VideoLibraryIntegrated;", Constants.INAPP_DATA_TAG, "Lcom/clevertap/android/sdk/video/VideoLibraryIntegrated;", "mediaLibType", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class xel0 {

    @NotNull
    public static final xel0 INSTANCE;

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
        xel0 xel0Var = new xel0();
        INSTANCE = xel0Var;
        boolean zM210723a = xel0Var.m210723a();
        hasExoplayer = zM210723a;
        boolean zM210724b = xel0Var.m210724b();
        hasMedia3 = zM210724b;
        haveVideoPlayerSupport = xel0Var.m210725c();
        if (zM210724b) {
            videoLibraryIntegrated = VideoLibraryIntegrated.MEDIA3;
        } else if (zM210723a) {
            Logger.m5923i("ExoPlayer (com.google.android.exoplayer2) support in CleverTap is deprecated and will be removed in v9.0.0. Please migrate to Media3 (androidx.media3).");
            videoLibraryIntegrated = VideoLibraryIntegrated.EXOPLAYER;
        } else {
            videoLibraryIntegrated = VideoLibraryIntegrated.NONE;
        }
        mediaLibType = videoLibraryIntegrated;
    }

    private xel0() {
    }

    /* JADX INFO: renamed from: a */
    private final boolean m210723a() {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"com.google.android.exoplayer2.ExoPlayer", "com.google.android.exoplayer2.source.hls.HlsMediaSource", "com.google.android.exoplayer2.ui.StyledPlayerView"})) {
            try {
                Class.forName(str);
            } catch (Throwable unused) {
                Logger.m5919d(str + " is missing!!!");
                Logger.m5919d("One or more ExoPlayer library files are missing!!!");
                return false;
            }
        }
        Logger.m5919d("ExoPlayer is present");
        return true;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m210724b() {
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"androidx.media3.exoplayer.ExoPlayer", "androidx.media3.exoplayer.hls.HlsMediaSource", "androidx.media3.ui.PlayerView"})) {
            try {
                Class.forName(str);
            } catch (Throwable unused) {
                Logger.m5919d(str + " is missing!!!");
                Logger.m5919d("One or more Media3 library files are missing!!!");
                return false;
            }
        }
        Logger.m5919d("Media3 is present");
        return true;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m210725c() {
        boolean z = hasMedia3;
        if (!z && !hasExoplayer) {
            Logger.m5919d("Please add ExoPlayer/Media3 dependencies to render InApp or Inbox messages playing video. For more information checkout CleverTap documentation.");
        }
        return hasExoplayer || z;
    }
}
