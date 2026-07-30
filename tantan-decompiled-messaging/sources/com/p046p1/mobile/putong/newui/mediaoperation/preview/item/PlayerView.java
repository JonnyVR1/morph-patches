package com.p046p1.mobile.putong.newui.mediaoperation.preview.item;

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
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
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
import p149l.c680;
import p149l.g980;
import p149l.lsi0;
import p149l.qib0;
import p149l.s4c0;
import p149l.v0c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f54108a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f54109b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f54110c;

    /* JADX INFO: renamed from: d */
    public VLinear f54111d;

    /* JADX INFO: renamed from: e */
    public VText f54112e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f54113f;

    /* JADX INFO: renamed from: g */
    public VText f54114g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f54115h;

    /* JADX INFO: renamed from: i */
    public ImageView f54116i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f54117j;

    /* JADX INFO: renamed from: k */
    public C13076c f54118k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.InterfaceC16084b> f54119l;

    /* JADX INFO: renamed from: m */
    public Surface f54120m;

    /* JADX INFO: renamed from: n */
    public Video f54121n;

    /* JADX INFO: renamed from: o */
    public boolean f54122o;

    /* JADX INFO: renamed from: p */
    public c680 f54123p;

    /* JADX INFO: renamed from: q */
    public boolean f54124q;

    /* JADX INFO: renamed from: r */
    public boolean f54125r;

    /* JADX INFO: renamed from: s */
    public boolean f54126s;

    /* JADX INFO: renamed from: t */
    public boolean f54127t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f54128u;

    /* JADX INFO: renamed from: v */
    public Runnable f54129v;

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC13074a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC13074a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f54120m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f54129v);
            Matrix matrix = new Matrix();
            PlayerView.this.f54108a.getTransform(matrix);
            PlayerView.this.f54108a.setTransform(matrix);
            if (PlayerView.this.m79139x()) {
                PlayerView.this.m79128D();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m79131G();
            PlayerView.this.f54120m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(PlayerView.this.f54123p) && PlayerView.this.m79139x()) {
                PlayerView.this.f54123p.mo105368c();
                if (PlayerView.this.f54109b.getAlpha() == 1.0f || PlayerView.this.f54115h.getAlpha() == 1.0f) {
                    PlayerView.this.f54123p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$b */
    public class C13075b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f54131a;

        public C13075b(float f) {
            this.f54131a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f54131a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.preview.item.PlayerView$c */
    public class C13076c implements c680.InterfaceC16083a {
        public C13076c() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            PlayerView.this.m79131G();
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            if (PlayerView.this.f54124q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f54121n.duration) * PlayerView.this.f54110c.getMax());
                PlayerView.this.f54110c.setProgress(max);
                PlayerView.this.f54113f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f54112e.setText(playerView.m79137v(i));
            }
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            PlayerView.this.m79136u(s4c0.f162316T);
            if (PlayerView.this.f54115h.getAlpha() < 1.0f) {
                PlayerView.this.f54115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            PlayerView.this.f54122o = false;
            PlayerView.this.m79136u(s4c0.f162324a0);
            PlayerView.this.f54115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f54109b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54124q) {
                PlayerView.this.f54110c.setProgress(0);
                PlayerView.this.f54113f.setProgress(0);
                PlayerView.this.f54110c.setVisibility(8);
                PlayerView.this.f54111d.setVisibility(8);
            }
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return PlayerView.this.f54121n;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return PlayerView.this.f54120m;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
            if (PlayerView.this.f54125r) {
                PlayerView.this.m79129E(true);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            PlayerView.this.f54122o = false;
            PlayerView.this.m79136u(s4c0.f162324a0);
            PlayerView.this.f54115h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54124q) {
                PlayerView.this.f54111d.setVisibility(0);
                PlayerView.this.f54110c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            PlayerView.this.f54115h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f54109b.getAlpha() > 0.0f) {
                PlayerView.this.f54109b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f54124q) {
                PlayerView.this.f54110c.setVisibility(0);
                PlayerView.this.f54111d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = PlayerView.this.f54119l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f54118k = new C13076c();
        this.f54119l = new HashSet();
        this.f54127t = false;
        this.f54128u = new View.OnClickListener() { // from class: l.v880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180454a.m79125A(view);
            }
        };
        m79138w();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m79125A(View view) {
        if (m79139x()) {
            m79127C();
        } else {
            m79128D();
        }
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m79126B() {
        if (this.f54120m == null && NullChecker.m81303a(this.f54118k)) {
            if (!this.f54126s) {
                lsi0.m151578h(R$string.f17442h1);
            }
            this.f54118k.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f54119l.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m79127C() {
        removeCallbacks(this.f54129v);
        this.f54122o = false;
        if (NullChecker.m81303a(this.f54123p)) {
            this.f54123p.pause();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m79128D() {
        m79129E(false);
    }

    /* JADX INFO: renamed from: E */
    public final void m79129E(boolean z) {
        if (this.f54120m == null) {
            Runnable runnable = this.f54129v;
            if (runnable == null) {
                this.f54129v = new Runnable() { // from class: l.y880
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196783a.m79126B();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f54129v, 10000L);
        }
        if (NullChecker.m81303a(this.f54123p) && NullChecker.m81303a(this.f54121n)) {
            this.f54122o = true;
            if (NullChecker.m81303a(this.f54120m)) {
                this.f54123p.mo105369d(this.f54118k, z);
            } else {
                this.f54118k.mo44052c();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m79130F(Video video, boolean z) {
        if (this.f54122o) {
            m79131G();
        }
        this.f54121n = video;
        qib0.f154691G.m184725o(this.f54109b);
        if (NullChecker.m81304b(video)) {
            if (this.f54124q) {
                this.f54112e.setText(m79137v(0));
                this.f54114g.setText(m79137v((int) (video.duration * 1000.0f)));
                this.f54110c.setProgress(0);
                this.f54113f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        qib0.f154691G.m102312B0(this.f54109b, pictureCover.aspectRatioBiggest());
                    } else {
                        qib0.f154691G.m102363i0(this.f54109b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f54109b.setBackgroundColor(getResources().getColor(v0c0.f179094a));
                } else {
                    qib0.f154691G.m102363i0(this.f54109b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public void m79131G() {
        removeCallbacks(this.f54129v);
        this.f54122o = false;
        if (NullChecker.m81303a(this.f54123p)) {
            this.f54123p.stop();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f54127t) {
            return;
        }
        m79134s();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m81303a(this.f54123p)) {
            this.f54123p.mo105371f(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m79132q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g980.m124780b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m79133r(c680.InterfaceC16084b interfaceC16084b) {
        this.f54119l.add(interfaceC16084b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: s */
    public final void m79134s() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f54121n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(this.f54121n.size)) {
                    dimension = this.f54121n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(this.f54121n.size)) {
            dimension = this.f54121n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f54109b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f54109b.post(new Runnable() { // from class: l.s880
            @Override // java.lang.Runnable
            public final void run() {
                this.f163020a.m79140y();
            }
        });
    }

    public void setLoopMode(boolean z) {
        this.f54125r = z;
    }

    public void setPlayer(c680 c680Var) {
        this.f54123p = c680Var;
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f54124q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f54108a)) {
            C13075b c13075b = new C13075b(f);
            this.f54108a.setOutlineProvider(c13075b);
            this.f54108a.setClipToOutline(true);
            this.f54109b.setOutlineProvider(c13075b);
            this.f54109b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m79130F(video, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: t */
    public void m79135t(int i, int i2) {
        Dimension dimension;
        Video video = this.f54121n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81303a(picture) && NullChecker.m81303a(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81303a(this.f54121n.size)) {
                    dimension = this.f54121n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81303a(this.f54121n.size)) {
            dimension = this.f54121n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f54109b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f54109b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: u */
    public final void m79136u(int i) {
        for (int i2 = 0; i2 < this.f54115h.getChildCount(); i2++) {
            View childAt = this.f54115h.getChildAt(i2);
            xdl0.m208345M0(childAt, i == childAt.getId());
        }
    }

    /* JADX INFO: renamed from: v */
    public final String m79137v(int i) {
        boolean z = (((int) this.f54121n.duration) / 60) / 60 > 0;
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
    public final void m79138w() {
        m79132q(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f54128u);
        this.f54115h.setOnClickListener(new View.OnClickListener() { // from class: l.b980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74206a.m79141z(view);
            }
        });
        this.f54108a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC13074a());
    }

    /* JADX INFO: renamed from: x */
    public boolean m79139x() {
        return this.f54122o;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m79140y() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m79141z(View view) {
        if (m79139x()) {
            m79127C();
        } else {
            m79128D();
        }
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f54118k = new C13076c();
        this.f54119l = new HashSet();
        this.f54127t = false;
        this.f54128u = new View.OnClickListener() { // from class: l.v880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180454a.m79125A(view);
            }
        };
        m79138w();
    }
}
