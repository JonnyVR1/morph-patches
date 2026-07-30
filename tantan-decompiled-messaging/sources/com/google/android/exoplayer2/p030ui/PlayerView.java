package com.google.android.exoplayer2.p030ui;

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
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC1834c0;
import com.google.android.exoplayer2.C1838d0;
import com.google.android.exoplayer2.C1922o;
import com.google.android.exoplayer2.InterfaceC2003t;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p149l.byv;
import p149l.cxb;
import p149l.d7c0;
import p149l.e16;
import p149l.f4c0;
import p149l.o1c0;
import p149l.p11;
import p149l.s70;
import p149l.t3c0;
import p149l.t8c0;
import p149l.val0;
import p149l.vck0;
import p149l.z1f;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ViewOnLayoutChangeListenerC2014a f9239a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final AspectRatioFrameLayout f9240b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final View f9241c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f9242d;

    /* JADX INFO: renamed from: e */
    public final boolean f9243e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ImageView f9244f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final SubtitleView f9245g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final View f9246h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final TextView f9247i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final PlayerControlView f9248j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final FrameLayout f9249k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final FrameLayout f9250l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC2003t f9251m;

    /* JADX INFO: renamed from: n */
    public boolean f9252n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public PlayerControlView.InterfaceC2012e f9253o;

    /* JADX INFO: renamed from: p */
    public boolean f9254p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public Drawable f9255q;

    /* JADX INFO: renamed from: r */
    public int f9256r;

    /* JADX INFO: renamed from: s */
    public boolean f9257s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public CharSequence f9258t;

    /* JADX INFO: renamed from: u */
    public int f9259u;

    /* JADX INFO: renamed from: v */
    public boolean f9260v;

    /* JADX INFO: renamed from: w */
    public boolean f9261w;

    /* JADX INFO: renamed from: x */
    public boolean f9262x;

    /* JADX INFO: renamed from: y */
    public int f9263y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    public final class ViewOnLayoutChangeListenerC2014a implements InterfaceC2003t.d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.InterfaceC2012e {

        /* JADX INFO: renamed from: a */
        public final AbstractC1834c0.b f9264a = new AbstractC1834c0.b();

        /* JADX INFO: renamed from: b */
        @Nullable
        public Object f9265b;

        public ViewOnLayoutChangeListenerC2014a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: O */
        public void mo11763O(boolean z, int i) {
            PlayerView.this.m11910H();
            PlayerView.this.m11912J();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: U */
        public void mo11767U(int i) {
            PlayerView.this.m11910H();
            PlayerView.this.m11913K();
            PlayerView.this.m11912J();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: b0 */
        public void mo11770b0() {
            if (PlayerView.this.f9241c != null) {
                PlayerView.this.f9241c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: d */
        public void mo11771d(cxb cxbVar) {
            if (PlayerView.this.f9245g != null) {
                PlayerView.this.f9245g.setCues(cxbVar.f82866a);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: h0 */
        public void mo11774h0(C1838d0 c1838d0) {
            InterfaceC2003t interfaceC2003t = (InterfaceC2003t) p11.m167011e(PlayerView.this.f9251m);
            AbstractC1834c0 currentTimeline = interfaceC2003t.getCurrentTimeline();
            if (currentTimeline.m9722u()) {
                this.f9265b = null;
            } else if (interfaceC2003t.getCurrentTracks().m9788c()) {
                Object obj = this.f9265b;
                if (obj != null) {
                    int iMo9396f = currentTimeline.mo9396f(obj);
                    if (iMo9396f != -1) {
                        if (interfaceC2003t.getCurrentMediaItemIndex() == currentTimeline.m9716j(iMo9396f, this.f9264a).f7302c) {
                            return;
                        }
                    }
                    this.f9265b = null;
                }
            } else {
                this.f9265b = currentTimeline.mo9399k(interfaceC2003t.getCurrentPeriodIndex(), this.f9264a, true).f7301b;
            }
            PlayerView.this.m11914L(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.m11908F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m11901o((TextureView) view, PlayerView.this.f9263y);
        }

        @Override // com.google.android.exoplayer2.p030ui.PlayerControlView.InterfaceC2012e
        /* JADX INFO: renamed from: u */
        public void mo11880u(int i) {
            PlayerView.this.m11911I();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: x */
        public void mo11785x(val0 val0Var) {
            PlayerView.this.m11909G();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2003t.d
        /* JADX INFO: renamed from: z */
        public void mo11786z(InterfaceC2003t.e eVar, InterfaceC2003t.e eVar2, int i) {
            if (PlayerView.this.m11922w() && PlayerView.this.f9261w) {
                PlayerView.this.m11920u();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        int i3;
        int integer;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7;
        boolean z8;
        super(context, attributeSet, i);
        ViewOnLayoutChangeListenerC2014a viewOnLayoutChangeListenerC2014a = new ViewOnLayoutChangeListenerC2014a();
        this.f9239a = viewOnLayoutChangeListenerC2014a;
        if (isInEditMode()) {
            this.f9240b = null;
            this.f9241c = null;
            this.f9242d = null;
            this.f9243e = false;
            this.f9244f = null;
            this.f9245g = null;
            this.f9246h = null;
            this.f9247i = null;
            this.f9248j = null;
            this.f9249k = null;
            this.f9250l = null;
            ImageView imageView = new ImageView(context);
            if (vck0.f180948a >= 23) {
                m11903r(context, getResources(), imageView);
            } else {
                m11902q(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = d7c0.f84728c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t8c0.f168820B, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(t8c0.f168830L);
                int color = typedArrayObtainStyledAttributes.getColor(t8c0.f168830L, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(t8c0.f168826H, i8);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168832N, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(t8c0.f168822D, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168833O, true);
                int i9 = typedArrayObtainStyledAttributes.getInt(t8c0.f168831M, 1);
                int i10 = typedArrayObtainStyledAttributes.getInt(t8c0.f168827I, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(t8c0.f168829K, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168824F, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168821C, true);
                integer = typedArrayObtainStyledAttributes.getInteger(t8c0.f168828J, 0);
                this.f9257s = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168825G, this.f9257s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(t8c0.f168823E, true);
                typedArrayObtainStyledAttributes.recycle();
                i8 = resourceId;
                i2 = i11;
                z2 = z13;
                z3 = z11;
                z = z12;
                i3 = i10;
                z6 = zHasValue;
                i4 = i9;
                z5 = z10;
                i6 = resourceId2;
                z4 = z9;
                i5 = color;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            integer = 0;
            z2 = true;
            z3 = true;
            i4 = 1;
            i5 = 0;
            z4 = true;
            i6 = 0;
            z5 = true;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(f4c0.f94785i);
        this.f9240b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m11886B(aspectRatioFrameLayout, i3);
        }
        View viewFindViewById = findViewById(f4c0.f94770O);
        this.f9241c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f9242d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 != 2) {
                if (i4 == 3) {
                    try {
                        int i12 = SphericalGLSurfaceView.f9594m;
                        this.f9242d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z8 = true;
                    } catch (Exception e) {
                        byv.m104511a("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                        throw r5;
                    }
                } else if (i4 != 4) {
                    this.f9242d = new SurfaceView(context);
                } else {
                    try {
                        int i13 = VideoDecoderGLSurfaceView.f9577b;
                        this.f9242d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        byv.m104511a("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r5;
                    }
                }
                this.f9242d.setLayoutParams(layoutParams);
                this.f9242d.setOnClickListener(viewOnLayoutChangeListenerC2014a);
                this.f9242d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f9242d, 0);
                z7 = z8;
            } else {
                this.f9242d = new TextureView(context);
            }
            z8 = false;
            this.f9242d.setLayoutParams(layoutParams);
            this.f9242d.setOnClickListener(viewOnLayoutChangeListenerC2014a);
            this.f9242d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f9242d, 0);
            z7 = z8;
        }
        this.f9243e = z7;
        this.f9249k = (FrameLayout) findViewById(f4c0.f94777a);
        this.f9250l = (FrameLayout) findViewById(f4c0.f94756A);
        ImageView imageView2 = (ImageView) findViewById(f4c0.f94778b);
        this.f9244f = imageView2;
        this.f9254p = z4 && imageView2 != null;
        if (i6 != 0) {
            this.f9255q = e16.m114377e(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(f4c0.f94773R);
        this.f9245g = subtitleView;
        if (subtitleView != null) {
            subtitleView.m12041d();
            subtitleView.m12042e();
        }
        View viewFindViewById2 = findViewById(f4c0.f94782f);
        this.f9246h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f9256r = integer;
        TextView textView = (TextView) findViewById(f4c0.f94790n);
        this.f9247i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(f4c0.f94786j);
        View viewFindViewById3 = findViewById(f4c0.f94787k);
        if (playerControlView != null) {
            this.f9248j = playerControlView;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f9248j = playerControlView2;
            playerControlView2.setId(f4c0.f94786j);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i7 = 0;
            this.f9248j = null;
        }
        PlayerControlView playerControlView3 = this.f9248j;
        this.f9259u = playerControlView3 != null ? i2 : i7;
        this.f9262x = z3;
        this.f9260v = z;
        this.f9261w = z2;
        this.f9252n = (!z5 || playerControlView3 == null) ? i7 : 1;
        if (playerControlView3 != null) {
            playerControlView3.m11857A();
            this.f9248j.m11874w(viewOnLayoutChangeListenerC2014a);
        }
        if (z5) {
            setClickable(true);
        }
        m11911I();
    }

    /* JADX INFO: renamed from: B */
    public static void m11886B(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m11901o(TextureView textureView, int i) {
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

    /* JADX INFO: renamed from: q */
    public static void m11902q(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(vck0.m197831W(context, resources, t3c0.f167615f));
        imageView.setBackgroundColor(resources.getColor(o1c0.f141422a));
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: r */
    public static void m11903r(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(vck0.m197831W(context, resources, t3c0.f167615f));
        imageView.setBackgroundColor(resources.getColor(o1c0.f141422a, null));
    }

    @RequiresNonNull({"artworkView"})
    /* JADX INFO: renamed from: A */
    public final boolean m11904A(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m11924y(this.f9240b, intrinsicWidth / intrinsicHeight);
                this.f9244f.setImageDrawable(drawable);
                this.f9244f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m11905C() {
        InterfaceC2003t interfaceC2003t = this.f9251m;
        if (interfaceC2003t == null) {
            return true;
        }
        int playbackState = interfaceC2003t.getPlaybackState();
        if (this.f9260v) {
            return playbackState == 1 || playbackState == 4 || !this.f9251m.getPlayWhenReady();
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public void m11906D() {
        m11907E(m11905C());
    }

    /* JADX INFO: renamed from: E */
    public final void m11907E(boolean z) {
        if (m11916N()) {
            this.f9248j.setShowTimeoutMs(z ? 0 : this.f9259u);
            this.f9248j.m11865J();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11908F() {
        if (!m11916N() || this.f9251m == null) {
            return;
        }
        if (!this.f9248j.m11859D()) {
            m11923x(true);
        } else if (this.f9262x) {
            this.f9248j.m11857A();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11909G() {
        InterfaceC2003t interfaceC2003t = this.f9251m;
        val0 videoSize = interfaceC2003t != null ? interfaceC2003t.getVideoSize() : val0.f180759e;
        int i = videoSize.f180765a;
        int i2 = videoSize.f180766b;
        int i3 = videoSize.f180767c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.f180768d) / i2;
        View view = this.f9242d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.f9263y != 0) {
                view.removeOnLayoutChangeListener(this.f9239a);
            }
            this.f9263y = i3;
            if (i3 != 0) {
                this.f9242d.addOnLayoutChangeListener(this.f9239a);
            }
            m11901o((TextureView) this.f9242d, this.f9263y);
        }
        m11924y(this.f9240b, this.f9243e ? 0.0f : f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: H */
    public final void m11910H() {
        boolean z;
        if (this.f9246h != null) {
            InterfaceC2003t interfaceC2003t = this.f9251m;
            if (interfaceC2003t == null || interfaceC2003t.getPlaybackState() != 2) {
                z = false;
            } else {
                int i = this.f9256r;
                z = true;
                if (i != 2 && (i != 1 || !this.f9251m.getPlayWhenReady())) {
                    z = false;
                }
            }
            this.f9246h.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m11911I() {
        PlayerControlView playerControlView = this.f9248j;
        if (playerControlView == null || !this.f9252n) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f9262x ? getResources().getString(R$string.f9275e) : null);
        } else {
            setContentDescription(getResources().getString(R$string.f9282l));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11912J() {
        if (m11922w() && this.f9261w) {
            m11920u();
        } else {
            m11923x(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m11913K() {
        TextView textView = this.f9247i;
        if (textView != null) {
            CharSequence charSequence = this.f9258t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f9247i.setVisibility(0);
            } else {
                InterfaceC2003t interfaceC2003t = this.f9251m;
                if (interfaceC2003t != null) {
                    interfaceC2003t.getPlayerError();
                }
                this.f9247i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m11914L(boolean z) {
        InterfaceC2003t interfaceC2003t = this.f9251m;
        if (interfaceC2003t == null || !interfaceC2003t.isCommandAvailable(30) || interfaceC2003t.getCurrentTracks().m9788c()) {
            if (this.f9257s) {
                return;
            }
            m11919t();
            m11917p();
            return;
        }
        if (z && !this.f9257s) {
            m11917p();
        }
        if (interfaceC2003t.getCurrentTracks().m9789d(2)) {
            m11919t();
            return;
        }
        m11917p();
        if (m11915M() && (m11925z(interfaceC2003t.getMediaMetadata()) || m11904A(this.f9255q))) {
            return;
        }
        m11919t();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    /* JADX INFO: renamed from: M */
    public final boolean m11915M() {
        if (!this.f9254p) {
            return false;
        }
        p11.m167015i(this.f9244f);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: N */
    public final boolean m11916N() {
        if (!this.f9252n) {
            return false;
        }
        p11.m167015i(this.f9248j);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2003t interfaceC2003t = this.f9251m;
        if (interfaceC2003t != null && interfaceC2003t.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zM11921v = m11921v(keyEvent.getKeyCode());
        if (zM11921v && m11916N() && !this.f9248j.m11859D()) {
            m11923x(true);
            return true;
        }
        if (m11918s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m11923x(true);
            return true;
        }
        if (zM11921v && m11916N()) {
            m11923x(true);
        }
        return false;
    }

    public List<s70> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f9250l;
        if (frameLayout != null) {
            arrayList.add(new s70(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f9248j;
        if (playerControlView != null) {
            arrayList.add(new s70(playerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) p11.m167016j(this.f9249k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f9260v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f9262x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f9259u;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f9255q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f9250l;
    }

    @Nullable
    public InterfaceC2003t getPlayer() {
        return this.f9251m;
    }

    public int getResizeMode() {
        p11.m167015i(this.f9240b);
        return this.f9240b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f9245g;
    }

    public boolean getUseArtwork() {
        return this.f9254p;
    }

    public boolean getUseController() {
        return this.f9252n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f9242d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m11916N() || this.f9251m == null) {
            return false;
        }
        m11923x(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m11917p() {
        View view = this.f9241c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        m11908F();
        return super.performClick();
    }

    /* JADX INFO: renamed from: s */
    public boolean m11918s(KeyEvent keyEvent) {
        return m11916N() && this.f9248j.m11875y(keyEvent);
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.InterfaceC2006b interfaceC2006b) {
        p11.m167015i(this.f9240b);
        this.f9240b.setAspectRatioListener(interfaceC2006b);
    }

    public void setControllerAutoShow(boolean z) {
        this.f9260v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f9261w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9262x = z;
        m11911I();
    }

    public void setControllerShowTimeoutMs(int i) {
        p11.m167015i(this.f9248j);
        this.f9259u = i;
        if (this.f9248j.m11859D()) {
            m11906D();
        }
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.InterfaceC2012e interfaceC2012e) {
        p11.m167015i(this.f9248j);
        PlayerControlView.InterfaceC2012e interfaceC2012e2 = this.f9253o;
        if (interfaceC2012e2 == interfaceC2012e) {
            return;
        }
        if (interfaceC2012e2 != null) {
            this.f9248j.m11860E(interfaceC2012e2);
        }
        this.f9253o = interfaceC2012e;
        if (interfaceC2012e != null) {
            this.f9248j.m11874w(interfaceC2012e);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        p11.m167013g(this.f9247i != null);
        this.f9258t = charSequence;
        m11913K();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f9255q != drawable) {
            this.f9255q = drawable;
            m11914L(false);
        }
    }

    public void setErrorMessageProvider(@Nullable z1f<? super PlaybackException> z1fVar) {
        if (z1fVar != null) {
            m11913K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f9257s != z) {
            this.f9257s = z;
            m11914L(false);
        }
    }

    public void setPlayer(@Nullable InterfaceC2003t interfaceC2003t) {
        p11.m167013g(Looper.myLooper() == Looper.getMainLooper());
        p11.m167007a(interfaceC2003t == null || interfaceC2003t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2003t interfaceC2003t2 = this.f9251m;
        if (interfaceC2003t2 == interfaceC2003t) {
            return;
        }
        if (interfaceC2003t2 != null) {
            interfaceC2003t2.removeListener(this.f9239a);
            if (interfaceC2003t2.isCommandAvailable(27)) {
                View view = this.f9242d;
                if (view instanceof TextureView) {
                    interfaceC2003t2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC2003t2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f9245g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f9251m = interfaceC2003t;
        if (m11916N()) {
            this.f9248j.setPlayer(interfaceC2003t);
        }
        m11910H();
        m11913K();
        m11914L(true);
        if (interfaceC2003t == null) {
            m11920u();
            return;
        }
        if (interfaceC2003t.isCommandAvailable(27)) {
            View view2 = this.f9242d;
            if (view2 instanceof TextureView) {
                interfaceC2003t.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC2003t.setVideoSurfaceView((SurfaceView) view2);
            }
            m11909G();
        }
        if (this.f9245g != null && interfaceC2003t.isCommandAvailable(28)) {
            this.f9245g.setCues(interfaceC2003t.getCurrentCues().f82866a);
        }
        interfaceC2003t.addListener(this.f9239a);
        m11923x(false);
    }

    public void setRepeatToggleModes(int i) {
        p11.m167015i(this.f9248j);
        this.f9248j.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        p11.m167015i(this.f9240b);
        this.f9240b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f9256r != i) {
            this.f9256r = i;
            m11910H();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        p11.m167015i(this.f9248j);
        this.f9248j.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f9241c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        p11.m167013g((z && this.f9244f == null) ? false : true);
        if (this.f9254p != z) {
            this.f9254p = z;
            m11914L(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        p11.m167013g((z && this.f9248j == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.f9252n == z) {
            return;
        }
        this.f9252n = z;
        boolean zM11916N = m11916N();
        PlayerControlView playerControlView = this.f9248j;
        if (zM11916N) {
            playerControlView.setPlayer(this.f9251m);
        } else if (playerControlView != null) {
            playerControlView.m11857A();
            this.f9248j.setPlayer(null);
        }
        m11911I();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f9242d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m11919t() {
        ImageView imageView = this.f9244f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f9244f.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11920u() {
        PlayerControlView playerControlView = this.f9248j;
        if (playerControlView != null) {
            playerControlView.m11857A();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: v */
    public final boolean m11921v(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11922w() {
        InterfaceC2003t interfaceC2003t = this.f9251m;
        return interfaceC2003t != null && interfaceC2003t.isPlayingAd() && this.f9251m.getPlayWhenReady();
    }

    /* JADX INFO: renamed from: x */
    public final void m11923x(boolean z) {
        if (!(m11922w() && this.f9261w) && m11916N()) {
            boolean z2 = this.f9248j.m11859D() && this.f9248j.getShowTimeoutMs() <= 0;
            boolean zM11905C = m11905C();
            if (z || z2 || zM11905C) {
                m11907E(zM11905C);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11924y(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    @RequiresNonNull({"artworkView"})
    /* JADX INFO: renamed from: z */
    public final boolean m11925z(C1922o c1922o) {
        byte[] bArr = c1922o.f8151j;
        if (bArr == null) {
            return false;
        }
        return m11904A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
