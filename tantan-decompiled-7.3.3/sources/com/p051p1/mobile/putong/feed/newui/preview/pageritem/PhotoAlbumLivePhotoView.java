package com.p051p1.mobile.putong.feed.newui.preview.pageritem;

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
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;
import p153l.bnl0;
import p153l.fp50;
import p153l.gi70;
import p153l.ie80;
import p153l.k9c0;
import p153l.o1j0;
import p153l.uqb0;
import p153l.y3h;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumLivePhotoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f43479a;

    /* JADX INFO: renamed from: b */
    public PhotoDraweeView f43480b;

    /* JADX INFO: renamed from: c */
    public VLinear f43481c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f43482d;

    /* JADX INFO: renamed from: e */
    public VLinear f43483e;

    /* JADX INFO: renamed from: f */
    public VText f43484f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f43485g;

    /* JADX INFO: renamed from: h */
    public VText f43486h;

    /* JADX INFO: renamed from: i */
    public C11482d f43487i;

    /* JADX INFO: renamed from: j */
    public final Set<ie80.InterfaceC17710b> f43488j;

    /* JADX INFO: renamed from: k */
    public Surface f43489k;

    /* JADX INFO: renamed from: l */
    public Video f43490l;

    /* JADX INFO: renamed from: m */
    public boolean f43491m;

    /* JADX INFO: renamed from: n */
    public ie80 f43492n;

    /* JADX INFO: renamed from: o */
    public boolean f43493o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPhotoPreviewView.InterfaceC11485c f43494p;

    /* JADX INFO: renamed from: q */
    public Runnable f43495q;

    /* JADX INFO: renamed from: r */
    public y3h f43496r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC11479a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11479a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumLivePhotoView.this.f43489k = new Surface(surfaceTexture);
            PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
            photoAlbumLivePhotoView.removeCallbacks(photoAlbumLivePhotoView.f43495q);
            Matrix matrix = new Matrix();
            PhotoAlbumLivePhotoView.this.f43479a.getTransform(matrix);
            PhotoAlbumLivePhotoView.this.f43479a.setTransform(matrix);
            if (PhotoAlbumLivePhotoView.this.m66547t()) {
                PhotoAlbumLivePhotoView.this.m66553z();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoAlbumLivePhotoView.this.f43491m) {
                PhotoAlbumLivePhotoView.this.m66540B();
            }
            PhotoAlbumLivePhotoView.this.f43489k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(PhotoAlbumLivePhotoView.this.f43492n) && PhotoAlbumLivePhotoView.this.m66547t()) {
                PhotoAlbumLivePhotoView.this.f43492n.mo139593c();
                if (PhotoAlbumLivePhotoView.this.f43480b.getAlpha() == 1.0f) {
                    PhotoAlbumLivePhotoView.this.f43492n.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$b */
    public class C11480b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f43498a;

        public C11480b(float f) {
            this.f43498a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f43498a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$c */
    public class C11481c implements y3h {
        public C11481c() {
        }

        @Override // p153l.y3h
        /* JADX INFO: renamed from: a */
        public void mo66554a(float f, float f2) {
            bnl0.m105524M(PhotoAlbumLivePhotoView.this.f43481c, false);
        }

        @Override // p153l.y3h
        /* JADX INFO: renamed from: b */
        public void mo66555b() {
            bnl0.m105524M(PhotoAlbumLivePhotoView.this.f43481c, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$d */
    public class C11482d implements ie80.InterfaceC17709a {
        public C11482d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            PhotoAlbumLivePhotoView.this.m66540B();
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            if (PhotoAlbumLivePhotoView.this.f43493o) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumLivePhotoView.this.f43490l.duration) * PhotoAlbumLivePhotoView.this.f43482d.getMax());
                PhotoAlbumLivePhotoView.this.f43482d.setProgress(max);
                PhotoAlbumLivePhotoView.this.f43485g.setProgress(max);
                PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
                photoAlbumLivePhotoView.f43484f.setText(photoAlbumLivePhotoView.m66545r(i));
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            PhotoAlbumLivePhotoView.this.f43491m = false;
            PhotoAlbumLivePhotoView.this.f43480b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f43481c.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f43479a.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumLivePhotoView.this.f43493o) {
                PhotoAlbumLivePhotoView.this.f43482d.setProgress(0);
                PhotoAlbumLivePhotoView.this.f43485g.setProgress(0);
                PhotoAlbumLivePhotoView.this.f43482d.setVisibility(8);
                PhotoAlbumLivePhotoView.this.f43483e.setVisibility(8);
            }
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return PhotoAlbumLivePhotoView.this.f43490l;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return PhotoAlbumLivePhotoView.this.f43489k;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            PhotoAlbumLivePhotoView.this.f43491m = false;
            if (PhotoAlbumLivePhotoView.this.f43493o) {
                PhotoAlbumLivePhotoView.this.f43483e.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f43482d.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            if (PhotoAlbumLivePhotoView.this.f43480b.getAlpha() > 0.0f) {
                PhotoAlbumLivePhotoView.this.f43480b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f43481c.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f43479a.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumLivePhotoView.this.f43493o) {
                PhotoAlbumLivePhotoView.this.f43482d.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f43483e.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = PhotoAlbumLivePhotoView.this.f43488j.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context) {
        super(context);
        this.f43487i = new C11482d();
        this.f43488j = new HashSet();
        this.f43496r = new C11481c();
        m66546s();
    }

    /* JADX INFO: renamed from: A */
    public final void m66539A(boolean z) {
        if (this.f43489k == null) {
            Runnable runnable = this.f43495q;
            if (runnable == null) {
                this.f43495q = new Runnable() { // from class: l.fi70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f99157a.m66550w();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f43495q, 10000L);
        }
        if (NullChecker.m82486a(this.f43492n) && NullChecker.m82486a(this.f43490l)) {
            this.f43491m = true;
            if (NullChecker.m82486a(this.f43489k)) {
                this.f43492n.mo139594d(this.f43487i, z);
            } else {
                this.f43487i.mo45235c();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m66540B() {
        removeCallbacks(this.f43495q);
        this.f43491m = false;
        if (NullChecker.m82486a(this.f43492n)) {
            this.f43492n.stop();
        }
    }

    public y3h getDragBackListener() {
        return this.f43496r;
    }

    /* JADX INFO: renamed from: n */
    public View m66541n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gi70.m130296b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m66542o(ie80.InterfaceC17710b interfaceC17710b) {
        this.f43488j.add(interfaceC17710b);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m66543p();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m82486a(this.f43492n)) {
            this.f43492n.mo139596f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: p */
    public final void m66543p() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f43490l) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(this.f43490l.size)) {
                    dimension = this.f43490l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(this.f43490l.size)) {
            dimension = this.f43490l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43480b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f43480b.post(new Runnable() { // from class: l.di70
            @Override // java.lang.Runnable
            public final void run() {
                this.f88594a.m66548u();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: q */
    public void m66544q(int i, int i2) {
        Dimension dimension;
        Video video = this.f43490l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f43490l.size)) {
                    dimension = this.f43490l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f43490l.size)) {
            dimension = this.f43490l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43480b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f43480b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: r */
    public final String m66545r(int i) {
        boolean z = (((int) this.f43490l.duration) / 60) / 60 > 0;
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

    /* JADX INFO: renamed from: s */
    public final void m66546s() {
        m66541n(LayoutInflater.from(getContext()), this);
        this.f43480b.setOnViewTapListener(new fp50() { // from class: l.ei70
            @Override // p153l.fp50
            /* JADX INFO: renamed from: a */
            public final void mo99079a(View view, float f, float f2) {
                this.f94114a.m66549v(view, f, f2);
            }
        });
        this.f43479a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11479a());
    }

    public void setOnTapListener(PhotoAlbumPhotoPreviewView.InterfaceC11485c interfaceC11485c) {
        this.f43494p = interfaceC11485c;
    }

    public void setPlayer(ie80 ie80Var) {
        this.f43492n = ie80Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f43493o = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f43479a)) {
            C11480b c11480b = new C11480b(f);
            this.f43479a.setOutlineProvider(c11480b);
            this.f43479a.setClipToOutline(true);
            this.f43480b.setOutlineProvider(c11480b);
            this.f43480b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        if (this.f43491m) {
            m66540B();
        }
        this.f43490l = video;
        uqb0.f180374G.m98798o(this.f43480b);
        if (NullChecker.m82487b(video)) {
            if (this.f43493o) {
                this.f43484f.setText(m66545r(0));
                this.f43486h.setText(m66545r((int) (video.duration * 1000.0f)));
                this.f43482d.setProgress(0);
                this.f43485g.setProgress(0);
            }
            Picture pictureCover = video.cover();
            if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
                if (TEnum.equals(pictureCover.status, "normal")) {
                    uqb0.f180374G.m127096B0(this.f43480b, pictureCover.aspectRatioBiggest());
                } else {
                    uqb0.f180374G.m127146i0(this.f43480b, pictureCover.url);
                }
            } else if (video.url.contains("http")) {
                this.f43480b.setBackgroundColor(getResources().getColor(k9c0.f124495a));
            } else {
                uqb0.f180374G.m127146i0(this.f43480b, video.url);
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public boolean m66547t() {
        return this.f43491m;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m66548u() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m66549v(View view, float f, float f2) {
        m66552y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m66550w() {
        if (this.f43489k == null && NullChecker.m82486a(this.f43487i)) {
            o1j0.m165634h(R$string.f39714A4);
            this.f43487i.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f43488j.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m66551x(boolean z) {
        ie80 ie80Var = this.f43492n;
        if (ie80Var == null) {
            return;
        }
        ie80Var.mute(z);
    }

    /* JADX INFO: renamed from: y */
    public final void m66552y() {
        if (NullChecker.m82486a(this.f43494p)) {
            this.f43494p.mo63519a();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m66553z() {
        m66539A(false);
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f43487i = new C11482d();
        this.f43488j = new HashSet();
        this.f43496r = new C11481c();
        m66546s();
    }
}
