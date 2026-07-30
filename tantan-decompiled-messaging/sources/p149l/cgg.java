package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cgg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final x8g f80740a;

    /* JADX INFO: renamed from: b */
    public kgg f80741b;

    public cgg(x8g x8gVar) {
        this.f80740a = x8gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m106706I(View view) {
        xgg.m208676d(this.f80740a.m206027E2().m132146l0().f56011id, this.f80740a.m206027E2().m149814k(), "message");
        boolean z = false;
        for (BFansRecallUser bFansRecallUser : this.f80741b.m145891b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                z = true;
            }
        }
        if (z) {
            this.f80740a.m206028F2().FansRecallEvent.showFansRecallSelectPanel().mo172463j(this.f80741b);
        } else {
            lsi0.m151593w(R$string.f47579v4);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m106707J(kgg kggVar) {
        this.f80741b = kggVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168080K0;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        xdl0.m208329E0((VText) view.findViewById(g5c0.f100814T4), new View.OnClickListener() { // from class: l.bgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f75430a.m106706I(view2);
            }
        });
    }
}
