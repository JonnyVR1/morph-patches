package p153l;

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

/* JADX INFO: loaded from: classes2.dex */
public class jny implements xmy<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f121913a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f121914b;

    public jny(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        bnl0.m105524M(sVGAnimationView, true);
        bnl0.m105524M(sVGAnimationView2, true);
        this.f121913a = sVGAnimationView;
        this.f121914b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p153l.xmy
    /* JADX INFO: renamed from: a */
    public void mo146289a() {
        this.f121914b.stopAnimation(false);
    }

    @Override // p153l.xmy
    /* JADX INFO: renamed from: d */
    public void mo146292d() {
        this.f121913a.setVisibility(8);
    }

    @Override // p153l.xmy
    /* JADX INFO: renamed from: e */
    public void mo146293e() {
        this.f121914b.startAnimation();
    }

    @Override // p153l.xmy
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo146291c(String str, int i) {
        SVGALoader.with(this.f121913a.getContext()).from(str).repeatCount(i).into(this.f121913a);
    }

    @Override // p153l.xmy
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo146290b(String str, int i) {
        SVGALoader.with(this.f121914b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f121914b);
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.m82486a(sVGAException)) {
            CrashHelper.m82479c(sVGAException);
        }
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
