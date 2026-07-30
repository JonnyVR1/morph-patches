package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.common.member.subModule.leaderBoard.MemberLeaderViewDomestic;

/* JADX INFO: loaded from: classes4.dex */
public class i9y implements s7m<u9y> {

    /* JADX INFO: renamed from: a */
    public final MemberLeaderViewDomestic f112266a;

    /* JADX INFO: renamed from: b */
    public x9r f112267b;

    /* JADX INFO: renamed from: c */
    public u9y f112268c;

    /* JADX INFO: renamed from: l.i9y$a */
    public class C17511a implements SwipeRefreshLayout.InterfaceC0700j {
        public C17511a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
        /* JADX INFO: renamed from: q */
        public void mo4094q() {
            if (i9y.this.f112268c != null) {
                i9y.this.f112268c.mo115318V3();
            }
        }
    }

    public i9y(Act act, final u9y u9yVar) {
        MemberLeaderViewDomestic memberLeaderViewDomesticM73082e = MemberLeaderViewDomestic.m73082e(act.inflater());
        this.f112266a = memberLeaderViewDomesticM73082e;
        memberLeaderViewDomesticM73082e.setOnJumpClickListener(new View.OnClickListener() { // from class: l.d9y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i9y.m135094c(u9yVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m135094c(u9y u9yVar, View view) {
        if (u9yVar != null) {
            u9yVar.m206028F2().MemberEvent.dismiss().m172467p();
            ney.m159135b(u9yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m135098n(View view) {
        u9y u9yVar = this.f112268c;
        if (u9yVar != null) {
            u9yVar.mo115318V3();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112266a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u9y u9yVar) {
        this.f112268c = u9yVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public MemberLeaderViewDomestic m135100j() {
        return this.f112266a;
    }

    /* JADX INFO: renamed from: k */
    public void m135101k(x9r x9rVar) {
        this.f112267b = x9rVar;
        this.f112266a.f49230e.setAdapter(x9rVar);
        this.f112266a.f49229d.setOnRefreshListener(new C17511a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m135102l(String str) {
        ney.m159136c(this.f112268c, str + "");
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m135103m(LivingUsers livingUsers, gm0 gm0Var, far farVar, Integer num) {
        if (num.intValue() > livingUsers.size()) {
            return;
        }
        int iMax = Math.max(num.intValue() - 2, 0);
        int iIntValue = num.intValue() < 2 ? num.intValue() : 2;
        this.f112267b.m207514H(iIntValue - 1, LivingUsers.create(livingUsers.subList(iMax, livingUsers.size())), gm0Var);
        xdl0.m208344M(this.f112266a.f49233h, true);
        xdl0.m208344M(this.f112266a.f49228c, false);
        this.f112266a.m73085g(true, getAct(), farVar, gm0Var, new e30() { // from class: l.h9y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106643a.m135102l((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m135104p(String str) {
        ney.m159136c(this.f112268c, str + "");
    }

    /* JADX INFO: renamed from: q */
    public void m135105q(final gm0 gm0Var, final far farVar) {
        if (this.f112268c != null) {
            final LivingUsers<BLiveLeaderBoards> livingUsersM120299c = farVar.m120299c();
            e30<Integer> e30Var = new e30() { // from class: l.e9y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f90157a.m135103m(livingUsersM120299c, gm0Var, farVar, (Integer) obj);
                }
            };
            xdl0.m208344M(this.f112266a.f49228c, true);
            xdl0.m208344M(this.f112266a.f49233h, false);
            xdl0.m208329E0(this.f112266a.f49233h, new View.OnClickListener() { // from class: l.f9y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f96543a.m135098n(view);
                }
            });
            this.f112266a.m73086h(farVar.m120302f(), this.f112268c, e30Var);
            this.f112266a.m73085g(false, getAct(), farVar, gm0Var, new e30() { // from class: l.g9y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101611a.m135104p((String) obj);
                }
            });
            this.f112266a.f49230e.scrollToPosition(0);
            this.f112267b.m207515I(livingUsersM120299c, gm0Var);
        }
        m135106s(this.f112267b.getPageCount() == 0);
    }

    /* JADX INFO: renamed from: s */
    public void m135106s(boolean z) {
        xdl0.m208344M(this.f112266a.f49231f, z);
    }

    /* JADX INFO: renamed from: u */
    public void m135107u() {
        this.f112266a.f49229d.setRefreshing(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
