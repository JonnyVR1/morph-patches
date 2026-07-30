package p149l;

import android.content.Context;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.ui.PlayerView;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0012J\u001b\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0003J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u0003J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00062\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00060%¢\u0006\u0004\b(\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010/R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00107\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00101R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010=R\u0016\u0010@\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00101R?\u0010H\u001a\u001f\u0012\u0013\u0012\u00110\u0016¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\u0006\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010)R\u0011\u0010J\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b3\u0010IR\u0011\u0010C\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b8\u0010IR\u0011\u0010K\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b5\u0010I¨\u0006L"}, m87232d2 = {"Ll/a460;", "", "<init>", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", GameIdentity.player, "", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroidx/media3/exoplayer/ExoPlayer;)V", "k", "Landroid/content/Context;", "context", "", "url", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/view/View;", "a", "(Landroid/content/Context;)Landroid/view/View;", RXScreenCaptureService.KEY_INDEX, "r", BLiveStormDanmakuGiftResourceType.f44446s, "", "muted", "p", "(Z)V", "b", "j", "Lkotlin/Function0;", "callback", "h", "(Lkotlin/jvm/functions/Function0;)V", "c", "n", "m", Constants.KEY_T, "()Landroid/view/View;", "Lkotlin/Function1;", "Landroidx/media3/common/PlaybackException;", "onError", "o", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/media3/exoplayer/ExoPlayer;", "Landroidx/media3/ui/PlayerView;", "Landroidx/media3/ui/PlayerView;", "playerView", "", "J", "savedPositionMs", "Z", "_isMuted", "e", "_isPlaying", "f", "Ljava/lang/Object;", "firstFrameLock", "g", "firstFrameReady", "Lkotlin/jvm/functions/Function0;", "onFirstFrame", "Landroidx/media3/common/Player$Listener;", "Landroidx/media3/common/Player$Listener;", "errorListener", "playingChangedListener", "networkRetryEnabled", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "isPlaying", "Lkotlin/jvm/functions/Function1;", "getOnPlayingChanged", "()Lkotlin/jvm/functions/Function1;", "q", "onPlayingChanged", "()Z", "isMuted", "isNetworkRetryEnabled", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class a460 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PlayerView playerView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long savedPositionMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean _isMuted = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean _isPlaying = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Object firstFrameLock = new Object();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean firstFrameReady;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onFirstFrame;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Player.Listener errorListener;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private Player.Listener playingChangedListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private volatile boolean networkRetryEnabled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> onPlayingChanged;

    /* JADX INFO: renamed from: l.a460$a */
    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m87232d2 = {"Ll/a460$a;", "Landroidx/media3/exoplayer/upstream/DefaultLoadErrorHandlingPolicy;", "<init>", "(Ll/a460;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public final class C15522a extends DefaultLoadErrorHandlingPolicy {
        public C15522a() {
        }
    }

    /* JADX INFO: renamed from: l.a460$b */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/a460$b", "Landroidx/media3/common/Player$Listener;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C15523b implements Player.Listener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ExoPlayer f67472b;

        public C15523b(ExoPlayer exoPlayer) {
            this.f67472b = exoPlayer;
        }
    }

    /* JADX INFO: renamed from: l.a460$c */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/a460$c", "Landroidx/media3/common/Player$Listener;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C15524c implements Player.Listener {
        public C15524c() {
        }
    }

    /* JADX INFO: renamed from: l.a460$d */
    @Metadata(m87231d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"l/a460$d", "Landroidx/media3/common/Player$Listener;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C15525d implements Player.Listener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1<PlaybackException, Unit> f67474a;

        public C15525d(Function1<? super PlaybackException, Unit> function1) {
            this.f67474a = function1;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m94809k(ExoPlayer player) {
        player.addListener(new C15523b(player));
    }

    /* JADX INFO: renamed from: l */
    private final void m94810l(ExoPlayer player) {
        C15524c c15524c = new C15524c();
        this.playingChangedListener = c15524c;
        player.addListener(c15524c);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m94811a(@NotNull Context context) {
        context.getClass();
        if (this.playerView != null) {
            qkq0.m175383a("createSurface() called twice — previous PlayerView not released");
            return null;
        }
        View playerView = new PlayerView(context);
        playerView.setUseController(false);
        playerView.setShowBuffering(1);
        playerView.setPlayer(this.player);
        this.playerView = playerView;
        return playerView;
    }

    /* JADX INFO: renamed from: b */
    public final void m94812b() {
        synchronized (this.firstFrameLock) {
            this.firstFrameReady = false;
            this.onFirstFrame = null;
            Unit unit = Unit.INSTANCE;
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        this.savedPositionMs = exoPlayer.getCurrentPosition();
        this._isPlaying = exoPlayer.getPlayWhenReady();
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer((Player) null);
        }
        this.playerView = null;
        exoPlayer.setPlayWhenReady(false);
    }

    /* JADX INFO: renamed from: c */
    public final void m94813c() {
        this.networkRetryEnabled = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m94814d(@NotNull Context context, @NotNull String url) {
        context.getClass();
        url.getClass();
        if (this.player != null) {
            return;
        }
        DefaultBandwidthMeter defaultBandwidthMeterBuild = new DefaultBandwidthMeter.Builder(context).build();
        defaultBandwidthMeterBuild.getClass();
        TrackSelector defaultTrackSelector = new DefaultTrackSelector(context, new AdaptiveTrackSelection.Factory());
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        userAgent.getClass();
        DataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setTransferListener(defaultBandwidthMeterBuild.getTransferListener());
        transferListener.getClass();
        MediaSource.Factory loadErrorHandlingPolicy = new DefaultMediaSourceFactory(new DefaultDataSource.Factory(context, transferListener)).setLoadErrorHandlingPolicy(new C15522a());
        loadErrorHandlingPolicy.getClass();
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).setTrackSelector(defaultTrackSelector).setMediaSourceFactory(loadErrorHandlingPolicy).build();
        exoPlayerBuild.setMediaItem(MediaItem.fromUri(url));
        exoPlayerBuild.prepare();
        exoPlayerBuild.setRepeatMode(1);
        exoPlayerBuild.setVolume(0.0f);
        this.player = exoPlayerBuild;
        m94809k(exoPlayerBuild);
        ExoPlayer exoPlayer = this.player;
        exoPlayer.getClass();
        m94810l(exoPlayer);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean get_isMuted() {
        return this._isMuted;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNetworkRetryEnabled() {
        return this.networkRetryEnabled;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94817g() {
        ExoPlayer exoPlayer = this.player;
        return exoPlayer != null ? exoPlayer.isPlaying() : this._isPlaying;
    }

    /* JADX INFO: renamed from: h */
    public final void m94818h(@NotNull Function0<Unit> callback) {
        callback.getClass();
        synchronized (this.firstFrameLock) {
            try {
                if (this.firstFrameReady) {
                    callback.invoke();
                } else {
                    this.onFirstFrame = callback;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m94819i() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
        this._isPlaying = true;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public final View m94820j(@NotNull Context context) {
        context.getClass();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return null;
        }
        View viewM94811a = m94811a(context);
        synchronized (this.firstFrameLock) {
            this.firstFrameReady = false;
            Unit unit = Unit.INSTANCE;
        }
        m94809k(exoPlayer);
        exoPlayer.setPlayWhenReady(this._isPlaying);
        exoPlayer.setVolume(this._isMuted ? 0.0f : 1.0f);
        return viewM94811a;
    }

    /* JADX INFO: renamed from: m */
    public final void m94821m() {
        ExoPlayer exoPlayer;
        ExoPlayer exoPlayer2;
        this.networkRetryEnabled = false;
        synchronized (this.firstFrameLock) {
            this.firstFrameReady = false;
            this.onFirstFrame = null;
            Unit unit = Unit.INSTANCE;
        }
        Player.Listener listener = this.errorListener;
        if (listener != null && (exoPlayer2 = this.player) != null) {
            exoPlayer2.removeListener(listener);
        }
        this.errorListener = null;
        Player.Listener listener2 = this.playingChangedListener;
        if (listener2 != null && (exoPlayer = this.player) != null) {
            exoPlayer.removeListener(listener2);
        }
        this.playingChangedListener = null;
        this.onPlayingChanged = null;
        PlayerView playerView = this.playerView;
        if (playerView != null) {
            playerView.setPlayer((Player) null);
        }
        this.playerView = null;
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null) {
            exoPlayer3.stop();
        }
        ExoPlayer exoPlayer4 = this.player;
        if (exoPlayer4 != null) {
            exoPlayer4.release();
        }
        this.player = null;
    }

    /* JADX INFO: renamed from: n */
    public final void m94822n() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.prepare();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m94823o(@NotNull Function1<? super PlaybackException, Unit> onError) {
        onError.getClass();
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        Player.Listener listener = this.errorListener;
        if (listener != null) {
            exoPlayer.removeListener(listener);
        }
        C15525d c15525d = new C15525d(onError);
        this.errorListener = c15525d;
        exoPlayer.addListener(c15525d);
    }

    /* JADX INFO: renamed from: p */
    public final void m94824p(boolean muted) {
        this._isMuted = muted;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(muted ? 0.0f : 1.0f);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m94825q(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onPlayingChanged = function1;
    }

    /* JADX INFO: renamed from: r */
    public final void m94826r() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
        this._isPlaying = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m94827s() {
        boolean z = this._isMuted;
        this._isMuted = !z;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(!z ? 0.0f : 1.0f);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final View m94828t() {
        View view = this.playerView;
        if (view != null) {
            return view;
        }
        qkq0.m175383a("videoSurface() called but no PlayerView exists — was createSurface() called?");
        return null;
    }
}
