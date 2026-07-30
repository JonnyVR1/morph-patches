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
import com.google.android.exoplayer2.AbstractC1857c0;
import com.google.android.exoplayer2.C1861d0;
import com.google.android.exoplayer2.C1945o;
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
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ViewOnLayoutChangeListenerC2037a f9276a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final AspectRatioFrameLayout f9277b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final View f9278c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final View f9279d;

    /* JADX INFO: renamed from: e */
    public final boolean f9280e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final ImageView f9281f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public final SubtitleView f9282g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final View f9283h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final TextView f9284i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public final PlayerControlView f9285j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final FrameLayout f9286k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final FrameLayout f9287l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public InterfaceC2026t f9288m;

    /* JADX INFO: renamed from: n */
    public boolean f9289n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public PlayerControlView.InterfaceC2035e f9290o;

    /* JADX INFO: renamed from: p */
    public boolean f9291p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public Drawable f9292q;

    /* JADX INFO: renamed from: r */
    public int f9293r;

    /* JADX INFO: renamed from: s */
    public boolean f9294s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public CharSequence f9295t;

    /* JADX INFO: renamed from: u */
    public int f9296u;

    /* JADX INFO: renamed from: v */
    public boolean f9297v;

    /* JADX INFO: renamed from: w */
    public boolean f9298w;

    /* JADX INFO: renamed from: x */
    public boolean f9299x;

    /* JADX INFO: renamed from: y */
    public int f9300y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    public final class ViewOnLayoutChangeListenerC2037a implements InterfaceC2026t.d, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.InterfaceC2035e {

        /* JADX INFO: renamed from: a */
        public final AbstractC1857c0.b f9301a = new AbstractC1857c0.b();

        /* JADX INFO: renamed from: b */
        @Nullable
        public Object f9302b;

        public ViewOnLayoutChangeListenerC2037a() {
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: O */
        public void mo11817O(boolean z, int i) {
            PlayerView.this.m11964H();
            PlayerView.this.m11966J();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: U */
        public void mo11821U(int i) {
            PlayerView.this.m11964H();
            PlayerView.this.m11967K();
            PlayerView.this.m11966J();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: b0 */
        public void mo11824b0() {
            if (PlayerView.this.f9278c != null) {
                PlayerView.this.f9278c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: d */
        public void mo11825d(qyb qybVar) {
            if (PlayerView.this.f9282g != null) {
                PlayerView.this.f9282g.setCues(qybVar.f160131a);
            }
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: h0 */
        public void mo11828h0(C1861d0 c1861d0) {
            InterfaceC2026t interfaceC2026t = (InterfaceC2026t) w11.m204369e(PlayerView.this.f9288m);
            AbstractC1857c0 currentTimeline = interfaceC2026t.getCurrentTimeline();
            if (currentTimeline.m9776u()) {
                this.f9302b = null;
            } else if (interfaceC2026t.getCurrentTracks().m9842c()) {
                Object obj = this.f9302b;
                if (obj != null) {
                    int iMo9450f = currentTimeline.mo9450f(obj);
                    if (iMo9450f != -1) {
                        if (interfaceC2026t.getCurrentMediaItemIndex() == currentTimeline.m9770j(iMo9450f, this.f9301a).f7339c) {
                            return;
                        }
                    }
                    this.f9302b = null;
                }
            } else {
                this.f9302b = currentTimeline.mo9453k(interfaceC2026t.getCurrentPeriodIndex(), this.f9301a, true).f7338b;
            }
            PlayerView.this.m11968L(false);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.m11962F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m11955o((TextureView) view, PlayerView.this.f9300y);
        }

        @Override // com.google.android.exoplayer2.p031ui.PlayerControlView.InterfaceC2035e
        /* JADX INFO: renamed from: u */
        public void mo11934u(int i) {
            PlayerView.this.m11965I();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: x */
        public void mo11839x(zjl0 zjl0Var) {
            PlayerView.this.m11963G();
        }

        @Override // com.google.android.exoplayer2.InterfaceC2026t.d
        /* JADX INFO: renamed from: z */
        public void mo11840z(InterfaceC2026t.e eVar, InterfaceC2026t.e eVar2, int i) {
            if (PlayerView.this.m11976w() && PlayerView.this.f9298w) {
                PlayerView.this.m11974u();
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
        ViewOnLayoutChangeListenerC2037a viewOnLayoutChangeListenerC2037a = new ViewOnLayoutChangeListenerC2037a();
        this.f9276a = viewOnLayoutChangeListenerC2037a;
        if (isInEditMode()) {
            this.f9277b = null;
            this.f9278c = null;
            this.f9279d = null;
            this.f9280e = false;
            this.f9281f = null;
            this.f9282g = null;
            this.f9283h = null;
            this.f9284i = null;
            this.f9285j = null;
            this.f9286k = null;
            this.f9287l = null;
            ImageView imageView = new ImageView(context);
            if (bmk0.f77313a >= 23) {
                m11957r(context, getResources(), imageView);
            } else {
                m11956q(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = hfc0.f109270c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ygc0.f199751B, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(ygc0.f199761L);
                int color = typedArrayObtainStyledAttributes.getColor(ygc0.f199761L, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199757H, i8);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199763N, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ygc0.f199753D, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199764O, true);
                int i9 = typedArrayObtainStyledAttributes.getInt(ygc0.f199762M, 1);
                int i10 = typedArrayObtainStyledAttributes.getInt(ygc0.f199758I, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(ygc0.f199760K, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199755F, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199752C, true);
                integer = typedArrayObtainStyledAttributes.getInteger(ygc0.f199759J, 0);
                this.f9294s = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199756G, this.f9294s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(ygc0.f199754E, true);
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
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(lcc0.f131330i);
        this.f9277b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m11940B(aspectRatioFrameLayout, i3);
        }
        View viewFindViewById = findViewById(lcc0.f131315O);
        this.f9278c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f9279d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 != 2) {
                if (i4 == 3) {
                    try {
                        int i12 = SphericalGLSurfaceView.f9631m;
                        this.f9279d = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                        z8 = true;
                    } catch (Exception e) {
                        yzv.m218057a("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                        throw r5;
                    }
                } else if (i4 != 4) {
                    this.f9279d = new SurfaceView(context);
                } else {
                    try {
                        int i13 = VideoDecoderGLSurfaceView.f9614b;
                        this.f9279d = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        yzv.m218057a("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r5;
                    }
                }
                this.f9279d.setLayoutParams(layoutParams);
                this.f9279d.setOnClickListener(viewOnLayoutChangeListenerC2037a);
                this.f9279d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f9279d, 0);
                z7 = z8;
            } else {
                this.f9279d = new TextureView(context);
            }
            z8 = false;
            this.f9279d.setLayoutParams(layoutParams);
            this.f9279d.setOnClickListener(viewOnLayoutChangeListenerC2037a);
            this.f9279d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f9279d, 0);
            z7 = z8;
        }
        this.f9280e = z7;
        this.f9286k = (FrameLayout) findViewById(lcc0.f131322a);
        this.f9287l = (FrameLayout) findViewById(lcc0.f131301A);
        ImageView imageView2 = (ImageView) findViewById(lcc0.f131323b);
        this.f9281f = imageView2;
        this.f9291p = z4 && imageView2 != null;
        if (i6 != 0) {
            this.f9292q = j26.m143192e(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(lcc0.f131318R);
        this.f9282g = subtitleView;
        if (subtitleView != null) {
            subtitleView.m12095d();
            subtitleView.m12096e();
        }
        View viewFindViewById2 = findViewById(lcc0.f131327f);
        this.f9283h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f9293r = integer;
        TextView textView = (TextView) findViewById(lcc0.f131335n);
        this.f9284i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(lcc0.f131331j);
        View viewFindViewById3 = findViewById(lcc0.f131332k);
        if (playerControlView != null) {
            this.f9285j = playerControlView;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f9285j = playerControlView2;
            playerControlView2.setId(lcc0.f131331j);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i7 = 0;
            this.f9285j = null;
        }
        PlayerControlView playerControlView3 = this.f9285j;
        this.f9296u = playerControlView3 != null ? i2 : i7;
        this.f9299x = z3;
        this.f9297v = z;
        this.f9298w = z2;
        this.f9289n = (!z5 || playerControlView3 == null) ? i7 : 1;
        if (playerControlView3 != null) {
            playerControlView3.m11911A();
            this.f9285j.m11928w(viewOnLayoutChangeListenerC2037a);
        }
        if (z5) {
            setClickable(true);
        }
        m11965I();
    }

    /* JADX INFO: renamed from: B */
    public static void m11940B(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m11955o(TextureView textureView, int i) {
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
    public static void m11956q(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(bmk0.m105109W(context, resources, zbc0.f203645f));
        imageView.setBackgroundColor(resources.getColor(u9c0.f178110a));
    }

    @RequiresApi(23)
    /* JADX INFO: renamed from: r */
    public static void m11957r(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(bmk0.m105109W(context, resources, zbc0.f203645f));
        imageView.setBackgroundColor(resources.getColor(u9c0.f178110a, null));
    }

    @RequiresNonNull({"artworkView"})
    /* JADX INFO: renamed from: A */
    public final boolean m11958A(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m11978y(this.f9277b, intrinsicWidth / intrinsicHeight);
                this.f9281f.setImageDrawable(drawable);
                this.f9281f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m11959C() {
        InterfaceC2026t interfaceC2026t = this.f9288m;
        if (interfaceC2026t == null) {
            return true;
        }
        int playbackState = interfaceC2026t.getPlaybackState();
        if (this.f9297v) {
            return playbackState == 1 || playbackState == 4 || !this.f9288m.getPlayWhenReady();
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public void m11960D() {
        m11961E(m11959C());
    }

    /* JADX INFO: renamed from: E */
    public final void m11961E(boolean z) {
        if (m11970N()) {
            this.f9285j.setShowTimeoutMs(z ? 0 : this.f9296u);
            this.f9285j.m11919J();
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m11962F() {
        if (!m11970N() || this.f9288m == null) {
            return;
        }
        if (!this.f9285j.m11913D()) {
            m11977x(true);
        } else if (this.f9299x) {
            this.f9285j.m11911A();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m11963G() {
        InterfaceC2026t interfaceC2026t = this.f9288m;
        zjl0 videoSize = interfaceC2026t != null ? interfaceC2026t.getVideoSize() : zjl0.f204676e;
        int i = videoSize.f204682a;
        int i2 = videoSize.f204683b;
        int i3 = videoSize.f204684c;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.f204685d) / i2;
        View view = this.f9279d;
        if (view instanceof TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.f9300y != 0) {
                view.removeOnLayoutChangeListener(this.f9276a);
            }
            this.f9300y = i3;
            if (i3 != 0) {
                this.f9279d.addOnLayoutChangeListener(this.f9276a);
            }
            m11955o((TextureView) this.f9279d, this.f9300y);
        }
        m11978y(this.f9277b, this.f9280e ? 0.0f : f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: H */
    public final void m11964H() {
        boolean z;
        if (this.f9283h != null) {
            InterfaceC2026t interfaceC2026t = this.f9288m;
            if (interfaceC2026t == null || interfaceC2026t.getPlaybackState() != 2) {
                z = false;
            } else {
                int i = this.f9293r;
                z = true;
                if (i != 2 && (i != 1 || !this.f9288m.getPlayWhenReady())) {
                    z = false;
                }
            }
            this.f9283h.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m11965I() {
        PlayerControlView playerControlView = this.f9285j;
        if (playerControlView == null || !this.f9289n) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.f9299x ? getResources().getString(R$string.f9312e) : null);
        } else {
            setContentDescription(getResources().getString(R$string.f9319l));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m11966J() {
        if (m11976w() && this.f9298w) {
            m11974u();
        } else {
            m11977x(false);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m11967K() {
        TextView textView = this.f9284i;
        if (textView != null) {
            CharSequence charSequence = this.f9295t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f9284i.setVisibility(0);
            } else {
                InterfaceC2026t interfaceC2026t = this.f9288m;
                if (interfaceC2026t != null) {
                    interfaceC2026t.getPlayerError();
                }
                this.f9284i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m11968L(boolean z) {
        InterfaceC2026t interfaceC2026t = this.f9288m;
        if (interfaceC2026t == null || !interfaceC2026t.isCommandAvailable(30) || interfaceC2026t.getCurrentTracks().m9842c()) {
            if (this.f9294s) {
                return;
            }
            m11973t();
            m11971p();
            return;
        }
        if (z && !this.f9294s) {
            m11971p();
        }
        if (interfaceC2026t.getCurrentTracks().m9843d(2)) {
            m11973t();
            return;
        }
        m11971p();
        if (m11969M() && (m11979z(interfaceC2026t.getMediaMetadata()) || m11958A(this.f9292q))) {
            return;
        }
        m11973t();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    /* JADX INFO: renamed from: M */
    public final boolean m11969M() {
        if (!this.f9291p) {
            return false;
        }
        w11.m204373i(this.f9281f);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* JADX INFO: renamed from: N */
    public final boolean m11970N() {
        if (!this.f9289n) {
            return false;
        }
        w11.m204373i(this.f9285j);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC2026t interfaceC2026t = this.f9288m;
        if (interfaceC2026t != null && interfaceC2026t.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zM11975v = m11975v(keyEvent.getKeyCode());
        if (zM11975v && m11970N() && !this.f9285j.m11913D()) {
            m11977x(true);
            return true;
        }
        if (m11972s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            m11977x(true);
            return true;
        }
        if (zM11975v && m11970N()) {
            m11977x(true);
        }
        return false;
    }

    public List<o70> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f9287l;
        if (frameLayout != null) {
            arrayList.add(new o70(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f9285j;
        if (playerControlView != null) {
            arrayList.add(new o70(playerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) w11.m204374j(this.f9286k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f9297v;
    }

    public boolean getControllerHideOnTouch() {
        return this.f9299x;
    }

    public int getControllerShowTimeoutMs() {
        return this.f9296u;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.f9292q;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.f9287l;
    }

    @Nullable
    public InterfaceC2026t getPlayer() {
        return this.f9288m;
    }

    public int getResizeMode() {
        w11.m204373i(this.f9277b);
        return this.f9277b.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.f9282g;
    }

    public boolean getUseArtwork() {
        return this.f9291p;
    }

    public boolean getUseController() {
        return this.f9289n;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.f9279d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m11970N() || this.f9288m == null) {
            return false;
        }
        m11977x(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m11971p() {
        View view = this.f9278c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        m11962F();
        return super.performClick();
    }

    /* JADX INFO: renamed from: s */
    public boolean m11972s(KeyEvent keyEvent) {
        return m11970N() && this.f9285j.m11929y(keyEvent);
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.InterfaceC2029b interfaceC2029b) {
        w11.m204373i(this.f9277b);
        this.f9277b.setAspectRatioListener(interfaceC2029b);
    }

    public void setControllerAutoShow(boolean z) {
        this.f9297v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f9298w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9299x = z;
        m11965I();
    }

    public void setControllerShowTimeoutMs(int i) {
        w11.m204373i(this.f9285j);
        this.f9296u = i;
        if (this.f9285j.m11913D()) {
            m11960D();
        }
    }

    public void setControllerVisibilityListener(@Nullable PlayerControlView.InterfaceC2035e interfaceC2035e) {
        w11.m204373i(this.f9285j);
        PlayerControlView.InterfaceC2035e interfaceC2035e2 = this.f9290o;
        if (interfaceC2035e2 == interfaceC2035e) {
            return;
        }
        if (interfaceC2035e2 != null) {
            this.f9285j.m11914E(interfaceC2035e2);
        }
        this.f9290o = interfaceC2035e;
        if (interfaceC2035e != null) {
            this.f9285j.m11928w(interfaceC2035e);
        }
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        w11.m204371g(this.f9284i != null);
        this.f9295t = charSequence;
        m11967K();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.f9292q != drawable) {
            this.f9292q = drawable;
            m11968L(false);
        }
    }

    public void setErrorMessageProvider(@Nullable e3f<? super PlaybackException> e3fVar) {
        if (e3fVar != null) {
            m11967K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f9294s != z) {
            this.f9294s = z;
            m11968L(false);
        }
    }

    public void setPlayer(@Nullable InterfaceC2026t interfaceC2026t) {
        w11.m204371g(Looper.myLooper() == Looper.getMainLooper());
        w11.m204365a(interfaceC2026t == null || interfaceC2026t.getApplicationLooper() == Looper.getMainLooper());
        InterfaceC2026t interfaceC2026t2 = this.f9288m;
        if (interfaceC2026t2 == interfaceC2026t) {
            return;
        }
        if (interfaceC2026t2 != null) {
            interfaceC2026t2.removeListener(this.f9276a);
            if (interfaceC2026t2.isCommandAvailable(27)) {
                View view = this.f9279d;
                if (view instanceof TextureView) {
                    interfaceC2026t2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC2026t2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f9282g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f9288m = interfaceC2026t;
        if (m11970N()) {
            this.f9285j.setPlayer(interfaceC2026t);
        }
        m11964H();
        m11967K();
        m11968L(true);
        if (interfaceC2026t == null) {
            m11974u();
            return;
        }
        if (interfaceC2026t.isCommandAvailable(27)) {
            View view2 = this.f9279d;
            if (view2 instanceof TextureView) {
                interfaceC2026t.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                interfaceC2026t.setVideoSurfaceView((SurfaceView) view2);
            }
            m11963G();
        }
        if (this.f9282g != null && interfaceC2026t.isCommandAvailable(28)) {
            this.f9282g.setCues(interfaceC2026t.getCurrentCues().f160131a);
        }
        interfaceC2026t.addListener(this.f9276a);
        m11977x(false);
    }

    public void setRepeatToggleModes(int i) {
        w11.m204373i(this.f9285j);
        this.f9285j.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        w11.m204373i(this.f9277b);
        this.f9277b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f9293r != i) {
            this.f9293r = i;
            m11964H();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        w11.m204373i(this.f9285j);
        this.f9285j.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f9278c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        w11.m204371g((z && this.f9281f == null) ? false : true);
        if (this.f9291p != z) {
            this.f9291p = z;
            m11968L(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        w11.m204371g((z && this.f9285j == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.f9289n == z) {
            return;
        }
        this.f9289n = z;
        boolean zM11970N = m11970N();
        PlayerControlView playerControlView = this.f9285j;
        if (zM11970N) {
            playerControlView.setPlayer(this.f9288m);
        } else if (playerControlView != null) {
            playerControlView.m11911A();
            this.f9285j.setPlayer(null);
        }
        m11965I();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f9279d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m11973t() {
        ImageView imageView = this.f9281f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f9281f.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11974u() {
        PlayerControlView playerControlView = this.f9285j;
        if (playerControlView != null) {
            playerControlView.m11911A();
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: v */
    public final boolean m11975v(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m11976w() {
        InterfaceC2026t interfaceC2026t = this.f9288m;
        return interfaceC2026t != null && interfaceC2026t.isPlayingAd() && this.f9288m.getPlayWhenReady();
    }

    /* JADX INFO: renamed from: x */
    public final void m11977x(boolean z) {
        if (!(m11976w() && this.f9298w) && m11970N()) {
            boolean z2 = this.f9285j.m11913D() && this.f9285j.getShowTimeoutMs() <= 0;
            boolean zM11959C = m11959C();
            if (z || z2 || zM11959C) {
                m11961E(zM11959C);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m11978y(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    @RequiresNonNull({"artworkView"})
    /* JADX INFO: renamed from: z */
    public final boolean m11979z(C1945o c1945o) {
        byte[] bArr = c1945o.f8188j;
        if (bArr == null) {
            return false;
        }
        return m11958A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
