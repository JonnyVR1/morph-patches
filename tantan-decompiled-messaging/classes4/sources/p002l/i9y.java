package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import l.e30;
import l.s7m;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class i9y implements s7m<u9y> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderViewDomestic f13119a;

    /* JADX INFO: renamed from: b */
    public x9r f13120b;

    /* JADX INFO: renamed from: c */
    public u9y f13121c;

    /* JADX INFO: renamed from: l.i9y$a */
    public class C0618a implements SwipeRefreshLayout.j {
        public C0618a() {
        }

        /* JADX INFO: renamed from: q */
        public void m15075q() {
            if (i9y.this.f13121c != null) {
                i9y.this.f13121c.mo12296V3();
            }
        }
    }

    public i9y(Act act, final u9y u9yVar) {
        MemberLeaderViewDomestic memberLeaderViewDomesticM6608e = MemberLeaderViewDomestic.m6608e(act.inflater());
        this.f13119a = memberLeaderViewDomesticM6608e;
        memberLeaderViewDomesticM6608e.setOnJumpClickListener(new View.OnClickListener() { // from class: l.d9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i9y.m15059c(u9yVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15059c(u9y u9yVar, View view) {
        if (u9yVar != null) {
            u9yVar.m25548F2().MemberEvent.dismiss().p();
            ney.m18699b(u9yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m15063n(View view) {
        u9y u9yVar = this.f13121c;
        if (u9yVar != null) {
            u9yVar.mo12296V3();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15064C0() {
        return this.f13119a.getContext();
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m15066i1(u9y u9yVar) {
        this.f13121c = u9yVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public MemberLeaderViewDomestic m15067j() {
        return this.f13119a;
    }

    /* JADX INFO: renamed from: k */
    public void m15068k(x9r x9rVar) {
        this.f13120b = x9rVar;
        this.f13119a.f5272e.setAdapter(x9rVar);
        this.f13119a.f5271d.setOnRefreshListener(new C0618a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m15069l(String str) {
        ney.m18700c(this.f13121c, str + "");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m15070m(LivingUsers livingUsers, gm0 gm0Var, far farVar, Integer num) {
        if (num.intValue() > livingUsers.size()) {
            return;
        }
        int iMax = Math.max(num.intValue() - 2, 0);
        int iIntValue = num.intValue() < 2 ? num.intValue() : 2;
        this.f13120b.m25803H(iIntValue - 1, LivingUsers.create(livingUsers.subList(iMax, livingUsers.size())), gm0Var);
        xdl0.M(this.f13119a.f5275h, true);
        xdl0.M(this.f13119a.f5270c, false);
        this.f13119a.m6611g(true, act(), farVar, gm0Var, new e30() { // from class: l.h9y
            public final void call(Object obj) {
                this.f11952a.m15069l((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m15071p(String str) {
        ney.m18700c(this.f13121c, str + "");
    }

    /* JADX INFO: renamed from: q */
    public void m15072q(final gm0 gm0Var, final far farVar) {
        if (this.f13121c != null) {
            final LivingUsers<BLiveLeaderBoards> livingUsersM13041c = farVar.m13041c();
            e30<Integer> e30Var = new e30() { // from class: l.e9y
                public final void call(Object obj) {
                    this.f9643a.m15070m(livingUsersM13041c, gm0Var, farVar, (Integer) obj);
                }
            };
            xdl0.M(this.f13119a.f5270c, true);
            xdl0.M(this.f13119a.f5275h, false);
            xdl0.E0(this.f13119a.f5275h, new View.OnClickListener() { // from class: l.f9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10200a.m15063n(view);
                }
            });
            this.f13119a.m6612h(farVar.m13044f(), this.f13121c, e30Var);
            this.f13119a.m6611g(false, act(), farVar, gm0Var, new e30() { // from class: l.g9y
                public final void call(Object obj) {
                    this.f11315a.m15071p((String) obj);
                }
            });
            this.f13119a.f5272e.scrollToPosition(0);
            this.f13120b.m25804I(livingUsersM13041c, gm0Var);
        }
        m15073s(this.f13120b.m25798C() == 0);
    }

    /* JADX INFO: renamed from: s */
    public void m15073s(boolean z) {
        xdl0.M(this.f13119a.f5273f, z);
    }

    /* JADX INFO: renamed from: u */
    public void m15074u() {
        this.f13119a.f5271d.setRefreshing(false);
    }

    public void destroy() {
    }
}
