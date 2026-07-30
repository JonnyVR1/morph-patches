package p153l;

import android.animation.Animator;
import android.view.View;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsFlyView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsProgressView;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class gsj {

    /* JADX INFO: renamed from: a */
    public final LiveVChatGiftGearsProgressView f106290a;

    /* JADX INFO: renamed from: b */
    public Animator f106291b;

    /* JADX INFO: renamed from: c */
    public Animator f106292c;

    public gsj(LiveVChatGiftGearsProgressView liveVChatGiftGearsProgressView) {
        this.f106290a = liveVChatGiftGearsProgressView;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m132053b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - qa00.f156319f;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m132054c() {
        bnl0.m105525M0(this.f106290a.f46149g, false);
    }

    /* JADX INFO: renamed from: d */
    public void m132055d() {
        it0.m142007A(this.f106291b);
    }

    /* JADX INFO: renamed from: e */
    public void m132056e(int[] iArr, LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView, x20 x20Var, x20 x20Var2) {
        if (this.f106291b == null) {
            Animator animatorM132168n = gt0.m132168n(this.f106290a.f46143a, gt0.f106354i, 1.0f, 0.0f);
            this.f106291b = animatorM132168n;
            animatorM132168n.setDuration(200L);
            this.f106291b.setInterpolator(null);
        }
        this.f106291b.start();
        if (this.f106292c == null) {
            Animator animatorM132164j = gt0.m132164j(300);
            this.f106292c = animatorM132164j;
            animatorM132164j.setInterpolator(null);
            Animator animator = this.f106292c;
            Objects.requireNonNull(x20Var2);
            gt0.m132160f(animator, new bri0(x20Var2));
        }
        this.f106292c.start();
        x20Var.call();
        liveVChatGiftGearsFlyView.m70798l();
        liveVChatGiftGearsFlyView.m70797k(m132053b(this.f106290a.f46149g));
        liveVChatGiftGearsFlyView.m70802p(iArr, new x20() { // from class: l.esj
            @Override // p153l.x20
            public final void call() {
                this.f95633a.m132054c();
            }
        });
    }
}
