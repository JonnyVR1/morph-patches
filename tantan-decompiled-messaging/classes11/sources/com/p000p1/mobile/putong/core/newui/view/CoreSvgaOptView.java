package com.p000p1.mobile.putong.core.newui.view;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreSvgaOptView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public int f5679a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.CoreSvgaOptView$a */
    public class C0409a extends AnimListener {

        /* JADX INFO: renamed from: a */
        public boolean f5680a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5681b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Runnable f5682c;

        public C0409a(int i, Runnable runnable) {
            this.f5681b = i;
            this.f5682c = runnable;
        }

        public void onStep(int i) {
            super.onStep(i);
            if (this.f5680a || i < this.f5681b || !NullChecker.a(this.f5682c)) {
                return;
            }
            this.f5680a = true;
            this.f5682c.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.view.CoreSvgaOptView$b */
    public class C0410b implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f5684a;

        public C0410b(int i) {
            this.f5684a = i;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            CoreSvgaOptView.this.setImageResource(this.f5684a);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    public CoreSvgaOptView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5679a = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m7969e(String str, @DrawableRes int i, int i2, Runnable runnable) {
        this.f5679a = i;
        SVGALoader.with(getContext()).from(str).repeatCount(1).autoPlay(true).loadCallback(new C0410b(i)).animListener(new C0409a(i2, runnable)).into(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.f5679a;
        if (i != -1) {
            setImageResource(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageDrawable(@Nullable Drawable drawable) {
        super/*android.widget.ImageView*/.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setImageResource(int i) {
        super/*android.widget.ImageView*/.setImageResource(i);
        this.f5679a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLocalRes(@DrawableRes int i) {
        this.f5679a = i;
        stopAnimation(false);
        clearAnimation();
        setImageResource(i);
    }

    public CoreSvgaOptView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5679a = -1;
    }

    public CoreSvgaOptView(@NonNull Context context) {
        super(context);
        this.f5679a = -1;
    }
}
