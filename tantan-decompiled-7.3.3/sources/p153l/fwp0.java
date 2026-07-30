package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class fwp0 extends jic0<nsv<BLiveLeaderBoards>> implements ViewTreeObserver.OnGlobalLayoutListener, rft.InterfaceC19833b {

    /* JADX INFO: renamed from: f */
    public final rft f101190f;

    /* JADX INFO: renamed from: h */
    public final y20<String> f101192h;

    /* JADX INFO: renamed from: i */
    public final Act f101193i;

    /* JADX INFO: renamed from: k */
    public cm0 f101195k;

    /* JADX INFO: renamed from: c */
    public final LivingUsers<BLiveLeaderBoards> f101187c = new LivingUsers<>();

    /* JADX INFO: renamed from: d */
    public final LivingUsers<BLiveLeaderBoards> f101188d = new LivingUsers<>();

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveLeaderBoards> f101189e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f101191g = new Runnable() { // from class: l.dwp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f91038a.m127833M();
        }
    };

    /* JADX INFO: renamed from: j */
    public String f101194j = "currentWeek";

    public fwp0(Act act, y20<String> y20Var) {
        this.f101193i = act;
        rft rftVar = new rft(true, act, new pcj() { // from class: l.ewp0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96181a.m127840N();
            }
        }, 0.5f);
        this.f101190f = rftVar;
        rftVar.m181300s(this);
        this.f101192h = y20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m127833M() {
        m127837J();
        notifyItemRangeChanged(1, this.f101189e.size());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f101189e.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199084g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198839M3, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f198851N3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveLeaderBoards> nsvVar, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m76028q0(this.f101188d, this.f101192h, this.f101194j);
        } else if (i == 2) {
            ((LiveMemberItem) view).m74253p(this.f101192h, nsvVar, this.f101195k, this.f101194j, false);
        } else if (i == 3) {
            ((LiveMemberFooterDescView) view).m74237d(0, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m127835H() {
        l51.m152890J(this.f101191g);
        this.f101187c.clear();
        this.f101188d.clear();
        this.f101189e.clear();
        notifyDataSetChanged();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveLeaderBoards> getItem(int i) {
        if (m127839L(i)) {
            return null;
        }
        return (nsv) this.f101189e.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final void m127837J() {
        this.f101189e.addAll(this.f101187c);
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooter = true;
        this.f101189e.add(nsv.m164636f(bLiveLeaderBoardsNew_));
        this.f101189e.removeAll(this.f101188d);
    }

    /* JADX INFO: renamed from: K */
    public final void m127838K() {
        this.f101188d.addAll(this.f101187c.subList(0, Math.min(this.f101187c.size(), 3)));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m127839L(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m127840N() {
        return Boolean.valueOf(!jyb.m147479J(this.f101188d));
    }

    /* JADX INFO: renamed from: O */
    public void m127841O(LivingUsers<BLiveLeaderBoards> livingUsers, cm0 cm0Var, String str) {
        this.f101195k = cm0Var;
        this.f101194j = str;
        this.f101187c.clear();
        this.f101187c.addAll(livingUsers);
        m127838K();
        notifyDataSetChanged();
        if (livingUsers.isEmpty()) {
            return;
        }
        l51.m152890J(this.f101191g);
        l51.m152888H(this.f101193i, this.f101191g, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m127839L(i)) {
            return 1;
        }
        return ((BLiveLeaderBoards) this.f101189e.get(i - 1).f143542a).isFooter ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f101190f.m181292k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f101190f.m181304w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f101190f.m181303v();
    }

    @Override // p153l.rft.InterfaceC19833b
    /* JADX INFO: renamed from: m */
    public void mo100705m(List<Integer> list, boolean z) {
    }
}
