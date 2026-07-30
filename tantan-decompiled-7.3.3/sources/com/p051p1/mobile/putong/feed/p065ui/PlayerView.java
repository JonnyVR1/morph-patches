package com.p051p1.mobile.putong.feed.p065ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p151v.AutoVDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.hdc0;
import p153l.ie80;
import p153l.k9c0;
import p153l.nh80;
import p153l.o1j0;
import p153l.qa00;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f44443a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f44444b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f44445c;

    /* JADX INFO: renamed from: d */
    public VLinear f44446d;

    /* JADX INFO: renamed from: e */
    public VText f44447e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f44448f;

    /* JADX INFO: renamed from: g */
    public VText f44449g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f44450h;

    /* JADX INFO: renamed from: i */
    public ImageView f44451i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f44452j;

    /* JADX INFO: renamed from: k */
    public C11565c f44453k;

    /* JADX INFO: renamed from: l */
    public final Set<ie80.InterfaceC17710b> f44454l;

    /* JADX INFO: renamed from: m */
    public Surface f44455m;

    /* JADX INFO: renamed from: n */
    public Video f44456n;

    /* JADX INFO: renamed from: o */
    public boolean f44457o;

    /* JADX INFO: renamed from: p */
    public ie80 f44458p;

    /* JADX INFO: renamed from: q */
    public boolean f44459q;

    /* JADX INFO: renamed from: r */
    public boolean f44460r;

    /* JADX INFO: renamed from: s */
    public boolean f44461s;

    /* JADX INFO: renamed from: t */
    public boolean f44462t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f44463u;

    /* JADX INFO: renamed from: v */
    public Runnable f44464v;

    /* JADX INFO: renamed from: w */
    public Runnable f44465w;

    /* JADX INFO: renamed from: x */
    public int f44466x;

    /* JADX INFO: renamed from: y */
    public boolean f44467y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC11563a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11563a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f44455m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f44464v);
            if (NullChecker.m82486a(PlayerView.this.f44465w)) {
                PlayerView playerView2 = PlayerView.this;
                playerView2.removeCallbacks(playerView2.f44465w);
            }
            Matrix matrix = new Matrix();
            PlayerView.this.f44443a.getTransform(matrix);
            PlayerView.this.f44443a.setTransform(matrix);
            if (PlayerView.this.m67748D()) {
                PlayerView.this.m67756N();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m67759R();
            PlayerView.this.f44455m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(PlayerView.this.f44458p) && PlayerView.this.m67748D()) {
                PlayerView.this.f44458p.mo139593c();
                if (PlayerView.this.f44444b.getAlpha() == 1.0f || PlayerView.this.f44450h.getAlpha() == 1.0f) {
                    PlayerView.this.f44458p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$b */
    public class C11564b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f44469a;

        public C11564b(float f) {
            this.f44469a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f44469a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$c */
    public class C11565c implements ie80.InterfaceC17709a {
        public C11565c() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            PlayerView.this.m67759R();
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            if (PlayerView.this.f44459q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f44456n.duration) * PlayerView.this.f44445c.getMax());
                PlayerView.this.f44445c.setProgress(max);
                PlayerView.this.f44448f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f44447e.setText(playerView.m67747B(i));
            }
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            PlayerView.this.m67746A(hdc0.f108838H0);
            if (PlayerView.this.f44450h.getAlpha() < 1.0f) {
                PlayerView.this.f44450h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            PlayerView.this.f44457o = false;
            PlayerView.this.m67746A(hdc0.f108955q1);
            PlayerView.this.f44450h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f44444b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f44459q) {
                PlayerView.this.f44445c.setProgress(0);
                PlayerView.this.f44448f.setProgress(0);
                PlayerView.this.f44445c.setVisibility(8);
                PlayerView.this.f44446d.setVisibility(8);
            }
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return PlayerView.this.f44456n;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return PlayerView.this.f44455m;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
            if (PlayerView.this.f44460r) {
                PlayerView.this.m67726O(true);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            PlayerView.this.f44457o = false;
            PlayerView.this.m67746A(hdc0.f108955q1);
            PlayerView.this.f44450h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f44459q) {
                PlayerView.this.f44446d.setVisibility(0);
                PlayerView.this.f44445c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            PlayerView.this.f44450h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f44444b.getAlpha() > 0.0f) {
                PlayerView.this.f44444b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f44459q) {
                PlayerView.this.f44445c.setVisibility(0);
                PlayerView.this.f44446d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = PlayerView.this.f44454l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
            PlayerView.this.m67752J();
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f44453k = new C11565c();
        this.f44454l = new HashSet();
        this.f44462t = false;
        this.f44463u = new View.OnClickListener() { // from class: l.xg80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194159a.m67725H(view);
            }
        };
        this.f44467y = true;
        m67723C();
    }

    /* JADX INFO: renamed from: C */
    private void m67723C() {
        m67761w(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f44463u);
        this.f44450h.setOnClickListener(new View.OnClickListener() { // from class: l.gh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104076a.m67724F(view);
            }
        });
        this.f44443a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11563a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m67724F(View view) {
        if (m67748D()) {
            m67755M();
        } else {
            m67756N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m67725H(View view) {
        if (m67748D()) {
            m67755M();
        } else {
            m67756N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m67726O(boolean z) {
        if (this.f44455m == null) {
            Runnable runnable = this.f44464v;
            if (runnable == null) {
                this.f44464v = new Runnable() { // from class: l.dh80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f88425a.m67751I();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f44464v, 10000L);
        }
        if (NullChecker.m82486a(this.f44458p) && NullChecker.m82486a(this.f44456n)) {
            this.f44457o = true;
            if (NullChecker.m82486a(this.f44455m)) {
                this.f44458p.mo139594d(this.f44453k, z);
            } else {
                this.f44453k.mo45235c();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m67746A(int i) {
        for (int i2 = 0; i2 < this.f44450h.getChildCount(); i2++) {
            View childAt = this.f44450h.getChildAt(i2);
            if (this.f44461s) {
                bnl0.m105525M0(childAt, (i != childAt.getId() || i == hdc0.f108928i1 || i == hdc0.f108838H0) ? false : true);
            } else {
                bnl0.m105525M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m67747B(int i) {
        boolean z = (((int) this.f44456n.duration) / 60) / 60 > 0;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 % 60;
        int i6 = i4 / 60;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(i6);
            sb.append(':');
        }
        sb.append(z ? decimalFormat.format(i5) : String.valueOf(i5));
        sb.append(':');
        sb.append(decimalFormat.format(i3));
        return sb.toString();
    }

    /* JADX INFO: renamed from: D */
    public boolean m67748D() {
        return this.f44457o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m67749E() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m67750G() {
        if (NullChecker.m82486a(this.f44458p)) {
            this.f44458p.stop();
            m67756N();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m67751I() {
        if (this.f44455m == null && NullChecker.m82486a(this.f44453k)) {
            if (!this.f44461s) {
                o1j0.m165634h(R$string.f39714A4);
            }
            this.f44453k.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f44454l.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m67752J() {
        if (this.f44467y || this.f44466x <= 0) {
            if (NullChecker.m82486a(this.f44465w)) {
                removeCallbacks(this.f44465w);
            }
        } else {
            Runnable runnable = this.f44465w;
            if (runnable == null) {
                this.f44465w = new Runnable() { // from class: l.kh80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f126700a.m67750G();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f44465w, this.f44466x * 1000);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m67753K(boolean z) {
        if (NullChecker.m82486a(this.f44458p)) {
            this.f44458p.mute(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m67754L(final x20 x20Var) {
        this.f44461s = true;
        bnl0.m105509E0(this.f44450h, new View.OnClickListener() { // from class: l.jh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m67755M() {
        removeCallbacks(this.f44464v);
        if (NullChecker.m82486a(this.f44465w)) {
            removeCallbacks(this.f44465w);
        }
        this.f44457o = false;
        if (NullChecker.m82486a(this.f44458p)) {
            this.f44458p.pause();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m67756N() {
        m67726O(false);
    }

    /* JADX INFO: renamed from: P */
    public void m67757P() {
        this.f44453k = new C11565c();
    }

    /* JADX INFO: renamed from: Q */
    public void m67758Q(Video video, boolean z) {
        if (this.f44457o) {
            m67759R();
        }
        this.f44456n = video;
        uqb0.f180374G.m98798o(this.f44444b);
        if (NullChecker.m82487b(video)) {
            if (this.f44459q) {
                this.f44447e.setText(m67747B(0));
                this.f44449g.setText(m67747B((int) (video.duration * 1000.0f)));
                this.f44445c.setProgress(0);
                this.f44448f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        this.f44444b.setImageUrl(pictureCover.url);
                    } else {
                        uqb0.f180374G.m127146i0(this.f44444b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f44444b.setBackgroundColor(getResources().getColor(k9c0.f124495a));
                } else {
                    uqb0.f180374G.m127146i0(this.f44444b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public void m67759R() {
        removeCallbacks(this.f44464v);
        if (NullChecker.m82486a(this.f44465w)) {
            removeCallbacks(this.f44465w);
        }
        this.f44457o = false;
        if (NullChecker.m82486a(this.f44458p)) {
            this.f44458p.stop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX INFO: renamed from: S */
    public void m67760S(int i, int i2) {
        Dimension dimension;
        Video video = this.f44456n;
        if (video == null) {
            return;
        }
        this.f44462t = true;
        Picture picture = video.cover;
        if (NullChecker.m82487b(video.size)) {
            dimension = this.f44456n.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(picture) || !NullChecker.m82487b(picture.size)) {
                    dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
                    }
                }
            }
        } else if (NullChecker.m82487b(picture)) {
            dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
        } else {
            dimension = new Dimension(qa00.m175859d(178.0f), qa00.m175859d(178.0f));
        }
        ViewGroup.LayoutParams layoutParams = this.f44444b.getLayoutParams();
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f44444b.setLayoutParams(layoutParams);
        }
        float f = i;
        float f2 = f / dimension.width;
        float f3 = i2;
        float f4 = f3 / dimension.height;
        Matrix matrix = new Matrix();
        float fMax = Math.max(f2, f4);
        float f5 = i / 2;
        float f6 = i2 / 2;
        matrix.preScale(dimension.width / f, dimension.height / f3, f5, f6);
        matrix.postScale(fMax, fMax, f5, f6);
        this.f44443a.setTransform(matrix);
        postInvalidate();
    }

    public Set<ie80.InterfaceC17710b> getPlayListener() {
        return this.f44454l;
    }

    public Video getVideo() {
        return this.f44456n;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f44462t) {
            return;
        }
        m67763y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m82486a(this.f44458p)) {
            this.f44458p.mo139596f(true);
        }
    }

    public void setLoopMode(boolean z) {
        this.f44460r = z;
    }

    public void setPlayer(ie80 ie80Var) {
        this.f44458p = ie80Var;
        if (ie80Var == null && NullChecker.m82486a(this.f44465w)) {
            removeCallbacks(this.f44465w);
        }
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f44459q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f44443a)) {
            C11564b c11564b = new C11564b(f);
            this.f44443a.setOutlineProvider(c11564b);
            this.f44443a.setClipToOutline(true);
            this.f44444b.setOutlineProvider(c11564b);
            this.f44444b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m67758Q(video, false);
    }

    /* JADX INFO: renamed from: w */
    public View m67761w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nh80.m163072b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public void m67762x(ie80.InterfaceC17710b interfaceC17710b) {
        this.f44454l.add(interfaceC17710b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: y */
    public final void m67763y() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f44456n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f44456n.size)) {
                    dimension = this.f44456n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f44456n.size)) {
            dimension = this.f44456n.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        float f2 = width;
        float f3 = height;
        if (f2 / f3 > f) {
            width = (int) (f3 * f);
        } else {
            height = (int) (f2 / f);
        }
        ViewGroup.LayoutParams layoutParams = this.f44444b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f44444b.post(new Runnable() { // from class: l.ah80
            @Override // java.lang.Runnable
            public final void run() {
                this.f71329a.m67749E();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: z */
    public void m67764z(int i, int i2) {
        Dimension dimension;
        Video video = this.f44456n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f44456n.size)) {
                    dimension = this.f44456n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f44456n.size)) {
            dimension = this.f44456n.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        float f2 = i;
        float f3 = i2;
        if (f2 / f3 > f) {
            i = (int) (f3 * f);
        } else {
            i2 = (int) (f2 / f);
        }
        ViewGroup.LayoutParams layoutParams = this.f44444b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f44444b.setLayoutParams(layoutParams);
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f44453k = new C11565c();
        this.f44454l = new HashSet();
        this.f44462t = false;
        this.f44463u = new View.OnClickListener() { // from class: l.xg80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194159a.m67725H(view);
            }
        };
        this.f44467y = true;
        m67723C();
    }
}
