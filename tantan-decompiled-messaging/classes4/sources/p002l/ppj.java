package p002l;

import android.animation.Animator;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import java.util.Objects;
import l.bii0;
import l.bt0;
import l.d30;
import l.dt0;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ppj {

    /* JADX INFO: renamed from: a */
    public final GiftGearsProgressView f17567a;

    /* JADX INFO: renamed from: b */
    public Animator f17568b;

    /* JADX INFO: renamed from: c */
    public Animator f17569c;

    public ppj(GiftGearsProgressView giftGearsProgressView) {
        this.f17567a = giftGearsProgressView;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m20524b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - t100.f;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m20525c() {
        xdl0.M0(this.f17567a.f5897g, false);
    }

    /* JADX INFO: renamed from: d */
    public void m20526d() {
        dt0.A(this.f17568b);
    }

    /* JADX INFO: renamed from: e */
    public void m20527e(int[] iArr, GiftGearsFlyView giftGearsFlyView, d30 d30Var, d30 d30Var2) {
        if (this.f17568b == null) {
            Animator animatorN = bt0.n(this.f17567a.f5891a, bt0.i, new float[]{1.0f, 0.0f});
            this.f17568b = animatorN;
            animatorN.setDuration(200L);
            this.f17568b.setInterpolator(null);
        }
        this.f17568b.start();
        if (this.f17569c == null) {
            Animator animatorJ = bt0.j(300);
            this.f17569c = animatorJ;
            animatorJ.setInterpolator(null);
            Animator animator = this.f17569c;
            Objects.requireNonNull(d30Var2);
            bt0.f(animator, new bii0(d30Var2));
        }
        this.f17569c.start();
        d30Var.call();
        giftGearsFlyView.m7384l();
        giftGearsFlyView.m7383k(m20524b(this.f17567a.f5897g));
        giftGearsFlyView.m7388p(iArr, new d30() { // from class: l.npj
            public final void call() {
                this.f16148a.m20525c();
            }
        });
    }
}
