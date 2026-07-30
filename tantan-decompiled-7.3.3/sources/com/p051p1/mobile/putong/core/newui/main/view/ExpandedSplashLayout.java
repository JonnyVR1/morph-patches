package com.p051p1.mobile.putong.core.newui.main.view;

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
import p151v.VImage;
import p153l.bnl0;
import p153l.dbc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedSplashLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f25275a;

    /* JADX INFO: renamed from: b */
    public boolean f25276b;

    /* JADX INFO: renamed from: c */
    public Runnable f25277c;

    /* JADX INFO: renamed from: d */
    public VImage f25278d;

    /* JADX INFO: renamed from: e */
    public VImage f25279e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$a */
    public class C8248a implements RequestCallback {
        public C8248a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            ExpandedSplashLayout.this.m41498i();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$b */
    public class C8249b extends AnimListener {
        public C8249b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            ExpandedSplashLayout.this.setVisibility(8);
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            super.onStart();
            ExpandedSplashLayout.this.f25276b = true;
            ExpandedSplashLayout.this.m41497h();
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            super.onStep(i);
            if (i > 5) {
                ExpandedSplashLayout.this.f25278d.setAlpha(0.0f);
            }
            ExpandedSplashLayout.this.f25279e.setAlpha(i >= 40 ? 1.0f - ((i - 40) / 20.0f) : 1.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout$c */
    public class RunnableC8250c implements Runnable {
        public RunnableC8250c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105524M(ExpandedSplashLayout.this, false);
        }
    }

    public ExpandedSplashLayout(@NonNull Context context) {
        super(context);
        this.f25275a = false;
        this.f25276b = false;
        this.f25277c = null;
        m41499j();
    }

    /* JADX INFO: renamed from: h */
    public final void m41497h() {
        if (NullChecker.m82486a(this.f25277c)) {
            removeCallbacks(this.f25277c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m41498i() {
        if (this.f25275a) {
            return;
        }
        this.f25275a = true;
        postDelayed(new Runnable() { // from class: l.kof
            @Override // java.lang.Runnable
            public final void run() {
                this.f127725a.m41500k();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: j */
    public final void m41499j() {
        VImage vImage = new VImage(getContext());
        this.f25279e = vImage;
        vImage.setImageResource(dbc0.f87341q7);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f25279e, layoutParams);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(qa00.m175859d(160.0f), qa00.m175859d(160.0f));
        layoutParams2.gravity = 17;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        addView(sVGAnimationView, layoutParams2);
        VImage vImage2 = new VImage(getContext());
        this.f25278d = vImage2;
        vImage2.setImageResource(dbc0.f86488Q);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(qa00.m175859d(160.0f), qa00.m175859d(160.0f));
        layoutParams3.gravity = 17;
        addView(this.f25278d, layoutParams3);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/16ab1413-99de-4d28-a582-e907181e063814.svga").repeatCount(1).animListener(new C8249b()).loadCallback(new C8248a()).autoPlay(true).into(sVGAnimationView);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.jof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121997a.m41501l(view);
            }
        });
        Runnable runnableC8250c = new RunnableC8250c();
        this.f25277c = runnableC8250c;
        postDelayed(runnableC8250c, 850L);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m41500k() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m41501l(View view) {
        if (this.f25276b) {
            postDelayed(this.f25277c, 550L);
        } else {
            m41498i();
        }
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25275a = false;
        this.f25276b = false;
        this.f25277c = null;
        m41499j();
    }

    public ExpandedSplashLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25275a = false;
        this.f25276b = false;
        this.f25277c = null;
        m41499j();
    }
}
