package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class o9n0 extends i6t<rwn0, k9n0> {

    /* JADX INFO: renamed from: i */
    public final int f145613i;

    /* JADX INFO: renamed from: j */
    public final int f145614j;

    /* JADX INFO: renamed from: k */
    public g4s f145615k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f145616l;

    public o9n0(dum dumVar, k9n0 k9n0Var) {
        super(dumVar);
        this.f145613i = qa00.m175859d(182.0f);
        this.f145614j = qa00.m175859d(52.0f);
        mo52715C(k9n0Var);
    }

    /* JADX INFO: renamed from: M3 */
    public final int[] m166763M3(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: N3 */
    public void m166764N3() {
        g4s g4sVar = this.f145615k;
        if (g4sVar == null || !g4sVar.isShowing()) {
            return;
        }
        this.f145615k.dismiss();
    }

    /* JADX INFO: renamed from: O3 */
    public final FrameLayout m166765O3() {
        if (this.f145616l == null) {
            FrameLayout frameLayout = new FrameLayout(this.f196918e.f90815a);
            this.f145616l = frameLayout;
            int i = bnl0.f77544e;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            this.f145616l.setOnClickListener(new View.OnClickListener() { // from class: l.m9n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f135426a.m166767R3(view);
                }
            });
        }
        return this.f145616l;
    }

    /* JADX INFO: renamed from: P3 */
    public final g4s m166766P3() {
        if (this.f145615k == null) {
            g4s g4sVar = new g4s(this, m166765O3());
            this.f145615k = g4sVar;
            g4sVar.m72954c0(0);
        }
        return this.f145615k;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m166767R3(View view) {
        m166764N3();
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m166768S3(View view, View view2) {
        int[] iArrM166763M3 = m166763M3(view);
        int measuredWidth = view.getMeasuredWidth() / 2;
        int iMax = Math.max((iArrM166763M3[0] + measuredWidth) - (this.f145613i / 2), 0);
        bnl0.m105538V(((k9n0) this.viewModel).f124561a, ((iArrM166763M3[0] + measuredWidth) - iMax) - qa00.m175859d(6.0f));
        m166765O3().removeAllViews();
        m166765O3().addView(view2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        int i = iArrM166763M3[1];
        int i2 = this.f145614j;
        layoutParams.topMargin = Math.max(i - i2, i2) - view2.getMeasuredHeight();
        layoutParams.leftMargin = iMax;
        view2.setLayoutParams(layoutParams);
        m166766P3().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m166769T3(LiveMessage liveMessage) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = ((rwn0) m213810E2()).m202191k();
        bLiveChatReport.roomId = ((rwn0) m213810E2()).m202194o();
        bLiveChatReport.seq = liveMessage.seq;
        bLiveChatReport.type = 12;
        bLiveChatReport.roomType = 1;
        duringCreated(LivingNormalApiProvider.m72585Z6(bLiveChatReport, liveMessage.liveUserInfo.userId)).subscribe(dhw.m115825d(new y20() { // from class: l.n9n0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165649w(R$string.f47665Li);
            }
        }));
        m166764N3();
    }

    /* JADX INFO: renamed from: U3 */
    public void m166770U3(vv4 vv4Var) {
        m166764N3();
        m213811F2().ChatEvent.chatInputClick().mo199273j(vv4Var);
    }

    /* JADX INFO: renamed from: V3 */
    public void m166771V3(final View view, LiveMessage liveMessage) {
        final View viewM148882k = ((k9n0) this.viewModel).m148882k(act().getLayoutInflater(), liveMessage);
        l51.m152886F(this.f196919f, new Runnable() { // from class: l.l9n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f130615a.m166768S3(view, viewM148882k);
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m166764N3();
    }
}
