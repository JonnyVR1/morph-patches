package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p030ui.StyledPlayerView;
import com.google.android.exoplayer2.source.C1937d;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J/\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'¨\u0006)"}, m87232d2 = {"Ll/t8f;", "Ll/erm;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "buffering", "playerReady", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "a", "()Landroid/view/View;", "", "play", "setPlayWhenReady", "(Z)V", "pause", "Landroid/graphics/drawable/Drawable;", "artworkAsset", "e", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "", "b", "()F", "c", "ctx", "", "uriString", "isMediaAudio", "isMediaVideo", "f", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "videoSurfaceView", "Lcom/google/android/exoplayer2/ExoPlayer;", "Lcom/google/android/exoplayer2/ExoPlayer;", GameIdentity.player, "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class t8f implements erm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private StyledPlayerView videoSurfaceView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: l.t8f$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/t8f$a", "Ll/v8f;", "", "playbackState", "", "U", "(I)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C20130a extends v8f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0<Unit> f168908a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ t8f f168909b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ExoPlayer f168910c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function0<Unit> f168911d;

        public C20130a(Function0<Unit> function0, t8f t8fVar, ExoPlayer exoPlayer, Function0<Unit> function1) {
            this.f168908a = function0;
            this.f168909b = t8fVar;
            this.f168910c = exoPlayer;
            this.f168911d = function1;
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: U */
        public void mo11767U(int playbackState) {
            if (playbackState == 2) {
                this.f168908a.invoke();
                return;
            }
            if (playbackState == 3) {
                this.f168911d.invoke();
                return;
            }
            if (playbackState == 4 && this.f168909b.player != null) {
                this.f168910c.seekTo(0L);
                this.f168910c.setPlayWhenReady(false);
                StyledPlayerView styledPlayerView = this.f168909b.videoSurfaceView;
                if (styledPlayerView != null) {
                    styledPlayerView.showController();
                }
            }
        }
    }

    @Override // p149l.erm
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo117848a() {
        StyledPlayerView styledPlayerView = this.videoSurfaceView;
        styledPlayerView.getClass();
        return styledPlayerView;
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
        lrd lrdVar = new lrd(context, new o80.C18870b());
        jld jldVarM142066a = new jld.C17812b(context).m142066a();
        jldVarM142066a.getClass();
        String strM197885q0 = vck0.m197885q0(context, context.getPackageName());
        strM197885q0.getClass();
        fod.C16893b c16893bM122447c = new fod.C16893b().m122448d(strM197885q0).m122447c(jldVarM142066a);
        c16893bM122447c.getClass();
        ExoPlayer exoPlayerM9365g = new ExoPlayer.C1791c(context).m9367i(lrdVar).m9366h(new C1937d(new qmd.C19539a(context, c16893bM122447c))).m9365g();
        exoPlayerM9365g.setVolume(0.0f);
        exoPlayerM9365g.addListener(new C20130a(buffering, this, exoPlayerM9365g, playerReady));
        this.player = exoPlayerM9365g;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: e */
    public void mo117852e(@NotNull Context context, @NotNull Function0<? extends Drawable> artworkAsset) {
        context.getClass();
        artworkAsset.getClass();
        if (this.videoSurfaceView != null) {
            return;
        }
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setBackgroundColor(0);
        styledPlayerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setDefaultArtwork(artworkAsset.invoke());
        styledPlayerView.setUseController(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setPlayer(this.player);
        this.videoSurfaceView = styledPlayerView;
    }

    @Override // p149l.erm
    /* JADX INFO: renamed from: f */
    public void mo117853f(@NotNull Context ctx, @NotNull String uriString, boolean isMediaAudio, boolean isMediaVideo) {
        ctx.getClass();
        uriString.getClass();
        StyledPlayerView styledPlayerView = this.videoSurfaceView;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            C1921n c1921nM10625d = C1921n.m10625d(uriString);
            c1921nM10625d.getClass();
            exoPlayer.setMediaItem(c1921nM10625d);
            exoPlayer.prepare();
            if (!isMediaAudio) {
                if (isMediaVideo) {
                    exoPlayer.setPlayWhenReady(true);
                    exoPlayer.setVolume(mo117849b());
                    return;
                }
                return;
            }
            StyledPlayerView styledPlayerView2 = this.videoSurfaceView;
            if (styledPlayerView2 != null) {
                styledPlayerView2.showController();
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
