package com.p046p1.mobile.putong.core.newui.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSplashLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f24533a;

    /* JADX INFO: renamed from: b */
    public boolean f24534b;

    /* JADX INFO: renamed from: c */
    public Runnable f24535c;

    /* JADX INFO: renamed from: d */
    public VImage f24536d;

    /* JADX INFO: renamed from: e */
    public VImage f24537e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$a */
    public class C8097a implements RequestCallback {
        public C8097a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            ExpandedSplashLayout.this.m40487i();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$b */
    public class C8098b extends AnimListener {
        public C8098b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            ExpandedSplashLayout.this.setVisibility(8);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            ExpandedSplashLayout.this.f24534b = true;
            ExpandedSplashLayout.this.m40486h();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            super.onStep(i);
            if (i > 5) {
                ExpandedSplashLayout.this.f24536d.setAlpha(0.0f);
            }
            ExpandedSplashLayout.this.f24537e.setAlpha(i >= 40 ? 1.0f - ((i - 40) / 20.0f) : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$c */
    public class RunnableC8099c implements Runnable {
        public RunnableC8099c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208344M(ExpandedSplashLayout.this, false);
        }
    }

    public ExpandedSplashLayout(@NonNull Context context) {
        super(context);
        this.f24533a = false;
        this.f24534b = false;
        this.f24535c = null;
        m40488j();
    }

    /* JADX INFO: renamed from: h */
    public final void m40486h() {
        if (NullChecker.m81303a(this.f24535c)) {
            removeCallbacks(this.f24535c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m40487i() {
        if (this.f24533a) {
            return;
        }
        this.f24533a = true;
        postDelayed(new Runnable() { // from class: l.enf
            @Override // java.lang.Runnable
            public final void run() {
                this.f92308a.m40489k();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: j */
    public final void m40488j() {
        VImage vImage = new VImage(getContext());
        this.f24537e = vImage;
        vImage.setImageResource(x2c0.f190450p7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f24537e, layoutParams);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(t100.m186890d(160.0f), t100.m186890d(160.0f));
        layoutParams2.gravity = 17;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(sVGAnimationView, layoutParams2);
        VImage vImage2 = new VImage(getContext());
        this.f24536d = vImage2;
        vImage2.setImageResource(x2c0.f189624P);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t100.m186890d(160.0f), t100.m186890d(160.0f));
        layoutParams3.gravity = 17;
        addView(this.f24536d, layoutParams3);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/16ab1413-99de-4d28-a582-e907181e063814.svga").repeatCount(1).animListener(new C8098b()).loadCallback(new C8097a()).autoPlay(true).into(sVGAnimationView);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87057a.m40490l(view);
            }
        });
        Runnable runnableC8099c = new RunnableC8099c();
        this.f24535c = runnableC8099c;
        postDelayed(runnableC8099c, 850L);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m40489k() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m40490l(View view) {
        if (this.f24534b) {
            postDelayed(this.f24535c, 550L);
        } else {
            m40487i();
        }
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24533a = false;
        this.f24534b = false;
        this.f24535c = null;
        m40488j();
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24533a = false;
        this.f24534b = false;
        this.f24535c = null;
        m40488j();
    }
}
