package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bnp0 extends dac0<mqv<BLiveLeaderBoards>> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.InterfaceC19468b {

    /* JADX INFO: renamed from: f */
    public final qdt f76422f;

    /* JADX INFO: renamed from: h */
    public final e30<String> f76424h;

    /* JADX INFO: renamed from: i */
    public final Act f76425i;

    /* JADX INFO: renamed from: k */
    public gm0 f76427k;

    /* JADX INFO: renamed from: c */
    public final LivingUsers<BLiveLeaderBoards> f76419c = new LivingUsers<>();

    /* JADX INFO: renamed from: d */
    public final LivingUsers<BLiveLeaderBoards> f76420d = new LivingUsers<>();

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveLeaderBoards> f76421e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f76423g = new Runnable() { // from class: l.zmp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f203756a.m102821M();
        }
    };

    /* JADX INFO: renamed from: j */
    public String f76426j = "currentWeek";

    public bnp0(Act act, e30<String> e30Var) {
        this.f76425i = act;
        qdt qdtVar = new qdt(true, act, new v9j() { // from class: l.anp0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f70757a.m102828N();
            }
        }, 0.5f);
        this.f76422f = qdtVar;
        qdtVar.m174115s(this);
        this.f76424h = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m102821M() {
        m102825J();
        notifyItemRangeChanged(1, this.f76421e.size());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f76421e.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168352g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168107M3, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168119N3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m74845q0(this.f76420d, this.f76424h, this.f76426j);
        } else if (i == 2) {
            ((LiveMemberItem) view).m73070p(this.f76424h, mqvVar, this.f76427k, this.f76426j, false);
        } else if (i == 3) {
            ((LiveMemberFooterDescView) view).m73054d(0, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m102823H() {
        e51.m114745J(this.f76423g);
        this.f76419c.clear();
        this.f76420d.clear();
        this.f76421e.clear();
        notifyDataSetChanged();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        if (m102827L(i)) {
            return null;
        }
        return (mqv) this.f76421e.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final void m102825J() {
        this.f76421e.addAll(this.f76419c);
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooter = true;
        this.f76421e.add(mqv.m155998f(bLiveLeaderBoardsNew_));
        this.f76421e.removeAll(this.f76420d);
    }

    /* JADX INFO: renamed from: K */
    public final void m102826K() {
        this.f76420d.addAll(this.f76419c.subList(0, Math.min(this.f76419c.size(), 3)));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m102827L(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m102828N() {
        return Boolean.valueOf(!vwb.m200296J(this.f76420d));
    }

    /* JADX INFO: renamed from: O */
    public void m102829O(LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var, String str) {
        this.f76427k = gm0Var;
        this.f76426j = str;
        this.f76419c.clear();
        this.f76419c.addAll(livingUsers);
        m102826K();
        notifyDataSetChanged();
        if (livingUsers.isEmpty()) {
            return;
        }
        e51.m114745J(this.f76423g);
        e51.m114743H(this.f76425i, this.f76423g, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m102827L(i)) {
            return 1;
        }
        return ((BLiveLeaderBoards) this.f76421e.get(i - 1).f135304a).isFooter ? 3 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f76422f.m174107k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f76422f.m174119w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f76422f.m174118v();
    }

    @Override // p149l.qdt.InterfaceC19468b
    /* JADX INFO: renamed from: m */
    public void mo102830m(List<Integer> list, boolean z) {
    }
}
