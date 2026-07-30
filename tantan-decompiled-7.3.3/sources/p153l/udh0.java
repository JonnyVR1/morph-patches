package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class udh0 implements qa3, RequestCallback {

    /* JADX INFO: renamed from: a */
    public FrameLayout f178527a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f178528b;

    @Override // p153l.qa3
    /* JADX INFO: renamed from: a */
    public void mo147949a(Act act, ViewGroup viewGroup) {
        m195481f(p9r.m171370a(act), viewGroup);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/50cc4c31-1efe-4fa0-b33c-e24651eec4c2.svga").repeatCount(0).into(this.f178528b);
        this.f178528b.setRequestCallback(this);
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: b */
    public View mo147950b() {
        return this.f178527a;
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: c */
    public void mo147951c(int i) {
        SVGAnimationView sVGAnimationView = this.f178528b;
        if (i == 1) {
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            this.f178528b.startAnimation();
        } else if (sVGAnimationView.isAnimating()) {
            this.f178528b.stopAnimation(false);
            this.f178528b.stepToFrame(0.0f, false);
        }
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: e */
    public View mo147953e() {
        return this.f178527a;
    }

    /* JADX INFO: renamed from: f */
    public View m195481f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vdh0.m200967b(this, layoutInflater, viewGroup);
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.m82486a(sVGAException)) {
            CrashHelper.m82479c(sVGAException);
        }
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: d */
    public void mo147952d(CharSequence charSequence, int i) {
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
