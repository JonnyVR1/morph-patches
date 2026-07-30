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
public class mey implements aey<String>, RequestCallback {

    /* JADX INFO: renamed from: a */
    public final SVGAnimationView f133520a;

    /* JADX INFO: renamed from: b */
    public final SVGAnimationView f133521b;

    public mey(SVGAnimationView sVGAnimationView, SVGAnimationView sVGAnimationView2) {
        xdl0.m208344M(sVGAnimationView, true);
        xdl0.m208344M(sVGAnimationView2, true);
        this.f133520a = sVGAnimationView;
        this.f133521b = sVGAnimationView2;
        sVGAnimationView2.setRequestCallback(this);
        sVGAnimationView.setRequestCallback(this);
    }

    @Override // p149l.aey
    /* JADX INFO: renamed from: a */
    public void mo96152a() {
        this.f133521b.stopAnimation(false);
    }

    @Override // p149l.aey
    /* JADX INFO: renamed from: d */
    public void mo96155d() {
        this.f133520a.setVisibility(8);
    }

    @Override // p149l.aey
    /* JADX INFO: renamed from: e */
    public void mo96156e() {
        this.f133521b.startAnimation();
    }

    @Override // p149l.aey
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo96154c(String str, int i) {
        SVGALoader.with(this.f133520a.getContext()).from(str).repeatCount(i).into(this.f133520a);
    }

    @Override // p149l.aey
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo96153b(String str, int i) {
        SVGALoader.with(this.f133521b.getContext()).from(str).repeatCount(i).frameMode(SVGAnimationView.FrameMode.BEFORE).into(this.f133521b);
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
