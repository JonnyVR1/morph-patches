package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes11.dex */
public class lzn0 implements s7m<hzn0> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f130660a;

    /* JADX INFO: renamed from: b */
    public yyn0 f130661b;

    /* JADX INFO: renamed from: c */
    public hzn0 f130662c;

    /* JADX INFO: renamed from: d */
    public SmartRefreshLayout f130663d;

    /* JADX INFO: renamed from: l.lzn0$a */
    public class C18361a extends RecyclerView.AbstractC0582t {
        public C18361a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && lzn0.this.f130662c != null && recyclerView.getAdapter().getItemCount() == ((nnn0) lzn0.this.f130662c.m206027E2()).f108764u && ((nnn0) lzn0.this.f130662c.m206027E2()).mo149813j().isNormalLive()) {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f47428o7, Integer.valueOf(((nnn0) lzn0.this.f130662c.m206027E2()).f108764u)));
            }
        }
    }

    public lzn0(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f130660a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C18361a());
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(act);
        this.f130663d = smartRefreshLayout;
        smartRefreshLayout.mo223163S(new TTRefreshHeader(act));
        this.f130663d.mo223161Q(new TTRefreshFooter(act));
        this.f130663d.mo223159O(new df50() { // from class: l.izn0
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f115583a.m152360j(hnc0Var);
            }
        });
        this.f130663d.mo223158M(new me50() { // from class: l.jzn0
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f120403a.m152356k(hnc0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m152355i(String str) {
        hzn0 hzn0Var = this.f130662c;
        u4n0.m191752k(hzn0Var, ((nnn0) hzn0Var.m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m152356k(hnc0 hnc0Var) {
        this.f130662c.mo114085U3();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f130660a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hzn0 hzn0Var) {
        this.f130662c = hzn0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m152358e() {
        this.f130663d.m223775t();
        this.f130663d.m223770o();
    }

    /* JADX INFO: renamed from: f */
    public View m152359f() {
        xdl0.m208327D0(-1, this.f130660a);
        xdl0.m208325C0(this.f130660a, -1);
        this.f130663d.addView(this.f130660a);
        return this.f130663d;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        yyn0 yyn0Var = new yyn0(getAct(), true, new e30() { // from class: l.kzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125399a.m152355i((String) obj);
            }
        });
        this.f130661b = yyn0Var;
        this.f130660a.setAdapter(yyn0Var);
        this.f130661b.m216547G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m152360j(hnc0 hnc0Var) {
        this.f130662c.mo114086V3();
    }

    /* JADX INFO: renamed from: l */
    public void m152361l(LivingUsers<BLiveMember> livingUsers, gm0 gm0Var) {
        this.f130661b.m216547G(livingUsers, gm0Var);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
