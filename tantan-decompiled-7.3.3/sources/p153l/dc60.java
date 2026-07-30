package p153l;

import android.app.Activity;
import androidx.lifecycle.LifecycleEventObserver;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.clevertap.android.sdk.inapp.pipsdk.PIPPosition;
import com.clevertap.android.sdk.inapp.pipsdk.internal.view.PIPRootContainer;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010+\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010/\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R6\u00106\u001a\b\u0012\u0004\u0012\u00020\u0006002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u0006008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b\n\u00103\"\u0004\b4\u00105R*\u00109\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b7\u0010(\"\u0004\b8\u0010*R.\u0010?\u001a\u0004\u0018\u00010:2\b\u0010\u000e\u001a\u0004\u0018\u00010:8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010;\u001a\u0004\b1\u0010<\"\u0004\b=\u0010>R.\u0010E\u001a\u0004\u0018\u00010@2\b\u0010\u000e\u001a\u0004\u0018\u00010@8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010A\u001a\u0004\b%\u0010B\"\u0004\bC\u0010DR.\u0010K\u001a\u0004\u0018\u00010F2\b\u0010\u000e\u001a\u0004\u0018\u00010F8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010G\u001a\u0004\b\u001d\u0010H\"\u0004\bI\u0010JR*\u0010M\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020$8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b,\u0010(\"\u0004\bL\u0010*¨\u0006N"}, m88121d2 = {"Ll/dc60;", "", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "initialPosition", "Landroid/app/Activity;", "activity", "<init>", "(Lcom/clevertap/android/sdk/inapp/pipsdk/a;Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;Landroid/app/Activity;)V", "a", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "b", "()Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "value", "Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "c", "()Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;", "m", "(Lcom/clevertap/android/sdk/inapp/pipsdk/PIPPosition;)V", "currentPosition", "Ll/fc60;", "Ll/fc60;", "h", "()Ll/fc60;", ResourceDirection.f39656v, "(Ll/fc60;)V", "videoPlayerWrapper", "", Constants.INAPP_DATA_TAG, "J", "getPlaybackPositionMs", "()J", Constants.KEY_T, "(J)V", "playbackPositionMs", "", "e", "Z", "j", "()Z", "q", "(Z)V", "isMuted", "f", "k", "u", "isPlaying", "Ljava/lang/ref/WeakReference;", "g", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/ref/WeakReference;)V", "activityRef", RXScreenCaptureService.KEY_INDEX, "n", "isExpanded", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;", "Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;", "()Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;", BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/clevertap/android/sdk/inapp/pipsdk/internal/view/PIPRootContainer;)V", "pipRootContainer", "Ll/ker;", "Ll/ker;", "()Ll/ker;", "p", "(Ll/ker;)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "()Landroidx/lifecycle/LifecycleEventObserver;", "o", "(Landroidx/lifecycle/LifecycleEventObserver;)V", "lifecycleObserver", "r", "pausedByBackground", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class dc60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final C1288a config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private PIPPosition currentPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private fc60 videoPlayerWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long playbackPositionMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isMuted;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isPlaying;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private WeakReference<Activity> activityRef;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isExpanded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private PIPRootContainer pipRootContainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private ker lifecycleOwner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private LifecycleEventObserver lifecycleObserver;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean pausedByBackground;

    public dc60(@NotNull C1288a c1288a, @NotNull PIPPosition pIPPosition, @NotNull Activity activity) {
        c1288a.getClass();
        pIPPosition.getClass();
        activity.getClass();
        this.config = c1288a;
        this.currentPosition = pIPPosition;
        this.isMuted = true;
        this.isPlaying = true;
        this.activityRef = new WeakReference<>(activity);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final WeakReference<Activity> m115217a() {
        return this.activityRef;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1288a getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final PIPPosition getCurrentPosition() {
        return this.currentPosition;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LifecycleEventObserver getLifecycleObserver() {
        return this.lifecycleObserver;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ker getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getPausedByBackground() {
        return this.pausedByBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final PIPRootContainer getPipRootContainer() {
        return this.pipRootContainer;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final fc60 getVideoPlayerWrapper() {
        return this.videoPlayerWrapper;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: l */
    public final void m115228l(@NotNull WeakReference<Activity> weakReference) {
        weakReference.getClass();
        this.activityRef = weakReference;
    }

    /* JADX INFO: renamed from: m */
    public final void m115229m(@NotNull PIPPosition pIPPosition) {
        pIPPosition.getClass();
        this.currentPosition = pIPPosition;
    }

    /* JADX INFO: renamed from: n */
    public final void m115230n(boolean z) {
        this.isExpanded = z;
    }

    /* JADX INFO: renamed from: o */
    public final void m115231o(@Nullable LifecycleEventObserver lifecycleEventObserver) {
        this.lifecycleObserver = lifecycleEventObserver;
    }

    /* JADX INFO: renamed from: p */
    public final void m115232p(@Nullable ker kerVar) {
        this.lifecycleOwner = kerVar;
    }

    /* JADX INFO: renamed from: q */
    public final void m115233q(boolean z) {
        this.isMuted = z;
    }

    /* JADX INFO: renamed from: r */
    public final void m115234r(boolean z) {
        this.pausedByBackground = z;
    }

    /* JADX INFO: renamed from: s */
    public final void m115235s(@Nullable PIPRootContainer pIPRootContainer) {
        this.pipRootContainer = pIPRootContainer;
    }

    /* JADX INFO: renamed from: t */
    public final void m115236t(long j) {
        this.playbackPositionMs = j;
    }

    /* JADX INFO: renamed from: u */
    public final void m115237u(boolean z) {
        this.isPlaying = z;
    }

    /* JADX INFO: renamed from: v */
    public final void m115238v(@Nullable fc60 fc60Var) {
        this.videoPlayerWrapper = fc60Var;
    }
}
