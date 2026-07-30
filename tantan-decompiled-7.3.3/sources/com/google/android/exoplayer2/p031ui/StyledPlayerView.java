package com.google.android.exoplayer2.p031ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.InterfaceC2026t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p153l.bmk0;
import p153l.e3f;
import p153l.hfc0;
import p153l.j26;
import p153l.lcc0;
import p153l.o70;
import p153l.qyb;
import p153l.u9c0;
import p153l.w11;
import p153l.ygc0;
import p153l.yzv;
import p153l.zbc0;
import p153l.zjl0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class StyledPlayerView extends FrameLayout {
    public static final int ARTWORK_DISPLAY_MODE_FILL = 2;
    public static final int ARTWORK_DISPLAY_MODE_FIT = 1;
    public static final int ARTWORK_DISPLAY_MODE_OFF = 0;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;

    @Nullable
    private final FrameLayout adOverlayFrameLayout;
    private int artworkDisplayMode;

    @Nullable
    private final ImageView artworkView;

    @Nullable
    private final View bufferingView;
    private final ViewOnLayoutChangeListenerC2051a componentListener;

    @Nullable
    private final AspectRatioFrameLayout contentFrame;

    @Nullable
    private final StyledPlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;

    @Nullable
    private InterfaceC2052b controllerVisibilityListener;

    @Nullable
    private CharSequence customErrorMessage;

    @Nullable
    private Drawable defaultArtwork;

    @Nullable
    private e3f<? super PlaybackException> errorMessageProvider;

    @Nullable
    private final TextView errorMessageView;

    @Nullable
    private InterfaceC2053c fullscreenButtonClickListener;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;

    @Nullable
    private StyledPlayerControlView.InterfaceC2050m legacyControllerVisibilityListener;

    @Nullable
    private final FrameLayout overlayFrameLayout;

    @Nullable
    private InterfaceC2026t player;
    private int showBuffering;

    @Nullable
    private final View shutterView;

    @Nullable
    private final SubtitleView subtitleView;

    @Nullable
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useController;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$a */
    public final class ViewOnLayoutChangeListenerC2051a implements InterfaceC2026t.d, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.InterfaceC2050m, StyledPlayerControlView.InterfaceC2041d {

        /* JADX INFO: renamed from: a */
        public final AbstractC1857c0.b f9429a = new AbstractC1857c0.b();

        /* JADX INFO: renamed from: b */
        @Nullable
        public Object f9430b;

        public ViewOnLayoutChangeListenerC2051a() {
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.InterfaceC2041d
        /* JADX INFO: renamed from: L */
        public void mo12067L(boolean z) {
            if (StyledPlayerView.this.fullscreenButtonClickListener != null) {
                StyledPlayerView.this.fullscreenButtonClickListener.mo12091a(z);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: O */
        public void mo11817O(boolean z, int i) {
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: U */
        public void mo11821U(int i) {
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateErrorMessage();
            StyledPlayerView.this.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: b0 */
        public void mo11824b0() {
            if (StyledPlayerView.this.shutterView != null) {
                StyledPlayerView.this.shutterView.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: d */
        public void mo11825d(qyb qybVar) {
            if (StyledPlayerView.this.subtitleView != null) {
                StyledPlayerView.this.subtitleView.setCues(qybVar.f160131a);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: h0 */
        public void mo11828h0(C1861d0 c1861d0) {
            InterfaceC2026t interfaceC2026t = (InterfaceC2026t) w11.m204369e(StyledPlayerView.this.player);
            AbstractC1857c0 currentTimeline = interfaceC2026t.isCommandAvailable(17) ? interfaceC2026t.getCurrentTimeline() : AbstractC1857c0.f7326a;
            if (currentTimeline.m9776u()) {
                this.f9430b = null;
            } else if (!interfaceC2026t.isCommandAvailable(30) || interfaceC2026t.getCurrentTracks().m9842c()) {
                Object obj = this.f9430b;
                if (obj != null) {
                    int iMo9450f = currentTimeline.mo9450f(obj);
                    if (iMo9450f != -1) {
                        if (interfaceC2026t.getCurrentMediaItemIndex() == currentTimeline.m9770j(iMo9450f, this.f9429a).f7339c) {
                            return;
                        }
                    }
                    this.f9430b = null;
                }
            } else {
                this.f9430b = currentTimeline.mo9453k(interfaceC2026t.getCurrentPeriodIndex(), this.f9429a, true).f7338b;
            }
            StyledPlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.toggleControllerVisibility();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StyledPlayerView.applyTextureViewRotation((TextureView) view, StyledPlayerView.this.textureViewRotation);
        }

        @Override // com.google.android.exoplayer2.p031ui.StyledPlayerControlView.InterfaceC2050m
        /* JADX INFO: renamed from: u */
        public void mo12089u(int i) {
            StyledPlayerView.this.updateContentDescription();
            if (StyledPlayerView.this.controllerVisibilityListener != null) {
                StyledPlayerView.this.controllerVisibilityListener.m12090a(i);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: x */
        public void mo11839x(zjl0 zjl0Var) {
            if (zjl0Var.equals(zjl0.f204676e) || StyledPlayerView.this.player == null || StyledPlayerView.this.player.getPlaybackState() == 1) {
                return;
            }
            StyledPlayerView.this.updateAspectRatio();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: z */
        public void mo11840z(InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, int i) {
            if (StyledPlayerView.this.isPlayingAd() && StyledPlayerView.this.controllerHideDuringAds) {
                StyledPlayerView.this.hideController();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$b */
    public interface InterfaceC2052b {
        /* JADX INFO: renamed from: a */
        void m12090a(int i);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.StyledPlayerView$c */
    public interface InterfaceC2053c {
        /* JADX INFO: renamed from: a */
        void mo12091a(boolean z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i9;
        super(context, attributeSet, i);
        ViewOnLayoutChangeListenerC2051a viewOnLayoutChangeListenerC2051a = new ViewOnLayoutChangeListenerC2051a();
        this.componentListener = viewOnLayoutChangeListenerC2051a;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context);
            if (bmk0.f77313a >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i10 = hfc0.f109272e;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ygc0.f199781c0, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(ygc0.f199803n0);
                int color = typedArrayObtainStyledAttributes.getColor(ygc0.f199803n0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199795j0, i10);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199807p0, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(ygc0.f199783d0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199787f0, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199809q0, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(ygc0.f199805o0, 1);
                int i13 = typedArrayObtainStyledAttributes.getInt(ygc0.f199797k0, 0);
                int i14 = typedArrayObtainStyledAttributes.getInt(ygc0.f199801m0, 5000);
                z2 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199791h0, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199785e0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(ygc0.f199799l0, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199793i0, this.keepContentOnPlayerReset);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199789g0, true);
                typedArrayObtainStyledAttributes.recycle();
                z = z10;
                i4 = integer;
                z6 = zHasValue;
                i5 = i13;
                z3 = z11;
                i10 = resourceId;
                i2 = i14;
                i3 = i12;
                z5 = z9;
                i8 = i11;
                i7 = color;
                i6 = resourceId2;
                z4 = z8;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 1;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            z4 = true;
            i8 = 1;
            z5 = true;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(lcc0.f131330i);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i5);
        }
        View viewFindViewById = findViewById(lcc0.f131315O);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout == null || i3 == 0) {
            this.surfaceView = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i3 != 2) {
                if (i3 == 3) {
                    try {
                        int i15 = SphericalGLSurfaceView.f9631m;
                        this.surfaceView = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        yzv.m218057a("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                        throw r5;
                    }
                } else if (i3 != 4) {
                    this.surfaceView = new SurfaceView(context);
                } else {
                    try {
                        int i16 = VideoDecoderGLSurfaceView.f9614b;
                        this.surfaceView = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        yzv.m218057a("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r5;
                    }
                }
                this.surfaceView.setLayoutParams(layoutParams);
                this.surfaceView.setOnClickListener(viewOnLayoutChangeListenerC2051a);
                this.surfaceView.setClickable(false);
                aspectRatioFrameLayout.addView(this.surfaceView, 0);
            } else {
                this.surfaceView = new TextureView(context);
            }
            z7 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(viewOnLayoutChangeListenerC2051a);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(lcc0.f131322a);
        this.overlayFrameLayout = (FrameLayout) findViewById(lcc0.f131301A);
        ImageView imageView2 = (ImageView) findViewById(lcc0.f131323b);
        this.artworkView = imageView2;
        this.artworkDisplayMode = (!z4 || i8 == 0 || imageView2 == null) ? 0 : i8;
        if (i6 != 0) {
            this.defaultArtwork = j26.m143192e(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(lcc0.f131318R);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.m12095d();
            subtitleView.m12096e();
        }
        View viewFindViewById2 = findViewById(lcc0.f131327f);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i4;
        TextView textView = (TextView) findViewById(lcc0.f131335n);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(lcc0.f131331j);
        View viewFindViewById3 = findViewById(lcc0.f131332k);
        if (styledPlayerControlView != null) {
            this.controller = styledPlayerControlView;
            i9 = 0;
        } else if (viewFindViewById3 != null) {
            i9 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.controller = styledPlayerControlView2;
            styledPlayerControlView2.setId(lcc0.f131331j);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i9 = 0;
            this.controller = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.controller;
        this.controllerShowTimeoutMs = styledPlayerControlView3 != null ? i2 : i9;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z;
        this.controllerHideDuringAds = z3;
        this.useController = (!z5 || styledPlayerControlView3 == null) ? i9 : 1;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.m12037Y();
            this.controller.m12032R(viewOnLayoutChangeListenerC2051a);
        }
        if (z5) {
            setClickable(true);
        }
        updateContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(bmk0.m105109W(context, resources, zbc0.f203645f));
        imageView.setBackgroundColor(resources.getColor(u9c0.f178110a));
    }

    @RequiresApi(23)
    private static void configureEditModeLogoV23(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(bmk0.m105109W(context, resources, zbc0.f203645f));
        imageView.setBackgroundColor(resources.getColor(u9c0.f178110a, null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        InterfaceC2026t interfaceC2026t = this.player;
        return interfaceC2026t != null && interfaceC2026t.isCommandAvailable(16) && this.player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    private void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.m12039b0() && this.controller.getShowTimeoutMs() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    private boolean setArtworkFromMediaMetadata(InterfaceC2026t interfaceC2026t) {
        byte[] bArr;
        if (interfaceC2026t.isCommandAvailable(18) && (bArr = interfaceC2026t.getMediaMetadata().f8188j) != null) {
            return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    @RequiresNonNull({"artworkView"})
    private boolean setDrawableArtwork(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.artworkDisplayMode == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                onContentAspectRatioChanged(this.contentFrame, width);
                this.artworkView.setScaleType(scaleType);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean shouldShowControllerIndefinitely() {
        InterfaceC2026t interfaceC2026t = this.player;
        if (interfaceC2026t == null) {
            return true;
        }
        int playbackState = interfaceC2026t.getPlaybackState();
        if (!this.controllerAutoShow) {
            return false;
        }
        if (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().m9776u()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((InterfaceC2026t) w11.m204369e(this.player)).getPlayWhenReady();
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.m12050n0();
        }
    }

    public static void switchTargetView(InterfaceC2026t interfaceC2026t, @Nullable StyledPlayerView styledPlayerView, @Nullable StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(interfaceC2026t);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.m12039b0()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.m12036X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        InterfaceC2026t interfaceC2026t = this.player;
        zjl0 videoSize = interfaceC2026t != null ? interfaceC2026t.getVideoSize() : zjl0.f204676e;
        int i = videoSize.f204682a;
        int i2 = videoSize.f204683b;
        int i3 = videoSize.f204684c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.f204685d) / i2;
        View view = this.surfaceView;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i3;
            if (i3 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void updateBuffering() {
        boolean z;
        if (this.bufferingView != null) {
            InterfaceC2026t interfaceC2026t = this.player;
            if (interfaceC2026t == null || interfaceC2026t.getPlaybackState() != 2) {
                z = false;
            } else {
                int i = this.showBuffering;
                z = true;
                if (i != 2 && (i != 1 || !this.player.getPlayWhenReady())) {
                    z = false;
                }
            }
            this.bufferingView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (styledPlayerControlView.m12039b0()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R$string.f9312e) : null);
        } else {
            setContentDescription(getResources().getString(R$string.f9319l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
            } else {
                InterfaceC2026t interfaceC2026t = this.player;
                if (interfaceC2026t != null) {
                    interfaceC2026t.getPlayerError();
                }
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        InterfaceC2026t interfaceC2026t = this.player;
        if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(30) || interfaceC2026t.getCurrentTracks().m9842c()) {
            if (this.keepContentOnPlayerReset) {
                return;
            }
            hideArtwork();
            closeShutter();
            return;
        }
        if (z && !this.keepContentOnPlayerReset) {
            closeShutter();
        }
        if (interfaceC2026t.getCurrentTracks().m9843d(2)) {
            hideArtwork();
            return;
        }
        closeShutter();
        if (useArtwork() && (setArtworkFromMediaMetadata(interfaceC2026t) || setDrawableArtwork(this.defaultArtwork))) {
            return;
        }
        hideArtwork();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean useArtwork() {
        if (this.artworkDisplayMode == 0) {
            return false;
        }
        w11.m204373i(this.artworkView);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        w11.m204373i(this.controller);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2026t interfaceC2026t = this.player;
        if (interfaceC2026t != null && interfaceC2026t.isCommandAvailable(16) && this.player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.m12039b0()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (zIsDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.m12033T(keyEvent);
    }

    public List<o70> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            arrayList.add(new o70(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView != null) {
            arrayList.add(new o70(styledPlayerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) w11.m204374j(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.artworkDisplayMode;
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    @Nullable
    public InterfaceC2026t getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        w11.m204373i(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.artworkDisplayMode != 0;
    }

    public boolean getUseController() {
        return this.useController;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.m12036X();
        }
    }

    public boolean isControllerFullyVisible() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        return styledPlayerControlView != null && styledPlayerControlView.m12039b0();
    }

    public void onContentAspectRatioChanged(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        w11.m204371g(i == 0 || this.artworkView != null);
        if (this.artworkDisplayMode != i) {
            this.artworkDisplayMode = i;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.InterfaceC2029b interfaceC2029b) {
        w11.m204373i(this.contentFrame);
        this.contentFrame.setAspectRatioListener(interfaceC2029b);
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        w11.m204373i(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.InterfaceC2041d interfaceC2041d) {
        w11.m204373i(this.controller);
        this.fullscreenButtonClickListener = null;
        this.controller.setOnFullScreenModeChangedListener(interfaceC2041d);
    }

    public void setControllerShowTimeoutMs(int i) {
        w11.m204373i(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.m12039b0()) {
            showController();
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.InterfaceC2050m interfaceC2050m) {
        w11.m204373i(this.controller);
        StyledPlayerControlView.InterfaceC2050m interfaceC2050m2 = this.legacyControllerVisibilityListener;
        if (interfaceC2050m2 == interfaceC2050m) {
            return;
        }
        if (interfaceC2050m2 != null) {
            this.controller.m12045i0(interfaceC2050m2);
        }
        this.legacyControllerVisibilityListener = interfaceC2050m;
        if (interfaceC2050m != null) {
            this.controller.m12032R(interfaceC2050m);
            setControllerVisibilityListener((InterfaceC2052b) null);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        w11.m204371g(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(@Nullable e3f<? super PlaybackException> e3fVar) {
        if (e3fVar != null) {
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        w11.m204373i(this.controller);
        this.controller.m12048l0(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(@Nullable InterfaceC2053c interfaceC2053c) {
        w11.m204373i(this.controller);
        this.fullscreenButtonClickListener = interfaceC2053c;
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setPlayer(@Nullable InterfaceC2026t interfaceC2026t) {
        w11.m204371g(Looper.myLooper() == Looper.getMainLooper());
        w11.m204365a(interfaceC2026t == null || interfaceC2026t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2026t interfaceC2026t2 = this.player;
        if (interfaceC2026t2 == interfaceC2026t) {
            return;
        }
        if (interfaceC2026t2 != null) {
            interfaceC2026t2.removeListener(this.componentListener);
            if (interfaceC2026t2.isCommandAvailable(27)) {
                View view = this.surfaceView;
                if (view instanceof TextureView) {
                    interfaceC2026t2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC2026t2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = interfaceC2026t;
        if (useController()) {
            this.controller.setPlayer(interfaceC2026t);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (interfaceC2026t == null) {
            hideController();
            return;
        }
        if (interfaceC2026t.isCommandAvailable(27)) {
            View view2 = this.surfaceView;
            if (view2 instanceof TextureView) {
                interfaceC2026t.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC2026t.setVideoSurfaceView((SurfaceView) view2);
            }
            if (!interfaceC2026t.isCommandAvailable(30) || interfaceC2026t.getCurrentTracks().m9844e(2)) {
                updateAspectRatio();
            }
        }
        if (this.subtitleView != null && interfaceC2026t.isCommandAvailable(28)) {
            this.subtitleView.setCues(interfaceC2026t.getCurrentCues().f160131a);
        }
        interfaceC2026t.addListener(this.componentListener);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i) {
        w11.m204373i(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        w11.m204373i(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        w11.m204373i(this.controller);
        this.controller.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        w11.m204371g((z && this.controller == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        boolean zUseController = useController();
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (zUseController) {
            styledPlayerControlView.setPlayer(this.player);
        } else if (styledPlayerControlView != null) {
            styledPlayerControlView.m12036X();
            this.controller.setPlayer(null);
        }
        updateContentDescription();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void setControllerVisibilityListener(@Nullable InterfaceC2052b interfaceC2052b) {
        this.controllerVisibilityListener = interfaceC2052b;
        if (interfaceC2052b != null) {
            setControllerVisibilityListener((StyledPlayerControlView.InterfaceC2050m) null);
        }
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }
}
