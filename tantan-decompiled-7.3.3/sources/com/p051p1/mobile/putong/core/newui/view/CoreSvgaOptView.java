package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
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

/* JADX INFO: loaded from: classes11.dex */
public class CoreSvgaOptView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public int f27749a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.CoreSvgaOptView$a */
    public class C8408a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public boolean f27750a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f27751b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f27752c;

        public C8408a(int i, Runnable runnable) {
            this.f27751b = i;
            this.f27752c = runnable;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStep(int i) {
            super.onStep(i);
            if (this.f27750a || i < this.f27751b || !NullChecker.m82486a(this.f27752c)) {
                return;
            }
            this.f27750a = true;
            this.f27752c.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.CoreSvgaOptView$b */
    public class C8409b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f27754a;

        public C8409b(int i) {
            this.f27754a = i;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            CoreSvgaOptView.this.setImageResource(this.f27754a);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    public CoreSvgaOptView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27749a = -1;
    }

    /* JADX INFO: renamed from: e */
    public void m44891e(String str, @DrawableRes int i, int i2, Runnable runnable) {
        this.f27749a = i;
        SVGALoader.with(getContext()).from(str).repeatCount(1).autoPlay(true).loadCallback(new C8409b(i)).animListener(new C8408a(i2, runnable)).into(this);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.f27749a;
        if (i != -1) {
            setImageResource(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.f27749a = i;
    }

    public void setLocalRes(@DrawableRes int i) {
        this.f27749a = i;
        stopAnimation(false);
        clearAnimation();
        setImageResource(i);
    }

    public CoreSvgaOptView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27749a = -1;
    }

    public CoreSvgaOptView(@NonNull Context context) {
        super(context);
        this.f27749a = -1;
    }
}
