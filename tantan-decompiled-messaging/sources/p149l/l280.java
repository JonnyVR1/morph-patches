package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchor;
import com.p046p1.mobile.putong.live.base.data.BLivePkSuggestAnchors;
import com.p046p1.mobile.putong.live.base.view.LiveEmptyView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public class l280 extends eb2 {

    /* JADX INFO: renamed from: f */
    public final bsm<?> f125755f;

    /* JADX INFO: renamed from: h */
    public final f30<d280, Pagination> f125757h;

    /* JADX INFO: renamed from: i */
    public final f30<BLivePkSuggestAnchor, BLivePkInviteSource> f125758i;

    /* JADX INFO: renamed from: e */
    public final List<BLivePkSuggestAnchors> f125754e = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final List<d280> f125756g = new ArrayList();

    public l280(bsm<?> bsmVar, f30<d280, Pagination> f30Var, f30<BLivePkSuggestAnchor, BLivePkInviteSource> f30Var2) {
        this.f125755f = bsmVar;
        this.f125757h = f30Var;
        this.f125758i = f30Var2;
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f125754e.size();
    }

    @Override // p149l.w660
    @Nullable
    public CharSequence getPageTitle(int i) {
        return this.f125754e.get(i).name;
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168047H3, viewGroup, false);
        RecyclerView recyclerView = (VRecyclerView) viewInflate.findViewById(g5c0.f100850X4);
        LiveEmptyView liveEmptyView = (LiveEmptyView) viewInflate.findViewById(g5c0.f101020p1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f125755f.f77095a, 1, false));
        d280 d280Var = this.f125756g.get(i);
        liveEmptyView.m68724d(R$string.f47190da);
        liveEmptyView.m68723c(kvc0.m147352a(h1c0.f105377j1));
        liveEmptyView.m68722b(i3c0.f111062k4);
        d280Var.m67370Y(recyclerView, liveEmptyView);
        recyclerView.setAdapter(d280Var);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m148273s(d280 d280Var, Integer num) {
        f30<d280, Pagination> f30Var;
        if (num.intValue() < d280Var.getItemCount() - 3 || (f30Var = this.f125757h) == null) {
            return;
        }
        f30Var.call(d280Var, d280Var.m109713i0());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ d280 m148274t(BLivePkSuggestAnchors bLivePkSuggestAnchors) {
        final d280 d280Var = new d280(this.f125755f, bLivePkSuggestAnchors, this.f125758i);
        d280Var.m67375c0(new e30() { // from class: l.k280
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120699a.m148273s(d280Var, (Integer) obj);
            }
        });
        return d280Var;
    }

    /* JADX INFO: renamed from: u */
    public void m148275u(List<BLivePkSuggestAnchors> list) {
        this.f125754e.clear();
        this.f125754e.addAll(list);
        this.f125756g.clear();
        this.f125756g.addAll(vwb.m200303Q(list, new w9j() { // from class: l.j280
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f115896a.m148274t((BLivePkSuggestAnchors) obj);
            }
        }));
        notifyDataSetChanged();
    }
}
