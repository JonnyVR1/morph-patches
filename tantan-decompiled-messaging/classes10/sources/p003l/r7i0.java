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
public class r7i0 implements hld0<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f7136a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f7137b;

    public r7i0(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        xdl0.M(sVGAnimationView, true);
        xdl0.M(sVGAnimationView2, true);
        this.f7136a = sVGAnimationView;
        this.f7137b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p003l.hld0
    /* JADX INFO: renamed from: a */
    public void mo7012a() {
        this.f7137b.stopAnimation(false);
    }

    @Override // p003l.hld0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo7014c(String str, int i) {
        SVGALoader.with(this.f7136a.getContext()).from(str).repeatCount(i).into(this.f7136a);
    }

    @Override // p003l.hld0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo7013b(String str, int i) {
        SVGALoader.with(this.f7137b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f7137b);
    }

    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.a(sVGAException)) {
            CrashHelper.c(sVGAException);
        }
    }

    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
