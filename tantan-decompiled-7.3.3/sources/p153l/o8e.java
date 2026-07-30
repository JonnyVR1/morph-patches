package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveDownBox;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class o8e<D extends oo2> extends yj2<D, u8e> implements iam<o8e> {

    /* JADX INFO: renamed from: j */
    public FrameLayout f145405j;

    /* JADX INFO: renamed from: k */
    public boolean f145406k;

    public o8e(dum<D> dumVar) {
        super(dumVar);
        this.f145406k = false;
    }

    private void init() {
        if (this.f145406k) {
            return;
        }
        this.f145406k = true;
        this.f145405j = new FrameLayout(act());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = qa00.m175859d(56.0f);
        layoutParams.leftMargin = bnl0.m105592y0() / 10;
        layoutParams.rightMargin = bnl0.m105592y0() / 10;
        this.f145405j.setLayoutParams(layoutParams);
        m110323L3(this.f145405j);
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return this.f145405j;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m166572Y3(LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel) {
        liveAccessChannel.toString();
        init();
        m153103z2(a8e.m96449b(p8e.m171238T3(this.f196918e, liveAccessChannel)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        FrameLayout frameLayout = this.f145405j;
        if (frameLayout != null) {
            m110328R3(frameLayout);
        }
        super.mo70300n();
        a8e.m96448a();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98292i()).filter(new qcj() { // from class: l.m8e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LongLinkLiveDownBox.LiveAccessChannel liveAccessChannel = (LongLinkLiveDownBox.LiveAccessChannel) obj;
                return Boolean.valueOf(liveAccessChannel != null && liveAccessChannel.getJumpType() == LongLinkLiveDownBox.AccessChannelJumpType.schema);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.n8e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140676a.m166572Y3((LongLinkLiveDownBox.LiveAccessChannel) obj);
            }
        }));
        zrv.f205799a.m207631D0();
        m213810E2().m202194o();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: X3, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(o8e o8eVar) {
    }
}
