package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p046p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;

/* JADX INFO: loaded from: classes4.dex */
public class x9r extends dac0<mqv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f191643c;

    /* JADX INFO: renamed from: d */
    public final Act f191644d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f191645e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public gm0 f191646f;

    /* JADX INFO: renamed from: g */
    public int f191647g;

    public x9r(Act act, e30<String> e30Var) {
        this.f191644d = act;
        this.f191643c = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f191645e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f191644d.inflater().inflate(i == 1 ? t6c0.f168107M3 : t6c0.f168119N3, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).m73053c(this.f191645e.size());
            return;
        }
        LiveMemberItem liveMemberItem = (LiveMemberItem) view;
        liveMemberItem.m73069o(this.f191643c, mqvVar, this.f191646f);
        if (i2 < 0 || this.f191647g != i2) {
            liveMemberItem.m73072r(false);
        } else {
            liveMemberItem.m73072r(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final mqv<BLiveLeaderBoards> m207512F() {
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooterDesc = true;
        return mqv.m155998f(bLiveLeaderBoardsNew_);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        return (mqv) this.f191645e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m207514H(int i, LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var) {
        this.f191647g = i;
        this.f191646f = gm0Var;
        this.f191645e.clear();
        this.f191645e.addAll(livingUsers);
        if (this.f191645e.size() >= 1) {
            this.f191645e.add(m207512F());
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m207515I(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var) {
        m207514H(-1, livingUsers, gm0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) this.f191645e.get(i).f135304a).isFooterDesc ? 1 : 0;
    }
}
