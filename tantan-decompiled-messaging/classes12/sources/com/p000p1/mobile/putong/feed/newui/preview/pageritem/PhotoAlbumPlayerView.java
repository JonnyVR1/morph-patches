package com.p000p1.mobile.putong.feed.newui.preview.pageritem;

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
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import l.c680;
import l.lsi0;
import l.qib0;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.ua70;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumPlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f4125a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4126b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f4127c;

    /* JADX INFO: renamed from: d */
    public VLinear f4128d;

    /* JADX INFO: renamed from: e */
    public VText f4129e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f4130f;

    /* JADX INFO: renamed from: g */
    public VText f4131g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f4132h;

    /* JADX INFO: renamed from: i */
    public ImageView f4133i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f4134j;

    /* JADX INFO: renamed from: k */
    public C2170d f4135k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.b> f4136l;

    /* JADX INFO: renamed from: m */
    public Surface f4137m;

    /* JADX INFO: renamed from: n */
    public Video f4138n;

    /* JADX INFO: renamed from: o */
    public boolean f4139o;

    /* JADX INFO: renamed from: p */
    public c680 f4140p;

    /* JADX INFO: renamed from: q */
    public boolean f4141q;

    /* JADX INFO: renamed from: r */
    public boolean f4142r;

    /* JADX INFO: renamed from: s */
    public boolean f4143s;

    /* JADX INFO: renamed from: t */
    public boolean f4144t;

    /* JADX INFO: renamed from: u */
    public InterfaceC2169c f4145u;

    /* JADX INFO: renamed from: v */
    public View.OnClickListener f4146v;

    /* JADX INFO: renamed from: w */
    public Runnable f4147w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$a */
    public class TextureViewSurfaceTextureListenerC2167a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC2167a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumPlayerView.this.f4137m = new Surface(surfaceTexture);
            PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
            photoAlbumPlayerView.removeCallbacks(photoAlbumPlayerView.f4147w);
            Matrix matrix = new Matrix();
            PhotoAlbumPlayerView.this.f4125a.getTransform(matrix);
            PhotoAlbumPlayerView.this.f4125a.setTransform(matrix);
            if (PhotoAlbumPlayerView.this.m6550y()) {
                PhotoAlbumPlayerView.this.m6537F();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PhotoAlbumPlayerView.this.m6541J();
            PhotoAlbumPlayerView.this.f4137m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(PhotoAlbumPlayerView.this.f4140p) && PhotoAlbumPlayerView.this.m6550y()) {
                PhotoAlbumPlayerView.this.f4140p.c();
                if (PhotoAlbumPlayerView.this.f4126b.getAlpha() == 1.0f || PhotoAlbumPlayerView.this.f4132h.getAlpha() == 1.0f) {
                    PhotoAlbumPlayerView.this.f4140p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$b */
    public class C2168b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f4149a;

        public C2168b(float f) {
            this.f4149a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f4149a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$c */
    public interface InterfaceC2169c {
        /* JADX INFO: renamed from: a */
        void mo6552a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$d */
    public class C2170d implements c680.a {
        public C2170d() {
        }

        /* JADX INFO: renamed from: a */
        public void m6553a(Exception exc) {
            PhotoAlbumPlayerView.this.m6541J();
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).a(exc);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m6554b(int i) {
            if (PhotoAlbumPlayerView.this.f4141q) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumPlayerView.this.f4138n.duration) * PhotoAlbumPlayerView.this.f4127c.getMax());
                PhotoAlbumPlayerView.this.f4127c.setProgress(max);
                PhotoAlbumPlayerView.this.f4130f.setProgress(max);
                PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
                photoAlbumPlayerView.f4129e.setText(photoAlbumPlayerView.m6547v(i));
            }
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).b(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m6555c() {
            PhotoAlbumPlayerView.this.m6546u(b5c0.f5966H0);
            if (PhotoAlbumPlayerView.this.f4132h.getAlpha() < 1.0f) {
                PhotoAlbumPlayerView.this.f4132h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m6556d() {
            m6557e();
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m6557e() {
            PhotoAlbumPlayerView.this.f4139o = false;
            PhotoAlbumPlayerView.this.m6546u(b5c0.f6083q1);
            PhotoAlbumPlayerView.this.f4132h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumPlayerView.this.f4126b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f4141q) {
                PhotoAlbumPlayerView.this.f4127c.setProgress(0);
                PhotoAlbumPlayerView.this.f4130f.setProgress(0);
                PhotoAlbumPlayerView.this.f4127c.setVisibility(8);
                PhotoAlbumPlayerView.this.f4128d.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: f */
        public Video m6558f() {
            return PhotoAlbumPlayerView.this.f4138n;
        }

        /* JADX INFO: renamed from: g */
        public void m6559g() {
        }

        public Surface getSurface() {
            return PhotoAlbumPlayerView.this.f4137m;
        }

        public void onComplete() {
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onComplete();
            }
            if (PhotoAlbumPlayerView.this.f4142r) {
                PhotoAlbumPlayerView.this.m6538G(true);
            }
        }

        public void onPause() {
            PhotoAlbumPlayerView.this.f4139o = false;
            PhotoAlbumPlayerView.this.m6546u(b5c0.f6083q1);
            PhotoAlbumPlayerView.this.f4132h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f4141q) {
                PhotoAlbumPlayerView.this.f4128d.setVisibility(0);
                PhotoAlbumPlayerView.this.f4127c.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onPause();
            }
        }

        public void onResume() {
            PhotoAlbumPlayerView.this.f4132h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f4126b.getAlpha() > 0.0f) {
                PhotoAlbumPlayerView.this.f4126b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumPlayerView.this.f4141q) {
                PhotoAlbumPlayerView.this.f4127c.setVisibility(0);
                PhotoAlbumPlayerView.this.f4128d.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onResume();
            }
        }

        public void onStart() {
            Iterator it = PhotoAlbumPlayerView.this.f4136l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumPlayerView(@NonNull Context context) {
        super(context);
        this.f4135k = new C2170d();
        this.f4136l = new HashSet();
        this.f4144t = false;
        this.f4146v = new View.OnClickListener() { // from class: l.qa70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12176a.m6533B(view);
            }
        };
        m6548w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m6532A(View view) {
        if (m6550y()) {
            m6536E();
        } else {
            m6537F();
        }
        if (NullChecker.a(this.f4145u)) {
            this.f4145u.mo6552a(m6550y());
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m6533B(View view) {
        if (m6550y()) {
            m6536E();
        } else {
            m6537F();
        }
        if (NullChecker.a(this.f4145u)) {
            this.f4145u.mo6552a(m6550y());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6534C() {
        if (this.f4137m == null && NullChecker.a(this.f4135k)) {
            if (!this.f4143s) {
                lsi0.h(R$string.f327A4);
            }
            this.f4135k.m6556d();
            Iterator<c680.b> it = this.f4136l.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m6535D(boolean z) {
        c680 c680Var = this.f4140p;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: E */
    public void m6536E() {
        removeCallbacks(this.f4147w);
        this.f4139o = false;
        if (NullChecker.a(this.f4140p)) {
            this.f4140p.pause();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m6537F() {
        m6538G(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m6538G(boolean z) {
        if (this.f4137m == null) {
            Runnable runnable = this.f4147w;
            if (runnable == null) {
                this.f4147w = new Runnable() { // from class: l.sa70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12854a.m6534C();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f4147w, 10000L);
        }
        if (NullChecker.a(this.f4140p) && NullChecker.a(this.f4138n)) {
            this.f4139o = true;
            if (NullChecker.a(this.f4137m)) {
                this.f4140p.d(this.f4135k, z);
            } else {
                this.f4135k.m6555c();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m6539H() {
        this.f4135k = new C2170d();
    }

    /* JADX INFO: renamed from: I */
    public void m6540I(Video video, boolean z) {
        if (this.f4139o) {
            m6541J();
        }
        this.f4138n = video;
        qib0.G.o(this.f4126b);
        if (NullChecker.b(video)) {
            if (this.f4141q) {
                this.f4129e.setText(m6547v(0));
                this.f4131g.setText(m6547v((int) (video.duration * 1000.0f)));
                this.f4127c.setProgress(0);
                this.f4130f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.a(pictureCover) && NullChecker.b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        qib0.G.B0(this.f4126b, pictureCover.aspectRatioBiggest());
                    } else {
                        qib0.G.i0(this.f4126b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f4126b.setBackgroundColor(getResources().getColor(e1c0.f7128a));
                } else {
                    qib0.G.i0(this.f4126b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m6541J() {
        removeCallbacks(this.f4147w);
        this.f4139o = false;
        if (NullChecker.a(this.f4140p)) {
            this.f4140p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4144t) {
            return;
        }
        m6544s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.a(this.f4140p)) {
            this.f4140p.f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m6542q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ua70.m15070b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m6543r(c680.b bVar) {
        this.f4136l.add(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m6544s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f4138n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.a(picture) && NullChecker.a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(this.f4138n.size)) {
                    dimension = this.f4138n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.a(this.f4138n.size)) {
            dimension = this.f4138n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f4126b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f4126b.post(new Runnable() { // from class: l.ra70
            @Override // java.lang.Runnable
            public final void run() {
                this.f12576a.m6551z();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f4142r = z;
    }

    public void setOnClickButtonListener(InterfaceC2169c interfaceC2169c) {
        this.f4145u = interfaceC2169c;
    }

    public void setPlayer(c680 c680Var) {
        this.f4140p = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f4141q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f4125a)) {
            C2168b c2168b = new C2168b(f);
            this.f4125a.setOutlineProvider(c2168b);
            this.f4125a.setClipToOutline(true);
            this.f4126b.setOutlineProvider(c2168b);
            this.f4126b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m6540I(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m6545t(int i, int i2) {
        Dimension dimension;
        Video video = this.f4138n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f4138n.size)) {
                    dimension = this.f4138n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f4138n.size)) {
            dimension = this.f4138n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f4126b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f4126b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m6546u(int i) {
        for (int i2 = 0; i2 < this.f4132h.getChildCount(); i2++) {
            View childAt = this.f4132h.getChildAt(i2);
            if (this.f4143s) {
                xdl0.M0(childAt, (i != childAt.getId() || i == b5c0.f6056i1 || i == b5c0.f5966H0) ? false : true);
            } else {
                xdl0.M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m6547v(int i) {
        boolean z = (((int) this.f4138n.duration) / 60) / 60 > 0;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        int i2 = i / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO;
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
    public final void m6548w() {
        m6542q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f4146v);
        this.f4132h.setOnClickListener(new View.OnClickListener() { // from class: l.ta70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13245a.m6532A(view);
            }
        });
        this.f4125a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2167a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m6549x() {
        return this.f4140p.e();
    }

    /* JADX INFO: renamed from: y */
    public boolean m6550y() {
        return this.f4139o;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m6551z() {
        requestLayout();
        invalidate();
    }

    public PhotoAlbumPlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f4135k = new C2170d();
        this.f4136l = new HashSet();
        this.f4144t = false;
        this.f4146v = new View.OnClickListener() { // from class: l.qa70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12176a.m6533B(view);
            }
        };
        m6548w();
    }
}
