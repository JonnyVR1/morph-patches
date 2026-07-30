package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes10.dex */
public class p8o0 implements iam<l8o0> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f151048a;

    /* JADX INFO: renamed from: b */
    public c8o0 f151049b;

    /* JADX INFO: renamed from: c */
    public l8o0 f151050c;

    /* JADX INFO: renamed from: d */
    public SmartRefreshLayout f151051d;

    /* JADX INFO: renamed from: l.p8o0$a */
    public class C19324a extends RecyclerView.AbstractC0584t {
        public C19324a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && p8o0.this.f151050c != null && recyclerView.getAdapter().getItemCount() == ((rwn0) p8o0.this.f151050c.m213810E2()).f148277u && ((rwn0) p8o0.this.f151050c.m213810E2()).mo183435j().isNormalLive()) {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f48276o7, Integer.valueOf(((rwn0) p8o0.this.f151050c.m213810E2()).f148277u)));
            }
        }
    }

    public p8o0(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f151048a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C19324a());
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(act);
        this.f151051d = smartRefreshLayout;
        smartRefreshLayout.mo224409S(new TTRefreshHeader(act));
        this.f151051d.mo224407Q(new TTRefreshFooter(act));
        this.f151051d.mo224405O(new jn50() { // from class: l.m8o0
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f135268a.m171268j(mvc0Var);
            }
        });
        this.f151051d.mo224404M(new tm50() { // from class: l.n8o0
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f140701a.m171264k(mvc0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m171263i(String str) {
        l8o0 l8o0Var = this.f151050c;
        ydn0.m215258k(l8o0Var, ((rwn0) l8o0Var.m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m171264k(mvc0 mvc0Var) {
        this.f151050c.mo133833U3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f151048a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(l8o0 l8o0Var) {
        this.f151050c = l8o0Var;
    }

    /* JADX INFO: renamed from: e */
    public void m171266e() {
        this.f151051d.m225021t();
        this.f151051d.m225016o();
    }

    /* JADX INFO: renamed from: f */
    public View m171267f() {
        bnl0.m105507D0(-1, this.f151048a);
        bnl0.m105505C0(this.f151048a, -1);
        this.f151051d.addView(this.f151048a);
        return this.f151051d;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void init() {
        c8o0 c8o0Var = new c8o0(getAct(), true, new y20() { // from class: l.o8o0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145453a.m171263i((String) obj);
            }
        });
        this.f151049b = c8o0Var;
        this.f151048a.setAdapter(c8o0Var);
        this.f151049b.m108379G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m171268j(mvc0 mvc0Var) {
        this.f151050c.mo133834V3();
    }

    /* JADX INFO: renamed from: l */
    public void m171269l(LivingUsers<BLiveMember> livingUsers, cm0 cm0Var) {
        this.f151049b.m108379G(livingUsers, cm0Var);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
