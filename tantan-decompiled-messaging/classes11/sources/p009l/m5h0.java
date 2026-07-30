package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.n5h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class m5h0 implements ba3, RequestCallback {

    /* JADX INFO: renamed from: a */
    public FrameLayout f16506a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f16507b;

    @Override // p009l.ba3
    /* JADX INFO: renamed from: a */
    public void mo11917a(Act act, ViewGroup viewGroup) {
        m18246f(o7r.m19649a(act), viewGroup);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/50cc4c31-1efe-4fa0-b33c-e24651eec4c2.svga").repeatCount(0).into(this.f16507b);
        this.f16507b.setRequestCallback(this);
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: b */
    public View mo11918b() {
        return this.f16506a;
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: c */
    public void mo11919c(int i) {
        SVGAnimationView sVGAnimationView = this.f16507b;
        if (i == 1) {
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            this.f16507b.startAnimation();
        } else if (sVGAnimationView.isAnimating()) {
            this.f16507b.stopAnimation(false);
            this.f16507b.stepToFrame(0.0f, false);
        }
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: e */
    public View mo11921e() {
        return this.f16506a;
    }

    /* JADX INFO: renamed from: f */
    public View m18246f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n5h0.b(this, layoutInflater, viewGroup);
    }

    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.a(sVGAException)) {
            CrashHelper.c(sVGAException);
        }
    }

    @Override // p009l.ba3
    /* JADX INFO: renamed from: d */
    public void mo11920d(CharSequence charSequence, int i) {
    }

    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
