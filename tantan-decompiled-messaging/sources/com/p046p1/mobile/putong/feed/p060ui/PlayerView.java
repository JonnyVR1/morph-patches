package com.p046p1.mobile.putong.feed.p060ui;

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
import p147v.AutoVDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p149l.b5c0;
import p149l.c680;
import p149l.d30;
import p149l.e1c0;
import p149l.h980;
import p149l.lsi0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PlayerView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f43595a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f43596b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f43597c;

    /* JADX INFO: renamed from: d */
    public VLinear f43598d;

    /* JADX INFO: renamed from: e */
    public VText f43599e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f43600f;

    /* JADX INFO: renamed from: g */
    public VText f43601g;

    /* JADX INFO: renamed from: h */
    public VFrame_ColorFilter f43602h;

    /* JADX INFO: renamed from: i */
    public ImageView f43603i;

    /* JADX INFO: renamed from: j */
    public VProgressBar f43604j;

    /* JADX INFO: renamed from: k */
    public C11402c f43605k;

    /* JADX INFO: renamed from: l */
    public final Set<c680.InterfaceC16084b> f43606l;

    /* JADX INFO: renamed from: m */
    public Surface f43607m;

    /* JADX INFO: renamed from: n */
    public Video f43608n;

    /* JADX INFO: renamed from: o */
    public boolean f43609o;

    /* JADX INFO: renamed from: p */
    public c680 f43610p;

    /* JADX INFO: renamed from: q */
    public boolean f43611q;

    /* JADX INFO: renamed from: r */
    public boolean f43612r;

    /* JADX INFO: renamed from: s */
    public boolean f43613s;

    /* JADX INFO: renamed from: t */
    public boolean f43614t;

    /* JADX INFO: renamed from: u */
    public View.OnClickListener f43615u;

    /* JADX INFO: renamed from: v */
    public Runnable f43616v;

    /* JADX INFO: renamed from: w */
    public Runnable f43617w;

    /* JADX INFO: renamed from: x */
    public int f43618x;

    /* JADX INFO: renamed from: y */
    public boolean f43619y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$a */
    public class TextureViewSurfaceTextureListenerC11400a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC11400a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PlayerView.this.f43607m = new Surface(surfaceTexture);
            PlayerView playerView = PlayerView.this;
            playerView.removeCallbacks(playerView.f43616v);
            if (NullChecker.m81303a(PlayerView.this.f43617w)) {
                PlayerView playerView2 = PlayerView.this;
                playerView2.removeCallbacks(playerView2.f43617w);
            }
            Matrix matrix = new Matrix();
            PlayerView.this.f43595a.getTransform(matrix);
            PlayerView.this.f43595a.setTransform(matrix);
            if (PlayerView.this.m66565D()) {
                PlayerView.this.m66573N();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PlayerView.this.m66576R();
            PlayerView.this.f43607m = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (NullChecker.m81303a(PlayerView.this.f43610p) && PlayerView.this.m66565D()) {
                PlayerView.this.f43610p.mo105368c();
                if (PlayerView.this.f43596b.getAlpha() == 1.0f || PlayerView.this.f43602h.getAlpha() == 1.0f) {
                    PlayerView.this.f43610p.resume();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$b */
    public class C11401b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f43621a;

        public C11401b(float f) {
            this.f43621a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f43621a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.PlayerView$c */
    public class C11402c implements c680.InterfaceC16083a {
        public C11402c() {
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            PlayerView.this.m66576R();
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44050a(exc);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: b */
        public void mo44051b(int i) {
            if (PlayerView.this.f43611q) {
                int max = (int) (((i / 1000.0f) / PlayerView.this.f43608n.duration) * PlayerView.this.f43597c.getMax());
                PlayerView.this.f43597c.setProgress(max);
                PlayerView.this.f43600f.setProgress(max);
                PlayerView playerView = PlayerView.this;
                playerView.f43599e.setText(playerView.m66564B(i));
            }
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44051b(i);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: c */
        public void mo44052c() {
            PlayerView.this.m66563A(b5c0.f73485H0);
            if (PlayerView.this.f43602h.getAlpha() < 1.0f) {
                PlayerView.this.f43602h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44052c();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            mo44054e();
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).mo44053d();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: e */
        public void mo44054e() {
            PlayerView.this.f43609o = false;
            PlayerView.this.m66563A(b5c0.f73602q1);
            PlayerView.this.f43602h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            PlayerView.this.f43596b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f43611q) {
                PlayerView.this.f43597c.setProgress(0);
                PlayerView.this.f43600f.setProgress(0);
                PlayerView.this.f43597c.setVisibility(8);
                PlayerView.this.f43598d.setVisibility(8);
            }
        }

        @Override // p149l.c680.InterfaceC16083a
        /* JADX INFO: renamed from: f */
        public Video mo44055f() {
            return PlayerView.this.f43608n;
        }

        @Override // p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: g */
        public void mo44056g() {
        }

        @Override // p149l.c680.InterfaceC16083a
        public Surface getSurface() {
            return PlayerView.this.f43607m;
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onComplete() {
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onComplete();
            }
            if (PlayerView.this.f43612r) {
                PlayerView.this.m66543O(true);
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onPause() {
            PlayerView.this.f43609o = false;
            PlayerView.this.m66563A(b5c0.f73602q1);
            PlayerView.this.f43602h.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f43611q) {
                PlayerView.this.f43598d.setVisibility(0);
                PlayerView.this.f43597c.setVisibility(8);
            }
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onPause();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onResume() {
            PlayerView.this.f43602h.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            if (PlayerView.this.f43596b.getAlpha() > 0.0f) {
                PlayerView.this.f43596b.animate().alpha(0.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            }
            if (PlayerView.this.f43611q) {
                PlayerView.this.f43597c.setVisibility(0);
                PlayerView.this.f43598d.setVisibility(8);
            }
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onResume();
            }
        }

        @Override // p149l.c680.InterfaceC16084b
        public void onStart() {
            Iterator it = PlayerView.this.f43606l.iterator();
            while (it.hasNext()) {
                ((c680.InterfaceC16084b) it.next()).onStart();
            }
            PlayerView.this.m66569J();
        }
    }

    public PlayerView(@NonNull Context context) {
        super(context);
        this.f43605k = new C11402c();
        this.f43606l = new HashSet();
        this.f43614t = false;
        this.f43615u = new View.OnClickListener() { // from class: l.r880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158162a.m66542H(view);
            }
        };
        this.f43619y = true;
        m66540C();
    }

    /* JADX INFO: renamed from: C */
    private void m66540C() {
        m66578w(LayoutInflater.from(getContext()), this);
        setOnClickListener(this.f43615u);
        this.f43602h.setOnClickListener(new View.OnClickListener() { // from class: l.a980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68120a.m66541F(view);
            }
        });
        this.f43595a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC11400a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m66541F(View view) {
        if (m66565D()) {
            m66572M();
        } else {
            m66573N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m66542H(View view) {
        if (m66565D()) {
            m66572M();
        } else {
            m66573N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public void m66543O(boolean z) {
        if (this.f43607m == null) {
            Runnable runnable = this.f43616v;
            if (runnable == null) {
                this.f43616v = new Runnable() { // from class: l.x880
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f191446a.m66568I();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f43616v, 10000L);
        }
        if (NullChecker.m81303a(this.f43610p) && NullChecker.m81303a(this.f43608n)) {
            this.f43609o = true;
            if (NullChecker.m81303a(this.f43607m)) {
                this.f43610p.mo105369d(this.f43605k, z);
            } else {
                this.f43605k.mo44052c();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m66563A(int i) {
        for (int i2 = 0; i2 < this.f43602h.getChildCount(); i2++) {
            View childAt = this.f43602h.getChildAt(i2);
            if (this.f43613s) {
                xdl0.m208345M0(childAt, (i != childAt.getId() || i == b5c0.f73575i1 || i == b5c0.f73485H0) ? false : true);
            } else {
                xdl0.m208345M0(childAt, i == childAt.getId());
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m66564B(int i) {
        boolean z = (((int) this.f43608n.duration) / 60) / 60 > 0;
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

    /* JADX INFO: renamed from: D */
    public boolean m66565D() {
        return this.f43609o;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m66566E() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m66567G() {
        if (NullChecker.m81303a(this.f43610p)) {
            this.f43610p.stop();
            m66573N();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m66568I() {
        if (this.f43607m == null && NullChecker.m81303a(this.f43605k)) {
            if (!this.f43613s) {
                lsi0.m151578h(R$string.f38866A4);
            }
            this.f43605k.mo44053d();
            Iterator<c680.InterfaceC16084b> it = this.f43606l.iterator();
            while (it.hasNext()) {
                it.next().mo44053d();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void m66569J() {
        if (this.f43619y || this.f43618x <= 0) {
            if (NullChecker.m81303a(this.f43617w)) {
                removeCallbacks(this.f43617w);
            }
        } else {
            Runnable runnable = this.f43617w;
            if (runnable == null) {
                this.f43617w = new Runnable() { // from class: l.e980
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f89929a.m66567G();
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f43617w, this.f43618x * 1000);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m66570K(boolean z) {
        if (NullChecker.m81303a(this.f43610p)) {
            this.f43610p.mute(z);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m66571L(final d30 d30Var) {
        this.f43613s = true;
        xdl0.m208329E0(this.f43602h, new View.OnClickListener() { // from class: l.d980
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public void m66572M() {
        removeCallbacks(this.f43616v);
        if (NullChecker.m81303a(this.f43617w)) {
            removeCallbacks(this.f43617w);
        }
        this.f43609o = false;
        if (NullChecker.m81303a(this.f43610p)) {
            this.f43610p.pause();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m66573N() {
        m66543O(false);
    }

    /* JADX INFO: renamed from: P */
    public void m66574P() {
        this.f43605k = new C11402c();
    }

    /* JADX INFO: renamed from: Q */
    public void m66575Q(Video video, boolean z) {
        if (this.f43609o) {
            m66576R();
        }
        this.f43608n = video;
        qib0.f154691G.m184725o(this.f43596b);
        if (NullChecker.m81304b(video)) {
            if (this.f43611q) {
                this.f43599e.setText(m66564B(0));
                this.f43601g.setText(m66564B((int) (video.duration * 1000.0f)));
                this.f43597c.setProgress(0);
                this.f43600f.setProgress(0);
            }
            if (!z) {
                Picture pictureCover = video.cover();
                if (NullChecker.m81303a(pictureCover) && NullChecker.m81304b(pictureCover.url)) {
                    if (TEnum.equals(pictureCover.status, "normal")) {
                        this.f43596b.setImageUrl(pictureCover.url);
                    } else {
                        qib0.f154691G.m102363i0(this.f43596b, pictureCover.url);
                    }
                } else if (video.url.contains("http")) {
                    this.f43596b.setBackgroundColor(getResources().getColor(e1c0.f88772a));
                } else {
                    qib0.f154691G.m102363i0(this.f43596b, video.url);
                }
            }
        }
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: R */
    public void m66576R() {
        removeCallbacks(this.f43616v);
        if (NullChecker.m81303a(this.f43617w)) {
            removeCallbacks(this.f43617w);
        }
        this.f43609o = false;
        if (NullChecker.m81303a(this.f43610p)) {
            this.f43610p.stop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX INFO: renamed from: S */
    public void m66577S(int i, int i2) {
        Dimension dimension;
        Video video = this.f43608n;
        if (video == null) {
            return;
        }
        this.f43614t = true;
        Picture picture = video.cover;
        if (NullChecker.m81304b(video.size)) {
            dimension = this.f43608n.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(picture) || !NullChecker.m81304b(picture.size)) {
                    dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                } else {
                    dimension = picture.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
                    }
                }
            }
        } else if (NullChecker.m81304b(picture)) {
            dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
        } else {
            dimension = new Dimension(t100.m186890d(178.0f), t100.m186890d(178.0f));
        }
        ViewGroup.LayoutParams layoutParams = this.f43596b.getLayoutParams();
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            this.f43596b.setLayoutParams(layoutParams);
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
        this.f43595a.setTransform(matrix);
        postInvalidate();
    }

    public Set<c680.InterfaceC16084b> getPlayListener() {
        return this.f43606l;
    }

    public Video getVideo() {
        return this.f43608n;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f43614t) {
            return;
        }
        m66580y();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 4 && NullChecker.m81303a(this.f43610p)) {
            this.f43610p.mo105371f(true);
        }
    }

    public void setLoopMode(boolean z) {
        this.f43612r = z;
    }

    public void setPlayer(c680 c680Var) {
        this.f43610p = c680Var;
        if (c680Var == null && NullChecker.m81303a(this.f43617w)) {
            removeCallbacks(this.f43617w);
        }
    }

    public void setProgressBarsEnabled(boolean z) {
        this.f43611q = z;
    }

    public void setRadius(float f) {
        if (NullChecker.m81304b(this.f43595a)) {
            C11401b c11401b = new C11401b(f);
            this.f43595a.setOutlineProvider(c11401b);
            this.f43595a.setClipToOutline(true);
            this.f43596b.setOutlineProvider(c11401b);
            this.f43596b.setClipToOutline(true);
        }
    }

    public void setVideo(Video video) {
        m66575Q(video, false);
    }

    /* JADX INFO: renamed from: w */
    public View m66578w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h980.m129950b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: x */
    public void m66579x(c680.InterfaceC16084b interfaceC16084b) {
        this.f43606l.add(interfaceC16084b);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX INFO: renamed from: y */
    public final void m66580y() {
        Video video;
        Dimension dimension;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0 || (video = this.f43608n) == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f43608n.size)) {
                    dimension = this.f43608n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f43608n.size)) {
            dimension = this.f43608n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43596b.getLayoutParams();
        if (layoutParams.width == width && layoutParams.height == height) {
            return;
        }
        layoutParams.width = width;
        layoutParams.height = height;
        this.f43596b.post(new Runnable() { // from class: l.u880
            @Override // java.lang.Runnable
            public final void run() {
                this.f175103a.m66566E();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: z */
    public void m66581z(int i, int i2) {
        Dimension dimension;
        Video video = this.f43608n;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.width <= 0) {
                if (NullChecker.m81304b(this.f43608n.size)) {
                    dimension = this.f43608n.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f43608n.size)) {
            dimension = this.f43608n.size;
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
        ViewGroup.LayoutParams layoutParams = this.f43596b.getLayoutParams();
        if (layoutParams.width == i && layoutParams.height == i2) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f43596b.setLayoutParams(layoutParams);
    }

    public PlayerView(@NonNull Context context, AttributeSet attributeSet) {
        super(context);
        this.f43605k = new C11402c();
        this.f43606l = new HashSet();
        this.f43614t = false;
        this.f43615u = new View.OnClickListener() { // from class: l.r880
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158162a.m66542H(view);
            }
        };
        this.f43619y = true;
        m66540C();
    }
}
