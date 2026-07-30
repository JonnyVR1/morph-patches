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

/* JADX INFO: loaded from: classes4.dex */
public class oby implements s7m<sby> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f142988a;

    /* JADX INFO: renamed from: b */
    public bay f142989b;

    /* JADX INFO: renamed from: c */
    public sby<ho2, oby> f142990c;

    /* JADX INFO: renamed from: l.oby$a */
    public class C18889a extends RecyclerView.AbstractC0582t {
        public C18889a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && oby.this.f142990c != null && recyclerView.getAdapter().getItemCount() == oby.this.f142990c.m183368Z3() && oby.this.f142990c.m206027E2().mo149813j().isNormalLive()) {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f47428o7, Integer.valueOf(oby.this.f142990c.m183368Z3())));
            }
        }
    }

    public oby(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f142988a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C18889a());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f142988a.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sby sbyVar) {
        this.f142990c = sbyVar;
    }

    /* JADX INFO: renamed from: c */
    public View m163467c() {
        return this.f142988a;
    }

    /* JADX INFO: renamed from: d */
    public void m163468d(final boolean z) {
        bay bayVar = new bay(getAct(), z, new e30() { // from class: l.nby
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138078a.m163469e(z, (String) obj);
            }
        });
        this.f142989b = bayVar;
        this.f142988a.setAdapter(bayVar);
        this.f142989b.m100936G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m163469e(boolean z, String str) {
        sby<ho2, oby> sbyVar = this.f142990c;
        if (z) {
            u4n0.m191752k(sbyVar, sbyVar.m206027E2().m132146l0().f56011id, str);
        } else {
            ney.m159136c(sbyVar, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m163470f(LivingUsers<BLiveMember> livingUsers, gm0 gm0Var) {
        this.f142989b.m100936G(livingUsers, gm0Var);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
