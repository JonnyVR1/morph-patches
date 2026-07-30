package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p031ui.StyledPlayerView;
import com.google.android.exoplayer2.source.C1960d;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J/\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'¨\u0006)"}, m88121d2 = {"Ll/z9f;", "Ll/gtm;", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "buffering", "playerReady", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "a", "()Landroid/view/View;", "", "play", "setPlayWhenReady", "(Z)V", "pause", "Landroid/graphics/drawable/Drawable;", "artworkAsset", "e", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "", "b", "()F", "c", "ctx", "", "uriString", "isMediaAudio", "isMediaVideo", "f", "(Landroid/content/Context;Ljava/lang/String;ZZ)V", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "videoSurfaceView", "Lcom/google/android/exoplayer2/ExoPlayer;", "Lcom/google/android/exoplayer2/ExoPlayer;", GameIdentity.player, "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class z9f implements gtm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private StyledPlayerView videoSurfaceView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: l.z9f$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/z9f$a", "Ll/baf;", "", "playbackState", "", "U", "(I)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C21782a extends baf {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function0<Unit> f203476a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ z9f f203477b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ExoPlayer f203478c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Function0<Unit> f203479d;

        public C21782a(Function0<Unit> function0, z9f z9fVar, ExoPlayer exoPlayer, Function0<Unit> function1) {
            this.f203476a = function0;
            this.f203477b = z9fVar;
            this.f203478c = exoPlayer;
            this.f203479d = function1;
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: U */
        public void mo11821U(int playbackState) {
            if (playbackState == 2) {
                this.f203476a.invoke();
                return;
            }
            if (playbackState == 3) {
                this.f203479d.invoke();
                return;
            }
            if (playbackState == 4 && this.f203477b.player != null) {
                this.f203478c.seekTo(0L);
                this.f203478c.setPlayWhenReady(false);
                StyledPlayerView styledPlayerView = this.f203477b.videoSurfaceView;
                if (styledPlayerView != null) {
                    styledPlayerView.showController();
                }
            }
        }
    }

    @Override // p153l.gtm
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo132245a() {
        StyledPlayerView styledPlayerView = this.videoSurfaceView;
        styledPlayerView.getClass();
        return styledPlayerView;
    }

    @Override // p153l.gtm
    /* JADX INFO: renamed from: b */
    public float mo132246b() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 0.0f;
    }

    @Override // p153l.gtm
    /* JADX INFO: renamed from: c */
    public void mo132247c() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            float fMo132246b = mo132246b();
            if (fMo132246b > 0.0f) {
                exoPlayer.setVolume(0.0f);
            } else if (fMo132246b == 0.0f) {
                exoPlayer.setVolume(1.0f);
            }
        }
    }

    @Override // p153l.gtm
    /* JADX INFO: renamed from: d */
    public void mo132248d(@NotNull Context context, @NotNull Function0<Unit> buffering, @NotNull Function0<Unit> playerReady) {
        context.getClass();
        buffering.getClass();
        playerReady.getClass();
        if (this.player != null) {
            return;
        }
        atd atdVar = new atd(context, new k80.C18117b());
        pmd pmdVarM172930a = new pmd.C19401b(context).m172930a();
        pmdVarM172930a.getClass();
        String strM105163q0 = bmk0.m105163q0(context, context.getPackageName());
        strM105163q0.getClass();
        kpd.C18234b c18234bM150709c = new kpd.C18234b().m150710d(strM105163q0).m150709c(pmdVarM172930a);
        c18234bM150709c.getClass();
        ExoPlayer exoPlayerM9419g = new ExoPlayer.C1814c(context).m9421i(atdVar).m9420h(new C1960d(new vnd.C20866a(context, c18234bM150709c))).m9419g();
        exoPlayerM9419g.setVolume(0.0f);
        exoPlayerM9419g.addListener(new C21782a(buffering, this, exoPlayerM9419g, playerReady));
        this.player = exoPlayerM9419g;
    }

    @Override // p153l.gtm
    /* JADX INFO: renamed from: e */
    public void mo132249e(@NotNull Context context, @NotNull Function0<? extends Drawable> artworkAsset) {
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

    @Override // p153l.gtm
    /* JADX INFO: renamed from: f */
    public void mo132250f(@NotNull Context ctx, @NotNull String uriString, boolean isMediaAudio, boolean isMediaVideo) {
        ctx.getClass();
        uriString.getClass();
        StyledPlayerView styledPlayerView = this.videoSurfaceView;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            C1944n c1944nM10679d = C1944n.m10679d(uriString);
            c1944nM10679d.getClass();
            exoPlayer.setMediaItem(c1944nM10679d);
            exoPlayer.prepare();
            if (!isMediaAudio) {
                if (isMediaVideo) {
                    exoPlayer.setPlayWhenReady(true);
                    exoPlayer.setVolume(mo132246b());
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

    @Override // p153l.gtm
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.player = null;
        this.videoSurfaceView = null;
    }

    @Override // p153l.gtm
    public void setPlayWhenReady(boolean play) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(play);
        }
    }
}
