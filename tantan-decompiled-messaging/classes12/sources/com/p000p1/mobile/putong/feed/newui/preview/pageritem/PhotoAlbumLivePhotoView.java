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
import l.zg50;
import p007l.aa70;
import p007l.e1c0;
import p007l.j2h;
import v.VLinear;
import v.VProgressBar;
import v.VText;
import v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumLivePhotoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f4092a;

    /* JADX INFO: renamed from: b */
    public PhotoDraweeView f4093b;

    /* JADX INFO: renamed from: c */
    public VLinear f4094c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f4095d;

    /* JADX INFO: renamed from: e */
    public VLinear f4096e;

    /* JADX INFO: renamed from: f */
    public VText f4097f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f4098g;

    /* JADX INFO: renamed from: h */
    public VText f4099h;

    /* JADX INFO: renamed from: i */
    public C2163d f4100i;

    /* JADX INFO: renamed from: j */
    public final Set<c680.b> f4101j;

    /* JADX INFO: renamed from: k */
    public Surface f4102k;

    /* JADX INFO: renamed from: l */
    public Video f4103l;

    /* JADX INFO: renamed from: m */
    public boolean f4104m;

    /* JADX INFO: renamed from: n */
    public c680 f4105n;

    /* JADX INFO: renamed from: o */
    public boolean f4106o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPhotoPreviewView.InterfaceC2166c f4107p;

    /* JADX INFO: renamed from: q */
    public Runnable f4108q;

    /* JADX INFO: renamed from: r */
    public j2h f4109r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC2160a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC2160a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumLivePhotoView.this.f4102k = new Surface(surfaceTexture);
            PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
            photoAlbumLivePhotoView.removeCallbacks(photoAlbumLivePhotoView.f4108q);
            Matrix matrix = new Matrix();
            PhotoAlbumLivePhotoView.this.f4092a.getTransform(matrix);
            PhotoAlbumLivePhotoView.this.f4092a.setTransform(matrix);
            if (PhotoAlbumLivePhotoView.this.m6472t()) {
                PhotoAlbumLivePhotoView.this.m6478z();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoAlbumLivePhotoView.this.f4104m) {
                PhotoAlbumLivePhotoView.this.m6465B();
            }
            PhotoAlbumLivePhotoView.this.f4102k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(PhotoAlbumLivePhotoView.this.f4105n) && PhotoAlbumLivePhotoView.this.m6472t()) {
                PhotoAlbumLivePhotoView.this.f4105n.c();
                if (PhotoAlbumLivePhotoView.this.f4093b.getAlpha() == 1.0f) {
                    PhotoAlbumLivePhotoView.this.f4105n.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$b */
    public class C2161b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f4111a;

        public C2161b(float f) {
            this.f4111a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f4111a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$c */
    public class C2162c implements j2h {
        public C2162c() {
        }

        @Override // p007l.j2h
        /* JADX INFO: renamed from: a */
        public void mo6479a(float f, float f2) {
            xdl0.M(PhotoAlbumLivePhotoView.this.f4094c, false);
        }

        @Override // p007l.j2h
        /* JADX INFO: renamed from: b */
        public void mo6480b() {
            xdl0.M(PhotoAlbumLivePhotoView.this.f4094c, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$d */
    public class C2163d implements c680.a {
        public C2163d() {
        }

        /* JADX INFO: renamed from: a */
        public void m6481a(Exception exc) {
            PhotoAlbumLivePhotoView.this.m6465B();
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).a(exc);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m6482b(int i) {
            if (PhotoAlbumLivePhotoView.this.f4106o) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumLivePhotoView.this.f4103l.duration) * PhotoAlbumLivePhotoView.this.f4095d.getMax());
                PhotoAlbumLivePhotoView.this.f4095d.setProgress(max);
                PhotoAlbumLivePhotoView.this.f4098g.setProgress(max);
                PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
                photoAlbumLivePhotoView.f4097f.setText(photoAlbumLivePhotoView.m6470r(i));
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).b(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m6483c() {
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m6484d() {
            m6485e();
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m6485e() {
            PhotoAlbumLivePhotoView.this.f4104m = false;
            PhotoAlbumLivePhotoView.this.f4093b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f4094c.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f4092a.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumLivePhotoView.this.f4106o) {
                PhotoAlbumLivePhotoView.this.f4095d.setProgress(0);
                PhotoAlbumLivePhotoView.this.f4098g.setProgress(0);
                PhotoAlbumLivePhotoView.this.f4095d.setVisibility(8);
                PhotoAlbumLivePhotoView.this.f4096e.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: f */
        public Video m6486f() {
            return PhotoAlbumLivePhotoView.this.f4103l;
        }

        /* JADX INFO: renamed from: g */
        public void m6487g() {
        }

        public Surface getSurface() {
            return PhotoAlbumLivePhotoView.this.f4102k;
        }

        public void onComplete() {
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onComplete();
            }
        }

        public void onPause() {
            PhotoAlbumLivePhotoView.this.f4104m = false;
            if (PhotoAlbumLivePhotoView.this.f4106o) {
                PhotoAlbumLivePhotoView.this.f4096e.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f4095d.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onPause();
            }
        }

        public void onResume() {
            if (PhotoAlbumLivePhotoView.this.f4093b.getAlpha() > 0.0f) {
                PhotoAlbumLivePhotoView.this.f4093b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f4094c.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f4092a.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumLivePhotoView.this.f4106o) {
                PhotoAlbumLivePhotoView.this.f4095d.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f4096e.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onResume();
            }
        }

        public void onStart() {
            Iterator it = PhotoAlbumLivePhotoView.this.f4101j.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context) {
        super(context);
        this.f4100i = new C2163d();
        this.f4101j = new HashSet();
        this.f4109r = new C2162c();
        m6471s();
    }

    /* JADX INFO: renamed from: A */
    public final void m6464A(boolean z) {
        if (this.f4102k == null) {
            Runnable runnable = this.f4108q;
            if (runnable == null) {
                this.f4108q = new Runnable() { // from class: l.z970
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15666a.m6475w();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f4108q, 10000L);
        }
        if (NullChecker.a(this.f4105n) && NullChecker.a(this.f4103l)) {
            this.f4104m = true;
            if (NullChecker.a(this.f4102k)) {
                this.f4105n.d(this.f4100i, z);
            } else {
                this.f4100i.m6483c();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m6465B() {
        removeCallbacks(this.f4108q);
        this.f4104m = false;
        if (NullChecker.a(this.f4105n)) {
            this.f4105n.stop();
        }
    }

    public j2h getDragBackListener() {
        return this.f4109r;
    }

    /* JADX INFO: renamed from: n */
    public View m6466n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aa70.m8467b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m6467o(c680.b bVar) {
        this.f4101j.add(bVar);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m6468p();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.a(this.f4105n)) {
            this.f4105n.f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: p */
    public final void m6468p() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f4103l) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.a(picture) && NullChecker.a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.a(this.f4103l.size)) {
                    dimension = this.f4103l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.a(this.f4103l.size)) {
            dimension = this.f4103l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f4093b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f4093b.post(new Runnable() { // from class: l.x970
            @Override // java.lang.Runnable
            public final void run() {
                this.f14813a.m6473u();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: q */
    public void m6469q(int i, int i2) {
        Dimension dimension;
        Video video = this.f4103l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f4103l.size)) {
                    dimension = this.f4103l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f4103l.size)) {
            dimension = this.f4103l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f4093b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f4093b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: r */
    public final String m6470r(int i) {
        boolean z = (((int) this.f4103l.duration) / 60) / 60 > 0;
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

    /* JADX INFO: renamed from: s */
    public final void m6471s() {
        m6466n(LayoutInflater.from(getContext()), this);
        this.f4093b.setOnViewTapListener(new zg50() { // from class: l.y970
            /* JADX INFO: renamed from: a */
            public final void m17000a(View view, float f, float f2) {
                this.f15326a.m6474v(view, f, f2);
            }
        });
        this.f4092a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2160a());
    }

    public void setOnTapListener(PhotoAlbumPhotoPreviewView.InterfaceC2166c interfaceC2166c) {
        this.f4107p = interfaceC2166c;
    }

    public void setPlayer(c680 c680Var) {
        this.f4105n = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f4106o = z;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f4092a)) {
            C2161b c2161b = new C2161b(f);
            this.f4092a.setOutlineProvider(c2161b);
            this.f4092a.setClipToOutline(true);
            this.f4093b.setOutlineProvider(c2161b);
            this.f4093b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        if (this.f4104m) {
            m6465B();
        }
        this.f4103l = video;
        qib0.G.o(this.f4093b);
        if (NullChecker.b(video)) {
            if (this.f4106o) {
                this.f4097f.setText(m6470r(0));
                this.f4099h.setText(m6470r((int) (video.duration * 1000.0f)));
                this.f4095d.setProgress(0);
                this.f4098g.setProgress(0);
            }
            Picture pictureCover = video.cover();
            if (NullChecker.a(pictureCover) && NullChecker.b(pictureCover.url)) {
                if (TEnum.equals(pictureCover.status, "normal")) {
                    qib0.G.B0(this.f4093b, pictureCover.aspectRatioBiggest());
                } else {
                    qib0.G.i0(this.f4093b, pictureCover.url);
                }
            } else if (video.url.contains("http")) {
                this.f4093b.setBackgroundColor(getResources().getColor(e1c0.f7128a));
            } else {
                qib0.G.i0(this.f4093b, video.url);
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public boolean m6472t() {
        return this.f4104m;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m6473u() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m6474v(View view, float f, float f2) {
        m6477y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m6475w() {
        if (this.f4102k == null && NullChecker.a(this.f4100i)) {
            lsi0.h(R$string.f327A4);
            this.f4100i.m6484d();
            Iterator<c680.b> it = this.f4101j.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m6476x(boolean z) {
        c680 c680Var = this.f4105n;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: y */
    public final void m6477y() {
        if (NullChecker.a(this.f4107p)) {
            this.f4107p.mo3330a();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m6478z() {
        m6464A(false);
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f4100i = new C2163d();
        this.f4101j = new HashSet();
        this.f4109r = new C2162c();
        m6471s();
    }
}
