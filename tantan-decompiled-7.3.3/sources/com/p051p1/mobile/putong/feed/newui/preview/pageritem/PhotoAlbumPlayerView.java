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
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p153l.aj70;
import p153l.bnl0;
import p153l.hdc0;
import p153l.ie80;
import p153l.k9c0;
import p153l.o1j0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumPlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f43512a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f43513b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f43514c;

    /* JADX INFO: renamed from: d */
    public VLinear f43515d;

    /* JADX INFO: renamed from: e */
    public VText f43516e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f43517f;

    /* JADX INFO: renamed from: g */
    public VText f43518g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f43519h;

    /* JADX INFO: renamed from: i */
    public ImageView f43520i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f43521j;

    /* JADX INFO: renamed from: k */
    public C11489d f43522k;

    /* JADX INFO: renamed from: l */
    public final Set<ie80.InterfaceC17710b> f43523l;

    /* JADX INFO: renamed from: m */
    public Surface f43524m;

    /* JADX INFO: renamed from: n */
    public Video f43525n;

    /* JADX INFO: renamed from: o */
    public boolean f43526o;

    /* JADX INFO: renamed from: p */
    public ie80 f43527p;

    /* JADX INFO: renamed from: q */
    public boolean f43528q;

    /* JADX INFO: renamed from: r */
    public boolean f43529r;

    /* JADX INFO: renamed from: s */
    public boolean f43530s;

    /* JADX INFO: renamed from: t */
    public boolean f43531t;

    /* JADX INFO: renamed from: u */
    public InterfaceC11488c f43532u;

    /* JADX INFO: renamed from: v */
    public View.OnClickListener f43533v;

    /* JADX INFO: renamed from: w */
    public Runnable f43534w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$a */
    public class TextureViewSurfaceTextureListenerC11486a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11486a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumPlayerView.this.f43524m = new Surface(surfaceTexture);
            PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
            photoAlbumPlayerView.removeCallbacks(photoAlbumPlayerView.f43534w);
            Matrix matrix = new Matrix();
            PhotoAlbumPlayerView.this.f43512a.getTransform(matrix);
            PhotoAlbumPlayerView.this.f43512a.setTransform(matrix);
            if (PhotoAlbumPlayerView.this.m66614y()) {
                PhotoAlbumPlayerView.this.m66601F();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PhotoAlbumPlayerView.this.m66605J();
            PhotoAlbumPlayerView.this.f43524m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(PhotoAlbumPlayerView.this.f43527p) && PhotoAlbumPlayerView.this.m66614y()) {
                PhotoAlbumPlayerView.this.f43527p.mo139593c();
                if (PhotoAlbumPlayerView.this.f43513b.getAlpha() == 1.0f || PhotoAlbumPlayerView.this.f43519h.getAlpha() == 1.0f) {
                    PhotoAlbumPlayerView.this.f43527p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$b */
    public class C11487b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f43536a;

        public C11487b(float f) {
            this.f43536a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f43536a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$c */
    public interface InterfaceC11488c {
        /* JADX INFO: renamed from: a */
        void mo66616a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$d */
    public class C11489d implements ie80.InterfaceC17709a {
        public C11489d() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            PhotoAlbumPlayerView.this.m66605J();
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            if (PhotoAlbumPlayerView.this.f43528q) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumPlayerView.this.f43525n.duration) * PhotoAlbumPlayerView.this.f43514c.getMax());
                PhotoAlbumPlayerView.this.f43514c.setProgress(max);
                PhotoAlbumPlayerView.this.f43517f.setProgress(max);
                PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
                photoAlbumPlayerView.f43516e.setText(photoAlbumPlayerView.m66611v(i));
            }
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            PhotoAlbumPlayerView.this.m66610u(hdc0.f108838H0);
            if (PhotoAlbumPlayerView.this.f43519h.getAlpha() < 1.0f) {
                PhotoAlbumPlayerView.this.f43519h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            PhotoAlbumPlayerView.this.f43526o = false;
            PhotoAlbumPlayerView.this.m66610u(hdc0.f108955q1);
            PhotoAlbumPlayerView.this.f43519h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumPlayerView.this.f43513b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f43528q) {
                PhotoAlbumPlayerView.this.f43514c.setProgress(0);
                PhotoAlbumPlayerView.this.f43517f.setProgress(0);
                PhotoAlbumPlayerView.this.f43514c.setVisibility(8);
                PhotoAlbumPlayerView.this.f43515d.setVisibility(8);
            }
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return PhotoAlbumPlayerView.this.f43525n;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return PhotoAlbumPlayerView.this.f43524m;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
            if (PhotoAlbumPlayerView.this.f43529r) {
                PhotoAlbumPlayerView.this.m66602G(true);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            PhotoAlbumPlayerView.this.f43526o = false;
            PhotoAlbumPlayerView.this.m66610u(hdc0.f108955q1);
            PhotoAlbumPlayerView.this.f43519h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f43528q) {
                PhotoAlbumPlayerView.this.f43515d.setVisibility(0);
                PhotoAlbumPlayerView.this.f43514c.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            PhotoAlbumPlayerView.this.f43519h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f43513b.getAlpha() > 0.0f) {
                PhotoAlbumPlayerView.this.f43513b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumPlayerView.this.f43528q) {
                PhotoAlbumPlayerView.this.f43514c.setVisibility(0);
                PhotoAlbumPlayerView.this.f43515d.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = PhotoAlbumPlayerView.this.f43523l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumPlayerView(@NonNull Context context) {
        super(context);
        this.f43522k = new C11489d();
        this.f43523l = new HashSet();
        this.f43531t = false;
        this.f43533v = new View.OnClickListener() { // from class: l.wi70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189345a.m66597B(view);
            }
        };
        m66612w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m66596A(View view) {
        if (m66614y()) {
            m66600E();
        } else {
            m66601F();
        }
        if (NullChecker.m82486a(this.f43532u)) {
            this.f43532u.mo66616a(m66614y());
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m66597B(View view) {
        if (m66614y()) {
            m66600E();
        } else {
            m66601F();
        }
        if (NullChecker.m82486a(this.f43532u)) {
            this.f43532u.mo66616a(m66614y());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m66598C() {
        if (this.f43524m == null && NullChecker.m82486a(this.f43522k)) {
            if (!this.f43530s) {
                o1j0.m165634h(R$string.f39714A4);
            }
            this.f43522k.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f43523l.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m66599D(boolean z) {
        ie80 ie80Var = this.f43527p;
        if (ie80Var == null) {
            return;
        }
        ie80Var.mute(z);
    }

    /* JADX INFO: renamed from: E */
    public void m66600E() {
        removeCallbacks(this.f43534w);
        this.f43526o = false;
        if (NullChecker.m82486a(this.f43527p)) {
            this.f43527p.pause();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m66601F() {
        m66602G(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m66602G(boolean z) {
        if (this.f43524m == null) {
            Runnable runnable = this.f43534w;
            if (runnable == null) {
                this.f43534w = new Runnable() { // from class: l.yi70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f200022a.m66598C();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f43534w, 10000L);
        }
        if (NullChecker.m82486a(this.f43527p) && NullChecker.m82486a(this.f43525n)) {
            this.f43526o = true;
            if (NullChecker.m82486a(this.f43524m)) {
                this.f43527p.mo139594d(this.f43522k, z);
            } else {
                this.f43522k.mo45235c();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m66603H() {
        this.f43522k = new C11489d();
    }

    /* JADX INFO: renamed from: I */
    public void m66604I(Video video, boolean z) {
        if (this.f43526o) {
            m66605J();
        }
        this.f43525n = video;
        uqb0.f180374G.m98798o(this.f43513b);
        if (NullChecker.m82487b(video)) {
            if (this.f43528q) {
                this.f43516e.setText(m66611v(0));
                this.f43518g.setText(m66611v((int) (video.duration * 1000.0f)));
                this.f43514c.setProgress(0);
                this.f43517f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        uqb0.f180374G.m127096B0(this.f43513b, pictureCover.aspectRatioBiggest());
                    } else {
                        uqb0.f180374G.m127146i0(this.f43513b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f43513b.setBackgroundColor(getResources().getColor(k9c0.f124495a));
                } else {
                    uqb0.f180374G.m127146i0(this.f43513b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m66605J() {
        removeCallbacks(this.f43534w);
        this.f43526o = false;
        if (NullChecker.m82486a(this.f43527p)) {
            this.f43527p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f43531t) {
            return;
        }
        m66608s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m82486a(this.f43527p)) {
            this.f43527p.mo139596f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m66606q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj70.m98354b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m66607r(ie80.InterfaceC17710b interfaceC17710b) {
        this.f43523l.add(interfaceC17710b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m66608s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f43525n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(this.f43525n.size)) {
                    dimension = this.f43525n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(this.f43525n.size)) {
            dimension = this.f43525n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43513b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f43513b.post(new Runnable() { // from class: l.xi70
            @Override // java.lang.Runnable
            public final void run() {
                this.f194438a.m66615z();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f43529r = z;
    }

    public void setOnClickButtonListener(InterfaceC11488c interfaceC11488c) {
        this.f43532u = interfaceC11488c;
    }

    public void setPlayer(ie80 ie80Var) {
        this.f43527p = ie80Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f43528q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f43512a)) {
            C11487b c11487b = new C11487b(f);
            this.f43512a.setOutlineProvider(c11487b);
            this.f43512a.setClipToOutline(true);
            this.f43513b.setOutlineProvider(c11487b);
            this.f43513b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m66604I(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m66609t(int i, int i2) {
        Dimension dimension;
        Video video = this.f43525n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82487b(this.f43525n.size)) {
                    dimension = this.f43525n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f43525n.size)) {
            dimension = this.f43525n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43513b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f43513b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m66610u(int i) {
        for (int i2 = 0; i2 < this.f43519h.getChildCount(); i2++) {
            View childAt = this.f43519h.getChildAt(i2);
            if (this.f43530s) {
                bnl0.m105525M0(childAt, (i != childAt.getId() || i == hdc0.f108928i1 || i == hdc0.f108838H0) ? false : true);
            } else {
                bnl0.m105525M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m66611v(int i) {
        boolean z = (((int) this.f43525n.duration) / 60) / 60 > 0;
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
    public final void m66612w() {
        m66606q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f43533v);
        this.f43519h.setOnClickListener(new View.OnClickListener() { // from class: l.zi70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204496a.m66596A(view);
            }
        });
        this.f43512a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11486a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m66613x() {
        return this.f43527p.mo139595e();
    }

    /* JADX INFO: renamed from: y */
    public boolean m66614y() {
        return this.f43526o;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m66615z() {
        requestLayout();
        invalidate();
    }

    public PhotoAlbumPlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f43522k = new C11489d();
        this.f43523l = new HashSet();
        this.f43531t = false;
        this.f43533v = new View.OnClickListener() { // from class: l.wi70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189345a.m66597B(view);
            }
        };
        m66612w();
    }
}
