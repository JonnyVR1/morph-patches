package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import l.df50;
import l.e30;
import l.gm0;
import l.hnc0;
import l.ho2;
import l.lsi0;
import l.me50;
import l.s7m;
import l.u4n0;
import l.xdl0;
import v.VRecyclerView;
import v.smart_refresh.SmartRefreshLayout;
import v.smart_refresh.footer.TTRefreshFooter;
import v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lzn0 implements s7m<hzn0> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f16463a;

    /* JADX INFO: renamed from: b */
    public yyn0 f16464b;

    /* JADX INFO: renamed from: c */
    public hzn0 f16465c;

    /* JADX INFO: renamed from: d */
    public SmartRefreshLayout f16466d;

    /* JADX INFO: renamed from: l.lzn0$a */
    public class C1023a extends RecyclerView.t {
        public C1023a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && lzn0.this.f16465c != null && recyclerView.getAdapter().getItemCount() == ((ho2) lzn0.this.f16465c.E2()).u && lzn0.this.f16465c.E2().V2().isNormalLive()) {
                lsi0.j(ypv.f23200e.getString(R.string.o7, Integer.valueOf(((ho2) lzn0.this.f16465c.E2()).u)));
            }
        }
    }

    public lzn0(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f16463a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(m18125C0()));
        vRecyclerView.addOnScrollListener(new C1023a());
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(act);
        this.f16466d = smartRefreshLayout;
        smartRefreshLayout.S(new TTRefreshHeader(act));
        this.f16466d.Q(new TTRefreshFooter(act));
        this.f16466d.O(new df50() { // from class: l.izn0
            /* JADX INFO: renamed from: w2 */
            public final void m16811w2(hnc0 hnc0Var) {
                this.f14875a.m18130j(hnc0Var);
            }
        });
        this.f16466d.M(new me50() { // from class: l.jzn0
            /* JADX INFO: renamed from: a */
            public final void m17238a(hnc0 hnc0Var) {
                this.f15371a.m18124k(hnc0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m18123i(String str) {
        hzn0 hzn0Var = this.f16465c;
        u4n0.k(hzn0Var, ((DbObject) hzn0Var.E2().l0()).id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m18124k(hnc0 hnc0Var) {
        this.f16465c.mo13525U3();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18125C0() {
        return this.f16463a.getContext();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m18129i1(hzn0 hzn0Var) {
        this.f16465c = hzn0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m18127e() {
        this.f16466d.t();
        this.f16466d.o();
    }

    /* JADX INFO: renamed from: f */
    public View m18128f() {
        xdl0.D0(-1, new View[]{this.f16463a});
        xdl0.C0(this.f16463a, -1);
        this.f16466d.addView(this.f16463a);
        return this.f16466d;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        yyn0 yyn0Var = new yyn0(act(), true, new e30() { // from class: l.kzn0
            public final void call(Object obj) {
                this.f15892a.m18123i((String) obj);
            }
        });
        this.f16464b = yyn0Var;
        this.f16463a.setAdapter(yyn0Var);
        this.f16464b.m25564G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m18130j(hnc0 hnc0Var) {
        this.f16465c.mo13526V3();
    }

    /* JADX INFO: renamed from: l */
    public void m18131l(LivingUsers<BLiveMember> livingUsers, gm0 gm0Var) {
        this.f16464b.m25564G(livingUsers, gm0Var);
    }

    public void destroy() {
    }
}
