package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.R$string;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p030ui.StyledPlayerView;
import com.google.android.exoplayer2.source.C1937d;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J2\u0010\u001a\u001a\u00020\u00062!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u001d\u0010\u001e\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010.R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00103¨\u00065"}, m87232d2 = {"Ll/u8f;", "Ll/nqm;", "<init>", "()V", "", "isFullScreen", "", "m", "(Z)V", "Landroid/content/Context;", "context", "", "url", "e", "(Landroid/content/Context;Ljava/lang/String;)V", "isTablet", RXScreenCaptureService.KEY_INDEX, "(Landroid/content/Context;Z)V", "play", "b", Constants.INAPP_DATA_TAG, "pause", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "onClick", "h", "(Lkotlin/jvm/functions/Function1;)V", "g", "Lkotlin/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)V", "f", "Landroid/view/View;", "a", "()Landroid/view/View;", "Lcom/google/android/exoplayer2/ExoPlayer;", "Lcom/google/android/exoplayer2/ExoPlayer;", GameIdentity.player, "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "Lcom/google/android/exoplayer2/ui/StyledPlayerView;", "playerView", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "playerViewLayoutParamsNormal", "Landroid/widget/FrameLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "playerViewLayoutParamsFullScreen", "Z", "isMuted", "", "J", "mediaPosition", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class u8f implements nqm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ExoPlayer player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private StyledPlayerView playerView;

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
    public static void m192190j(u8f u8fVar, ImageButton imageButton, ImageButton imageButton2, View view) {
        u8fVar.getClass();
        imageButton.getClass();
        boolean z = u8fVar.isMuted;
        u8fVar.isMuted = !z;
        ExoPlayer exoPlayer = u8fVar.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(!z ? 0.0f : 1.0f);
        }
        boolean z2 = u8fVar.isMuted;
        int i = z2 ? q3c0.f152408i : q3c0.f152410k;
        int i2 = z2 ? R$string.f4834l : R$string.f4828f;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
        if (imageButton2 != null) {
            imageButton2.setImageResource(i);
        }
        if (imageButton2 != null) {
            imageButton2.setContentDescription(imageButton.getContentDescription());
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m192191k(Function0 function0, View view) {
        function0.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: l */
    public static void m192192l(Function1 function1, boolean z) {
        function1.getClass();
        function1.invoke(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: m */
    private final void m192193m(boolean isFullScreen) {
        ImageButton imageButton;
        ImageButton imageButton2;
        int i = isFullScreen ? t3c0.f167617h : t3c0.f167616g;
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null && (imageButton2 = (ImageButton) styledPlayerView.findViewById(c4c0.f79251u)) != null) {
            imageButton2.setImageResource(i);
        }
        StyledPlayerView styledPlayerView2 = this.playerView;
        if (styledPlayerView2 == null || (imageButton = (ImageButton) styledPlayerView2.findViewById(c4c0.f79253v)) == null) {
            return;
        }
        imageButton.setImageResource(i);
    }

    @Override // p149l.nqm
    @NotNull
    /* JADX INFO: renamed from: a */
    public View mo160625a() {
        StyledPlayerView styledPlayerView = this.playerView;
        styledPlayerView.getClass();
        return styledPlayerView;
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: b */
    public void mo160626b() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: c */
    public void mo160627c(@NotNull final Function0<Unit> onClick) {
        ImageButton imageButton;
        onClick.getClass();
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView == null || (imageButton = (ImageButton) styledPlayerView.findViewById(c4c0.f79235m)) == null) {
            return;
        }
        imageButton.setVisibility(0);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.s8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8f.m192191k(onClick, view);
            }
        });
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: d */
    public void mo160628d() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        this.mediaPosition = exoPlayer.getCurrentPosition();
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
        this.playerView = null;
        exoPlayer.setPlayWhenReady(false);
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: e */
    public void mo160629e(@NotNull Context context, @NotNull String url) {
        context.getClass();
        url.getClass();
        if (this.player != null) {
            return;
        }
        jld jldVarM142066a = new jld.C17812b(context).m142066a();
        jldVarM142066a.getClass();
        lrd lrdVar = new lrd(context, new o80.C18870b());
        String strM197885q0 = vck0.m197885q0(context, context.getPackageName());
        strM197885q0.getClass();
        fod.C16893b c16893bM122447c = new fod.C16893b().m122448d(strM197885q0).m122447c(jldVarM142066a.mo120878g());
        c16893bM122447c.getClass();
        qmd.C19539a c19539a = new qmd.C19539a(context, c16893bM122447c);
        C1921n c1921nM10625d = C1921n.m10625d(url);
        c1921nM10625d.getClass();
        ExoPlayer exoPlayerM9365g = new ExoPlayer.C1791c(context).m9367i(lrdVar).m9366h(new C1937d(c19539a)).m9365g();
        exoPlayerM9365g.setMediaItem(c1921nM10625d);
        exoPlayerM9365g.prepare();
        exoPlayerM9365g.setRepeatMode(1);
        exoPlayerM9365g.setVolume(0.0f);
        exoPlayerM9365g.seekTo(this.mediaPosition);
        this.player = exoPlayerM9365g;
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: f */
    public void mo160630f(boolean isFullScreen) {
        StyledPlayerView styledPlayerView = this.playerView;
        if (isFullScreen) {
            styledPlayerView.getClass();
            this.playerViewLayoutParamsNormal = styledPlayerView.getLayoutParams();
            StyledPlayerView styledPlayerView2 = this.playerView;
            styledPlayerView2.getClass();
            styledPlayerView2.setLayoutParams(this.playerViewLayoutParamsFullScreen);
        } else {
            styledPlayerView.getClass();
            styledPlayerView.setLayoutParams(this.playerViewLayoutParamsNormal);
        }
        m192193m(isFullScreen);
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: g */
    public void mo160631g() {
        final ImageButton imageButton;
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView == null || (imageButton = (ImageButton) styledPlayerView.findViewById(c4c0.f79257x)) == null) {
            return;
        }
        StyledPlayerView styledPlayerView2 = this.playerView;
        final ImageButton imageButton2 = styledPlayerView2 != null ? (ImageButton) styledPlayerView2.findViewById(c4c0.f79255w) : null;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.r8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8f.m192190j(this.f158211a, imageButton, imageButton2, view);
            }
        };
        imageButton.setOnClickListener(onClickListener);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(onClickListener);
        }
        boolean z = this.isMuted;
        int i = z ? q3c0.f152408i : q3c0.f152410k;
        int i2 = z ? R$string.f4834l : R$string.f4828f;
        imageButton.setImageResource(i);
        imageButton.setContentDescription(imageButton.getContext().getString(i2));
        if (imageButton2 != null) {
            imageButton2.setImageResource(i);
        }
        if (imageButton2 != null) {
            imageButton2.setContentDescription(imageButton.getContentDescription());
        }
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: h */
    public void mo160632h(@NotNull final Function1<? super Boolean, Unit> onClick) {
        onClick.getClass();
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null) {
            styledPlayerView.setFullscreenButtonClickListener(new StyledPlayerView.InterfaceC2030c() { // from class: l.q8f
                @Override // com.google.android.exoplayer2.p030ui.StyledPlayerView.InterfaceC2030c
                /* JADX INFO: renamed from: a */
                public final void mo12037a(boolean z) {
                    u8f.m192192l(onClick, z);
                }
            });
        }
        m192193m(false);
    }

    @Override // p149l.nqm
    /* JADX INFO: renamed from: i */
    public void mo160633i(@NotNull Context context, boolean isTablet) {
        context.getClass();
        if (this.playerView != null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(a7c0.f67892a, (ViewGroup) null);
        viewInflate.getClass();
        StyledPlayerView styledPlayerView = (StyledPlayerView) viewInflate;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.playerViewLayoutParamsNormal = layoutParams;
        styledPlayerView.setLayoutParams(layoutParams);
        styledPlayerView.setShowBuffering(1);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setDefaultArtwork(ywc0.m216334e(context.getResources(), q3c0.f152400a, null));
        this.playerView = styledPlayerView;
    }

    @Override // p149l.nqm
    public void pause() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
            this.player = null;
        }
    }

    @Override // p149l.nqm
    public void play() {
        StyledPlayerView styledPlayerView = this.playerView;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setVisibility(0);
            styledPlayerView.setPlayer(this.player);
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(true);
        }
    }
}
