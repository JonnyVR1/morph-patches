package p003l;

import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mey implements aey<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f6340a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f6341b;

    public mey(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        xdl0.M(sVGAnimationView, true);
        xdl0.M(sVGAnimationView2, true);
        this.f6340a = sVGAnimationView;
        this.f6341b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p003l.aey
    /* JADX INFO: renamed from: a */
    public void mo5375a() {
        this.f6341b.stopAnimation(false);
    }

    @Override // p003l.aey
    /* JADX INFO: renamed from: d */
    public void mo5378d() {
        this.f6340a.setVisibility(8);
    }

    @Override // p003l.aey
    /* JADX INFO: renamed from: e */
    public void mo5379e() {
        this.f6341b.startAnimation();
    }

    @Override // p003l.aey
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo5377c(String str, int i) {
        SVGALoader.with(this.f6340a.getContext()).from(str).repeatCount(i).into(this.f6340a);
    }

    @Override // p003l.aey
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo5376b(String str, int i) {
        SVGALoader.with(this.f6341b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f6341b);
    }

    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.a(sVGAException)) {
            CrashHelper.c(sVGAException);
        }
    }

    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
