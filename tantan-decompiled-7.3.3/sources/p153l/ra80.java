package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p051p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p051p1.mobile.putong.live.base.view.LiveEmptyView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class ra80 extends lb2 {

    /* JADX INFO: renamed from: f */
    public final dum<?> f161904f;

    /* JADX INFO: renamed from: h */
    public final z20<ja80, Pagination> f161906h;

    /* JADX INFO: renamed from: i */
    public final z20<BLivePkSuggestAnchor, BLivePkInviteSource> f161907i;

    /* JADX INFO: renamed from: e */
    public final List<BLivePkSuggestAnchors> f161903e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final List<ja80> f161905g = new ArrayList();

    public ra80(dum<?> dumVar, z20<ja80, Pagination> z20Var, z20<BLivePkSuggestAnchor, BLivePkInviteSource> z20Var2) {
        this.f161904f = dumVar;
        this.f161906h = z20Var;
        this.f161907i = z20Var2;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f161903e.size();
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f161903e.get(i).name;
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198779H3, viewGroup, false);
        RecyclerView recyclerView = (VRecyclerView) viewInflate.findViewById(mdc0.f136095X4);
        LiveEmptyView liveEmptyView = (LiveEmptyView) viewInflate.findViewById(mdc0.f136265p1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f161904f.f90815a, 1, false));
        ja80 ja80Var = this.f161905g.get(i);
        liveEmptyView.m69907d(R$string.f48038da);
        liveEmptyView.m69906c(n3d0.m161277a(n9c0.f140838j1));
        liveEmptyView.m69905b(obc0.f146390k4);
        ja80Var.m68553Y(recyclerView, liveEmptyView);
        recyclerView.setAdapter(ja80Var);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m180712s(ja80 ja80Var, Integer num) {
        z20<ja80, Pagination> z20Var;
        if (num.intValue() < ja80Var.getItemCount() - 3 || (z20Var = this.f161906h) == null) {
            return;
        }
        z20Var.call(ja80Var, ja80Var.m144008i0());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ ja80 m180713t(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        final ja80 ja80Var = new ja80(this.f161904f, bLivePkSuggestAnchors, this.f161907i);
        ja80Var.m68558c0(new y20() { // from class: l.qa80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156354a.m180712s(ja80Var, (Integer) obj);
            }
        });
        return ja80Var;
    }

    /* JADX INFO: renamed from: u */
    public void m180714u(List<BLivePkSuggestAnchors> list) {
        this.f161903e.clear();
        this.f161903e.addAll(list);
        this.f161905g.clear();
        this.f161905g.addAll(jyb.m147486Q(list, new qcj() { // from class: l.pa80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f151251a.m180713t((BLivePkSuggestAnchors) obj);
            }
        }));
        notifyDataSetChanged();
    }
}
