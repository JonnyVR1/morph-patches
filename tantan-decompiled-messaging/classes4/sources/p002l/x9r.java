package p002l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p000p1.mobile.putong.live.livingroom.common.member.LiveMemberItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.bean.LivingUsers;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import l.dac0;
import l.e30;
import l.mqv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x9r extends dac0<mqv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final e30<String> f22183c;

    /* JADX INFO: renamed from: d */
    public final Act f22184d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f22185e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public gm0 f22186f;

    /* JADX INFO: renamed from: g */
    public int f22187g;

    public x9r(Act act, e30<String> e30Var) {
        this.f22184d = act;
        this.f22183c = e30Var;
    }

    /* JADX INFO: renamed from: C */
    public int m25798C() {
        return this.f22185e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m25799D(ViewGroup viewGroup, int i) {
        return this.f22184d.inflater().inflate(i == 1 ? t6c0.f19603M3 : t6c0.f19615N3, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m25797A(View view, mqv<BLiveLeaderBoards> mqvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).m6579c(this.f22185e.size());
            return;
        }
        LiveMemberItem liveMemberItem = (LiveMemberItem) view;
        liveMemberItem.m6595o(this.f22183c, mqvVar, this.f22186f);
        if (i2 < 0 || this.f22187g != i2) {
            liveMemberItem.m6598r(false);
        } else {
            liveMemberItem.m6598r(true);
        }
    }

    /* JADX INFO: renamed from: F */
    public final mqv<BLiveLeaderBoards> m25801F() {
        BLiveLeaderBoards bLiveLeaderBoardsNew_ = BLiveLeaderBoards.new_();
        bLiveLeaderBoardsNew_.isFooterDesc = true;
        return mqv.f(bLiveLeaderBoardsNew_);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public mqv<BLiveLeaderBoards> getItem(int i) {
        return (mqv) this.f22185e.get(i);
    }

    /* JADX INFO: renamed from: H */
    public void m25803H(int i, LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var) {
        this.f22187g = i;
        this.f22186f = gm0Var;
        this.f22185e.clear();
        this.f22185e.addAll(livingUsers);
        if (this.f22185e.size() >= 1) {
            this.f22185e.add(m25801F());
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public void m25804I(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, gm0 gm0Var) {
        m25803H(-1, livingUsers, gm0Var);
    }

    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) ((mqv) this.f22185e.get(i)).a).isFooterDesc ? 1 : 0;
    }
}
