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
public class rgi0 implements jtd0<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f163015a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f163016b;

    public rgi0(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        bnl0.m105524M(sVGAnimationView, true);
        bnl0.m105524M(sVGAnimationView2, true);
        this.f163015a = sVGAnimationView;
        this.f163016b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p153l.jtd0
    /* JADX INFO: renamed from: a */
    public void mo146902a() {
        this.f163016b.stopAnimation(false);
    }

    @Override // p153l.jtd0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo146904c(String str, int i) {
        SVGALoader.with(this.f163015a.getContext()).from(str).repeatCount(i).into(this.f163015a);
    }

    @Override // p153l.jtd0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo146903b(String str, int i) {
        SVGALoader.with(this.f163016b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f163016b);
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
