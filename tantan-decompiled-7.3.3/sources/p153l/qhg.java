package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class qhg extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public final lag f157678a;

    /* JADX INFO: renamed from: b */
    public yhg f157679b;

    public qhg(lag lagVar) {
        this.f157678a = lagVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.oo2] */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m176545I(View view) {
        lig.m154374d(this.f157678a.m213810E2().m168532l0().f56859id, this.f157678a.m213810E2().m202191k(), "message");
        boolean z = false;
        for (BFansRecallUser bFansRecallUser : this.f157679b.m215960b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                z = true;
            }
        }
        if (z) {
            this.f157678a.m213811F2().FansRecallEvent.showFansRecallSelectPanel().mo199273j(this.f157679b);
        } else {
            o1j0.m165649w(R$string.f48427v4);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m176546J(yhg yhgVar) {
        this.f157679b = yhgVar;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198812K0;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        bnl0.m105509E0((VText) view.findViewById(mdc0.f136059T4), new View.OnClickListener() { // from class: l.phg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f152431a.m176545I(view2);
            }
        });
    }
}
