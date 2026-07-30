package p153l;

import android.animation.ValueAnimator;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryAll;
import p151v.VDraweeView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes9.dex */
public class vsr implements grr {

    /* JADX INFO: renamed from: a */
    public final VDraweeView f185657a;

    /* JADX INFO: renamed from: b */
    public final VFrame f185658b;

    public vsr(LiveActivitiesEntryAll liveActivitiesEntryAll) {
        this.f185657a = liveActivitiesEntryAll.f47101g;
        this.f185658b = liveActivitiesEntryAll.f47105k;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: a */
    public int mo131858a() {
        return -90880;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: b */
    public void mo131859b(msr msrVar, BLiveActivitySummary bLiveActivitySummary) {
        String strM202657o = m202657o(bLiveActivitySummary);
        if (strM202657o != null) {
            izs.m142868s("context_square", this.f185657a, strM202657o);
        } else {
            uqb0.f180374G.m98798o(this.f185657a);
        }
        bnl0.m105524M(this.f185657a, true);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: c */
    public void mo131860c() {
        this.f185658b.setAlpha(1.0f);
        bnl0.m105524M(this.f185658b, true);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: d */
    public int mo131861d() {
        return -370374;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: e */
    public int mo131862e() {
        return qa00.m175859d(190.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: f */
    public int mo131863f() {
        return qa00.m175859d(62.0f);
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: g */
    public int mo131864g() {
        return nbc0.f141199t;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: h */
    public void mo131865h(ValueAnimator valueAnimator, grr grrVar) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.tsr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f176025a.m202660r(valueAnimator2);
            }
        });
        gt0.m132160f(valueAnimator, new Runnable() { // from class: l.usr
            @Override // java.lang.Runnable
            public final void run() {
                this.f180845a.m202661s();
            }
        });
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: i */
    public int mo131866i() {
        return qa00.f156322i;
    }

    @Override // p153l.grr
    /* JADX INFO: renamed from: j */
    public void mo131867j(ValueAnimator valueAnimator, grr grrVar) {
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rsr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f164714a.m202658p(valueAnimator2);
            }
        });
        gt0.m132176v(valueAnimator, new Runnable() { // from class: l.ssr
            @Override // java.lang.Runnable
            public final void run() {
                this.f170504a.m202659q();
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final String m202657o(BLiveActivitySummary bLiveActivitySummary) {
        if (jyb.m147479J(bLiveActivitySummary.icons)) {
            return null;
        }
        return bLiveActivitySummary.icons.get(0);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m202658p(ValueAnimator valueAnimator) {
        this.f185658b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m202659q() {
        bnl0.m105524M(this.f185658b, true);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m202660r(ValueAnimator valueAnimator) {
        this.f185658b.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m202661s() {
        bnl0.m105524M(this.f185658b, false);
    }
}
