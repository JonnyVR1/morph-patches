package com.p000p1.mobile.putong.newui.mediaoperation.preview.item;

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
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l.g980;
import l.lsi0;
import l.qib0;
import l.s4c0;
import l.v0c0;
import l.xdl0;
import p009l.c680;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f7714a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7715b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f7716c;

    /* JADX INFO: renamed from: d */
    public VLinear f7717d;

    /* JADX INFO: renamed from: e */
    public VText f7718e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f7719f;

    /* JADX INFO: renamed from: g */
    public VText f7720g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f7721h;

    /* JADX INFO: renamed from: i */
    public ImageView f7722i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f7723j;

    /* JADX INFO: renamed from: k */
    public C0478c f7724k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.InterfaceC0800b> f7725l;

    /* JADX INFO: renamed from: m */
    public Surface f7726m;

    /* JADX INFO: renamed from: n */
    public Video f7727n;

    /* JADX INFO: renamed from: o */
    public boolean f7728o;

    /* JADX INFO: renamed from: p */
    public c680 f7729p;

    /* JADX INFO: renamed from: q */
    public boolean f7730q;

    /* JADX INFO: renamed from: r */
    public boolean f7731r;

    /* JADX INFO: renamed from: s */
    public boolean f7732s;

    /* JADX INFO: renamed from: t */
    public boolean f7733t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f7734u;

    /* JADX INFO: renamed from: v */
    public Runnable f7735v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC0476a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0476a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f7726m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f7735v);
            Matrix matrix = new Matrix();
            PlayerView.this.f7714a.getTransform(matrix);
            PlayerView.this.f7714a.setTransform(matrix);
            if (PlayerView.this.m9451x()) {
                PlayerView.this.m9440D();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m9443G();
            PlayerView.this.f7726m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(PlayerView.this.f7729p) && PlayerView.this.m9451x()) {
                PlayerView.this.f7729p.mo12360c();
                if (PlayerView.this.f7715b.getAlpha() == 1.0f || PlayerView.this.f7721h.getAlpha() == 1.0f) {
                    PlayerView.this.f7729p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$b */
    public class C0477b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f7737a;

        public C0477b(float f) {
            this.f7737a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f7737a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$c */
    public class C0478c implements c680.InterfaceC0799a {
        public C0478c() {
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: a */
        public void mo9454a(Exception exc) {
            PlayerView.this.m9443G();
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).mo9454a(exc);
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: b */
        public void mo9455b(int i) {
            if (PlayerView.this.f7730q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f7727n.duration) * PlayerView.this.f7716c.getMax());
                PlayerView.this.f7716c.setProgress(max);
                PlayerView.this.f7719f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f7718e.setText(playerView.m9449v(i));
            }
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).mo9455b(i);
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: c */
        public void mo9456c() {
            PlayerView.this.m9448u(s4c0.T);
            if (PlayerView.this.f7721h.getAlpha() < 1.0f) {
                PlayerView.this.f7721h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).mo9456c();
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: d */
        public void mo9457d() {
            mo9458e();
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).mo9457d();
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: e */
        public void mo9458e() {
            PlayerView.this.f7728o = false;
            PlayerView.this.m9448u(s4c0.a0);
            PlayerView.this.f7721h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f7715b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f7730q) {
                PlayerView.this.f7716c.setProgress(0);
                PlayerView.this.f7719f.setProgress(0);
                PlayerView.this.f7716c.setVisibility(8);
                PlayerView.this.f7717d.setVisibility(8);
            }
        }

        @Override // p009l.c680.InterfaceC0799a
        /* JADX INFO: renamed from: f */
        public Video mo9459f() {
            return PlayerView.this.f7727n;
        }

        @Override // p009l.c680.InterfaceC0800b
        /* JADX INFO: renamed from: g */
        public void mo9460g() {
        }

        @Override // p009l.c680.InterfaceC0799a
        public Surface getSurface() {
            return PlayerView.this.f7726m;
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onComplete() {
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).onComplete();
            }
            if (PlayerView.this.f7731r) {
                PlayerView.this.m9441E(true);
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onPause() {
            PlayerView.this.f7728o = false;
            PlayerView.this.m9448u(s4c0.a0);
            PlayerView.this.f7721h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f7730q) {
                PlayerView.this.f7717d.setVisibility(0);
                PlayerView.this.f7716c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).onPause();
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onResume() {
            PlayerView.this.f7721h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f7715b.getAlpha() > 0.0f) {
                PlayerView.this.f7715b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f7730q) {
                PlayerView.this.f7716c.setVisibility(0);
                PlayerView.this.f7717d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).onResume();
            }
        }

        @Override // p009l.c680.InterfaceC0800b
        public void onStart() {
            Iterator it = PlayerView.this.f7725l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC0800b) it.next()).onStart();
            }
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f7724k = new C0478c();
        this.f7725l = new HashSet();
        this.f7733t = false;
        this.f7734u = new View.OnClickListener() { // from class: l.v880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21481a.m9437A(view);
            }
        };
        m9450w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m9437A(View view) {
        if (m9451x()) {
            m9439C();
        } else {
            m9440D();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9438B() {
        if (this.f7726m == null && NullChecker.a(this.f7724k)) {
            if (!this.f7732s) {
                lsi0.h(R.string.h1);
            }
            this.f7724k.mo9457d();
            Iterator<c680.InterfaceC0800b> it = this.f7725l.iterator();
            while (it.hasNext()) {
                it.next().mo9457d();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m9439C() {
        removeCallbacks(this.f7735v);
        this.f7728o = false;
        if (NullChecker.a(this.f7729p)) {
            this.f7729p.pause();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m9440D() {
        m9441E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m9441E(boolean z) {
        if (this.f7726m == null) {
            Runnable runnable = this.f7735v;
            if (runnable == null) {
                this.f7735v = new Runnable() { // from class: l.y880
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22932a.m9438B();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f7735v, 10000L);
        }
        if (NullChecker.a(this.f7729p) && NullChecker.a(this.f7727n)) {
            this.f7728o = true;
            if (NullChecker.a(this.f7726m)) {
                this.f7729p.mo12361d(this.f7724k, z);
            } else {
                this.f7724k.mo9456c();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m9442F(Video video, boolean z) {
        if (this.f7728o) {
            m9443G();
        }
        this.f7727n = video;
        qib0.G.o(this.f7715b);
        if (NullChecker.b(video)) {
            if (this.f7730q) {
                this.f7718e.setText(m9449v(0));
                this.f7720g.setText(m9449v((int) (video.duration * 1000.0f)));
                this.f7716c.setProgress(0);
                this.f7719f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.a(pictureCover) && NullChecker.b(((Media) pictureCover).url)) {
                    if (TEnum.equals(((Media) pictureCover).status, "normal")) {
                        qib0.G.B0(this.f7715b, pictureCover.aspectRatioBiggest());
                    } else {
                        qib0.G.i0(this.f7715b, ((Media) pictureCover).url);
                    }
                } else if (((Media) video).url.contains("http")) {
                    this.f7715b.setBackgroundColor(getResources().getColor(v0c0.a));
                } else {
                    qib0.G.i0(this.f7715b, ((Media) video).url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public void m9443G() {
        removeCallbacks(this.f7735v);
        this.f7728o = false;
        if (NullChecker.a(this.f7729p)) {
            this.f7729p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f7733t) {
            return;
        }
        m9446s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.a(this.f7729p)) {
            this.f7729p.mo12363f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m9444q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g980.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m9445r(c680.InterfaceC0800b interfaceC0800b) {
        this.f7725l.add(interfaceC0800b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m9446s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f7727n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.a(picture) && NullChecker.a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(this.f7727n.size)) {
                    dimension = this.f7727n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.a(this.f7727n.size)) {
            dimension = this.f7727n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f7715b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f7715b.post(new Runnable() { // from class: l.s880
            @Override // java.lang.Runnable
            public final void run() {
                this.f20132a.m9452y();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f7731r = z;
    }

    public void setPlayer(c680 c680Var) {
        this.f7729p = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f7730q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f7714a)) {
            C0477b c0477b = new C0477b(f);
            this.f7714a.setOutlineProvider(c0477b);
            this.f7714a.setClipToOutline(true);
            this.f7715b.setOutlineProvider(c0477b);
            this.f7715b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m9442F(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m9447t(int i, int i2) {
        Dimension dimension;
        Video video = this.f7727n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.a(picture) && NullChecker.a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(this.f7727n.size)) {
                    dimension = this.f7727n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.a(this.f7727n.size)) {
            dimension = this.f7727n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f7715b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f7715b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m9448u(int i) {
        for (int i2 = 0; i2 < this.f7721h.getChildCount(); i2++) {
            View childAt = this.f7721h.getChildAt(i2);
            xdl0.M0(childAt, i == childAt.getId());
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m9449v(int i) {
        boolean z = (((int) this.f7727n.duration) / 60) / 60 > 0;
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

    /* JADX INFO: renamed from: w */
    public final void m9450w() {
        m9444q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f7734u);
        this.f7721h.setOnClickListener(new View.OnClickListener() { // from class: l.b980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9970a.m9453z(view);
            }
        });
        this.f7714a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0476a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m9451x() {
        return this.f7728o;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9452y() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9453z(View view) {
        if (m9451x()) {
            m9439C();
        } else {
            m9440D();
        }
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f7724k = new C0478c();
        this.f7725l = new HashSet();
        this.f7733t = false;
        this.f7734u = new View.OnClickListener() { // from class: l.v880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21481a.m9437A(view);
            }
        };
        m9450w();
    }
}
