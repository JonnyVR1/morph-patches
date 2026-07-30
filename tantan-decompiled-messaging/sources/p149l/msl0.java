package p149l;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes5.dex */
public class msl0 extends LiveMenuDialogHolder<xsl0> {

    /* JADX INFO: renamed from: k */
    public VLinear f135510k;

    /* JADX INFO: renamed from: l */
    public SmartRefreshLayout f135511l;

    /* JADX INFO: renamed from: m */
    public VRecyclerView f135512m;

    /* JADX INFO: renamed from: n */
    public yyn0 f135513n;

    /* JADX INFO: renamed from: o */
    public xsl0 f135514o;

    /* JADX INFO: renamed from: l.msl0$a */
    public class C18549a extends RecyclerView.AbstractC0582t {
        public C18549a() {
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
        /* JADX WARN: Type inference failed for: r2v7, types: [l.ho2] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i != 0 || recyclerView.canScrollVertically(1) || msl0.this.f135514o == null || recyclerView.getAdapter().getItemCount() != msl0.this.f135514o.m206027E2().f108764u) {
                return;
            }
            lsi0.m151580j(ypv.f199497e.getString(R$string.f47428o7, Integer.valueOf(msl0.this.f135514o.m206027E2().f108764u)));
        }
    }

    public msl0(Act act, xsl0 xsl0Var) {
        super(t6c0.f168122N6, act, xsl0Var, j2g0.m139458e(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m156155M(hnc0 hnc0Var) {
        this.f135514o.m210796h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m156156N(hnc0 hnc0Var) {
        this.f135514o.m210795g4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m156157O(String str) {
        xsl0 xsl0Var = this.f135514o;
        u4n0.m191752k(xsl0Var, xsl0Var.m206027E2().m132146l0().f56011id, str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: r */
    private void m156158r() {
        if (this.f135513n == null) {
            this.f135512m.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f135512m.addOnScrollListener(new C18549a());
            this.f135511l.mo223163S(new TTRefreshHeader(this.f47760e));
            this.f135511l.mo223161Q(new TTRefreshFooter(this.f47760e));
            this.f135511l.mo223159O(new df50() { // from class: l.jsl0
                @Override // p149l.df50
                /* JADX INFO: renamed from: w2 */
                public final void mo57954w2(hnc0 hnc0Var) {
                    this.f119524a.m156155M(hnc0Var);
                }
            });
            this.f135511l.mo223158M(new me50() { // from class: l.ksl0
                @Override // p149l.me50
                /* JADX INFO: renamed from: a */
                public final void mo77835a(hnc0 hnc0Var) {
                    this.f124487a.m156156N(hnc0Var);
                }
            });
            yyn0 yyn0Var = new yyn0(act(), true, new e30() { // from class: l.lsl0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129882a.m156157O((String) obj);
                }
            }, this.f135514o.m206027E2().mo149813j().liveMode);
            this.f135513n = yyn0Var;
            this.f135512m.setAdapter(yyn0Var);
            this.f135513n.m216547G(new LivingUsers<>(), null);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f135510k.getContext();
    }

    /* JADX INFO: renamed from: I */
    public final void m156159I(View view) {
        nsl0.m160782a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xsl0 xsl0Var) {
        this.f135514o = xsl0Var;
    }

    /* JADX INFO: renamed from: K */
    public void m156161K() {
        yyn0 yyn0Var = this.f135513n;
        if (yyn0Var != null) {
            yyn0Var.m216547G(new LivingUsers<>(), null);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m156162L() {
        this.f135511l.m223775t();
        this.f135511l.m223770o();
    }

    /* JADX INFO: renamed from: P */
    public void m156163P(LivingUsers<BLiveMember> livingUsers) {
        m156162L();
        this.f135513n.m216547G(livingUsers, null);
    }

    /* JADX INFO: renamed from: Q */
    public void m156164Q() {
        m71834E();
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f135514o.act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m156159I(view);
        m71831A(80);
        m156158r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m156161K();
    }
}
