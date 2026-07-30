package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.R;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J2\u0010\u001a\u001a\u00020\u00062!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u001d\u0010\u001e\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103¨\u00065"}, m88121d2 = {"Ll/rpx;", "Ll/psm;", "<init>", "()V", "", "isFullScreen", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "Landroid/content/Context;", "context", "", "url", "e", "(Landroid/content/Context;Ljava/lang/String;)V", "isTablet", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Z)V", "play", "b", Constants.INAPP_DATA_TAG, "pause", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "onClick", "h", "(Lkotlin/jvm/functions/Function1;)V", "g", "Lkotlin/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "f", "Landroid/view/View;", "a", "()Landroid/view/View;", "Landroidx/media3/exoplayer/ExoPlayer;", "Landroidx/media3/exoplayer/ExoPlayer;", GameIdentity.player, "Landroidx/media3/ui/PlayerView;", "Landroidx/media3/ui/PlayerView;", "playerView", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "playerViewLayoutParamsNormal", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "playerViewLayoutParamsFullScreen", "Z", "isMuted", "", "J", "mediaPosition", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@UnstableApi
public final class rpx implements psm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PlayerView playerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ViewGroup.LayoutParams playerViewLayoutParamsNormal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private FrameLayout.LayoutParams playerViewLayoutParamsFullScreen = new FrameLayout.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isMuted = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long mediaPosition;

    /* JADX INFO: renamed from: j */
    public static void m182548j(Function0 function0, View view) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: l */
    private final void m182550l(boolean isFullScreen) {
        ImageButton imageButton;
        ImageButton imageButton2;
        int i = isFullScreen ? R.drawable.exo_icon_fullscreen_exit : R.drawable.exo_icon_fullscreen_enter;
        PlayerView playerView = this.playerView;
        if (playerView != null && (imageButton2 = (ImageButton) playerView.findViewById(icc0.f114387u)) != null) {
            imageButton2.setImageResource(i);
        }
        PlayerView playerView2 = this.playerView;
        if (playerView2 == null || (imageButton = (ImageButton) playerView2.findViewById(icc0.f114389v)) == null) {
            return;
        }
        imageButton.setImageResource(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m182551m(rpx rpxVar, ImageButton imageButton, ImageButton imageButton2, View view) {
        rpxVar.getClass();
        imageButton.getClass();
        boolean z = rpxVar.isMuted;
        rpxVar.isMuted = !z;
        ExoPlayer exoPlayer = rpxVar.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(!z ? 0.0f : 1.0f);
        }
        boolean z2 = rpxVar.isMuted;
        int i = z2 ? wbc0.f188236i : wbc0.f188238k;
        int i2 = z2 ? R$string.f4871l : R$string.f4865f;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
        if (imageButton2 != null) {
            imageButton2.setImageResource(i);
        }
        if (imageButton2 != null) {
            imageButton2.setContentDescription(imageButton.getContentDescription());
        }
    }

    @Override // p153l.psm
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo96635a() {
        View view = this.playerView;
        view.getClass();
        return view;
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: b */
    public void mo96636b() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: c */
    public void mo96637c(@NotNull final Function0<Unit> onClick) {
        ImageButton imageButton;
        onClick.getClass();
        PlayerView playerView = this.playerView;
        if (playerView == null || (imageButton = (ImageButton) playerView.findViewById(icc0.f114371m)) == null) {
            return;
        }
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.npx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rpx.m182548j(onClick, view);
            }
        });
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: d */
    public void mo96638d() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        this.mediaPosition = exoPlayer.getCurrentPosition();
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer((Player) null);
        }
        this.playerView = null;
        exoPlayer.setPlayWhenReady(false);
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: e */
    public void mo96639e(@NotNull Context context, @NotNull String url) {
        context.getClass();
        url.getClass();
        if (this.player != null) {
            return;
        }
        BandwidthMeter bandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
        bandwidthMeterBuild.getClass();
        TrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        userAgent.getClass();
        DataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(bandwidthMeterBuild.getTransferListener());
        transferListener.getClass();
        DataSource.Factory factory = new DefaultDataSource.Factory(context, transferListener);
        MediaItem mediaItemFromUri = MediaItem.fromUri(url);
        mediaItemFromUri.getClass();
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).setMediaSourceFactory(new DefaultMediaSourceFactory(factory)).build();
        exoPlayerBuild.setMediaItem(mediaItemFromUri);
        exoPlayerBuild.prepare();
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.setVolume(0.0f);
        exoPlayerBuild.seekTo(this.mediaPosition);
        this.player = exoPlayerBuild;
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: f */
    public void mo96640f(boolean isFullScreen) {
        PlayerView playerView = this.playerView;
        if (isFullScreen) {
            playerView.getClass();
            this.playerViewLayoutParamsNormal = playerView.getLayoutParams();
            PlayerView playerView2 = this.playerView;
            playerView2.getClass();
            playerView2.setLayoutParams(this.playerViewLayoutParamsFullScreen);
        } else {
            playerView.getClass();
            playerView.setLayoutParams(this.playerViewLayoutParamsNormal);
        }
        m182550l(isFullScreen);
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: g */
    public void mo96641g() {
        final ImageButton imageButton;
        PlayerView playerView = this.playerView;
        if (playerView == null || (imageButton = (ImageButton) playerView.findViewById(icc0.f114393x)) == null) {
            return;
        }
        PlayerView playerView2 = this.playerView;
        final ImageButton imageButton2 = playerView2 != null ? (ImageButton) playerView2.findViewById(icc0.f114391w) : null;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.opx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rpx.m182551m(this.f148522a, imageButton, imageButton2, view);
            }
        };
        imageButton.setOnClickListener(onClickListener);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(onClickListener);
        }
        boolean z = this.isMuted;
        int i = z ? wbc0.f188236i : wbc0.f188238k;
        int i2 = z ? R$string.f4871l : R$string.f4865f;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
        if (imageButton2 != null) {
            imageButton2.setImageResource(i);
        }
        if (imageButton2 != null) {
            imageButton2.setContentDescription(imageButton.getContentDescription());
        }
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: h */
    public void mo96642h(@NotNull final Function1<? super Boolean, Unit> onClick) {
        onClick.getClass();
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setFullscreenButtonClickListener(new PlayerView.FullscreenButtonClickListener() { // from class: l.ppx
            });
        }
        m182550l(false);
    }

    @Override // p153l.psm
    /* JADX INFO: renamed from: i */
    public void mo96643i(@NotNull Context context, boolean isTablet) {
        context.getClass();
        if (this.playerView != null) {
            return;
        }
        PlayerView playerViewInflate = LayoutInflater.from(context).inflate(efc0.f93745b, (ViewGroup) null);
        playerViewInflate.getClass();
        PlayerView playerView = playerViewInflate;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.playerViewLayoutParamsNormal = layoutParams;
        playerView.setLayoutParams(layoutParams);
        playerView.setShowBuffering(1);
        playerView.setUseArtwork(true);
        playerView.setControllerAutoShow(false);
        playerView.setDefaultArtwork(c5d0.m108035e(context.getResources(), wbc0.f188228a, null));
        this.playerView = playerView;
    }

    @Override // p153l.psm
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            this.player = null;
        }
    }

    @Override // p153l.psm
    public void play() {
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.requestFocus();
            playerView.setVisibility(0);
            playerView.setPlayer(this.player);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
        }
    }
}
