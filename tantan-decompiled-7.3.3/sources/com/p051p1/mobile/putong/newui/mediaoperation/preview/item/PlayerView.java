package com.p051p1.mobile.putong.newui.mediaoperation.preview.item;

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
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
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
import p153l.b9c0;
import p153l.bnl0;
import p153l.ie80;
import p153l.mh80;
import p153l.o1j0;
import p153l.uqb0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f54956a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54957b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f54958c;

    /* JADX INFO: renamed from: d */
    public VLinear f54959d;

    /* JADX INFO: renamed from: e */
    public VText f54960e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f54961f;

    /* JADX INFO: renamed from: g */
    public VText f54962g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f54963h;

    /* JADX INFO: renamed from: i */
    public ImageView f54964i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f54965j;

    /* JADX INFO: renamed from: k */
    public C13239c f54966k;

    /* JADX INFO: renamed from: l */
    public final Set<ie80.InterfaceC17710b> f54967l;

    /* JADX INFO: renamed from: m */
    public Surface f54968m;

    /* JADX INFO: renamed from: n */
    public Video f54969n;

    /* JADX INFO: renamed from: o */
    public boolean f54970o;

    /* JADX INFO: renamed from: p */
    public ie80 f54971p;

    /* JADX INFO: renamed from: q */
    public boolean f54972q;

    /* JADX INFO: renamed from: r */
    public boolean f54973r;

    /* JADX INFO: renamed from: s */
    public boolean f54974s;

    /* JADX INFO: renamed from: t */
    public boolean f54975t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f54976u;

    /* JADX INFO: renamed from: v */
    public Runnable f54977v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC13237a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC13237a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f54968m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f54977v);
            Matrix matrix = new Matrix();
            PlayerView.this.f54956a.getTransform(matrix);
            PlayerView.this.f54956a.setTransform(matrix);
            if (PlayerView.this.m80322x()) {
                PlayerView.this.m80311D();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m80314G();
            PlayerView.this.f54968m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m82486a(PlayerView.this.f54971p) && PlayerView.this.m80322x()) {
                PlayerView.this.f54971p.mo139593c();
                if (PlayerView.this.f54957b.getAlpha() == 1.0f || PlayerView.this.f54963h.getAlpha() == 1.0f) {
                    PlayerView.this.f54971p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$b */
    public class C13238b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f54979a;

        public C13238b(float f) {
            this.f54979a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f54979a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$c */
    public class C13239c implements ie80.InterfaceC17709a {
        public C13239c() {
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            PlayerView.this.m80314G();
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45233a(exc);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: b */
        public void mo45234b(int i) {
            if (PlayerView.this.f54972q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f54969n.duration) * PlayerView.this.f54958c.getMax());
                PlayerView.this.f54958c.setProgress(max);
                PlayerView.this.f54961f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f54960e.setText(playerView.m80320v(i));
            }
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45234b(i);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: c */
        public void mo45235c() {
            PlayerView.this.m80319u(ycc0.f198437T);
            if (PlayerView.this.f54963h.getAlpha() < 1.0f) {
                PlayerView.this.f54963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45235c();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            mo45237e();
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).mo45236d();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: e */
        public void mo45237e() {
            PlayerView.this.f54970o = false;
            PlayerView.this.m80319u(ycc0.f198445a0);
            PlayerView.this.f54963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f54957b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54972q) {
                PlayerView.this.f54958c.setProgress(0);
                PlayerView.this.f54961f.setProgress(0);
                PlayerView.this.f54958c.setVisibility(8);
                PlayerView.this.f54959d.setVisibility(8);
            }
        }

        @Override // p153l.ie80.InterfaceC17709a
        /* JADX INFO: renamed from: f */
        public Video mo45238f() {
            return PlayerView.this.f54969n;
        }

        @Override // p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: g */
        public void mo45239g() {
        }

        @Override // p153l.ie80.InterfaceC17709a
        public Surface getSurface() {
            return PlayerView.this.f54968m;
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onComplete() {
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onComplete();
            }
            if (PlayerView.this.f54973r) {
                PlayerView.this.m80312E(true);
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onPause() {
            PlayerView.this.f54970o = false;
            PlayerView.this.m80319u(ycc0.f198445a0);
            PlayerView.this.f54963h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54972q) {
                PlayerView.this.f54959d.setVisibility(0);
                PlayerView.this.f54958c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onPause();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onResume() {
            PlayerView.this.f54963h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54957b.getAlpha() > 0.0f) {
                PlayerView.this.f54957b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f54972q) {
                PlayerView.this.f54958c.setVisibility(0);
                PlayerView.this.f54959d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onResume();
            }
        }

        @Override // p153l.ie80.InterfaceC17710b
        public void onStart() {
            Iterator it = PlayerView.this.f54967l.iterator();
            while (it.hasNext()) {
                ((ie80.InterfaceC17710b) it.next()).onStart();
            }
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f54966k = new C13239c();
        this.f54967l = new HashSet();
        this.f54975t = false;
        this.f54976u = new View.OnClickListener() { // from class: l.bh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76737a.m80308A(view);
            }
        };
        m80321w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m80308A(View view) {
        if (m80322x()) {
            m80310C();
        } else {
            m80311D();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m80309B() {
        if (this.f54968m == null && NullChecker.m82486a(this.f54966k)) {
            if (!this.f54974s) {
                o1j0.m165634h(R$string.f18161h1);
            }
            this.f54966k.mo45236d();
            Iterator<ie80.InterfaceC17710b> it = this.f54967l.iterator();
            while (it.hasNext()) {
                it.next().mo45236d();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m80310C() {
        removeCallbacks(this.f54977v);
        this.f54970o = false;
        if (NullChecker.m82486a(this.f54971p)) {
            this.f54971p.pause();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m80311D() {
        m80312E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m80312E(boolean z) {
        if (this.f54968m == null) {
            Runnable runnable = this.f54977v;
            if (runnable == null) {
                this.f54977v = new Runnable() { // from class: l.eh80
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94010a.m80309B();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f54977v, 10000L);
        }
        if (NullChecker.m82486a(this.f54971p) && NullChecker.m82486a(this.f54969n)) {
            this.f54970o = true;
            if (NullChecker.m82486a(this.f54968m)) {
                this.f54971p.mo139594d(this.f54966k, z);
            } else {
                this.f54966k.mo45235c();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m80313F(Video video, boolean z) {
        if (this.f54970o) {
            m80314G();
        }
        this.f54969n = video;
        uqb0.f180374G.m98798o(this.f54957b);
        if (NullChecker.m82487b(video)) {
            if (this.f54972q) {
                this.f54960e.setText(m80320v(0));
                this.f54962g.setText(m80320v((int) (video.duration * 1000.0f)));
                this.f54958c.setProgress(0);
                this.f54961f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m82486a(pictureCover) && NullChecker.m82487b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        uqb0.f180374G.m127096B0(this.f54957b, pictureCover.aspectRatioBiggest());
                    } else {
                        uqb0.f180374G.m127146i0(this.f54957b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f54957b.setBackgroundColor(getResources().getColor(b9c0.f75555a));
                } else {
                    uqb0.f180374G.m127146i0(this.f54957b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public void m80314G() {
        removeCallbacks(this.f54977v);
        this.f54970o = false;
        if (NullChecker.m82486a(this.f54971p)) {
            this.f54971p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f54975t) {
            return;
        }
        m80317s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m82486a(this.f54971p)) {
            this.f54971p.mo139596f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m80315q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mh80.m158414b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m80316r(ie80.InterfaceC17710b interfaceC17710b) {
        this.f54967l.add(interfaceC17710b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m80317s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f54969n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(this.f54969n.size)) {
                    dimension = this.f54969n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(this.f54969n.size)) {
            dimension = this.f54969n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f54957b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f54957b.post(new Runnable() { // from class: l.yg80
            @Override // java.lang.Runnable
            public final void run() {
                this.f199739a.m80323y();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f54973r = z;
    }

    public void setPlayer(ie80 ie80Var) {
        this.f54971p = ie80Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f54972q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m82487b(this.f54956a)) {
            C13238b c13238b = new C13238b(f);
            this.f54956a.setOutlineProvider(c13238b);
            this.f54956a.setClipToOutline(true);
            this.f54957b.setOutlineProvider(c13238b);
            this.f54957b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m80313F(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m80318t(int i, int i2) {
        Dimension dimension;
        Video video = this.f54969n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82486a(picture) && NullChecker.m82486a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m82486a(this.f54969n.size)) {
                    dimension = this.f54969n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82486a(this.f54969n.size)) {
            dimension = this.f54969n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f54957b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f54957b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m80319u(int i) {
        for (int i2 = 0; i2 < this.f54963h.getChildCount(); i2++) {
            View childAt = this.f54963h.getChildAt(i2);
            bnl0.m105525M0(childAt, i == childAt.getId());
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m80320v(int i) {
        boolean z = (((int) this.f54969n.duration) / 60) / 60 > 0;
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
    public final void m80321w() {
        m80315q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f54976u);
        this.f54963h.setOnClickListener(new View.OnClickListener() { // from class: l.hh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109486a.m80324z(view);
            }
        });
        this.f54956a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC13237a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m80322x() {
        return this.f54970o;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m80323y() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m80324z(View view) {
        if (m80322x()) {
            m80310C();
        } else {
            m80311D();
        }
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f54966k = new C13239c();
        this.f54967l = new HashSet();
        this.f54975t = false;
        this.f54976u = new View.OnClickListener() { // from class: l.bh80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76737a.m80308A(view);
            }
        };
        m80321w();
    }
}
