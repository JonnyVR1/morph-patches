package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveChatReport;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes5.dex */
public class k0n0 extends h4t<nnn0, g0n0> {

    /* JADX INFO: renamed from: i */
    public final int f120497i;

    /* JADX INFO: renamed from: j */
    public final int f120498j;

    /* JADX INFO: renamed from: k */
    public f2s f120499k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f120500l;

    public k0n0(bsm bsmVar, g0n0 g0n0Var) {
        super(bsmVar);
        this.f120497i = t100.m186890d(182.0f);
        this.f120498j = t100.m186890d(52.0f);
        mo51532C(g0n0Var);
    }

    /* JADX INFO: renamed from: M3 */
    public final int[] m144075M3(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: N3 */
    public void m144076N3() {
        f2s f2sVar = this.f120499k;
        if (f2sVar == null || !f2sVar.isShowing()) {
            return;
        }
        this.f120499k.dismiss();
    }

    /* JADX INFO: renamed from: O3 */
    public final FrameLayout m144077O3() {
        if (this.f120500l == null) {
            FrameLayout frameLayout = new FrameLayout(this.f188512e.f77095a);
            this.f120500l = frameLayout;
            int i = xdl0.f192403e;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i));
            this.f120500l.setOnClickListener(new View.OnClickListener() { // from class: l.i0n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110366a.m144079R3(view);
                }
            });
        }
        return this.f120500l;
    }

    /* JADX INFO: renamed from: P3 */
    public final f2s m144078P3() {
        if (this.f120499k == null) {
            f2s f2sVar = new f2s(this, m144077O3());
            this.f120499k = f2sVar;
            f2sVar.m71771c0(0);
        }
        return this.f120499k;
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m144079R3(View view) {
        m144076N3();
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m144080S3(View view, View view2) {
        int[] iArrM144075M3 = m144075M3(view);
        int measuredWidth = view.getMeasuredWidth() / 2;
        int iMax = Math.max((iArrM144075M3[0] + measuredWidth) - (this.f120497i / 2), 0);
        xdl0.m208358V(((g0n0) this.viewModel).f100064a, ((iArrM144075M3[0] + measuredWidth) - iMax) - t100.m186890d(6.0f));
        m144077O3().removeAllViews();
        m144077O3().addView(view2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        int i = iArrM144075M3[1];
        int i2 = this.f120498j;
        layoutParams.topMargin = Math.max(i - i2, i2) - view2.getMeasuredHeight();
        layoutParams.leftMargin = iMax;
        view2.setLayoutParams(layoutParams);
        m144078P3().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m144081T3(LiveMessage liveMessage) {
        BLiveChatReport bLiveChatReport = new BLiveChatReport();
        bLiveChatReport.liveId = ((nnn0) m206027E2()).m149814k();
        bLiveChatReport.roomId = ((nnn0) m206027E2()).m149818o();
        bLiveChatReport.seq = liveMessage.seq;
        bLiveChatReport.type = 12;
        bLiveChatReport.roomType = 1;
        duringCreated(LivingNormalApiProvider.m71402Z6(bLiveChatReport, liveMessage.liveUserInfo.userId)).subscribe(ffw.m121193d(new e30() { // from class: l.j0n0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151593w(R$string.f46817Li);
            }
        }));
        m144076N3();
    }

    /* JADX INFO: renamed from: U3 */
    public void m144082U3(wu4 wu4Var) {
        m144076N3();
        m206028F2().ChatEvent.chatInputClick().mo172463j(wu4Var);
    }

    /* JADX INFO: renamed from: V3 */
    public void m144083V3(final View view, LiveMessage liveMessage) {
        final View viewM123997k = ((g0n0) this.viewModel).m123997k(act().getLayoutInflater(), liveMessage);
        e51.m114741F(this.f188513f, new Runnable() { // from class: l.h0n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f105228a.m144080S3(view, viewM123997k);
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m144076N3();
    }
}
