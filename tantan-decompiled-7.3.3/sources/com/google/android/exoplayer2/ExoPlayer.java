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
import com.google.android.exoplayer2.audio.C1841a;
import com.google.android.exoplayer2.source.C1960d;
import com.google.android.exoplayer2.source.InterfaceC1988i;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import p153l.adj;
import p153l.agj0;
import p153l.atd;
import p153l.b7h0;
import p153l.bmk0;
import p153l.brf0;
import p153l.cgj0;
import p153l.dk0;
import p153l.ffj0;
import p153l.gb4;
import p153l.hk0;
import p153l.iel0;
import p153l.jid;
import p153l.ltv;
import p153l.lzc0;
import p153l.md2;
import p153l.n8f0;
import p153l.nke0;
import p153l.qa5;
import p153l.qyb;
import p153l.tod;
import p153l.vrd;
import p153l.w11;
import p153l.wfj0;
import p153l.wj1;
import p153l.ype;
import p153l.zjl0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface ExoPlayer extends InterfaceC2026t {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$a */
    @Deprecated
    public interface InterfaceC1812a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$b */
    public interface InterfaceC1813b {
        /* JADX INFO: renamed from: E */
        default void m9410E(boolean z) {
        }

        /* JADX INFO: renamed from: I */
        default void m9411I(boolean z) {
        }

        /* JADX INFO: renamed from: u */
        default void mo9412u(boolean z) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$d */
    @Deprecated
    public interface InterfaceC1815d {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$e */
    @Deprecated
    public interface InterfaceC1816e {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$f */
    @Deprecated
    public interface InterfaceC1817f {
    }

    void addAnalyticsListener(hk0 hk0Var);

    void addAudioOffloadListener(InterfaceC1813b interfaceC1813b);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void addListener(InterfaceC2026t.d dVar);

    /* synthetic */ void addMediaItem(int i, C1944n c1944n);

    /* synthetic */ void addMediaItem(C1944n c1944n);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void addMediaItems(int i, List list);

    /* synthetic */ void addMediaItems(List list);

    void addMediaSource(int i, InterfaceC1988i interfaceC1988i);

    void addMediaSource(InterfaceC1988i interfaceC1988i);

    void addMediaSources(int i, List<InterfaceC1988i> list);

    void addMediaSources(List<InterfaceC1988i> list);

    /* synthetic */ boolean canAdvertiseSession();

    void clearAuxEffectInfo();

    void clearCameraMotionListener(gb4 gb4Var);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void clearMediaItems();

    void clearVideoFrameMetadataListener(iel0 iel0Var);

    /* synthetic */ void clearVideoSurface();

    /* synthetic */ void clearVideoSurface(@Nullable Surface surface);

    /* synthetic */ void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void clearVideoTextureView(@Nullable TextureView textureView);

    C2027u createMessage(C2027u.b bVar);

    @Deprecated
    /* synthetic */ void decreaseDeviceVolume();

    /* synthetic */ void decreaseDeviceVolume(int i);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z);

    dk0 getAnalyticsCollector();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ Looper getApplicationLooper();

    /* synthetic */ C1841a getAudioAttributes();

    @Nullable
    @Deprecated
    InterfaceC1812a getAudioComponent();

    @Nullable
    jid getAudioDecoderCounters();

    @Nullable
    C1894k getAudioFormat();

    int getAudioSessionId();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ InterfaceC2026t.b getAvailableCommands();

    @IntRange(from = 0, to = 100)
    /* synthetic */ int getBufferedPercentage();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getBufferedPosition();

    qa5 getClock();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getContentBufferedPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getContentDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getContentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getCurrentAdGroupIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getCurrentAdIndexInAdGroup();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ qyb getCurrentCues();

    /* synthetic */ long getCurrentLiveOffset();

    @Nullable
    /* synthetic */ Object getCurrentManifest();

    @Nullable
    /* synthetic */ C1944n getCurrentMediaItem();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getCurrentMediaItemIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getCurrentPeriodIndex();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getCurrentPosition();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ AbstractC1857c0 getCurrentTimeline();

    @Deprecated
    ffj0 getCurrentTrackGroups();

    @Deprecated
    wfj0 getCurrentTrackSelections();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ C1861d0 getCurrentTracks();

    @Deprecated
    /* synthetic */ int getCurrentWindowIndex();

    @Nullable
    @Deprecated
    InterfaceC1815d getDeviceComponent();

    /* synthetic */ C1891h getDeviceInfo();

    @IntRange(from = 0)
    /* synthetic */ int getDeviceVolume();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getMaxSeekToPreviousPosition();

    /* synthetic */ C1944n getMediaItemAt(int i);

    /* synthetic */ int getMediaItemCount();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ C1945o getMediaMetadata();

    /* synthetic */ int getNextMediaItemIndex();

    @Deprecated
    /* synthetic */ int getNextWindowIndex();

    boolean getPauseAtEndOfMediaItems();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean getPlayWhenReady();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ C1953s getPlaybackParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getPlaybackState();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getPlaybackSuppressionReason();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    @Nullable
    ExoPlaybackException getPlayerError();

    /* synthetic */ C1945o getPlaylistMetadata();

    /* synthetic */ int getPreviousMediaItemIndex();

    @Deprecated
    /* synthetic */ int getPreviousWindowIndex();

    InterfaceC2089x getRenderer(int i);

    int getRendererCount();

    int getRendererType(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ int getRepeatMode();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getSeekBackIncrement();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getSeekForwardIncrement();

    nke0 getSeekParameters();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean getShuffleModeEnabled();

    boolean getSkipSilenceEnabled();

    /* synthetic */ brf0 getSurfaceSize();

    @Nullable
    @Deprecated
    InterfaceC1816e getTextComponent();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ long getTotalBufferedDuration();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ agj0 getTrackSelectionParameters();

    @Nullable
    cgj0 getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Nullable
    @Deprecated
    InterfaceC1817f getVideoComponent();

    @Nullable
    jid getVideoDecoderCounters();

    @Nullable
    C1894k getVideoFormat();

    int getVideoScalingMode();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ zjl0 getVideoSize();

    @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d)
    /* synthetic */ float getVolume();

    @Deprecated
    /* synthetic */ boolean hasNext();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean hasNextMediaItem();

    @Deprecated
    /* synthetic */ boolean hasNextWindow();

    @Deprecated
    /* synthetic */ boolean hasPrevious();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean hasPreviousMediaItem();

    @Deprecated
    /* synthetic */ boolean hasPreviousWindow();

    @Deprecated
    /* synthetic */ void increaseDeviceVolume();

    /* synthetic */ void increaseDeviceVolume(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isCommandAvailable(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isCurrentMediaItemDynamic();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isCurrentMediaItemLive();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isCurrentMediaItemSeekable();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowDynamic();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowLive();

    @Deprecated
    /* synthetic */ boolean isCurrentWindowSeekable();

    /* synthetic */ boolean isDeviceMuted();

    /* synthetic */ boolean isLoading();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isPlaying();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ boolean isPlayingAd();

    boolean isTunnelingEnabled();

    /* synthetic */ void moveMediaItem(int i, int i2);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void moveMediaItems(int i, int i2, int i3);

    @Deprecated
    /* synthetic */ void next();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void pause();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void play();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void prepare();

    @Deprecated
    void prepare(InterfaceC1988i interfaceC1988i);

    @Deprecated
    void prepare(InterfaceC1988i interfaceC1988i, boolean z, boolean z2);

    @Deprecated
    /* synthetic */ void previous();

    /* synthetic */ void release();

    void removeAnalyticsListener(hk0 hk0Var);

    void removeAudioOffloadListener(InterfaceC1813b interfaceC1813b);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void removeListener(InterfaceC2026t.d dVar);

    /* synthetic */ void removeMediaItem(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void removeMediaItems(int i, int i2);

    /* synthetic */ void replaceMediaItem(int i, C1944n c1944n);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void replaceMediaItems(int i, int i2, List list);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekBack();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekForward();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekTo(int i, long j);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekTo(long j);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekToDefaultPosition();

    /* synthetic */ void seekToDefaultPosition(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekToNext();

    /* synthetic */ void seekToNextMediaItem();

    @Deprecated
    /* synthetic */ void seekToNextWindow();

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void seekToPrevious();

    /* synthetic */ void seekToPreviousMediaItem();

    @Deprecated
    /* synthetic */ void seekToPreviousWindow();

    void setAudioAttributes(C1841a c1841a, boolean z);

    void setAudioSessionId(int i);

    void setAuxEffectInfo(wj1 wj1Var);

    void setCameraMotionListener(gb4 gb4Var);

    @Deprecated
    /* synthetic */ void setDeviceMuted(boolean z);

    /* synthetic */ void setDeviceMuted(boolean z, int i);

    @Deprecated
    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i);

    /* synthetic */ void setDeviceVolume(@IntRange(from = 0) int i, int i2);

    void setForegroundMode(boolean z);

    void setHandleAudioBecomingNoisy(boolean z);

    /* synthetic */ void setMediaItem(C1944n c1944n);

    /* synthetic */ void setMediaItem(C1944n c1944n, long j);

    /* synthetic */ void setMediaItem(C1944n c1944n, boolean z);

    /* synthetic */ void setMediaItems(List list);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setMediaItems(List list, int i, long j);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setMediaItems(List list, boolean z);

    void setMediaSource(InterfaceC1988i interfaceC1988i);

    void setMediaSource(InterfaceC1988i interfaceC1988i, long j);

    void setMediaSource(InterfaceC1988i interfaceC1988i, boolean z);

    void setMediaSources(List<InterfaceC1988i> list);

    void setMediaSources(List<InterfaceC1988i> list, int i, long j);

    void setMediaSources(List<InterfaceC1988i> list, boolean z);

    void setPauseAtEndOfMediaItems(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setPlayWhenReady(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setPlaybackParameters(C1953s c1953s);

    /* synthetic */ void setPlaybackSpeed(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f);

    /* synthetic */ void setPlaylistMetadata(C1945o c1945o);

    @RequiresApi(23)
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setRepeatMode(int i);

    void setSeekParameters(@Nullable nke0 nke0Var);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setShuffleModeEnabled(boolean z);

    void setShuffleOrder(n8f0 n8f0Var);

    void setSkipSilenceEnabled(boolean z);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setTrackSelectionParameters(agj0 agj0Var);

    void setVideoChangeFrameRateStrategy(int i);

    @RequiresApi(18)
    void setVideoEffects(List<ype> list);

    void setVideoFrameMetadataListener(iel0 iel0Var);

    void setVideoScalingMode(int i);

    /* synthetic */ void setVideoSurface(@Nullable Surface surface);

    /* synthetic */ void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void setVideoTextureView(@Nullable TextureView textureView);

    /* synthetic */ void setVolume(@FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f);

    void setWakeMode(int i);

    @Override // com.google.android.exoplayer2.InterfaceC2026t
    /* synthetic */ void stop();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ExoPlayer$c */
    public static final class C1814c {

        /* JADX INFO: renamed from: A */
        public boolean f7019A;

        /* JADX INFO: renamed from: B */
        public boolean f7020B;

        /* JADX INFO: renamed from: C */
        @Nullable
        public Looper f7021C;

        /* JADX INFO: renamed from: D */
        public boolean f7022D;

        /* JADX INFO: renamed from: a */
        public final Context f7023a;

        /* JADX INFO: renamed from: b */
        public qa5 f7024b;

        /* JADX INFO: renamed from: c */
        public long f7025c;

        /* JADX INFO: renamed from: d */
        public b7h0<lzc0> f7026d;

        /* JADX INFO: renamed from: e */
        public b7h0<InterfaceC1988i.a> f7027e;

        /* JADX INFO: renamed from: f */
        public b7h0<cgj0> f7028f;

        /* JADX INFO: renamed from: g */
        public b7h0<ltv> f7029g;

        /* JADX INFO: renamed from: h */
        public b7h0<md2> f7030h;

        /* JADX INFO: renamed from: i */
        public adj<qa5, dk0> f7031i;

        /* JADX INFO: renamed from: j */
        public Looper f7032j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public PriorityTaskManager f7033k;

        /* JADX INFO: renamed from: l */
        public C1841a f7034l;

        /* JADX INFO: renamed from: m */
        public boolean f7035m;

        /* JADX INFO: renamed from: n */
        public int f7036n;

        /* JADX INFO: renamed from: o */
        public boolean f7037o;

        /* JADX INFO: renamed from: p */
        public boolean f7038p;

        /* JADX INFO: renamed from: q */
        public boolean f7039q;

        /* JADX INFO: renamed from: r */
        public int f7040r;

        /* JADX INFO: renamed from: s */
        public int f7041s;

        /* JADX INFO: renamed from: t */
        public boolean f7042t;

        /* JADX INFO: renamed from: u */
        public nke0 f7043u;

        /* JADX INFO: renamed from: v */
        public long f7044v;

        /* JADX INFO: renamed from: w */
        public long f7045w;

        /* JADX INFO: renamed from: x */
        public InterfaceC1896m f7046x;

        /* JADX INFO: renamed from: y */
        public long f7047y;

        /* JADX INFO: renamed from: z */
        public long f7048z;

        public C1814c(Context context, b7h0<lzc0> b7h0Var, b7h0<InterfaceC1988i.a> b7h0Var2, b7h0<cgj0> b7h0Var3, b7h0<ltv> b7h0Var4, b7h0<md2> b7h0Var5, adj<qa5, dk0> adjVar) {
            this.f7023a = (Context) w11.m204369e(context);
            this.f7026d = b7h0Var;
            this.f7027e = b7h0Var2;
            this.f7028f = b7h0Var3;
            this.f7029g = b7h0Var4;
            this.f7030h = b7h0Var5;
            this.f7031i = adjVar;
            this.f7032j = bmk0.m105099R();
            this.f7034l = C1841a.f7179g;
            this.f7036n = 0;
            this.f7040r = 1;
            this.f7041s = 0;
            this.f7042t = true;
            this.f7043u = nke0.f142453g;
            this.f7044v = Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
            this.f7045w = 15000L;
            this.f7046x = new C1889f.b().m10047a();
            this.f7024b = qa5.f156345a;
            this.f7047y = 500L;
            this.f7048z = 2000L;
            this.f7020B = true;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ lzc0 m9413a(Context context) {
            return new vrd(context);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ InterfaceC1988i.a m9414b(InterfaceC1988i.a aVar) {
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ cgj0 m9415c(cgj0 cgj0Var) {
            return cgj0Var;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceC1988i.a m9416d(Context context) {
            return new C1960d(context, new tod());
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ cgj0 m9418f(Context context) {
            return new atd(context);
        }

        /* JADX INFO: renamed from: g */
        public ExoPlayer m9419g() {
            w11.m204371g(!this.f7022D);
            this.f7022D = true;
            return new C1892i(this, null);
        }

        /* JADX INFO: renamed from: h */
        public C1814c m9420h(final InterfaceC1988i.a aVar) {
            w11.m204371g(!this.f7022D);
            w11.m204369e(aVar);
            this.f7027e = new b7h0() { // from class: l.z7f
                @Override // p153l.b7h0
                public final Object get() {
                    return ExoPlayer.C1814c.m9414b(aVar);
                }
            };
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1814c m9421i(final cgj0 cgj0Var) {
            w11.m204371g(!this.f7022D);
            w11.m204369e(cgj0Var);
            this.f7028f = new b7h0() { // from class: l.y7f
                @Override // p153l.b7h0
                public final Object get() {
                    return ExoPlayer.C1814c.m9415c(cgj0Var);
                }
            };
            return this;
        }

        public C1814c(final Context context, b7h0<lzc0> b7h0Var, b7h0<InterfaceC1988i.a> b7h0Var2) {
            this(context, b7h0Var, b7h0Var2, new b7h0() { // from class: l.a8f
                @Override // p153l.b7h0
                public final Object get() {
                    return ExoPlayer.C1814c.m9418f(context);
                }
            }, new b7h0() { // from class: l.b8f
                @Override // p153l.b7h0
                public final Object get() {
                    return new vpd();
                }
            }, new b7h0() { // from class: l.c8f
                @Override // p153l.b7h0
                public final Object get() {
                    return pmd.m172924n(context);
                }
            }, new adj() { // from class: l.d8f
                @Override // p153l.adj
                public final Object apply(Object obj) {
                    return new wld((qa5) obj);
                }
            });
        }

        public C1814c(final Context context) {
            this(context, new b7h0() { // from class: l.w7f
                @Override // p153l.b7h0
                public final Object get() {
                    return ExoPlayer.C1814c.m9413a(context);
                }
            }, new b7h0() { // from class: l.x7f
                @Override // p153l.b7h0
                public final Object get() {
                    return ExoPlayer.C1814c.m9416d(context);
                }
            });
        }
    }
}
