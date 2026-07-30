package p153l;

import android.animation.Animator;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsFlyView;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.operation.gears.GiftGearsProgressView;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class fsj {

    /* JADX INFO: renamed from: a */
    public final GiftGearsProgressView f100632a;

    /* JADX INFO: renamed from: b */
    public Animator f100633b;

    /* JADX INFO: renamed from: c */
    public Animator f100634c;

    public fsj(GiftGearsProgressView giftGearsProgressView) {
        this.f100632a = giftGearsProgressView;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m127195b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - qa00.f156319f;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m127196c() {
        bnl0.m105525M0(this.f100632a.f50703g, false);
    }

    /* JADX INFO: renamed from: d */
    public void m127197d() {
        it0.m142007A(this.f100633b);
    }

    /* JADX INFO: renamed from: e */
    public void m127198e(int[] iArr, GiftGearsFlyView giftGearsFlyView, x20 x20Var, x20 x20Var2) {
        if (this.f100633b == null) {
            Animator animatorM132168n = gt0.m132168n(this.f100632a.f50697a, gt0.f106354i, 1.0f, 0.0f);
            this.f100633b = animatorM132168n;
            animatorM132168n.setDuration(200L);
            this.f100633b.setInterpolator(null);
        }
        this.f100633b.start();
        if (this.f100634c == null) {
            Animator animatorM132164j = gt0.m132164j(300);
            this.f100634c = animatorM132164j;
            animatorM132164j.setInterpolator(null);
            Animator animator = this.f100634c;
            Objects.requireNonNull(x20Var2);
            gt0.m132160f(animator, new bri0(x20Var2));
        }
        this.f100634c.start();
        x20Var.call();
        giftGearsFlyView.m75011l();
        giftGearsFlyView.m75010k(m127195b(this.f100632a.f50703g));
        giftGearsFlyView.m75015p(iArr, new x20() { // from class: l.dsj
            @Override // p153l.x20
            public final void call() {
                this.f90491a.m127196c();
            }
        });
    }
}
