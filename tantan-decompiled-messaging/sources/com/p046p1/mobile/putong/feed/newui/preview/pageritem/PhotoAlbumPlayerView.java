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
import android.widget.ImageView;
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
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.b5c0;
import p149l.c680;
import p149l.e1c0;
import p149l.lsi0;
import p149l.qib0;
import p149l.ua70;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumPlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f42664a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42665b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f42666c;

    /* JADX INFO: renamed from: d */
    public VLinear f42667d;

    /* JADX INFO: renamed from: e */
    public VText f42668e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f42669f;

    /* JADX INFO: renamed from: g */
    public VText f42670g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f42671h;

    /* JADX INFO: renamed from: i */
    public ImageView f42672i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f42673j;

    /* JADX INFO: renamed from: k */
    public C11326d f42674k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.InterfaceC16084b> f42675l;

    /* JADX INFO: renamed from: m */
    public Surface f42676m;

    /* JADX INFO: renamed from: n */
    public Video f42677n;

    /* JADX INFO: renamed from: o */
    public boolean f42678o;

    /* JADX INFO: renamed from: p */
    public c680 f42679p;

    /* JADX INFO: renamed from: q */
    public boolean f42680q;

    /* JADX INFO: renamed from: r */
    public boolean f42681r;

    /* JADX INFO: renamed from: s */
    public boolean f42682s;

    /* JADX INFO: renamed from: t */
    public boolean f42683t;

    /* JADX INFO: renamed from: u */
    public InterfaceC11325c f42684u;

    /* JADX INFO: renamed from: v */
    public View.OnClickListener f42685v;

    /* JADX INFO: renamed from: w */
    public Runnable f42686w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$a */
    public class TextureViewSurfaceTextureListenerC11323a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11323a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoAlbumPlayerView.this.f42676m = new Surface(surfaceTexture);
            PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
            photoAlbumPlayerView.removeCallbacks(photoAlbumPlayerView.f42686w);
            Matrix matrix = new Matrix();
            PhotoAlbumPlayerView.this.f42664a.getTransform(matrix);
            PhotoAlbumPlayerView.this.f42664a.setTransform(matrix);
            if (PhotoAlbumPlayerView.this.m65431y()) {
                PhotoAlbumPlayerView.this.m65418F();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PhotoAlbumPlayerView.this.m65422J();
            PhotoAlbumPlayerView.this.f42676m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(PhotoAlbumPlayerView.this.f42679p) && PhotoAlbumPlayerView.this.m65431y()) {
                PhotoAlbumPlayerView.this.f42679p.mo105368c();
                if (PhotoAlbumPlayerView.this.f42665b.getAlpha() == 1.0f || PhotoAlbumPlayerView.this.f42671h.getAlpha() == 1.0f) {
                    PhotoAlbumPlayerView.this.f42679p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$b */
    public class C11324b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f42688a;

        public C11324b(float f) {
            this.f42688a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f42688a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$c */
    public interface InterfaceC11325c {
        /* JADX INFO: renamed from: a */
        void mo65433a(boolean z);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView$d */
    public class C11326d implements c680.InterfaceC16083a {
        public C11326d() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            PhotoAlbumPlayerView.this.m65422J();
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            if (PhotoAlbumPlayerView.this.f42680q) {
                int max = (int) (((i / 1000.0f) / PhotoAlbumPlayerView.this.f42677n.duration) * PhotoAlbumPlayerView.this.f42666c.getMax());
                PhotoAlbumPlayerView.this.f42666c.setProgress(max);
                PhotoAlbumPlayerView.this.f42669f.setProgress(max);
                PhotoAlbumPlayerView photoAlbumPlayerView = PhotoAlbumPlayerView.this;
                photoAlbumPlayerView.f42668e.setText(photoAlbumPlayerView.m65428v(i));
            }
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            PhotoAlbumPlayerView.this.m65427u(b5c0.f73485H0);
            if (PhotoAlbumPlayerView.this.f42671h.getAlpha() < 1.0f) {
                PhotoAlbumPlayerView.this.f42671h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            PhotoAlbumPlayerView.this.f42678o = false;
            PhotoAlbumPlayerView.this.m65427u(b5c0.f73602q1);
            PhotoAlbumPlayerView.this.f42671h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PhotoAlbumPlayerView.this.f42665b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f42680q) {
                PhotoAlbumPlayerView.this.f42666c.setProgress(0);
                PhotoAlbumPlayerView.this.f42669f.setProgress(0);
                PhotoAlbumPlayerView.this.f42666c.setVisibility(8);
                PhotoAlbumPlayerView.this.f42667d.setVisibility(8);
            }
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return PhotoAlbumPlayerView.this.f42677n;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return PhotoAlbumPlayerView.this.f42676m;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
            if (PhotoAlbumPlayerView.this.f42681r) {
                PhotoAlbumPlayerView.this.m65419G(true);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            PhotoAlbumPlayerView.this.f42678o = false;
            PhotoAlbumPlayerView.this.m65427u(b5c0.f73602q1);
            PhotoAlbumPlayerView.this.f42671h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f42680q) {
                PhotoAlbumPlayerView.this.f42667d.setVisibility(0);
                PhotoAlbumPlayerView.this.f42666c.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            PhotoAlbumPlayerView.this.f42671h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PhotoAlbumPlayerView.this.f42665b.getAlpha() > 0.0f) {
                PhotoAlbumPlayerView.this.f42665b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PhotoAlbumPlayerView.this.f42680q) {
                PhotoAlbumPlayerView.this.f42666c.setVisibility(0);
                PhotoAlbumPlayerView.this.f42667d.setVisibility(8);
            }
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = PhotoAlbumPlayerView.this.f42675l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public PhotoAlbumPlayerView(@NonNull Context context) {
        super(context);
        this.f42674k = new C11326d();
        this.f42675l = new HashSet();
        this.f42683t = false;
        this.f42685v = new View.OnClickListener() { // from class: l.qa70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153514a.m65414B(view);
            }
        };
        m65429w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m65413A(View view) {
        if (m65431y()) {
            m65417E();
        } else {
            m65418F();
        }
        if (NullChecker.m81303a(this.f42684u)) {
            this.f42684u.mo65433a(m65431y());
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m65414B(View view) {
        if (m65431y()) {
            m65417E();
        } else {
            m65418F();
        }
        if (NullChecker.m81303a(this.f42684u)) {
            this.f42684u.mo65433a(m65431y());
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m65415C() {
        if (this.f42676m == null && NullChecker.m81303a(this.f42674k)) {
            if (!this.f42682s) {
                lsi0.m151578h(R$string.f38866A4);
            }
            this.f42674k.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f42675l.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m65416D(boolean z) {
        c680 c680Var = this.f42679p;
        if (c680Var == null) {
            return;
        }
        c680Var.mute(z);
    }

    /* JADX INFO: renamed from: E */
    public void m65417E() {
        removeCallbacks(this.f42686w);
        this.f42678o = false;
        if (NullChecker.m81303a(this.f42679p)) {
            this.f42679p.pause();
        }
    }

    /* JADX INFO: renamed from: F */
    public void m65418F() {
        m65419G(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m65419G(boolean z) {
        if (this.f42676m == null) {
            Runnable runnable = this.f42686w;
            if (runnable == null) {
                this.f42686w = new Runnable() { // from class: l.sa70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f163311a.m65415C();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f42686w, 10000L);
        }
        if (NullChecker.m81303a(this.f42679p) && NullChecker.m81303a(this.f42677n)) {
            this.f42678o = true;
            if (NullChecker.m81303a(this.f42676m)) {
                this.f42679p.mo105369d(this.f42674k, z);
            } else {
                this.f42674k.mo44052c();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m65420H() {
        this.f42674k = new C11326d();
    }

    /* JADX INFO: renamed from: I */
    public void m65421I(Video video, boolean z) {
        if (this.f42678o) {
            m65422J();
        }
        this.f42677n = video;
        qib0.f154691G.m184725o(this.f42665b);
        if (NullChecker.m81304b(video)) {
            if (this.f42680q) {
                this.f42668e.setText(m65428v(0));
                this.f42670g.setText(m65428v((int) (video.duration * 1000.0f)));
                this.f42666c.setProgress(0);
                this.f42669f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        qib0.f154691G.m102312B0(this.f42665b, pictureCover.aspectRatioBiggest());
                    } else {
                        qib0.f154691G.m102363i0(this.f42665b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f42665b.setBackgroundColor(getResources().getColor(e1c0.f88772a));
                } else {
                    qib0.f154691G.m102363i0(this.f42665b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: J */
    public void m65422J() {
        removeCallbacks(this.f42686w);
        this.f42678o = false;
        if (NullChecker.m81303a(this.f42679p)) {
            this.f42679p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f42683t) {
            return;
        }
        m65425s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m81303a(this.f42679p)) {
            this.f42679p.mo105371f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m65423q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ua70.m192735b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m65424r(c680.InterfaceC16084b interfaceC16084b) {
        this.f42675l.add(interfaceC16084b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m65425s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f42677n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(this.f42677n.size)) {
                    dimension = this.f42677n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(this.f42677n.size)) {
            dimension = this.f42677n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f42665b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f42665b.post(new Runnable() { // from class: l.ra70
            @Override // java.lang.Runnable
            public final void run() {
                this.f158491a.m65432z();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f42681r = z;
    }

    public void setOnClickButtonListener(InterfaceC11325c interfaceC11325c) {
        this.f42684u = interfaceC11325c;
    }

    public void setPlayer(c680 c680Var) {
        this.f42679p = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f42680q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f42664a)) {
            C11324b c11324b = new C11324b(f);
            this.f42664a.setOutlineProvider(c11324b);
            this.f42664a.setClipToOutline(true);
            this.f42665b.setOutlineProvider(c11324b);
            this.f42665b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m65421I(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m65426t(int i, int i2) {
        Dimension dimension;
        Video video = this.f42677n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f42677n.size)) {
                    dimension = this.f42677n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f42677n.size)) {
            dimension = this.f42677n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f42665b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f42665b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m65427u(int i) {
        for (int i2 = 0; i2 < this.f42671h.getChildCount(); i2++) {
            View childAt = this.f42671h.getChildAt(i2);
            if (this.f42682s) {
                xdl0.m208345M0(childAt, (i != childAt.getId() || i == b5c0.f73575i1 || i == b5c0.f73485H0) ? false : true);
            } else {
                xdl0.m208345M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m65428v(int i) {
        boolean z = (((int) this.f42677n.duration) / 60) / 60 > 0;
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
    public final void m65429w() {
        m65423q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f42685v);
        this.f42671h.setOnClickListener(new View.OnClickListener() { // from class: l.ta70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169099a.m65413A(view);
            }
        });
        this.f42664a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11323a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m65430x() {
        return this.f42679p.mo105370e();
    }

    /* JADX INFO: renamed from: y */
    public boolean m65431y() {
        return this.f42678o;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m65432z() {
        requestLayout();
        invalidate();
    }

    public PhotoAlbumPlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f42674k = new C11326d();
        this.f42675l = new HashSet();
        this.f42683t = false;
        this.f42685v = new View.OnClickListener() { // from class: l.qa70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153514a.m65414B(view);
            }
        };
        m65429w();
    }
}
