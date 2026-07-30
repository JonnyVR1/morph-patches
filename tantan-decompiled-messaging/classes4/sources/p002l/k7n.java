package p002l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.C0425e;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.e30;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k7n extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f14229i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f14230j;

    /* JADX INFO: renamed from: k */
    public String f14231k;

    /* JADX INFO: renamed from: l.k7n$a */
    public class C0648a extends AnimListener {
        public C0648a() {
        }

        public void onFinished() {
            super.onFinished();
            k7n.this.f14229i.removeView(k7n.this.f14230j);
        }
    }

    public k7n(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        this.f14229i = frameLayout;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m16515M3(C0425e.b bVar) {
        if (!bVar.f6217d && TextUtils.equals(this.f14231k, bVar.f6214a)) {
            this.f14230j.stopAnimation(true);
            this.f14229i.removeView(this.f14230j);
            return;
        }
        this.f14231k = bVar.f6214a;
        SVGAnimationView sVGAnimationView = this.f14230j;
        if (sVGAnimationView != null && sVGAnimationView.isAnimating()) {
            this.f14230j.stopAnimation(true);
            this.f14229i.removeView(this.f14230j);
        }
        this.f14230j = new SVGAnimationView(this.f22037f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(375.0f), t100.d(368.0f));
        this.f14230j.setLayoutParams(layoutParams);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = (int) ((xdl0.w0() - bVar.f6216c) - t100.d(158.0f));
        this.f14229i.addView(this.f14230j);
        SVGALoader.with(act()).from(bVar.f6215b).repeatCount(1).autoPlay(true).animListener(new C0648a()).into(this.f14230j);
    }

    /* JADX INFO: renamed from: t */
    public void m16516t() {
        super.t();
        m14191h3(m25548F2().TraysViewEvent.notifyTrayRewardAnimPlay(), new e30() { // from class: l.j7n
            public final void call(Object obj) {
                this.f13621a.m16515M3((C0425e.b) obj);
            }
        });
    }
}
