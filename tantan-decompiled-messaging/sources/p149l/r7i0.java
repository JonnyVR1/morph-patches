package p149l;

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

/* JADX INFO: loaded from: classes10.dex */
public class r7i0 implements hld0<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f158038a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f158039b;

    public r7i0(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        xdl0.m208344M(sVGAnimationView, true);
        xdl0.m208344M(sVGAnimationView2, true);
        this.f158038a = sVGAnimationView;
        this.f158039b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p149l.hld0
    /* JADX INFO: renamed from: a */
    public void mo131649a() {
        this.f158039b.stopAnimation(false);
    }

    @Override // p149l.hld0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo131651c(String str, int i) {
        SVGALoader.with(this.f158038a.getContext()).from(str).repeatCount(i).into(this.f158038a);
    }

    @Override // p149l.hld0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo131650b(String str, int i) {
        SVGALoader.with(this.f158039b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f158039b);
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.m81303a(sVGAException)) {
            CrashHelper.m81296c(sVGAException);
        }
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
