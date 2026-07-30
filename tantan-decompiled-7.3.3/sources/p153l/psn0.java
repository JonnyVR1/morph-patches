package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.livingroom.common.member.LiveMemberFooterDescView;
import com.p051p1.mobile.putong.live.livingroom.voice.member.voiceleaderboard.VoiceLiveMemberItem;

/* JADX INFO: loaded from: classes10.dex */
public class psn0 extends jic0<nsv<BLiveLeaderBoards>> {

    /* JADX INFO: renamed from: c */
    public final y20<String> f153949c;

    /* JADX INFO: renamed from: d */
    public final Act f153950d;

    /* JADX INFO: renamed from: e */
    public LivingUsers<BLiveLeaderBoards> f153951e = new LivingUsers<>();

    /* JADX INFO: renamed from: f */
    public boolean f153952f;

    /* JADX INFO: renamed from: g */
    public cm0 f153953g;

    public psn0(Act act, y20<String> y20Var, boolean z) {
        this.f153950d = act;
        this.f153949c = y20Var;
        this.f153952f = z;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f153951e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return this.f153950d.inflater().inflate(i == 1 ? yec0.f198839M3 : yec0.f198809J9, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, nsv<BLiveLeaderBoards> nsvVar, int i, int i2) {
        if (i == 1) {
            ((LiveMemberFooterDescView) view).m74236c(this.f153951e.size());
        } else {
            ((VoiceLiveMemberItem) view).m79801i(this.f153949c, nsvVar, this.f153953g, this.f153952f);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public nsv<BLiveLeaderBoards> getItem(int i) {
        return (nsv) this.f153951e.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m173687G(@NonNull LivingUsers<BLiveLeaderBoards> livingUsers, @Nullable cm0 cm0Var) {
        this.f153953g = cm0Var;
        this.f153951e.clear();
        this.f153951e.addAll(livingUsers);
        notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((BLiveLeaderBoards) this.f153951e.get(i).f143542a).isFooterDesc ? 1 : 0;
    }
}
