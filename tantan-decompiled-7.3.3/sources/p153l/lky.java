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

/* JADX INFO: loaded from: classes4.dex */
public class lky implements iam<pky> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f132504a;

    /* JADX INFO: renamed from: b */
    public yiy f132505b;

    /* JADX INFO: renamed from: c */
    public pky<oo2, lky> f132506c;

    /* JADX INFO: renamed from: l.lky$a */
    public class C18407a extends RecyclerView.AbstractC0584t {
        public C18407a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && lky.this.f132506c != null && recyclerView.getAdapter().getItemCount() == lky.this.f132506c.m172781Z3() && lky.this.f132506c.m213810E2().mo183435j().isNormalLive()) {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f48276o7, Integer.valueOf(lky.this.f132506c.m172781Z3())));
            }
        }
    }

    public lky(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f132504a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C18407a());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f132504a.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pky pkyVar) {
        this.f132506c = pkyVar;
    }

    /* JADX INFO: renamed from: c */
    public View m154661c() {
        return this.f132504a;
    }

    /* JADX INFO: renamed from: d */
    public void m154662d(final boolean z) {
        yiy yiyVar = new yiy(getAct(), z, new y20() { // from class: l.kky
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127313a.m154663e(z, (String) obj);
            }
        });
        this.f132505b = yiyVar;
        this.f132504a.setAdapter(yiyVar);
        this.f132505b.m216353G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m154663e(boolean z, String str) {
        pky<oo2, lky> pkyVar = this.f132506c;
        if (z) {
            ydn0.m215258k(pkyVar, pkyVar.m213810E2().m168532l0().f56859id, str);
        } else {
            kny.m150555c(pkyVar, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m154664f(LivingUsers<BLiveMember> livingUsers, cm0 cm0Var) {
        this.f132505b.m216353G(livingUsers, cm0Var);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
