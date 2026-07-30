package com.p046p1.mobile.putong.feed.newui.preview.pageritem;

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
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;
import p149l.aa70;
import p149l.c680;
import p149l.e1c0;
import p149l.j2h;
import p149l.lsi0;
import p149l.qib0;
import p149l.xdl0;
import p149l.zg50;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumLivePhotoView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f42631a;

    /* JADX INFO: renamed from: b */
    public PhotoDraweeView f42632b;

    /* JADX INFO: renamed from: c */
    public VLinear f42633c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f42634d;

    /* JADX INFO: renamed from: e */
    public VLinear f42635e;

    /* JADX INFO: renamed from: f */
    public VText f42636f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f42637g;

    /* JADX INFO: renamed from: h */
    public VText f42638h;

    /* JADX INFO: renamed from: i */
    public C11319d f42639i;

    /* JADX INFO: renamed from: j */
    public final Set<c680.InterfaceC16084b> f42640j;

    /* JADX INFO: renamed from: k */
    public Surface f42641k;

    /* JADX INFO: renamed from: l */
    public Video f42642l;

    /* JADX INFO: renamed from: m */
    public boolean f42643m;

    /* JADX INFO: renamed from: n */
    public c680 f42644n;

    /* JADX INFO: renamed from: o */
    public boolean f42645o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPhotoPreviewView.InterfaceC11322c f42646p;

    /* JADX INFO: renamed from: q */
    public Runnable f42647q;

    /* JADX INFO: renamed from: r */
    public j2h f42648r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$a */
    public class TextureViewSurfaceTextureListenerC11316a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11316a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumLivePhotoView.this.f42641k = new Surface(surfaceTexture);
            PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
            photoAlbumLivePhotoView.removeCallbacks(photoAlbumLivePhotoView.f42647q);
            Matrix matrix = new Matrix();
            PhotoAlbumLivePhotoView.this.f42631a.getTransform(matrix);
            PhotoAlbumLivePhotoView.this.f42631a.setTransform(matrix);
            if (PhotoAlbumLivePhotoView.this.m65364t()) {
                PhotoAlbumLivePhotoView.this.m65370z();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoAlbumLivePhotoView.this.f42643m) {
                PhotoAlbumLivePhotoView.this.m65357B();
            }
            PhotoAlbumLivePhotoView.this.f42641k = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(PhotoAlbumLivePhotoView.this.f42644n) && PhotoAlbumLivePhotoView.this.m65364t()) {
                PhotoAlbumLivePhotoView.this.f42644n.mo105368c();
                if (PhotoAlbumLivePhotoView.this.f42632b.getAlpha() == 1.0f) {
                    PhotoAlbumLivePhotoView.this.f42644n.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$b */
    public class C11317b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f42650a;

        public C11317b(float f) {
            this.f42650a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f42650a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$c */
    public class C11318c implements j2h {
        public C11318c() {
        }

        @Override // p149l.j2h
        /* JADX INFO: renamed from: a */
        public void mo65371a(float f, float f2) {
            xdl0.m208344M(PhotoAlbumLivePhotoView.this.f42633c, false);
        }

        @Override // p149l.j2h
        /* JADX INFO: renamed from: b */
        public void mo65372b() {
            xdl0.m208344M(PhotoAlbumLivePhotoView.this.f42633c, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView$d */
    public class C11319d implements c680.InterfaceC16083a {
        public C11319d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            PhotoAlbumLivePhotoView.this.m65357B();
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            if (PhotoAlbumLivePhotoView.this.f42645o) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumLivePhotoView.this.f42642l.duration) * PhotoAlbumLivePhotoView.this.f42634d.getMax());
                PhotoAlbumLivePhotoView.this.f42634d.setProgress(max);
                PhotoAlbumLivePhotoView.this.f42637g.setProgress(max);
                PhotoAlbumLivePhotoView photoAlbumLivePhotoView = PhotoAlbumLivePhotoView.this;
                photoAlbumLivePhotoView.f42636f.setText(photoAlbumLivePhotoView.m65362r(i));
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            PhotoAlbumLivePhotoView.this.f42643m = false;
            PhotoAlbumLivePhotoView.this.f42632b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f42633c.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumLivePhotoView.this.f42631a.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumLivePhotoView.this.f42645o) {
                PhotoAlbumLivePhotoView.this.f42634d.setProgress(0);
                PhotoAlbumLivePhotoView.this.f42637g.setProgress(0);
                PhotoAlbumLivePhotoView.this.f42634d.setVisibility(8);
                PhotoAlbumLivePhotoView.this.f42635e.setVisibility(8);
            }
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return PhotoAlbumLivePhotoView.this.f42642l;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return PhotoAlbumLivePhotoView.this.f42641k;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            PhotoAlbumLivePhotoView.this.f42643m = false;
            if (PhotoAlbumLivePhotoView.this.f42645o) {
                PhotoAlbumLivePhotoView.this.f42635e.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f42634d.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            if (PhotoAlbumLivePhotoView.this.f42632b.getAlpha() > 0.0f) {
                PhotoAlbumLivePhotoView.this.f42632b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f42633c.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
                PhotoAlbumLivePhotoView.this.f42631a.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumLivePhotoView.this.f42645o) {
                PhotoAlbumLivePhotoView.this.f42634d.setVisibility(0);
                PhotoAlbumLivePhotoView.this.f42635e.setVisibility(8);
            }
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = PhotoAlbumLivePhotoView.this.f42640j.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context) {
        super(context);
        this.f42639i = new C11319d();
        this.f42640j = new HashSet();
        this.f42648r = new C11318c();
        m65363s();
    }

    /* JADX INFO: renamed from: A */
    public final void m65356A(boolean z) {
        if (this.f42641k == null) {
            Runnable runnable = this.f42647q;
            if (runnable == null) {
                this.f42647q = new Runnable() { // from class: l.z970
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202277a.m65367w();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f42647q, 10000L);
        }
        if (NullChecker.m81303a(this.f42644n) && NullChecker.m81303a(this.f42642l)) {
            this.f42643m = true;
            if (NullChecker.m81303a(this.f42641k)) {
                this.f42644n.mo105369d(this.f42639i, z);
            } else {
                this.f42639i.mo44052c();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m65357B() {
        removeCallbacks(this.f42647q);
        this.f42643m = false;
        if (NullChecker.m81303a(this.f42644n)) {
            this.f42644n.stop();
        }
    }

    public j2h getDragBackListener() {
        return this.f42648r;
    }

    /* JADX INFO: renamed from: n */
    public View m65358n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aa70.m95531b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m65359o(c680.InterfaceC16084b interfaceC16084b) {
        this.f42640j.add(interfaceC16084b);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m65360p();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m81303a(this.f42644n)) {
            this.f42644n.mo105371f(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: p */
    public final void m65360p() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f42642l) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(this.f42642l.size)) {
                    dimension = this.f42642l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(this.f42642l.size)) {
            dimension = this.f42642l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f42632b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f42632b.post(new Runnable() { // from class: l.x970
            @Override // java.lang.Runnable
            public final void run() {
                this.f191580a.m65365u();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: q */
    public void m65361q(int i, int i2) {
        Dimension dimension;
        Video video = this.f42642l;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f42642l.size)) {
                    dimension = this.f42642l.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f42642l.size)) {
            dimension = this.f42642l.size;
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
        ViewGroup.LayoutParams layoutParams = this.f42632b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f42632b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: r */
    public final String m65362r(int i) {
        boolean z = (((int) this.f42642l.duration) / 60) / 60 > 0;
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
    public final void m65363s() {
        m65358n(LayoutInflater.from(getContext()), this);
        this.f42632b.setOnViewTapListener(new zg50() { // from class: l.y970
            @Override // p149l.zg50
            /* JADX INFO: renamed from: a */
            public final void mo105925a(View view, float f, float f2) {
                this.f196939a.m65366v(view, f, f2);
            }
        });
        this.f42631a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11316a());
    }

    public void setOnTapListener(PhotoAlbumPhotoPreviewView.InterfaceC11322c interfaceC11322c) {
        this.f42646p = interfaceC11322c;
    }

    public void setPlayer(c680 c680Var) {
        this.f42644n = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f42645o = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f42631a)) {
            C11317b c11317b = new C11317b(f);
            this.f42631a.setOutlineProvider(c11317b);
            this.f42631a.setClipToOutline(true);
            this.f42632b.setOutlineProvider(c11317b);
            this.f42632b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        if (this.f42643m) {
            m65357B();
        }
        this.f42642l = video;
        qib0.f154691G.m184725o(this.f42632b);
        if (NullChecker.m81304b(video)) {
            if (this.f42645o) {
                this.f42636f.setText(m65362r(0));
                this.f42638h.setText(m65362r((int) (video.duration * 1000.0f)));
                this.f42634d.setProgress(0);
                this.f42637g.setProgress(0);
            }
            Picture pictureCover = video.cover();
            if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
                if (TEnum.equals(pictureCover.status, "normal")) {
                    qib0.f154691G.m102312B0(this.f42632b, pictureCover.aspectRatioBiggest());
                } else {
                    qib0.f154691G.m102363i0(this.f42632b, pictureCover.url);
                }
            } else if (video.url.contains("http")) {
                this.f42632b.setBackgroundColor(getResources().getColor(e1c0.f88772a));
            } else {
                qib0.f154691G.m102363i0(this.f42632b, video.url);
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public boolean m65364t() {
        return this.f42643m;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m65365u() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m65366v(View view, float f, float f2) {
        m65369y();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m65367w() {
        if (this.f42641k == null && NullChecker.m81303a(this.f42639i)) {
            lsi0.m151578h(R$string.f38866A4);
            this.f42639i.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f42640j.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m65368x(boolean z) {
        c680 c680Var = this.f42644n;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: y */
    public final void m65369y() {
        if (NullChecker.m81303a(this.f42646p)) {
            this.f42646p.mo62336a();
        }
    }

    /* JADX INFO: renamed from: z */
    public void m65370z() {
        m65356A(false);
    }

    public PhotoAlbumLivePhotoView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f42639i = new C11319d();
        this.f42640j = new HashSet();
        this.f42648r = new C11318c();
        m65363s();
    }
}
