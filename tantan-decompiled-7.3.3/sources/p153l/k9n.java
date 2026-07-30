package p153l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.C12999e;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;

/* JADX INFO: loaded from: classes4.dex */
public class k9n extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final FrameLayout f124557i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f124558j;

    /* JADX INFO: renamed from: k */
    public String f124559k;

    /* JADX INFO: renamed from: l.k9n$a */
    public class C18123a extends AnimListener {
        public C18123a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            k9n.this.f124557i.removeView(k9n.this.f124558j);
        }
    }

    public k9n(dum dumVar, FrameLayout frameLayout) {
        super(dumVar);
        this.f124557i = frameLayout;
    }

    /* JADX INFO: renamed from: M3 */
    public final void m148873M3(C12999e.b bVar) {
        if (!bVar.f51023d && TextUtils.equals(this.f124559k, bVar.f51020a)) {
            this.f124558j.stopAnimation(true);
            this.f124557i.removeView(this.f124558j);
            return;
        }
        this.f124559k = bVar.f51020a;
        SVGAnimationView sVGAnimationView = this.f124558j;
        if (sVGAnimationView != null && sVGAnimationView.isAnimating()) {
            this.f124558j.stopAnimation(true);
            this.f124557i.removeView(this.f124558j);
        }
        this.f124558j = new SVGAnimationView(this.f196919f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(375.0f), qa00.m175859d(368.0f));
        this.f124558j.setLayoutParams(layoutParams);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = (int) ((bnl0.m105588w0() - bVar.f51022c) - qa00.m175859d(158.0f));
        this.f124557i.addView(this.f124558j);
        SVGALoader.with(act()).from(bVar.f51021b).repeatCount(1).autoPlay(true).animListener(new C18123a()).into(this.f124558j);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138863h3(m213811F2().TraysViewEvent.notifyTrayRewardAnimPlay(), new y20() { // from class: l.j9n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118890a.m148873M3((C12999e.b) obj);
            }
        });
    }
}
