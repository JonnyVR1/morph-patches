package com.p000p1.mobile.putong.feed.p005ui;

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
import l.d30;
import l.lsi0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.b5c0;
import p007l.e1c0;
import p007l.h980;
import v.AutoVDraweeView;
import v.VFrame_ColorFilter;
import v.VLinear;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f5056a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f5057b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f5058c;

    /* JADX INFO: renamed from: d */
    public VLinear f5059d;

    /* JADX INFO: renamed from: e */
    public VText f5060e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f5061f;

    /* JADX INFO: renamed from: g */
    public VText f5062g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f5063h;

    /* JADX INFO: renamed from: i */
    public ImageView f5064i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f5065j;

    /* JADX INFO: renamed from: k */
    public C2246c f5066k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.b> f5067l;

    /* JADX INFO: renamed from: m */
    public Surface f5068m;

    /* JADX INFO: renamed from: n */
    public Video f5069n;

    /* JADX INFO: renamed from: o */
    public boolean f5070o;

    /* JADX INFO: renamed from: p */
    public c680 f5071p;

    /* JADX INFO: renamed from: q */
    public boolean f5072q;

    /* JADX INFO: renamed from: r */
    public boolean f5073r;

    /* JADX INFO: renamed from: s */
    public boolean f5074s;

    /* JADX INFO: renamed from: t */
    public boolean f5075t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f5076u;

    /* JADX INFO: renamed from: v */
    public Runnable f5077v;

    /* JADX INFO: renamed from: w */
    public Runnable f5078w;

    /* JADX INFO: renamed from: x */
    public int f5079x;

    /* JADX INFO: renamed from: y */
    public boolean f5080y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC2244a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC2244a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f5068m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f5077v);
            if (NullChecker.a(PlayerView.this.f5078w)) {
                PlayerView playerView2 = PlayerView.this;
                playerView2.removeCallbacks(playerView2.f5078w);
            }
            Matrix matrix = new Matrix();
            PlayerView.this.f5056a.getTransform(matrix);
            PlayerView.this.f5056a.setTransform(matrix);
            if (PlayerView.this.m7749D()) {
                PlayerView.this.m7757N();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m7760R();
            PlayerView.this.f5068m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.a(PlayerView.this.f5071p) && PlayerView.this.m7749D()) {
                PlayerView.this.f5071p.c();
                if (PlayerView.this.f5057b.getAlpha() == 1.0f || PlayerView.this.f5063h.getAlpha() == 1.0f) {
                    PlayerView.this.f5071p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$b */
    public class C2245b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f5082a;

        public C2245b(float f) {
            this.f5082a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f5082a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$c */
    public class C2246c implements c680.a {
        public C2246c() {
        }

        /* JADX INFO: renamed from: a */
        public void m7766a(Exception exc) {
            PlayerView.this.m7760R();
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).a(exc);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m7767b(int i) {
            if (PlayerView.this.f5072q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f5069n.duration) * PlayerView.this.f5058c.getMax());
                PlayerView.this.f5058c.setProgress(max);
                PlayerView.this.f5061f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f5060e.setText(playerView.m7748B(i));
            }
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).b(i);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m7768c() {
            PlayerView.this.m7747A(b5c0.f5966H0);
            if (PlayerView.this.f5063h.getAlpha() < 1.0f) {
                PlayerView.this.f5063h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).c();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m7769d() {
            m7770e();
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).d();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m7770e() {
            PlayerView.this.f5070o = false;
            PlayerView.this.m7747A(b5c0.f6083q1);
            PlayerView.this.f5063h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f5057b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f5072q) {
                PlayerView.this.f5058c.setProgress(0);
                PlayerView.this.f5061f.setProgress(0);
                PlayerView.this.f5058c.setVisibility(8);
                PlayerView.this.f5059d.setVisibility(8);
            }
        }

        /* JADX INFO: renamed from: f */
        public Video m7771f() {
            return PlayerView.this.f5069n;
        }

        /* JADX INFO: renamed from: g */
        public void m7772g() {
        }

        public Surface getSurface() {
            return PlayerView.this.f5068m;
        }

        public void onComplete() {
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onComplete();
            }
            if (PlayerView.this.f5073r) {
                PlayerView.this.m7727O(true);
            }
        }

        public void onPause() {
            PlayerView.this.f5070o = false;
            PlayerView.this.m7747A(b5c0.f6083q1);
            PlayerView.this.f5063h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f5072q) {
                PlayerView.this.f5059d.setVisibility(0);
                PlayerView.this.f5058c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onPause();
            }
        }

        public void onResume() {
            PlayerView.this.f5063h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f5057b.getAlpha() > 0.0f) {
                PlayerView.this.f5057b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f5072q) {
                PlayerView.this.f5058c.setVisibility(0);
                PlayerView.this.f5059d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onResume();
            }
        }

        public void onStart() {
            Iterator it = PlayerView.this.f5067l.iterator();
            while (it.hasNext()) {
                ((c680.b) it.next()).onStart();
            }
            PlayerView.this.m7753J();
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f5066k = new C2246c();
        this.f5067l = new HashSet();
        this.f5075t = false;
        this.f5076u = new View.OnClickListener() { // from class: l.r880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12542a.m7726H(view);
            }
        };
        this.f5080y = true;
        m7724C();
    }

    /* JADX INFO: renamed from: C */
    private void m7724C() {
        m7762w(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f5076u);
        this.f5063h.setOnClickListener(new View.OnClickListener() { // from class: l.a980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5666a.m7725F(view);
            }
        });
        this.f5056a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2244a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m7725F(View view) {
        if (m7749D()) {
            m7756M();
        } else {
            m7757N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m7726H(View view) {
        if (m7749D()) {
            m7756M();
        } else {
            m7757N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m7727O(boolean z) {
        if (this.f5068m == null) {
            Runnable runnable = this.f5077v;
            if (runnable == null) {
                this.f5077v = new Runnable() { // from class: l.x880
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14795a.m7752I();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f5077v, 10000L);
        }
        if (NullChecker.a(this.f5071p) && NullChecker.a(this.f5069n)) {
            this.f5070o = true;
            if (NullChecker.a(this.f5068m)) {
                this.f5071p.d(this.f5066k, z);
            } else {
                this.f5066k.m7768c();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m7747A(int i) {
        for (int i2 = 0; i2 < this.f5063h.getChildCount(); i2++) {
            View childAt = this.f5063h.getChildAt(i2);
            if (this.f5074s) {
                xdl0.M0(childAt, (i != childAt.getId() || i == b5c0.f6056i1 || i == b5c0.f5966H0) ? false : true);
            } else {
                xdl0.M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m7748B(int i) {
        boolean z = (((int) this.f5069n.duration) / 60) / 60 > 0;
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

    /* JADX INFO: renamed from: D */
    public boolean m7749D() {
        return this.f5070o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m7750E() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m7751G() {
        if (NullChecker.a(this.f5071p)) {
            this.f5071p.stop();
            m7757N();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m7752I() {
        if (this.f5068m == null && NullChecker.a(this.f5066k)) {
            if (!this.f5074s) {
                lsi0.h(R$string.f327A4);
            }
            this.f5066k.m7769d();
            Iterator<c680.b> it = this.f5067l.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m7753J() {
        if (this.f5080y || this.f5079x <= 0) {
            if (NullChecker.a(this.f5078w)) {
                removeCallbacks(this.f5078w);
            }
        } else {
            Runnable runnable = this.f5078w;
            if (runnable == null) {
                this.f5078w = new Runnable() { // from class: l.e980
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7256a.m7751G();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f5078w, this.f5079x * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m7754K(boolean z) {
        if (NullChecker.a(this.f5071p)) {
            this.f5071p.mute(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m7755L(final d30 d30Var) {
        this.f5074s = true;
        xdl0.E0(this.f5063h, new View.OnClickListener() { // from class: l.d980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m7756M() {
        removeCallbacks(this.f5077v);
        if (NullChecker.a(this.f5078w)) {
            removeCallbacks(this.f5078w);
        }
        this.f5070o = false;
        if (NullChecker.a(this.f5071p)) {
            this.f5071p.pause();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m7757N() {
        m7727O(false);
    }

    /* JADX INFO: renamed from: P */
    public void m7758P() {
        this.f5066k = new C2246c();
    }

    /* JADX INFO: renamed from: Q */
    public void m7759Q(Video video, boolean z) {
        if (this.f5070o) {
            m7760R();
        }
        this.f5069n = video;
        qib0.G.o(this.f5057b);
        if (NullChecker.b(video)) {
            if (this.f5072q) {
                this.f5060e.setText(m7748B(0));
                this.f5062g.setText(m7748B((int) (video.duration * 1000.0f)));
                this.f5058c.setProgress(0);
                this.f5061f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.a(pictureCover) && NullChecker.b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        this.f5057b.setImageUrl(pictureCover.url);
                    } else {
                        qib0.G.i0(this.f5057b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f5057b.setBackgroundColor(getResources().getColor(e1c0.f7128a));
                } else {
                    qib0.G.i0(this.f5057b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public void m7760R() {
        removeCallbacks(this.f5077v);
        if (NullChecker.a(this.f5078w)) {
            removeCallbacks(this.f5078w);
        }
        this.f5070o = false;
        if (NullChecker.a(this.f5071p)) {
            this.f5071p.stop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX INFO: renamed from: S */
    public void m7761S(int i, int i2) {
        Dimension dimension;
        Video video = this.f5069n;
        if (video == null) {
            return;
        }
        this.f5075t = true;
        Picture picture = video.cover;
        if (NullChecker.b(video.size)) {
            dimension = this.f5069n.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(picture) || !NullChecker.b(picture.size)) {
                    dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
                    }
                }
            }
        } else if (NullChecker.b(picture)) {
            dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
        } else {
            dimension = new Dimension(t100.d(178.0f), t100.d(178.0f));
        }
        ViewGroup.LayoutParams layoutParams = this.f5057b.getLayoutParams();
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f5057b.setLayoutParams(layoutParams);
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
        this.f5056a.setTransform(matrix);
        postInvalidate();
    }

    public Set<c680.b> getPlayListener() {
        return this.f5067l;
    }

    public Video getVideo() {
        return this.f5069n;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f5075t) {
            return;
        }
        m7764y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.a(this.f5071p)) {
            this.f5071p.f(true);
        }
    }

    public void setLoopMode(boolean z) {
        this.f5073r = z;
    }

    public void setPlayer(c680 c680Var) {
        this.f5071p = c680Var;
        if (c680Var == null && NullChecker.a(this.f5078w)) {
            removeCallbacks(this.f5078w);
        }
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f5072q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.b(this.f5056a)) {
            C2245b c2245b = new C2245b(f);
            this.f5056a.setOutlineProvider(c2245b);
            this.f5056a.setClipToOutline(true);
            this.f5057b.setOutlineProvider(c2245b);
            this.f5057b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m7759Q(video, false);
    }

    /* JADX INFO: renamed from: w */
    public View m7762w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h980.m10565b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public void m7763x(c680.b bVar) {
        this.f5067l.add(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: y */
    public final void m7764y() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f5069n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f5069n.size)) {
                    dimension = this.f5069n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f5069n.size)) {
            dimension = this.f5069n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f5057b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f5057b.post(new Runnable() { // from class: l.u880
            @Override // java.lang.Runnable
            public final void run() {
                this.f13588a.m7750E();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: z */
    public void m7765z(int i, int i2) {
        Dimension dimension;
        Video video = this.f5069n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.b(this.f5069n.size)) {
                    dimension = this.f5069n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f5069n.size)) {
            dimension = this.f5069n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f5057b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f5057b.setLayoutParams(layoutParams);
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f5066k = new C2246c();
        this.f5067l = new HashSet();
        this.f5075t = false;
        this.f5076u = new View.OnClickListener() { // from class: l.r880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12542a.m7726H(view);
            }
        };
        this.f5080y = true;
        m7724C();
    }
}
