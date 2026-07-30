package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import com.tantanapp.common.data.DbObject;
import l.d1q;
import l.lsi0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cgg extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final x8g f8661a;

    /* JADX INFO: renamed from: b */
    public kgg f8662b;

    public cgg(x8g x8gVar) {
        this.f8661a = x8gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ho2] */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m11032I(View view) {
        xgg.m25929d(((DbObject) this.f8661a.m25547E2().m14582l0()).id, this.f8661a.m25547E2().m17235k(), "message");
        boolean z = false;
        for (BFansRecallUser bFansRecallUser : this.f8662b.m16617b().users) {
            if (bFansRecallUser.following && bFansRecallUser.followed && !bFansRecallUser.isRecalled) {
                z = true;
            }
        }
        if (z) {
            this.f8661a.m25548F2().FansRecallEvent.showFansRecallSelectPanel().j(this.f8662b);
        } else {
            lsi0.w(R$string.f3621v4);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m11033J(kgg kggVar) {
        this.f8662b = kggVar;
    }

    /* JADX INFO: renamed from: o */
    public int m11034o() {
        return t6c0.f19576K0;
    }

    /* JADX INFO: renamed from: u */
    public void m11035u(View view) {
        super.u(view);
        xdl0.E0(view.findViewById(g5c0.f10964T4), new View.OnClickListener() { // from class: l.bgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8120a.m11032I(view2);
            }
        });
    }
}
