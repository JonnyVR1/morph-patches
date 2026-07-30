package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
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
public class m5h0 implements ba3, RequestCallback {

    /* JADX INFO: renamed from: a */
    public FrameLayout f131394a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f131395b;

    @Override // p149l.ba3
    /* JADX INFO: renamed from: a */
    public void mo100885a(Act act, ViewGroup viewGroup) {
        m153139f(o7r.m163037a(act), viewGroup);
        SVGALoader.with(act).from("https://fe-static.tancdn.com/v1/raw/50cc4c31-1efe-4fa0-b33c-e24651eec4c2.svga").repeatCount(0).into(this.f131395b);
        this.f131395b.setRequestCallback(this);
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: b */
    public View mo100886b() {
        return this.f131394a;
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: c */
    public void mo100887c(int i) {
        SVGAnimationView sVGAnimationView = this.f131395b;
        if (i == 1) {
            if (sVGAnimationView.isAnimating()) {
                return;
            }
            this.f131395b.startAnimation();
        } else if (sVGAnimationView.isAnimating()) {
            this.f131395b.stopAnimation(false);
            this.f131395b.stepToFrame(0.0f, false);
        }
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: e */
    public View mo100889e() {
        return this.f131394a;
    }

    /* JADX INFO: renamed from: f */
    public View m153139f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n5h0.m157993b(this, layoutInflater, viewGroup);
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onLoadFailed(@NotNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        if (NullChecker.m81303a(sVGAException)) {
            CrashHelper.m81296c(sVGAException);
        }
    }

    @Override // p149l.ba3
    /* JADX INFO: renamed from: d */
    public void mo100888d(CharSequence charSequence, int i) {
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onResourceReady(@NotNull ResourceKey resourceKey, @NotNull Resource<?> resource) {
    }
}
