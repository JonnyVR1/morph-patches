package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;

/* JADX INFO: loaded from: classes4.dex */
public class zbr extends jic0<nsv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f203693c;

    /* JADX INFO: renamed from: d */
    public final Act f203694d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f203695e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public cm0 f203696f;

    /* JADX INFO: renamed from: g */
    public int f203697g;

    public zbr(Act act, y20<String> y20Var) {
        this.f203694d = act;
        this.f203693c = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f203695e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f203694d.inflater().inflate(i == 1 ? yec0.f198839M3 : yec0.f198851N3, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveLeaderBoards> nsvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).m74236c(this.f203695e.size());
            return;
        }
        LiveMemberItem liveMemberItem = (LiveMemberItem) view;
        liveMemberItem.m74252o(this.f203693c, nsvVar, this.f203696f);
        if (i2 < 0 || this.f203697g != i2) {
            liveMemberItem.m74255r(false);
        } else {
            liveMemberItem.m74255r(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final nsv<BLiveLeaderBoards> m219213F() {
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooterDesc = true;
        return nsv.m164636f(bLiveLeaderBoardsNew_);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveLeaderBoards> getItem(int i) {
        return (nsv) this.f203695e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m219215H(int i, LivingUsers<BLiveLeaderBoards> livingUsers, cm0 cm0Var) {
        this.f203697g = i;
        this.f203696f = cm0Var;
        this.f203695e.clear();
        this.f203695e.addAll(livingUsers);
        if (this.f203695e.size() >= 1) {
            this.f203695e.add(m219213F());
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m219216I(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, cm0 cm0Var) {
        m219215H(-1, livingUsers, cm0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) this.f203695e.get(i).f143542a).isFooterDesc ? 1 : 0;
    }
}
