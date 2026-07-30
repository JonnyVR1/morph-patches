package p149l;

import android.animation.Animator;
import android.view.View;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsFlyView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.gears.LiveVChatGiftGearsProgressView;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class qpj {

    /* JADX INFO: renamed from: a */
    public final LiveVChatGiftGearsProgressView f155767a;

    /* JADX INFO: renamed from: b */
    public Animator f155768b;

    /* JADX INFO: renamed from: c */
    public Animator f155769c;

    public qpj(LiveVChatGiftGearsProgressView liveVChatGiftGearsProgressView) {
        this.f155767a = liveVChatGiftGearsProgressView;
    }

    /* JADX INFO: renamed from: b */
    public final int[] m175844b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        iArr[1] = iArr[1] - t100.f167257f;
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m175845c() {
        xdl0.m208345M0(this.f155767a.f45301g, false);
    }

    /* JADX INFO: renamed from: d */
    public void m175846d() {
        dt0.m113501A(this.f155768b);
    }

    /* JADX INFO: renamed from: e */
    public void m175847e(int[] iArr, LiveVChatGiftGearsFlyView liveVChatGiftGearsFlyView, d30 d30Var, d30 d30Var2) {
        if (this.f155768b == null) {
            Animator animatorM103741n = bt0.m103741n(this.f155767a.f45295a, bt0.f77162i, 1.0f, 0.0f);
            this.f155768b = animatorM103741n;
            animatorM103741n.setDuration(200L);
            this.f155768b.setInterpolator(null);
        }
        this.f155768b.start();
        if (this.f155769c == null) {
            Animator animatorM103737j = bt0.m103737j(300);
            this.f155769c = animatorM103737j;
            animatorM103737j.setInterpolator(null);
            Animator animator = this.f155769c;
            Objects.requireNonNull(d30Var2);
            bt0.m103733f(animator, new bii0(d30Var2));
        }
        this.f155769c.start();
        d30Var.call();
        liveVChatGiftGearsFlyView.m69615l();
        liveVChatGiftGearsFlyView.m69614k(m175844b(this.f155767a.f45301g));
        liveVChatGiftGearsFlyView.m69619p(iArr, new d30() { // from class: l.opj
            @Override // p149l.d30
            public final void call() {
                this.f145007a.m175845c();
            }
        });
    }
}
