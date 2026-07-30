package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;

/* JADX INFO: loaded from: classes4.dex */
public class fiy implements iam<riy> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderViewDomestic f99274a;

    /* JADX INFO: renamed from: b */
    public zbr f99275b;

    /* JADX INFO: renamed from: c */
    public riy f99276c;

    /* JADX INFO: renamed from: l.fiy$a */
    public class C16985a implements SwipeRefreshLayout.InterfaceC0702j {
        public C16985a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
        /* JADX INFO: renamed from: p */
        public void mo4096p() {
            if (fiy.this.f99276c != null) {
                fiy.this.f99276c.mo104382V3();
            }
        }
    }

    public fiy(Act act, final riy riyVar) {
        MemberLeaderViewDomestic memberLeaderViewDomesticM74265e = MemberLeaderViewDomestic.m74265e(act.inflater());
        this.f99274a = memberLeaderViewDomesticM74265e;
        memberLeaderViewDomesticM74265e.setOnJumpClickListener(new View.OnClickListener() { // from class: l.aiy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fiy.m125772c(riyVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m125772c(riy riyVar, View view) {
        if (riyVar != null) {
            riyVar.m213811F2().MemberEvent.dismiss().m199277p();
            kny.m150554b(riyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m125776n(View view) {
        riy riyVar = this.f99276c;
        if (riyVar != null) {
            riyVar.mo104382V3();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f99274a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(riy riyVar) {
        this.f99276c = riyVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public MemberLeaderViewDomestic m125778j() {
        return this.f99274a;
    }

    /* JADX INFO: renamed from: k */
    public void m125779k(zbr zbrVar) {
        this.f99275b = zbrVar;
        this.f99274a.f50078e.setAdapter(zbrVar);
        this.f99274a.f50077d.setOnRefreshListener(new C16985a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m125780l(String str) {
        kny.m150555c(this.f99276c, str + "");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m125781m(LivingUsers livingUsers, cm0 cm0Var, hcr hcrVar, Integer num) {
        if (num.intValue() > livingUsers.size()) {
            return;
        }
        int iMax = Math.max(num.intValue() - 2, 0);
        int iIntValue = num.intValue() < 2 ? num.intValue() : 2;
        this.f99275b.m219215H(iIntValue - 1, LivingUsers.create(livingUsers.subList(iMax, livingUsers.size())), cm0Var);
        bnl0.m105524M(this.f99274a.f50081h, true);
        bnl0.m105524M(this.f99274a.f50076c, false);
        this.f99274a.m74268g(true, getAct(), hcrVar, cm0Var, new y20() { // from class: l.eiy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94231a.m125780l((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m125782p(String str) {
        kny.m150555c(this.f99276c, str + "");
    }

    /* JADX INFO: renamed from: q */
    public void m125783q(final cm0 cm0Var, final hcr hcrVar) {
        if (this.f99276c != null) {
            final LivingUsers<BLiveLeaderBoards> livingUsersM134493c = hcrVar.m134493c();
            y20<Integer> y20Var = new y20() { // from class: l.biy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76944a.m125781m(livingUsersM134493c, cm0Var, hcrVar, (Integer) obj);
                }
            };
            bnl0.m105524M(this.f99274a.f50076c, true);
            bnl0.m105524M(this.f99274a.f50081h, false);
            bnl0.m105509E0(this.f99274a.f50081h, new View.OnClickListener() { // from class: l.ciy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f82088a.m125776n(view);
                }
            });
            this.f99274a.m74269h(hcrVar.m134496f(), this.f99276c, y20Var);
            this.f99274a.m74268g(false, getAct(), hcrVar, cm0Var, new y20() { // from class: l.diy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88765a.m125782p((String) obj);
                }
            });
            this.f99274a.f50078e.scrollToPosition(0);
            this.f99275b.m219216I(livingUsersM134493c, cm0Var);
        }
        m125784s(this.f99275b.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: s */
    public void m125784s(boolean z) {
        bnl0.m105524M(this.f99274a.f50079f, z);
    }

    /* JADX INFO: renamed from: u */
    public void m125785u() {
        this.f99274a.f50077d.setRefreshing(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
