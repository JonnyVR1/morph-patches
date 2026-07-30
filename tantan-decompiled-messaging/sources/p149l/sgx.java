package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J/\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'¨\u0006)"}, m87232d2 = {"Ll/sgx;", "Ll/erm;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "buffering", "playerReady", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "a", "()Landroid/view/View;", "", "play", "setPlayWhenReady", "(Z)V", "pause", "Landroid/graphics/drawable/Drawable;", "artworkAsset", "e", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "", "b", "()F", "c", "ctx", "", "uriString", "isMediaAudio", "isMediaVideo", "f", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "Landroidx/media3/ui/PlayerView;", "Landroidx/media3/ui/PlayerView;", "videoSurfaceView", "Landroidx/media3/exoplayer/ExoPlayer;", "Landroidx/media3/exoplayer/ExoPlayer;", GameIdentity.player, "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@UnstableApi
@SourceDebugExtension
public final class sgx implements erm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private PlayerView videoSurfaceView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: l.sgx$a */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/sgx$a", "Ll/ugx;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C19943a extends ugx {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0<Unit> f164497a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ sgx f164498b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ExoPlayer f164499c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function0<Unit> f164500d;

        public C19943a(Function0<Unit> function0, sgx sgxVar, ExoPlayer exoPlayer, Function0<Unit> function1) {
            this.f164497a = function0;
            this.f164498b = sgxVar;
            this.f164499c = exoPlayer;
            this.f164500d = function1;
        }
    }

    @Override // p149l.erm
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo117848a() {
        View view = this.videoSurfaceView;
        view.getClass();
        return view;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: b */
    public float mo117849b() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 0.0f;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: c */
    public void mo117850c() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            float fMo117849b = mo117849b();
            if (fMo117849b > 0.0f) {
                exoPlayer.setVolume(0.0f);
            } else if (fMo117849b == 0.0f) {
                exoPlayer.setVolume(1.0f);
            }
        }
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: d */
    public void mo117851d(@NotNull Context context, @NotNull Function0<Unit> buffering, @NotNull Function0<Unit> playerReady) {
        context.getClass();
        buffering.getClass();
        playerReady.getClass();
        if (this.player != null) {
            return;
        }
        TrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        TransferListener transferListenerBuild = new DefaultBandwidthMeter.Builder(context).build();
        transferListenerBuild.getClass();
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        userAgent.getClass();
        DataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(transferListenerBuild);
        transferListener.getClass();
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).setMediaSourceFactory(new DefaultMediaSourceFactory(new DefaultDataSource.Factory(context, transferListener))).build();
        exoPlayerBuild.setVolume(0.0f);
        exoPlayerBuild.addListener(new C19943a(buffering, this, exoPlayerBuild, playerReady));
        this.player = exoPlayerBuild;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: e */
    public void mo117852e(@NotNull Context context, @NotNull Function0<? extends Drawable> artworkAsset) {
        context.getClass();
        artworkAsset.getClass();
        if (this.videoSurfaceView != null) {
            return;
        }
        PlayerView playerView = new PlayerView(context);
        playerView.setBackgroundColor(0);
        playerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        playerView.setUseArtwork(true);
        playerView.setDefaultArtwork(artworkAsset.invoke());
        playerView.setUseController(true);
        playerView.setControllerAutoShow(false);
        playerView.setPlayer(this.player);
        this.videoSurfaceView = playerView;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: f */
    public void mo117853f(@NotNull Context ctx, @NotNull String uriString, boolean isMediaAudio, boolean isMediaVideo) {
        ctx.getClass();
        uriString.getClass();
        PlayerView playerView = this.videoSurfaceView;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            MediaItem mediaItemFromUri = MediaItem.fromUri(uriString);
            mediaItemFromUri.getClass();
            exoPlayer.setMediaItem(mediaItemFromUri);
            exoPlayer.prepare();
            if (!isMediaAudio) {
                if (isMediaVideo) {
                    exoPlayer.setPlayWhenReady(true);
                    exoPlayer.setVolume(mo117849b());
                    return;
                }
                return;
            }
            PlayerView playerView2 = this.videoSurfaceView;
            if (playerView2 != null) {
                playerView2.showController();
            }
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.setVolume(1.0f);
        }
    }

    @Override // p149l.erm
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.player = null;
        this.videoSurfaceView = null;
    }

    @Override // p149l.erm
    public void setPlayWhenReady(boolean play) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(play);
        }
    }
}
