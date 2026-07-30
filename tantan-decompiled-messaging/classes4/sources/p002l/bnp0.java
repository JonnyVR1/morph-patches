package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland.HourBoardHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import java.util.List;
import l.dac0;
import l.e30;
import l.e51;
import l.mqv;
import l.qdt;
import l.v9j;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bnp0 extends dac0<mqv<BLiveLeaderBoards>> implements ViewTreeObserver.OnGlobalLayoutListener, qdt.b {

    /* JADX INFO: renamed from: f */
    public final qdt f8282f;

    /* JADX INFO: renamed from: h */
    public final e30<String> f8284h;

    /* JADX INFO: renamed from: i */
    public final Act f8285i;

    /* JADX INFO: renamed from: k */
    public gm0 f8287k;

    /* JADX INFO: renamed from: c */
    public final LivingUsers<BLiveLeaderBoards> f8279c = new LivingUsers<>();

    /* JADX INFO: renamed from: d */
    public final LivingUsers<BLiveLeaderBoards> f8280d = new LivingUsers<>();

    /* JADX INFO: renamed from: e */
    public final LivingUsers<BLiveLeaderBoards> f8281e = new LivingUsers<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f8283g = new Runnable() { // from class: l.zmp0
        @Override // java.lang.Runnable
        public final void run() {
            this.f23511a.m10523M();
        }
    };

    /* JADX INFO: renamed from: j */
    public String f8286j = "currentWeek";

    public bnp0(Act act, e30<String> e30Var) {
        this.f8285i = act;
        qdt qdtVar = new qdt(true, act, new v9j() { // from class: l.anp0
            public final Object call() {
                return this.f7769a.m10533N();
            }
        }, 0.5f);
        this.f8282f = qdtVar;
        qdtVar.s(this);
        this.f8284h = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m10523M() {
        m10530J();
        notifyItemRangeChanged(1, this.f8281e.size());
    }

    /* JADX INFO: renamed from: C */
    public int m10525C() {
        return this.f8281e.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m10526D(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19848g2, viewGroup, false);
        }
        return i == 3 ? LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19603M3, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f19615N3, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m10524A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((HourBoardHeaderView) view).m8445q0(this.f8280d, this.f8284h, this.f8286j);
        } else if (i == 2) {
            ((LiveMemberItem) view).m6596p(this.f8284h, mqvVar, this.f8287k, this.f8286j, false);
        } else if (i == 3) {
            ((LiveMemberFooterDescView) view).m6580d(0, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m10528H() {
        e51.J(this.f8283g);
        this.f8279c.clear();
        this.f8280d.clear();
        this.f8281e.clear();
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        if (m10532L(i)) {
            return null;
        }
        return (mqv) this.f8281e.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final void m10530J() {
        this.f8281e.addAll(this.f8279c);
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooter = true;
        this.f8281e.add(mqv.f(bLiveLeaderBoardsNew_));
        this.f8281e.removeAll(this.f8280d);
    }

    /* JADX INFO: renamed from: K */
    public final void m10531K() {
        this.f8280d.addAll(this.f8279c.subList(0, Math.min(this.f8279c.size(), 3)));
    }

    /* JADX INFO: renamed from: L */
    public final boolean m10532L(int i) {
        return i == 0;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Boolean m10533N() {
        return Boolean.valueOf(!vwb.J(this.f8280d));
    }

    /* JADX INFO: renamed from: O */
    public void m10534O(LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var, String str) {
        this.f8287k = gm0Var;
        this.f8286j = str;
        this.f8279c.clear();
        this.f8279c.addAll(livingUsers);
        m10531K();
        notifyDataSetChanged();
        if (livingUsers.isEmpty()) {
            return;
        }
        e51.J(this.f8283g);
        e51.H(this.f8285i, this.f8283g, 1000L);
    }

    public int getItemViewType(int i) {
        if (m10532L(i)) {
            return 1;
        }
        return ((BLiveLeaderBoards) ((mqv) this.f8281e.get(i - 1)).a).isFooter ? 3 : 2;
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onAttachedToRecyclerView(recyclerView);
        this.f8282f.k(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onDetachedFromRecyclerView(recyclerView);
        this.f8282f.w();
        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8282f.v();
    }

    /* JADX INFO: renamed from: m */
    public void m10535m(List<Integer> list, boolean z) {
    }
}
