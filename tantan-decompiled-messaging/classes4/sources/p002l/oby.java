package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.tantanapp.common.data.DbObject;
import l.e30;
import l.lsi0;
import l.s7m;
import l.u4n0;
import l.ypv;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oby implements s7m<sby> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f16517a;

    /* JADX INFO: renamed from: b */
    public bay f16518b;

    /* JADX INFO: renamed from: c */
    public sby<ho2, oby> f16519c;

    /* JADX INFO: renamed from: l.oby$a */
    public class C0719a extends RecyclerView.t {
        public C0719a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && oby.this.f16519c != null && recyclerView.getAdapter().getItemCount() == oby.this.f16519c.m22356Z3() && oby.this.f16519c.m25547E2().m17234j().isNormalLive()) {
                lsi0.j(ypv.e.getString(R$string.f3470o7, Integer.valueOf(oby.this.f16519c.m22356Z3())));
            }
        }
    }

    public oby(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f16517a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(m19391C0()));
        vRecyclerView.addOnScrollListener(new C0719a());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19391C0() {
        return this.f16517a.getContext();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m19397i1(sby sbyVar) {
        this.f16519c = sbyVar;
    }

    /* JADX INFO: renamed from: c */
    public View m19393c() {
        return this.f16517a;
    }

    /* JADX INFO: renamed from: d */
    public void m19394d(final boolean z) {
        bay bayVar = new bay(act(), z, new e30() { // from class: l.nby
            public final void call(Object obj) {
                this.f15913a.m19395e(z, (String) obj);
            }
        });
        this.f16518b = bayVar;
        this.f16517a.setAdapter(bayVar);
        this.f16518b.m10217G(new LivingUsers<>(), null);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m19395e(boolean z, String str) {
        sby<ho2, oby> sbyVar = this.f16519c;
        if (z) {
            u4n0.k(sbyVar, ((DbObject) sbyVar.m25547E2().m14582l0()).id, str);
        } else {
            ney.m18700c(sbyVar, str);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m19396f(LivingUsers<BLiveMember> livingUsers, gm0 gm0Var) {
        this.f16518b.m10217G(livingUsers, gm0Var);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
