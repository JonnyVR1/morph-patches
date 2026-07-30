package p149l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.C12836e;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes4.dex */
public class k7n extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f121611i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f121612j;

    /* JADX INFO: renamed from: k */
    public String f121613k;

    /* JADX INFO: renamed from: l.k7n$a */
    public class C17942a extends AnimListener {
        public C17942a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            k7n.this.f121611i.removeView(k7n.this.f121612j);
        }
    }

    public k7n(bsm bsmVar, FrameLayout frameLayout) {
        super(bsmVar);
        this.f121611i = frameLayout;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m144689M3(C12836e.b bVar) {
        if (!bVar.f50175d && TextUtils.equals(this.f121613k, bVar.f50172a)) {
            this.f121612j.stopAnimation(true);
            this.f121611i.removeView(this.f121612j);
            return;
        }
        this.f121613k = bVar.f50172a;
        SVGAnimationView sVGAnimationView = this.f121612j;
        if (sVGAnimationView != null && sVGAnimationView.isAnimating()) {
            this.f121612j.stopAnimation(true);
            this.f121611i.removeView(this.f121612j);
        }
        this.f121612j = new SVGAnimationView(this.f188513f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(375.0f), t100.m186890d(368.0f));
        this.f121612j.setLayoutParams(layoutParams);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = (int) ((xdl0.m208408w0() - bVar.f50174c) - t100.m186890d(158.0f));
        this.f121611i.addView(this.f121612j);
        SVGALoader.with(act()).from(bVar.f50173b).repeatCount(1).autoPlay(true).animListener(new C17942a()).into(this.f121612j);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129304h3(m206028F2().TraysViewEvent.notifyTrayRewardAnimPlay(), new e30() { // from class: l.j7n
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116617a.m144689M3((C12836e.b) obj);
            }
        });
    }
}
