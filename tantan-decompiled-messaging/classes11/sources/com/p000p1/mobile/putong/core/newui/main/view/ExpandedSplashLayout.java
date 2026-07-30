package com.p000p1.mobile.putong.core.newui.main.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedSplashLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3311a;

    /* JADX INFO: renamed from: b */
    public boolean f3312b;

    /* JADX INFO: renamed from: c */
    public Runnable f3313c;

    /* JADX INFO: renamed from: d */
    public VImage f3314d;

    /* JADX INFO: renamed from: e */
    public VImage f3315e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$a */
    public class C0261a implements RequestCallback {
        public C0261a() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            ExpandedSplashLayout.this.m4573i();
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$b */
    public class C0262b extends AnimListener {
        public C0262b() {
        }

        public void onFinished() {
            super.onFinished();
            ExpandedSplashLayout.this.setVisibility(8);
        }

        public void onStart() {
            super.onStart();
            ExpandedSplashLayout.this.f3312b = true;
            ExpandedSplashLayout.this.m4572h();
        }

        public void onStep(int i) {
            super.onStep(i);
            if (i > 5) {
                ExpandedSplashLayout.this.f3314d.setAlpha(0.0f);
            }
            ExpandedSplashLayout.this.f3315e.setAlpha(i >= 40 ? 1.0f - ((i - 40) / 20.0f) : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$c */
    public class RunnableC0263c implements Runnable {
        public RunnableC0263c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.M(ExpandedSplashLayout.this, false);
        }
    }

    public ExpandedSplashLayout(@NonNull Context context) {
        super(context);
        this.f3311a = false;
        this.f3312b = false;
        this.f3313c = null;
        m4574j();
    }

    /* JADX INFO: renamed from: h */
    public final void m4572h() {
        if (NullChecker.a(this.f3313c)) {
            removeCallbacks(this.f3313c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m4573i() {
        if (this.f3311a) {
            return;
        }
        this.f3311a = true;
        postDelayed(new Runnable() { // from class: l.enf
            @Override // java.lang.Runnable
            public final void run() {
                this.f12620a.m4575k();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: j */
    public final void m4574j() {
        VImage vImage = new VImage(getContext());
        this.f3315e = vImage;
        vImage.setImageResource(x2c0.p7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f3315e, layoutParams);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(t100.d(160.0f), t100.d(160.0f));
        layoutParams2.gravity = 17;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView((View) sVGAnimationView, (ViewGroup.LayoutParams) layoutParams2);
        VImage vImage2 = new VImage(getContext());
        this.f3314d = vImage2;
        vImage2.setImageResource(x2c0.P);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(t100.d(160.0f), t100.d(160.0f));
        layoutParams3.gravity = 17;
        addView(this.f3314d, layoutParams3);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/16ab1413-99de-4d28-a582-e907181e063814.svga").repeatCount(1).animListener(new C0262b()).loadCallback(new C0261a()).autoPlay(true).into(sVGAnimationView);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11918a.m4576l(view);
            }
        });
        Runnable runnableC0263c = new RunnableC0263c();
        this.f3313c = runnableC0263c;
        postDelayed(runnableC0263c, 850L);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4575k() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4576l(View view) {
        if (this.f3312b) {
            postDelayed(this.f3313c, 550L);
        } else {
            m4573i();
        }
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3311a = false;
        this.f3312b = false;
        this.f3313c = null;
        m4574j();
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3311a = false;
        this.f3312b = false;
        this.f3313c = null;
        m4574j();
    }
}
