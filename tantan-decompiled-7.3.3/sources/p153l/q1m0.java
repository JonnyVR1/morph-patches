package p153l;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes5.dex */
public class q1m0 extends LiveMenuDialogHolder<b2m0> {

    /* JADX INFO: renamed from: k */
    public VLinear f155205k;

    /* JADX INFO: renamed from: l */
    public SmartRefreshLayout f155206l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f155207m;

    /* JADX INFO: renamed from: n */
    public c8o0 f155208n;

    /* JADX INFO: renamed from: o */
    public b2m0 f155209o;

    /* JADX INFO: renamed from: l.q1m0$a */
    public class C19492a extends RecyclerView.AbstractC0584t {
        public C19492a() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
        /* JADX WARN: Type inference failed for: r2v7, types: [l.oo2] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i != 0 || recyclerView.canScrollVertically(1) || q1m0.this.f155209o == null || recyclerView.getAdapter().getItemCount() != q1m0.this.f155209o.m213810E2().f148277u) {
                return;
            }
            o1j0.m165636j(zrv.f205803e.getString(R$string.f48276o7, Integer.valueOf(q1m0.this.f155209o.m213810E2().f148277u)));
        }
    }

    public q1m0(Act act, b2m0 b2m0Var) {
        super(yec0.f198854N6, act, b2m0Var, qag0.m175924e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m174917M(mvc0 mvc0Var) {
        this.f155209o.m102218h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m174918N(mvc0 mvc0Var) {
        this.f155209o.m102217g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m174919O(String str) {
        b2m0 b2m0Var = this.f155209o;
        ydn0.m215258k(b2m0Var, b2m0Var.m213810E2().m168532l0().f56859id, str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: r */
    private void m174920r() {
        if (this.f155208n == null) {
            this.f155207m.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f155207m.addOnScrollListener(new C19492a());
            this.f155206l.mo224409S(new TTRefreshHeader(this.f48608e));
            this.f155206l.mo224407Q(new TTRefreshFooter(this.f48608e));
            this.f155206l.mo224405O(new jn50() { // from class: l.n1m0
                @Override // p153l.jn50
                /* JADX INFO: renamed from: w2 */
                public final void mo59137w2(mvc0 mvc0Var) {
                    this.f139774a.m174917M(mvc0Var);
                }
            });
            this.f155206l.mo224404M(new tm50() { // from class: l.o1m0
                @Override // p153l.tm50
                /* JADX INFO: renamed from: a */
                public final void mo79018a(mvc0 mvc0Var) {
                    this.f144672a.m174918N(mvc0Var);
                }
            });
            c8o0 c8o0Var = new c8o0(act(), true, new y20() { // from class: l.p1m0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150183a.m174919O((String) obj);
                }
            }, this.f155209o.m213810E2().mo183435j().liveMode);
            this.f155208n = c8o0Var;
            this.f155207m.setAdapter(c8o0Var);
            this.f155208n.m108379G(new LivingUsers<>(), null);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f155205k.getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m174921I(View view) {
        r1m0.m179426a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b2m0 b2m0Var) {
        this.f155209o = b2m0Var;
    }

    /* JADX INFO: renamed from: K */
    public void m174923K() {
        c8o0 c8o0Var = this.f155208n;
        if (c8o0Var != null) {
            c8o0Var.m108379G(new LivingUsers<>(), null);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m174924L() {
        this.f155206l.m225021t();
        this.f155206l.m225016o();
    }

    /* JADX INFO: renamed from: P */
    public void m174925P(LivingUsers<BLiveMember> livingUsers) {
        m174924L();
        this.f155208n.m108379G(livingUsers, null);
    }

    /* JADX INFO: renamed from: Q */
    public void m174926Q() {
        m73017E();
    }

    @Override // p153l.iam
    public Act act() {
        return this.f155209o.act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m174921I(view);
        m73014A(80);
        m174920r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m174923K();
    }
}
