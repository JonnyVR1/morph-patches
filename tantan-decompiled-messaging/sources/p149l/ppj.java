package p149l;

import android.animation.Animator;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ppj {

    /* JADX INFO: renamed from: a */
    public final GiftGearsProgressView f150659a;

    /* JADX INFO: renamed from: b */
    public Animator f150660b;

    /* JADX INFO: renamed from: c */
    public Animator f150661c;

    public ppj(GiftGearsProgressView giftGearsProgressView) {
        this.f150659a = giftGearsProgressView;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m170735b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - t100.f167257f;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m170736c() {
        xdl0.m208345M0(this.f150659a.f49855g, false);
    }

    /* JADX INFO: renamed from: d */
    public void m170737d() {
        dt0.m113501A(this.f150660b);
    }

    /* JADX INFO: renamed from: e */
    public void m170738e(int[] iArr, GiftGearsFlyView giftGearsFlyView, d30 d30Var, d30 d30Var2) {
        if (this.f150660b == null) {
            Animator animatorM103741n = bt0.m103741n(this.f150659a.f49849a, bt0.f77162i, 1.0f, 0.0f);
            this.f150660b = animatorM103741n;
            animatorM103741n.setDuration(200L);
            this.f150660b.setInterpolator(null);
        }
        this.f150660b.start();
        if (this.f150661c == null) {
            Animator animatorM103737j = bt0.m103737j(300);
            this.f150661c = animatorM103737j;
            animatorM103737j.setInterpolator(null);
            Animator animator = this.f150661c;
            Objects.requireNonNull(d30Var2);
            bt0.m103733f(animator, new bii0(d30Var2));
        }
        this.f150661c.start();
        d30Var.call();
        giftGearsFlyView.m73828l();
        giftGearsFlyView.m73827k(m170735b(this.f150659a.f49855g));
        giftGearsFlyView.m73832p(iArr, new d30() { // from class: l.npj
            @Override // p149l.d30
            public final void call() {
                this.f139977a.m170736c();
            }
        });
    }
}
