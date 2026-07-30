package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.audio.C1818a;
import com.google.android.exoplayer2.source.C1937d;
import com.google.android.exoplayer2.source.InterfaceC1965i;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import p149l.b6j0;
import p149l.cxb;
import p149l.dhd;
import p149l.e5l0;
import p149l.eqd;
import p149l.fd2;
import p149l.g0f0;
import p149l.gaj;
import p149l.grc0;
import p149l.ha4;
import p149l.hk0;
import p149l.ice0;
import p149l.krv;
import p149l.lk0;
import p149l.lrd;
import p149l.ond;
import p149l.p11;
import p149l.p95;
import p149l.pj1;
import p149l.s6j0;
import p149l.sif0;
import p149l.tyg0;
import p149l.uoe;
import p149l.val0;
import p149l.vck0;
import p149l.w6j0;
import p149l.y6j0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface ExoPlayer extends InterfaceC2003t {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$a */
    @Deprecated
    public interface InterfaceC1789a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$b */
    public interface InterfaceC1790b {
        /* JADX INFO: renamed from: E */
        default void m9356E(boolean z) {
        }

        /* JADX INFO: renamed from: I */
        default void m9357I(boolean z) {
        }

        /* JADX INFO: renamed from: u */
        default void mo9358u(boolean z) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$d */
    @Deprecated
    public interface InterfaceC1792d {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$e */
    @Deprecated
    public interface InterfaceC1793e {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$f */
    @Deprecated
    public interface InterfaceC1794f {
    }

    void addAnalyticsListener(lk0 lk0Var);

    void addAudioOffloadListener(InterfaceC1790b interfaceC1790b);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void addListener(InterfaceC2003t.d dVar);

    /* synthetic */ void addMediaItem(int i, C1921n c1921n);

    /* synthetic */ void addMediaItem(C1921n c1921n);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void addMediaItems(int i, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i, InterfaceC1965i interfaceC1965i);

    void addMediaSource(InterfaceC1965i interfaceC1965i);

    void addMediaSources(int i, List<InterfaceC1965i> list);

    void addMediaSources(List<InterfaceC1965i> list);

    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(ha4 ha4Var);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(e5l0 e5l0Var);

    /* synthetic */ void clearVideoSurface();

    /* synthetic */ void clearVideoSurface(@Nullable Surface surface);

    /* synthetic */ void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void clearVideoTextureView(@Nullable TextureView textureView);

    C2004u createMessage(C2004u.b bVar);

    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    /* synthetic */ void decreaseDeviceVolume(int i);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    hk0 getAnalyticsCollector();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ Looper getApplicationLooper();

    /* synthetic */ C1818a getAudioAttributes();

    @Nullable
    @Deprecated
    InterfaceC1789a getAudioComponent();

    @Nullable
    dhd getAudioDecoderCounters();

    @Nullable
    C1871k getAudioFormat();

    int getAudioSessionId();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ InterfaceC2003t.b getAvailableCommands();

    @IntRange(from = 0, to = 100)
    /* synthetic */ int getBufferedPercentage();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getBufferedPosition();

    p95 getClock();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getContentBufferedPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getContentDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getContentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ cxb getCurrentCues();

    /* synthetic */ long getCurrentLiveOffset();

    @Nullable
    /* synthetic */ Object getCurrentManifest();

    @Nullable
    /* synthetic */ C1921n getCurrentMediaItem();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getCurrentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ AbstractC1834c0 getCurrentTimeline();

    @Deprecated
    b6j0 getCurrentTrackGroups();

    @Deprecated
    s6j0 getCurrentTrackSelections();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ C1838d0 getCurrentTracks();

    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Nullable
    @Deprecated
    InterfaceC1792d getDeviceComponent();

    /* synthetic */ C1868h getDeviceInfo();

    @IntRange(from = 0)
    /* synthetic */ int getDeviceVolume();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getMaxSeekToPreviousPosition();

    /* synthetic */ C1921n getMediaItemAt(int i);

    /* synthetic */ int getMediaItemCount();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ C1922o getMediaMetadata();

    /* synthetic */ int getNextMediaItemIndex();

    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ C1930s getPlaybackParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getPlaybackState();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    @Nullable
    ExoPlaybackException getPlayerError();

    /* synthetic */ C1922o getPlaylistMetadata();

    /* synthetic */ int getPreviousMediaItemIndex();

    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    InterfaceC2066x getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ int getRepeatMode();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getSeekBackIncrement();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getSeekForwardIncrement();

    ice0 getSeekParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    /* synthetic */ sif0 getSurfaceSize();

    @Nullable
    @Deprecated
    InterfaceC1793e getTextComponent();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ long getTotalBufferedDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ w6j0 getTrackSelectionParameters();

    @Nullable
    y6j0 getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Nullable
    @Deprecated
    InterfaceC1794f getVideoComponent();

    @Nullable
    dhd getVideoDecoderCounters();

    @Nullable
    C1871k getVideoFormat();

    int getVideoScalingMode();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ val0 getVideoSize();

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* synthetic */ float getVolume();

    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean hasNextMediaItem();

    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean hasPreviousMediaItem();

    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    /* synthetic */ void increaseDeviceVolume(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isCommandAvailable(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isDeviceMuted();

    /* synthetic */ boolean isLoading();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isPlaying();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ boolean isPlayingAd();

    boolean isTunnelingEnabled();

    /* synthetic */ void moveMediaItem(int i, int i2);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void moveMediaItems(int i, int i2, int i3);

    @Deprecated
    /* synthetic */ void next();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void pause();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void play();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(InterfaceC1965i interfaceC1965i);

    @Deprecated
    void prepare(InterfaceC1965i interfaceC1965i, boolean z, boolean z2);

    @Deprecated
    /* synthetic */ void previous();

    /* synthetic */ void release();

    void removeAnalyticsListener(lk0 lk0Var);

    void removeAudioOffloadListener(InterfaceC1790b interfaceC1790b);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void removeListener(InterfaceC2003t.d dVar);

    /* synthetic */ void removeMediaItem(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void removeMediaItems(int i, int i2);

    /* synthetic */ void replaceMediaItem(int i, C1921n c1921n);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void replaceMediaItems(int i, int i2, List list);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekBack();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekForward();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekTo(int i, long j);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekTo(long j);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekToNext();

    /* synthetic */ void seekToNextMediaItem();

    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void seekToPrevious();

    /* synthetic */ void seekToPreviousMediaItem();

    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(C1818a c1818a, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(pj1 pj1Var);

    void setCameraMotionListener(ha4 ha4Var);

    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z);

    /* synthetic */ void setDeviceMuted(boolean z, int i);

    @Deprecated
    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i);

    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i, int i2);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    /* synthetic */ void setMediaItem(C1921n c1921n);

    /* synthetic */ void setMediaItem(C1921n c1921n, long j);

    /* synthetic */ void setMediaItem(C1921n c1921n, boolean z);

    /* synthetic */ void setMediaItems(List list);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setMediaItems(List list, int i, long j);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setMediaItems(List list, boolean z);

    void setMediaSource(InterfaceC1965i interfaceC1965i);

    void setMediaSource(InterfaceC1965i interfaceC1965i, long j);

    void setMediaSource(InterfaceC1965i interfaceC1965i, boolean z);

    void setMediaSources(List<InterfaceC1965i> list);

    void setMediaSources(List<InterfaceC1965i> list, int i, long j);

    void setMediaSources(List<InterfaceC1965i> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setPlayWhenReady(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setPlaybackParameters(C1930s c1930s);

    /* synthetic */ void setPlaybackSpeed(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f);

    /* synthetic */ void setPlaylistMetadata(C1922o c1922o);

    @RequiresApi(23)
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setRepeatMode(int i);

    void setSeekParameters(@Nullable ice0 ice0Var);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setShuffleModeEnabled(boolean z);

    void setShuffleOrder(g0f0 g0f0Var);

    void setSkipSilenceEnabled(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setTrackSelectionParameters(w6j0 w6j0Var);

    void setVideoChangeFrameRateStrategy(int i);

    @RequiresApi(18)
    void setVideoEffects(List<uoe> list);

    void setVideoFrameMetadataListener(e5l0 e5l0Var);

    void setVideoScalingMode(int i);

    /* synthetic */ void setVideoSurface(@Nullable Surface surface);

    /* synthetic */ void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void setVideoTextureView(@Nullable TextureView textureView);

    /* synthetic */ void setVolume(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f);

    void setWakeMode(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2003t
    /* synthetic */ void stop();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$c */
    public static final class C1791c {

        /* JADX INFO: renamed from: A */
        public boolean f6982A;

        /* JADX INFO: renamed from: B */
        public boolean f6983B;

        /* JADX INFO: renamed from: C */
        @Nullable
        public Looper f6984C;

        /* JADX INFO: renamed from: D */
        public boolean f6985D;

        /* JADX INFO: renamed from: a */
        public final Context f6986a;

        /* JADX INFO: renamed from: b */
        public p95 f6987b;

        /* JADX INFO: renamed from: c */
        public long f6988c;

        /* JADX INFO: renamed from: d */
        public tyg0<grc0> f6989d;

        /* JADX INFO: renamed from: e */
        public tyg0<InterfaceC1965i.a> f6990e;

        /* JADX INFO: renamed from: f */
        public tyg0<y6j0> f6991f;

        /* JADX INFO: renamed from: g */
        public tyg0<krv> f6992g;

        /* JADX INFO: renamed from: h */
        public tyg0<fd2> f6993h;

        /* JADX INFO: renamed from: i */
        public gaj<p95, hk0> f6994i;

        /* JADX INFO: renamed from: j */
        public Looper f6995j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public PriorityTaskManager f6996k;

        /* JADX INFO: renamed from: l */
        public C1818a f6997l;

        /* JADX INFO: renamed from: m */
        public boolean f6998m;

        /* JADX INFO: renamed from: n */
        public int f6999n;

        /* JADX INFO: renamed from: o */
        public boolean f7000o;

        /* JADX INFO: renamed from: p */
        public boolean f7001p;

        /* JADX INFO: renamed from: q */
        public boolean f7002q;

        /* JADX INFO: renamed from: r */
        public int f7003r;

        /* JADX INFO: renamed from: s */
        public int f7004s;

        /* JADX INFO: renamed from: t */
        public boolean f7005t;

        /* JADX INFO: renamed from: u */
        public ice0 f7006u;

        /* JADX INFO: renamed from: v */
        public long f7007v;

        /* JADX INFO: renamed from: w */
        public long f7008w;

        /* JADX INFO: renamed from: x */
        public InterfaceC1873m f7009x;

        /* JADX INFO: renamed from: y */
        public long f7010y;

        /* JADX INFO: renamed from: z */
        public long f7011z;

        public C1791c(Context context, tyg0<grc0> tyg0Var, tyg0<InterfaceC1965i.a> tyg0Var2, tyg0<y6j0> tyg0Var3, tyg0<krv> tyg0Var4, tyg0<fd2> tyg0Var5, gaj<p95, hk0> gajVar) {
            this.f6986a = (Context) p11.m167011e(context);
            this.f6989d = tyg0Var;
            this.f6990e = tyg0Var2;
            this.f6991f = tyg0Var3;
            this.f6992g = tyg0Var4;
            this.f6993h = tyg0Var5;
            this.f6994i = gajVar;
            this.f6995j = vck0.m197821R();
            this.f6997l = C1818a.f7142g;
            this.f6999n = 0;
            this.f7003r = 1;
            this.f7004s = 0;
            this.f7005t = true;
            this.f7006u = ice0.f112455g;
            this.f7007v = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
            this.f7008w = 15000L;
            this.f7009x = new C1866f.b().m9993a();
            this.f6987b = p95.f147671a;
            this.f7010y = 500L;
            this.f7011z = 2000L;
            this.f6983B = true;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ grc0 m9359a(Context context) {
            return new eqd(context);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ InterfaceC1965i.a m9360b(InterfaceC1965i.a aVar) {
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ y6j0 m9361c(y6j0 y6j0Var) {
            return y6j0Var;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC1965i.a m9362d(Context context) {
            return new C1937d(context, new ond());
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ y6j0 m9364f(Context context) {
            return new lrd(context);
        }

        /* JADX INFO: renamed from: g */
        public ExoPlayer m9365g() {
            p11.m167013g(!this.f6985D);
            this.f6985D = true;
            return new C1869i(this, null);
        }

        /* JADX INFO: renamed from: h */
        public C1791c m9366h(final InterfaceC1965i.a aVar) {
            p11.m167013g(!this.f6985D);
            p11.m167011e(aVar);
            this.f6990e = new tyg0() { // from class: l.t6f
                @Override // p149l.tyg0
                public final Object get() {
                    return ExoPlayer.C1791c.m9360b(aVar);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1791c m9367i(final y6j0 y6j0Var) {
            p11.m167013g(!this.f6985D);
            p11.m167011e(y6j0Var);
            this.f6991f = new tyg0() { // from class: l.s6f
                @Override // p149l.tyg0
                public final Object get() {
                    return ExoPlayer.C1791c.m9361c(y6j0Var);
                }
            };
            return this;
        }

        public C1791c(final Context context, tyg0<grc0> tyg0Var, tyg0<InterfaceC1965i.a> tyg0Var2) {
            this(context, tyg0Var, tyg0Var2, new tyg0() { // from class: l.u6f
                @Override // p149l.tyg0
                public final Object get() {
                    return ExoPlayer.C1791c.m9364f(context);
                }
            }, new tyg0() { // from class: l.v6f
                @Override // p149l.tyg0
                public final Object get() {
                    return new qod();
                }
            }, new tyg0() { // from class: l.w6f
                @Override // p149l.tyg0
                public final Object get() {
                    return jld.m142056n(context);
                }
            }, new gaj() { // from class: l.x6f
                @Override // p149l.gaj
                public final Object apply(Object obj) {
                    return new qkd((p95) obj);
                }
            });
        }

        public C1791c(final Context context) {
            this(context, new tyg0() { // from class: l.q6f
                @Override // p149l.tyg0
                public final Object get() {
                    return ExoPlayer.C1791c.m9359a(context);
                }
            }, new tyg0() { // from class: l.r6f
                @Override // p149l.tyg0
                public final Object get() {
                    return ExoPlayer.C1791c.m9362d(context);
                }
            });
        }
    }
}
